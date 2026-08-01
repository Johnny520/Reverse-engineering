package p161;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.C0137;
import androidx.compose.foundation.text.input.internal.RunnableC0876;
import io.ktor.util.C4211;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p153.C7599;
import p164.AbstractC7667;
import p200.AbstractC7871;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Method f20734;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean f20740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float[][] f20739 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float[][] f20738 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float[] f20737 = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float[][] f20736 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object f20735 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static float m12898(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m12899(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f20737;
        return AbstractC7667.m12976(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m12900(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0137 m12901(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C0137 c0137M560;
        if (m12900(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0137((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c0137M560 = C0137.m560(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0137M560 = null;
            }
            if (c0137M560 != null) {
                return c0137M560;
            }
        }
        return new C0137((Shader) null, (ColorStateList) null, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ColorStateList m12902(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (m12900(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i != 2) {
                if (i >= 28 && i <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC7641.f20733;
                try {
                    return AbstractC7641.m12897(resources, resources.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    return null;
                }
            }
            C4211.m8596(typedValue, "Failed to resolve attribute at index 1: ");
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static float m12903() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static TypedArray m12904(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static List m12905(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m12906(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static InterfaceC7640 m12907(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        int i2;
        String str;
        ArrayList arrayList;
        int i3;
        List list;
        ?? r5;
        long j;
        Throwable th;
        ?? r52;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m12906(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC7871.f21648);
        int i4 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC7871.f21647);
                        int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
                        int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i9);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m12906(xmlResourceParser);
                        }
                        arrayList2.add(new C7638(i6, i8, resourceId2, string7, string6, z));
                    } else {
                        m12906(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new C7639((C7638[]) arrayList2.toArray(new C7638[0]));
        }
        List listM12905 = m12905(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC7871.f21646);
                    int i10 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i4);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        try {
                            String string10 = typedArrayObtainAttributes3.getString(i);
                            if (string8 == null) {
                                r5 = typedArrayObtainAttributes3;
                                j = 1;
                                throw new XmlPullParserException("query attribute must be set in fallback element");
                            }
                            while (xmlResourceParser.next() != 3) {
                                try {
                                    m12906(xmlResourceParser);
                                } catch (Throwable th2) {
                                    th = th2;
                                    r52 = typedArrayObtainAttributes3;
                                    j = 1;
                                }
                            }
                            str = string5;
                            list = listM12905;
                            r5 = typedArrayObtainAttributes3;
                            arrayList = arrayList3;
                            i3 = i10;
                            i2 = integer2;
                            j = 1;
                            try {
                                C7599 c7599 = new C7599(string, string2, string8, string9, string10, list);
                                if (r5 instanceof AutoCloseable) {
                                    ((AutoCloseable) r5).close();
                                } else if (r5 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r5;
                                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r5.recycle();
                                }
                                arrayList.add(c7599);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            th = th3;
                        } catch (Throwable th4) {
                            th = th4;
                            r5 = typedArrayObtainAttributes3;
                            j = 1;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r5 = typedArrayObtainAttributes3;
                        j = 1;
                    }
                    th = th;
                    r52 = r5;
                    if (r52 == 0) {
                        throw th;
                    }
                    try {
                        if (r52 instanceof AutoCloseable) {
                            ((AutoCloseable) r52).close();
                            throw th;
                        }
                        if (!(r52 instanceof ExecutorService)) {
                            r52.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) r52;
                        if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z3 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService2.awaitTermination(j, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i2 = integer2;
                str = string5;
                arrayList = arrayList3;
                i3 = integer;
                list = listM12905;
                m12906(xmlResourceParser);
                arrayList3 = arrayList;
                listM12905 = list;
                integer2 = i2;
                string5 = str;
                i = 2;
                i5 = 3;
                integer = i3;
                i4 = 0;
            }
        }
        int i11 = integer2;
        String str2 = string5;
        ArrayList arrayList4 = arrayList3;
        int i12 = integer;
        List list2 = listM12905;
        if (!arrayList4.isEmpty()) {
            return new C7645(arrayList4, i12, i11, str2);
        }
        if (string3 == null) {
            C5925.m11310("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new C7599(string, string2, string3, null, null, list2));
        if (string4 != null) {
            arrayList4.add(new C7599(string, string2, string4, null, null, list2));
        }
        return new C7645(arrayList4, i12, i11, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m12908(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0876(this, i, 3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract void mo735(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract void mo736(Typeface typeface);
}
