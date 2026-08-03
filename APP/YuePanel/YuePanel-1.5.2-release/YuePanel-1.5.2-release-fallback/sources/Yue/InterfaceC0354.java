package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0354 extends android.graphics.drawable.Animatable {

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۧ$ۥ, reason: contains not printable characters */
    public static abstract class AbstractC0355 {
        android.graphics.drawable.Animatable2.AnimationCallback mPlatformCallback;

        /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۧ$ۥ$ۥ, reason: contains not printable characters */
        public class C0356 extends android.graphics.drawable.Animatable2.AnimationCallback {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC0354.AbstractC0355 f853;

            public C0356(Yue.InterfaceC0354.AbstractC0355 r1) {
                    r0 = this;
                    r0.f853 = r1
                    r0.<init>()
                    return
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(android.graphics.drawable.Drawable r2) {
                    r1 = this;
                    Yue.ۥ۟۠ۥۧ$ۥ r0 = r1.f853
                    r0.onAnimationEnd(r2)
                    return
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(android.graphics.drawable.Drawable r2) {
                    r1 = this;
                    Yue.ۥ۟۠ۥۧ$ۥ r0 = r1.f853
                    r0.onAnimationStart(r2)
                    return
            }
        }

        public AbstractC0355() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC5336(23)
        public android.graphics.drawable.Animatable2.AnimationCallback getPlatformCallback() {
                r1 = this;
                android.graphics.drawable.Animatable2$AnimationCallback r0 = r1.mPlatformCallback
                if (r0 != 0) goto Lb
                Yue.ۥ۟۠ۥۧ$ۥ$ۥ r0 = new Yue.ۥ۟۠ۥۧ$ۥ$ۥ
                r0.<init>(r1)
                r1.mPlatformCallback = r0
            Lb:
                android.graphics.drawable.Animatable2$AnimationCallback r0 = r1.mPlatformCallback
                return r0
        }

        public void onAnimationEnd(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        public void onAnimationStart(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@Yue.InterfaceC4410 Yue.InterfaceC0354.AbstractC0355 r1);

    boolean unregisterAnimationCallback(@Yue.InterfaceC4410 Yue.InterfaceC0354.AbstractC0355 r1);
}
