package io.ktor.websocket;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import p025.AbstractC7012;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.RawWebSocketCommonKt", m556f = "RawWebSocketCommon.kt", m557l = {Opcodes.OR_INT_LIT16, Opcodes.XOR_INT_LIT16, 234, 235, 243, Opcodes.INVOKE_POLYMORPHIC_RANGE}, m558m = "readFrame")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class RawWebSocketCommonKt$readFrame$1 extends ContinuationImpl {
    byte B$0;
    byte B$1;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public RawWebSocketCommonKt$readFrame$1(InterfaceC5189<? super RawWebSocketCommonKt$readFrame$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01de, code lost:
    
        if (r1 == r2) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws FrameTooBigException, ProtocolViolationException {
        long j;
        InterfaceC5084 interfaceC5084;
        int i;
        Object objM9239;
        byte b;
        long j2;
        int i2;
        InterfaceC5084 interfaceC50842;
        byte bByteValue;
        int i3;
        FrameType frameType;
        int i4;
        int i5;
        byte b2;
        FrameType frameType2;
        byte b3;
        FrameType frameType3;
        InterfaceC5084 interfaceC50843;
        FrameType frameType4;
        byte b4;
        int i6;
        long j3;
        long j4;
        int i7;
        int iIntValue;
        int i8;
        byte b5;
        FrameType frameType5;
        int i9;
        RawWebSocketCommonKt$readFrame$1 rawWebSocketCommonKt$readFrame$1 = this;
        rawWebSocketCommonKt$readFrame$1.result = obj;
        int i10 = rawWebSocketCommonKt$readFrame$1.label | Integer.MIN_VALUE;
        rawWebSocketCommonKt$readFrame$1.label = i10;
        if ((i10 & Integer.MIN_VALUE) != 0) {
            rawWebSocketCommonKt$readFrame$1.label = i10 - Integer.MIN_VALUE;
        } else {
            rawWebSocketCommonKt$readFrame$1 = new RawWebSocketCommonKt$readFrame$1(rawWebSocketCommonKt$readFrame$1);
        }
        Object objM92392 = rawWebSocketCommonKt$readFrame$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (rawWebSocketCommonKt$readFrame$1.label) {
            case 0:
                AbstractC6017.m10769(objM92392);
                rawWebSocketCommonKt$readFrame$1.L$0 = null;
                j = 0;
                rawWebSocketCommonKt$readFrame$1.J$0 = 0L;
                rawWebSocketCommonKt$readFrame$1.I$0 = 0;
                rawWebSocketCommonKt$readFrame$1.label = 1;
                objM92392 = AbstractC5076.m9239(null, rawWebSocketCommonKt$readFrame$1);
                if (objM92392 != coroutineSingletons) {
                    interfaceC5084 = null;
                    i = 0;
                    byte bByteValue2 = ((Number) objM92392).byteValue();
                    rawWebSocketCommonKt$readFrame$1.L$0 = interfaceC5084;
                    rawWebSocketCommonKt$readFrame$1.J$0 = j;
                    rawWebSocketCommonKt$readFrame$1.I$0 = i;
                    rawWebSocketCommonKt$readFrame$1.B$0 = bByteValue2;
                    rawWebSocketCommonKt$readFrame$1.label = 2;
                    objM9239 = AbstractC5076.m9239(interfaceC5084, rawWebSocketCommonKt$readFrame$1);
                    if (objM9239 != coroutineSingletons) {
                        b = bByteValue2;
                        objM92392 = objM9239;
                        j2 = j;
                        i2 = i;
                        interfaceC50842 = interfaceC5084;
                        bByteValue = ((Number) objM92392).byteValue();
                        i3 = b & 15;
                        if (i3 != 0 && i2 == 0) {
                            throw new ProtocolViolationException("Can't continue finished frames");
                        }
                        int i11 = i3 != 0 ? i2 : i3;
                        FrameType.Companion.getClass();
                        frameType = (i11 >= 0 || i11 > FrameType.maxOpcode) ? null : FrameType.byOpcodeArray[i11];
                        if (frameType != null) {
                            C6755.m11870(AbstractC7012.m12147(i11, "Unsupported opcode: "));
                            return null;
                        }
                        if (i3 != 0 && i2 != 0 && !frameType.getControlFrame()) {
                            throw new ProtocolViolationException("Can't start new data frame before finishing previous one");
                        }
                        i4 = (b & 128) != 0 ? 1 : 0;
                        if (frameType.getControlFrame() && i4 == 0) {
                            throw new ProtocolViolationException("control frames can't be fragmented");
                        }
                        int i12 = bByteValue & 127;
                        if (i12 == 126) {
                            i5 = 0;
                            rawWebSocketCommonKt$readFrame$1.L$0 = interfaceC50842;
                            rawWebSocketCommonKt$readFrame$1.L$1 = frameType;
                            rawWebSocketCommonKt$readFrame$1.J$0 = j2;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b;
                            rawWebSocketCommonKt$readFrame$1.B$1 = bByteValue;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i4;
                            rawWebSocketCommonKt$readFrame$1.label = 3;
                            Object objM9233 = AbstractC5076.m9233(interfaceC50842, rawWebSocketCommonKt$readFrame$1);
                            if (objM9233 != coroutineSingletons) {
                                b2 = bByteValue;
                                objM92392 = objM9233;
                                frameType2 = frameType;
                                i6 = 2;
                                long jShortValue = ((long) ((Number) objM92392).shortValue()) & 65535;
                                bByteValue = b2;
                                InterfaceC5084 interfaceC50844 = interfaceC50842;
                                b4 = b;
                                j4 = j2;
                                j3 = jShortValue;
                                frameType4 = frameType2;
                                interfaceC50843 = interfaceC50844;
                                if (!frameType4.getControlFrame()) {
                                }
                                if ((bByteValue & 128) != 0) {
                                }
                                if (i7 == 1) {
                                }
                            }
                        } else if (i12 != 127) {
                            i5 = 0;
                            interfaceC50843 = interfaceC50842;
                            frameType4 = frameType;
                            b4 = b;
                            i6 = 2;
                            long j5 = j2;
                            j3 = i12;
                            j4 = j5;
                            if (!frameType4.getControlFrame() && j3 > 125) {
                                throw new ProtocolViolationException("control frames can't be larger than 125 bytes");
                            }
                            i7 = (bByteValue & 128) != 0 ? 1 : i5;
                            if (i7 == 1) {
                                rawWebSocketCommonKt$readFrame$1.L$0 = interfaceC50843;
                                rawWebSocketCommonKt$readFrame$1.L$1 = frameType4;
                                rawWebSocketCommonKt$readFrame$1.J$0 = j4;
                                rawWebSocketCommonKt$readFrame$1.B$0 = b4;
                                rawWebSocketCommonKt$readFrame$1.I$0 = i4;
                                rawWebSocketCommonKt$readFrame$1.J$1 = j3;
                                rawWebSocketCommonKt$readFrame$1.label = 5;
                                objM92392 = AbstractC5076.m9236(interfaceC50843, rawWebSocketCommonKt$readFrame$1);
                            } else {
                                if (i7 != 0) {
                                    C5043.m9170();
                                    return null;
                                }
                                iIntValue = -1;
                                if (j3 <= 2147483647L || j3 > j4) {
                                    throw new FrameTooBigException(j3);
                                }
                                rawWebSocketCommonKt$readFrame$1.L$0 = frameType4;
                                rawWebSocketCommonKt$readFrame$1.L$1 = null;
                                rawWebSocketCommonKt$readFrame$1.B$0 = b4;
                                rawWebSocketCommonKt$readFrame$1.I$0 = i4;
                                rawWebSocketCommonKt$readFrame$1.I$1 = iIntValue;
                                rawWebSocketCommonKt$readFrame$1.label = 6;
                                Object objM9229 = AbstractC5076.m9229(interfaceC50843, (int) j3, rawWebSocketCommonKt$readFrame$1);
                                if (objM9229 != coroutineSingletons) {
                                    i8 = iIntValue;
                                    b5 = b4;
                                    objM92392 = objM9229;
                                    frameType5 = frameType4;
                                    InterfaceC6313 interfaceC6313 = (InterfaceC6313) objM92392;
                                    if (i8 != -1) {
                                        byte[] bArr = new byte[4];
                                        bArr[i5] = (byte) (i8 >> 24);
                                        bArr[1] = (byte) (i8 >> 16);
                                        bArr[i6] = (byte) (i8 >> 8);
                                        bArr[3] = (byte) i8;
                                        C6309 c6309 = new C6309();
                                        int iM12638 = (int) AbstractC7684.m12638(interfaceC6313);
                                        for (int i13 = i5; i13 < iM12638; i13++) {
                                            c6309.m11173((byte) (interfaceC6313.readByte() ^ bArr[i13 % 4]));
                                        }
                                        interfaceC6313 = c6309;
                                    }
                                    boolean z = i4 == 0 ? 1 : i5;
                                    byte[] bArrM11190 = AbstractC6310.m11190(interfaceC6313);
                                    boolean z2 = (b5 & 64) == 0 ? 1 : i5;
                                    boolean z3 = (b5 & 32) == 0 ? 1 : i5;
                                    boolean z4 = (b5 & 16) == 0 ? 1 : i5;
                                    frameType5.getClass();
                                    i9 = AbstractC5109.f13177[frameType5.ordinal()];
                                    if (i9 != 1) {
                                        return new C5091(z, FrameType.BINARY, bArrM11190, z2, z3, z4);
                                    }
                                    if (i9 == i6) {
                                        return new C5111(z, FrameType.TEXT, bArrM11190, z2, z3, z4);
                                    }
                                    if (i9 == 3) {
                                        return new C5110(bArrM11190);
                                    }
                                    if (i9 == 4) {
                                        return new C5113(bArrM11190);
                                    }
                                    if (i9 == 5) {
                                        return new C5114(bArrM11190, C5108.f13176);
                                    }
                                    C5043.m9170();
                                    return null;
                                }
                            }
                            break;
                        } else {
                            i5 = 0;
                            rawWebSocketCommonKt$readFrame$1.L$0 = interfaceC50842;
                            rawWebSocketCommonKt$readFrame$1.L$1 = frameType;
                            rawWebSocketCommonKt$readFrame$1.J$0 = j2;
                            rawWebSocketCommonKt$readFrame$1.B$0 = b;
                            rawWebSocketCommonKt$readFrame$1.B$1 = bByteValue;
                            rawWebSocketCommonKt$readFrame$1.I$0 = i4;
                            rawWebSocketCommonKt$readFrame$1.label = 4;
                            Object objM9237 = AbstractC5076.m9237(interfaceC50842, rawWebSocketCommonKt$readFrame$1);
                            if (objM9237 != coroutineSingletons) {
                                b3 = bByteValue;
                                objM92392 = objM9237;
                                frameType3 = frameType;
                                long jLongValue = ((Number) objM92392).longValue();
                                bByteValue = b3;
                                frameType4 = frameType3;
                                i6 = 2;
                                interfaceC50843 = interfaceC50842;
                                b4 = b;
                                j4 = j2;
                                j3 = jLongValue;
                                if (!frameType4.getControlFrame()) {
                                }
                                if ((bByteValue & 128) != 0) {
                                }
                                if (i7 == 1) {
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                i = rawWebSocketCommonKt$readFrame$1.I$0;
                j = rawWebSocketCommonKt$readFrame$1.J$0;
                interfaceC5084 = (InterfaceC5084) rawWebSocketCommonKt$readFrame$1.L$0;
                AbstractC6017.m10769(objM92392);
                byte bByteValue22 = ((Number) objM92392).byteValue();
                rawWebSocketCommonKt$readFrame$1.L$0 = interfaceC5084;
                rawWebSocketCommonKt$readFrame$1.J$0 = j;
                rawWebSocketCommonKt$readFrame$1.I$0 = i;
                rawWebSocketCommonKt$readFrame$1.B$0 = bByteValue22;
                rawWebSocketCommonKt$readFrame$1.label = 2;
                objM9239 = AbstractC5076.m9239(interfaceC5084, rawWebSocketCommonKt$readFrame$1);
                if (objM9239 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                byte b6 = rawWebSocketCommonKt$readFrame$1.B$0;
                i2 = rawWebSocketCommonKt$readFrame$1.I$0;
                long j6 = rawWebSocketCommonKt$readFrame$1.J$0;
                InterfaceC5084 interfaceC50845 = (InterfaceC5084) rawWebSocketCommonKt$readFrame$1.L$0;
                AbstractC6017.m10769(objM92392);
                interfaceC50842 = interfaceC50845;
                j2 = j6;
                b = b6;
                bByteValue = ((Number) objM92392).byteValue();
                i3 = b & 15;
                if (i3 != 0) {
                }
                if (i3 != 0) {
                }
                FrameType.Companion.getClass();
                if (i11 >= 0) {
                }
                if (frameType != null) {
                }
                break;
            case 3:
                i4 = rawWebSocketCommonKt$readFrame$1.I$0;
                b2 = rawWebSocketCommonKt$readFrame$1.B$1;
                b = rawWebSocketCommonKt$readFrame$1.B$0;
                j2 = rawWebSocketCommonKt$readFrame$1.J$0;
                frameType2 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                interfaceC50842 = (InterfaceC5084) rawWebSocketCommonKt$readFrame$1.L$0;
                AbstractC6017.m10769(objM92392);
                i5 = 0;
                i6 = 2;
                long jShortValue2 = ((long) ((Number) objM92392).shortValue()) & 65535;
                bByteValue = b2;
                InterfaceC5084 interfaceC508442 = interfaceC50842;
                b4 = b;
                j4 = j2;
                j3 = jShortValue2;
                frameType4 = frameType2;
                interfaceC50843 = interfaceC508442;
                if (!frameType4.getControlFrame()) {
                }
                if ((bByteValue & 128) != 0) {
                }
                if (i7 == 1) {
                }
                break;
            case 4:
                i4 = rawWebSocketCommonKt$readFrame$1.I$0;
                b3 = rawWebSocketCommonKt$readFrame$1.B$1;
                b = rawWebSocketCommonKt$readFrame$1.B$0;
                j2 = rawWebSocketCommonKt$readFrame$1.J$0;
                frameType3 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                interfaceC50842 = (InterfaceC5084) rawWebSocketCommonKt$readFrame$1.L$0;
                AbstractC6017.m10769(objM92392);
                i5 = 0;
                long jLongValue2 = ((Number) objM92392).longValue();
                bByteValue = b3;
                frameType4 = frameType3;
                i6 = 2;
                interfaceC50843 = interfaceC50842;
                b4 = b;
                j4 = j2;
                j3 = jLongValue2;
                if (!frameType4.getControlFrame()) {
                }
                if ((bByteValue & 128) != 0) {
                }
                if (i7 == 1) {
                }
                break;
            case 5:
                j3 = rawWebSocketCommonKt$readFrame$1.J$1;
                i4 = rawWebSocketCommonKt$readFrame$1.I$0;
                b4 = rawWebSocketCommonKt$readFrame$1.B$0;
                j4 = rawWebSocketCommonKt$readFrame$1.J$0;
                FrameType frameType6 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$1;
                interfaceC50843 = (InterfaceC5084) rawWebSocketCommonKt$readFrame$1.L$0;
                AbstractC6017.m10769(objM92392);
                i5 = 0;
                frameType4 = frameType6;
                i6 = 2;
                iIntValue = ((Number) objM92392).intValue();
                if (j3 <= 2147483647L) {
                    break;
                }
                throw new FrameTooBigException(j3);
            case 6:
                i8 = rawWebSocketCommonKt$readFrame$1.I$1;
                i4 = rawWebSocketCommonKt$readFrame$1.I$0;
                b5 = rawWebSocketCommonKt$readFrame$1.B$0;
                frameType5 = (FrameType) rawWebSocketCommonKt$readFrame$1.L$0;
                AbstractC6017.m10769(objM92392);
                i5 = 0;
                i6 = 2;
                InterfaceC6313 interfaceC63132 = (InterfaceC6313) objM92392;
                if (i8 != -1) {
                }
                if (i4 == 0) {
                }
                byte[] bArrM111902 = AbstractC6310.m11190(interfaceC63132);
                if ((b5 & 64) == 0) {
                }
                if ((b5 & 32) == 0) {
                }
                if ((b5 & 16) == 0) {
                }
                frameType5.getClass();
                i9 = AbstractC5109.f13177[frameType5.ordinal()];
                if (i9 != 1) {
                }
                break;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
