package p000;

import android.content.Context;
import android.view.Choreographer;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0537o4 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4460d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4461e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f4462f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0537o4(int i, Object obj, Object obj2) {
        super(1);
        this.f4460d = i;
        this.f4461e = obj;
        this.f4462f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = 1;
        switch (this.f4460d) {
            case 0:
                Context context = (Context) this.f4461e;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C0602p4 componentCallbacks2C0602p4 = (ComponentCallbacks2C0602p4) this.f4462f;
                applicationContext.registerComponentCallbacks(componentCallbacks2C0602p4);
                return new C0498n4(0, context, componentCallbacks2C0602p4);
            case 1:
                Context context2 = (Context) this.f4461e;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C0639q4 componentCallbacks2C0639q4 = (ComponentCallbacks2C0639q4) this.f4462f;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C0639q4);
                return new C0498n4(i, context2, componentCallbacks2C0639q4);
            case 2:
                C0641q6 c0641q6 = (C0641q6) this.f4461e;
                ChoreographerFrameCallbackC0678r6 choreographerFrameCallbackC0678r6 = (ChoreographerFrameCallbackC0678r6) this.f4462f;
                synchronized (c0641q6.f5048h) {
                    c0641q6.f5050j.remove(choreographerFrameCallbackC0678r6);
                }
                return na1.f4229a;
            case 3:
                ((Choreographer) ((C0715s6) this.f4461e).f5656e).removeFrameCallback((ChoreographerFrameCallbackC0678r6) this.f4462f);
                return na1.f4229a;
            case 4:
                wq0.m5020q((wq0) obj, (xq0) this.f4461e, ((C0424la) this.f4462f).f3398r);
                return na1.f4229a;
            case 5:
                wq0.m5020q((wq0) obj, (xq0) this.f4461e, ((o11) this.f4462f).f4397C);
                return na1.f4229a;
            default:
                C0378k3 c0378k3 = (C0378k3) obj;
                InterfaceC0904ww interfaceC0904ww = (InterfaceC0904ww) this.f4462f;
                we1 we1Var = (we1) this.f4461e;
                if (!we1Var.f7118f) {
                    s90 lifecycle = c0378k3.f2997a.getLifecycle();
                    we1Var.f7120h = interfaceC0904ww;
                    if (we1Var.f7119g == null) {
                        we1Var.f7119g = lifecycle;
                        lifecycle.mo4014a(we1Var);
                    } else if (((z90) lifecycle).f7841c.compareTo(r90.f5334f) >= 0) {
                        we1Var.f7117e.m5259B(new C0474mh(1330788943, true, new ve1(we1Var, interfaceC0904ww, i)));
                    }
                }
                return na1.f4229a;
        }
    }
}
