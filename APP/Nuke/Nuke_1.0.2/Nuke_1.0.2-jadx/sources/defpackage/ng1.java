package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ng1 {
    public final qv a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ng1(qv qvVar) {
        this.a = qvVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.b.remove((Object) null);
        mg1 mg1Var = (mg1) this.c.remove(null);
        if (mg1Var != null) {
            mg1Var.a.b(mg1Var.b);
            mg1Var.b = null;
        }
        this.a.run();
    }
}
