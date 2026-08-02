package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sz0 implements j92, yo, cp, ga1, ys2, q01, gh2 {
    public final /* synthetic */ int h;
    public Object i;
    public Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sz0(int i) {
        this.h = i;
        switch (i) {
            case 13:
                this.i = new bb2(0);
                this.j = new bb2(0);
                break;
            case 15:
                this.i = new HashMap();
                this.j = new fo(1);
                break;
            case 18:
                this.i = new ArrayList();
                this.j = new ArrayList();
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                this.i = new er0(null);
                this.j = new HashMap();
                break;
            case 26:
                this.i = new AtomicReference();
                this.j = new hg(0);
                break;
            case 28:
                this.i = new rk1();
                this.j = new rk1();
                break;
            default:
                this.i = new LinkedHashMap();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void A(File file, File file2) throws IOException {
        String path = file.getPath();
        String path2 = file2.getPath();
        if (t11.l(path2, path)) {
            return;
        }
        path2.getClass();
        if (wv2.d0(path2, path + File.separator, false)) {
            return;
        }
        c80.v("Script path escapes the script root: ".concat(path2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final File k(sz0 sz0Var) throws IOException {
        File canonicalFile = ((File) sz0Var.j).getCanonicalFile();
        if (canonicalFile.isDirectory() && !Files.isSymbolicLink(canonicalFile.toPath())) {
            return canonicalFile;
        }
        c80.v(vi0.i("Script root is not a readable directory: ", canonicalFile.getPath()));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String r(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(File file, File file2, pb1 pb1Var) throws IOException {
        if (Files.isSymbolicLink(file2.toPath())) {
            c80.v(vi0.i("Symbolic links are not supported in script packages: ", file2.getPath()));
            return;
        }
        File canonicalFile = file2.getCanonicalFile();
        canonicalFile.getClass();
        A(file, canonicalFile);
        if (canonicalFile.isFile()) {
            String string = file.toPath().relativize(canonicalFile.toPath()).toString();
            o72 o72Var = oi2.i;
            pb1Var.add(new oi2(xe1.Y(string)));
        } else if (canonicalFile.isDirectory()) {
            File[] fileArrListFiles = canonicalFile.listFiles();
            if (fileArrListFiles == null) {
                c80.v(vi0.i("Unable to list script directory: ", canonicalFile.getPath()));
                return;
            }
            for (File file3 : mg.r0(fileArrListFiles, new sl0(13))) {
                file3.getClass();
                s(file, file3, pb1Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wc z(ImageDecoder.Source source, int i, int i2, ov1 ov1Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new a60(i, i2, ov1Var));
        if (a4.w(drawableDecodeDrawable)) {
            return new wc(0, a4.g(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v43, resolved type: zj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v44, resolved type: zj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v53, resolved type: zj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v63, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v71, resolved type: zj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v72, resolved type: zj */
    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: kj1 */
    /* JADX WARN: Multi-variable type inference failed */
    public ClassLoader B(ClassLoader classLoader, File file) throws IOException {
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
        z8 z8Var;
        int i2;
        ue0 ue0Var;
        bb2 bb2Var;
        dq1 dq1Var;
        b5 b5Var;
        n30 n30Var;
        int i3;
        Object[] objArr;
        zj zjVarI;
        int iF;
        int i4;
        boolean z;
        bb2 bb2Var2;
        v01 v01Var;
        v01 v01Var2;
        int i5;
        int i6;
        Iterator it3;
        File[] fileArrL;
        sz0 sz0Var = this;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) sz0Var.i;
        ClassLoader classLoader2 = null;
        if (file == null) {
            String property = System.getProperty("dexmaker.dexcache");
            if (property != null) {
                file2 = new File(property);
            } else {
                try {
                    ClassLoader classLoader3 = se.class.getClassLoader();
                    Class<?> cls = Class.forName("dalvik.system.PathClassLoader");
                    cls.cast(classLoader3);
                    fileArrL = se.L(se.F(classLoader3, cls));
                } catch (ClassCastException | ClassNotFoundException unused) {
                }
                file2 = fileArrL.length > 0 ? fileArrL[0] : null;
                if (file2 == null) {
                    s.j("dexcache == null (and no default could be found; consider setting the 'dexmaker.dexcache' system property)");
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
            f80 f80VarH = sz0Var.H((a63) it4.next());
            Set setKeySet2 = f80VarH.i.keySet();
            a63 a63Var = f80VarH.d;
            if (a63Var != null) {
                iArr[i7] = setKeySet2.hashCode() + ((Arrays.hashCode(f80VarH.f.a) + (a63Var.a.hashCode() * 31)) * 31);
                i7++;
            }
        }
        Arrays.sort(iArr);
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        File file7 = new File(file2, hk1.g(i8, "Generated_", ".jar"));
        if (file7.exists()) {
            if (!file7.canWrite()) {
                return sz0Var.C(file7, file2, classLoader);
            }
            file7.delete();
        }
        int i10 = 16;
        if (((z70) sz0Var.j) == null) {
            sz0Var.j = new z70(new z8(i10));
        }
        Iterator it5 = linkedHashMap2.values().iterator();
        while (it5.hasNext()) {
            f80 f80Var3 = (f80) it5.next();
            z70 z70Var3 = (z70) sz0Var.j;
            LinkedHashMap linkedHashMap3 = f80Var3.i;
            LinkedHashMap linkedHashMap4 = f80Var3.h;
            a63 a63Var2 = f80Var3.a;
            if (!f80Var3.b) {
                StringBuilder sb = new StringBuilder("Undeclared type ");
                sb.append(a63Var2);
                sb.append(" declares members: ");
                sb.append(linkedHashMap4.keySet());
                Set setKeySet3 = linkedHashMap3.keySet();
                sb.append(" ");
                sb.append(setKeySet3);
                throw new IllegalStateException(sb.toString());
            }
            z8 z8Var2 = new z8(i10);
            r30 r30Var = a63Var2.c;
            if (f80Var3.g == null) {
                ClassLoader classLoader4 = classLoader2;
                int i11 = 1;
                it = it5;
                f80Var3.g = new xs(r30Var, f80Var3.c, f80Var3.d.c, f80Var3.f.b, new q30(f80Var3.e));
                Iterator it6 = linkedHashMap3.values().iterator();
                while (it6.hasNext()) {
                    e80 e80Var = (e80) it6.next();
                    n30 n30Var2 = e80Var.a.e;
                    int i12 = e80Var.b;
                    wt wtVar = e80Var.c;
                    if ((i12 & 1024) == 0 && (i12 & 256) == 0) {
                        ArrayList arrayList = wtVar.b;
                        if (!wtVar.d) {
                            wtVar.f();
                        }
                        Iterator it7 = arrayList.iterator();
                        int i13 = 0;
                        while (it7.hasNext()) {
                            Iterator it8 = it6;
                            v51 v51Var = (v51) it7.next();
                            LinkedHashMap linkedHashMap5 = linkedHashMap4;
                            if (v51Var.a.isEmpty()) {
                                it7.remove();
                                it3 = it7;
                            } else {
                                it3 = it7;
                                for (int i14 = 0; i14 < v51Var.d.size(); i14++) {
                                    while (((v51) v51Var.d.get(i14)).a.isEmpty()) {
                                        List list = v51Var.d;
                                        list.set(i14, ((v51) list.get(i14)).e);
                                    }
                                }
                                while (true) {
                                    v51 v51Var2 = v51Var.e;
                                    if (v51Var2 == null || !v51Var2.a.isEmpty()) {
                                        break;
                                    }
                                    v51Var.e = v51Var.e.e;
                                }
                                while (true) {
                                    v51 v51Var3 = v51Var.f;
                                    if (v51Var3 == null || !v51Var3.a.isEmpty()) {
                                        break;
                                    }
                                    v51Var.f = v51Var.f.e;
                                }
                                v51Var.g = i13;
                                i13++;
                            }
                            linkedHashMap4 = linkedHashMap5;
                            it6 = it8;
                            it7 = it3;
                        }
                        it2 = it6;
                        linkedHashMap = linkedHashMap4;
                        bk bkVar = new bk(arrayList.size());
                        int i15 = 0;
                        while (i15 < arrayList.size()) {
                            v51 v51Var4 = (v51) arrayList.get(i15);
                            ArrayList arrayList2 = v51Var4.a;
                            ArrayList arrayList3 = arrayList;
                            j01 j01Var = new j01(arrayList2.size());
                            File file8 = file2;
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                j01Var.f(i16, (i01) arrayList2.get(i16));
                            }
                            j01Var.h = false;
                            v01 v01Var3 = new v01(4);
                            Iterator it9 = v51Var4.d.iterator();
                            while (it9.hasNext()) {
                                v01Var3.e(((v51) it9.next()).g);
                            }
                            v51 v51Var5 = v51Var4.e;
                            if (v51Var5 != null) {
                                i5 = v51Var5.g;
                                v01Var3.e(i5);
                            } else {
                                i5 = -1;
                            }
                            v51 v51Var6 = v51Var4.f;
                            if (v51Var6 != null) {
                                v01Var3.e(v51Var6.g);
                            }
                            v01Var3.h = false;
                            zj zjVar = new zj(v51Var4.g, j01Var, v01Var3, i5);
                            zj zjVar2 = (zj) bkVar.i[i15];
                            bkVar.f(i15, zjVar);
                            v01 v01Var4 = bkVar.j;
                            if (zjVar2 != null) {
                                v01Var4.g(zjVar2.a, -1);
                            }
                            int i17 = v01Var4.j;
                            int i18 = 0;
                            while (true) {
                                i6 = zjVar.a;
                                int i19 = i17;
                                if (i18 <= i6 - i19) {
                                    v01Var4.e(-1);
                                    i18++;
                                    i17 = i19;
                                }
                            }
                            v01Var4.g(i6, i15);
                            bkVar.k = -1;
                            i15++;
                            arrayList = arrayList3;
                            file2 = file8;
                        }
                        file5 = file2;
                        b5 b5Var2 = new b5(bkVar);
                        Iterator it10 = wtVar.f.iterator();
                        int iE = 0;
                        while (it10.hasNext()) {
                            iE += ((yb1) it10.next()).b.b.e();
                        }
                        bb2 bb2Var3 = new bb2(b5Var2, iE, z8Var2);
                        dq1 dq1Var2 = (dq1) bb2Var3.f;
                        b5 b5Var3 = (b5) bb2Var3.e;
                        bk bkVar2 = (bk) b5Var2.i;
                        Object[] objArr2 = bkVar2.i;
                        int length = objArr2.length;
                        int iH = (bkVar2.h() + 31) >> 5;
                        int[] iArr2 = new int[iH];
                        z8Var = z8Var2;
                        int[] iArr3 = new int[iH];
                        file6 = file7;
                        int i20 = 0;
                        while (i20 < length) {
                            int i21 = i20;
                            int i22 = ((zj) bkVar2.e(i20)).a;
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
                                if (((v01) b5Var2.k) == null) {
                                    int iH2 = bkVar2.h();
                                    n30Var = n30Var2;
                                    v01[] v01VarArr = new v01[iH2];
                                    i3 = i12;
                                    dq1Var = dq1Var2;
                                    v01 v01Var5 = new v01(10);
                                    int length2 = objArr2.length;
                                    objArr = objArr2;
                                    int i27 = 0;
                                    while (i27 < length2) {
                                        int i28 = length2;
                                        zj zjVar3 = (zj) bkVar2.e(i27);
                                        int i29 = i27;
                                        int i30 = zjVar3.a;
                                        v01 v01Var6 = zjVar3.c;
                                        b5 b5Var4 = b5Var3;
                                        int i31 = v01Var6.j;
                                        if (i31 == 0) {
                                            v01Var5.e(i30);
                                            bb2Var2 = bb2Var3;
                                        } else {
                                            bb2Var2 = bb2Var3;
                                            int i32 = 0;
                                            while (i32 < i31) {
                                                int iF2 = v01Var6.f(i32);
                                                v01 v01Var7 = v01VarArr[iF2];
                                                int i33 = i32;
                                                if (v01Var7 == null) {
                                                    v01Var = v01Var6;
                                                    v01Var2 = new v01(10);
                                                    v01VarArr[iF2] = v01Var2;
                                                } else {
                                                    v01Var = v01Var6;
                                                    v01Var2 = v01Var7;
                                                }
                                                v01Var2.e(i30);
                                                i32 = i33 + 1;
                                                v01Var6 = v01Var;
                                            }
                                        }
                                        i27 = i29 + 1;
                                        length2 = i28;
                                        b5Var3 = b5Var4;
                                        bb2Var3 = bb2Var2;
                                    }
                                    bb2Var = bb2Var3;
                                    b5Var = b5Var3;
                                    int i34 = 0;
                                    while (i34 < iH2) {
                                        v01 v01Var8 = v01VarArr[i34];
                                        if (v01Var8 != null) {
                                            v01Var8.d();
                                            if (v01Var8.k) {
                                                i4 = i34;
                                                z = false;
                                            } else {
                                                i4 = i34;
                                                z = false;
                                                Arrays.sort(v01Var8.i, 0, v01Var8.j);
                                                v01Var8.k = i11;
                                            }
                                            v01Var8.h = z;
                                        } else {
                                            i4 = i34;
                                        }
                                        i34 = i4 + 1;
                                        i11 = 1;
                                    }
                                    v01Var5.d();
                                    if (!v01Var5.k) {
                                        Arrays.sort(v01Var5.i, 0, v01Var5.j);
                                        v01Var5.k = true;
                                    }
                                    v01Var5.h = false;
                                    if (v01VarArr[0] == null) {
                                        v01VarArr[0] = v01.l;
                                    }
                                    b5Var2.j = v01VarArr;
                                    b5Var2.k = v01Var5;
                                } else {
                                    bb2Var = bb2Var3;
                                    dq1Var = dq1Var2;
                                    b5Var = b5Var3;
                                    n30Var = n30Var2;
                                    i3 = i12;
                                    objArr = objArr2;
                                }
                                v01 v01Var9 = ((v01[]) b5Var2.j)[i26];
                                if (v01Var9 == null) {
                                    c80.j("no such block: ".concat(pp0.J(i26)));
                                    return classLoader4;
                                }
                                int i35 = v01Var9.j;
                                for (int i36 = 0; i36 < i35; i36++) {
                                    iF = v01Var9.f(i36);
                                    if (t11.x(iArr3, iF)) {
                                        break;
                                    }
                                    if (t11.x(iArr2, iF) && bkVar2.i(iF).d == i26) {
                                        break;
                                    }
                                }
                                break;
                                int i37 = iF >> 5;
                                iArr3[i37] = (1 << (iF & 31)) | iArr3[i37];
                                i26 = iF;
                                n30Var2 = n30Var;
                                i12 = i3;
                                dq1Var2 = dq1Var;
                                objArr2 = objArr;
                                b5Var3 = b5Var;
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
                                zj zjVarI2 = bkVar2.i(i26);
                                v01 v01Var10 = zjVarI2.c;
                                int i41 = zjVarI2.d;
                                int i42 = v01Var10.j;
                                if (i42 == 0) {
                                    i25 = -1;
                                    zjVarI = classLoader4;
                                } else if (i42 != 1) {
                                    i25 = -1;
                                    zjVarI = i41 != -1 ? bkVar2.i(i41) : bkVar2.i(v01Var10.f(0));
                                } else {
                                    i25 = -1;
                                    zjVarI = bkVar2.i(v01Var10.f(0));
                                }
                                if (zjVarI == 0) {
                                    break;
                                }
                                int i43 = zjVarI.a;
                                if (t11.x(iArr2, i43)) {
                                    i26 = i43;
                                } else if (i41 == i43 || i41 < 0 || !t11.x(iArr2, i41)) {
                                    int i44 = v01Var10.j;
                                    int i45 = 0;
                                    while (true) {
                                        if (i45 >= i44) {
                                            i26 = i25;
                                            break;
                                        }
                                        int iF3 = v01Var10.f(i45);
                                        if (t11.x(iArr2, iF3)) {
                                            i26 = iF3;
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
                                if (i46 >= iH) {
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
                            b5Var3 = b5Var;
                            bb2Var3 = bb2Var;
                            i11 = 1;
                        }
                        bb2 bb2Var4 = bb2Var3;
                        dq1 dq1Var3 = dq1Var2;
                        b5 b5Var5 = b5Var3;
                        n30 n30Var3 = n30Var2;
                        int i48 = i12;
                        if (i24 != length) {
                            ClassLoader classLoader5 = classLoader4;
                            c80.j("shouldn't happen");
                            return classLoader5;
                        }
                        bb2Var4.h = iArr4;
                        int i49 = 0;
                        while (i49 < length) {
                            int i50 = i49 + 1;
                            int i51 = i50 == length ? i25 : iArr4[i50];
                            zj zjVarI3 = bkVar2.i(iArr4[i49]);
                            int i52 = zjVarI3.a;
                            b5 b5Var6 = b5Var5;
                            xt[] xtVarArr = (xt[]) b5Var6.i;
                            xt xtVar = xtVarArr[i52];
                            dq1 dq1Var4 = dq1Var3;
                            sd0 sd0Var = (sd0) dq1Var4.i;
                            sd0 sd0Var2 = (sd0) dq1Var4.i;
                            sd0Var.a(xtVar);
                            kj1 kj1Var = (kj1) bb2Var4.g;
                            xt xtVar2 = ((xt[]) b5Var6.j)[i52];
                            kj1Var.j = zjVarI3;
                            kj1Var.k = xtVar2;
                            j01 j01Var2 = zjVarI3.b;
                            int length3 = j01Var2.i.length;
                            for (int i53 = 0; i53 < length3; i53++) {
                                ((i01) j01Var2.e(i53)).d(kj1Var);
                            }
                            sd0Var2.a(((xt[]) b5Var6.k)[i52]);
                            int i54 = zjVarI3.d;
                            i01 i01VarH = j01Var2.h();
                            if (i54 >= 0 && i54 != i51) {
                                if (i01VarH.h.e == 4) {
                                    v01 v01Var11 = zjVarI3.c;
                                    if (v01Var11.j != 2) {
                                        c80.t("block doesn't have exactly two successors");
                                        return classLoader4;
                                    }
                                    int iF4 = v01Var11.f(0);
                                    if (iF4 == i54) {
                                        iF4 = v01Var11.f(1);
                                    }
                                    if (iF4 == i51) {
                                        xt xtVar3 = xtVarArr[i54];
                                        int size2 = ((ArrayList) sd0Var2.f).size() - 2;
                                        try {
                                            ((ArrayList) sd0Var2.f).set(size2, ((dy2) ((ArrayList) sd0Var2.f).get(size2)).o(xtVar3));
                                        } catch (ClassCastException unused2) {
                                            s.j("non-reversible instruction");
                                            return classLoader4;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            s.j("too few instructions");
                                            return classLoader4;
                                        }
                                    }
                                }
                                sd0Var2.a(new dy2(pa0.I, i01VarH.i, s72.j, xtVarArr[i54]));
                            }
                            b5Var5 = b5Var6;
                            i49 = i50;
                            i25 = -1;
                            dq1Var3 = dq1Var4;
                        }
                        dq1 dq1Var5 = dq1Var3;
                        i2 = 1;
                        vu2 vu2Var = new vu2(b5Var2, (int[]) bb2Var4.h, b5Var5);
                        sd0 sd0Var3 = (sd0) dq1Var5.i;
                        ArrayList arrayList4 = (ArrayList) dq1Var5.j;
                        if (arrayList4 == null) {
                            ClassLoader classLoader6 = classLoader4;
                            c80.t("already processed");
                            return classLoader6;
                        }
                        int size3 = arrayList4.size();
                        for (int i55 = 0; i55 < size3; i55++) {
                            sd0Var3.a((a40) ((ArrayList) dq1Var5.j).get(i55));
                        }
                        ClassLoader classLoader7 = classLoader4;
                        dq1Var5.j = classLoader7;
                        kj1 kj1Var2 = new kj1(5);
                        if (sd0Var3 == null) {
                            um2.f("unprocessedInsns == null");
                            return classLoader7;
                        }
                        kj1Var2.i = sd0Var3;
                        kj1Var2.j = vu2Var;
                        kj1Var2.k = classLoader7;
                        kj1Var2.l = classLoader7;
                        i = i48;
                        ue0Var = new ue0(n30Var3, i, kj1Var2, wu2.j);
                    } else {
                        it2 = it6;
                        file5 = file2;
                        file6 = file7;
                        f80Var2 = f80Var3;
                        i = i12;
                        z70Var2 = z70Var3;
                        linkedHashMap = linkedHashMap4;
                        z8Var = z8Var2;
                        i2 = i11;
                        ue0Var = new ue0(n30Var2, i, classLoader4, wu2.j);
                    }
                    int i56 = 65546 & i;
                    f80 f80Var4 = f80Var2;
                    xs xsVar = f80Var4.g;
                    if (i56 != 0) {
                        xsVar.n.p.add(ue0Var);
                    } else {
                        xsVar.n.q.add(ue0Var);
                    }
                    i11 = i2;
                    linkedHashMap4 = linkedHashMap;
                    file2 = file5;
                    z8Var2 = z8Var;
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
                    li0 li0Var = d80Var.a;
                    int i57 = d80Var.b;
                    se0 se0Var = new se0(li0Var.c, i57);
                    int i58 = i57 & 8;
                    xs xsVar2 = f80Var.g;
                    if (i58 != 0) {
                        vs vsVar = xsVar2.n;
                        if (vsVar.r != null) {
                            c80.t("static fields already sorted");
                            return null;
                        }
                        vsVar.m.add(se0Var);
                        vsVar.n.put(se0Var, h30.h);
                    } else {
                        xsVar2.n.o.add(se0Var);
                    }
                }
            } else {
                it = it5;
                file3 = file2;
                file4 = file7;
                f80Var = f80Var3;
                z70Var = z70Var3;
            }
            xs xsVar3 = f80Var.g;
            ys ysVar = (ys) z70Var.m;
            TreeMap treeMap = ysVar.f;
            try {
                o43 o43Var = xsVar3.i.h;
                ysVar.g();
                if (treeMap.get(o43Var) != null) {
                    s.g("already added: ", o43Var);
                    return null;
                }
                treeMap.put(o43Var, xsVar3);
                sz0Var = this;
                it5 = it;
                file2 = file3;
                file7 = file4;
                classLoader2 = null;
                i10 = 16;
            } catch (NullPointerException unused4) {
                um2.f("clazz == null");
                return null;
            }
        }
        File file9 = file2;
        File file10 = file7;
        try {
            byte[] bArrB = ((z70) sz0Var.j).b();
            JarOutputStream jarOutputStream = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(file10)));
            file10.setReadOnly();
            try {
                JarEntry jarEntry = new JarEntry("classes.dex");
                jarEntry.setSize(bArrB.length);
                jarOutputStream.putNextEntry(jarEntry);
                try {
                    jarOutputStream.write(bArrB);
                    jarOutputStream.close();
                    return sz0Var.C(file10, file9, classLoader);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassLoader C(File file, File file2, ClassLoader classLoader) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gs1 D(j63 j63Var, boolean z) {
        final String str;
        gs1 izVar;
        final Type type = j63Var.b;
        Class cls = j63Var.a;
        Map map = (Map) this.i;
        s sVar = null;
        if (map.get(type) != null) {
            c80.g();
            return null;
        }
        if (map.get(cls) != null) {
            c80.g();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        gs1 gs1Var = EnumSet.class.isAssignableFrom(cls) ? new gs1() { // from class: jz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.gs1
            public final Object a() {
                int i3 = i2;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            s.m("Invalid EnumSet type: ", type2);
                        } else {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type3 instanceof Class)) {
                                s.m("Invalid EnumSet type: ", type2);
                            }
                        }
                        break;
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            s.m("Invalid EnumMap type: ", type2);
                        } else {
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type4 instanceof Class)) {
                                s.m("Invalid EnumMap type: ", type2);
                            }
                        }
                        break;
                }
                return null;
            }
        } : cls == EnumMap.class ? new gs1() { // from class: jz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.gs1
            public final Object a() {
                int i3 = i;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            s.m("Invalid EnumSet type: ", type2);
                        } else {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type3 instanceof Class)) {
                                s.m("Invalid EnumSet type: ", type2);
                            }
                        }
                        break;
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            s.m("Invalid EnumMap type: ", type2);
                        } else {
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type4 instanceof Class)) {
                                s.m("Invalid EnumMap type: ", type2);
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
        sp0.B((List) this.j);
        if (Modifier.isAbstract(cls.getModifiers())) {
            izVar = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                tp0 tp0Var = h72.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + h72.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + h72.e(e);
                }
                izVar = str != null ? new gs1() { // from class: hz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.gs1
                    public final Object a() {
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
                } : new iz(i2, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                izVar = null;
            }
        }
        if (izVar != null) {
            return izVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                sVar = new s(24);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                sVar = new s(25);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                sVar = new s(26);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                sVar = new s(27);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(mb1.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length != 0 && tl.F(actualTypeArguments[0]) == String.class) {
                    }
                }
                sVar = new s(19);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                sVar = new s(20);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                sVar = new s(21);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                sVar = new s(22);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                sVar = new s(23);
            }
        }
        if (sVar != null) {
            return sVar;
        }
        final String strR = r(cls);
        if (strR != null) {
            return new gs1() { // from class: hz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.gs1
                public final Object a() {
                    int i3 = i;
                    String str2 = strR;
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
            return new iz(i, cls);
        }
        final String str2 = "Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.";
        final int i3 = 2;
        return new gs1() { // from class: hz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.gs1
            public final Object a() {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object E(y12 y12Var) {
        HashMap map = (HashMap) this.j;
        er0 er0Var = (er0) map.get(y12Var);
        if (er0Var == null) {
            er0Var = new er0(y12Var);
            map.put(y12Var, er0Var);
        } else {
            y12Var.a();
        }
        er0 er0Var2 = er0Var.d;
        er0Var2.c = er0Var.c;
        er0Var.c.d = er0Var2;
        er0 er0Var3 = (er0) this.i;
        er0Var.d = er0Var3;
        er0 er0Var4 = er0Var3.c;
        er0Var.c = er0Var4;
        er0Var4.d = er0Var;
        er0Var.d.c = er0Var;
        ArrayList arrayList = er0Var.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return er0Var.b.remove(size - 1);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputMethodManager F() {
        return (InputMethodManager) ((j71) this.j).getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nf1 G() {
        return (nf1) ((nx1) this.j).getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f80 H(a63 a63Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        f80 f80Var = (f80) linkedHashMap.get(a63Var);
        if (f80Var != null) {
            return f80Var;
        }
        f80 f80Var2 = new f80(a63Var);
        linkedHashMap.put(a63Var, f80Var2);
        return f80Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AutofillId I(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b00.b(e6.e(this.j), ((View) this.i).getAutofillId(), j);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void J(y12 y12Var, Object obj) {
        HashMap map = (HashMap) this.j;
        er0 er0Var = (er0) map.get(y12Var);
        if (er0Var == null) {
            er0Var = new er0(y12Var);
            er0Var.d = er0Var;
            er0 er0Var2 = (er0) this.i;
            er0Var.d = er0Var2.d;
            er0Var.c = er0Var2;
            er0Var2.d = er0Var;
            er0Var.d.c = er0Var;
            map.put(y12Var, er0Var);
        } else {
            y12Var.a();
        }
        if (er0Var.b == null) {
            er0Var.b = new ArrayList();
        }
        er0Var.b.add(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object K(String str, int i, u00 u00Var) {
        return p7.R((c20) this.i, new v80(this, str, i, null, 1), u00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void L(String str) {
        c90 c90Var;
        synchronized (this) {
            try {
                c90Var = (c90) ((HashMap) this.i).get(str);
                fg1.q("Argument must not be null", c90Var);
                int i = c90Var.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c90Var.b);
                }
                int i2 = i - 1;
                c90Var.b = i2;
                if (i2 == 0) {
                    c90 c90Var2 = (c90) ((HashMap) this.i).remove(str);
                    if (!c90Var2.equals(c90Var)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c90Var + ", but actually removed: " + c90Var2 + ", safeKey: " + str);
                    }
                    fo foVar = (fo) this.j;
                    synchronized (foVar.a) {
                        try {
                            if (foVar.a.size() < 10) {
                                foVar.a.offer(c90Var2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c90Var.a.unlock();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object M() {
        er0 er0Var = (er0) this.i;
        er0 er0Var2 = er0Var.d;
        while (true) {
            boolean zEquals = er0Var2.equals(er0Var);
            Object obj = er0Var2.a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = er0Var2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? er0Var2.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            er0 er0Var3 = er0Var2.d;
            er0Var3.c = er0Var2.c;
            er0Var2.c.d = er0Var3;
            ((HashMap) this.j).remove(obj);
            ((y12) obj).a();
            er0Var2 = er0Var2.d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void N(String str, Float f) {
        Activity activity = up0.k;
        if (activity != null) {
            activity.runOnUiThread(new lb(this, str, f, 5));
        } else {
            t11.S("hostAct");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gh2
    public Object a(hh2 hh2Var, Object obj, String str, ArrayList arrayList, cw0 cw0Var) {
        boolean zContainsKey;
        String str2 = hh2Var.a;
        kj1 kj1Var = (kj1) this.i;
        kj1Var.getClass();
        str2.getClass();
        synchronized (kj1Var.j) {
            zContainsKey = kj1Var.D().containsKey(str2);
        }
        if (zContainsKey) {
            return ((gh2) this.j).a(hh2Var, obj, str, arrayList, cw0Var);
        }
        throw new eh2(12, "PERMISSION_DENIED", "Host reflection access has been revoked for this script.", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cp
    public void b(wo woVar, q92 q92Var) {
        ((a50) this.j).h.execute(new lb(this, (cp) this.i, q92Var, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.we0
    public boolean c(Object obj, File file, ov1 ov1Var) {
        return ((vk) this.j).c(new al((zk) this.i, ((BitmapDrawable) ((d92) obj).get()).getBitmap()), file, ov1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cp
    public void d(wo woVar, Throwable th) {
        ((a50) this.j).h.execute(new lb(this, (cp) this.i, th, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo
    public Type e() {
        return (Type) this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j92
    public int h(ov1 ov1Var) {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo
    public Object i(ct1 ct1Var) {
        Executor executor = (Executor) this.j;
        return executor == null ? ct1Var : new a50(executor, ct1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gh2
    public Object j(hh2 hh2Var, Object obj, String str, hw0 hw0Var) {
        boolean zContainsKey;
        String str2 = hh2Var.a;
        kj1 kj1Var = (kj1) this.i;
        kj1Var.getClass();
        str2.getClass();
        synchronized (kj1Var.j) {
            zContainsKey = kj1Var.D().containsKey(str2);
        }
        if (zContainsKey) {
            return ((gh2) this.j).j(hh2Var, obj, str, hw0Var);
        }
        throw new eh2(12, "PERMISSION_DENIED", "Host reflection access has been revoked for this script.", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ys2
    public fr2 l() {
        return (ug0) this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ys2
    public ht2 n() {
        return (vg0) this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k03 q(List list) {
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
                    rd0Var2.a((sd0) this.j);
                    i++;
                    rd0Var = rd0Var2;
                } catch (Exception e3) {
                    e = e3;
                    rd0Var = rd0Var2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((sx1) ((sd0) this.j).f).b());
                    sb2.append(", composition=");
                    sb2.append(((sd0) this.j).h());
                    sb2.append(", selection=");
                    sd0 sd0Var = (sd0) this.j;
                    sb2.append((Object) f13.h(fg1.i(sd0Var.b, sd0Var.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    du.t0(list, sb, new v(9, rd0Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            sd0 sd0Var2 = (sd0) this.j;
            sd0Var2.getClass();
            sd sdVar = new sd(((sx1) sd0Var2.f).toString());
            sd0 sd0Var3 = (sd0) this.j;
            long jI = fg1.i(sd0Var3.b, sd0Var3.c);
            f13 f13Var = f13.g(((k03) this.i).b) ? null : new f13(jI);
            k03 k03Var = new k03(sdVar, f13Var != null ? f13Var.a : fg1.i(f13.e(jI), f13.f(jI)), ((sd0) this.j).h());
            this.i = k03Var;
            return k03Var;
        } catch (Exception e4) {
            rd0Var = null;
            e = e4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wt t(vg1 vg1Var) {
        a63 a63Var = vg1Var.a;
        String str = vg1Var.c;
        LinkedHashMap linkedHashMap = H(a63Var).i;
        if (linkedHashMap.containsKey(vg1Var)) {
            c80.m("already declared: ", vg1Var);
            return null;
        }
        e80 e80Var = new e80(vg1Var, (str.equals("<init>") || str.equals("<clinit>")) ? 65537 : 1);
        linkedHashMap.put(vg1Var, e80Var);
        return e80Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q01
    public n01 toInstant() {
        throw new o01(((String) this.i) + " when parsing an Instant from \"" + qp0.W((String) this.j, 64) + '\"');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 2:
                return "AnimationResult(endReason=" + ((fd) this.j) + ", endState=" + ((id) this.i) + ')';
            case 5:
                return ((Map) this.i).toString();
            case AIChatConfig.MaxContextRounds /* 20 */:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                er0 er0Var = (er0) this.i;
                er0 er0Var2 = er0Var.c;
                boolean z = false;
                while (!er0Var2.equals(er0Var)) {
                    sb.append('{');
                    sb.append(er0Var2.a);
                    sb.append(':');
                    ArrayList arrayList = er0Var2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    er0Var2 = er0Var2.c;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ga1
    public void x() {
        Context context = (Context) this.i;
        if (er2.l == null) {
            synchronized (er2.class) {
                try {
                    if (er2.l == null) {
                        er2.l = new er2(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        er2 er2Var = er2.l;
        w82 w82Var = (w82) this.j;
        synchronized (er2Var) {
            ((HashSet) er2Var.k).add(w82Var);
            er2Var.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(li0 li0Var, int i) {
        LinkedHashMap linkedHashMap = H(li0Var.a).h;
        if (linkedHashMap.containsKey(li0Var)) {
            c80.m("already declared: ", li0Var);
        } else {
            linkedHashMap.put(li0Var, new d80(li0Var, i));
        }
    }

    public /* synthetic */ sz0(int i, Object obj, Object obj2, boolean z) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [d91.<init>(int, int):void, t91.<init>(iz2, b62, bt2):void, te.<clinit>():void] */
    public /* synthetic */ sz0(int i, boolean z) {
        this.h = i;
    }

    public sz0(kj1 kj1Var) {
        this.h = 29;
        kj1Var.getClass();
        this.i = kj1Var;
        this.j = fh2.a;
    }

    public sz0(File file, c20 c20Var) {
        this.h = 14;
        c20Var.getClass();
        this.i = c20Var;
        this.j = file.getAbsoluteFile();
    }

    public sz0(Context context, w82 w82Var) {
        this.h = 9;
        this.i = context.getApplicationContext();
        this.j = w82Var;
    }

    public sz0(String str) {
        this.h = 11;
        this.i = op0.u(str);
        this.j = new jx1(ci0.C(0.0f, 0.0f, 1.0f));
    }

    public sz0(b5 b5Var) {
        this.h = 25;
        kj1 kj1Var = new kj1(b5Var);
        this.j = new l40(3);
        this.i = kj1Var;
    }

    public sz0(r61 r61Var, nf1 nf1Var) {
        this.h = 22;
        this.i = r61Var;
        this.j = op0.u(nf1Var);
    }

    public sz0(View view) {
        this.h = 0;
        this.i = view;
        this.j = p7.B(i91.i, new ta(12, this));
    }

    public sz0(z71 z71Var) {
        this.h = 23;
        this.i = z71Var;
        gk1 gk1Var = hs1.a;
        this.j = new gk1();
    }

    public sz0(f90 f90Var) {
        this.h = 17;
        xg0 xg0Var = (xg0) f90Var.d;
        this.i = new ug0(f90Var, xg0Var.f().l(), -1L, true);
        this.j = new vg0(f90Var, xg0Var.f().n(), -1L, true);
    }

    public /* synthetic */ sz0(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }
}
