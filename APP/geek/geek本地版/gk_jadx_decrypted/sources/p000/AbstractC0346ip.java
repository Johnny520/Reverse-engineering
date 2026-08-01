package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.ljx.wechatmod.R;
import de.robv.android.xposed.XposedHelpers;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
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
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: ip */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0346ip implements InterfaceC0276gw {

    /* JADX INFO: renamed from: A */
    public static boolean f2470A;

    /* JADX INFO: renamed from: B */
    public static Field f2471B;

    /* JADX INFO: renamed from: a */
    public static final C0431l0 f2472a;

    /* JADX INFO: renamed from: c */
    public static final Object f2474c = null;

    /* JADX INFO: renamed from: d */
    public static final C0431l0 f2475d;

    /* JADX INFO: renamed from: e */
    public static final C0431l0 f2476e;

    /* JADX INFO: renamed from: f */
    public static final C0431l0 f2477f;

    /* JADX INFO: renamed from: g */
    public static final C0431l0 f2478g;

    /* JADX INFO: renamed from: h */
    public static final C0431l0 f2479h;

    /* JADX INFO: renamed from: i */
    public static final C0431l0 f2480i;

    /* JADX INFO: renamed from: j */
    public static final C0431l0 f2481j;

    /* JADX INFO: renamed from: n */
    public static C0944yv f2485n;

    /* JADX INFO: renamed from: u */
    public static Method f2492u;

    /* JADX INFO: renamed from: v */
    public static Method f2493v;

    /* JADX INFO: renamed from: w */
    public static boolean f2494w;

    /* JADX INFO: renamed from: x */
    public static Object f2495x;

    /* JADX INFO: renamed from: y */
    public static boolean f2496y;

    /* JADX INFO: renamed from: z */
    public static Method f2497z;

    /* JADX INFO: renamed from: b */
    public static final Object[] f2473b = new Object[0];

    /* JADX INFO: renamed from: k */
    public static final C0783ui f2482k = new C0783ui(false);

    /* JADX INFO: renamed from: l */
    public static final C0783ui f2483l = new C0783ui(true);

    /* JADX INFO: renamed from: m */
    public static final C0944yv f2484m = new C0944yv(null, null, null);

    /* JADX INFO: renamed from: o */
    public static final byte[] f2486o = {112, 114, 111, 0};

    /* JADX INFO: renamed from: p */
    public static final byte[] f2487p = {112, 114, 109, 0};

    /* JADX INFO: renamed from: q */
    public static final C0354iy f2488q = new C0354iy(6);

    /* JADX INFO: renamed from: r */
    public static final C0354iy f2489r = new C0354iy(7);

    /* JADX INFO: renamed from: s */
    public static final C0354iy f2490s = new C0354iy(5);

    /* JADX INFO: renamed from: t */
    public static final C0101ce f2491t = new C0101ce(3);

    static {
        int i = 27;
        f2472a = new C0431l0(i, "NO_DECISION");
        f2475d = new C0431l0(i, "REMOVED_TASK");
        f2476e = new C0431l0(i, "CLOSED_EMPTY");
        f2477f = new C0431l0(i, "COMPLETING_ALREADY");
        f2478g = new C0431l0(i, "COMPLETING_WAITING_CHILDREN");
        f2479h = new C0431l0(i, "COMPLETING_RETRY");
        f2480i = new C0431l0(i, "TOO_LATE_TO_CANCEL");
        f2481j = new C0431l0(i, "SEALED");
    }

    /* JADX INFO: renamed from: A */
    public static boolean m1467A() {
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

    /* JADX INFO: renamed from: B */
    public static boolean m1468B(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: C */
    public static List m1469C(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        m1502n("singletonList(...)", listSingletonList);
        return listSingletonList;
    }

    /* JADX INFO: renamed from: D */
    public static int m1470D(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: E */
    public static int m1471E(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: J */
    public static void m1472J(Context context, String str) {
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

    /* JADX INFO: renamed from: K */
    public static int[] m1473K(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM1164J = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM1164J += (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2);
            iArr[i2] = iM1164J;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
  0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1474L(android.content.Context r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0346ip.m1474L(android.content.Context):java.lang.String");
    }

    /* JADX INFO: renamed from: M */
    public static C0484mg[] m1475M(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0484mg[] c0484mgArr) throws IOException {
        byte[] bArr3 = a80.f81n;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, a80.f82o)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM1164J = (int) AbstractC0222ff.m1164J(fileInputStream, 2);
            byte[] bArrM1163I = AbstractC0222ff.m1163I(fileInputStream, (int) AbstractC0222ff.m1164J(fileInputStream, 4), (int) AbstractC0222ff.m1164J(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1163I);
            try {
                C0484mg[] c0484mgArrM1477O = m1477O(byteArrayInputStream, bArr2, iM1164J, c0484mgArr);
                byteArrayInputStream.close();
                return c0484mgArrM1477O;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(a80.f76i, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM1164J2 = (int) AbstractC0222ff.m1164J(fileInputStream, 1);
        byte[] bArrM1163I2 = AbstractC0222ff.m1163I(fileInputStream, (int) AbstractC0222ff.m1164J(fileInputStream, 4), (int) AbstractC0222ff.m1164J(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM1163I2);
        try {
            C0484mg[] c0484mgArrM1476N = m1476N(byteArrayInputStream2, iM1164J2, c0484mgArr);
            byteArrayInputStream2.close();
            return c0484mgArrM1476N;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: N */
    public static C0484mg[] m1476N(ByteArrayInputStream byteArrayInputStream, int i, C0484mg[] c0484mgArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0484mg[0];
        }
        if (i != c0484mgArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM1164J = (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC0222ff.m1162H(byteArrayInputStream, iM1164J), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0484mg c0484mg = c0484mgArr[i3];
            if (!c0484mg.f3208b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c0484mg.f3211e = i4;
            c0484mg.f3214h = m1473K(byteArrayInputStream, i4);
        }
        return c0484mgArr;
    }

    /* JADX INFO: renamed from: O */
    public static C0484mg[] m1477O(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0484mg[] c0484mgArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0484mg[0];
        }
        if (i != c0484mgArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC0222ff.m1164J(byteArrayInputStream, 2);
            String str = new String(AbstractC0222ff.m1162H(byteArrayInputStream, (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM1164J = AbstractC0222ff.m1164J(byteArrayInputStream, 4);
            int iM1164J = (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2);
            C0484mg c0484mg = null;
            if (c0484mgArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c0484mgArr.length) {
                        break;
                    }
                    if (c0484mgArr[i3].f3208b.equals(strSubstring)) {
                        c0484mg = c0484mgArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c0484mg == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0484mg.f3210d = jM1164J;
            int[] iArrM1473K = m1473K(byteArrayInputStream, iM1164J);
            if (Arrays.equals(bArr, a80.f80m)) {
                c0484mg.f3211e = iM1164J;
                c0484mg.f3214h = iArrM1473K;
            }
        }
        return c0484mgArr;
    }

    /* JADX INFO: renamed from: P */
    public static C0484mg[] m1478P(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, a80.f77j)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM1164J = (int) AbstractC0222ff.m1164J(fileInputStream, 1);
        byte[] bArrM1163I = AbstractC0222ff.m1163I(fileInputStream, (int) AbstractC0222ff.m1164J(fileInputStream, 4), (int) AbstractC0222ff.m1164J(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1163I);
        try {
            C0484mg[] c0484mgArrM1479Q = m1479Q(byteArrayInputStream, str, iM1164J);
            byteArrayInputStream.close();
            return c0484mgArrM1479Q;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static C0484mg[] m1479Q(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0484mg[0];
        }
        C0484mg[] c0484mgArr = new C0484mg[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM1164J = (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2);
            int iM1164J2 = (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2);
            c0484mgArr[i3] = new C0484mg(str, new String(AbstractC0222ff.m1162H(byteArrayInputStream, iM1164J), StandardCharsets.UTF_8), AbstractC0222ff.m1164J(byteArrayInputStream, 4), iM1164J2, (int) AbstractC0222ff.m1164J(byteArrayInputStream, 4), (int) AbstractC0222ff.m1164J(byteArrayInputStream, 4), new int[iM1164J2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C0484mg c0484mg = c0484mgArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c0484mg.f3212f;
            int i6 = c0484mg.f3213g;
            TreeMap treeMap = c0484mg.f3215i;
            int i7 = iAvailable - i5;
            int iM1164J3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM1164J3 += (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM1164J3), 1);
                int iM1164J4 = (int) AbstractC0222ff.m1164J(byteArrayInputStream, 2);
                while (iM1164J4 > 0) {
                    AbstractC0222ff.m1164J(byteArrayInputStream, 2);
                    int iM1164J5 = (int) AbstractC0222ff.m1164J(byteArrayInputStream, 1);
                    if (iM1164J5 != 6 && iM1164J5 != 7) {
                        while (iM1164J5 > 0) {
                            AbstractC0222ff.m1164J(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM1164J6 = (int) AbstractC0222ff.m1164J(byteArrayInputStream, 1); iM1164J6 > 0; iM1164J6--) {
                                AbstractC0222ff.m1164J(byteArrayInputStream, 2);
                            }
                            iM1164J5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM1164J4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0484mg.f3214h = m1473K(byteArrayInputStream, c0484mg.f3211e);
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC0222ff.m1162H(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
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
        return c0484mgArr;
    }

    /* JADX INFO: renamed from: R */
    public static void m1480R(Object obj) {
        try {
            m1482T("UPDATE rconversation SET parentRef = '' WHERE parentRef LIKE 'geek_fold_%'", obj);
            m1482T("DELETE FROM rconversation WHERE username LIKE 'geek_fold_%'", obj);
            m1482T("DELETE FROM rcontact WHERE username LIKE 'geek_fold_%'", obj);
        } catch (Throwable unused) {
            z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "GeekFolder_Restore_DB", "Fg==\n", "c8HJlSTQVfc=\n");
        }
    }

    /* JADX INFO: renamed from: S */
    public static final void m1481S(C0326i8 c0326i8, InterfaceC0444ld interfaceC0444ld, boolean z) {
        Object obj = C0326i8.f2364g.get(c0326i8);
        Throwable thMo1406e = c0326i8.mo1406e(obj);
        Object objM812f = thMo1406e != null ? AbstractC0126ct.m812f(thMo1406e) : c0326i8.mo1407g(obj);
        if (!z) {
            interfaceC0444ld.mo1241f(objM812f);
            return;
        }
        m1501m("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", interfaceC0444ld);
        C0744tg c0744tg = (C0744tg) interfaceC0444ld;
        m50 m50Var = c0744tg.f4573e;
        Object obj2 = c0744tg.f4575g;
        InterfaceC0258ge interfaceC0258ge = m50Var.f3143b;
        m1500l(interfaceC0258ge);
        Object objM1176V = AbstractC0222ff.m1176V(interfaceC0258ge, obj2);
        o80 o80VarM1489b0 = objM1176V != AbstractC0222ff.f1957x ? m1489b0(m50Var, interfaceC0258ge, objM1176V) : null;
        try {
            m50Var.mo1241f(objM812f);
            if (o80VarM1489b0 == null || o80VarM1489b0.m2001K()) {
                AbstractC0222ff.m1166L(interfaceC0258ge, objM1176V);
            }
        } catch (Throwable th) {
            if (o80VarM1489b0 == null || o80VarM1489b0.m2001K()) {
                AbstractC0222ff.m1166L(interfaceC0258ge, objM1176V);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m1482T(String str, Object obj) {
        try {
            try {
                XposedHelpers.callMethod(obj, "execSQL", new Object[]{str});
            } catch (Throwable unused) {
                XposedHelpers.callMethod(XposedHelpers.callMethod(obj, "compileStatement", new Object[]{str}), "execute", new Object[0]);
            }
        } catch (Throwable unused2) {
            z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "safeExecSQL_Failed", "Fg==\n", "c8HJlSTQVfc=\n");
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m1483U(RuntimeException runtimeException, String str) {
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

    /* JADX INFO: renamed from: W */
    public static String m1484W(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        m1502n("toString(...)", string);
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static void m1485X(InterfaceC0861wm interfaceC0861wm, AbstractC0243g abstractC0243g, AbstractC0243g abstractC0243g2) {
        try {
            a80.m30B(m1512z(((m50) interfaceC0861wm).mo471a(abstractC0243g2)), C0819vh.f4855n);
        } catch (Throwable th) {
            abstractC0243g2.mo1241f(AbstractC0126ct.m812f(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final Object[] m1486Y(Collection collection) {
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
                        m1502n("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return f2473b;
    }

    /* JADX INFO: renamed from: Z */
    public static final Object[] m1487Z(Collection collection, Object[] objArr) {
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
                    m1501m("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objNewInstance);
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
                        m1502n("copyOf(...)", objArrCopyOf2);
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
    /* JADX INFO: renamed from: a0 */
    public static boolean m1488a0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0484mg[] c0484mgArr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = a80.f80m;
        byte[] bArr3 = a80.f79l;
        byte[] bArr4 = a80.f76i;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                AbstractC0222ff.m1180Z(byteArrayOutputStream2, c0484mgArr.length);
                int i2 = 2;
                int i3 = 2;
                for (C0484mg c0484mg : c0484mgArr) {
                    AbstractC0222ff.m1179Y(byteArrayOutputStream2, c0484mg.f3209c, 4);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream2, c0484mg.f3210d, 4);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream2, c0484mg.f3213g, 4);
                    String strM1509u = m1509u(c0484mg.f3207a, bArr4, c0484mg.f3208b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strM1509u.getBytes(charset).length;
                    AbstractC0222ff.m1180Z(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strM1509u.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                cd0 cd0Var = new cd0(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(cd0Var);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < c0484mgArr.length) {
                    try {
                        C0484mg c0484mg2 = c0484mgArr[i4];
                        AbstractC0222ff.m1180Z(byteArrayOutputStream3, i4);
                        AbstractC0222ff.m1180Z(byteArrayOutputStream3, c0484mg2.f3211e);
                        i5 = i5 + 4 + (c0484mg2.f3211e * i2);
                        int[] iArr = c0484mg2.f3214h;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            AbstractC0222ff.m1180Z(byteArrayOutputStream3, i9 - i6);
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
                cd0 cd0Var2 = new cd0(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(cd0Var2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < c0484mgArr.length) {
                    try {
                        C0484mg c0484mg3 = c0484mgArr[i10];
                        Iterator it = c0484mg3.f3215i.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m1492d0(byteArrayOutputStream4, c0484mg3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                m1493e0(byteArrayOutputStream4, c0484mg3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                AbstractC0222ff.m1180Z(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                AbstractC0222ff.m1179Y(byteArrayOutputStream3, length4, 4);
                                AbstractC0222ff.m1180Z(byteArrayOutputStream3, iIntValue);
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
                cd0 cd0Var3 = new cd0(4, byteArray5, true);
                byteArrayOutputStream3.close();
                arrayList.add(cd0Var3);
                long j2 = 4;
                long size = j2 + j2 + 4 + ((long) (arrayList.size() * 16));
                AbstractC0222ff.m1179Y(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    cd0 cd0Var4 = (cd0) arrayList.get(i14);
                    int i15 = cd0Var4.f952a;
                    byte[] bArr5 = cd0Var4.f953b;
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
                    AbstractC0222ff.m1179Y(byteArrayOutputStream, j, 4);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream, size, 4);
                    if (cd0Var4.f954c) {
                        long length5 = bArr5.length;
                        byte[] bArrM1189k = AbstractC0222ff.m1189k(bArr5);
                        arrayList2.add(bArrM1189k);
                        AbstractC0222ff.m1179Y(byteArrayOutputStream, bArrM1189k.length, 4);
                        AbstractC0222ff.m1179Y(byteArrayOutputStream, length5, 4);
                        length = bArrM1189k.length;
                    } else {
                        arrayList2.add(bArr5);
                        AbstractC0222ff.m1179Y(byteArrayOutputStream, bArr5.length, 4);
                        AbstractC0222ff.m1179Y(byteArrayOutputStream, 0L, 4);
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
            byte[] bArr6 = a80.f77j;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM1504p = m1504p(c0484mgArr, bArr6);
                AbstractC0222ff.m1179Y(byteArrayOutputStream, c0484mgArr.length, 1);
                AbstractC0222ff.m1179Y(byteArrayOutputStream, bArrM1504p.length, 4);
                byte[] bArrM1189k2 = AbstractC0222ff.m1189k(bArrM1504p);
                AbstractC0222ff.m1179Y(byteArrayOutputStream, bArrM1189k2.length, 4);
                byteArrayOutputStream.write(bArrM1189k2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                AbstractC0222ff.m1179Y(byteArrayOutputStream, c0484mgArr.length, 1);
                for (C0484mg c0484mg4 : c0484mgArr) {
                    int size2 = c0484mg4.f3215i.size() * 4;
                    String strM1509u2 = m1509u(c0484mg4.f3207a, bArr3, c0484mg4.f3208b);
                    Charset charset2 = StandardCharsets.UTF_8;
                    AbstractC0222ff.m1180Z(byteArrayOutputStream, strM1509u2.getBytes(charset2).length);
                    AbstractC0222ff.m1180Z(byteArrayOutputStream, c0484mg4.f3214h.length);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream, size2, 4);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream, c0484mg4.f3209c, 4);
                    byteArrayOutputStream.write(strM1509u2.getBytes(charset2));
                    Iterator it2 = c0484mg4.f3215i.keySet().iterator();
                    while (it2.hasNext()) {
                        AbstractC0222ff.m1180Z(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        AbstractC0222ff.m1180Z(byteArrayOutputStream, 0);
                    }
                    for (int i17 : c0484mg4.f3214h) {
                        AbstractC0222ff.m1180Z(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = a80.f78k;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrM1504p2 = m1504p(c0484mgArr, bArr7);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream, c0484mgArr.length, 1);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream, bArrM1504p2.length, 4);
                    byte[] bArrM1189k3 = AbstractC0222ff.m1189k(bArrM1504p2);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream, bArrM1189k3.length, 4);
                    byteArrayOutputStream.write(bArrM1189k3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                AbstractC0222ff.m1180Z(byteArrayOutputStream, c0484mgArr.length);
                for (C0484mg c0484mg5 : c0484mgArr) {
                    String str = c0484mg5.f3207a;
                    TreeMap treeMap = c0484mg5.f3215i;
                    String strM1509u3 = m1509u(str, bArr2, c0484mg5.f3208b);
                    Charset charset3 = StandardCharsets.UTF_8;
                    AbstractC0222ff.m1180Z(byteArrayOutputStream, strM1509u3.getBytes(charset3).length);
                    AbstractC0222ff.m1180Z(byteArrayOutputStream, treeMap.size());
                    AbstractC0222ff.m1180Z(byteArrayOutputStream, c0484mg5.f3214h.length);
                    AbstractC0222ff.m1179Y(byteArrayOutputStream, c0484mg5.f3209c, 4);
                    byteArrayOutputStream.write(strM1509u3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        AbstractC0222ff.m1180Z(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : c0484mg5.f3214h) {
                        AbstractC0222ff.m1180Z(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public static final o80 m1489b0(InterfaceC0444ld interfaceC0444ld, InterfaceC0258ge interfaceC0258ge, Object obj) {
        o80 o80Var = null;
        if ((interfaceC0444ld instanceof InterfaceC0631qe) && interfaceC0258ge.mo1272b(p80.f3683a) != null) {
            InterfaceC0631qe interfaceC0631qeMo1405c = (InterfaceC0631qe) interfaceC0444ld;
            while (true) {
                if ((interfaceC0631qeMo1405c instanceof C0781ug) || (interfaceC0631qeMo1405c = interfaceC0631qeMo1405c.mo1405c()) == null) {
                    break;
                }
                if (interfaceC0631qeMo1405c instanceof o80) {
                    o80Var = (o80) interfaceC0631qeMo1405c;
                    break;
                }
            }
            if (o80Var != null) {
                o80Var.m2002L(interfaceC0258ge, obj);
            }
        }
        return o80Var;
    }

    /* JADX INFO: renamed from: c */
    public static final C0331id m1490c(InterfaceC0258ge interfaceC0258ge) {
        if (interfaceC0258ge.mo1272b(C0819vh.f4849h) == null) {
            interfaceC0258ge = interfaceC0258ge.mo1275i(new C0605pp());
        }
        return new C0331id(interfaceC0258ge);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m1491c0(ByteArrayOutputStream byteArrayOutputStream, C0484mg c0484mg, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC0222ff.m1180Z(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC0222ff.m1180Z(byteArrayOutputStream, c0484mg.f3211e);
        AbstractC0222ff.m1179Y(byteArrayOutputStream, c0484mg.f3212f, 4);
        AbstractC0222ff.m1179Y(byteArrayOutputStream, c0484mg.f3209c, 4);
        AbstractC0222ff.m1179Y(byteArrayOutputStream, c0484mg.f3213g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m1492d0(ByteArrayOutputStream byteArrayOutputStream, C0484mg c0484mg) throws IOException {
        byte[] bArr = new byte[(((c0484mg.f3213g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0484mg.f3215i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c0484mg.f3213g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m1493e0(ByteArrayOutputStream byteArrayOutputStream, C0484mg c0484mg) {
        int i = 0;
        for (Map.Entry entry : c0484mg.f3215i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC0222ff.m1180Z(byteArrayOutputStream, iIntValue - i);
                AbstractC0222ff.m1180Z(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1494f(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        m1503o("<this>", th);
        m1503o("exception", th2);
        if (th != th2) {
            Integer num = AbstractC0419kp.f2917a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0650qx.f4125a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static void m1495g(final View view, final C0179e9 c0179e9, int i, final long j, final Object obj, final int i2, final String str) {
        final int i3;
        Throwable th;
        int i4;
        Method method;
        m1503o("itemView", view);
        "vh";
        "msgInfo";
        "talker";
        Throwable th2 = null;
        if (!z30.m2772q("fEZTLpg/9ExkRU8Dsz7lTXhFdR6C\n", "FyMqcexNlSI=\n", C0267gn.f2144a)) {
            view.setOnTouchListener(null);
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            m1496h(arrayList, view);
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
                    AbstractC0062bb.m550g0();
                    throw th3;
                }
                View view2 = (View) ((C0427kx) obj2).f2976a;
                C0267gn.f2144a.getClass();
                String strM1284d = C0267gn.m1284d("spoof_" + j + "_" + i6, "");
                if (strM1284d.length() <= 0) {
                    th = th2;
                    i4 = i5;
                } else {
                    if (view2 instanceof TextView) {
                        ((TextView) view2).setText(strM1284d);
                    } else {
                        Class cls = C0340in.f2450l;
                        if (cls != null && cls.isInstance(view2)) {
                            if (f2493v == null) {
                                Method[] methods = view2.getClass().getMethods();
                                m1502n("getMethods(...)", methods);
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
                                        if ((m1497i(method2.getParameterTypes()[i5], CharSequence.class) || m1497i(method2.getParameterTypes()[i4], String.class)) && method2.getName().length() <= 4) {
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
                                f2493v = method;
                            } else {
                                th = th2;
                                i4 = i5;
                            }
                            try {
                                Method method3 = f2493v;
                                if (method3 != null) {
                                    method3.invoke(view2, strM1284d);
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
            view.setOnTouchListener(new View.OnTouchListener(view, j, arrayList, c0179e9, i2, str, i3, obj) { // from class: t9

                /* JADX INFO: renamed from: a */
                public final View f4549a;

                /* JADX INFO: renamed from: b */
                public final long f4550b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f4551c;

                /* JADX INFO: renamed from: d */
                public final C0179e9 f4552d;

                /* JADX INFO: renamed from: e */
                public final int f4553e;

                /* JADX INFO: renamed from: f */
                public final String f4554f;

                /* JADX INFO: renamed from: g */
                public final int f4555g;

                /* JADX INFO: renamed from: h */
                public final Object f4556h;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00dd A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x00da A[SYNTHETIC] */
                {
                    /*
                        Method dump skipped, instruction units count: 358
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC0737t9.<init>(android.view.View, long, java.util.ArrayList, e9, int, java.lang.String, int, java.lang.Object):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:1001:0x09ee A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1002:0x09e1 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1007:0x0a74 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1024:0x0d3f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1026:0x0d32 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1037:0x1684 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1038:0x167d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1044:0x1c14 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1045:0x1c06 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1062:0x1a21 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1064:0x1a0d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1073:0x1315 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1084:0x142a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1089:0x146f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1094:0x1594 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1104:0x1cc2 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1106:0x1cb2 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:1155:0x1dc9 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:640:0x1d20  */
                /* JADX WARN: Removed duplicated region for block: B:642:0x1d30  */
                /* JADX WARN: Removed duplicated region for block: B:674:0x1e18  */
                /* JADX WARN: Removed duplicated region for block: B:675:0x1e1f  */
                /* JADX WARN: Removed duplicated region for block: B:852:0x183b A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:869:0x04bf A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:870:0x1585 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:872:0x04ae A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:876:0x1431 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:878:0x02e7 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:880:0x02cd A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:883:0x0330 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:885:0x0323 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:894:0x147f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:899:0x0dac A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:901:0x0da2 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:904:0x04e3 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:906:0x04cf A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:909:0x1307 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:912:0x1dbf A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:914:0x04ff A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:916:0x04f5 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:944:0x182a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:949:0x0a9b A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:952:0x0a95 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:983:0x0a5d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:988:0x0e7e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:989:0x0e71 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:991:0x099b A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:994:0x098e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:997:0x09be A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:998:0x09b1 A[SYNTHETIC] */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r144, android.view.MotionEvent r145) {
                    /*
                        Method dump skipped, instruction units count: 8518
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnTouchListenerC0737t9.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        } catch (Throwable th4) {
            Class cls2 = AbstractC0514n9.f3353a;
            AbstractC0514n9.m1922a("ChatUISpoofEngine_Apply", th4);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m1496h(ArrayList arrayList, View view) {
        Method method;
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text != null && !b50.m522H(text)) {
                arrayList.add(new C0427kx(view, text));
            }
        } else {
            Class cls = C0340in.f2450l;
            if (cls != null && cls.isInstance(view)) {
                if (f2492u == null) {
                    Method[] methods = view.getClass().getMethods();
                    m1502n("getMethods(...)", methods);
                    int length = methods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        method = methods[i];
                        if (m1497i(method.getReturnType(), CharSequence.class)) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            m1502n("getParameterTypes(...)", parameterTypes);
                            if (parameterTypes.length == 0 && !m1497i(method.getName(), "getContentDescription")) {
                                break;
                            }
                        }
                        i++;
                    }
                    f2492u = method;
                }
                Method method2 = f2492u;
                Object objInvoke = method2 != null ? method2.invoke(view, null) : null;
                CharSequence charSequence = objInvoke instanceof CharSequence ? (CharSequence) objInvoke : null;
                if (charSequence != null && !b50.m522H(charSequence)) {
                    arrayList.add(new C0427kx(view, charSequence));
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                m1502n("getChildAt(...)", childAt);
                m1496h(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1497i(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1498j(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = m1499k(r8, r9, r10)
            boolean r1 = m1499k(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = m1470D(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0346ip.m1498j(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1499k(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: l */
    public static void m1500l(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m1483U(nullPointerException, AbstractC0346ip.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: m */
    public static void m1501m(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m1483U(nullPointerException, AbstractC0346ip.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: n */
    public static void m1502n(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(z30.m2764i(str, " must not be null"));
        m1483U(nullPointerException, AbstractC0346ip.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: o */
    public static void m1503o(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0346ip.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m1483U(nullPointerException, AbstractC0346ip.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m1504p(C0484mg[] c0484mgArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C0484mg c0484mg : c0484mgArr) {
            length += ((((c0484mg.f3213g * 2) + 7) & (-8)) / 8) + (c0484mg.f3211e * 2) + m1509u(c0484mg.f3207a, bArr, c0484mg.f3208b).getBytes(StandardCharsets.UTF_8).length + 16 + c0484mg.f3212f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, a80.f78k)) {
            for (C0484mg c0484mg2 : c0484mgArr) {
                m1491c0(byteArrayOutputStream, c0484mg2, m1509u(c0484mg2.f3207a, bArr, c0484mg2.f3208b));
                m1493e0(byteArrayOutputStream, c0484mg2);
                int[] iArr = c0484mg2.f3214h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    AbstractC0222ff.m1180Z(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m1492d0(byteArrayOutputStream, c0484mg2);
            }
        } else {
            for (C0484mg c0484mg3 : c0484mgArr) {
                m1491c0(byteArrayOutputStream, c0484mg3, m1509u(c0484mg3.f3207a, bArr, c0484mg3.f3208b));
            }
            for (C0484mg c0484mg4 : c0484mgArr) {
                m1493e0(byteArrayOutputStream, c0484mg4);
                int[] iArr2 = c0484mg4.f3214h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    AbstractC0222ff.m1180Z(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m1492d0(byteArrayOutputStream, c0484mg4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1505q(File file) {
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
            z = m1505q(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1506r(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = ja0.f2600a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = ia0.f2401d;
        ia0 ia0Var = (ia0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (ia0Var == null) {
            ia0Var = new ia0();
            ia0Var.f2402a = null;
            ia0Var.f2403b = null;
            ia0Var.f2404c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, ia0Var);
        }
        WeakReference weakReference2 = ia0Var.f2404c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        ia0Var.f2404c = new WeakReference(keyEvent);
        if (ia0Var.f2403b == null) {
            ia0Var.f2403b = new SparseArray();
        }
        SparseArray sparseArray = ia0Var.f2403b;
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
        if (view2 == null || !v90.m2495b(view2) || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1507s(InterfaceC0040aq interfaceC0040aq, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0040aq != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0040aq.mo229c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f2496y) {
                            try {
                                f2497z = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f2496y = true;
                        }
                        Method method = f2497z;
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
                if (ja0.m1565b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f2470A) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f2471B = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f2470A = true;
                }
                Field field = f2471B;
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
                if (ja0.m1565b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && ja0.m1565b(view, keyEvent)) || interfaceC0040aq.mo229c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC0258ge m1508t(InterfaceC0258ge interfaceC0258ge, InterfaceC0258ge interfaceC0258ge2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C0295he c0295he = C0295he.f2274d;
        boolean zBooleanValue = ((Boolean) interfaceC0258ge.mo1274h(bool, c0295he)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0258ge2.mo1274h(bool, c0295he)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0258ge.mo1275i(interfaceC0258ge2);
        }
        C0295he c0295he2 = new C0295he(2, 5);
        C0857wi c0857wi = C0857wi.f4966a;
        InterfaceC0258ge interfaceC0258ge3 = (InterfaceC0258ge) interfaceC0258ge.mo1274h(c0857wi, c0295he2);
        Object objMo1274h = interfaceC0258ge2;
        if (zBooleanValue2) {
            objMo1274h = interfaceC0258ge2.mo1274h(c0857wi, C0295he.f2273c);
        }
        return interfaceC0258ge3.mo1275i((InterfaceC0258ge) objMo1274h);
    }

    /* JADX INFO: renamed from: u */
    public static String m1509u(String str, byte[] bArr, String str2) {
        byte[] bArr2 = a80.f79l;
        byte[] bArr3 = a80.f80m;
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
                return z30.m2767l(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f5433c == r8.hashCode()) goto L21;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList m1510v(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            a10 r1 = new a10
            r1.<init>(r0, r8)
            java.lang.Object r2 = p000.c10.f881c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p000.c10.f880b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            z00 r5 = (p000.z00) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f5432b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f5433c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f5433c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f5431a     // Catch: java.lang.Throwable -> L3c
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
            java.lang.ThreadLocal r2 = p000.c10.f879a
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
            android.content.res.ColorStateList r4 = p000.AbstractC0292hb.m1351a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = p000.c10.f881c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = p000.c10.f880b     // Catch: java.lang.Throwable -> L9f
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
            z00 r0 = new z00     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f10a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = p000.y00.m2642b(r0, r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0346ip.m1510v(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX INFO: renamed from: x */
    public static ArrayList m1511x(MaterialToolbar materialToolbar, CharSequence charSequence) {
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

    /* JADX INFO: renamed from: z */
    public static InterfaceC0444ld m1512z(InterfaceC0444ld interfaceC0444ld) {
        m1503o("<this>", interfaceC0444ld);
        m50 m50Var = interfaceC0444ld instanceof m50 ? (m50) interfaceC0444ld : null;
        if (m50Var == null || (interfaceC0444ld = m50Var.f3144c) != null) {
            return interfaceC0444ld;
        }
        InterfaceC0258ge interfaceC0258ge = m50Var.f3143b;
        m1500l(interfaceC0258ge);
        InterfaceC0481md interfaceC0481md = (InterfaceC0481md) interfaceC0258ge.mo1272b(C0819vh.f4843b);
        InterfaceC0444ld c0744tg = interfaceC0481md != null ? new C0744tg((AbstractC0408ke) interfaceC0481md, m50Var) : m50Var;
        m50Var.f3144c = c0744tg;
        return c0744tg;
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo1276F(Throwable th);

    /* JADX INFO: renamed from: G */
    public abstract View mo1513G(int i);

    /* JADX INFO: renamed from: H */
    public abstract boolean mo1514H();

    /* JADX INFO: renamed from: I */
    public abstract void mo1277I(C0009a8 c0009a8);

    /* JADX INFO: renamed from: V */
    public abstract void mo1515V(Object obj, float f);

    /* JADX INFO: renamed from: w */
    public abstract void mo1336w(p30 p30Var, float f, float f2);

    /* JADX INFO: renamed from: y */
    public abstract float mo1516y(Object obj);
}
