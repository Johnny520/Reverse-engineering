package io.ktor.http.cio;

import io.ktor.utils.io.InterfaceC4251;
import java.nio.ByteBuffer;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import p063.InterfaceC6861;
import p094.C7204;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {399, 407}, m = "skipDelimiterOrEof")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MultipartKt$skipDelimiterOrEof$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public MultipartKt$skipDelimiterOrEof$1(InterfaceC4356<? super MultipartKt$skipDelimiterOrEof$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C7204 c7204 = AbstractC3968.f12203;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$2;
        ByteBuffer byteBuffer = (ByteBuffer) this.L$1;
        InterfaceC4251 interfaceC4251 = (InterfaceC4251) this.L$0;
        AbstractC5184.m10206(obj);
        if (ref$BooleanRef.element) {
            return Boolean.TRUE;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        Object objM8371 = AbstractC3968.m8371(interfaceC4251, byteBuffer, this);
        return objM8371 == coroutineSingletons ? coroutineSingletons : objM8371;
    }
}
