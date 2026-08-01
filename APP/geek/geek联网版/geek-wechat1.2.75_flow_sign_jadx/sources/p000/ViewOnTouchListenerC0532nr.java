package p000;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: nr */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0532nr implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3336b;

    public /* synthetic */ ViewOnTouchListenerC0532nr(int i, Object obj) {
        this.f3335a = i;
        this.f3336b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f3335a) {
            case Base64.DEFAULT /* 0 */:
                C0569or c0569or = (C0569or) this.f3336b;
                RunnableC0458lr runnableC0458lr = c0569or.f3534r;
                Handler handler = c0569or.f3538v;
                C0091c4 c0091c4 = c0569or.f3542z;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0091c4 != null && c0091c4.isShowing() && x >= 0 && x < c0091c4.getWidth() && y >= 0 && y < c0091c4.getHeight()) {
                    handler.postDelayed(runnableC0458lr, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(runnableC0458lr);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f3336b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
