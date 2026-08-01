package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public interface DefaultLifecycleObserver extends androidx.lifecycle.FullLifecycleObserver {
    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onCreate(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            return
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onDestroy(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            return
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onPause(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            return
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onResume(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            return
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onStart(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            return
    }

    @Override // androidx.lifecycle.FullLifecycleObserver
    default void onStop(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            return
    }
}
