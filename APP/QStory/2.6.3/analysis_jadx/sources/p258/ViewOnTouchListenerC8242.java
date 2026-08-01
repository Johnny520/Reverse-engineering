package p258;

import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import java.util.Iterator;
import p257.C8212;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC8242 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8241 f22779;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Activity f22780;

    public ViewOnTouchListenerC8242(C8241 c8241, Activity activity) {
        this.f22779 = c8241;
        this.f22780 = activity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC3738 abstractC3738 = this.f22779.f22778;
        Iterator it = AbstractC3738.m8033().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Activity activity = this.f22780;
            if (!zHasNext) {
                if (abstractC3738 instanceof C8212) {
                    return activity.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
            AbstractC3738 abstractC37382 = (AbstractC3738) it.next();
            if (abstractC37382.m8058() == activity && abstractC37382 != abstractC3738 && abstractC37382.f11593 == abstractC3738.f11593 && !(abstractC37382 instanceof C8212) && abstractC37382.m8055() != null) {
                Log.e(">>>", "onTouch: dialog=" + abstractC37382 + "  baseDialog=" + abstractC3738);
                abstractC37382.m8055().dispatchTouchEvent(motionEvent);
                return true;
            }
        }
    }
}
