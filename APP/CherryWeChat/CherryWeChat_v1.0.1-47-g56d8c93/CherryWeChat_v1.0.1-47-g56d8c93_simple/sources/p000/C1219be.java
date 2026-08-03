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

    /* JADX INFO: renamed from: e */
    public final int f4161e;

    /* JADX INFO: renamed from: f */
    public final long f4162f;

    /* JADX INFO: renamed from: g */
    public final int f4163g;

    /* JADX INFO: renamed from: h */
    public long f4164h;

    /* JADX INFO: renamed from: i */
    public BufferedWriter f4165i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f4166j;

    /* JADX INFO: renamed from: k */
    public int f4167k;

    /* JADX INFO: renamed from: l */
    public long f4168l;

    /* JADX INFO: renamed from: m */
    public final ThreadPoolExecutor f4169m;

    /* JADX INFO: renamed from: n */
    public final CallableC1008Xd f4170n;

    public C1219be(File r17, long r18) {
        this.f4164h = 0;
        this.f4166j = new LinkedHashMap(0, 0.75f, true);
        this.f4168l = 0;
        this.f4169m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1051Yd());
        this.f4170n = new CallableC1008Xd(this);
        this.f4157a = r17;
        this.f4161e = 1;
        this.f4158b = new File(r17, "journal");
        this.f4159c = new File(r17, "journal.tmp");
        this.f4160d = new File(r17, "journal.bkp");
        this.f4163g = 1;
        this.f4162f = r18;
    }

    /* JADX INFO: renamed from: d */
    public static void m2334d(C1219be r9, C1094Zd r10, boolean r11) {
        monitor-enter(r9);
        C1139ae r0 = (C1139ae) r10.f3478b;     // Catch: Throwable -> L19
        if (r0.f3604f != r10) goto L47;
        int r1 = 0;
        if (r11 == false) goto L25;
        if (r0.f3603e == true) goto L25;
        int r2 = 0;
    L11:
        if (r2 >= r9.f4163g) goto L25;
        if (((boolean[]) r10.f3479c)[r2] == false) goto L22;
        if (r0.f3602d[r2].exists() == false) goto L16;
        r2 = r2 + 1;
        goto L11
    L16:
        r10.m2020a();     // Catch: Throwable -> L19
        monitor-exit(r9);
        return;
    L22:
        r10.m2020a();     // Catch: Throwable -> L19
        throw new IllegalStateException("Newly created entry didn't create value for index " + r2);     // Catch: Throwable -> L19
    L25:
        if (r1 >= r9.f4163g) goto L33;
        File r102 = r0.f3602d[r1];     // Catch: Throwable -> L19
        if (r11 == true) goto L29;
        m2336i(r102);     // Catch: Throwable -> L19
    L32:
        r1 = r1 + 1;     // Catch: Throwable -> L19
        goto L25
    L29:
        if (r102.exists() == false) goto L32;
        File r22 = r0.f3601c[r1];     // Catch: Throwable -> L19
        r102.renameTo(r22);     // Catch: Throwable -> L19
        long r3 = r0.f3600b[r1];     // Catch: Throwable -> L19
        long r5 = r22.length();     // Catch: Throwable -> L19
        r0.f3600b[r1] = r5;     // Catch: Throwable -> L19
        r9.f4164h = (r9.f4164h - r3) + r5;     // Catch: Throwable -> L19
        goto L32
    L33:
        r9.f4167k++;
        r0.f3604f = null;     // Catch: Throwable -> L19
        if ((r0.f3603e | r11) == false) goto L38;
        r0.f3603e = true;     // Catch: Throwable -> L19
        r9.f4165i.append("CLEAN");     // Catch: Throwable -> L19
        r9.f4165i.append(' ');     // Catch: Throwable -> L19
        r9.f4165i.append(r0.f3599a);     // Catch: Throwable -> L19
        r9.f4165i.append(r0.m2054a());     // Catch: Throwable -> L19
        r9.f4165i.append('\n');     // Catch: Throwable -> L19
        if (r11 == false) goto L39;
        r9.f4168l++;
    L39:
        m2337m(r9.f4165i);     // Catch: Throwable -> L19
        if (r9.f4164h <= r9.f4162f) goto L42;
    L43:
        r9.f4169m.submit(r9.f4170n);     // Catch: Throwable -> L19
    L44:
        monitor-exit(r9);
        return;
    L42:
        if (r9.m2342p() == false) goto L44;
    L38:
        r9.f4166j.remove(r0.f3599a);     // Catch: Throwable -> L19
        r9.f4165i.append("REMOVE");     // Catch: Throwable -> L19
        r9.f4165i.append(' ');     // Catch: Throwable -> L19
        r9.f4165i.append(r0.f3599a);     // Catch: Throwable -> L19
        r9.f4165i.append('\n');     // Catch: Throwable -> L19
        goto L39
    L47:
        throw new IllegalStateException();     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public static void m2335f(BufferedWriter r2) {
        StrictMode.ThreadPolicy r0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(r0).permitUnbufferedIo().build());
        r2.close();     // Catch: Throwable -> L6
        StrictMode.setThreadPolicy(r0);
        return;
    L6:
        th = move-exception;
        StrictMode.setThreadPolicy(r0);
        throw th;
    }

    /* JADX INFO: renamed from: i */
    public static void m2336i(File r1) {
        if (r1.exists() == true) goto L5;
        return;
    L5:
        if (r1.delete() == false) goto L8;
        return;
    L8:
        throw new IOException();
    }

    /* JADX INFO: renamed from: m */
    public static void m2337m(BufferedWriter r2) {
        StrictMode.ThreadPolicy r0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(r0).permitUnbufferedIo().build());
        r2.flush();     // Catch: Throwable -> L6
        StrictMode.setThreadPolicy(r0);
        return;
    L6:
        th = move-exception;
        StrictMode.setThreadPolicy(r0);
        throw th;
    }

    /* JADX INFO: renamed from: q */
    public static C1219be m2338q(File r5, long r6) {
        if (r6 <= 0) goto L19;
        File r0 = new File(r5, "journal.bkp");
        if (r0.exists() == false) goto L10;
        File r1 = new File(r5, "journal");
        if (r1.exists() == false) goto L9;
        r0.delete();
        goto L10
    L9:
        m2339v(r0, r1, false);
    L10:
        C1219be r02 = new C1219be(r5, r6);
        if (r02.f4158b.exists() == true) goto L20;
    L16:
        r5.mkdirs();
        C1219be r03 = new C1219be(r5, r6);
        r03.m2346u();
        return r03;
    L20:
        r02.m2344s();     // Catch: IOException -> L14
        r02.m2343r();     // Catch: IOException -> L14
        return r02;
    L14:
        e = move-exception;
        System.out.println("DiskLruCache " + r5 + " is corrupt: " + e.getMessage() + ", removing");
        r02.close();
        AbstractC2794zD.m5361a(r02.f4157a);
        goto L16
    L19:
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX INFO: renamed from: v */
    public static void m2339v(File r0, File r1, boolean r2) {
        if (r2 == false) goto L5;
        m2336i(r1);
    L5:
        if (r0.renameTo(r1) == false) goto L8;
        return;
    L8:
        throw new IOException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L4:
        if (this.f4165i != null) goto L7;
        monitor-exit(this);
        return;
    L7:
        Iterator r0 = new ArrayList(this.f4166j.values()).iterator();     // Catch: Throwable -> L13
    L9:
        if (r0.hasNext() == false) goto L15;
        C1094Zd r1 = ((C1139ae) r0.next()).f3604f;     // Catch: Throwable -> L13
        if (r1 == null) goto L9;
        r1.m2020a();     // Catch: Throwable -> L13
        goto L9
    L15:
        m2347w();     // Catch: Throwable -> L13
        m2335f(this.f4165i);     // Catch: Throwable -> L13
        this.f4165i = null;     // Catch: Throwable -> L13
        monitor-exit(this);
    }

    /* JADX INFO: renamed from: l */
    public final C1094Zd m2340l(String r4) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f4165i == null) goto L19;
        C1139ae r0 = (C1139ae) this.f4166j.get(r4);     // Catch: Throwable -> L8
        if (r0 != null) goto L11;
        r0 = new C1139ae(this, r4);     // Catch: Throwable -> L8
        this.f4166j.put(r4, r0);     // Catch: Throwable -> L8
    L15:
        C1094Zd r1 = new C1094Zd(this, r0);     // Catch: Throwable -> L8
        r0.f3604f = r1;     // Catch: Throwable -> L8
        this.f4165i.append("DIRTY");     // Catch: Throwable -> L8
        this.f4165i.append(' ');     // Catch: Throwable -> L8
        this.f4165i.append(r4);     // Catch: Throwable -> L8
        this.f4165i.append('\n');     // Catch: Throwable -> L8
        m2337m(this.f4165i);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r1;
    L11:
        if (r0.f3604f == null) goto L15;
        monitor-exit(this);
        return null;
    L19:
        throw new IllegalStateException("cache is closed");     // Catch: Throwable -> L8
    }

    /* JADX INFO: renamed from: o */
    public final synchronized C0132D2 m2341o(String r7) {
        monitor-enter(this);
    L21:
        th = move-exception;
        throw th;
    L4:
        if (this.f4165i == null) goto L30;
        C1139ae r0 = (C1139ae) this.f4166j.get(r7);     // Catch: Throwable -> L21
        if (r0 != null) goto L11;
        monitor-exit(this);
        return null;
    L11:
        if (r0.f3603e == true) goto L14;
        monitor-exit(this);
        return null;
    L14:
        File[] r2 = r0.f3601c;     // Catch: Throwable -> L21
        int r3 = r2.length;     // Catch: Throwable -> L21
        int r4 = 0;
    L15:
        if (r4 >= r3) goto L23;
        if (r2[r4].exists() == false) goto L18;
        r4 = r4 + 1;
        goto L15
    L18:
        monitor-exit(this);
        return null;
    L23:
        this.f4167k++;
        this.f4165i.append("READ");     // Catch: Throwable -> L21
        this.f4165i.append(' ');     // Catch: Throwable -> L21
        this.f4165i.append(r7);     // Catch: Throwable -> L21
        this.f4165i.append('\n');     // Catch: Throwable -> L21
        if (m2342p() == false) goto L26;
        this.f4169m.submit(this.f4170n);     // Catch: Throwable -> L21
    L26:
        C0132D2 r72 = new C0132D2(18, r0.f3601c);     // Catch: Throwable -> L21
        monitor-exit(this);
        return r72;
    L30:
        throw new IllegalStateException("cache is closed");     // Catch: Throwable -> L21
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2342p() {
        int r0 = this.f4167k;
        if (r0 >= 2000) goto L5;
        return false;
    L5:
        if (r0 < this.f4166j.size()) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m2343r() {
        m2336i(this.f4159c);
        Iterator r0 = this.f4166j.values().iterator();
    L4:
        if (r0.hasNext() == false) goto L13;
        C1139ae r1 = (C1139ae) r0.next();
        C1094Zd r2 = r1.f3604f;
        int r3 = this.f4163g;
        int r4 = 0;
        if (r2 == null) goto L7;
        r1.f3604f = null;
    L10:
        if (r4 >= r3) goto L12;
        m2336i(r1.f3601c[r4]);
        m2336i(r1.f3602d[r4]);
        r4 = r4 + 1;
        goto L10
    L12:
        r0.remove();
    L7:
        if (r4 >= r3) goto L4;
        this.f4164h += r1.f3600b[r4];
        r4 = r4 + 1;
        goto L7
    }

    /* JADX INFO: renamed from: s */
    public final void m2344s() {
        File r4 = this.f4158b;
        C2298nz r2 = new C2298nz(new FileInputStream(r4), AbstractC2794zD.f9462a);
        String r3 = r2.m4673d();     // Catch: Throwable -> L16
        String r5 = r2.m4673d();     // Catch: Throwable -> L16
        String r6 = r2.m4673d();     // Catch: Throwable -> L16
        String r7 = r2.m4673d();     // Catch: Throwable -> L16
        String r8 = r2.m4673d();     // Catch: Throwable -> L16
        if ("libcore.io.DiskLruCache".equals(r3) == false) goto L27;
        if ("1".equals(r5) == false) goto L27;
        if (Integer.toString(this.f4161e).equals(r6) == false) goto L27;
        if (Integer.toString(this.f4163g).equals(r7) == false) goto L27;
        if ("".equals(r8) == false) goto L27;
        int r0 = 0;
    L34:
        m2345t(r2.m4673d());     // Catch: Throwable -> L16 EOFException -> L18
        r0 = r0 + 1;
        goto L34
    L18:
        this.f4167k = r0 - this.f4166j.size();     // Catch: Throwable -> L16
        if (r2.f8059e != (-1)) goto L21;
        m2346u();     // Catch: Throwable -> L16
    L37:
        r2.close();     // Catch: Exception -> L32 RuntimeException -> L24
        return;
    L24:
        e = move-exception;
        throw e;
    L41:
        return;
    L21:
        this.f4165i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(r4, true), AbstractC2794zD.f9462a));     // Catch: Throwable -> L16
    L27:
        throw new IOException("unexpected journal header: [" + r3 + ", " + r5 + ", " + r7 + ", " + r8 + "]");     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        r2.close();     // Catch: Exception -> L33 RuntimeException -> L30
    L30:
        e = move-exception;
        throw e;
    L29:
        throw th;
    }

    /* JADX INFO: renamed from: t */
    public final void m2345t(String r8) {
        int r1 = r8.indexOf(32);
        if (r1 == (-1)) goto L47;
        int r4 = r1 + 1;
        int r0 = r8.indexOf(32, r4);
        LinkedHashMap r5 = this.f4166j;
        if (r0 != (-1)) goto L12;
        String r42 = r8.substring(r4);
        if (r1 == 6) goto L9;
    L13:
        C1139ae r6 = (C1139ae) r5.get(r42);
        if (r6 != null) goto L17;
        r6 = new C1139ae(this, r42);
        r5.put(r42, r6);
    L17:
        if (r0 == (-1)) goto L32;
        if (r1 != 5) goto L32;
        if (r8.startsWith("CLEAN") == false) goto L32;
        String[] r82 = r8.substring(r0 + 1).split(" ");
        r6.f3603e = true;
        r6.f3604f = null;
        if (r82.length != r6.f3605g.f4163g) goto L31;
        int r02 = 0;
    L48:
        if (r02 >= r82.length) goto L51;
        r6.f3600b[r02] = Long.parseLong(r82[r02]);     // Catch: NumberFormatException -> L28
        r02 = r02 + 1;
        goto L48
    L51:
        return;
    L29:
        throw new IOException("unexpected journal line: " + Arrays.toString(r82));
    L31:
        throw new IOException("unexpected journal line: " + Arrays.toString(r82));
    L32:
        if (r0 != (-1)) goto L38;
        if (r1 != 5) goto L38;
        if (r8.startsWith("DIRTY") == false) goto L38;
        r6.f3604f = new C1094Zd(this, r6);
        return;
    L38:
        if (r0 != (-1)) goto L45;
        if (r1 != 4) goto L45;
        if (r8.startsWith("READ") == false) goto L45;
        return;
    L45:
        throw new IOException("unexpected journal line: ".concat(r8));
    L9:
        if (r8.startsWith("REMOVE") == false) goto L13;
        r5.remove(r42);
        return;
    L12:
        r42 = r8.substring(r4, r0);
        goto L13
    L47:
        throw new IOException("unexpected journal line: ".concat(r8));
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m2346u() {
        monitor-enter(this);
        BufferedWriter r0 = this.f4165i;     // Catch: Throwable -> L6
        if (r0 == null) goto L8;
        m2335f(r0);     // Catch: Throwable -> L6
    L8:
        BufferedWriter r02 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4159c), AbstractC2794zD.f9462a));     // Catch: Throwable -> L6
        r02.write("libcore.io.DiskLruCache");     // Catch: Throwable -> L15
        r02.write("\n");     // Catch: Throwable -> L15
        r02.write("1");     // Catch: Throwable -> L15
        r02.write("\n");     // Catch: Throwable -> L15
        r02.write(Integer.toString(this.f4161e));     // Catch: Throwable -> L15
        r02.write("\n");     // Catch: Throwable -> L15
        r02.write(Integer.toString(this.f4163g));     // Catch: Throwable -> L15
        r02.write("\n");     // Catch: Throwable -> L15
        r02.write("\n");     // Catch: Throwable -> L15
        Iterator r1 = this.f4166j.values().iterator();     // Catch: Throwable -> L15
    L10:
        if (r1.hasNext() == false) goto L19;
        C1139ae r2 = (C1139ae) r1.next();     // Catch: Throwable -> L15
        if (r2.f3604f != null) goto L14;
        r02.write("CLEAN " + r2.f3599a + r2.m2054a() + '\n');     // Catch: Throwable -> L15
        goto L10
    L14:
        r02.write("DIRTY " + r2.f3599a + '\n');     // Catch: Throwable -> L15
        goto L10
    L19:
        m2335f(r02);     // Catch: Throwable -> L6
        if (this.f4158b.exists() == false) goto L22;
        m2339v(this.f4158b, this.f4160d, true);     // Catch: Throwable -> L6
    L22:
        m2339v(this.f4159c, this.f4158b, false);     // Catch: Throwable -> L6
        this.f4160d.delete();     // Catch: Throwable -> L6
        this.f4165i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4158b, true), AbstractC2794zD.f9462a));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L15:
        th = move-exception;
        m2335f(r02);     // Catch: Throwable -> L6
        throw th;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: w */
    public final void m2347w() {
    L3:
        if (this.f4164h <= this.f4162f) goto L37;
        String r0 = (String) ((Map.Entry) this.f4166j.entrySet().iterator().next()).getKey();
        monitor-enter(this);
    L23:
        th = move-exception;
        throw th;
    L7:
        if (this.f4165i == null) goto L34;
        C1139ae r1 = (C1139ae) this.f4166j.get(r0);     // Catch: Throwable -> L23
        if (r1 == null) goto L31;
        if (r1.f3604f != null) goto L31;
        int r2 = 0;
    L15:
        if (r2 >= this.f4163g) goto L26;
        File r3 = r1.f3601c[r2];     // Catch: Throwable -> L23
        if (r3.exists() == false) goto L25;
        if (r3.delete() == true) goto L25;
        throw new IOException("failed to delete " + r3);     // Catch: Throwable -> L23
    L25:
        long r32 = this.f4164h;     // Catch: Throwable -> L23
        long[] r5 = r1.f3600b;     // Catch: Throwable -> L23
        this.f4164h = r32 - r5[r2];     // Catch: Throwable -> L23
        r5[r2] = 0;     // Catch: Throwable -> L23
        r2 = r2 + 1;     // Catch: Throwable -> L23
        goto L15
    L26:
        this.f4167k++;
        this.f4165i.append("REMOVE");     // Catch: Throwable -> L23
        this.f4165i.append(' ');     // Catch: Throwable -> L23
        this.f4165i.append(r0);     // Catch: Throwable -> L23
        this.f4165i.append('\n');     // Catch: Throwable -> L23
        this.f4166j.remove(r0);     // Catch: Throwable -> L23
        if (m2342p() == false) goto L29;
        this.f4169m.submit(this.f4170n);     // Catch: Throwable -> L23
    L29:
        monitor-exit(this);
    L31:
        monitor-exit(this);
        goto L3
    L34:
        throw new IllegalStateException("cache is closed");     // Catch: Throwable -> L23
    }
}
