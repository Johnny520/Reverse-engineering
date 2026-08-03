package p127ib;

import p002a1.RunnableC0003a;
import p010aa.C0039g;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.InterfaceC3741f;
import p317vb.C4546c;

/* JADX INFO: renamed from: ib.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2035c implements InterfaceC3741f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "settings";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: c */
    public final void mo4941c(C3742g c3742g) {
        c3742g.getClass();
        C3740e.m7756c(new RunnableC0003a(this, c3742g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: d */
    public final void mo4988d(C3742g c3742g) {
        c3742g.getClass();
        C4546c c4546c = c3742g.f12151i;
        C2033a c2033a = new C2033a(1);
        c4546c.getClass();
        C4546c.m8971a(c2033a);
        C4546c.m8971a(new C2033a(0));
        C4546c.m8971a(new C0039g("crash_report", "捕获异常日志", "记录微信异常并在下次启动时显示日志", "entertainment"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "设置入口";
    }
}
