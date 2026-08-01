package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {464, 466}, m = "minWith", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$minWith$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$minWith$1(InterfaceC4357<? super ChannelsKt__DeprecatedKt$minWith$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:12:0x0040, B:29:0x0098, B:31:0x00a0, B:26:0x007f), top: B:48:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0095 -> B:29:0x0098). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r10.result = r11
            int r11 = r10.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 | r0
            r10.label = r11
            r1 = r11 & r0
            if (r1 == 0) goto L11
            int r11 = r11 - r0
            r10.label = r11
            goto L17
        L11:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r11 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r11.<init>(r10)
            r10 = r11
        L17:
            java.lang.Object r11 = r10.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            if (r1 == 0) goto Lb5
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L4e
            if (r1 != r3) goto L48
            int r1 = r10.I$1
            int r4 = r10.I$0
            java.lang.Object r5 = r10.L$5
            java.lang.Object r6 = r10.L$4
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r6 = (kotlinx.coroutines.channels.InterfaceC5212) r6
            java.lang.Object r7 = r10.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r7 = (kotlinx.coroutines.channels.InterfaceC5199) r7
            java.lang.Object r7 = r10.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r7 = (kotlinx.coroutines.channels.InterfaceC5199) r7
            java.lang.Object r8 = r10.L$1
            java.util.Comparator r8 = (java.util.Comparator) r8
            java.lang.Object r9 = r10.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r9 = (kotlinx.coroutines.channels.InterfaceC5199) r9
            kotlin.AbstractC5185.m10210(r11)     // Catch: java.lang.Throwable -> L44
            goto L98
        L44:
            r10 = move-exception
            r2 = r7
            goto Lba
        L48:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r10)
            return r2
        L4e:
            int r1 = r10.I$1
            int r4 = r10.I$0
            java.lang.Object r5 = r10.L$4
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r5 = (kotlinx.coroutines.channels.InterfaceC5212) r5
            java.lang.Object r6 = r10.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r6 = (kotlinx.coroutines.channels.InterfaceC5199) r6
            java.lang.Object r6 = r10.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r6 = (kotlinx.coroutines.channels.InterfaceC5199) r6
            java.lang.Object r7 = r10.L$1
            java.util.Comparator r7 = (java.util.Comparator) r7
            java.lang.Object r8 = r10.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = (kotlinx.coroutines.channels.InterfaceC5199) r8
            kotlin.AbstractC5185.m10210(r11)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb3
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb3
            if (r11 != 0) goto L75
            r6.mo10256(r2)
            return r2
        L75:
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r5 = (kotlinx.coroutines.channels.C5191) r5     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r11 = r5.m10262()     // Catch: java.lang.Throwable -> Lb3
            r8 = r7
            r7 = r6
            r6 = r5
        L7e:
            r5 = r11
        L7f:
            r10.L$0 = r2     // Catch: java.lang.Throwable -> L44
            r10.L$1 = r8     // Catch: java.lang.Throwable -> L44
            r10.L$2 = r7     // Catch: java.lang.Throwable -> L44
            r10.L$3 = r2     // Catch: java.lang.Throwable -> L44
            r10.L$4 = r6     // Catch: java.lang.Throwable -> L44
            r10.L$5 = r5     // Catch: java.lang.Throwable -> L44
            r10.I$0 = r4     // Catch: java.lang.Throwable -> L44
            r10.I$1 = r1     // Catch: java.lang.Throwable -> L44
            r10.label = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r11 = r6.m10264(r10)     // Catch: java.lang.Throwable -> L44
            if (r11 != r0) goto L98
            return r0
        L98:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L44
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r11 == 0) goto Lad
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.channels.C5191) r6     // Catch: java.lang.Throwable -> L44
            java.lang.Object r11 = r6.m10262()     // Catch: java.lang.Throwable -> L44
            int r9 = r8.compare(r5, r11)     // Catch: java.lang.Throwable -> L44
            if (r9 <= 0) goto L7f
            goto L7e
        Lad:
            r7.mo10256(r2)
            return r5
        Lb1:
            r2 = r6
            goto Lba
        Lb3:
            r10 = move-exception
            goto Lb1
        Lb5:
            kotlin.AbstractC5185.m10210(r11)
            throw r2     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r10 = move-exception
        Lba:
            throw r10     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r11 = move-exception
            kotlinx.coroutines.channels.AbstractC5205.m10278(r2, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
