package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bp {
    private static volatile com.tendcloud.tenddata.bp a;



    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.bp r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private bp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.bp a() {
            com.tendcloud.tenddata.bp r0 = com.tendcloud.tenddata.bp.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bp> r0 = com.tendcloud.tenddata.bp.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bp r1 = com.tendcloud.tenddata.bp.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bp r1 = new com.tendcloud.tenddata.bp     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bp.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bp r0 = com.tendcloud.tenddata.bp.a
            return r0
    }

    private void a(long r9, com.tendcloud.tenddata.a r11) {
            r8 = this;
            java.lang.String r0 = "["
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r1.<init>()     // Catch: java.lang.Throwable -> La2
            r1.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r11.name()     // Catch: java.lang.Throwable -> La2
            r1.append(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = "][Session] - New session!"
            r1.append(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.h.iForDeveloper(r1)     // Catch: java.lang.Throwable -> La2
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r2.<init>()     // Catch: java.lang.Throwable -> La2
            r2.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r11.name()     // Catch: java.lang.Throwable -> La2
            r2.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "][Session] - Id: "
            r2.append(r0)     // Catch: java.lang.Throwable -> La2
            r2.append(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> La2
            long r2 = com.tendcloud.tenddata.i.f(r11)     // Catch: java.lang.Throwable -> La2
            long r4 = r9 - r2
            r6 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L50
            r4 = r6
        L50:
            com.tendcloud.tenddata.i.a(r1, r11)     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.i.a(r9, r11)     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.i.b(r1, r11)     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.ct r0 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> La2
            r0.setSessionId(r1)     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.ct r0 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> La2
            r0.setSessionStartTime(r9)     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.bv r9 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> La2
            r9.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r10 = "session"
            r9.b = r10     // Catch: java.lang.Throwable -> La2
            java.lang.String r10 = "begin"
            r9.c = r10     // Catch: java.lang.Throwable -> La2
            java.util.TreeMap r10 = new java.util.TreeMap     // Catch: java.lang.Throwable -> La2
            r10.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "sessionId"
            r10.put(r0, r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "interval"
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> La2
            r10.put(r0, r1)     // Catch: java.lang.Throwable -> La2
            r9.d = r10     // Catch: java.lang.Throwable -> La2
            r9.a = r11     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.bp$2 r10 = new com.tendcloud.tenddata.bp$2     // Catch: java.lang.Throwable -> La2
            r10.<init>(r8, r11)     // Catch: java.lang.Throwable -> La2
            r9.f = r10     // Catch: java.lang.Throwable -> La2
            com.tendcloud.tenddata.z r10 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> La2
            r10.post(r9)     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.atomic.AtomicBoolean r9 = com.tendcloud.tenddata.ab.Z     // Catch: java.lang.Throwable -> La2
            r10 = 0
            r9.set(r10)     // Catch: java.lang.Throwable -> La2
        La2:
            return
    }

    private void a(com.tendcloud.tenddata.a r9) {
            r8 = this;
            java.lang.String r0 = com.tendcloud.tenddata.i.a(r9)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L93
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L93
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto L93
            long r1 = com.tendcloud.tenddata.i.c(r9)     // Catch: java.lang.Throwable -> L93
            long r3 = com.tendcloud.tenddata.i.f(r9)     // Catch: java.lang.Throwable -> L93
            long r3 = r3 - r1
            java.lang.String r5 = r9.name()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "APP"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L93
            if (r5 != 0) goto L49
            java.lang.String r5 = r9.name()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "APP_SQL"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L93
            if (r5 != 0) goto L49
            java.lang.String r5 = r9.name()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "TRACKING"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L93
            if (r5 != 0) goto L49
            java.lang.String r5 = r9.name()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "SDK"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto L51
        L49:
            r5 = 500(0x1f4, double:2.47E-321)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L51
            r3 = -1000(0xfffffffffffffc18, double:NaN)
        L51:
            com.tendcloud.tenddata.bv r5 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L93
            r5.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "session"
            r5.b = r6     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "end"
            r5.c = r6     // Catch: java.lang.Throwable -> L93
            java.util.TreeMap r6 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L93
            r6.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = "sessionId"
            r6.put(r7, r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "start"
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L93
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "duration"
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L93
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L93
            r5.d = r6     // Catch: java.lang.Throwable -> L93
            r5.a = r9     // Catch: java.lang.Throwable -> L93
            com.tendcloud.tenddata.bp$1 r0 = new com.tendcloud.tenddata.bp$1     // Catch: java.lang.Throwable -> L93
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L93
            r5.f = r0     // Catch: java.lang.Throwable -> L93
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L93
            r0.post(r5)     // Catch: java.lang.Throwable -> L93
            r0 = 0
            com.tendcloud.tenddata.i.a(r0, r9)     // Catch: java.lang.Throwable -> L93
        L93:
            return
    }

    public static /* synthetic */ void a(com.tendcloud.tenddata.bp r0, com.tendcloud.tenddata.a r1) {
            r0.b(r1)
            return
    }

    private final void a(java.util.HashMap<java.lang.String, java.lang.Object> r10) {
            r9 = this;
            java.lang.String r0 = "service"
            java.lang.Object r0 = r10.get(r0)     // Catch: java.lang.Throwable -> L6d
            com.tendcloud.tenddata.a r0 = (com.tendcloud.tenddata.a) r0     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "occurTime"
            java.lang.Object r10 = r10.get(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L6d
            long r1 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Throwable -> L6d
            long r3 = com.tendcloud.tenddata.i.c(r0)     // Catch: java.lang.Throwable -> L6d
            long r5 = com.tendcloud.tenddata.i.f(r0)     // Catch: java.lang.Throwable -> L6d
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L23
            goto L24
        L23:
            r5 = r3
        L24:
            long r5 = r1 - r5
            r7 = 30000(0x7530, double:1.4822E-319)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.String r5 = ""
            if (r10 <= 0) goto L38
            r9.a(r0)     // Catch: java.lang.Throwable -> L6d
        L31:
            r9.a(r1, r0)     // Catch: java.lang.Throwable -> L6d
            com.tendcloud.tenddata.i.setLastActivity(r5)     // Catch: java.lang.Throwable -> L6d
            goto L6d
        L38:
            java.lang.String r10 = com.tendcloud.tenddata.i.a(r0)     // Catch: java.lang.Throwable -> L6d
            if (r10 != 0) goto L3f
            goto L31
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = "["
            r1.append(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L6d
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "][Session] - Same session as before! Session id is "
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            r1.append(r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L6d
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L6d
            com.tendcloud.tenddata.ct r0 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L6d
            r0.setSessionId(r10)     // Catch: java.lang.Throwable -> L6d
            com.tendcloud.tenddata.ct r10 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L6d
            r10.setSessionStartTime(r3)     // Catch: java.lang.Throwable -> L6d
        L6d:
            return
    }

    private void b(com.tendcloud.tenddata.a r2) {
            r1 = this;
            com.tendcloud.tenddata.bu r0 = new com.tendcloud.tenddata.bu
            r0.<init>()
            r0.a = r2
            com.tendcloud.tenddata.bu$a r2 = com.tendcloud.tenddata.bu.a.IMMEDIATELY
            r0.b = r2
            com.tendcloud.tenddata.z r2 = com.tendcloud.tenddata.z.a()
            r2.post(r0)
            return
    }

    private final void b(java.util.HashMap<java.lang.String, java.lang.Object> r6) {
            r5 = this;
            java.lang.String r0 = "pageName"
            java.lang.String r1 = "service"
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Throwable -> L3e
            com.tendcloud.tenddata.a r1 = (com.tendcloud.tenddata.a) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "occurTime"
            java.lang.Object r2 = r6.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L3e
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "sessionEnd"
            boolean r4 = r6.containsKey(r4)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L24
            r5.a(r1)     // Catch: java.lang.Throwable -> L3e
            return
        L24:
            boolean r4 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L35
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L3e
            com.tendcloud.tenddata.i.setLastActivity(r6)     // Catch: java.lang.Throwable -> L3e
        L35:
            r5.b(r1)     // Catch: java.lang.Throwable -> L3e
            com.tendcloud.tenddata.i.c(r2, r1)     // Catch: java.lang.Throwable -> L3e
            r6 = 0
            com.tendcloud.tenddata.ab.I = r6     // Catch: java.lang.Throwable -> L3e
        L3e:
            return
    }

    public final void onTDEBEventSession(com.tendcloud.tenddata.zz.a r3) {
            r2 = this;
            if (r3 == 0) goto L28
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.paraMap
            if (r0 != 0) goto L7
            goto L28
        L7:
            java.lang.String r1 = "apiType"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L28
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L28
            r1 = 10
            if (r0 != r1) goto L1f
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r3.paraMap     // Catch: java.lang.Throwable -> L28
            r2.a(r3)     // Catch: java.lang.Throwable -> L28
            goto L28
        L1f:
            r1 = 11
            if (r0 != r1) goto L28
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r3.paraMap     // Catch: java.lang.Throwable -> L28
            r2.b(r3)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }
}
