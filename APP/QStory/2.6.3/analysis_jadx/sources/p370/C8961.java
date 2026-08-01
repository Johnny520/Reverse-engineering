package p370;

import com.google.android.material.datepicker.RunnableC3144;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C5743;
import org.luckypray.dexkit.DexKitBridge;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6543 f25162;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6543 f25163;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6543 f25164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ScheduledThreadPoolExecutor f25165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5743 f25166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25167;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public volatile DexKitBridge f25168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ScheduledFuture f25169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AtomicBoolean f25170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6543 f25171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long f25172;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f25173;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object f25174;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f25175;

    public C8961(String str, C5743 c5743, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InterfaceC6543 interfaceC6543, InterfaceC6543 interfaceC65432, InterfaceC6543 interfaceC65433, InterfaceC6543 interfaceC65434, InterfaceC6543 interfaceC65435) {
        str.getClass();
        c5743.getClass();
        scheduledThreadPoolExecutor.getClass();
        interfaceC6543.getClass();
        this.f25167 = str;
        this.f25166 = c5743;
        this.f25165 = scheduledThreadPoolExecutor;
        this.f25164 = interfaceC6543;
        this.f25163 = interfaceC65432;
        this.f25162 = interfaceC65433;
        this.f25171 = interfaceC65434;
        this.f25170 = new AtomicBoolean(false);
        this.f25174 = new Object();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m14573(C8961 c8961) {
        boolean zM14575;
        synchronized (c8961.f25174) {
            try {
                int i = c8961.f25175;
                if (i <= 0) {
                    throw new IllegalStateException("activeCalls underflow");
                }
                int i2 = i - 1;
                c8961.f25175 = i2;
                if (i2 != 0) {
                    return;
                }
                if (c8961.f25170.get()) {
                    zM14575 = c8961.m14575();
                } else if (c8961.f25173) {
                    c8961.f25173 = false;
                    zM14575 = c8961.m14575();
                    c8961.m14576();
                } else {
                    c8961.f25169 = c8961.f25165.schedule(new RunnableC3144(c8961, c8961.f25172, 1), ((Number) c8961.f25164.invoke()).longValue(), TimeUnit.MILLISECONDS);
                    zM14575 = false;
                }
                if (zM14575) {
                    c8961.f25171.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14574(C8961 c8961) {
        synchronized (c8961.f25174) {
            try {
                if (c8961.f25170.get()) {
                    throw new IllegalStateException("RecyclableBridge is destroyed");
                }
                c8961.f25172++;
                ScheduledFuture scheduledFuture = c8961.f25169;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                c8961.f25169 = null;
                c8961.f25175++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m14575() {
        DexKitBridge dexKitBridge = this.f25168;
        if (dexKitBridge == null) {
            return false;
        }
        dexKitBridge.close();
        this.f25168 = null;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14576() {
        boolean z = this.f25170.get();
        C5743 c5743 = this.f25166;
        String str = this.f25167;
        if (z) {
            ConcurrentHashMap concurrentHashMap = AbstractC8962.f25178;
            str.getClass();
            c5743.getClass();
            AbstractC8962.f25178.remove(str, c5743);
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = AbstractC8962.f25178;
        str.getClass();
        c5743.getClass();
        AbstractC8962.f25178.remove(str, c5743);
        AbstractC8962.m14577(str, c5743);
    }
}
