package p255r4;

import bsh.C0353j;
import java.util.TreeMap;
import p000a.AbstractC0000a;
import p311v4.C4459h;
import p311v4.C4460i;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3669f extends AbstractC3706z implements Comparable {

    /* JADX INFO: renamed from: h */
    public final C4460i f11921h;

    /* JADX INFO: renamed from: i */
    public C3673h f11922i = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3669f(C4460i c4460i) {
        this.f11921h = c4460i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C4459h c4459h = this.f11921h.f14792g.f14814k;
        C3671g c3671g = c3689p.f12011m;
        if (c4459h == null) {
            c3671g.getClass();
            C0353j.m1305c("callSite == null");
            return;
        }
        C3673h c3673h = (C3673h) ((TreeMap) c3671g.f11927h).get(c4459h);
        if (c3673h == null) {
            C3680k0 c3680k0 = c3689p.f12013o;
            c3673h = new C3673h(c4459h);
            c3680k0.m7678k(c3673h);
            ((TreeMap) c3671g.f11927h).put(c4459h, c3673h);
        }
        this.f11922i = c3673h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11887q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: c */
    public final int mo7644c() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11921h.compareTo(((C3669f) obj).f11921h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        int iM7681f = this.f11922i.m7681f();
        if (c6090d.m10829d()) {
            c6090d.m10827b(0, m7710f() + ' ' + this.f11921h.toString());
            c6090d.m10827b(4, "call_site_off: ".concat(AbstractC0000a.m48Y0(iM7681f)));
        }
        c6090d.m10835k(iM7681f);
    }
}
