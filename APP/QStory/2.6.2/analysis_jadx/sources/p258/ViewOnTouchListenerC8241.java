package p258;

import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import java.util.Iterator;
import p257.C8211;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC8241 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8240 f22780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Activity f22781;

    public ViewOnTouchListenerC8241(C8240 c8240, Activity activity) {
        this.f22780 = c8240;
        this.f22781 = activity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC3737 abstractC3737 = this.f22780.f22779;
        Iterator it = AbstractC3737.m8046().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Activity activity = this.f22781;
            if (!zHasNext) {
                if (abstractC3737 instanceof C8211) {
                    return activity.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
            AbstractC3737 abstractC37372 = (AbstractC3737) it.next();
            if (abstractC37372.m8071() == activity && abstractC37372 != abstractC3737 && abstractC37372.f11588 == abstractC3737.f11588 && !(abstractC37372 instanceof C8211) && abstractC37372.m8068() != null) {
                Log.e(">>>", "onTouch: dialog=" + abstractC37372 + "  baseDialog=" + abstractC3737);
                abstractC37372.m8068().dispatchTouchEvent(motionEvent);
                return true;
            }
        }
    }
}
