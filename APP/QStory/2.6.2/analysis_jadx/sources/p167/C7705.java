package p167;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.material.ripple.RunnableC1107;
import bsh.C2632;
import com.google.android.flexbox.C3079;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p053.AbstractC6560;
import p075.C6957;
import p153.AbstractC7599;
import p153.C7598;
import p153.C7601;
import p251.AbstractC8174;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7705 implements InterfaceC7708 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Handler f20907;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f20908 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC8174 f20909;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ThreadPoolExecutor f20910;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ThreadPoolExecutor f20911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7598 f20912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6957 f20913;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f20914;

    public C7705(Context context, C7598 c7598) {
        AbstractC6560.m12036(context, "Context cannot be null");
        this.f20914 = context.getApplicationContext();
        this.f20912 = c7598;
        this.f20913 = C7697.f20887;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7601 m12975() {
        try {
            C6957 c6957 = this.f20913;
            Context context = this.f20914;
            C7598 c7598 = this.f20912;
            c6957.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{c7598}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C3079 c3079M12798 = AbstractC7599.m12798(context, Collections.unmodifiableList(arrayList));
            int i = c3079M12798.f9898;
            if (i != 0) {
                C2632.m5294(AbstractC0053.m161(i, "fetchFonts failed (", ")"));
                return null;
            }
            C7601[] c7601Arr = (C7601[]) c3079M12798.f9897.get(0);
            if (c7601Arr != null && c7601Arr.length != 0) {
                return c7601Arr[0];
            }
            C2632.m5294("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            C0276.m847("provider not found", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12976() {
        synchronized (this.f20908) {
            try {
                this.f20909 = null;
                Handler handler = this.f20907;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f20907 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f20911;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f20910 = null;
                this.f20911 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p167.InterfaceC7708
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo12977(AbstractC8174 abstractC8174) {
        synchronized (this.f20908) {
            this.f20909 = abstractC8174;
        }
        synchronized (this.f20908) {
            try {
                if (this.f20909 == null) {
                    return;
                }
                if (this.f20910 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC7695("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f20911 = threadPoolExecutor;
                    this.f20910 = threadPoolExecutor;
                }
                this.f20910.execute(new RunnableC1107(this, 23));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
