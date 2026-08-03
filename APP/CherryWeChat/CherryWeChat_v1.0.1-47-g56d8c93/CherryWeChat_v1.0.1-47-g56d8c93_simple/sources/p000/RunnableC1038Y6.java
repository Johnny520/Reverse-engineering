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

    public RunnableC1038Y6(C0132D2 r1, C1081Z6 r2, C2427qr r3, MenuC2204lr r4) {
        this.f3315d = r1;
        this.f3312a = r2;
        this.f3313b = r3;
        this.f3314c = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC1125a7 r0 = (ViewOnKeyListenerC1125a7) this.f3315d.f328b;
        C1081Z6 r1 = this.f3312a;
        if (r1 == null) goto L5;
        r0.f3566z = true;
        r1.f3448b.m4430c(false);
        r0.f3566z = false;
    L5:
        C2427qr r02 = this.f3313b;
        if (r02.isEnabled() == true) goto L8;
        return;
    L8:
        if (r02.hasSubMenu() == false) goto L12;
        this.f3314c.m4436q(r02, null, 4);
        return;
    }
}
