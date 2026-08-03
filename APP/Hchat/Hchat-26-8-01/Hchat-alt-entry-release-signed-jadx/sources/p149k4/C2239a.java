package p149k4;

import bsh.C0353j;
import java.nio.ByteBuffer;
import p104h4.AbstractC1605s;
import p104h4.C1607u;
import p162l3.C2466t;
import p163l4.C2474c;
import p178m3.C2775a;

/* JADX INFO: renamed from: k4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2239a {

    /* JADX INFO: renamed from: a */
    public int f7409a;

    /* JADX INFO: renamed from: b */
    public int f7410b;

    /* JADX INFO: renamed from: c */
    public int f7411c;

    /* JADX INFO: renamed from: d */
    public final Object f7412d;

    /* JADX INFO: renamed from: e */
    public Object f7413e;

    /* JADX INFO: renamed from: f */
    public Object f7414f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2239a(C2240b c2240b, int i9, int i10, C2242d c2242d) {
        if (c2240b == null) {
            C0353j.m1305c("cf == null");
            throw null;
        }
        if (c2242d == null) {
            C0353j.m1305c("attributeFactory == null");
            throw null;
        }
        int iM3659g = c2240b.f7416b.m3659g(i10);
        this.f7412d = c2240b;
        this.f7409a = i9;
        this.f7410b = i10;
        this.f7413e = c2242d;
        this.f7414f = new C1607u(iM3659g);
        this.f7411c = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m5474a() {
        if (this.f7411c < 0) {
            C1607u c1607u = (C1607u) this.f7414f;
            int length = c1607u.f24601h.length;
            int iMo4124a = this.f7410b + 2;
            C2240b c2240b = (C2240b) this.f7412d;
            c2240b.getClass();
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    AbstractC1605s abstractC1605sM5490a = ((C2242d) this.f7413e).m5490a(c2240b, this.f7409a, iMo4124a);
                    iMo4124a += abstractC1605sM5490a.mo4124a();
                    c1607u.m10841m(i9, abstractC1605sM5490a);
                } catch (C2474c e6) {
                    e6.m2687a("...while parsing attributes[" + i9 + "]");
                    throw e6;
                } catch (RuntimeException e7) {
                    C2474c c2474c = new C2474c(null, e7);
                    c2474c.m2687a("...while parsing attributes[" + i9 + "]");
                    throw c2474c;
                }
            }
            this.f7411c = iMo4124a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m5475b() {
        this.f7409a = 1;
        this.f7413e = (C2466t) this.f7412d;
        this.f7411c = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean m5476c() {
        C2775a c2775aM5863b = ((C2466t) this.f7413e).f8093b.m5863b();
        int iM6155a = c2775aM5863b.m6155a(6);
        return !(iM6155a == 0 || ((ByteBuffer) c2775aM5863b.f9018j).get(iM6155a + c2775aM5863b.f9015g) == 0) || this.f7410b == 65039;
    }

    public C2239a(C2466t c2466t) {
        this.f7409a = 1;
        this.f7412d = c2466t;
        this.f7413e = c2466t;
    }
}
