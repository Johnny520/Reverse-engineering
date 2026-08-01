package p028F;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import p021D3.RunnableC0267d;
import p040H.C0544b;
import p040H.C0545c;
import p040H.InterfaceC0546d;
import p040H.InterfaceC0547e;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.C1366i0;
import p112W2.InterfaceC1601c;
import p127Z2.AbstractC1784a;
import p158f0.C2088t;

/* JADX INFO: renamed from: F.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0347h extends AbstractC1184i implements InterfaceC1601c {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1088h;

    /* JADX INFO: renamed from: i */
    public int f1089i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0547e f1090j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1091k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0347h(InterfaceC0547e interfaceC0547e, Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(1, interfaceC1046d);
        this.f1088h = i5;
        this.f1090j = interfaceC0547e;
        this.f1091k = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj;
        switch (this.f1088h) {
            case 0:
                return new C0347h((C0348i) this.f1090j, (InterfaceC0546d) this.f1091k, interfaceC1046d, 0).mo8p(C0891q.f2780a);
            default:
                return new C0347h((C0545c) this.f1090j, (C0544b) this.f1091k, interfaceC1046d, 1).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:96:0x0055 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f0.t */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [f0.t] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.os.Handler] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        Handler handler;
        C0344e c0344e;
        switch (this.f1088h) {
            case 0:
                C0348i c0348i = (C0348i) this.f1090j;
                C2088t c2088t = c0348i.f1096e;
                View view = c0348i.f1092a;
                int i5 = this.f1089i;
                C0891q c0891q = C0891q.f2780a;
                try {
                    if (i5 == 0) {
                        AbstractC1784a.m3205S(obj);
                        C0345f c0345f = new C0345f();
                        InterfaceC0546d interfaceC0546d = (InterfaceC0546d) this.f1091k;
                        C0344e c0344e2 = new C0344e(c0345f, new C0341b(c0348i, interfaceC0546d, 0), new C0341b(c0348i, interfaceC0546d, 1), view);
                        InterfaceC1601c interfaceC1601c = c0348i.f1093b;
                        if (interfaceC1601c != null && (c0344e = (C0344e) interfaceC1601c.mo1h(c0344e2)) != null) {
                            c0344e2 = c0344e;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            RunnableC0267d runnableC0267d = c0348i.f1100i;
                            if (runnableC0267d == null) {
                                runnableC0267d = new RunnableC0267d(c0348i, c0344e2, c0345f, 3);
                                c0348i.f1100i = runnableC0267d;
                            }
                            view.post(runnableC0267d);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new ActionModeCallbackC0356q(c0344e2), 1);
                            if (actionModeStartActionMode == null) {
                                return c0891q;
                            }
                            c0348i.f1099h = actionModeStartActionMode;
                        }
                        this.f1089i = 1;
                        Object objMo4091p = c0345f.f1085a.mo4091p(this);
                        EnumC1152a enumC1152a = EnumC1152a.f3788d;
                        if (objMo4091p != enumC1152a) {
                            objMo4091p = c0891q;
                        }
                        if (objMo4091p == enumC1152a) {
                            return enumC1152a;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1784a.m3205S(obj);
                    }
                    if (Looper.myLooper() != (handler != 0 ? handler.getLooper() : null)) {
                        Runnable runnableC0346g = c0348i.f1101j;
                        if (runnableC0346g == null) {
                            runnableC0346g = new RunnableC0346g(0, c0348i);
                            c0348i.f1101j = runnableC0346g;
                        }
                        view.post(runnableC0346g);
                    } else {
                        ActionMode actionMode = c0348i.f1099h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    RunnableC0267d runnableC0267d2 = c0348i.f1100i;
                    if (runnableC0267d2 != null) {
                        view.removeCallbacks(runnableC0267d2);
                    }
                    c0348i.f1099h = null;
                    return c0891q;
                } finally {
                    c2088t.m3865a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (looperMyLooper2 != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnableC0346g2 = c0348i.f1101j;
                        if (runnableC0346g2 == null) {
                            runnableC0346g2 = new RunnableC0346g(0, c0348i);
                            c0348i.f1101j = runnableC0346g2;
                        }
                        view.post(runnableC0346g2);
                    } else {
                        ActionMode actionMode2 = c0348i.f1099h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    RunnableC0267d runnableC0267d3 = c0348i.f1100i;
                    if (runnableC0267d3 != null) {
                        view.removeCallbacks(runnableC0267d3);
                    }
                    c0348i.f1099h = null;
                }
            default:
                C0544b c0544b = (C0544b) this.f1091k;
                C1366i0 c1366i0 = ((C0545c) this.f1090j).f1660c;
                int i6 = this.f1089i;
                C0891q c0891q2 = C0891q.f2780a;
                try {
                    if (i6 == 0) {
                        AbstractC1784a.m3205S(obj);
                        c1366i0.setValue(c0544b);
                        this.f1089i = 1;
                        Object objMo4091p2 = c0544b.f1657b.mo4091p(this);
                        EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                        if (objMo4091p2 != enumC1152a2) {
                            objMo4091p2 = c0891q2;
                        }
                        if (objMo4091p2 == enumC1152a2) {
                            return enumC1152a2;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1784a.m3205S(obj);
                    }
                    return c0891q2;
                } finally {
                    c1366i0.setValue(null);
                }
        }
    }
}
