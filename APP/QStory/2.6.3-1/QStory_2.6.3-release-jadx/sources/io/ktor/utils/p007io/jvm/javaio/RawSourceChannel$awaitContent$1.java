package io.ktor.utils.p007io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", m556f = "Reading.kt", m557l = {65}, m558m = "awaitContent")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class RawSourceChannel$awaitContent$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5054 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawSourceChannel$awaitContent$1(C5054 c5054, InterfaceC5189<? super RawSourceChannel$awaitContent$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c5054;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo9201(0, this);
    }
}
