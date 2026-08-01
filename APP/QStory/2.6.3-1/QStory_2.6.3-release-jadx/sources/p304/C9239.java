package p304;

import android.os.StrictMode;
import androidx.compose.foundation.lazy.layout.C1575;
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
import p035.C7092;
import p056.CallableC7270;
import p246.C8878;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9239 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f23637;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final File f23640;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public BufferedWriter f23642;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f23643;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final File f23645;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final File f23646;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final File f23647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f23641 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f23638 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public long f23636 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final ThreadPoolExecutor f23635 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC9241());

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final CallableC7270 f23634 = new CallableC7270(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f23639 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f23644 = 1;

    public C9239(long j, File file) {
        this.f23647 = file;
        this.f23645 = new File(file, "journal");
        this.f23646 = new File(file, "journal.tmp");
        this.f23640 = new File(file, "journal.bkp");
        this.f23643 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m14536(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14537(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14538(C9239 c9239, C1575 c1575, boolean z) {
        synchronized (c9239) {
            C9240 c9240 = (C9240) c1575.f2416;
            if (c9240.f23648 != c1575) {
                throw new IllegalStateException();
            }
            if (z && !c9240.f23649) {
                for (int i = 0; i < c9239.f23644; i++) {
                    if (!((boolean[]) c1575.f2415)[i]) {
                        c1575.m2101();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c9240.f23650[i].exists()) {
                        c1575.m2101();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c9239.f23644; i2++) {
                File file = c9240.f23650[i2];
                if (!z) {
                    m14536(file);
                } else if (file.exists()) {
                    File file2 = c9240.f23651[i2];
                    file.renameTo(file2);
                    long j = c9240.f23652[i2];
                    long length = file2.length();
                    c9240.f23652[i2] = length;
                    c9239.f23641 = (c9239.f23641 - j) + length;
                }
            }
            c9239.f23637++;
            c9240.f23648 = null;
            if (c9240.f23649 || z) {
                c9240.f23649 = true;
                c9239.f23642.append((CharSequence) "CLEAN");
                c9239.f23642.append(' ');
                c9239.f23642.append((CharSequence) c9240.f23653);
                c9239.f23642.append((CharSequence) c9240.m14550());
                c9239.f23642.append('\n');
                if (z) {
                    c9239.f23636++;
                }
            } else {
                c9239.f23638.remove(c9240.f23653);
                c9239.f23642.append((CharSequence) "REMOVE");
                c9239.f23642.append(' ');
                c9239.f23642.append((CharSequence) c9240.f23653);
                c9239.f23642.append('\n');
            }
            m14540(c9239.f23642);
            if (c9239.f23641 > c9239.f23643 || c9239.m14548()) {
                c9239.f23635.submit(c9239.f23634);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m14539(File file, File file2, boolean z) throws IOException {
        if (z) {
            m14536(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m14540(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C9239 m14541(long j, File file) throws IOException {
        if (j <= 0) {
            C6755.m11869("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m14539(file2, file3, false);
            }
        }
        C9239 c9239 = new C9239(j, file);
        if (c9239.f23645.exists()) {
            try {
                c9239.m14546();
                c9239.m14544();
                return c9239;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c9239.close();
                AbstractC9236.m14534(c9239.f23647);
            }
        }
        file.mkdirs();
        C9239 c92392 = new C9239(j, file);
        c92392.m14542();
        return c92392;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f23642 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f23638.values()).iterator();
            while (it.hasNext()) {
                C1575 c1575 = ((C9240) it.next()).f23648;
                if (c1575 != null) {
                    c1575.m2101();
                }
            }
            m14543();
            m14537(this.f23642);
            this.f23642 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final synchronized void m14542() {
        try {
            BufferedWriter bufferedWriter = this.f23642;
            if (bufferedWriter != null) {
                m14537(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23646), AbstractC9236.f23627));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f23639));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f23644));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C9240 c9240 : this.f23638.values()) {
                    if (c9240.f23648 != null) {
                        bufferedWriter2.write("DIRTY " + c9240.f23653 + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c9240.f23653 + c9240.m14550() + '\n');
                    }
                }
                m14537(bufferedWriter2);
                if (this.f23645.exists()) {
                    m14539(this.f23645, this.f23640, true);
                }
                m14539(this.f23646, this.f23645, false);
                this.f23640.delete();
                this.f23642 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23645, true), AbstractC9236.f23627));
            } catch (Throwable th) {
                m14537(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m14543() {
        while (this.f23641 > this.f23643) {
            String str = (String) ((Map.Entry) this.f23638.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f23642 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C9240 c9240 = (C9240) this.f23638.get(str);
                    if (c9240 != null && c9240.f23648 == null) {
                        for (int i = 0; i < this.f23644; i++) {
                            File file = c9240.f23651[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f23641;
                            long[] jArr = c9240.f23652;
                            this.f23641 = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f23637++;
                        this.f23642.append((CharSequence) "REMOVE");
                        this.f23642.append(' ');
                        this.f23642.append((CharSequence) str);
                        this.f23642.append('\n');
                        this.f23638.remove(str);
                        if (m14548()) {
                            this.f23635.submit(this.f23634);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14544() throws IOException {
        m14536(this.f23646);
        Iterator it = this.f23638.values().iterator();
        while (it.hasNext()) {
            C9240 c9240 = (C9240) it.next();
            C1575 c1575 = c9240.f23648;
            int i = this.f23644;
            int i2 = 0;
            if (c1575 == null) {
                while (i2 < i) {
                    this.f23641 += c9240.f23652[i2];
                    i2++;
                }
            } else {
                c9240.f23648 = null;
                while (i2 < i) {
                    m14536(c9240.f23651[i2]);
                    m14536(c9240.f23650[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14545(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            C6755.m11866("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f23638;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C9240 c9240 = (C9240) linkedHashMap.get(strSubstring);
        if (c9240 == null) {
            c9240 = new C9240(this, strSubstring);
            linkedHashMap.put(strSubstring, c9240);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c9240.f23648 = new C1575(this, c9240);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                C6755.m11866("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c9240.f23649 = true;
        c9240.f23648 = null;
        if (strArrSplit.length != c9240.f23654.f23644) {
            C7092.m12336(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c9240.f23652[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                C7092.m12336(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m14546() {
        File file = this.f23645;
        C9237 c9237 = new C9237(new FileInputStream(file), AbstractC9236.f23627);
        try {
            String strM14535 = c9237.m14535();
            String strM145352 = c9237.m14535();
            String strM145353 = c9237.m14535();
            String strM145354 = c9237.m14535();
            String strM145355 = c9237.m14535();
            if (!"libcore.io.DiskLruCache".equals(strM14535) || !"1".equals(strM145352) || !Integer.toString(this.f23639).equals(strM145353) || !Integer.toString(this.f23644).equals(strM145354) || !"".equals(strM145355)) {
                throw new IOException("unexpected journal header: [" + strM14535 + ", " + strM145352 + ", " + strM145354 + ", " + strM145355 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m14545(c9237.m14535());
                    i++;
                } catch (EOFException unused) {
                    this.f23637 = i - this.f23638.size();
                    if (c9237.f23628 == -1) {
                        m14542();
                    } else {
                        this.f23642 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC9236.f23627));
                    }
                    try {
                        c9237.close();
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
                c9237.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1575 m14547(String str) {
        synchronized (this) {
            try {
                if (this.f23642 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C9240 c9240 = (C9240) this.f23638.get(str);
                if (c9240 == null) {
                    c9240 = new C9240(this, str);
                    this.f23638.put(str, c9240);
                } else if (c9240.f23648 != null) {
                    return null;
                }
                C1575 c1575 = new C1575(this, c9240);
                c9240.f23648 = c1575;
                this.f23642.append((CharSequence) "DIRTY");
                this.f23642.append(' ');
                this.f23642.append((CharSequence) str);
                this.f23642.append('\n');
                m14540(this.f23642);
                return c1575;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m14548() {
        int i = this.f23637;
        return i >= 2000 && i >= this.f23638.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final synchronized C8878 m14549(String str) {
        if (this.f23642 == null) {
            throw new IllegalStateException("cache is closed");
        }
        C9240 c9240 = (C9240) this.f23638.get(str);
        if (c9240 == null) {
            return null;
        }
        if (!c9240.f23649) {
            return null;
        }
        for (File file : c9240.f23651) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f23637++;
        this.f23642.append((CharSequence) "READ");
        this.f23642.append(' ');
        this.f23642.append((CharSequence) str);
        int i = 10;
        this.f23642.append('\n');
        if (m14548()) {
            this.f23635.submit(this.f23634);
        }
        return new C8878(c9240.f23651, i);
    }
}
