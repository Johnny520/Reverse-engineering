package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ts extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ DexKitBridge j;
    public final /* synthetic */ us k;
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts(us usVar, DexKitBridge dexKitBridge, int i) {
        super(0);
        this.i = 3;
        this.k = usVar;
        this.j = dexKitBridge;
        this.l = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        ReentrantReadWriteLock.ReadLock lock;
        int i;
        int i2 = 0;
        int i3 = 1;
        switch (this.i) {
            case 0:
                DexKitBridge dexKitBridge = this.j;
                ArrayList arrayList = this.k.n;
                int i4 = this.l;
                ArrayList arrayList2 = new ArrayList(eu.B(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(sj.f(i4, ((Number) it.next()).intValue())));
                }
                long[] jArrG0 = du.G0(arrayList2);
                dexKitBridge.getClass();
                lock = dexKitBridge.i.readLock();
                lock.lock();
                try {
                    long j = dexKitBridge.h;
                    if (j == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetFieldByIds = DexKitBridge.nativeGetFieldByIds(j, jArrG0);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldByIds);
                    byteBufferWrap.getClass();
                    jx2.d();
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
                        q qVar = new q();
                        short s3 = 4 < s ? byteBufferWrap.getShort(i5 + 4) : (short) 0;
                        if (s3 != 0) {
                            int i8 = s3 + iPosition;
                            int i9 = (i7 * 4) + byteBufferWrap.getInt(i8) + i8 + 4;
                            qVar.c(byteBufferWrap.getInt(i9) + i9, byteBufferWrap);
                        } else {
                            qVar = null;
                        }
                        qVar.getClass();
                        ki0Var.add(se.B(dexKitBridge, qVar));
                    }
                    return ki0Var;
                } finally {
                }
            case 1:
                DexKitBridge dexKitBridge2 = this.j;
                ArrayList arrayList3 = this.k.l;
                int i10 = this.l;
                ArrayList arrayList4 = new ArrayList(eu.B(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(sj.f(i10, ((Number) it2.next()).intValue())));
                }
                return dexKitBridge2.D(du.G0(arrayList4));
            case 2:
                DexKitBridge dexKitBridge3 = this.j;
                ArrayList arrayList5 = this.k.m;
                int i11 = this.l;
                ArrayList arrayList6 = new ArrayList(eu.B(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Long.valueOf(sj.f(i11, ((Number) it3.next()).intValue())));
                }
                long[] jArrG02 = du.G0(arrayList6);
                dexKitBridge3.getClass();
                lock = dexKitBridge3.i.readLock();
                lock.lock();
                try {
                    long j2 = dexKitBridge3.h;
                    if (j2 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodByIds = DexKitBridge.nativeGetMethodByIds(j2, jArrG02);
                    lock.unlock();
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrNativeGetMethodByIds);
                    byteBufferWrap2.getClass();
                    a aVar = new a();
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    aVar.c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                    ki0 ki0Var2 = new ki0(i3);
                    int i12 = aVar.i();
                    while (i2 < i12) {
                        r rVarJ = aVar.j(i2);
                        rVarJ.getClass();
                        ki0Var2.add(p40.t(dexKitBridge3, rVarJ));
                        i2++;
                    }
                    return ki0Var2;
                } finally {
                }
            default:
                Integer num = this.k.k;
                if (num == null) {
                    return null;
                }
                ws wsVarD = this.j.D(new long[]{sj.f(this.l, num.intValue())});
                return (us) (wsVarD.isEmpty() ? null : wsVarD.first());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts(DexKitBridge dexKitBridge, us usVar, int i, int i2) {
        super(0);
        this.i = i2;
        this.j = dexKitBridge;
        this.k = usVar;
        this.l = i;
    }
}
