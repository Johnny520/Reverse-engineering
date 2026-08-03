package p050c0;

import com.abc.core.hooks.ModuleLog;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p056f0.C0810V;

/* JADX INFO: renamed from: c0.D1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0581D1 implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1749a;

    public /* synthetic */ C0581D1(int i2) {
        this.f1749a = i2;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        C0146l c0146l = C0146l.f339a;
        switch (this.f1749a) {
            case 0:
                C0590G1.f1796e.post(new RunnableC0713z(2));
                break;
            case 1:
                C0810V c0810v = C0810V.f2933a;
                break;
            default:
                ModuleLog moduleLog = ModuleLog.INSTANCE;
                C0661h1 c0661h1 = C0661h1.f2048a;
                moduleLog.setEnabled(C0661h1.m1661c("module_log_enabled", false));
                break;
        }
        return c0146l;
    }
}
