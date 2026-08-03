package p057g;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: g.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0917n0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0919o0 f3245a;

    public ViewOnTouchListenerC0917n0(AbstractC0919o0 r1) {
        this.f3245a = r1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r4, MotionEvent r5) {
        int r42 = r5.getAction();
        int r02 = (int) r5.getX();
        int r52 = (int) r5.getY();
        AbstractC0919o0 r1 = this.f3245a;
        if (r42 != 0) goto L16;
        C0938y r2 = r1.f3272v;
        if (r2 == null) goto L16;
        if (r2.isShowing() == false) goto L16;
        if (r02 < 0) goto L16;
        if (r02 >= r1.f3272v.getWidth()) goto L16;
        if (r52 < 0) goto L16;
        if (r52 >= r1.f3272v.getHeight()) goto L16;
        r1.f3268r.postDelayed(r1.f3264n, 250);
        return false;
    L16:
        if (r42 != 1) goto L21;
        r1.f3268r.removeCallbacks(r1.f3264n);
        return false;
    L21:
        return false;
    }
}
