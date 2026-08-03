package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Oh */
/* JADX INFO: loaded from: classes.dex */
public final class C0626Oh implements InterfaceC2321of {

    /* JADX INFO: renamed from: a */
    public final Context f1999a;

    /* JADX INFO: renamed from: b */
    public final C0583Nh f2000b;

    /* JADX INFO: renamed from: c */
    public final C0668Pg f2001c;

    /* JADX INFO: renamed from: d */
    public final Object f2002d = new Object();

    /* JADX INFO: renamed from: e */
    public Handler f2003e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f2004f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f2005g;

    /* JADX INFO: renamed from: h */
    public AbstractC1293cr f2006h;

    public C0626Oh(Context context, C0583Nh c0583Nh) {
        AbstractC1293cr.m2548g("Context cannot be null", context);
        this.f1999a = context.getApplicationContext();
        this.f2000b = c0583Nh;
        this.f2001c = C0669Ph.f2133d;
    }

    @Override // p000.InterfaceC2321of
    /* JADX INFO: renamed from: a */
    public final void mo1218a(AbstractC1293cr abstractC1293cr) {
        synchronized (this.f2002d) {
            this.f2006h = abstractC1293cr;
        }
        synchronized (this.f2002d) {
            try {
                if (this.f2006h == null) {
                    return;
                }
                if (this.f2004f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1005Xa("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2005g = threadPoolExecutor;
                    this.f2004f = threadPoolExecutor;
                }
                this.f2004f.execute(new RunnableC0562N2(12, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1219b() {
        synchronized (this.f2002d) {
            try {
                this.f2006h = null;
                Handler handler = this.f2003e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2003e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2005g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2004f = null;
                this.f2005g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1098Zh m1220c() {
        try {
            C0668Pg c0668Pg = this.f2001c;
            Context context = this.f1999a;
            C0583Nh c0583Nh = this.f2000b;
            c0668Pg.getClass();
            Object[] objArr = {c0583Nh};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0307H5 c0307h5M1036a = AbstractC0540Mh.m1036a(context, Collections.unmodifiableList(arrayList));
            int i = c0307h5M1036a.f1020a;
            if (i != 0) {
                throw new RuntimeException(AbstractC2374ph.m4813j(i, "fetchFonts failed (", ")"));
            }
            C1098Zh[] c1098ZhArr = (C1098Zh[]) ((List) c0307h5M1036a.f1021b).get(0);
            if (c1098ZhArr == null || c1098ZhArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c1098ZhArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
