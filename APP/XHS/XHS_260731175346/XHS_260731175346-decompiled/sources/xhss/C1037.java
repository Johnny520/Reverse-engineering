package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛵᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1037 implements xhss.InterfaceC0010, xhss.InterfaceC0285, xhss.InterfaceC0142, xhss.InterfaceC0825, xhss.InterfaceC1060, xhss.InterfaceC0521 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final java.lang.Object f3347 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3348;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object f3349;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            xhss.C1037.f3347 = r0
            return
    }

    public C1037(int r4) {
            r3 = this;
            r3.f3348 = r4
            switch(r4) {
                case 4: goto L2f;
                case 13: goto L20;
                case 19: goto L15;
                case 23: goto L11;
                default: goto L5;
            }
        L5:
            xhss.ᛷᛱᛳᲁ r4 = xhss.AbstractC0518.f1885
            java.lang.Object r4 = r4.f2152
            xhss.ᛸᛵᛷᲁ r4 = (xhss.C0768) r4
            r3.<init>()
            r3.f3349 = r4
            return
        L11:
            r3.<init>()
            return
        L15:
            r3.<init>()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r3.f3349 = r4
            return
        L20:
            r3.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1
            r1 = 0
            r2 = 1061158912(0x3f400000, float:0.75)
            r4.<init>(r1, r2, r0)
            r3.f3349 = r4
            return
        L2f:
            xhss.ᛸᛱᛴᛳ r4 = xhss.C0723.f2441
            xhss.ᲈᛲᲀᛵ r0 = new xhss.ᲈᛲᲀᛵ
            r0.<init>(r4)
            r3.<init>()
            r3.f3349 = r0
            return
    }

    public /* synthetic */ C1037(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3348 = r1
            r0.f3349 = r2
            r0.<init>()
            return
    }

    public C1037(android.content.Context r2) {
            r1 = this;
            r0 = 7
            r1.f3348 = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.f3349 = r2
            return
    }

    public C1037(android.widget.LinearLayout r1, android.widget.Button r2, android.widget.Button r3) {
            r0 = this;
            r1 = 16
            r0.f3348 = r1
            r0.<init>()
            r0.f3349 = r3
            return
    }

    public C1037(xhss.AbstractC0195 r2, int r3) {
            r1 = this;
            r1.f3348 = r3
            switch(r3) {
                case 8: goto L12;
                default: goto L5;
            }
        L5:
            r1.<init>()
            xhss.ᲇᛵᛲᲁ r3 = new xhss.ᲇᛵᛲᲁ
            r0 = 8
            r3.<init>(r2, r0)
            r1.f3349 = r3
            return
        L12:
            r1.<init>()
            xhss.ᛳᛱᛲᲀ r3 = new xhss.ᛳᛱᛲᲀ
            r3.<init>(r2)
            r1.f3349 = r3
            return
    }

    public C1037(xhss.ThreadFactoryC0760 r10) {
            r9 = this;
            r0 = 22
            r9.f3348 = r0
            r9.<init>()
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r8 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r9.f3349 = r1
            return
    }

    public C1037(xhss.AbstractC0796 r2) {
            r1 = this;
            r0 = 9
            r1.f3348 = r0
            r1.<init>()
            xhss.ᲈᛸᛷᲁ r0 = new xhss.ᲈᛸᛷᲁ
            r0.<init>(r2)
            r1.f3349 = r0
            return
    }

    @Override // xhss.InterfaceC0521
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public xhss.C0946 mo929() {
            r0 = this;
            java.lang.Object r0 = r0.f3349
            xhss.ᲁᛴᛶᛸ r0 = (xhss.C0946) r0
            return r0
    }

    @Override // xhss.InterfaceC0142
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public void mo373(xhss.C0803 r3) {
            r2 = this;
            r0 = -344293630117957(0xfffec6dde47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            java.lang.Object r2 = r2.f3349
            xhss.ᛳᛱᛲᲀ r2 = (xhss.C0230) r2
            java.lang.Object r2 = r2.f893     // Catch: java.lang.Throwable -> L18
            xhss.ᛷᛴᛲᛲ r2 = (xhss.InterfaceC0645) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            r2.mo112(r3)     // Catch: java.lang.Throwable -> L18
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L18
            goto L22
        L18:
            r2 = move-exception
            goto L1c
        L1a:
            r2 = 0
            goto L22
        L1c:
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r2)
            r2 = r3
        L22:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r2)
            if (r2 == 0) goto L49
            r0 = -344332284823621(0xfffec6d4e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r0)
            r0 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r0 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r0.getClass()
            xhss.C1085.m1764(r3, r2)
        L49:
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public xhss.C0653 m1687() {
            r1 = this;
            xhss.ᛷᛴᲀᛳ r0 = new xhss.ᛷᛴᲀᛳ
            r0.<init>()
            java.lang.Object r1 = r1.f3349
            xhss.ᛸᛵᲇᲈ r1 = (xhss.C0772) r1
            r0.f1798 = r1
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public java.lang.String m1688(java.lang.Object r2) {
            r1 = this;
            boolean r1 = r2 instanceof java.util.Map
            if (r1 == 0) goto Ld
            java.util.Map r2 = (java.util.Map) r2
            xhss.ᲇᛳᛶ r1 = xhss.C1021.f3317
            java.lang.String r1 = xhss.C0735.m1277(r2, r1)
            return r1
        Ld:
            boolean r1 = r2 instanceof java.util.List
            if (r1 == 0) goto L1a
            java.util.List r2 = (java.util.List) r2
            xhss.ᲇᛳᛶ r1 = xhss.C1021.f3317
            java.lang.String r1 = xhss.C0731.m1274(r2, r1)
            return r1
        L1a:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 != 0) goto L37
            boolean r1 = r2 instanceof java.lang.Boolean
            if (r1 == 0) goto L23
            goto L37
        L23:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = " can not be converted to JSON"
            java.lang.String r2 = r2.concat(r0)
            r1.<init>(r2)
            throw r1
        L37:
            xhss.ᲇᛳᛶ r1 = xhss.AbstractC0518.f1886
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xhss.AbstractC0518.m927(r2, r0, r1)     // Catch: java.io.IOException -> L41
        L41:
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public void m1689(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L14
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            if (r1 != r0) goto L10
            r2.add(r3)
            return
        L10:
            r2.set(r1, r3)
            return
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // xhss.InterfaceC0825
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public void mo1032(int r3, java.lang.Object r4) {
            r2 = this;
            switch(r3) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L3;
                case 10: goto L9;
                case 11: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = ""
            goto L23
        L6:
            java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L23
        L9:
            java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L23
        Lc:
            java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
            goto L23
        Lf:
            java.lang.String r0 = "RESULT_IO_EXCEPTION"
            goto L23
        L12:
            java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L23
        L15:
            java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L23
        L18:
            java.lang.String r0 = "RESULT_NOT_WRITABLE"
            goto L23
        L1b:
            java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L23
        L1e:
            java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
            goto L23
        L21:
            java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
        L23:
            r1 = 6
            if (r3 == r1) goto L2e
            r1 = 7
            if (r3 == r1) goto L2e
            r1 = 8
            if (r3 == r1) goto L2e
            goto L35
        L2e:
            java.lang.String r1 = "ProfileInstaller"
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            android.util.Log.e(r1, r0, r4)
        L35:
            java.lang.Object r2 = r2.f3349
            androidx.profileinstaller.ProfileInstallReceiver r2 = (androidx.profileinstaller.ProfileInstallReceiver) r2
            r2.setResultCode(r3)
            return
    }

    @Override // xhss.InterfaceC0521
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public xhss.C1184 mo930() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r5.f3349
            xhss.ᲁᛴᛶᛸ r2 = (xhss.C0946) r2
            xhss.ᛸᲇᲇᛶ r2 = r2.f3081
            boolean r2 = r2.f2667
            if (r2 != 0) goto L5d
            java.lang.Object r2 = r5.f3349     // Catch: java.io.IOException -> L30
            xhss.ᲁᛴᛶᛸ r2 = (xhss.C0946) r2     // Catch: java.io.IOException -> L30
            xhss.ᛱᛸᲁᛶ r2 = r2.m1540()     // Catch: java.io.IOException -> L30
            boolean r3 = r2.mo242()     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L45
            xhss.ᛲᛷᛷᛵ r3 = r2.mo241()     // Catch: java.io.IOException -> L30
            xhss.ᛱᛸᲁᛶ r4 = r3.f745     // Catch: java.io.IOException -> L30
            if (r4 != 0) goto L28
            java.lang.Throwable r4 = r3.f746     // Catch: java.io.IOException -> L30
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 == 0) goto L32
            xhss.ᛲᛷᛷᛵ r3 = r2.mo238()     // Catch: java.io.IOException -> L30
            goto L32
        L30:
            r2 = move-exception
            goto L4a
        L32:
            xhss.ᛱᛸᲁᛶ r4 = r3.f745     // Catch: java.io.IOException -> L30
            java.lang.Throwable r3 = r3.f746     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L44
            if (r4 == 0) goto L45
            java.lang.Object r2 = r5.f3349     // Catch: java.io.IOException -> L30
            xhss.ᲁᛴᛶᛸ r2 = (xhss.C0946) r2     // Catch: java.io.IOException -> L30
            xhss.ᛸᲀᛷᛷ r2 = r2.f3069     // Catch: java.io.IOException -> L30
            r2.addFirst(r4)     // Catch: java.io.IOException -> L30
            goto L2
        L44:
            throw r3     // Catch: java.io.IOException -> L30
        L45:
            xhss.ᲈᲁᛲᲇ r5 = r2.mo239()     // Catch: java.io.IOException -> L30
            return r5
        L4a:
            if (r1 != 0) goto L4e
            r1 = r2
            goto L51
        L4e:
            xhss.AbstractC1178.m1874(r1, r2)
        L51:
            java.lang.Object r2 = r5.f3349
            xhss.ᲁᛴᛶᛸ r2 = (xhss.C0946) r2
            boolean r2 = r2.m1542(r0)
            if (r2 == 0) goto L5c
            goto L2
        L5c:
            throw r1
        L5d:
            java.lang.String r5 = "Canceled"
            xhss.C0532.m947(r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public java.util.Set m1690(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof java.util.List
            if (r0 != 0) goto Lb
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r0 = r1.keySet()
            return r0
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public java.lang.Iterable m1691(java.lang.Object r3) {
            r2 = this;
            boolean r2 = r3 instanceof java.util.List
            if (r2 == 0) goto L7
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            return r3
        L7:
            xhss.ᛵᛲᛲᲇ r2 = new xhss.ᛵᛲᛲᲇ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot iterate over "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public void m1692(xhss.AbstractC0252 r2) {
            r1 = this;
            java.lang.Object r1 = r1.f3349
            xhss.ᲀᛷᲈᛳ r1 = (xhss.C0881) r1
            xhss.ᛳᛳᛵᛱ r0 = r1.f2840
            r0.f936 = r2
            r2.f939 = r0
            r1.f2840 = r2
            return
    }

    @Override // xhss.InterfaceC0285
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public void mo372(xhss.AbstractC0007 r9) {
            r8 = this;
            xhss.ᛱᛴᲁᲇ r7 = new xhss.ᛱᛴᲁᲇ
            java.lang.String r0 = "EmojiCompatInitializer"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            xhss.ᛲᛶᛴᛳ r1 = new xhss.ᛲᛶᛴᛳ
            r1.<init>(r8, r9, r0)
            r0.execute(r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public void m1693(boolean r5) {
            r4 = this;
            java.lang.Object r4 = r4.f3349
            xhss.ᲇᛵᛲᲁ r4 = (xhss.C1037) r4
            java.lang.Object r4 = r4.f3349
            xhss.ᛳᛱᛲᲀ r4 = (xhss.C0230) r4
            java.lang.Object r4 = r4.f894
            xhss.ᲁᲇᲇᛸ r4 = (xhss.C0998) r4
            boolean r0 = r4.f3261
            if (r0 == r5) goto L52
            xhss.ᛷᛶᛳᛷ r0 = r4.f3260
            if (r0 == 0) goto L41
            xhss.ᛵᲁᛱᲁ r0 = xhss.C0514.m921()
            xhss.ᛷᛶᛳᛷ r1 = r4.f3260
            r0.getClass()
            java.lang.String r2 = "initCallback cannot be null"
            xhss.AbstractC0060.m191(r1, r2)
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r0.f1873
            java.util.concurrent.locks.Lock r3 = r2.writeLock()
            r3.lock()
            xhss.ᛴᛲᛴᲇ r0 = r0.f1870     // Catch: java.lang.Throwable -> L38
            r0.remove(r1)     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.locks.Lock r0 = r2.writeLock()
            r0.unlock()
            goto L41
        L38:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = r2.writeLock()
            r5.unlock()
            throw r4
        L41:
            r4.f3261 = r5
            if (r5 == 0) goto L52
            xhss.ᛲᛸᛳᛳ r4 = r4.f3262
            xhss.ᛵᲁᛱᲁ r5 = xhss.C0514.m921()
            int r5 = r5.m922()
            xhss.C0998.m1636(r4, r5)
        L52:
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public int m1694(int r3) {
            r2 = this;
            java.lang.Object r2 = r2.f3349
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r2
            int[] r2 = r2.f105
            int r3 = xhss.AbstractC0390.m784(r3)
            r0 = 0
            if (r3 == 0) goto L20
            r1 = 1
            if (r3 == r1) goto L1d
            r1 = 2
            if (r3 == r1) goto L1a
            r1 = 3
            if (r3 == r1) goto L17
            return r0
        L17:
            r2 = r2[r1]
            return r2
        L1a:
            r2 = r2[r1]
            return r2
        L1d:
            r2 = r2[r1]
            return r2
        L20:
            r2 = r2[r0]
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public xhss.C0508 m1695() {
            r1 = this;
            xhss.ᛵᛸᲈᛲ r0 = new xhss.ᛵᛸᲈᛲ
            r0.<init>()
            java.lang.Object r1 = r1.f3349
            xhss.ᛸᛵᲇᲈ r1 = (xhss.C0772) r1
            r0.f1798 = r1
            return r0
    }

    @Override // xhss.InterfaceC0142
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public void mo374(xhss.C0466 r3) {
            r2 = this;
            r0 = -344418184169541(0xfffec6c0e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            java.lang.Object r2 = r2.f3349
            xhss.ᛳᛱᛲᲀ r2 = (xhss.C0230) r2
            java.lang.Object r2 = r2.f894     // Catch: java.lang.Throwable -> L18
            xhss.ᛷᛴᛲᛲ r2 = (xhss.InterfaceC0645) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            r2.mo112(r3)     // Catch: java.lang.Throwable -> L18
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L18
            goto L22
        L18:
            r2 = move-exception
            goto L1c
        L1a:
            r2 = 0
            goto L22
        L1c:
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r2)
            r2 = r3
        L22:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r2)
            if (r2 == 0) goto L49
            r0 = -344456838875205(0xfffec6b7e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r0)
            r0 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r0 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r0.getClass()
            xhss.C1085.m1764(r3, r2)
        L49:
            return
    }

    @Override // xhss.InterfaceC0010
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public void mo107() {
            r2 = this;
            int r0 = r2.f3348
            switch(r0) {
                case 3: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r2.f3349
            xhss.ᲁᛳᛵᛷ r2 = (xhss.C0935) r2
            xhss.ᛱᛴᛳᛴ r2 = r2.f3025
            boolean r0 = r2.mo145()
            if (r0 == 0) goto L12
            goto L21
        L12:
            boolean r0 = r2.mo146()
            if (r0 == 0) goto L21
            xhss.ᲇᛶᲈᛸ r0 = new xhss.ᲇᛶᲈᛸ
            r1 = 1
            r0.<init>(r2, r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
        L21:
            return
        L22:
            java.lang.Object r2 = r2.f3349
            xhss.ᛲᛵᛶᲁ r2 = (xhss.C0158) r2
            xhss.ᛵᲇᲀᛳ r2 = r2.f654
            boolean r0 = r2.f86
            if (r0 == 0) goto L2f
            r2.m932()
        L2f:
            return
    }

    @Override // xhss.InterfaceC1060
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public boolean mo536(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.f3349
            xhss.ᛵᲈᛷ r0 = (xhss.C0530) r0
            xhss.ᲀᛲᲇ r0 = r0.f1940
            xhss.ᲇᛵᛲᲁ r0 = r0.f2745
            r0.getClass()
            boolean r0 = r1 instanceof java.util.List
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public int m1696(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Lb
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            return r1
        Lb:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L18
            java.util.Set r1 = r1.m1690(r2)
            int r1 = r1.size()
            return r1
        L18:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L23
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r2.length()
            return r1
        L23:
            xhss.ᛵᛲᛲᲇ r1 = new xhss.ᛵᛲᛲᲇ
            if (r2 == 0) goto L30
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            goto L32
        L30:
            java.lang.String r2 = "null"
        L32:
            java.lang.String r0 = "length operation cannot be applied to "
            java.lang.String r2 = r0.concat(r2)
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public android.text.method.KeyListener m1697(android.text.method.KeyListener r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L18
            boolean r0 = r1 instanceof xhss.C0574
            if (r0 == 0) goto L9
            return r1
        L9:
            if (r1 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            boolean r0 = r1 instanceof android.text.method.NumberKeyListener
            if (r0 == 0) goto L12
            return r1
        L12:
            xhss.ᛶᛷᛴᛸ r0 = new xhss.ᛶᛷᛴᛸ
            r0.<init>(r1)
            return r0
        L18:
            return r1
    }
}
