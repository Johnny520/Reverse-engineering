package p227p4;

import bsh.C0353j;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p295u4.C4266p;
import p295u4.C4270t;
import p311v4.AbstractC4446a;
import p311v4.C4451c0;

/* JADX INFO: renamed from: p4.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3302g extends AbstractC3307l {

    /* JADX INFO: renamed from: f */
    public final AbstractC4446a f10484f;

    /* JADX INFO: renamed from: g */
    public int f10485g;

    /* JADX INFO: renamed from: h */
    public int f10486h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3302g(C3305j c3305j, C4270t c4270t, C4266p c4266p, AbstractC4446a abstractC4446a) {
        super(c3305j, c4270t, c4266p);
        if (abstractC4446a == null) {
            C0353j.m1305c("constant == null");
            throw null;
        }
        this.f10484f = abstractC4446a;
        this.f10485g = -1;
        this.f10486h = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: a */
    public final String mo6968a() {
        return this.f10484f.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: c */
    public final String mo6983c() {
        if (this.f10485g < 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(this.f10484f.mo8898j());
        sb2.append('@');
        int i9 = this.f10485g;
        if (i9 < 65536) {
            sb2.append(AbstractC0000a.m46X0(i9));
        } else {
            sb2.append(AbstractC0000a.m48Y0(i9));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: d */
    public final String mo6984d() {
        AbstractC4446a abstractC4446a = this.f10484f;
        return abstractC4446a instanceof C4451c0 ? ((C4451c0) abstractC4446a).m8901l() : abstractC4446a.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: i */
    public final AbstractC3303h mo6975i(C3305j c3305j) {
        C3302g c3302g = new C3302g(c3305j, this.f10489c, this.f10490d, this.f10484f);
        int i9 = this.f10485g;
        if (i9 >= 0) {
            c3302g.m6987o(i9);
        }
        int i10 = this.f10486h;
        if (i10 >= 0) {
            c3302g.m6986n(i10);
        }
        return c3302g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: k */
    public final AbstractC3303h mo6971k(C4266p c4266p) {
        C3302g c3302g = new C3302g(this.f10488b, this.f10489c, c4266p, this.f10484f);
        int i9 = this.f10485g;
        if (i9 >= 0) {
            c3302g.m6987o(i9);
        }
        int i10 = this.f10486h;
        if (i10 >= 0) {
            c3302g.m6986n(i10);
        }
        return c3302g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m6985m() {
        int i9 = this.f10485g;
        if (i9 >= 0) {
            return i9;
        }
        C3193a.m6823l(this.f10484f, "index not yet set for ");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m6986n(int i9) {
        if (i9 < 0) {
            C2104o.m5294t("index < 0");
        } else if (this.f10486h < 0) {
            this.f10486h = i9;
        } else {
            C2104o.m5276A("class index already set");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m6987o(int i9) {
        if (i9 < 0) {
            C2104o.m5294t("index < 0");
        } else if (this.f10485g < 0) {
            this.f10485g = i9;
        } else {
            C2104o.m5276A("index already set");
        }
    }
}
