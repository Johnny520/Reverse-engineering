package p000a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;
import p000a.C0690lb;
import p000a.C0799r6;

/* JADX INFO: renamed from: a.c3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0511c3 extends AbstractC0859u9 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DexKitBridge f1859c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0492b3 f1860d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1861e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0511c3(C0492b3 c0492b3, DexKitBridge dexKitBridge, int i) {
        super(0);
        this.f1858b = 3;
        this.f1860d = c0492b3;
        this.f1859c = dexKitBridge;
        this.f1861e = i;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        ReentrantReadWriteLock.ReadLock lock;
        int i = 0;
        switch (this.f1858b) {
            case 0:
                ArrayList arrayList = this.f1860d.f1831g;
                ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(AbstractC0417X1.m1061a(this.f1861e, ((Number) it.next()).intValue())));
                }
                long[] jArrM1960x0 = C0834t3.m1960x0(arrayList2);
                DexKitBridge dexKitBridge = this.f1859c;
                dexKitBridge.getClass();
                lock = dexKitBridge.f6031b.readLock();
                lock.lock();
                try {
                    long j = dexKitBridge.f6030a;
                    if (j == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetFieldByIds = DexKitBridge.nativeGetFieldByIds(j, jArrM1960x0);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetFieldByIds);
                    C0631i9.m1481d(byteBufferWrap, "wrap(res)");
                    C0469a c0469a = new C0469a();
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                    C0818s6 c0818s6 = new C0818s6();
                    int iM780b = c0469a.m780b(4);
                    int iM784f = iM780b != 0 ? c0469a.m784f(iM780b) : 0;
                    while (i < iM784f) {
                        C0735o c0735oM1142i = c0469a.m1142i(i);
                        C0631i9.m1479b(c0735oM1142i);
                        c0818s6.add(C0799r6.a.m1858a(dexKitBridge, c0735oM1142i));
                        i++;
                    }
                    return c0818s6;
                } finally {
                }
            case 1:
                ArrayList arrayList3 = this.f1860d.f1829e;
                ArrayList arrayList4 = new ArrayList(C0758p3.m1800g0(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(AbstractC0417X1.m1061a(this.f1861e, ((Number) it2.next()).intValue())));
                }
                return this.f1859c.m3326r(C0834t3.m1960x0(arrayList4));
            case 2:
                ArrayList arrayList5 = this.f1860d.f1830f;
                ArrayList arrayList6 = new ArrayList(C0758p3.m1800g0(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Long.valueOf(AbstractC0417X1.m1061a(this.f1861e, ((Number) it3.next()).intValue())));
                }
                long[] jArrM1960x02 = C0834t3.m1960x0(arrayList6);
                DexKitBridge dexKitBridge2 = this.f1859c;
                dexKitBridge2.getClass();
                lock = dexKitBridge2.f6031b.readLock();
                lock.lock();
                try {
                    long j2 = dexKitBridge2.f6030a;
                    if (j2 == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeGetMethodByIds = DexKitBridge.nativeGetMethodByIds(j2, jArrM1960x02);
                    lock.unlock();
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrNativeGetMethodByIds);
                    C0631i9.m1481d(byteBufferWrap2, "wrap(res)");
                    C0469a c0469a2 = new C0469a();
                    byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a2.m781c(byteBufferWrap2.position() + byteBufferWrap2.getInt(byteBufferWrap2.position()), byteBufferWrap2);
                    C0747ob c0747ob = new C0747ob();
                    int iM1143j = c0469a2.m1143j();
                    while (i < iM1143j) {
                        C0754p c0754pM1144k = c0469a2.m1144k(i);
                        C0631i9.m1479b(c0754pM1144k);
                        c0747ob.add(C0690lb.a.m1552a(dexKitBridge2, c0754pM1144k));
                        i++;
                    }
                    return c0747ob;
                } finally {
                }
            default:
                Integer num = this.f1860d.f1828d;
                if (num == null) {
                    return null;
                }
                C0530d3 c0530d3M3326r = this.f1859c.m3326r(new long[]{AbstractC0417X1.m1061a(this.f1861e, num.intValue())});
                return c0530d3M3326r.isEmpty() ? null : c0530d3M3326r.m1090a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0511c3(DexKitBridge dexKitBridge, C0492b3 c0492b3, int i, int i2) {
        super(0);
        this.f1858b = i2;
        this.f1859c = dexKitBridge;
        this.f1860d = c0492b3;
        this.f1861e = i;
    }
}
