package p000a;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;
import p000a.C0799r6;

/* JADX INFO: renamed from: a.o5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0741o5 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2926a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DexKitBridge f2927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2928c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Serializable f2929d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0741o5(DexKitBridge dexKitBridge, String str, String str2) {
        this.f2927b = dexKitBridge;
        this.f2928c = str;
        this.f2929d = str2;
    }

    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        switch (this.f2926a) {
            case 0:
                C0951z6 c0951z6 = new C0951z6(0);
                C0837t6 c0837t6 = new C0837t6();
                String str = this.f2928c;
                if (str != null) {
                    C0549e3 c0549e3 = new C0549e3();
                    c0549e3.m1324h(str, 5, false);
                    c0837t6.f3308a = c0549e3;
                }
                String str2 = (String) this.f2929d;
                if (str2 != null) {
                    C0549e3 c0549e32 = new C0549e3();
                    c0549e32.m1324h(str2, 5, false);
                    c0837t6.f3309b = c0549e32;
                }
                c0951z6.f3564b = c0837t6;
                DexKitBridge dexKitBridge = this.f2927b;
                dexKitBridge.getClass();
                byte[] bArrM1115g = c0951z6.m1115g();
                ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f6031b.readLock();
                lock.lock();
                try {
                    long j = dexKitBridge.f6030a;
                    if (j == 0) {
                        throw new IllegalStateException("DexKitBridge is not valid");
                    }
                    byte[] bArrNativeFindField = DexKitBridge.nativeFindField(j, bArrM1115g);
                    lock.unlock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindField);
                    C0631i9.m1481d(byteBufferWrap, "wrap(res)");
                    C0469a c0469a = new C0469a();
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
                    C0818s6 c0818s6 = new C0818s6();
                    int iM780b = c0469a.m780b(4);
                    int iM784f = iM780b != 0 ? c0469a.m784f(iM780b) : 0;
                    for (int i = 0; i < iM784f; i++) {
                        C0735o c0735oM1142i = c0469a.m1142i(i);
                        C0631i9.m1479b(c0735oM1142i);
                        c0818s6.add(C0799r6.a.m1858a(dexKitBridge, c0735oM1142i));
                    }
                    if (c0818s6.size() > 1) {
                        C0815s3.m1888j0(c0818s6, new C0456Z4(1));
                    }
                    return c0818s6;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            default:
                C0932y6 c0932y6 = new C0932y6();
                String[] strArr = (String[]) C0238N1.m633g0((String[]) this.f2929d).toArray(new String[0]);
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                C0631i9.m1482e(strArr2, "searchPackages");
                c0932y6.f3542a = C0238N1.m633g0(strArr2);
                C0549e3 c0549e33 = new C0549e3();
                C0549e3.m1322g(c0549e33, this.f2928c);
                c0932y6.f3543b = c0549e33;
                return this.f2927b.m3324p(c0932y6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0741o5(DexKitBridge dexKitBridge, String[] strArr, String str) {
        this.f2927b = dexKitBridge;
        this.f2929d = strArr;
        this.f2928c = str;
    }
}
