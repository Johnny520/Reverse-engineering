package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
public final class jr implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jr(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r6, MotionEvent r7) {
        switch(this.a) {
            case 0: goto L9;
            default: goto L5;
        };
    L9:
        kr r62 = (kr) this.b;
        hr r0 = r62.r;
        Handler r1 = r62.v;
        c4 r63 = r62.z;
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
        return ((GestureDetector) this.b).onTouchEvent(r7);
    }
}
