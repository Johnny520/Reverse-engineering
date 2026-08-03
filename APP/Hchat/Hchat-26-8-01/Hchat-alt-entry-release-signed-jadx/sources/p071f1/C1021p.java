package p071f1;

import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0107l;
import androidx.lifecycle.InterfaceC0112q;
import gg.AbstractC1416l;
import gg.AbstractC1417m;
import p020b5.C0184c;
import p041d1.C0655c0;
import p070f0.C0989u;
import p070f0.InputConnectionC0990v;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.C1453e0;
import p101h1.InterfaceC1567d;
import p109hb.C1671c;
import p117i0.C1819d;
import p118i1.C1902b;
import p131j0.C2046b;
import p190n2.C2885t;
import p190n2.InputConnectionC2877l;
import p261rb.RunnableC3791g;
import p266s0.C3874d;
import p267s1.C3884a0;
import p267s1.C3886b0;
import p267s1.EnumC3919y;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p339x1.C5602f0;
import p339x1.C5608g2;
import p356y0.C5857s;
import p356y0.InterfaceC5853o;
import p357y1.C5880f1;
import p357y1.C5884g1;
import p357y1.C5899k0;
import p357y1.C5911n0;
import p357y1.C5932s1;
import p357y1.C5953x2;
import p357y1.ChoreographerFrameCallbackC5915o0;
import p358y2.C5974i;
import p358y2.C5989x;
import p358y2.InterfaceC5965b0;

