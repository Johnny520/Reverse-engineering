package io.ktor.http.cio;

import io.ktor.utils.io.InterfaceC4252;
import java.nio.ByteBuffer;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import p063.InterfaceC6862;
import p094.C7205;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {399, 407}, m = "skipDelimiterOrEof")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MultipartKt$skipDelimiterOrEof$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public MultipartKt$skipDelimiterOrEof$1(InterfaceC4357<? super MultipartKt$skipDelimiterOrEof$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C7205 c7205 = AbstractC3969.f12207;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$2;
        ByteBuffer byteBuffer = (ByteBuffer) this.L$1;
        InterfaceC4252 interfaceC4252 = (InterfaceC4252) this.L$0;
        AbstractC5185.m10210(obj);
        if (ref$BooleanRef.element) {
            return Boolean.TRUE;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        Object objM8361 = AbstractC3969.m8361(interfaceC4252, byteBuffer, this);
        return objM8361 == coroutineSingletons ? coroutineSingletons : objM8361;
    }
}
