package p104h4;

import bsh.C0353j;
import p060e4.C0824a;
import p096g8.C1361b;
import p121i4.C1966g;
import p121i4.C1971l;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: h4.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1589c extends AbstractC1605s {

    /* JADX INFO: renamed from: b */
    public final int f5256b;

    /* JADX INFO: renamed from: c */
    public final int f5257c;

    /* JADX INFO: renamed from: d */
    public final C1971l f5258d;

    /* JADX INFO: renamed from: e */
    public final C1966g f5259e;

    /* JADX INFO: renamed from: f */
    public final C1607u f5260f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1589c(int i9, int i10, C1971l c1971l, C1966g c1966g, C1607u c1607u) {
        super("Code");
        if (i9 < 0) {
            C2104o.m5294t("maxStack < 0");
            throw null;
        }
        if (i10 < 0) {
            C2104o.m5294t("maxLocals < 0");
            throw null;
        }
        try {
            if (c1966g.f24613g) {
                throw new C0824a("catches.isMutable()", null);
            }
            try {
                if (c1607u.f24613g) {
                    throw new C0824a("attributes.isMutable()", null);
                }
                this.f5256b = i9;
                this.f5257c = i10;
                this.f5258d = c1971l;
                this.f5259e = c1966g;
                this.f5260f = c1607u;
            } catch (NullPointerException unused) {
                C0353j.m1305c("attributes == null");
                throw null;
            }
        } catch (NullPointerException unused2) {
            C0353j.m1305c("catches == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p104h4.AbstractC1605s
    /* JADX INFO: renamed from: a */
    public final int mo4124a() {
        int iMo4124a = 2;
        int iM6834g = AbstractC3199a.m6834g(this.f5259e.f24601h.length, 8, 2, ((C1361b) this.f5258d.f6685g).f4512c + 14);
        C1607u c1607u = this.f5260f;
        int length = c1607u.f24601h.length;
        for (int i9 = 0; i9 < length; i9++) {
            iMo4124a += ((AbstractC1605s) c1607u.m10840l(i9)).mo4124a();
        }
        return iM6834g + iMo4124a;
    }
}
