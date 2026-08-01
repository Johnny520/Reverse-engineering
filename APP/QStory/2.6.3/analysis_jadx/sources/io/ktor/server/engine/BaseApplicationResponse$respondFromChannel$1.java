package io.ktor.server.engine;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.BaseApplicationResponse", f = "BaseApplicationResponse.kt", l = {Opcodes.REM_INT_LIT16, Opcodes.OR_INT_LIT16, Opcodes.DIV_INT_LIT8}, m = "respondFromChannel$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BaseApplicationResponse$respondFromChannel$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4108 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondFromChannel$1(AbstractC4108 abstractC4108, InterfaceC4357<? super BaseApplicationResponse$respondFromChannel$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4108;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4108.m8509(this.this$0, null, this);
    }
}
