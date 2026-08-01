package io.ktor.http.cio;

import io.ktor.http.cio.internals.AbstractC4782;
import io.ktor.http.cio.internals.C4785;
import io.ktor.http.cio.internals.C4786;
import io.ktor.http.cio.internals.C4788;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5072;
import io.ktor.utils.p007io.C5074;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.AbstractC5964;
import p074.AbstractC7684;
import p110.C8034;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4801 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8034 f12551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8034 f12552;

    static {
        byte[] bArrM12643 = AbstractC7684.m12643("\r\n", AbstractC5964.f15033);
        f12552 = new C8034(bArrM12643, 0, bArrM12643.length);
        f12551 = new C8034(new byte[]{45, 45});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8920(InterfaceC5084 interfaceC5084, ByteBuffer byteBuffer, ContinuationImpl continuationImpl) {
        MultipartKt$trySkipDelimiterSuspend$1 multipartKt$trySkipDelimiterSuspend$1;
        Ref$BooleanRef ref$BooleanRef;
        if (continuationImpl instanceof MultipartKt$trySkipDelimiterSuspend$1) {
            multipartKt$trySkipDelimiterSuspend$1 = (MultipartKt$trySkipDelimiterSuspend$1) continuationImpl;
            int i = multipartKt$trySkipDelimiterSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multipartKt$trySkipDelimiterSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                multipartKt$trySkipDelimiterSuspend$1 = new MultipartKt$trySkipDelimiterSuspend$1(continuationImpl);
            }
        }
        Object obj = multipartKt$trySkipDelimiterSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multipartKt$trySkipDelimiterSuspend$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            ref$BooleanRef2.element = true;
            MultipartKt$trySkipDelimiterSuspend$2 multipartKt$trySkipDelimiterSuspend$2 = new MultipartKt$trySkipDelimiterSuspend$2(byteBuffer, ref$BooleanRef2, null);
            multipartKt$trySkipDelimiterSuspend$1.L$0 = ref$BooleanRef2;
            multipartKt$trySkipDelimiterSuspend$1.label = 1;
            Object objInvoke = multipartKt$trySkipDelimiterSuspend$2.invoke((Object) new C5072(interfaceC5084), (Object) multipartKt$trySkipDelimiterSuspend$1);
            if (objInvoke != coroutineSingletons) {
                objInvoke = C6008.f15084;
            }
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$BooleanRef = (Ref$BooleanRef) multipartKt$trySkipDelimiterSuspend$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return Boolean.valueOf(ref$BooleanRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8921(InterfaceC5084 interfaceC5084, C8034 c8034, ContinuationImpl continuationImpl) {
        MultipartKt$skipIfFoundReadCount$1 multipartKt$skipIfFoundReadCount$1;
        if (continuationImpl instanceof MultipartKt$skipIfFoundReadCount$1) {
            multipartKt$skipIfFoundReadCount$1 = (MultipartKt$skipIfFoundReadCount$1) continuationImpl;
            int i = multipartKt$skipIfFoundReadCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multipartKt$skipIfFoundReadCount$1.label = i - Integer.MIN_VALUE;
            } else {
                multipartKt$skipIfFoundReadCount$1 = new MultipartKt$skipIfFoundReadCount$1(continuationImpl);
            }
        }
        Object objM9218 = multipartKt$skipIfFoundReadCount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multipartKt$skipIfFoundReadCount$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9218);
            multipartKt$skipIfFoundReadCount$1.L$0 = c8034;
            multipartKt$skipIfFoundReadCount$1.label = 1;
            objM9218 = AbstractC5076.m9218(interfaceC5084, c8034, multipartKt$skipIfFoundReadCount$1);
            if (objM9218 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c8034 = (C8034) multipartKt$skipIfFoundReadCount$1.L$0;
            AbstractC6017.m10769(objM9218);
        }
        return new Long(((Boolean) objM9218).booleanValue() ? c8034.f19567.length : 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m8922(C5072 c5072, ByteBuffer byteBuffer) throws Exception {
        int iPosition;
        int iMin;
        ByteBuffer byteBufferM9212 = c5072.m9212(0, 1);
        if (byteBufferM9212 != null) {
            int iPosition2 = byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            byte b = byteBuffer.get(iPosition2);
            int iLimit = byteBufferM9212.limit();
            loop0: for (int iPosition3 = byteBufferM9212.position(); iPosition3 < iLimit; iPosition3++) {
                if (byteBufferM9212.get(iPosition3) == b) {
                    for (int i = 1; i < iRemaining; i++) {
                        int i2 = iPosition3 + i;
                        if (i2 == iLimit) {
                            break loop0;
                        }
                        if (byteBufferM9212.get(i2) == byteBuffer.get(iPosition2 + i)) {
                        }
                    }
                    iPosition = iPosition3 - byteBufferM9212.position();
                    break loop0;
                }
            }
            iPosition = -1;
            if (iPosition != 0) {
                iMin = -1;
                break;
            }
            iMin = Math.min(byteBufferM9212.remaining() - iPosition, byteBuffer.remaining());
            int iRemaining2 = byteBuffer.remaining() - iMin;
            if (iRemaining2 <= 0) {
                iMin = byteBuffer.remaining();
            } else {
                ByteBuffer byteBufferM92122 = c5072.m9212(iPosition + iMin, iRemaining2);
                if (byteBufferM92122 != null) {
                    int iMin2 = Math.min(byteBufferM92122.remaining(), byteBuffer.remaining() - iMin);
                    if (iMin2 > 0) {
                        int iPosition4 = byteBufferM92122.position();
                        int iPosition5 = byteBuffer.position() + iMin;
                        for (int i3 = 0; i3 < iMin2; i3++) {
                            if (byteBufferM92122.get(iPosition4 + i3) == byteBuffer.get(iPosition5 + i3)) {
                            }
                        }
                        iMin = byteBuffer.remaining();
                    }
                    iMin = -1;
                    break;
                }
            }
        } else {
            iMin = 0;
        }
        if (iMin == -1) {
            C6755.m11866("Failed to skip delimiter: actual bytes differ from delimiter bytes");
            return 0;
        }
        if (iMin < byteBuffer.remaining()) {
            return iMin;
        }
        AbstractC7684.m12639(c5072.f13089.mo9202(), byteBuffer.remaining());
        return byteBuffer.remaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8923(C5074 c5074, ContinuationImpl continuationImpl) throws Throwable {
        MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$1;
        Throwable th;
        C4785 c4785;
        if (continuationImpl instanceof MultipartKt$parsePartHeadersImpl$1) {
            multipartKt$parsePartHeadersImpl$1 = (MultipartKt$parsePartHeadersImpl$1) continuationImpl;
            int i = multipartKt$parsePartHeadersImpl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartHeadersImpl$1.label = i - Integer.MIN_VALUE;
            } else {
                multipartKt$parsePartHeadersImpl$1 = new MultipartKt$parsePartHeadersImpl$1(continuationImpl);
            }
        }
        Object obj = multipartKt$parsePartHeadersImpl$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multipartKt$parsePartHeadersImpl$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C4785 c47852 = new C4785();
            try {
                multipartKt$parsePartHeadersImpl$1.L$0 = c47852;
                multipartKt$parsePartHeadersImpl$1.label = 1;
                Object objM8929 = AbstractC4805.m8929(c5074, c47852, new C4788(), multipartKt$parsePartHeadersImpl$1);
                if (objM8929 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objM8929;
                c4785 = c47852;
            } catch (Throwable th2) {
                th = th2;
                c4785 = c47852;
                c4785.m8896();
                throw th;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4785 = (C4785) multipartKt$parsePartHeadersImpl$1.L$0;
            try {
                AbstractC6017.m10769(obj);
            } catch (Throwable th3) {
                th = th3;
                c4785.m8896();
                throw th;
            }
        }
        C4806 c4806 = (C4806) obj;
        if (c4806 != null) {
            return c4806;
        }
        throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r3).m9259(r6) != r7) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8924(C8034 c8034, C5074 c5074, C5081 c5081, C4806 c4806, long j, ContinuationImpl continuationImpl) throws IOException {
        MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$1;
        long j2;
        C8034 c80342;
        InterfaceC5079 interfaceC5079;
        InterfaceC5084 interfaceC5084;
        InterfaceC5079 interfaceC50792;
        InterfaceC5079 interfaceC50793;
        long jLongValue;
        long j3;
        if (continuationImpl instanceof MultipartKt$parsePartBodyImpl$1) {
            multipartKt$parsePartBodyImpl$1 = (MultipartKt$parsePartBodyImpl$1) continuationImpl;
            int i = multipartKt$parsePartBodyImpl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartBodyImpl$1.label = i - Integer.MIN_VALUE;
            } else {
                multipartKt$parsePartBodyImpl$1 = new MultipartKt$parsePartBodyImpl$1(continuationImpl);
            }
        }
        MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$12 = multipartKt$parsePartBodyImpl$1;
        Object objM9222 = multipartKt$parsePartBodyImpl$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multipartKt$parsePartBodyImpl$12.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9222);
            C4786 c4786M8939 = c4806.m8939("Content-Length");
            Long l = c4786M8939 != null ? new Long(AbstractC4782.m8889(c4786M8939)) : null;
            if (l == null) {
                multipartKt$parsePartBodyImpl$12.L$0 = c5081;
                multipartKt$parsePartBodyImpl$12.label = 1;
                objM9222 = AbstractC5076.m9221(c5074, c8034, c5081, j, true, multipartKt$parsePartBodyImpl$12);
                if (objM9222 != coroutineSingletons) {
                    interfaceC50792 = c5081;
                    interfaceC50793 = interfaceC50792;
                    jLongValue = ((Number) objM9222).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = jLongValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                }
            } else {
                if (0 >= j) {
                    j2 = j;
                } else {
                    long j4 = j % 1;
                    if (j4 < 0) {
                        j4++;
                    }
                    long j5 = 0 % 1;
                    if (j5 < 0) {
                        j5++;
                    }
                    long j6 = (j4 - j5) % 1;
                    if (j6 < 0) {
                        j6++;
                    }
                    j2 = j - j6;
                }
                long jLongValue2 = l.longValue();
                if (0 > jLongValue2 || jLongValue2 > j2) {
                    throw new IOException("Multipart content length exceeds limit " + l.longValue() + " > " + j + "; limit is defined using 'formFieldLimit' argument");
                }
                long jLongValue3 = l.longValue();
                c80342 = c8034;
                multipartKt$parsePartBodyImpl$12.L$0 = c80342;
                multipartKt$parsePartBodyImpl$12.L$1 = c5074;
                multipartKt$parsePartBodyImpl$12.L$2 = c5081;
                multipartKt$parsePartBodyImpl$12.label = 2;
                objM9222 = AbstractC5076.m9222(c5074, c5081, jLongValue3, multipartKt$parsePartBodyImpl$12);
                if (objM9222 != coroutineSingletons) {
                    interfaceC5079 = c5081;
                    interfaceC5084 = c5074;
                    long jLongValue4 = ((Number) objM9222).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = interfaceC5079;
                    multipartKt$parsePartBodyImpl$12.L$1 = null;
                    multipartKt$parsePartBodyImpl$12.L$2 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = jLongValue4;
                    multipartKt$parsePartBodyImpl$12.label = 3;
                    objM9222 = m8921(interfaceC5084, c80342, multipartKt$parsePartBodyImpl$12);
                    if (objM9222 != coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            interfaceC50792 = (InterfaceC5079) multipartKt$parsePartBodyImpl$12.L$0;
            AbstractC6017.m10769(objM9222);
            interfaceC50793 = interfaceC50792;
            jLongValue = ((Number) objM9222).longValue();
            multipartKt$parsePartBodyImpl$12.L$0 = null;
            multipartKt$parsePartBodyImpl$12.J$0 = jLongValue;
            multipartKt$parsePartBodyImpl$12.label = 4;
        } else {
            if (i2 == 2) {
                interfaceC5079 = (InterfaceC5079) multipartKt$parsePartBodyImpl$12.L$2;
                interfaceC5084 = (InterfaceC5084) multipartKt$parsePartBodyImpl$12.L$1;
                C8034 c80343 = (C8034) multipartKt$parsePartBodyImpl$12.L$0;
                AbstractC6017.m10769(objM9222);
                c80342 = c80343;
                long jLongValue42 = ((Number) objM9222).longValue();
                multipartKt$parsePartBodyImpl$12.L$0 = interfaceC5079;
                multipartKt$parsePartBodyImpl$12.L$1 = null;
                multipartKt$parsePartBodyImpl$12.L$2 = null;
                multipartKt$parsePartBodyImpl$12.J$0 = jLongValue42;
                multipartKt$parsePartBodyImpl$12.label = 3;
                objM9222 = m8921(interfaceC5084, c80342, multipartKt$parsePartBodyImpl$12);
                if (objM9222 != coroutineSingletons) {
                    interfaceC50793 = interfaceC5079;
                    j3 = jLongValue42;
                    jLongValue = ((Number) objM9222).longValue() + j3;
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = jLongValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jLongValue = multipartKt$parsePartBodyImpl$12.J$0;
                AbstractC6017.m10769(objM9222);
                return new Long(jLongValue);
            }
            j3 = multipartKt$parsePartBodyImpl$12.J$0;
            interfaceC50793 = (InterfaceC5079) multipartKt$parsePartBodyImpl$12.L$0;
            AbstractC6017.m10769(objM9222);
            jLongValue = ((Number) objM9222).longValue() + j3;
            multipartKt$parsePartBodyImpl$12.L$0 = null;
            multipartKt$parsePartBodyImpl$12.J$0 = jLongValue;
            multipartKt$parsePartBodyImpl$12.label = 4;
        }
    }
}
