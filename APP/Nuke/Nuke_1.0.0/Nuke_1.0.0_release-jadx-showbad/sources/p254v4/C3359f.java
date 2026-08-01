package p254v4;

import com.bumptech.glide.AbstractC1925g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.dartcv.nuke.BuildConfig;
import org.luckypray.dexkit.DexKitBridge;
import p011B4.AbstractC0231b;
import p032F3.AbstractC0453a;
import p049I2.AbstractC0797o;
import p061L2.AbstractC0972l;
import p061L2.C0981u;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p127Z2.AbstractC1784a;
import p179i4.AbstractC2352g;
import p206n2.C2689a;
import p265x4.C3455a;
import p265x4.C3457c;
import p265x4.C3469o;
import p265x4.C3470p;

/* JADX INFO: renamed from: v4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3359f extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f10428e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DexKitBridge f10429f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10430g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10431h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3359f(DexKitBridge dexKitBridge, AbstractC0453a abstractC0453a, int i5, int i6, int i7) {
        super(0);
        this.f10428e = i7;
        this.f10429f = dexKitBridge;
        this.f10430g = i5;
        this.f10431h = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ReentrantReadWriteLock.ReadLock lock;
        int i5;
        int i6;
        switch (this.f10428e) {
            case 0:
                DexKitBridge dexKitBridge = this.f10429f;
                long jM738c = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge.getClass();
                lock = dexKitBridge.f8837e.readLock();
                lock.lock();
                try {
                    long j5 = dexKitBridge.f8836d;
                    if (j5 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetClassAnnotations = DexKitBridge.nativeGetClassAnnotations(j5, jM738c);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassAnnotations);
                    AbstractC1665j.m2984d(byteBufferWrap, "wrap(res)");
                    C3455a c3455a = new C3455a();
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    c3455a.m4686c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                    ArrayList arrayList = new ArrayList();
                    int iM4685b = c3455a.m4685b(4);
                    int iM4689f = iM4685b != 0 ? c3455a.m4689f(iM4685b) : 0;
                    for (int i7 = 0; i7 < iM4689f; i7++) {
                        C3457c c3457cM5705g = c3455a.m5705g(i7);
                        AbstractC1665j.m2982b(c3457cM5705g);
                        arrayList.add(AbstractC1925g.m3539p(dexKitBridge, c3457cM5705g));
                    }
                    return arrayList;
                } finally {
                }
            case BuildConfig.VERSION_CODE /* 1 */:
                DexKitBridge dexKitBridge2 = this.f10429f;
                long jM738c2 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge2.getClass();
                lock = dexKitBridge2.f8837e.readLock();
                lock.lock();
                try {
                    long j6 = dexKitBridge2.f8836d;
                    if (j6 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetFieldAnnotations = DexKitBridge.nativeGetFieldAnnotations(j6, jM738c2);
                    lock.unlock();
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrNativeGetFieldAnnotations);
                    AbstractC1665j.m2984d(byteBufferWrap2, "wrap(res)");
                    C3455a c3455a2 = new C3455a();
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    c3455a2.m4686c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                    ArrayList arrayList2 = new ArrayList();
                    int iM4685b2 = c3455a2.m4685b(4);
                    int iM4689f2 = iM4685b2 != 0 ? c3455a2.m4689f(iM4685b2) : 0;
                    for (int i8 = 0; i8 < iM4689f2; i8++) {
                        C3457c c3457cM5705g2 = c3455a2.m5705g(i8);
                        AbstractC1665j.m2982b(c3457cM5705g2);
                        arrayList2.add(AbstractC1925g.m3539p(dexKitBridge2, c3457cM5705g2));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                DexKitBridge dexKitBridge3 = this.f10429f;
                long jM738c3 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge3.getClass();
                lock = dexKitBridge3.f8837e.readLock();
                lock.lock();
                try {
                    long j7 = dexKitBridge3.f8836d;
                    if (j7 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeFieldGetMethods = DexKitBridge.nativeFieldGetMethods(j7, jM738c3);
                    lock.unlock();
                    ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArrNativeFieldGetMethods);
                    AbstractC1665j.m2984d(byteBufferWrap3, "wrap(res)");
                    C3455a c3455a3 = new C3455a();
                    byteBufferWrap3.order(ByteOrder.LITTLE_ENDIAN);
                    c3455a3.m4686c(byteBufferWrap3.position() + byteBufferWrap3.getInt(byteBufferWrap3.position()), byteBufferWrap3);
                    C3366m c3366m = new C3366m(1);
                    int iM5706h = c3455a3.m5706h();
                    for (int i9 = 0; i9 < iM5706h; i9++) {
                        C3470p c3470pM5707i = c3455a3.m5707i(i9);
                        AbstractC1665j.m2982b(c3470pM5707i);
                        c3366m.add(AbstractC1784a.m3234t(dexKitBridge3, c3470pM5707i));
                    }
                    return c3366m;
                } finally {
                }
            case 3:
                DexKitBridge dexKitBridge4 = this.f10429f;
                long jM738c4 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge4.getClass();
                lock = dexKitBridge4.f8837e.readLock();
                lock.lock();
                try {
                    long j8 = dexKitBridge4.f8836d;
                    if (j8 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeFieldPutMethods = DexKitBridge.nativeFieldPutMethods(j8, jM738c4);
                    lock.unlock();
                    ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(bArrNativeFieldPutMethods);
                    AbstractC1665j.m2984d(byteBufferWrap4, "wrap(res)");
                    C3455a c3455a4 = new C3455a();
                    byteBufferWrap4.order(ByteOrder.LITTLE_ENDIAN);
                    c3455a4.m4686c(byteBufferWrap4.position() + byteBufferWrap4.getInt(byteBufferWrap4.position()), byteBufferWrap4);
                    C3366m c3366m2 = new C3366m(1);
                    int iM5706h2 = c3455a4.m5706h();
                    for (int i10 = 0; i10 < iM5706h2; i10++) {
                        C3470p c3470pM5707i2 = c3455a4.m5707i(i10);
                        AbstractC1665j.m2982b(c3470pM5707i2);
                        c3366m2.add(AbstractC1784a.m3234t(dexKitBridge4, c3470pM5707i2));
                    }
                    return c3366m2;
                } finally {
                }
            case 4:
                DexKitBridge dexKitBridge5 = this.f10429f;
                long jM738c5 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge5.getClass();
                lock = dexKitBridge5.f8837e.readLock();
                lock.lock();
                try {
                    long j9 = dexKitBridge5.f8836d;
                    if (j9 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodAnnotations = DexKitBridge.nativeGetMethodAnnotations(j9, jM738c5);
                    lock.unlock();
                    ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(bArrNativeGetMethodAnnotations);
                    AbstractC1665j.m2984d(byteBufferWrap5, "wrap(res)");
                    C3455a c3455a5 = new C3455a();
                    byteBufferWrap5.order(ByteOrder.LITTLE_ENDIAN);
                    c3455a5.m4686c(byteBufferWrap5.position() + byteBufferWrap5.getInt(byteBufferWrap5.position()), byteBufferWrap5);
                    ArrayList arrayList3 = new ArrayList();
                    int iM4685b3 = c3455a5.m4685b(4);
                    int iM4689f3 = iM4685b3 != 0 ? c3455a5.m4689f(iM4685b3) : 0;
                    for (int i11 = 0; i11 < iM4689f3; i11++) {
                        C3457c c3457cM5705g3 = c3455a5.m5705g(i11);
                        AbstractC1665j.m2982b(c3457cM5705g3);
                        arrayList3.add(AbstractC1925g.m3539p(dexKitBridge5, c3457cM5705g3));
                    }
                    return arrayList3;
                } finally {
                }
            case 5:
                DexKitBridge dexKitBridge6 = this.f10429f;
                long jM738c6 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge6.getClass();
                lock = dexKitBridge6.f8837e.readLock();
                lock.lock();
                try {
                    long j10 = dexKitBridge6.f8836d;
                    if (j10 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetCallMethods = DexKitBridge.nativeGetCallMethods(j10, jM738c6);
                    lock.unlock();
                    ByteBuffer byteBufferWrap6 = ByteBuffer.wrap(bArrNativeGetCallMethods);
                    AbstractC1665j.m2984d(byteBufferWrap6, "wrap(res)");
                    C3455a c3455a6 = new C3455a();
                    byteBufferWrap6.order(ByteOrder.LITTLE_ENDIAN);
                    c3455a6.m4686c(byteBufferWrap6.position() + byteBufferWrap6.getInt(byteBufferWrap6.position()), byteBufferWrap6);
                    C3366m c3366m3 = new C3366m(1);
                    int iM5706h3 = c3455a6.m5706h();
                    for (int i12 = 0; i12 < iM5706h3; i12++) {
                        C3470p c3470pM5707i3 = c3455a6.m5707i(i12);
                        AbstractC1665j.m2982b(c3470pM5707i3);
                        c3366m3.add(AbstractC1784a.m3234t(dexKitBridge6, c3470pM5707i3));
                    }
                    return c3366m3;
                } finally {
                }
            case 6:
                DexKitBridge dexKitBridge7 = this.f10429f;
                long jM738c7 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge7.getClass();
                lock = dexKitBridge7.f8837e.readLock();
                lock.lock();
                try {
                    long j11 = dexKitBridge7.f8836d;
                    if (j11 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetInvokeMethods = DexKitBridge.nativeGetInvokeMethods(j11, jM738c7);
                    lock.unlock();
                    ByteBuffer byteBufferWrap7 = ByteBuffer.wrap(bArrNativeGetInvokeMethods);
                    AbstractC1665j.m2984d(byteBufferWrap7, "wrap(res)");
                    C3455a c3455a7 = new C3455a();
                    byteBufferWrap7.order(ByteOrder.LITTLE_ENDIAN);
                    c3455a7.m4686c(byteBufferWrap7.position() + byteBufferWrap7.getInt(byteBufferWrap7.position()), byteBufferWrap7);
                    C3366m c3366m4 = new C3366m(1);
                    int iM5706h4 = c3455a7.m5706h();
                    for (int i13 = 0; i13 < iM5706h4; i13++) {
                        C3470p c3470pM5707i4 = c3455a7.m5707i(i13);
                        AbstractC1665j.m2982b(c3470pM5707i4);
                        c3366m4.add(AbstractC1784a.m3234t(dexKitBridge7, c3470pM5707i4));
                    }
                    return c3366m4;
                } finally {
                }
            case 7:
                DexKitBridge dexKitBridge8 = this.f10429f;
                long jM738c8 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge8.getClass();
                lock = dexKitBridge8.f8837e.readLock();
                lock.lock();
                try {
                    long j12 = dexKitBridge8.f8836d;
                    if (j12 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    int[] iArrNativeGetMethodOpCodes = DexKitBridge.nativeGetMethodOpCodes(j12, jM738c8);
                    lock.unlock();
                    AbstractC1665j.m2985e(iArrNativeGetMethodOpCodes, "<this>");
                    int length = iArrNativeGetMethodOpCodes.length;
                    if (length == 0) {
                        return C0981u.f3047d;
                    }
                    if (length == 1) {
                        return AbstractC2352g.m4211y(Integer.valueOf(iArrNativeGetMethodOpCodes[0]));
                    }
                    ArrayList arrayList4 = new ArrayList(iArrNativeGetMethodOpCodes.length);
                    for (int i14 : iArrNativeGetMethodOpCodes) {
                        arrayList4.add(Integer.valueOf(i14));
                    }
                    return arrayList4;
                } finally {
                }
            case 8:
                DexKitBridge dexKitBridge9 = this.f10429f;
                long jM738c9 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge9.getClass();
                lock = dexKitBridge9.f8837e.readLock();
                lock.lock();
                try {
                    long j13 = dexKitBridge9.f8836d;
                    if (j13 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetParameterAnnotations = DexKitBridge.nativeGetParameterAnnotations(j13, jM738c9);
                    lock.unlock();
                    ByteBuffer byteBufferWrap8 = ByteBuffer.wrap(bArrNativeGetParameterAnnotations);
                    AbstractC1665j.m2984d(byteBufferWrap8, "wrap(res)");
                    C2689a.m4670a();
                    byteBufferWrap8.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferWrap8.position() + byteBufferWrap8.getInt(byteBufferWrap8.position());
                    int i15 = iPosition - byteBufferWrap8.getInt(iPosition);
                    short s5 = byteBufferWrap8.getShort(i15);
                    ArrayList arrayList5 = new ArrayList();
                    short s6 = 4 < s5 ? byteBufferWrap8.getShort(i15 + 4) : (short) 0;
                    if (s6 != 0) {
                        int i16 = s6 + iPosition;
                        i5 = byteBufferWrap8.getInt(byteBufferWrap8.getInt(i16) + i16);
                    } else {
                        i5 = 0;
                    }
                    for (int i17 = 0; i17 < i5; i17++) {
                        C3455a c3455a8 = new C3455a();
                        short s7 = 4 < s5 ? byteBufferWrap8.getShort(i15 + 4) : (short) 0;
                        if (s7 != 0) {
                            int i18 = s7 + iPosition;
                            int i19 = (i17 * 4) + byteBufferWrap8.getInt(i18) + i18 + 4;
                            c3455a8.m4686c(byteBufferWrap8.getInt(i19) + i19, byteBufferWrap8);
                        } else {
                            c3455a8 = null;
                        }
                        AbstractC1665j.m2982b(c3455a8);
                        ArrayList arrayList6 = new ArrayList();
                        int iM4685b4 = c3455a8.m4685b(4);
                        int iM4689f4 = iM4685b4 != 0 ? c3455a8.m4689f(iM4685b4) : 0;
                        for (int i20 = 0; i20 < iM4689f4; i20++) {
                            C3457c c3457cM5705g4 = c3455a8.m5705g(i20);
                            AbstractC1665j.m2982b(c3457cM5705g4);
                            arrayList6.add(AbstractC1925g.m3539p(dexKitBridge9, c3457cM5705g4));
                        }
                        arrayList5.add(arrayList6);
                    }
                    return arrayList5;
                } finally {
                }
            case 9:
                DexKitBridge dexKitBridge10 = this.f10429f;
                long jM738c10 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge10.getClass();
                dexKitBridge10.f8837e.readLock().lock();
                try {
                    long j14 = dexKitBridge10.f8836d;
                    if (j14 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    String[] strArrNativeGetParameterNames = DexKitBridge.nativeGetParameterNames(j14, jM738c10);
                    if (strArrNativeGetParameterNames == null) {
                        return null;
                    }
                    ArrayList arrayList7 = new ArrayList(strArrNativeGetParameterNames.length);
                    for (String str : strArrNativeGetParameterNames) {
                        arrayList7.add(str);
                    }
                    return arrayList7;
                } finally {
                }
            case 10:
                DexKitBridge dexKitBridge11 = this.f10429f;
                long jM738c11 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge11.getClass();
                lock = dexKitBridge11.f8837e.readLock();
                lock.lock();
                try {
                    long j15 = dexKitBridge11.f8836d;
                    if (j15 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodUsingFields = DexKitBridge.nativeGetMethodUsingFields(j15, jM738c11);
                    lock.unlock();
                    ByteBuffer byteBufferWrap9 = ByteBuffer.wrap(bArrNativeGetMethodUsingFields);
                    AbstractC1665j.m2984d(byteBufferWrap9, "wrap(res)");
                    C2689a.m4670a();
                    byteBufferWrap9.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition2 = byteBufferWrap9.position() + byteBufferWrap9.getInt(byteBufferWrap9.position());
                    int i21 = iPosition2 - byteBufferWrap9.getInt(iPosition2);
                    short s8 = byteBufferWrap9.getShort(i21);
                    ArrayList arrayList8 = new ArrayList();
                    short s9 = 4 < s8 ? byteBufferWrap9.getShort(i21 + 4) : (short) 0;
                    if (s9 != 0) {
                        int i22 = s9 + iPosition2;
                        i6 = byteBufferWrap9.getInt(byteBufferWrap9.getInt(i22) + i22);
                    } else {
                        i6 = 0;
                    }
                    for (int i23 = 0; i23 < i6; i23++) {
                        C3455a c3455a9 = new C3455a();
                        short s10 = 4 < s8 ? byteBufferWrap9.getShort(i21 + 4) : (short) 0;
                        C3469o c3469o = null;
                        if (s10 != 0) {
                            int i24 = s10 + iPosition2;
                            int i25 = (i23 * 4) + byteBufferWrap9.getInt(i24) + i24 + 4;
                            c3455a9.m4686c(byteBufferWrap9.getInt(i25) + i25, byteBufferWrap9);
                        } else {
                            c3455a9 = null;
                        }
                        AbstractC1665j.m2982b(c3455a9);
                        C3469o c3469o2 = new C3469o();
                        int iM4685b5 = c3455a9.m4685b(4);
                        if (iM4685b5 != 0) {
                            int iM4684a = c3455a9.m4684a(iM4685b5 + c3455a9.f8591a);
                            ByteBuffer byteBuffer = c3455a9.f8592b;
                            AbstractC1665j.m2984d(byteBuffer, "bb");
                            c3469o2.m4686c(iM4684a, byteBuffer);
                            c3469o = c3469o2;
                        }
                        AbstractC1665j.m2982b(c3469o);
                        C3365l c3365lM1389n = AbstractC0797o.m1389n(dexKitBridge11, c3469o);
                        int iM4685b6 = c3455a9.m4685b(6);
                        byte b2 = iM4685b6 != 0 ? c3455a9.f8592b.get(iM4685b6 + c3455a9.f8591a) : (byte) 0;
                        int i26 = 1;
                        if (b2 != 1) {
                            i26 = 2;
                            if (b2 != 2) {
                                int iM4685b7 = c3455a9.m4685b(6);
                                throw new IllegalArgumentException(AbstractC0231b.m398i("Unknown using type: ", iM4685b7 != 0 ? c3455a9.f8592b.get(iM4685b7 + c3455a9.f8591a) : (byte) 0));
                            }
                        }
                        arrayList8.add(new C3369p(c3365lM1389n, i26));
                    }
                    return arrayList8;
                } finally {
                }
            default:
                DexKitBridge dexKitBridge12 = this.f10429f;
                long jM738c12 = AbstractC0453a.m738c(this.f10430g, this.f10431h);
                dexKitBridge12.getClass();
                lock = dexKitBridge12.f8837e.readLock();
                lock.lock();
                try {
                    long j16 = dexKitBridge12.f8836d;
                    if (j16 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    String[] strArrNativeGetMethodUsingStrings = DexKitBridge.nativeGetMethodUsingStrings(j16, jM738c12);
                    lock.unlock();
                    return AbstractC0972l.m2007e0(strArrNativeGetMethodUsingStrings);
                } finally {
                }
        }
    }
}
