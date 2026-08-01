package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {153, 156}, m = "lastOrNull", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$lastOrNull$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$lastOrNull$1(InterfaceC4357<? super ChannelsKt__DeprecatedKt$lastOrNull$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003c, B:28:0x008c, B:30:0x0094, B:25:0x0075), top: B:44:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:28:0x008c). Please report as a decompilation issue!!! */
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
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r10 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r10.<init>(r9)
            r9 = r10
        L17:
            java.lang.Object r10 = r9.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 0
            if (r1 == 0) goto La3
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
            goto L8c
        L40:
            r9 = move-exception
            r2 = r7
            goto La8
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
            kotlin.AbstractC5185.m10210(r10)     // Catch: java.lang.Throwable -> La1
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
            if (r10 != 0) goto L6c
            r6.mo10256(r2)
            return r2
        L6c:
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r5 = (kotlinx.coroutines.channels.C5191) r5     // Catch: java.lang.Throwable -> La1
            java.lang.Object r10 = r5.m10262()     // Catch: java.lang.Throwable -> La1
            r7 = r6
            r6 = r5
            r5 = r10
        L75:
            r9.L$0 = r2     // Catch: java.lang.Throwable -> L40
            r9.L$1 = r7     // Catch: java.lang.Throwable -> L40
            r9.L$2 = r2     // Catch: java.lang.Throwable -> L40
            r9.L$3 = r6     // Catch: java.lang.Throwable -> L40
            r9.L$4 = r5     // Catch: java.lang.Throwable -> L40
            r9.I$0 = r4     // Catch: java.lang.Throwable -> L40
            r9.I$1 = r1     // Catch: java.lang.Throwable -> L40
            r9.label = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r10 = r6.m10264(r9)     // Catch: java.lang.Throwable -> L40
            if (r10 != r0) goto L8c
            return r0
        L8c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L40
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L40
            if (r10 == 0) goto L9b
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.channels.C5191) r6     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r6.m10262()     // Catch: java.lang.Throwable -> L40
            goto L75
        L9b:
            r7.mo10256(r2)
            return r5
        L9f:
            r2 = r6
            goto La8
        La1:
            r9 = move-exception
            goto L9f
        La3:
            kotlin.AbstractC5185.m10210(r10)
            throw r2     // Catch: java.lang.Throwable -> La7
        La7:
            r9 = move-exception
        La8:
            throw r9     // Catch: java.lang.Throwable -> La9
        La9:
            r10 = move-exception
            kotlinx.coroutines.channels.AbstractC5205.m10278(r2, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
