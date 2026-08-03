package p000a;

import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: a.nb */
/* JADX INFO: loaded from: classes.dex */
public final class C0728nb extends AbstractC0859u9 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DexKitBridge f2849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0690lb f2850d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0728nb(DexKitBridge dexKitBridge, C0690lb c0690lb, int i, int i2) {
        super(0);
        this.f2848b = i2;
        this.f2849c = dexKitBridge;
        this.f2850d = c0690lb;
        this.f2851e = i;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        DexKitBridge dexKitBridge = this.f2849c;
        int i = this.f2851e;
        C0690lb c0690lb = this.f2850d;
        switch (this.f2848b) {
            case 0:
                C0530d3 c0530d3M3326r = dexKitBridge.m3326r(new long[]{AbstractC0417X1.m1061a(i, c0690lb.f2555b)});
                return c0530d3M3326r.isEmpty() ? null : c0530d3M3326r.m1090a();
            case 1:
                ArrayList arrayList = c0690lb.f2559f;
                ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC0417X1.m1061a(i, ((Number) it.next()).intValue())));
                }
                return dexKitBridge.m3326r(C0834t3.m1960x0(arrayList2));
            default:
                C0530d3 c0530d3M3326r2 = dexKitBridge.m3326r(new long[]{AbstractC0417X1.m1061a(i, c0690lb.f2558e)});
                return c0530d3M3326r2.isEmpty() ? null : c0530d3M3326r2.m1090a();
        }
    }
}
