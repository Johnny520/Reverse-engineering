package ge;

import be.AbstractC0269a;
import java.util.Iterator;
import java.util.Map;
import ke.InterfaceC2395d;
import mh.InterfaceC2844b;
import nc.C2958a;
import nc.C2959b;
import p162l3.C2469w;
import p199nd.C2966d;
import p199nd.EnumC2964c;
import p214oc.C3126c;
import p215od.C3128a;
import p232pc.C3382d;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4316l;
import p302ud.InterfaceC4318n;
import p343x6.AbstractC5700d;
import p350xd.C5776c;
import p350xd.C5777d;
import ye.AbstractC6035f;

/* JADX INFO: renamed from: ge.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1401a extends AbstractC0269a implements InterfaceC2395d {

    /* JADX INFO: renamed from: g */
    public boolean f4657g;

    /* JADX INFO: renamed from: h */
    public C2469w f4658h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ke.InterfaceC2395d
    /* JADX INFO: renamed from: c */
    public final boolean mo193c(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        if (!this.f4657g && (interfaceC4318n instanceof C5777d)) {
            Iterator it = ((C5777d) interfaceC4318n).f23512l.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                for (Object obj : ((C5776c) it.next()).f23508a) {
                    if (obj instanceof C4311g) {
                        C4309e c4309eM8656a0 = ((C4311g) obj).f14389k.m8656a0();
                        InterfaceC2844b interfaceC2844b = AbstractC6035f.f24493a;
                        C4309e c4309e = c4309eM8656a0.f14384x;
                        if (c4309e != null && c4309e.f14373m.m6646k().equals("R") && !"android.R".equals(c4309eM8656a0.f14373m.m6642f())) {
                            this.f4657g = true;
                            this.f4658h.getClass();
                            break loop0;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        this.f4658h = c4325u.f14445k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        if (m3805i((C3382d) c4322r.f9217g.mo6237c(C3126c.f10128a))) {
            this.f4657g = true;
        } else {
            if (this.f4657g || !C2966d.m6389b(c4322r, EnumC2964c.f9716g)) {
                return;
            }
            AbstractC5700d.m10281i0(c4322r, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    public final boolean mo1054h(C4309e c4309e) {
        if (this.f4657g) {
            return false;
        }
        return !m3805i((C3382d) c4309e.f9217g.mo6237c(C3126c.f10128a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m3805i(C3382d c3382d) {
        C3128a c3128a;
        if (c3382d == null) {
            return false;
        }
        for (C2959b c2959b : c3382d.f10916g.values()) {
            if (c2959b.f9706a != 3) {
                Iterator it = c2959b.f9708c.entrySet().iterator();
                while (it.hasNext()) {
                    Object obj = ((C2958a) ((Map.Entry) it.next()).getValue()).f9705h;
                    if ((obj instanceof InterfaceC4316l) && (c3128a = ((InterfaceC4316l) obj).mo6656f().f10146g.f10142k) != null && c3128a.f10139h.equals("R") && !c3128a.f10141j.equals("android.R")) {
                        this.f4658h.getClass();
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
