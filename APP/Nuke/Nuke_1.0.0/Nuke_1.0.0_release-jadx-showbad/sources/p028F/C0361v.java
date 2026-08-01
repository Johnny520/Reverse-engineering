package p028F;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import p000A.C0049a;
import p047I0.AbstractC0691Q;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p193l0.AbstractC2485h;
import p221q.AbstractC2897e;
import p244u.AbstractC3261c;
import p244u.AbstractC3282o;

/* JADX INFO: renamed from: F.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0361v {

    /* JADX INFO: renamed from: a */
    public static final C0361v f1133a = new C0361v();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m598a(Drawable drawable, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(257732500);
        int i6 = (c1383r.m2586h(drawable) ? 4 : 2) | i5;
        if (c1383r.m2560O(i6 & 1, (i6 & 3) != 2)) {
            InterfaceC2207p interfaceC2207pM5533t = AbstractC3261c.m5533t(C2204m.f7185a, AbstractC2897e.f9165j);
            boolean zM2586h = c1383r.m2586h(drawable);
            Object objM2558L = c1383r.m2558L();
            if (zM2586h || objM2558L == C1371l.f4833a) {
                objM2558L = new C0049a(2, drawable);
                c1383r.m2585g0(objM2558L);
            }
            AbstractC3282o.m5558a(AbstractC2485h.m4429c(interfaceC2207pM5533t, (InterfaceC1601c) objM2558L), c1383r, 0);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0352m(i5, 2, this, drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m599b(final Icon icon, InterfaceC1373m interfaceC1373m, final int i5) {
        C1388t0 c1388t0M2599r;
        InterfaceC1603e interfaceC1603e;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(2116504409);
        int i6 = (c1383r.m2586h(icon) ? 4 : 2) | i5;
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            Context context = (Context) c1383r.m2590j(AbstractC0691Q.f2211b);
            boolean zM2582f = c1383r.m2582f(icon) | c1383r.m2582f(context);
            Object objM2558L = c1383r.m2558L();
            if (zM2582f || objM2558L == C1371l.f4833a) {
                objM2558L = icon.loadDrawable(context);
                c1383r.m2585g0(objM2558L);
            }
            Drawable drawable = (Drawable) objM2558L;
            if (drawable == null) {
                c1388t0M2599r = c1383r.m2599r();
                if (c1388t0M2599r != null) {
                    final int i7 = 0;
                    interfaceC1603e = new InterfaceC1603e(this, icon, i5, i7) { // from class: F.u

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ int f1130d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ C0361v f1131e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ Icon f1132f;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.f1130d = i7;
                            this.f1131e = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p112W2.InterfaceC1603e
                        /* JADX INFO: renamed from: g */
                        public final Object mo0g(Object obj, Object obj2) {
                            int i8 = this.f1130d;
                            InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                            ((Integer) obj2).getClass();
                            switch (i8) {
                                case 0:
                                    this.f1131e.m599b(this.f1132f, interfaceC1373m2, AbstractC1385s.m2609A(49));
                                    break;
                                default:
                                    this.f1131e.m599b(this.f1132f, interfaceC1373m2, AbstractC1385s.m2609A(49));
                                    break;
                            }
                            return C0891q.f2780a;
                        }
                    };
                    c1388t0M2599r.f4928d = interfaceC1603e;
                }
                return;
            }
            m598a(drawable, c1383r, 48);
        } else {
            c1383r.m2563R();
        }
        c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            final int i8 = 1;
            interfaceC1603e = new InterfaceC1603e(this, icon, i5, i8) { // from class: F.u

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f1130d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0361v f1131e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Icon f1132f;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f1130d = i8;
                    this.f1131e = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    int i82 = this.f1130d;
                    InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                    ((Integer) obj2).getClass();
                    switch (i82) {
                        case 0:
                            this.f1131e.m599b(this.f1132f, interfaceC1373m2, AbstractC1385s.m2609A(49));
                            break;
                        default:
                            this.f1131e.m599b(this.f1132f, interfaceC1373m2, AbstractC1385s.m2609A(49));
                            break;
                    }
                    return C0891q.f2780a;
                }
            };
            c1388t0M2599r.f4928d = interfaceC1603e;
        }
    }
}
