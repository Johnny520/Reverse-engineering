package io.ktor.client.plugins.cookies;

import io.ktor.client.plugins.AbstractC3937;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", l = {136}, m = "cookies")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCookiesKt$cookies$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public HttpCookiesKt$cookies$1(InterfaceC4356<? super HttpCookiesKt$cookies$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC3894.f12095;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpCookiesKt$cookies$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5184.m10206(obj2);
            int i4 = AbstractC3895.f12096;
            int i5 = AbstractC3937.f12149;
            throw null;
        }
        if (i3 != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj2);
        List list = (List) obj2;
        return list == null ? EmptyList.INSTANCE : list;
    }
}
