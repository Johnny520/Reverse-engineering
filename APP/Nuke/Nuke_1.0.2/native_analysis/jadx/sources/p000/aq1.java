package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import nuke.data.cipher.NativeCrypto;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f335a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m259a(op1 op1Var, op1 op1Var2, AbstractC0812vj[] abstractC0812vjArr) {
        op1Var.getClass();
        op1Var2.getClass();
        abstractC0812vjArr.getClass();
        if (f335a.compareAndSet(false, true)) {
            op1Var2.m3610g(AbstractC0179eu.m1435P("Dex_Cache_Sum_Sign", "hooker_debug_records"));
            pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
            pb1VarM1424E.add("security_mode");
            for (AbstractC0812vj abstractC0812vj : abstractC0812vjArr) {
                pb1VarM1424E.add(abstractC0812vj.mo9d());
            }
            op1Var.m3610g(AbstractC0179eu.m1476z(pb1VarM1424E));
            NativeCrypto.INSTANCE.warmUpAsync();
            sq1 sq1Var = sq1.f10305a;
            Context context = up0.f11401i;
            if (context == null) {
                t11.m5067S("hostContext");
                throw null;
            }
            sq1Var.m4980d(context);
        }
    }
}
