package io.ktor.util;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", l = {76}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class NonceKt$nonceGeneratorJob$1 extends SuspendLambda implements InterfaceC6553 {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    public NonceKt$nonceGeneratorJob$1(InterfaceC4356<? super NonceKt$nonceGeneratorJob$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new NonceKt$nonceGeneratorJob$1(interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((NonceKt$nonceGeneratorJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Path cross not found for [B:84:0x0059, B:19:0x0062], limit reached: 93 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da A[Catch: all -> 0x003e, LOOP:1: B:37:0x00d8->B:38:0x00da, LOOP_END, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b A[ADDED_TO_REGION, Catch: all -> 0x003e, EDGE_INSN: B:57:0x013b->B:58:0x0153 BREAK  A[LOOP:2: B:48:0x011b->B:56:0x0129], TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155 A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179 A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0174 -> B:62:0x0177). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.NonceKt$nonceGeneratorJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
