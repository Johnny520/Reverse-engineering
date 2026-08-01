package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.DatagramSendChannel", m556f = "DatagramSendChannel.kt", m557l = {201, 95}, m558m = "send")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class DatagramSendChannel$send$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4863 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSendChannel$send$1(C4863 c4863, InterfaceC5189<? super DatagramSendChannel$send$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4863;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8993(this);
    }
}
