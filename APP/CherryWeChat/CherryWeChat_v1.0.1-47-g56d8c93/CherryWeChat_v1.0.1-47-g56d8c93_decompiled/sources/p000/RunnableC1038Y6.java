package p000;

/* JADX INFO: renamed from: Y6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1038Y6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1081Z6 f3312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2427qr f3313b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuC2204lr f3314c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0132D2 f3315d;

    public RunnableC1038Y6(C0132D2 c0132d2, C1081Z6 c1081z6, C2427qr c2427qr, MenuC2204lr menuC2204lr) {
        this.f3315d = c0132d2;
        this.f3312a = c1081z6;
        this.f3313b = c2427qr;
        this.f3314c = menuC2204lr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC1125a7 viewOnKeyListenerC1125a7 = (ViewOnKeyListenerC1125a7) this.f3315d.f328b;
        C1081Z6 c1081z6 = this.f3312a;
        if (c1081z6 != null) {
            viewOnKeyListenerC1125a7.f3566z = true;
            c1081z6.f3448b.m4430c(false);
            viewOnKeyListenerC1125a7.f3566z = false;
        }
        C2427qr c2427qr = this.f3313b;
        if (c2427qr.isEnabled() && c2427qr.hasSubMenu()) {
            this.f3314c.m4436q(c2427qr, null, 4);
        }
    }
}
