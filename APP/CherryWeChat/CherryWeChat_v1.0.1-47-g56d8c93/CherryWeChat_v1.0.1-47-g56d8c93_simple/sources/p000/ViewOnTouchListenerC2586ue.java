package p000;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ue */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC2586ue implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8956b;

    public /* synthetic */ ViewOnTouchListenerC2586ue(int r1, Object r2) {
        this.f8955a = r1;
        this.f8956b = r2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r8, MotionEvent r9) {
        switch(this.f8955a) {
            case 0: goto L24;
            case 1: goto L15;
            default: goto L4;
        };
    L4:
        View r82 = (View) this.f8956b;
        int r92 = r9.getAction();
        if (r92 != 0) goto L7;
        r82.setAlpha(0.7f);
        return false;
    L7:
        if (r92 != 1) goto L9;
    L11:
        r82.setAlpha(1.0f);
        return false;
    L9:
        if (r92 == 3) goto L11;
        return false;
    L15:
        C0494Le r83 = (C0494Le) this.f8956b;
        if (r9.getAction() != 1) goto L23;
        long r2 = SystemClock.uptimeMillis() - r83.f1616o;
        if (r2 >= 0) goto L20;
    L21:
        r83.f1614m = false;
    L22:
        r83.m960t();
        r83.f1614m = true;
        r83.f1616o = SystemClock.uptimeMillis();
        goto L23
    L20:
        if (r2 <= 300) goto L22;
    L23:
        return false;
    L24:
        C2629ve r84 = (C2629ve) this.f8956b;
        RunnableC0562N2 r0 = r84.f9135n;
        Handler r1 = r84.f9130i;
        int r22 = r9.getAction();
        if (r22 == 0) goto L56;
        if (r22 != 1) goto L28;
        r1.removeCallbacks(r0);
        if (r84.f9125d == false) goto L63;
        r84.f9125d = false;
        r84.f9127f = 0.0f;
        InterfaceC1416fj r93 = r84.f9134m;
        if (r93 == null) goto L52;
        r93.mo90g(r84);
    L52:
        ViewParent r94 = r84.getParent();
        if (r94 == null) goto L55;
        r94.requestDisallowInterceptTouchEvent(false);
    L55:
        r84.invalidate();
        return true;
    L63:
        return true;
    L28:
        if (r22 == 2) goto L42;
        if (r22 != 3) goto L58;
        r1.removeCallbacks(r0);
        if (r84.f9125d == false) goto L59;
        r84.f9125d = false;
        r84.f9127f = 0.0f;
        InterfaceC1416fj r95 = r84.f9134m;
        if (r95 == null) goto L37;
        r95.mo90g(r84);
    L37:
        ViewParent r96 = r84.getParent();
        if (r96 == null) goto L40;
        r96.requestDisallowInterceptTouchEvent(false);
    L40:
        r84.invalidate();
        return true;
    L59:
        return true;
    L58:
        return false;
    L42:
        if (r84.f9125d == false) goto L61;
        float r97 = r9.getRawY() - r84.f9126e;
        r84.setTranslationY(r97);
        Function2 r02 = r84.f9133l;
        if (r02 == null) goto L46;
        r02.mo446d(r84, Float.valueOf(r97));
    L46:
        r84.invalidate();
        return true;
    L61:
        return true;
    L56:
        r84.f9126e = r9.getRawY();
        r84.getY();
        r84.f9125d = false;
        r84.f9127f = 0.0f;
        r1.postDelayed(r0, r84.f9131j);
        return true;
    }
}
