package p295u4;

import bsh.C0353j;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p326w4.C4682b;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;

/* JADX INFO: renamed from: u4.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4268r {

    /* JADX INFO: renamed from: a */
    public final int f13971a;

    /* JADX INFO: renamed from: b */
    public final C4683c f13972b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4685e f13973c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4685e f13974d;

    /* JADX INFO: renamed from: e */
    public final int f13975e;

    /* JADX INFO: renamed from: f */
    public final boolean f13976f;

    /* JADX INFO: renamed from: g */
    public final String f13977g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4268r(int i9, C4683c c4683c, InterfaceC4685e interfaceC4685e, InterfaceC4685e interfaceC4685e2, int i10, boolean z9, String str) {
        if (c4683c == null) {
            C0353j.m1305c("result == null");
            throw null;
        }
        if (interfaceC4685e == null) {
            C0353j.m1305c("sources == null");
            throw null;
        }
        if (interfaceC4685e2 == null) {
            C0353j.m1305c("exceptions == null");
            throw null;
        }
        if (i10 < 1 || i10 > 6) {
            C2104o.m5294t(AbstractC0921a.m2249l(i10, "invalid branchingness: "));
            throw null;
        }
        if (interfaceC4685e2.size() != 0 && i10 != 6) {
            C2104o.m5294t("exceptions / branchingness mismatch");
            throw null;
        }
        this.f13971a = i9;
        this.f13972b = c4683c;
        this.f13973c = interfaceC4685e;
        this.f13974d = interfaceC4685e2;
        this.f13975e = i10;
        this.f13976f = z9;
        this.f13977g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m8575a() {
        return this.f13974d.size() != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4268r)) {
            return false;
        }
        C4268r c4268r = (C4268r) obj;
        return this.f13971a == c4268r.f13971a && this.f13975e == c4268r.f13975e && this.f13972b == c4268r.f13972b && this.f13973c.equals(c4268r.f13973c) && this.f13974d.equals(c4268r.f13974d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13974d.hashCode() + ((this.f13973c.hashCode() + AbstractC0921a.m2244g(((this.f13971a * 31) + this.f13975e) * 31, 31, this.f13972b.f15648g)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Rop{");
        sb2.append(AbstractC1089i.m2782o0(this.f13971a));
        C4683c c4683c = C4683c.f15644w;
        C4683c c4683c2 = this.f13972b;
        if (c4683c2 != c4683c) {
            sb2.append(" ");
            sb2.append(c4683c2);
        } else {
            sb2.append(" .");
        }
        sb2.append(" <-");
        InterfaceC4685e interfaceC4685e = this.f13973c;
        int size = interfaceC4685e.size();
        if (size == 0) {
            sb2.append(" .");
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                sb2.append(' ');
                sb2.append(interfaceC4685e.getType(i9));
            }
        }
        if (this.f13976f) {
            sb2.append(" call");
        }
        InterfaceC4685e interfaceC4685e2 = this.f13974d;
        int size2 = interfaceC4685e2.size();
        if (size2 != 0) {
            sb2.append(" throws");
            for (int i10 = 0; i10 < size2; i10++) {
                sb2.append(' ');
                if (interfaceC4685e2.getType(i10) == C4683c.f15616H) {
                    sb2.append("<any>");
                } else {
                    sb2.append(interfaceC4685e2.getType(i10));
                }
            }
        } else {
            int i11 = this.f13975e;
            if (i11 == 1) {
                sb2.append(" flows");
            } else if (i11 == 2) {
                sb2.append(" returns");
            } else if (i11 == 3) {
                sb2.append(" gotos");
            } else if (i11 == 4) {
                sb2.append(" ifs");
            } else if (i11 != 5) {
                sb2.append(" ".concat(AbstractC0000a.m44W0(i11)));
            } else {
                sb2.append(" switches");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C4268r(int i9, C4683c c4683c, InterfaceC4685e interfaceC4685e, int i10, String str) {
        this(i9, c4683c, interfaceC4685e, C4682b.f15591i, i10, false, str);
    }

    public C4268r(int i9, C4683c c4683c, InterfaceC4685e interfaceC4685e, String str) {
        this(i9, c4683c, interfaceC4685e, C4682b.f15591i, 1, false, str);
    }

    public C4268r(int i9, C4683c c4683c, InterfaceC4685e interfaceC4685e, InterfaceC4685e interfaceC4685e2, String str) {
        this(i9, c4683c, interfaceC4685e, interfaceC4685e2, 6, false, str);
    }

    public C4268r(int i9, C4682b c4682b, InterfaceC4685e interfaceC4685e) {
        this(i9, C4683c.f15644w, c4682b, interfaceC4685e, 6, true, null);
    }
}
