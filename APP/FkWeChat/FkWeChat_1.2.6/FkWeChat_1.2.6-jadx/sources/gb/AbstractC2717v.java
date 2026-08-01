package gb;

import p024b9.AbstractC1061t;
import p129ib.C3381l;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;
import sa.AbstractC7259i;

/* JADX INFO: renamed from: gb.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2717v implements InterfaceC2716u1 {

    /* JADX INFO: renamed from: a */
    public int f7112a;

    /* JADX INFO: renamed from: c */
    public final boolean m9641c(InterfaceC6004h interfaceC6004h, InterfaceC6004h interfaceC6004h2) {
        interfaceC6004h.getClass();
        interfaceC6004h2.getClass();
        if (!AbstractC1061t.m3842c(interfaceC6004h.getName(), interfaceC6004h2.getName())) {
            return false;
        }
        InterfaceC6019m interfaceC6019mMo7443b = interfaceC6004h.mo7443b();
        for (InterfaceC6019m interfaceC6019mMo7443b2 = interfaceC6004h2.mo7443b(); interfaceC6019mMo7443b != null && interfaceC6019mMo7443b2 != null; interfaceC6019mMo7443b2 = interfaceC6019mMo7443b2.mo7443b()) {
            if (interfaceC6019mMo7443b instanceof InterfaceC6005h0) {
                return interfaceC6019mMo7443b2 instanceof InterfaceC6005h0;
            }
            if (interfaceC6019mMo7443b2 instanceof InterfaceC6005h0) {
                return false;
            }
            if (interfaceC6019mMo7443b instanceof InterfaceC6023n0) {
                return (interfaceC6019mMo7443b2 instanceof InterfaceC6023n0) && AbstractC1061t.m3842c(((InterfaceC6023n0) interfaceC6019mMo7443b).mo24031d(), ((InterfaceC6023n0) interfaceC6019mMo7443b2).mo24031d());
            }
            if ((interfaceC6019mMo7443b2 instanceof InterfaceC6023n0) || !AbstractC1061t.m3842c(interfaceC6019mMo7443b.getName(), interfaceC6019mMo7443b2.getName())) {
                return false;
            }
            interfaceC6019mMo7443b = interfaceC6019mMo7443b.mo7443b();
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9642e(InterfaceC6004h interfaceC6004h) {
        return (C3381l.m12704m(interfaceC6004h) || AbstractC7259i.m28739E(interfaceC6004h)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC2716u1) || obj.hashCode() != hashCode()) {
            return false;
        }
        InterfaceC2716u1 interfaceC2716u1 = (InterfaceC2716u1) obj;
        if (interfaceC2716u1.mo5600d().size() != mo5600d().size()) {
            return false;
        }
        InterfaceC6004h interfaceC6004hMo5602u = mo5602u();
        InterfaceC6004h interfaceC6004hMo5602u2 = interfaceC2716u1.mo5602u();
        if (interfaceC6004hMo5602u2 != null && m9642e(interfaceC6004hMo5602u) && m9642e(interfaceC6004hMo5602u2)) {
            return mo9338f(interfaceC6004hMo5602u2);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo9338f(InterfaceC6004h interfaceC6004h);

    public int hashCode() {
        int i10 = this.f7112a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC6004h interfaceC6004hMo5602u = mo5602u();
        int iHashCode = m9642e(interfaceC6004hMo5602u) ? AbstractC7259i.m28760m(interfaceC6004hMo5602u).hashCode() : System.identityHashCode(this);
        this.f7112a = iHashCode;
        return iHashCode;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: u */
    public abstract InterfaceC6004h mo5602u();
}
