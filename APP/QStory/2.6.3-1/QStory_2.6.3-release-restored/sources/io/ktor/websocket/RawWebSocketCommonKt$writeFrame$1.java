package io.ktor.websocket;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5077;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.AbstractC5233;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import kotlinx.p010io.InterfaceC6313;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.RawWebSocketCommonKt", m556f = "RawWebSocketCommon.kt", m557l = {174, 184, 187, 188, 196, Opcodes.REM_FLOAT_2ADDR}, m558m = "writeFrame")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class RawWebSocketCommonKt$writeFrame$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public RawWebSocketCommonKt$writeFrame$1(InterfaceC5189<? super RawWebSocketCommonKt$writeFrame$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x019c, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5078.m9247(r8, r1, r0) == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        AbstractC5112 abstractC5112;
        InterfaceC5079 interfaceC5079;
        boolean z;
        int i2;
        char c;
        C6008 c6008;
        AbstractC5112 abstractC51122;
        InterfaceC5079 interfaceC50792;
        AbstractC5112 abstractC51123;
        int iNextInt;
        C6309 c6309;
        InterfaceC6313 interfaceC6313;
        RawWebSocketCommonKt$writeFrame$1 rawWebSocketCommonKt$writeFrame$1 = this;
        rawWebSocketCommonKt$writeFrame$1.result = obj;
        int i3 = rawWebSocketCommonKt$writeFrame$1.label | Integer.MIN_VALUE;
        rawWebSocketCommonKt$writeFrame$1.label = i3;
        if ((i3 & Integer.MIN_VALUE) != 0) {
            rawWebSocketCommonKt$writeFrame$1.label = i3 - Integer.MIN_VALUE;
        } else {
            rawWebSocketCommonKt$writeFrame$1 = new RawWebSocketCommonKt$writeFrame$1(rawWebSocketCommonKt$writeFrame$1);
        }
        Object obj2 = rawWebSocketCommonKt$writeFrame$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = rawWebSocketCommonKt$writeFrame$1.label;
        C6008 c60082 = C6008.f15084;
        switch (i4) {
            case 0:
                AbstractC6017.m10769(obj2);
                throw null;
            case 1:
                i = rawWebSocketCommonKt$writeFrame$1.I$0;
                boolean z2 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                AbstractC5112 abstractC51124 = (AbstractC5112) rawWebSocketCommonKt$writeFrame$1.L$1;
                InterfaceC5079 interfaceC50793 = (InterfaceC5079) rawWebSocketCommonKt$writeFrame$1.L$0;
                AbstractC6017.m10769(obj2);
                int i5 = i < 126 ? i : i <= 65535 ? 126 : 127;
                int i6 = z2 ? 128 : 0;
                rawWebSocketCommonKt$writeFrame$1.L$0 = interfaceC50793;
                rawWebSocketCommonKt$writeFrame$1.L$1 = abstractC51124;
                rawWebSocketCommonKt$writeFrame$1.Z$0 = z2;
                rawWebSocketCommonKt$writeFrame$1.I$0 = i;
                rawWebSocketCommonKt$writeFrame$1.I$1 = i5;
                rawWebSocketCommonKt$writeFrame$1.label = 2;
                if (AbstractC5078.m9249(interfaceC50793, (byte) (i6 | i5), rawWebSocketCommonKt$writeFrame$1) != coroutineSingletons) {
                    abstractC5112 = abstractC51124;
                    interfaceC5079 = interfaceC50793;
                    z = z2;
                    i2 = i5;
                    if (i2 != 126) {
                        c = 2;
                        c6008 = c60082;
                        rawWebSocketCommonKt$writeFrame$1.L$0 = interfaceC5079;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = abstractC5112;
                        rawWebSocketCommonKt$writeFrame$1.Z$0 = z;
                        rawWebSocketCommonKt$writeFrame$1.label = 3;
                        if (AbstractC5078.m9253(interfaceC5079, (short) i, rawWebSocketCommonKt$writeFrame$1) != coroutineSingletons) {
                            abstractC51122 = abstractC5112;
                            abstractC5112 = abstractC51122;
                            byte[] bArr = abstractC5112.f13181;
                            int length = bArr.length;
                            C6309 c63092 = new C6309();
                            c63092.write(bArr, 0, length);
                            c6309 = c63092;
                            if (z) {
                            }
                        }
                    } else if (i2 != 127) {
                        c = 2;
                        c6008 = c60082;
                        byte[] bArr2 = abstractC5112.f13181;
                        int length2 = bArr2.length;
                        C6309 c630922 = new C6309();
                        c630922.write(bArr2, 0, length2);
                        c6309 = c630922;
                        if (z) {
                            iNextInt = AbstractC5233.Default.nextInt();
                            rawWebSocketCommonKt$writeFrame$1.L$0 = interfaceC5079;
                            rawWebSocketCommonKt$writeFrame$1.L$1 = c630922;
                            rawWebSocketCommonKt$writeFrame$1.I$0 = iNextInt;
                            rawWebSocketCommonKt$writeFrame$1.label = 5;
                            interfaceC6313 = c630922;
                        } else {
                            if (z) {
                                C5043.m9170();
                                return null;
                            }
                            rawWebSocketCommonKt$writeFrame$1.L$0 = null;
                            rawWebSocketCommonKt$writeFrame$1.L$1 = null;
                            rawWebSocketCommonKt$writeFrame$1.label = 6;
                            if (AbstractC5078.m9246(interfaceC5079, c6309, rawWebSocketCommonKt$writeFrame$1) != coroutineSingletons) {
                                return c6008;
                            }
                        }
                        break;
                    } else {
                        c = 2;
                        c6008 = c60082;
                        long j = i;
                        rawWebSocketCommonKt$writeFrame$1.L$0 = interfaceC5079;
                        rawWebSocketCommonKt$writeFrame$1.L$1 = abstractC5112;
                        rawWebSocketCommonKt$writeFrame$1.Z$0 = z;
                        rawWebSocketCommonKt$writeFrame$1.label = 4;
                        C5077 c5077 = AbstractC5078.f13099;
                        C5081 c5081 = (C5081) interfaceC5079;
                        C6309 c6309M9261 = c5081.m9261();
                        C6311 c6311M11171 = c6309M9261.m11171(8);
                        byte[] bArr3 = c6311M11171.f15495;
                        int i7 = c6311M11171.f15493;
                        bArr3[i7] = (byte) ((j >>> 56) & 255);
                        bArr3[i7 + 1] = (byte) ((j >>> 48) & 255);
                        bArr3[i7 + 2] = (byte) ((j >>> 40) & 255);
                        bArr3[i7 + 3] = (byte) ((j >>> 32) & 255);
                        bArr3[i7 + 4] = (byte) ((j >>> 24) & 255);
                        bArr3[i7 + 5] = (byte) ((j >>> 16) & 255);
                        bArr3[i7 + 6] = (byte) ((j >>> 8) & 255);
                        bArr3[i7 + 7] = (byte) (j & 255);
                        c6311M11171.f15493 = i7 + 8;
                        c6309M9261.f15487 += 8;
                        Object objM9245 = AbstractC5076.m9245(c5081, rawWebSocketCommonKt$writeFrame$1);
                        if (objM9245 != coroutineSingletons) {
                            objM9245 = c6008;
                        }
                        if (objM9245 != coroutineSingletons) {
                            interfaceC50792 = interfaceC5079;
                            abstractC51123 = abstractC5112;
                            abstractC5112 = abstractC51123;
                            interfaceC5079 = interfaceC50792;
                            byte[] bArr22 = abstractC5112.f13181;
                            int length22 = bArr22.length;
                            C6309 c6309222 = new C6309();
                            c6309222.write(bArr22, 0, length22);
                            c6309 = c6309222;
                            if (z) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                i2 = rawWebSocketCommonKt$writeFrame$1.I$1;
                i = rawWebSocketCommonKt$writeFrame$1.I$0;
                z = rawWebSocketCommonKt$writeFrame$1.Z$0;
                abstractC5112 = (AbstractC5112) rawWebSocketCommonKt$writeFrame$1.L$1;
                interfaceC5079 = (InterfaceC5079) rawWebSocketCommonKt$writeFrame$1.L$0;
                AbstractC6017.m10769(obj2);
                if (i2 != 126) {
                }
                return coroutineSingletons;
            case 3:
                boolean z3 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                abstractC51122 = (AbstractC5112) rawWebSocketCommonKt$writeFrame$1.L$1;
                InterfaceC5079 interfaceC50794 = (InterfaceC5079) rawWebSocketCommonKt$writeFrame$1.L$0;
                AbstractC6017.m10769(obj2);
                z = z3;
                c = 2;
                c6008 = c60082;
                interfaceC5079 = interfaceC50794;
                abstractC5112 = abstractC51122;
                byte[] bArr222 = abstractC5112.f13181;
                int length222 = bArr222.length;
                C6309 c63092222 = new C6309();
                c63092222.write(bArr222, 0, length222);
                c6309 = c63092222;
                if (z) {
                }
                break;
            case 4:
                boolean z4 = rawWebSocketCommonKt$writeFrame$1.Z$0;
                abstractC51123 = (AbstractC5112) rawWebSocketCommonKt$writeFrame$1.L$1;
                interfaceC50792 = (InterfaceC5079) rawWebSocketCommonKt$writeFrame$1.L$0;
                AbstractC6017.m10769(obj2);
                z = z4;
                c = 2;
                c6008 = c60082;
                abstractC5112 = abstractC51123;
                interfaceC5079 = interfaceC50792;
                byte[] bArr2222 = abstractC5112.f13181;
                int length2222 = bArr2222.length;
                C6309 c630922222 = new C6309();
                c630922222.write(bArr2222, 0, length2222);
                c6309 = c630922222;
                if (z) {
                }
                break;
            case 5:
                int i8 = rawWebSocketCommonKt$writeFrame$1.I$0;
                InterfaceC6313 interfaceC63132 = (InterfaceC6313) rawWebSocketCommonKt$writeFrame$1.L$1;
                InterfaceC5079 interfaceC50795 = (InterfaceC5079) rawWebSocketCommonKt$writeFrame$1.L$0;
                AbstractC6017.m10769(obj2);
                iNextInt = i8;
                c = 2;
                c6008 = c60082;
                interfaceC5079 = interfaceC50795;
                interfaceC6313 = interfaceC63132;
                byte[] bArr4 = new byte[4];
                bArr4[0] = (byte) (iNextInt >> 24);
                bArr4[1] = (byte) (iNextInt >> 16);
                bArr4[c] = (byte) (iNextInt >> 8);
                bArr4[3] = (byte) iNextInt;
                C6309 c63093 = new C6309();
                int iM12638 = (int) AbstractC7684.m12638(interfaceC6313);
                for (int i9 = 0; i9 < iM12638; i9++) {
                    c63093.m11173((byte) (interfaceC6313.readByte() ^ bArr4[i9 % 4]));
                }
                c6309 = c63093;
                rawWebSocketCommonKt$writeFrame$1.L$0 = null;
                rawWebSocketCommonKt$writeFrame$1.L$1 = null;
                rawWebSocketCommonKt$writeFrame$1.label = 6;
                if (AbstractC5078.m9246(interfaceC5079, c6309, rawWebSocketCommonKt$writeFrame$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                break;
            case 6:
                AbstractC6017.m10769(obj2);
                return c60082;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
