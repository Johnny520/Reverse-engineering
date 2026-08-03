package p000a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: a.ff */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0580ff implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GestureDetector f2147a;

    public ViewOnTouchListenerC0580ff(GestureDetector gestureDetector) {
        this.f2147a = gestureDetector;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2147a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
