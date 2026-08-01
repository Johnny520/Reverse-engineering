package io.ktor.http.cio;

import io.ktor.http.cio.internals.C3953;
import io.ktor.http.cio.internals.C3956;
import java.util.Set;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", l = {86}, m = "parseHeaders")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpParserKt$parseHeaders$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpParserKt$parseHeaders$1(InterfaceC4357<? super HttpParserKt$parseHeaders$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3953 c3953;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        Set set = AbstractC3973.f12219;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            C3953 c39532 = new C3953();
            this.L$0 = c39532;
            this.label = 1;
            Object objM8370 = AbstractC3973.m8370(null, c39532, new C3956(), this);
            if (objM8370 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM8370;
            c3953 = c39532;
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3953 = (C3953) this.L$0;
            AbstractC5185.m10210(obj);
        }
        C3974 c3974 = (C3974) obj;
        return c3974 == null ? new C3974(c3953) : c3974;
    }
}
