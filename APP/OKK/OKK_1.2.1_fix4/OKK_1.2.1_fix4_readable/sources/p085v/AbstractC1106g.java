package p085v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.abc.core.runtime.AbstractC0805P;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000A.AbstractC0009j;
import p000A.C0002c;
import p000A.C0005f;
import p000A.C0007h;
import p000A.C0008i;
import p000A.CallableC0006g;
import p000A.RunnableC0000a;
import p000A.RunnableC0001b;
import p000A.RunnableC0014o;
import p006D.C0095d;
import p034S.RunnableC0328h;
import p063j.C0961f;
import p063j.C0966k;
import p083u.AbstractC1083b;
import p083u.C1087f;
import p083u.C1089h;
import p083u.InterfaceC1086e;

/* JADX INFO: renamed from: v.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1106g {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0805P f4256a;

    /* JADX INFO: renamed from: b */
    public static final C0961f f4257b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f4256a = new C1109j();
        } else if (i2 >= 28) {
            f4256a = new C1108i();
        } else {
            f4256a = new C1107h();
        }
        f4257b = new C0961f(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m2604a(Context context, InterfaceC1086e interfaceC1086e, Resources resources, int i2, String str, int i3, int i4, AbstractC1083b abstractC1083b, boolean z2) {
        Typeface typefaceMo2070j;
        Typeface typefaceCreate;
        Typeface typeface;
        int i5 = 1;
        int i6 = 8;
        int i7 = 0;
        if (interfaceC1086e instanceof C1089h) {
            C1089h c1089h = (C1089h) interfaceC1086e;
            String str2 = c1089h.f4204d;
            typefaceMo2070j = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    if (abstractC1083b != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0328h(abstractC1083b, typefaceCreate, i6));
                    }
                    return typefaceCreate;
                }
                boolean z3 = !z2 ? abstractC1083b != null : c1089h.f4203c != 0;
                int i8 = z2 ? c1089h.f4202b : -1;
                Handler handler = new Handler(Looper.getMainLooper());
                C0095d c0095d = new C0095d(24);
                c0095d.f251b = abstractC1083b;
                C0005f c0005f = c1089h.f4201a;
                C0002c c0002c = new C0002c(c0095d, handler, i7);
                if (z3) {
                    C0961f c0961f = AbstractC0009j.f24a;
                    String str3 = c0005f.f14e + "-" + i4;
                    typeface = (Typeface) AbstractC0009j.f24a.m2313a(str3);
                    if (typeface != null) {
                        handler.post(new RunnableC0000a(c0095d, typeface, i7));
                        typefaceMo2070j = typeface;
                    } else if (i8 == -1) {
                        C0008i c0008iM17a = AbstractC0009j.m17a(str3, context, c0005f, i4);
                        c0002c.m9j(c0008iM17a);
                        typefaceMo2070j = c0008iM17a.f22a;
                    } else {
                        try {
                            try {
                                try {
                                    C0008i c0008i = (C0008i) AbstractC0009j.f25b.submit(new CallableC0006g(str3, context, c0005f, i4, 0)).get(i8, TimeUnit.MILLISECONDS);
                                    c0002c.m9j(c0008i);
                                    typefaceMo2070j = c0008i.f22a;
                                } catch (InterruptedException e2) {
                                    throw e2;
                                }
                            } catch (ExecutionException e3) {
                                throw new RuntimeException(e3);
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused2) {
                            ((Handler) c0002c.f8c).post(new RunnableC0001b((C0095d) c0002c.f7b, -3));
                        }
                    }
                } else {
                    C0961f c0961f2 = AbstractC0009j.f24a;
                    String str4 = c0005f.f14e + "-" + i4;
                    typeface = (Typeface) AbstractC0009j.f24a.m2313a(str4);
                    if (typeface != null) {
                        handler.post(new RunnableC0000a(c0095d, typeface, i7));
                        typefaceMo2070j = typeface;
                    } else {
                        C0007h c0007h = new C0007h(i7, c0002c);
                        synchronized (AbstractC0009j.f26c) {
                            try {
                                C0966k c0966k = AbstractC0009j.f27d;
                                ArrayList arrayList = (ArrayList) c0966k.getOrDefault(str4, null);
                                if (arrayList != null) {
                                    arrayList.add(c0007h);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(c0007h);
                                    c0966k.put(str4, arrayList2);
                                    CallableC0006g callableC0006g = new CallableC0006g(str4, context, c0005f, i4, 1);
                                    ThreadPoolExecutor threadPoolExecutor = AbstractC0009j.f25b;
                                    C0007h c0007h2 = new C0007h(i5, str4);
                                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                    RunnableC0014o runnableC0014o = new RunnableC0014o();
                                    runnableC0014o.f39b = callableC0006g;
                                    runnableC0014o.f40c = c0007h2;
                                    runnableC0014o.f41d = handler2;
                                    threadPoolExecutor.execute(runnableC0014o);
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
            typefaceMo2070j = f4256a.mo2070j(context, (C1087f) interfaceC1086e, resources, i4);
            if (abstractC1083b != null) {
                if (typefaceMo2070j != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0328h(abstractC1083b, typefaceMo2070j, i6));
                } else {
                    abstractC1083b.m2576a(-3);
                }
            }
        }
        if (typefaceMo2070j != null) {
            f4257b.m2314b(m2605b(resources, i2, str, i3, i4), typefaceMo2070j);
        }
        return typefaceMo2070j;
    }

    /* JADX INFO: renamed from: b */
    public static String m2605b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
