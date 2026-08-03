package p015b0;

import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: b0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0133c implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f346g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f347h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0133c(InterfaceC1220a interfaceC1220a, int i9) {
        this.f346g = i9;
        this.f347h = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        switch (this.f346g) {
            case 0:
                this.f347h.invoke();
                break;
            case 1:
                this.f347h.invoke();
                break;
            case 2:
                try {
                    c3959f = this.f347h.invoke();
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:FloatingShortcut] 主线程悬浮层操作失败: ", thM8182b.getMessage(), thM8182b);
                }
                break;
            case 3:
                this.f347h.invoke();
                break;
            case 4:
                this.f347h.invoke();
                break;
            case 5:
                this.f347h.invoke();
                break;
            case 6:
                this.f347h.invoke();
                break;
            case 7:
                this.f347h.invoke();
                break;
            default:
                this.f347h.invoke();
                break;
        }
    }
}
