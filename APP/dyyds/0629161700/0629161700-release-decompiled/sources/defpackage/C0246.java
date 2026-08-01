package defpackage;

/* JADX INFO: renamed from: ᛲᛲᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0246 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final long f1439;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public java.io.BufferedWriter f1440;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f1441;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f1442;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final java.util.concurrent.ThreadPoolExecutor f1443;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.io.File f1444;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f1445;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.io.File f1446;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.File f1447;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public long f1448;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public long f1449;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.io.File f1450;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final defpackage.CallableC1787 f1451;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int f1452;

    public C0246(java.io.File r15) {
            r14 = this;
            r14.<init>()
            r0 = 0
            r14.f1448 = r0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 1061158912(0x3f400000, float:0.75)
            r4 = 0
            r5 = 1
            r2.<init>(r4, r3, r5)
            r14.f1441 = r2
            r14.f1449 = r0
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r12 = new java.util.concurrent.LinkedBlockingQueue
            r12.<init>()
            ᛱᲀᲇ r13 = new ᛱᲀᲇ
            r13.<init>()
            r7 = 0
            r8 = 1
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r6.<init>(r7, r8, r9, r11, r12, r13)
            r14.f1443 = r6
            ᲀᲈᲇᛸ r0 = new ᲀᲈᲇᛸ
            r0.<init>(r4, r14)
            r14.f1451 = r0
            r14.f1447 = r15
            r14.f1452 = r5
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal"
            r0.<init>(r15, r1)
            r14.f1446 = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.tmp"
            r0.<init>(r15, r1)
            r14.f1444 = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r15, r1)
            r14.f1450 = r0
            r14.f1442 = r5
            r0 = 262144000(0xfa00000, double:1.295163447E-315)
            r14.f1439 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static void m858(java.io.BufferedWriter r2) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitUnbufferedIo()
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)
            r2.flush()     // Catch: java.lang.Throwable -> L1b
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L1b:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static void m859(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L13
            boolean r1 = r1.delete()
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>()
            throw r1
        L13:
            return
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public static void m860(java.io.File r0, java.io.File r1, boolean r2) {
            if (r2 == 0) goto L5
            m859(r1)
        L5:
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m861(java.io.BufferedWriter r2) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r1 = new android.os.StrictMode$ThreadPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$ThreadPolicy$Builder r1 = r1.permitUnbufferedIo()
            android.os.StrictMode$ThreadPolicy r1 = r1.build()
            android.os.StrictMode.setThreadPolicy(r1)
            r2.close()     // Catch: java.lang.Throwable -> L1b
            android.os.StrictMode.setThreadPolicy(r0)
            return
        L1b:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static defpackage.C0246 m862(java.io.File r5) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L22
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "journal"
            r1.<init>(r5, r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L1e
            r0.delete()
            goto L22
        L1e:
            r2 = 0
            m860(r0, r1, r2)
        L22:
            ᛲᛲᛳᛳ r0 = new ᛲᛲᛳᛳ
            r0.<init>(r5)
            java.io.File r1 = r0.f1446
            boolean r1 = r1.exists()
            if (r1 == 0) goto L63
            r0.m867()     // Catch: java.io.IOException -> L36
            r0.m864()     // Catch: java.io.IOException -> L36
            return r0
        L36:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DiskLruCache "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " is corrupt: "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = ", removing"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            r0.close()
            java.io.File r0 = r0.f1447
            defpackage.AbstractC1591.m2871(r0)
        L63:
            r5.mkdirs()
            ᛲᛲᛳᛳ r0 = new ᛲᛲᛳᛳ
            r0.<init>(r5)
            r0.m869()
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r2 = this;
            monitor-enter(r2)
            java.io.BufferedWriter r0 = r2.f1440     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashMap r1 = r2.f1441     // Catch: java.lang.Throwable -> L2a
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
            ᛲᛲᛵᛱ r1 = (defpackage.C0251) r1     // Catch: java.lang.Throwable -> L2a
            ᛴᛷᛳᲀ r1 = r1.f1467     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L16
            r1.m1597()     // Catch: java.lang.Throwable -> L2a
            goto L16
        L2a:
            r0 = move-exception
            goto L39
        L2c:
            r2.m868()     // Catch: java.lang.Throwable -> L2a
            java.io.BufferedWriter r0 = r2.f1440     // Catch: java.lang.Throwable -> L2a
            m861(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            r2.f1440 = r0     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)
            return
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.C0703 m863(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.io.BufferedWriter r0 = r3.f1440     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L4b
            java.util.LinkedHashMap r0 = r3.f1441     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1a
            ᛲᛲᛵᛱ r0 = (defpackage.C0251) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            ᛲᛲᛵᛱ r0 = new ᛲᛲᛵᛱ     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r3.f1441     // Catch: java.lang.Throwable -> L1a
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L1a
            goto L23
        L1a:
            r4 = move-exception
            goto L53
        L1c:
            ᛴᛷᛳᲀ r1 = r0.f1467     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L23
            monitor-exit(r3)
            r3 = 0
            return r3
        L23:
            ᛴᛷᛳᲀ r1 = new ᛴᛷᛳᲀ     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L1a
            r0.f1467 = r1     // Catch: java.lang.Throwable -> L1a
            java.io.BufferedWriter r0 = r3.f1440     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "DIRTY"
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.io.BufferedWriter r0 = r3.f1440     // Catch: java.lang.Throwable -> L1a
            r2 = 32
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.io.BufferedWriter r0 = r3.f1440     // Catch: java.lang.Throwable -> L1a
            r0.append(r4)     // Catch: java.lang.Throwable -> L1a
            java.io.BufferedWriter r4 = r3.f1440     // Catch: java.lang.Throwable -> L1a
            r0 = 10
            r4.append(r0)     // Catch: java.lang.Throwable -> L1a
            java.io.BufferedWriter r4 = r3.f1440     // Catch: java.lang.Throwable -> L1a
            m858(r4)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r3)
            return r1
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "cache is closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public final void m864() {
            r9 = this;
            java.io.File r0 = r9.f1444
            m859(r0)
            java.util.LinkedHashMap r0 = r9.f1441
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            ᛲᛲᛵᛱ r1 = (defpackage.C0251) r1
            ᛴᛷᛳᲀ r2 = r1.f1467
            int r3 = r9.f1442
            r4 = 0
            if (r2 != 0) goto L30
        L22:
            if (r4 >= r3) goto Lf
            long r5 = r9.f1448
            long[] r2 = r1.f1466
            r7 = r2[r4]
            long r5 = r5 + r7
            r9.f1448 = r5
            int r4 = r4 + 1
            goto L22
        L30:
            r2 = 0
            r1.f1467 = r2
        L33:
            if (r4 >= r3) goto L46
            java.io.File[] r2 = r1.f1464
            r2 = r2[r4]
            m859(r2)
            java.io.File[] r2 = r1.f1463
            r2 = r2[r4]
            m859(r2)
            int r4 = r4 + 1
            goto L33
        L46:
            r0.remove()
            goto Lf
        L4a:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final boolean m865() {
            r2 = this;
            int r0 = r2.f1445
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap r2 = r2.f1441
            int r2 = r2.size()
            if (r0 < r2) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final synchronized defpackage.C1606 m866(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            java.io.BufferedWriter r0 = r6.f1440     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L65
            java.util.LinkedHashMap r0 = r6.f1441     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L2b
            ᛲᛲᛵᛱ r0 = (defpackage.C0251) r0     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            if (r0 != 0) goto L12
            monitor-exit(r6)
            return r1
        L12:
            boolean r2 = r0.f1462     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L18
            monitor-exit(r6)
            return r1
        L18:
            java.io.File[] r2 = r0.f1464     // Catch: java.lang.Throwable -> L2b
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2b
            r4 = 0
        L1c:
            if (r4 >= r3) goto L2d
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L28
            monitor-exit(r6)
            return r1
        L28:
            int r4 = r4 + 1
            goto L1c
        L2b:
            r7 = move-exception
            goto L6d
        L2d:
            int r1 = r6.f1445     // Catch: java.lang.Throwable -> L2b
            int r1 = r1 + 1
            r6.f1445 = r1     // Catch: java.lang.Throwable -> L2b
            java.io.BufferedWriter r1 = r6.f1440     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "READ"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.io.BufferedWriter r1 = r6.f1440     // Catch: java.lang.Throwable -> L2b
            r2 = 32
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.io.BufferedWriter r1 = r6.f1440     // Catch: java.lang.Throwable -> L2b
            r1.append(r7)     // Catch: java.lang.Throwable -> L2b
            java.io.BufferedWriter r7 = r6.f1440     // Catch: java.lang.Throwable -> L2b
            r1 = 10
            r7.append(r1)     // Catch: java.lang.Throwable -> L2b
            boolean r7 = r6.m865()     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L5a
            java.util.concurrent.ThreadPoolExecutor r7 = r6.f1443     // Catch: java.lang.Throwable -> L2b
            ᲀᲈᲇᛸ r1 = r6.f1451     // Catch: java.lang.Throwable -> L2b
            r7.submit(r1)     // Catch: java.lang.Throwable -> L2b
        L5a:
            ᛸᲈᛸᲈ r7 = new ᛸᲈᛸᲈ     // Catch: java.lang.Throwable -> L2b
            java.io.File[] r0 = r0.f1464     // Catch: java.lang.Throwable -> L2b
            r1 = 16
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r7
        L65:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "cache is closed"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            throw r7     // Catch: java.lang.Throwable -> L2b
        L6d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r7
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final void m867() {
            r10 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            ᲈᛷᛶᲁ r2 = new ᲈᛷᛶᲁ
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r10.f1446
            r3.<init>(r4)
            java.nio.charset.Charset r5 = defpackage.AbstractC1591.f7036
            r2.<init>(r3, r5)
            java.lang.String r3 = r2.m3707()     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r2.m3707()     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r2.m3707()     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r2.m3707()     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = r2.m3707()     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = "libcore.io.DiskLruCache"
            boolean r9 = r9.equals(r3)     // Catch: java.lang.Throwable -> L61
            if (r9 == 0) goto L8f
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r5)     // Catch: java.lang.Throwable -> L61
            if (r9 == 0) goto L8f
            int r9 = r10.f1452     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L61
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L8f
            int r6 = r10.f1442     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch: java.lang.Throwable -> L61
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L8f
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L8f
            r0 = 0
        L57:
            java.lang.String r1 = r2.m3707()     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            r10.m870(r1)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            int r0 = r0 + 1
            goto L57
        L61:
            r10 = move-exception
            goto Lb8
        L63:
            java.util.LinkedHashMap r1 = r10.f1441     // Catch: java.lang.Throwable -> L61
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
            int r0 = r0 - r1
            r10.f1445 = r0     // Catch: java.lang.Throwable -> L61
            int r0 = r2.f9655     // Catch: java.lang.Throwable -> L61
            r1 = -1
            if (r0 != r1) goto L75
            r10.m869()     // Catch: java.lang.Throwable -> L61
            goto L89
        L75:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L61
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L61
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61
            r5 = 1
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L61
            java.nio.charset.Charset r4 = defpackage.AbstractC1591.f7036     // Catch: java.lang.Throwable -> L61
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L61
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r10.f1440 = r0     // Catch: java.lang.Throwable -> L61
        L89:
            r2.close()     // Catch: java.lang.Exception -> L8c java.lang.RuntimeException -> L8d
        L8c:
            return
        L8d:
            r10 = move-exception
            throw r10
        L8f:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r4.append(r3)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r5)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r7)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r8)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "]"
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L61
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L61
            throw r10     // Catch: java.lang.Throwable -> L61
        Lb8:
            r2.close()     // Catch: java.lang.Exception -> Lbb java.lang.RuntimeException -> Lbc
        Lbb:
            throw r10
        Lbc:
            r10 = move-exception
            throw r10
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public final void m868() {
            r8 = this;
        L0:
            long r0 = r8.f1448
            long r2 = r8.f1439
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lb4
            java.util.LinkedHashMap r0 = r8.f1441
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            monitor-enter(r8)
            java.io.BufferedWriter r1 = r8.f1440     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto Laa
            java.util.LinkedHashMap r1 = r8.f1441     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L60
            ᛲᛲᛵᛱ r1 = (defpackage.C0251) r1     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto La7
            ᛴᛷᛳᲀ r2 = r1.f1467     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L33
            goto La7
        L33:
            r2 = 0
        L34:
            int r3 = r8.f1442     // Catch: java.lang.Throwable -> L60
            if (r2 >= r3) goto L72
            java.io.File[] r3 = r1.f1464     // Catch: java.lang.Throwable -> L60
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L60
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L62
            boolean r4 = r3.delete()     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L49
            goto L62
        L49:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "failed to delete "
            r1.append(r2)     // Catch: java.lang.Throwable -> L60
            r1.append(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L60
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            goto Lb2
        L62:
            long r3 = r8.f1448     // Catch: java.lang.Throwable -> L60
            long[] r5 = r1.f1466     // Catch: java.lang.Throwable -> L60
            r6 = r5[r2]     // Catch: java.lang.Throwable -> L60
            long r3 = r3 - r6
            r8.f1448 = r3     // Catch: java.lang.Throwable -> L60
            r3 = 0
            r5[r2] = r3     // Catch: java.lang.Throwable -> L60
            int r2 = r2 + 1
            goto L34
        L72:
            int r1 = r8.f1445     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + 1
            r8.f1445 = r1     // Catch: java.lang.Throwable -> L60
            java.io.BufferedWriter r1 = r8.f1440     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "REMOVE"
            r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.io.BufferedWriter r1 = r8.f1440     // Catch: java.lang.Throwable -> L60
            r2 = 32
            r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.io.BufferedWriter r1 = r8.f1440     // Catch: java.lang.Throwable -> L60
            r1.append(r0)     // Catch: java.lang.Throwable -> L60
            java.io.BufferedWriter r1 = r8.f1440     // Catch: java.lang.Throwable -> L60
            r2 = 10
            r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.util.LinkedHashMap r1 = r8.f1441     // Catch: java.lang.Throwable -> L60
            r1.remove(r0)     // Catch: java.lang.Throwable -> L60
            boolean r0 = r8.m865()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto La4
            java.util.concurrent.ThreadPoolExecutor r0 = r8.f1443     // Catch: java.lang.Throwable -> L60
            ᲀᲈᲇᛸ r1 = r8.f1451     // Catch: java.lang.Throwable -> L60
            r0.submit(r1)     // Catch: java.lang.Throwable -> L60
        La4:
            monitor-exit(r8)
            goto L0
        La7:
            monitor-exit(r8)
            goto L0
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "cache is closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        Lb2:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L60
            throw r0
        Lb4:
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public final synchronized void m869() {
            r6 = this;
            monitor-enter(r6)
            java.io.BufferedWriter r0 = r6.f1440     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lc
            m861(r0)     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r0 = move-exception
            goto Le8
        Lc:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L9
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L9
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9
            java.io.File r3 = r6.f1444     // Catch: java.lang.Throwable -> L9
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9
            java.nio.charset.Charset r3 = defpackage.AbstractC1591.f7036     // Catch: java.lang.Throwable -> L9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            int r1 = r6.f1452     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L8a
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            int r1 = r6.f1442     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L8a
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> L8a
            java.util.LinkedHashMap r1 = r6.f1441     // Catch: java.lang.Throwable -> L8a
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8a
        L5e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8a
            ᛲᛲᛵᛱ r2 = (defpackage.C0251) r2     // Catch: java.lang.Throwable -> L8a
            ᛴᛷᛳᲀ r3 = r2.f1467     // Catch: java.lang.Throwable -> L8a
            r4 = 10
            if (r3 == 0) goto L8c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r3.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = "DIRTY "
            r3.append(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = r2.f1465     // Catch: java.lang.Throwable -> L8a
            r3.append(r2)     // Catch: java.lang.Throwable -> L8a
            r3.append(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8a
            r0.write(r2)     // Catch: java.lang.Throwable -> L8a
            goto L5e
        L8a:
            r1 = move-exception
            goto Le4
        L8c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r3.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = "CLEAN "
            r3.append(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r2.f1465     // Catch: java.lang.Throwable -> L8a
            r3.append(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = r2.m874()     // Catch: java.lang.Throwable -> L8a
            r3.append(r2)     // Catch: java.lang.Throwable -> L8a
            r3.append(r4)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L8a
            r0.write(r2)     // Catch: java.lang.Throwable -> L8a
            goto L5e
        Lad:
            m861(r0)     // Catch: java.lang.Throwable -> L9
            java.io.File r0 = r6.f1446     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L9
            r1 = 1
            if (r0 == 0) goto Lc0
            java.io.File r0 = r6.f1446     // Catch: java.lang.Throwable -> L9
            java.io.File r2 = r6.f1450     // Catch: java.lang.Throwable -> L9
            m860(r0, r2, r1)     // Catch: java.lang.Throwable -> L9
        Lc0:
            java.io.File r0 = r6.f1444     // Catch: java.lang.Throwable -> L9
            java.io.File r2 = r6.f1446     // Catch: java.lang.Throwable -> L9
            r3 = 0
            m860(r0, r2, r3)     // Catch: java.lang.Throwable -> L9
            java.io.File r0 = r6.f1450     // Catch: java.lang.Throwable -> L9
            r0.delete()     // Catch: java.lang.Throwable -> L9
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L9
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L9
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9
            java.io.File r4 = r6.f1446     // Catch: java.lang.Throwable -> L9
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L9
            java.nio.charset.Charset r1 = defpackage.AbstractC1591.f7036     // Catch: java.lang.Throwable -> L9
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9
            r6.f1440 = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r6)
            return
        Le4:
            m861(r0)     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> L9
        Le8:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public final void m870(java.lang.String r8) {
            r7 = this;
            r0 = 32
            int r1 = r8.indexOf(r0)
            java.lang.String r2 = "unexpected journal line: "
            r3 = -1
            if (r1 == r3) goto Lac
            int r4 = r1 + 1
            int r0 = r8.indexOf(r0, r4)
            java.util.LinkedHashMap r5 = r7.f1441
            if (r0 != r3) goto L28
            java.lang.String r4 = r8.substring(r4)
            r6 = 6
            if (r1 != r6) goto L2c
            java.lang.String r6 = "REMOVE"
            boolean r6 = r8.startsWith(r6)
            if (r6 == 0) goto L2c
            r5.remove(r4)
            return
        L28:
            java.lang.String r4 = r8.substring(r4, r0)
        L2c:
            java.lang.Object r6 = r5.get(r4)
            ᛲᛲᛵᛱ r6 = (defpackage.C0251) r6
            if (r6 != 0) goto L3c
            ᛲᛲᛵᛱ r6 = new ᛲᛲᛵᛱ
            r6.<init>(r7, r4)
            r5.put(r4, r6)
        L3c:
            r4 = 5
            if (r0 == r3) goto L82
            if (r1 != r4) goto L82
            java.lang.String r5 = "CLEAN"
            boolean r5 = r8.startsWith(r5)
            if (r5 == 0) goto L82
            r7 = 1
            int r0 = r0 + r7
            java.lang.String r8 = r8.substring(r0)
            java.lang.String r0 = " "
            java.lang.String[] r8 = r8.split(r0)
            r6.f1462 = r7
            r7 = 0
            r6.f1467 = r7
            int r7 = r8.length
            ᛲᛲᛳᛳ r0 = r6.f1468
            int r0 = r0.f1442
            if (r7 != r0) goto L7a
            r7 = 0
        L62:
            int r0 = r8.length     // Catch: java.lang.NumberFormatException -> L72
            if (r7 >= r0) goto La3
            long[] r0 = r6.f1466     // Catch: java.lang.NumberFormatException -> L72
            r1 = r8[r7]     // Catch: java.lang.NumberFormatException -> L72
            long r3 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L72
            r0[r7] = r3     // Catch: java.lang.NumberFormatException -> L72
            int r7 = r7 + 1
            goto L62
        L72:
            java.lang.String r7 = java.util.Arrays.toString(r8)
            defpackage.C2264.m3683(r7, r2)
            return
        L7a:
            java.lang.String r7 = java.util.Arrays.toString(r8)
            defpackage.C2264.m3683(r7, r2)
            return
        L82:
            if (r0 != r3) goto L96
            if (r1 != r4) goto L96
            java.lang.String r4 = "DIRTY"
            boolean r4 = r8.startsWith(r4)
            if (r4 == 0) goto L96
            ᛴᛷᛳᲀ r8 = new ᛴᛷᛳᲀ
            r8.<init>(r7, r6)
            r6.f1467 = r8
            return
        L96:
            if (r0 != r3) goto La4
            r7 = 4
            if (r1 != r7) goto La4
            java.lang.String r7 = "READ"
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto La4
        La3:
            return
        La4:
            java.lang.String r7 = r2.concat(r8)
            defpackage.C2264.m3682(r7)
            return
        Lac:
            java.lang.String r7 = r2.concat(r8)
            defpackage.C2264.m3682(r7)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final synchronized void m871(defpackage.C0703 r10, boolean r11) {
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r10.f3356     // Catch: java.lang.Throwable -> L2c
            ᛲᛲᛵᛱ r0 = (defpackage.C0251) r0     // Catch: java.lang.Throwable -> L2c
            ᛴᛷᛳᲀ r1 = r0.f1467     // Catch: java.lang.Throwable -> L2c
            if (r1 != r10) goto Lf6
            r1 = 0
            if (r11 == 0) goto L4c
            boolean r2 = r0.f1462     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L4c
            r2 = r1
        L11:
            int r3 = r9.f1442     // Catch: java.lang.Throwable -> L2c
            if (r2 >= r3) goto L4c
            java.lang.Object r3 = r10.f3354     // Catch: java.lang.Throwable -> L2c
            boolean[] r3 = (boolean[]) r3     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3[r2]     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L32
            java.io.File[] r3 = r0.f1463     // Catch: java.lang.Throwable -> L2c
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L2f
            r10.m1597()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r9)
            return
        L2c:
            r10 = move-exception
            goto Lfc
        L2f:
            int r2 = r2 + 1
            goto L11
        L32:
            r10.m1597()     // Catch: java.lang.Throwable -> L2c
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r11.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch: java.lang.Throwable -> L2c
            r11.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2c
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L2c
            throw r10     // Catch: java.lang.Throwable -> L2c
        L4c:
            int r10 = r9.f1442     // Catch: java.lang.Throwable -> L2c
            if (r1 >= r10) goto L7c
            java.io.File[] r10 = r0.f1463     // Catch: java.lang.Throwable -> L2c
            r10 = r10[r1]     // Catch: java.lang.Throwable -> L2c
            if (r11 == 0) goto L76
            boolean r2 = r10.exists()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L79
            java.io.File[] r2 = r0.f1464     // Catch: java.lang.Throwable -> L2c
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L2c
            r10.renameTo(r2)     // Catch: java.lang.Throwable -> L2c
            long[] r10 = r0.f1466     // Catch: java.lang.Throwable -> L2c
            r3 = r10[r1]     // Catch: java.lang.Throwable -> L2c
            long r5 = r2.length()     // Catch: java.lang.Throwable -> L2c
            long[] r10 = r0.f1466     // Catch: java.lang.Throwable -> L2c
            r10[r1] = r5     // Catch: java.lang.Throwable -> L2c
            long r7 = r9.f1448     // Catch: java.lang.Throwable -> L2c
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f1448 = r7     // Catch: java.lang.Throwable -> L2c
            goto L79
        L76:
            m859(r10)     // Catch: java.lang.Throwable -> L2c
        L79:
            int r1 = r1 + 1
            goto L4c
        L7c:
            int r10 = r9.f1445     // Catch: java.lang.Throwable -> L2c
            r1 = 1
            int r10 = r10 + r1
            r9.f1445 = r10     // Catch: java.lang.Throwable -> L2c
            r10 = 0
            r0.f1467 = r10     // Catch: java.lang.Throwable -> L2c
            boolean r10 = r0.f1462     // Catch: java.lang.Throwable -> L2c
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto Lbb
            r0.f1462 = r1     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            r10.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r0.f1465     // Catch: java.lang.Throwable -> L2c
            r10.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.m874()     // Catch: java.lang.Throwable -> L2c
            r10.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            r10.append(r2)     // Catch: java.lang.Throwable -> L2c
            if (r11 == 0) goto Lda
            long r10 = r9.f1449     // Catch: java.lang.Throwable -> L2c
            r0 = 1
            long r10 = r10 + r0
            r9.f1449 = r10     // Catch: java.lang.Throwable -> L2c
            goto Lda
        Lbb:
            java.util.LinkedHashMap r10 = r9.f1441     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = r0.f1465     // Catch: java.lang.Throwable -> L2c
            r10.remove(r11)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            r10.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = r0.f1465     // Catch: java.lang.Throwable -> L2c
            r10.append(r11)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            r10.append(r2)     // Catch: java.lang.Throwable -> L2c
        Lda:
            java.io.BufferedWriter r10 = r9.f1440     // Catch: java.lang.Throwable -> L2c
            m858(r10)     // Catch: java.lang.Throwable -> L2c
            long r10 = r9.f1448     // Catch: java.lang.Throwable -> L2c
            long r0 = r9.f1439     // Catch: java.lang.Throwable -> L2c
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto Led
            boolean r10 = r9.m865()     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto Lf4
        Led:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f1443     // Catch: java.lang.Throwable -> L2c
            ᲀᲈᲇᛸ r11 = r9.f1451     // Catch: java.lang.Throwable -> L2c
            r10.submit(r11)     // Catch: java.lang.Throwable -> L2c
        Lf4:
            monitor-exit(r9)
            return
        Lf6:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            r10.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r10     // Catch: java.lang.Throwable -> L2c
        Lfc:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2c
            throw r10
    }
}
