package io.ktor.utils.p007io.jvm.nio;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", m556f = "WriteSuspendSession.kt", m557l = {59}, m558m = "writeWhile")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 176)
final class WriteSuspendSessionKt$writeWhile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public WriteSuspendSessionKt$writeWhile$1(InterfaceC5189<? super WriteSuspendSessionKt$writeWhile$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009e -> B:6:0x0021). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$BooleanRef ref$BooleanRef;
        InterfaceC5079 interfaceC5079;
        InterfaceC7387 interfaceC7387;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            ref$BooleanRef = new Ref$BooleanRef();
            interfaceC5079 = null;
            interfaceC7387 = null;
            if (!ref$BooleanRef.element) {
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$BooleanRef = (Ref$BooleanRef) this.L$2;
            interfaceC7387 = (InterfaceC7387) this.L$1;
            InterfaceC5079 interfaceC50792 = (InterfaceC5079) this.L$0;
            AbstractC6017.m10769(obj);
            InterfaceC5079 interfaceC50793 = interfaceC50792;
            interfaceC5079 = interfaceC50793;
            if (!ref$BooleanRef.element) {
                C5081 c5081 = (C5081) interfaceC5079;
                C6309 c6309M9261 = c5081.m9261();
                c6309M9261.getClass();
                C6311 c6311M11171 = c6309M9261.m11171(1);
                byte[] bArr = c6311M11171.f15495;
                int i2 = c6311M11171.f15493;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, bArr.length - i2);
                byteBufferWrap.getClass();
                ref$BooleanRef.element = !((Boolean) interfaceC7387.invoke(byteBufferWrap)).booleanValue();
                int iPosition = byteBufferWrap.position() - i2;
                if (iPosition == 1) {
                    c6311M11171.f15493 += iPosition;
                    c6309M9261.f15487 += (long) iPosition;
                } else {
                    if (iPosition < 0 || iPosition > c6311M11171.m11197()) {
                        C5043.m9167(AbstractC0900.m710(iPosition, "Invalid number of bytes written: ", ". Should be in 0.."), c6311M11171.m11197());
                        return null;
                    }
                    if (iPosition != 0) {
                        c6311M11171.f15493 += iPosition;
                        c6309M9261.f15487 += (long) iPosition;
                    } else if (AbstractC6310.m11187(c6311M11171)) {
                        c6309M9261.m11168();
                    }
                }
                this.L$0 = c5081;
                this.L$1 = interfaceC7387;
                this.L$2 = ref$BooleanRef;
                this.label = 1;
                Object objM9259 = c5081.m9259(this);
                interfaceC50793 = c5081;
                if (objM9259 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC5079 = interfaceC50793;
                if (!ref$BooleanRef.element) {
                    return C6008.f15084;
                }
            }
        }
    }
}
