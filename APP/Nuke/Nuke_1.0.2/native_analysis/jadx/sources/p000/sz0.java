package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.inputmethod.InputMethodManager;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sz0 implements j92, InterfaceC0930yo, InterfaceC0101cp, ga1, ys2, q01, gh2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10435h;

    /* JADX INFO: renamed from: i */
    public Object f10436i;

    /* JADX INFO: renamed from: j */
    public Object f10437j;

    public sz0(int i) {
        this.f10435h = i;
        switch (i) {
            case 13:
                this.f10436i = new bb2(0);
                this.f10437j = new bb2(0);
                break;
            case 15:
                this.f10436i = new HashMap();
                this.f10437j = new C0210fo(1);
                break;
            case 18:
                this.f10436i = new ArrayList();
                this.f10437j = new ArrayList();
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                this.f10436i = new er0(null);
                this.f10437j = new HashMap();
                break;
            case 26:
                this.f10436i = new AtomicReference();
                this.f10437j = new C0276hg(0);
                break;
            case 28:
                this.f10436i = new rk1();
                this.f10437j = new rk1();
                break;
            default:
                this.f10436i = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m5024A(File file, File file2) throws IOException {
        String path = file.getPath();
        String path2 = file2.getPath();
        if (t11.m5086l(path2, path)) {
            return;
        }
        path2.getClass();
        if (wv2.m6012d0(path2, path + File.separator, false)) {
            return;
        }
        c80.m678v("Script path escapes the script root: ".concat(path2));
    }

    /* JADX INFO: renamed from: k */
    public static final File m5025k(sz0 sz0Var) throws IOException {
        File canonicalFile = ((File) sz0Var.f10437j).getCanonicalFile();
        if (canonicalFile.isDirectory() && !Files.isSymbolicLink(canonicalFile.toPath())) {
            return canonicalFile;
        }
        c80.m678v(vi0.m5690i("Script root is not a readable directory: ", canonicalFile.getPath()));
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static String m5026r(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX INFO: renamed from: s */
    public static void m5027s(File file, File file2, pb1 pb1Var) throws IOException {
        if (Files.isSymbolicLink(file2.toPath())) {
            c80.m678v(vi0.m5690i("Symbolic links are not supported in script packages: ", file2.getPath()));
            return;
        }
        File canonicalFile = file2.getCanonicalFile();
        canonicalFile.getClass();
        m5024A(file, canonicalFile);
        if (canonicalFile.isFile()) {
            String string = file.toPath().relativize(canonicalFile.toPath()).toString();
            o72 o72Var = oi2.f7689i;
            pb1Var.add(new oi2(xe1.m6107Y(string)));
        } else if (canonicalFile.isDirectory()) {
            File[] fileArrListFiles = canonicalFile.listFiles();
            if (fileArrListFiles == null) {
                c80.m678v(vi0.m5690i("Unable to list script directory: ", canonicalFile.getPath()));
                return;
            }
            for (File file3 : AbstractC0460mg.m3103r0(fileArrListFiles, new sl0(13))) {
                file3.getClass();
                m5027s(file, file3, pb1Var);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static C0842wc m5028z(ImageDecoder.Source source, int i, int i2, ov1 ov1Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new a60(i, i2, ov1Var));
        if (AbstractC0005a4.m52w(drawableDecodeDrawable)) {
            return new C0842wc(0, AbstractC0005a4.m36g(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public ClassLoader m5029B(ClassLoader classLoader, File file) throws IOException {
        File file2;
        Iterator it;
        File file3;
        File file4;
        f80 f80Var;
        z70 z70Var;
        Iterator it2;
        File file5;
        File file6;
        f80 f80Var2;
        int i;
        z70 z70Var2;
        LinkedHashMap linkedHashMap;
        C0953z8 c0953z8;
        int i2;
        ue0 ue0Var;
        bb2 bb2Var;
        dq1 dq1Var;
        C0043b5 c0043b5;
        n30 n30Var;
        int i3;
        Object[] objArr;
        C0964zj c0964zjM553i;
        int iM5598f;
        int i4;
        boolean z;
        bb2 bb2Var2;
        v01 v01Var;
        v01 v01Var2;
        int i5;
        int i6;
        Iterator it3;
        File[] fileArrM4823L;
        sz0 sz0Var = this;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) sz0Var.f10436i;
        ClassLoader classLoader2 = null;
        if (file == null) {
            String property = System.getProperty("dexmaker.dexcache");
            if (property != null) {
                file2 = new File(property);
            } else {
                try {
                    ClassLoader classLoader3 = AbstractC0691se.class.getClassLoader();
                    Class<?> cls = Class.forName("dalvik.system.PathClassLoader");
                    cls.cast(classLoader3);
                    fileArrM4823L = AbstractC0691se.m4823L(AbstractC0691se.m4817F(classLoader3, cls));
                } catch (ClassCastException | ClassNotFoundException unused) {
                }
                file2 = fileArrM4823L.length > 0 ? fileArrM4823L[0] : null;
                if (file2 == null) {
                    C0676s.m4651j("dexcache == null (and no default could be found; consider setting the 'dexmaker.dexcache' system property)");
                    return null;
                }
            }
        } else {
            file2 = file;
        }
        Set setKeySet = linkedHashMap2.keySet();
        Iterator it4 = setKeySet.iterator();
        int size = setKeySet.size();
        int[] iArr = new int[size];
        int i7 = 0;
        while (it4.hasNext()) {
            f80 f80VarM5035H = sz0Var.m5035H((a63) it4.next());
            Set setKeySet2 = f80VarM5035H.f2854i.keySet();
            a63 a63Var = f80VarM5035H.f2849d;
            if (a63Var != null) {
                iArr[i7] = setKeySet2.hashCode() + ((Arrays.hashCode(f80VarM5035H.f2851f.f2329a) + (a63Var.f95a.hashCode() * 31)) * 31);
                i7++;
            }
        }
        Arrays.sort(iArr);
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        File file7 = new File(file2, hk1.m2208g(i8, "Generated_", ".jar"));
        if (file7.exists()) {
            if (!file7.canWrite()) {
                return sz0Var.m5030C(file7, file2, classLoader);
            }
            file7.delete();
        }
        int i10 = 16;
        if (((z70) sz0Var.f10437j) == null) {
            sz0Var.f10437j = new z70(new C0953z8(i10));
        }
        Iterator it5 = linkedHashMap2.values().iterator();
        while (it5.hasNext()) {
            f80 f80Var3 = (f80) it5.next();
            z70 z70Var3 = (z70) sz0Var.f10437j;
            LinkedHashMap linkedHashMap3 = f80Var3.f2854i;
            LinkedHashMap linkedHashMap4 = f80Var3.f2853h;
            a63 a63Var2 = f80Var3.f2846a;
            if (!f80Var3.f2847b) {
                StringBuilder sb = new StringBuilder("Undeclared type ");
                sb.append(a63Var2);
                sb.append(" declares members: ");
                sb.append(linkedHashMap4.keySet());
                Set setKeySet3 = linkedHashMap3.keySet();
                sb.append(" ");
                sb.append(setKeySet3);
                throw new IllegalStateException(sb.toString());
            }
            C0953z8 c0953z82 = new C0953z8(i10);
            r30 r30Var = a63Var2.f97c;
            if (f80Var3.f2852g == null) {
                ClassLoader classLoader4 = classLoader2;
                int i11 = 1;
                it = it5;
                f80Var3.f2852g = new C0897xs(r30Var, f80Var3.f2848c, f80Var3.f2849d.f97c, f80Var3.f2851f.f2330b, new q30(f80Var3.f2850e));
                Iterator it6 = linkedHashMap3.values().iterator();
                while (it6.hasNext()) {
                    e80 e80Var = (e80) it6.next();
                    n30 n30Var2 = e80Var.f2341a.f11949e;
                    int i12 = e80Var.f2342b;
                    C0859wt c0859wt = e80Var.f2343c;
                    if ((i12 & 1024) == 0 && (i12 & 256) == 0) {
                        ArrayList arrayList = c0859wt.f12627b;
                        if (!c0859wt.f12629d) {
                            c0859wt.m5990f();
                        }
                        Iterator it7 = arrayList.iterator();
                        int i13 = 0;
                        while (it7.hasNext()) {
                            Iterator it8 = it6;
                            v51 v51Var = (v51) it7.next();
                            LinkedHashMap linkedHashMap5 = linkedHashMap4;
                            if (v51Var.f11690a.isEmpty()) {
                                it7.remove();
                                it3 = it7;
                            } else {
                                it3 = it7;
                                for (int i14 = 0; i14 < v51Var.f11693d.size(); i14++) {
                                    while (((v51) v51Var.f11693d.get(i14)).f11690a.isEmpty()) {
                                        List list = v51Var.f11693d;
                                        list.set(i14, ((v51) list.get(i14)).f11694e);
                                    }
                                }
                                while (true) {
                                    v51 v51Var2 = v51Var.f11694e;
                                    if (v51Var2 == null || !v51Var2.f11690a.isEmpty()) {
                                        break;
                                    }
                                    v51Var.f11694e = v51Var.f11694e.f11694e;
                                }
                                while (true) {
                                    v51 v51Var3 = v51Var.f11695f;
                                    if (v51Var3 == null || !v51Var3.f11690a.isEmpty()) {
                                        break;
                                    }
                                    v51Var.f11695f = v51Var.f11695f.f11694e;
                                }
                                v51Var.f11696g = i13;
                                i13++;
                            }
                            linkedHashMap4 = linkedHashMap5;
                            it6 = it8;
                            it7 = it3;
                        }
                        it2 = it6;
                        linkedHashMap = linkedHashMap4;
                        C0058bk c0058bk = new C0058bk(arrayList.size());
                        int i15 = 0;
                        while (i15 < arrayList.size()) {
                            v51 v51Var4 = (v51) arrayList.get(i15);
                            ArrayList arrayList2 = v51Var4.f11690a;
                            ArrayList arrayList3 = arrayList;
                            j01 j01Var = new j01(arrayList2.size());
                            File file8 = file2;
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                j01Var.m2694f(i16, (i01) arrayList2.get(i16));
                            }
                            j01Var.f11990h = false;
                            v01 v01Var3 = new v01(4);
                            Iterator it9 = v51Var4.f11693d.iterator();
                            while (it9.hasNext()) {
                                v01Var3.m5597e(((v51) it9.next()).f11696g);
                            }
                            v51 v51Var5 = v51Var4.f11694e;
                            if (v51Var5 != null) {
                                i5 = v51Var5.f11696g;
                                v01Var3.m5597e(i5);
                            } else {
                                i5 = -1;
                            }
                            v51 v51Var6 = v51Var4.f11695f;
                            if (v51Var6 != null) {
                                v01Var3.m5597e(v51Var6.f11696g);
                            }
                            v01Var3.f11990h = false;
                            C0964zj c0964zj = new C0964zj(v51Var4.f11696g, j01Var, v01Var3, i5);
                            C0964zj c0964zj2 = (C0964zj) c0058bk.f5590i[i15];
                            c0058bk.m2694f(i15, c0964zj);
                            v01 v01Var4 = c0058bk.f903j;
                            if (c0964zj2 != null) {
                                v01Var4.m5599g(c0964zj2.f13925a, -1);
                            }
                            int i17 = v01Var4.f11588j;
                            int i18 = 0;
                            while (true) {
                                i6 = c0964zj.f13925a;
                                int i19 = i17;
                                if (i18 <= i6 - i19) {
                                    v01Var4.m5597e(-1);
                                    i18++;
                                    i17 = i19;
                                }
                            }
                            v01Var4.m5599g(i6, i15);
                            c0058bk.f904k = -1;
                            i15++;
                            arrayList = arrayList3;
                            file2 = file8;
                        }
                        file5 = file2;
                        C0043b5 c0043b52 = new C0043b5(c0058bk);
                        Iterator it10 = c0859wt.f12631f.iterator();
                        int iM3507e = 0;
                        while (it10.hasNext()) {
                            iM3507e += ((yb1) it10.next()).f13391b.f96b.m3507e();
                        }
                        bb2 bb2Var3 = new bb2(c0043b52, iM3507e, c0953z82);
                        dq1 dq1Var2 = (dq1) bb2Var3.f765f;
                        C0043b5 c0043b53 = (C0043b5) bb2Var3.f764e;
                        C0058bk c0058bk2 = (C0058bk) c0043b52.f562i;
                        Object[] objArr2 = c0058bk2.f5590i;
                        int length = objArr2.length;
                        int iM552h = (c0058bk2.m552h() + 31) >> 5;
                        int[] iArr2 = new int[iM552h];
                        c0953z8 = c0953z82;
                        int[] iArr3 = new int[iM552h];
                        file6 = file7;
                        int i20 = 0;
                        while (i20 < length) {
                            int i21 = i20;
                            int i22 = ((C0964zj) c0058bk2.m2693e(i20)).f13925a;
                            int i23 = i22 >> 5;
                            iArr2[i23] = iArr2[i23] | (i11 << (i22 & 31));
                            i20 = i21 + 1;
                        }
                        int[] iArr4 = new int[length];
                        f80Var2 = f80Var3;
                        z70Var2 = z70Var3;
                        int i24 = 0;
                        int i25 = -1;
                        int i26 = 0;
                        while (i26 != i25) {
                            while (true) {
                                if (((v01) c0043b52.f564k) == null) {
                                    int iM552h2 = c0058bk2.m552h();
                                    n30Var = n30Var2;
                                    v01[] v01VarArr = new v01[iM552h2];
                                    i3 = i12;
                                    dq1Var = dq1Var2;
                                    v01 v01Var5 = new v01(10);
                                    int length2 = objArr2.length;
                                    objArr = objArr2;
                                    int i27 = 0;
                                    while (i27 < length2) {
                                        int i28 = length2;
                                        C0964zj c0964zj3 = (C0964zj) c0058bk2.m2693e(i27);
                                        int i29 = i27;
                                        int i30 = c0964zj3.f13925a;
                                        v01 v01Var6 = c0964zj3.f13927c;
                                        C0043b5 c0043b54 = c0043b53;
                                        int i31 = v01Var6.f11588j;
                                        if (i31 == 0) {
                                            v01Var5.m5597e(i30);
                                            bb2Var2 = bb2Var3;
                                        } else {
                                            bb2Var2 = bb2Var3;
                                            int i32 = 0;
                                            while (i32 < i31) {
                                                int iM5598f2 = v01Var6.m5598f(i32);
                                                v01 v01Var7 = v01VarArr[iM5598f2];
                                                int i33 = i32;
                                                if (v01Var7 == null) {
                                                    v01Var = v01Var6;
                                                    v01Var2 = new v01(10);
                                                    v01VarArr[iM5598f2] = v01Var2;
                                                } else {
                                                    v01Var = v01Var6;
                                                    v01Var2 = v01Var7;
                                                }
                                                v01Var2.m5597e(i30);
                                                i32 = i33 + 1;
                                                v01Var6 = v01Var;
                                            }
                                        }
                                        i27 = i29 + 1;
                                        length2 = i28;
                                        c0043b53 = c0043b54;
                                        bb2Var3 = bb2Var2;
                                    }
                                    bb2Var = bb2Var3;
                                    c0043b5 = c0043b53;
                                    int i34 = 0;
                                    while (i34 < iM552h2) {
                                        v01 v01Var8 = v01VarArr[i34];
                                        if (v01Var8 != null) {
                                            v01Var8.m5707d();
                                            if (v01Var8.f11589k) {
                                                i4 = i34;
                                                z = false;
                                            } else {
                                                i4 = i34;
                                                z = false;
                                                Arrays.sort(v01Var8.f11587i, 0, v01Var8.f11588j);
                                                v01Var8.f11589k = i11;
                                            }
                                            v01Var8.f11990h = z;
                                        } else {
                                            i4 = i34;
                                        }
                                        i34 = i4 + 1;
                                        i11 = 1;
                                    }
                                    v01Var5.m5707d();
                                    if (!v01Var5.f11589k) {
                                        Arrays.sort(v01Var5.f11587i, 0, v01Var5.f11588j);
                                        v01Var5.f11589k = true;
                                    }
                                    v01Var5.f11990h = false;
                                    if (v01VarArr[0] == null) {
                                        v01VarArr[0] = v01.f11586l;
                                    }
                                    c0043b52.f563j = v01VarArr;
                                    c0043b52.f564k = v01Var5;
                                } else {
                                    bb2Var = bb2Var3;
                                    dq1Var = dq1Var2;
                                    c0043b5 = c0043b53;
                                    n30Var = n30Var2;
                                    i3 = i12;
                                    objArr = objArr2;
                                }
                                v01 v01Var9 = ((v01[]) c0043b52.f563j)[i26];
                                if (v01Var9 == null) {
                                    c80.m667j("no such block: ".concat(pp0.m3898J(i26)));
                                    return classLoader4;
                                }
                                int i35 = v01Var9.f11588j;
                                for (int i36 = 0; i36 < i35; i36++) {
                                    iM5598f = v01Var9.m5598f(i36);
                                    if (t11.m5098x(iArr3, iM5598f)) {
                                        break;
                                    }
                                    if (t11.m5098x(iArr2, iM5598f) && c0058bk2.m553i(iM5598f).f13928d == i26) {
                                        break;
                                    }
                                }
                                break;
                                int i37 = iM5598f >> 5;
                                iArr3[i37] = (1 << (iM5598f & 31)) | iArr3[i37];
                                i26 = iM5598f;
                                n30Var2 = n30Var;
                                i12 = i3;
                                dq1Var2 = dq1Var;
                                objArr2 = objArr;
                                c0043b53 = c0043b5;
                                bb2Var3 = bb2Var;
                                i11 = 1;
                            }
                            i25 = -1;
                            while (i26 != i25) {
                                int i38 = i26 >> 5;
                                int i39 = iArr2[i38];
                                int i40 = ~(1 << (i26 & 31));
                                iArr2[i38] = i39 & i40;
                                iArr3[i38] = i40 & iArr3[i38];
                                iArr4[i24] = i26;
                                i24++;
                                C0964zj c0964zjM553i2 = c0058bk2.m553i(i26);
                                v01 v01Var10 = c0964zjM553i2.f13927c;
                                int i41 = c0964zjM553i2.f13928d;
                                int i42 = v01Var10.f11588j;
                                if (i42 == 0) {
                                    i25 = -1;
                                    c0964zjM553i = classLoader4;
                                } else if (i42 != 1) {
                                    i25 = -1;
                                    c0964zjM553i = i41 != -1 ? c0058bk2.m553i(i41) : c0058bk2.m553i(v01Var10.m5598f(0));
                                } else {
                                    i25 = -1;
                                    c0964zjM553i = c0058bk2.m553i(v01Var10.m5598f(0));
                                }
                                if (c0964zjM553i == 0) {
                                    break;
                                }
                                int i43 = c0964zjM553i.f13925a;
                                if (t11.m5098x(iArr2, i43)) {
                                    i26 = i43;
                                } else if (i41 == i43 || i41 < 0 || !t11.m5098x(iArr2, i41)) {
                                    int i44 = v01Var10.f11588j;
                                    int i45 = 0;
                                    while (true) {
                                        if (i45 >= i44) {
                                            i26 = i25;
                                            break;
                                        }
                                        int iM5598f3 = v01Var10.m5598f(i45);
                                        if (t11.m5098x(iArr2, iM5598f3)) {
                                            i26 = iM5598f3;
                                            break;
                                        }
                                        i45++;
                                    }
                                } else {
                                    i26 = i41;
                                }
                            }
                            int i46 = 0;
                            while (true) {
                                if (i46 >= iM552h) {
                                    i26 = i25;
                                    break;
                                }
                                int i47 = iArr2[i46];
                                if (i47 != 0) {
                                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i47);
                                    if (iNumberOfTrailingZeros == 32) {
                                        iNumberOfTrailingZeros = i25;
                                    }
                                    if (iNumberOfTrailingZeros >= 0) {
                                        i26 = (i46 << 5) + iNumberOfTrailingZeros;
                                        break;
                                    }
                                }
                                i46++;
                            }
                            n30Var2 = n30Var;
                            i12 = i3;
                            dq1Var2 = dq1Var;
                            objArr2 = objArr;
                            c0043b53 = c0043b5;
                            bb2Var3 = bb2Var;
                            i11 = 1;
                        }
                        bb2 bb2Var4 = bb2Var3;
                        dq1 dq1Var3 = dq1Var2;
                        C0043b5 c0043b55 = c0043b53;
                        n30 n30Var3 = n30Var2;
                        int i48 = i12;
                        if (i24 != length) {
                            ClassLoader classLoader5 = classLoader4;
                            c80.m667j("shouldn't happen");
                            return classLoader5;
                        }
                        bb2Var4.f767h = iArr4;
                        int i49 = 0;
                        while (i49 < length) {
                            int i50 = i49 + 1;
                            int i51 = i50 == length ? i25 : iArr4[i50];
                            C0964zj c0964zjM553i3 = c0058bk2.m553i(iArr4[i49]);
                            int i52 = c0964zjM553i3.f13925a;
                            C0043b5 c0043b56 = c0043b55;
                            C0898xt[] c0898xtArr = (C0898xt[]) c0043b56.f562i;
                            C0898xt c0898xt = c0898xtArr[i52];
                            dq1 dq1Var4 = dq1Var3;
                            sd0 sd0Var = (sd0) dq1Var4.f2147i;
                            sd0 sd0Var2 = (sd0) dq1Var4.f2147i;
                            sd0Var.m4795a(c0898xt);
                            kj1 kj1Var = (kj1) bb2Var4.f766g;
                            C0898xt c0898xt2 = ((C0898xt[]) c0043b56.f563j)[i52];
                            kj1Var.f5595j = c0964zjM553i3;
                            kj1Var.f5596k = c0898xt2;
                            j01 j01Var2 = c0964zjM553i3.f13926b;
                            int length3 = j01Var2.f5590i.length;
                            for (int i53 = 0; i53 < length3; i53++) {
                                ((i01) j01Var2.m2693e(i53)).mo2239d(kj1Var);
                            }
                            sd0Var2.m4795a(((C0898xt[]) c0043b56.f564k)[i52]);
                            int i54 = c0964zjM553i3.f13928d;
                            i01 i01VarM2426h = j01Var2.m2426h();
                            if (i54 >= 0 && i54 != i51) {
                                if (i01VarM2426h.f4202h.f13815e == 4) {
                                    v01 v01Var11 = c0964zjM553i3.f13927c;
                                    if (v01Var11.f11588j != 2) {
                                        c80.m676t("block doesn't have exactly two successors");
                                        return classLoader4;
                                    }
                                    int iM5598f4 = v01Var11.m5598f(0);
                                    if (iM5598f4 == i54) {
                                        iM5598f4 = v01Var11.m5598f(1);
                                    }
                                    if (iM5598f4 == i51) {
                                        C0898xt c0898xt3 = c0898xtArr[i54];
                                        int size2 = ((ArrayList) sd0Var2.f10059f).size() - 2;
                                        try {
                                            ((ArrayList) sd0Var2.f10059f).set(size2, ((dy2) ((ArrayList) sd0Var2.f10059f).get(size2)).m1209o(c0898xt3));
                                        } catch (ClassCastException unused2) {
                                            C0676s.m4651j("non-reversible instruction");
                                            return classLoader4;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            C0676s.m4651j("too few instructions");
                                            return classLoader4;
                                        }
                                    }
                                }
                                sd0Var2.m4795a(new dy2(pa0.f8087I, i01VarM2426h.f4203i, s72.f9958j, c0898xtArr[i54]));
                            }
                            c0043b55 = c0043b56;
                            i49 = i50;
                            i25 = -1;
                            dq1Var3 = dq1Var4;
                        }
                        dq1 dq1Var5 = dq1Var3;
                        i2 = 1;
                        vu2 vu2Var = new vu2(c0043b52, (int[]) bb2Var4.f767h, c0043b55);
                        sd0 sd0Var3 = (sd0) dq1Var5.f2147i;
                        ArrayList arrayList4 = (ArrayList) dq1Var5.f2148j;
                        if (arrayList4 == null) {
                            ClassLoader classLoader6 = classLoader4;
                            c80.m676t("already processed");
                            return classLoader6;
                        }
                        int size3 = arrayList4.size();
                        for (int i55 = 0; i55 < size3; i55++) {
                            sd0Var3.m4795a((a40) ((ArrayList) dq1Var5.f2148j).get(i55));
                        }
                        ClassLoader classLoader7 = classLoader4;
                        dq1Var5.f2148j = classLoader7;
                        kj1 kj1Var2 = new kj1(5);
                        if (sd0Var3 == null) {
                            um2.m5516f("unprocessedInsns == null");
                            return classLoader7;
                        }
                        kj1Var2.f5594i = sd0Var3;
                        kj1Var2.f5595j = vu2Var;
                        kj1Var2.f5596k = classLoader7;
                        kj1Var2.f5597l = classLoader7;
                        i = i48;
                        ue0Var = new ue0(n30Var3, i, kj1Var2, wu2.f12672j);
                    } else {
                        it2 = it6;
                        file5 = file2;
                        file6 = file7;
                        f80Var2 = f80Var3;
                        i = i12;
                        z70Var2 = z70Var3;
                        linkedHashMap = linkedHashMap4;
                        c0953z8 = c0953z82;
                        i2 = i11;
                        ue0Var = new ue0(n30Var2, i, classLoader4, wu2.f12672j);
                    }
                    int i56 = 65546 & i;
                    f80 f80Var4 = f80Var2;
                    C0897xs c0897xs = f80Var4.f2852g;
                    if (i56 != 0) {
                        c0897xs.f13152n.f12154p.add(ue0Var);
                    } else {
                        c0897xs.f13152n.f12155q.add(ue0Var);
                    }
                    i11 = i2;
                    linkedHashMap4 = linkedHashMap;
                    file2 = file5;
                    c0953z82 = c0953z8;
                    file7 = file6;
                    z70Var3 = z70Var2;
                    classLoader4 = null;
                    f80Var3 = f80Var4;
                    it6 = it2;
                }
                file3 = file2;
                file4 = file7;
                f80Var = f80Var3;
                z70Var = z70Var3;
                for (d80 d80Var : linkedHashMap4.values()) {
                    li0 li0Var = d80Var.f1907a;
                    int i57 = d80Var.f1908b;
                    se0 se0Var = new se0(li0Var.f6135c, i57);
                    int i58 = i57 & 8;
                    C0897xs c0897xs2 = f80Var.f2852g;
                    if (i58 != 0) {
                        C0821vs c0821vs = c0897xs2.f13152n;
                        if (c0821vs.f12156r != null) {
                            c80.m676t("static fields already sorted");
                            return null;
                        }
                        c0821vs.f12151m.add(se0Var);
                        c0821vs.f12152n.put(se0Var, h30.f3810h);
                    } else {
                        c0897xs2.f13152n.f12153o.add(se0Var);
                    }
                }
            } else {
                it = it5;
                file3 = file2;
                file4 = file7;
                f80Var = f80Var3;
                z70Var = z70Var3;
            }
            C0897xs c0897xs3 = f80Var.f2852g;
            C0934ys c0934ys = (C0934ys) z70Var.f13762m;
            TreeMap treeMap = c0934ys.f13601f;
            try {
                o43 o43Var = c0897xs3.f13147i.f9342h;
                c0934ys.m2519g();
                if (treeMap.get(o43Var) != null) {
                    C0676s.m4648g("already added: ", o43Var);
                    return null;
                }
                treeMap.put(o43Var, c0897xs3);
                sz0Var = this;
                it5 = it;
                file2 = file3;
                file7 = file4;
                classLoader2 = null;
                i10 = 16;
            } catch (NullPointerException unused4) {
                um2.m5516f("clazz == null");
                return null;
            }
        }
        File file9 = file2;
        File file10 = file7;
        try {
            byte[] bArrM6386b = ((z70) sz0Var.f10437j).m6386b();
            JarOutputStream jarOutputStream = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(file10)));
            file10.setReadOnly();
            try {
                JarEntry jarEntry = new JarEntry("classes.dex");
                jarEntry.setSize(bArrM6386b.length);
                jarOutputStream.putNextEntry(jarEntry);
                try {
                    jarOutputStream.write(bArrM6386b);
                    jarOutputStream.close();
                    return sz0Var.m5030C(file10, file9, classLoader);
                } finally {
                    jarOutputStream.closeEntry();
                }
            } catch (Throwable th) {
                jarOutputStream.close();
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: C */
    public ClassLoader m5030C(File file, File file2, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = null;
        }
        try {
            Class.forName("dalvik.system.BaseDexClassLoader");
            return (ClassLoader) Class.forName("dalvik.system.DexClassLoader").getConstructor(String.class, String.class, String.class, ClassLoader.class).newInstance(file.getPath(), file2.getAbsolutePath(), null, classLoader);
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("load() requires a Dalvik VM", e);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InstantiationException unused2) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused3) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gs1 m5031D(j63 j63Var, boolean z) {
        final String str;
        gs1 c0330iz;
        final Type type = j63Var.f4905b;
        Class cls = j63Var.f4904a;
        Map map = (Map) this.f10436i;
        C0676s c0676s = null;
        if (map.get(type) != null) {
            c80.m664g();
            return null;
        }
        if (map.get(cls) != null) {
            c80.m664g();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        gs1 gs1Var = EnumSet.class.isAssignableFrom(cls) ? new gs1() { // from class: jz
            @Override // p000.gs1
            /* JADX INFO: renamed from: a */
            public final Object mo2023a() {
                int i3 = i2;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            C0676s.m4654m("Invalid EnumSet type: ", type2);
                        } else {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type3 instanceof Class)) {
                                C0676s.m4654m("Invalid EnumSet type: ", type2);
                            }
                        }
                        break;
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            C0676s.m4654m("Invalid EnumMap type: ", type2);
                        } else {
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type4 instanceof Class)) {
                                C0676s.m4654m("Invalid EnumMap type: ", type2);
                            }
                        }
                        break;
                }
                return null;
            }
        } : cls == EnumMap.class ? new gs1() { // from class: jz
            @Override // p000.gs1
            /* JADX INFO: renamed from: a */
            public final Object mo2023a() {
                int i3 = i;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            C0676s.m4654m("Invalid EnumSet type: ", type2);
                        } else {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type3 instanceof Class)) {
                                C0676s.m4654m("Invalid EnumSet type: ", type2);
                            }
                        }
                        break;
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            C0676s.m4654m("Invalid EnumMap type: ", type2);
                        } else {
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type4 instanceof Class)) {
                                C0676s.m4654m("Invalid EnumMap type: ", type2);
                            }
                        }
                        break;
                }
                return null;
            }
        } : null;
        if (gs1Var != null) {
            return gs1Var;
        }
        sp0.m4906B((List) this.f10437j);
        if (Modifier.isAbstract(cls.getModifiers())) {
            c0330iz = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                tp0 tp0Var = h72.f3884a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + h72.m2117b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + h72.m2120e(e);
                }
                c0330iz = str != null ? new gs1() { // from class: hz
                    @Override // p000.gs1
                    /* JADX INFO: renamed from: a */
                    public final Object mo2023a() {
                        int i3 = i2;
                        String str2 = str;
                        switch (i3) {
                            case 0:
                                throw new t31(str2);
                            case 1:
                                throw new t31(str2);
                            default:
                                throw new t31(str2);
                        }
                    }
                } : new C0330iz(i2, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                c0330iz = null;
            }
        }
        if (c0330iz != null) {
            return c0330iz;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                c0676s = new C0676s(24);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                c0676s = new C0676s(25);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                c0676s = new C0676s(26);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                c0676s = new C0676s(27);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(mb1.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length != 0 && AbstractC0738tl.m5279F(actualTypeArguments[0]) == String.class) {
                    }
                }
                c0676s = new C0676s(19);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                c0676s = new C0676s(20);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                c0676s = new C0676s(21);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                c0676s = new C0676s(22);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c0676s = new C0676s(23);
            }
        }
        if (c0676s != null) {
            return c0676s;
        }
        final String strM5026r = m5026r(cls);
        if (strM5026r != null) {
            return new gs1() { // from class: hz
                @Override // p000.gs1
                /* JADX INFO: renamed from: a */
                public final Object mo2023a() {
                    int i3 = i;
                    String str2 = strM5026r;
                    switch (i3) {
                        case 0:
                            throw new t31(str2);
                        case 1:
                            throw new t31(str2);
                        default:
                            throw new t31(str2);
                    }
                }
            };
        }
        if (z) {
            return new C0330iz(i, cls);
        }
        final String str2 = "Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.";
        final int i3 = 2;
        return new gs1() { // from class: hz
            @Override // p000.gs1
            /* JADX INFO: renamed from: a */
            public final Object mo2023a() {
                int i32 = i3;
                String str22 = str2;
                switch (i32) {
                    case 0:
                        throw new t31(str22);
                    case 1:
                        throw new t31(str22);
                    default:
                        throw new t31(str22);
                }
            }
        };
    }

    /* JADX INFO: renamed from: E */
    public Object m5032E(y12 y12Var) {
        HashMap map = (HashMap) this.f10437j;
        er0 er0Var = (er0) map.get(y12Var);
        if (er0Var == null) {
            er0Var = new er0(y12Var);
            map.put(y12Var, er0Var);
        } else {
            y12Var.mo2390a();
        }
        er0 er0Var2 = er0Var.f2570d;
        er0Var2.f2569c = er0Var.f2569c;
        er0Var.f2569c.f2570d = er0Var2;
        er0 er0Var3 = (er0) this.f10436i;
        er0Var.f2570d = er0Var3;
        er0 er0Var4 = er0Var3.f2569c;
        er0Var.f2569c = er0Var4;
        er0Var4.f2570d = er0Var;
        er0Var.f2570d.f2569c = er0Var;
        ArrayList arrayList = er0Var.f2568b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return er0Var.f2568b.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public InputMethodManager m5033F() {
        return (InputMethodManager) ((j71) this.f10437j).getValue();
    }

    /* JADX INFO: renamed from: G */
    public nf1 m5034G() {
        return (nf1) ((nx1) this.f10437j).getValue();
    }

    /* JADX INFO: renamed from: H */
    public f80 m5035H(a63 a63Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f10436i;
        f80 f80Var = (f80) linkedHashMap.get(a63Var);
        if (f80Var != null) {
            return f80Var;
        }
        f80 f80Var2 = new f80(a63Var);
        linkedHashMap.put(a63Var, f80Var2);
        return f80Var2;
    }

    /* JADX INFO: renamed from: I */
    public AutofillId m5036I(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b00.m325b(AbstractC0155e6.m1263e(this.f10437j), ((View) this.f10436i).getAutofillId(), j);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void m5037J(y12 y12Var, Object obj) {
        HashMap map = (HashMap) this.f10437j;
        er0 er0Var = (er0) map.get(y12Var);
        if (er0Var == null) {
            er0Var = new er0(y12Var);
            er0Var.f2570d = er0Var;
            er0 er0Var2 = (er0) this.f10436i;
            er0Var.f2570d = er0Var2.f2570d;
            er0Var.f2569c = er0Var2;
            er0Var2.f2570d = er0Var;
            er0Var.f2570d.f2569c = er0Var;
            map.put(y12Var, er0Var);
        } else {
            y12Var.mo2390a();
        }
        if (er0Var.f2568b == null) {
            er0Var.f2568b = new ArrayList();
        }
        er0Var.f2568b.add(obj);
    }

    /* JADX INFO: renamed from: K */
    public Object m5038K(String str, int i, u00 u00Var) {
        return AbstractC0570p7.m3762R((c20) this.f10436i, new v80(this, str, i, null, 1), u00Var);
    }

    /* JADX INFO: renamed from: L */
    public void m5039L(String str) {
        c90 c90Var;
        synchronized (this) {
            try {
                c90Var = (c90) ((HashMap) this.f10436i).get(str);
                fg1.m1642q("Argument must not be null", c90Var);
                int i = c90Var.f1245b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c90Var.f1245b);
                }
                int i2 = i - 1;
                c90Var.f1245b = i2;
                if (i2 == 0) {
                    c90 c90Var2 = (c90) ((HashMap) this.f10436i).remove(str);
                    if (!c90Var2.equals(c90Var)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c90Var + ", but actually removed: " + c90Var2 + ", safeKey: " + str);
                    }
                    C0210fo c0210fo = (C0210fo) this.f10437j;
                    synchronized (c0210fo.f3076a) {
                        try {
                            if (c0210fo.f3076a.size() < 10) {
                                c0210fo.f3076a.offer(c90Var2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c90Var.f1244a.unlock();
    }

    /* JADX INFO: renamed from: M */
    public Object m5040M() {
        er0 er0Var = (er0) this.f10436i;
        er0 er0Var2 = er0Var.f2570d;
        while (true) {
            boolean zEquals = er0Var2.equals(er0Var);
            Object obj = er0Var2.f2567a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = er0Var2.f2568b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? er0Var2.f2568b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            er0 er0Var3 = er0Var2.f2570d;
            er0Var3.f2569c = er0Var2.f2569c;
            er0Var2.f2569c.f2570d = er0Var3;
            ((HashMap) this.f10437j).remove(obj);
            ((y12) obj).mo2390a();
            er0Var2 = er0Var2.f2570d;
        }
    }

    /* JADX INFO: renamed from: N */
    public void m5041N(String str, Float f) {
        Activity activity = up0.f11403k;
        if (activity != null) {
            activity.runOnUiThread(new RunnableC0418lb(this, str, f, 5));
        } else {
            t11.m5067S("hostAct");
            throw null;
        }
    }

    @Override // p000.gh2
    /* JADX INFO: renamed from: a */
    public Object mo1924a(hh2 hh2Var, Object obj, String str, ArrayList arrayList, cw0 cw0Var) {
        boolean zContainsKey;
        String str2 = hh2Var.f4020a;
        kj1 kj1Var = (kj1) this.f10436i;
        kj1Var.getClass();
        str2.getClass();
        synchronized (kj1Var.f5595j) {
            zContainsKey = kj1Var.m2700D().containsKey(str2);
        }
        if (zContainsKey) {
            return ((gh2) this.f10437j).mo1924a(hh2Var, obj, str, arrayList, cw0Var);
        }
        throw new eh2(12, "PERMISSION_DENIED", "Host reflection access has been revoked for this script.", null);
    }

    @Override // p000.InterfaceC0101cp
    /* JADX INFO: renamed from: b */
    public void mo879b(InterfaceC0854wo interfaceC0854wo, q92 q92Var) {
        ((a50) this.f10437j).f62h.execute(new RunnableC0418lb(this, (InterfaceC0101cp) this.f10436i, q92Var, 2));
    }

    @Override // p000.we0
    /* JADX INFO: renamed from: c */
    public boolean mo2184c(Object obj, File file, ov1 ov1Var) {
        return ((C0813vk) this.f10437j).mo2184c(new C0022al((InterfaceC0965zk) this.f10436i, ((BitmapDrawable) ((d92) obj).get()).getBitmap()), file, ov1Var);
    }

    @Override // p000.InterfaceC0101cp
    /* JADX INFO: renamed from: d */
    public void mo880d(InterfaceC0854wo interfaceC0854wo, Throwable th) {
        ((a50) this.f10437j).f62h.execute(new RunnableC0418lb(this, (InterfaceC0101cp) this.f10436i, th, 3));
    }

    @Override // p000.InterfaceC0930yo
    /* JADX INFO: renamed from: e */
    public Type mo2577e() {
        return (Type) this.f10436i;
    }

    @Override // p000.j92
    /* JADX INFO: renamed from: h */
    public int mo2471h(ov1 ov1Var) {
        return 2;
    }

    @Override // p000.InterfaceC0930yo
    /* JADX INFO: renamed from: i */
    public Object mo2578i(ct1 ct1Var) {
        Executor executor = (Executor) this.f10437j;
        return executor == null ? ct1Var : new a50(executor, ct1Var);
    }

    @Override // p000.gh2
    /* JADX INFO: renamed from: j */
    public Object mo1925j(hh2 hh2Var, Object obj, String str, hw0 hw0Var) {
        boolean zContainsKey;
        String str2 = hh2Var.f4020a;
        kj1 kj1Var = (kj1) this.f10436i;
        kj1Var.getClass();
        str2.getClass();
        synchronized (kj1Var.f5595j) {
            zContainsKey = kj1Var.m2700D().containsKey(str2);
        }
        if (zContainsKey) {
            return ((gh2) this.f10437j).mo1925j(hh2Var, obj, str, hw0Var);
        }
        throw new eh2(12, "PERMISSION_DENIED", "Host reflection access has been revoked for this script.", null);
    }

    @Override // p000.ys2
    /* JADX INFO: renamed from: l */
    public fr2 mo425l() {
        return (ug0) this.f10436i;
    }

    @Override // p000.ys2
    /* JADX INFO: renamed from: n */
    public ht2 mo427n() {
        return (vg0) this.f10437j;
    }

    /* JADX INFO: renamed from: q */
    public k03 m5042q(List list) {
        rd0 rd0Var;
        Exception e;
        rd0 rd0Var2;
        try {
            int size = list.size();
            int i = 0;
            rd0Var = null;
            while (i < size) {
                try {
                    rd0Var2 = (rd0) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    rd0Var2.mo103a((sd0) this.f10437j);
                    i++;
                    rd0Var = rd0Var2;
                } catch (Exception e3) {
                    e = e3;
                    rd0Var = rd0Var2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((sx1) ((sd0) this.f10437j).f10059f).m5009b());
                    sb2.append(", composition=");
                    sb2.append(((sd0) this.f10437j).m4802h());
                    sb2.append(", selection=");
                    sd0 sd0Var = (sd0) this.f10437j;
                    sb2.append((Object) f13.m1499h(fg1.m1636i(sd0Var.f10055b, sd0Var.f10056c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    AbstractC0142du.m1164t0(list, sb, new C0792v(9, rd0Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            sd0 sd0Var2 = (sd0) this.f10437j;
            sd0Var2.getClass();
            C0690sd c0690sd = new C0690sd(((sx1) sd0Var2.f10059f).toString());
            sd0 sd0Var3 = (sd0) this.f10437j;
            long jM1636i = fg1.m1636i(sd0Var3.f10055b, sd0Var3.f10056c);
            f13 f13Var = f13.m1498g(((k03) this.f10436i).f5297b) ? null : new f13(jM1636i);
            k03 k03Var = new k03(c0690sd, f13Var != null ? f13Var.f2739a : fg1.m1636i(f13.m1496e(jM1636i), f13.m1497f(jM1636i)), ((sd0) this.f10437j).m4802h());
            this.f10436i = k03Var;
            return k03Var;
        } catch (Exception e4) {
            rd0Var = null;
            e = e4;
        }
    }

    /* JADX INFO: renamed from: t */
    public C0859wt m5043t(vg1 vg1Var) {
        a63 a63Var = vg1Var.f11945a;
        String str = vg1Var.f11947c;
        LinkedHashMap linkedHashMap = m5035H(a63Var).f2854i;
        if (linkedHashMap.containsKey(vg1Var)) {
            c80.m669m("already declared: ", vg1Var);
            return null;
        }
        e80 e80Var = new e80(vg1Var, (str.equals("<init>") || str.equals("<clinit>")) ? 65537 : 1);
        linkedHashMap.put(vg1Var, e80Var);
        return e80Var.f2343c;
    }

    @Override // p000.q01
    public n01 toInstant() {
        throw new o01(((String) this.f10436i) + " when parsing an Instant from \"" + qp0.m4241W((String) this.f10437j, 64) + '\"');
    }

    public String toString() {
        switch (this.f10435h) {
            case 2:
                return "AnimationResult(endReason=" + ((EnumC0199fd) this.f10437j) + ", endState=" + ((C0310id) this.f10436i) + ')';
            case 5:
                return ((Map) this.f10436i).toString();
            case AIChatConfig.MaxContextRounds /* 20 */:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                er0 er0Var = (er0) this.f10436i;
                er0 er0Var2 = er0Var.f2569c;
                boolean z = false;
                while (!er0Var2.equals(er0Var)) {
                    sb.append('{');
                    sb.append(er0Var2.f2567a);
                    sb.append(':');
                    ArrayList arrayList = er0Var2.f2568b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    er0Var2 = er0Var2.f2569c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.ga1
    /* JADX INFO: renamed from: x */
    public void mo881x() {
        Context context = (Context) this.f10436i;
        if (er2.f2574l == null) {
            synchronized (er2.class) {
                try {
                    if (er2.f2574l == null) {
                        er2.f2574l = new er2(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        er2 er2Var = er2.f2574l;
        w82 w82Var = (w82) this.f10437j;
        synchronized (er2Var) {
            ((HashSet) er2Var.f2578k).add(w82Var);
            er2Var.m1413c();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m5044y(li0 li0Var, int i) {
        LinkedHashMap linkedHashMap = m5035H(li0Var.f6133a).f2853h;
        if (linkedHashMap.containsKey(li0Var)) {
            c80.m669m("already declared: ", li0Var);
        } else {
            linkedHashMap.put(li0Var, new d80(li0Var, i));
        }
    }

    public /* synthetic */ sz0(int i, Object obj, Object obj2, boolean z) {
        this.f10435h = i;
        this.f10437j = obj;
        this.f10436i = obj2;
    }

    public /* synthetic */ sz0(int i, boolean z) {
        this.f10435h = i;
    }

    public sz0(kj1 kj1Var) {
        this.f10435h = 29;
        kj1Var.getClass();
        this.f10436i = kj1Var;
        this.f10437j = fh2.f3006a;
    }

    public sz0(File file, c20 c20Var) {
        this.f10435h = 14;
        c20Var.getClass();
        this.f10436i = c20Var;
        this.f10437j = file.getAbsoluteFile();
    }

    public sz0(Context context, w82 w82Var) {
        this.f10435h = 9;
        this.f10436i = context.getApplicationContext();
        this.f10437j = w82Var;
    }

    public sz0(String str) {
        this.f10435h = 11;
        this.f10436i = op0.m3598u(str);
        this.f10437j = new jx1(ci0.m778C(0.0f, 0.0f, 1.0f));
    }

    public sz0(C0043b5 c0043b5) {
        this.f10435h = 25;
        kj1 kj1Var = new kj1(c0043b5);
        this.f10437j = new l40(3);
        this.f10436i = kj1Var;
    }

    public sz0(r61 r61Var, nf1 nf1Var) {
        this.f10435h = 22;
        this.f10436i = r61Var;
        this.f10437j = op0.m3598u(nf1Var);
    }

    public sz0(View view) {
        this.f10435h = 0;
        this.f10436i = view;
        this.f10437j = AbstractC0570p7.m3746B(i91.f4498i, new C0727ta(12, this));
    }

    public sz0(z71 z71Var) {
        this.f10435h = 23;
        this.f10436i = z71Var;
        gk1 gk1Var = hs1.f4124a;
        this.f10437j = new gk1();
    }

    public sz0(f90 f90Var) {
        this.f10435h = 17;
        xg0 xg0Var = (xg0) f90Var.f2865d;
        this.f10436i = new ug0(f90Var, xg0Var.mo2401f().mo425l(), -1L, true);
        this.f10437j = new vg0(f90Var, xg0Var.mo2401f().mo427n(), -1L, true);
    }

    public /* synthetic */ sz0(int i, Object obj, Object obj2) {
        this.f10435h = i;
        this.f10436i = obj;
        this.f10437j = obj2;
    }
}
