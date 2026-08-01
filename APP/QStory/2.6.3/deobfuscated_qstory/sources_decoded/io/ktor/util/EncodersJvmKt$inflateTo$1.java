package io.ktor.util;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", l = {167}, m = "inflateTo")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class EncodersJvmKt$inflateTo$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;

    public EncodersJvmKt$inflateTo$1(InterfaceC4357<? super EncodersJvmKt$inflateTo$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4217.m8625(null, null, null, null, this);
    }
}
