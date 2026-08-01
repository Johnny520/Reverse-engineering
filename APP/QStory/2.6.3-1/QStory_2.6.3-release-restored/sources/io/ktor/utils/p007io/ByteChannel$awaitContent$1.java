package io.ktor.utils.p007io;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteChannel", m556f = "ByteChannel.kt", m557l = {279}, m558m = "awaitContent")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ByteChannel$awaitContent$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5081 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannel$awaitContent$1(C5081 c5081, InterfaceC5189<? super ByteChannel$awaitContent$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c5081;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo9201(0, this);
    }
}
