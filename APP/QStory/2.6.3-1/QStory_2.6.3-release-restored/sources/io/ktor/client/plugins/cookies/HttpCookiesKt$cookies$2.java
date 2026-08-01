package io.ktor.client.plugins.cookies;

import io.ktor.client.plugins.AbstractC4770;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cookies.HttpCookiesKt", m556f = "HttpCookies.kt", m557l = {142}, m558m = "cookies")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpCookiesKt$cookies$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public HttpCookiesKt$cookies$2(InterfaceC5189<? super HttpCookiesKt$cookies$2> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC4727.f12445;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new HttpCookiesKt$cookies$2(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj2);
            int i4 = AbstractC4728.f12446;
            int i5 = AbstractC4770.f12498;
            throw null;
        }
        if (i3 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj2);
        List list = (List) obj2;
        return list == null ? EmptyList.INSTANCE : list;
    }
}
