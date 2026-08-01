package io.ktor.client.plugins.cookies;

import io.ktor.client.plugins.AbstractC3938;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", l = {142}, m = "cookies")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCookiesKt$cookies$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public HttpCookiesKt$cookies$2(InterfaceC4357<? super HttpCookiesKt$cookies$2> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC3895.f12100;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpCookiesKt$cookies$2(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5185.m10210(obj2);
            int i4 = AbstractC3896.f12101;
            int i5 = AbstractC3938.f12153;
            throw null;
        }
        if (i3 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj2);
        List list = (List) obj2;
        return list == null ? EmptyList.INSTANCE : list;
    }
}
