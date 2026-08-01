package io.ktor.serialization;

import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
final class ContentConverterKt$deserialize$result$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC4251 $body;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentConverterKt$deserialize$result$2(InterfaceC4251 interfaceC4251, InterfaceC4356<? super ContentConverterKt$deserialize$result$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$body = interfaceC4251;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new ContentConverterKt$deserialize$result$2(this.$body, interfaceC4356);
        contentConverterKt$deserialize$result$2.L$0 = obj;
        return contentConverterKt$deserialize$result$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, InterfaceC4356<? super Boolean> interfaceC4356) {
        return ((ContentConverterKt$deserialize$result$2) create(obj, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC5184.m10206(obj);
            return Boolean.valueOf(this.L$0 != null || this.$body.mo8651());
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
