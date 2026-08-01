package p047I0;

import android.view.Choreographer;
import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import me.dartcv.nuke.BuildConfig;
import p000A.C0001A0;
import p000A.C0045X;
import p007B0.C0171D;
import p014C1.C0240b;
import p056K2.C0891q;
import p068N1.C1013c;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1050h;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p095T.C1355d;
import p095T.C1357e;
import p095T.C1368j0;
import p095T.C1390u0;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p160f3.C2135g;

/* JADX INFO: renamed from: I0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711a0 implements InterfaceC1049g {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2251d;

    /* JADX INFO: renamed from: e */
    public final Object f2252e;

    /* JADX INFO: renamed from: f */
    public final Object f2253f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0711a0(Choreographer choreographer, C0706Y c0706y) {
        this.f2251d = 0;
        this.f2252e = choreographer;
        this.f2253f = c0706y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: A */
    public final Object mo1165A(InterfaceC1603e interfaceC1603e, Object obj) {
        switch (this.f2251d) {
        }
        return interfaceC1603e.mo0g(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public final InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        switch (this.f2251d) {
        }
        return AbstractC1785a.m3250j(this, interfaceC1050h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1209a(InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        C1368j0 c1368j0;
        boolean z5;
        Object objM3967r;
        switch (this.f2251d) {
            case 0:
                C0706Y c0706y = (C0706Y) this.f2253f;
                C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
                c2135g.m3968t();
                ChoreographerFrameCallbackC0708Z choreographerFrameCallbackC0708Z = new ChoreographerFrameCallbackC0708Z(c2135g, this, interfaceC1601c);
                if (AbstractC1665j.m2981a(c0706y.f2235f, (Choreographer) this.f2252e)) {
                    synchronized (c0706y.f2237h) {
                        c0706y.f2239j.add(choreographerFrameCallbackC0708Z);
                        if (!c0706y.f2242m) {
                            c0706y.f2242m = true;
                            c0706y.f2235f.postFrameCallback(c0706y.f2243n);
                        }
                        break;
                    }
                    c2135g.m3970w(new C0171D(5, c0706y, choreographerFrameCallbackC0708Z));
                } else {
                    ((Choreographer) this.f2252e).postFrameCallback(choreographerFrameCallbackC0708Z);
                    c2135g.m3970w(new C0171D(6, this, choreographerFrameCallbackC0708Z));
                }
                return c2135g.m3967r();
            case BuildConfig.VERSION_CODE /* 1 */:
                C2135g c2135g2 = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
                c2135g2.m3968t();
                C0240b c0240b = (C0240b) this.f2253f;
                C1355d c1355d = new C1355d();
                c1355d.f4790a = c2135g2;
                c1355d.f4791b = interfaceC1601c;
                c2135g2.m3970w(new C0001A0(2, c0240b.m427d(c1355d, (C1390u0) this.f2252e)));
                return c2135g2.m3967r();
            default:
                if (interfaceC1046d instanceof C1368j0) {
                    c1368j0 = (C1368j0) interfaceC1046d;
                    int i5 = c1368j0.f4819j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c1368j0.f4819j = i5 - Integer.MIN_VALUE;
                    } else {
                        c1368j0 = new C1368j0(this, interfaceC1046d);
                    }
                }
                Object obj = c1368j0.f4817h;
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                int i6 = c1368j0.f4819j;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C1013c c1013c = (C1013c) this.f2253f;
                    c1368j0.f4816g = interfaceC1601c;
                    c1368j0.f4819j = 1;
                    synchronized (c1013c.f3129b) {
                        z5 = c1013c.f3128a;
                    }
                    if (z5) {
                        objM3967r = C0891q.f2780a;
                    } else {
                        C2135g c2135g3 = new C2135g(1, AbstractC1923e.m3448G(c1368j0));
                        c2135g3.m3968t();
                        synchronized (c1013c.f3129b) {
                            ((ArrayList) c1013c.f3130c).add(c2135g3);
                        }
                        c2135g3.m3970w(new C0045X(4, c1013c, c2135g3));
                        objM3967r = c2135g3.m3967r();
                        if (objM3967r != enumC1152a) {
                            objM3967r = C0891q.f2780a;
                        }
                    }
                    if (objM3967r != enumC1152a) {
                    }
                    return enumC1152a;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return obj;
                }
                interfaceC1601c = c1368j0.f4816g;
                AbstractC1784a.m3205S(obj);
                C0711a0 c0711a0 = (C0711a0) this.f2252e;
                c1368j0.f4816g = null;
                c1368j0.f4819j = 2;
                Object objM1209a = c0711a0.m1209a(interfaceC1601c, c1368j0);
                if (objM1209a != enumC1152a) {
                    return objM1209a;
                }
                return enumC1152a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1049g
    public InterfaceC1050h getKey() {
        return C1357e.f4794f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    public final InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        switch (this.f2251d) {
        }
        return AbstractC1785a.m3253n(this, interfaceC1050h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: m */
    public final InterfaceC1051i mo1168m(InterfaceC1051i interfaceC1051i) {
        switch (this.f2251d) {
        }
        return AbstractC1785a.m3254o(this, interfaceC1051i);
    }

    public C0711a0(C0711a0 c0711a0) {
        this.f2251d = 2;
        this.f2252e = c0711a0;
        this.f2253f = new C1013c();
    }

    public C0711a0(C1390u0 c1390u0) {
        this.f2251d = 1;
        this.f2252e = c1390u0;
        this.f2253f = new C0240b(5);
    }
}
