package io.ktor.server.engine;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.BaseApplicationEngineKt", f = "BaseApplicationEngine.kt", l = {129}, m = "verifyHostHeader")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BaseApplicationEngineKt$verifyHostHeader$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public BaseApplicationEngineKt$verifyHostHeader$1(InterfaceC4357<? super BaseApplicationEngineKt$verifyHostHeader$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4093.m8494(null, this);
    }
}
