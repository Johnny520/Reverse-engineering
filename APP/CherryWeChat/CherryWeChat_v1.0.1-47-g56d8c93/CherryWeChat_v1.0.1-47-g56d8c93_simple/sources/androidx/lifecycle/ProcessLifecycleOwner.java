package androidx.lifecycle;

import android.os.Handler;
import p000.AbstractC0760Rn;
import p000.C1017Xm;
import p000.C1185ao;
import p000.EnumC0632On;
import p000.InterfaceC1061Yn;
import p000.RunnableC0562N2;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleOwner implements InterfaceC1061Yn {

    /* JADX INFO: renamed from: i */
    public static final ProcessLifecycleOwner f3964i = null;

    /* JADX INFO: renamed from: a */
    public int f3965a;

    /* JADX INFO: renamed from: b */
    public int f3966b;

    /* JADX INFO: renamed from: c */
    public boolean f3967c;

    /* JADX INFO: renamed from: d */
    public boolean f3968d;

    /* JADX INFO: renamed from: e */
    public Handler f3969e;

    /* JADX INFO: renamed from: f */
    public final C1185ao f3970f;

    /* JADX INFO: renamed from: g */
    public final RunnableC0562N2 f3971g;

    /* JADX INFO: renamed from: h */
    public final C1017Xm f3972h;

    static {
        f3964i = new ProcessLifecycleOwner();
    }

    private ProcessLifecycleOwner() {
        this.f3967c = true;
        this.f3968d = true;
        this.f3970f = new C1185ao(this);
        this.f3971g = new RunnableC0562N2(21, this);
        this.f3972h = new C1017Xm(11, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m2167a() {
        int r0 = this.f3966b + 1;
        this.f3966b = r0;
        if (r0 == 1) goto L5;
        return;
    L5:
        if (this.f3967c == false) goto L8;
        this.f3970f.m2276e(EnumC0632On.ON_RESUME);
        this.f3967c = false;
        return;
    L8:
        this.f3969e.removeCallbacks(this.f3971g);
    }

    @Override // p000.InterfaceC1061Yn
    public final AbstractC0760Rn getLifecycle() {
        return this.f3970f;
    }
}
