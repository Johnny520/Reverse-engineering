package io.ktor.server.http.content;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.http.content.PreCompressedKt", m556f = "PreCompressed.kt", m557l = {156, Opcodes.MUL_INT_LIT8, 164, 236}, m558m = "respondStaticPath")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class PreCompressedKt$respondStaticPath$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public PreCompressedKt$respondStaticPath$1(InterfaceC5189<? super PreCompressedKt$respondStaticPath$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4957.m9082(null, null, null, null, null, null, this);
    }
}
