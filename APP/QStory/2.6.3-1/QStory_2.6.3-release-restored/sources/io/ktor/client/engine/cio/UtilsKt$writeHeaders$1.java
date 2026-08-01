package io.ktor.client.engine.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.UtilsKt", m556f = "utils.kt", m557l = {91, 92, 95}, m558m = "writeHeaders")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class UtilsKt$writeHeaders$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public UtilsKt$writeHeaders$1(InterfaceC5189<? super UtilsKt$writeHeaders$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4702.m8812(null, null, false, false, this);
    }
}
