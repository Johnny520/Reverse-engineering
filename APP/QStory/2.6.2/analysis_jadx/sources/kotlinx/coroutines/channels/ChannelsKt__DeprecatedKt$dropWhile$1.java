package kotlinx.coroutines.channels;

import com.android.dx.io.Opcodes;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", l = {Opcodes.DIV_INT_LIT16, Opcodes.REM_INT_LIT16, Opcodes.AND_INT_LIT16, Opcodes.RSUB_INT_LIT8, Opcodes.MUL_INT_LIT8}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $predicate;
    final /* synthetic */ InterfaceC5198 $this_dropWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$dropWhile$1(InterfaceC5198 interfaceC5198, InterfaceC6553 interfaceC6553, InterfaceC4356 interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_dropWhile = interfaceC5198;
        this.$predicate = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.$this_dropWhile, this.$predicate, interfaceC4356);
        channelsKt__DeprecatedKt$dropWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356 interfaceC4356) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5210) r0).f14798.mo8443(r2, r10) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5210) r0).f14798.mo8443(r11, r10) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[PHI: r2 r11
  0x0066: PHI (r2v1 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v22 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v23 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:19:0x0062, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r11v3 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:19:0x0062, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc A[PHI: r2 r11
  0x00bc: PHI (r2v6 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v20 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v21 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:34:0x00b9, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x00bc: PHI (r11v20 java.lang.Object) = (r11v26 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x00b9, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:26:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00db -> B:10:0x0021). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
