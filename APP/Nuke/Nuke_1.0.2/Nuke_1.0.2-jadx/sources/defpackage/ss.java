package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import nuke.module.wechat.ai.AIChatConfig;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ss extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ DexKitBridge j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss(DexKitBridge dexKitBridge, sj sjVar, int i, int i2, int i3) {
        super(0);
        this.i = i3;
        this.j = dexKitBridge;
        this.k = i;
        this.l = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        ReentrantReadWriteLock.ReadLock lock;
        int i;
        int i2;
        int i3;
        int i4 = 1;
        switch (this.i) {
            case 0:
                DexKitBridge dexKitBridge = this.j;
                long jF = sj.f(this.k, this.l);
                lock = dexKitBridge.i.readLock();
                lock.lock();
                try {
                    long j = dexKitBridge.h;
                    if (j == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetClassAnnotations = DexKitBridge.nativeGetClassAnnotations(j, jF);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassAnnotations);
                    byteBufferWrap.getClass();
                    a aVar = new a();
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    aVar.c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                    ArrayList arrayList = new ArrayList();
                    int iB = aVar.b(4);
                    int iF = iB != 0 ? aVar.f(iB) : 0;
                    for (int i5 = 0; i5 < iF; i5++) {
                        c cVarG = aVar.g(i5);
                        cVarG.getClass();
                        arrayList.add(gf1.t(dexKitBridge, cVarG));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                DexKitBridge dexKitBridge2 = this.j;
                long jF2 = sj.f(this.k, this.l);
                lock = dexKitBridge2.i.readLock();
                lock.lock();
                try {
                    long j2 = dexKitBridge2.h;
                    if (j2 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetFieldAnnotations = DexKitBridge.nativeGetFieldAnnotations(j2, jF2);
                    lock.unlock();
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrNativeGetFieldAnnotations);
                    byteBufferWrap2.getClass();
                    a aVar2 = new a();
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    aVar2.c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                    ArrayList arrayList2 = new ArrayList();
                    int iB2 = aVar2.b(4);
                    int iF2 = iB2 != 0 ? aVar2.f(iB2) : 0;
                    for (int i6 = 0; i6 < iF2; i6++) {
                        c cVarG2 = aVar2.g(i6);
                        cVarG2.getClass();
                        arrayList2.add(gf1.t(dexKitBridge2, cVarG2));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                DexKitBridge dexKitBridge3 = this.j;
                long jF3 = sj.f(this.k, this.l);
                lock = dexKitBridge3.i.readLock();
                lock.lock();
                try {
                    long j3 = dexKitBridge3.h;
                    if (j3 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeFieldGetMethods = DexKitBridge.nativeFieldGetMethods(j3, jF3);
                    lock.unlock();
                    ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArrNativeFieldGetMethods);
                    byteBufferWrap3.getClass();
                    a aVar3 = new a();
                    byteBufferWrap3.order(ByteOrder.LITTLE_ENDIAN);
                    aVar3.c(byteBufferWrap3.position() + byteBufferWrap3.getInt(byteBufferWrap3.position()), byteBufferWrap3);
                    ki0 ki0Var = new ki0(i4);
                    int i7 = aVar3.i();
                    for (int i8 = 0; i8 < i7; i8++) {
                        r rVarJ = aVar3.j(i8);
                        rVarJ.getClass();
                        ki0Var.add(p40.t(dexKitBridge3, rVarJ));
                    }
                    return ki0Var;
                } finally {
                }
            case 3:
                DexKitBridge dexKitBridge4 = this.j;
                long jF4 = sj.f(this.k, this.l);
                lock = dexKitBridge4.i.readLock();
                lock.lock();
                try {
                    long j4 = dexKitBridge4.h;
                    if (j4 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeFieldPutMethods = DexKitBridge.nativeFieldPutMethods(j4, jF4);
                    lock.unlock();
                    ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(bArrNativeFieldPutMethods);
                    byteBufferWrap4.getClass();
                    a aVar4 = new a();
                    byteBufferWrap4.order(ByteOrder.LITTLE_ENDIAN);
                    aVar4.c(byteBufferWrap4.position() + byteBufferWrap4.getInt(byteBufferWrap4.position()), byteBufferWrap4);
                    ki0 ki0Var2 = new ki0(i4);
                    int i9 = aVar4.i();
                    for (int i10 = 0; i10 < i9; i10++) {
                        r rVarJ2 = aVar4.j(i10);
                        rVarJ2.getClass();
                        ki0Var2.add(p40.t(dexKitBridge4, rVarJ2));
                    }
                    return ki0Var2;
                } finally {
                }
            case 4:
                DexKitBridge dexKitBridge5 = this.j;
                long jF5 = sj.f(this.k, this.l);
                lock = dexKitBridge5.i.readLock();
                lock.lock();
                try {
                    long j5 = dexKitBridge5.h;
                    if (j5 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodAnnotations = DexKitBridge.nativeGetMethodAnnotations(j5, jF5);
                    lock.unlock();
                    ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(bArrNativeGetMethodAnnotations);
                    byteBufferWrap5.getClass();
                    a aVar5 = new a();
                    byteBufferWrap5.order(ByteOrder.LITTLE_ENDIAN);
                    aVar5.c(byteBufferWrap5.position() + byteBufferWrap5.getInt(byteBufferWrap5.position()), byteBufferWrap5);
                    ArrayList arrayList3 = new ArrayList();
                    int iB3 = aVar5.b(4);
                    int iF3 = iB3 != 0 ? aVar5.f(iB3) : 0;
                    for (int i11 = 0; i11 < iF3; i11++) {
                        c cVarG3 = aVar5.g(i11);
                        cVarG3.getClass();
                        arrayList3.add(gf1.t(dexKitBridge5, cVarG3));
                    }
                    return arrayList3;
                } finally {
                }
            case 5:
                DexKitBridge dexKitBridge6 = this.j;
                long jF6 = sj.f(this.k, this.l);
                lock = dexKitBridge6.i.readLock();
                lock.lock();
                try {
                    long j6 = dexKitBridge6.h;
                    if (j6 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetCallMethods = DexKitBridge.nativeGetCallMethods(j6, jF6);
                    lock.unlock();
                    ByteBuffer byteBufferWrap6 = ByteBuffer.wrap(bArrNativeGetCallMethods);
                    byteBufferWrap6.getClass();
                    a aVar6 = new a();
                    byteBufferWrap6.order(ByteOrder.LITTLE_ENDIAN);
                    aVar6.c(byteBufferWrap6.position() + byteBufferWrap6.getInt(byteBufferWrap6.position()), byteBufferWrap6);
                    ki0 ki0Var3 = new ki0(i4);
                    int i12 = aVar6.i();
                    for (int i13 = 0; i13 < i12; i13++) {
                        r rVarJ3 = aVar6.j(i13);
                        rVarJ3.getClass();
                        ki0Var3.add(p40.t(dexKitBridge6, rVarJ3));
                    }
                    return ki0Var3;
                } finally {
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                DexKitBridge dexKitBridge7 = this.j;
                long jF7 = sj.f(this.k, this.l);
                lock = dexKitBridge7.i.readLock();
                lock.lock();
                try {
                    long j7 = dexKitBridge7.h;
                    if (j7 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetInvokeMethods = DexKitBridge.nativeGetInvokeMethods(j7, jF7);
                    lock.unlock();
                    ByteBuffer byteBufferWrap7 = ByteBuffer.wrap(bArrNativeGetInvokeMethods);
                    byteBufferWrap7.getClass();
                    a aVar7 = new a();
                    byteBufferWrap7.order(ByteOrder.LITTLE_ENDIAN);
                    aVar7.c(byteBufferWrap7.position() + byteBufferWrap7.getInt(byteBufferWrap7.position()), byteBufferWrap7);
                    ki0 ki0Var4 = new ki0(i4);
                    int i14 = aVar7.i();
                    for (int i15 = 0; i15 < i14; i15++) {
                        r rVarJ4 = aVar7.j(i15);
                        rVarJ4.getClass();
                        ki0Var4.add(p40.t(dexKitBridge7, rVarJ4));
                    }
                    return ki0Var4;
                } finally {
                }
            case 7:
                DexKitBridge dexKitBridge8 = this.j;
                long jF8 = sj.f(this.k, this.l);
                lock = dexKitBridge8.i.readLock();
                lock.lock();
                try {
                    long j8 = dexKitBridge8.h;
                    if (j8 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    int[] iArrNativeGetMethodOpCodes = DexKitBridge.nativeGetMethodOpCodes(j8, jF8);
                    lock.unlock();
                    return mg.s0(iArrNativeGetMethodOpCodes);
                } finally {
                }
            case 8:
                DexKitBridge dexKitBridge9 = this.j;
                long jF9 = sj.f(this.k, this.l);
                lock = dexKitBridge9.i.readLock();
                lock.lock();
                try {
                    long j9 = dexKitBridge9.h;
                    if (j9 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetParameterAnnotations = DexKitBridge.nativeGetParameterAnnotations(j9, jF9);
                    lock.unlock();
                    ByteBuffer byteBufferWrap8 = ByteBuffer.wrap(bArrNativeGetParameterAnnotations);
                    byteBufferWrap8.getClass();
                    jx2.d();
                    byteBufferWrap8.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferWrap8.position() + byteBufferWrap8.getInt(byteBufferWrap8.position());
                    int i16 = iPosition - byteBufferWrap8.getInt(iPosition);
                    short s = byteBufferWrap8.getShort(i16);
                    ArrayList arrayList4 = new ArrayList();
                    short s2 = 4 < s ? byteBufferWrap8.getShort(i16 + 4) : (short) 0;
                    if (s2 != 0) {
                        int i17 = s2 + iPosition;
                        i = byteBufferWrap8.getInt(byteBufferWrap8.getInt(i17) + i17);
                    } else {
                        i = 0;
                    }
                    for (int i18 = 0; i18 < i; i18++) {
                        a aVar8 = new a();
                        short s3 = 4 < s ? byteBufferWrap8.getShort(i16 + 4) : (short) 0;
                        if (s3 != 0) {
                            int i19 = s3 + iPosition;
                            int i20 = (i18 * 4) + byteBufferWrap8.getInt(i19) + i19 + 4;
                            aVar8.c(byteBufferWrap8.getInt(i20) + i20, byteBufferWrap8);
                        } else {
                            aVar8 = null;
                        }
                        aVar8.getClass();
                        ArrayList arrayList5 = new ArrayList();
                        int iB4 = aVar8.b(4);
                        int iF4 = iB4 != 0 ? aVar8.f(iB4) : 0;
                        for (int i21 = 0; i21 < iF4; i21++) {
                            c cVarG4 = aVar8.g(i21);
                            cVarG4.getClass();
                            arrayList5.add(gf1.t(dexKitBridge9, cVarG4));
                        }
                        arrayList4.add(arrayList5);
                    }
                    return arrayList4;
                } finally {
                }
            case 9:
                DexKitBridge dexKitBridge10 = this.j;
                long jF10 = sj.f(this.k, this.l);
                dexKitBridge10.i.readLock().lock();
                try {
                    long j10 = dexKitBridge10.h;
                    if (j10 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    String[] strArrNativeGetParameterNames = DexKitBridge.nativeGetParameterNames(j10, jF10);
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
                DexKitBridge dexKitBridge11 = this.j;
                long jF11 = sj.f(this.k, this.l);
                lock = dexKitBridge11.i.readLock();
                lock.lock();
                try {
                    long j11 = dexKitBridge11.h;
                    if (j11 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodUsingFields = DexKitBridge.nativeGetMethodUsingFields(j11, jF11);
                    lock.unlock();
                    ByteBuffer byteBufferWrap9 = ByteBuffer.wrap(bArrNativeGetMethodUsingFields);
                    byteBufferWrap9.getClass();
                    jx2.d();
                    byteBufferWrap9.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition2 = byteBufferWrap9.position() + byteBufferWrap9.getInt(byteBufferWrap9.position());
                    int i22 = iPosition2 - byteBufferWrap9.getInt(iPosition2);
                    short s4 = byteBufferWrap9.getShort(i22);
                    ArrayList arrayList7 = new ArrayList();
                    short s5 = 4 < s4 ? byteBufferWrap9.getShort(i22 + 4) : (short) 0;
                    if (s5 != 0) {
                        int i23 = s5 + iPosition2;
                        i2 = byteBufferWrap9.getInt(byteBufferWrap9.getInt(i23) + i23);
                    } else {
                        i2 = 0;
                    }
                    for (int i24 = 0; i24 < i2; i24++) {
                        a aVar9 = new a();
                        short s6 = 4 < s4 ? byteBufferWrap9.getShort(i22 + 4) : (short) 0;
                        if (s6 != 0) {
                            int i25 = s6 + iPosition2;
                            int i26 = (i24 * 4) + byteBufferWrap9.getInt(i25) + i25 + 4;
                            aVar9.c(byteBufferWrap9.getInt(i26) + i26, byteBufferWrap9);
                        } else {
                            aVar9 = null;
                        }
                        aVar9.getClass();
                        q qVar = new q();
                        int iB5 = aVar9.b(4);
                        if (iB5 != 0) {
                            int iA = aVar9.a(iB5 + aVar9.a);
                            ByteBuffer byteBuffer = aVar9.b;
                            byteBuffer.getClass();
                            qVar.c(iA, byteBuffer);
                        } else {
                            qVar = null;
                        }
                        qVar.getClass();
                        ji0 ji0VarB = se.B(dexKitBridge11, qVar);
                        int iB6 = aVar9.b(6);
                        byte b = iB6 != 0 ? aVar9.b.get(iB6 + aVar9.a) : (byte) 0;
                        if (b == 1) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                            if (b != 2) {
                                int iB7 = aVar9.b(6);
                                throw new IllegalArgumentException(vi0.g("Unknown using type: ", iB7 != 0 ? aVar9.b.get(iB7 + aVar9.a) : (byte) 0));
                            }
                        }
                        arrayList7.add(new z83(ji0VarB, i3));
                    }
                    return arrayList7;
                } finally {
                }
            default:
                DexKitBridge dexKitBridge12 = this.j;
                long jF12 = sj.f(this.k, this.l);
                lock = dexKitBridge12.i.readLock();
                lock.lock();
                try {
                    long j12 = dexKitBridge12.h;
                    if (j12 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    String[] strArrNativeGetMethodUsingStrings = DexKitBridge.nativeGetMethodUsingStrings(j12, jF12);
                    lock.unlock();
                    return mg.t0(strArrNativeGetMethodUsingStrings);
                } finally {
                }
        }
    }
}
