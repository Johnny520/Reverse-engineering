package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: yi */
/* JADX INFO: loaded from: classes.dex */
public final class C2762yi implements InterfaceC2719xi {

    /* JADX INFO: renamed from: a */
    public final int f9397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2805zi f9398b;

    public C2762yi(AbstractC2805zi r1, int r2) {
        this.f9398b = r1;
        this.f9397a = r2;
    }

    @Override // p000.InterfaceC2719xi
    /* JADX INFO: renamed from: a */
    public final boolean mo2838a(ArrayList r6, ArrayList r7) {
        AbstractC2805zi r0 = this.f9398b;
        AbstractComponentCallbacksC1503hi r1 = r0.f9515x;
        int r2 = this.f9397a;
        if (r1 == null) goto L9;
        if (r2 >= 0) goto L9;
        if (r1.m2869c().m5389P(-1, 0) == false) goto L9;
        return false;
    L9:
        return r0.m5390Q(r6, r7, r2, 1);
    }
}
