package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m115d2 = {"Landroidx/core/view/Api16Impl;", "", "()V", "postOnAnimationDelayed", "", "view", "Landroid/view/View;", "action", "Ljava/lang/Runnable;", "delayInMillis", "", "core-ktx_release"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
final class Api16Impl {
    public static final androidx.core.view.Api16Impl INSTANCE = null;

    static {
            androidx.core.view.Api16Impl r0 = new androidx.core.view.Api16Impl
            r0.<init>()
            androidx.core.view.Api16Impl.INSTANCE = r0
            return
    }

    private Api16Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void postOnAnimationDelayed(android.view.View r0, java.lang.Runnable r1, long r2) {
            r0.postOnAnimationDelayed(r1, r2)
            return
    }
}
