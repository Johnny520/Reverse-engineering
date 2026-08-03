package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4342 extends androidx.recyclerview.widget.RecyclerView implements com.kongzue.dialogx.interfaces.ScrollController {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f13761;

    static {
            r0 = 733(0x2dd, float:1.027E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4342(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C4342(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public C4342(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public native int getScrollDistance();

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public native boolean isCanScroll();

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public native boolean isLockScroll();

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public native void lockScroll(boolean r1);

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public native boolean onTouchEvent(android.view.MotionEvent r1);
}
