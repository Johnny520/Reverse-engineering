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

    public /* synthetic */ ViewOnTouchListenerC0246Fo(int r1, Object r2) {
        this.f802a = r1;
        this.f803b = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r6, MotionEvent r7) {
        switch(this.f802a) {
            case 0: goto L9;
            default: goto L5;
        };
    L9:
        C0289Go r62 = (C0289Go) this.f803b;
        RunnableC0117Co r0 = r62.f954r;
        Handler r1 = r62.f958v;
        C0606O3 r63 = r62.f962z;
        int r2 = r7.getAction();
        int r3 = (int) r7.getX();
        int r72 = (int) r7.getY();
        if (r2 != 0) goto L22;
        if (r63 == null) goto L22;
        if (r63.isShowing() == false) goto L22;
        if (r3 < 0) goto L22;
        if (r3 >= r63.getWidth()) goto L22;
        if (r72 < 0) goto L22;
        if (r72 >= r63.getHeight()) goto L22;
        r1.postDelayed(r0, 250);
        return false;
    L22:
        if (r2 != 1) goto L28;
        r1.removeCallbacks(r0);
        return false;
    L28:
        return false;
    L5:
        if (((Checkable) r6).isChecked() == true) goto L26;
        return false;
    L26:
        return ((GestureDetector) this.f803b).onTouchEvent(r7);
    }
}
