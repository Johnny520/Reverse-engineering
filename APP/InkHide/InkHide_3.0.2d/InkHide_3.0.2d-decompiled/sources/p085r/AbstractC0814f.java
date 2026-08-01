package p085r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.RunnableC0425c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001A0.RunnableC0040m;
import p004C.C0066j;
import p006D.RunnableC0073b;
import p014H.C0142a;
import p052b1.AbstractC0503h;
import p069i.C0651W;
import p075l.C0748f;
import p075l.C0753k;
import p080o.RunnableC0775a;
import p083q.C0792f;
import p083q.C0794h;
import p083q.InterfaceC0791e;
import p093v.AbstractC1022g;
import p093v.C1018c;
import p093v.C1020e;
import p093v.C1021f;
import p093v.CallableC1019d;

/* JADX INFO: renamed from: r.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0814f {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0503h f2717a;

    /* JADX INFO: renamed from: b */
    public static final C0748f f2718b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f2717a = new C0819k();
        } else if (i2 >= 28) {
            f2717a = new C0818j();
        } else if (i2 >= 26) {
            f2717a = new C0817i();
        } else {
            Method method = C0816h.f2726r;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f2717a = new C0816h();
            } else {
                f2717a = new C0815g();
            }
        }
        f2718b = new C0748f(16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m1482a(Context context, InterfaceC0791e interfaceC0791e, Resources resources, int i2, String str, int i3, int i4, C0651W c0651w) {
        Typeface typefaceMo1001l;
        Typeface typefaceCreate;
        Typeface typeface;
        int i5 = 1;
        boolean z2 = false;
        Object[] objArr = 0;
        if (interfaceC0791e instanceof C0794h) {
            C0794h c0794h = (C0794h) interfaceC0791e;
            String str2 = c0794h.f2648d;
            typefaceMo1001l = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0040m(c0651w, typefaceCreate, 3));
                    return typefaceCreate;
                }
                Object[] objArr2 = c0794h.f2647c == 0;
                int i6 = c0794h.f2646b;
                Handler handler = new Handler(Looper.getMainLooper());
                C0066j c0066j = new C0066j(21);
                c0066j.f312c = c0651w;
                C1018c c1018c = c0794h.f2645a;
                C0142a c0142a = new C0142a(c0066j, handler, z2);
                if (objArr2 == true) {
                    C0748f c0748f = AbstractC1022g.f3628a;
                    String str3 = c1018c.f3618e + "-" + i4;
                    typeface = (Typeface) AbstractC1022g.f3628a.m1410a(str3);
                    if (typeface != null) {
                        handler.post(new RunnableC0775a(c0066j, typeface, 3));
                        typefaceMo1001l = typeface;
                    } else if (i6 == -1) {
                        C1021f c1021fM2220a = AbstractC1022g.m2220a(str3, context, c1018c, i4);
                        c0142a.m334t(c1021fM2220a);
                        typefaceMo1001l = c1021fM2220a.f3626a;
                    } else {
                        try {
                            try {
                                try {
                                    try {
                                        C1021f c1021f = (C1021f) AbstractC1022g.f3629b.submit(new CallableC1019d(str3, context, c1018c, i4, 0)).get(i6, TimeUnit.MILLISECONDS);
                                        c0142a.m334t(c1021f);
                                        typefaceMo1001l = c1021f.f3626a;
                                    } catch (TimeoutException unused) {
                                        throw new InterruptedException("timeout");
                                    }
                                } catch (InterruptedException e2) {
                                    throw e2;
                                }
                            } catch (ExecutionException e3) {
                                throw new RuntimeException(e3);
                            }
                        } catch (InterruptedException unused2) {
                            ((Handler) c0142a.f444c).post(new RunnableC0073b((C0066j) c0142a.f443b, -3));
                        }
                    }
                } else {
                    C0748f c0748f2 = AbstractC1022g.f3628a;
                    String str4 = c1018c.f3618e + "-" + i4;
                    typeface = (Typeface) AbstractC1022g.f3628a.m1410a(str4);
                    if (typeface != null) {
                        handler.post(new RunnableC0775a(c0066j, typeface, 3));
                        typefaceMo1001l = typeface;
                    } else {
                        C1020e c1020e = new C1020e(objArr == true ? 1 : 0, c0142a);
                        synchronized (AbstractC1022g.f3630c) {
                            try {
                                C0753k c0753k = AbstractC1022g.f3631d;
                                ArrayList arrayList = (ArrayList) c0753k.getOrDefault(str4, null);
                                if (arrayList != null) {
                                    arrayList.add(c1020e);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(c1020e);
                                    c0753k.put(str4, arrayList2);
                                    CallableC1019d callableC1019d = new CallableC1019d(str4, context, c1018c, i4, 1);
                                    ThreadPoolExecutor threadPoolExecutor = AbstractC1022g.f3629b;
                                    C1020e c1020e2 = new C1020e(i5, str4);
                                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                    RunnableC0425c runnableC0425c = new RunnableC0425c();
                                    runnableC0425c.f1314b = callableC1019d;
                                    runnableC0425c.f1315c = c1020e2;
                                    runnableC0425c.f1316d = handler2;
                                    threadPoolExecutor.execute(runnableC0425c);
                                }
                            } finally {
                            }
                        }
                    }
                }
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                }
                if (typefaceCreate == null) {
                }
            }
        } else {
            typefaceMo1001l = f2717a.mo1001l(context, (C0792f) interfaceC0791e, resources, i4);
            if (typefaceMo1001l != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0040m(c0651w, typefaceMo1001l, 3));
            } else {
                c0651w.m1266a();
            }
        }
        if (typefaceMo1001l != null) {
            f2718b.m1411b(m1483b(resources, i2, str, i3, i4), typefaceMo1001l);
        }
        return typefaceMo1001l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1483b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
