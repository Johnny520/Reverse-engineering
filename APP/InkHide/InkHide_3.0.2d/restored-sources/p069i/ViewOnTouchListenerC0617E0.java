package p069i;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: i.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0617E0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0619F0 f2125b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnTouchListenerC0617E0(AbstractC0619F0 abstractC0619F0) {
        this.f2125b = abstractC0619F0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0610B c0610b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        AbstractC0619F0 abstractC0619F0 = this.f2125b;
        if (action == 0 && (c0610b = abstractC0619F0.f2152z) != null && c0610b.isShowing() && x2 >= 0 && x2 < abstractC0619F0.f2152z.getWidth() && y2 >= 0 && y2 < abstractC0619F0.f2152z.getHeight()) {
            abstractC0619F0.f2148v.postDelayed(abstractC0619F0.f2144r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC0619F0.f2148v.removeCallbacks(abstractC0619F0.f2144r);
        return false;
    }
}
