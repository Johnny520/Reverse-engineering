package p000a;

import java.util.Comparator;

/* JADX INFO: renamed from: a.Z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0456Z4 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1720a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.jg.f():a.kg, a.o5.a():java.lang.Object, org.luckypray.dexkit.DexKitBridge.p(a.y6):a.d3, org.luckypray.dexkit.DexKitBridge.q(a.z6):a.ob] */
    public /* synthetic */ C0456Z4(int i) {
        this.f1720a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1720a) {
            case 0:
                return C0889w1.m2147f(((C0492b3) obj).f1827c, ((C0492b3) obj2).f1827c);
            case 1:
                return C0889w1.m2147f(((C0799r6) obj).f3141d, ((C0799r6) obj2).f3141d);
            case 2:
                return C0889w1.m2147f(((C0690lb) obj).f2557d, ((C0690lb) obj2).f2557d);
            default:
                C0657jg.f2467a.getClass();
                return C0889w1.m2147f(Integer.valueOf(C0657jg.m1529g((String) obj2)), Integer.valueOf(C0657jg.m1529g((String) obj)));
        }
    }
}
