package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.InterfaceC5207;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5237 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f14837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5207 f14838;

    public C5237(InterfaceC5207 interfaceC5207, int i) {
        this.f14838 = interfaceC5207;
        this.f14837 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (kotlinx.coroutines.AbstractC5399.m10472(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5318
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.InterfaceC4357 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5185.m10210(r8)
            goto L57
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L31:
            kotlin.AbstractC5185.m10210(r8)
            goto L4c
        L35:
            kotlin.AbstractC5185.m10210(r8)
            kotlin.collections.飘花落叶言子楪兰苏哲世 r8 = new kotlin.collections.飘花落叶言子楪兰苏哲世
            int r2 = r6.f14837
            r8.<init>(r2, r7)
            r0.L$0 = r3
            r0.label = r5
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r6 = r6.f14838
            java.lang.Object r6 = r6.mo8433(r8, r0)
            if (r6 != r1) goto L4c
            goto L56
        L4c:
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5399.m10472(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C5237.emit(java.lang.Object, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }
}
