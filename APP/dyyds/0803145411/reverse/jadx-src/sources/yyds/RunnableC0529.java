package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛲᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0529 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ MenuC0836 f2554;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0597 f2555;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0052 f2556;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1148 f2557;

    public RunnableC0529(C0052 c0052, C0597 c0597, C1148 c1148, MenuC0836 menuC0836) {
        this.f2556 = c0052;
        this.f2555 = c0597;
        this.f2557 = c1148;
        this.f2554 = menuC0836;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC2374 viewOnKeyListenerC2374 = (ViewOnKeyListenerC2374) this.f2556.f551;
        C0597 c0597 = this.f2555;
        if (c0597 != null) {
            viewOnKeyListenerC2374.f11706 = true;
            c0597.f2822.m1914(false);
            viewOnKeyListenerC2374.f11706 = false;
        }
        C1148 c1148 = this.f2557;
        if (c1148.isEnabled() && c1148.hasSubMenu()) {
            this.f2554.m1906(c1148, null, 4);
        }
    }
}
