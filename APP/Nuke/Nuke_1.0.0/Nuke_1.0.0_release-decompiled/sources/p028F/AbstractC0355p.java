package p028F;

import android.content.Context;
import android.os.Build;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1926h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p000A.C0073m;
import p000A.C0075n;
import p000A.C0099z;
import p008B1.C0214b;
import p018D.C0254c;
import p018D.InterfaceC0258g;
import p040H.AbstractC0548f;
import p040H.InterfaceC0546d;
import p047I0.AbstractC0691Q;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p121Y1.C1753n;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p176i1.AbstractC2298n;
import p176i1.C2283D;
import p193l0.AbstractC2485h;
import p211o0.C2753l;
import p221q.AbstractC2897e;
import p221q.AbstractC2899g;
import p239t0.AbstractC3207b;
import p244u.AbstractC3261c;
import p244u.AbstractC3282o;

/* JADX INFO: renamed from: F.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0355p {

    /* JADX INFO: renamed from: a */
    public static final C2283D f1118a;

    static {
        f1118a = new C2283D((14 & 1) == 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m563a(InterfaceC0258g interfaceC0258g, C0254c c0254c, InterfaceC1373m interfaceC1373m, int i5) {
        Context context;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1904307118);
        int i6 = (c1383r.m2582f(interfaceC0258g) ? 4 : 2) | i5 | (c1383r.m2586h(c0254c) ? 32 : 16);
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c1383r.m2568W(-1009482584);
                context = (Context) c1383r.m2590j(AbstractC0691Q.f2211b);
                c1383r.m2597p(false);
            } else {
                c1383r.m2568W(-1009433480);
                c1383r.m2597p(false);
                context = null;
            }
            boolean zM2586h = c1383r.m2586h(c0254c) | ((i6 & 14) == 4) | c1383r.m2586h(context);
            Object objM2558L = c1383r.m2558L();
            if (zM2586h || objM2558L == C1371l.f4833a) {
                objM2558L = new C0075n(c0254c, context, interfaceC0258g, 5);
                c1383r.m2585g0(objM2558L);
            }
            AbstractC2899g.m5094b(null, null, (InterfaceC1601c) objM2558L, c1383r, 0, 3);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0352m(interfaceC0258g, c0254c, i5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m564b(final int i5, final long j5, InterfaceC1373m interfaceC1373m, final int i6) throws XmlPullParserException, IOException {
        int i7;
        final int i8;
        final long j6;
        final int i9;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1240244237);
        if ((i6 & 6) == 0) {
            i7 = (c1383r.m2578d(i5) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c1383r.m2580e(j5) ? 32 : 16;
        }
        if (c1383r.m2560O(i7 & 1, (i7 & 19) != 18)) {
            Context context = (Context) c1383r.m2590j(AbstractC0691Q.f2211b);
            boolean zM2582f = ((i7 & 14) == 4) | c1383r.m2582f(context);
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (zM2582f || objM2558L == c1357e) {
                objM2558L = Integer.valueOf(context.obtainStyledAttributes(new int[]{i5}).getResourceId(0, -1));
                c1383r.m2585g0(objM2558L);
            }
            int iIntValue = ((Number) objM2558L).intValue();
            if (iIntValue == -1) {
                C1388t0 c1388t0M2599r = c1383r.m2599r();
                if (c1388t0M2599r != null) {
                    final int i10 = 1;
                    c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: F.l
                        @Override // p112W2.InterfaceC1603e
                        /* JADX INFO: renamed from: g */
                        public final Object mo0g(Object obj, Object obj2) throws XmlPullParserException, IOException {
                            int i11 = i10;
                            InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    AbstractC0355p.m564b(i5, j5, interfaceC1373m2, AbstractC1385s.m2609A(i6 | 1));
                                    break;
                                default:
                                    AbstractC0355p.m564b(i5, j5, interfaceC1373m2, AbstractC1385s.m2609A(i6 | 1));
                                    break;
                            }
                            return C0891q.f2780a;
                        }
                    };
                    return;
                }
                return;
            }
            i8 = i5;
            j6 = j5;
            boolean z5 = true;
            i9 = i6;
            AbstractC3207b abstractC3207bM3583z = AbstractC1926h.m3583z(iIntValue, c1383r);
            if ((i7 & 112) != 32) {
                z5 = false;
            }
            Object objM2558L2 = c1383r.m2558L();
            if (z5 || objM2558L2 == c1357e) {
                objM2558L2 = j6 == 16 ? null : new C2753l(j6, 5);
                c1383r.m2585g0(objM2558L2);
            }
            AbstractC3282o.m5558a(AbstractC2485h.m4432f(AbstractC3261c.m5533t(C2204m.f7185a, AbstractC2897e.f9165j), abstractC3207bM3583z, (C2753l) objM2558L2), c1383r, 0);
        } else {
            i8 = i5;
            j6 = j5;
            i9 = i6;
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r2 = c1383r.m2599r();
        if (c1388t0M2599r2 != null) {
            final int i11 = 0;
            c1388t0M2599r2.f4928d = new InterfaceC1603e() { // from class: F.l
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) throws XmlPullParserException, IOException {
                    int i112 = i11;
                    InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                    ((Integer) obj2).getClass();
                    switch (i112) {
                        case 0:
                            AbstractC0355p.m564b(i8, j6, interfaceC1373m2, AbstractC1385s.m2609A(i9 | 1));
                            break;
                        default:
                            AbstractC0355p.m564b(i8, j6, interfaceC1373m2, AbstractC1385s.m2609A(i9 | 1));
                            break;
                    }
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m565c(InterfaceC0258g interfaceC0258g, InterfaceC0546d interfaceC0546d, InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-2040393164);
        if ((i5 & 6) == 0) {
            i6 = ((i5 & 8) == 0 ? c1383r.m2582f(interfaceC0258g) : c1383r.m2586h(interfaceC0258g) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= (i5 & 64) == 0 ? c1383r.m2582f(interfaceC0546d) : c1383r.m2586h(interfaceC0546d) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(interfaceC1599a) ? 256 : 128;
        }
        boolean z5 = false;
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            boolean z6 = (i6 & 112) == 32 || ((i6 & 64) != 0 && c1383r.m2582f(interfaceC0546d));
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (z6 || objM2558L == c1357e) {
                objM2558L = new C0357r(new C1753n(20, new C0073m(3, interfaceC0546d, interfaceC1599a)));
                c1383r.m2585g0(objM2558L);
            }
            C0357r c0357r = (C0357r) objM2558L;
            if ((i6 & 14) == 4 || ((i6 & 8) != 0 && c1383r.m2586h(interfaceC0258g))) {
                z5 = true;
            }
            Object objM2558L2 = c1383r.m2558L();
            if (z5 || objM2558L2 == c1357e) {
                objM2558L2 = new C0099z(3, interfaceC0258g);
                c1383r.m2585g0(objM2558L2);
            }
            AbstractC2298n.m4122a(c0357r, (InterfaceC1599a) objM2558L2, f1118a, AbstractC1848j.m3314c(1315155414, new C0352m(0, interfaceC0546d, interfaceC0258g), c1383r), c1383r, 3456, 0);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(interfaceC0258g, interfaceC0546d, interfaceC1599a, i5, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m566d(InterfaceC2207p interfaceC2207p, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1392105195);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 32 : 16;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            AbstractC1923e.m3464b(interfaceC2207p, AbstractC0548f.f1661a, c1843e, c1383r, ((i6 << 6) & 7168) | (i6 & 14) | 432);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0349j(interfaceC2207p, c1843e, i5, 2);
        }
    }
}
