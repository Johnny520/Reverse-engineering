package Yue;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.kongzue.dialogx.interfaces.ScrollController;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6326 extends RecyclerView implements ScrollController {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f15991;

    static {
        NativeUtil.classesInit0(733);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6326(@InterfaceC6391 Context context) {
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public native boolean onTouchEvent(MotionEvent motionEvent);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6326(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C6326(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
