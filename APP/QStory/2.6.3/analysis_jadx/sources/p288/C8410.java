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
import p019.C6263;
import p040.CallableC6441;
import p230.C8049;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8410 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f23292;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final File f23295;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public BufferedWriter f23297;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f23298;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final File f23300;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final File f23301;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final File f23302;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f23296 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f23293 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public long f23291 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final ThreadPoolExecutor f23290 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8412());

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final CallableC6441 f23289 = new CallableC6441(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f23294 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f23299 = 1;

    public C8410(long j, File file) {
        this.f23302 = file;
        this.f23300 = new File(file, "journal");
        this.f23301 = new File(file, "journal.tmp");
        this.f23295 = new File(file, "journal.bkp");
        this.f23298 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m13977(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m13978(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13979(C8410 c8410, C0734 c0734, boolean z) {
        synchronized (c8410) {
            C8411 c8411 = (C8411) c0734.f2071;
            if (c8411.f23303 != c0734) {
                throw new IllegalStateException();
            }
            if (z && !c8411.f23304) {
                for (int i = 0; i < c8410.f23299; i++) {
                    if (!((boolean[]) c0734.f2070)[i]) {
                        c0734.m1541();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c8411.f23305[i].exists()) {
                        c0734.m1541();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c8410.f23299; i2++) {
                File file = c8411.f23305[i2];
                if (!z) {
                    m13977(file);
                } else if (file.exists()) {
                    File file2 = c8411.f23306[i2];
                    file.renameTo(file2);
                    long j = c8411.f23307[i2];
                    long length = file2.length();
                    c8411.f23307[i2] = length;
                    c8410.f23296 = (c8410.f23296 - j) + length;
                }
            }
            c8410.f23292++;
            c8411.f23303 = null;
            if (c8411.f23304 || z) {
                c8411.f23304 = true;
                c8410.f23297.append((CharSequence) "CLEAN");
                c8410.f23297.append(' ');
                c8410.f23297.append((CharSequence) c8411.f23308);
                c8410.f23297.append((CharSequence) c8411.m13991());
                c8410.f23297.append('\n');
                if (z) {
                    c8410.f23291++;
                }
            } else {
                c8410.f23293.remove(c8411.f23308);
                c8410.f23297.append((CharSequence) "REMOVE");
                c8410.f23297.append(' ');
                c8410.f23297.append((CharSequence) c8411.f23308);
                c8410.f23297.append('\n');
            }
            m13981(c8410.f23297);
            if (c8410.f23296 > c8410.f23298 || c8410.m13989()) {
                c8410.f23290.submit(c8410.f23289);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m13980(File file, File file2, boolean z) throws IOException {
        if (z) {
            m13977(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m13981(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C8410 m13982(long j, File file) throws IOException {
        if (j <= 0) {
            C5925.m11310("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m13980(file2, file3, false);
            }
        }
        C8410 c8410 = new C8410(j, file);
        if (c8410.f23300.exists()) {
            try {
                c8410.m13987();
                c8410.m13985();
                return c8410;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c8410.close();
                AbstractC8407.m13975(c8410.f23302);
            }
        }
        file.mkdirs();
        C8410 c84102 = new C8410(j, file);
        c84102.m13983();
        return c84102;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f23297 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f23293.values()).iterator();
            while (it.hasNext()) {
                C0734 c0734 = ((C8411) it.next()).f23303;
                if (c0734 != null) {
                    c0734.m1541();
                }
            }
            m13984();
            m13978(this.f23297);
            this.f23297 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final synchronized void m13983() {
        try {
            BufferedWriter bufferedWriter = this.f23297;
            if (bufferedWriter != null) {
                m13978(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23301), AbstractC8407.f23282));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f23294));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f23299));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C8411 c8411 : this.f23293.values()) {
                    if (c8411.f23303 != null) {
                        bufferedWriter2.write("DIRTY " + c8411.f23308 + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c8411.f23308 + c8411.m13991() + '\n');
                    }
                }
                m13978(bufferedWriter2);
                if (this.f23300.exists()) {
                    m13980(this.f23300, this.f23295, true);
                }
                m13980(this.f23301, this.f23300, false);
                this.f23295.delete();
                this.f23297 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23300, true), AbstractC8407.f23282));
            } catch (Throwable th) {
                m13978(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m13984() {
        while (this.f23296 > this.f23298) {
            String str = (String) ((Map.Entry) this.f23293.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f23297 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C8411 c8411 = (C8411) this.f23293.get(str);
                    if (c8411 != null && c8411.f23303 == null) {
                        for (int i = 0; i < this.f23299; i++) {
                            File file = c8411.f23306[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f23296;
                            long[] jArr = c8411.f23307;
                            this.f23296 = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f23292++;
                        this.f23297.append((CharSequence) "REMOVE");
                        this.f23297.append(' ');
                        this.f23297.append((CharSequence) str);
                        this.f23297.append('\n');
                        this.f23293.remove(str);
                        if (m13989()) {
                            this.f23290.submit(this.f23289);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m13985() throws IOException {
        m13977(this.f23301);
        Iterator it = this.f23293.values().iterator();
        while (it.hasNext()) {
            C8411 c8411 = (C8411) it.next();
            C0734 c0734 = c8411.f23303;
            int i = this.f23299;
            int i2 = 0;
            if (c0734 == null) {
                while (i2 < i) {
                    this.f23296 += c8411.f23307[i2];
                    i2++;
                }
            } else {
                c8411.f23303 = null;
                while (i2 < i) {
                    m13977(c8411.f23306[i2]);
                    m13977(c8411.f23305[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13986(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            C5925.m11307("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f23293;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C8411 c8411 = (C8411) linkedHashMap.get(strSubstring);
        if (c8411 == null) {
            c8411 = new C8411(this, strSubstring);
            linkedHashMap.put(strSubstring, c8411);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c8411.f23303 = new C0734(this, c8411);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                C5925.m11307("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c8411.f23304 = true;
        c8411.f23303 = null;
        if (strArrSplit.length != c8411.f23309.f23299) {
            C6263.m11777(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c8411.f23307[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                C6263.m11777(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13987() {
        File file = this.f23300;
        C8408 c8408 = new C8408(new FileInputStream(file), AbstractC8407.f23282);
        try {
            String strM13976 = c8408.m13976();
            String strM139762 = c8408.m13976();
            String strM139763 = c8408.m13976();
            String strM139764 = c8408.m13976();
            String strM139765 = c8408.m13976();
            if (!"libcore.io.DiskLruCache".equals(strM13976) || !"1".equals(strM139762) || !Integer.toString(this.f23294).equals(strM139763) || !Integer.toString(this.f23299).equals(strM139764) || !"".equals(strM139765)) {
                throw new IOException("unexpected journal header: [" + strM13976 + ", " + strM139762 + ", " + strM139764 + ", " + strM139765 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m13986(c8408.m13976());
                    i++;
                } catch (EOFException unused) {
                    this.f23292 = i - this.f23293.size();
                    if (c8408.f23283 == -1) {
                        m13983();
                    } else {
                        this.f23297 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC8407.f23282));
                    }
                    try {
                        c8408.close();
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
                c8408.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0734 m13988(String str) {
        synchronized (this) {
            try {
                if (this.f23297 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C8411 c8411 = (C8411) this.f23293.get(str);
                if (c8411 == null) {
                    c8411 = new C8411(this, str);
                    this.f23293.put(str, c8411);
                } else if (c8411.f23303 != null) {
                    return null;
                }
                C0734 c0734 = new C0734(this, c8411);
                c8411.f23303 = c0734;
                this.f23297.append((CharSequence) "DIRTY");
                this.f23297.append(' ');
                this.f23297.append((CharSequence) str);
                this.f23297.append('\n');
                m13981(this.f23297);
                return c0734;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m13989() {
        int i = this.f23292;
        return i >= 2000 && i >= this.f23293.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized C8049 m13990(String str) {
        if (this.f23297 == null) {
            throw new IllegalStateException("cache is closed");
        }
        C8411 c8411 = (C8411) this.f23293.get(str);
        if (c8411 == null) {
            return null;
        }
        if (!c8411.f23304) {
            return null;
        }
        for (File file : c8411.f23306) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f23292++;
        this.f23297.append((CharSequence) "READ");
        this.f23297.append(' ');
        this.f23297.append((CharSequence) str);
        int i = 10;
        this.f23297.append('\n');
        if (m13989()) {
            this.f23290.submit(this.f23289);
        }
        return new C8049(c8411.f23306, i);
    }
}
