package io.ktor.util.cio;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1868;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.C5059;
import io.ktor.utils.p007io.C5080;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6292;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import p111.C8036;
import p111.ExecutorC8037;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.util.cio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5017 {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
    
        if (r2 == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:
    
        if (r10 == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d3, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f6 -> B:43:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01d1 -> B:75:0x01d4). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9109(SeekableByteChannel seekableByteChannel, C5058 c5058, long j, long j2, ContinuationImpl continuationImpl) throws Throwable {
        FileChannelsKt$writeToScope$1 fileChannelsKt$writeToScope$1;
        SeekableByteChannel seekableByteChannel2;
        InterfaceC5079 interfaceC5079;
        Ref$LongRef ref$LongRef;
        FileChannelsKt$writeToScope$1 fileChannelsKt$writeToScope$12;
        Ref$BooleanRef ref$BooleanRef;
        long j3;
        InterfaceC5079 interfaceC50792;
        Ref$BooleanRef ref$BooleanRef2;
        int i;
        if (continuationImpl instanceof FileChannelsKt$writeToScope$1) {
            fileChannelsKt$writeToScope$1 = (FileChannelsKt$writeToScope$1) continuationImpl;
            int i2 = fileChannelsKt$writeToScope$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileChannelsKt$writeToScope$1.label = i2 - Integer.MIN_VALUE;
            } else {
                fileChannelsKt$writeToScope$1 = new FileChannelsKt$writeToScope$1(continuationImpl);
            }
        }
        Object obj = fileChannelsKt$writeToScope$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = fileChannelsKt$writeToScope$1.label;
        Object obj2 = null;
        String str = ". Should be in 0..";
        int i4 = -1;
        int i5 = 1;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            if (j > 0) {
                seekableByteChannel2 = seekableByteChannel;
                seekableByteChannel2.position(j);
            } else {
                seekableByteChannel2 = seekableByteChannel;
            }
            if (j2 == -1) {
                interfaceC50792 = c5058.f13071;
                ref$BooleanRef2 = new Ref$BooleanRef();
                if (!ref$BooleanRef2.element) {
                }
                return C6008.f15084;
            }
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.element = j;
            interfaceC5079 = c5058.f13071;
            ref$LongRef = ref$LongRef2;
            fileChannelsKt$writeToScope$12 = fileChannelsKt$writeToScope$1;
            ref$BooleanRef = new Ref$BooleanRef();
            j3 = j2;
            if (!ref$BooleanRef.element) {
            }
            return C6008.f15084;
        }
        if (i3 == 1) {
            ref$BooleanRef2 = (Ref$BooleanRef) fileChannelsKt$writeToScope$1.L$2;
            InterfaceC5079 interfaceC50793 = (InterfaceC5079) fileChannelsKt$writeToScope$1.L$1;
            SeekableByteChannel seekableByteChannel3 = (SeekableByteChannel) fileChannelsKt$writeToScope$1.L$0;
            AbstractC6017.m10769(obj);
            seekableByteChannel2 = seekableByteChannel3;
            InterfaceC5079 interfaceC50794 = interfaceC50793;
            i4 = -1;
            interfaceC50792 = interfaceC50794;
            if (!ref$BooleanRef2.element) {
                C5081 c5081 = (C5081) interfaceC50792;
                C6309 c6309M9261 = c5081.m9261();
                c6309M9261.getClass();
                C6311 c6311M11171 = c6309M9261.m11171(1);
                byte[] bArr = c6311M11171.f15495;
                int i6 = c6311M11171.f15493;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i6, bArr.length - i6);
                byteBufferWrap.getClass();
                ref$BooleanRef2.element = !(seekableByteChannel2.read(byteBufferWrap) != i4);
                int iPosition = byteBufferWrap.position() - i6;
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
                fileChannelsKt$writeToScope$1.L$0 = seekableByteChannel2;
                fileChannelsKt$writeToScope$1.L$1 = c5081;
                fileChannelsKt$writeToScope$1.L$2 = ref$BooleanRef2;
                fileChannelsKt$writeToScope$1.label = 1;
                Object objM9259 = c5081.m9259(fileChannelsKt$writeToScope$1);
                interfaceC50794 = c5081;
            }
            return C6008.f15084;
        }
        if (i3 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j3 = fileChannelsKt$writeToScope$1.J$0;
        Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) fileChannelsKt$writeToScope$1.L$3;
        InterfaceC5079 interfaceC50795 = (InterfaceC5079) fileChannelsKt$writeToScope$1.L$2;
        ref$LongRef = (Ref$LongRef) fileChannelsKt$writeToScope$1.L$1;
        SeekableByteChannel seekableByteChannel4 = (SeekableByteChannel) fileChannelsKt$writeToScope$1.L$0;
        AbstractC6017.m10769(obj);
        FileChannelsKt$writeToScope$1 fileChannelsKt$writeToScope$13 = fileChannelsKt$writeToScope$1;
        ref$BooleanRef = ref$BooleanRef3;
        InterfaceC5079 interfaceC50796 = interfaceC50795;
        fileChannelsKt$writeToScope$12 = fileChannelsKt$writeToScope$13;
        Object obj3 = null;
        int i7 = 1;
        seekableByteChannel2 = seekableByteChannel4;
        String str2 = ". Should be in 0..";
        char c = 2;
        i5 = i7;
        str = str2;
        obj2 = obj3;
        interfaceC5079 = interfaceC50796;
        if (!ref$BooleanRef.element) {
            C5081 c50812 = (C5081) interfaceC5079;
            C6309 c6309M92612 = c50812.m9261();
            c6309M92612.getClass();
            C6311 c6311M111712 = c6309M92612.m11171(i5);
            byte[] bArr2 = c6311M111712.f15495;
            obj3 = obj2;
            int i8 = c6311M111712.f15493;
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2, i8, bArr2.length - i8);
            byteBufferWrap2.getClass();
            str2 = str;
            long j4 = (j3 - ref$LongRef.element) + 1;
            int i9 = i5;
            long j5 = j3;
            if (j4 < byteBufferWrap2.remaining()) {
                int iLimit = byteBufferWrap2.limit();
                byteBufferWrap2.limit(byteBufferWrap2.position() + ((int) j4));
                i = seekableByteChannel2.read(byteBufferWrap2);
                byteBufferWrap2.limit(iLimit);
            } else {
                i = seekableByteChannel2.read(byteBufferWrap2);
            }
            if (i > 0) {
                ref$LongRef.element += (long) i;
            }
            ref$BooleanRef.element = ((i == -1 || ref$LongRef.element > j5) ? 0 : i9) ^ 1;
            int iPosition2 = byteBufferWrap2.position() - i8;
            i7 = i9;
            if (iPosition2 == i7) {
                c6311M111712.f15493 += iPosition2;
                c6309M92612.f15487 += (long) iPosition2;
            } else {
                if (iPosition2 < 0 || iPosition2 > c6311M111712.m11197()) {
                    C5043.m9167(AbstractC0900.m710(iPosition2, "Invalid number of bytes written: ", str2), c6311M111712.m11197());
                    return obj3;
                }
                if (iPosition2 != 0) {
                    c6311M111712.f15493 += iPosition2;
                    c6309M92612.f15487 += (long) iPosition2;
                } else if (AbstractC6310.m11187(c6311M111712)) {
                    c6309M92612.m11168();
                }
            }
            fileChannelsKt$writeToScope$12.L$0 = seekableByteChannel2;
            fileChannelsKt$writeToScope$12.L$1 = ref$LongRef;
            fileChannelsKt$writeToScope$12.L$2 = c50812;
            fileChannelsKt$writeToScope$12.L$3 = ref$BooleanRef;
            j3 = j5;
            fileChannelsKt$writeToScope$12.J$0 = j3;
            c = 2;
            fileChannelsKt$writeToScope$12.label = 2;
            Object objM92592 = c50812.m9259(fileChannelsKt$writeToScope$12);
            interfaceC50796 = c50812;
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5084 m9110(Path path) throws IOException {
        C8036 c8036 = AbstractC6227.f15375;
        ExecutorC8037 executorC8037 = ExecutorC8037.f19570;
        path.getClass();
        executorC8037.getClass();
        return AbstractC5078.m9256(AbstractC6231.m11048(executorC8037), new C6234("file-reader").plus(executorC8037), new FileChannelsAtNioPathKt$readChannel$1(0L, -1L, Files.size(path), path, null)).f13073;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC5084 m9111(File file) {
        C8036 c8036 = AbstractC6227.f15375;
        ExecutorC8037 executorC8037 = ExecutorC8037.f19570;
        file.getClass();
        executorC8037.getClass();
        long length = file.length();
        InterfaceC6016 interfaceC6016M10773 = AbstractC6019.m10773(new C1868(file, 15));
        C5059 c5059M9256 = AbstractC5078.m9256(AbstractC6231.m11048(executorC8037), new C6234("file-reader").plus(executorC8037), new FileChannelsKt$readChannel$writer$1(0L, -1L, length, interfaceC6016M10773, null));
        C1868 c1868 = new C1868(interfaceC6016M10773, 16);
        ((C6292) c5059M9256.mo9205()).mo11118(new C5080(c1868, 0));
        return c5059M9256.f13073;
    }
}