/* JADX INFO: renamed from: f1.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1021p extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3227g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3228h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3229i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1021p(Object obj, int i9, Object obj2) {
        super(1);
        this.f3227g = i9;
        this.f3228h = obj;
        this.f3229i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        InputConnectionC0990v inputConnectionC0990v;
        switch (this.f3227g) {
            case 0:
                AbstractC4374a1.m8813G((AbstractC4374a1) obj, (AbstractC4377b1) this.f3228h, 0, 0, ((C1023q) this.f3229i).f3232u, 4);
                return C3967n.f12976a;
            case 1:
                AbstractC4374a1.m8813G((AbstractC4374a1) obj, (AbstractC4377b1) this.f3228h, 0, 0, ((C1028s0) this.f3229i).f3245G, 4);
                return C3967n.f12976a;
            case 2:
                ((AbstractC4374a1) obj).m8816A((AbstractC4377b1) this.f3228h, 0, 0, ((C1453e0) this.f3229i).f4826c.m4488g());
                return C3967n.f12976a;
            case 3:
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                InterfaceC1567d interfaceC1567d2 = (InterfaceC1567d) this.f3228h;
                InterfaceC4233c interfaceC4233cM822s = interfaceC1567d.mo4081z0().m822s();
                EnumC4243m enumC4243mM824u = interfaceC1567d.mo4081z0().m824u();
                InterfaceC1031u interfaceC1031uM819p = interfaceC1567d.mo4081z0().m819p();
                long jM825v = interfaceC1567d.mo4081z0().m825v();
                C1902b c1902b = (C1902b) interfaceC1567d.mo4081z0().f470b;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f3229i;
                InterfaceC4233c interfaceC4233cM822s2 = interfaceC1567d2.mo4081z0().m822s();
                EnumC4243m enumC4243mM824u2 = interfaceC1567d2.mo4081z0().m824u();
                InterfaceC1031u interfaceC1031uM819p2 = interfaceC1567d2.mo4081z0().m819p();
                long jM825v2 = interfaceC1567d2.mo4081z0().m825v();
                C1902b c1902b2 = (C1902b) interfaceC1567d2.mo4081z0().f470b;
                C0184c c0184cMo4081z0 = interfaceC1567d2.mo4081z0();
                c0184cMo4081z0.m800R(interfaceC4233cM822s);
                c0184cMo4081z0.m801S(enumC4243mM824u);
                c0184cMo4081z0.m798P(interfaceC1031uM819p);
                c0184cMo4081z0.m803U(jM825v);
                c0184cMo4081z0.f470b = c1902b;
                interfaceC1031uM819p.mo2487e();
                try {
                    interfaceC1231l.invoke(interfaceC1567d2);
                    interfaceC1031uM819p.mo2497p();
                    C0184c c0184cMo4081z02 = interfaceC1567d2.mo4081z0();
                    c0184cMo4081z02.m800R(interfaceC4233cM822s2);
                    c0184cMo4081z02.m801S(enumC4243mM824u2);
                    c0184cMo4081z02.m798P(interfaceC1031uM819p2);
                    c0184cMo4081z02.m803U(jM825v2);
                    c0184cMo4081z02.f470b = c1902b2;
                    return C3967n.f12976a;
                } catch (Throwable th2) {
                    interfaceC1031uM819p.mo2497p();
                    C0184c c0184cMo4081z03 = interfaceC1567d2.mo4081z0();
                    c0184cMo4081z03.m800R(interfaceC4233cM822s2);
                    c0184cMo4081z03.m801S(enumC4243mM824u2);
                    c0184cMo4081z03.m798P(interfaceC1031uM819p2);
                    c0184cMo4081z03.m803U(jM825v2);
                    c0184cMo4081z03.f470b = c1902b2;
                    throw th2;
                }
            case 4:
                MotionEvent motionEvent = (MotionEvent) obj;
                C3884a0 c3884a0 = (C3884a0) this.f3229i;
                if (motionEvent.getActionMasked() == 0) {
                    C1671c c1671c = (C1671c) this.f3228h;
                    C3886b0 c3886b0 = c3884a0.f12741a;
                    if (c3886b0 == null) {
                        AbstractC1416l.m3831g("onTouchEvent");
                        throw null;
                    }
                    c1671c.f5521h = ((Boolean) c3886b0.invoke(motionEvent)).booleanValue() ? EnumC3919y.f12868h : EnumC3919y.f12869i;
                } else {
                    C3886b0 c3886b02 = c3884a0.f12741a;
                    if (c3886b02 == null) {
                        AbstractC1416l.m3831g("onTouchEvent");
                        throw null;
                    }
                    c3886b02.invoke(motionEvent);
                }
                return C3967n.f12976a;
            case 5:
                ((C5602f0) this.f3228h).m10031d0(((InterfaceC5853o) obj).mo10549d((InterfaceC5853o) this.f3229i));
                return C3967n.f12976a;
            case 6:
                ((AbstractC4374a1) obj).m8816A((AbstractC4377b1) this.f3228h, 0, 0, ((C5857s) this.f3229i).f23805u);
                return C3967n.f12976a;
            case 7:
                return new C5932s1((C0989u) this.f3228h, new C0655c0((C5899k0) this.f3229i, 18));
            case 8:
                C5932s1 c5932s1 = (C5932s1) this.f3228h;
                synchronized (c5932s1.f24051c) {
                    try {
                        c5932s1.f24053e = true;
                        C2046b c2046b = c5932s1.f24052d;
                        Object[] objArr = c2046b.f6891g;
                        int i9 = c2046b.f6893i;
                        for (int i10 = 0; i10 < i9; i10++) {
                            InputConnectionC2877l inputConnectionC2877l = (InputConnectionC2877l) ((C5608g2) objArr[i10]).get();
                            if (inputConnectionC2877l != null && (inputConnectionC0990v = inputConnectionC2877l.f9301b) != null) {
                                inputConnectionC0990v.closeConnection();
                                inputConnectionC2877l.f9301b = null;
                            }
                        }
                        c5932s1.f24052d.m5061g();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C2885t c2885t = ((C5899k0) this.f3229i).f23968h;
                c2885t.f9320b.set(null);
                c2885t.f9319a.mo2397d();
                return C3967n.f12976a;
            case 9:
                C5911n0 c5911n0 = (C5911n0) this.f3228h;
                ChoreographerFrameCallbackC5915o0 choreographerFrameCallbackC5915o0 = (ChoreographerFrameCallbackC5915o0) this.f3229i;
                synchronized (c5911n0.f23988k) {
                    c5911n0.f23990m.remove(choreographerFrameCallbackC5915o0);
                }
                return C3967n.f12976a;
            case 10:
                ((Choreographer) ((C1819d) this.f3228h).f6042h).removeFrameCallback((ChoreographerFrameCallbackC5915o0) this.f3229i);
                return C3967n.f12976a;
            case 11:
                C5880f1 c5880f1 = (C5880f1) obj;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f3229i;
                C5953x2 c5953x2 = (C5953x2) this.f3228h;
                if (!c5953x2.f24187i) {
                    InterfaceC0112q interfaceC0112q = c5880f1.f23859c;
                    View view = c5880f1.f23857a;
                    C0114s c0114sMo550f = interfaceC0112q.mo550f();
                    c5953x2.f24189k = interfaceC1235p;
                    if (c5953x2.f24188j == null) {
                        if (AbstractC1416l.m3825a(Looper.myLooper(), view.getHandler().getLooper())) {
                            c5953x2.f24188j = c0114sMo550f;
                            c0114sMo550f.m552a(c5953x2);
                        } else {
                            view.post(new RunnableC3791g(c5953x2, 20, c0114sMo550f));
                        }
                    } else if (c0114sMo550f.f300c.compareTo(EnumC0107l.f291i) >= 0) {
                        c5953x2.f24186h.m4587A(new C3874d(-1723985096, new C5884g1(c5953x2, c5880f1, interfaceC1235p), true));
                    }
                }
                return C3967n.f12976a;
            default:
                C5989x c5989x = (C5989x) this.f3228h;
                c5989x.setPositionProvider((InterfaceC5965b0) this.f3229i);
                c5989x.m10729r();
                return new C5974i();
        }
    }
}
