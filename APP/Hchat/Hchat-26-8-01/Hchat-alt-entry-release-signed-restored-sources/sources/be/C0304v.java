package be;

import java.util.Iterator;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p199nd.C2980l;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4320p;
import p302ud.C4322r;
import td.C4145a;

/* JADX INFO: renamed from: be.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0304v extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2844b f874g = AbstractC2846d.m6274b(C0304v.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        AbstractC3506j abstractC3506j;
        C4309e c4309eM8715f;
        if (c4322r.f14415p) {
            return;
        }
        Iterator it = c4322r.f14425z.iterator();
        while (it.hasNext()) {
            for (C4320p c4320p : ((C4305a) it.next()).f14351l) {
                if (c4320p.f14396k == EnumC3400k.f10967S) {
                    C4145a c4145a = (C4145a) c4320p;
                    try {
                        C3514r c3514r = c4145a.f14397l;
                        if (c3514r != null && (abstractC3506j = c3514r.f11440m.m7398b().f11412b) != null && abstractC3506j.mo7346j() != null && ((c4309eM8715f = c4322r.f14411l.f14371k.m8715f(c4145a.f13662o.f10153j)) == null || !c4309eM8715f.f14378r.isEmpty())) {
                            c4145a.m6233y(new C2980l(abstractC3506j.mo7346j()));
                        }
                    } catch (Exception e6) {
                        f874g.mo6251e("Failed to attach constructor generic info", e6);
                    }
                }
            }
        }
    }
}
