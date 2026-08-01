package io.ktor.http.cio;

import io.ktor.utils.p007io.InterfaceC5084;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import p079.InterfaceC7691;
import p110.C8034;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.MultipartKt", m556f = "Multipart.kt", m557l = {399, 407}, m558m = "skipDelimiterOrEof")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class MultipartKt$skipDelimiterOrEof$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public MultipartKt$skipDelimiterOrEof$1(InterfaceC5189<? super MultipartKt$skipDelimiterOrEof$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        C8034 c8034 = AbstractC4801.f12552;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$2;
        ByteBuffer byteBuffer = (ByteBuffer) this.L$1;
        InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.L$0;
        AbstractC6017.m10769(obj);
        if (ref$BooleanRef.element) {
            return Boolean.TRUE;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        Object objM8920 = AbstractC4801.m8920(interfaceC5084, byteBuffer, this);
        return objM8920 == coroutineSingletons ? coroutineSingletons : objM8920;
    }
}
