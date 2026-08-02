package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ts */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0747ts extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f10937i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DexKitBridge f10938j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0784us f10939k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f10940l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0747ts(C0784us c0784us, DexKitBridge dexKitBridge, int i) {
        super(0);
        this.f10937i = 3;
        this.f10939k = c0784us;
        this.f10938j = dexKitBridge;
        this.f10940l = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ReentrantReadWriteLock.ReadLock lock;
        int i;
        int i2 = 0;
        int i3 = 1;
        switch (this.f10937i) {
            case 0:
                DexKitBridge dexKitBridge = this.f10938j;
                ArrayList arrayList = this.f10939k.f11461n;
                int i4 = this.f10940l;
                ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC0696sj.m4872f(i4, ((Number) it.next()).intValue())));
                }
                long[] jArrM1149G0 = AbstractC0142du.m1149G0(arrayList2);
                dexKitBridge.getClass();
                lock = dexKitBridge.f7819i.readLock();
                lock.lock();
                try {
                    long j = dexKitBridge.f7818h;
                    if (j == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetFieldByIds = DexKitBridge.nativeGetFieldByIds(j, jArrM1149G0);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldByIds);
                    byteBufferWrap.getClass();
                    jx2.m2594d();
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position());
                    int i5 = iPosition - byteBufferWrap.getInt(iPosition);
                    short s = byteBufferWrap.getShort(i5);
                    ki0 ki0Var = new ki0(i2);
                    short s2 = 4 < s ? byteBufferWrap.getShort(i5 + 4) : (short) 0;
                    if (s2 != 0) {
                        int i6 = s2 + iPosition;
                        i = byteBufferWrap.getInt(byteBufferWrap.getInt(i6) + i6);
                    } else {
                        i = 0;
                    }
                    for (int i7 = 0; i7 < i; i7++) {
                        C0599q c0599q = new C0599q();
                        short s3 = 4 < s ? byteBufferWrap.getShort(i5 + 4) : (short) 0;
                        if (s3 != 0) {
                            int i8 = s3 + iPosition;
                            int i9 = (i7 * 4) + byteBufferWrap.getInt(i8) + i8 + 4;
                            c0599q.m3662c(byteBufferWrap.getInt(i9) + i9, byteBufferWrap);
                        } else {
                            c0599q = null;
                        }
                        c0599q.getClass();
                        ki0Var.add(AbstractC0691se.m4813B(dexKitBridge, c0599q));
                    }
                    return ki0Var;
                } finally {
                }
            case 1:
                DexKitBridge dexKitBridge2 = this.f10938j;
                ArrayList arrayList3 = this.f10939k.f11459l;
                int i10 = this.f10940l;
                ArrayList arrayList4 = new ArrayList(AbstractC0179eu.m1421B(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(AbstractC0696sj.m4872f(i10, ((Number) it2.next()).intValue())));
                }
                return dexKitBridge2.m3629D(AbstractC0142du.m1149G0(arrayList4));
            case 2:
                DexKitBridge dexKitBridge3 = this.f10938j;
                ArrayList arrayList5 = this.f10939k.f11460m;
                int i11 = this.f10940l;
                ArrayList arrayList6 = new ArrayList(AbstractC0179eu.m1421B(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Long.valueOf(AbstractC0696sj.m4872f(i11, ((Number) it3.next()).intValue())));
                }
                long[] jArrM1149G02 = AbstractC0142du.m1149G0(arrayList6);
                dexKitBridge3.getClass();
                lock = dexKitBridge3.f7819i.readLock();
                lock.lock();
                try {
                    long j2 = dexKitBridge3.f7818h;
                    if (j2 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodByIds = DexKitBridge.nativeGetMethodByIds(j2, jArrM1149G02);
                    lock.unlock();
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrNativeGetMethodByIds);
                    byteBufferWrap2.getClass();
                    C0000a c0000a = new C0000a();
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    c0000a.m3662c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                    ki0 ki0Var2 = new ki0(i3);
                    int iM2i = c0000a.m2i();
                    while (i2 < iM2i) {
                        C0638r c0638rM3j = c0000a.m3j(i2);
                        c0638rM3j.getClass();
                        ki0Var2.add(p40.m3737t(dexKitBridge3, c0638rM3j));
                        i2++;
                    }
                    return ki0Var2;
                } finally {
                }
            default:
                Integer num = this.f10939k.f11458k;
                if (num == null) {
                    return null;
                }
                C0858ws c0858wsM3629D = this.f10938j.m3629D(new long[]{AbstractC0696sj.m4872f(this.f10940l, num.intValue())});
                return (C0784us) (c0858wsM3629D.isEmpty() ? null : c0858wsM3629D.first());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0747ts(DexKitBridge dexKitBridge, C0784us c0784us, int i, int i2) {
        super(0);
        this.f10937i = i2;
        this.f10938j = dexKitBridge;
        this.f10939k = c0784us;
        this.f10940l = i;
    }
}
