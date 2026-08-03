package p000a;

import android.app.Activity;
import io.github.libxposed.api.XposedInterface;

/* JADX INFO: renamed from: a.k2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0662k2 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0738o2 f2474b;

    public /* synthetic */ C0662k2(C0738o2 c0738o2, int i) {
        this.f2473a = i;
        this.f2474b = c0738o2;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        switch (this.f2473a) {
            case 0:
                final C0738o2 c0738o2 = this.f2474b;
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                try {
                    if (C0738o2.m1747e()) {
                        final int i = 0;
                        c0738o2.f2918e.post(new Runnable() { // from class: a.l2
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        c0738o2.m1751h();
                                        break;
                                    case 1:
                                        c0738o2.m1751h();
                                        break;
                                    default:
                                        C0738o2 c0738o22 = c0738o2;
                                        c0738o22.m1755l();
                                        c0738o22.m1754k();
                                        if (c0738o22.f2914a) {
                                            c0738o22.m1752i();
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    break;
                } catch (Throwable unused) {
                }
                return objProceed;
            case 1:
                final C0738o2 c0738o22 = this.f2474b;
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                Object objProceed2 = chain2.proceed();
                try {
                    if (C0738o2.m1747e()) {
                        Object thisObject = chain2.getThisObject();
                        Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                        if (activity != null) {
                            final int i2 = 2;
                            activity.getWindow().getDecorView().post(new Runnable() { // from class: a.l2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            c0738o22.m1751h();
                                            break;
                                        case 1:
                                            c0738o22.m1751h();
                                            break;
                                        default:
                                            C0738o2 c0738o222 = c0738o22;
                                            c0738o222.m1755l();
                                            c0738o222.m1754k();
                                            if (c0738o222.f2914a) {
                                                c0738o222.m1752i();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    }
                } catch (Throwable unused2) {
                }
                return objProceed2;
            case 2:
                C0738o2 c0738o23 = this.f2474b;
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                Object objProceed3 = chain3.proceed();
                try {
                    Object thisObject2 = chain3.getThisObject();
                    if ((thisObject2 instanceof Activity ? (Activity) thisObject2 : null) != null) {
                        c0738o23.getClass();
                        break;
                    }
                } catch (Throwable unused3) {
                }
                return objProceed3;
            default:
                final C0738o2 c0738o24 = this.f2474b;
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                Object objProceed4 = chain4.proceed();
                try {
                    if (C0738o2.m1747e()) {
                        final int i3 = 1;
                        c0738o24.f2918e.post(new Runnable() { // from class: a.l2
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        c0738o24.m1751h();
                                        break;
                                    case 1:
                                        c0738o24.m1751h();
                                        break;
                                    default:
                                        C0738o2 c0738o222 = c0738o24;
                                        c0738o222.m1755l();
                                        c0738o222.m1754k();
                                        if (c0738o222.f2914a) {
                                            c0738o222.m1752i();
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    break;
                } catch (Throwable unused4) {
                }
                return objProceed4;
        }
    }
}
