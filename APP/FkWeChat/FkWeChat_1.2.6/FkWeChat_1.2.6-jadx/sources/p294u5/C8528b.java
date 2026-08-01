package p294u5;

import java.util.BitSet;
import p239q5.C6249b;
import p239q5.C6251c;
import p239q5.C6271v;
import p309v5.C8829k;

/* JADX INFO: renamed from: u5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8528b {

    /* JADX INFO: renamed from: a */
    public final C6271v f28435a;

    /* JADX INFO: renamed from: b */
    public final C6251c f28436b;

    /* JADX INFO: renamed from: c */
    public final C6251c f28437c;

    public C8528b(C6271v c6271v) {
        this.f28435a = c6271v;
        C6251c c6251cM24804b = c6271v.m24804b();
        this.f28436b = c6251cM24804b;
        this.f28437c = c6251cM24804b.m24676O();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m32820b(C6249b c6249b, C6249b c6249b2) {
        return c6249b.m24665d().m24702E(c6249b2.m24665d());
    }

    /* JADX INFO: renamed from: a */
    public final void m32821a(int i10, C8829k c8829k) {
        int size = c8829k.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iM33920z = c8829k.m33920z(i11);
            C8829k c8829kM24806d = this.f28435a.m24806d(this.f28436b.m24678Q(iM33920z).mo6715a());
            int size2 = c8829kM24806d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                m32823d(this.f28437c.m24678Q(c8829kM24806d.m33920z(i12)), iM33920z, i10);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public C6271v m32822c() {
        int size = this.f28436b.size();
        BitSet bitSet = new BitSet(this.f28436b.m33922F());
        for (int i10 = 0; i10 < size; i10++) {
            C6249b c6249bM24673L = this.f28436b.m24673L(i10);
            if (!bitSet.get(c6249bM24673L.mo6715a())) {
                C8829k c8829kM24806d = this.f28435a.m24806d(c6249bM24673L.mo6715a());
                int size2 = c8829kM24806d.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    int iM33920z = c8829kM24806d.m33920z(i11);
                    C6249b c6249bM24678Q = this.f28436b.m24678Q(iM33920z);
                    if (!bitSet.get(iM33920z) && c6249bM24678Q.m24669h().size() <= 1 && c6249bM24678Q.m24664c().m24695j().m24798d() != 55) {
                        C8829k c8829k = new C8829k();
                        for (int i12 = i11 + 1; i12 < size2; i12++) {
                            int iM33920z2 = c8829kM24806d.m33920z(i12);
                            C6249b c6249bM24678Q2 = this.f28436b.m24678Q(iM33920z2);
                            if (c6249bM24678Q2.m24669h().size() == 1 && m32820b(c6249bM24678Q, c6249bM24678Q2)) {
                                c8829k.m33917w(iM33920z2);
                                bitSet.set(iM33920z2);
                            }
                        }
                        m32821a(iM33920z, c8829k);
                    }
                }
            }
        }
        int i13 = size - 1;
        while (true) {
            C6251c c6251c = this.f28437c;
            if (i13 < 0) {
                c6251c.mo33890z();
                this.f28437c.mo6829t();
                return new C6271v(this.f28437c, this.f28435a.m24805c());
            }
            if (bitSet.get(c6251c.m24673L(i13).mo6715a())) {
                this.f28437c.m24680S(i13, null);
            }
            i13--;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m32823d(C6249b c6249b, int i10, int i11) {
        C8829k c8829kM33910F = c6249b.m24669h().m33910F();
        c8829kM33910F.m33913I(c8829kM33910F.m33908B(i10), i11);
        int iM24667f = c6249b.m24667f();
        if (iM24667f != i10) {
            i11 = iM24667f;
        }
        c8829kM33910F.mo6829t();
        C6249b c6249b2 = new C6249b(c6249b.mo6715a(), c6249b.m24665d(), c8829kM33910F, i11);
        C6251c c6251c = this.f28437c;
        c6251c.m24680S(c6251c.m33923G(c6249b.mo6715a()), c6249b2);
    }
}
