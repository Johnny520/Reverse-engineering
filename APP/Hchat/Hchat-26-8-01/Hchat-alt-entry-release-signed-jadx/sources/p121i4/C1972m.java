package p121i4;

import p104h4.AbstractC1605s;
import p104h4.C1589c;
import p104h4.C1595i;
import p104h4.C1603q;
import p104h4.C1607u;
import p149k4.C2240b;
import p163l4.InterfaceC2473b;
import p295u4.C4270t;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4477z;
import p326w4.C4681a;

/* JADX INFO: renamed from: i4.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1972m implements InterfaceC2473b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2473b f6687a;

    /* JADX INFO: renamed from: b */
    public final C2240b f6688b;

    /* JADX INFO: renamed from: c */
    public final C1589c f6689c;

    /* JADX INFO: renamed from: d */
    public final C1975p f6690d;

    /* JADX INFO: renamed from: e */
    public final C1977r f6691e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1972m(InterfaceC2473b interfaceC2473b, C2240b c2240b) {
        AbstractC1605s abstractC1605s;
        this.f6687a = interfaceC2473b;
        this.f6688b = c2240b;
        C1589c c1589c = (C1589c) interfaceC2473b.getAttributes().m4125o("Code");
        this.f6689c = c1589c;
        C1607u c1607u = c1589c.f5260f;
        C1975p c1975p = C1975p.f6698i;
        C1595i c1595i = (C1595i) c1607u.m4125o("LineNumberTable");
        while (c1595i != null) {
            C1975p c1975p2 = c1595i.f5267b;
            if (c1975p == C1975p.f6698i) {
                c1975p = c1975p2;
            } else {
                int length = c1975p.f24601h.length;
                int length2 = c1975p2.f24601h.length;
                C1975p c1975p3 = new C1975p(length + length2);
                for (int i9 = 0; i9 < length; i9++) {
                    c1975p3.m10841m(i9, (C1974o) c1975p.m10840l(i9));
                }
                for (int i10 = 0; i10 < length2; i10++) {
                    c1975p3.m10841m(length + i10, (C1974o) c1975p2.m10840l(i10));
                }
                c1975p = c1975p3;
            }
            int length3 = c1607u.f24601h.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length3) {
                    break;
                }
                if (((AbstractC1605s) c1607u.m10840l(i11)) == c1595i) {
                    String str = c1595i.f5275a;
                    do {
                        i11++;
                        if (i11 < length3) {
                            abstractC1605s = (AbstractC1605s) c1607u.m10840l(i11);
                        }
                    } while (!abstractC1605s.f5275a.equals(str));
                } else {
                    i11++;
                }
            }
            abstractC1605s = null;
            c1595i = (C1595i) abstractC1605s;
        }
        this.f6690d = c1975p;
        this.f6691e = C1977r.f6705i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2473b
    /* JADX INFO: renamed from: a */
    public final C4681a mo4875a() {
        return this.f6687a.mo4875a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    /* JADX INFO: renamed from: b */
    public final C4453d0 mo4876b() {
        return this.f6687a.mo4876b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    /* JADX INFO: renamed from: c */
    public final int mo4877c() {
        return this.f6687a.mo4877c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    /* JADX INFO: renamed from: d */
    public final C4477z mo4878d() {
        return this.f6687a.mo4878d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    /* JADX INFO: renamed from: e */
    public final C4451c0 mo4879e() {
        return this.f6687a.mo4879e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C4270t m4880f(int i9) {
        C2240b c2240b = this.f6688b;
        c2240b.m5479c();
        AbstractC1605s abstractC1605sM4125o = c2240b.f7425k.m4125o("SourceFile");
        C4451c0 c4451c0 = abstractC1605sM4125o instanceof C1603q ? ((C1603q) abstractC1605sM4125o).f5271b : null;
        C1975p c1975p = this.f6690d;
        int length = c1975p.f24601h.length;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            C1974o c1974o = (C1974o) c1975p.m10840l(i12);
            int i13 = c1974o.f6696a;
            if (i13 <= i9 && i13 > i10) {
                i11 = c1974o.f6697b;
                if (i13 == i9) {
                    break;
                }
                i10 = i13;
            }
        }
        return new C4270t(c4451c0, i9, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    public final C1607u getAttributes() {
        return this.f6687a.getAttributes();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    public final C4451c0 getName() {
        return this.f6687a.getName();
    }
}
