package io.ktor.util;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.DeflaterKt", m556f = "Deflater.kt", m557l = {37, 38, 39}, m558m = "putGzipHeader")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class DeflaterKt$putGzipHeader$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public DeflaterKt$putGzipHeader$1(InterfaceC5189<? super DeflaterKt$putGzipHeader$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5049.m9195(null, this);
    }
}
