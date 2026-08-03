package p255r4;

import be.AbstractC0283h;
import bsh.C0353j;
import p000a.AbstractC0000a;
import p121i4.C1957a;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p311v4.C4476y;
import p326w4.InterfaceC4685e;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3697t extends AbstractC3695s implements Comparable {

    /* JADX INFO: renamed from: h */
    public final C4476y f12030h;

    /* JADX INFO: renamed from: i */
    public final C3681l f12031i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3697t(C4476y c4476y, int i9, C1957a c1957a, InterfaceC4685e interfaceC4685e) {
        super(i9);
        if (c4476y == null) {
            C0353j.m1305c("method == null");
            throw null;
        }
        this.f12030h = c4476y;
        if (c1957a == null) {
            this.f12031i = null;
        } else {
            this.f12031i = new C3681l(c4476y, c1957a, (i9 & 8) != 0, interfaceC4685e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f12030h.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12030h.compareTo(((C3697t) obj).f12030h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3695s
    /* JADX INFO: renamed from: d */
    public final int mo7705d(C3689p c3689p, C6090d c6090d, int i9, int i10) {
        C3678j0 c3678j0 = c3689p.f12008j;
        C4476y c4476y = this.f12030h;
        int iM7671l = c3678j0.m7671l(c4476y);
        int i11 = iM7671l - i9;
        C3681l c3681l = this.f12031i;
        int iM7681f = c3681l == null ? 0 : c3681l.m7681f();
        boolean z9 = iM7681f != 0;
        int i12 = this.f12029g;
        if (z9 != ((i12 & 1280) == 0)) {
            C2104o.m5297w("code vs. access_flags mismatch");
            return 0;
        }
        if (c6090d.m10829d()) {
            c6090d.m10827b(0, String.format("  [%x] %s", Integer.valueOf(i10), c4476y.mo4901a()));
            c6090d.m10827b(AbstractC2043a.m5026c0(i11), "    method_idx:   ".concat(AbstractC0000a.m48Y0(iM7671l)));
            c6090d.m10827b(AbstractC2043a.m5026c0(i12), "    access_flags: " + AbstractC0283h.m1121A(i12, 204287, 3));
            c6090d.m10827b(AbstractC2043a.m5026c0(iM7681f), "    code_off:     ".concat(AbstractC0000a.m48Y0(iM7681f)));
        }
        c6090d.m10838n(i11);
        c6090d.m10838n(i12);
        c6090d.m10838n(iM7681f);
        return iM7671l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C3697t) && this.f12030h.compareTo(((C3697t) obj).f12030h) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(C3697t.class.getName());
        sb2.append('{');
        sb2.append(AbstractC0000a.m46X0(this.f12029g));
        sb2.append(' ');
        sb2.append(this.f12030h);
        C3681l c3681l = this.f12031i;
        if (c3681l != null) {
            sb2.append(' ');
            sb2.append(c3681l);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
