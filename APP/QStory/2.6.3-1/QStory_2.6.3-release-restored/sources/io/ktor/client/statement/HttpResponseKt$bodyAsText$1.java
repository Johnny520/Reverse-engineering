package io.ktor.client.statement;

import bsh.C3466;
import com.bumptech.glide.AbstractC3898;
import java.nio.charset.CharsetDecoder;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.InterfaceC6313;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.client.statement.HttpResponseKt", m556f = "HttpResponse.kt", m557l = {123}, m558m = "bodyAsText")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpResponseKt$bodyAsText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpResponseKt$bodyAsText$1(InterfaceC5189<? super HttpResponseKt$bodyAsText$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        if (this instanceof HttpResponseKt$bodyAsText$1) {
            int i = this.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                this.label = i - Integer.MIN_VALUE;
            } else {
                this = new HttpResponseKt$bodyAsText$1(this);
            }
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CharsetDecoder charsetDecoder = (CharsetDecoder) this.L$0;
        AbstractC6017.m10769(obj2);
        if (obj2 != null) {
            charsetDecoder.getClass();
            return AbstractC3898.m7423(charsetDecoder, (InterfaceC6313) obj2);
        }
        C3466.m5903("null cannot be cast to non-null type kotlinx.io.Source");
        return null;
    }
}
