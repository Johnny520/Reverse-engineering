package io.ktor.http.cio;

import com.android.dx.io.Opcodes;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p094.C7205;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", l = {184, 187, 190, 191, 196, 200, Opcodes.REM_DOUBLE_2ADDR, Opcodes.DIV_INT_LIT8, Opcodes.REM_INT_LIT8, 227, 227, 230, 232}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lio/ktor/http/cio/飘花落叶言子楪哲苏世兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class MultipartKt$parseMultipart$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C7205 $boundaryPrefixed;
    final /* synthetic */ InterfaceC4252 $input;
    final /* synthetic */ long $maxPartSize;
    final /* synthetic */ Long $totalLength;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$parseMultipart$1(InterfaceC4252 interfaceC4252, C7205 c7205, long j, Long l, InterfaceC4357<? super MultipartKt$parseMultipart$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$input = interfaceC4252;
        this.$boundaryPrefixed = c7205;
        this.$maxPartSize = j;
        this.$totalLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = new MultipartKt$parseMultipart$1(this.$input, this.$boundaryPrefixed, this.$maxPartSize, this.$totalLength, interfaceC4357);
        multipartKt$parseMultipart$1.L$0 = obj;
        return multipartKt$parseMultipart$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MultipartKt$parseMultipart$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02df, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5211) r0).f14798.mo8433(r2, r20) != r7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0312, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC5211) r0).f14798.mo8433(r2, r20) == r7) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096 A[PHI: r0 r2 r3 r4 r5 r10 r13
  0x0096: PHI (r0v20 long) = (r0v14 long), (r0v32 long) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r2v30 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) = (r2v27 io.ktor.utils.io.飘花落叶言子楪兰苏哲世), (r2v40 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r3v21 kotlinx.coroutines.飘花落叶言子楪哲苏兰世) = (r3v15 kotlinx.coroutines.飘花落叶言子楪哲苏兰世), (r3v25 kotlinx.coroutines.飘花落叶言子楪哲苏兰世) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r4v16 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) = (r4v11 io.ktor.utils.io.飘花落叶言子楪苏世兰哲), (r4v21 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r5v4 java.lang.Object) = (r5v3 java.lang.Object), (r5v9 java.lang.Object) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r10v2 long) = (r10v0 long), (r10v4 long) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r13v8 java.lang.Object) = (r13v7 java.lang.Object), (r13v11 java.lang.Object) binds: [B:18:0x0094, B:60:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176 A[PHI: r0 r3 r4 r9 r10
  0x0176: PHI (r0v39 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) = (r0v4 io.ktor.utils.io.飘花落叶言子楪兰苏哲世), (r0v9 io.ktor.utils.io.飘花落叶言子楪兰苏哲世), (r0v40 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r3v30 java.lang.Object) = (r3v2 java.lang.Object), (r3v4 java.lang.Object), (r3v31 java.lang.Object) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r4v25 long) = (r4v1 long), (r4v5 long), (r4v27 long) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r9v11 int) = (r9v0 int), (r9v0 int), (r9v13 int) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]
  0x0176: PHI (r10v7 long) = (r10v0 long), (r10v0 long), (r10v8 long) binds: [B:37:0x0155, B:42:0x0174, B:72:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0266 A[PHI: r0 r3 r4 r10
  0x0266: PHI (r0v15 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) = (r0v35 io.ktor.utils.io.飘花落叶言子楪兰苏哲世), (r0v39 io.ktor.utils.io.飘花落叶言子楪兰苏哲世) binds: [B:94:0x0265, B:44:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0266: PHI (r3v16 java.lang.Object) = (r3v29 java.lang.Object), (r3v30 java.lang.Object) binds: [B:94:0x0265, B:44:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0266: PHI (r4v12 long) = (r4v24 long), (r4v25 long) binds: [B:94:0x0265, B:44:0x017a] A[DONT_GENERATE, DONT_INLINE]
  0x0266: PHI (r10v1 long) = (r10v6 long), (r10v7 long) binds: [B:94:0x0265, B:44:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0282  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0226 -> B:129:0x022a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt$parseMultipart$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
