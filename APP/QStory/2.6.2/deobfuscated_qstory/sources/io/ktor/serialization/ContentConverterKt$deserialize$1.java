package io.ktor.serialization;

import io.ktor.http.content.C3991;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.InterfaceC5086;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5320;
import p059.C6856;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", l = {97}, m = "deserialize")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ContentConverterKt$deserialize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ContentConverterKt$deserialize$1(InterfaceC4356<? super ContentConverterKt$deserialize$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ContentConvertException {
        InterfaceC4251 interfaceC4251;
        C6856 c6856;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4048 c4048 = new C4048(new C5320(), 0);
            ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new ContentConverterKt$deserialize$result$2(null, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = AbstractC5321.m10332(c4048, contentConverterKt$deserialize$result$2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC4251 = null;
            c6856 = null;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6856 = (C6856) this.L$1;
            interfaceC4251 = (InterfaceC4251) this.L$0;
            AbstractC5184.m10206(obj);
        }
        if (obj != null) {
            return obj;
        }
        if (!interfaceC4251.mo8651()) {
            return interfaceC4251;
        }
        InterfaceC5086 interfaceC5086 = c6856.f18302;
        if (interfaceC5086 != null && interfaceC5086.mo8906()) {
            return C3991.f12243;
        }
        throw new ContentConvertException("No suitable converter found for " + c6856, null, 2, null);
    }
}
