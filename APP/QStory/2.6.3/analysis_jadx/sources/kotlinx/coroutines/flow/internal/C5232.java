package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5232 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5318 f14825;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5401 f14826;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5236 f14827;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f14828;

    public C5232(Ref$ObjectRef ref$ObjectRef, InterfaceC5401 interfaceC5401, C5236 c5236, InterfaceC5318 interfaceC5318) {
        this.f14828 = ref$ObjectRef;
        this.f14826 = interfaceC5401;
        this.f14827 = c5236;
        this.f14825 = interfaceC5318;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, kotlinx.coroutines.飘花落叶言子哲楪世兰苏] */
    @Override // kotlinx.coroutines.flow.InterfaceC5318
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.InterfaceC4357 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            kotlin.jvm.internal.Ref$ObjectRef r4 = r6.f14828
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r7 = (kotlinx.coroutines.InterfaceC5452) r7
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r7 = (kotlinx.coroutines.InterfaceC5452) r7
            java.lang.Object r7 = r0.L$0
            kotlin.AbstractC5185.m10210(r8)
            goto L5d
        L34:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L3a:
            kotlin.AbstractC5185.m10210(r8)
            T r8 = r4.element
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r8 = (kotlinx.coroutines.InterfaceC5452) r8
            if (r8 == 0) goto L5d
            kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r2.<init>()
            r8.mo10256(r2)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r3
            r2 = 0
            r0.I$0 = r2
            r0.label = r5
            java.lang.Object r8 = r8.mo10564(r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            kotlinx.coroutines.CoroutineStart r8 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
            kotlinx.coroutines.flow.internal.飘花落叶言子楪苏哲世兰 r1 = r6.f14827
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r2 = r6.f14825
            r0.<init>(r1, r2, r7, r3)
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r6 = r6.f14826
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r6 = kotlinx.coroutines.AbstractC5399.m10477(r6, r3, r8, r0, r5)
            r4.element = r6
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C5232.emit(java.lang.Object, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }
}
