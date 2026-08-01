package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: xl */
/* JADX INFO: loaded from: classes.dex */
public final class C0897xl implements InterfaceC0860wl {

    /* JADX INFO: renamed from: a */
    public final int f5172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0934yl f5173b;

    public C0897xl(C0934yl c0934yl, int i) {
        this.f5173b = c0934yl;
        this.f5172a = i;
    }

    @Override // p000.InterfaceC0860wl
    /* JADX INFO: renamed from: a */
    public final boolean mo535a(ArrayList arrayList, ArrayList arrayList2) {
        C0934yl c0934yl = this.f5173b;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0934yl.f5368q;
        int i = this.f5172a;
        if (abstractComponentCallbacksC0489ml == null || i >= 0 || !abstractComponentCallbacksC0489ml.m1834g().m2696G()) {
            return c0934yl.m2697H(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
