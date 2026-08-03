package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4343 extends android.widget.ScrollView implements com.kongzue.dialogx.interfaces.ScrollController {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f13762;

    static {
            r0 = 734(0x2de, float:1.029E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4343(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
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

    @Override // android.widget.ScrollView, android.view.View
    public native boolean onTouchEvent(android.view.MotionEvent r1);
}
