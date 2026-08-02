package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import nuke.data.cipher.NativeCrypto;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq1 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(op1 op1Var, op1 op1Var2, vj[] vjVarArr) {
        op1Var.getClass();
        op1Var2.getClass();
        vjVarArr.getClass();
        if (a.compareAndSet(false, true)) {
            op1Var2.g(eu.P("Dex_Cache_Sum_Sign", "hooker_debug_records"));
            pb1 pb1VarE = eu.E();
            pb1VarE.add("security_mode");
            for (vj vjVar : vjVarArr) {
                pb1VarE.add(vjVar.d());
            }
            op1Var.g(eu.z(pb1VarE));
            NativeCrypto.INSTANCE.warmUpAsync();
            sq1 sq1Var = sq1.a;
            Context context = up0.i;
            if (context == null) {
                t11.S("hostContext");
                throw null;
            }
            sq1Var.d(context);
        }
    }
}
