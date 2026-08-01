package p367;

import com.google.android.material.datepicker.RunnableC3143;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C5742;
import org.luckypray.dexkit.DexKitBridge;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6542 f25161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6542 f25162;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6542 f25163;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ScheduledThreadPoolExecutor f25164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5742 f25165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25166;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public volatile DexKitBridge f25167;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ScheduledFuture f25168;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AtomicBoolean f25169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6542 f25170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public long f25171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f25172;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object f25173;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f25174;

    public C8952(String str, C5742 c5742, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InterfaceC6542 interfaceC6542, InterfaceC6542 interfaceC65422, InterfaceC6542 interfaceC65423, InterfaceC6542 interfaceC65424, InterfaceC6542 interfaceC65425) {
        str.getClass();
        c5742.getClass();
        scheduledThreadPoolExecutor.getClass();
        interfaceC6542.getClass();
        this.f25166 = str;
        this.f25165 = c5742;
        this.f25164 = scheduledThreadPoolExecutor;
        this.f25163 = interfaceC6542;
        this.f25162 = interfaceC65422;
        this.f25161 = interfaceC65423;
        this.f25170 = interfaceC65424;
        this.f25169 = new AtomicBoolean(false);
        this.f25173 = new Object();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m14541(C8952 c8952) {
        boolean zM14543;
        synchronized (c8952.f25173) {
            try {
                int i = c8952.f25174;
                if (i <= 0) {
                    throw new IllegalStateException("activeCalls underflow");
                }
                int i2 = i - 1;
                c8952.f25174 = i2;
                if (i2 != 0) {
                    return;
                }
                if (c8952.f25169.get()) {
                    zM14543 = c8952.m14543();
                } else if (c8952.f25172) {
                    c8952.f25172 = false;
                    zM14543 = c8952.m14543();
                    c8952.m14544();
                } else {
                    c8952.f25168 = c8952.f25164.schedule(new RunnableC3143(c8952, c8952.f25171, 1), ((Number) c8952.f25163.invoke()).longValue(), TimeUnit.MILLISECONDS);
                    zM14543 = false;
                }
                if (zM14543) {
                    c8952.f25170.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14542(C8952 c8952) {
        synchronized (c8952.f25173) {
            try {
                if (c8952.f25169.get()) {
                    throw new IllegalStateException("RecyclableBridge is destroyed");
                }
                c8952.f25171++;
                ScheduledFuture scheduledFuture = c8952.f25168;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                c8952.f25168 = null;
                c8952.f25174++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m14543() {
        DexKitBridge dexKitBridge = this.f25167;
        if (dexKitBridge == null) {
            return false;
        }
        dexKitBridge.close();
        this.f25167 = null;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14544() {
        boolean z = this.f25169.get();
        C5742 c5742 = this.f25165;
        String str = this.f25166;
        if (z) {
            ConcurrentHashMap concurrentHashMap = AbstractC8953.f25177;
            str.getClass();
            c5742.getClass();
            AbstractC8953.f25177.remove(str, c5742);
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = AbstractC8953.f25177;
        str.getClass();
        c5742.getClass();
        AbstractC8953.f25177.remove(str, c5742);
        AbstractC8953.m14545(str, c5742);
    }
}
