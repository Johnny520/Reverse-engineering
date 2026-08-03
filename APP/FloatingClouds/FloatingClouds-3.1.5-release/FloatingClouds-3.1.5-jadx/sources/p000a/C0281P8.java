package p000a;

import android.app.Service;
import android.content.Intent;
import io.github.libxposed.api.XposedInterface;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p000a.C0582fh;

/* JADX INFO: renamed from: a.P8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0281P8 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f973a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0316R8 f974b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f975c;

    public /* synthetic */ C0281P8(C0316R8 c0316r8, String str, int i) {
        this.f973a = i;
        this.f974b = c0316r8;
        this.f975c = str;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        switch (this.f973a) {
            case 0:
                C0316R8 c0316r8 = this.f974b;
                String str = this.f975c;
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                List args = chain.getArgs();
                C0631i9.m1481d(args, "getArgs(...)");
                Object objM1951o0 = C0834t3.m1951o0(args, 0);
                Intent intent = objM1951o0 instanceof Intent ? (Intent) objM1951o0 : null;
                String stringExtra = intent != null ? intent.getStringExtra("Voip_User") : null;
                boolean zM1251b = C0506bh.m1251b();
                StringBuilder sbM2229i = C0944z.m2229i("VoIP service onStartCommand ", str, " user=", stringExtra, " active=");
                sbM2229i.append(zM1251b);
                C0316R8.m873r(sbM2229i.toString());
                c0316r8.f1137b = false;
                if (stringExtra != null) {
                    ExecutorService executorService = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(stringExtra)) {
                        c0316r8.f1137b = true;
                        C0316R8.m873r("intercept user=" + stringExtra + " at " + str + " onStartCommand");
                        C0506bh.m1256g(stringExtra);
                        try {
                            Object thisObject = chain.getThisObject();
                            Service service = thisObject instanceof Service ? (Service) thisObject : null;
                            if (service != null) {
                                service.stopForeground(1);
                                C0413Wf c0413Wf = C0413Wf.f1577a;
                            }
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                    }
                    break;
                }
                return chain.proceed();
            case 1:
                C0316R8 c0316r82 = this.f974b;
                String str2 = this.f975c;
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                c0316r82.f1137b = false;
                C0506bh.m1254e();
                C0316R8.m873r("VoIP service onDestroy ".concat(str2));
                return chain2.proceed();
            case 2:
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                return this.f974b.m877i(chain3, this.f975c, "onCreate");
            case 3:
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                return this.f974b.m877i(chain4, this.f975c, "onResume");
            default:
                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain5, "chain");
                return this.f974b.m877i(chain5, this.f975c, "onNewIntent");
        }
    }
}
