package Yue;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7993 {

    /* JADX INFO: renamed from: ۥ */
    public static View f3170;

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۢ$ۥ */
    public class C1398 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ boolean f3171;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ int f3172;

        static {
            NativeUtil.classesInit0(487);
        }

        public C1398(boolean z, int i) {
            this.f3171 = z;
            this.f3172 = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public native void onAnimationEnd(Animator animator);
    }

    static {
        NativeUtil.classesInit0(364);
    }

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ View m4001();

    /* JADX INFO: renamed from: ۥ۟ */
    public static native boolean m4002(View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m25198(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m25199(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m25200(View view, boolean z);
}
