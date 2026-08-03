package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: yi */
/* JADX INFO: loaded from: classes.dex */
public final class C2762yi implements InterfaceC2719xi {

    /* JADX INFO: renamed from: a */
    public final int f9397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2805zi f9398b;

    public C2762yi(AbstractC2805zi abstractC2805zi, int i) {
        this.f9398b = abstractC2805zi;
        this.f9397a = i;
    }

    @Override // p000.InterfaceC2719xi
    /* JADX INFO: renamed from: a */
    public final boolean mo2838a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC2805zi abstractC2805zi = this.f9398b;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = abstractC2805zi.f9515x;
        int i = this.f9397a;
        if (abstractComponentCallbacksC1503hi == null || i >= 0 || !abstractComponentCallbacksC1503hi.m2869c().m5389P(-1, 0)) {
            return abstractC2805zi.m5390Q(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
