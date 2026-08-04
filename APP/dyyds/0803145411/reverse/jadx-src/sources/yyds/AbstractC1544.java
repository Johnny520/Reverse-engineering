package yyds;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛷᛴᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1544 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final Object[] f7844 = new Object[0];

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1985 f7845 = new C1985(22);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static volatile boolean f7846 = true;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static int m3183(String str, int i, int i2) {
        return (int) m3185(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static Drawable m3184(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f7846) {
                return m3186(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f7846 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC2042.f10157;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final long m3185(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC1445.f6859;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM1692 = AbstractC0733.m1692(property);
        if (lM1692 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM1692.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Drawable m3186(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C0586 c0586 = new C0586(context);
            c0586.f2797 = theme;
            Configuration configuration = theme.getResources().getConfiguration();
            if (c0586.f2795 != null) {
                C0188.m800("getResources() or getAssets() has already been called");
            } else if (c0586.f2799 == null) {
                c0586.f2799 = new Configuration(configuration);
            } else {
                C0188.m800("Override configuration has already been set");
            }
            context = c0586;
        }
        return AbstractC1367.m2767(context, i);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final void m3187(LinkedHashMap linkedHashMap, View view) {
        Pair pair;
        if (view instanceof ViewGroup) {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof TextView) && childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            if (arrayList.size() == 2) {
                TextView textView = (TextView) arrayList.get(0);
                TextView textView2 = (TextView) arrayList.get(1);
                String string = textView.getText().toString();
                String string2 = textView2.getText().toString();
                int i2 = 0;
                while (true) {
                    if (i2 < string.length()) {
                        if (!Character.isDigit(string.charAt(i2))) {
                            break;
                        } else {
                            i2++;
                        }
                    } else if (!AbstractC0473.m1313(string2)) {
                        pair = new Pair(string2, textView);
                    }
                }
                int i3 = 0;
                while (true) {
                    if (i3 < string2.length()) {
                        if (!Character.isDigit(string2.charAt(i3))) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!AbstractC0473.m1313(string)) {
                        pair = new Pair(string, textView2);
                    }
                }
                pair = new Pair(null, null);
                String str = (String) pair.component1();
                TextView textView3 = (TextView) pair.component2();
                if (str != null && textView3 != null) {
                    linkedHashMap.put(str, textView3);
                }
            }
            int childCount2 = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = viewGroup.getChildAt(i4);
                AbstractC2328.m4341(-763988355482478L);
                m3187(linkedHashMap, childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m3188(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final void m3189(Object obj) throws Throwable {
        if (obj instanceof C2658) {
            throw ((C2658) obj).f13058;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3190(Context context, Executor executor, InterfaceC0535 interfaceC0535, boolean z) {
        boolean z2;
        ?? M2035;
        C2265[] c2265ArrM2773;
        C2265[] c2265Arr;
        C2265[] c2265Arr2;
        byte[] bArr;
        ?? r7;
        boolean z3;
        Throwable th;
        Throwable th2;
        ?? r72;
        boolean z4;
        boolean z5;
        ?? r73;
        ByteArrayOutputStream byteArrayOutputStream;
        C0918 c0918;
        ?? r74;
        String str;
        FileInputStream fileInputStreamM2035;
        ?? r75;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j == packageInfo.lastUpdateTime;
                            if (z6) {
                                interfaceC0535.mo1274(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                    if (z6) {
                    }
                } else {
                    z6 = false;
                    if (z6) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC1967.m3798(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = AbstractC1367.f6360;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0918 c09182 = new C0918(assets, executor, interfaceC0535, name, file2);
            byte[] bArr3 = c09182.f4215;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c09182.m2036(4, null);
                    }
                    c09182.f4216 = true;
                    try {
                        M2035 = c09182.m2035(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC0535.mo1274(6, e);
                        M2035 = 0;
                    } catch (IOException e2) {
                        interfaceC0535.mo1274(7, e2);
                        M2035 = 0;
                    }
                    try {
                        if (M2035 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e3) {
                                    interfaceC0535.mo1274(8, e3);
                                    try {
                                        M2035.close();
                                    } catch (IOException e4) {
                                        interfaceC0535.mo1274(7, e4);
                                    }
                                    c2265ArrM2773 = null;
                                    c09182.f4214 = c2265ArrM2773;
                                    c2265Arr = c09182.f4214;
                                    if (c2265Arr != null) {
                                    }
                                    InterfaceC0535 interfaceC05352 = c09182.f4213;
                                    c2265Arr2 = c09182.f4214;
                                    byte[] bArr4 = c09182.f4215;
                                    ?? r76 = M2035;
                                    r76 = M2035;
                                    if (c2265Arr2 != null) {
                                    }
                                    bArr = c09182.f4210;
                                    if (bArr != null) {
                                    }
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    AbstractC1967.m3798(context, (z4 || !z) ? 0 : r75);
                                }
                            } catch (IOException e5) {
                                interfaceC0535.mo1274(7, e5);
                                M2035.close();
                                c2265ArrM2773 = null;
                                c09182.f4214 = c2265ArrM2773;
                                c2265Arr = c09182.f4214;
                                if (c2265Arr != null) {
                                }
                                InterfaceC0535 interfaceC053522 = c09182.f4213;
                                c2265Arr2 = c09182.f4214;
                                byte[] bArr42 = c09182.f4215;
                                ?? r762 = M2035;
                                r762 = M2035;
                                if (c2265Arr2 != null) {
                                }
                                bArr = c09182.f4210;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                z4 = z3;
                                r75 = r72;
                                AbstractC1967.m3798(context, (z4 || !z) ? 0 : r75);
                            }
                            if (!Arrays.equals(bArr2, AbstractC0797.m1812(M2035, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c2265ArrM2773 = AbstractC1367.m2773(M2035, AbstractC0797.m1812(M2035, 4), c09182.f4211);
                            try {
                                M2035.close();
                            } catch (IOException e6) {
                                interfaceC0535.mo1274(7, e6);
                            }
                            c09182.f4214 = c2265ArrM2773;
                        }
                        c2265Arr = c09182.f4214;
                        if (c2265Arr != null && (M2035 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM2035 = c09182.m2035(assets, "dexopt/baseline.profm");
                                r74 = str;
                            } catch (FileNotFoundException e7) {
                                interfaceC0535.mo1274(9, e7);
                                r74 = M2035;
                            } catch (IOException e8) {
                                interfaceC0535.mo1274(7, e8);
                                r74 = M2035;
                            } catch (IllegalStateException e9) {
                                c09182.f4214 = null;
                                interfaceC0535.mo1274(8, e9);
                                r74 = M2035;
                            }
                            if (fileInputStreamM2035 == null) {
                                try {
                                    if (!Arrays.equals(AbstractC1367.f6361, AbstractC0797.m1812(fileInputStreamM2035, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM1812 = AbstractC0797.m1812(fileInputStreamM2035, 4);
                                    c09182.f4214 = AbstractC1367.m2772(fileInputStreamM2035, bArrM1812, bArr3, c2265Arr);
                                    fileInputStreamM2035.close();
                                    c0918 = c09182;
                                    M2035 = bArrM1812;
                                    if (c0918 != null) {
                                        c09182 = c0918;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM2035 != null) {
                                    fileInputStreamM2035.close();
                                    r74 = str;
                                }
                                c0918 = null;
                                M2035 = r74;
                                if (c0918 != null) {
                                }
                            }
                        }
                        InterfaceC0535 interfaceC0535222 = c09182.f4213;
                        c2265Arr2 = c09182.f4214;
                        byte[] bArr422 = c09182.f4215;
                        ?? r7622 = M2035;
                        r7622 = M2035;
                        if (c2265Arr2 != null && bArr422 != null) {
                            z5 = c09182.f4216;
                            if (z5) {
                                C0188.m800("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr422);
                                } finally {
                                }
                            } catch (IOException e10) {
                                interfaceC0535222.mo1274(7, e10);
                                r73 = z5;
                            } catch (IllegalStateException e11) {
                                interfaceC0535222.mo1274(8, e11);
                                r73 = z5;
                            }
                            if (AbstractC1367.m2779(byteArrayOutputStream, bArr422, c2265Arr2)) {
                                c09182.f4210 = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                r73 = byteArrayOutputStream;
                                c09182.f4214 = null;
                                r7622 = r73;
                            } else {
                                interfaceC0535222.mo1274(5, null);
                                c09182.f4214 = null;
                                byteArrayOutputStream.close();
                                r7622 = byteArrayOutputStream;
                            }
                        }
                        bArr = c09182.f4210;
                        if (bArr != null) {
                            z3 = false;
                            r72 = 1;
                        } else {
                            try {
                                if (!c09182.f4216) {
                                    C0188.m800("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c09182.f4217);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i = byteArrayInputStream.read(bArr5);
                                                                                    if (i <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i);
                                                                                    }
                                                                                }
                                                                                r72 = 1;
                                                                                c09182.m2036(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c09182.f4210 = null;
                                                                                c09182.f4214 = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        r7622 = 1;
                                        c09182.m2036(6, e);
                                        r7 = r7622;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        AbstractC1967.m3798(context, (z4 || !z) ? 0 : r75);
                                    } catch (IOException e13) {
                                        e = e13;
                                        r7622 = 1;
                                        c09182.m2036(7, e);
                                        r7 = r7622;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        AbstractC1967.m3798(context, (z4 || !z) ? 0 : r75);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    c09182.m2036(6, e);
                                    r7 = r7622;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    AbstractC1967.m3798(context, (z4 || !z) ? 0 : r75);
                                } catch (IOException e15) {
                                    e = e15;
                                    c09182.m2036(7, e);
                                    r7 = r7622;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    AbstractC1967.m3798(context, (z4 || !z) ? 0 : r75);
                                }
                            } finally {
                                c09182.f4210 = null;
                                c09182.f4214 = null;
                            }
                        }
                        if (z3) {
                            m3196(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r75 = r72;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c09182.m2036(4, null);
                        }
                        c09182.f4216 = true;
                        M2035 = c09182.m2035(assets, "dexopt/baseline.prof");
                        if (M2035 != 0) {
                        }
                        c2265Arr = c09182.f4214;
                        if (c2265Arr != null) {
                            str = "dexopt/baseline.profm";
                            fileInputStreamM2035 = c09182.m2035(assets, "dexopt/baseline.profm");
                            r74 = str;
                            if (fileInputStreamM2035 == null) {
                            }
                        }
                        InterfaceC0535 interfaceC05352222 = c09182.f4213;
                        c2265Arr2 = c09182.f4214;
                        byte[] bArr4222 = c09182.f4215;
                        ?? r76222 = M2035;
                        r76222 = M2035;
                        if (c2265Arr2 != null) {
                            z5 = c09182.f4216;
                            if (z5) {
                            }
                        }
                        bArr = c09182.f4210;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                        z4 = z3;
                        r75 = r72;
                    } catch (IOException unused2) {
                        z2 = true;
                        c09182.m2036(4, null);
                    }
                }
                AbstractC1967.m3798(context, (z4 || !z) ? 0 : r75);
            }
            c09182.m2036(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r75 = z2;
            AbstractC1967.m3798(context, (z4 || !z) ? 0 : r75);
        } catch (PackageManager.NameNotFoundException e16) {
            interfaceC0535.mo1274(7, e16);
            AbstractC1967.m3798(context, false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m3191(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final Object[] m3192(Collection collection, Object[] objArr) {
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
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
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
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

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static View m3193(ViewGroup viewGroup, InterfaceC1549 interfaceC1549) {
        C2807 c2807M1485;
        int i;
        int i2;
        View viewM3193;
        AbstractC2328.m4341(-762403512550254L);
        if (viewGroup == null || (i = (c2807M1485 = AbstractC0598.m1485(0, viewGroup.getChildCount())).f12492) > (i2 = c2807M1485.f12493)) {
            return null;
        }
        while (true) {
            View childAt = viewGroup.getChildAt(i);
            AbstractC2328.m4341(-762446462223214L);
            if (((Boolean) interfaceC1549.mo371(childAt)).booleanValue()) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewM3193 = m3193((ViewGroup) childAt, interfaceC1549)) != null) {
                return viewM3193;
            }
            if (i == i2) {
                return null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static void m3194(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static void m3195(RuntimeException runtimeException, String str) {
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

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static void m3196(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m3197(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final Object[] m3198(Collection collection) {
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
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return f7844;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c A[EDGE_INSN: B:44:0x008c->B:40:0x008c BREAK  A[LOOP:0: B:10:0x0011->B:48:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m3199(C2225 c2225, int i, int i2) {
        Pair pair;
        boolean z;
        if (i == i2) {
            return C1860.f9345;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = c2225.f10988;
                if (z2) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        pair = new Pair(treeMap, treeMap.keySet());
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    pair = treeMap2 == null ? null : new Pair(treeMap2, treeMap2.descendingKeySet());
                }
                if (pair != null) {
                    break;
                }
                Map map = (Map) pair.component1();
                Iterator it = ((Iterable) pair.component2()).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!z2) {
                        if (i2 <= iIntValue && iIntValue < i) {
                            arrayList.add(map.get(Integer.valueOf(iIntValue)));
                            z = true;
                            i = iIntValue;
                            break;
                            break;
                        }
                    } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                        arrayList.add(map.get(Integer.valueOf(iIntValue)));
                        z = true;
                        i = iIntValue;
                        break;
                    }
                }
                z = false;
            } else {
                if (i <= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap2 = c2225.f10988;
                if (z2) {
                }
                if (pair != null) {
                }
            }
        } while (z);
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C2658 m3200(Throwable th) {
        return new C2658(th);
    }
}
