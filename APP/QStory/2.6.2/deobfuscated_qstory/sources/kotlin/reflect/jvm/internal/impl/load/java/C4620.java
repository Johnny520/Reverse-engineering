package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import p066.InterfaceC6879;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4620 implements InterfaceC6879 {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r4.equals(p000.AbstractC6087.m11410(r0, 2)) != false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // p066.InterfaceC6879
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result mo9244(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480 r5, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480 r6, p079.AbstractC6988 r7) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            boolean r4 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479
            if (r4 == 0) goto La5
            boolean r4 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
            if (r4 == 0) goto La5
            boolean r4 = p049.AbstractC6529.m11969(r6)
            if (r4 == 0) goto L16
            goto La5
        L16:
            int r4 = kotlin.reflect.jvm.internal.impl.load.java.AbstractC4606.f13454
            r4 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483) r4
            r0 = r4
            飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世苏兰 r0 = (p079.AbstractC7008) r0
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r1 = r0.getName()
            r1.getClass()
            java.util.Set r2 = kotlin.reflect.jvm.internal.impl.load.java.AbstractC4601.f13435
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L40
            java.util.ArrayList r1 = kotlin.reflect.jvm.internal.impl.load.java.AbstractC4601.f13439
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r0 = r0.getName()
            r0.getClass()
            java.util.HashSet r1 = kotlin.reflect.jvm.internal.impl.load.java.AbstractC4601.f13444
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L40
            goto La5
        L40:
            r0 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲苏兰 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479) r0
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲苏兰 r0 = com.alibaba.fastjson2.AbstractC2904.m6260(r0)
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
            if (r1 == 0) goto L4f
            r2 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483) r2
            goto L50
        L4f:
            r2 = 0
        L50:
            if (r2 == 0) goto L5d
            boolean r3 = r4.mo9050()
            boolean r2 = r2.mo9050()
            if (r3 != r2) goto L5d
            goto L66
        L5d:
            if (r0 == 0) goto La2
            boolean r2 = r4.mo9050()
            if (r2 != 0) goto L66
            goto La2
        L66:
            boolean r2 = r7 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4599
            if (r2 == 0) goto La5
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r2 = r4.mo9048()
            if (r2 == 0) goto L71
            goto La5
        L71:
            if (r0 == 0) goto La5
            boolean r7 = com.alibaba.fastjson2.AbstractC2904.m6244(r7, r0)
            if (r7 == 0) goto L7a
            goto La5
        L7a:
            boolean r7 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483
            if (r7 == 0) goto La2
            if (r1 == 0) goto La2
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483) r0
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r7 = kotlin.reflect.jvm.internal.impl.load.java.AbstractC4606.m9227(r0)
            if (r7 == 0) goto La2
            r7 = 2
            java.lang.String r4 = p000.AbstractC6087.m11410(r4, r7)
            r0 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483) r0
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲 r0 = r0.mo9012()
            r0.getClass()
            java.lang.String r7 = p000.AbstractC6087.m11410(r0, r7)
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto La2
            goto La5
        La2:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result.INCOMPATIBLE
            return r4
        La5:
            boolean r4 = androidx.compose.foundation.draganddrop.AbstractC0455.m1160(r5, r6)
            if (r4 == 0) goto Lae
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result.INCOMPATIBLE
            return r4
        Lae:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result.UNKNOWN
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C4620.mo9244(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世苏兰哲, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世苏兰哲, 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰):kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result");
    }

    @Override // p066.InterfaceC6879
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ExternalOverridabilityCondition$Contract mo9245() {
        return ExternalOverridabilityCondition$Contract.CONFLICTS_ONLY;
    }
}
