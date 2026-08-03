package p255r4;

import be.AbstractC0283h;
import bsh.C0353j;
import p000a.AbstractC0000a;
import p129ig.AbstractC2043a;
import p311v4.C4464m;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3693r extends AbstractC3695s implements Comparable {

    /* JADX INFO: renamed from: h */
    public final C4464m f12026h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3693r(C4464m c4464m, int i9) {
        super(i9);
        if (c4464m != null) {
            this.f12026h = c4464m;
        } else {
            C0353j.m1305c("field == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f12026h.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12026h.compareTo(((C3693r) obj).f12026h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3695s
    /* JADX INFO: renamed from: d */
    public final int mo7705d(C3689p c3689p, C6090d c6090d, int i9, int i10) {
        C3703w c3703w = c3689p.f12007i;
        C4464m c4464m = this.f12026h;
        int iM7707l = c3703w.m7707l(c4464m);
        int i11 = iM7707l - i9;
        boolean zM10829d = c6090d.m10829d();
        int i12 = this.f12029g;
        if (zM10829d) {
            c6090d.m10827b(0, String.format("  [%x] %s", Integer.valueOf(i10), c4464m.mo4901a()));
            c6090d.m10827b(AbstractC2043a.m5026c0(i11), "    field_idx:    ".concat(AbstractC0000a.m48Y0(iM7707l)));
            c6090d.m10827b(AbstractC2043a.m5026c0(i12), "    access_flags: " + AbstractC0283h.m1121A(i12, 20703, 2));
        }
        c6090d.m10838n(i11);
        c6090d.m10838n(i12);
        return iM7707l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C3693r) && this.f12026h.compareTo(((C3693r) obj).f12026h) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12026h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(C3693r.class.getName());
        sb2.append('{');
        sb2.append(AbstractC0000a.m46X0(this.f12029g));
        sb2.append(' ');
        sb2.append(this.f12026h);
        sb2.append('}');
        return sb2.toString();
    }
}
