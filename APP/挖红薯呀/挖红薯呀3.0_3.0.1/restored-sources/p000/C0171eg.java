package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: eg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0171eg implements InterfaceC0618pk, Serializable {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0618pk f1443d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0515nk f1444e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0171eg(InterfaceC0515nk interfaceC0515nk, InterfaceC0618pk interfaceC0618pk) {
        interfaceC0618pk.getClass();
        interfaceC0515nk.getClass();
        this.f1443d = interfaceC0618pk;
        this.f1444e = interfaceC0515nk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        boolean zM3002l;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0171eg) {
            C0171eg c0171eg = (C0171eg) obj;
            int i = 2;
            C0171eg c0171eg2 = c0171eg;
            int i2 = 2;
            while (true) {
                InterfaceC0618pk interfaceC0618pk = c0171eg2.f1443d;
                c0171eg2 = interfaceC0618pk instanceof C0171eg ? (C0171eg) interfaceC0618pk : null;
                if (c0171eg2 == null) {
                    break;
                }
                i2++;
            }
            C0171eg c0171eg3 = this;
            while (true) {
                InterfaceC0618pk interfaceC0618pk2 = c0171eg3.f1443d;
                c0171eg3 = interfaceC0618pk2 instanceof C0171eg ? (C0171eg) interfaceC0618pk2 : null;
                if (c0171eg3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    InterfaceC0515nk interfaceC0515nk = this.f1444e;
                    if (!p30.m3002l(c0171eg.mo64l(interfaceC0515nk.getKey()), interfaceC0515nk)) {
                        zM3002l = false;
                        break;
                    }
                    InterfaceC0618pk interfaceC0618pk3 = this.f1443d;
                    if (!(interfaceC0618pk3 instanceof C0171eg)) {
                        interfaceC0618pk3.getClass();
                        InterfaceC0515nk interfaceC0515nk2 = (InterfaceC0515nk) interfaceC0618pk3;
                        zM3002l = p30.m3002l(c0171eg.mo64l(interfaceC0515nk2.getKey()), interfaceC0515nk2);
                        break;
                    }
                    this = (C0171eg) interfaceC0618pk3;
                }
                if (zM3002l) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: h */
    public final InterfaceC0618pk mo63h(InterfaceC0618pk interfaceC0618pk) {
        interfaceC0618pk.getClass();
        return interfaceC0618pk == C0220fs.f1799d ? this : (InterfaceC0618pk) interfaceC0618pk.mo65p(new C0717s8(9), this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1444e.hashCode() + this.f1443d.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: l */
    public final InterfaceC0515nk mo64l(InterfaceC0554ok interfaceC0554ok) {
        interfaceC0554ok.getClass();
        while (true) {
            InterfaceC0515nk interfaceC0515nkMo64l = this.f1444e.mo64l(interfaceC0554ok);
            if (interfaceC0515nkMo64l != null) {
                return interfaceC0515nkMo64l;
            }
            InterfaceC0618pk interfaceC0618pk = this.f1443d;
            if (!(interfaceC0618pk instanceof C0171eg)) {
                return interfaceC0618pk.mo64l(interfaceC0554ok);
            }
            this = (C0171eg) interfaceC0618pk;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: p */
    public final Object mo65p(InterfaceC0904ww interfaceC0904ww, Object obj) {
        return interfaceC0904ww.invoke(this.f1443d.mo65p(interfaceC0904ww, obj), this.f1444e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: t */
    public final InterfaceC0618pk mo66t(InterfaceC0554ok interfaceC0554ok) {
        interfaceC0554ok.getClass();
        InterfaceC0515nk interfaceC0515nk = this.f1444e;
        InterfaceC0515nk interfaceC0515nkMo64l = interfaceC0515nk.mo64l(interfaceC0554ok);
        InterfaceC0618pk interfaceC0618pk = this.f1443d;
        if (interfaceC0515nkMo64l != null) {
            return interfaceC0618pk;
        }
        InterfaceC0618pk interfaceC0618pkMo66t = interfaceC0618pk.mo66t(interfaceC0554ok);
        return interfaceC0618pkMo66t == interfaceC0618pk ? this : interfaceC0618pkMo66t == C0220fs.f1799d ? interfaceC0515nk : new C0171eg(interfaceC0515nk, interfaceC0618pkMo66t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "[" + ((String) mo65p(new C0717s8(1), "")) + ']';
    }
}
