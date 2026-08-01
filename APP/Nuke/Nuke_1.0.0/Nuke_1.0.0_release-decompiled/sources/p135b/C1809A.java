package p135b;

import android.window.OnBackInvokedDispatcher;
import p000A.C0099z;
import p030F1.C0447l;
import p049I2.AbstractC0797o;
import p056K2.C0887m;

/* JADX INFO: renamed from: b.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1809A {

    /* JADX INFO: renamed from: a */
    public final Runnable f6190a;

    /* JADX INFO: renamed from: b */
    public boolean f6191b;

    /* JADX INFO: renamed from: c */
    public final C0887m f6192c = AbstractC0797o.m1396u(new C0099z(15, this));

    public C1809A(Runnable runnable) {
        this.f6190a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final C1837y m3285a() {
        return (C1837y) this.f6192c.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m3286b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m3285a().f6237c.m701c(new C0447l(onBackInvokedDispatcher, 0), 1);
        m3285a().f6237c.m701c(new C0447l(onBackInvokedDispatcher, 1000000), 0);
    }
}
