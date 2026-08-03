package p227p4;

import bsh.C0353j;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p136j8.C2113x;
import p270s4.AbstractC3928a;

/* JADX INFO: renamed from: p4.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3305j {

    /* JADX INFO: renamed from: a */
    public final int f10492a;

    /* JADX INFO: renamed from: b */
    public final int f10493b;

    /* JADX INFO: renamed from: c */
    public final int f10494c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1089i f10495d;

    /* JADX INFO: renamed from: e */
    public final boolean f10496e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3305j(int i9, int i10, int i11, AbstractC1089i abstractC1089i, boolean z9) {
        if (!AbstractC0018a.m215A(i9)) {
            C2104o.m5294t("bogus opcode");
            throw null;
        }
        if (!AbstractC0018a.m215A(i10)) {
            C2104o.m5294t("bogus family");
            throw null;
        }
        if (!AbstractC0018a.m215A(i11)) {
            C2104o.m5294t("bogus nextOpcode");
            throw null;
        }
        if (abstractC1089i == null) {
            C0353j.m1305c("format == null");
            throw null;
        }
        this.f10492a = i9;
        this.f10493b = i10;
        this.f10494c = i11;
        this.f10495d = abstractC1089i;
        this.f10496e = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m6993a() {
        int i9 = this.f10492a;
        try {
            C2113x c2113x = AbstractC3928a.f12906a[i9 + 1];
            if (c2113x != null) {
                return c2113x.f7059b;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException("bogus opcode: ".concat(i9 == ((char) i9) ? AbstractC0000a.m46X0(i9) : AbstractC0000a.m48Y0(i9)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m6993a();
    }
}
