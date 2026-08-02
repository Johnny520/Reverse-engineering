package p000;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ic2 implements fc2, tc2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ gc2 f4556h;

    /* JADX INFO: renamed from: i */
    public la1 f4557i;

    /* JADX INFO: renamed from: j */
    public rc2 f4558j;

    public ic2(gc2 gc2Var) {
        this.f4556h = gc2Var;
        Object objMo978d = gc2Var.mo978d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo978d instanceof Bundle ? (Bundle) objMo978d : null;
        if (bundle != null) {
            m2326e(bundle);
        }
        gc2Var.mo975a("androidx.savedstate.SavedStateRegistry", new C0727ta(19, this));
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: a */
    public final ec2 mo975a(String str, xm0 xm0Var) {
        return this.f4556h.mo975a(str, xm0Var);
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: b */
    public final boolean mo976b(Object obj) {
        return this.f4556h.mo976b(obj);
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: c */
    public final Map mo977c() {
        return this.f4556h.mo977c();
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: d */
    public final Object mo978d(String str) {
        return this.f4556h.mo978d(str);
    }

    /* JADX INFO: renamed from: e */
    public final rc2 m2326e(Bundle bundle) {
        rc2 rc2Var = this.f4558j;
        if (rc2Var != null) {
            return rc2Var;
        }
        rc2 rc2Var2 = new rc2(new sc2(this, new C0727ta(20, this)));
        this.f4558j = rc2Var2;
        rc2Var2.m4432a(bundle);
        return rc2Var2;
    }

    @Override // p000.ia1
    public final ba1 getLifecycle() {
        la1 la1Var = this.f4557i;
        if (la1Var != null) {
            return la1Var;
        }
        la1 la1Var2 = new la1(this, false);
        this.f4557i = la1Var2;
        return la1Var2;
    }

    @Override // p000.tc2
    public final qc2 getSavedStateRegistry() {
        return m2326e(null).f9512b;
    }
}
