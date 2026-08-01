package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class vw0 implements ju0 {

    /* JADX INFO: renamed from: d */
    public qx0 f6830d;

    /* JADX INFO: renamed from: e */
    public zw0 f6831e;

    /* JADX INFO: renamed from: f */
    public String f6832f;

    /* JADX INFO: renamed from: g */
    public Object f6833g;

    /* JADX INFO: renamed from: h */
    public Object[] f6834h;

    /* JADX INFO: renamed from: i */
    public C0541o8 f6835i;

    /* JADX INFO: renamed from: j */
    public final C0381k6 f6836j = new C0381k6(7, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vw0(qx0 qx0Var, zw0 zw0Var, String str, Object obj, Object[] objArr) {
        this.f6830d = qx0Var;
        this.f6831e = zw0Var;
        this.f6832f = str;
        this.f6833g = obj;
        this.f6834h = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4793a() {
        String strM3414p;
        zw0 zw0Var = this.f6831e;
        if (this.f6835i != null) {
            C0921xc.m5127h("entry(", this.f6835i, ") is not null");
            return;
        }
        if (zw0Var != null) {
            C0381k6 c0381k6 = this.f6836j;
            Object objInvoke = c0381k6.invoke();
            if (objInvoke == null || zw0Var.mo215b(objInvoke)) {
                this.f6835i = zw0Var.mo214a(this.f6832f, c0381k6);
                return;
            }
            if (objInvoke instanceof x21) {
                x21 x21Var = (x21) objInvoke;
                if (x21Var.mo595d() == C0496n2.f4133M || x21Var.mo595d() == C0496n2.f4141U || x21Var.mo595d() == C0496n2.f4138R) {
                    strM3414p = "MutableState containing " + x21Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM3414p = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM3414p = r60.m3414p(objInvoke);
            }
            throw new IllegalArgumentException(strM3414p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: c */
    public final void mo784c() {
        m4793a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: d */
    public final void mo785d() {
        C0541o8 c0541o8 = this.f6835i;
        if (c0541o8 != null) {
            c0541o8.m2813r();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: e */
    public final void mo786e() {
        C0541o8 c0541o8 = this.f6835i;
        if (c0541o8 != null) {
            c0541o8.m2813r();
        }
    }
}
