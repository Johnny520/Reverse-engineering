package p386;

import com.google.android.material.datepicker.RunnableC3976;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C6573;
import org.luckypray.dexkit.DexKitBridge;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9790 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7372 f25507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7372 f25508;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7372 f25509;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ScheduledThreadPoolExecutor f25510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6573 f25511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25512;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public volatile DexKitBridge f25513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ScheduledFuture f25514;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AtomicBoolean f25515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7372 f25516;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long f25517;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f25518;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object f25519;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f25520;

    public C9790(String str, C6573 c6573, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722, InterfaceC7372 interfaceC73723, InterfaceC7372 interfaceC73724, InterfaceC7372 interfaceC73725) {
        str.getClass();
        c6573.getClass();
        scheduledThreadPoolExecutor.getClass();
        interfaceC7372.getClass();
        this.f25512 = str;
        this.f25511 = c6573;
        this.f25510 = scheduledThreadPoolExecutor;
        this.f25509 = interfaceC7372;
        this.f25508 = interfaceC73722;
        this.f25507 = interfaceC73723;
        this.f25516 = interfaceC73724;
        this.f25515 = new AtomicBoolean(false);
        this.f25519 = new Object();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m15132(C9790 c9790) {
        boolean zM15134;
        synchronized (c9790.f25519) {
            try {
                int i = c9790.f25520;
                if (i <= 0) {
                    throw new IllegalStateException("activeCalls underflow");
                }
                int i2 = i - 1;
                c9790.f25520 = i2;
                if (i2 != 0) {
                    return;
                }
                if (c9790.f25515.get()) {
                    zM15134 = c9790.m15134();
                } else if (c9790.f25518) {
                    c9790.f25518 = false;
                    zM15134 = c9790.m15134();
                    c9790.m15135();
                } else {
                    c9790.f25514 = c9790.f25510.schedule(new RunnableC3976(c9790, c9790.f25517, 1), ((Number) c9790.f25509.invoke()).longValue(), TimeUnit.MILLISECONDS);
                    zM15134 = false;
                }
                if (zM15134) {
                    c9790.f25516.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m15133(C9790 c9790) {
        synchronized (c9790.f25519) {
            try {
                if (c9790.f25515.get()) {
                    throw new IllegalStateException("RecyclableBridge is destroyed");
                }
                c9790.f25517++;
                ScheduledFuture scheduledFuture = c9790.f25514;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                c9790.f25514 = null;
                c9790.f25520++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m15134() {
        DexKitBridge dexKitBridge = this.f25513;
        if (dexKitBridge == null) {
            return false;
        }
        dexKitBridge.close();
        this.f25513 = null;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m15135() {
        boolean z = this.f25515.get();
        C6573 c6573 = this.f25511;
        String str = this.f25512;
        if (z) {
            ConcurrentHashMap concurrentHashMap = AbstractC9791.f25523;
            str.getClass();
            c6573.getClass();
            AbstractC9791.f25523.remove(str, c6573);
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = AbstractC9791.f25523;
        str.getClass();
        c6573.getClass();
        AbstractC9791.f25523.remove(str, c6573);
        AbstractC9791.m15136(str, c6573);
    }
}
