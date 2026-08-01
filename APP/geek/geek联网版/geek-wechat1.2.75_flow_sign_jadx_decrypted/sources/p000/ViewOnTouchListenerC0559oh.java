package p000;

import android.view.MotionEvent;
import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: oh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0559oh implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3462b;

    public /* synthetic */ ViewOnTouchListenerC0559oh(int i, Object obj) {
        this.f3461a = i;
        this.f3462b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o40 o40Var;
        switch (this.f3461a) {
            case Base64.DEFAULT /* 0 */:
                C0670rh c0670rh = (C0670rh) this.f3462b;
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0670rh.f4140o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0670rh.f4138m = false;
                    }
                    c0670rh.m2292t();
                    c0670rh.f4138m = true;
                    c0670rh.f4140o = System.currentTimeMillis();
                }
                break;
            default:
                View view2 = (View) this.f3462b;
                Object tag = view.getTag(2115043329);
                o40 o40Var2 = tag instanceof o40 ? (o40) tag : null;
                C0707sh c0707sh = o40.f3384o;
                if (o40Var2 == null) {
                    o40Var2 = new o40(view, c0707sh);
                    view.setTag(2115043329, o40Var2);
                }
                Object tag2 = view.getTag(2115043330);
                o40 o40Var3 = tag2 instanceof o40 ? (o40) tag2 : null;
                C0707sh c0707sh2 = o40.f3385p;
                if (o40Var3 == null) {
                    o40Var3 = new o40(view, c0707sh2);
                    view.setTag(2115043330, o40Var3);
                }
                if (view2 != null) {
                    Object tag3 = view2.getTag(2115043331);
                    o40Var = tag3 instanceof o40 ? (o40) tag3 : null;
                    if (o40Var == null) {
                        o40Var = new o40(view2, c0707sh);
                        view2.setTag(2115043331, o40Var);
                    }
                } else {
                    o40Var = null;
                }
                if (view2 != null) {
                    Object tag4 = view2.getTag(2115043332);
                    o40Var = tag4 instanceof o40 ? (o40) tag4 : null;
                    if (o40Var == null) {
                        o40 o40Var4 = new o40(view2, c0707sh2);
                        view2.setTag(2115043332, o40Var4);
                        o40Var = o40Var4;
                    }
                }
                C0417kn c0417kn = C0417kn.f2847a;
                String strM492a = "key_bottom_bar_vibration";
                c0417kn.getClass();
                boolean zM1690a = C0417kn.m1690a(strM492a, true);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    if (zM1690a) {
                        C0417kn.m1698i(view, 1);
                    }
                    o40Var2.f3400k = g40.m1143f(0.92f, 1500.0f, 0.7f);
                    o40Var3.f3400k = g40.m1143f(0.92f, 1500.0f, 0.7f);
                    o40Var2.m1991h();
                    o40Var3.m1991h();
                    if (o40Var != null) {
                        o40Var.f3400k = g40.m1143f(0.85f, 1500.0f, 0.6f);
                        o40Var.m1991h();
                    }
                    if (o40Var != null) {
                        o40Var.f3400k = g40.m1143f(0.85f, 1500.0f, 0.6f);
                        o40Var.m1991h();
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (zM1690a && motionEvent.getActionMasked() == 1) {
                        C0417kn.m1698i(view, 2);
                    }
                    o40Var2.f3400k = g40.m1143f(1.0f, 200.0f, 0.4f);
                    o40Var3.f3400k = g40.m1143f(1.0f, 200.0f, 0.4f);
                    o40Var2.m1991h();
                    o40Var3.m1991h();
                    if (o40Var != null) {
                        o40Var.f3400k = g40.m1143f(1.0f, 200.0f, 0.25f);
                        o40Var.m1991h();
                    }
                    if (o40Var != null) {
                        o40Var.f3400k = g40.m1143f(1.0f, 200.0f, 0.25f);
                        o40Var.m1991h();
                    }
                }
                break;
        }
        return false;
    }
}
