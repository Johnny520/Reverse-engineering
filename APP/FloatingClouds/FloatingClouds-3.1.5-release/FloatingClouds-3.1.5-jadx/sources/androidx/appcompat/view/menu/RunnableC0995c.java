package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ViewOnKeyListenerC0994b;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0995c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewOnKeyListenerC0994b.d f3764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1000h f3765b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0998f f3766c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewOnKeyListenerC0994b.c f3767d;

    public RunnableC0995c(ViewOnKeyListenerC0994b.c cVar, ViewOnKeyListenerC0994b.d dVar, C1000h c1000h, C0998f c0998f) {
        this.f3767d = cVar;
        this.f3764a = dVar;
        this.f3765b = c1000h;
        this.f3766c = c0998f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC0994b.d dVar = this.f3764a;
        if (dVar != null) {
            ViewOnKeyListenerC0994b.c cVar = this.f3767d;
            ViewOnKeyListenerC0994b.this.f3757z = true;
            dVar.f3762b.m2318c(false);
            ViewOnKeyListenerC0994b.this.f3757z = false;
        }
        C1000h c1000h = this.f3765b;
        if (c1000h.isEnabled() && c1000h.hasSubMenu()) {
            this.f3766c.m2332q(c1000h, null, 4);
        }
    }
}
