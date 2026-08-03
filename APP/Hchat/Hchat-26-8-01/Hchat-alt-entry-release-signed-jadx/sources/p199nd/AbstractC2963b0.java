package p199nd;

import md.EnumC2824a;
import mh.InterfaceC2844b;
import p020b5.C0192k;
import p025bc.EnumC0251a;
import p110hc.InterfaceC1706c;
import p302ud.C4309e;
import p302ud.InterfaceC4315k;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;
import p351xe.C5787h;

/* JADX INFO: renamed from: nd.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2963b0 extends AbstractC2986r implements InterfaceC4315k, InterfaceC1706c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m6380I(String str) {
        C2983o.m6392b(this, EnumC0251a.f701l, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m6381J(String str) {
        C2983o.m6392b(this, EnumC0251a.f700k, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final void m6382K(String str) {
        InterfaceC2844b interfaceC2844b = C5787h.f23529c;
        C5787h c5787h = mo8668n().f14436b;
        synchronized (c5787h) {
            c5787h.f23531b.add(this);
            C5787h.f23529c.mo6268v(C5787h.m10469b(this, str));
        }
        C2983o.m6392b(this, EnumC0251a.f699j, str);
        m6231w(EnumC2824a.f9140Z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m6383L(String str) {
        C2983o.m6392b(this, EnumC0251a.f699j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final void m6384M(String str, Throwable th2) {
        C2983o.m6392b(this, EnumC0251a.f699j, AbstractC4855en.m9264h(str, mo8668n().f14435a.f720F, AbstractC5798s.m10513g(th2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final boolean m6385N(EnumC0251a enumC0251a) {
        return enumC0251a.ordinal() <= mo8668n().f14435a.f722H.ordinal();
    }

    /* JADX INFO: renamed from: O */
    public abstract C0192k mo6386O();

    /* JADX INFO: renamed from: P */
    public abstract C4309e mo6387P();

    /* JADX INFO: renamed from: Q */
    public abstract void mo6388Q(C0192k c0192k);
}
