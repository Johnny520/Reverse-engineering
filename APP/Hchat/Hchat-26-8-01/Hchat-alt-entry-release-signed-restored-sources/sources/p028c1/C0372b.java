package p028c1;

import gg.AbstractC1416l;
import gg.AbstractC1417m;
import gg.C1425u;
import p041d1.C0653b0;
import p057e1.C0808c;
import p071f1.C1020o0;
import p072f2.C1047j;
import p072f2.C1050m;
import p072f2.C1054q;
import p072f2.C1055r;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p103h3.C1578g;
import p131j0.C2046b;
import p267s1.C3889d;
import p276sf.C3967n;
import p308v1.AbstractC4441z0;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p339x1.InterfaceC5665z1;
import p340x2.C5684s;
import p356y0.AbstractC5852n;
import p357y1.AbstractC5858a;
import p357y1.C5877e2;
import p357y1.ViewOnAttachStateChangeListenerC5893i2;
import p357y1.ViewOnAttachStateChangeListenerC5958z;

/* JADX INFO: renamed from: c1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0372b extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1045g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1046h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1047i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0372b(Object obj, int i9, Object obj2) {
        super(0);
        this.f1045g = i9;
        this.f1046h = obj;
        this.f1047i = obj2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: y1.t.g(android.view.MotionEvent, y1.t):boolean */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:136:0x01df */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:138:0x017b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:140:0x017b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:143:0x01d9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:97:0x01d0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        C1054q c1054q;
        C5602f0 c5602f0;
        switch (this.f1045g) {
            case 0:
                ((C0373c) this.f1046h).f1050w.invoke((C0374d) this.f1047i);
                break;
            case 1:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1046h;
                if (interfaceC1220a == null || (r0 = (C0808c) interfaceC1220a.invoke()) == null) {
                    AbstractC5614i1 abstractC5614i1 = (AbstractC5614i1) this.f1047i;
                    if (!abstractC5614i1.mo10106r1().f23801t) {
                        abstractC5614i1 = null;
                    }
                    if (abstractC5614i1 != null) {
                    }
                }
                break;
            case 2:
                ((C1425u) this.f1046h).f4738g = ((C0653b0) this.f1047i).m1799m1();
                break;
            case 3:
                ((C3889d) this.f1046h).m8078d((AbstractC5852n) this.f1047i);
                break;
            case 4:
                C5587b1 c5587b1 = ((C5602f0) this.f1046h).f22778L;
                C1425u c1425u = (C1425u) this.f1047i;
                if ((c5587b1.f22719f.f23791j & 8) != 0) {
                    for (AbstractC5852n abstractC5852n = c5587b1.f22718e; abstractC5852n != null; abstractC5852n = abstractC5852n.f23792k) {
                        if ((abstractC5852n.f23790i & 8) != 0) {
                            ?? M10149e = abstractC5852n;
                            ?? c2046b = 0;
                            while (M10149e != 0) {
                                if (M10149e instanceof InterfaceC5665z1) {
                                    InterfaceC5665z1 interfaceC5665z1 = (InterfaceC5665z1) M10149e;
                                    if (interfaceC5665z1.mo2643c0()) {
                                        C1050m c1050m = new C1050m();
                                        c1425u.f4738g = c1050m;
                                        c1050m.f3344j = true;
                                    }
                                    if (interfaceC5665z1.mo1609S0()) {
                                        ((C1050m) c1425u.f4738g).f3343i = true;
                                    }
                                    interfaceC5665z1.mo1610X0((InterfaceC1062y) c1425u.f4738g);
                                } else if ((M10149e.f23790i & 8) != 0 && (M10149e instanceof AbstractC5615j)) {
                                    AbstractC5852n abstractC5852n2 = ((AbstractC5615j) M10149e).f22875v;
                                    int i9 = 0;
                                    M10149e = M10149e;
                                    c2046b = c2046b;
                                    while (abstractC5852n2 != null) {
                                        if ((abstractC5852n2.f23790i & 8) != 0) {
                                            i9++;
                                            c2046b = c2046b;
                                            if (i9 == 1) {
                                                M10149e = abstractC5852n2;
                                            } else {
                                                if (c2046b == 0) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (M10149e != 0) {
                                                    c2046b.m5056b(M10149e);
                                                    M10149e = 0;
                                                }
                                                c2046b.m5056b(abstractC5852n2);
                                            }
                                        }
                                        abstractC5852n2 = abstractC5852n2.f23793l;
                                        M10149e = M10149e;
                                        c2046b = c2046b;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                M10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                    }
                }
                break;
            case 5:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1046h;
                C1020o0 c1020o0 = AbstractC5614i1.f22844T;
                interfaceC1231l.invoke(c1020o0);
                AbstractC5614i1 abstractC5614i12 = (AbstractC5614i1) this.f1047i;
                boolean zM3825a = AbstractC1416l.m3825a(abstractC5614i12.f22858J, c1020o0.f3219s);
                boolean z9 = abstractC5614i12.f22859K;
                boolean z10 = c1020o0.f3220t;
                boolean z11 = z9 != z10;
                if (!zM3825a || z11) {
                    abstractC5614i12.f22858J = c1020o0.f3219s;
                    abstractC5614i12.f22859K = z10;
                    if (abstractC5614i12.f22860L && (z11 || (z10 && !zM3825a))) {
                        abstractC5614i12.f22868u.m10008E();
                    }
                }
                abstractC5614i12.f22860L = true;
                c1020o0.f3206A = c1020o0.f3219s.mo2612a(c1020o0.f3222v, c1020o0.f3224x, c1020o0.f3223w);
                break;
            case 6:
                ((C1425u) this.f1046h).f4738g = AbstractC5618k.m10152h((C5684s) this.f1047i, AbstractC4441z0.f14750a);
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = (ViewOnAttachStateChangeListenerC5958z) this.f1047i;
                C5877e2 c5877e2 = (C5877e2) this.f1046h;
                C1047j c1047j = c5877e2.f23854k;
                C1047j c1047j2 = c5877e2.f23855l;
                Float f3 = c5877e2.f23852i;
                Float f10 = c5877e2.f23853j;
                float fFloatValue = (c1047j == null || f3 == null) ? 0.0f : ((Number) c1047j.f3288a.invoke()).floatValue() - f3.floatValue();
                float fFloatValue2 = (c1047j2 == null || f10 == null) ? 0.0f : ((Number) c1047j2.f3288a.invoke()).floatValue() - f10.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iM10703t = viewOnAttachStateChangeListenerC5958z.m10703t(c5877e2.f23850g);
                    C1055r c1055r = (C1055r) viewOnAttachStateChangeListenerC5958z.m10699l().m2313b(viewOnAttachStateChangeListenerC5958z.f24222q);
                    if (c1055r != null) {
                        try {
                            C1578g c1578g = viewOnAttachStateChangeListenerC5958z.f24224s;
                            if (c1578g != null) {
                                c1578g.f5248a.setBoundsInScreen(viewOnAttachStateChangeListenerC5958z.m10691d(c1055r));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    C1055r c1055r2 = (C1055r) viewOnAttachStateChangeListenerC5958z.m10699l().m2313b(viewOnAttachStateChangeListenerC5958z.f24223r);
                    if (c1055r2 != null) {
                        try {
                            C1578g c1578g2 = viewOnAttachStateChangeListenerC5958z.f24225t;
                            if (c1578g2 != null) {
                                c1578g2.f5248a.setBoundsInScreen(viewOnAttachStateChangeListenerC5958z.m10691d(c1055r2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    viewOnAttachStateChangeListenerC5958z.f24215j.invalidate();
                    C1055r c1055r3 = (C1055r) viewOnAttachStateChangeListenerC5958z.m10699l().m2313b(iM10703t);
                    if (c1055r3 != null && (c1054q = c1055r3.f3353a) != null && (c5602f0 = c1054q.f3349c) != null) {
                        if (c1047j != null) {
                            viewOnAttachStateChangeListenerC5958z.f24227v.m2379h(iM10703t, c1047j);
                        }
                        if (c1047j2 != null) {
                            viewOnAttachStateChangeListenerC5958z.f24228w.m2379h(iM10703t, c1047j2);
                        }
                        viewOnAttachStateChangeListenerC5958z.m10702p(c5602f0);
                    }
                }
                if (c1047j != null) {
                    c5877e2.f23852i = (Float) c1047j.f3288a.invoke();
                }
                if (c1047j2 != null) {
                    c5877e2.f23853j = (Float) c1047j2.f3288a.invoke();
                }
                break;
            default:
                ((AbstractC5858a) this.f1046h).removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC5893i2) this.f1047i);
                break;
        }
        return C3967n.f12976a;
    }
}
