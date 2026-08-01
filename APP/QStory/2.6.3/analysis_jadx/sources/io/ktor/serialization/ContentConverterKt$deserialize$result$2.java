package io.ktor.serialization;

import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
final class ContentConverterKt$deserialize$result$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4252 $body;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentConverterKt$deserialize$result$2(InterfaceC4252 interfaceC4252, InterfaceC4357<? super ContentConverterKt$deserialize$result$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$body = interfaceC4252;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new ContentConverterKt$deserialize$result$2(this.$body, interfaceC4357);
        contentConverterKt$deserialize$result$2.L$0 = obj;
        return contentConverterKt$deserialize$result$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, InterfaceC4357<? super Boolean> interfaceC4357) {
        return ((ContentConverterKt$deserialize$result$2) create(obj, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC5185.m10210(obj);
            return Boolean.valueOf(this.L$0 != null || this.$body.mo8641());
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
