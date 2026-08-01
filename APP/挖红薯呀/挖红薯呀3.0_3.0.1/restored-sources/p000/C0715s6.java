package p000;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: s6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0715s6 implements InterfaceC0515nk {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5655d;

    /* JADX INFO: renamed from: e */
    public final Object f5656e;

    /* JADX INFO: renamed from: f */
    public final Object f5657f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0715s6(C0715s6 c0715s6) {
        this.f5655d = 2;
        this.f5656e = c0715s6;
        this.f5657f = new d50();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4008c(InterfaceC0742sw interfaceC0742sw, AbstractC0358jk abstractC0358jk) {
        xp0 xp0Var;
        boolean z;
        Object objM4990t;
        int i = 2;
        int i2 = 1;
        switch (this.f5655d) {
            case 0:
                C0641q6 c0641q6 = (C0641q6) this.f5657f;
                C0884wc c0884wc = new C0884wc(1, rd0.m3497z(abstractC0358jk));
                c0884wc.m4992v();
                ChoreographerFrameCallbackC0678r6 choreographerFrameCallbackC0678r6 = new ChoreographerFrameCallbackC0678r6(c0884wc, this, interfaceC0742sw);
                if (p30.m3002l(c0641q6.f5046f, (Choreographer) this.f5656e)) {
                    synchronized (c0641q6.f5048h) {
                        c0641q6.f5050j.add(choreographerFrameCallbackC0678r6);
                        if (!c0641q6.f5053m) {
                            c0641q6.f5053m = true;
                            c0641q6.f5046f.postFrameCallback(c0641q6.f5054n);
                        }
                        break;
                    }
                    c0884wc.m4994y(new C0537o4(i, c0641q6, choreographerFrameCallbackC0678r6));
                } else {
                    ((Choreographer) this.f5656e).postFrameCallback(choreographerFrameCallbackC0678r6);
                    c0884wc.m4994y(new C0537o4(3, this, choreographerFrameCallbackC0678r6));
                }
                return c0884wc.m4990t();
            case 1:
                C0884wc c0884wc2 = new C0884wc(1, rd0.m3497z(abstractC0358jk));
                c0884wc2.m4992v();
                C0681r9 c0681r9 = (C0681r9) this.f5657f;
                C0544ob c0544ob = new C0544ob();
                c0544ob.f4500a = c0884wc2;
                c0544ob.f4501b = interfaceC0742sw;
                c0884wc2.m4994y(new C0609pb(0, c0681r9.m3429d(c0544ob, (it0) this.f5656e)));
                return c0884wc2.m4990t();
            default:
                if (abstractC0358jk instanceof xp0) {
                    xp0Var = (xp0) abstractC0358jk;
                    int i3 = xp0Var.f7396j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xp0Var.f7396j = i3 - Integer.MIN_VALUE;
                    } else {
                        xp0Var = new xp0(this, abstractC0358jk);
                    }
                }
                Object obj = xp0Var.f7394h;
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                int i4 = xp0Var.f7396j;
                if (i4 == 0) {
                    w60.m4891M(obj);
                    d50 d50Var = (d50) this.f5657f;
                    xp0Var.f7393g = interfaceC0742sw;
                    xp0Var.f7396j = 1;
                    synchronized (d50Var.f970b) {
                        z = d50Var.f969a;
                    }
                    if (z) {
                        objM4990t = na1.f4229a;
                    } else {
                        C0884wc c0884wc3 = new C0884wc(1, rd0.m3497z(xp0Var));
                        c0884wc3.m4992v();
                        synchronized (d50Var.f970b) {
                            ((ArrayList) d50Var.f971c).add(c0884wc3);
                        }
                        c0884wc3.m4994y(new C0631px(i2, d50Var, c0884wc3));
                        objM4990t = c0884wc3.m4990t();
                        if (objM4990t != enumC1007zk) {
                            objM4990t = na1.f4229a;
                        }
                    }
                    if (objM4990t != enumC1007zk) {
                    }
                    return enumC1007zk;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        w60.m4891M(obj);
                        return obj;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC0742sw = xp0Var.f7393g;
                w60.m4891M(obj);
                C0715s6 c0715s6 = (C0715s6) this.f5656e;
                xp0Var.f7393g = null;
                xp0Var.f7396j = 2;
                Object objM4008c = c0715s6.m4008c(interfaceC0742sw, xp0Var);
                if (objM4008c != enumC1007zk) {
                    return objM4008c;
                }
                return enumC1007zk;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0515nk
    public InterfaceC0554ok getKey() {
        return C0496n2.f4130J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: h */
    public final InterfaceC0618pk mo63h(InterfaceC0618pk interfaceC0618pk) {
        switch (this.f5655d) {
        }
        return pf1.m3034J(this, interfaceC0618pk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: l */
    public final InterfaceC0515nk mo64l(InterfaceC0554ok interfaceC0554ok) {
        switch (this.f5655d) {
        }
        return pf1.m3062v(this, interfaceC0554ok);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: p */
    public final Object mo65p(InterfaceC0904ww interfaceC0904ww, Object obj) {
        switch (this.f5655d) {
        }
        return interfaceC0904ww.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: t */
    public final InterfaceC0618pk mo66t(InterfaceC0554ok interfaceC0554ok) {
        switch (this.f5655d) {
        }
        return pf1.m3030F(this, interfaceC0554ok);
    }

    public C0715s6(Choreographer choreographer, C0641q6 c0641q6) {
        this.f5655d = 0;
        this.f5656e = choreographer;
        this.f5657f = c0641q6;
    }

    public C0715s6(it0 it0Var) {
        this.f5655d = 1;
        this.f5656e = it0Var;
        this.f5657f = new C0681r9();
    }
}
