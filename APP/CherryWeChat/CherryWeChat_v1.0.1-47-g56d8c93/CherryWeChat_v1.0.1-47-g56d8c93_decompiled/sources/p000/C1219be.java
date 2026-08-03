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

/* JADX INFO: renamed from: be */
/* JADX INFO: loaded from: classes.dex */
public final class C1219be implements Closeable {

    /* JADX INFO: renamed from: a */
    public final File f4157a;

    /* JADX INFO: renamed from: b */
    public final File f4158b;

    /* JADX INFO: renamed from: c */
    public final File f4159c;

    /* JADX INFO: renamed from: d */
    public final File f4160d;

    /* JADX INFO: renamed from: f */
    public final long f4162f;

    /* JADX INFO: renamed from: i */
    public BufferedWriter f4165i;

    /* JADX INFO: renamed from: k */
    public int f4167k;

    /* JADX INFO: renamed from: h */
    public long f4164h = 0;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f4166j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: l */
    public long f4168l = 0;

    /* JADX INFO: renamed from: m */
    public final ThreadPoolExecutor f4169m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1051Yd());

    /* JADX INFO: renamed from: n */
    public final CallableC1008Xd f4170n = new CallableC1008Xd(this);

    /* JADX INFO: renamed from: e */
    public final int f4161e = 1;

    /* JADX INFO: renamed from: g */
    public final int f4163g = 1;

    public C1219be(File file, long j) {
        this.f4157a = file;
        this.f4158b = new File(file, "journal");
        this.f4159c = new File(file, "journal.tmp");
        this.f4160d = new File(file, "journal.bkp");
        this.f4162f = j;
    }

    /* JADX INFO: renamed from: d */
    public static void m2334d(C1219be c1219be, C1094Zd c1094Zd, boolean z) {
        synchronized (c1219be) {
            C1139ae c1139ae = (C1139ae) c1094Zd.f3478b;
            if (c1139ae.f3604f != c1094Zd) {
                throw new IllegalStateException();
            }
            if (z && !c1139ae.f3603e) {
                for (int i = 0; i < c1219be.f4163g; i++) {
                    if (!((boolean[]) c1094Zd.f3479c)[i]) {
                        c1094Zd.m2020a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c1139ae.f3602d[i].exists()) {
                        c1094Zd.m2020a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c1219be.f4163g; i2++) {
                File file = c1139ae.f3602d[i2];
                if (!z) {
                    m2336i(file);
                } else if (file.exists()) {
                    File file2 = c1139ae.f3601c[i2];
                    file.renameTo(file2);
                    long j = c1139ae.f3600b[i2];
                    long length = file2.length();
                    c1139ae.f3600b[i2] = length;
                    c1219be.f4164h = (c1219be.f4164h - j) + length;
                }
            }
            c1219be.f4167k++;
            c1139ae.f3604f = null;
            if (c1139ae.f3603e || z) {
                c1139ae.f3603e = true;
                c1219be.f4165i.append((CharSequence) "CLEAN");
                c1219be.f4165i.append(' ');
                c1219be.f4165i.append((CharSequence) c1139ae.f3599a);
                c1219be.f4165i.append((CharSequence) c1139ae.m2054a());
                c1219be.f4165i.append('\n');
                if (z) {
                    c1219be.f4168l++;
                }
            } else {
                c1219be.f4166j.remove(c1139ae.f3599a);
                c1219be.f4165i.append((CharSequence) "REMOVE");
                c1219be.f4165i.append(' ');
                c1219be.f4165i.append((CharSequence) c1139ae.f3599a);
                c1219be.f4165i.append('\n');
            }
            m2337m(c1219be.f4165i);
            if (c1219be.f4164h > c1219be.f4162f || c1219be.m2342p()) {
                c1219be.f4169m.submit(c1219be.f4170n);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2335f(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2336i(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m2337m(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: q */
    public static C1219be m2338q(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m2339v(file2, file3, false);
            }
        }
        C1219be c1219be = new C1219be(file, j);
        if (c1219be.f4158b.exists()) {
            try {
                c1219be.m2344s();
                c1219be.m2343r();
                return c1219be;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c1219be.close();
                AbstractC2794zD.m5361a(c1219be.f4157a);
            }
        }
        file.mkdirs();
        C1219be c1219be2 = new C1219be(file, j);
        c1219be2.m2346u();
        return c1219be2;
    }

    /* JADX INFO: renamed from: v */
    public static void m2339v(File file, File file2, boolean z) throws IOException {
        if (z) {
            m2336i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f4165i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f4166j.values()).iterator();
            while (it.hasNext()) {
                C1094Zd c1094Zd = ((C1139ae) it.next()).f3604f;
                if (c1094Zd != null) {
                    c1094Zd.m2020a();
                }
            }
            m2347w();
            m2335f(this.f4165i);
            this.f4165i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final C1094Zd m2340l(String str) {
        synchronized (this) {
            try {
                if (this.f4165i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C1139ae c1139ae = (C1139ae) this.f4166j.get(str);
                if (c1139ae == null) {
                    c1139ae = new C1139ae(this, str);
                    this.f4166j.put(str, c1139ae);
                } else if (c1139ae.f3604f != null) {
                    return null;
                }
                C1094Zd c1094Zd = new C1094Zd(this, c1139ae);
                c1139ae.f3604f = c1094Zd;
                this.f4165i.append((CharSequence) "DIRTY");
                this.f4165i.append(' ');
                this.f4165i.append((CharSequence) str);
                this.f4165i.append('\n');
                m2337m(this.f4165i);
                return c1094Zd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized C0132D2 m2341o(String str) {
        if (this.f4165i == null) {
            throw new IllegalStateException("cache is closed");
        }
        C1139ae c1139ae = (C1139ae) this.f4166j.get(str);
        if (c1139ae == null) {
            return null;
        }
        if (!c1139ae.f3603e) {
            return null;
        }
        for (File file : c1139ae.f3601c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f4167k++;
        this.f4165i.append((CharSequence) "READ");
        this.f4165i.append(' ');
        this.f4165i.append((CharSequence) str);
        this.f4165i.append('\n');
        if (m2342p()) {
            this.f4169m.submit(this.f4170n);
        }
        return new C0132D2(18, c1139ae.f3601c);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2342p() {
        int i = this.f4167k;
        return i >= 2000 && i >= this.f4166j.size();
    }

    /* JADX INFO: renamed from: r */
    public final void m2343r() throws IOException {
        m2336i(this.f4159c);
        Iterator it = this.f4166j.values().iterator();
        while (it.hasNext()) {
            C1139ae c1139ae = (C1139ae) it.next();
            C1094Zd c1094Zd = c1139ae.f3604f;
            int i = this.f4163g;
            int i2 = 0;
            if (c1094Zd == null) {
                while (i2 < i) {
                    this.f4164h += c1139ae.f3600b[i2];
                    i2++;
                }
            } else {
                c1139ae.f3604f = null;
                while (i2 < i) {
                    m2336i(c1139ae.f3601c[i2]);
                    m2336i(c1139ae.f3602d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2344s() {
        File file = this.f4158b;
        C2298nz c2298nz = new C2298nz(new FileInputStream(file), AbstractC2794zD.f9462a);
        try {
            String strM4673d = c2298nz.m4673d();
            String strM4673d2 = c2298nz.m4673d();
            String strM4673d3 = c2298nz.m4673d();
            String strM4673d4 = c2298nz.m4673d();
            String strM4673d5 = c2298nz.m4673d();
            if (!"libcore.io.DiskLruCache".equals(strM4673d) || !"1".equals(strM4673d2) || !Integer.toString(this.f4161e).equals(strM4673d3) || !Integer.toString(this.f4163g).equals(strM4673d4) || !"".equals(strM4673d5)) {
                throw new IOException("unexpected journal header: [" + strM4673d + ", " + strM4673d2 + ", " + strM4673d4 + ", " + strM4673d5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m2345t(c2298nz.m4673d());
                    i++;
                } catch (EOFException unused) {
                    this.f4167k = i - this.f4166j.size();
                    if (c2298nz.f8059e == -1) {
                        m2346u();
                    } else {
                        this.f4165i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC2794zD.f9462a));
                    }
                    try {
                        c2298nz.close();
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
                c2298nz.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2345t(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f4166j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C1139ae c1139ae = (C1139ae) linkedHashMap.get(strSubstring);
        if (c1139ae == null) {
            c1139ae = new C1139ae(this, strSubstring);
            linkedHashMap.put(strSubstring, c1139ae);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c1139ae.f3604f = new C1094Zd(this, c1139ae);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c1139ae.f3603e = true;
        c1139ae.f3604f = null;
        if (strArrSplit.length != c1139ae.f3605g.f4163g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c1139ae.f3600b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m2346u() {
        try {
            BufferedWriter bufferedWriter = this.f4165i;
            if (bufferedWriter != null) {
                m2335f(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4159c), AbstractC2794zD.f9462a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f4161e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f4163g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C1139ae c1139ae : this.f4166j.values()) {
                    if (c1139ae.f3604f != null) {
                        bufferedWriter2.write("DIRTY " + c1139ae.f3599a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c1139ae.f3599a + c1139ae.m2054a() + '\n');
                    }
                }
                m2335f(bufferedWriter2);
                if (this.f4158b.exists()) {
                    m2339v(this.f4158b, this.f4160d, true);
                }
                m2339v(this.f4159c, this.f4158b, false);
                this.f4160d.delete();
                this.f4165i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4158b, true), AbstractC2794zD.f9462a));
            } catch (Throwable th) {
                m2335f(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2347w() {
        while (this.f4164h > this.f4162f) {
            String str = (String) ((Map.Entry) this.f4166j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f4165i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C1139ae c1139ae = (C1139ae) this.f4166j.get(str);
                    if (c1139ae != null && c1139ae.f3604f == null) {
                        for (int i = 0; i < this.f4163g; i++) {
                            File file = c1139ae.f3601c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f4164h;
                            long[] jArr = c1139ae.f3600b;
                            this.f4164h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f4167k++;
                        this.f4165i.append((CharSequence) "REMOVE");
                        this.f4165i.append(' ');
                        this.f4165i.append((CharSequence) str);
                        this.f4165i.append('\n');
                        this.f4166j.remove(str);
                        if (m2342p()) {
                            this.f4169m.submit(this.f4170n);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
