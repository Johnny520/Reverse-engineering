package p068h;

import p004C.C0066j;

/* JADX INFO: renamed from: h.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0586e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0587f f1983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0596o f1984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuC0594m f1985c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0066j f1986d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0586e(C0066j c0066j, C0587f c0587f, C0596o c0596o, MenuC0594m menuC0594m) {
        this.f1986d = c0066j;
        this.f1983a = c0587f;
        this.f1984b = c0596o;
        this.f1985c = menuC0594m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0587f c0587f = this.f1983a;
        if (c0587f != null) {
            C0066j c0066j = this.f1986d;
            ((ViewOnKeyListenerC0588g) c0066j.f312c).f1990A = true;
            c0587f.f1988b.m1184c(false);
            ((ViewOnKeyListenerC0588g) c0066j.f312c).f1990A = false;
        }
        C0596o c0596o = this.f1984b;
        if (c0596o.isEnabled() && c0596o.hasSubMenu()) {
            this.f1985c.m1190q(c0596o, null, 4);
        }
    }
}
