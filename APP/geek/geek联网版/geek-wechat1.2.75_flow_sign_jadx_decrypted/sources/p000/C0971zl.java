package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: zl */
/* JADX INFO: loaded from: classes.dex */
public final class C0971zl implements InterfaceC0934yl {

    /* JADX INFO: renamed from: a */
    public final int f5599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0023am f5600b;

    public C0971zl(C0023am c0023am, int i) {
        this.f5600b = c0023am;
        this.f5599a = i;
    }

    @Override // p000.InterfaceC0934yl
    /* JADX INFO: renamed from: a */
    public final boolean mo1745a(ArrayList arrayList, ArrayList arrayList2) {
        C0023am c0023am = this.f5600b;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0023am.f110q;
        int i = this.f5599a;
        if (abstractComponentCallbacksC0563ol == null || i >= 0 || !abstractComponentCallbacksC0563ol.m2036g().m62G()) {
            return c0023am.m63H(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
