package yyds;

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
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: yyds.ᛵᛲᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1046 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1985 f4750;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1281 f4751;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static Paint f4752;

    static {
        AbstractC0879.m1969("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            f4750 = new C1035();
        } else {
            f4750 = new C1985();
        }
        f4751 = new C1281(16);
        f4752 = null;
        Trace.endSection();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static Typeface m2237(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Typeface m2238(Context context, C2685[] c2685Arr, int i) {
        AbstractC0879.m1969("TypefaceCompat.createFromFontInfo");
        try {
            C1985 c1985 = f4750;
            c1985.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyM3851 = c1985.m3851(c2685Arr, context.getContentResolver());
                if (fontFamilyM3851 != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyM3851).setStyle(C1985.m3834(fontFamilyM3851, i).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            return typefaceBuild;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        r7 = r10.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02be  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m2239(Context context, InterfaceC0285 interfaceC0285, Resources resources, int i, String str, int i2, int i3, C1849 c1849) {
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 9;
        Typeface typefaceBuild2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (interfaceC0285 instanceof C1331) {
            C1331 c1331 = (C1331) interfaceC0285;
            String str2 = c1331.f6150;
            int i5 = 1;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = m2237(str2)) == null) {
                ArrayList arrayList = c1331.f6147;
                if (arrayList.size() == 1) {
                    typefaceBuild = m2237(((C1396) arrayList.get(0)).f6505);
                } else if (Build.VERSION.SDK_INT < 31) {
                    typefaceBuild = null;
                } else {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            int i7 = 0;
                            Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                            while (true) {
                                if (i7 >= arrayList.size()) {
                                    break;
                                }
                                C1396 c1396 = (C1396) arrayList.get(i7);
                                if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(c1396.f6510)) {
                                    customFallbackBuilder.setSystemFallback(c1396.f6505);
                                    break;
                                }
                                String str3 = c1396.f6505;
                                String str4 = c1396.f6510;
                                Font fontM2241 = m2241(m2237(str3));
                                if (fontM2241 == null) {
                                    Log.w("TypefaceCompat", "Unable identify the primary font for " + c1396.f6505 + ". Falling back to provider font.");
                                    break;
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    fontFamilyBuild = new FontFamily.Builder(fontM2241).build();
                                } else {
                                    try {
                                        fontFamilyBuild = new FontFamily.Builder(AbstractC0717.m1647(fontM2241).setFontVariationSettings(str4).build()).build();
                                    } catch (IOException unused) {
                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                    }
                                }
                                if (customFallbackBuilder == null) {
                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                } else {
                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                }
                                i7++;
                            }
                        } else {
                            if (m2237(((C1396) arrayList.get(i6)).f6505) == null) {
                                break;
                            }
                            i6++;
                        }
                    }
                    typefaceBuild = null;
                }
            }
            if (typefaceBuild != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2696(c1849, i4, typefaceBuild));
                f4751.m2556(m2242(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr4 = c1331.f6149 == 0;
            int i8 = c1331.f6148;
            Handler handler = new Handler(Looper.getMainLooper());
            C2014 c2014 = new C2014(21, (byte) 0);
            c2014.f10074 = c1849;
            ArrayList arrayList2 = c1331.f6147;
            ExecutorC0183 executorC0183 = new ExecutorC0183(handler);
            C2133 c2133 = new C2133(c2014, 13, executorC0183);
            int i9 = 2;
            if (objArr4 != true) {
                String strM4763 = AbstractC2672.m4763(i3, arrayList2);
                Typeface typeface = (Typeface) AbstractC2672.f13114.m2548(strM4763);
                if (typeface != null) {
                    executorC0183.execute(new RunnableC2660(i9, c2014, typeface, objArr2 == true ? 1 : 0));
                    typefaceBuild2 = typeface;
                } else {
                    C2212 c2212 = new C2212(objArr == true ? 1 : 0, c2133);
                    synchronized (AbstractC2672.f13116) {
                        try {
                            C0988 c0988 = AbstractC2672.f13117;
                            ArrayList arrayList3 = (ArrayList) c0988.get(strM4763);
                            if (arrayList3 != null) {
                                arrayList3.add(c2212);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c2212);
                                c0988.put(strM4763, arrayList4);
                                CallableC2087 callableC2087 = new CallableC2087(strM4763, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC2672.f13115;
                                C2212 c22122 = new C2212(i5, strM4763);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC0057 runnableC0057 = new RunnableC0057();
                                runnableC0057.f574 = callableC2087;
                                runnableC0057.f571 = c22122;
                                runnableC0057.f573 = handler2;
                                threadPoolExecutor.execute(runnableC0057);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    C0188.m798("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                C1396 c13962 = (C1396) arrayList2.get(0);
                C1281 c1281 = AbstractC2672.f13114;
                String strM47632 = AbstractC2672.m4763(i3, List.of(c13962));
                Typeface typeface2 = (Typeface) AbstractC2672.f13114.m2548(strM47632);
                if (typeface2 != null) {
                    executorC0183.execute(new RunnableC2660(i9, c2014, typeface2, objArr3 == true ? 1 : 0));
                    typefaceBuild2 = typeface2;
                } else if (i8 == -1) {
                    C2246 c2246M4764 = AbstractC2672.m4764(strM47632, context, List.of(c13962), i3);
                    c2133.m4057(c2246M4764);
                    typefaceBuild2 = c2246M4764.f11087;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C2246 c2246 = (C2246) AbstractC2672.f13115.submit(new CallableC2087(strM47632, context, c13962, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                    c2133.m4057(c2246);
                                    typefaceBuild2 = c2246.f11087;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        ((ExecutorC0183) c2133.f10553).execute(new RunnableC1128((C2014) c2133.f10555, -3));
                    }
                }
            }
        } else {
            C0984 c0984 = (C0984) interfaceC0285;
            f4750.getClass();
            try {
                FontFamily.Builder builder = null;
                for (C1238 c1238 : c0984.f4489) {
                    try {
                        try {
                            try {
                                Font fontBuild = new Font.Builder(resources, c1238.f5664).setWeight(c1238.f5665).setSlant(c1238.f5666 ? 1 : 0).setTtcIndex(c1238.f5668).setFontVariationSettings(c1238.f5667).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(fontBuild);
                                } else {
                                    builder.addFont(fontBuild);
                                }
                            } catch (Exception e3) {
                                e = e3;
                                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                                if (typefaceBuild2 == null) {
                                }
                                if (typefaceBuild2 != null) {
                                }
                                return typefaceBuild2;
                            }
                        } catch (IOException unused4) {
                        }
                    } catch (IOException unused5) {
                    }
                }
                if (builder != null) {
                    FontFamily fontFamilyBuild2 = builder.build();
                    typefaceBuild2 = new Typeface.CustomFallbackBuilder(fontFamilyBuild2).setStyle(C1985.m3834(fontFamilyBuild2, i3).getStyle()).build();
                }
            } catch (Exception e4) {
                e = e4;
            }
            if (typefaceBuild2 == null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2696(c1849, i4, typefaceBuild2));
            } else {
                c1849.m3613();
            }
        }
        if (typefaceBuild2 != null) {
            f4751.m2556(m2242(resources, i, str, i2, i3), typefaceBuild2);
        }
        return typefaceBuild2;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static Typeface m2240(Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceBuild;
        f4750.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            f4751.m2556(m2242(resources, i, str, i2, i3), typefaceBuild);
        }
        return typefaceBuild;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static Font m2241(Typeface typeface) {
        Paint paint = f4752;
        if (paint == null) {
            paint = new Paint();
            f4752 = paint;
        }
        paint.setTextSize(10.0f);
        f4752.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f4752);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m2242(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
