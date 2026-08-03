package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bn {
    private static volatile com.tendcloud.tenddata.bn a;
    private java.util.HashMap<java.lang.String, java.lang.Object> b;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bn$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class a {
        private java.lang.String pageName;
        private java.lang.String refer;
        private long startTime;
        public final /* synthetic */ com.tendcloud.tenddata.bn this$0;

        private a(com.tendcloud.tenddata.bn r1, long r2, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.startTime = r2
                r0.refer = r4
                r0.pageName = r5
                return
        }

        public /* synthetic */ a(com.tendcloud.tenddata.bn r1, long r2, java.lang.String r4, java.lang.String r5, com.tendcloud.tenddata.bn.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r4, r5)
                return
        }

        public static /* synthetic */ long access$100(com.tendcloud.tenddata.bn.a r2) {
                long r0 = r2.startTime
                return r0
        }

        public static /* synthetic */ java.lang.String access$200(com.tendcloud.tenddata.bn.a r0) {
                java.lang.String r0 = r0.pageName
                return r0
        }

        public static /* synthetic */ java.lang.String access$300(com.tendcloud.tenddata.bn.a r0) {
                java.lang.String r0 = r0.refer
                return r0
        }

        public static /* synthetic */ long access$400(com.tendcloud.tenddata.bn.a r2) {
                long r0 = r2.getStartTime()
                return r0
        }

        public static /* synthetic */ java.lang.String access$500(com.tendcloud.tenddata.bn.a r0) {
                java.lang.String r0 = r0.getRefer()
                return r0
        }

        private java.lang.String getPageName() {
                r1 = this;
                java.lang.String r0 = r1.pageName
                return r0
        }

        private java.lang.String getRefer() {
                r1 = this;
                java.lang.String r0 = r1.refer
                return r0
        }

        private long getStartTime() {
                r2 = this;
                long r0 = r2.startTime
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "pageName: "
                java.lang.StringBuilder r0 = p000.c4.m108(r0)
                java.lang.String r1 = r3.pageName
                r0.append(r1)
                java.lang.String r1 = "\nfrom: "
                r0.append(r1)
                java.lang.String r1 = r3.refer
                r0.append(r1)
                java.lang.String r1 = "\nstartTime: "
                r0.append(r1)
                long r1 = r3.startTime
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bn r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private bn() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public static com.tendcloud.tenddata.bn a() {
            com.tendcloud.tenddata.bn r0 = com.tendcloud.tenddata.bn.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bp> r0 = com.tendcloud.tenddata.bp.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bn r1 = com.tendcloud.tenddata.bn.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bn r1 = new com.tendcloud.tenddata.bn     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bn.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bn r0 = com.tendcloud.tenddata.bn.a
            return r0
    }

    private final void a(long r9, java.lang.String r11, java.lang.String r12, com.tendcloud.tenddata.a r13) {
            r8 = this;
            r0 = 1
            com.tendcloud.tenddata.zz.c = r0
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r8.b
            boolean r0 = r0.containsKey(r11)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "onPageBegin being called!  pagename: "
            if (r12 == 0) goto L31
            boolean r1 = r12.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r1 != 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.Throwable -> L95
            r1.append(r0)     // Catch: java.lang.Throwable -> L95
            r1.append(r11)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = ", refer: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L95
            r1.append(r12)     // Catch: java.lang.Throwable -> L95
        L29:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L95
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L95
            goto L3d
        L31:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.Throwable -> L95
            r1.append(r0)     // Catch: java.lang.Throwable -> L95
            r1.append(r11)     // Catch: java.lang.Throwable -> L95
            goto L29
        L3d:
            if (r11 == 0) goto L95
            com.tendcloud.tenddata.bn$a r0 = new com.tendcloud.tenddata.bn$a     // Catch: java.lang.Throwable -> L95
            r7 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r12
            r6 = r11
            r1.<init>(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L95
            java.util.HashMap<java.lang.String, java.lang.Object> r9 = r8.b     // Catch: java.lang.Throwable -> L95
            r9.put(r11, r0)     // Catch: java.lang.Throwable -> L95
            com.tendcloud.tenddata.bv r9 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L95
            r9.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = "page"
            r9.b = r10     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = "enter"
            r9.c = r10     // Catch: java.lang.Throwable -> L95
            java.util.TreeMap r10 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L95
            r10.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r11 = "startTime"
            long r1 = com.tendcloud.tenddata.bn.a.access$100(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.Long r12 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L95
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L95
            java.lang.String r11 = "duration"
            r12 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L95
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L95
            java.lang.String r11 = "name"
            java.lang.String r12 = com.tendcloud.tenddata.bn.a.access$200(r0)     // Catch: java.lang.Throwable -> L95
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L95
            java.lang.String r11 = "from"
            java.lang.String r12 = com.tendcloud.tenddata.bn.a.access$300(r0)     // Catch: java.lang.Throwable -> L95
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L95
            r9.d = r10     // Catch: java.lang.Throwable -> L95
            r9.a = r13     // Catch: java.lang.Throwable -> L95
            com.tendcloud.tenddata.z r10 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L95
            r10.post(r9)     // Catch: java.lang.Throwable -> L95
        L95:
            return
    }

    private final void a(java.lang.String r9, com.tendcloud.tenddata.a r10) {
            r8 = this;
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r8.b
            boolean r0 = r0.containsKey(r9)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "onPageEnd being called! pageName: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L85
            r0.append(r9)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L85
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L85
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r8.b     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r0.remove(r9)     // Catch: java.lang.Throwable -> L85
            com.tendcloud.tenddata.bn$a r0 = (com.tendcloud.tenddata.bn.a) r0     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L7c
            com.tendcloud.tenddata.bv r1 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "page"
            r1.b = r2     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "leave"
            r1.c = r2     // Catch: java.lang.Throwable -> L85
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L85
            long r4 = com.tendcloud.tenddata.bn.a.access$400(r0)     // Catch: java.lang.Throwable -> L85
            long r2 = r2 - r4
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L85
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r4
            long r2 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> L85
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L85
            r4.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = "startTime"
            long r6 = com.tendcloud.tenddata.bn.a.access$400(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L85
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = "name"
            r4.put(r5, r9)     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = "from"
            java.lang.String r0 = com.tendcloud.tenddata.bn.a.access$500(r0)     // Catch: java.lang.Throwable -> L85
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "duration"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L85
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> L85
            r1.d = r4     // Catch: java.lang.Throwable -> L85
            r1.a = r10     // Catch: java.lang.Throwable -> L85
            com.tendcloud.tenddata.z r10 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L85
            r10.post(r1)     // Catch: java.lang.Throwable -> L85
        L7c:
            boolean r10 = com.tendcloud.tenddata.ab.H     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L83
            com.tendcloud.tenddata.i.setLastActivity(r9)     // Catch: java.lang.Throwable -> L85
        L83:
            com.tendcloud.tenddata.ab.I = r9     // Catch: java.lang.Throwable -> L85
        L85:
            return
    }

    private void a(java.util.HashMap<java.lang.String, java.lang.Object> r9) {
            r8 = this;
            java.lang.String r0 = "apiType"
            java.lang.Object r0 = r9.get(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L4f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "service"
            java.lang.Object r1 = r9.get(r1)     // Catch: java.lang.Throwable -> L4f
            r7 = r1
            com.tendcloud.tenddata.a r7 = (com.tendcloud.tenddata.a) r7     // Catch: java.lang.Throwable -> L4f
            r1 = 4
            java.lang.String r2 = "pageName"
            if (r0 == r1) goto L2c
            r1 = 5
            if (r0 == r1) goto L20
            goto L4f
        L20:
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L4f
            r8.a(r9, r7)     // Catch: java.lang.Throwable -> L4f
            goto L4f
        L2c:
            java.lang.String r0 = com.tendcloud.tenddata.ab.I     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L34
            java.lang.String r0 = com.tendcloud.tenddata.i.d()     // Catch: java.lang.Throwable -> L4f
        L34:
            r6 = r0
            java.lang.String r0 = "occurTime"
            java.lang.Object r0 = r9.get(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L4f
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L4f
            r2 = r8
            r2.a(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
        L4f:
            return
    }

    public final void onTDEBEventPage(com.tendcloud.tenddata.zz.a r3) {
            r2 = this;
            if (r3 == 0) goto L37
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.paraMap     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L7
            goto L37
        L7:
            java.lang.String r1 = "apiType"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L37
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L37
            r1 = 4
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 == r1) goto L1c
            return
        L1c:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.paraMap     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "occurTime"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L37
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L37
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r3.paraMap     // Catch: java.lang.Throwable -> L37
            r2.a(r3)     // Catch: java.lang.Throwable -> L37
        L37:
            return
    }
}
