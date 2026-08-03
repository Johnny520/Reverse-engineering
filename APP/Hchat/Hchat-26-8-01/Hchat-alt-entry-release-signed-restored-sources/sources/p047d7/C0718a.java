package p047d7;

import java.util.Comparator;
import p152k7.AbstractC2331a;
import p257r7.AbstractC3712b;
import p257r7.C3716f;
import p257r7.C3718h;

/* JADX INFO: renamed from: d7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0718a extends AbstractC0729l implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0729l, p209o7.AbstractC3071e, p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public final void mo1891N() {
        C0731n c0731n = (C0731n) this.f2171o.f9940k;
        c0731n.getClass();
        c0731n.m7715M(24, false);
        c0731n.m1929P(C0731n.f2174m, 0, 8, 16);
        super.mo1891N();
        AbstractC3712b abstractC3712b = this.f2169m;
        long j3 = abstractC3712b instanceof C3718h ? ((C3718h) abstractC3712b).f12085n : ((C3716f) abstractC3712b).f12083n;
        if (c0731n.mo5551p() < 24) {
            c0731n.m7715M(24, false);
        }
        byte[] bArr = c0731n.f12076k;
        if (8 > bArr.length) {
            return;
        }
        for (int i9 = 0; i9 < 8; i9++) {
            bArr[i9] = (byte) (255 & j3);
            j3 >>>= 8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((C0733p) obj).m1925S().f2184i, ((C0733p) obj2).m1925S().f2184i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public final AbstractC2331a mo1892n() {
        return new C0733p();
    }
}
