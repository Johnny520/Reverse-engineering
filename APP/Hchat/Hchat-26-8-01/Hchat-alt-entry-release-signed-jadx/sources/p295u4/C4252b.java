package p295u4;

import bsh.C0353j;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p104h4.C1607u;
import p136j8.C2104o;
import p376z4.C6093g;
import p376z4.InterfaceC6094h;

/* JADX INFO: renamed from: u4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4252b implements InterfaceC6094h {

    /* JADX INFO: renamed from: a */
    public final int f13930a;

    /* JADX INFO: renamed from: b */
    public final C1607u f13931b;

    /* JADX INFO: renamed from: c */
    public final C6093g f13932c;

    /* JADX INFO: renamed from: d */
    public final int f13933d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4252b(int i9, C1607u c1607u, C6093g c6093g, int i10) {
        if (i9 < 0) {
            C2104o.m5294t("label < 0");
            throw null;
        }
        try {
            c1607u.m10856k();
            int length = c1607u.f24601h.length;
            if (length == 0) {
                C2104o.m5294t("insns.size() == 0");
                throw null;
            }
            int i11 = length - 2;
            while (true) {
                if (i11 < 0) {
                    if (((AbstractC4259i) c1607u.m10840l(length - 1)).f13947g.f13975e == 1) {
                        C2104o.m5294t("insns does not end with a branch or throwing instruction");
                        throw null;
                    }
                    try {
                        c6093g.m10856k();
                        if (i10 < -1) {
                            C2104o.m5294t("primarySuccessor < -1");
                            throw null;
                        }
                        if (i10 >= 0) {
                            int iM10845m = c6093g.m10845m(i10);
                            if (!((iM10845m >= 0 ? iM10845m : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i10 + " not in successors " + c6093g);
                            }
                        }
                        this.f13930a = i9;
                        this.f13931b = c1607u;
                        this.f13932c = c6093g;
                        this.f13933d = i10;
                        return;
                    } catch (NullPointerException unused) {
                        C0353j.m1305c("successors == null");
                        throw null;
                    }
                }
                if (((AbstractC4259i) c1607u.m10840l(i11)).f13947g.f13975e != 1) {
                    C2104o.m5294t(AbstractC0921a.m2250m(i11, "insns[", "] is a branch or can throw"));
                    throw null;
                }
                i11--;
            }
        } catch (NullPointerException unused2) {
            C0353j.m1305c("insns == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6094h
    /* JADX INFO: renamed from: a */
    public final int mo4866a() {
        return this.f13930a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "{" + AbstractC0000a.m46X0(this.f13930a) + '}';
    }
}
