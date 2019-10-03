package cc.femto.kommon.mvi

import io.reactivex.Observable

interface View<ACTION : Action, STATE> {
    /**
     * Attach the view to a state stream
     *
     * Usage:
     * <code>
     *     view.attach(model.state().observeOn(AndroidSchedulers.mainThread()))
     * </code>
     */
    fun attach(state: Observable<STATE>)

    /**
     * Obtain action stream for attaching to model
     *
     * Usage:
     * <code>
     *     model.attach(view.actions())
     * </code>
     */
    fun actions(): Observable<ACTION>
}
