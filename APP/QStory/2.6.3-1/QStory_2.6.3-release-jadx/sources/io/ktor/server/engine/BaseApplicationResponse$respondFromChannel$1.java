package io.ktor.server.engine;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.BaseApplicationResponse", m556f = "BaseApplicationResponse.kt", m557l = {Opcodes.REM_INT_LIT16, Opcodes.OR_INT_LIT16, Opcodes.DIV_INT_LIT8}, m558m = "respondFromChannel$suspendImpl")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class BaseApplicationResponse$respondFromChannel$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4940 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondFromChannel$1(AbstractC4940 abstractC4940, InterfaceC5189<? super BaseApplicationResponse$respondFromChannel$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC4940;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4940.m9068(this.this$0, null, this);
    }
}
