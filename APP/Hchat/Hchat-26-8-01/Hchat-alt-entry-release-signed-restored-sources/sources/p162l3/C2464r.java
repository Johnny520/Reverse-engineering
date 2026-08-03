package p162l3;

import ac.AbstractC0063p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import bsh.C0353j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002a1.RunnableC0003a;
import p003a2.C0014a;
import p005a5.C0016a;
import p007a7.AbstractC0018a;
import p012ah.C0086a;
import p059e3.AbstractC0821b;
import p059e3.C0822c;
import p059e3.C0823d;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: l3.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2464r implements InterfaceC2454h {

    /* JADX INFO: renamed from: a */
    public final Context f8080a;

    /* JADX INFO: renamed from: b */
    public final C0822c f8081b;

    /* JADX INFO: renamed from: c */
    public final C0014a f8082c;

    /* JADX INFO: renamed from: d */
    public final Object f8083d = new Object();

    /* JADX INFO: renamed from: e */
    public Handler f8084e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f8085f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f8086g;

    /* JADX INFO: renamed from: h */
    public AbstractC0018a f8087h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2464r(Context context, C0822c c0822c) {
        AbstractC0063p.m418k(context, "Context cannot be null");
        this.f8080a = context.getApplicationContext();
        this.f8081b = c0822c;
        this.f8082c = C2465s.f8088d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p162l3.InterfaceC2454h
    /* JADX INFO: renamed from: a */
    public final void mo5845a(AbstractC0018a abstractC0018a) {
        synchronized (this.f8083d) {
            this.f8087h = abstractC0018a;
        }
        synchronized (this.f8083d) {
            try {
                if (this.f8087h == null) {
                    return;
                }
                if (this.f8085f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2447a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f8086g = threadPoolExecutor;
                    this.f8085f = threadPoolExecutor;
                }
                this.f8085f.execute(new RunnableC0003a(this, 24));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5859b() {
        synchronized (this.f8083d) {
            try {
                this.f8087h = null;
                Handler handler = this.f8084e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f8084e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f8086g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f8085f = null;
                this.f8086g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0823d m5860c() {
        try {
            C0014a c0014a = this.f8082c;
            Context context = this.f8080a;
            C0822c c0822c = this.f8081b;
            c0014a.getClass();
            Object[] objArr = {c0822c};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0016a c0016aM2066a = AbstractC0821b.m2066a(context, Collections.unmodifiableList(arrayList));
            int i9 = c0016aM2066a.f55h;
            if (i9 != 0) {
                C0353j.m1309g(AbstractC0921a.m2250m(i9, "fetchFonts failed (", ")"));
                return null;
            }
            C0823d[] c0823dArr = (C0823d[]) ((List) c0016aM2066a.f56i).get(0);
            if (c0823dArr != null && c0823dArr.length != 0) {
                return c0823dArr[0];
            }
            C0353j.m1309g("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            C0086a.m457p("provider not found", e6);
            return null;
        }
    }
}
