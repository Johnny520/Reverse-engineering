package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class C2860 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.view.GestureDetector f9216;

    public C2860(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.view.GestureDetector.OnGestureListener r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C2860(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.view.GestureDetector.OnGestureListener r3, @Yue.InterfaceC4544 android.os.Handler r4) {
            r1 = this;
            r1.<init>()
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r2, r3, r4)
            r1.f9216 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m12308() {
            r1 = this;
            android.view.GestureDetector r0 = r1.f9216
            boolean r0 = r0.isLongpressEnabled()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m12309(@Yue.InterfaceC4410 android.view.MotionEvent r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.f9216
            boolean r2 = r0.onTouchEvent(r2)
            return r2
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12310(boolean r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.f9216
            r0.setIsLongpressEnabled(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m12311(@Yue.InterfaceC4544 android.view.GestureDetector.OnDoubleTapListener r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.f9216
            r0.setOnDoubleTapListener(r2)
            return
    }
}
