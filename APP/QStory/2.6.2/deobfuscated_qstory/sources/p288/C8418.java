package p288;

import android.os.StrictMode;
import androidx.compose.foundation.lazy.layout.C0734;
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
import p022.C6267;
import p043.CallableC6451;
import p230.C8048;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8418 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f23301;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final File f23304;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public BufferedWriter f23306;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f23307;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final File f23309;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final File f23310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final File f23311;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f23305 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f23302 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public long f23300 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final ThreadPoolExecutor f23299 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8420());

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final CallableC6451 f23298 = new CallableC6451(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f23303 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f23308 = 1;

    public C8418(long j, File file) {
        this.f23311 = file;
        this.f23309 = new File(file, "journal");
        this.f23310 = new File(file, "journal.tmp");
        this.f23304 = new File(file, "journal.bkp");
        this.f23307 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m13958(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m13959(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13960(C8418 c8418, C0734 c0734, boolean z) {
        synchronized (c8418) {
            C8419 c8419 = (C8419) c0734.f2070;
            if (c8419.f23312 != c0734) {
                throw new IllegalStateException();
            }
            if (z && !c8419.f23313) {
                for (int i = 0; i < c8418.f23308; i++) {
                    if (!((boolean[]) c0734.f2069)[i]) {
                        c0734.m1531();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c8419.f23314[i].exists()) {
                        c0734.m1531();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c8418.f23308; i2++) {
                File file = c8419.f23314[i2];
                if (!z) {
                    m13958(file);
                } else if (file.exists()) {
                    File file2 = c8419.f23315[i2];
                    file.renameTo(file2);
                    long j = c8419.f23316[i2];
                    long length = file2.length();
                    c8419.f23316[i2] = length;
                    c8418.f23305 = (c8418.f23305 - j) + length;
                }
            }
            c8418.f23301++;
            c8419.f23312 = null;
            if (c8419.f23313 || z) {
                c8419.f23313 = true;
                c8418.f23306.append((CharSequence) "CLEAN");
                c8418.f23306.append(' ');
                c8418.f23306.append((CharSequence) c8419.f23317);
                c8418.f23306.append((CharSequence) c8419.m13972());
                c8418.f23306.append('\n');
                if (z) {
                    c8418.f23300++;
                }
            } else {
                c8418.f23302.remove(c8419.f23317);
                c8418.f23306.append((CharSequence) "REMOVE");
                c8418.f23306.append(' ');
                c8418.f23306.append((CharSequence) c8419.f23317);
                c8418.f23306.append('\n');
            }
            m13962(c8418.f23306);
            if (c8418.f23305 > c8418.f23307 || c8418.m13970()) {
                c8418.f23299.submit(c8418.f23298);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m13961(File file, File file2, boolean z) throws IOException {
        if (z) {
            m13958(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m13962(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C8418 m13963(long j, File file) throws IOException {
        if (j <= 0) {
            C5919.m11249("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m13961(file2, file3, false);
            }
        }
        C8418 c8418 = new C8418(j, file);
        if (c8418.f23309.exists()) {
            try {
                c8418.m13968();
                c8418.m13967();
                return c8418;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c8418.close();
                AbstractC8415.m13956(c8418.f23311);
            }
        }
        file.mkdirs();
        C8418 c84182 = new C8418(j, file);
        c84182.m13966();
        return c84182;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f23306 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f23302.values()).iterator();
            while (it.hasNext()) {
                C0734 c0734 = ((C8419) it.next()).f23312;
                if (c0734 != null) {
                    c0734.m1531();
                }
            }
            m13965();
            m13959(this.f23306);
            this.f23306 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13964(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            C5919.m11246("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f23302;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C8419 c8419 = (C8419) linkedHashMap.get(strSubstring);
        if (c8419 == null) {
            c8419 = new C8419(this, strSubstring);
            linkedHashMap.put(strSubstring, c8419);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c8419.f23312 = new C0734(this, c8419);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                C5919.m11246("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c8419.f23313 = true;
        c8419.f23312 = null;
        if (strArrSplit.length != c8419.f23318.f23308) {
            C6267.m11760(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c8419.f23316[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                C6267.m11760(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m13965() {
        while (this.f23305 > this.f23307) {
            String str = (String) ((Map.Entry) this.f23302.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f23306 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C8419 c8419 = (C8419) this.f23302.get(str);
                    if (c8419 != null && c8419.f23312 == null) {
                        for (int i = 0; i < this.f23308; i++) {
                            File file = c8419.f23315[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f23305;
                            long[] jArr = c8419.f23316;
                            this.f23305 = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f23301++;
                        this.f23306.append((CharSequence) "REMOVE");
                        this.f23306.append(' ');
                        this.f23306.append((CharSequence) str);
                        this.f23306.append('\n');
                        this.f23302.remove(str);
                        if (m13970()) {
                            this.f23299.submit(this.f23298);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final synchronized void m13966() {
        try {
            BufferedWriter bufferedWriter = this.f23306;
            if (bufferedWriter != null) {
                m13959(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23310), AbstractC8415.f23291));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f23303));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f23308));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C8419 c8419 : this.f23302.values()) {
                    if (c8419.f23312 != null) {
                        bufferedWriter2.write("DIRTY " + c8419.f23317 + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c8419.f23317 + c8419.m13972() + '\n');
                    }
                }
                m13959(bufferedWriter2);
                if (this.f23309.exists()) {
                    m13961(this.f23309, this.f23304, true);
                }
                m13961(this.f23310, this.f23309, false);
                this.f23304.delete();
                this.f23306 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23309, true), AbstractC8415.f23291));
            } catch (Throwable th) {
                m13959(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m13967() throws IOException {
        m13958(this.f23310);
        Iterator it = this.f23302.values().iterator();
        while (it.hasNext()) {
            C8419 c8419 = (C8419) it.next();
            C0734 c0734 = c8419.f23312;
            int i = this.f23308;
            int i2 = 0;
            if (c0734 == null) {
                while (i2 < i) {
                    this.f23305 += c8419.f23316[i2];
                    i2++;
                }
            } else {
                c8419.f23312 = null;
                while (i2 < i) {
                    m13958(c8419.f23315[i2]);
                    m13958(c8419.f23314[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13968() {
        File file = this.f23309;
        C8416 c8416 = new C8416(new FileInputStream(file), AbstractC8415.f23291);
        try {
            String strM13957 = c8416.m13957();
            String strM139572 = c8416.m13957();
            String strM139573 = c8416.m13957();
            String strM139574 = c8416.m13957();
            String strM139575 = c8416.m13957();
            if (!"libcore.io.DiskLruCache".equals(strM13957) || !"1".equals(strM139572) || !Integer.toString(this.f23303).equals(strM139573) || !Integer.toString(this.f23308).equals(strM139574) || !"".equals(strM139575)) {
                throw new IOException("unexpected journal header: [" + strM13957 + ", " + strM139572 + ", " + strM139574 + ", " + strM139575 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m13964(c8416.m13957());
                    i++;
                } catch (EOFException unused) {
                    this.f23301 = i - this.f23302.size();
                    if (c8416.f23292 == -1) {
                        m13966();
                    } else {
                        this.f23306 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC8415.f23291));
                    }
                    try {
                        c8416.close();
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
                c8416.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0734 m13969(String str) {
        synchronized (this) {
            try {
                if (this.f23306 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C8419 c8419 = (C8419) this.f23302.get(str);
                if (c8419 == null) {
                    c8419 = new C8419(this, str);
                    this.f23302.put(str, c8419);
                } else if (c8419.f23312 != null) {
                    return null;
                }
                C0734 c0734 = new C0734(this, c8419);
                c8419.f23312 = c0734;
                this.f23306.append((CharSequence) "DIRTY");
                this.f23306.append(' ');
                this.f23306.append((CharSequence) str);
                this.f23306.append('\n');
                m13962(this.f23306);
                return c0734;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m13970() {
        int i = this.f23301;
        return i >= 2000 && i >= this.f23302.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized C8048 m13971(String str) {
        if (this.f23306 == null) {
            throw new IllegalStateException("cache is closed");
        }
        C8419 c8419 = (C8419) this.f23302.get(str);
        if (c8419 == null) {
            return null;
        }
        if (!c8419.f23313) {
            return null;
        }
        for (File file : c8419.f23315) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f23301++;
        this.f23306.append((CharSequence) "READ");
        this.f23306.append(' ');
        this.f23306.append((CharSequence) str);
        int i = 10;
        this.f23306.append('\n');
        if (m13970()) {
            this.f23299.submit(this.f23298);
        }
        return new C8048(c8419.f23315, i);
    }
}
