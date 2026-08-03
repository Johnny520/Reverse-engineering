package p000a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;
import p000a.C0690lb;
import p000a.C0799r6;
import p000a.C0907x0;

/* JADX INFO: renamed from: a.mb */
/* JADX INFO: loaded from: classes.dex */
public final class C0709mb extends AbstractC0859u9 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DexKitBridge f2676c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0417X1 f2677d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2678e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0709mb(DexKitBridge dexKitBridge, AbstractC0417X1 abstractC0417X1, int i, int i2, int i3) {
        super(0);
        this.f2675b = i3;
        this.f2676c = dexKitBridge;
        this.f2677d = abstractC0417X1;
        this.f2678e = i;
        this.f2679f = i2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: org.luckypray.dexkit.DexKitBridge.e(long, long):byte[] */
    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        ReentrantReadWriteLock.ReadLock lock;
        EnumC0856u6 enumC0856u6;
        switch (this.f2675b) {
            case 0:
                int i = this.f2678e;
                int i2 = this.f2679f;
                ((C0690lb) this.f2677d).getClass();
                long jM1061a = AbstractC0417X1.m1061a(i, i2);
                DexKitBridge dexKitBridge = this.f2676c;
                dexKitBridge.getClass();
                lock = dexKitBridge.f6031b.readLock();
                lock.lock();
                try {
                    long j = dexKitBridge.f6030a;
                    if (j == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodAnnotations = DexKitBridge.nativeGetMethodAnnotations(j, jM1061a);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetMethodAnnotations);
                    C0631i9.m1481d(byteBufferWrap, "wrap(res)");
                    C0469a c0469a = new C0469a();
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                    ArrayList arrayList = new ArrayList();
                    int iM780b = c0469a.m780b(4);
                    int iM784f = iM780b != 0 ? c0469a.m784f(iM780b) : 0;
                    for (int i3 = 0; i3 < iM784f; i3++) {
                        C0507c c0507cM1140g = c0469a.m1140g(i3);
                        C0631i9.m1479b(c0507cM1140g);
                        arrayList.add(C0907x0.a.m2192a(dexKitBridge, c0507cM1140g));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                int i4 = this.f2678e;
                int i5 = this.f2679f;
                ((C0690lb) this.f2677d).getClass();
                long jM1061a2 = AbstractC0417X1.m1061a(i4, i5);
                DexKitBridge dexKitBridge2 = this.f2676c;
                dexKitBridge2.getClass();
                lock = dexKitBridge2.f6031b.readLock();
                lock.lock();
                try {
                    long j2 = dexKitBridge2.f6030a;
                    if (j2 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetCallMethods = DexKitBridge.nativeGetCallMethods(j2, jM1061a2);
                    lock.unlock();
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrNativeGetCallMethods);
                    C0631i9.m1481d(byteBufferWrap2, "wrap(res)");
                    C0469a c0469a2 = new C0469a();
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a2.m781c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                    C0747ob c0747ob = new C0747ob();
                    int iM1143j = c0469a2.m1143j();
                    for (int i6 = 0; i6 < iM1143j; i6++) {
                        C0754p c0754pM1144k = c0469a2.m1144k(i6);
                        C0631i9.m1479b(c0754pM1144k);
                        c0747ob.add(C0690lb.a.m1552a(dexKitBridge2, c0754pM1144k));
                    }
                    return c0747ob;
                } finally {
                }
            case 2:
                int i7 = this.f2678e;
                int i8 = this.f2679f;
                ((C0690lb) this.f2677d).getClass();
                long jM1061a3 = AbstractC0417X1.m1061a(i7, i8);
                DexKitBridge dexKitBridge3 = this.f2676c;
                dexKitBridge3.getClass();
                lock = dexKitBridge3.f6031b.readLock();
                lock.lock();
                try {
                    long j3 = dexKitBridge3.f6030a;
                    if (j3 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetInvokeMethods = DexKitBridge.nativeGetInvokeMethods(j3, jM1061a3);
                    lock.unlock();
                    ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArrNativeGetInvokeMethods);
                    C0631i9.m1481d(byteBufferWrap3, "wrap(res)");
                    C0469a c0469a3 = new C0469a();
                    byteBufferWrap3.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a3.m781c(byteBufferWrap3.position() + byteBufferWrap3.getInt(byteBufferWrap3.position()), byteBufferWrap3);
                    C0747ob c0747ob2 = new C0747ob();
                    int iM1143j2 = c0469a3.m1143j();
                    for (int i9 = 0; i9 < iM1143j2; i9++) {
                        C0754p c0754pM1144k2 = c0469a3.m1144k(i9);
                        C0631i9.m1479b(c0754pM1144k2);
                        c0747ob2.add(C0690lb.a.m1552a(dexKitBridge3, c0754pM1144k2));
                    }
                    return c0747ob2;
                } finally {
                }
            case 3:
                int i10 = this.f2678e;
                int i11 = this.f2679f;
                ((C0690lb) this.f2677d).getClass();
                long jM1061a4 = AbstractC0417X1.m1061a(i10, i11);
                DexKitBridge dexKitBridge4 = this.f2676c;
                dexKitBridge4.getClass();
                lock = dexKitBridge4.f6031b.readLock();
                lock.lock();
                try {
                    long j4 = dexKitBridge4.f6030a;
                    if (j4 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    int[] iArrNativeGetMethodOpCodes = DexKitBridge.nativeGetMethodOpCodes(j4, jM1061a4);
                    lock.unlock();
                    C0631i9.m1482e(iArrNativeGetMethodOpCodes, "<this>");
                    int length = iArrNativeGetMethodOpCodes.length;
                    if (length == 0) {
                        return C0439Y5.f1645a;
                    }
                    if (length == 1) {
                        return C0889w1.m2124K(Integer.valueOf(iArrNativeGetMethodOpCodes[0]));
                    }
                    ArrayList arrayList2 = new ArrayList(iArrNativeGetMethodOpCodes.length);
                    for (int i12 : iArrNativeGetMethodOpCodes) {
                        arrayList2.add(Integer.valueOf(i12));
                    }
                    return arrayList2;
                } finally {
                }
            case 4:
                int i13 = this.f2678e;
                int i14 = this.f2679f;
                ((C0690lb) this.f2677d).getClass();
                long jM1061a5 = AbstractC0417X1.m1061a(i13, i14);
                DexKitBridge dexKitBridge5 = this.f2676c;
                dexKitBridge5.getClass();
                lock = dexKitBridge5.f6031b.readLock();
                lock.lock();
                try {
                    long j5 = dexKitBridge5.f6030a;
                    if (j5 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetParameterAnnotations = DexKitBridge.nativeGetParameterAnnotations(j5, jM1061a5);
                    lock.unlock();
                    ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(bArrNativeGetParameterAnnotations);
                    C0631i9.m1481d(byteBufferWrap4, "wrap(res)");
                    C0469a c0469a4 = new C0469a();
                    byteBufferWrap4.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a4.m781c(byteBufferWrap4.position() + byteBufferWrap4.getInt(byteBufferWrap4.position()), byteBufferWrap4);
                    ArrayList arrayList3 = new ArrayList();
                    int iM780b2 = c0469a4.m780b(4);
                    int iM784f2 = iM780b2 != 0 ? c0469a4.m784f(iM780b2) : 0;
                    for (int i15 = 0; i15 < iM784f2; i15++) {
                        C0469a c0469a5 = new C0469a();
                        int iM780b3 = c0469a4.m780b(4);
                        if (iM780b3 != 0) {
                            int iM779a = c0469a4.m779a((i15 * 4) + c0469a4.m783e(iM780b3));
                            ByteBuffer byteBuffer = c0469a4.f981b;
                            C0631i9.m1481d(byteBuffer, "bb");
                            c0469a5.m781c(iM779a, byteBuffer);
                        } else {
                            c0469a5 = null;
                        }
                        C0631i9.m1479b(c0469a5);
                        ArrayList arrayList4 = new ArrayList();
                        int iM780b4 = c0469a5.m780b(4);
                        int iM784f3 = iM780b4 != 0 ? c0469a5.m784f(iM780b4) : 0;
                        for (int i16 = 0; i16 < iM784f3; i16++) {
                            C0507c c0507cM1140g2 = c0469a5.m1140g(i16);
                            C0631i9.m1479b(c0507cM1140g2);
                            arrayList4.add(C0907x0.a.m2192a(dexKitBridge5, c0507cM1140g2));
                        }
                        arrayList3.add(arrayList4);
                    }
                    return arrayList3;
                } finally {
                }
            case 5:
                int i17 = this.f2678e;
                int i18 = this.f2679f;
                ((C0690lb) this.f2677d).getClass();
                long jM1061a6 = AbstractC0417X1.m1061a(i17, i18);
                DexKitBridge dexKitBridge6 = this.f2676c;
                dexKitBridge6.getClass();
                dexKitBridge6.f6031b.readLock().lock();
                try {
                    long j6 = dexKitBridge6.f6030a;
                    if (j6 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    String[] strArrNativeGetParameterNames = DexKitBridge.nativeGetParameterNames(j6, jM1061a6);
                    if (strArrNativeGetParameterNames == null) {
                        return null;
                    }
                    ArrayList arrayList5 = new ArrayList(strArrNativeGetParameterNames.length);
                    for (String str : strArrNativeGetParameterNames) {
                        arrayList5.add(str);
                    }
                    return arrayList5;
                } finally {
                }
            case 6:
                int i19 = this.f2678e;
                int i20 = this.f2679f;
                ((C0690lb) this.f2677d).getClass();
                long jM1061a7 = AbstractC0417X1.m1061a(i19, i20);
                DexKitBridge dexKitBridge7 = this.f2676c;
                dexKitBridge7.getClass();
                lock = dexKitBridge7.f6031b.readLock();
                lock.lock();
                try {
                    long j7 = dexKitBridge7.f6030a;
                    if (j7 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodUsingFields = DexKitBridge.nativeGetMethodUsingFields(j7, jM1061a7);
                    lock.unlock();
                    ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(bArrNativeGetMethodUsingFields);
                    C0631i9.m1481d(byteBufferWrap5, "wrap(res)");
                    C0469a c0469a6 = new C0469a();
                    byteBufferWrap5.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a6.m781c(byteBufferWrap5.position() + byteBufferWrap5.getInt(byteBufferWrap5.position()), byteBufferWrap5);
                    ArrayList arrayList6 = new ArrayList();
                    int iM780b5 = c0469a6.m780b(4);
                    int iM784f4 = iM780b5 != 0 ? c0469a6.m784f(iM780b5) : 0;
                    for (int i21 = 0; i21 < iM784f4; i21++) {
                        C0469a c0469a7 = new C0469a();
                        int iM780b6 = c0469a6.m780b(4);
                        C0735o c0735o = null;
                        if (iM780b6 != 0) {
                            int iM779a2 = c0469a6.m779a((i21 * 4) + c0469a6.m783e(iM780b6));
                            ByteBuffer byteBuffer2 = c0469a6.f981b;
                            C0631i9.m1481d(byteBuffer2, "bb");
                            c0469a7.m781c(iM779a2, byteBuffer2);
                        } else {
                            c0469a7 = null;
                        }
                        C0631i9.m1479b(c0469a7);
                        C0735o c0735o2 = new C0735o();
                        int iM780b7 = c0469a7.m780b(4);
                        if (iM780b7 != 0) {
                            int iM779a3 = c0469a7.m779a(iM780b7 + c0469a7.f980a);
                            ByteBuffer byteBuffer3 = c0469a7.f981b;
                            C0631i9.m1481d(byteBuffer3, "bb");
                            c0735o2.m781c(iM779a3, byteBuffer3);
                            c0735o = c0735o2;
                        }
                        C0631i9.m1479b(c0735o);
                        C0799r6 c0799r6M1858a = C0799r6.a.m1858a(dexKitBridge7, c0735o);
                        int iM780b8 = c0469a7.m780b(6);
                        byte b = iM780b8 != 0 ? c0469a7.f981b.get(iM780b8 + c0469a7.f980a) : (byte) 0;
                        if (b == 1) {
                            enumC0856u6 = EnumC0856u6.f3361a;
                        } else {
                            if (b != 2) {
                                int iM780b9 = c0469a7.m780b(6);
                                throw new IllegalArgumentException(C0944z.m2225e("Unknown using type: ", iM780b9 != 0 ? c0469a7.f981b.get(iM780b9 + c0469a7.f980a) : (byte) 0));
                            }
                            enumC0856u6 = EnumC0856u6.f3362b;
                        }
                        arrayList6.add(new C0449Yf(c0799r6M1858a, enumC0856u6));
                    }
                    return arrayList6;
                } finally {
                }
            case 7:
                int i22 = this.f2678e;
                int i23 = this.f2679f;
                ((C0690lb) this.f2677d).getClass();
                long jM1061a8 = AbstractC0417X1.m1061a(i22, i23);
                DexKitBridge dexKitBridge8 = this.f2676c;
                dexKitBridge8.getClass();
                lock = dexKitBridge8.f6031b.readLock();
                lock.lock();
                try {
                    long j8 = dexKitBridge8.f6030a;
                    if (j8 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    String[] strArrNativeGetMethodUsingStrings = DexKitBridge.nativeGetMethodUsingStrings(j8, jM1061a8);
                    lock.unlock();
                    return C0238N1.m633g0(strArrNativeGetMethodUsingStrings);
                } finally {
                }
            default:
                int i24 = this.f2678e;
                int i25 = this.f2679f;
                ((C0492b3) this.f2677d).getClass();
                long jM1061a9 = AbstractC0417X1.m1061a(i24, i25);
                DexKitBridge dexKitBridge9 = this.f2676c;
                dexKitBridge9.getClass();
                lock = dexKitBridge9.f6031b.readLock();
                lock.lock();
                try {
                    long j9 = dexKitBridge9.f6030a;
                    if (j9 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetClassAnnotations = DexKitBridge.nativeGetClassAnnotations(j9, jM1061a9);
                    lock.unlock();
                    ByteBuffer byteBufferWrap6 = ByteBuffer.wrap(bArrNativeGetClassAnnotations);
                    C0631i9.m1481d(byteBufferWrap6, "wrap(res)");
                    C0469a c0469a8 = new C0469a();
                    byteBufferWrap6.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a8.m781c(byteBufferWrap6.position() + byteBufferWrap6.getInt(byteBufferWrap6.position()), byteBufferWrap6);
                    ArrayList arrayList7 = new ArrayList();
                    int iM780b10 = c0469a8.m780b(4);
                    int iM784f5 = iM780b10 != 0 ? c0469a8.m784f(iM780b10) : 0;
                    for (int i26 = 0; i26 < iM784f5; i26++) {
                        C0507c c0507cM1140g3 = c0469a8.m1140g(i26);
                        C0631i9.m1479b(c0507cM1140g3);
                        arrayList7.add(C0907x0.a.m2192a(dexKitBridge9, c0507cM1140g3));
                    }
                    return arrayList7;
                } finally {
                }
        }
    }
}
