package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC5199;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {667, 272}, m = "filterNotNullTo", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends InterfaceC5199> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$3(InterfaceC4356<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Path cross not found for [B:20:0x0072, B:23:0x0094], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[Catch: all -> 0x0037, PHI: r0 r5 r6 r7 r8 r9 r12
  0x0062: PHI (r0v4 int) = (r0v3 int), (r0v5 int) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r7v2 java.lang.Object) = (r7v11 java.lang.Object), (r7v12 java.lang.Object) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r8v5 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲) = (r8v4 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲), (r8v6 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r9v4 kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世) = (r9v3 kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世), (r9v5 kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r12v2 java.lang.Object) = (r12v0 java.lang.Object), (r12v7 java.lang.Object) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0037, blocks: (B:8:0x0033, B:23:0x0094, B:16:0x0062, B:18:0x006a, B:20:0x0072, B:15:0x005f), top: B:35:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:8:0x0033, B:23:0x0094, B:16:0x0062, B:18:0x006a, B:20:0x0072, B:15:0x005f), top: B:35:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:23:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0091 -> B:23:0x0094). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r11.result = r12
            int r0 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r11.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            if (r0 == 0) goto Lb9
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L41
            if (r0 != r3) goto L3b
            int r0 = r11.I$2
            int r5 = r11.I$1
            int r6 = r11.I$0
            java.lang.Object r7 = r11.L$5
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5211) r7
            java.lang.Object r8 = r11.L$4
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = (kotlinx.coroutines.channels.InterfaceC5198) r8
            java.lang.Object r8 = r11.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = (kotlinx.coroutines.channels.InterfaceC5198) r8
            java.lang.Object r9 = r11.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r9 = (kotlinx.coroutines.channels.InterfaceC5198) r9
            java.lang.Object r9 = r11.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r9 = (kotlinx.coroutines.channels.InterfaceC5199) r9
            java.lang.Object r10 = r11.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r10 = (kotlinx.coroutines.channels.InterfaceC5198) r10
            kotlin.AbstractC5184.m10206(r12)     // Catch: java.lang.Throwable -> L37
            goto L94
        L37:
            r11 = move-exception
            r2 = r8
            goto Lbe
        L3b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r2
        L41:
            int r0 = r11.I$2
            int r5 = r11.I$1
            int r6 = r11.I$0
            java.lang.Object r7 = r11.L$5
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = (kotlinx.coroutines.channels.InterfaceC5211) r7
            java.lang.Object r8 = r11.L$4
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = (kotlinx.coroutines.channels.InterfaceC5198) r8
            java.lang.Object r8 = r11.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r8 = (kotlinx.coroutines.channels.InterfaceC5198) r8
            java.lang.Object r9 = r11.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r9 = (kotlinx.coroutines.channels.InterfaceC5198) r9
            java.lang.Object r9 = r11.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r9 = (kotlinx.coroutines.channels.InterfaceC5199) r9
            java.lang.Object r10 = r11.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r10 = (kotlinx.coroutines.channels.InterfaceC5198) r10
            kotlin.AbstractC5184.m10206(r12)     // Catch: java.lang.Throwable -> L37
        L62:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L37
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto Lb5
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.channels.C5190) r7     // Catch: java.lang.Throwable -> L37
            java.lang.Object r12 = r7.m10258()     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto L94
            r11.L$0 = r2     // Catch: java.lang.Throwable -> L37
            r11.L$1 = r9     // Catch: java.lang.Throwable -> L37
            r11.L$2 = r2     // Catch: java.lang.Throwable -> L37
            r11.L$3 = r8     // Catch: java.lang.Throwable -> L37
            r11.L$4 = r2     // Catch: java.lang.Throwable -> L37
            r11.L$5 = r7     // Catch: java.lang.Throwable -> L37
            r11.L$6 = r2     // Catch: java.lang.Throwable -> L37
            r11.L$7 = r2     // Catch: java.lang.Throwable -> L37
            r11.I$0 = r6     // Catch: java.lang.Throwable -> L37
            r11.I$1 = r5     // Catch: java.lang.Throwable -> L37
            r11.I$2 = r0     // Catch: java.lang.Throwable -> L37
            r10 = 0
            r11.I$3 = r10     // Catch: java.lang.Throwable -> L37
            r11.label = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r12 = r9.mo8443(r12, r11)     // Catch: java.lang.Throwable -> L37
            if (r12 != r1) goto L94
            goto Lb4
        L94:
            r11.L$0 = r2     // Catch: java.lang.Throwable -> L37
            r11.L$1 = r9     // Catch: java.lang.Throwable -> L37
            r11.L$2 = r2     // Catch: java.lang.Throwable -> L37
            r11.L$3 = r8     // Catch: java.lang.Throwable -> L37
            r11.L$4 = r2     // Catch: java.lang.Throwable -> L37
            r11.L$5 = r7     // Catch: java.lang.Throwable -> L37
            r11.L$6 = r2     // Catch: java.lang.Throwable -> L37
            r11.L$7 = r2     // Catch: java.lang.Throwable -> L37
            r11.I$0 = r6     // Catch: java.lang.Throwable -> L37
            r11.I$1 = r5     // Catch: java.lang.Throwable -> L37
            r11.I$2 = r0     // Catch: java.lang.Throwable -> L37
            r11.label = r4     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r7 = (kotlinx.coroutines.channels.C5190) r7     // Catch: java.lang.Throwable -> L37
            java.lang.Object r12 = r7.m10260(r11)     // Catch: java.lang.Throwable -> L37
            if (r12 != r1) goto L62
        Lb4:
            return r1
        Lb5:
            r8.mo10252(r2)
            return r9
        Lb9:
            kotlin.AbstractC5184.m10206(r12)
            throw r2     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r11 = move-exception
        Lbe:
            throw r11     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r12 = move-exception
            kotlinx.coroutines.channels.AbstractC5204.m10274(r2, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
