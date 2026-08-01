package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.MultipartKt", m556f = "Multipart.kt", m557l = {117, 118, 118, 121}, m558m = "parsePartBodyImpl")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class MultipartKt$parsePartBodyImpl$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public MultipartKt$parsePartBodyImpl$1(InterfaceC5189<? super MultipartKt$parsePartBodyImpl$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4801.m8924(null, null, null, null, 0L, this);
    }
}
