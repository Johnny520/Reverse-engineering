package p167;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.material.ripple.RunnableC1107;
import bsh.C2633;
import com.google.android.flexbox.C3080;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p034.AbstractC6344;
import p075.C6958;
import p153.AbstractC7600;
import p153.C7599;
import p153.C7602;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7706 implements InterfaceC7709 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Handler f20902;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f20903 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC0455 f20904;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ThreadPoolExecutor f20905;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ThreadPoolExecutor f20906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7599 f20907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6958 f20908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f20909;

    public C7706(Context context, C7599 c7599) {
        AbstractC6344.m11870(context, "Context cannot be null");
        this.f20909 = context.getApplicationContext();
        this.f20907 = c7599;
        this.f20908 = C7698.f20882;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7602 m13005() {
        try {
            C6958 c6958 = this.f20908;
            Context context = this.f20909;
            C7599 c7599 = this.f20907;
            c6958.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{c7599}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C3080 c3080M12827 = AbstractC7600.m12827(context, Collections.unmodifiableList(arrayList));
            int i = c3080M12827.f9903;
            if (i != 0) {
                C2633.m5339(AbstractC0053.m162(i, "fetchFonts failed (", ")"));
                return null;
            }
            C7602[] c7602Arr = (C7602[]) c3080M12827.f9902.get(0);
            if (c7602Arr != null && c7602Arr.length != 0) {
                return c7602Arr[0];
            }
            C2633.m5339("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            C0276.m848("provider not found", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13006() {
        synchronized (this.f20903) {
            try {
                this.f20904 = null;
                Handler handler = this.f20902;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f20902 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f20906;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f20905 = null;
                this.f20906 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p167.InterfaceC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo13007(AbstractC0455 abstractC0455) {
        synchronized (this.f20903) {
            this.f20904 = abstractC0455;
        }
        synchronized (this.f20903) {
            try {
                if (this.f20904 == null) {
                    return;
                }
                if (this.f20905 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC7696("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f20906 = threadPoolExecutor;
                    this.f20905 = threadPoolExecutor;
                }
                this.f20905.execute(new RunnableC1107(this, 23));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
