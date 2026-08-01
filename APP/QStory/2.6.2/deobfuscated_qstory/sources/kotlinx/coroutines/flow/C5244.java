package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5244 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5317 f14844;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$IntRef f14845;

    public C5244(Ref$IntRef ref$IntRef, InterfaceC5317 interfaceC5317) {
        this.f14845 = ref$IntRef;
        this.f14844 = interfaceC5317;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5317
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.InterfaceC4356 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L2a
            kotlin.AbstractC5184.m10206(r8)
            return r4
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L30:
            kotlin.AbstractC5184.m10206(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = r6.f14845
            int r2 = r8.element
            if (r2 < r5) goto L47
            r0.L$0 = r3
            r0.label = r5
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r6 = r6.f14844
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            return r4
        L47:
            int r2 = r2 + r5
            r8.element = r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5244.emit(java.lang.Object, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }
}
