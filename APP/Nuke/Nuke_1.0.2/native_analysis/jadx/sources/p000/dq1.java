package p000;

import android.graphics.Bitmap;
import android.view.WindowInsetsAnimation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 implements InterfaceC0137dp, InterfaceC0508np, jv1, wc2, e40, wa0, om2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2146h;

    /* JADX INFO: renamed from: i */
    public Object f2147i;

    /* JADX INFO: renamed from: j */
    public Object f2148j;

    public dq1(int i) {
        this.f2146h = i;
        switch (i) {
            case 7:
                this.f2147i = new ArrayList();
                this.f2148j = new HashMap();
                break;
            case 8:
                this.f2147i = new LinkedHashMap();
                this.f2148j = new LinkedHashMap();
                break;
            case 9:
                this.f2147i = new wd1(1000L);
                this.f2148j = s11.m4711o0(10, new j51(19));
                break;
            case 16:
                break;
            case 17:
                this.f2147i = new ix2(1);
                this.f2148j = new xd1(16);
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                this.f2147i = new zk1(new Reference[16]);
                this.f2148j = new ReferenceQueue();
                break;
            default:
                this.f2147i = new zk1(new r61[16]);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [th1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [th1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: A */
    public static void m1070A(r61 r61Var) {
        if (r61Var.f9382W > 0) {
            if (r61Var.f9373N.f11783d == n61.f7022l && !r61Var.m4384p() && !r61Var.m4385q() && !r61Var.f9383X && r61Var.m4351I()) {
                th1 th1Var = (th1) r61Var.f9372M.f12036g;
                if ((th1Var.f10760k & 256) != 0) {
                    while (th1Var != null) {
                        if ((th1Var.f10759j & 256) != 0) {
                            ?? M4952m = th1Var;
                            ?? zk1Var = 0;
                            while (M4952m != 0) {
                                if (M4952m instanceof dq0) {
                                    dq0 dq0Var = (dq0) M4952m;
                                    dq0Var.mo1069w(sp0.m4927Z(dq0Var, 256));
                                } else if ((M4952m.f10759j & 256) != 0 && (M4952m instanceof u60)) {
                                    th1 th1Var2 = ((u60) M4952m).f11116w;
                                    int i = 0;
                                    M4952m = M4952m;
                                    zk1Var = zk1Var;
                                    while (th1Var2 != null) {
                                        if ((th1Var2.f10759j & 256) != 0) {
                                            i++;
                                            zk1Var = zk1Var;
                                            if (i == 1) {
                                                M4952m = th1Var2;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M4952m != 0) {
                                                    zk1Var.m6423b(M4952m);
                                                    M4952m = 0;
                                                }
                                                zk1Var.m6423b(th1Var2);
                                            }
                                        }
                                        th1Var2 = th1Var2.f10762m;
                                        M4952m = M4952m;
                                        zk1Var = zk1Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M4952m = sp0.m4952m(zk1Var);
                            }
                        }
                        if ((th1Var.f10760k & 256) == 0) {
                            break;
                        } else {
                            th1Var = th1Var.f10762m;
                        }
                    }
                }
            }
            r61Var.f9381V = false;
            zk1 zk1VarM4393y = r61Var.m4393y();
            Object[] objArr = zk1VarM4393y.f13934h;
            int i2 = zk1VarM4393y.f13936j;
            for (int i3 = 0; i3 < i2; i3++) {
                m1070A((r61) objArr[i3]);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m1071B(File file, File file2) throws IOException {
        String path = file.getPath();
        String path2 = file2.getPath();
        if (t11.m5086l(path2, path)) {
            return;
        }
        path2.getClass();
        if (wv2.m6012d0(path2, path + File.separator, false)) {
            return;
        }
        c80.m678v("Script path escapes its storage root.");
    }

    /* JADX INFO: renamed from: C */
    public static void m1072C(File file, File file2, boolean z) throws IOException {
        Path path = file.getCanonicalFile().toPath();
        Path pathNormalize = file2.getAbsoluteFile().toPath().normalize();
        if (!pathNormalize.startsWith(path)) {
            c80.m678v("Script path escapes its storage root.");
            return;
        }
        Path pathRelativize = path.relativize(pathNormalize);
        pathRelativize.getClass();
        int i = 0;
        for (Object obj : pathRelativize) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            path = path.resolve((Path) obj);
            if ((i != pathRelativize.getNameCount() - 1 || z) && Files.exists(path, new LinkOption[0]) && Files.isSymbolicLink(path)) {
                c80.m678v("Symbolic links are not supported in script storage.");
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m1073J(File file, File file2, boolean z) throws IOException {
        StandardCopyOption[] standardCopyOptionArr = z ? new StandardCopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING} : new StandardCopyOption[]{StandardCopyOption.ATOMIC_MOVE};
        try {
            Files.move(file.toPath(), file2.toPath(), (CopyOption[]) Arrays.copyOf(standardCopyOptionArr, standardCopyOptionArr.length));
        } catch (AtomicMoveNotSupportedException unused) {
            StandardCopyOption[] standardCopyOptionArr2 = z ? new StandardCopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new StandardCopyOption[0];
            Files.move(file.toPath(), file2.toPath(), (CopyOption[]) Arrays.copyOf(standardCopyOptionArr2, standardCopyOptionArr2.length));
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m1074S(hg2 hg2Var) {
        if (hg2Var.f4002a != fg2.f2985h) {
            return;
        }
        c80.m672p("PERMISSION_DENIED", "Package files are read-only.", 0, null, null, 28);
    }

    /* JADX INFO: renamed from: n */
    public static final void m1075n(dq1 dq1Var, File file, File file2) throws IOException {
        File canonicalFile = file2.getCanonicalFile();
        canonicalFile.getClass();
        File canonicalFile2 = file.getCanonicalFile();
        canonicalFile2.getClass();
        m1071B(canonicalFile, canonicalFile2);
        ArrayList arrayList = new ArrayList();
        while (file != null && !file.exists()) {
            arrayList.add(file);
            file = file.getParentFile();
        }
        if (file != null && Files.isSymbolicLink(file.toPath())) {
            c80.m678v("Symbolic links are not supported in script storage.");
            return;
        }
        Iterator it = new fa2(arrayList).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((ea2) it).f2375i;
            if (!listIterator.hasPrevious()) {
                return;
            }
            File file3 = (File) listIterator.previous();
            if (!file3.mkdir() && !file3.isDirectory()) {
                c80.m678v("Unable to create parent directory.");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00fd -> B:50:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x011e -> B:49:0x011f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1076o(dq1 dq1Var, hg2 hg2Var, u00 u00Var) throws Throwable {
        qg2 qg2Var;
        String str;
        Collection arrayList;
        Iterator it;
        if (u00Var instanceof qg2) {
            qg2Var = (qg2) u00Var;
            int i = qg2Var.f8969q;
            if ((i & Integer.MIN_VALUE) != 0) {
                qg2Var.f8969q = i - Integer.MIN_VALUE;
            } else {
                qg2Var = new qg2(dq1Var, u00Var);
            }
        }
        Object objM1087K = qg2Var.f8967o;
        int i2 = qg2Var.f8969q;
        ig2 ig2Var = ig2.f4608i;
        if (i2 == 0) {
            fg1.m1627T(objM1087K);
            ig2 ig2VarM1088L = dq1Var.m1088L(hg2Var.f4003b);
            String str2 = hg2Var.f4003b;
            if (ig2VarM1088L != ig2Var) {
                throw new FileNotFoundException("Package directory does not exist: ".concat(str2));
            }
            String str3 = str2.length() > 0 ? str2 : null;
            String strConcat = str3 != null ? str3.concat("/") : "";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = ((u22) ((vn1) dq1Var.f2147i).f12031b).f11080f.iterator();
            while (it2.hasNext()) {
                String str4 = ((oi2) it2.next()).f7690h;
                if (wv2.m6012d0(str4, strConcat, false)) {
                    String strM4012y0 = pv2.m4012y0(str4, strConcat);
                    if (strM4012y0.length() != 0) {
                        String strM3991G0 = pv2.m3991G0(strM4012y0, '/');
                        ig2 ig2Var2 = pv2.m3996i0(strM4012y0, '/') ? ig2Var : ig2.f4607h;
                        if (linkedHashMap.get(strM3991G0) == ig2Var) {
                            ig2Var2 = ig2Var;
                        }
                        linkedHashMap.put(strM3991G0, ig2Var2);
                    }
                }
            }
            Set setEntrySet = linkedHashMap.entrySet();
            setEntrySet.getClass();
            List listM1143A0 = AbstractC0142du.m1143A0(setEntrySet, new sl0(19));
            str = strConcat;
            arrayList = new ArrayList(AbstractC0179eu.m1421B(listM1143A0, 10));
            it = listM1143A0.iterator();
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = qg2Var.f8966n;
            it = qg2Var.f8965m;
            Collection collection = qg2Var.f8964l;
            str = qg2Var.f8963k;
            fg1.m1627T(objM1087K);
            gg2 gg2Var = (gg2) objM1087K;
            arrayList.add(gg2Var);
            arrayList = collection;
            if (!it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getClass();
                Object key = entry.getKey();
                key.getClass();
                Object value = entry.getValue();
                value.getClass();
                ig2 ig2Var3 = (ig2) value;
                hg2 hg2Var2 = new hg2(fg2.f2985h, hk1.m2209h(str, (String) key));
                if (ig2Var3 == ig2Var) {
                    gg2Var = new gg2(hg2Var2, true, 0L, null);
                    collection = arrayList;
                    arrayList.add(gg2Var);
                    arrayList = collection;
                    if (!it.hasNext()) {
                        return (List) arrayList;
                    }
                } else {
                    qg2Var.f8963k = str;
                    Collection collection2 = arrayList;
                    qg2Var.f8964l = collection2;
                    qg2Var.f8965m = it;
                    qg2Var.f8966n = collection2;
                    qg2Var.f8969q = 1;
                    objM1087K = dq1Var.m1087K(hg2Var2, qg2Var);
                    Object obj = k20.f5323h;
                    if (objM1087K == obj) {
                        return obj;
                    }
                    collection = arrayList;
                    gg2 gg2Var2 = (gg2) objM1087K;
                    arrayList.add(gg2Var2);
                    arrayList = collection;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m1077q(z70 z70Var, AbstractC0147dz abstractC0147dz) {
        if (!(abstractC0147dz instanceof x20)) {
            z70Var.m6385a(abstractC0147dz);
            return;
        }
        w20 w20Var = ((x20) abstractC0147dz).f12772h;
        int length = w20Var.f5590i.length;
        for (int i = 0; i < length; i++) {
            m1077q(z70Var, (AbstractC0147dz) w20Var.m2693e(i));
        }
    }

    /* JADX INFO: renamed from: s */
    public static long m1078s(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            c80.m678v("Unable to inspect script storage quota.");
            return 0L;
        }
        long jAddExact = 0;
        for (File file2 : fileArrListFiles) {
            if (Files.isSymbolicLink(file2.toPath())) {
                c80.m678v("Symbolic links are not supported in script storage.");
                return 0L;
            }
            jAddExact = Math.addExact(jAddExact, file2.isDirectory() ? m1078s(file2) : file2.length());
        }
        return jAddExact;
    }

    /* JADX INFO: renamed from: u */
    public static int m1079u(AbstractC0147dz abstractC0147dz) {
        if (abstractC0147dz instanceof z20) {
            return 0;
        }
        if (abstractC0147dz instanceof p30) {
            return 2;
        }
        if (abstractC0147dz instanceof a30) {
            return 3;
        }
        if (abstractC0147dz instanceof g30) {
            return 4;
        }
        if (abstractC0147dz instanceof l30) {
            return 6;
        }
        if (abstractC0147dz instanceof d30) {
            return 16;
        }
        if (abstractC0147dz instanceof b30) {
            return 17;
        }
        if (abstractC0147dz instanceof q30) {
            return 23;
        }
        if (abstractC0147dz instanceof r30) {
            return 24;
        }
        if (abstractC0147dz instanceof c30) {
            return 25;
        }
        if (abstractC0147dz instanceof n30) {
            return 26;
        }
        if (abstractC0147dz instanceof x20) {
            return 28;
        }
        if (abstractC0147dz instanceof h30) {
            return 30;
        }
        if (abstractC0147dz instanceof y20) {
            return 31;
        }
        c80.m667j("Shouldn't happen");
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public static void m1080x(File file) throws IOException {
        if (Files.isSymbolicLink(file.toPath())) {
            c80.m678v("Symbolic links are not supported in script storage.");
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                c80.m678v("Unable to list directory.");
                return;
            }
            for (File file2 : fileArrListFiles) {
                m1080x(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        c80.m678v("Unable to remove target.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1081D(hg2 hg2Var, u00 u00Var) throws Throwable {
        ng2 ng2Var;
        if (u00Var instanceof ng2) {
            ng2Var = (ng2) u00Var;
            int i = ng2Var.f7154m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ng2Var.f7154m = i - Integer.MIN_VALUE;
            } else {
                ng2Var = new ng2(this, u00Var);
            }
        }
        Object obj = ng2Var.f7152k;
        int i2 = ng2Var.f7154m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            c20 c20Var = ((df2) ((vn1) this.f2147i).f12033d).f2032j;
            u30 u30Var = new u30(null, hg2Var, this);
            ng2Var.f7154m = 1;
            Object objM3762R = AbstractC0570p7.m3762R(c20Var, u30Var, ng2Var);
            k20 k20Var = k20.f5323h;
            return objM3762R == k20Var ? k20Var : objM3762R;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.m672p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: E */
    public synchronized List m1082E(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f2147i).contains(str)) {
                ((ArrayList) this.f2147i).add(str);
            }
            arrayList = (List) ((HashMap) this.f2148j).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f2148j).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public synchronized ArrayList m1083F(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f2147i).iterator();
        while (it.hasNext()) {
            List<h92> list = (List) ((HashMap) this.f2148j).get((String) it.next());
            if (list != null) {
                for (h92 h92Var : list) {
                    if ((h92Var.f3924a.isAssignableFrom(cls) && cls2.isAssignableFrom(h92Var.f3925b)) && !arrayList.contains(h92Var.f3925b)) {
                        arrayList.add(h92Var.f3925b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public String m1084G(a51 a51Var) {
        String str;
        synchronized (((wd1) this.f2147i)) {
            str = (String) ((wd1) this.f2147i).m5869c(a51Var);
        }
        if (str == null) {
            zb2 zb2Var = (zb2) ((C0043b5) this.f2148j).mo19c();
            try {
                a51Var.mo96b(zb2Var.f13821h);
                byte[] bArrDigest = zb2Var.f13821h.digest();
                char[] cArr = b93.f748b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = b93.f747a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C0043b5) this.f2148j).mo18a(zb2Var);
            }
        }
        synchronized (((wd1) this.f2147i)) {
            ((wd1) this.f2147i).m5871f(a51Var, str);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1085H(hg2 hg2Var, u00 u00Var) throws Throwable {
        pg2 pg2Var;
        if (u00Var instanceof pg2) {
            pg2Var = (pg2) u00Var;
            int i = pg2Var.f8311m;
            if ((i & Integer.MIN_VALUE) != 0) {
                pg2Var.f8311m = i - Integer.MIN_VALUE;
            } else {
                pg2Var = new pg2(this, u00Var);
            }
        }
        Object obj = pg2Var.f8309k;
        int i2 = pg2Var.f8311m;
        t00 t00Var = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            c20 c20Var = ((df2) ((vn1) this.f2147i).f12033d).f2032j;
            og2 og2Var = new og2(t00Var, hg2Var, this, 0);
            pg2Var.f8311m = 1;
            Object objM3762R = AbstractC0570p7.m3762R(c20Var, og2Var, pg2Var);
            k20 k20Var = k20.f5323h;
            return objM3762R == k20Var ? k20Var : objM3762R;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.m672p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1086I(hg2 hg2Var, hg2 hg2Var2, dl2 dl2Var, u00 u00Var) throws Throwable {
        rg2 rg2Var;
        if (u00Var instanceof rg2) {
            rg2Var = (rg2) u00Var;
            int i = rg2Var.f9558o;
            if ((i & Integer.MIN_VALUE) != 0) {
                rg2Var.f9558o = i - Integer.MIN_VALUE;
            } else {
                rg2Var = new rg2(this, u00Var);
            }
        }
        Object objM1110v = rg2Var.f9556m;
        int i2 = rg2Var.f9558o;
        Object obj = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM1110v);
            m1074S(hg2Var);
            rg2Var.f9554k = hg2Var;
            rg2Var.f9558o = 1;
            objM1110v = m1110v(hg2Var, hg2Var2, dl2Var, rg2Var);
            if (objM1110v != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gg2 gg2Var = rg2Var.f9555l;
            fg1.m1627T(objM1110v);
            return gg2Var;
        }
        hg2Var = rg2Var.f9554k;
        fg1.m1627T(objM1110v);
        gg2 gg2Var2 = (gg2) objM1110v;
        ui2 ui2Var = new ui2(false, false);
        rg2Var.f9554k = null;
        rg2Var.f9555l = gg2Var2;
        rg2Var.f9558o = 2;
        return m1094R(hg2Var, ui2Var, rg2Var) == obj ? obj : gg2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1087K(hg2 hg2Var, u00 u00Var) throws Throwable {
        sg2 sg2Var;
        if (u00Var instanceof sg2) {
            sg2Var = (sg2) u00Var;
            int i = sg2Var.f10138n;
            if ((i & Integer.MIN_VALUE) != 0) {
                sg2Var.f10138n = i - Integer.MIN_VALUE;
            } else {
                sg2Var = new sg2(this, u00Var);
            }
        }
        Object objM1091O = sg2Var.f10136l;
        int i2 = sg2Var.f10138n;
        if (i2 == 0) {
            fg1.m1627T(objM1091O);
            ig2 ig2VarM1088L = m1088L(hg2Var.f4003b);
            int i3 = ig2VarM1088L == null ? -1 : jg2.f5027a[ig2VarM1088L.ordinal()];
            if (i3 == -1) {
                throw new FileNotFoundException("Package path does not exist: ".concat(hg2Var.f4003b));
            }
            if (i3 == 1) {
                return new gg2(hg2Var, true, 0L, null);
            }
            if (i3 != 2) {
                c80.m675s();
                return null;
            }
            sg2Var.f10135k = hg2Var;
            sg2Var.f10138n = 1;
            objM1091O = m1091O(hg2Var, sg2Var);
            Object obj = k20.f5323h;
            if (objM1091O == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hg2Var = sg2Var.f10135k;
            fg1.m1627T(objM1091O);
        }
        return new gg2(hg2Var, false, ((byte[]) objM1091O).length, null);
    }

    /* JADX INFO: renamed from: L */
    public ig2 m1088L(String str) {
        u22 u22Var = (u22) ((vn1) this.f2147i).f12031b;
        int length = str.length();
        ig2 ig2Var = ig2.f4608i;
        if (length == 0) {
            return ig2Var;
        }
        List list = u22Var.f11080f;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (t11.m5086l(((oi2) it.next()).f7690h, str)) {
                    return ig2.f4607h;
                }
            }
        }
        String strConcat = str.concat("/");
        List list2 = u22Var.f11080f;
        if (list2 != null && list2.isEmpty()) {
            return null;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (wv2.m6012d0(((oi2) it2.next()).f7690h, strConcat, false)) {
                return ig2Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c0, code lost:
    
        if (r2 != r14) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0301 A[LOOP:0: B:102:0x02fb->B:104:0x0301, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x033d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0271  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0251 -> B:79:0x0257). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1089M(oh2 oh2Var, u00 u00Var) throws bh2, dg2 {
        mi2 mi2Var;
        boolean z;
        oh2 oh2Var2;
        List list;
        th2 th2Var;
        a72 a72Var;
        a72 a72Var2;
        Collection arrayList;
        mf2 mf2Var;
        mi2 mi2Var2;
        oh2 oh2Var3;
        List list2;
        Iterator it;
        List list3;
        Object next;
        th2 th2Var2;
        List list4;
        String str;
        th2 th2Var3;
        List list5;
        String str2;
        int iM6103U;
        ArrayList<ii2> arrayList2;
        boolean z2;
        oh2 oh2Var4 = oh2Var;
        if (u00Var instanceof mi2) {
            mi2Var = (mi2) u00Var;
            int i = mi2Var.f6669w;
            if ((i & Integer.MIN_VALUE) != 0) {
                mi2Var.f6669w = i - Integer.MIN_VALUE;
            } else {
                mi2Var = new mi2(this, u00Var);
            }
        }
        Object objM1112y = mi2Var.f6667u;
        int i2 = mi2Var.f6669w;
        si2 si2Var = si2.f10154j;
        int i3 = 1;
        Object obj = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM1112y);
            sz0 sz0Var = oh2Var4.f7685a;
            mi2Var.f6657k = oh2Var4;
            mi2Var.f6669w = 1;
            objM1112y = m1112y(sz0Var, mi2Var);
            if (objM1112y != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            oh2Var4 = mi2Var.f6657k;
            fg1.m1627T(objM1112y);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    a72Var = mi2Var.f6660n;
                    th2Var = mi2Var.f6659m;
                    list = mi2Var.f6658l;
                    oh2Var2 = mi2Var.f6657k;
                    fg1.m1627T(objM1112y);
                    z = false;
                    mf2 mf2Var2 = (mf2) objM1112y;
                    a72Var.f108h += mf2Var2.f6633b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        boolean z3 = z;
                        if (wv2.m6005W(((oi2) obj2).f7690h, ".js", z3)) {
                            arrayList3.add(obj2);
                        }
                        z = z3;
                    }
                    if (!arrayList3.contains(new oi2(th2Var.f10778g))) {
                        throw new dg2(th2Var.f10774c, si2Var, th2Var.f10778g, "Entry module declared by the manifest does not exist.", null, 16);
                    }
                    a72Var2 = a72Var;
                    arrayList = new ArrayList(AbstractC0179eu.m1421B(arrayList3, 10));
                    oh2 oh2Var5 = oh2Var2;
                    mf2Var = mf2Var2;
                    mi2Var2 = mi2Var;
                    oh2Var3 = oh2Var5;
                    list2 = list;
                    it = arrayList3.iterator();
                    String str3 = th2Var.f10774c;
                    if (it.hasNext()) {
                    }
                    return obj;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) mi2Var.f6663q;
                    list5 = mi2Var.f6662p;
                    mf2Var = mi2Var.f6661o;
                    a72Var2 = mi2Var.f6660n;
                    th2Var3 = mi2Var.f6659m;
                    list2 = mi2Var.f6658l;
                    oh2Var3 = mi2Var.f6657k;
                    fg1.m1627T(objM1112y);
                    String str4 = (String) objM1112y;
                    a72Var2.f108h = m1109t(th2Var3.f10774c, str2, str4, a72Var2.f108h);
                    list3 = list5;
                    th2Var2 = th2Var3;
                    list4 = list2;
                    str = str4;
                    String str5 = th2Var2.f10774c;
                    String str6 = th2Var2.f10778g;
                    Set set = dh2.f2055a;
                    str5.getClass();
                    list3.getClass();
                    set.getClass();
                    iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(list3, 10));
                    if (iM6103U < 16) {
                        iM6103U = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM6103U);
                    for (Object obj3 : list3) {
                        linkedHashMap.put(new oi2(((ii2) obj3).f4645a), obj3);
                    }
                    arrayList2 = new ArrayList();
                    fg1.m1618K(new HashSet(), new LinkedHashSet(), str5, linkedHashMap, arrayList2, set, str6);
                    ri2 ri2Var = th2Var2.f10782k;
                    z2 = ri2Var.f9601a != null;
                    boolean z4 = ri2Var.f9602b != null;
                    if (!z2 || !z4) {
                        for (ii2 ii2Var : arrayList2) {
                            Set set2 = ig0.f4603a;
                            List listM2343a = ig0.m2343a(ii2Var.f4646b);
                            if (!z2 && listM2343a.contains("nuke:http")) {
                                throw new dg2(th2Var2.f10774c, si2Var, ii2Var.f4645a, "The script imports 'nuke:http' without declaring network permission.", null, 16);
                            }
                            if (!z4 && listM2343a.contains("nuke:host")) {
                                throw new dg2(th2Var2.f10774c, si2Var, ii2Var.f4645a, "The script imports 'nuke:host' without declaring host permission.", null, 16);
                            }
                        }
                    }
                    return new u22(th2Var2, arrayList2, str, mf2Var.f6632a, oh2Var3.f7685a, list4);
                }
                arrayList = mi2Var.f6666t;
                String str7 = mi2Var.f6665s;
                it = mi2Var.f6664r;
                Collection collection = (Collection) mi2Var.f6663q;
                mf2 mf2Var3 = mi2Var.f6661o;
                a72 a72Var3 = mi2Var.f6660n;
                th2 th2Var4 = mi2Var.f6659m;
                List list6 = mi2Var.f6658l;
                oh2 oh2Var6 = mi2Var.f6657k;
                fg1.m1627T(objM1112y);
                String str8 = str7;
                th2Var = th2Var4;
                List list7 = list6;
                a72Var2 = a72Var3;
                mf2Var = mf2Var3;
                String str9 = (String) objM1112y;
                a72Var2.f108h = m1109t(th2Var.f10774c, str8, str9, a72Var2.f108h);
                arrayList.add(new ii2(str8, str9));
                mi2Var2 = mi2Var;
                oh2Var3 = oh2Var6;
                arrayList = collection;
                list2 = list7;
                String str32 = th2Var.f10774c;
                if (it.hasNext()) {
                    str8 = ((oi2) it.next()).f7690h;
                    sz0 sz0Var2 = oh2Var3.f7685a;
                    mi2Var2.f6657k = oh2Var3;
                    mi2Var2.f6658l = list2;
                    mi2Var2.f6659m = th2Var;
                    mi2Var2.f6660n = a72Var2;
                    mi2Var2.f6661o = mf2Var;
                    mi2Var2.f6662p = null;
                    mi2Var2.f6663q = arrayList;
                    mi2Var2.f6664r = it;
                    mi2Var2.f6665s = str8;
                    mi2Var2.f6666t = arrayList;
                    mi2Var2.f6669w = 4;
                    Object objM1093Q = m1093Q(sz0Var2, str32, str8, mi2Var2);
                    if (objM1093Q != obj) {
                        oh2 oh2Var7 = oh2Var3;
                        mi2Var = mi2Var2;
                        objM1112y = objM1093Q;
                        oh2Var6 = oh2Var7;
                        list7 = list2;
                        collection = arrayList;
                        String str92 = (String) objM1112y;
                        a72Var2.f108h = m1109t(th2Var.f10774c, str8, str92, a72Var2.f108h);
                        arrayList.add(new ii2(str8, str92));
                        mi2Var2 = mi2Var;
                        oh2Var3 = oh2Var6;
                        arrayList = collection;
                        list2 = list7;
                        String str322 = th2Var.f10774c;
                        if (it.hasNext()) {
                            list3 = (List) arrayList;
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (t11.m5086l(((oi2) next).f7690h, "README.md")) {
                                    break;
                                }
                            }
                            oi2 oi2Var = (oi2) next;
                            String str10 = oi2Var != null ? oi2Var.f7690h : null;
                            if (str10 == null) {
                                th2Var2 = th2Var;
                                list4 = list2;
                                str = null;
                                String str52 = th2Var2.f10774c;
                                String str62 = th2Var2.f10778g;
                                Set set3 = dh2.f2055a;
                                str52.getClass();
                                list3.getClass();
                                set3.getClass();
                                iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(list3, 10));
                                if (iM6103U < 16) {
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM6103U);
                                while (r1.hasNext()) {
                                }
                                arrayList2 = new ArrayList();
                                fg1.m1618K(new HashSet(), new LinkedHashSet(), str52, linkedHashMap2, arrayList2, set3, str62);
                                ri2 ri2Var2 = th2Var2.f10782k;
                                if (ri2Var2.f9601a != null) {
                                }
                                if (ri2Var2.f9602b != null) {
                                }
                                if (!z2) {
                                }
                                return new u22(th2Var2, arrayList2, str, mf2Var.f6632a, oh2Var3.f7685a, list4);
                            }
                            sz0 sz0Var3 = oh2Var3.f7685a;
                            mi2Var2.f6657k = oh2Var3;
                            mi2Var2.f6658l = list2;
                            mi2Var2.f6659m = th2Var;
                            mi2Var2.f6660n = a72Var2;
                            mi2Var2.f6661o = mf2Var;
                            mi2Var2.f6662p = list3;
                            mi2Var2.f6663q = str10;
                            mi2Var2.f6664r = null;
                            mi2Var2.f6665s = null;
                            mi2Var2.f6666t = null;
                            mi2Var2.f6669w = 5;
                            objM1112y = m1093Q(sz0Var3, str322, str10, mi2Var2);
                            if (objM1112y != obj) {
                                th2Var3 = th2Var;
                                list5 = list3;
                                str2 = str10;
                                String str42 = (String) objM1112y;
                                a72Var2.f108h = m1109t(th2Var3.f10774c, str2, str42, a72Var2.f108h);
                                list3 = list5;
                                th2Var2 = th2Var3;
                                list4 = list2;
                                str = str42;
                                String str522 = th2Var2.f10774c;
                                String str622 = th2Var2.f10778g;
                                Set set32 = dh2.f2055a;
                                str522.getClass();
                                list3.getClass();
                                set32.getClass();
                                iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(list3, 10));
                                if (iM6103U < 16) {
                                }
                                LinkedHashMap linkedHashMap22 = new LinkedHashMap(iM6103U);
                                while (r1.hasNext()) {
                                }
                                arrayList2 = new ArrayList();
                                fg1.m1618K(new HashSet(), new LinkedHashSet(), str522, linkedHashMap22, arrayList2, set32, str622);
                                ri2 ri2Var22 = th2Var2.f10782k;
                                if (ri2Var22.f9601a != null) {
                                }
                                if (ri2Var22.f9602b != null) {
                                }
                                if (!z2) {
                                    while (r0.hasNext()) {
                                    }
                                }
                                return new u22(th2Var2, arrayList2, str, mf2Var.f6632a, oh2Var3.f7685a, list4);
                            }
                        }
                    }
                }
                return obj;
            }
            List list8 = mi2Var.f6658l;
            oh2 oh2Var8 = mi2Var.f6657k;
            fg1.m1627T(objM1112y);
            list = list8;
            oh2Var2 = oh2Var8;
            z = false;
            uh2 uh2Var = (uh2) objM1112y;
            th2Var = uh2Var.f11315a;
            a72Var = new a72();
            a72Var.f108h = uh2Var.f11316b;
            C0021ak c0021ak = (C0021ak) this.f2148j;
            sz0 sz0Var4 = oh2Var2.f7685a;
            mi2Var.f6657k = oh2Var2;
            mi2Var.f6658l = list;
            mi2Var.f6659m = th2Var;
            mi2Var.f6660n = a72Var;
            mi2Var.f6669w = 3;
            objM1112y = c0021ak.m175b(sz0Var4, th2Var, list, mi2Var);
        }
        List list9 = (List) objM1112y;
        if (list9.size() > 512) {
            throw new dg2(null, si2Var, null, hk1.m2208g(list9.size(), "Script package contains ", " files; maximum is 512."), null, 20);
        }
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it3 = list9.iterator();
        while (it3.hasNext()) {
            String str11 = ((oi2) it3.next()).f7690h;
            if (!hashSet.add(new oi2(str11))) {
                throw new dg2(null, si2Var, str11, "Duplicate script path.", null, 16);
            }
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = str11.toLowerCase(locale);
            lowerCase.getClass();
            oi2 oi2Var2 = (oi2) map.putIfAbsent(lowerCase, new oi2(str11));
            String str12 = oi2Var2 != null ? oi2Var2.f7690h : null;
            if (str12 != null && !str12.equals(str11)) {
                throw new dg2(null, si2Var, str11, vi0.m5691j("Path conflicts with ", str12, " when compared case-insensitively."), null, 16);
            }
            char[] cArr = new char[i3];
            cArr[0] = '/';
            List listM3987C0 = pv2.m3987C0(str11, cArr);
            int size = listM3987C0.size();
            int i4 = 0;
            while (i4 < size) {
                i4++;
                String strM1165u0 = AbstractC0142du.m1165u0(AbstractC0142du.m1144B0(i4, listM3987C0), "/", null, null, null, 62);
                HashSet hashSet2 = hashSet;
                Locale locale2 = Locale.ROOT;
                locale2.getClass();
                String lowerCase2 = strM1165u0.toLowerCase(locale2);
                lowerCase2.getClass();
                String str13 = (String) map2.putIfAbsent(lowerCase2, strM1165u0);
                if (str13 != null && !str13.equals(strM1165u0)) {
                    throw new dg2(null, si2Var, str11, vi0.m5691j("Path segment conflicts with ", str13, " when compared case-insensitively."), null, 16);
                }
                hashSet = hashSet2;
            }
            i3 = 1;
        }
        z = false;
        j51 j51Var = (j51) this.f2147i;
        sz0 sz0Var5 = oh2Var4.f7685a;
        mi2Var.f6657k = oh2Var4;
        mi2Var.f6658l = list9;
        mi2Var.f6669w = 2;
        Object objM2442A = j51Var.m2442A(sz0Var5, list9, mi2Var);
        if (objM2442A != obj) {
            oh2Var2 = oh2Var4;
            list = list9;
            objM1112y = objM2442A;
            uh2 uh2Var2 = (uh2) objM1112y;
            th2Var = uh2Var2.f11315a;
            a72Var = new a72();
            a72Var.f108h = uh2Var2.f11316b;
            C0021ak c0021ak2 = (C0021ak) this.f2148j;
            sz0 sz0Var42 = oh2Var2.f7685a;
            mi2Var.f6657k = oh2Var2;
            mi2Var.f6658l = list;
            mi2Var.f6659m = th2Var;
            mi2Var.f6660n = a72Var;
            mi2Var.f6669w = 3;
            objM1112y = c0021ak2.m175b(sz0Var42, th2Var, list, mi2Var);
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1090N(hg2 hg2Var, u00 u00Var) throws Throwable {
        tg2 tg2Var;
        if (u00Var instanceof tg2) {
            tg2Var = (tg2) u00Var;
            int i = tg2Var.f10744m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tg2Var.f10744m = i - Integer.MIN_VALUE;
            } else {
                tg2Var = new tg2(this, u00Var);
            }
        }
        Object obj = tg2Var.f10742k;
        int i2 = tg2Var.f10744m;
        int i3 = 1;
        t00 t00Var = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            c20 c20Var = ((df2) ((vn1) this.f2147i).f12033d).f2032j;
            og2 og2Var = new og2(t00Var, hg2Var, this, i3);
            tg2Var.f10744m = 1;
            Object objM3762R = AbstractC0570p7.m3762R(c20Var, og2Var, tg2Var);
            k20 k20Var = k20.f5323h;
            return objM3762R == k20Var ? k20Var : objM3762R;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.m672p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1091O(hg2 hg2Var, u00 u00Var) throws Throwable {
        ug2 ug2Var;
        if (u00Var instanceof ug2) {
            ug2Var = (ug2) u00Var;
            int i = ug2Var.f11299n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ug2Var.f11299n = i - Integer.MIN_VALUE;
            } else {
                ug2Var = new ug2(this, u00Var);
            }
        }
        Object objM3762R = ug2Var.f11297l;
        int i2 = ug2Var.f11299n;
        try {
            if (i2 == 0) {
                fg1.m1627T(objM3762R);
                String str = hg2Var.f4003b;
                if (str.length() == 0 || m1088L(str) != ig2.f4607h) {
                    throw new FileNotFoundException("Package file does not exist: ".concat(str));
                }
                o72 o72Var = oi2.f7689i;
                String strM6107Y = xe1.m6107Y(str);
                vn1 vn1Var = (vn1) this.f2147i;
                ((df2) vn1Var.f12033d).f2023a.getClass();
                sz0 sz0Var = ((u22) vn1Var.f12031b).f11079e;
                ug2Var.f11296k = 16777216L;
                ug2Var.f11299n = 2;
                objM3762R = AbstractC0570p7.m3762R((c20) sz0Var.f10436i, new v80(sz0Var, strM6107Y, 16777216, null, 0), ug2Var);
                k20 k20Var = k20.f5323h;
                if (objM3762R == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 == 1) {
                    fg1.m1627T(objM3762R);
                    return objM3762R;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = ug2Var.f11296k;
                    fg1.m1627T(objM3762R);
                    if (((byte[]) objM3762R).length <= j) {
                        return (byte[]) objM3762R;
                    }
                    throw new sd2("QUOTA_EXCEEDED", "File exceeds the read limit.", false, null, null, 28);
                }
                fg1.m1627T(objM3762R);
            }
            return (byte[]) objM3762R;
        } catch (bh2 e) {
            c80.m672p("QUOTA_EXCEEDED", "File exceeds the read limit.", 0, null, e, 12);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1092P(hg2 hg2Var, u00 u00Var) throws Throwable {
        vg2 vg2Var;
        if (u00Var instanceof vg2) {
            vg2Var = (vg2) u00Var;
            int i = vg2Var.f11952m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vg2Var.f11952m = i - Integer.MIN_VALUE;
            } else {
                vg2Var = new vg2(this, u00Var);
            }
        }
        Object objM1090N = vg2Var.f11950k;
        int i2 = vg2Var.f11952m;
        if (i2 == 0) {
            fg1.m1627T(objM1090N);
            vg2Var.f11952m = 1;
            objM1090N = m1090N(hg2Var, vg2Var);
            Object obj = k20.f5323h;
            if (objM1090N == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(objM1090N);
        }
        byte[] bArr = (byte[]) objM1090N;
        try {
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
            string.getClass();
            return string;
        } catch (Exception e) {
            c80.m672p("IO_ERROR", "File is not valid UTF-8.", 0, null, e, 12);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1093Q(sz0 sz0Var, String str, String str2, u00 u00Var) throws bh2, dg2 {
        ni2 ni2Var;
        if (u00Var instanceof ni2) {
            ni2Var = (ni2) u00Var;
            int i = ni2Var.f7171o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ni2Var.f7171o = i - Integer.MIN_VALUE;
            } else {
                ni2Var = new ni2(this, u00Var);
            }
        }
        Object obj = ni2Var.f7169m;
        int i2 = ni2Var.f7171o;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    String str3 = ni2Var.f7168l;
                    String str4 = ni2Var.f7167k;
                    fg1.m1627T(obj);
                    return (String) obj;
                }
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str5 = ni2Var.f7168l;
                String str6 = ni2Var.f7167k;
                fg1.m1627T(obj);
                return (String) obj;
            }
            fg1.m1627T(obj);
            Object obj2 = k20.f5323h;
            if (sz0Var != null) {
                ni2Var.f7167k = str;
                ni2Var.f7168l = str2;
                ni2Var.f7171o = 1;
                Object objM5038K = sz0Var.m5038K(str2, 2097152, ni2Var);
                if (objM5038K != obj2) {
                    obj = objM5038K;
                    return (String) obj;
                }
            } else {
                ni2Var.f7167k = str;
                ni2Var.f7168l = str2;
                ni2Var.f7171o = 2;
                Object objM5038K2 = sz0Var.m5038K(str2, Integer.MAX_VALUE, ni2Var);
                if (objM5038K2 != obj2) {
                    obj = objM5038K2;
                    return (String) obj;
                }
            }
            return obj2;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            if (!(th instanceof bh2)) {
                throw new dg2(str, si2.f10153i, str2, "Unable to read script file as UTF-8.", th);
            }
            throw new dg2(str, si2.f10154j, str2, hk1.m2208g(th.f862h, "File exceeds the maximum of ", " bytes."), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1094R(hg2 hg2Var, ui2 ui2Var, u00 u00Var) throws Throwable {
        wg2 wg2Var;
        if (u00Var instanceof wg2) {
            wg2Var = (wg2) u00Var;
            int i = wg2Var.f12506m;
            if ((i & Integer.MIN_VALUE) != 0) {
                wg2Var.f12506m = i - Integer.MIN_VALUE;
            } else {
                wg2Var = new wg2(this, u00Var);
            }
        }
        Object obj = wg2Var.f12504k;
        int i2 = wg2Var.f12506m;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                c20 c20Var = ((df2) ((vn1) this.f2147i).f12033d).f2032j;
                C0756u0 c0756u0 = new C0756u0((t00) null, this, hg2Var, ui2Var);
                wg2Var.f12506m = 1;
                Object objM3762R = AbstractC0570p7.m3762R(c20Var, c0756u0, wg2Var);
                k20 k20Var = k20.f5323h;
                if (objM3762R == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
            }
            return a83.f116a;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.m672p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: T */
    public File m1095T(hg2 hg2Var) throws IOException {
        File fileM1096U = m1096U(hg2Var.f4002a);
        String str = hg2Var.f4003b;
        File file = str.length() == 0 ? fileM1096U : new File(fileM1096U, str);
        File canonicalFile = fileM1096U.getCanonicalFile();
        File canonicalFile2 = file.getCanonicalFile();
        canonicalFile.getClass();
        canonicalFile2.getClass();
        m1071B(canonicalFile, canonicalFile2);
        m1072C(canonicalFile, file, file.exists());
        return canonicalFile2;
    }

    /* JADX INFO: renamed from: U */
    public File m1096U(fg2 fg2Var) throws IOException {
        File file;
        if (fg2Var == fg2.f2985h) {
            c80.m672p("INVALID_ARGUMENT", "Package files do not have a writable root.", 0, null, null, 28);
            return null;
        }
        if (fg2Var == fg2.f2988k && !((pi2) ((vn1) this.f2147i).f12036g).f8368e) {
            c80.m672p("PERMISSION_DENIED", "External storage access has not been granted.", 0, null, null, 28);
            return null;
        }
        vk2 vk2Var = (vk2) ((hx2) this.f2148j).getValue();
        if (vk2Var == null) {
            c80.m672p("NOT_SUPPORTED", "Script storage roots are not configured.", 0, null, null, 28);
            return null;
        }
        int iOrdinal = fg2Var.ordinal();
        if (iOrdinal == 0) {
            C0676s.m4653l("Handled above.");
            return null;
        }
        if (iOrdinal == 1) {
            file = vk2Var.f12003a;
        } else if (iOrdinal == 2) {
            file = vk2Var.f12004b;
        } else {
            if (iOrdinal != 3) {
                c80.m675s();
                return null;
            }
            file = vk2Var.f12005c;
            if (file == null) {
                c80.m672p("NOT_SUPPORTED", "External storage is not configured on this device.", 0, null, null, 28);
                return null;
            }
        }
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.exists() && Files.isSymbolicLink(absoluteFile.toPath())) {
            c80.m678v("Script storage root must not be a symbolic link.");
            return null;
        }
        if (!absoluteFile.exists() && !absoluteFile.mkdirs()) {
            c80.m678v("Unable to create script storage root.");
            return null;
        }
        if (!absoluteFile.isDirectory()) {
            c80.m678v("Script storage root is not a directory.");
            return null;
        }
        File canonicalFile = absoluteFile.getCanonicalFile();
        canonicalFile.getClass();
        return canonicalFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1097V(hg2 hg2Var, u00 u00Var) throws Throwable {
        xg2 xg2Var;
        if (u00Var instanceof xg2) {
            xg2Var = (xg2) u00Var;
            int i = xg2Var.f13028m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xg2Var.f13028m = i - Integer.MIN_VALUE;
            } else {
                xg2Var = new xg2(this, u00Var);
            }
        }
        Object obj = xg2Var.f13026k;
        int i2 = xg2Var.f13028m;
        t00 t00Var = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            c20 c20Var = ((df2) ((vn1) this.f2147i).f12033d).f2032j;
            og2 og2Var = new og2(t00Var, hg2Var, this, 2);
            xg2Var.f13028m = 1;
            Object objM3762R = AbstractC0570p7.m3762R(c20Var, og2Var, xg2Var);
            k20 k20Var = k20.f5323h;
            return objM3762R == k20Var ? k20Var : objM3762R;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.m672p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: W */
    public gg2 m1098W(hg2 hg2Var, File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("Path does not exist: ".concat(hg2Var.f4003b));
        }
        m1072C(m1096U(hg2Var.f4002a), file, true);
        boolean zIsDirectory = file.isDirectory();
        long length = file.isFile() ? file.length() : 0L;
        long jLastModified = file.lastModified();
        Long lValueOf = Long.valueOf(jLastModified);
        if (jLastModified <= 0) {
            lValueOf = null;
        }
        return new gg2(hg2Var, zIsDirectory, length, lValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1099X(x20 x20Var, boolean z) {
        C0929yn c0929yn = (C0929yn) this.f2148j;
        boolean z2 = z && c0929yn.m6293d();
        w20 w20Var = x20Var.f12772h;
        int length = w20Var.f5590i.length;
        if (z2) {
            c0929yn.m6291b("  size: ".concat(pp0.m3899K(length)));
        }
        c0929yn.m6301m(length);
        for (int i = 0; i < length; i++) {
            AbstractC0147dz abstractC0147dz = (AbstractC0147dz) w20Var.m2693e(i);
            if (z2) {
                StringBuilder sb = new StringBuilder("  [");
                sb.append(Integer.toHexString(i));
                sb.append("] ");
                sb.append(m1079u(abstractC0147dz) == 30 ? "null" : abstractC0147dz.mo24f() + ' ' + abstractC0147dz.mo23b());
                c0929yn.m6291b(sb.toString());
            }
            z70 z70Var = (z70) this.f2147i;
            int iM1079u = m1079u(abstractC0147dz);
            if (iM1079u == 0 || iM1079u == 6 || iM1079u == 2) {
                long jMo2048i = ((k30) abstractC0147dz).mo2048i();
                int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo2048i >> 63) ^ jMo2048i)) >> 3;
                c0929yn.m6297i(iM1079u | ((iNumberOfLeadingZeros - 1) << 5));
                while (iNumberOfLeadingZeros > 0) {
                    c0929yn.m6297i((byte) jMo2048i);
                    jMo2048i >>= 8;
                    iNumberOfLeadingZeros--;
                }
            } else if (iM1079u == 3) {
                s11.m4721t0(c0929yn, iM1079u, ((k30) abstractC0147dz).mo2048i());
            } else if (iM1079u != 4) {
                if (iM1079u == 16) {
                    s11.m4719s0(c0929yn, iM1079u, ((long) ((d30) abstractC0147dz).f4250h) << 32);
                } else if (iM1079u != 17) {
                    switch (iM1079u) {
                        case 21:
                            Object obj = z70Var.f13759j;
                            c80.m664g();
                            return;
                        case 22:
                            z70Var.getClass();
                            c80.m664g();
                            return;
                        case 23:
                            s11.m4721t0(c0929yn, iM1079u, ((b42) z70Var.f13757h).m400l((q30) abstractC0147dz));
                            break;
                        case 24:
                            s11.m4721t0(c0929yn, iM1079u, ((b42) z70Var.f13758i).m401m((r30) abstractC0147dz));
                            break;
                        case 25:
                            s11.m4721t0(c0929yn, iM1079u, ((ni0) z70Var.f13760k).m3309l((c30) abstractC0147dz));
                            break;
                        case 26:
                            s11.m4721t0(c0929yn, iM1079u, ((xg1) z70Var.f13761l).m6150l((n30) abstractC0147dz));
                            break;
                        case 27:
                            c80.m664g();
                            return;
                        case 28:
                            c0929yn.m6297i(iM1079u);
                            m1099X((x20) abstractC0147dz, false);
                            break;
                        case 29:
                            c0929yn.m6297i(iM1079u);
                            c80.m664g();
                            return;
                        case 30:
                            c0929yn.m6297i(iM1079u);
                            break;
                        case 31:
                            c0929yn.m6297i((((y20) abstractC0147dz).f4250h << 5) | iM1079u);
                            break;
                        default:
                            c80.m667j("Shouldn't happen");
                            return;
                    }
                } else {
                    s11.m4719s0(c0929yn, iM1079u, ((b30) abstractC0147dz).f4885h);
                }
            }
        }
        if (z2) {
            c0929yn.m6294e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1100Y(hg2 hg2Var, byte[] bArr, dl2 dl2Var, u00 u00Var) throws Throwable {
        yg2 yg2Var;
        if (u00Var instanceof yg2) {
            yg2Var = (yg2) u00Var;
            int i = yg2Var.f13454m;
            if ((i & Integer.MIN_VALUE) != 0) {
                yg2Var.f13454m = i - Integer.MIN_VALUE;
            } else {
                yg2Var = new yg2(this, u00Var);
            }
        }
        Object obj = yg2Var.f13452k;
        int i2 = yg2Var.f13454m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            c20 c20Var = ((df2) ((vn1) this.f2147i).f12033d).f2032j;
            r10 r10Var = new r10(null, this, hg2Var, bArr, dl2Var);
            yg2Var.f13454m = 1;
            Object objM3762R = AbstractC0570p7.m3762R(c20Var, r10Var, yg2Var);
            k20 k20Var = k20.f5323h;
            return objM3762R == k20Var ? k20Var : objM3762R;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.m672p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1101Z(hg2 hg2Var, InputStream inputStream, long j, boolean z, boolean z2, u00 u00Var) throws Throwable {
        ah2 ah2Var;
        if (u00Var instanceof ah2) {
            ah2Var = (ah2) u00Var;
            int i = ah2Var.f205m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ah2Var.f205m = i - Integer.MIN_VALUE;
            } else {
                ah2Var = new ah2(this, u00Var);
            }
        }
        ah2 ah2Var2 = ah2Var;
        Object obj = ah2Var2.f203k;
        int i2 = ah2Var2.f205m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            c20 c20Var = ((df2) ((vn1) this.f2147i).f12033d).f2032j;
            zg2 zg2Var = new zg2(null, this, hg2Var, j, z2, z, inputStream);
            ah2Var2.f205m = 1;
            Object objM3762R = AbstractC0570p7.m3762R(c20Var, zg2Var, ah2Var2);
            k20 k20Var = k20.f5323h;
            return objM3762R == k20Var ? k20Var : objM3762R;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.m672p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    @Override // p000.InterfaceC0137dp
    /* JADX INFO: renamed from: a */
    public void mo1065a(s52 s52Var, r92 r92Var) {
        InterfaceC0101cp interfaceC0101cp = (InterfaceC0101cp) this.f2147i;
        ct1 ct1Var = (ct1) this.f2148j;
        try {
            try {
                interfaceC0101cp.mo879b(ct1Var, ct1Var.m888f(r92Var));
            } catch (Throwable th) {
                xe1.m6134m0(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            xe1.m6134m0(th2);
            try {
                interfaceC0101cp.mo880d(ct1Var, th2);
            } catch (Throwable th3) {
                xe1.m6134m0(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // p000.om2
    /* JADX INFO: renamed from: b */
    public int mo1102b(int i) {
        do {
            i = ((sx1) this.f2148j).m5017j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2147i).charAt(i)));
        return i;
    }

    @Override // p000.om2
    /* JADX INFO: renamed from: c */
    public int mo1103c(int i) {
        do {
            i = ((sx1) this.f2148j).m5016i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2147i).charAt(i - 1)));
        return i;
    }

    @Override // p000.InterfaceC0508np
    public void cancel() {
        if (((C0885xg) this.f2148j).compareAndSet(1, 1)) {
            return;
        }
        ((C0678s1) this.f2147i).mo6a();
    }

    @Override // p000.e40
    /* JADX INFO: renamed from: d */
    public void mo635d(Exception exc) {
        it2 it2Var = (it2) this.f2148j;
        ih1 ih1Var = (ih1) this.f2147i;
        ih1 ih1Var2 = it2Var.f4782m;
        if (ih1Var2 == null || ih1Var2 != ih1Var) {
            return;
        }
        it2 it2Var2 = (it2) this.f2148j;
        ih1 ih1Var3 = (ih1) this.f2147i;
        w40 w40Var = it2Var2.f4778i;
        d40 d40Var = it2Var2.f4783n;
        f40 f40Var = ih1Var3.f4618c;
        w40Var.mo1802b(d40Var, exc, f40Var, f40Var.mo1374e());
    }

    @Override // p000.wc2
    /* JADX INFO: renamed from: e */
    public Object mo137e(Object obj) {
        return ((in0) this.f2148j).mo5j(obj);
    }

    @Override // p000.jv1
    /* JADX INFO: renamed from: f */
    public List mo912f(Integer num) {
        List listMo912f = ((jv1) this.f2147i).mo912f(null);
        tr2 tr2Var = (tr2) this.f2148j;
        int i = tr2Var.f10934v;
        return i < 0 ? listMo912f : AbstractC0142du.m1168x0(AbstractC0570p7.m3776l(tr2Var, num, i, Integer.valueOf(tr2Var.m5393E(tr2Var.f10914b, i))), listMo912f);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: g */
    public void mo1104g(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap) throws IOException {
        IOException iOException = ((rg0) this.f2148j).f9551i;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC0965zk.mo1325h(bitmap);
            throw iOException;
        }
    }

    @Override // p000.e40
    /* JADX INFO: renamed from: h */
    public void mo636h(Object obj) {
        it2 it2Var = (it2) this.f2148j;
        ih1 ih1Var = (ih1) this.f2147i;
        ih1 ih1Var2 = it2Var.f4782m;
        if (ih1Var2 == null || ih1Var2 != ih1Var) {
            return;
        }
        it2 it2Var2 = (it2) this.f2148j;
        ih1 ih1Var3 = (ih1) this.f2147i;
        b90 b90Var = it2Var2.f4777h.f10552p;
        if (obj == null || !b90Var.m493a(ih1Var3.f4618c.mo1374e())) {
            w40 w40Var = it2Var2.f4778i;
            a51 a51Var = ih1Var3.f4616a;
            f40 f40Var = ih1Var3.f4618c;
            w40Var.mo1801a(a51Var, obj, f40Var, f40Var.mo1374e(), it2Var2.f4783n);
            return;
        }
        it2Var2.f4781l = obj;
        w40 w40Var2 = it2Var2.f4778i;
        w40Var2.f12326M = 2;
        ff0 ff0Var = w40Var2.f12343w;
        (ff0Var.f2943t ? ff0Var.f2939p : ff0Var.f2938o).execute(w40Var2);
    }

    @Override // p000.jv1
    /* JADX INFO: renamed from: i */
    public boolean mo913i() {
        return ((jv1) this.f2147i).mo913i();
    }

    @Override // p000.InterfaceC0137dp
    /* JADX INFO: renamed from: j */
    public void mo1066j(s52 s52Var, IOException iOException) {
        try {
            ((InterfaceC0101cp) this.f2147i).mo880d((ct1) this.f2148j, iOException);
        } catch (Throwable th) {
            xe1.m6134m0(th);
            th.printStackTrace();
        }
    }

    @Override // p000.om2
    /* JADX INFO: renamed from: k */
    public int mo1105k(int i) {
        CharSequence charSequence = (CharSequence) this.f2147i;
        do {
            i = ((sx1) this.f2148j).m5016i(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // p000.om2
    /* JADX INFO: renamed from: l */
    public int mo1106l(int i) {
        do {
            i = ((sx1) this.f2148j).m5017j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f2147i).charAt(i - 1)));
        return i;
    }

    @Override // p000.wc2
    /* JADX INFO: renamed from: m */
    public Object mo138m(bc2 bc2Var, Object obj) {
        return ((mn0) this.f2147i).mo12g(bc2Var, obj);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: p */
    public void mo1107p() {
        r62 r62Var = (r62) this.f2147i;
        synchronized (r62Var) {
            r62Var.f9405j = r62Var.f9403h.length;
        }
    }

    /* JADX INFO: renamed from: r */
    public long m1108r(fg2 fg2Var) {
        df2 df2Var = (df2) ((vn1) this.f2147i).f12033d;
        int iOrdinal = fg2Var.ordinal();
        if (iOrdinal == 0) {
            c80.m672p("PERMISSION_DENIED", "Package files are read-only.", 0, null, null, 28);
            return 0L;
        }
        if (iOrdinal == 1) {
            df2Var.f2023a.getClass();
            return 134217728L;
        }
        if (iOrdinal == 2) {
            df2Var.f2023a.getClass();
            return 268435456L;
        }
        if (iOrdinal == 3) {
            df2Var.f2023a.getClass();
            return 1073741824L;
        }
        c80.m675s();
        return 0L;
    }

    /* JADX INFO: renamed from: t */
    public int m1109t(String str, String str2, String str3, int i) throws dg2 {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str3.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        si2 si2Var = si2.f10154j;
        if (length > 2097152) {
            throw new dg2(str, si2Var, str2, hk1.m2208g(length, "File size is ", " bytes; maximum is 2097152."), null, 16);
        }
        long j = ((long) i) + ((long) length);
        if (j <= 16777216) {
            return (int) j;
        }
        throw new dg2(str, si2Var, str2, "Total script size exceeds 16777216 bytes.", null, 16);
    }

    public String toString() {
        switch (this.f2146h) {
            case 21:
                return "Bounds{lower=" + ((zz0) this.f2147i) + " upper=" + ((zz0) this.f2148j) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1110v(hg2 hg2Var, hg2 hg2Var2, dl2 dl2Var, u00 u00Var) throws Throwable {
        kg2 kg2Var;
        if (u00Var instanceof kg2) {
            kg2Var = (kg2) u00Var;
            int i = kg2Var.f5526o;
            if ((i & Integer.MIN_VALUE) != 0) {
                kg2Var.f5526o = i - Integer.MIN_VALUE;
            } else {
                kg2Var = new kg2(this, u00Var);
            }
        }
        Object objM1090N = kg2Var.f5524m;
        int i2 = kg2Var.f5526o;
        Object obj = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objM1090N);
            kg2Var.f5522k = hg2Var2;
            kg2Var.f5523l = dl2Var;
            kg2Var.f5526o = 1;
            objM1090N = m1090N(hg2Var, kg2Var);
            if (objM1090N != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(objM1090N);
                return objM1090N;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dl2Var = kg2Var.f5523l;
        hg2Var2 = kg2Var.f5522k;
        fg1.m1627T(objM1090N);
        kg2Var.f5522k = null;
        kg2Var.f5523l = null;
        kg2Var.f5526o = 2;
        Object objM1100Y = m1100Y(hg2Var2, (byte[]) objM1090N, dl2Var, kg2Var);
        return objM1100Y == obj ? obj : objM1100Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1111w(hg2 hg2Var, boolean z, u00 u00Var) throws Throwable {
        mg2 mg2Var;
        if (u00Var instanceof mg2) {
            mg2Var = (mg2) u00Var;
            int i = mg2Var.f6642m;
            if ((i & Integer.MIN_VALUE) != 0) {
                mg2Var.f6642m = i - Integer.MIN_VALUE;
            } else {
                mg2Var = new mg2(this, u00Var);
            }
        }
        Object obj = mg2Var.f6640k;
        int i2 = mg2Var.f6642m;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                c20 c20Var = ((df2) ((vn1) this.f2147i).f12033d).f2032j;
                lg2 lg2Var = new lg2(null, this, hg2Var, z);
                mg2Var.f6642m = 1;
                Object objM3762R = AbstractC0570p7.m3762R(c20Var, lg2Var, mg2Var);
                k20 k20Var = k20.f5323h;
                if (objM3762R == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
            }
            return a83.f116a;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.m672p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1112y(sz0 sz0Var, u00 u00Var) throws dg2 {
        li2 li2Var;
        if (u00Var instanceof li2) {
            li2Var = (li2) u00Var;
            int i = li2Var.f6140n;
            if ((i & Integer.MIN_VALUE) != 0) {
                li2Var.f6140n = i - Integer.MIN_VALUE;
            } else {
                li2Var = new li2(this, u00Var);
            }
        }
        Object objM3762R = li2Var.f6138l;
        int i2 = li2Var.f6140n;
        t00 t00Var = null;
        try {
            if (i2 == 0) {
                fg1.m1627T(objM3762R);
                li2Var.f6137k = sz0Var;
                li2Var.f6140n = 1;
                objM3762R = AbstractC0570p7.m3762R((c20) sz0Var.f10436i, new u80(sz0Var, t00Var, 0), li2Var);
                k20 k20Var = k20.f5323h;
                if (objM3762R == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sz0Var = li2Var.f6137k;
                fg1.m1627T(objM3762R);
            }
            return AbstractC0142du.m1170z0((Iterable) objM3762R);
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            String path = ((File) sz0Var.f10437j).getPath();
            path.getClass();
            throw new dg2(null, si2.f10152h, null, "Unable to discover files from " + path + ".", th, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1113z() {
        Object[] objArr;
        zk1 zk1Var = (zk1) this.f2147i;
        Arrays.sort(zk1Var.f13934h, 0, zk1Var.f13936j, sl0.f10182d);
        int i = zk1Var.f13936j;
        r61[] r61VarArr = (r61[]) this.f2148j;
        if (r61VarArr != null) {
            int length = r61VarArr.length;
            objArr = r61VarArr;
            if (length < i) {
                objArr = new r61[Math.max(16, i)];
            }
        }
        this.f2148j = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = zk1Var.f13934h[i2];
        }
        zk1Var.m6428g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.f2148j = objArr;
                return;
            }
            r61 r61Var = objArr[i];
            r61Var.getClass();
            if (r61Var.f9381V) {
                m1070A(r61Var);
            }
            objArr[i] = 0;
        }
    }

    public /* synthetic */ dq1(int i, Object obj, Object obj2, boolean z) {
        this.f2146h = i;
        this.f2148j = obj;
        this.f2147i = obj2;
    }

    public dq1(eg2 eg2Var) {
        this.f2146h = 12;
        this.f2147i = new j51(24);
        this.f2148j = new C0021ak(2097152);
    }

    public /* synthetic */ dq1(int i, Object obj, Object obj2) {
        this.f2146h = i;
        this.f2147i = obj;
        this.f2148j = obj2;
    }

    public dq1(C0678s1 c0678s1) {
        this.f2146h = 3;
        this.f2147i = c0678s1;
        this.f2148j = new C0885xg(0);
    }

    public dq1(C0953z8 c0953z8, int i, int i2, int i3, int i4) {
        this.f2146h = 5;
        this.f2147i = new sd0(c0953z8, i, i3, i4);
        this.f2148j = new ArrayList(i2);
    }

    public dq1(z70 z70Var, C0929yn c0929yn) {
        this.f2146h = 19;
        if (z70Var != null) {
            this.f2147i = z70Var;
            this.f2148j = c0929yn;
        } else {
            um2.m5516f("file == null");
            throw null;
        }
    }

    public dq1(vn1 vn1Var) {
        this.f2146h = 11;
        this.f2147i = vn1Var;
        this.f2148j = new hx2(new C0727ta(21, this));
    }

    public dq1(WindowInsetsAnimation.Bounds bounds) {
        this.f2146h = 21;
        this.f2147i = zz0.m6519c(bounds.getLowerBound());
        this.f2148j = zz0.m6519c(bounds.getUpperBound());
    }
}
