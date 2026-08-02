package defpackage;

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
    public final File h;
    public final File i;
    public final File j;
    public final File k;
    public final long m;
    public final boolean o;
    public BufferedWriter q;
    public int s;
    public long p = 0;
    public final LinkedHashMap r = new LinkedHashMap(0, 0.75f, true);
    public long t = 0;
    public final ThreadPoolExecutor u = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e90());
    public final d90 v = new d90(this);
    public final int l = 1;
    public final int n = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h90(File file, long j, boolean z) {
        this.h = file;
        this.i = new File(file, "journal");
        this.j = new File(file, "journal.tmp");
        this.k = new File(file, "journal.bkp");
        this.m = j;
        this.o = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(h90 h90Var, f90 f90Var, boolean z) {
        synchronized (h90Var) {
            g90 g90Var = (g90) f90Var.b;
            if (g90Var.f != f90Var) {
                throw new IllegalStateException();
            }
            if (z && !g90Var.e) {
                for (int i = 0; i < h90Var.n; i++) {
                    if (!((boolean[]) f90Var.c)[i]) {
                        f90Var.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!g90Var.b(i).exists()) {
                        f90Var.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < h90Var.n; i2++) {
                File fileB = g90Var.b(i2);
                if (!z) {
                    e(fileB);
                } else if (fileB.exists()) {
                    File fileA = g90Var.a(i2);
                    fileB.renameTo(fileA);
                    long j = g90Var.b[i2];
                    long length = fileA.length();
                    g90Var.b[i2] = length;
                    h90Var.p = (h90Var.p - j) + length;
                }
            }
            h90Var.s++;
            g90Var.f = null;
            if (g90Var.e || z) {
                g90Var.e = true;
                h90Var.q.append((CharSequence) "CLEAN");
                h90Var.q.append(' ');
                h90Var.q.append((CharSequence) g90Var.a);
                h90Var.q.append((CharSequence) g90Var.c());
                h90Var.q.append('\n');
                if (z) {
                    h90Var.t++;
                }
            } else {
                h90Var.r.remove(g90Var.a);
                h90Var.q.append((CharSequence) "REMOVE");
                h90Var.q.append(' ');
                h90Var.q.append((CharSequence) g90Var.a);
                h90Var.q.append('\n');
            }
            j(h90Var.q);
            if (h90Var.p > h90Var.m || h90Var.o()) {
                h90Var.u.submit(h90Var.v);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h90 h(File file, long j, boolean z) throws IOException {
        if (j <= 0) {
            s.j("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                u(file2, file3, false);
            }
        }
        h90 h90Var = new h90(file, j, z);
        if (h90Var.i.exists()) {
            try {
                h90Var.q();
                h90Var.p();
                return h90Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                h90Var.close();
                c93.a(h90Var.h);
            }
        }
        file.mkdirs();
        h90 h90Var2 = new h90(file, j, z);
        h90Var2.t();
        return h90Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(File file, File file2, boolean z) throws IOException {
        if (z) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.q == null) {
                return;
            }
            Iterator it = new ArrayList(this.r.values()).iterator();
            while (it.hasNext()) {
                f90 f90Var = ((g90) it.next()).f;
                if (f90Var != null) {
                    f90Var.a();
                }
            }
            v();
            c(this.q);
            this.q = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f90 g(String str) {
        synchronized (this) {
            try {
                if (this.q == null) {
                    throw new IllegalStateException("cache is closed");
                }
                g90 g90Var = (g90) this.r.get(str);
                if (g90Var == null) {
                    g90Var = new g90(this, str);
                    this.r.put(str, g90Var);
                } else if (g90Var.f != null) {
                    return null;
                }
                f90 f90Var = new f90(this, g90Var);
                g90Var.f = f90Var;
                this.q.append((CharSequence) "DIRTY");
                this.q.append(' ');
                this.q.append((CharSequence) str);
                this.q.append('\n');
                j(this.q);
                return f90Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized b5 k(String str) throws Throwable {
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
        if (this.q == null) {
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
            g90 g90Var = (g90) this.r.get(str);
            if (g90Var == null) {
                return null;
            }
            if (!g90Var.e) {
                return null;
            }
            for (int i = 0; i < this.n; i++) {
                try {
                    if (!g90Var.a(i).exists()) {
                        return null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    h90Var = this;
                }
            }
            this.s++;
            this.q.append((CharSequence) "READ");
            this.q.append(' ');
            this.q.append((CharSequence) str);
            this.q.append('\n');
            if (o()) {
                this.u.submit(this.v);
            }
            return new b5(this, str, g90Var.c, 8, false);
        } catch (Throwable th6) {
            th = th6;
            h90Var = this;
            th = th;
        }
        throw th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o() {
        int i = this.s;
        return i >= 2000 && i >= this.r.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() throws IOException {
        e(this.j);
        Iterator it = this.r.values().iterator();
        while (it.hasNext()) {
            g90 g90Var = (g90) it.next();
            f90 f90Var = g90Var.f;
            int i = this.n;
            int i2 = 0;
            if (f90Var == null) {
                while (i2 < i) {
                    this.p += g90Var.b[i2];
                    i2++;
                }
            } else {
                g90Var.f = null;
                while (i2 < i) {
                    e(g90Var.a(i2));
                    e(g90Var.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void q() {
        File file = this.i;
        gv2 gv2Var = new gv2(new FileInputStream(file), c93.a);
        try {
            String strB = gv2Var.b();
            String strB2 = gv2Var.b();
            String strB3 = gv2Var.b();
            String strB4 = gv2Var.b();
            String strB5 = gv2Var.b();
            if (!"libcore.io.DiskLruCache".equals(strB) || !"1".equals(strB2) || !Integer.toString(this.l).equals(strB3) || !Integer.toString(this.n).equals(strB4) || !"".equals(strB5)) {
                throw new IOException("unexpected journal header: [" + strB + ", " + strB2 + ", " + strB4 + ", " + strB5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    r(gv2Var.b());
                    i++;
                } catch (EOFException unused) {
                    this.s = i - this.r.size();
                    if (gv2Var.l == -1) {
                        t();
                    } else {
                        this.q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), c93.a));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            c80.v("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.r;
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
                g90Var.f = new f90(this, g90Var);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                c80.v("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        g90Var.e = true;
        g90Var.f = null;
        if (strArrSplit.length != g90Var.g.n) {
            c80.w("unexpected journal line: ", Arrays.toString(strArrSplit));
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                g90Var.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                c80.w("unexpected journal line: ", Arrays.toString(strArrSplit));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void t() {
        try {
            BufferedWriter bufferedWriter = this.q;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.j), c93.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.l));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.n));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (g90 g90Var : this.r.values()) {
                    if (g90Var.f != null) {
                        bufferedWriter2.write("DIRTY " + g90Var.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + g90Var.a + g90Var.c() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.i.exists()) {
                    u(this.i, this.k, true);
                }
                u(this.j, this.i, false);
                this.k.delete();
                this.q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.i, true), c93.a));
            } catch (Throwable th) {
                c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        while (this.p > this.m) {
            String str = (String) ((Map.Entry) this.r.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.q == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    g90 g90Var = (g90) this.r.get(str);
                    if (g90Var != null && g90Var.f == null) {
                        for (int i = 0; i < this.n; i++) {
                            File fileA = g90Var.a(i);
                            if (fileA.exists() && !fileA.delete()) {
                                throw new IOException("failed to delete " + fileA);
                            }
                            long j = this.p;
                            long[] jArr = g90Var.b;
                            this.p = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.s++;
                        this.q.append((CharSequence) "REMOVE");
                        this.q.append(' ');
                        this.q.append((CharSequence) str);
                        this.q.append('\n');
                        this.r.remove(str);
                        if (o()) {
                            this.u.submit(this.v);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
