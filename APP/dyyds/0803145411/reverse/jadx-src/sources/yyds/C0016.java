package yyds;

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

/* JADX INFO: renamed from: yyds.ᛳᛴ */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0016 implements Closeable {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f2679;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final File f2683;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public BufferedWriter f2688;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final File f2690;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final File f2692;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final File f2693;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public long f2687 = 0;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final LinkedHashMap f2681 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public long f2684 = 0;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final ThreadPoolExecutor f2691 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2074());

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final CallableC0122 f2685 = new CallableC0122(0, this);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f2686 = 1;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f2682 = 1;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final long f2680 = 262144000;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean f2689 = true;

    public C0016(File file) {
        this.f2690 = file;
        this.f2693 = new File(file, "journal");
        this.f2683 = new File(file, "journal.tmp");
        this.f2692 = new File(file, "journal.bkp");
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m1418(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static C0016 m1419(File file) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m1421(file2, file3, false);
            }
        }
        C0016 c0016 = new C0016(file);
        if (c0016.f2693.exists()) {
            try {
                c0016.m1427();
                c0016.m1425();
                return c0016;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c0016.close();
                AbstractC2176.m4146(c0016.f2690);
            }
        }
        file.mkdirs();
        C0016 c00162 = new C0016(file);
        c00162.m1426();
        return c00162;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m1420(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static void m1421(File file, File file2, boolean z) throws IOException {
        if (z) {
            m1420(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static void m1422(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f2688 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f2681.values()).iterator();
            while (it.hasNext()) {
                C2115 c2115 = ((C0725) it.next()).f3391;
                if (c2115 != null) {
                    c2115.m4034();
                }
            }
            m1431();
            m1418(this.f2688);
            this.f2688 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final boolean m1423() {
        int i = this.f2679;
        return i >= 2000 && i >= this.f2681.size();
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final synchronized C0644 m1424(String str) {
        C0016 c0016;
        Throwable th;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            c0016 = this;
        }
        if (this.f2688 == null) {
            c0016 = this;
            try {
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
        try {
            C0725 c0725 = (C0725) this.f2681.get(str);
            if (c0725 == null) {
                return null;
            }
            if (!c0725.f3386) {
                return null;
            }
            for (int i = 0; i < this.f2682; i++) {
                try {
                    if (!c0725.m1666(i).exists()) {
                        return null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c0016 = this;
                }
            }
            this.f2679++;
            this.f2688.append((CharSequence) "READ");
            this.f2688.append(' ');
            this.f2688.append((CharSequence) str);
            this.f2688.append('\n');
            if (m1423()) {
                this.f2691.submit(this.f2685);
            }
            return new C0644(this, str, c0725.f3390, 11, false);
        } catch (Throwable th6) {
            th = th6;
            c0016 = this;
            th = th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void m1425() throws IOException {
        m1420(this.f2683);
        Iterator it = this.f2681.values().iterator();
        while (it.hasNext()) {
            C0725 c0725 = (C0725) it.next();
            C2115 c2115 = c0725.f3391;
            int i = this.f2682;
            int i2 = 0;
            if (c2115 == null) {
                while (i2 < i) {
                    this.f2687 += c0725.f3388[i2];
                    i2++;
                }
            } else {
                c0725.f3391 = null;
                while (i2 < i) {
                    m1420(c0725.m1666(i2));
                    m1420(c0725.m1667(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final synchronized void m1426() {
        try {
            BufferedWriter bufferedWriter = this.f2688;
            if (bufferedWriter != null) {
                m1418(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2683), AbstractC2176.f10662));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f2686));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f2682));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C0725 c0725 : this.f2681.values()) {
                    if (c0725.f3391 != null) {
                        bufferedWriter2.write("DIRTY " + c0725.f3387 + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c0725.f3387 + c0725.m1668() + '\n');
                    }
                }
                m1418(bufferedWriter2);
                if (this.f2693.exists()) {
                    m1421(this.f2693, this.f2692, true);
                }
                m1421(this.f2683, this.f2693, false);
                this.f2692.delete();
                this.f2688 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2693, true), AbstractC2176.f10662));
            } catch (Throwable th) {
                m1418(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final void m1427() {
        File file = this.f2693;
        C1104 c1104 = new C1104(new FileInputStream(file), AbstractC2176.f10662);
        try {
            String strM2307 = c1104.m2307();
            String strM23072 = c1104.m2307();
            String strM23073 = c1104.m2307();
            String strM23074 = c1104.m2307();
            String strM23075 = c1104.m2307();
            if (!"libcore.io.DiskLruCache".equals(strM2307) || !"1".equals(strM23072) || !Integer.toString(this.f2686).equals(strM23073) || !Integer.toString(this.f2682).equals(strM23074) || !"".equals(strM23075)) {
                throw new IOException("unexpected journal header: [" + strM2307 + ", " + strM23072 + ", " + strM23074 + ", " + strM23075 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m1429(c1104.m2307());
                    i++;
                } catch (EOFException unused) {
                    this.f2679 = i - this.f2681.size();
                    if (c1104.f5079 == -1) {
                        m1426();
                    } else {
                        this.f2688 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC2176.f10662));
                    }
                    try {
                        c1104.close();
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
                c1104.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2115 m1428(String str) {
        synchronized (this) {
            try {
                if (this.f2688 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C0725 c0725 = (C0725) this.f2681.get(str);
                if (c0725 == null) {
                    c0725 = new C0725(this, str);
                    this.f2681.put(str, c0725);
                } else if (c0725.f3391 != null) {
                    return null;
                }
                C2115 c2115 = new C2115(this, c0725);
                c0725.f3391 = c2115;
                this.f2688.append((CharSequence) "DIRTY");
                this.f2688.append(' ');
                this.f2688.append((CharSequence) str);
                this.f2688.append('\n');
                m1422(this.f2688);
                return c2115;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final void m1429(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            C0188.m804("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f2681;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C0725 c0725 = (C0725) linkedHashMap.get(strSubstring);
        if (c0725 == null) {
            c0725 = new C0725(this, strSubstring);
            linkedHashMap.put(strSubstring, c0725);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c0725.f3391 = new C2115(this, c0725);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                C0188.m804("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c0725.f3386 = true;
        c0725.f3391 = null;
        if (strArrSplit.length != c0725.f3389.f2682) {
            C0188.m797(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c0725.f3388[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                C0188.m797(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final synchronized void m1430(C2115 c2115, boolean z) {
        C0725 c0725 = (C0725) c2115.f10455;
        if (c0725.f3391 != c2115) {
            throw new IllegalStateException();
        }
        if (z && !c0725.f3386) {
            for (int i = 0; i < this.f2682; i++) {
                if (!((boolean[]) c2115.f10456)[i]) {
                    c2115.m4034();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!c0725.m1667(i).exists()) {
                    c2115.m4034();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f2682; i2++) {
            File fileM1667 = c0725.m1667(i2);
            if (!z) {
                m1420(fileM1667);
            } else if (fileM1667.exists()) {
                File fileM1666 = c0725.m1666(i2);
                fileM1667.renameTo(fileM1666);
                long j = c0725.f3388[i2];
                long length = fileM1666.length();
                c0725.f3388[i2] = length;
                this.f2687 = (this.f2687 - j) + length;
            }
        }
        this.f2679++;
        c0725.f3391 = null;
        if (c0725.f3386 || z) {
            c0725.f3386 = true;
            this.f2688.append((CharSequence) "CLEAN");
            this.f2688.append(' ');
            this.f2688.append((CharSequence) c0725.f3387);
            this.f2688.append((CharSequence) c0725.m1668());
            this.f2688.append('\n');
            if (z) {
                this.f2684++;
            }
        } else {
            this.f2681.remove(c0725.f3387);
            this.f2688.append((CharSequence) "REMOVE");
            this.f2688.append(' ');
            this.f2688.append((CharSequence) c0725.f3387);
            this.f2688.append('\n');
        }
        m1422(this.f2688);
        if (this.f2687 > this.f2680 || m1423()) {
            this.f2691.submit(this.f2685);
        }
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final void m1431() {
        while (this.f2687 > this.f2680) {
            String str = (String) ((Map.Entry) this.f2681.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f2688 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C0725 c0725 = (C0725) this.f2681.get(str);
                    if (c0725 != null && c0725.f3391 == null) {
                        for (int i = 0; i < this.f2682; i++) {
                            File fileM1666 = c0725.m1666(i);
                            if (fileM1666.exists() && !fileM1666.delete()) {
                                throw new IOException("failed to delete " + fileM1666);
                            }
                            long j = this.f2687;
                            long[] jArr = c0725.f3388;
                            this.f2687 = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f2679++;
                        this.f2688.append((CharSequence) "REMOVE");
                        this.f2688.append(' ');
                        this.f2688.append((CharSequence) str);
                        this.f2688.append('\n');
                        this.f2681.remove(str);
                        if (m1423()) {
                            this.f2691.submit(this.f2685);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
