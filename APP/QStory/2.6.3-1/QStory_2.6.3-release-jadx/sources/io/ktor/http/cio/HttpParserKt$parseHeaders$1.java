package io.ktor.http.cio;

import io.ktor.http.cio.internals.C4785;
import io.ktor.http.cio.internals.C4788;
import java.util.Set;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.HttpParserKt", m556f = "HttpParser.kt", m557l = {86}, m558m = "parseHeaders")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpParserKt$parseHeaders$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpParserKt$parseHeaders$1(InterfaceC5189<? super HttpParserKt$parseHeaders$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C4785 c4785;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        Set set = AbstractC4805.f12564;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C4785 c47852 = new C4785();
            this.L$0 = c47852;
            this.label = 1;
            Object objM8929 = AbstractC4805.m8929(null, c47852, new C4788(), this);
            if (objM8929 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM8929;
            c4785 = c47852;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4785 = (C4785) this.L$0;
            AbstractC6017.m10769(obj);
        }
        C4806 c4806 = (C4806) obj;
        return c4806 == null ? new C4806(c4785) : c4806;
    }
}
