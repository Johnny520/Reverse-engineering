package p000a;

import android.app.Activity;
import io.github.libxposed.api.XposedInterface;

/* JADX INFO: renamed from: a.q5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0779q5 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0874v5 f3073b;

    public /* synthetic */ C0779q5(C0874v5 c0874v5, int i) {
        this.f3072a = i;
        this.f3073b = c0874v5;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        switch (this.f3072a) {
            case 0:
                final C0874v5 c0874v5 = this.f3073b;
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                try {
                    if (C0874v5.m2093f()) {
                        final int i = 0;
                        c0874v5.f3423d.post(new Runnable() { // from class: a.r5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        c0874v5.m2096h();
                                        break;
                                    default:
                                        c0874v5.m2096h();
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
                final C0874v5 c0874v52 = this.f3073b;
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                Object objProceed2 = chain2.proceed();
                try {
                    if (C0874v5.m2093f()) {
                        Object thisObject = chain2.getThisObject();
                        final Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                        if (activity != null) {
                            final int i2 = 1;
                            activity.getWindow().getDecorView().post(new Runnable() { // from class: a.s5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            c0874v52.m2094c(activity);
                                            break;
                                        default:
                                            C0874v5 c0874v53 = c0874v52;
                                            c0874v53.m2094c(activity);
                                            c0874v53.m2100l();
                                            c0874v53.m2099k();
                                            if (c0874v53.f3420a) {
                                                c0874v53.m2097i();
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
                final C0874v5 c0874v53 = this.f3073b;
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                Object objProceed3 = chain3.proceed();
                try {
                    Object thisObject2 = chain3.getThisObject();
                    final Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                    if (activity2 != null) {
                        final int i3 = 0;
                        activity2.getWindow().getDecorView().post(new Runnable() { // from class: a.s5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        c0874v53.m2094c(activity2);
                                        break;
                                    default:
                                        C0874v5 c0874v532 = c0874v53;
                                        c0874v532.m2094c(activity2);
                                        c0874v532.m2100l();
                                        c0874v532.m2099k();
                                        if (c0874v532.f3420a) {
                                            c0874v532.m2097i();
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } catch (Throwable unused3) {
                }
                return objProceed3;
            default:
                final C0874v5 c0874v54 = this.f3073b;
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                Object objProceed4 = chain4.proceed();
                try {
                    if (C0874v5.m2093f()) {
                        final int i4 = 1;
                        c0874v54.f3423d.post(new Runnable() { // from class: a.r5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        c0874v54.m2096h();
                                        break;
                                    default:
                                        c0874v54.m2096h();
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
