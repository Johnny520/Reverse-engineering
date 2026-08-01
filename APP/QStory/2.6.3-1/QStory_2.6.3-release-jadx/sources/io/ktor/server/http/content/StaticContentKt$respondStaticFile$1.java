package io.ktor.server.http.content;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.http.content.StaticContentKt", m556f = "StaticContent.kt", m557l = {586, 588, 590, 594, 595, 602}, m558m = "respondStaticFile")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class StaticContentKt$respondStaticFile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;

    public StaticContentKt$respondStaticFile$1(InterfaceC5189<? super StaticContentKt$respondStaticFile$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4954.m9078(null, null, null, null, null, null, null, null, null, null, this);
    }
}
