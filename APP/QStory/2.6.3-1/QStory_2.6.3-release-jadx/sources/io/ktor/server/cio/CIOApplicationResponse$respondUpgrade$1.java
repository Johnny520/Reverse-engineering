package io.ktor.server.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.CIOApplicationResponse", m556f = "CIOApplicationResponse.kt", m557l = {51, 54, 55, 57, 57}, m558m = "respondUpgrade")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class CIOApplicationResponse$respondUpgrade$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4917 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationResponse$respondUpgrade$1(C4917 c4917, InterfaceC5189<? super CIOApplicationResponse$respondUpgrade$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4917;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo9043(null, this);
    }
}
