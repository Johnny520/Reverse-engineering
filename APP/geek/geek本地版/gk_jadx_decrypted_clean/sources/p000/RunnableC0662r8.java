package p000;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0662r8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0699s8 f4244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0572ou f4245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuC0424ku f4246c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0431l0 f4247d;

    public RunnableC0662r8(C0431l0 c0431l0, C0699s8 c0699s8, C0572ou c0572ou, MenuC0424ku menuC0424ku) {
        this.f4247d = c0431l0;
        this.f4244a = c0699s8;
        this.f4245b = c0572ou;
        this.f4246c = menuC0424ku;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC0736t8 viewOnKeyListenerC0736t8 = (ViewOnKeyListenerC0736t8) this.f4247d.f2980b;
        C0699s8 c0699s8 = this.f4244a;
        if (c0699s8 != null) {
            viewOnKeyListenerC0736t8.f4547z = true;
            c0699s8.f4393b.m1718c(false);
            viewOnKeyListenerC0736t8.f4547z = false;
        }
        C0572ou c0572ou = this.f4245b;
        if (c0572ou.isEnabled() && c0572ou.hasSubMenu()) {
            this.f4246c.m1724q(c0572ou, null, 4);
        }
    }
}
