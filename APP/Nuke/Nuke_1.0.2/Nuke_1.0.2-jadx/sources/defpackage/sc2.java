package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sc2 {
    public final tc2 a;
    public final ta b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final jx2 c = new jx2(0);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sc2(tc2 tc2Var, ta taVar) {
        this.a = tc2Var;
        this.b = taVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() throws PendingIntent.CanceledException {
        tc2 tc2Var = this.a;
        if (((la1) tc2Var.getLifecycle()).h != aa1.i) {
            s.l("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                s.l("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            tc2Var.getLifecycle().a(new lg1(1, this));
            this.e = true;
        }
    }
}
