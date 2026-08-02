package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import nuke.module.wechat.p002ai.AIChatConfig;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ss */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0705ss extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f10342i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DexKitBridge f10343j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f10344k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f10345l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0705ss(DexKitBridge dexKitBridge, AbstractC0696sj abstractC0696sj, int i, int i2, int i3) {
        super(0);
        this.f10342i = i3;
        this.f10343j = dexKitBridge;
        this.f10344k = i;
        this.f10345l = i2;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ReentrantReadWriteLock.ReadLock lock;
        int i;
        int i2;
        int i3;
        int i4 = 1;
        switch (this.f10342i) {
            case 0:
                DexKitBridge dexKitBridge = this.f10343j;
                long jM4872f = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge.f7819i.readLock();
                lock.lock();
                try {
                    long j = dexKitBridge.f7818h;
                    if (j == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetClassAnnotations = DexKitBridge.nativeGetClassAnnotations(j, jM4872f);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassAnnotations);
                    byteBufferWrap.getClass();
                    C0000a c0000a = new C0000a();
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    c0000a.m3662c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                    ArrayList arrayList = new ArrayList();
                    int iM3661b = c0000a.m3661b(4);
                    int iM3665f = iM3661b != 0 ? c0000a.m3665f(iM3661b) : 0;
                    for (int i5 = 0; i5 < iM3665f; i5++) {
                        C0073c c0073cM0g = c0000a.m0g(i5);
                        c0073cM0g.getClass();
                        arrayList.add(gf1.m1902t(dexKitBridge, c0073cM0g));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                DexKitBridge dexKitBridge2 = this.f10343j;
                long jM4872f2 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge2.f7819i.readLock();
                lock.lock();
                try {
                    long j2 = dexKitBridge2.f7818h;
                    if (j2 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetFieldAnnotations = DexKitBridge.nativeGetFieldAnnotations(j2, jM4872f2);
                    lock.unlock();
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrNativeGetFieldAnnotations);
                    byteBufferWrap2.getClass();
                    C0000a c0000a2 = new C0000a();
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    c0000a2.m3662c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                    ArrayList arrayList2 = new ArrayList();
                    int iM3661b2 = c0000a2.m3661b(4);
                    int iM3665f2 = iM3661b2 != 0 ? c0000a2.m3665f(iM3661b2) : 0;
                    for (int i6 = 0; i6 < iM3665f2; i6++) {
                        C0073c c0073cM0g2 = c0000a2.m0g(i6);
                        c0073cM0g2.getClass();
                        arrayList2.add(gf1.m1902t(dexKitBridge2, c0073cM0g2));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                DexKitBridge dexKitBridge3 = this.f10343j;
                long jM4872f3 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge3.f7819i.readLock();
                lock.lock();
                try {
                    long j3 = dexKitBridge3.f7818h;
                    if (j3 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeFieldGetMethods = DexKitBridge.nativeFieldGetMethods(j3, jM4872f3);
                    lock.unlock();
                    ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArrNativeFieldGetMethods);
                    byteBufferWrap3.getClass();
                    C0000a c0000a3 = new C0000a();
                    byteBufferWrap3.order(ByteOrder.LITTLE_ENDIAN);
                    c0000a3.m3662c(byteBufferWrap3.position() + byteBufferWrap3.getInt(byteBufferWrap3.position()), byteBufferWrap3);
                    ki0 ki0Var = new ki0(i4);
                    int iM2i = c0000a3.m2i();
                    for (int i7 = 0; i7 < iM2i; i7++) {
                        C0638r c0638rM3j = c0000a3.m3j(i7);
                        c0638rM3j.getClass();
                        ki0Var.add(p40.m3737t(dexKitBridge3, c0638rM3j));
                    }
                    return ki0Var;
                } finally {
                }
            case 3:
                DexKitBridge dexKitBridge4 = this.f10343j;
                long jM4872f4 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge4.f7819i.readLock();
                lock.lock();
                try {
                    long j4 = dexKitBridge4.f7818h;
                    if (j4 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeFieldPutMethods = DexKitBridge.nativeFieldPutMethods(j4, jM4872f4);
                    lock.unlock();
                    ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(bArrNativeFieldPutMethods);
                    byteBufferWrap4.getClass();
                    C0000a c0000a4 = new C0000a();
                    byteBufferWrap4.order(ByteOrder.LITTLE_ENDIAN);
                    c0000a4.m3662c(byteBufferWrap4.position() + byteBufferWrap4.getInt(byteBufferWrap4.position()), byteBufferWrap4);
                    ki0 ki0Var2 = new ki0(i4);
                    int iM2i2 = c0000a4.m2i();
                    for (int i8 = 0; i8 < iM2i2; i8++) {
                        C0638r c0638rM3j2 = c0000a4.m3j(i8);
                        c0638rM3j2.getClass();
                        ki0Var2.add(p40.m3737t(dexKitBridge4, c0638rM3j2));
                    }
                    return ki0Var2;
                } finally {
                }
            case 4:
                DexKitBridge dexKitBridge5 = this.f10343j;
                long jM4872f5 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge5.f7819i.readLock();
                lock.lock();
                try {
                    long j5 = dexKitBridge5.f7818h;
                    if (j5 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodAnnotations = DexKitBridge.nativeGetMethodAnnotations(j5, jM4872f5);
                    lock.unlock();
                    ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(bArrNativeGetMethodAnnotations);
                    byteBufferWrap5.getClass();
                    C0000a c0000a5 = new C0000a();
                    byteBufferWrap5.order(ByteOrder.LITTLE_ENDIAN);
                    c0000a5.m3662c(byteBufferWrap5.position() + byteBufferWrap5.getInt(byteBufferWrap5.position()), byteBufferWrap5);
                    ArrayList arrayList3 = new ArrayList();
                    int iM3661b3 = c0000a5.m3661b(4);
                    int iM3665f3 = iM3661b3 != 0 ? c0000a5.m3665f(iM3661b3) : 0;
                    for (int i9 = 0; i9 < iM3665f3; i9++) {
                        C0073c c0073cM0g3 = c0000a5.m0g(i9);
                        c0073cM0g3.getClass();
                        arrayList3.add(gf1.m1902t(dexKitBridge5, c0073cM0g3));
                    }
                    return arrayList3;
                } finally {
                }
            case 5:
                DexKitBridge dexKitBridge6 = this.f10343j;
                long jM4872f6 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge6.f7819i.readLock();
                lock.lock();
                try {
                    long j6 = dexKitBridge6.f7818h;
                    if (j6 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetCallMethods = DexKitBridge.nativeGetCallMethods(j6, jM4872f6);
                    lock.unlock();
                    ByteBuffer byteBufferWrap6 = ByteBuffer.wrap(bArrNativeGetCallMethods);
                    byteBufferWrap6.getClass();
                    C0000a c0000a6 = new C0000a();
                    byteBufferWrap6.order(ByteOrder.LITTLE_ENDIAN);
                    c0000a6.m3662c(byteBufferWrap6.position() + byteBufferWrap6.getInt(byteBufferWrap6.position()), byteBufferWrap6);
                    ki0 ki0Var3 = new ki0(i4);
                    int iM2i3 = c0000a6.m2i();
                    for (int i10 = 0; i10 < iM2i3; i10++) {
                        C0638r c0638rM3j3 = c0000a6.m3j(i10);
                        c0638rM3j3.getClass();
                        ki0Var3.add(p40.m3737t(dexKitBridge6, c0638rM3j3));
                    }
                    return ki0Var3;
                } finally {
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                DexKitBridge dexKitBridge7 = this.f10343j;
                long jM4872f7 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge7.f7819i.readLock();
                lock.lock();
                try {
                    long j7 = dexKitBridge7.f7818h;
                    if (j7 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetInvokeMethods = DexKitBridge.nativeGetInvokeMethods(j7, jM4872f7);
                    lock.unlock();
                    ByteBuffer byteBufferWrap7 = ByteBuffer.wrap(bArrNativeGetInvokeMethods);
                    byteBufferWrap7.getClass();
                    C0000a c0000a7 = new C0000a();
                    byteBufferWrap7.order(ByteOrder.LITTLE_ENDIAN);
                    c0000a7.m3662c(byteBufferWrap7.position() + byteBufferWrap7.getInt(byteBufferWrap7.position()), byteBufferWrap7);
                    ki0 ki0Var4 = new ki0(i4);
                    int iM2i4 = c0000a7.m2i();
                    for (int i11 = 0; i11 < iM2i4; i11++) {
                        C0638r c0638rM3j4 = c0000a7.m3j(i11);
                        c0638rM3j4.getClass();
                        ki0Var4.add(p40.m3737t(dexKitBridge7, c0638rM3j4));
                    }
                    return ki0Var4;
                } finally {
                }
            case 7:
                DexKitBridge dexKitBridge8 = this.f10343j;
                long jM4872f8 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge8.f7819i.readLock();
                lock.lock();
                try {
                    long j8 = dexKitBridge8.f7818h;
                    if (j8 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    int[] iArrNativeGetMethodOpCodes = DexKitBridge.nativeGetMethodOpCodes(j8, jM4872f8);
                    lock.unlock();
                    return AbstractC0460mg.m3104s0(iArrNativeGetMethodOpCodes);
                } finally {
                }
            case 8:
                DexKitBridge dexKitBridge9 = this.f10343j;
                long jM4872f9 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge9.f7819i.readLock();
                lock.lock();
                try {
                    long j9 = dexKitBridge9.f7818h;
                    if (j9 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetParameterAnnotations = DexKitBridge.nativeGetParameterAnnotations(j9, jM4872f9);
                    lock.unlock();
                    ByteBuffer byteBufferWrap8 = ByteBuffer.wrap(bArrNativeGetParameterAnnotations);
                    byteBufferWrap8.getClass();
                    jx2.m2594d();
                    byteBufferWrap8.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferWrap8.position() + byteBufferWrap8.getInt(byteBufferWrap8.position());
                    int i12 = iPosition - byteBufferWrap8.getInt(iPosition);
                    short s = byteBufferWrap8.getShort(i12);
                    ArrayList arrayList4 = new ArrayList();
                    short s2 = 4 < s ? byteBufferWrap8.getShort(i12 + 4) : (short) 0;
                    if (s2 != 0) {
                        int i13 = s2 + iPosition;
                        i = byteBufferWrap8.getInt(byteBufferWrap8.getInt(i13) + i13);
                    } else {
                        i = 0;
                    }
                    for (int i14 = 0; i14 < i; i14++) {
                        C0000a c0000a8 = new C0000a();
                        short s3 = 4 < s ? byteBufferWrap8.getShort(i12 + 4) : (short) 0;
                        if (s3 != 0) {
                            int i15 = s3 + iPosition;
                            int i16 = (i14 * 4) + byteBufferWrap8.getInt(i15) + i15 + 4;
                            c0000a8.m3662c(byteBufferWrap8.getInt(i16) + i16, byteBufferWrap8);
                        } else {
                            c0000a8 = null;
                        }
                        c0000a8.getClass();
                        ArrayList arrayList5 = new ArrayList();
                        int iM3661b4 = c0000a8.m3661b(4);
                        int iM3665f4 = iM3661b4 != 0 ? c0000a8.m3665f(iM3661b4) : 0;
                        for (int i17 = 0; i17 < iM3665f4; i17++) {
                            C0073c c0073cM0g4 = c0000a8.m0g(i17);
                            c0073cM0g4.getClass();
                            arrayList5.add(gf1.m1902t(dexKitBridge9, c0073cM0g4));
                        }
                        arrayList4.add(arrayList5);
                    }
                    return arrayList4;
                } finally {
                }
            case 9:
                DexKitBridge dexKitBridge10 = this.f10343j;
                long jM4872f10 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                dexKitBridge10.f7819i.readLock().lock();
                try {
                    long j10 = dexKitBridge10.f7818h;
                    if (j10 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    String[] strArrNativeGetParameterNames = DexKitBridge.nativeGetParameterNames(j10, jM4872f10);
                    if (strArrNativeGetParameterNames == null) {
                        return null;
                    }
                    ArrayList arrayList6 = new ArrayList(strArrNativeGetParameterNames.length);
                    for (String str : strArrNativeGetParameterNames) {
                        arrayList6.add(str);
                    }
                    return arrayList6;
                } finally {
                }
            case 10:
                DexKitBridge dexKitBridge11 = this.f10343j;
                long jM4872f11 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge11.f7819i.readLock();
                lock.lock();
                try {
                    long j11 = dexKitBridge11.f7818h;
                    if (j11 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodUsingFields = DexKitBridge.nativeGetMethodUsingFields(j11, jM4872f11);
                    lock.unlock();
                    ByteBuffer byteBufferWrap9 = ByteBuffer.wrap(bArrNativeGetMethodUsingFields);
                    byteBufferWrap9.getClass();
                    jx2.m2594d();
                    byteBufferWrap9.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition2 = byteBufferWrap9.position() + byteBufferWrap9.getInt(byteBufferWrap9.position());
                    int i18 = iPosition2 - byteBufferWrap9.getInt(iPosition2);
                    short s4 = byteBufferWrap9.getShort(i18);
                    ArrayList arrayList7 = new ArrayList();
                    short s5 = 4 < s4 ? byteBufferWrap9.getShort(i18 + 4) : (short) 0;
                    if (s5 != 0) {
                        int i19 = s5 + iPosition2;
                        i2 = byteBufferWrap9.getInt(byteBufferWrap9.getInt(i19) + i19);
                    } else {
                        i2 = 0;
                    }
                    for (int i20 = 0; i20 < i2; i20++) {
                        C0000a c0000a9 = new C0000a();
                        short s6 = 4 < s4 ? byteBufferWrap9.getShort(i18 + 4) : (short) 0;
                        if (s6 != 0) {
                            int i21 = s6 + iPosition2;
                            int i22 = (i20 * 4) + byteBufferWrap9.getInt(i21) + i21 + 4;
                            c0000a9.m3662c(byteBufferWrap9.getInt(i22) + i22, byteBufferWrap9);
                        } else {
                            c0000a9 = null;
                        }
                        c0000a9.getClass();
                        C0599q c0599q = new C0599q();
                        int iM3661b5 = c0000a9.m3661b(4);
                        if (iM3661b5 != 0) {
                            int iM3660a = c0000a9.m3660a(iM3661b5 + c0000a9.f7868a);
                            ByteBuffer byteBuffer = c0000a9.f7869b;
                            byteBuffer.getClass();
                            c0599q.m3662c(iM3660a, byteBuffer);
                        } else {
                            c0599q = null;
                        }
                        c0599q.getClass();
                        ji0 ji0VarM4813B = AbstractC0691se.m4813B(dexKitBridge11, c0599q);
                        int iM3661b6 = c0000a9.m3661b(6);
                        byte b = iM3661b6 != 0 ? c0000a9.f7869b.get(iM3661b6 + c0000a9.f7868a) : (byte) 0;
                        if (b == 1) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                            if (b != 2) {
                                int iM3661b7 = c0000a9.m3661b(6);
                                throw new IllegalArgumentException(vi0.m5688g("Unknown using type: ", iM3661b7 != 0 ? c0000a9.f7869b.get(iM3661b7 + c0000a9.f7868a) : (byte) 0));
                            }
                        }
                        arrayList7.add(new z83(ji0VarM4813B, i3));
                    }
                    return arrayList7;
                } finally {
                }
            default:
                DexKitBridge dexKitBridge12 = this.f10343j;
                long jM4872f12 = AbstractC0696sj.m4872f(this.f10344k, this.f10345l);
                lock = dexKitBridge12.f7819i.readLock();
                lock.lock();
                try {
                    long j12 = dexKitBridge12.f7818h;
                    if (j12 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    String[] strArrNativeGetMethodUsingStrings = DexKitBridge.nativeGetMethodUsingStrings(j12, jM4872f12);
                    lock.unlock();
                    return AbstractC0460mg.m3105t0(strArrNativeGetMethodUsingStrings);
                } finally {
                }
        }
    }
}
