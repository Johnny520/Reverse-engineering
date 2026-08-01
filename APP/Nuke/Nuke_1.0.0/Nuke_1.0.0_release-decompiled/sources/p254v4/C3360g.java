package p254v4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.dartcv.nuke.BuildConfig;
import org.luckypray.dexkit.DexKitBridge;
import p032F3.AbstractC0453a;
import p049I2.AbstractC0797o;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p127Z2.AbstractC1784a;
import p206n2.C2689a;
import p265x4.C3455a;
import p265x4.C3469o;
import p265x4.C3470p;

/* JADX INFO: renamed from: v4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3360g extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f10432e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DexKitBridge f10433f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3362i f10434g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10435h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3360g(DexKitBridge dexKitBridge, C3362i c3362i, int i5, int i6) {
        super(0);
        this.f10432e = i6;
        this.f10433f = dexKitBridge;
        this.f10434g = c3362i;
        this.f10435h = i5;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ReentrantReadWriteLock.ReadLock lock;
        int i5;
        int i6 = 0;
        int i7 = 1;
        switch (this.f10432e) {
            case 0:
                DexKitBridge dexKitBridge = this.f10433f;
                ArrayList arrayList = this.f10434g.f10442j;
                int i8 = this.f10435h;
                ArrayList arrayList2 = new ArrayList(AbstractC0974n.m2029K(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC0453a.m738c(i8, ((Number) it.next()).intValue())));
                }
                long[] jArrM2025f0 = AbstractC0973m.m2025f0(arrayList2);
                dexKitBridge.getClass();
                lock = dexKitBridge.f8837e.readLock();
                lock.lock();
                try {
                    long j5 = dexKitBridge.f8836d;
                    if (j5 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetFieldByIds = DexKitBridge.nativeGetFieldByIds(j5, jArrM2025f0);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldByIds);
                    AbstractC1665j.m2984d(byteBufferWrap, "wrap(res)");
                    C2689a.m4670a();
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position());
                    int i9 = iPosition - byteBufferWrap.getInt(iPosition);
                    short s5 = byteBufferWrap.getShort(i9);
                    C3366m c3366m = new C3366m(i6);
                    short s6 = 4 < s5 ? byteBufferWrap.getShort(i9 + 4) : (short) 0;
                    if (s6 != 0) {
                        int i10 = s6 + iPosition;
                        i5 = byteBufferWrap.getInt(byteBufferWrap.getInt(i10) + i10);
                    } else {
                        i5 = 0;
                    }
                    for (int i11 = 0; i11 < i5; i11++) {
                        C3469o c3469o = new C3469o();
                        short s7 = 4 < s5 ? byteBufferWrap.getShort(i9 + 4) : (short) 0;
                        if (s7 != 0) {
                            int i12 = s7 + iPosition;
                            int i13 = (i11 * 4) + byteBufferWrap.getInt(i12) + i12 + 4;
                            c3469o.m4686c(byteBufferWrap.getInt(i13) + i13, byteBufferWrap);
                        } else {
                            c3469o = null;
                        }
                        AbstractC1665j.m2982b(c3469o);
                        c3366m.add(AbstractC0797o.m1389n(dexKitBridge, c3469o));
                    }
                    return c3366m;
                } finally {
                }
            case BuildConfig.VERSION_CODE /* 1 */:
                DexKitBridge dexKitBridge2 = this.f10433f;
                ArrayList arrayList3 = this.f10434g.f10440h;
                int i14 = this.f10435h;
                ArrayList arrayList4 = new ArrayList(AbstractC0974n.m2029K(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(AbstractC0453a.m738c(i14, ((Number) it2.next()).intValue())));
                }
                return dexKitBridge2.m5006D(AbstractC0973m.m2025f0(arrayList4));
            case 2:
                DexKitBridge dexKitBridge3 = this.f10433f;
                ArrayList arrayList5 = this.f10434g.f10441i;
                int i15 = this.f10435h;
                ArrayList arrayList6 = new ArrayList(AbstractC0974n.m2029K(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Long.valueOf(AbstractC0453a.m738c(i15, ((Number) it3.next()).intValue())));
                }
                long[] jArrM2025f02 = AbstractC0973m.m2025f0(arrayList6);
                dexKitBridge3.getClass();
                lock = dexKitBridge3.f8837e.readLock();
                lock.lock();
                try {
                    long j6 = dexKitBridge3.f8836d;
                    if (j6 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodByIds = DexKitBridge.nativeGetMethodByIds(j6, jArrM2025f02);
                    lock.unlock();
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrNativeGetMethodByIds);
                    AbstractC1665j.m2984d(byteBufferWrap2, "wrap(res)");
                    C3455a c3455a = new C3455a();
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    c3455a.m4686c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                    C3366m c3366m2 = new C3366m(i7);
                    int iM5706h = c3455a.m5706h();
                    while (i6 < iM5706h) {
                        C3470p c3470pM5707i = c3455a.m5707i(i6);
                        AbstractC1665j.m2982b(c3470pM5707i);
                        c3366m2.add(AbstractC1784a.m3234t(dexKitBridge3, c3470pM5707i));
                        i6++;
                    }
                    return c3366m2;
                } finally {
                }
            default:
                Integer num = this.f10434g.f10439g;
                if (num == null) {
                    return null;
                }
                C3363j c3363jM5006D = this.f10433f.m5006D(new long[]{AbstractC0453a.m738c(this.f10435h, num.intValue())});
                return (C3362i) (c3363jM5006D.isEmpty() ? null : c3363jM5006D.first());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3360g(C3362i c3362i, DexKitBridge dexKitBridge, int i5) {
        super(0);
        this.f10432e = 3;
        this.f10434g = c3362i;
        this.f10433f = dexKitBridge;
        this.f10435h = i5;
    }
}
