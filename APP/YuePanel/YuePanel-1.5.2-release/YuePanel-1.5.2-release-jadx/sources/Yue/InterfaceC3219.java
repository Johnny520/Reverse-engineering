package Yue;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3219 extends Animatable {

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۧ$ۥ */
    public static abstract class AbstractC0084 {
        Animatable2.AnimationCallback mPlatformCallback;

        /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۧ$ۥ$ۥ, reason: contains not printable characters */
        public class C3220 extends Animatable2.AnimationCallback {
            public C3220() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                AbstractC0084.this.onAnimationEnd(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                AbstractC0084.this.onAnimationStart(drawable);
            }
        }

        @InterfaceC7113(23)
        public Animatable2.AnimationCallback getPlatformCallback() {
            if (this.mPlatformCallback == null) {
                this.mPlatformCallback = new C3220();
            }
            return this.mPlatformCallback;
        }

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@InterfaceC6391 AbstractC0084 abstractC0084);

    boolean unregisterAnimationCallback(@InterfaceC6391 AbstractC0084 abstractC0084);
}
