package io.ktor.utils.p007io.jvm.javaio;

import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.jvm.javaio.WritingKt", m556f = "Writing.kt", m557l = {22}, m558m = "copyTo")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class WritingKt$copyTo$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public WritingKt$copyTo$1(InterfaceC5189<? super WritingKt$copyTo$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0051 -> B:20:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005f -> B:20:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        OutputStream outputStream;
        InterfaceC5084 interfaceC5084;
        long j;
        WritingKt$copyTo$1 writingKt$copyTo$1 = this;
        writingKt$copyTo$1.result = obj;
        int i = writingKt$copyTo$1.label | Integer.MIN_VALUE;
        writingKt$copyTo$1.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            writingKt$copyTo$1.label = i - Integer.MIN_VALUE;
        } else {
            writingKt$copyTo$1 = new WritingKt$copyTo$1(writingKt$copyTo$1);
        }
        Object obj2 = writingKt$copyTo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = writingKt$copyTo$1.label;
        Object obj3 = null;
        long j2 = 0;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            outputStream = null;
            interfaceC5084 = null;
            j = 0;
            if (interfaceC5084.mo9200()) {
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = writingKt$copyTo$1.J$0;
            outputStream = (OutputStream) writingKt$copyTo$1.L$1;
            interfaceC5084 = (InterfaceC5084) writingKt$copyTo$1.L$0;
            AbstractC6017.m10769(obj2);
            j += interfaceC5084.mo9202().mo11162().f15487;
            C6309 c6309Mo11162 = interfaceC5084.mo9202().mo11162();
            long j3 = c6309Mo11162.f15487;
            outputStream.getClass();
            AbstractC6310.m11179(c6309Mo11162.f15487, 0L, j3);
            long j4 = j3;
            while (j4 > j2) {
                if (c6309Mo11162.mo11163()) {
                    Object obj4 = obj3;
                    C6755.m11869("Buffer is empty");
                    return obj4;
                }
                C6311 c6311 = c6309Mo11162.f15488;
                c6311.getClass();
                byte[] bArr = c6311.f15495;
                int i3 = c6311.f15494;
                Object obj5 = obj3;
                int iMin = (int) Math.min(j4, c6311.f15493 - i3);
                outputStream.write(bArr, i3, iMin);
                long j5 = iMin;
                j4 -= j5;
                if (iMin != 0) {
                    if (iMin < 0) {
                        C6755.m11870("Returned negative read bytes count");
                        return obj5;
                    }
                    if (iMin > c6311.m11196()) {
                        C6755.m11870("Returned too many bytes");
                        return obj5;
                    }
                    c6309Mo11162.skip(j5);
                }
                j2 = 0;
                obj3 = obj5;
            }
            if (interfaceC5084.mo9200()) {
                return new Long(j);
            }
            if (interfaceC5084.mo9202().mo11163()) {
                writingKt$copyTo$1.L$0 = interfaceC5084;
                writingKt$copyTo$1.L$1 = outputStream;
                writingKt$copyTo$1.J$0 = j;
                writingKt$copyTo$1.label = 1;
                if (interfaceC5084.mo9201(1, writingKt$copyTo$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            j += interfaceC5084.mo9202().mo11162().f15487;
            C6309 c6309Mo111622 = interfaceC5084.mo9202().mo11162();
            long j32 = c6309Mo111622.f15487;
            outputStream.getClass();
            AbstractC6310.m11179(c6309Mo111622.f15487, 0L, j32);
            long j42 = j32;
            while (j42 > j2) {
            }
            if (interfaceC5084.mo9200()) {
            }
        }
    }
}
