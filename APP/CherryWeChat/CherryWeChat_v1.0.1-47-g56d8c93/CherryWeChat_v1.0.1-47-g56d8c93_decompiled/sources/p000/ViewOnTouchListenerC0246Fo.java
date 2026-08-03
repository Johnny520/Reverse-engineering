package p000;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: Fo */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0246Fo implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f803b;

    public /* synthetic */ ViewOnTouchListenerC0246Fo(int i, Object obj) {
        this.f802a = i;
        this.f803b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f802a) {
            case 0:
                C0289Go c0289Go = (C0289Go) this.f803b;
                RunnableC0117Co runnableC0117Co = c0289Go.f954r;
                Handler handler = c0289Go.f958v;
                C0606O3 c0606o3 = c0289Go.f962z;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0606o3 != null && c0606o3.isShowing() && x >= 0 && x < c0606o3.getWidth() && y >= 0 && y < c0606o3.getHeight()) {
                    handler.postDelayed(runnableC0117Co, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(runnableC0117Co);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f803b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
