package p255r4;

import bsh.C0353j;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p311v4.C4451c0;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3694r0 extends AbstractC3706z implements Comparable {

    /* JADX INFO: renamed from: h */
    public final C4451c0 f12027h;

    /* JADX INFO: renamed from: i */
    public C3692q0 f12028i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3694r0(C4451c0 c4451c0) {
        if (c4451c0 == null) {
            C0353j.m1305c("value == null");
            throw null;
        }
        this.f12027h = c4451c0;
        this.f12028i = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        if (this.f12028i == null) {
            C3680k0 c3680k0 = c3689p.f12003e;
            C3692q0 c3692q0 = new C3692q0(this.f12027h);
            this.f12028i = c3692q0;
            c3680k0.m7678k(c3692q0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11881k;
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
        return this.f12027h.compareTo(((C3694r0) obj).f12027h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        String str;
        int iM7681f = this.f12028i.m7681f();
        if (c6090d.m10829d()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7710f());
            sb2.append(' ');
            String strMo4901a = this.f12027h.mo4901a();
            if (strMo4901a.length() <= 98) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                strMo4901a = strMo4901a.substring(0, 95);
                str = "...";
            }
            sb2.append("\"" + strMo4901a + str + '\"');
            c6090d.m10827b(0, sb2.toString());
            c6090d.m10827b(4, "  string_data_off: ".concat(AbstractC0000a.m48Y0(iM7681f)));
        }
        c6090d.m10835k(iM7681f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3694r0) {
            return this.f12027h.equals(((C3694r0) obj).f12027h);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12027h.f14760g.hashCode();
    }
}
