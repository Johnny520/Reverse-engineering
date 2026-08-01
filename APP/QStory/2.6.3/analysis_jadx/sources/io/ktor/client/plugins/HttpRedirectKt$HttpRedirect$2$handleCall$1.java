package io.ktor.client.plugins;

import io.ktor.client.call.C3868;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpRedirectKt", f = "HttpRedirect.kt", l = {91}, m = "HttpRedirect$lambda$2$handleCall")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpRedirectKt$HttpRedirect$2$handleCall$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public HttpRedirectKt$HttpRedirect$2$handleCall$1(InterfaceC4357<? super HttpRedirectKt$HttpRedirect$2$handleCall$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC3934.f12151;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpRedirectKt$HttpRedirect$2$handleCall$1(this);
        }
        ?? r5 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5185.m10210(r5);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.L$7;
        Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.L$3;
        if (this.L$2 != null) {
            throw new ClassCastException();
        }
        if (this.L$0 != null) {
            throw new ClassCastException();
        }
        AbstractC5185.m10210(r5);
        ref$ObjectRef.element = r5;
        ((C3868) ref$ObjectRef2.element).m8250();
        throw null;
    }
}
