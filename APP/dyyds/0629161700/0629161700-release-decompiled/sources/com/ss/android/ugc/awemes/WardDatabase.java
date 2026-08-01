package com.ss.android.ugc.awemes;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WardDatabase {

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final defpackage.C1487 f425 = null;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static final defpackage.C0589 f426 = null;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static volatile com.ss.android.ugc.awemes.WardDatabase f427;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final defpackage.C0589 f428 = null;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static final defpackage.C0589 f429 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f430;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f431;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.lang.ThreadLocal f432;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C1902 f433;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.ExecutorC0456 f434;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.util.concurrent.Executor f435;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C0554 f436;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f437;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.InterfaceC0493 f438;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C1541 f439;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0682 f440;

    static {
            r0 = -864336683114030(0xfffcede3ef0961d2, double:NaN)
            ᛸᛵᛴᛲ r0 = new ᛸᛵᛴᛲ
            r0.<init>()
            com.ss.android.ugc.awemes.WardDatabase.f425 = r0
            ᛳᲈᛴ r0 = new ᛳᲈᛴ
            r1 = 0
            r2 = 1
            r3 = 2
            r0.<init>(r2, r3, r1)
            com.ss.android.ugc.awemes.WardDatabase.f428 = r0
            ᛳᲈᛴ r0 = new ᛳᲈᛴ
            r1 = 1
            r2 = 3
            r0.<init>(r3, r2, r1)
            com.ss.android.ugc.awemes.WardDatabase.f426 = r0
            ᛳᲈᛴ r0 = new ᛳᲈᛴ
            r1 = 4
            r0.<init>(r2, r1, r3)
            com.ss.android.ugc.awemes.WardDatabase.f429 = r0
            return
    }

    public WardDatabase() {
            r2 = this;
            r2.<init>()
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ
            r1 = 14
            r0.<init>(r1)
            r2.f440 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f432 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.f437 = r0
            r0 = 1
            r2.f431 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean m299() {
            r0 = this;
            ᲁᛸᲀᛸ r0 = r0.f433
            if (r0 != 0) goto L5
            r0 = 0
        L5:
            ᲁᛱᲀᛲ r0 = r0.f8264
            if (r0 == 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean m300() {
            r0 = this;
            ᲁᛸᲀᛸ r0 = r0.f433
            if (r0 != 0) goto L5
            r0 = 0
        L5:
            ᛴᛲᲈᲀ r0 = r0.f8257
            if (r0 == 0) goto Le
            boolean r0 = r0.isOpen()
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m301(defpackage.RunnableC1241 r6) {
            r5 = this;
            ᛲᲀ r0 = new ᛲᲀ
            r1 = 15
            r0.<init>(r1, r6)
            boolean r6 = r5.m299()
            if (r6 == 0) goto L63
            r5.m307()
            r5.m307()
            ᲁᛱᲀᛲ r6 = r5.m303()
            ᛴᛲᲈᲀ r6 = r6.mo3193()
            boolean r1 = r6.m1470()
            if (r1 != 0) goto L3d
            ᛸᛸᛶᲈ r1 = r5.f439
            r2 = 0
            if (r1 != 0) goto L27
            r1 = r2
        L27:
            r1.getClass()
            ᛱᛶᛵᛸ r3 = new ᛱᛶᛵᛸ
            r4 = 2
            r3.<init>(r1, r2, r4)
            java.lang.Thread.interrupted()
            ᲇᛶᲁᲇ r1 = new ᲇᛶᲁᲇ
            r1.<init>(r3, r2)
            ᛲᛶᛳᛱ r2 = defpackage.C0303.f1620
            defpackage.AbstractC0498.m1270(r2, r1)
        L3d:
            android.database.sqlite.SQLiteDatabase r1 = r6.f3141
            boolean r1 = r1.isWriteAheadLoggingEnabled()
            if (r1 == 0) goto L49
            r6.m1471()
            goto L4c
        L49:
            r6.m1469()
        L4c:
            r0.mo1032()     // Catch: java.lang.Throwable -> L5e
            ᲁᛱᲀᛲ r6 = r5.m303()     // Catch: java.lang.Throwable -> L5e
            ᛴᛲᲈᲀ r6 = r6.mo3193()     // Catch: java.lang.Throwable -> L5e
            r6.m1467()     // Catch: java.lang.Throwable -> L5e
            r5.m308()
            return
        L5e:
            r6 = move-exception
            r5.m308()
            throw r6
        L63:
            ᲈᲈᛸᲁ r6 = new ᲈᲈᛸᲁ
            r1 = 8
            r6.<init>(r1, r0)
            defpackage.AbstractC2193.m3592(r5, r6)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean m302() {
            r1 = this;
            boolean r0 = r1.m300()
            if (r0 == 0) goto L16
            ᲁᛱᲀᛲ r1 = r1.m303()
            ᛴᛲᲈᲀ r1 = r1.mo3193()
            boolean r1 = r1.m1470()
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC1801 m303() {
            r1 = this;
            ᲁᛸᲀᛸ r1 = r1.f433
            r0 = 0
            if (r1 != 0) goto L6
            r1 = r0
        L6:
            ᲁᛱᲀᛲ r1 = r1.f8264
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = "Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room."
            defpackage.C2264.m3676(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final java.lang.Object m304(boolean r1, defpackage.InterfaceC2087 r2, defpackage.AbstractC1016 r3) {
            r0 = this;
            ᲁᛸᲀᛸ r0 = r0.f433
            if (r0 != 0) goto L5
            r0 = 0
        L5:
            ᲀᛳᛶᛲ r0 = r0.f8263
            java.lang.Object r0 = r0.mo2654(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.AbstractC2126 mo305() {
            r0 = this;
            ᛱᛶᲀᲇ r0 = new ᛱᛶᲀᲇ
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public abstract defpackage.C1541 mo306();

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m307() {
            r1 = this;
            boolean r1 = r1.f430
            if (r1 == 0) goto L5
            goto L18
        L5:
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L19
        L18:
            return
        L19:
            java.lang.String r1 = "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."
            defpackage.C2264.m3676(r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void m308() {
            r2 = this;
            ᲁᛱᲀᛲ r0 = r2.m303()
            ᛴᛲᲈᲀ r0 = r0.mo3193()
            r0.m1468()
            boolean r0 = r2.m302()
            if (r0 != 0) goto L1f
            ᛸᛸᛶᲈ r2 = r2.f439
            if (r2 != 0) goto L16
            r2 = 0
        L16:
            ᛶᛲᛵᲀ r0 = r2.f6842
            ᛷᛸᛵ r1 = r2.f6846
            ᛷᛸᛵ r2 = r2.f6847
            r0.m1975(r1, r2)
        L1f:
            return
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public abstract defpackage.C0312 mo309();

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.util.List mo310(java.util.LinkedHashMap r3) {
            r2 = this;
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r0 = r3.size()
            int r0 = defpackage.AbstractC1893.m3323(r0)
            r2.<init>(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            ᛲᲀᲈᛳ r1 = (defpackage.C0355) r1
            ᲇᲇᛲᲈ r1 = (defpackage.InterfaceC2139) r1
            java.lang.Class r1 = r1.mo1084()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L15
        L35:
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.util.Set mo311() {
            r1 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            ᛵᲈᛳᲀ r0 = defpackage.C0993.f4434
            int r0 = defpackage.AbstractC0575.m1369(r0)
            r1.<init>(r0)
            java.util.Set r1 = defpackage.AbstractC1107.m2121(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.util.LinkedHashMap mo312() {
            r1 = this;
            ᛵᲈᛳᲀ r1 = defpackage.C0993.f4434
            int r1 = defpackage.AbstractC0575.m1369(r1)
            int r1 = defpackage.AbstractC1893.m3323(r1)
            r0 = 16
            if (r1 >= r0) goto Lf
            r1 = r0
        Lf:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }
}
