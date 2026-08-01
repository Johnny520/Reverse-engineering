package io.ktor.serialization;

import io.ktor.http.content.C3992;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.InterfaceC5087;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5321;
import p059.C6857;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", l = {97}, m = "deserialize")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ContentConverterKt$deserialize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ContentConverterKt$deserialize$1(InterfaceC4357<? super ContentConverterKt$deserialize$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ContentConvertException {
        InterfaceC4252 interfaceC4252;
        C6857 c6857;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4049 c4049 = new C4049(new C5321(), 0);
            ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new ContentConverterKt$deserialize$result$2(null, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = AbstractC5322.m10336(c4049, contentConverterKt$deserialize$result$2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC4252 = null;
            c6857 = null;
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6857 = (C6857) this.L$1;
            interfaceC4252 = (InterfaceC4252) this.L$0;
            AbstractC5185.m10210(obj);
        }
        if (obj != null) {
            return obj;
        }
        if (!interfaceC4252.mo8641()) {
            return interfaceC4252;
        }
        InterfaceC5087 interfaceC5087 = c6857.f18297;
        if (interfaceC5087 != null && interfaceC5087.mo8896()) {
            return C3992.f12247;
        }
        throw new ContentConvertException("No suitable converter found for " + c6857, null, 2, null);
    }
}
