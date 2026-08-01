package p183;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.material.ripple.RunnableC1945;
import bsh.C3466;
import com.google.android.flexbox.C3912;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p050.AbstractC7173;
import p091.C7787;
import p169.AbstractC8429;
import p169.C8428;
import p169.C8431;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8535 implements InterfaceC8538 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Handler f21247;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f21248 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC1298 f21249;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ThreadPoolExecutor f21250;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ThreadPoolExecutor f21251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8428 f21252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7787 f21253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f21254;

    public C8535(Context context, C8428 c8428) {
        AbstractC7173.m12429(context, "Context cannot be null");
        this.f21254 = context.getApplicationContext();
        this.f21252 = c8428;
        this.f21253 = C8527.f21227;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8431 m13564() {
        try {
            C7787 c7787 = this.f21253;
            Context context = this.f21254;
            C8428 c8428 = this.f21252;
            c7787.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{c8428}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C3912 c3912M13386 = AbstractC8429.m13386(context, Collections.unmodifiableList(arrayList));
            int i = c3912M13386.f10248;
            if (i != 0) {
                C3466.m5899(AbstractC0900.m722(i, "fetchFonts failed (", ")"));
                return null;
            }
            C8431[] c8431Arr = (C8431[]) c3912M13386.f10247.get(0);
            if (c8431Arr != null && c8431Arr.length != 0) {
                return c8431Arr[0];
            }
            C3466.m5899("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            C1123.m1408("provider not found", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13565() {
        synchronized (this.f21248) {
            try {
                this.f21249 = null;
                Handler handler = this.f21247;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f21247 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f21251;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f21250 = null;
                this.f21251 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p183.InterfaceC8538
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo13566(AbstractC1298 abstractC1298) {
        synchronized (this.f21248) {
            this.f21249 = abstractC1298;
        }
        synchronized (this.f21248) {
            try {
                if (this.f21249 == null) {
                    return;
                }
                if (this.f21250 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC8525("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f21251 = threadPoolExecutor;
                    this.f21250 = threadPoolExecutor;
                }
                this.f21250.execute(new RunnableC1945(this, 23));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
