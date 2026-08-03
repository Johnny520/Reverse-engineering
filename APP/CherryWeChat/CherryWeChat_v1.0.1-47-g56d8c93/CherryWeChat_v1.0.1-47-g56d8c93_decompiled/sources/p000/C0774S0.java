package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0774S0 implements InterfaceC2713xc {

    /* JADX INFO: renamed from: b */
    public static C0774S0 f2447b;

    /* JADX INFO: renamed from: a */
    public final Object f2448a;

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: c */
    public void mo232c() {
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: j */
    public Object mo237j() {
        return this.f2448a;
    }

    public C0774S0() {
        this.f2448a = new Object();
        new Handler(Looper.getMainLooper(), new C0284Gj(1, this));
    }
}
