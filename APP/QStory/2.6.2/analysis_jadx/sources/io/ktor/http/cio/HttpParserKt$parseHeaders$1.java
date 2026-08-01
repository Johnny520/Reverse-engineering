package io.ktor.http.cio;

import io.ktor.http.cio.internals.C3952;
import io.ktor.http.cio.internals.C3955;
import java.util.Set;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", l = {86}, m = "parseHeaders")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpParserKt$parseHeaders$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpParserKt$parseHeaders$1(InterfaceC4356<? super HttpParserKt$parseHeaders$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3952 c3952;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        Set set = AbstractC3972.f12215;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            C3952 c39522 = new C3952();
            this.L$0 = c39522;
            this.label = 1;
            Object objM8380 = AbstractC3972.m8380(null, c39522, new C3955(), this);
            if (objM8380 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM8380;
            c3952 = c39522;
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3952 = (C3952) this.L$0;
            AbstractC5184.m10206(obj);
        }
        C3973 c3973 = (C3973) obj;
        return c3973 == null ? new C3973(c3952) : c3973;
    }
}
