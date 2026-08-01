package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {127, 130}, m = "last", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$last$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$last$1(InterfaceC4357<? super ChannelsKt__DeprecatedKt$last$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003c, B:26:0x0088, B:28:0x0090, B:23:0x0071), top: B:44:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:26:0x0088). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.result = r10
            int r10 = r9.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.label = r10
            r1 = r10 & r0
            if (r1 == 0) goto L11
            int r10 = r10 - r0
            r9.label = r10
            goto L17
        L11:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r10 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r10.<init>(r9)
            r9 = r10
        L17:
            java.lang.Object r10 = r9.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 0
            if (r1 == 0) goto La7
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L49
            if (r1 != r3) goto L43
            int r1 = r9.I$1
            int r4 = r9.I$0
            java.lang.Object r5 = r9.L$4
            java.lang.Object r6 = r9.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r6 = (kotlinx.coroutines.channels.InterfaceC5212) r6
            java.lang.Object r7 = r9.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r7 = (kotlinx.coroutines.channels.InterfaceC5199) r7
            java.lang.Object r7 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r7 = (kotlinx.coroutines.channels.InterfaceC5199) r7
            java.lang.Object r8 = r9.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = (kotlinx.coroutines.channels.InterfaceC5199) r8
            kotlin.AbstractC5185.m10210(r10)     // Catch: java.lang.Throwable -> L40
            goto L88
        L40:
            r9 = move-exception
            r2 = r7
            goto Lac
        L43:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r2
        L49:
            int r1 = r9.I$1
            int r4 = r9.I$0
            java.lang.Object r5 = r9.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r5 = (kotlinx.coroutines.channels.InterfaceC5212) r5
            java.lang.Object r6 = r9.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r6 = (kotlinx.coroutines.channels.InterfaceC5199) r6
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r6 = (kotlinx.coroutines.channels.InterfaceC5199) r6
            java.lang.Object r7 = r9.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r7 = (kotlinx.coroutines.channels.InterfaceC5199) r7
            kotlin.AbstractC5185.m10210(r10)     // Catch: java.lang.Throwable -> La5
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La5
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La5
            if (r10 == 0) goto L9d
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r5 = (kotlinx.coroutines.channels.C5191) r5     // Catch: java.lang.Throwable -> La5
            java.lang.Object r10 = r5.m10262()     // Catch: java.lang.Throwable -> La5
            r7 = r6
            r6 = r5
            r5 = r10
        L71:
            r9.L$0 = r2     // Catch: java.lang.Throwable -> L40
            r9.L$1 = r7     // Catch: java.lang.Throwable -> L40
            r9.L$2 = r2     // Catch: java.lang.Throwable -> L40
            r9.L$3 = r6     // Catch: java.lang.Throwable -> L40
            r9.L$4 = r5     // Catch: java.lang.Throwable -> L40
            r9.I$0 = r4     // Catch: java.lang.Throwable -> L40
            r9.I$1 = r1     // Catch: java.lang.Throwable -> L40
            r9.label = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r10 = r6.m10264(r9)     // Catch: java.lang.Throwable -> L40
            if (r10 != r0) goto L88
            return r0
        L88:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L40
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L40
            if (r10 == 0) goto L97
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.channels.C5191) r6     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r6.m10262()     // Catch: java.lang.Throwable -> L40
            goto L71
        L97:
            r7.mo10256(r2)
            return r5
        L9b:
            r2 = r6
            goto Lac
        L9d:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> La5
            java.lang.String r10 = "ReceiveChannel is empty."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> La5
            throw r9     // Catch: java.lang.Throwable -> La5
        La5:
            r9 = move-exception
            goto L9b
        La7:
            kotlin.AbstractC5185.m10210(r10)
            throw r2     // Catch: java.lang.Throwable -> Lab
        Lab:
            r9 = move-exception
        Lac:
            throw r9     // Catch: java.lang.Throwable -> Lad
        Lad:
            r10 = move-exception
            kotlinx.coroutines.channels.AbstractC5205.m10278(r2, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
