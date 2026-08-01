package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.ljx.wechatmod.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: mp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0493mp implements InterfaceC0574ow {

    /* JADX INFO: renamed from: a */
    public static final C0431l0 f3163a;

    /* JADX INFO: renamed from: c */
    public static final Object f3165c = null;

    /* JADX INFO: renamed from: d */
    public static final C0431l0 f3166d;

    /* JADX INFO: renamed from: e */
    public static final C0431l0 f3167e;

    /* JADX INFO: renamed from: f */
    public static final C0431l0 f3168f;

    /* JADX INFO: renamed from: g */
    public static final C0431l0 f3169g;

    /* JADX INFO: renamed from: h */
    public static final C0431l0 f3170h;

    /* JADX INFO: renamed from: i */
    public static final C0431l0 f3171i;

    /* JADX INFO: renamed from: j */
    public static final C0431l0 f3172j;

    /* JADX INFO: renamed from: n */
    public static C0239fw f3176n;

    /* JADX INFO: renamed from: u */
    public static Method f3183u;

    /* JADX INFO: renamed from: v */
    public static Method f3184v;

    /* JADX INFO: renamed from: w */
    public static boolean f3185w;

    /* JADX INFO: renamed from: x */
    public static Method f3186x;

    /* JADX INFO: renamed from: y */
    public static boolean f3187y;

    /* JADX INFO: renamed from: z */
    public static Field f3188z;

    /* JADX INFO: renamed from: b */
    public static final Object[] f3164b = new Object[0];

    /* JADX INFO: renamed from: k */
    public static final C0857wi f3173k = new C0857wi(false);

    /* JADX INFO: renamed from: l */
    public static final C0857wi f3174l = new C0857wi(true);

    /* JADX INFO: renamed from: m */
    public static final C0239fw f3175m = new C0239fw(null, null, null);

    /* JADX INFO: renamed from: o */
    public static final byte[] f3177o = {112, 114, 111, 0};

    /* JADX INFO: renamed from: p */
    public static final byte[] f3178p = {112, 114, 109, 0};

    /* JADX INFO: renamed from: q */
    public static final C0426kw f3179q = new C0426kw(8);

    /* JADX INFO: renamed from: r */
    public static final C0426kw f3180r = new C0426kw(9);

    /* JADX INFO: renamed from: s */
    public static final C0426kw f3181s = new C0426kw(7);

    /* JADX INFO: renamed from: t */
    public static final C0148de f3182t = new C0148de(3);

    static {
        int i = 27;
        f3163a = new C0431l0(i, "NO_DECISION");
        f3166d = new C0431l0(i, "REMOVED_TASK");
        f3167e = new C0431l0(i, "CLOSED_EMPTY");
        f3168f = new C0431l0(i, "COMPLETING_ALREADY");
        f3169g = new C0431l0(i, "COMPLETING_WAITING_CHILDREN");
        f3170h = new C0431l0(i, "COMPLETING_RETRY");
        f3171i = new C0431l0(i, "TOO_LATE_TO_CANCEL");
        f3172j = new C0431l0(i, "SEALED");
    }

    /* JADX INFO: renamed from: A */
    public static InterfaceC0295he m1827A(InterfaceC0295he interfaceC0295he, InterfaceC0295he interfaceC0295he2) {
        m1857g("context", interfaceC0295he2);
        return interfaceC0295he2 == C0931yi.f5432a ? interfaceC0295he : (InterfaceC0295he) interfaceC0295he2.mo449h(interfaceC0295he, new C0664rb(1));
    }

    /* JADX INFO: renamed from: B */
    public static List m1828B(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC0155dl.m927a(typedArrayObtainTypedArray, 0) == 1) {
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

    /* JADX INFO: renamed from: C */
    public static int[] m1829C(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM1175F = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM1175F += (int) g80.m1175F(byteArrayInputStream, 2);
            iArr[i2] = iM1175F;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
  0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1830D(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0493mp.m1830D(android.content.Context):java.lang.String");
    }

    /* JADX INFO: renamed from: E */
    public static C0558og[] m1831E(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0558og[] c0558ogArr) throws IOException {
        byte[] bArr3 = g80.f1920n;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, g80.f1921o)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM1175F = (int) g80.m1175F(fileInputStream, 2);
            byte[] bArrM1174E = g80.m1174E(fileInputStream, (int) g80.m1175F(fileInputStream, 4), (int) g80.m1175F(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1174E);
            try {
                C0558og[] c0558ogArrM1833G = m1833G(byteArrayInputStream, bArr2, iM1175F, c0558ogArr);
                byteArrayInputStream.close();
                return c0558ogArrM1833G;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(g80.f1915i, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM1175F2 = (int) g80.m1175F(fileInputStream, 1);
        byte[] bArrM1174E2 = g80.m1174E(fileInputStream, (int) g80.m1175F(fileInputStream, 4), (int) g80.m1175F(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM1174E2);
        try {
            C0558og[] c0558ogArrM1832F = m1832F(byteArrayInputStream2, iM1175F2, c0558ogArr);
            byteArrayInputStream2.close();
            return c0558ogArrM1832F;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: F */
    public static C0558og[] m1832F(ByteArrayInputStream byteArrayInputStream, int i, C0558og[] c0558ogArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0558og[0];
        }
        if (i != c0558ogArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM1175F = (int) g80.m1175F(byteArrayInputStream, 2);
            iArr[i2] = (int) g80.m1175F(byteArrayInputStream, 2);
            strArr[i2] = new String(g80.m1173D(byteArrayInputStream, iM1175F), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0558og c0558og = c0558ogArr[i3];
            if (!c0558og.f3453b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c0558og.f3456e = i4;
            c0558og.f3459h = m1829C(byteArrayInputStream, i4);
        }
        return c0558ogArr;
    }

    /* JADX INFO: renamed from: G */
    public static C0558og[] m1833G(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0558og[] c0558ogArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0558og[0];
        }
        if (i != c0558ogArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            g80.m1175F(byteArrayInputStream, 2);
            String str = new String(g80.m1173D(byteArrayInputStream, (int) g80.m1175F(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM1175F = g80.m1175F(byteArrayInputStream, 4);
            int iM1175F = (int) g80.m1175F(byteArrayInputStream, 2);
            C0558og c0558og = null;
            if (c0558ogArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c0558ogArr.length) {
                        break;
                    }
                    if (c0558ogArr[i3].f3453b.equals(strSubstring)) {
                        c0558og = c0558ogArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c0558og == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0558og.f3455d = jM1175F;
            int[] iArrM1829C = m1829C(byteArrayInputStream, iM1175F);
            if (Arrays.equals(bArr, g80.f1919m)) {
                c0558og.f3456e = iM1175F;
                c0558og.f3459h = iArrM1829C;
            }
        }
        return c0558ogArr;
    }

    /* JADX INFO: renamed from: H */
    public static C0558og[] m1834H(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, g80.f1916j)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM1175F = (int) g80.m1175F(fileInputStream, 1);
        byte[] bArrM1174E = g80.m1174E(fileInputStream, (int) g80.m1175F(fileInputStream, 4), (int) g80.m1175F(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1174E);
        try {
            C0558og[] c0558ogArrM1835I = m1835I(byteArrayInputStream, str, iM1175F);
            byteArrayInputStream.close();
            return c0558ogArrM1835I;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: I */
    public static C0558og[] m1835I(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0558og[0];
        }
        C0558og[] c0558ogArr = new C0558og[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM1175F = (int) g80.m1175F(byteArrayInputStream, 2);
            int iM1175F2 = (int) g80.m1175F(byteArrayInputStream, 2);
            c0558ogArr[i3] = new C0558og(str, new String(g80.m1173D(byteArrayInputStream, iM1175F), StandardCharsets.UTF_8), g80.m1175F(byteArrayInputStream, 4), iM1175F2, (int) g80.m1175F(byteArrayInputStream, 4), (int) g80.m1175F(byteArrayInputStream, 4), new int[iM1175F2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C0558og c0558og = c0558ogArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c0558og.f3457f;
            int i6 = c0558og.f3458g;
            TreeMap treeMap = c0558og.f3460i;
            int i7 = iAvailable - i5;
            int iM1175F3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM1175F3 += (int) g80.m1175F(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM1175F3), 1);
                int iM1175F4 = (int) g80.m1175F(byteArrayInputStream, 2);
                while (iM1175F4 > 0) {
                    g80.m1175F(byteArrayInputStream, 2);
                    int iM1175F5 = (int) g80.m1175F(byteArrayInputStream, 1);
                    if (iM1175F5 != 6 && iM1175F5 != 7) {
                        while (iM1175F5 > 0) {
                            g80.m1175F(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM1175F6 = (int) g80.m1175F(byteArrayInputStream, 1); iM1175F6 > 0; iM1175F6--) {
                                g80.m1175F(byteArrayInputStream, 2);
                            }
                            iM1175F5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM1175F4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0558og.f3459h = m1829C(byteArrayInputStream, c0558og.f3456e);
            BitSet bitSetValueOf = BitSet.valueOf(g80.m1173D(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c0558ogArr;
    }

    /* JADX INFO: renamed from: J */
    public static TypedValue m1836J(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m1837K(Context context, int i, boolean z) {
        TypedValue typedValueM1836J = m1836J(context, i);
        return (typedValueM1836J == null || typedValueM1836J.type != 18) ? z : typedValueM1836J.data != 0;
    }

    /* JADX INFO: renamed from: L */
    public static TypedValue m1838L(Context context, int i, String str) {
        TypedValue typedValueM1836J = m1836J(context, i);
        if (typedValueM1836J != null) {
            return typedValueM1836J;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: M */
    public static void m1839M(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: P */
    public static void m1840P(Drawable drawable, int i) {
        AbstractC0187eh.m994g(drawable, i);
    }

    /* JADX INFO: renamed from: Q */
    public static void m1841Q(Drawable drawable, ColorStateList colorStateList) {
        AbstractC0187eh.m995h(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: R */
    public static void m1842R(Drawable drawable, PorterDuff.Mode mode) {
        AbstractC0187eh.m996i(drawable, mode);
    }

    /* JADX INFO: renamed from: S */
    public static void m1843S(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
    /* JADX INFO: renamed from: T */
    public static void m1844T(InterfaceC0935ym interfaceC0935ym, AbstractC0243g abstractC0243g, AbstractC0243g abstractC0243g2) {
        try {
            g80.m1177H(m1870u(((t50) interfaceC0935ym).mo35a(abstractC0243g2)), C0893xh.f5258n);
        } catch (Throwable th) {
            abstractC0243g2.mo1118f(AbstractC0274gu.m1311e(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: U */
    public static final Object[] m1845U(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        m1856f("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return f3164b;
    }

    /* JADX INFO: renamed from: V */
    public static final Object[] m1846V(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    m1855e("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objNewInstance);
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        m1856f("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: W */
    public static boolean m1847W(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0558og[] c0558ogArr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = g80.f1919m;
        byte[] bArr3 = g80.f1918l;
        byte[] bArr4 = g80.f1915i;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                g80.m1184O(byteArrayOutputStream2, c0558ogArr.length);
                int i2 = 2;
                int i3 = 2;
                for (C0558og c0558og : c0558ogArr) {
                    g80.m1183N(byteArrayOutputStream2, c0558og.f3454c, 4);
                    g80.m1183N(byteArrayOutputStream2, c0558og.f3455d, 4);
                    g80.m1183N(byteArrayOutputStream2, c0558og.f3458g, 4);
                    String strM1863m = m1863m(c0558og.f3452a, bArr4, c0558og.f3453b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strM1863m.getBytes(charset).length;
                    g80.m1184O(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strM1863m.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                hd0 hd0Var = new hd0(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(hd0Var);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < c0558ogArr.length) {
                    try {
                        C0558og c0558og2 = c0558ogArr[i4];
                        g80.m1184O(byteArrayOutputStream3, i4);
                        g80.m1184O(byteArrayOutputStream3, c0558og2.f3456e);
                        i5 = i5 + 4 + (c0558og2.f3456e * i2);
                        int[] iArr = c0558og2.f3459h;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            g80.m1184O(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                hd0 hd0Var2 = new hd0(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(hd0Var2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < c0558ogArr.length) {
                    try {
                        C0558og c0558og3 = c0558ogArr[i10];
                        Iterator it = c0558og3.f3460i.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m1849Y(byteArrayOutputStream4, c0558og3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                m1850Z(byteArrayOutputStream4, c0558og3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                g80.m1184O(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                g80.m1183N(byteArrayOutputStream3, length4, 4);
                                g80.m1184O(byteArrayOutputStream3, iIntValue);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                hd0 hd0Var3 = new hd0(4, byteArray5, true);
                byteArrayOutputStream3.close();
                arrayList.add(hd0Var3);
                long j2 = 4;
                long size = j2 + j2 + 4 + ((long) (arrayList.size() * 16));
                g80.m1183N(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    hd0 hd0Var4 = (hd0) arrayList.get(i14);
                    int i15 = hd0Var4.f2218a;
                    byte[] bArr5 = hd0Var4.f2219b;
                    if (i15 == 1) {
                        j = 0;
                    } else if (i15 == 2) {
                        j = 1;
                    } else if (i15 == 3) {
                        j = 2;
                    } else if (i15 == 4) {
                        j = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    g80.m1183N(byteArrayOutputStream, j, 4);
                    g80.m1183N(byteArrayOutputStream, size, 4);
                    if (hd0Var4.f2220c) {
                        long length5 = bArr5.length;
                        byte[] bArrM1192g = g80.m1192g(bArr5);
                        arrayList2.add(bArrM1192g);
                        g80.m1183N(byteArrayOutputStream, bArrM1192g.length, 4);
                        g80.m1183N(byteArrayOutputStream, length5, 4);
                        length = bArrM1192g.length;
                    } else {
                        arrayList2.add(bArr5);
                        g80.m1183N(byteArrayOutputStream, bArr5.length, 4);
                        g80.m1183N(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = g80.f1916j;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM1859i = m1859i(c0558ogArr, bArr6);
                g80.m1183N(byteArrayOutputStream, c0558ogArr.length, 1);
                g80.m1183N(byteArrayOutputStream, bArrM1859i.length, 4);
                byte[] bArrM1192g2 = g80.m1192g(bArrM1859i);
                g80.m1183N(byteArrayOutputStream, bArrM1192g2.length, 4);
                byteArrayOutputStream.write(bArrM1192g2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                g80.m1183N(byteArrayOutputStream, c0558ogArr.length, 1);
                for (C0558og c0558og4 : c0558ogArr) {
                    int size2 = c0558og4.f3460i.size() * 4;
                    String strM1863m2 = m1863m(c0558og4.f3452a, bArr3, c0558og4.f3453b);
                    Charset charset2 = StandardCharsets.UTF_8;
                    g80.m1184O(byteArrayOutputStream, strM1863m2.getBytes(charset2).length);
                    g80.m1184O(byteArrayOutputStream, c0558og4.f3459h.length);
                    g80.m1183N(byteArrayOutputStream, size2, 4);
                    g80.m1183N(byteArrayOutputStream, c0558og4.f3454c, 4);
                    byteArrayOutputStream.write(strM1863m2.getBytes(charset2));
                    Iterator it2 = c0558og4.f3460i.keySet().iterator();
                    while (it2.hasNext()) {
                        g80.m1184O(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        g80.m1184O(byteArrayOutputStream, 0);
                    }
                    for (int i17 : c0558og4.f3459h) {
                        g80.m1184O(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = g80.f1917k;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrM1859i2 = m1859i(c0558ogArr, bArr7);
                    g80.m1183N(byteArrayOutputStream, c0558ogArr.length, 1);
                    g80.m1183N(byteArrayOutputStream, bArrM1859i2.length, 4);
                    byte[] bArrM1192g3 = g80.m1192g(bArrM1859i2);
                    g80.m1183N(byteArrayOutputStream, bArrM1192g3.length, 4);
                    byteArrayOutputStream.write(bArrM1192g3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                g80.m1184O(byteArrayOutputStream, c0558ogArr.length);
                for (C0558og c0558og5 : c0558ogArr) {
                    String str = c0558og5.f3452a;
                    TreeMap treeMap = c0558og5.f3460i;
                    String strM1863m3 = m1863m(str, bArr2, c0558og5.f3453b);
                    Charset charset3 = StandardCharsets.UTF_8;
                    g80.m1184O(byteArrayOutputStream, strM1863m3.getBytes(charset3).length);
                    g80.m1184O(byteArrayOutputStream, treeMap.size());
                    g80.m1184O(byteArrayOutputStream, c0558og5.f3459h.length);
                    g80.m1183N(byteArrayOutputStream, c0558og5.f3454c, 4);
                    byteArrayOutputStream.write(strM1863m3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        g80.m1184O(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : c0558og5.f3459h) {
                        g80.m1184O(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: X */
    public static void m1848X(ByteArrayOutputStream byteArrayOutputStream, C0558og c0558og, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        g80.m1184O(byteArrayOutputStream, str.getBytes(charset).length);
        g80.m1184O(byteArrayOutputStream, c0558og.f3456e);
        g80.m1183N(byteArrayOutputStream, c0558og.f3457f, 4);
        g80.m1183N(byteArrayOutputStream, c0558og.f3454c, 4);
        g80.m1183N(byteArrayOutputStream, c0558og.f3458g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: Y */
    public static void m1849Y(ByteArrayOutputStream byteArrayOutputStream, C0558og c0558og) throws IOException {
        byte[] bArr = new byte[(((c0558og.f3458g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0558og.f3460i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c0558og.f3458g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: Z */
    public static void m1850Z(ByteArrayOutputStream byteArrayOutputStream, C0558og c0558og) {
        int i = 0;
        for (Map.Entry entry : c0558og.f3460i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                g80.m1184O(byteArrayOutputStream, iIntValue - i);
                g80.m1184O(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1851a(final View view, final C0588p9 c0588p9, int i, final long j, final Object obj, final int i2, final String str) {
        final int i3;
        Throwable th;
        int i4;
        Method method;
        m1857g("itemView", view);
        "vh";
        "msgInfo";
        "talker";
        Throwable th2 = null;
        if (!g40.m1154q("JStimVad4cE9KH60fZzwwCEoRKlM\n", "Tk4bxiLvgK8=\n", C0417kn.f2847a)) {
            view.setOnTouchListener(null);
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            m1852b(arrayList, view);
            if (arrayList.isEmpty()) {
                i3 = i;
                if (i3 != 34) {
                    return;
                }
            } else {
                i3 = i;
            }
            int size = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                int i8 = i6 + 1;
                if (i6 < 0) {
                    Throwable th3 = th2;
                    AbstractC0368jb.m1596b0();
                    throw th3;
                }
                View view2 = (View) ((C0723sx) obj2).f4373a;
                C0417kn.f2847a.getClass();
                String strM1693d = C0417kn.m1693d("spoof_" + j + "_" + i6, "");
                if (strM1693d.length() <= 0) {
                    th = th2;
                    i4 = i5;
                } else {
                    if (view2 instanceof TextView) {
                        ((TextView) view2).setText(strM1693d);
                    } else {
                        Class cls = C0454ln.f3029l;
                        if (cls != null && cls.isInstance(view2)) {
                            if (f3184v == null) {
                                Method[] methods = view2.getClass().getMethods();
                                m1856f("getMethods(...)", methods);
                                int length = methods.length;
                                int i9 = i5;
                                while (true) {
                                    if (i9 >= length) {
                                        th = th2;
                                        i4 = i5;
                                        method = th;
                                        break;
                                    }
                                    Method method2 = methods[i9];
                                    th = th2;
                                    if (method2.getParameterTypes().length == 1) {
                                        i4 = i5;
                                        if ((m1853c(method2.getParameterTypes()[i5], CharSequence.class) || m1853c(method2.getParameterTypes()[i4], String.class)) && method2.getName().length() <= 4) {
                                            method = method2;
                                            break;
                                        }
                                    } else {
                                        i4 = i5;
                                    }
                                    i9++;
                                    th2 = th;
                                    i5 = i4;
                                }
                                f3184v = method;
                            } else {
                                th = th2;
                                i4 = i5;
                            }
                            try {
                                Method method3 = f3184v;
                                if (method3 != null) {
                                    method3.invoke(view2, strM1693d);
                                }
                                view2.invalidate();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    th = th2;
                    i4 = i5;
                }
                i6 = i8;
                th2 = th;
                i5 = i4;
            }
            view.setOnTouchListener(new View.OnTouchListener(view, j, arrayList, c0588p9, i2, str, i3, obj) { // from class: ca

                /* JADX INFO: renamed from: a */
                public final View f850a;

                /* JADX INFO: renamed from: b */
                public final long f851b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f852c;

                /* JADX INFO: renamed from: d */
                public final C0588p9 f853d;

                /* JADX INFO: renamed from: e */
                public final int f854e;

                /* JADX INFO: renamed from: f */
                public final String f855f;

                /* JADX INFO: renamed from: g */
                public final int f856g;

                /* JADX INFO: renamed from: h */
                public final Object f857h;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:78:0x009a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0094 A[SYNTHETIC] */
                {
                    /*
                        Method dump skipped, instruction units count: 420
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC0097ca.<init>(android.view.View, long, java.util.ArrayList, p9, int, java.lang.String, int, java.lang.Object):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:1025:0x11c3 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1030:0x0f5a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1031:0x0f50 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1037:0x0fe1 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1039:0x1020 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1041:0x1012 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1049:0x1dac A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1051:0x1347 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1064:0x1330 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1066:0x131c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1076:0x0254 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1077:0x023e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1091:0x1afb A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1092:0x1aed A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:135:0x062f  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x0641  */
                /* JADX WARN: Removed duplicated region for block: B:828:0x014c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:829:0x11ca A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:831:0x0143 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:836:0x10c9 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:839:0x10be A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:841:0x1128 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:844:0x111f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:857:0x0226 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:860:0x021a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:877:0x0d8d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:881:0x1355 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:908:0x0578 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:909:0x056e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:910:0x0fe8 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:913:0x0d81 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:918:0x0658 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:919:0x064a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:920:0x0675 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:924:0x066b A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:955:0x1d9e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:967:0x0f82 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:968:0x0f70 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:970:0x1097 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:971:0x1093 A[SYNTHETIC] */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r147, android.view.MotionEvent r148) {
                    /*
                        Method dump skipped, instruction units count: 8402
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC0097ca.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        } catch (Throwable th4) {
            Class cls2 = AbstractC0922y9.f5363a;
            AbstractC0922y9.m2728a("ChatUISpoofEngine_Apply", th4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1852b(ArrayList arrayList, View view) {
        Method method;
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text != null && !i50.m1463F(text)) {
                arrayList.add(new C0723sx(view, text));
            }
        } else {
            Class cls = C0454ln.f3029l;
            if (cls != null && cls.isInstance(view)) {
                if (f3183u == null) {
                    Method[] methods = view.getClass().getMethods();
                    m1856f("getMethods(...)", methods);
                    int length = methods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        method = methods[i];
                        if (m1853c(method.getReturnType(), CharSequence.class)) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            m1856f("getParameterTypes(...)", parameterTypes);
                            if (parameterTypes.length == 0 && !m1853c(method.getName(), "getContentDescription")) {
                                break;
                            }
                        }
                        i++;
                    }
                    f3183u = method;
                }
                Method method2 = f3183u;
                Object objInvoke = method2 != null ? method2.invoke(view, null) : null;
                CharSequence charSequence = objInvoke instanceof CharSequence ? (CharSequence) objInvoke : null;
                if (charSequence != null && !i50.m1463F(charSequence)) {
                    arrayList.add(new C0723sx(view, charSequence));
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                m1856f("getChildAt(...)", childAt);
                m1852b(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1853c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m1854d(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m1839M(nullPointerException, AbstractC0493mp.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: e */
    public static void m1855e(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m1839M(nullPointerException, AbstractC0493mp.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: f */
    public static void m1856f(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(g40.m1146i(str, " must not be null"));
        m1839M(nullPointerException, AbstractC0493mp.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: g */
    public static void m1857g(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0493mp.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m1839M(nullPointerException, AbstractC0493mp.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: h */
    public static C0933yk m1858h(Context context) {
        ProviderInfo providerInfo;
        C0914y1 c0914y1;
        ApplicationInfo applicationInfo;
        C0893xh c0409kf = Build.VERSION.SDK_INT >= 28 ? new C0409kf(18) : new C0893xh(18);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0498mu.m1887d("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0914y1 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo1681m = c0409kf.mo1681m(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo1681m) {
                    arrayList.add(signature.toByteArray());
                }
                c0914y1 = new C0914y1(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c0914y1 = null;
            }
        }
        if (c0914y1 == null) {
            return null;
        }
        return new C0933yk(new C0896xk(context, c0914y1));
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m1859i(C0558og[] c0558ogArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C0558og c0558og : c0558ogArr) {
            length += ((((c0558og.f3458g * 2) + 7) & (-8)) / 8) + (c0558og.f3456e * 2) + m1863m(c0558og.f3452a, bArr, c0558og.f3453b).getBytes(StandardCharsets.UTF_8).length + 16 + c0558og.f3457f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, g80.f1917k)) {
            for (C0558og c0558og2 : c0558ogArr) {
                m1848X(byteArrayOutputStream, c0558og2, m1863m(c0558og2.f3452a, bArr, c0558og2.f3453b));
                m1850Z(byteArrayOutputStream, c0558og2);
                int[] iArr = c0558og2.f3459h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    g80.m1184O(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m1849Y(byteArrayOutputStream, c0558og2);
            }
        } else {
            for (C0558og c0558og3 : c0558ogArr) {
                m1848X(byteArrayOutputStream, c0558og3, m1863m(c0558og3.f3452a, bArr, c0558og3.f3453b));
            }
            for (C0558og c0558og4 : c0558ogArr) {
                m1850Z(byteArrayOutputStream, c0558og4);
                int[] iArr2 = c0558og4.f3459h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    g80.m1184O(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m1849Y(byteArrayOutputStream, c0558og4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1860j(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m1860j(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1861k(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = oa0.f3426a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = na0.f3255d;
        na0 na0Var = (na0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (na0Var == null) {
            na0Var = new na0();
            na0Var.f3256a = null;
            na0Var.f3257b = null;
            na0Var.f3258c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, na0Var);
        }
        WeakReference weakReference2 = na0Var.f3258c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        na0Var.f3258c = new WeakReference(keyEvent);
        if (na0Var.f3257b == null) {
            na0Var.f3257b = new SparseArray();
        }
        SparseArray sparseArray = na0Var.f3257b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !aa0.m39b(view2) || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m1862l(InterfaceC0196eq interfaceC0196eq, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0196eq != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0196eq.mo214c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f3185w) {
                            try {
                                f3186x = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f3185w = true;
                        }
                        Method method = f3186x;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (oa0.m2002b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f3187y) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f3188z = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f3187y = true;
                }
                Field field = f3188z;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (oa0.m2002b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && oa0.m2002b(view, keyEvent)) || interfaceC0196eq.mo214c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static String m1863m(String str, byte[] bArr, String str2) {
        byte[] bArr2 = g80.f1918l;
        byte[] bArr3 = g80.f1919m;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return g40.m1149l(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f1856c == r8.hashCode()) goto L21;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList m1864n(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            h10 r1 = new h10
            r1.<init>(r0, r8)
            java.lang.Object r2 = p000.j10.f2648c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p000.j10.f2647b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            g10 r5 = (p000.g10) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f1855b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f1856c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f1856c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f1854a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = p000.j10.f2646a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = p000.AbstractC0590pb.m2081a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = p000.j10.f2648c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = p000.j10.f2647b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            g10 r0 = new g10     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f2090a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = p000.f10.m1070b(r0, r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0493mp.m1864n(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX INFO: renamed from: o */
    public static float m1865o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0856wh.m2611b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: p */
    public static final float m1866p(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: q */
    public static final int m1867q(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m1868s(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static final void m1869t(InterfaceC0295he interfaceC0295he, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0482me.f3130a.iterator();
        while (it.hasNext()) {
            try {
                ((C0320i2) ((CoroutineExceptionHandler) it.next())).m1436d(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0259gf.m1248f(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0259gf.m1248f(th, new C0595pg(interfaceC0295he));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX INFO: renamed from: u */
    public static InterfaceC0814vd m1870u(InterfaceC0814vd interfaceC0814vd) {
        m1857g("<this>", interfaceC0814vd);
        t50 t50Var = interfaceC0814vd instanceof t50 ? (t50) interfaceC0814vd : null;
        if (t50Var == null || (interfaceC0814vd = t50Var.f4416c) != null) {
            return interfaceC0814vd;
        }
        InterfaceC0295he interfaceC0295he = t50Var.f4415b;
        m1854d(interfaceC0295he);
        InterfaceC0852wd interfaceC0852wd = (InterfaceC0852wd) interfaceC0295he.mo447b(C0893xh.f5246b);
        InterfaceC0814vd c0817vg = interfaceC0852wd != null ? new C0817vg((AbstractC0445le) interfaceC0852wd, t50Var) : t50Var;
        t50Var.f4416c = c0817vg;
        return c0817vg;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m1871v() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0;
    }

    /* JADX INFO: renamed from: w */
    public static List m1872w(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        m1856f("singletonList(...)", listSingletonList);
        return listSingletonList;
    }

    /* JADX INFO: renamed from: x */
    public static float m1873x(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0856wh.m2612c(edgeEffect, f, f2);
        }
        AbstractC0818vh.m2570a(edgeEffect, f, f2);
        return f;
    }

    /* JADX INFO: renamed from: y */
    public static InterfaceC0191el m1874y(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m1843S(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0049az.f650b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(4);
        String string3 = typedArrayObtainAttributes.getString(5);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(2, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
        String string4 = typedArrayObtainAttributes.getString(6);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                m1843S(xmlResourceParser);
            }
            return new C0302hl(new C0914y1(string, string2, string3, m1828B(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0049az.f651c);
                    int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                    int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                    String string6 = typedArrayObtainAttributes2.getString(i4);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        m1843S(xmlResourceParser);
                    }
                    arrayList.add(new C0265gl(i, i3, resourceId2, string6, string5, z));
                } else {
                    m1843S(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0228fl((C0265gl[]) arrayList.toArray(new C0265gl[0]));
    }

    /* JADX INFO: renamed from: z */
    public static void m1875z(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo1876N(boolean z);

    /* JADX INFO: renamed from: O */
    public abstract void mo1877O(boolean z);

    /* JADX INFO: renamed from: r */
    public abstract InputFilter[] mo1878r(InputFilter[] inputFilterArr);
}
