package io.ktor.client.plugins;

import io.ktor.client.call.C4700;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpRedirectKt", m556f = "HttpRedirect.kt", m557l = {91}, m558m = "HttpRedirect$lambda$2$handleCall")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
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

    public HttpRedirectKt$HttpRedirect$2$handleCall$1(InterfaceC5189<? super HttpRedirectKt$HttpRedirect$2$handleCall$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC4766.f12496;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpRedirectKt$HttpRedirect$2$handleCall$1(this);
        }
        ?? r5 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC6017.m10769(r5);
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
        AbstractC6017.m10769(r5);
        ref$ObjectRef.element = r5;
        ((C4700) ref$ObjectRef2.element).m8809();
        throw null;
    }
}
