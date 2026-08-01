package androidx.core.animation;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m115d2 = {"Landroidx/core/animation/Api19Impl;", "", "()V", "addPauseListener", "", "animator", "Landroid/animation/Animator;", "listener", "Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
final class Api19Impl {
    public static final androidx.core.animation.Api19Impl INSTANCE = null;

    static {
            androidx.core.animation.Api19Impl r0 = new androidx.core.animation.Api19Impl
            r0.<init>()
            androidx.core.animation.Api19Impl.INSTANCE = r0
            return
    }

    private Api19Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void addPauseListener(android.animation.Animator r0, android.animation.Animator.AnimatorPauseListener r1) {
            r0.addPauseListener(r1)
            return
    }
}
