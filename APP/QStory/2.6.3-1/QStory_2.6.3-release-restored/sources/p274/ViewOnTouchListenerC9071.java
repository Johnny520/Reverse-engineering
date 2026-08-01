package p274;

import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import java.util.Iterator;
import p273.C9041;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC9071 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9070 f23124;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Activity f23125;

    public ViewOnTouchListenerC9071(C9070 c9070, Activity activity) {
        this.f23124 = c9070;
        this.f23125 = activity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC4570 abstractC4570 = this.f23124.f23123;
        Iterator it = AbstractC4570.m8592().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Activity activity = this.f23125;
            if (!zHasNext) {
                if (abstractC4570 instanceof C9041) {
                    return activity.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
            AbstractC4570 abstractC45702 = (AbstractC4570) it.next();
            if (abstractC45702.m8617() == activity && abstractC45702 != abstractC4570 && abstractC45702.f11938 == abstractC4570.f11938 && !(abstractC45702 instanceof C9041) && abstractC45702.m8614() != null) {
                Log.e(">>>", "onTouch: dialog=" + abstractC45702 + "  baseDialog=" + abstractC4570);
                abstractC45702.m8614().dispatchTouchEvent(motionEvent);
                return true;
            }
        }
    }
}
