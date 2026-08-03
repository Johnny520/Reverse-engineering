package androidx.lifecycle;

import android.os.Bundle;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p031Q0.AbstractC0307g;
import p039V.C0396e;
import p039V.InterfaceC0395d;

/* JADX INFO: renamed from: androidx.lifecycle.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0519H implements InterfaceC0395d {

    /* JADX INFO: renamed from: a */
    public final C0396e f1463a;

    /* JADX INFO: renamed from: b */
    public boolean f1464b;

    /* JADX INFO: renamed from: c */
    public Bundle f1465c;

    /* JADX INFO: renamed from: d */
    public final C0142h f1466d;

    public C0519H(C0396e r2, InterfaceC0522K r3) {
        AbstractC0307g.m703e(r2, "savedStateRegistry");
        AbstractC0307g.m703e(r3, "viewModelStoreOwner");
        this.f1463a = r2;
        this.f1466d = AbstractC0040p.m81E(new C0518G(r3));
    }
}
