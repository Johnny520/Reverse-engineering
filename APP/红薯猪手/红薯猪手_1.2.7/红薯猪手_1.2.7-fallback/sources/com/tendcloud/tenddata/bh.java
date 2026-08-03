package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bh {
    private static volatile com.tendcloud.tenddata.bh a;

    public static class a implements java.lang.Thread.UncaughtExceptionHandler {
        private java.lang.Thread.UncaughtExceptionHandler appDefaultHandler;

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
                r1.appDefaultHandler = r0
                return
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
                r3 = this;
                boolean r0 = com.tendcloud.tenddata.ab.e
                if (r0 == 0) goto L12
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.UNIVERSAL
                r2 = 1
                com.tendcloud.tenddata.bh.a(r5, r0, r1, r2)
            L12:
                java.lang.Thread$UncaughtExceptionHandler r0 = r3.appDefaultHandler
                if (r0 == 0) goto L19
                r0.uncaughtException(r4, r5)
            L19:
                return
        }
    }

    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bh r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private bh() {
            r0 = this;
            r0.<init>()
            b()
            return
    }

    public static com.tendcloud.tenddata.bh a() {
            com.tendcloud.tenddata.bh r0 = com.tendcloud.tenddata.bh.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bh> r0 = com.tendcloud.tenddata.bh.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bh r1 = com.tendcloud.tenddata.bh.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bh r1 = new com.tendcloud.tenddata.bh     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bh.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bh r0 = com.tendcloud.tenddata.bh.a
            return r0
    }

    private static final java.lang.String a(java.lang.Throwable r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            java.lang.StackTraceElement[] r2 = r6.getStackTrace()     // Catch: java.lang.Throwable -> L39
            int r3 = r2.length     // Catch: java.lang.Throwable -> L39
            r4 = 50
            if (r3 <= r4) goto L1b
            goto L1c
        L1b:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L39
        L1c:
            r3 = 0
        L1d:
            if (r3 >= r4) goto L2f
            java.lang.String r5 = "\tat "
            r0.append(r5)     // Catch: java.lang.Throwable -> L39
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L39
            r0.append(r5)     // Catch: java.lang.Throwable -> L39
            r0.append(r1)     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 1
            goto L1d
        L2f:
            java.lang.Throwable r6 = r6.getCause()     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L39
            r1 = 1
            a(r0, r2, r6, r1)     // Catch: java.lang.Throwable -> L39
        L39:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private static final void a(java.lang.StringBuilder r6, java.lang.StackTraceElement[] r7, java.lang.Throwable r8, int r9) {
            java.lang.String r0 = "\r\n"
            java.lang.StackTraceElement[] r1 = r8.getStackTrace()     // Catch: java.lang.Throwable -> L51
            int r2 = r1.length     // Catch: java.lang.Throwable -> L51
            int r2 = r2 + (-1)
            int r3 = r7.length     // Catch: java.lang.Throwable -> L51
            int r3 = r3 + (-1)
        Lc:
            if (r2 < 0) goto L1f
            if (r3 < 0) goto L1f
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L51
            r5 = r7[r3]     // Catch: java.lang.Throwable -> L51
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L1f
            int r2 = r2 + (-1)
            int r3 = r3 + (-1)
            goto Lc
        L1f:
            r7 = 50
            if (r2 <= r7) goto L24
            r2 = r7
        L24:
            java.lang.String r7 = "Caused by : "
            r6.append(r7)     // Catch: java.lang.Throwable -> L51
            r6.append(r8)     // Catch: java.lang.Throwable -> L51
            r6.append(r0)     // Catch: java.lang.Throwable -> L51
            r7 = 0
        L30:
            if (r7 > r2) goto L42
            java.lang.String r3 = "\t"
            r6.append(r3)     // Catch: java.lang.Throwable -> L51
            r3 = r1[r7]     // Catch: java.lang.Throwable -> L51
            r6.append(r3)     // Catch: java.lang.Throwable -> L51
            r6.append(r0)     // Catch: java.lang.Throwable -> L51
            int r7 = r7 + 1
            goto L30
        L42:
            r7 = 5
            if (r9 < r7) goto L46
            return
        L46:
            java.lang.Throwable r7 = r8.getCause()     // Catch: java.lang.Throwable -> L51
            if (r7 == 0) goto L51
            int r9 = r9 + 1
            a(r6, r1, r8, r9)     // Catch: java.lang.Throwable -> L51
        L51:
            return
    }

    public static void a(java.lang.Throwable r8, java.lang.String r9, com.tendcloud.tenddata.a r10, boolean r11) {
            java.lang.String r0 = "com.android."
            java.lang.String r1 = "android."
            java.lang.String r2 = "javax."
            java.lang.String r3 = "java."
            android.content.Context r4 = com.tendcloud.tenddata.ab.g
            if (r4 != 0) goto Ld
            return
        Ld:
            java.lang.String r4 = r9.trim()     // Catch: java.lang.Throwable -> L29
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L1c
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L29
            goto L20
        L1c:
            long r4 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L29
        L20:
            if (r11 == 0) goto L29
            boolean r9 = com.tendcloud.tenddata.ab.J     // Catch: java.lang.Throwable -> L29
            if (r9 == 0) goto L29
            com.tendcloud.tenddata.i.c(r4, r10)     // Catch: java.lang.Throwable -> L29
        L29:
            r9 = r8
        L2a:
            java.lang.Throwable r10 = r9.getCause()     // Catch: java.lang.Throwable -> Lc0
            if (r10 == 0) goto L35
            java.lang.Throwable r9 = r9.getCause()     // Catch: java.lang.Throwable -> Lc0
            goto L2a
        L35:
            java.lang.StackTraceElement[] r10 = r9.getStackTrace()     // Catch: java.lang.Throwable -> Lc0
            android.content.Context r11 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = r11.getPackageName()     // Catch: java.lang.Throwable -> Lc0
            r4 = 0
            r5 = r4
        L41:
            r6 = 3
            if (r4 >= r6) goto L8b
            int r6 = r10.length     // Catch: java.lang.Throwable -> Lc0
            if (r5 >= r6) goto L8b
            r6 = r10[r5]     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r6 = r6.getClassName()     // Catch: java.lang.Throwable -> Lc0
            boolean r7 = r6.startsWith(r3)     // Catch: java.lang.Throwable -> Lc0
            if (r7 == 0) goto L5a
            boolean r7 = r11.startsWith(r3)     // Catch: java.lang.Throwable -> Lc0
            if (r7 != 0) goto L5a
            goto L88
        L5a:
            boolean r7 = r6.startsWith(r2)     // Catch: java.lang.Throwable -> Lc0
            if (r7 == 0) goto L67
            boolean r7 = r11.startsWith(r2)     // Catch: java.lang.Throwable -> Lc0
            if (r7 != 0) goto L67
            goto L88
        L67:
            boolean r7 = r6.startsWith(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r7 == 0) goto L74
            boolean r7 = r11.startsWith(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r7 != 0) goto L74
            goto L88
        L74:
            boolean r6 = r6.startsWith(r0)     // Catch: java.lang.Throwable -> Lc0
            if (r6 == 0) goto L81
            boolean r6 = r11.startsWith(r0)     // Catch: java.lang.Throwable -> Lc0
            if (r6 != 0) goto L81
            goto L88
        L81:
            r6 = r10[r5]     // Catch: java.lang.Throwable -> Lc0
            r6.toString()     // Catch: java.lang.Throwable -> Lc0
            int r4 = r4 + 1
        L88:
            int r5 = r5 + 1
            goto L41
        L8b:
            com.tendcloud.tenddata.bv r10 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> Lc0
            r10.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = "apm"
            r10.b = r11     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = "error"
            r10.c = r11     // Catch: java.lang.Throwable -> Lc0
            java.util.TreeMap r11 = new java.util.TreeMap     // Catch: java.lang.Throwable -> Lc0
            r11.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = "msg"
            java.lang.String r8 = a(r8)     // Catch: java.lang.Throwable -> Lc0
            r11.put(r0, r8)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r8 = "type"
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> Lc0
            r11.put(r8, r9)     // Catch: java.lang.Throwable -> Lc0
            r10.d = r11     // Catch: java.lang.Throwable -> Lc0
            com.tendcloud.tenddata.a r8 = com.tendcloud.tenddata.a.UNIVERSAL     // Catch: java.lang.Throwable -> Lc0
            r10.a = r8     // Catch: java.lang.Throwable -> Lc0
            com.tendcloud.tenddata.z r8 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lc0
            r8.post(r10)     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            return
    }

    private static void b() {
            com.tendcloud.tenddata.bh$a r0 = new com.tendcloud.tenddata.bh$a     // Catch: java.lang.Throwable -> L8
            r0.<init>()     // Catch: java.lang.Throwable -> L8
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public void a(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            java.lang.String r0 = "occurTime"
            java.lang.String r1 = "throwable"
            java.lang.String r2 = "service"
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Throwable -> L2a
            com.tendcloud.tenddata.a r2 = (com.tendcloud.tenddata.a) r2     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2a
            boolean r3 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2a
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            a(r1, r5, r2, r0)     // Catch: java.lang.Throwable -> L2a
        L2a:
            return
    }

    public final void onTDEBEventError(com.tendcloud.tenddata.zz.a r3) {
            r2 = this;
            if (r3 == 0) goto L1e
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.paraMap     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L7
            goto L1e
        L7:
            java.lang.String r1 = "apiType"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1e
            r1 = 3
            if (r0 == r1) goto L19
            return
        L19:
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r3.paraMap     // Catch: java.lang.Throwable -> L1e
            r2.a(r3)     // Catch: java.lang.Throwable -> L1e
        L1e:
            return
    }
}
