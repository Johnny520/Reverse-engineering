package p000;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bc2 implements a82 {

    /* JADX INFO: renamed from: h */
    public wc2 f778h;

    /* JADX INFO: renamed from: i */
    public fc2 f779i;

    /* JADX INFO: renamed from: j */
    public String f780j;

    /* JADX INFO: renamed from: k */
    public Object f781k;

    /* JADX INFO: renamed from: l */
    public Object[] f782l;

    /* JADX INFO: renamed from: m */
    public ec2 f783m;

    /* JADX INFO: renamed from: n */
    public final C0727ta f784n = new C0727ta(18, this);

    public bc2(wc2 wc2Var, fc2 fc2Var, String str, Object obj, Object[] objArr) {
        this.f778h = wc2Var;
        this.f779i = fc2Var;
        this.f780j = str;
        this.f781k = obj;
        this.f782l = objArr;
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: a */
    public final void mo109a() throws PendingIntent.CanceledException {
        m511b();
    }

    /* JADX INFO: renamed from: b */
    public final void m511b() throws PendingIntent.CanceledException {
        String strM1903u;
        fc2 fc2Var = this.f779i;
        if (this.f783m != null) {
            c80.m670n("entry(", this.f783m, ") is not null");
            return;
        }
        if (fc2Var != null) {
            C0727ta c0727ta = this.f784n;
            Object objMo6a = c0727ta.mo6a();
            if (objMo6a == null || fc2Var.mo976b(objMo6a)) {
                this.f783m = fc2Var.mo975a(this.f780j, c0727ta);
                return;
            }
            if (objMo6a instanceof is2) {
                is2 is2Var = (is2) objMo6a;
                if (is2Var.mo2391d() == gd3.f3416C || is2Var.mo2391d() == C0700sn.f10216T || is2Var.mo2391d() == C0700sn.f10212P) {
                    strM1903u = "MutableState containing " + is2Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM1903u = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM1903u = gf1.m1903u(objMo6a);
            }
            throw new IllegalArgumentException(strM1903u);
        }
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: d */
    public final void mo110d() {
        ec2 ec2Var = this.f783m;
        if (ec2Var != null) {
            ((C0043b5) ec2Var).m415H();
        }
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: f */
    public final void mo111f() {
        ec2 ec2Var = this.f783m;
        if (ec2Var != null) {
            ((C0043b5) ec2Var).m415H();
        }
    }
}
