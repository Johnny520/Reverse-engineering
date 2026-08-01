package p068N1;

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
import p000A.C0066i0;

/* JADX INFO: renamed from: N1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1015e implements Closeable {

    /* JADX INFO: renamed from: d */
    public final File f3139d;

    /* JADX INFO: renamed from: e */
    public final File f3140e;

    /* JADX INFO: renamed from: f */
    public final File f3141f;

    /* JADX INFO: renamed from: g */
    public final File f3142g;

    /* JADX INFO: renamed from: i */
    public final long f3144i;

    /* JADX INFO: renamed from: l */
    public BufferedWriter f3147l;

    /* JADX INFO: renamed from: n */
    public int f3149n;

    /* JADX INFO: renamed from: k */
    public long f3146k = 0;

    /* JADX INFO: renamed from: m */
    public final LinkedHashMap f3148m = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: o */
    public long f3150o = 0;

    /* JADX INFO: renamed from: p */
    public final ThreadPoolExecutor f3151p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1012b());

    /* JADX INFO: renamed from: q */
    public final CallableC1011a f3152q = new CallableC1011a(this);

    /* JADX INFO: renamed from: h */
    public final int f3143h = 1;

    /* JADX INFO: renamed from: j */
    public final int f3145j = 1;

    public C1015e(File file, long j5) {
        this.f3139d = file;
        this.f3140e = new File(file, "journal");
        this.f3141f = new File(file, "journal.tmp");
        this.f3142g = new File(file, "journal.bkp");
        this.f3144i = j5;
    }

    /* JADX INFO: renamed from: b */
    public static void m2088b(C1015e c1015e, C1013c c1013c, boolean z5) {
        synchronized (c1015e) {
            C1014d c1014d = (C1014d) c1013c.f3129b;
            if (c1014d.f3137f != c1013c) {
                throw new IllegalStateException();
            }
            if (z5 && !c1014d.f3136e) {
                for (int i5 = 0; i5 < c1015e.f3145j; i5++) {
                    if (!((boolean[]) c1013c.f3130c)[i5]) {
                        c1013c.m2080a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i5);
                    }
                    if (!c1014d.f3135d[i5].exists()) {
                        c1013c.m2080a();
                        return;
                    }
                }
            }
            for (int i6 = 0; i6 < c1015e.f3145j; i6++) {
                File file = c1014d.f3135d[i6];
                if (!z5) {
                    m2090d(file);
                } else if (file.exists()) {
                    File file2 = c1014d.f3134c[i6];
                    file.renameTo(file2);
                    long j5 = c1014d.f3133b[i6];
                    long length = file2.length();
                    c1014d.f3133b[i6] = length;
                    c1015e.f3146k = (c1015e.f3146k - j5) + length;
                }
            }
            c1015e.f3149n++;
            c1014d.f3137f = null;
            if (c1014d.f3136e || z5) {
                c1014d.f3136e = true;
                c1015e.f3147l.append((CharSequence) "CLEAN");
                c1015e.f3147l.append(' ');
                c1015e.f3147l.append((CharSequence) c1014d.f3132a);
                c1015e.f3147l.append((CharSequence) c1014d.m2087a());
                c1015e.f3147l.append('\n');
                if (z5) {
                    c1015e.f3150o++;
                }
            } else {
                c1015e.f3148m.remove(c1014d.f3132a);
                c1015e.f3147l.append((CharSequence) "REMOVE");
                c1015e.f3147l.append(' ');
                c1015e.f3147l.append((CharSequence) c1014d.f3132a);
                c1015e.f3147l.append('\n');
            }
            m2091h(c1015e.f3147l);
            if (c1015e.f3146k > c1015e.f3144i || c1015e.m2097l()) {
                c1015e.f3151p.submit(c1015e.f3152q);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2089c(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2090d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2091h(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: m */
    public static C1015e m2092m(File file, long j5) throws IOException {
        if (j5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m2093x(file2, file3, false);
            }
        }
        C1015e c1015e = new C1015e(file, j5);
        if (c1015e.f3140e.exists()) {
            try {
                c1015e.m2099r();
                c1015e.m2098n();
                return c1015e;
            } catch (IOException e5) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                c1015e.close();
                AbstractC1018h.m2103a(c1015e.f3139d);
            }
        }
        file.mkdirs();
        C1015e c1015e2 = new C1015e(file, j5);
        c1015e2.m2101w();
        return c1015e2;
    }

    /* JADX INFO: renamed from: x */
    public static void m2093x(File file, File file2, boolean z5) throws IOException {
        if (z5) {
            m2090d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m2094A() {
        while (this.f3146k > this.f3144i) {
            String str = (String) ((Map.Entry) this.f3148m.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f3147l == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C1014d c1014d = (C1014d) this.f3148m.get(str);
                    if (c1014d != null && c1014d.f3137f == null) {
                        for (int i5 = 0; i5 < this.f3145j; i5++) {
                            File file = c1014d.f3134c[i5];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j5 = this.f3146k;
                            long[] jArr = c1014d.f3133b;
                            this.f3146k = j5 - jArr[i5];
                            jArr[i5] = 0;
                        }
                        this.f3149n++;
                        this.f3147l.append((CharSequence) "REMOVE");
                        this.f3147l.append(' ');
                        this.f3147l.append((CharSequence) str);
                        this.f3147l.append('\n');
                        this.f3148m.remove(str);
                        if (m2097l()) {
                            this.f3151p.submit(this.f3152q);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f3147l == null) {
                return;
            }
            Iterator it = new ArrayList(this.f3148m.values()).iterator();
            while (it.hasNext()) {
                C1013c c1013c = ((C1014d) it.next()).f3137f;
                if (c1013c != null) {
                    c1013c.m2080a();
                }
            }
            m2094A();
            m2089c(this.f3147l);
            this.f3147l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final C1013c m2095f(String str) {
        synchronized (this) {
            try {
                if (this.f3147l == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C1014d c1014d = (C1014d) this.f3148m.get(str);
                if (c1014d == null) {
                    c1014d = new C1014d(this, str);
                    this.f3148m.put(str, c1014d);
                } else if (c1014d.f3137f != null) {
                    return null;
                }
                C1013c c1013c = new C1013c(this, c1014d);
                c1014d.f3137f = c1013c;
                this.f3147l.append((CharSequence) "DIRTY");
                this.f3147l.append(' ');
                this.f3147l.append((CharSequence) str);
                this.f3147l.append('\n');
                m2091h(this.f3147l);
                return c1013c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized C0066i0 m2096j(String str) {
        if (this.f3147l == null) {
            throw new IllegalStateException("cache is closed");
        }
        C1014d c1014d = (C1014d) this.f3148m.get(str);
        if (c1014d == null) {
            return null;
        }
        if (!c1014d.f3136e) {
            return null;
        }
        for (File file : c1014d.f3134c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f3149n++;
        this.f3147l.append((CharSequence) "READ");
        this.f3147l.append(' ');
        this.f3147l.append((CharSequence) str);
        this.f3147l.append('\n');
        if (m2097l()) {
            this.f3151p.submit(this.f3152q);
        }
        return new C0066i0(11, c1014d.f3134c);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2097l() {
        int i5 = this.f3149n;
        return i5 >= 2000 && i5 >= this.f3148m.size();
    }

    /* JADX INFO: renamed from: n */
    public final void m2098n() throws IOException {
        m2090d(this.f3141f);
        Iterator it = this.f3148m.values().iterator();
        while (it.hasNext()) {
            C1014d c1014d = (C1014d) it.next();
            C1013c c1013c = c1014d.f3137f;
            int i5 = this.f3145j;
            int i6 = 0;
            if (c1013c == null) {
                while (i6 < i5) {
                    this.f3146k += c1014d.f3133b[i6];
                    i6++;
                }
            } else {
                c1014d.f3137f = null;
                while (i6 < i5) {
                    m2090d(c1014d.f3134c[i6]);
                    m2090d(c1014d.f3135d[i6]);
                    i6++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2099r() {
        File file = this.f3140e;
        C1017g c1017g = new C1017g(new FileInputStream(file), AbstractC1018h.f3159a);
        try {
            String strM2102b = c1017g.m2102b();
            String strM2102b2 = c1017g.m2102b();
            String strM2102b3 = c1017g.m2102b();
            String strM2102b4 = c1017g.m2102b();
            String strM2102b5 = c1017g.m2102b();
            if (!"libcore.io.DiskLruCache".equals(strM2102b) || !"1".equals(strM2102b2) || !Integer.toString(this.f3143h).equals(strM2102b3) || !Integer.toString(this.f3145j).equals(strM2102b4) || !"".equals(strM2102b5)) {
                throw new IOException("unexpected journal header: [" + strM2102b + ", " + strM2102b2 + ", " + strM2102b4 + ", " + strM2102b5 + "]");
            }
            int i5 = 0;
            while (true) {
                try {
                    m2100t(c1017g.m2102b());
                    i5++;
                } catch (EOFException unused) {
                    this.f3149n = i5 - this.f3148m.size();
                    if (c1017g.f3158h == -1) {
                        m2101w();
                    } else {
                        this.f3147l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC1018h.f3159a));
                    }
                    try {
                        c1017g.close();
                        return;
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c1017g.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2100t(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i5 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i5);
        LinkedHashMap linkedHashMap = this.f3148m;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i5);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i5, iIndexOf2);
        }
        C1014d c1014d = (C1014d) linkedHashMap.get(strSubstring);
        if (c1014d == null) {
            c1014d = new C1014d(this, strSubstring);
            linkedHashMap.put(strSubstring, c1014d);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c1014d.f3137f = new C1013c(this, c1014d);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c1014d.f3136e = true;
        c1014d.f3137f = null;
        if (strArrSplit.length != c1014d.f3138g.f3145j) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            try {
                c1014d.f3133b[i6] = Long.parseLong(strArrSplit[i6]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m2101w() {
        try {
            BufferedWriter bufferedWriter = this.f3147l;
            if (bufferedWriter != null) {
                m2089c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3141f), AbstractC1018h.f3159a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f3143h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f3145j));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C1014d c1014d : this.f3148m.values()) {
                    if (c1014d.f3137f != null) {
                        bufferedWriter2.write("DIRTY " + c1014d.f3132a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c1014d.f3132a + c1014d.m2087a() + '\n');
                    }
                }
                m2089c(bufferedWriter2);
                if (this.f3140e.exists()) {
                    m2093x(this.f3140e, this.f3142g, true);
                }
                m2093x(this.f3141f, this.f3140e, false);
                this.f3142g.delete();
                this.f3147l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3140e, true), AbstractC1018h.f3159a));
            } catch (Throwable th) {
                m2089c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
