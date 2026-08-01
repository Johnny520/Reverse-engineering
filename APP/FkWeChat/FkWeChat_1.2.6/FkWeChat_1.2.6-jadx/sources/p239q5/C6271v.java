package p239q5;

import bsh.C1259t2;
import p309v5.AbstractC8826h;
import p309v5.C8829k;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6271v {

    /* JADX INFO: renamed from: a */
    public final C6251c f19461a;

    /* JADX INFO: renamed from: b */
    public final int f19462b;

    /* JADX INFO: renamed from: c */
    public C8829k[] f19463c;

    /* JADX INFO: renamed from: d */
    public C8829k f19464d;

    public C6271v(C6251c c6251c, int i10) {
        if (c6251c == null) {
            C1259t2.m5095a("blocks == null");
            throw null;
        }
        if (i10 < 0) {
            C9987e.m38645a("firstLabel < 0");
            throw null;
        }
        this.f19461a = c6251c;
        this.f19462b = i10;
        this.f19463c = null;
        this.f19464d = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m24803a() {
        int iM33922F = this.f19461a.m33922F();
        C8829k[] c8829kArr = new C8829k[iM33922F];
        C8829k c8829k = new C8829k(10);
        int size = this.f19461a.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6249b c6249bM24673L = this.f19461a.m24673L(i10);
            int iMo6715a = c6249bM24673L.mo6715a();
            C8829k c8829kM24669h = c6249bM24673L.m24669h();
            int size2 = c8829kM24669h.size();
            if (size2 == 0) {
                c8829k.m33917w(iMo6715a);
            } else {
                for (int i11 = 0; i11 < size2; i11++) {
                    int iM33920z = c8829kM24669h.m33920z(i11);
                    C8829k c8829k2 = c8829kArr[iM33920z];
                    if (c8829k2 == null) {
                        c8829k2 = new C8829k(10);
                        c8829kArr[iM33920z] = c8829k2;
                    }
                    c8829k2.m33917w(iMo6715a);
                }
            }
        }
        for (int i12 = 0; i12 < iM33922F; i12++) {
            C8829k c8829k3 = c8829kArr[i12];
            if (c8829k3 != null) {
                c8829k3.m33915K();
                c8829k3.mo6829t();
            }
        }
        c8829k.m33915K();
        c8829k.mo6829t();
        int i13 = this.f19462b;
        if (c8829kArr[i13] == null) {
            c8829kArr[i13] = C8829k.f29361u;
        }
        this.f19463c = c8829kArr;
        this.f19464d = c8829k;
    }

    /* JADX INFO: renamed from: b */
    public C6251c m24804b() {
        return this.f19461a;
    }

    /* JADX INFO: renamed from: c */
    public int m24805c() {
        return this.f19462b;
    }

    /* JADX INFO: renamed from: d */
    public C8829k m24806d(int i10) {
        if (this.f19464d == null) {
            m24803a();
        }
        C8829k c8829k = this.f19463c[i10];
        if (c8829k != null) {
            return c8829k;
        }
        C6272w.m24807a("no such block: ", AbstractC8826h.m33898g(i10));
        return null;
    }
}
