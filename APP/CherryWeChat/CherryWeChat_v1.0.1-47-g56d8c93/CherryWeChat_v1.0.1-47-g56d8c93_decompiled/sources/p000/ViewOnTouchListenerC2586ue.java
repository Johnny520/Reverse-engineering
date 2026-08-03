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

    public /* synthetic */ ViewOnTouchListenerC2586ue(int i, Object obj) {
        this.f8955a = i;
        this.f8956b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f8955a) {
            case 0:
                C2629ve c2629ve = (C2629ve) this.f8956b;
                RunnableC0562N2 runnableC0562N2 = c2629ve.f9135n;
                Handler handler = c2629ve.f9130i;
                int action = motionEvent.getAction();
                if (action == 0) {
                    c2629ve.f9126e = motionEvent.getRawY();
                    c2629ve.getY();
                    c2629ve.f9125d = false;
                    c2629ve.f9127f = 0.0f;
                    handler.postDelayed(runnableC0562N2, c2629ve.f9131j);
                } else if (action == 1) {
                    handler.removeCallbacks(runnableC0562N2);
                    if (c2629ve.f9125d) {
                        c2629ve.f9125d = false;
                        c2629ve.f9127f = 0.0f;
                        InterfaceC1416fj interfaceC1416fj = c2629ve.f9134m;
                        if (interfaceC1416fj != null) {
                            interfaceC1416fj.mo90g(c2629ve);
                        }
                        ViewParent parent = c2629ve.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                        c2629ve.invalidate();
                    }
                } else if (action == 2) {
                    if (c2629ve.f9125d) {
                        float rawY = motionEvent.getRawY() - c2629ve.f9126e;
                        c2629ve.setTranslationY(rawY);
                        Function2 function2 = c2629ve.f9133l;
                        if (function2 != null) {
                            function2.mo446d(c2629ve, Float.valueOf(rawY));
                        }
                        c2629ve.invalidate();
                    }
                } else if (action == 3) {
                    handler.removeCallbacks(runnableC0562N2);
                    if (c2629ve.f9125d) {
                        c2629ve.f9125d = false;
                        c2629ve.f9127f = 0.0f;
                        InterfaceC1416fj interfaceC1416fj2 = c2629ve.f9134m;
                        if (interfaceC1416fj2 != null) {
                            interfaceC1416fj2.mo90g(c2629ve);
                        }
                        ViewParent parent2 = c2629ve.getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(false);
                        }
                        c2629ve.invalidate();
                    }
                }
                break;
            case 1:
                C0494Le c0494Le = (C0494Le) this.f8956b;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - c0494Le.f1616o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        c0494Le.f1614m = false;
                    }
                    c0494Le.m960t();
                    c0494Le.f1614m = true;
                    c0494Le.f1616o = SystemClock.uptimeMillis();
                }
                break;
            default:
                View view2 = (View) this.f8956b;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    view2.setAlpha(0.7f);
                } else if (action2 == 1 || action2 == 3) {
                    view2.setAlpha(1.0f);
                }
                break;
        }
        return false;
    }
}
