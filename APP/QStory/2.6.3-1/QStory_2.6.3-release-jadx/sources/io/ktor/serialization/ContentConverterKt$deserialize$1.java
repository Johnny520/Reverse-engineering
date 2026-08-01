package io.ktor.serialization;

import io.ktor.http.content.C4824;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.InterfaceC5919;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6153;
import p075.C7686;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.serialization.ContentConverterKt", m556f = "ContentConverter.kt", m557l = {97}, m558m = "deserialize")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ContentConverterKt$deserialize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ContentConverterKt$deserialize$1(InterfaceC5189<? super ContentConverterKt$deserialize$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ContentConvertException {
        InterfaceC5084 interfaceC5084;
        C7686 c7686;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C4881 c4881 = new C4881(new C6153(), 0);
            ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new ContentConverterKt$deserialize$result$2(null, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = AbstractC6154.m10895(c4881, contentConverterKt$deserialize$result$2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC5084 = null;
            c7686 = null;
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c7686 = (C7686) this.L$1;
            interfaceC5084 = (InterfaceC5084) this.L$0;
            AbstractC6017.m10769(obj);
        }
        if (obj != null) {
            return obj;
        }
        if (!interfaceC5084.mo9200()) {
            return interfaceC5084;
        }
        InterfaceC5919 interfaceC5919 = c7686.f18642;
        if (interfaceC5919 != null && interfaceC5919.mo9455()) {
            return C4824.f12592;
        }
        throw new ContentConvertException("No suitable converter found for " + c7686, null, 2, null);
    }
}
