package p029F0;

import java.util.List;
import java.util.Map;
import p023E0.AbstractC0277a;
import p041H0.C0564I;
import p041H0.C0580Z;
import p061L2.C0981u;
import p105V.C1480b;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p153e1.EnumC2017m;
import p186k.C2408E;

/* JADX INFO: renamed from: F0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0364B implements InterfaceC0415n0, InterfaceC0379Q {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0367E f1137d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0373K f1138e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0364B(C0373K c0373k) {
        this.f1138e = c0373k;
        this.f1137d = c0373k.f1178k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: C */
    public final long mo266C(float f2) {
        return this.f1137d.mo266C(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: E */
    public final long mo267E(long j5) {
        return this.f1137d.mo267E(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: G */
    public final float mo268G(float f2) {
        return this.f1137d.mo272b() * f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0415n0
    /* JADX INFO: renamed from: J */
    public final List mo603J(InterfaceC1603e interfaceC1603e, Object obj) {
        C0373K c0373k = this.f1138e;
        C2408E c2408e = c0373k.f1180m;
        C2408E c2408e2 = c0373k.f1182o;
        C0564I c0564i = c0373k.f1171d;
        C2408E c2408e3 = c0373k.f1177j;
        C0564I c0564i2 = (C0564I) c2408e3.m4272g(obj);
        if (c0564i2 != null && ((C1483e) ((C1480b) c0564i.m833o()).f5173e).m2760i(c0564i2) < c0373k.f1174g) {
            return c0564i2.m831m();
        }
        C1483e c1483e = c0373k.f1183p;
        if (c1483e.f5183f < c0373k.f1175h) {
            AbstractC0277a.m482a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C0564I c0564i3 = (C0564I) c2408e3.m4272g(obj);
        int i5 = c1483e.f5183f;
        int i6 = c0373k.f1175h;
        if (i5 == i6) {
            c1483e.m2753b(obj);
        } else {
            Object[] objArr = c1483e.f5181d;
            Object obj2 = objArr[i6];
            objArr[i6] = obj;
        }
        c0373k.f1175h++;
        boolean zM4267b = c2408e.m4267b(obj);
        if (zM4267b || c0564i3 != null) {
            if (!zM4267b && c0564i3 != null) {
                c0373k.m624i(((C1483e) ((C1480b) c0564i.m833o()).f5173e).m2760i(c0564i3), ((C1483e) ((C1480b) c0564i.m833o()).f5173e).f5183f);
                c0373k.f1185r++;
                c2408e3.m4276k(obj);
                c2408e.m4278m(obj, c0564i3);
                c2408e2.m4278m(obj, c0373k.m620e(obj));
                if (c0564i.m799G()) {
                    c0373k.m622g();
                }
            }
            C0564I c0564i4 = (C0564I) c2408e.m4272g(obj);
            C0365C c0365c = c0564i4 != null ? (C0365C) c0373k.f1176i.m4272g(c0564i4) : null;
            if (c0365c != null && c0365c.f1142d) {
                c0373k.m626k(c0564i4, obj, false, interfaceC1603e);
            }
            if ((c0365c != null ? c0365c.f1144f : null) != null) {
                c0373k.m617a(c0365c, true);
            }
        } else {
            if (c0564i.m799G()) {
                c0373k.m622g();
                if (!c2408e3.m4268c(obj)) {
                    c2408e2.m4276k(obj);
                    Object objM4272g = c2408e.m4272g(obj);
                    if (objM4272g == null) {
                        objM4272g = c0373k.m627l(obj);
                        if (objM4272g != null) {
                            c0373k.m624i(((C1483e) ((C1480b) c0564i.m833o()).f5173e).m2760i(objM4272g), ((C1483e) ((C1480b) c0564i.m833o()).f5173e).f5183f);
                            c0373k.f1185r++;
                        } else {
                            int i7 = ((C1483e) ((C1480b) c0564i.m833o()).f5173e).f5183f;
                            C0564I c0564i5 = new C0564I(2);
                            c0564i.f1728u = true;
                            c0564i.m793A(i7, c0564i5);
                            c0564i.f1728u = false;
                            c0373k.f1185r++;
                            objM4272g = c0564i5;
                        }
                        c2408e.m4278m(obj, objM4272g);
                    }
                    c0373k.m626k((C0564I) objM4272g, obj, false, interfaceC1603e);
                }
            }
            c2408e2.m4278m(obj, c0373k.m620e(obj));
        }
        C0564I c0564i6 = (C0564I) c2408e.m4272g(obj);
        if (c0564i6 == null) {
            return C0981u.f3047d;
        }
        List listM931m0 = c0564i6.f1700K.f1760p.m931m0();
        C1480b c1480b = (C1480b) listM931m0;
        int i8 = ((C1483e) c1480b.f5173e).f5183f;
        for (int i9 = 0; i9 < i8; i9++) {
            ((C0580Z) c1480b.get(i9)).f1846i.f1746b = true;
        }
        return listM931m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: M */
    public final float mo269M(long j5) {
        return this.f1137d.mo269M(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: S */
    public final int mo270S(float f2) {
        return this.f1137d.mo270S(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f1137d.f1155e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: c0 */
    public final long mo273c0(long j5) {
        return this.f1137d.mo273c0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: e0 */
    public final float mo276e0(long j5) {
        return this.f1137d.mo276e0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0379Q
    /* JADX INFO: renamed from: f0 */
    public final InterfaceC0378P mo604f0(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c) {
        return this.f1137d.mo605r(i5, i6, map, null, interfaceC1601c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0420q
    public final EnumC2017m getLayoutDirection() {
        return this.f1137d.f1154d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: k0 */
    public final long mo280k0(float f2) {
        return this.f1137d.mo280k0(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f1137d.f1156f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: q0 */
    public final float mo283q0(int i5) {
        return this.f1137d.mo283q0(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0379Q
    /* JADX INFO: renamed from: r */
    public final InterfaceC0378P mo605r(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        return this.f1137d.mo605r(i5, i6, map, interfaceC1601c, interfaceC1601c2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: u0 */
    public final float mo284u0(float f2) {
        return f2 / this.f1137d.mo272b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0420q
    /* JADX INFO: renamed from: z */
    public final boolean mo606z() {
        return this.f1137d.mo606z();
    }
}
