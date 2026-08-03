package com.abc.core.runtime;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p000A.C0011l;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p010F.AbstractC0196a;
import p018J0.C0234d;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p065k.AbstractFutureC0975g;
import p065k.C0971c;
import p065k.C0974f;
import p072n0.C1008c;
import p079r0.C1065a;
import p082t.AbstractC1081b;
import p083u.AbstractC1084c;
import p083u.AbstractC1091j;
import p083u.AbstractC1094m;
import p083u.C1087f;
import p083u.C1092k;
import p083u.C1093l;
import p085v.AbstractC1100a;
import p085v.C1105f;
import p089x0.C1120d;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1125i;
import p089x0.C1137u;

/* JADX INFO: renamed from: f0.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0805P {

    /* JADX INFO: renamed from: a */
    public static volatile String f2920a;

    public AbstractC0805P() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: C */
    public static File m2030C(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m2031E(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m2032F(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: I */
    public static int m2033I(int i2, int i3, float f2) {
        return AbstractC1100a.m2593b(AbstractC1100a.m2595d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    /* JADX INFO: renamed from: J */
    public static Typeface m2034J(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, m2043f(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: K */
    public static MappedByteBuffer m2035K(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m2036L(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: Q */
    public static TypedValue m2037Q(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static int m2038R(Context context, int i2, int i3) {
        TypedValue typedValueM2037Q = m2037Q(context, i2);
        return (typedValueM2037Q == null || typedValueM2037Q.type != 16) ? i3 : typedValueM2037Q.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c A[Catch: NumberFormatException -> 0x0140, LOOP:3: B:46:0x00fc->B:65:0x012c, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:43:0x00e7, B:46:0x00fc, B:48:0x0102, B:52:0x010e, B:65:0x012c, B:67:0x0132, B:73:0x0147, B:75:0x014c, B:77:0x014f, B:78:0x015b, B:79:0x0160, B:80:0x0161, B:81:0x0166), top: B:106:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132 A[Catch: NumberFormatException -> 0x0140, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:43:0x00e7, B:46:0x00fc, B:48:0x0102, B:52:0x010e, B:65:0x012c, B:67:0x0132, B:73:0x0147, B:75:0x014c, B:77:0x014f, B:78:0x015b, B:79:0x0160, B:80:0x0161, B:81:0x0166), top: B:106:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147 A[Catch: NumberFormatException -> 0x0140, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:43:0x00e7, B:46:0x00fc, B:48:0x0102, B:52:0x010e, B:65:0x012c, B:67:0x0132, B:73:0x0147, B:75:0x014c, B:77:0x014f, B:78:0x015b, B:79:0x0160, B:80:0x0161, B:81:0x0166), top: B:106:0x00e7 }] */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TimeInterpolator m2039S(Context context, int i2, Interpolator interpolator) {
        int i3;
        String strTrim;
        float[] fArr;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m2032F(strValueOf, "cubic-bezier") && !m2032F(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m2032F(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return AbstractC0196a.m567b(m2053w(strArrSplit, 0), m2053w(strArrSplit, 1), m2053w(strArrSplit, 2), m2053w(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!m2032F(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < strSubstring.length()) {
            while (i6 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i6);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i6++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i6++;
                } else {
                    strTrim = strSubstring.substring(i5, i6).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i4) == 'z' || strTrim.charAt(i4) == 'Z') {
                            fArr = new float[i4];
                        } else {
                            try {
                                float[] fArr2 = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i7 = i4;
                                int i8 = 1;
                                while (i8 < length) {
                                    int i9 = i4;
                                    int i10 = i9;
                                    int i11 = i10;
                                    int i12 = i11;
                                    for (int i13 = i8; i13 < strTrim.length(); i13++) {
                                        char cCharAt2 = strTrim.charAt(i13);
                                        if (cCharAt2 == ' ') {
                                            i9 = 0;
                                            i11 = 1;
                                            if (i11 != 0) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i13 != i8 && i9 == 0) {
                                                            i9 = 0;
                                                            i11 = 1;
                                                            i12 = 1;
                                                        }
                                                        i9 = 0;
                                                        break;
                                                    case '.':
                                                        if (i10 == 0) {
                                                            i9 = 0;
                                                            i10 = 1;
                                                        } else {
                                                            i9 = 0;
                                                            i11 = 1;
                                                            i12 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i9 = 0;
                                                        break;
                                                }
                                            } else {
                                                i9 = 1;
                                            }
                                            if (i11 != 0) {
                                            }
                                        }
                                        if (i8 < i13) {
                                            fArr2[i7] = Float.parseFloat(strTrim.substring(i8, i13));
                                            i7++;
                                        }
                                        i8 = i12 == 0 ? i13 : i13 + 1;
                                        i4 = 0;
                                    }
                                    if (i8 < i13) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    i4 = 0;
                                }
                                if (i7 < 0) {
                                    throw new IllegalArgumentException();
                                }
                                int length2 = fArr2.length;
                                if (length2 < 0) {
                                    throw new ArrayIndexOutOfBoundsException();
                                }
                                fArr = new float[i7];
                                System.arraycopy(fArr2, 0, fArr, 0, Math.min(i7, length2));
                                i4 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException(AbstractC0324d.m723f("error in parsing \"", strTrim, "\""), e2);
                            }
                        }
                        arrayList.add(new C1105f(strTrim.charAt(i4), fArr));
                    }
                    i5 = i6;
                    i6++;
                    i4 = 0;
                }
            }
            strTrim = strSubstring.substring(i5, i6).trim();
            if (!strTrim.isEmpty()) {
            }
            i5 = i6;
            i6++;
            i4 = 0;
        }
        if (i6 - i5 != 1 || i5 >= strSubstring.length()) {
            i3 = 0;
        } else {
            i3 = 0;
            arrayList.add(new C1105f(strSubstring.charAt(i5), new float[0]));
        }
        try {
            C1105f.m2603b((C1105f[]) arrayList.toArray(new C1105f[i3]), path);
            return AbstractC0196a.m568c(path);
        } catch (RuntimeException e3) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e3);
        }
    }

    /* JADX INFO: renamed from: T */
    public static TypedValue m2040T(Context context, int i2, String str) {
        TypedValue typedValueM2037Q = m2037Q(context, i2);
        if (typedValueM2037Q != null) {
            return typedValueM2037Q;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    /* JADX INFO: renamed from: U */
    public static void m2041U(String str) {
        f2920a = str;
    }

    /* JADX INFO: renamed from: V */
    public static void m2042V(View view, C1123g c1123g) {
        C1065a c1065a = c1123g.f4312a.f4291b;
        if (c1065a == null || !c1065a.f4085a) {
            return;
        }
        float fM219i = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            Field field = AbstractC0080Q.f219a;
            fM219i += AbstractC0070G.m219i((View) parent);
        }
        C1122f c1122f = c1123g.f4312a;
        if (c1122f.f4302m != fM219i) {
            c1122f.f4302m = fM219i;
            c1123g.m2654n();
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m2043f(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    /* JADX INFO: renamed from: g */
    public static void m2044g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: h */
    public static boolean m2045h(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        FileOutputStream fileOutputStream;
        int i3;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                boolean z2 = false;
                ?? r1 = 0;
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        i3 = inputStreamOpenRawResource.read(bArr);
                        if (i3 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i3);
                    }
                    m2044g(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    z2 = true;
                    r1 = i3;
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    e.getMessage();
                    m2044g(fileOutputStream2);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    r1 = fileOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = fileOutputStream;
                    m2044g(r1);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
                m2044g(inputStreamOpenRawResource);
                return z2;
            } catch (Throwable th3) {
                th = th3;
                m2044g(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC0805P m2046i(int i2) {
        if (i2 != 0 && i2 == 1) {
            return new C1120d();
        }
        return new C1125i();
    }

    /* JADX INFO: renamed from: n */
    public static int m2047n(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueM2037Q = m2037Q(context, i2);
        if (typedValueM2037Q != null) {
            int i4 = typedValueM2037Q.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? AbstractC1081b.m2562a(context, i4) : typedValueM2037Q.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    /* JADX INFO: renamed from: o */
    public static int m2048o(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueM2040T = m2040T(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = typedValueM2040T.resourceId;
        return i3 != 0 ? AbstractC1081b.m2562a(context, i3) : typedValueM2040T.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f4207c == r8.hashCode()) goto L21;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m2049p(Context context, int i2) {
        ColorStateList colorStateListM2577a;
        ColorStateList colorStateList;
        C1092k c1092k;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C1093l c1093l = new C1093l(resources, theme);
        synchronized (AbstractC1094m.f4212c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC1094m.f4211b.get(c1093l);
                colorStateListM2577a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c1092k = (C1092k) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (c1092k.f4206b.equals(resources.getConfiguration())) {
                        if (theme != null || c1092k.f4207c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = c1092k.f4205a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC1094m.f4210a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListM2577a = AbstractC1084c.m2577a(resources, resources.getXml(i2), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListM2577a == null) {
            return AbstractC1091j.m2582b(resources, i2, theme);
        }
        synchronized (AbstractC1094m.f4212c) {
            try {
                WeakHashMap weakHashMap = AbstractC1094m.f4211b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c1093l);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c1093l, sparseArray2);
                }
                sparseArray2.append(i2, new C1092k(colorStateListM2577a, c1093l.f4208a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListM2577a;
    }

    /* JADX INFO: renamed from: q */
    public static ColorStateList m2050q(Context context, C0234d c0234d, int i2) {
        int resourceId;
        ColorStateList colorStateListM2049p;
        TypedArray typedArray = (TypedArray) c0234d.f475c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM2049p = m2049p(context, resourceId)) == null) ? c0234d.m645h(i2) : colorStateListM2049p;
    }

    /* JADX INFO: renamed from: r */
    public static ColorStateList m2051r(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListM2049p;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM2049p = m2049p(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM2049p;
    }

    /* JADX INFO: renamed from: t */
    public static Drawable m2052t(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableM916w;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableM916w = AbstractC0358S.m916w(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableM916w;
    }

    /* JADX INFO: renamed from: w */
    public static float m2053w(String[] strArr, int i2) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo2054A(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: B */
    public abstract int mo2055B();

    /* JADX INFO: renamed from: D */
    public abstract boolean mo2056D(float f2);

    /* JADX INFO: renamed from: G */
    public abstract boolean mo2057G(View view);

    /* JADX INFO: renamed from: H */
    public abstract boolean mo2058H(float f2, float f3);

    /* JADX INFO: renamed from: M */
    public abstract void mo2059M(int i2);

    /* JADX INFO: renamed from: N */
    public abstract void mo2060N(Typeface typeface, boolean z2);

    /* JADX INFO: renamed from: O */
    public abstract void mo2061O(C0974f c0974f, C0974f c0974f2);

    /* JADX INFO: renamed from: P */
    public abstract void mo2062P(C0974f c0974f, Thread thread);

    /* JADX INFO: renamed from: W */
    public abstract boolean mo2063W(View view, float f2);

    /* JADX INFO: renamed from: X */
    public abstract void mo2064X(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    /* JADX INFO: renamed from: a */
    public abstract int mo2065a(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: b */
    public abstract float mo2066b(int i2);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2067c(AbstractFutureC0975g abstractFutureC0975g, C0971c c0971c);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2068d(AbstractFutureC0975g abstractFutureC0975g, Object obj, Object obj2);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2069e(AbstractFutureC0975g abstractFutureC0975g, C0974f c0974f, C0974f c0974f2);

    /* JADX INFO: renamed from: j */
    public abstract Typeface mo2070j(Context context, C1087f c1087f, Resources resources, int i2);

    /* JADX INFO: renamed from: k */
    public abstract Typeface mo2071k(Context context, C0011l[] c0011lArr, int i2);

    /* JADX INFO: renamed from: l */
    public Typeface mo2072l(Context context, Resources resources, int i2, String str, int i3) {
        File fileM2030C = m2030C(context);
        if (fileM2030C == null) {
            return null;
        }
        try {
            if (m2045h(fileM2030C, resources, i2)) {
                return Typeface.createFromFile(fileM2030C.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM2030C.delete();
        }
    }

    /* JADX INFO: renamed from: m */
    public C0011l mo2073m(int i2, C0011l[] c0011lArr) {
        C1008c c1008c = new C1008c();
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        C0011l c0011l = null;
        int i4 = Integer.MAX_VALUE;
        for (C0011l c0011l2 : c0011lArr) {
            int iAbs = (Math.abs(c1008c.m2438a(c0011l2) - i3) * 2) + (c1008c.m2439b(c0011l2) == z2 ? 0 : 1);
            if (c0011l == null || i4 > iAbs) {
                c0011l = c0011l2;
                i4 = iAbs;
            }
        }
        return c0011l;
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo2074s(C1137u c1137u, float f2, float f3);

    /* JADX INFO: renamed from: u */
    public abstract int mo2075u();

    /* JADX INFO: renamed from: v */
    public abstract int mo2076v();

    /* JADX INFO: renamed from: x */
    public abstract int mo2077x();

    /* JADX INFO: renamed from: y */
    public abstract int mo2078y();

    /* JADX INFO: renamed from: z */
    public abstract int mo2079z(View view);
}
