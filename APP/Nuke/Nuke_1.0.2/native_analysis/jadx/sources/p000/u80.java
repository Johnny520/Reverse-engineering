package p000;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u80 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11127l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f11128m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u80(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11127l = i;
        this.f11128m = obj;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws IOException {
        int i = this.f11127l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                return ((u80) mo13p(t00Var, j20Var)).mo7r(a83Var);
            case 1:
                return ((u80) mo13p(t00Var, j20Var)).mo7r(a83Var);
            default:
                ((u80) mo13p(t00Var, j20Var)).mo7r(a83Var);
                return a83Var;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11127l;
        Object obj2 = this.f11128m;
        switch (i) {
            case 0:
                return new u80((sz0) obj2, t00Var, 0);
            case 1:
                return new u80((p02) obj2, t00Var, 1);
            default:
                return new u80((Context) obj2, t00Var, 2);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws IOException {
        String str;
        t00 t00Var = null;
        switch (this.f11127l) {
            case 0:
                fg1.m1627T(obj);
                File fileM5025k = sz0.m5025k((sz0) this.f11128m);
                pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
                sz0.m5027s(fileM5025k, fileM5025k, pb1VarM1424E);
                return AbstractC0142du.m1170z0(AbstractC0179eu.m1476z(pb1VarM1424E));
            case 1:
                fg1.m1627T(obj);
                p02 p02Var = (p02) this.f11128m;
                Context context = p02Var.f7908b;
                rm2 rm2Var = p02Var.f7909c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = rm2Var.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        c80.m675s();
                        return null;
                    }
                    str = "textview";
                }
                p90.m3801C();
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(p90.m3811i(context.getPackageName(), str).build());
                p02Var.f7912f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            default:
                fg1.m1627T(obj);
                sq1.f10305a.m4980d((Context) this.f11128m);
                if (sq1.f10310f) {
                    int i = 2;
                    AbstractC0570p7.m3745A(sq1.f10306b, null, new lk0(i, t00Var, i), 3);
                }
                return a83.f116a;
        }
    }
}
