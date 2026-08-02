package p000;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class de3 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final wd3 f2010a;

    /* JADX INFO: renamed from: b */
    public List f2011b;

    /* JADX INFO: renamed from: c */
    public ArrayList f2012c;

    /* JADX INFO: renamed from: d */
    public final HashMap f2013d;

    public de3(wd3 wd3Var) {
        super(wd3Var.f12472i);
        this.f2013d = new HashMap();
        this.f2010a = wd3Var;
    }

    /* JADX INFO: renamed from: a */
    public final ge3 m1010a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f2013d;
        ge3 ge3Var = (ge3) map.get(windowInsetsAnimation);
        if (ge3Var != null) {
            return ge3Var;
        }
        ge3 ge3Var2 = new ge3(0, null, 0L);
        ge3Var2.f3471a = new ee3(windowInsetsAnimation);
        map.put(windowInsetsAnimation, ge3Var2);
        return ge3Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2010a.mo332a(m1010a(windowInsetsAnimation));
        this.f2013d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2010a.mo334c(m1010a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2012c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2012c = arrayList2;
            this.f2011b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM749g = ce3.m749g(list.get(size));
            ge3 ge3VarM1010a = m1010a(windowInsetsAnimationM749g);
            ge3VarM1010a.f3471a.mo1348e(windowInsetsAnimationM749g.getFraction());
            this.f2012c.add(ge3VarM1010a);
        }
        return this.f2010a.mo127d(cf3.m769c(null, windowInsets), this.f2011b).m770b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        dq1 dq1VarMo128e = this.f2010a.mo128e(m1010a(windowInsetsAnimation), new dq1(bounds));
        dq1VarMo128e.getClass();
        AbstractC0153e4.m1235n();
        return AbstractC0153e4.m1230i(((zz0) dq1VarMo128e.f2147i).m6520d(), ((zz0) dq1VarMo128e.f2148j).m6520d());
    }
}
