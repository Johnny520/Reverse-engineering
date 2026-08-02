package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 implements dp, np, jv1, wc2, e40, wa0, om2 {
    public final /* synthetic */ int h;
    public Object i;
    public Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dq1(int i) {
        this.h = i;
        switch (i) {
            case 7:
                this.i = new ArrayList();
                this.j = new HashMap();
                break;
            case 8:
                this.i = new LinkedHashMap();
                this.j = new LinkedHashMap();
                break;
            case 9:
                this.i = new wd1(1000L);
                this.j = s11.o0(10, new j51(19));
                break;
            case 16:
                break;
            case 17:
                this.i = new ix2(1);
                this.j = new xd1(16);
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                this.i = new zk1(new Reference[16]);
                this.j = new ReferenceQueue();
                break;
            default:
                this.i = new zk1(new r61[16]);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0076 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0085 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x007f */
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
    public static void A(r61 r61Var) {
        if (r61Var.W > 0) {
            if (r61Var.N.d == n61.l && !r61Var.p() && !r61Var.q() && !r61Var.X && r61Var.I()) {
                th1 th1Var = (th1) r61Var.M.g;
                if ((th1Var.k & 256) != 0) {
                    while (th1Var != null) {
                        if ((th1Var.j & 256) != 0) {
                            ?? M = th1Var;
                            ?? zk1Var = 0;
                            while (M != 0) {
                                if (M instanceof dq0) {
                                    dq0 dq0Var = (dq0) M;
                                    dq0Var.w(sp0.Z(dq0Var, 256));
                                } else if ((M.j & 256) != 0 && (M instanceof u60)) {
                                    th1 th1Var2 = ((u60) M).w;
                                    int i = 0;
                                    M = M;
                                    zk1Var = zk1Var;
                                    while (th1Var2 != null) {
                                        if ((th1Var2.j & 256) != 0) {
                                            i++;
                                            zk1Var = zk1Var;
                                            if (i == 1) {
                                                M = th1Var2;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M != 0) {
                                                    zk1Var.b(M);
                                                    M = 0;
                                                }
                                                zk1Var.b(th1Var2);
                                            }
                                        }
                                        th1Var2 = th1Var2.m;
                                        M = M;
                                        zk1Var = zk1Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M = sp0.m(zk1Var);
                            }
                        }
                        if ((th1Var.k & 256) == 0) {
                            break;
                        } else {
                            th1Var = th1Var.m;
                        }
                    }
                }
            }
            r61Var.V = false;
            zk1 zk1VarY = r61Var.y();
            Object[] objArr = zk1VarY.h;
            int i2 = zk1VarY.j;
            for (int i3 = 0; i3 < i2; i3++) {
                A((r61) objArr[i3]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void B(File file, File file2) throws IOException {
        String path = file.getPath();
        String path2 = file2.getPath();
        if (t11.l(path2, path)) {
            return;
        }
        path2.getClass();
        if (wv2.d0(path2, path + File.separator, false)) {
            return;
        }
        c80.v("Script path escapes its storage root.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void C(File file, File file2, boolean z) throws IOException {
        Path path = file.getCanonicalFile().toPath();
        Path pathNormalize = file2.getAbsoluteFile().toPath().normalize();
        if (!pathNormalize.startsWith(path)) {
            c80.v("Script path escapes its storage root.");
            return;
        }
        Path pathRelativize = path.relativize(pathNormalize);
        pathRelativize.getClass();
        int i = 0;
        for (Object obj : pathRelativize) {
            int i2 = i + 1;
            if (i < 0) {
                eu.a0();
                throw null;
            }
            path = path.resolve((Path) obj);
            if ((i != pathRelativize.getNameCount() - 1 || z) && Files.exists(path, new LinkOption[0]) && Files.isSymbolicLink(path)) {
                c80.v("Symbolic links are not supported in script storage.");
                return;
            }
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void J(File file, File file2, boolean z) throws IOException {
        StandardCopyOption[] standardCopyOptionArr = z ? new StandardCopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING} : new StandardCopyOption[]{StandardCopyOption.ATOMIC_MOVE};
        try {
            Files.move(file.toPath(), file2.toPath(), (CopyOption[]) Arrays.copyOf(standardCopyOptionArr, standardCopyOptionArr.length));
        } catch (AtomicMoveNotSupportedException unused) {
            StandardCopyOption[] standardCopyOptionArr2 = z ? new StandardCopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new StandardCopyOption[0];
            Files.move(file.toPath(), file2.toPath(), (CopyOption[]) Arrays.copyOf(standardCopyOptionArr2, standardCopyOptionArr2.length));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S(hg2 hg2Var) {
        if (hg2Var.a != fg2.h) {
            return;
        }
        c80.p("PERMISSION_DENIED", "Package files are read-only.", 0, null, null, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(dq1 dq1Var, File file, File file2) throws IOException {
        File canonicalFile = file2.getCanonicalFile();
        canonicalFile.getClass();
        File canonicalFile2 = file.getCanonicalFile();
        canonicalFile2.getClass();
        B(canonicalFile, canonicalFile2);
        ArrayList arrayList = new ArrayList();
        while (file != null && !file.exists()) {
            arrayList.add(file);
            file = file.getParentFile();
        }
        if (file != null && Files.isSymbolicLink(file.toPath())) {
            c80.v("Symbolic links are not supported in script storage.");
            return;
        }
        Iterator it = new fa2(arrayList).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((ea2) it).i;
            if (!listIterator.hasPrevious()) {
                return;
            }
            File file3 = (File) listIterator.previous();
            if (!file3.mkdir() && !file3.isDirectory()) {
                c80.v("Unable to create parent directory.");
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00fd -> B:50:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x011e -> B:49:0x011f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(dq1 dq1Var, hg2 hg2Var, u00 u00Var) throws Throwable {
        qg2 qg2Var;
        String str;
        Collection arrayList;
        Iterator it;
        if (u00Var instanceof qg2) {
            qg2Var = (qg2) u00Var;
            int i = qg2Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                qg2Var.q = i - Integer.MIN_VALUE;
            } else {
                qg2Var = new qg2(dq1Var, u00Var);
            }
        }
        Object objK = qg2Var.o;
        int i2 = qg2Var.q;
        ig2 ig2Var = ig2.i;
        if (i2 == 0) {
            fg1.T(objK);
            ig2 ig2VarL = dq1Var.L(hg2Var.b);
            String str2 = hg2Var.b;
            if (ig2VarL != ig2Var) {
                throw new FileNotFoundException("Package directory does not exist: ".concat(str2));
            }
            String str3 = str2.length() > 0 ? str2 : null;
            String strConcat = str3 != null ? str3.concat("/") : "";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = ((u22) ((vn1) dq1Var.i).b).f.iterator();
            while (it2.hasNext()) {
                String str4 = ((oi2) it2.next()).h;
                if (wv2.d0(str4, strConcat, false)) {
                    String strY0 = pv2.y0(str4, strConcat);
                    if (strY0.length() != 0) {
                        String strG0 = pv2.G0(strY0, '/');
                        ig2 ig2Var2 = pv2.i0(strY0, '/') ? ig2Var : ig2.h;
                        if (linkedHashMap.get(strG0) == ig2Var) {
                            ig2Var2 = ig2Var;
                        }
                        linkedHashMap.put(strG0, ig2Var2);
                    }
                }
            }
            Set setEntrySet = linkedHashMap.entrySet();
            setEntrySet.getClass();
            List listA0 = du.A0(setEntrySet, new sl0(19));
            str = strConcat;
            arrayList = new ArrayList(eu.B(listA0, 10));
            it = listA0.iterator();
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = qg2Var.n;
            it = qg2Var.m;
            Collection collection = qg2Var.l;
            str = qg2Var.k;
            fg1.T(objK);
            gg2 gg2Var = (gg2) objK;
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
                hg2 hg2Var2 = new hg2(fg2.h, hk1.h(str, (String) key));
                if (ig2Var3 == ig2Var) {
                    gg2Var = new gg2(hg2Var2, true, 0L, null);
                    collection = arrayList;
                    arrayList.add(gg2Var);
                    arrayList = collection;
                    if (!it.hasNext()) {
                        return (List) arrayList;
                    }
                } else {
                    qg2Var.k = str;
                    Collection collection2 = arrayList;
                    qg2Var.l = collection2;
                    qg2Var.m = it;
                    qg2Var.n = collection2;
                    qg2Var.q = 1;
                    objK = dq1Var.K(hg2Var2, qg2Var);
                    Object obj = k20.h;
                    if (objK == obj) {
                        return obj;
                    }
                    collection = arrayList;
                    gg2 gg2Var2 = (gg2) objK;
                    arrayList.add(gg2Var2);
                    arrayList = collection;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(z70 z70Var, dz dzVar) {
        if (!(dzVar instanceof x20)) {
            z70Var.a(dzVar);
            return;
        }
        w20 w20Var = ((x20) dzVar).h;
        int length = w20Var.i.length;
        for (int i = 0; i < length; i++) {
            q(z70Var, (dz) w20Var.e(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long s(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            c80.v("Unable to inspect script storage quota.");
            return 0L;
        }
        long jAddExact = 0;
        for (File file2 : fileArrListFiles) {
            if (Files.isSymbolicLink(file2.toPath())) {
                c80.v("Symbolic links are not supported in script storage.");
                return 0L;
            }
            jAddExact = Math.addExact(jAddExact, file2.isDirectory() ? s(file2) : file2.length());
        }
        return jAddExact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int u(dz dzVar) {
        if (dzVar instanceof z20) {
            return 0;
        }
        if (dzVar instanceof p30) {
            return 2;
        }
        if (dzVar instanceof a30) {
            return 3;
        }
        if (dzVar instanceof g30) {
            return 4;
        }
        if (dzVar instanceof l30) {
            return 6;
        }
        if (dzVar instanceof d30) {
            return 16;
        }
        if (dzVar instanceof b30) {
            return 17;
        }
        if (dzVar instanceof q30) {
            return 23;
        }
        if (dzVar instanceof r30) {
            return 24;
        }
        if (dzVar instanceof c30) {
            return 25;
        }
        if (dzVar instanceof n30) {
            return 26;
        }
        if (dzVar instanceof x20) {
            return 28;
        }
        if (dzVar instanceof h30) {
            return 30;
        }
        if (dzVar instanceof y20) {
            return 31;
        }
        c80.j("Shouldn't happen");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void x(File file) throws IOException {
        if (Files.isSymbolicLink(file.toPath())) {
            c80.v("Symbolic links are not supported in script storage.");
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                c80.v("Unable to list directory.");
                return;
            }
            for (File file2 : fileArrListFiles) {
                x(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        c80.v("Unable to remove target.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(hg2 hg2Var, u00 u00Var) throws Throwable {
        ng2 ng2Var;
        if (u00Var instanceof ng2) {
            ng2Var = (ng2) u00Var;
            int i = ng2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ng2Var.m = i - Integer.MIN_VALUE;
            } else {
                ng2Var = new ng2(this, u00Var);
            }
        }
        Object obj = ng2Var.k;
        int i2 = ng2Var.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            c20 c20Var = ((df2) ((vn1) this.i).d).j;
            u30 u30Var = new u30(null, hg2Var, this);
            ng2Var.m = 1;
            Object objR = p7.R(c20Var, u30Var, ng2Var);
            k20 k20Var = k20.h;
            return objR == k20Var ? k20Var : objR;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized List E(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.i).contains(str)) {
                ((ArrayList) this.i).add(str);
            }
            arrayList = (List) ((HashMap) this.j).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.j).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized ArrayList F(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.i).iterator();
        while (it.hasNext()) {
            List<h92> list = (List) ((HashMap) this.j).get((String) it.next());
            if (list != null) {
                for (h92 h92Var : list) {
                    if ((h92Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(h92Var.b)) && !arrayList.contains(h92Var.b)) {
                        arrayList.add(h92Var.b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String G(a51 a51Var) {
        String str;
        synchronized (((wd1) this.i)) {
            str = (String) ((wd1) this.i).c(a51Var);
        }
        if (str == null) {
            zb2 zb2Var = (zb2) ((b5) this.j).c();
            try {
                a51Var.b(zb2Var.h);
                byte[] bArrDigest = zb2Var.h.digest();
                char[] cArr = b93.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = b93.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((b5) this.j).a(zb2Var);
            }
        }
        synchronized (((wd1) this.i)) {
            ((wd1) this.i).f(a51Var, str);
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(hg2 hg2Var, u00 u00Var) throws Throwable {
        pg2 pg2Var;
        if (u00Var instanceof pg2) {
            pg2Var = (pg2) u00Var;
            int i = pg2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                pg2Var.m = i - Integer.MIN_VALUE;
            } else {
                pg2Var = new pg2(this, u00Var);
            }
        }
        Object obj = pg2Var.k;
        int i2 = pg2Var.m;
        t00 t00Var = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            c20 c20Var = ((df2) ((vn1) this.i).d).j;
            og2 og2Var = new og2(t00Var, hg2Var, this, 0);
            pg2Var.m = 1;
            Object objR = p7.R(c20Var, og2Var, pg2Var);
            k20 k20Var = k20.h;
            return objR == k20Var ? k20Var : objR;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(hg2 hg2Var, hg2 hg2Var2, dl2 dl2Var, u00 u00Var) throws Throwable {
        rg2 rg2Var;
        if (u00Var instanceof rg2) {
            rg2Var = (rg2) u00Var;
            int i = rg2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                rg2Var.o = i - Integer.MIN_VALUE;
            } else {
                rg2Var = new rg2(this, u00Var);
            }
        }
        Object objV = rg2Var.m;
        int i2 = rg2Var.o;
        Object obj = k20.h;
        if (i2 == 0) {
            fg1.T(objV);
            S(hg2Var);
            rg2Var.k = hg2Var;
            rg2Var.o = 1;
            objV = v(hg2Var, hg2Var2, dl2Var, rg2Var);
            if (objV != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gg2 gg2Var = rg2Var.l;
            fg1.T(objV);
            return gg2Var;
        }
        hg2Var = rg2Var.k;
        fg1.T(objV);
        gg2 gg2Var2 = (gg2) objV;
        ui2 ui2Var = new ui2(false, false);
        rg2Var.k = null;
        rg2Var.l = gg2Var2;
        rg2Var.o = 2;
        return R(hg2Var, ui2Var, rg2Var) == obj ? obj : gg2Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(hg2 hg2Var, u00 u00Var) throws Throwable {
        sg2 sg2Var;
        if (u00Var instanceof sg2) {
            sg2Var = (sg2) u00Var;
            int i = sg2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                sg2Var.n = i - Integer.MIN_VALUE;
            } else {
                sg2Var = new sg2(this, u00Var);
            }
        }
        Object objO = sg2Var.l;
        int i2 = sg2Var.n;
        if (i2 == 0) {
            fg1.T(objO);
            ig2 ig2VarL = L(hg2Var.b);
            int i3 = ig2VarL == null ? -1 : jg2.a[ig2VarL.ordinal()];
            if (i3 == -1) {
                throw new FileNotFoundException("Package path does not exist: ".concat(hg2Var.b));
            }
            if (i3 == 1) {
                return new gg2(hg2Var, true, 0L, null);
            }
            if (i3 != 2) {
                c80.s();
                return null;
            }
            sg2Var.k = hg2Var;
            sg2Var.n = 1;
            objO = O(hg2Var, sg2Var);
            Object obj = k20.h;
            if (objO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hg2Var = sg2Var.k;
            fg1.T(objO);
        }
        return new gg2(hg2Var, false, ((byte[]) objO).length, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ig2 L(String str) {
        u22 u22Var = (u22) ((vn1) this.i).b;
        int length = str.length();
        ig2 ig2Var = ig2.i;
        if (length == 0) {
            return ig2Var;
        }
        List list = u22Var.f;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (t11.l(((oi2) it.next()).h, str)) {
                    return ig2.h;
                }
            }
        }
        String strConcat = str.concat("/");
        List list2 = u22Var.f;
        if (list2 != null && list2.isEmpty()) {
            return null;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (wv2.d0(((oi2) it2.next()).h, strConcat, false)) {
                return ig2Var;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object M(oh2 oh2Var, u00 u00Var) throws bh2, dg2 {
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
        int iU;
        ArrayList<ii2> arrayList2;
        boolean z2;
        oh2 oh2Var4 = oh2Var;
        if (u00Var instanceof mi2) {
            mi2Var = (mi2) u00Var;
            int i = mi2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                mi2Var.w = i - Integer.MIN_VALUE;
            } else {
                mi2Var = new mi2(this, u00Var);
            }
        }
        Object objY = mi2Var.u;
        int i2 = mi2Var.w;
        si2 si2Var = si2.j;
        int i3 = 1;
        Object obj = k20.h;
        if (i2 == 0) {
            fg1.T(objY);
            sz0 sz0Var = oh2Var4.a;
            mi2Var.k = oh2Var4;
            mi2Var.w = 1;
            objY = y(sz0Var, mi2Var);
            if (objY != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            oh2Var4 = mi2Var.k;
            fg1.T(objY);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    a72Var = mi2Var.n;
                    th2Var = mi2Var.m;
                    list = mi2Var.l;
                    oh2Var2 = mi2Var.k;
                    fg1.T(objY);
                    z = false;
                    mf2 mf2Var2 = (mf2) objY;
                    a72Var.h += mf2Var2.b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        boolean z3 = z;
                        if (wv2.W(((oi2) obj2).h, ".js", z3)) {
                            arrayList3.add(obj2);
                        }
                        z = z3;
                    }
                    if (!arrayList3.contains(new oi2(th2Var.g))) {
                        throw new dg2(th2Var.c, si2Var, th2Var.g, "Entry module declared by the manifest does not exist.", null, 16);
                    }
                    a72Var2 = a72Var;
                    arrayList = new ArrayList(eu.B(arrayList3, 10));
                    oh2 oh2Var5 = oh2Var2;
                    mf2Var = mf2Var2;
                    mi2Var2 = mi2Var;
                    oh2Var3 = oh2Var5;
                    list2 = list;
                    it = arrayList3.iterator();
                    String str3 = th2Var.c;
                    if (it.hasNext()) {
                    }
                    return obj;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) mi2Var.q;
                    list5 = mi2Var.p;
                    mf2Var = mi2Var.o;
                    a72Var2 = mi2Var.n;
                    th2Var3 = mi2Var.m;
                    list2 = mi2Var.l;
                    oh2Var3 = mi2Var.k;
                    fg1.T(objY);
                    String str4 = (String) objY;
                    a72Var2.h = t(th2Var3.c, str2, str4, a72Var2.h);
                    list3 = list5;
                    th2Var2 = th2Var3;
                    list4 = list2;
                    str = str4;
                    String str5 = th2Var2.c;
                    String str6 = th2Var2.g;
                    Set set = dh2.a;
                    str5.getClass();
                    list3.getClass();
                    set.getClass();
                    iU = xe1.U(eu.B(list3, 10));
                    if (iU < 16) {
                        iU = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                    for (Object obj3 : list3) {
                        linkedHashMap.put(new oi2(((ii2) obj3).a), obj3);
                    }
                    arrayList2 = new ArrayList();
                    fg1.K(new HashSet(), new LinkedHashSet(), str5, linkedHashMap, arrayList2, set, str6);
                    ri2 ri2Var = th2Var2.k;
                    z2 = ri2Var.a != null;
                    boolean z4 = ri2Var.b != null;
                    if (!z2 || !z4) {
                        for (ii2 ii2Var : arrayList2) {
                            Set set2 = ig0.a;
                            List listA = ig0.a(ii2Var.b);
                            if (!z2 && listA.contains("nuke:http")) {
                                throw new dg2(th2Var2.c, si2Var, ii2Var.a, "The script imports 'nuke:http' without declaring network permission.", null, 16);
                            }
                            if (!z4 && listA.contains("nuke:host")) {
                                throw new dg2(th2Var2.c, si2Var, ii2Var.a, "The script imports 'nuke:host' without declaring host permission.", null, 16);
                            }
                        }
                    }
                    return new u22(th2Var2, arrayList2, str, mf2Var.a, oh2Var3.a, list4);
                }
                arrayList = mi2Var.t;
                String str7 = mi2Var.s;
                it = mi2Var.r;
                Collection collection = (Collection) mi2Var.q;
                mf2 mf2Var3 = mi2Var.o;
                a72 a72Var3 = mi2Var.n;
                th2 th2Var4 = mi2Var.m;
                List list6 = mi2Var.l;
                oh2 oh2Var6 = mi2Var.k;
                fg1.T(objY);
                String str8 = str7;
                th2Var = th2Var4;
                List list7 = list6;
                a72Var2 = a72Var3;
                mf2Var = mf2Var3;
                String str9 = (String) objY;
                a72Var2.h = t(th2Var.c, str8, str9, a72Var2.h);
                arrayList.add(new ii2(str8, str9));
                mi2Var2 = mi2Var;
                oh2Var3 = oh2Var6;
                arrayList = collection;
                list2 = list7;
                String str32 = th2Var.c;
                if (it.hasNext()) {
                    str8 = ((oi2) it.next()).h;
                    sz0 sz0Var2 = oh2Var3.a;
                    mi2Var2.k = oh2Var3;
                    mi2Var2.l = list2;
                    mi2Var2.m = th2Var;
                    mi2Var2.n = a72Var2;
                    mi2Var2.o = mf2Var;
                    mi2Var2.p = null;
                    mi2Var2.q = arrayList;
                    mi2Var2.r = it;
                    mi2Var2.s = str8;
                    mi2Var2.t = arrayList;
                    mi2Var2.w = 4;
                    Object objQ = Q(sz0Var2, str32, str8, mi2Var2);
                    if (objQ != obj) {
                        oh2 oh2Var7 = oh2Var3;
                        mi2Var = mi2Var2;
                        objY = objQ;
                        oh2Var6 = oh2Var7;
                        list7 = list2;
                        collection = arrayList;
                        String str92 = (String) objY;
                        a72Var2.h = t(th2Var.c, str8, str92, a72Var2.h);
                        arrayList.add(new ii2(str8, str92));
                        mi2Var2 = mi2Var;
                        oh2Var3 = oh2Var6;
                        arrayList = collection;
                        list2 = list7;
                        String str322 = th2Var.c;
                        if (it.hasNext()) {
                            list3 = (List) arrayList;
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (t11.l(((oi2) next).h, "README.md")) {
                                    break;
                                }
                            }
                            oi2 oi2Var = (oi2) next;
                            String str10 = oi2Var != null ? oi2Var.h : null;
                            if (str10 == null) {
                                th2Var2 = th2Var;
                                list4 = list2;
                                str = null;
                                String str52 = th2Var2.c;
                                String str62 = th2Var2.g;
                                Set set3 = dh2.a;
                                str52.getClass();
                                list3.getClass();
                                set3.getClass();
                                iU = xe1.U(eu.B(list3, 10));
                                if (iU < 16) {
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iU);
                                while (r1.hasNext()) {
                                }
                                arrayList2 = new ArrayList();
                                fg1.K(new HashSet(), new LinkedHashSet(), str52, linkedHashMap2, arrayList2, set3, str62);
                                ri2 ri2Var2 = th2Var2.k;
                                if (ri2Var2.a != null) {
                                }
                                if (ri2Var2.b != null) {
                                }
                                if (!z2) {
                                }
                                return new u22(th2Var2, arrayList2, str, mf2Var.a, oh2Var3.a, list4);
                            }
                            sz0 sz0Var3 = oh2Var3.a;
                            mi2Var2.k = oh2Var3;
                            mi2Var2.l = list2;
                            mi2Var2.m = th2Var;
                            mi2Var2.n = a72Var2;
                            mi2Var2.o = mf2Var;
                            mi2Var2.p = list3;
                            mi2Var2.q = str10;
                            mi2Var2.r = null;
                            mi2Var2.s = null;
                            mi2Var2.t = null;
                            mi2Var2.w = 5;
                            objY = Q(sz0Var3, str322, str10, mi2Var2);
                            if (objY != obj) {
                                th2Var3 = th2Var;
                                list5 = list3;
                                str2 = str10;
                                String str42 = (String) objY;
                                a72Var2.h = t(th2Var3.c, str2, str42, a72Var2.h);
                                list3 = list5;
                                th2Var2 = th2Var3;
                                list4 = list2;
                                str = str42;
                                String str522 = th2Var2.c;
                                String str622 = th2Var2.g;
                                Set set32 = dh2.a;
                                str522.getClass();
                                list3.getClass();
                                set32.getClass();
                                iU = xe1.U(eu.B(list3, 10));
                                if (iU < 16) {
                                }
                                LinkedHashMap linkedHashMap22 = new LinkedHashMap(iU);
                                while (r1.hasNext()) {
                                }
                                arrayList2 = new ArrayList();
                                fg1.K(new HashSet(), new LinkedHashSet(), str522, linkedHashMap22, arrayList2, set32, str622);
                                ri2 ri2Var22 = th2Var2.k;
                                if (ri2Var22.a != null) {
                                }
                                if (ri2Var22.b != null) {
                                }
                                if (!z2) {
                                    while (r0.hasNext()) {
                                    }
                                }
                                return new u22(th2Var2, arrayList2, str, mf2Var.a, oh2Var3.a, list4);
                            }
                        }
                    }
                }
                return obj;
            }
            List list8 = mi2Var.l;
            oh2 oh2Var8 = mi2Var.k;
            fg1.T(objY);
            list = list8;
            oh2Var2 = oh2Var8;
            z = false;
            uh2 uh2Var = (uh2) objY;
            th2Var = uh2Var.a;
            a72Var = new a72();
            a72Var.h = uh2Var.b;
            ak akVar = (ak) this.j;
            sz0 sz0Var4 = oh2Var2.a;
            mi2Var.k = oh2Var2;
            mi2Var.l = list;
            mi2Var.m = th2Var;
            mi2Var.n = a72Var;
            mi2Var.w = 3;
            objY = akVar.b(sz0Var4, th2Var, list, mi2Var);
        }
        List list9 = (List) objY;
        if (list9.size() > 512) {
            throw new dg2(null, si2Var, null, hk1.g(list9.size(), "Script package contains ", " files; maximum is 512."), null, 20);
        }
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it3 = list9.iterator();
        while (it3.hasNext()) {
            String str11 = ((oi2) it3.next()).h;
            if (!hashSet.add(new oi2(str11))) {
                throw new dg2(null, si2Var, str11, "Duplicate script path.", null, 16);
            }
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = str11.toLowerCase(locale);
            lowerCase.getClass();
            oi2 oi2Var2 = (oi2) map.putIfAbsent(lowerCase, new oi2(str11));
            String str12 = oi2Var2 != null ? oi2Var2.h : null;
            if (str12 != null && !str12.equals(str11)) {
                throw new dg2(null, si2Var, str11, vi0.j("Path conflicts with ", str12, " when compared case-insensitively."), null, 16);
            }
            char[] cArr = new char[i3];
            cArr[0] = '/';
            List listC0 = pv2.C0(str11, cArr);
            int size = listC0.size();
            int i4 = 0;
            while (i4 < size) {
                i4++;
                String strU0 = du.u0(du.B0(i4, listC0), "/", null, null, null, 62);
                HashSet hashSet2 = hashSet;
                Locale locale2 = Locale.ROOT;
                locale2.getClass();
                String lowerCase2 = strU0.toLowerCase(locale2);
                lowerCase2.getClass();
                String str13 = (String) map2.putIfAbsent(lowerCase2, strU0);
                if (str13 != null && !str13.equals(strU0)) {
                    throw new dg2(null, si2Var, str11, vi0.j("Path segment conflicts with ", str13, " when compared case-insensitively."), null, 16);
                }
                hashSet = hashSet2;
            }
            i3 = 1;
        }
        z = false;
        j51 j51Var = (j51) this.i;
        sz0 sz0Var5 = oh2Var4.a;
        mi2Var.k = oh2Var4;
        mi2Var.l = list9;
        mi2Var.w = 2;
        Object objA = j51Var.A(sz0Var5, list9, mi2Var);
        if (objA != obj) {
            oh2Var2 = oh2Var4;
            list = list9;
            objY = objA;
            uh2 uh2Var2 = (uh2) objY;
            th2Var = uh2Var2.a;
            a72Var = new a72();
            a72Var.h = uh2Var2.b;
            ak akVar2 = (ak) this.j;
            sz0 sz0Var42 = oh2Var2.a;
            mi2Var.k = oh2Var2;
            mi2Var.l = list;
            mi2Var.m = th2Var;
            mi2Var.n = a72Var;
            mi2Var.w = 3;
            objY = akVar2.b(sz0Var42, th2Var, list, mi2Var);
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(hg2 hg2Var, u00 u00Var) throws Throwable {
        tg2 tg2Var;
        if (u00Var instanceof tg2) {
            tg2Var = (tg2) u00Var;
            int i = tg2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tg2Var.m = i - Integer.MIN_VALUE;
            } else {
                tg2Var = new tg2(this, u00Var);
            }
        }
        Object obj = tg2Var.k;
        int i2 = tg2Var.m;
        int i3 = 1;
        t00 t00Var = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            c20 c20Var = ((df2) ((vn1) this.i).d).j;
            og2 og2Var = new og2(t00Var, hg2Var, this, i3);
            tg2Var.m = 1;
            Object objR = p7.R(c20Var, og2Var, tg2Var);
            k20 k20Var = k20.h;
            return objR == k20Var ? k20Var : objR;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(hg2 hg2Var, u00 u00Var) throws Throwable {
        ug2 ug2Var;
        if (u00Var instanceof ug2) {
            ug2Var = (ug2) u00Var;
            int i = ug2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ug2Var.n = i - Integer.MIN_VALUE;
            } else {
                ug2Var = new ug2(this, u00Var);
            }
        }
        Object objR = ug2Var.l;
        int i2 = ug2Var.n;
        try {
            if (i2 == 0) {
                fg1.T(objR);
                String str = hg2Var.b;
                if (str.length() == 0 || L(str) != ig2.h) {
                    throw new FileNotFoundException("Package file does not exist: ".concat(str));
                }
                o72 o72Var = oi2.i;
                String strY = xe1.Y(str);
                vn1 vn1Var = (vn1) this.i;
                ((df2) vn1Var.d).a.getClass();
                sz0 sz0Var = ((u22) vn1Var.b).e;
                ug2Var.k = 16777216L;
                ug2Var.n = 2;
                objR = p7.R((c20) sz0Var.i, new v80(sz0Var, strY, 16777216, null, 0), ug2Var);
                k20 k20Var = k20.h;
                if (objR == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 == 1) {
                    fg1.T(objR);
                    return objR;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = ug2Var.k;
                    fg1.T(objR);
                    if (((byte[]) objR).length <= j) {
                        return (byte[]) objR;
                    }
                    throw new sd2("QUOTA_EXCEEDED", "File exceeds the read limit.", false, null, null, 28);
                }
                fg1.T(objR);
            }
            return (byte[]) objR;
        } catch (bh2 e) {
            c80.p("QUOTA_EXCEEDED", "File exceeds the read limit.", 0, null, e, 12);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object P(hg2 hg2Var, u00 u00Var) throws Throwable {
        vg2 vg2Var;
        if (u00Var instanceof vg2) {
            vg2Var = (vg2) u00Var;
            int i = vg2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vg2Var.m = i - Integer.MIN_VALUE;
            } else {
                vg2Var = new vg2(this, u00Var);
            }
        }
        Object objN = vg2Var.k;
        int i2 = vg2Var.m;
        if (i2 == 0) {
            fg1.T(objN);
            vg2Var.m = 1;
            objN = N(hg2Var, vg2Var);
            Object obj = k20.h;
            if (objN == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(objN);
        }
        byte[] bArr = (byte[]) objN;
        try {
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
            string.getClass();
            return string;
        } catch (Exception e) {
            c80.p("IO_ERROR", "File is not valid UTF-8.", 0, null, e, 12);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Q(sz0 sz0Var, String str, String str2, u00 u00Var) throws bh2, dg2 {
        ni2 ni2Var;
        if (u00Var instanceof ni2) {
            ni2Var = (ni2) u00Var;
            int i = ni2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ni2Var.o = i - Integer.MIN_VALUE;
            } else {
                ni2Var = new ni2(this, u00Var);
            }
        }
        Object obj = ni2Var.m;
        int i2 = ni2Var.o;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    String str3 = ni2Var.l;
                    String str4 = ni2Var.k;
                    fg1.T(obj);
                    return (String) obj;
                }
                if (i2 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str5 = ni2Var.l;
                String str6 = ni2Var.k;
                fg1.T(obj);
                return (String) obj;
            }
            fg1.T(obj);
            Object obj2 = k20.h;
            if (sz0Var != null) {
                ni2Var.k = str;
                ni2Var.l = str2;
                ni2Var.o = 1;
                Object objK = sz0Var.K(str2, 2097152, ni2Var);
                if (objK != obj2) {
                    obj = objK;
                    return (String) obj;
                }
            } else {
                ni2Var.k = str;
                ni2Var.l = str2;
                ni2Var.o = 2;
                Object objK2 = sz0Var.K(str2, Integer.MAX_VALUE, ni2Var);
                if (objK2 != obj2) {
                    obj = objK2;
                    return (String) obj;
                }
            }
            return obj2;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            if (!(th instanceof bh2)) {
                throw new dg2(str, si2.i, str2, "Unable to read script file as UTF-8.", th);
            }
            throw new dg2(str, si2.j, str2, hk1.g(th.h, "File exceeds the maximum of ", " bytes."), th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object R(hg2 hg2Var, ui2 ui2Var, u00 u00Var) throws Throwable {
        wg2 wg2Var;
        if (u00Var instanceof wg2) {
            wg2Var = (wg2) u00Var;
            int i = wg2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                wg2Var.m = i - Integer.MIN_VALUE;
            } else {
                wg2Var = new wg2(this, u00Var);
            }
        }
        Object obj = wg2Var.k;
        int i2 = wg2Var.m;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                c20 c20Var = ((df2) ((vn1) this.i).d).j;
                u0 u0Var = new u0((t00) null, this, hg2Var, ui2Var);
                wg2Var.m = 1;
                Object objR = p7.R(c20Var, u0Var, wg2Var);
                k20 k20Var = k20.h;
                if (objR == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
            }
            return a83.a;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public File T(hg2 hg2Var) throws IOException {
        File fileU = U(hg2Var.a);
        String str = hg2Var.b;
        File file = str.length() == 0 ? fileU : new File(fileU, str);
        File canonicalFile = fileU.getCanonicalFile();
        File canonicalFile2 = file.getCanonicalFile();
        canonicalFile.getClass();
        canonicalFile2.getClass();
        B(canonicalFile, canonicalFile2);
        C(canonicalFile, file, file.exists());
        return canonicalFile2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public File U(fg2 fg2Var) throws IOException {
        File file;
        if (fg2Var == fg2.h) {
            c80.p("INVALID_ARGUMENT", "Package files do not have a writable root.", 0, null, null, 28);
            return null;
        }
        if (fg2Var == fg2.k && !((pi2) ((vn1) this.i).g).e) {
            c80.p("PERMISSION_DENIED", "External storage access has not been granted.", 0, null, null, 28);
            return null;
        }
        vk2 vk2Var = (vk2) ((hx2) this.j).getValue();
        if (vk2Var == null) {
            c80.p("NOT_SUPPORTED", "Script storage roots are not configured.", 0, null, null, 28);
            return null;
        }
        int iOrdinal = fg2Var.ordinal();
        if (iOrdinal == 0) {
            s.l("Handled above.");
            return null;
        }
        if (iOrdinal == 1) {
            file = vk2Var.a;
        } else if (iOrdinal == 2) {
            file = vk2Var.b;
        } else {
            if (iOrdinal != 3) {
                c80.s();
                return null;
            }
            file = vk2Var.c;
            if (file == null) {
                c80.p("NOT_SUPPORTED", "External storage is not configured on this device.", 0, null, null, 28);
                return null;
            }
        }
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.exists() && Files.isSymbolicLink(absoluteFile.toPath())) {
            c80.v("Script storage root must not be a symbolic link.");
            return null;
        }
        if (!absoluteFile.exists() && !absoluteFile.mkdirs()) {
            c80.v("Unable to create script storage root.");
            return null;
        }
        if (!absoluteFile.isDirectory()) {
            c80.v("Script storage root is not a directory.");
            return null;
        }
        File canonicalFile = absoluteFile.getCanonicalFile();
        canonicalFile.getClass();
        return canonicalFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object V(hg2 hg2Var, u00 u00Var) throws Throwable {
        xg2 xg2Var;
        if (u00Var instanceof xg2) {
            xg2Var = (xg2) u00Var;
            int i = xg2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xg2Var.m = i - Integer.MIN_VALUE;
            } else {
                xg2Var = new xg2(this, u00Var);
            }
        }
        Object obj = xg2Var.k;
        int i2 = xg2Var.m;
        t00 t00Var = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            c20 c20Var = ((df2) ((vn1) this.i).d).j;
            og2 og2Var = new og2(t00Var, hg2Var, this, 2);
            xg2Var.m = 1;
            Object objR = p7.R(c20Var, og2Var, xg2Var);
            k20 k20Var = k20.h;
            return objR == k20Var ? k20Var : objR;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gg2 W(hg2 hg2Var, File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("Path does not exist: ".concat(hg2Var.b));
        }
        C(U(hg2Var.a), file, true);
        boolean zIsDirectory = file.isDirectory();
        long length = file.isFile() ? file.length() : 0L;
        long jLastModified = file.lastModified();
        Long lValueOf = Long.valueOf(jLastModified);
        if (jLastModified <= 0) {
            lValueOf = null;
        }
        return new gg2(hg2Var, zIsDirectory, length, lValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X(x20 x20Var, boolean z) {
        yn ynVar = (yn) this.j;
        boolean z2 = z && ynVar.d();
        w20 w20Var = x20Var.h;
        int length = w20Var.i.length;
        if (z2) {
            ynVar.b("  size: ".concat(pp0.K(length)));
        }
        ynVar.m(length);
        for (int i = 0; i < length; i++) {
            dz dzVar = (dz) w20Var.e(i);
            if (z2) {
                StringBuilder sb = new StringBuilder("  [");
                sb.append(Integer.toHexString(i));
                sb.append("] ");
                sb.append(u(dzVar) == 30 ? "null" : dzVar.f() + ' ' + dzVar.b());
                ynVar.b(sb.toString());
            }
            z70 z70Var = (z70) this.i;
            int iU = u(dzVar);
            if (iU == 0 || iU == 6 || iU == 2) {
                long jI = ((k30) dzVar).i();
                int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jI >> 63) ^ jI)) >> 3;
                ynVar.i(iU | ((iNumberOfLeadingZeros - 1) << 5));
                while (iNumberOfLeadingZeros > 0) {
                    ynVar.i((byte) jI);
                    jI >>= 8;
                    iNumberOfLeadingZeros--;
                }
            } else if (iU == 3) {
                s11.t0(ynVar, iU, ((k30) dzVar).i());
            } else if (iU != 4) {
                if (iU == 16) {
                    s11.s0(ynVar, iU, ((long) ((d30) dzVar).h) << 32);
                } else if (iU != 17) {
                    switch (iU) {
                        case 21:
                            Object obj = z70Var.j;
                            c80.g();
                            return;
                        case 22:
                            z70Var.getClass();
                            c80.g();
                            return;
                        case 23:
                            s11.t0(ynVar, iU, ((b42) z70Var.h).l((q30) dzVar));
                            break;
                        case 24:
                            s11.t0(ynVar, iU, ((b42) z70Var.i).m((r30) dzVar));
                            break;
                        case 25:
                            s11.t0(ynVar, iU, ((ni0) z70Var.k).l((c30) dzVar));
                            break;
                        case 26:
                            s11.t0(ynVar, iU, ((xg1) z70Var.l).l((n30) dzVar));
                            break;
                        case 27:
                            c80.g();
                            return;
                        case 28:
                            ynVar.i(iU);
                            X((x20) dzVar, false);
                            break;
                        case 29:
                            ynVar.i(iU);
                            c80.g();
                            return;
                        case 30:
                            ynVar.i(iU);
                            break;
                        case 31:
                            ynVar.i((((y20) dzVar).h << 5) | iU);
                            break;
                        default:
                            c80.j("Shouldn't happen");
                            return;
                    }
                } else {
                    s11.s0(ynVar, iU, ((b30) dzVar).h);
                }
            }
        }
        if (z2) {
            ynVar.e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Y(hg2 hg2Var, byte[] bArr, dl2 dl2Var, u00 u00Var) throws Throwable {
        yg2 yg2Var;
        if (u00Var instanceof yg2) {
            yg2Var = (yg2) u00Var;
            int i = yg2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                yg2Var.m = i - Integer.MIN_VALUE;
            } else {
                yg2Var = new yg2(this, u00Var);
            }
        }
        Object obj = yg2Var.k;
        int i2 = yg2Var.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            c20 c20Var = ((df2) ((vn1) this.i).d).j;
            r10 r10Var = new r10(null, this, hg2Var, bArr, dl2Var);
            yg2Var.m = 1;
            Object objR = p7.R(c20Var, r10Var, yg2Var);
            k20 k20Var = k20.h;
            return objR == k20Var ? k20Var : objR;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Z(hg2 hg2Var, InputStream inputStream, long j, boolean z, boolean z2, u00 u00Var) throws Throwable {
        ah2 ah2Var;
        if (u00Var instanceof ah2) {
            ah2Var = (ah2) u00Var;
            int i = ah2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ah2Var.m = i - Integer.MIN_VALUE;
            } else {
                ah2Var = new ah2(this, u00Var);
            }
        }
        ah2 ah2Var2 = ah2Var;
        Object obj = ah2Var2.k;
        int i2 = ah2Var2.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            c20 c20Var = ((df2) ((vn1) this.i).d).j;
            zg2 zg2Var = new zg2(null, this, hg2Var, j, z2, z, inputStream);
            ah2Var2.m = 1;
            Object objR = p7.R(c20Var, zg2Var, ah2Var2);
            k20 k20Var = k20.h;
            return objR == k20Var ? k20Var : objR;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dp
    public void a(s52 s52Var, r92 r92Var) {
        cp cpVar = (cp) this.i;
        ct1 ct1Var = (ct1) this.j;
        try {
            try {
                cpVar.b(ct1Var, ct1Var.f(r92Var));
            } catch (Throwable th) {
                xe1.m0(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            xe1.m0(th2);
            try {
                cpVar.d(ct1Var, th2);
            } catch (Throwable th3) {
                xe1.m0(th3);
                th3.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.om2
    public int b(int i) {
        do {
            i = ((sx1) this.j).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i)));
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.om2
    public int c(int i) {
        do {
            i = ((sx1) this.j).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i - 1)));
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.np
    public void cancel() {
        if (((xg) this.j).compareAndSet(1, 1)) {
            return;
        }
        ((s1) this.i).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e40
    public void d(Exception exc) {
        it2 it2Var = (it2) this.j;
        ih1 ih1Var = (ih1) this.i;
        ih1 ih1Var2 = it2Var.m;
        if (ih1Var2 == null || ih1Var2 != ih1Var) {
            return;
        }
        it2 it2Var2 = (it2) this.j;
        ih1 ih1Var3 = (ih1) this.i;
        w40 w40Var = it2Var2.i;
        d40 d40Var = it2Var2.n;
        f40 f40Var = ih1Var3.c;
        w40Var.b(d40Var, exc, f40Var, f40Var.e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wc2
    public Object e(Object obj) {
        return ((in0) this.j).j(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jv1
    public List f(Integer num) {
        List listF = ((jv1) this.i).f(null);
        tr2 tr2Var = (tr2) this.j;
        int i = tr2Var.v;
        return i < 0 ? listF : du.x0(p7.l(tr2Var, num, i, Integer.valueOf(tr2Var.E(tr2Var.b, i))), listF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wa0
    public void g(zk zkVar, Bitmap bitmap) throws IOException {
        IOException iOException = ((rg0) this.j).i;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            zkVar.h(bitmap);
            throw iOException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e40
    public void h(Object obj) {
        it2 it2Var = (it2) this.j;
        ih1 ih1Var = (ih1) this.i;
        ih1 ih1Var2 = it2Var.m;
        if (ih1Var2 == null || ih1Var2 != ih1Var) {
            return;
        }
        it2 it2Var2 = (it2) this.j;
        ih1 ih1Var3 = (ih1) this.i;
        b90 b90Var = it2Var2.h.p;
        if (obj == null || !b90Var.a(ih1Var3.c.e())) {
            w40 w40Var = it2Var2.i;
            a51 a51Var = ih1Var3.a;
            f40 f40Var = ih1Var3.c;
            w40Var.a(a51Var, obj, f40Var, f40Var.e(), it2Var2.n);
            return;
        }
        it2Var2.l = obj;
        w40 w40Var2 = it2Var2.i;
        w40Var2.M = 2;
        ff0 ff0Var = w40Var2.w;
        (ff0Var.t ? ff0Var.p : ff0Var.o).execute(w40Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jv1
    public boolean i() {
        return ((jv1) this.i).i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dp
    public void j(s52 s52Var, IOException iOException) {
        try {
            ((cp) this.i).d((ct1) this.j, iOException);
        } catch (Throwable th) {
            xe1.m0(th);
            th.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.om2
    public int k(int i) {
        CharSequence charSequence = (CharSequence) this.i;
        do {
            i = ((sx1) this.j).i(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.om2
    public int l(int i) {
        do {
            i = ((sx1) this.j).j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i - 1)));
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wc2
    public Object m(bc2 bc2Var, Object obj) {
        return ((mn0) this.i).g(bc2Var, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wa0
    public void p() {
        r62 r62Var = (r62) this.i;
        synchronized (r62Var) {
            r62Var.j = r62Var.h.length;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long r(fg2 fg2Var) {
        df2 df2Var = (df2) ((vn1) this.i).d;
        int iOrdinal = fg2Var.ordinal();
        if (iOrdinal == 0) {
            c80.p("PERMISSION_DENIED", "Package files are read-only.", 0, null, null, 28);
            return 0L;
        }
        if (iOrdinal == 1) {
            df2Var.a.getClass();
            return 134217728L;
        }
        if (iOrdinal == 2) {
            df2Var.a.getClass();
            return 268435456L;
        }
        if (iOrdinal == 3) {
            df2Var.a.getClass();
            return 1073741824L;
        }
        c80.s();
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int t(String str, String str2, String str3, int i) throws dg2 {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str3.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        si2 si2Var = si2.j;
        if (length > 2097152) {
            throw new dg2(str, si2Var, str2, hk1.g(length, "File size is ", " bytes; maximum is 2097152."), null, 16);
        }
        long j = ((long) i) + ((long) length);
        if (j <= 16777216) {
            return (int) j;
        }
        throw new dg2(str, si2Var, str2, "Total script size exceeds 16777216 bytes.", null, 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 21:
                return "Bounds{lower=" + ((zz0) this.i) + " upper=" + ((zz0) this.j) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(hg2 hg2Var, hg2 hg2Var2, dl2 dl2Var, u00 u00Var) throws Throwable {
        kg2 kg2Var;
        if (u00Var instanceof kg2) {
            kg2Var = (kg2) u00Var;
            int i = kg2Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                kg2Var.o = i - Integer.MIN_VALUE;
            } else {
                kg2Var = new kg2(this, u00Var);
            }
        }
        Object objN = kg2Var.m;
        int i2 = kg2Var.o;
        Object obj = k20.h;
        if (i2 == 0) {
            fg1.T(objN);
            kg2Var.k = hg2Var2;
            kg2Var.l = dl2Var;
            kg2Var.o = 1;
            objN = N(hg2Var, kg2Var);
            if (objN != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(objN);
                return objN;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dl2Var = kg2Var.l;
        hg2Var2 = kg2Var.k;
        fg1.T(objN);
        kg2Var.k = null;
        kg2Var.l = null;
        kg2Var.o = 2;
        Object objY = Y(hg2Var2, (byte[]) objN, dl2Var, kg2Var);
        return objY == obj ? obj : objY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(hg2 hg2Var, boolean z, u00 u00Var) throws Throwable {
        mg2 mg2Var;
        if (u00Var instanceof mg2) {
            mg2Var = (mg2) u00Var;
            int i = mg2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                mg2Var.m = i - Integer.MIN_VALUE;
            } else {
                mg2Var = new mg2(this, u00Var);
            }
        }
        Object obj = mg2Var.k;
        int i2 = mg2Var.m;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                c20 c20Var = ((df2) ((vn1) this.i).d).j;
                lg2 lg2Var = new lg2(null, this, hg2Var, z);
                mg2Var.m = 1;
                Object objR = p7.R(c20Var, lg2Var, mg2Var);
                k20 k20Var = k20.h;
                if (objR == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
            }
            return a83.a;
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "File was not found.";
            }
            throw new sd2("NOT_FOUND", message, false, null, e, 12);
        } catch (IOException e2) {
            c80.p("IO_ERROR", "File operation failed.", 0, null, e2, 12);
            return null;
        } catch (sd2 e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(sz0 sz0Var, u00 u00Var) throws dg2 {
        li2 li2Var;
        if (u00Var instanceof li2) {
            li2Var = (li2) u00Var;
            int i = li2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                li2Var.n = i - Integer.MIN_VALUE;
            } else {
                li2Var = new li2(this, u00Var);
            }
        }
        Object objR = li2Var.l;
        int i2 = li2Var.n;
        t00 t00Var = null;
        try {
            if (i2 == 0) {
                fg1.T(objR);
                li2Var.k = sz0Var;
                li2Var.n = 1;
                objR = p7.R((c20) sz0Var.i, new u80(sz0Var, t00Var, 0), li2Var);
                k20 k20Var = k20.h;
                if (objR == k20Var) {
                    return k20Var;
                }
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sz0Var = li2Var.k;
                fg1.T(objR);
            }
            return du.z0((Iterable) objR);
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            String path = ((File) sz0Var.j).getPath();
            path.getClass();
            throw new dg2(null, si2.h, null, "Unable to discover files from " + path + ".", th, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x0034 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: r61 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z() {
        Object[] objArr;
        zk1 zk1Var = (zk1) this.i;
        Arrays.sort(zk1Var.h, 0, zk1Var.j, sl0.d);
        int i = zk1Var.j;
        r61[] r61VarArr = (r61[]) this.j;
        if (r61VarArr != null) {
            int length = r61VarArr.length;
            objArr = r61VarArr;
            if (length < i) {
                objArr = new r61[Math.max(16, i)];
            }
        }
        this.j = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = zk1Var.h[i2];
        }
        zk1Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.j = objArr;
                return;
            }
            r61 r61Var = objArr[i];
            r61Var.getClass();
            if (r61Var.V) {
                A(r61Var);
            }
            objArr[i] = 0;
        }
    }

    public /* synthetic */ dq1(int i, Object obj, Object obj2, boolean z) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
    }

    public dq1(eg2 eg2Var) {
        this.h = 12;
        this.i = new j51(24);
        this.j = new ak(2097152);
    }

    public /* synthetic */ dq1(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    public dq1(s1 s1Var) {
        this.h = 3;
        this.i = s1Var;
        this.j = new xg(0);
    }

    public dq1(z8 z8Var, int i, int i2, int i3, int i4) {
        this.h = 5;
        this.i = new sd0(z8Var, i, i3, i4);
        this.j = new ArrayList(i2);
    }

    public dq1(z70 z70Var, yn ynVar) {
        this.h = 19;
        if (z70Var != null) {
            this.i = z70Var;
            this.j = ynVar;
        } else {
            um2.f("file == null");
            throw null;
        }
    }

    public dq1(vn1 vn1Var) {
        this.h = 11;
        this.i = vn1Var;
        this.j = new hx2(new ta(21, this));
    }

    public dq1(WindowInsetsAnimation.Bounds bounds) {
        this.h = 21;
        this.i = zz0.c(bounds.getLowerBound());
        this.j = zz0.c(bounds.getUpperBound());
    }
}
