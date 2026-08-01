package io.ktor.utils.p007io;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import io.ktor.utils.p007io.charsets.TooLongLineException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5971;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import kotlinx.p010io.InterfaceC6313;
import kotlinx.p010io.InterfaceC6316;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p074.AbstractC7684;
import p110.C8034;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5076 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final Object m9216(InterfaceC5079 interfaceC5079, ByteBuffer byteBuffer, ContinuationImpl continuationImpl) throws Throwable {
        C5081 c5081 = (C5081) interfaceC5079;
        C6309 c6309M9261 = c5081.m9261();
        c6309M9261.getClass();
        byteBuffer.getClass();
        AbstractC6310.m11184(c6309M9261, byteBuffer);
        Object objM9259 = c5081.m9259(continuationImpl);
        return objM9259 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9259 : C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable m9217(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) throws Throwable {
        ByteReadChannelOperationsKt$toByteArray$1 byteReadChannelOperationsKt$toByteArray$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$toByteArray$1) {
            byteReadChannelOperationsKt$toByteArray$1 = (ByteReadChannelOperationsKt$toByteArray$1) continuationImpl;
            int i = byteReadChannelOperationsKt$toByteArray$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$toByteArray$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$toByteArray$1 = new ByteReadChannelOperationsKt$toByteArray$1(continuationImpl);
            }
        }
        Object objM9238 = byteReadChannelOperationsKt$toByteArray$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$toByteArray$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9238);
            byteReadChannelOperationsKt$toByteArray$1.label = 1;
            objM9238 = m9238(interfaceC5084, byteReadChannelOperationsKt$toByteArray$1);
            if (objM9238 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(objM9238);
        }
        C6309 c6309 = (C6309) objM9238;
        return AbstractC6310.m11191(c6309, (int) c6309.f15487);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (m9240(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9218(InterfaceC5084 interfaceC5084, C8034 c8034, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$skipIfFound$1 byteReadChannelOperationsKt$skipIfFound$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$skipIfFound$1) {
            byteReadChannelOperationsKt$skipIfFound$1 = (ByteReadChannelOperationsKt$skipIfFound$1) continuationImpl;
            int i = byteReadChannelOperationsKt$skipIfFound$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$skipIfFound$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$skipIfFound$1 = new ByteReadChannelOperationsKt$skipIfFound$1(continuationImpl);
            }
        }
        Object objM9243 = byteReadChannelOperationsKt$skipIfFound$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$skipIfFound$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9243);
            int length = c8034.f19567.length;
            byteReadChannelOperationsKt$skipIfFound$1.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$skipIfFound$1.L$1 = c8034;
            byteReadChannelOperationsKt$skipIfFound$1.label = 1;
            objM9243 = m9243(interfaceC5084, length, byteReadChannelOperationsKt$skipIfFound$1);
            if (objM9243 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(objM9243);
                return Boolean.TRUE;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c8034 = (C8034) byteReadChannelOperationsKt$skipIfFound$1.L$1;
        interfaceC5084 = (InterfaceC5084) byteReadChannelOperationsKt$skipIfFound$1.L$0;
        AbstractC6017.m10769(objM9243);
        if (!AbstractC5227.m9466(objM9243, c8034)) {
            return Boolean.FALSE;
        }
        long length2 = c8034.f19567.length;
        byteReadChannelOperationsKt$skipIfFound$1.L$0 = null;
        byteReadChannelOperationsKt$skipIfFound$1.L$1 = null;
        byteReadChannelOperationsKt$skipIfFound$1.label = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5062 m9219(InterfaceC6233 interfaceC6233, InterfaceC5192 interfaceC5192, C5081 c5081, InterfaceC7383 interfaceC7383) {
        interfaceC5192.getClass();
        C6249 c6249M11036 = AbstractC6231.m11036(interfaceC6233, interfaceC5192, null, new ByteReadChannelOperationsKt$reader$job$1(interfaceC7383, c5081, null), 2);
        c6249M11036.mo11118(new C5085(c5081, 1));
        return new C5062(c5081, c6249M11036);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9220(InterfaceC5079 interfaceC5079, byte[] bArr, Ref$IntRef ref$IntRef, Ref$LongRef ref$LongRef, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 byteReadChannelOperationsKt$readUntil$appendPartialMatch$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1) {
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1 = (ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1) continuationImpl;
            int i = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readUntil$appendPartialMatch$1 = new ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            int i3 = ref$IntRef.element;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$0 = ref$IntRef;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$1 = ref$LongRef;
            byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.label = 1;
            if (AbstractC5078.m9248(interfaceC5079, bArr, 0, i3, byteReadChannelOperationsKt$readUntil$appendPartialMatch$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$LongRef = (Ref$LongRef) byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$1;
            ref$IntRef = (Ref$IntRef) byteReadChannelOperationsKt$readUntil$appendPartialMatch$1.L$0;
            AbstractC6017.m10769(obj);
        }
        ref$LongRef.element += (long) ref$IntRef.element;
        ref$IntRef.element = 0;
        return C6008.f15084;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x017e, code lost:
    
        if (m9220(r14, r11, r12, r10, r2) == r3) goto L79;
     */
    /* JADX WARN: Path cross not found for [B:43:0x015e, B:54:0x0195], limit reached: 90 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0268  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01be -> B:61:0x01c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01ea -> B:66:0x01ed). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9221(InterfaceC5084 interfaceC5084, C8034 c8034, InterfaceC5079 interfaceC5079, long j, boolean z, ContinuationImpl continuationImpl) throws IOException {
        ByteReadChannelOperationsKt$readUntil$1 byteReadChannelOperationsKt$readUntil$1;
        Object obj;
        Ref$IntRef ref$IntRef;
        ByteReadChannelOperationsKt$readUntil$1 byteReadChannelOperationsKt$readUntil$12;
        int[] iArr;
        byte[] bArr;
        Ref$LongRef ref$LongRef;
        InterfaceC5079 interfaceC50792;
        long j2;
        boolean z2;
        C8034 c80342;
        InterfaceC5084 interfaceC50842;
        C8034 c80343;
        InterfaceC5079 interfaceC50793;
        int[] iArr2;
        Ref$IntRef ref$IntRef2;
        byte[] bArr2;
        Ref$LongRef ref$LongRef2;
        InterfaceC5084 interfaceC50843;
        long j3;
        boolean z3;
        byte bByteValue;
        byte[] bArr3;
        Ref$IntRef ref$IntRef3;
        long j4;
        InterfaceC5079 interfaceC50794;
        C8034 c80344;
        int[] iArr3;
        int i;
        Object obj2;
        InterfaceC5079 interfaceC50795;
        Ref$LongRef ref$LongRef3;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readUntil$1) {
            byteReadChannelOperationsKt$readUntil$1 = (ByteReadChannelOperationsKt$readUntil$1) continuationImpl;
            int i2 = byteReadChannelOperationsKt$readUntil$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readUntil$1.label = i2 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readUntil$1 = new ByteReadChannelOperationsKt$readUntil$1(continuationImpl);
            }
        }
        Object obj3 = byteReadChannelOperationsKt$readUntil$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = byteReadChannelOperationsKt$readUntil$1.label;
        int i4 = 2;
        if (i3 == 0) {
            obj = null;
            AbstractC6017.m10769(obj3);
            byte[] bArr4 = c8034.f19567;
            if (bArr4.length <= 0) {
                C6755.m11870("Empty match string not permitted for readUntil");
                return null;
            }
            int[] iArr4 = new int[bArr4.length];
            int length = bArr4.length;
            int i5 = 0;
            for (int i6 = 1; i6 < length; i6++) {
                while (i5 > 0 && c8034.m12999(i6) != c8034.m12999(i5)) {
                    i5 = iArr4[i5 - 1];
                }
                if (c8034.m12999(i6) == c8034.m12999(i5)) {
                    i5++;
                }
                iArr4[i6] = i5;
            }
            ref$IntRef = new Ref$IntRef();
            byteReadChannelOperationsKt$readUntil$12 = byteReadChannelOperationsKt$readUntil$1;
            iArr = iArr4;
            bArr = new byte[c8034.f19567.length];
            ref$LongRef = new Ref$LongRef();
            interfaceC50792 = interfaceC5079;
            j2 = j;
            z2 = z;
            c80342 = c8034;
            interfaceC50842 = interfaceC5084;
            if (interfaceC50842.mo9200()) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            obj = null;
            boolean z4 = byteReadChannelOperationsKt$readUntil$1.Z$0;
            long j5 = byteReadChannelOperationsKt$readUntil$1.J$0;
            Ref$LongRef ref$LongRef4 = (Ref$LongRef) byteReadChannelOperationsKt$readUntil$1.L$6;
            byte[] bArr5 = (byte[]) byteReadChannelOperationsKt$readUntil$1.L$5;
            Ref$IntRef ref$IntRef4 = (Ref$IntRef) byteReadChannelOperationsKt$readUntil$1.L$4;
            int[] iArr5 = (int[]) byteReadChannelOperationsKt$readUntil$1.L$3;
            InterfaceC5079 interfaceC50796 = (InterfaceC5079) byteReadChannelOperationsKt$readUntil$1.L$2;
            C8034 c80345 = (C8034) byteReadChannelOperationsKt$readUntil$1.L$1;
            InterfaceC5084 interfaceC50844 = (InterfaceC5084) byteReadChannelOperationsKt$readUntil$1.L$0;
            AbstractC6017.m10769(obj3);
            c80343 = c80345;
            iArr2 = iArr5;
            bArr2 = bArr5;
            interfaceC50843 = interfaceC50844;
            interfaceC50793 = interfaceC50796;
            ref$IntRef2 = ref$IntRef4;
            ref$LongRef2 = ref$LongRef4;
            j3 = j5;
            z3 = z4;
            bByteValue = ((Number) obj3).byteValue();
            i = ref$IntRef2.element;
            if (i > 0) {
            }
            int[] iArr6 = iArr2;
            bArr3 = bArr2;
            InterfaceC5079 interfaceC50797 = interfaceC50793;
            ref$IntRef3 = ref$IntRef2;
            j4 = j3;
            interfaceC50794 = interfaceC50797;
            c80344 = c80343;
            iArr3 = iArr6;
            if (bByteValue == c80344.m12999(ref$IntRef3.element)) {
            }
        } else if (i3 == 2) {
            obj = null;
            bByteValue = byteReadChannelOperationsKt$readUntil$1.B$0;
            z3 = byteReadChannelOperationsKt$readUntil$1.Z$0;
            j3 = byteReadChannelOperationsKt$readUntil$1.J$0;
            ref$LongRef2 = (Ref$LongRef) byteReadChannelOperationsKt$readUntil$1.L$6;
            bArr2 = (byte[]) byteReadChannelOperationsKt$readUntil$1.L$5;
            ref$IntRef2 = (Ref$IntRef) byteReadChannelOperationsKt$readUntil$1.L$4;
            iArr2 = (int[]) byteReadChannelOperationsKt$readUntil$1.L$3;
            interfaceC50793 = (InterfaceC5079) byteReadChannelOperationsKt$readUntil$1.L$2;
            c80343 = (C8034) byteReadChannelOperationsKt$readUntil$1.L$1;
            interfaceC50843 = (InterfaceC5084) byteReadChannelOperationsKt$readUntil$1.L$0;
            AbstractC6017.m10769(obj3);
            byte b = bByteValue;
            while (true) {
                int i7 = ref$IntRef2.element;
                if (i7 <= 0 || b == c80343.m12999(i7)) {
                    break;
                }
                ref$IntRef2.element = iArr2[ref$IntRef2.element - 1];
            }
            int[] iArr62 = iArr2;
            bArr3 = bArr2;
            InterfaceC5079 interfaceC507972 = interfaceC50793;
            ref$IntRef3 = ref$IntRef2;
            j4 = j3;
            interfaceC50794 = interfaceC507972;
            c80344 = c80343;
            iArr3 = iArr62;
            if (bByteValue == c80344.m12999(ref$IntRef3.element)) {
            }
        } else {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$LongRef3 = (Ref$LongRef) byteReadChannelOperationsKt$readUntil$1.L$0;
                    AbstractC6017.m10769(obj3);
                    return new Long(ref$LongRef3.element);
                }
                Ref$LongRef ref$LongRef5 = (Ref$LongRef) byteReadChannelOperationsKt$readUntil$1.L$1;
                interfaceC50795 = (InterfaceC5079) byteReadChannelOperationsKt$readUntil$1.L$0;
                AbstractC6017.m10769(obj3);
                ref$LongRef = ref$LongRef5;
                obj2 = null;
                byteReadChannelOperationsKt$readUntil$1.L$0 = ref$LongRef;
                byteReadChannelOperationsKt$readUntil$1.L$1 = obj2;
                byteReadChannelOperationsKt$readUntil$1.label = 5;
                if (((C5081) interfaceC50795).m9259(byteReadChannelOperationsKt$readUntil$1) != coroutineSingletons) {
                    ref$LongRef3 = ref$LongRef;
                    return new Long(ref$LongRef3.element);
                }
                return coroutineSingletons;
            }
            boolean z5 = byteReadChannelOperationsKt$readUntil$1.Z$0;
            j4 = byteReadChannelOperationsKt$readUntil$1.J$0;
            Ref$LongRef ref$LongRef6 = (Ref$LongRef) byteReadChannelOperationsKt$readUntil$1.L$6;
            bArr3 = (byte[]) byteReadChannelOperationsKt$readUntil$1.L$5;
            ref$IntRef3 = (Ref$IntRef) byteReadChannelOperationsKt$readUntil$1.L$4;
            iArr3 = (int[]) byteReadChannelOperationsKt$readUntil$1.L$3;
            interfaceC50794 = (InterfaceC5079) byteReadChannelOperationsKt$readUntil$1.L$2;
            c80344 = (C8034) byteReadChannelOperationsKt$readUntil$1.L$1;
            obj = null;
            InterfaceC5084 interfaceC50845 = (InterfaceC5084) byteReadChannelOperationsKt$readUntil$1.L$0;
            AbstractC6017.m10769(obj3);
            long j6 = ref$LongRef6.element;
            ByteReadChannelOperationsKt$readUntil$1 byteReadChannelOperationsKt$readUntil$13 = byteReadChannelOperationsKt$readUntil$1;
            ref$LongRef6.element = j6 + 1;
            new Long(j6);
            interfaceC50792 = interfaceC50794;
            c80342 = c80344;
            z2 = z5;
            interfaceC50842 = interfaceC50845;
            byteReadChannelOperationsKt$readUntil$12 = byteReadChannelOperationsKt$readUntil$13;
            byte[] bArr6 = bArr3;
            ref$LongRef = ref$LongRef6;
            j2 = j4;
            bArr = bArr6;
            ref$IntRef = ref$IntRef3;
            iArr = iArr3;
            if (ref$LongRef.element <= j2) {
                i4 = 2;
                if (interfaceC50842.mo9200()) {
                    byteReadChannelOperationsKt$readUntil$12.L$0 = interfaceC50842;
                    byteReadChannelOperationsKt$readUntil$12.L$1 = c80342;
                    byteReadChannelOperationsKt$readUntil$12.L$2 = interfaceC50792;
                    byteReadChannelOperationsKt$readUntil$12.L$3 = iArr;
                    byteReadChannelOperationsKt$readUntil$12.L$4 = ref$IntRef;
                    byteReadChannelOperationsKt$readUntil$12.L$5 = bArr;
                    byteReadChannelOperationsKt$readUntil$12.L$6 = ref$LongRef;
                    byteReadChannelOperationsKt$readUntil$12.J$0 = j2;
                    byteReadChannelOperationsKt$readUntil$12.Z$0 = z2;
                    byteReadChannelOperationsKt$readUntil$12.label = 1;
                    Object objM9239 = m9239(interfaceC50842, byteReadChannelOperationsKt$readUntil$12);
                    if (objM9239 != coroutineSingletons) {
                        long j7 = j2;
                        z3 = z2;
                        j3 = j7;
                        c80343 = c80342;
                        obj3 = objM9239;
                        interfaceC50793 = interfaceC50792;
                        byteReadChannelOperationsKt$readUntil$1 = byteReadChannelOperationsKt$readUntil$12;
                        ref$LongRef2 = ref$LongRef;
                        iArr2 = iArr;
                        bArr2 = bArr;
                        ref$IntRef2 = ref$IntRef;
                        interfaceC50843 = interfaceC50842;
                        bByteValue = ((Number) obj3).byteValue();
                        i = ref$IntRef2.element;
                        if (i > 0 || bByteValue == c80343.m12999(i)) {
                            int[] iArr622 = iArr2;
                            bArr3 = bArr2;
                            InterfaceC5079 interfaceC5079722 = interfaceC50793;
                            ref$IntRef3 = ref$IntRef2;
                            j4 = j3;
                            interfaceC50794 = interfaceC5079722;
                            c80344 = c80343;
                            iArr3 = iArr622;
                            if (bByteValue == c80344.m12999(ref$IntRef3.element)) {
                                int i8 = ref$IntRef3.element;
                                bArr3[i8] = bByteValue;
                                int i9 = i8 + 1;
                                ref$IntRef3.element = i9;
                                if (i9 == c80344.f19567.length) {
                                    return new Long(ref$LongRef2.element);
                                }
                                c80342 = c80344;
                                interfaceC50842 = interfaceC50843;
                                z2 = z3;
                                Ref$LongRef ref$LongRef7 = ref$LongRef2;
                                byteReadChannelOperationsKt$readUntil$12 = byteReadChannelOperationsKt$readUntil$1;
                                interfaceC50792 = interfaceC50794;
                                j2 = j4;
                                bArr = bArr3;
                                ref$LongRef = ref$LongRef7;
                                ref$IntRef = ref$IntRef3;
                                iArr = iArr3;
                                if (ref$LongRef.element <= j2) {
                                    StringBuilder sb = new StringBuilder("Limit of ");
                                    sb.append(j2);
                                    sb.append(" bytes exceeded while scanning for \"");
                                    c80342.getClass();
                                    byte[] bArr7 = c80342.f19567;
                                    bArr7.getClass();
                                    C6755.m11866(AbstractC0900.m708(sb, new String(bArr7, AbstractC5964.f15033), '\"'));
                                    return obj;
                                }
                            } else {
                                byteReadChannelOperationsKt$readUntil$1.L$0 = interfaceC50843;
                                byteReadChannelOperationsKt$readUntil$1.L$1 = c80344;
                                byteReadChannelOperationsKt$readUntil$1.L$2 = interfaceC50794;
                                byteReadChannelOperationsKt$readUntil$1.L$3 = iArr3;
                                byteReadChannelOperationsKt$readUntil$1.L$4 = ref$IntRef3;
                                byteReadChannelOperationsKt$readUntil$1.L$5 = bArr3;
                                byteReadChannelOperationsKt$readUntil$1.L$6 = ref$LongRef2;
                                byteReadChannelOperationsKt$readUntil$1.J$0 = j4;
                                byteReadChannelOperationsKt$readUntil$1.Z$0 = z3;
                                byteReadChannelOperationsKt$readUntil$1.label = 3;
                                if (AbstractC5078.m9249(interfaceC50794, bByteValue, byteReadChannelOperationsKt$readUntil$1) != coroutineSingletons) {
                                    z5 = z3;
                                    ref$LongRef6 = ref$LongRef2;
                                    interfaceC50845 = interfaceC50843;
                                    long j62 = ref$LongRef6.element;
                                    ByteReadChannelOperationsKt$readUntil$1 byteReadChannelOperationsKt$readUntil$132 = byteReadChannelOperationsKt$readUntil$1;
                                    ref$LongRef6.element = j62 + 1;
                                    new Long(j62);
                                    interfaceC50792 = interfaceC50794;
                                    c80342 = c80344;
                                    z2 = z5;
                                    interfaceC50842 = interfaceC50845;
                                    byteReadChannelOperationsKt$readUntil$12 = byteReadChannelOperationsKt$readUntil$132;
                                    byte[] bArr62 = bArr3;
                                    ref$LongRef = ref$LongRef6;
                                    j2 = j4;
                                    bArr = bArr62;
                                    ref$IntRef = ref$IntRef3;
                                    iArr = iArr3;
                                    if (ref$LongRef.element <= j2) {
                                    }
                                }
                            }
                        } else {
                            byteReadChannelOperationsKt$readUntil$1.L$0 = interfaceC50843;
                            byteReadChannelOperationsKt$readUntil$1.L$1 = c80343;
                            byteReadChannelOperationsKt$readUntil$1.L$2 = interfaceC50793;
                            byteReadChannelOperationsKt$readUntil$1.L$3 = iArr2;
                            byteReadChannelOperationsKt$readUntil$1.L$4 = ref$IntRef2;
                            byteReadChannelOperationsKt$readUntil$1.L$5 = bArr2;
                            byteReadChannelOperationsKt$readUntil$1.L$6 = ref$LongRef2;
                            byteReadChannelOperationsKt$readUntil$1.J$0 = j3;
                            byteReadChannelOperationsKt$readUntil$1.Z$0 = z3;
                            byteReadChannelOperationsKt$readUntil$1.B$0 = bByteValue;
                            byteReadChannelOperationsKt$readUntil$1.label = i4;
                        }
                    }
                } else {
                    if (!z2) {
                        c80342.getClass();
                        byte[] bArr8 = c80342.f19567;
                        bArr8.getClass();
                        throw new IOException("Expected \"" + AbstractC5971.m10696(new String(bArr8, AbstractC5964.f15033), "\n", "\\n") + "\" but encountered end of input");
                    }
                    byteReadChannelOperationsKt$readUntil$12.L$0 = interfaceC50792;
                    byteReadChannelOperationsKt$readUntil$12.L$1 = ref$LongRef;
                    obj2 = obj;
                    byteReadChannelOperationsKt$readUntil$12.L$2 = obj2;
                    byteReadChannelOperationsKt$readUntil$12.L$3 = obj2;
                    byteReadChannelOperationsKt$readUntil$12.L$4 = obj2;
                    byteReadChannelOperationsKt$readUntil$12.L$5 = obj2;
                    byteReadChannelOperationsKt$readUntil$12.L$6 = obj2;
                    byteReadChannelOperationsKt$readUntil$12.label = 4;
                    if (m9220(interfaceC50792, bArr, ref$IntRef, ref$LongRef, byteReadChannelOperationsKt$readUntil$12) != coroutineSingletons) {
                        interfaceC50795 = interfaceC50792;
                        byteReadChannelOperationsKt$readUntil$1 = byteReadChannelOperationsKt$readUntil$12;
                        byteReadChannelOperationsKt$readUntil$1.L$0 = ref$LongRef;
                        byteReadChannelOperationsKt$readUntil$1.L$1 = obj2;
                        byteReadChannelOperationsKt$readUntil$1.label = 5;
                        if (((C5081) interfaceC50795).m9259(byteReadChannelOperationsKt$readUntil$1) != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r1.mo9201(r7, r13) == r2) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00db -> B:44:0x00df). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9222(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, long j, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$2;
        InterfaceC5084 interfaceC50842;
        long j2;
        long j3;
        ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$22;
        InterfaceC5084 interfaceC50843;
        ?? r3;
        C5081 c5081;
        long j4;
        long j5;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$copyTo$2) {
            byteReadChannelOperationsKt$copyTo$2 = (ByteReadChannelOperationsKt$copyTo$2) continuationImpl;
            int i = byteReadChannelOperationsKt$copyTo$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$copyTo$2.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$copyTo$2 = new ByteReadChannelOperationsKt$copyTo$2(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$copyTo$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r32 = byteReadChannelOperationsKt$copyTo$2.label;
        int i2 = 1;
        try {
            if (r32 == 0) {
                AbstractC6017.m10769(obj);
                r32 = interfaceC5079;
                j2 = j;
                j3 = j2;
                byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                interfaceC50843 = interfaceC5084;
                if (interfaceC50843.mo9200()) {
                }
                byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                byteReadChannelOperationsKt$copyTo$22.label = 3;
                if (((C5081) r32).m9259(byteReadChannelOperationsKt$copyTo$22) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (r32 == 1) {
                j2 = byteReadChannelOperationsKt$copyTo$2.J$1;
                j3 = byteReadChannelOperationsKt$copyTo$2.J$0;
                InterfaceC5079 interfaceC50792 = (InterfaceC5079) byteReadChannelOperationsKt$copyTo$2.L$1;
                interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$copyTo$2.L$0;
                AbstractC6017.m10769(obj);
                r3 = interfaceC50792;
                long jMin = Math.min(j2, AbstractC7684.m12638(interfaceC50842.mo9202()));
                c5081 = (C5081) r3;
                interfaceC50842.mo9202().mo11160(c5081.m9261(), jMin);
                j2 -= jMin;
                byteReadChannelOperationsKt$copyTo$2.L$0 = interfaceC50842;
                byteReadChannelOperationsKt$copyTo$2.L$1 = c5081;
                byteReadChannelOperationsKt$copyTo$2.J$0 = j3;
                byteReadChannelOperationsKt$copyTo$2.J$1 = j2;
                byteReadChannelOperationsKt$copyTo$2.label = 2;
                if (c5081.m9259(byteReadChannelOperationsKt$copyTo$2) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (r32 != 2) {
                if (r32 == 3) {
                    j4 = byteReadChannelOperationsKt$copyTo$2.J$1;
                    j5 = byteReadChannelOperationsKt$copyTo$2.J$0;
                    AbstractC6017.m10769(obj);
                    return new Long(j5 - j4);
                }
                if (r32 != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th = (Throwable) byteReadChannelOperationsKt$copyTo$2.L$0;
                AbstractC6017.m10769(obj);
                throw th;
            }
            j2 = byteReadChannelOperationsKt$copyTo$2.J$1;
            j3 = byteReadChannelOperationsKt$copyTo$2.J$0;
            InterfaceC5079 interfaceC50793 = (InterfaceC5079) byteReadChannelOperationsKt$copyTo$2.L$1;
            InterfaceC5084 interfaceC50844 = (InterfaceC5084) byteReadChannelOperationsKt$copyTo$2.L$0;
            AbstractC6017.m10769(obj);
            byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
            interfaceC50843 = interfaceC50844;
            InterfaceC5079 interfaceC50794 = interfaceC50793;
            i2 = 1;
            r32 = interfaceC50794;
            try {
                if (!interfaceC50843.mo9200() || j2 <= 0) {
                    byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                    byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                    byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                    byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                    byteReadChannelOperationsKt$copyTo$22.label = 3;
                    if (((C5081) r32).m9259(byteReadChannelOperationsKt$copyTo$22) != coroutineSingletons) {
                        j4 = j2;
                        j5 = j3;
                        return new Long(j5 - j4);
                    }
                } else {
                    try {
                        if (interfaceC50843.mo9202().mo11163()) {
                            byteReadChannelOperationsKt$copyTo$22.L$0 = interfaceC50843;
                            byteReadChannelOperationsKt$copyTo$22.L$1 = r32;
                            byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                            byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                            byteReadChannelOperationsKt$copyTo$22.label = i2;
                        }
                        ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$23 = byteReadChannelOperationsKt$copyTo$22;
                        interfaceC50842 = interfaceC50843;
                        byteReadChannelOperationsKt$copyTo$2 = byteReadChannelOperationsKt$copyTo$23;
                        r3 = r32;
                        interfaceC50842.mo9202().mo11160(c5081.m9261(), jMin);
                        j2 -= jMin;
                        byteReadChannelOperationsKt$copyTo$2.L$0 = interfaceC50842;
                        byteReadChannelOperationsKt$copyTo$2.L$1 = c5081;
                        byteReadChannelOperationsKt$copyTo$2.J$0 = j3;
                        byteReadChannelOperationsKt$copyTo$2.J$1 = j2;
                        byteReadChannelOperationsKt$copyTo$2.label = 2;
                        if (c5081.m9259(byteReadChannelOperationsKt$copyTo$2) != coroutineSingletons) {
                            InterfaceC5084 interfaceC50845 = interfaceC50842;
                            byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                            interfaceC50843 = interfaceC50845;
                            interfaceC50794 = c5081;
                            i2 = 1;
                            r32 = interfaceC50794;
                            if (interfaceC50843.mo9200()) {
                            }
                            byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                            byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                            byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                            byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                            byteReadChannelOperationsKt$copyTo$22.label = 3;
                            if (((C5081) r32).m9259(byteReadChannelOperationsKt$copyTo$22) != coroutineSingletons) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r32 = c5081;
                        try {
                            interfaceC50842.mo9204(th);
                            AbstractC5078.m9251(r32, th);
                            throw th;
                        } catch (Throwable th3) {
                            byteReadChannelOperationsKt$copyTo$2.L$0 = th3;
                            byteReadChannelOperationsKt$copyTo$2.L$1 = null;
                            byteReadChannelOperationsKt$copyTo$2.label = 4;
                            if (((C5081) r32).m9259(byteReadChannelOperationsKt$copyTo$2) != coroutineSingletons) {
                                throw th3;
                            }
                        }
                    }
                    long jMin2 = Math.min(j2, AbstractC7684.m12638(interfaceC50842.mo9202()));
                    c5081 = (C5081) r3;
                }
                return coroutineSingletons;
            } catch (Throwable th4) {
                th = th4;
                ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$24 = byteReadChannelOperationsKt$copyTo$22;
                interfaceC50842 = interfaceC50843;
                byteReadChannelOperationsKt$copyTo$2 = byteReadChannelOperationsKt$copyTo$24;
                interfaceC50842.mo9204(th);
                AbstractC5078.m9251(r32, th);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r8.mo9201(1, r0) != r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #2 {all -> 0x00aa, blocks: (B:27:0x006b, B:29:0x0071), top: B:59:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [io.ktor.utils.io.飘花落叶言子楪苏世兰哲, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:20:0x0050). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9223(InterfaceC5084 interfaceC5084, C5081 c5081, ContinuationImpl continuationImpl) throws Throwable {
        ByteReadChannelOperationsKt$copyTo$1 byteReadChannelOperationsKt$copyTo$1;
        InterfaceC5084 interfaceC50842;
        long j;
        long j2;
        ?? r13;
        long j3;
        ?? r2;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$copyTo$1) {
            byteReadChannelOperationsKt$copyTo$1 = (ByteReadChannelOperationsKt$copyTo$1) continuationImpl;
            int i = byteReadChannelOperationsKt$copyTo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$copyTo$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$copyTo$1 = new ByteReadChannelOperationsKt$copyTo$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$copyTo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r22 = byteReadChannelOperationsKt$copyTo$1.label;
        try {
            if (r22 == 0) {
                AbstractC6017.m10769(obj);
                j = 0;
                r13 = c5081;
                if (interfaceC5084.mo9200()) {
                }
                return coroutineSingletons;
            }
            if (r22 == 1) {
                j2 = byteReadChannelOperationsKt$copyTo$1.J$0;
                InterfaceC5079 interfaceC5079 = (InterfaceC5079) byteReadChannelOperationsKt$copyTo$1.L$1;
                interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$copyTo$1.L$0;
                AbstractC6017.m10769(obj);
                r22 = interfaceC5079;
                byteReadChannelOperationsKt$copyTo$1.L$0 = interfaceC50842;
                byteReadChannelOperationsKt$copyTo$1.L$1 = r22;
                byteReadChannelOperationsKt$copyTo$1.J$0 = j2;
                byteReadChannelOperationsKt$copyTo$1.label = 2;
                r2 = r22;
            } else {
                if (r22 != 2) {
                    if (r22 == 3) {
                        j3 = byteReadChannelOperationsKt$copyTo$1.J$0;
                        AbstractC6017.m10769(obj);
                        return new Long(j3);
                    }
                    if (r22 != 4) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) byteReadChannelOperationsKt$copyTo$1.L$0;
                    AbstractC6017.m10769(obj);
                    throw th;
                }
                j2 = byteReadChannelOperationsKt$copyTo$1.J$0;
                InterfaceC5079 interfaceC50792 = (InterfaceC5079) byteReadChannelOperationsKt$copyTo$1.L$1;
                interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$copyTo$1.L$0;
                AbstractC6017.m10769(obj);
                r2 = interfaceC50792;
                long j4 = j2;
                interfaceC5084 = interfaceC50842;
                j = j4;
                r13 = r2;
                try {
                    if (interfaceC5084.mo9200()) {
                        r22 = (C5081) r13;
                        try {
                            long jMo11159 = j + interfaceC5084.mo9202().mo11159(r22.m9261());
                            byteReadChannelOperationsKt$copyTo$1.L$0 = interfaceC5084;
                            byteReadChannelOperationsKt$copyTo$1.L$1 = r22;
                            byteReadChannelOperationsKt$copyTo$1.J$0 = jMo11159;
                            byteReadChannelOperationsKt$copyTo$1.label = 1;
                            if (r22.m9259(byteReadChannelOperationsKt$copyTo$1) != coroutineSingletons) {
                                interfaceC50842 = interfaceC5084;
                                j2 = jMo11159;
                                r22 = r22;
                                byteReadChannelOperationsKt$copyTo$1.L$0 = interfaceC50842;
                                byteReadChannelOperationsKt$copyTo$1.L$1 = r22;
                                byteReadChannelOperationsKt$copyTo$1.J$0 = j2;
                                byteReadChannelOperationsKt$copyTo$1.label = 2;
                                r2 = r22;
                            }
                        } catch (Throwable th2) {
                            interfaceC50842 = interfaceC5084;
                            th = th2;
                            try {
                                interfaceC50842.mo9204(th);
                                AbstractC5078.m9251(r22, th);
                                throw th;
                            } catch (Throwable th3) {
                                byteReadChannelOperationsKt$copyTo$1.L$0 = th3;
                                byteReadChannelOperationsKt$copyTo$1.L$1 = null;
                                byteReadChannelOperationsKt$copyTo$1.label = 4;
                                if (((C5081) r22).m9259(byteReadChannelOperationsKt$copyTo$1) != coroutineSingletons) {
                                    throw th3;
                                }
                            }
                        }
                    } else {
                        byteReadChannelOperationsKt$copyTo$1.L$0 = null;
                        byteReadChannelOperationsKt$copyTo$1.L$1 = null;
                        byteReadChannelOperationsKt$copyTo$1.J$0 = j;
                        byteReadChannelOperationsKt$copyTo$1.label = 3;
                        if (((C5081) r13).m9259(byteReadChannelOperationsKt$copyTo$1) != coroutineSingletons) {
                            j3 = j;
                            return new Long(j3);
                        }
                    }
                    return coroutineSingletons;
                } catch (Throwable th4) {
                    interfaceC50842 = interfaceC5084;
                    r22 = r13;
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r8.mo9201(1, r0) != r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #3 {all -> 0x00aa, blocks: (B:27:0x006b, B:29:0x0071, B:42:0x00ac, B:50:0x00ca), top: B:64:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[Catch: all -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00aa, blocks: (B:27:0x006b, B:29:0x0071, B:42:0x00ac, B:50:0x00ca), top: B:64:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [io.ktor.utils.io.飘花落叶言子楪苏世兰哲, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:20:0x0050). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9224(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, ContinuationImpl continuationImpl) throws Throwable {
        ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$1;
        InterfaceC5084 interfaceC50842;
        long j;
        long j2;
        ?? r13;
        long j3;
        ?? r2;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$copyAndClose$1) {
            byteReadChannelOperationsKt$copyAndClose$1 = (ByteReadChannelOperationsKt$copyAndClose$1) continuationImpl;
            int i = byteReadChannelOperationsKt$copyAndClose$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$copyAndClose$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$copyAndClose$1 = new ByteReadChannelOperationsKt$copyAndClose$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$copyAndClose$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r22 = byteReadChannelOperationsKt$copyAndClose$1.label;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (r22 == 0) {
            AbstractC6017.m10769(obj);
            j = 0;
            r13 = interfaceC5079;
            if (interfaceC5084.mo9200()) {
            }
            return coroutineSingletons;
        }
        if (r22 != 1) {
            if (r22 != 2) {
                if (r22 == 3) {
                    j3 = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                    AbstractC6017.m10769(obj);
                    return new Long(j3);
                }
                if (r22 != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                AbstractC6017.m10769(obj);
                throw th2;
            }
            j2 = byteReadChannelOperationsKt$copyAndClose$1.J$0;
            InterfaceC5079 interfaceC50792 = (InterfaceC5079) byteReadChannelOperationsKt$copyAndClose$1.L$1;
            interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$copyAndClose$1.L$0;
            AbstractC6017.m10769(obj);
            r2 = interfaceC50792;
            long j4 = j2;
            interfaceC5084 = interfaceC50842;
            j = j4;
            r13 = r2;
            try {
            } catch (Throwable th3) {
                interfaceC50842 = interfaceC5084;
                r22 = r13;
                th = th3;
            }
            if (interfaceC5084.mo9200()) {
                r22 = (C5081) r13;
                try {
                    long jMo11159 = j + interfaceC5084.mo9202().mo11159(r22.m9261());
                    byteReadChannelOperationsKt$copyAndClose$1.L$0 = interfaceC5084;
                    byteReadChannelOperationsKt$copyAndClose$1.L$1 = r22;
                    byteReadChannelOperationsKt$copyAndClose$1.J$0 = jMo11159;
                    byteReadChannelOperationsKt$copyAndClose$1.label = 1;
                    if (r22.m9259(byteReadChannelOperationsKt$copyAndClose$1) != coroutineSingletons) {
                        interfaceC50842 = interfaceC5084;
                        j2 = jMo11159;
                        r22 = r22;
                        byteReadChannelOperationsKt$copyAndClose$1.L$0 = interfaceC50842;
                        byteReadChannelOperationsKt$copyAndClose$1.L$1 = r22;
                        byteReadChannelOperationsKt$copyAndClose$1.J$0 = j2;
                        byteReadChannelOperationsKt$copyAndClose$1.label = 2;
                        r2 = r22;
                    }
                } catch (Throwable th4) {
                    interfaceC50842 = interfaceC5084;
                    th = th4;
                }
            } else {
                Throwable thMo9203 = interfaceC5084.mo9203();
                if (thMo9203 != null) {
                    throw thMo9203;
                }
                byteReadChannelOperationsKt$copyAndClose$1.L$0 = null;
                byteReadChannelOperationsKt$copyAndClose$1.L$1 = null;
                byteReadChannelOperationsKt$copyAndClose$1.J$0 = j;
                byteReadChannelOperationsKt$copyAndClose$1.label = 3;
                if (((C5081) r13).m9263(byteReadChannelOperationsKt$copyAndClose$1) != coroutineSingletons) {
                    j3 = j;
                    return new Long(j3);
                }
                try {
                    interfaceC50842.mo9204(th);
                    AbstractC5078.m9251(r22, th);
                    throw th;
                } catch (Throwable th5) {
                    byteReadChannelOperationsKt$copyAndClose$1.L$0 = th5;
                    byteReadChannelOperationsKt$copyAndClose$1.L$1 = null;
                    byteReadChannelOperationsKt$copyAndClose$1.label = 4;
                    if (((C5081) r22).m9263(byteReadChannelOperationsKt$copyAndClose$1) != coroutineSingletons) {
                        throw th5;
                    }
                }
            }
            return coroutineSingletons;
        }
        j2 = byteReadChannelOperationsKt$copyAndClose$1.J$0;
        InterfaceC5079 interfaceC50793 = (InterfaceC5079) byteReadChannelOperationsKt$copyAndClose$1.L$1;
        interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$copyAndClose$1.L$0;
        AbstractC6017.m10769(obj);
        r22 = interfaceC50793;
        byteReadChannelOperationsKt$copyAndClose$1.L$0 = interfaceC50842;
        byteReadChannelOperationsKt$copyAndClose$1.L$1 = r22;
        byteReadChannelOperationsKt$copyAndClose$1.J$0 = j2;
        byteReadChannelOperationsKt$copyAndClose$1.label = 2;
        r2 = r22;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m9225(InterfaceC5079 interfaceC5079) {
        interfaceC5079.getClass();
        AbstractC5078.m9250(new ByteWriteChannelKt$close$1(interfaceC5079));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m9226(InterfaceC5084 interfaceC5084) {
        interfaceC5084.getClass();
        interfaceC5084.mo9204(new IOException("Channel was cancelled"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11031(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006f -> B:13:0x002f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9227(InterfaceC5084 interfaceC5084, int i, ContinuationImpl continuationImpl) throws EOFException {
        ByteReadChannelOperationsKt$awaitUntilReadable$1 byteReadChannelOperationsKt$awaitUntilReadable$1;
        InterfaceC5084 interfaceC50842;
        int i2;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$awaitUntilReadable$1) {
            byteReadChannelOperationsKt$awaitUntilReadable$1 = (ByteReadChannelOperationsKt$awaitUntilReadable$1) continuationImpl;
            int i3 = byteReadChannelOperationsKt$awaitUntilReadable$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$awaitUntilReadable$1.label = i3 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$awaitUntilReadable$1 = new ByteReadChannelOperationsKt$awaitUntilReadable$1(continuationImpl);
            }
        }
        Object objMo9201 = byteReadChannelOperationsKt$awaitUntilReadable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = byteReadChannelOperationsKt$awaitUntilReadable$1.label;
        if (i4 == 0) {
            AbstractC6017.m10769(objMo9201);
            if (m9242(interfaceC5084) < i) {
            }
            if (m9242(interfaceC5084) < i) {
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = byteReadChannelOperationsKt$awaitUntilReadable$1.I$0;
                interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$awaitUntilReadable$1.L$0;
                AbstractC6017.m10769(objMo9201);
                InterfaceC5084 interfaceC50843 = interfaceC50842;
                i = i2;
                interfaceC5084 = interfaceC50843;
                if (m9242(interfaceC5084) < i) {
                    byteReadChannelOperationsKt$awaitUntilReadable$1.L$0 = interfaceC5084;
                    byteReadChannelOperationsKt$awaitUntilReadable$1.I$0 = i;
                    byteReadChannelOperationsKt$awaitUntilReadable$1.label = 1;
                    objMo9201 = interfaceC5084.mo9201(i, byteReadChannelOperationsKt$awaitUntilReadable$1);
                    if (objMo9201 != coroutineSingletons) {
                        int i5 = i;
                        interfaceC50842 = interfaceC5084;
                        i2 = i5;
                        if (((Boolean) objMo9201).booleanValue()) {
                            InterfaceC5084 interfaceC50844 = interfaceC50842;
                            i = i2;
                            interfaceC5084 = interfaceC50844;
                        } else {
                            byteReadChannelOperationsKt$awaitUntilReadable$1.L$0 = interfaceC50842;
                            byteReadChannelOperationsKt$awaitUntilReadable$1.I$0 = i2;
                            byteReadChannelOperationsKt$awaitUntilReadable$1.label = 2;
                        }
                    }
                    return coroutineSingletons;
                }
                if (m9242(interfaceC5084) < i) {
                    return C6008.f15084;
                }
                throw new EOFException("Not enough data available");
            }
            i2 = byteReadChannelOperationsKt$awaitUntilReadable$1.I$0;
            interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$awaitUntilReadable$1.L$0;
            AbstractC6017.m10769(objMo9201);
            if (((Boolean) objMo9201).booleanValue()) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9228(InterfaceC5084 interfaceC5084, long j, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$readRemaining$2 byteReadChannelOperationsKt$readRemaining$2;
        InterfaceC6316 c6309;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readRemaining$2) {
            byteReadChannelOperationsKt$readRemaining$2 = (ByteReadChannelOperationsKt$readRemaining$2) continuationImpl;
            int i = byteReadChannelOperationsKt$readRemaining$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readRemaining$2.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readRemaining$2 = new ByteReadChannelOperationsKt$readRemaining$2(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readRemaining$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$readRemaining$2.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            c6309 = new C6309();
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = byteReadChannelOperationsKt$readRemaining$2.J$0;
            InterfaceC6316 interfaceC6316 = (InterfaceC6316) byteReadChannelOperationsKt$readRemaining$2.L$1;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$readRemaining$2.L$0;
            AbstractC6017.m10769(obj);
            c6309 = interfaceC6316;
            j = j2;
            interfaceC5084 = interfaceC50842;
        }
        while (!interfaceC5084.mo9200()) {
            long jM12638 = 0;
            if (j <= 0) {
                break;
            }
            if (j >= AbstractC7684.m12638(interfaceC5084.mo9202())) {
                jM12638 = j - AbstractC7684.m12638(interfaceC5084.mo9202());
                new Long(interfaceC5084.mo9202().mo11159(c6309));
            } else {
                interfaceC5084.mo9202().mo11160(c6309, j);
            }
            byteReadChannelOperationsKt$readRemaining$2.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$readRemaining$2.L$1 = c6309;
            byteReadChannelOperationsKt$readRemaining$2.J$0 = jM12638;
            byteReadChannelOperationsKt$readRemaining$2.label = 1;
            if (interfaceC5084.mo9201(1, byteReadChannelOperationsKt$readRemaining$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = jM12638;
        }
        C6309 c63092 = (C6309) c6309;
        c63092.getClass();
        return c63092;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:24:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:23:0x0065). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9229(InterfaceC5084 interfaceC5084, int i, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$readPacket$1 byteReadChannelOperationsKt$readPacket$1;
        int i2;
        C6309 c6309;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readPacket$1) {
            byteReadChannelOperationsKt$readPacket$1 = (ByteReadChannelOperationsKt$readPacket$1) continuationImpl;
            int i3 = byteReadChannelOperationsKt$readPacket$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readPacket$1.label = i3 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readPacket$1 = new ByteReadChannelOperationsKt$readPacket$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readPacket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = byteReadChannelOperationsKt$readPacket$1.label;
        if (i4 != 0) {
            if (i4 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = byteReadChannelOperationsKt$readPacket$1.I$0;
            c6309 = (C6309) byteReadChannelOperationsKt$readPacket$1.L$1;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$readPacket$1.L$0;
            AbstractC6017.m10769(obj);
            i2 = i5;
            interfaceC5084 = interfaceC50842;
            if (!interfaceC5084.mo9200()) {
                long j = i2;
                if (AbstractC7684.m12638(interfaceC5084.mo9202()) > j - c6309.f15487) {
                    interfaceC5084.mo9202().mo11160(c6309, j - c6309.f15487);
                } else {
                    new Long(interfaceC5084.mo9202().mo11159(c6309));
                }
                if (c6309.f15487 < i2) {
                    if (interfaceC5084.mo9202().mo11163()) {
                        byteReadChannelOperationsKt$readPacket$1.L$0 = interfaceC5084;
                        byteReadChannelOperationsKt$readPacket$1.L$1 = c6309;
                        byteReadChannelOperationsKt$readPacket$1.I$0 = i2;
                        byteReadChannelOperationsKt$readPacket$1.label = 1;
                        if (interfaceC5084.mo9201(1, byteReadChannelOperationsKt$readPacket$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC50842 = interfaceC5084;
                        i5 = i2;
                        i2 = i5;
                        interfaceC5084 = interfaceC50842;
                    }
                    if (!interfaceC5084.mo9200()) {
                    }
                }
            }
            if (c6309.f15487 < i2) {
                return c6309;
            }
            StringBuilder sbM710 = AbstractC0900.m710(i2, "Not enough data available, required ", " bytes but only ");
            sbM710.append(c6309.f15487);
            sbM710.append(" available");
            throw new EOFException(sbM710.toString());
        }
        AbstractC6017.m10769(obj);
        i2 = i;
        c6309 = new C6309();
        if (c6309.f15487 < i2) {
        }
        if (c6309.f15487 < i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9230(InterfaceC5084 interfaceC5084, int i, ContinuationImpl continuationImpl) throws IOException {
        ByteReadChannelOperationsKt$readUTF8Line$1 byteReadChannelOperationsKt$readUTF8Line$1;
        StringBuilder sb;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readUTF8Line$1) {
            byteReadChannelOperationsKt$readUTF8Line$1 = (ByteReadChannelOperationsKt$readUTF8Line$1) continuationImpl;
            int i2 = byteReadChannelOperationsKt$readUTF8Line$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readUTF8Line$1.label = i2 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readUTF8Line$1 = new ByteReadChannelOperationsKt$readUTF8Line$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readUTF8Line$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = byteReadChannelOperationsKt$readUTF8Line$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            StringBuilder sb2 = new StringBuilder();
            byteReadChannelOperationsKt$readUTF8Line$1.L$0 = sb2;
            byteReadChannelOperationsKt$readUTF8Line$1.label = 1;
            Object objM9231 = m9231(interfaceC5084, sb2, i, byteReadChannelOperationsKt$readUTF8Line$1);
            if (objM9231 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM9231;
            sb = sb2;
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sb = (StringBuilder) byteReadChannelOperationsKt$readUTF8Line$1.L$0;
            AbstractC6017.m10769(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r24.mo9201(1, r2) == r3) goto L76;
     */
    /* JADX WARN: Path cross not found for [B:37:0x00cf, B:47:0x0110], limit reached: 98 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:35:0x00b2). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9231(InterfaceC5084 interfaceC5084, Appendable appendable, int i, ContinuationImpl continuationImpl) throws IOException {
        ByteReadChannelOperationsKt$readUTF8LineTo$1 byteReadChannelOperationsKt$readUTF8LineTo$1;
        Appendable appendable2;
        int i2;
        InterfaceC5084 interfaceC50842;
        int i3;
        int i4;
        int i5;
        long j;
        InterfaceC5084 interfaceC50843;
        C6309 c6309Mo11162;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readUTF8LineTo$1) {
            byteReadChannelOperationsKt$readUTF8LineTo$1 = (ByteReadChannelOperationsKt$readUTF8LineTo$1) continuationImpl;
            int i6 = byteReadChannelOperationsKt$readUTF8LineTo$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readUTF8LineTo$1.label = i6 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readUTF8LineTo$1 = new ByteReadChannelOperationsKt$readUTF8LineTo$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readUTF8LineTo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = byteReadChannelOperationsKt$readUTF8LineTo$1.label;
        int i8 = 2;
        if (i7 == 0) {
            AbstractC6017.m10769(obj);
            if (interfaceC5084.mo9202().mo11163()) {
                byteReadChannelOperationsKt$readUTF8LineTo$1.L$0 = interfaceC5084;
                appendable2 = appendable;
                byteReadChannelOperationsKt$readUTF8LineTo$1.L$1 = appendable2;
                i2 = i;
                byteReadChannelOperationsKt$readUTF8LineTo$1.I$0 = i2;
                byteReadChannelOperationsKt$readUTF8LineTo$1.label = 1;
            } else {
                appendable2 = appendable;
                i2 = i;
            }
            interfaceC50842 = interfaceC5084;
            i3 = i2;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC50843 = (InterfaceC5084) byteReadChannelOperationsKt$readUTF8LineTo$1.L$0;
                    AbstractC6017.m10769(obj);
                    j = 0;
                    interfaceC50842 = interfaceC50843;
                    c6309Mo11162 = interfaceC50842.mo9202().mo11162();
                    if (j >= c6309Mo11162.f15487) {
                        C6311 c6311 = c6309Mo11162.f15488;
                        c6311.getClass();
                        if (c6311.f15495[c6311.f15494] == 10) {
                            AbstractC7684.m12639(interfaceC50842.mo9202(), 1L);
                        }
                        return Boolean.TRUE;
                    }
                    throw new IndexOutOfBoundsException("position (0) is not within the range [0..size(" + c6309Mo11162.f15487 + "))");
                }
                i5 = byteReadChannelOperationsKt$readUTF8LineTo$1.I$1;
                i4 = byteReadChannelOperationsKt$readUTF8LineTo$1.I$0;
                Appendable appendable3 = (Appendable) byteReadChannelOperationsKt$readUTF8LineTo$1.L$1;
                InterfaceC5084 interfaceC50844 = (InterfaceC5084) byteReadChannelOperationsKt$readUTF8LineTo$1.L$0;
                AbstractC6017.m10769(obj);
                appendable2 = appendable3;
                interfaceC50842 = interfaceC50844;
                j = 0;
                long jM11176 = AbstractC6310.m11176(interfaceC50842.mo9202(), (byte) 13);
                long jM111762 = AbstractC6310.m11176(interfaceC50842.mo9202(), (byte) 10);
                if (jM11176 == -1 || jM111762 != -1) {
                    if (jM11176 < 0 && jM111762 == jM11176 + 1) {
                        long jMin = i4 != Integer.MAX_VALUE ? jM11176 : Math.min(i4 - i5, (int) jM11176);
                        appendable2.append(AbstractC6310.m11183(interfaceC50842.mo9202(), jMin));
                        if (jMin == jM11176) {
                            AbstractC7684.m12639(interfaceC50842.mo9202(), 2L);
                        }
                        return Boolean.TRUE;
                    }
                    if (jM11176 < 0 && (jM111762 == -1 || jM11176 < jM111762)) {
                        long jMin2 = i4 != Integer.MAX_VALUE ? jM11176 : Math.min(i4 - i5, (int) jM11176);
                        appendable2.append(AbstractC6310.m11183(interfaceC50842.mo9202(), jMin2));
                        if (jMin2 == jM11176) {
                            AbstractC7684.m12639(interfaceC50842.mo9202(), 1L);
                        }
                        if (interfaceC50842.mo9202().mo11163()) {
                            byteReadChannelOperationsKt$readUTF8LineTo$1.L$0 = interfaceC50842;
                            byteReadChannelOperationsKt$readUTF8LineTo$1.L$1 = null;
                            byteReadChannelOperationsKt$readUTF8LineTo$1.label = 3;
                            if (interfaceC50842.mo9201(1, byteReadChannelOperationsKt$readUTF8LineTo$1) != coroutineSingletons) {
                                interfaceC50843 = interfaceC50842;
                                interfaceC50842 = interfaceC50843;
                            }
                            return coroutineSingletons;
                        }
                        c6309Mo11162 = interfaceC50842.mo9202().mo11162();
                        if (j >= c6309Mo11162.f15487) {
                        }
                    } else if (jM111762 < 0) {
                        long jMin3 = i4 != Integer.MAX_VALUE ? jM111762 : Math.min(i4 - i5, (int) jM111762);
                        appendable2.append(AbstractC6310.m11183(interfaceC50842.mo9202(), jMin3));
                        if (jMin3 == jM111762) {
                            AbstractC7684.m12639(interfaceC50842.mo9202(), 1L);
                        }
                        return Boolean.TRUE;
                    }
                } else if (i4 == Integer.MAX_VALUE) {
                    appendable2.append(AbstractC6310.m11189(interfaceC50842.mo9202()));
                } else {
                    int iMin = Math.min(i4 - i5, (int) AbstractC7684.m12638(interfaceC50842.mo9202()));
                    i5 += iMin;
                    appendable2.append(AbstractC6310.m11183(interfaceC50842.mo9202(), iMin));
                    if (i5 == i4) {
                        throw new TooLongLineException(AbstractC0900.m722(i4, "Line exceeds limit of ", " characters"));
                    }
                }
                i8 = 2;
                if (!interfaceC50842.mo9200()) {
                    return Boolean.TRUE;
                }
                byteReadChannelOperationsKt$readUTF8LineTo$1.L$0 = interfaceC50842;
                byteReadChannelOperationsKt$readUTF8LineTo$1.L$1 = appendable2;
                byteReadChannelOperationsKt$readUTF8LineTo$1.I$0 = i4;
                byteReadChannelOperationsKt$readUTF8LineTo$1.I$1 = i5;
                byteReadChannelOperationsKt$readUTF8LineTo$1.label = i8;
                if (interfaceC50842.mo9201(1, byteReadChannelOperationsKt$readUTF8LineTo$1) != coroutineSingletons) {
                    j = 0;
                    long jM111763 = AbstractC6310.m11176(interfaceC50842.mo9202(), (byte) 13);
                    long jM1117622 = AbstractC6310.m11176(interfaceC50842.mo9202(), (byte) 10);
                    if (jM111763 == -1) {
                    }
                    if (jM111763 < 0) {
                    }
                    if (jM111763 < 0) {
                    }
                    if (jM1117622 < 0) {
                    }
                }
                return coroutineSingletons;
            }
            i3 = byteReadChannelOperationsKt$readUTF8LineTo$1.I$0;
            Appendable appendable4 = (Appendable) byteReadChannelOperationsKt$readUTF8LineTo$1.L$1;
            interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$readUTF8LineTo$1.L$0;
            AbstractC6017.m10769(obj);
            appendable2 = appendable4;
        }
        if (interfaceC50842.mo9200()) {
            return Boolean.FALSE;
        }
        i4 = i3;
        i5 = 0;
        if (!interfaceC50842.mo9200()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlinx.io.飘花落叶言子楪世苏哲兰] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9232(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) throws Throwable {
        ByteReadChannelOperationsKt$readRemaining$1 byteReadChannelOperationsKt$readRemaining$1;
        ?? c6309;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readRemaining$1) {
            byteReadChannelOperationsKt$readRemaining$1 = (ByteReadChannelOperationsKt$readRemaining$1) continuationImpl;
            int i = byteReadChannelOperationsKt$readRemaining$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readRemaining$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readRemaining$1 = new ByteReadChannelOperationsKt$readRemaining$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readRemaining$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$readRemaining$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            c6309 = new C6309();
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC6316 interfaceC6316 = (InterfaceC6316) byteReadChannelOperationsKt$readRemaining$1.L$1;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$readRemaining$1.L$0;
            AbstractC6017.m10769(obj);
            c6309 = interfaceC6316;
            interfaceC5084 = interfaceC50842;
        }
        while (!interfaceC5084.mo9200()) {
            c6309 = (C6309) c6309;
            c6309.m11172(interfaceC5084.mo9202());
            byteReadChannelOperationsKt$readRemaining$1.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$readRemaining$1.L$1 = c6309;
            byteReadChannelOperationsKt$readRemaining$1.label = 1;
            if (interfaceC5084.mo9201(1, byteReadChannelOperationsKt$readRemaining$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Throwable thMo9203 = interfaceC5084.mo9203();
        if (thMo9203 != null) {
            throw thMo9203;
        }
        C6309 c63092 = (C6309) c6309;
        c63092.getClass();
        return c63092;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9233(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$readShort$1 byteReadChannelOperationsKt$readShort$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readShort$1) {
            byteReadChannelOperationsKt$readShort$1 = (ByteReadChannelOperationsKt$readShort$1) continuationImpl;
            int i = byteReadChannelOperationsKt$readShort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readShort$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readShort$1 = new ByteReadChannelOperationsKt$readShort$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readShort$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$readShort$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            byteReadChannelOperationsKt$readShort$1.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$readShort$1.label = 1;
            if (m9227(interfaceC5084, 2, byteReadChannelOperationsKt$readShort$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5084 = (InterfaceC5084) byteReadChannelOperationsKt$readShort$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return new Short(interfaceC5084.mo9202().readShort());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9234(InterfaceC5084 interfaceC5084, byte[] bArr, int i, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$readAvailable$1 byteReadChannelOperationsKt$readAvailable$1;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readAvailable$1) {
            byteReadChannelOperationsKt$readAvailable$1 = (ByteReadChannelOperationsKt$readAvailable$1) continuationImpl;
            int i5 = byteReadChannelOperationsKt$readAvailable$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readAvailable$1.label = i5 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readAvailable$1 = new ByteReadChannelOperationsKt$readAvailable$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = byteReadChannelOperationsKt$readAvailable$1.label;
        if (i6 == 0) {
            AbstractC6017.m10769(obj);
            if (interfaceC5084.mo9200()) {
                return new Integer(-1);
            }
            if (!interfaceC5084.mo9202().mo11163()) {
                i2 = i;
                i3 = 0;
                if (!interfaceC5084.mo9200()) {
                    return new Integer(-1);
                }
                InterfaceC6313 interfaceC6313Mo9202 = interfaceC5084.mo9202();
                interfaceC6313Mo9202.getClass();
                bArr.getClass();
                int iMo11166 = interfaceC6313Mo9202.mo11166(i3, bArr, i2 + i3);
                return new Integer(iMo11166 != -1 ? iMo11166 : 0);
            }
            byteReadChannelOperationsKt$readAvailable$1.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$readAvailable$1.L$1 = bArr;
            byteReadChannelOperationsKt$readAvailable$1.I$0 = 0;
            byteReadChannelOperationsKt$readAvailable$1.I$1 = i;
            byteReadChannelOperationsKt$readAvailable$1.label = 1;
            if (interfaceC5084.mo9201(1, byteReadChannelOperationsKt$readAvailable$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i2 = i;
            bArr2 = bArr;
            i4 = 0;
        } else {
            if (i6 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = byteReadChannelOperationsKt$readAvailable$1.I$1;
            int i8 = byteReadChannelOperationsKt$readAvailable$1.I$0;
            byte[] bArr3 = (byte[]) byteReadChannelOperationsKt$readAvailable$1.L$1;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$readAvailable$1.L$0;
            AbstractC6017.m10769(obj);
            i2 = i7;
            bArr2 = bArr3;
            i4 = i8;
            interfaceC5084 = interfaceC50842;
        }
        byte[] bArr4 = bArr2;
        i3 = i4;
        bArr = bArr4;
        if (!interfaceC5084.mo9200()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9235(InterfaceC5084 interfaceC5084, ByteBuffer byteBuffer, ContinuationImpl continuationImpl) {
        ByteReadChannelOperations_jvmKt$readAvailable$1 byteReadChannelOperations_jvmKt$readAvailable$1;
        if (continuationImpl instanceof ByteReadChannelOperations_jvmKt$readAvailable$1) {
            byteReadChannelOperations_jvmKt$readAvailable$1 = (ByteReadChannelOperations_jvmKt$readAvailable$1) continuationImpl;
            int i = byteReadChannelOperations_jvmKt$readAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$readAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperations_jvmKt$readAvailable$1 = new ByteReadChannelOperations_jvmKt$readAvailable$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperations_jvmKt$readAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperations_jvmKt$readAvailable$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (interfaceC5084.mo9200()) {
                return new Integer(-1);
            }
            if (interfaceC5084.mo9202().mo11163()) {
                byteReadChannelOperations_jvmKt$readAvailable$1.L$0 = interfaceC5084;
                byteReadChannelOperations_jvmKt$readAvailable$1.L$1 = byteBuffer;
                byteReadChannelOperations_jvmKt$readAvailable$1.label = 1;
                if (interfaceC5084.mo9201(1, byteReadChannelOperations_jvmKt$readAvailable$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            byteBuffer = (ByteBuffer) byteReadChannelOperations_jvmKt$readAvailable$1.L$1;
            interfaceC5084 = (InterfaceC5084) byteReadChannelOperations_jvmKt$readAvailable$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return interfaceC5084.mo9200() ? new Integer(-1) : new Integer(AbstractC6310.m11186(interfaceC5084.mo9202(), byteBuffer));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9236(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$readInt$1 byteReadChannelOperationsKt$readInt$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readInt$1) {
            byteReadChannelOperationsKt$readInt$1 = (ByteReadChannelOperationsKt$readInt$1) continuationImpl;
            int i = byteReadChannelOperationsKt$readInt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readInt$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readInt$1 = new ByteReadChannelOperationsKt$readInt$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readInt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$readInt$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            byteReadChannelOperationsKt$readInt$1.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$readInt$1.label = 1;
            if (m9227(interfaceC5084, 4, byteReadChannelOperationsKt$readInt$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5084 = (InterfaceC5084) byteReadChannelOperationsKt$readInt$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return new Integer(interfaceC5084.mo9202().readInt());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9237(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$readLong$1 byteReadChannelOperationsKt$readLong$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readLong$1) {
            byteReadChannelOperationsKt$readLong$1 = (ByteReadChannelOperationsKt$readLong$1) continuationImpl;
            int i = byteReadChannelOperationsKt$readLong$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readLong$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readLong$1 = new ByteReadChannelOperationsKt$readLong$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readLong$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$readLong$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            byteReadChannelOperationsKt$readLong$1.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$readLong$1.label = 1;
            if (m9227(interfaceC5084, 8, byteReadChannelOperationsKt$readLong$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5084 = (InterfaceC5084) byteReadChannelOperationsKt$readLong$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return new Long(interfaceC5084.mo9202().readLong());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9238(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) throws Throwable {
        ByteReadChannelOperationsKt$readBuffer$1 byteReadChannelOperationsKt$readBuffer$1;
        C6309 c6309;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readBuffer$1) {
            byteReadChannelOperationsKt$readBuffer$1 = (ByteReadChannelOperationsKt$readBuffer$1) continuationImpl;
            int i = byteReadChannelOperationsKt$readBuffer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readBuffer$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readBuffer$1 = new ByteReadChannelOperationsKt$readBuffer$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readBuffer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$readBuffer$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            c6309 = new C6309();
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C6309 c63092 = (C6309) byteReadChannelOperationsKt$readBuffer$1.L$1;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$readBuffer$1.L$0;
            AbstractC6017.m10769(obj);
            c6309 = c63092;
            interfaceC5084 = interfaceC50842;
        }
        while (!interfaceC5084.mo9200()) {
            c6309.m11172(interfaceC5084.mo9202());
            byteReadChannelOperationsKt$readBuffer$1.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$readBuffer$1.L$1 = c6309;
            byteReadChannelOperationsKt$readBuffer$1.label = 1;
            if (interfaceC5084.mo9201(1, byteReadChannelOperationsKt$readBuffer$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Throwable thMo9203 = interfaceC5084.mo9203();
        if (thMo9203 == null) {
            return c6309;
        }
        throw thMo9203;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9239(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$readByte$1 byteReadChannelOperationsKt$readByte$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$readByte$1) {
            byteReadChannelOperationsKt$readByte$1 = (ByteReadChannelOperationsKt$readByte$1) continuationImpl;
            int i = byteReadChannelOperationsKt$readByte$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readByte$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$readByte$1 = new ByteReadChannelOperationsKt$readByte$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$readByte$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$readByte$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (interfaceC5084.mo9202().mo11163()) {
                byteReadChannelOperationsKt$readByte$1.L$0 = interfaceC5084;
                byteReadChannelOperationsKt$readByte$1.label = 1;
                if (interfaceC5084.mo9201(1, byteReadChannelOperationsKt$readByte$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5084 = (InterfaceC5084) byteReadChannelOperationsKt$readByte$1.L$0;
            AbstractC6017.m10769(obj);
        }
        if (interfaceC5084.mo9202().mo11163()) {
            throw new EOFException("Not enough data available");
        }
        return Byte.valueOf(interfaceC5084.mo9202().readByte());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004a -> B:26:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:25:0x005e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9240(InterfaceC5084 interfaceC5084, long j, ContinuationImpl continuationImpl) throws EOFException {
        ByteReadChannelOperationsKt$discard$1 byteReadChannelOperationsKt$discard$1;
        long j2;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$discard$1) {
            byteReadChannelOperationsKt$discard$1 = (ByteReadChannelOperationsKt$discard$1) continuationImpl;
            int i = byteReadChannelOperationsKt$discard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$discard$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$discard$1 = new ByteReadChannelOperationsKt$discard$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperationsKt$discard$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$discard$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            j2 = j;
            if (j > 0) {
            }
            return new Long(j2 - j);
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = byteReadChannelOperationsKt$discard$1.J$1;
        j2 = byteReadChannelOperationsKt$discard$1.J$0;
        InterfaceC5084 interfaceC50842 = (InterfaceC5084) byteReadChannelOperationsKt$discard$1.L$0;
        AbstractC6017.m10769(obj);
        long j4 = j3;
        interfaceC5084 = interfaceC50842;
        j = j4;
        long jMin = Math.min(j, AbstractC7684.m12638(interfaceC5084.mo9202()));
        AbstractC7684.m12639(interfaceC5084.mo9202(), jMin);
        j -= jMin;
        if (j > 0 || interfaceC5084.mo9200()) {
            return new Long(j2 - j);
        }
        if (m9242(interfaceC5084) == 0) {
            byteReadChannelOperationsKt$discard$1.L$0 = interfaceC5084;
            byteReadChannelOperationsKt$discard$1.J$0 = j2;
            byteReadChannelOperationsKt$discard$1.J$1 = j;
            byteReadChannelOperationsKt$discard$1.label = 1;
            if (interfaceC5084.mo9201(1, byteReadChannelOperationsKt$discard$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC50842 = interfaceC5084;
            j3 = j;
            long j42 = j3;
            interfaceC5084 = interfaceC50842;
            j = j42;
        }
        long jMin2 = Math.min(j, AbstractC7684.m12638(interfaceC5084.mo9202()));
        AbstractC7684.m12639(interfaceC5084.mo9202(), jMin2);
        j -= jMin2;
        if (j > 0) {
        }
        return new Long(j2 - j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[PHI: r2 r3 r7 r9
  0x0069: PHI (r2v2 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) = (r2v1 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世), (r2v3 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r3v3 kotlin.jvm.internal.Ref$LongRef) = (r3v1 kotlin.jvm.internal.Ref$LongRef), (r3v4 kotlin.jvm.internal.Ref$LongRef) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r7v8 io.ktor.utils.io.飘花落叶言子楪苏兰哲世) = (r7v0 io.ktor.utils.io.飘花落叶言子楪苏兰哲世), (r7v10 io.ktor.utils.io.飘花落叶言子楪苏兰哲世) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r9v2 long) = (r9v0 long), (r9v3 long) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007b -> B:45:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0099 -> B:35:0x009d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9241(InterfaceC5084 interfaceC5084, final FileChannel fileChannel, final long j, ContinuationImpl continuationImpl) throws Throwable {
        ByteReadChannelOperations_jvmKt$copyTo$1 byteReadChannelOperations_jvmKt$copyTo$1;
        InterfaceC7387 interfaceC7387;
        Ref$LongRef ref$LongRef;
        Throwable thMo9203;
        if (continuationImpl instanceof ByteReadChannelOperations_jvmKt$copyTo$1) {
            byteReadChannelOperations_jvmKt$copyTo$1 = (ByteReadChannelOperations_jvmKt$copyTo$1) continuationImpl;
            int i = byteReadChannelOperations_jvmKt$copyTo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$copyTo$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperations_jvmKt$copyTo$1 = new ByteReadChannelOperations_jvmKt$copyTo$1(continuationImpl);
            }
        }
        Object obj = byteReadChannelOperations_jvmKt$copyTo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperations_jvmKt$copyTo$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = byteReadChannelOperations_jvmKt$copyTo$1.I$0;
            long j2 = byteReadChannelOperations_jvmKt$copyTo$1.J$0;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) byteReadChannelOperations_jvmKt$copyTo$1.L$3;
            interfaceC7387 = (InterfaceC7387) byteReadChannelOperations_jvmKt$copyTo$1.L$2;
            ref$LongRef = (Ref$LongRef) byteReadChannelOperations_jvmKt$copyTo$1.L$1;
            InterfaceC5084 interfaceC50843 = (InterfaceC5084) byteReadChannelOperations_jvmKt$copyTo$1.L$0;
            AbstractC6017.m10769(obj);
            if (!interfaceC50842.mo9200() && i3 > 0) {
                StringBuilder sbM710 = AbstractC0900.m710(i3, "Not enough bytes available: required ", " but ");
                sbM710.append(m9242(interfaceC50842));
                sbM710.append(" available");
                throw new EOFException(sbM710.toString());
            }
            if (m9242(interfaceC50842) > 0) {
                AbstractC7684.m12637(interfaceC50842.mo9202(), interfaceC7387);
            }
            j = j2;
            interfaceC5084 = interfaceC50843;
            if (!interfaceC5084.mo9200()) {
                if (ref$LongRef.element < j) {
                    if (m9242(interfaceC5084) <= 0 || m9242(interfaceC5084) < 0) {
                        byteReadChannelOperations_jvmKt$copyTo$1.L$0 = interfaceC5084;
                        byteReadChannelOperations_jvmKt$copyTo$1.L$1 = ref$LongRef;
                        byteReadChannelOperations_jvmKt$copyTo$1.L$2 = interfaceC7387;
                        byteReadChannelOperations_jvmKt$copyTo$1.L$3 = interfaceC5084;
                        byteReadChannelOperations_jvmKt$copyTo$1.J$0 = j;
                        byteReadChannelOperations_jvmKt$copyTo$1.I$0 = 0;
                        byteReadChannelOperations_jvmKt$copyTo$1.label = 1;
                        if (interfaceC5084.mo9201(1, byteReadChannelOperations_jvmKt$copyTo$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        interfaceC50843 = interfaceC5084;
                        i3 = 0;
                        j2 = j;
                        interfaceC50842 = interfaceC50843;
                        if (!interfaceC50842.mo9200()) {
                        }
                        if (m9242(interfaceC50842) > 0) {
                        }
                        j = j2;
                        interfaceC5084 = interfaceC50843;
                        if (!interfaceC5084.mo9200()) {
                        }
                    } else {
                        AbstractC7684.m12637(interfaceC5084.mo9202(), interfaceC7387);
                        if (!interfaceC5084.mo9200()) {
                        }
                    }
                }
            }
            thMo9203 = interfaceC5084.mo9203();
            if (thMo9203 != null) {
                return new Long(ref$LongRef.element);
            }
            throw thMo9203;
        }
        AbstractC6017.m10769(obj);
        if (j < 0) {
            C6755.m11873(AbstractC3275.m5143(j, "Limit shouldn't be negative: "));
            return null;
        }
        if (interfaceC5084.mo9200()) {
            Throwable thMo92032 = interfaceC5084.mo9203();
            if (thMo92032 == null) {
                return new Long(0L);
            }
            throw thMo92032;
        }
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        interfaceC7387 = new InterfaceC7387() { // from class: io.ktor.utils.io.飘花落叶言子楪哲世兰苏
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj2) throws IOException {
                ByteBuffer byteBuffer = (ByteBuffer) obj2;
                byteBuffer.getClass();
                Ref$LongRef ref$LongRef3 = ref$LongRef2;
                long j3 = j - ref$LongRef3.element;
                long jRemaining = byteBuffer.remaining();
                WritableByteChannel writableByteChannel = fileChannel;
                if (j3 < jRemaining) {
                    int iLimit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + ((int) j3));
                    while (byteBuffer.hasRemaining()) {
                        writableByteChannel.write(byteBuffer);
                    }
                    byteBuffer.limit(iLimit);
                    ref$LongRef3.element += j3;
                } else {
                    long jWrite = 0;
                    while (byteBuffer.hasRemaining()) {
                        jWrite += (long) writableByteChannel.write(byteBuffer);
                    }
                    ref$LongRef3.element += jWrite;
                }
                return C6008.f15084;
            }
        };
        ref$LongRef = ref$LongRef2;
        if (ref$LongRef.element < j) {
        }
        thMo9203 = interfaceC5084.mo9203();
        if (thMo9203 != null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int m9242(InterfaceC5084 interfaceC5084) {
        interfaceC5084.getClass();
        return (int) interfaceC5084.mo9202().mo11162().f15487;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Comparable m9243(InterfaceC5084 interfaceC5084, int i, ContinuationImpl continuationImpl) {
        ByteReadChannelOperationsKt$peek$1 byteReadChannelOperationsKt$peek$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$peek$1) {
            byteReadChannelOperationsKt$peek$1 = (ByteReadChannelOperationsKt$peek$1) continuationImpl;
            int i2 = byteReadChannelOperationsKt$peek$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$peek$1.label = i2 - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$peek$1 = new ByteReadChannelOperationsKt$peek$1(continuationImpl);
            }
        }
        Object objMo9201 = byteReadChannelOperationsKt$peek$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = byteReadChannelOperationsKt$peek$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(objMo9201);
            if (!interfaceC5084.mo9200()) {
                byteReadChannelOperationsKt$peek$1.L$0 = interfaceC5084;
                byteReadChannelOperationsKt$peek$1.I$0 = i;
                byteReadChannelOperationsKt$peek$1.label = 1;
                objMo9201 = interfaceC5084.mo9201(i, byteReadChannelOperationsKt$peek$1);
                if (objMo9201 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return null;
        }
        if (i3 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = byteReadChannelOperationsKt$peek$1.I$0;
        interfaceC5084 = (InterfaceC5084) byteReadChannelOperationsKt$peek$1.L$0;
        AbstractC6017.m10769(objMo9201);
        if (((Boolean) objMo9201).booleanValue()) {
            return new C8034(AbstractC6310.m11191(interfaceC5084.mo9202().peek(), i));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9244(InterfaceC5084 interfaceC5084, long j, ContinuationImpl continuationImpl) throws EOFException {
        ByteReadChannelOperationsKt$discardExact$1 byteReadChannelOperationsKt$discardExact$1;
        if (continuationImpl instanceof ByteReadChannelOperationsKt$discardExact$1) {
            byteReadChannelOperationsKt$discardExact$1 = (ByteReadChannelOperationsKt$discardExact$1) continuationImpl;
            int i = byteReadChannelOperationsKt$discardExact$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$discardExact$1.label = i - Integer.MIN_VALUE;
            } else {
                byteReadChannelOperationsKt$discardExact$1 = new ByteReadChannelOperationsKt$discardExact$1(continuationImpl);
            }
        }
        Object objM9240 = byteReadChannelOperationsKt$discardExact$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteReadChannelOperationsKt$discardExact$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9240);
            byteReadChannelOperationsKt$discardExact$1.J$0 = j;
            byteReadChannelOperationsKt$discardExact$1.label = 1;
            objM9240 = m9240(interfaceC5084, j, byteReadChannelOperationsKt$discardExact$1);
            if (objM9240 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = byteReadChannelOperationsKt$discardExact$1.J$0;
            AbstractC6017.m10769(objM9240);
        }
        if (((Number) objM9240).longValue() >= j) {
            return C6008.f15084;
        }
        throw new EOFException("Unable to discard " + j + " bytes");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9245(InterfaceC5079 interfaceC5079, ContinuationImpl continuationImpl) {
        interfaceC5079.getClass();
        C5081 c5081 = (C5081) interfaceC5079;
        Throwable thMo9203 = c5081.mo9203();
        if (thMo9203 != null) {
            throw thMo9203;
        }
        C5081 c50812 = interfaceC5079 instanceof C5081 ? (C5081) interfaceC5079 : null;
        if (c50812 == null || !c50812.f13110) {
            C6309 c6309M9261 = c5081.m9261();
            c6309M9261.getClass();
            if (((int) c6309M9261.f15487) >= 1048576) {
                Object objM9259 = c5081.m9259(continuationImpl);
                if (objM9259 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM9259;
                }
            }
        }
        return C6008.f15084;
    }
}
