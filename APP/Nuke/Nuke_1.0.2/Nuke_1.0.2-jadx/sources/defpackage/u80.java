package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u80 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u80(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.m = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) throws IOException {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                return ((u80) p(t00Var, j20Var)).r(a83Var);
            case 1:
                return ((u80) p(t00Var, j20Var)).r(a83Var);
            default:
                ((u80) p(t00Var, j20Var)).r(a83Var);
                return a83Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new u80((sz0) obj2, t00Var, 0);
            case 1:
                return new u80((p02) obj2, t00Var, 1);
            default:
                return new u80((Context) obj2, t00Var, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws IOException {
        String str;
        t00 t00Var = null;
        switch (this.l) {
            case 0:
                fg1.T(obj);
                File fileK = sz0.k((sz0) this.m);
                pb1 pb1VarE = eu.E();
                sz0.s(fileK, fileK, pb1VarE);
                return du.z0(eu.z(pb1VarE));
            case 1:
                fg1.T(obj);
                p02 p02Var = (p02) this.m;
                Context context = p02Var.b;
                rm2 rm2Var = p02Var.c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = rm2Var.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        c80.s();
                        return null;
                    }
                    str = "textview";
                }
                p90.C();
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(p90.i(context.getPackageName(), str).build());
                p02Var.f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            default:
                fg1.T(obj);
                sq1.a.d((Context) this.m);
                if (sq1.f) {
                    int i = 2;
                    p7.A(sq1.b, null, new lk0(i, t00Var, i), 3);
                }
                return a83.a;
        }
    }
}
