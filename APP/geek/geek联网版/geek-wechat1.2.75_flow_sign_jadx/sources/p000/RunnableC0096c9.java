package p000;

/* JADX INFO: renamed from: c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0096c9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0143d9 f835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0869wu f836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuC0646qu f837c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0431l0 f838d;

    public RunnableC0096c9(C0431l0 c0431l0, C0143d9 c0143d9, C0869wu c0869wu, MenuC0646qu menuC0646qu) {
        this.f838d = c0431l0;
        this.f835a = c0143d9;
        this.f836b = c0869wu;
        this.f837c = menuC0646qu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC0179e9 viewOnKeyListenerC0179e9 = (ViewOnKeyListenerC0179e9) this.f838d.f2886b;
        C0143d9 c0143d9 = this.f835a;
        if (c0143d9 != null) {
            viewOnKeyListenerC0179e9.f1559z = true;
            c0143d9.f1338b.m2167c(false);
            viewOnKeyListenerC0179e9.f1559z = false;
        }
        C0869wu c0869wu = this.f836b;
        if (c0869wu.isEnabled() && c0869wu.hasSubMenu()) {
            this.f837c.m2173q(c0869wu, null, 4);
        }
    }
}
