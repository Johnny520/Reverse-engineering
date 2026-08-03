package p016b1;

import android.graphics.Canvas;
import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import gg.AbstractC1417m;
import gg.C1425u;
import okio.C3193a;
import p020b5.C0184c;
import p041d1.C0653b0;
import p041d1.C0670p;
import p071f1.AbstractC0995c;
import p071f1.C1032u0;
import p071f1.InterfaceC0998d0;
import p071f1.InterfaceC1031u;
import p085fg.InterfaceC1231l;
import p099h.C1455f;
import p099h.C1463h1;
import p099h.C1485s0;
import p099h.C1486t;
import p099h.EnumC1456f0;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p117i0.InterfaceC1854l2;
import p118i1.C1902b;
import p136j8.C2104o;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p322w0.C4665p;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;
import p339x1.C5610h0;
import p339x1.EnumC5596d2;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5624m;
import p339x1.InterfaceC5641r1;
import p340x2.C5687v;
import p343x6.AbstractC5700d;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: b1.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167g extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f437g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f438h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f439i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f440j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: fg.l */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0167g(C0653b0 c0653b0, C0670p c0670p, InterfaceC1231l interfaceC1231l) {
        super(1);
        this.f437g = 1;
        this.f438h = c0653b0;
        this.f439i = c0670p;
        this.f440j = (AbstractC1417m) interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [fg.l, gg.m] */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws Throwable {
        boolean zBooleanValue;
        InterfaceC5624m interfaceC5624m;
        switch (this.f437g) {
            case 0:
                InterfaceC5600e2 interfaceC5600e2 = (InterfaceC5600e2) obj;
                C0168h c0168h = (C0168h) interfaceC5600e2;
                if (!((ViewOnDragListenerC0162b) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x((C0168h) this.f439i)).m11093getDragAndDropManager()).f430b.contains(c0168h) || !AbstractC3754e0.m7892h(c0168h, AbstractC5700d.m10247C((C0119x) this.f440j))) {
                    return EnumC5596d2.f22747g;
                }
                ((C1425u) this.f438h).f4738g = interfaceC5600e2;
                return EnumC5596d2.f22749i;
            case 1:
                C0653b0 c0653b0 = (C0653b0) obj;
                if (AbstractC1416l.m3825a(c0653b0, (C0653b0) this.f438h)) {
                    zBooleanValue = false;
                } else {
                    if (AbstractC1416l.m3825a(c0653b0, ((C0670p) this.f439i).f2056c)) {
                        C2104o.m5276A("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((AbstractC1417m) this.f440j).invoke(c0653b0)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 2:
                return new C1455f((C4665p) this.f438h, this.f439i, (C1486t) this.f440j, 0);
            case 3:
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) this.f439i;
                InterfaceC1854l2 interfaceC1854l22 = (InterfaceC1854l2) this.f438h;
                interfaceC0998d0.mo2544n(interfaceC1854l22 != null ? ((Number) interfaceC1854l22.getValue()).floatValue() : 1.0f);
                interfaceC0998d0.mo2547q(interfaceC1854l2 != null ? ((Number) interfaceC1854l2.getValue()).floatValue() : 1.0f);
                interfaceC0998d0.mo2541i(interfaceC1854l2 != null ? ((Number) interfaceC1854l2.getValue()).floatValue() : 1.0f);
                InterfaceC1854l2 interfaceC1854l23 = (InterfaceC1854l2) this.f440j;
                interfaceC0998d0.mo2531H0(interfaceC1854l23 != null ? ((C1032u0) interfaceC1854l23.getValue()).f3256a : C1032u0.f3254b);
                return C3967n.f12976a;
            case 4:
                C1485s0 c1485s0 = (C1485s0) this.f440j;
                int iOrdinal = ((EnumC1456f0) obj).ordinal();
                C1032u0 c1032u0 = null;
                if (iOrdinal == 0) {
                    C1463h1 c1463h1 = c1485s0.f4934a;
                } else if (iOrdinal == 1) {
                    c1032u0 = (C1032u0) this.f438h;
                } else {
                    if (iOrdinal != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    C1463h1 c1463h12 = c1485s0.f4934a;
                }
                return new C1032u0(c1032u0 != null ? c1032u0.f3256a : C1032u0.f3254b);
            case 5:
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                C5610h0 c5610h0 = (C5610h0) this.f438h;
                C1565b c1565b = c5610h0.f22833g;
                InterfaceC5624m interfaceC5624m2 = c5610h0.f22834h;
                c5610h0.f22834h = (InterfaceC5624m) this.f439i;
                try {
                    InterfaceC4233c interfaceC4233cM822s = interfaceC1567d.mo4081z0().m822s();
                    EnumC4243m enumC4243mM824u = interfaceC1567d.mo4081z0().m824u();
                    InterfaceC1031u interfaceC1031uM819p = interfaceC1567d.mo4081z0().m819p();
                    long jM825v = interfaceC1567d.mo4081z0().m825v();
                    C1902b c1902b = (C1902b) interfaceC1567d.mo4081z0().f470b;
                    InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f440j;
                    InterfaceC4233c interfaceC4233cM822s2 = c1565b.f5220h.m822s();
                    EnumC4243m enumC4243mM824u2 = c1565b.f5220h.m824u();
                    InterfaceC1031u interfaceC1031uM819p2 = c1565b.f5220h.m819p();
                    long jM825v2 = c1565b.f5220h.m825v();
                    C0184c c0184c = c1565b.f5220h;
                    try {
                        C1902b c1902b2 = (C1902b) c0184c.f470b;
                        c0184c.m800R(interfaceC4233cM822s);
                        c0184c.m801S(enumC4243mM824u);
                        c0184c.m798P(interfaceC1031uM819p);
                        c0184c.m803U(jM825v);
                        c0184c.f470b = c1902b;
                        interfaceC1031uM819p.mo2487e();
                        try {
                            interfaceC1231l.invoke(c5610h0);
                            interfaceC1031uM819p.mo2497p();
                            C0184c c0184c2 = c1565b.f5220h;
                            c0184c2.m800R(interfaceC4233cM822s2);
                            c0184c2.m801S(enumC4243mM824u2);
                            c0184c2.m798P(interfaceC1031uM819p2);
                            c0184c2.m803U(jM825v2);
                            c0184c2.f470b = c1902b2;
                            c5610h0.f22834h = interfaceC5624m2;
                            return C3967n.f12976a;
                        } catch (Throwable th2) {
                            interfaceC5624m = interfaceC5624m2;
                            try {
                                interfaceC1031uM819p.mo2497p();
                                C0184c c0184c3 = c1565b.f5220h;
                                c0184c3.m800R(interfaceC4233cM822s2);
                                c0184c3.m801S(enumC4243mM824u2);
                                c0184c3.m798P(interfaceC1031uM819p2);
                                c0184c3.m803U(jM825v2);
                                c0184c3.f470b = c1902b2;
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                c5610h0.f22834h = interfaceC5624m;
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        interfaceC5624m = interfaceC5624m2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    interfaceC5624m = interfaceC5624m2;
                }
                break;
            default:
                C5687v c5687v = (C5687v) this.f438h;
                C5602f0 c5602f0 = (C5602f0) this.f439i;
                C5687v c5687v2 = (C5687v) this.f440j;
                InterfaceC1031u interfaceC1031uM819p3 = ((InterfaceC1567d) obj).mo4081z0().m819p();
                if (c5687v.getView().getVisibility() != 8) {
                    c5687v.f23083E = true;
                    InterfaceC5641r1 interfaceC5641r1 = c5602f0.f22803t;
                    ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = interfaceC5641r1 instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t ? (ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1 : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC5934t != null) {
                        Canvas canvasM2502a = AbstractC0995c.m2502a(interfaceC1031uM819p3);
                        viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().getClass();
                        c5687v2.draw(canvasM2502a);
                    }
                    c5687v.f23083E = false;
                }
                return C3967n.f12976a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0167g(Object obj, Object obj2, Object obj3, int i9) {
        super(1);
        this.f437g = i9;
        this.f438h = obj;
        this.f439i = obj2;
        this.f440j = obj3;
    }
}
