package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class js extends t70 implements w70 {
    public static final js d = new js(true);
    public static final String e = "ChattingUi";
    public static final hx2 f = new hx2(new c0(22));
    public static final hx2 g = new hx2(new c0(23));
    public static final hx2 h = new hx2(new c0(24));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View j(Object obj) {
        Object x92Var;
        Object x92Var2;
        Class<View> cls = View.class;
        try {
            hi0 hi0VarR = op0.y(obj).r();
            hi0VarR.b();
            hi0VarR.b = "itemView";
            Object objG0 = ((pi0) du.o0(hi0VarR.c())).g0();
            x92Var = objG0 instanceof View ? (View) objG0 : null;
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
            hi0 hi0VarR2 = op0.y(obj).r();
            hi0VarR2.b();
            Class<View> clsA = p40.A(d72.a(cls));
            if (clsA != null) {
                cls = clsA;
            }
            hi0VarR2.g = cls;
            Object objG02 = ((pi0) du.o0(hi0VarR2.c())).g0();
            x92Var2 = objG02 instanceof View ? (View) objG02 : null;
        } catch (Throwable th2) {
            x92Var2 = new x92(th2);
        }
        return (View) (x92Var2 instanceof x92 ? null : x92Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(is.b);
        arrayList.add(fs.b);
        arrayList.add(hs.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }
}
