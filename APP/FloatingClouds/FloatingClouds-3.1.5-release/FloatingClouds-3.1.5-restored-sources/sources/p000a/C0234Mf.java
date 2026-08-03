package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000a.C0314R6;
import p000a.C0332S6;
import p000a.C0787qd;

/* JADX INFO: renamed from: a.Mf */
/* JADX INFO: loaded from: classes.dex */
public final class C0234Mf {

    /* JADX INFO: renamed from: a */
    public static final C0323Rf f777a;

    /* JADX INFO: renamed from: b */
    public static final C0407W9<String, Typeface> f778b;

    /* JADX INFO: renamed from: a.Mf$a */
    public static class a extends C0889w1 {

        /* JADX INFO: renamed from: u */
        public C0787qd.e f779u;
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f777a = new C0306Qf();
        } else {
            f777a = new C0288Pf();
        }
        f778b = new C0407W9<>(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m626a(Context context, C0332S6.b bVar, Resources resources, int i, String str, int i2, int i3, C0787qd.e eVar, boolean z) {
        Typeface typefaceMo690a;
        Typeface typefaceCreate;
        Typeface typefaceM1052a;
        int i4 = 14;
        int i5 = 0;
        int i6 = -3;
        if (bVar instanceof C0332S6.e) {
            C0332S6.e eVar2 = (C0332S6.e) bVar;
            String str2 = eVar2.f1196d;
            typefaceMo690a = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    if (eVar != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0273P0(eVar, i4, typefaceCreate));
                    }
                    return typefaceCreate;
                }
                boolean z2 = true;
                if (!z ? eVar != null : eVar2.f1195c != 0) {
                    z2 = false;
                }
                int i7 = z ? eVar2.f1194b : -1;
                Handler handler = new Handler(Looper.getMainLooper());
                a aVar = new a();
                aVar.f779u = eVar;
                C0225M6 c0225m6 = eVar2.f1193a;
                C0131H2 c0131h2 = new C0131H2(aVar, handler);
                if (z2) {
                    C0407W9<String, Typeface> c0407w9 = C0314R6.f1123a;
                    String str3 = c0225m6.f764e + "-" + i3;
                    typefaceM1052a = C0314R6.f1123a.m1052a(str3);
                    if (typefaceM1052a != null) {
                        handler.post(new RunnableC0095F2(aVar, typefaceM1052a));
                        typefaceMo690a = typefaceM1052a;
                    } else if (i7 == -1) {
                        C0314R6.a aVarM857a = C0314R6.m857a(str3, context, c0225m6, i3);
                        c0131h2.m352a(aVarM857a);
                        typefaceMo690a = aVarM857a.f1127a;
                    } else {
                        try {
                            try {
                                try {
                                    C0314R6.a aVar2 = (C0314R6.a) C0314R6.f1124b.submit(new CallableC0243N6(str3, context, c0225m6, i3)).get(i7, TimeUnit.MILLISECONDS);
                                    c0131h2.m352a(aVar2);
                                    typefaceMo690a = aVar2.f1127a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            } catch (ExecutionException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (InterruptedException unused2) {
                            c0131h2.f440b.post(new RunnableC0113G2(c0131h2.f439a, i6, i5));
                        }
                    }
                } else {
                    C0407W9<String, Typeface> c0407w92 = C0314R6.f1123a;
                    String str4 = c0225m6.f764e + "-" + i3;
                    typefaceM1052a = C0314R6.f1123a.m1052a(str4);
                    if (typefaceM1052a != null) {
                        handler.post(new RunnableC0095F2(aVar, typefaceM1052a));
                        typefaceMo690a = typefaceM1052a;
                    } else {
                        C0261O6 c0261o6 = new C0261O6(c0131h2);
                        synchronized (C0314R6.f1125c) {
                            try {
                                C0598ge<String, ArrayList<InterfaceC0294Q3<C0314R6.a>>> c0598ge = C0314R6.f1126d;
                                ArrayList<InterfaceC0294Q3<C0314R6.a>> orDefault = c0598ge.getOrDefault(str4, null);
                                if (orDefault != null) {
                                    orDefault.add(c0261o6);
                                } else {
                                    ArrayList<InterfaceC0294Q3<C0314R6.a>> arrayList = new ArrayList<>();
                                    arrayList.add(c0261o6);
                                    c0598ge.put(str4, arrayList);
                                    CallableC0279P6 callableC0279P6 = new CallableC0279P6(str4, context, c0225m6, i3);
                                    ThreadPoolExecutor threadPoolExecutor = C0314R6.f1124b;
                                    C0297Q6 c0297q6 = new C0297Q6(str4);
                                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                    RunnableC0483ad runnableC0483ad = new RunnableC0483ad();
                                    runnableC0483ad.f1807a = callableC0279P6;
                                    runnableC0483ad.f1808b = c0297q6;
                                    runnableC0483ad.f1809c = handler2;
                                    threadPoolExecutor.execute(runnableC0483ad);
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
            typefaceMo690a = f777a.mo690a(context, (C0332S6.c) bVar, resources, i3);
            if (eVar != null) {
                if (typefaceMo690a != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0273P0(eVar, i4, typefaceMo690a));
                } else {
                    eVar.m1843a(-3);
                }
            }
        }
        if (typefaceMo690a != null) {
            f778b.m1053b(m627b(resources, i, str, i2, i3), typefaceMo690a);
        }
        return typefaceMo690a;
    }

    /* JADX INFO: renamed from: b */
    public static String m627b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
