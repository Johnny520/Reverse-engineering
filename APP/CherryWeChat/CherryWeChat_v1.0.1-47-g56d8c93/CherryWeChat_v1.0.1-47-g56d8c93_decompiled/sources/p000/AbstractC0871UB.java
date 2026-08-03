package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: UB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0871UB {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1293cr f2754a;

    /* JADX INFO: renamed from: b */
    public static final C0161Dp f2755b;

    /* JADX INFO: renamed from: c */
    public static Paint f2756c;

    static {
        AbstractC0628Oj.m1239c("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f2754a = new C1000XB();
        } else if (i >= 29) {
            f2754a = new C0957WB();
        } else {
            f2754a = new C0914VB();
        }
        f2755b = new C0161Dp(16);
        f2756c = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        r2 = r10.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m1707a(Context context, InterfaceC0883Uh interfaceC0883Uh, Resources resources, int i, String str, int i2, int i3, AbstractC0585Nj abstractC0585Nj, boolean z) {
        Typeface typefaceMo1762q;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 15;
        int i5 = -3;
        if (interfaceC0883Uh instanceof C1012Xh) {
            C1012Xh c1012Xh = (C1012Xh) interfaceC0883Uh;
            String str2 = c1012Xh.f3222d;
            Typeface typeface = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = m1709c(str2)) == null) {
                ArrayList arrayList = c1012Xh.f3219a;
                if (arrayList.size() == 1) {
                    typefaceBuild = m1709c(((C0583Nh) arrayList.get(0)).f1887e);
                } else if (Build.VERSION.SDK_INT < 31) {
                    typefaceBuild = null;
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            Typeface.CustomFallbackBuilder customFallbackBuilderM1399c = null;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= arrayList.size()) {
                                    break;
                                }
                                C0583Nh c0583Nh = (C0583Nh) arrayList.get(i8);
                                if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(c0583Nh.f1888f)) {
                                    customFallbackBuilderM1399c.setSystemFallback(c0583Nh.f1887e);
                                    break;
                                }
                                String str3 = c0583Nh.f1887e;
                                String str4 = c0583Nh.f1888f;
                                Font fontM1710d = m1710d(m1709c(str3));
                                if (fontM1710d == null) {
                                    break;
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    try {
                                        AbstractC0688Q.m1409m();
                                        AbstractC0688Q.m1420x();
                                        fontFamilyBuild = AbstractC0688Q.m1405i(AbstractC0951W5.m1813f(fontM1710d).setFontVariationSettings(str4).build()).build();
                                    } catch (IOException unused) {
                                    }
                                } else {
                                    fontFamilyBuild = AbstractC0688Q.m1405i(fontM1710d).build();
                                }
                                if (customFallbackBuilderM1399c == null) {
                                    customFallbackBuilderM1399c = AbstractC0688Q.m1399c(fontFamilyBuild);
                                } else {
                                    customFallbackBuilderM1399c.addCustomFallback(fontFamilyBuild);
                                }
                                i8++;
                            }
                        } else {
                            if (m1709c(((C0583Nh) arrayList.get(i7)).f1887e) == null) {
                                break;
                            }
                            i7++;
                        }
                    }
                    typefaceBuild = null;
                }
            }
            if (typefaceBuild != null) {
                if (abstractC0585Nj != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(i4, abstractC0585Nj, typefaceBuild));
                }
                f2755b.m311j(m1708b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr5 = !z ? abstractC0585Nj != null : c1012Xh.f3221c != 0;
            int i9 = z ? c1012Xh.f3220b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C1017Xm c1017Xm = new C1017Xm(17, z2);
            c1017Xm.f3226b = abstractC0585Nj;
            ArrayList arrayList2 = c1012Xh.f3219a;
            ExecutorC1341dw executorC1341dw = new ExecutorC1341dw(handler);
            C0649P3 c0649p3 = new C0649P3(9, c1017Xm, executorC1341dw);
            if (objArr5 != true) {
                String strM1661a = AbstractC0840Th.m1661a(i3, arrayList2);
                Typeface typeface2 = (Typeface) AbstractC0840Th.f2669a.m307f(strM1661a);
                if (typeface2 != null) {
                    executorC1341dw.execute(new RunnableC0044B0(c1017Xm, typeface2, i6, objArr2 == true ? 1 : 0));
                    typeface = typeface2;
                } else {
                    C0754Rh c0754Rh = new C0754Rh(objArr == true ? 1 : 0, c0649p3);
                    synchronized (AbstractC0840Th.f2671c) {
                        try {
                            C2520sy c2520sy = AbstractC0840Th.f2672d;
                            ArrayList arrayList3 = (ArrayList) c2520sy.get(strM1661a);
                            if (arrayList3 != null) {
                                arrayList3.add(c0754Rh);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c0754Rh);
                                c2520sy.put(strM1661a, arrayList4);
                                CallableC0712Qh callableC0712Qh = new CallableC0712Qh(strM1661a, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC0840Th.f2670b;
                                C0754Rh c0754Rh2 = new C0754Rh(i6, strM1661a);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC1385ew runnableC1385ew = new RunnableC1385ew();
                                runnableC1385ew.f4932b = callableC0712Qh;
                                runnableC1385ew.f4933c = c0754Rh2;
                                runnableC1385ew.f4934d = handler2;
                                threadPoolExecutor.execute(runnableC1385ew);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                C0583Nh c0583Nh2 = (C0583Nh) arrayList2.get(0);
                C0161Dp c0161Dp = AbstractC0840Th.f2669a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{c0583Nh2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strM1661a2 = AbstractC0840Th.m1661a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) AbstractC0840Th.f2669a.m307f(strM1661a2);
                if (typeface3 != null) {
                    executorC1341dw.execute(new RunnableC0044B0(c1017Xm, typeface3, i6, objArr4 == true ? 1 : 0));
                    typeface = typeface3;
                } else if (i9 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{c0583Nh2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    C0797Sh c0797ShM1662b = AbstractC0840Th.m1662b(strM1661a2, context, Collections.unmodifiableList(arrayList6), i3);
                    c0649p3.m1281L(c0797ShM1662b);
                    typeface = c0797ShM1662b.f2498a;
                } else {
                    try {
                        try {
                            try {
                                C0797Sh c0797Sh = (C0797Sh) AbstractC0840Th.f2670b.submit(new CallableC0712Qh(strM1661a2, context, c0583Nh2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                c0649p3.m1281L(c0797Sh);
                                typeface = c0797Sh.f2498a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((ExecutorC1341dw) c0649p3.f2090c).execute(new RunnableC0308H6(i5, (int) (objArr3 == true ? 1 : 0), c0649p3.f2089b));
                    }
                }
            }
            typefaceMo1762q = typeface;
        } else {
            typefaceMo1762q = f2754a.mo1762q(context, (C0926Vh) interfaceC0883Uh, resources, i3);
            if (abstractC0585Nj != null) {
                if (typefaceMo1762q != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(i4, abstractC0585Nj, typefaceMo1762q));
                } else {
                    abstractC0585Nj.m1161c(-3);
                }
            }
        }
        if (typefaceMo1762q != null) {
            f2755b.m311j(m1708b(resources, i, str, i2, i3), typefaceMo1762q);
        }
        return typefaceMo1762q;
    }

    /* JADX INFO: renamed from: b */
    public static String m1708b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m1709c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Font m1710d(Typeface typeface) {
        if (f2756c == null) {
            f2756c = new Paint();
        }
        f2756c.setTextSize(10.0f);
        f2756c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f2756c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
