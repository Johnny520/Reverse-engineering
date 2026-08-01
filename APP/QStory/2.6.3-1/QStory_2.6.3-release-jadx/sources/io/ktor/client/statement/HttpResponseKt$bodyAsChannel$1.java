package io.ktor.client.statement;

import bsh.C3466;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.statement.HttpResponseKt", m556f = "HttpResponse.kt", m557l = {123}, m558m = "bodyAsChannel")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpResponseKt$bodyAsChannel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public HttpResponseKt$bodyAsChannel$1(InterfaceC5189<? super HttpResponseKt$bodyAsChannel$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpResponseKt$bodyAsChannel$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj2);
        if (obj2 != null) {
            return (InterfaceC5084) obj2;
        }
        C3466.m5903("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
        return null;
    }
}
