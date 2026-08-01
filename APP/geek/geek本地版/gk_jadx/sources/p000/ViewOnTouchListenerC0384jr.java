package p000;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: jr */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0384jr implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2662a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2663b;

    public /* synthetic */ ViewOnTouchListenerC0384jr(int i, Object obj) {
        this.f2662a = i;
        this.f2663b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f2662a) {
            case Base64.DEFAULT /* 0 */:
                C0421kr c0421kr = (C0421kr) this.f2663b;
                RunnableC0308hr runnableC0308hr = c0421kr.f2937r;
                Handler handler = c0421kr.f2941v;
                C0091c4 c0091c4 = c0421kr.f2945z;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0091c4 != null && c0091c4.isShowing() && x >= 0 && x < c0091c4.getWidth() && y >= 0 && y < c0091c4.getHeight()) {
                    handler.postDelayed(runnableC0308hr, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(runnableC0308hr);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f2663b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
