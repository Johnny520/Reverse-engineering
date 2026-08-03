package Yue;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.kongzue.dialogx.interfaces.ScrollController;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6327 extends ScrollView implements ScrollController {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f15992;

    static {
        NativeUtil.classesInit0(734);
    }

    public C6327(Context context) {
        super(context);
    }

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public native int getScrollDistance();

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public native boolean isCanScroll();

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public native boolean isLockScroll();

    @Override // com.kongzue.dialogx.interfaces.ScrollController
    public native void lockScroll(boolean z);

    @Override // android.widget.ScrollView, android.view.View
    public native boolean onTouchEvent(MotionEvent motionEvent);
}
