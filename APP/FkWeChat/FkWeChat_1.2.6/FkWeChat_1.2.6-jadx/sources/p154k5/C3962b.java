package p154k5;

import p239q5.C6249b;
import p239q5.C6251c;
import p239q5.C6271v;
import p239q5.C6274y;

/* JADX INFO: renamed from: k5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3962b {

    /* JADX INFO: renamed from: a */
    public final C3970f[] f11452a;

    /* JADX INFO: renamed from: b */
    public final C3970f[] f11453b;

    /* JADX INFO: renamed from: c */
    public final C3970f[] f11454c;

    public C3962b(C6271v c6271v) {
        int iM33922F = c6271v.m24804b().m33922F();
        this.f11452a = new C3970f[iM33922F];
        this.f11453b = new C3970f[iM33922F];
        this.f11454c = new C3970f[iM33922F];
        m15715e(c6271v);
    }

    /* JADX INFO: renamed from: a */
    public C3970f m15711a(C6249b c6249b) {
        return this.f11454c[c6249b.mo6715a()];
    }

    /* JADX INFO: renamed from: b */
    public C3970f m15712b(C6249b c6249b) {
        return this.f11453b[c6249b.mo6715a()];
    }

    /* JADX INFO: renamed from: c */
    public C3970f m15713c(int i10) {
        return this.f11452a[i10];
    }

    /* JADX INFO: renamed from: d */
    public C3970f m15714d(C6249b c6249b) {
        return this.f11452a[c6249b.mo6715a()];
    }

    /* JADX INFO: renamed from: e */
    public final void m15715e(C6271v c6271v) {
        C6251c c6251cM24804b = c6271v.m24804b();
        int size = c6251cM24804b.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6249b c6249bM24673L = c6251cM24804b.m24673L(i10);
            int iMo6715a = c6249bM24673L.mo6715a();
            this.f11452a[iMo6715a] = new C3970f(c6249bM24673L.m24665d().m24704G(0).m24696k());
            C6274y c6274yM24696k = c6249bM24673L.m24666e().m24696k();
            this.f11453b[iMo6715a] = new C3970f(c6274yM24696k);
            this.f11454c[iMo6715a] = new C3970f(c6274yM24696k);
        }
    }
}
