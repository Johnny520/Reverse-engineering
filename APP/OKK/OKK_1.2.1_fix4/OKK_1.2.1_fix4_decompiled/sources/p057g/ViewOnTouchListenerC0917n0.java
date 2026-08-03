package p057g;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: g.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0917n0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0919o0 f3245a;

    public ViewOnTouchListenerC0917n0(AbstractC0919o0 abstractC0919o0) {
        this.f3245a = abstractC0919o0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0938y c0938y;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        AbstractC0919o0 abstractC0919o0 = this.f3245a;
        if (action == 0 && (c0938y = abstractC0919o0.f3272v) != null && c0938y.isShowing() && x >= 0 && x < abstractC0919o0.f3272v.getWidth() && y >= 0 && y < abstractC0919o0.f3272v.getHeight()) {
            abstractC0919o0.f3268r.postDelayed(abstractC0919o0.f3264n, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC0919o0.f3268r.removeCallbacks(abstractC0919o0.f3264n);
        return false;
    }
}
