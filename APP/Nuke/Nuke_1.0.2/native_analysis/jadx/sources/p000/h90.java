package p000;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h90 implements Closeable {

    /* JADX INFO: renamed from: h */
    public final File f3908h;

    /* JADX INFO: renamed from: i */
    public final File f3909i;

    /* JADX INFO: renamed from: j */
    public final File f3910j;

    /* JADX INFO: renamed from: k */
    public final File f3911k;

    /* JADX INFO: renamed from: m */
    public final long f3913m;

    /* JADX INFO: renamed from: o */
    public final boolean f3915o;

    /* JADX INFO: renamed from: q */
    public BufferedWriter f3917q;

    /* JADX INFO: renamed from: s */
    public int f3919s;

    /* JADX INFO: renamed from: p */
    public long f3916p = 0;

    /* JADX INFO: renamed from: r */
    public final LinkedHashMap f3918r = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: t */
    public long f3920t = 0;

    /* JADX INFO: renamed from: u */
    public final ThreadPoolExecutor f3921u = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e90());

    /* JADX INFO: renamed from: v */
    public final d90 f3922v = new d90(this);

    /* JADX INFO: renamed from: l */
    public final int f3912l = 1;

    /* JADX INFO: renamed from: n */
    public final int f3914n = 1;

    public h90(File file, long j, boolean z) {
        this.f3908h = file;
        this.f3909i = new File(file, "journal");
        this.f3910j = new File(file, "journal.tmp");
        this.f3911k = new File(file, "journal.bkp");
        this.f3913m = j;
        this.f3915o = z;
    }

    /* JADX INFO: renamed from: b */
    public static void m2124b(h90 h90Var, f90 f90Var, boolean z) {
        synchronized (h90Var) {
            g90 g90Var = (g90) f90Var.f2863b;
            if (g90Var.f3363f != f90Var) {
                throw new IllegalStateException();
            }
            if (z && !g90Var.f3362e) {
                for (int i = 0; i < h90Var.f3914n; i++) {
                    if (!((boolean[]) f90Var.f2864c)[i]) {
                        f90Var.m1588a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!g90Var.m1813b(i).exists()) {
                        f90Var.m1588a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < h90Var.f3914n; i2++) {
                File fileM1813b = g90Var.m1813b(i2);
                if (!z) {
                    m2126e(fileM1813b);
                } else if (fileM1813b.exists()) {
                    File fileM1812a = g90Var.m1812a(i2);
                    fileM1813b.renameTo(fileM1812a);
                    long j = g90Var.f3359b[i2];
                    long length = fileM1812a.length();
                    g90Var.f3359b[i2] = length;
                    h90Var.f3916p = (h90Var.f3916p - j) + length;
                }
            }
            h90Var.f3919s++;
            g90Var.f3363f = null;
            if (g90Var.f3362e || z) {
                g90Var.f3362e = true;
                h90Var.f3917q.append((CharSequence) "CLEAN");
                h90Var.f3917q.append(' ');
                h90Var.f3917q.append((CharSequence) g90Var.f3358a);
                h90Var.f3917q.append((CharSequence) g90Var.m1814c());
                h90Var.f3917q.append('\n');
                if (z) {
                    h90Var.f3920t++;
                }
            } else {
                h90Var.f3918r.remove(g90Var.f3358a);
                h90Var.f3917q.append((CharSequence) "REMOVE");
                h90Var.f3917q.append(' ');
                h90Var.f3917q.append((CharSequence) g90Var.f3358a);
                h90Var.f3917q.append('\n');
            }
            m2128j(h90Var.f3917q);
            if (h90Var.f3916p > h90Var.f3913m || h90Var.m2132o()) {
                h90Var.f3921u.submit(h90Var.f3922v);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2125c(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2126e(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: h */
    public static h90 m2127h(File file, long j, boolean z) throws IOException {
        if (j <= 0) {
            C0676s.m4651j("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m2129u(file2, file3, false);
            }
        }
        h90 h90Var = new h90(file, j, z);
        if (h90Var.f3909i.exists()) {
            try {
                h90Var.m2134q();
                h90Var.m2133p();
                return h90Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                h90Var.close();
                c93.m709a(h90Var.f3908h);
            }
        }
        file.mkdirs();
        h90 h90Var2 = new h90(file, j, z);
        h90Var2.m2136t();
        return h90Var2;
    }

    /* JADX INFO: renamed from: j */
    public static void m2128j(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m2129u(File file, File file2, boolean z) throws IOException {
        if (z) {
            m2126e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f3917q == null) {
                return;
            }
            Iterator it = new ArrayList(this.f3918r.values()).iterator();
            while (it.hasNext()) {
                f90 f90Var = ((g90) it.next()).f3363f;
                if (f90Var != null) {
                    f90Var.m1588a();
                }
            }
            m2137v();
            m2125c(this.f3917q);
            this.f3917q = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final f90 m2130g(String str) {
        synchronized (this) {
            try {
                if (this.f3917q == null) {
                    throw new IllegalStateException("cache is closed");
                }
                g90 g90Var = (g90) this.f3918r.get(str);
                if (g90Var == null) {
                    g90Var = new g90(this, str);
                    this.f3918r.put(str, g90Var);
                } else if (g90Var.f3363f != null) {
                    return null;
                }
                f90 f90Var = new f90(this, g90Var);
                g90Var.f3363f = f90Var;
                this.f3917q.append((CharSequence) "DIRTY");
                this.f3917q.append(' ');
                this.f3917q.append((CharSequence) str);
                this.f3917q.append('\n');
                m2128j(this.f3917q);
                return f90Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized C0043b5 m2131k(String str) throws Throwable {
        h90 h90Var;
        Throwable th;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            h90Var = this;
        }
        if (this.f3917q == null) {
            h90Var = this;
            try {
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
        try {
            g90 g90Var = (g90) this.f3918r.get(str);
            if (g90Var == null) {
                return null;
            }
            if (!g90Var.f3362e) {
                return null;
            }
            for (int i = 0; i < this.f3914n; i++) {
                try {
                    if (!g90Var.m1812a(i).exists()) {
                        return null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    h90Var = this;
                }
            }
            this.f3919s++;
            this.f3917q.append((CharSequence) "READ");
            this.f3917q.append(' ');
            this.f3917q.append((CharSequence) str);
            this.f3917q.append('\n');
            if (m2132o()) {
                this.f3921u.submit(this.f3922v);
            }
            return new C0043b5(this, str, g90Var.f3360c, 8, false);
        } catch (Throwable th6) {
            th = th6;
            h90Var = this;
            th = th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2132o() {
        int i = this.f3919s;
        return i >= 2000 && i >= this.f3918r.size();
    }

    /* JADX INFO: renamed from: p */
    public final void m2133p() throws IOException {
        m2126e(this.f3910j);
        Iterator it = this.f3918r.values().iterator();
        while (it.hasNext()) {
            g90 g90Var = (g90) it.next();
            f90 f90Var = g90Var.f3363f;
            int i = this.f3914n;
            int i2 = 0;
            if (f90Var == null) {
                while (i2 < i) {
                    this.f3916p += g90Var.f3359b[i2];
                    i2++;
                }
            } else {
                g90Var.f3363f = null;
                while (i2 < i) {
                    m2126e(g90Var.m1812a(i2));
                    m2126e(g90Var.m1813b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2134q() {
        File file = this.f3909i;
        gv2 gv2Var = new gv2(new FileInputStream(file), c93.f1254a);
        try {
            String strM2026b = gv2Var.m2026b();
            String strM2026b2 = gv2Var.m2026b();
            String strM2026b3 = gv2Var.m2026b();
            String strM2026b4 = gv2Var.m2026b();
            String strM2026b5 = gv2Var.m2026b();
            if (!"libcore.io.DiskLruCache".equals(strM2026b) || !"1".equals(strM2026b2) || !Integer.toString(this.f3912l).equals(strM2026b3) || !Integer.toString(this.f3914n).equals(strM2026b4) || !"".equals(strM2026b5)) {
                throw new IOException("unexpected journal header: [" + strM2026b + ", " + strM2026b2 + ", " + strM2026b4 + ", " + strM2026b5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m2135r(gv2Var.m2026b());
                    i++;
                } catch (EOFException unused) {
                    this.f3919s = i - this.f3918r.size();
                    if (gv2Var.f3715l == -1) {
                        m2136t();
                    } else {
                        this.f3917q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), c93.f1254a));
                    }
                    try {
                        gv2Var.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                gv2Var.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2135r(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            c80.m678v("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f3918r;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        g90 g90Var = (g90) linkedHashMap.get(strSubstring);
        if (g90Var == null) {
            g90Var = new g90(this, strSubstring);
            linkedHashMap.put(strSubstring, g90Var);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                g90Var.f3363f = new f90(this, g90Var);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                c80.m678v("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        g90Var.f3362e = true;
        g90Var.f3363f = null;
        if (strArrSplit.length != g90Var.f3364g.f3914n) {
            c80.m679w("unexpected journal line: ", Arrays.toString(strArrSplit));
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                g90Var.f3359b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                c80.m679w("unexpected journal line: ", Arrays.toString(strArrSplit));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m2136t() {
        try {
            BufferedWriter bufferedWriter = this.f3917q;
            if (bufferedWriter != null) {
                m2125c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3910j), c93.f1254a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f3912l));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f3914n));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (g90 g90Var : this.f3918r.values()) {
                    if (g90Var.f3363f != null) {
                        bufferedWriter2.write("DIRTY " + g90Var.f3358a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + g90Var.f3358a + g90Var.m1814c() + '\n');
                    }
                }
                m2125c(bufferedWriter2);
                if (this.f3909i.exists()) {
                    m2129u(this.f3909i, this.f3911k, true);
                }
                m2129u(this.f3910j, this.f3909i, false);
                this.f3911k.delete();
                this.f3917q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3909i, true), c93.f1254a));
            } catch (Throwable th) {
                m2125c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2137v() {
        while (this.f3916p > this.f3913m) {
            String str = (String) ((Map.Entry) this.f3918r.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f3917q == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    g90 g90Var = (g90) this.f3918r.get(str);
                    if (g90Var != null && g90Var.f3363f == null) {
                        for (int i = 0; i < this.f3914n; i++) {
                            File fileM1812a = g90Var.m1812a(i);
                            if (fileM1812a.exists() && !fileM1812a.delete()) {
                                throw new IOException("failed to delete " + fileM1812a);
                            }
                            long j = this.f3916p;
                            long[] jArr = g90Var.f3359b;
                            this.f3916p = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f3919s++;
                        this.f3917q.append((CharSequence) "REMOVE");
                        this.f3917q.append(' ');
                        this.f3917q.append((CharSequence) str);
                        this.f3917q.append('\n');
                        this.f3918r.remove(str);
                        if (m2132o()) {
                            this.f3921u.submit(this.f3922v);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
