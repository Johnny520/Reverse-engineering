package p000a;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: a.na */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0727na implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        view.requestFocus();
        view.postDelayed(new RunnableC0836t5(view, 1), 150L);
        view.postDelayed(new RunnableC0836t5(view, 2), 500L);
        return false;
    }
}
