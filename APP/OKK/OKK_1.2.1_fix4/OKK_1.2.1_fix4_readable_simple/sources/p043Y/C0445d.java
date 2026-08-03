package p043Y;

import android.view.ViewGroup;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: Y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0445d extends AbstractC0455n {

    /* JADX INFO: renamed from: a */
    public boolean f975a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f976b;

    public C0445d(ViewGroup r2) {
        this.f975a = false;
        this.f976b = r2;
    }

    @Override // p043Y.AbstractC0455n, p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: a */
    public final void mo1040a() {
        AbstractC0358S.m911t0(this.f976b, false);
    }

    @Override // p043Y.AbstractC0455n, p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: c */
    public final void mo1042c(AbstractC0454m r2) {
        AbstractC0358S.m911t0(this.f976b, false);
        this.f975a = true;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m r3) {
        if (this.f975a == true) goto L5;
        AbstractC0358S.m911t0(this.f976b, false);
    L5:
        r3.mo1062x(this);
    }

    @Override // p043Y.AbstractC0455n, p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: e */
    public final void mo1044e() {
        AbstractC0358S.m911t0(this.f976b, true);
    }
}
