package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sc2 {

    /* JADX INFO: renamed from: a */
    public final tc2 f10038a;

    /* JADX INFO: renamed from: b */
    public final C0727ta f10039b;

    /* JADX INFO: renamed from: e */
    public boolean f10042e;

    /* JADX INFO: renamed from: f */
    public Bundle f10043f;

    /* JADX INFO: renamed from: g */
    public boolean f10044g;

    /* JADX INFO: renamed from: c */
    public final jx2 f10040c = new jx2(0);

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f10041d = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public boolean f10045h = true;

    public sc2(tc2 tc2Var, C0727ta c0727ta) {
        this.f10038a = tc2Var;
        this.f10039b = c0727ta;
    }

    /* JADX INFO: renamed from: a */
    public final void m4793a() throws PendingIntent.CanceledException {
        tc2 tc2Var = this.f10038a;
        if (((la1) tc2Var.getLifecycle()).f6009h != aa1.f120i) {
            C0676s.m4653l("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f10042e) {
                C0676s.m4653l("SavedStateRegistry was already attached.");
                return;
            }
            this.f10039b.mo6a();
            tc2Var.getLifecycle().mo505a(new lg1(1, this));
            this.f10042e = true;
        }
    }
}
