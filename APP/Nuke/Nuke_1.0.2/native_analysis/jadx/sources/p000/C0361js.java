package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: js */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0361js extends t70 implements w70 {

    /* JADX INFO: renamed from: d */
    public static final C0361js f5188d = new C0361js(true);

    /* JADX INFO: renamed from: e */
    public static final String f5189e = "ChattingUi";

    /* JADX INFO: renamed from: f */
    public static final hx2 f5190f = new hx2(new C0074c0(22));

    /* JADX INFO: renamed from: g */
    public static final hx2 f5191g = new hx2(new C0074c0(23));

    /* JADX INFO: renamed from: h */
    public static final hx2 f5192h = new hx2(new C0074c0(24));

    /* JADX INFO: renamed from: j */
    public static View m2556j(Object obj) {
        Object x92Var;
        Object x92Var2;
        Class<View> cls = View.class;
        try {
            hi0 hi0VarM3241r = op0.m3602y(obj).m3241r();
            hi0VarM3241r.m6411b();
            hi0VarM3241r.f13871b = "itemView";
            Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
            x92Var = objM3867g0 instanceof View ? (View) objM3867g0 : null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        View view = (View) x92Var;
        if (view != null) {
            return view;
        }
        try {
            hi0 hi0VarM3241r2 = op0.m3602y(obj).m3241r();
            hi0VarM3241r2.m6411b();
            Class<View> clsM3691A = p40.m3691A(d72.m967a(cls));
            if (clsM3691A != null) {
                cls = clsM3691A;
            }
            hi0VarM3241r2.f4030g = cls;
            Object objM3867g02 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r2.m2194c())).m3867g0();
            x92Var2 = objM3867g02 instanceof View ? (View) objM3867g02 : null;
        } catch (Throwable th2) {
            x92Var2 = new x92(th2);
        }
        return (View) (x92Var2 instanceof x92 ? null : x92Var2);
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(C0324is.f4771b);
        arrayList.add(C0214fs.f3125b);
        arrayList.add(C0288hs.f4123b);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f5189e;
    }
}
