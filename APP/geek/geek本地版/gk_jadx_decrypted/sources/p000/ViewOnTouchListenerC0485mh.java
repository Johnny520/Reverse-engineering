package p000;

import android.view.MotionEvent;
import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: mh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0485mh implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3217b;

    public /* synthetic */ ViewOnTouchListenerC0485mh(int i, Object obj) {
        this.f3216a = i;
        this.f3217b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h40 h40Var;
        switch (this.f3216a) {
            case Base64.DEFAULT /* 0 */:
                C0597ph c0597ph = (C0597ph) this.f3217b;
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0597ph.f3901o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0597ph.f3899m = false;
                    }
                    c0597ph.m2118t();
                    c0597ph.f3899m = true;
                    c0597ph.f3901o = System.currentTimeMillis();
                }
                break;
            default:
                View view2 = (View) this.f3217b;
                Object tag = view.getTag(2115043329);
                h40 h40Var2 = tag instanceof h40 ? (h40) tag : null;
                C0634qh c0634qh = h40.f2219n;
                if (h40Var2 == null) {
                    h40Var2 = new h40(view, c0634qh);
                    view.setTag(2115043329, h40Var2);
                }
                Object tag2 = view.getTag(2115043330);
                h40 h40Var3 = tag2 instanceof h40 ? (h40) tag2 : null;
                C0634qh c0634qh2 = h40.f2220o;
                if (h40Var3 == null) {
                    h40Var3 = new h40(view, c0634qh2);
                    view.setTag(2115043330, h40Var3);
                }
                if (view2 != null) {
                    Object tag3 = view2.getTag(2115043331);
                    h40Var = tag3 instanceof h40 ? (h40) tag3 : null;
                    if (h40Var == null) {
                        h40Var = new h40(view2, c0634qh);
                        view2.setTag(2115043331, h40Var);
                    }
                } else {
                    h40Var = null;
                }
                if (view2 != null) {
                    Object tag4 = view2.getTag(2115043332);
                    h40Var = tag4 instanceof h40 ? (h40) tag4 : null;
                    if (h40Var == null) {
                        h40 h40Var4 = new h40(view2, c0634qh2);
                        view2.setTag(2115043332, h40Var4);
                        h40Var = h40Var4;
                    }
                }
                C0267gn c0267gn = C0267gn.f2144a;
                String strM2419a = "key_bottom_bar_vibration";
                c0267gn.getClass();
                boolean zM1281a = C0267gn.m1281a(strM2419a, true);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    if (zM1281a) {
                        C0267gn.m1289i(view, 1);
                    }
                    h40Var2.f2234j = z30.m2761f(0.92f, 1500.0f, 0.7f);
                    h40Var3.f2234j = z30.m2761f(0.92f, 1500.0f, 0.7f);
                    h40Var2.m1346h();
                    h40Var3.m1346h();
                    if (h40Var != null) {
                        h40Var.f2234j = z30.m2761f(0.85f, 1500.0f, 0.6f);
                        h40Var.m1346h();
                    }
                    if (h40Var != null) {
                        h40Var.f2234j = z30.m2761f(0.85f, 1500.0f, 0.6f);
                        h40Var.m1346h();
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (zM1281a && motionEvent.getActionMasked() == 1) {
                        C0267gn.m1289i(view, 2);
                    }
                    h40Var2.f2234j = z30.m2761f(1.0f, 200.0f, 0.4f);
                    h40Var3.f2234j = z30.m2761f(1.0f, 200.0f, 0.4f);
                    h40Var2.m1346h();
                    h40Var3.m1346h();
                    if (h40Var != null) {
                        h40Var.f2234j = z30.m2761f(1.0f, 200.0f, 0.25f);
                        h40Var.m1346h();
                    }
                    if (h40Var != null) {
                        h40Var.f2234j = z30.m2761f(1.0f, 200.0f, 0.25f);
                        h40Var.m1346h();
                    }
                }
                break;
        }
        return false;
    }
}
