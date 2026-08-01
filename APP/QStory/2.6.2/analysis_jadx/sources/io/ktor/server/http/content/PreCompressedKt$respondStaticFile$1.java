package io.ktor.server.http.content;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.http.content.PreCompressedKt", f = "PreCompressed.kt", l = {128, Opcodes.MUL_INT_LIT8, 136, 236}, m = "respondStaticFile")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PreCompressedKt$respondStaticFile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public PreCompressedKt$respondStaticFile$1(InterfaceC4356<? super PreCompressedKt$respondStaticFile$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4124.m8535(null, null, null, null, null, null, this);
    }
}
