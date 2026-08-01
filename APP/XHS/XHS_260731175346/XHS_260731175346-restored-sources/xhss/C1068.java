package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1068 implements xhss.InterfaceC0268 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3443;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object f3444;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.lang.Object f3445;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Object f3446;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public java.lang.Object f3447;

    public C1068(int r2) {
            r1 = this;
            r1.f3443 = r2
            switch(r2) {
                case 1: goto L44;
                case 2: goto L5;
                case 3: goto L2b;
                case 4: goto L5;
                case 5: goto L17;
                default: goto L5;
            }
        L5:
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r2.<init>()
            r1.f3444 = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f3445 = r2
            return
        L17:
            r1.<init>()
            xhss.ᛳᛴᲀᲁ r2 = xhss.C0263.f974
            r1.f3447 = r2
            java.lang.String r2 = "GET"
            r1.f3446 = r2
            xhss.ᛴᲈᛱᲁ r2 = new xhss.ᛴᲈᛱᲁ
            r0 = 1
            r2.<init>(r0)
            r1.f3445 = r2
            return
        L2b:
            r1.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f3446 = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f3445 = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f3447 = r2
            return
        L44:
            r1.<init>()
            return
    }

    public C1068(android.graphics.Typeface r9, xhss.C0973 r10) {
            r8 = this;
            r0 = 4
            r8.f3443 = r0
            r8.<init>()
            r8.f3447 = r9
            r8.f3444 = r10
            xhss.ᲈᛲᛷᛳ r9 = new xhss.ᲈᛲᛷᛳ
            r1 = 1024(0x400, float:1.435E-42)
            r9.<init>(r1)
            r8.f3445 = r9
            r9 = 6
            int r1 = r10.m880(r9)
            r2 = 0
            if (r1 == 0) goto L30
            int r3 = r10.f1737
            int r1 = r1 + r3
            java.lang.Object r3 = r10.f1739
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r1)
            int r3 = r3 + r1
            java.lang.Object r1 = r10.f1739
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt(r3)
            goto L31
        L30:
            r1 = r2
        L31:
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            r8.f3446 = r1
            int r9 = r10.m880(r9)
            if (r9 == 0) goto L52
            int r1 = r10.f1737
            int r9 = r9 + r1
            java.lang.Object r1 = r10.f1739
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt(r9)
            int r1 = r1 + r9
            java.lang.Object r9 = r10.f1739
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            int r9 = r9.getInt(r1)
            goto L53
        L52:
            r9 = r2
        L53:
            r10 = r2
        L54:
            if (r10 >= r9) goto Ld7
            xhss.ᛵᛵᲇᛷ r1 = new xhss.ᛵᛵᲇᛷ
            r1.<init>(r8, r10)
            xhss.ᛲᲀᛴᲇ r3 = r1.m874()
            int r4 = r3.m880(r0)
            if (r4 == 0) goto L71
            java.lang.Object r5 = r3.f1739
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r3 = r3.f1737
            int r4 = r4 + r3
            int r3 = r5.getInt(r4)
            goto L72
        L71:
            r3 = r2
        L72:
            java.lang.Object r4 = r8.f3446
            char[] r4 = (char[]) r4
            int r5 = r10 * 2
            java.lang.Character.toChars(r3, r4, r5)
            xhss.ᛲᲀᛴᲇ r3 = r1.m874()
            r4 = 16
            int r5 = r3.m880(r4)
            if (r5 == 0) goto L9c
            int r6 = r3.f1737
            int r5 = r5 + r6
            java.lang.Object r6 = r3.f1739
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r6 = r6.getInt(r5)
            int r6 = r6 + r5
            java.lang.Object r3 = r3.f1739
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r6)
            goto L9d
        L9c:
            r3 = r2
        L9d:
            r5 = 1
            if (r3 <= 0) goto La2
            r3 = r5
            goto La3
        La2:
            r3 = r2
        La3:
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.f3445
            xhss.ᲈᛲᛷᛳ r3 = (xhss.C1126) r3
            xhss.ᛲᲀᛴᲇ r6 = r1.m874()
            int r4 = r6.m880(r4)
            if (r4 == 0) goto Lc8
            int r7 = r6.f1737
            int r4 = r4 + r7
            java.lang.Object r7 = r6.f1739
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r7 = r7.getInt(r4)
            int r7 = r7 + r4
            java.lang.Object r4 = r6.f1739
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.getInt(r7)
            goto Lc9
        Lc8:
            r4 = r2
        Lc9:
            int r4 = r4 - r5
            r3.m1820(r1, r2, r4)
            int r10 = r10 + 1
            goto L54
        Ld0:
            java.lang.String r8 = "invalid metadata codepoint length"
            xhss.C0532.m959(r8)
            r8 = 0
            throw r8
        Ld7:
            return
    }

    public C1068(java.net.Socket r2) {
            r1 = this;
            r0 = 2
            r1.f3443 = r0
            r1.<init>()
            r1.f3444 = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.f3446 = r2
            xhss.ᛸᲇᲈᛶ r2 = new xhss.ᛸᲇᲈᛶ
            r2.<init>(r1)
            r1.f3445 = r2
            xhss.ᛲᛶᲈᲀ r2 = new xhss.ᛲᛶᲈᲀ
            r2.<init>(r1)
            r1.f3447 = r2
            return
    }

    public /* synthetic */ C1068(boolean r1) {
            r0 = this;
            r1 = 5
            r0.f3443 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f3443
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.f3444
            java.net.Socket r1 = (java.net.Socket) r1
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public synchronized java.util.concurrent.ExecutorService m1727() {
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r9.f3444     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L38
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L36
            r7.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r0.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = xhss.AbstractC0559.f1983     // Catch: java.lang.Throwable -> L36
            r0.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = " Dispatcher"
            r0.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L36
            xhss.ᛸᛴᲇᛵ r8 = new xhss.ᛸᛴᲇᛵ     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r8.<init>(r0, r2)     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L36
            r9.f3444 = r1     // Catch: java.lang.Throwable -> L36
            r0 = r1
            goto L38
        L36:
            r0 = move-exception
            goto L3a
        L38:
            monitor-exit(r9)
            return r0
        L3a:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public void m1728(xhss.C0819 r6) {
            r5 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            java.util.concurrent.ExecutorService r0 = r5.m1727()
            boolean r0 = r0.isShutdown()
            monitor-enter(r5)
            java.lang.Object r1 = r5.f3447     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L22
            boolean r6 = r1.remove(r6)     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L9c
            if (r0 != 0) goto L25
            java.lang.Object r6 = r5.f3445     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6     // Catch: java.lang.Throwable -> L22
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L2d
            goto L25
        L22:
            r6 = move-exception
            goto La4
        L25:
            java.lang.Object r6 = r5.f3447     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6     // Catch: java.lang.Throwable -> L22
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L22
        L2d:
            r6 = 6
            r1 = 0
            if (r0 == 0) goto L46
            java.lang.Object r2 = r5.f3446     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch: java.lang.Throwable -> L22
            java.util.List r2 = xhss.AbstractC0713.m1243(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r5.f3446     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L22
            r3.clear()     // Catch: java.lang.Throwable -> L22
            xhss.ᲇᛵᛲᲁ r3 = new xhss.ᲇᛵᛲᲁ     // Catch: java.lang.Throwable -> L22
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L22
            goto L78
        L46:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r5.f3446     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L22
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L73
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r5.f3445     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L22
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L22
            r4 = 64
            if (r3 < r4) goto L6c
            goto L73
        L6c:
            throw r1     // Catch: java.lang.Throwable -> L22
        L6d:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L22
            r6.<init>()     // Catch: java.lang.Throwable -> L22
            throw r6     // Catch: java.lang.Throwable -> L22
        L73:
            xhss.ᲇᛵᛲᲁ r3 = new xhss.ᲇᛵᛲᲁ     // Catch: java.lang.Throwable -> L22
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L22
        L78:
            monitor-exit(r5)
            java.lang.Object r6 = r3.f3349
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            if (r6 <= 0) goto L9b
            java.lang.Object r6 = r3.f3349
            java.util.List r6 = (java.util.List) r6
            r2 = 0
            java.lang.Object r6 = r6.get(r2)
            if (r6 != 0) goto L95
            if (r0 == 0) goto L91
            throw r1
        L91:
            r5.m1727()
            throw r1
        L95:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L9b:
            return
        L9c:
            java.lang.String r6 = "Call wasn't in-flight!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        La4:
            monitor-exit(r5)
            throw r6
    }

    @Override // xhss.InterfaceC0268
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public xhss.InterfaceC1095 mo527() {
            r0 = this;
            java.lang.Object r0 = r0.f3445
            xhss.ᛸᲇᲈᛶ r0 = (xhss.C0823) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0844 m1729() {
            r4 = this;
            java.lang.Object r0 = r4.f3444
            xhss.ᲇᛵᛲᲁ r0 = (xhss.C1037) r0
            if (r0 == 0) goto Lc
            java.lang.Object r1 = r4.f3446
            xhss.ᛵᛴᛷᛵ r1 = (xhss.C0468) r1
            if (r1 != 0) goto L27
        Lc:
            xhss.ᛶᛳᛳ r1 = xhss.C0548.f1968
            if (r0 != 0) goto L1b
            r1.getClass()
            xhss.ᲇᛵᛲᲁ r0 = new xhss.ᲇᛵᛲᲁ
            r2 = 0
            r0.<init>(r2)
            r4.f3444 = r0
        L1b:
            java.lang.Object r2 = r4.f3446
            xhss.ᛵᛴᛷᛵ r2 = (xhss.C0468) r2
            if (r2 != 0) goto L26
            xhss.ᛵᛴᛷᛵ r1 = r1.f1969
            r4.f3446 = r1
            goto L27
        L26:
            r1 = r2
        L27:
            xhss.ᲀᛲᲇ r2 = new xhss.ᲀᛲᲇ
            java.lang.Object r3 = r4.f3445
            java.util.EnumSet r3 = (java.util.EnumSet) r3
            java.lang.Object r4 = r4.f3447
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r2.<init>(r0, r1, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public void m1730(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "ws:"
            r1 = 1
            boolean r0 = xhss.AbstractC0226.m492(r3, r0, r1)
            if (r0 == 0) goto L15
            r0 = 3
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r0 = "http:"
            java.lang.String r3 = r0.concat(r3)
            goto L28
        L15:
            java.lang.String r0 = "wss:"
            boolean r0 = xhss.AbstractC0226.m492(r3, r0, r1)
            if (r0 == 0) goto L28
            r0 = 4
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r0 = "https:"
            java.lang.String r3 = r0.concat(r3)
        L28:
            xhss.ᛴᲇᛴᛱ r0 = new xhss.ᛴᲇᛴᛱ
            r0.<init>()
            r1 = 0
            r0.m808(r1, r3)
            xhss.ᛷᛶᲁᛵ r3 = r0.m809()
            r2.f3444 = r3
            return
    }

    @Override // xhss.InterfaceC0268
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public xhss.InterfaceC0102 mo535() {
            r0 = this;
            java.lang.Object r0 = r0.f3447
            xhss.ᛲᛶᲈᲀ r0 = (xhss.C0181) r0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public void m1731(java.lang.String r2) {
            r1 = this;
            int r0 = r2.length()
            if (r0 <= 0) goto L45
            java.lang.String r0 = "POST"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L39
            java.lang.String r0 = "PUT"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L39
            java.lang.String r0 = "PATCH"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L39
            java.lang.String r0 = "PROPPATCH"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L39
            java.lang.String r0 = "QUERY"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L39
            java.lang.String r0 = "REPORT"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L39
            r1.f3446 = r2
            return
        L39:
            java.lang.String r1 = "method "
            java.lang.String r0 = " must have a request body."
            java.lang.String r1 = xhss.AbstractC0390.m781(r1, r2, r0)
            xhss.C0532.m946(r1)
            return
        L45:
            java.lang.String r1 = "method.isEmpty() == true"
            xhss.C0532.m959(r1)
            return
    }
}
