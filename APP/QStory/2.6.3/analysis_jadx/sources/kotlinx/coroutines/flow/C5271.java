package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5271 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5318 f14859;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$BooleanRef f14860;

    public C5271(Ref$BooleanRef ref$BooleanRef, InterfaceC5318 interfaceC5318) {
        this.f14860 = ref$BooleanRef;
        this.f14859 = interfaceC5318;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        return m10314(((Number) obj).intValue(), interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10314(int r6, kotlin.coroutines.InterfaceC4357 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            kotlin.AbstractC5185.m10210(r7)
            return r3
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L30:
            kotlin.AbstractC5185.m10210(r7)
            if (r6 <= 0) goto L4c
            kotlin.jvm.internal.Ref$BooleanRef r7 = r5.f14860
            boolean r2 = r7.element
            if (r2 != 0) goto L4c
            r7.element = r4
            kotlinx.coroutines.flow.SharingCommand r7 = kotlinx.coroutines.flow.SharingCommand.START
            r0.I$0 = r6
            r0.label = r4
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r5 = r5.f14859
            java.lang.Object r5 = r5.emit(r7, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5271.m10314(int, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }
}
