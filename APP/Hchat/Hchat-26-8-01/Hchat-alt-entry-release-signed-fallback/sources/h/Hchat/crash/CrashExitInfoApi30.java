package h.Hchat.crash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CrashExitInfoApi30 {
    public static final int $stable = 0;
    private static final long EXIT_MATCH_WINDOW_MS = 300000;
    public static final h.Hchat.crash.CrashExitInfoApi30 INSTANCE = null;
    private static final int SYSTEM_TRACE_LIMIT = 786432;

    static {
            h.Hchat.crash.CrashExitInfoApi30 r0 = new h.Hchat.crash.CrashExitInfoApi30
            r0.<init>()
            h.Hchat.crash.CrashExitInfoApi30.INSTANCE = r0
            return
    }

    private CrashExitInfoApi30() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean a(int r0, android.app.Application r1, android.app.ApplicationExitInfo r2) {
            boolean r0 = findExit$lambda$2(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ boolean b(int r0, android.app.ApplicationExitInfo r1) {
            boolean r0 = findExit$lambda$1(r0, r1)
            return r0
    }

    public static /* synthetic */ boolean c(long r0, android.app.ApplicationExitInfo r2) {
            boolean r0 = findExit$lambda$3(r0, r2)
            return r0
    }

    public static /* synthetic */ boolean d(int r0, android.app.ApplicationExitInfo r1) {
            boolean r0 = findExit$lambda$0(r0, r1)
            return r0
    }

    private final h.Hchat.crash.h findExit(android.app.Application r12, int r13, long r14, long r16, long r18, int r20) {
            r11 = this;
            r0 = r20
            java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
            java.lang.Object r1 = r12.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r2 = 0
            if (r1 == 0) goto L1c7
            java.lang.String r3 = r12.getPackageName()
            java.util.List r1 = g3.o0.j(r1, r3)
            r1.getClass()
            dg.n r3 = new dg.n
            r4 = 6
            r3.<init>(r1, r4)
            h.Hchat.crash.a r1 = new h.Hchat.crash.a
            r4 = 0
            r1.<init>(r13, r4)
            ng.i r13 = new ng.i
            r4 = 1
            r13.<init>(r3, r4, r1)
            h.Hchat.crash.a r1 = new h.Hchat.crash.a
            r3 = 1
            r1.<init>(r0, r3)
            ng.i r3 = new ng.i
            r3.<init>(r13, r4, r1)
            h.Hchat.crash.b r13 = new h.Hchat.crash.b
            r13.<init>(r0, r12)
            ng.i r12 = new ng.i
            r12.<init>(r3, r4, r13)
            h.Hchat.crash.c r13 = new h.Hchat.crash.c
            r0 = r16
            r13.<init>(r0)
            ng.i r0 = new ng.i
            r0.<init>(r12, r4, r13)
            java.util.List r12 = ng.m.b0(r0)
            r0 = 0
            int r13 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            r3 = 0
            if (r13 <= 0) goto L144
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r5 = r12.iterator()
        L5f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L87
            java.lang.Object r6 = r5.next()
            android.app.ApplicationExitInfo r7 = g3.o0.d(r6)
            long r7 = g3.o0.p(r7)
            long r7 = r7 - r18
            long r7 = java.lang.Math.abs(r7)
            r9 = 300000(0x493e0, double:1.482197E-318)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L80
            r7 = r4
            goto L81
        L80:
            r7 = r3
        L81:
            if (r7 == 0) goto L5f
            r13.add(r6)
            goto L5f
        L87:
            java.util.Iterator r13 = r13.iterator()
            boolean r5 = r13.hasNext()
            if (r5 != 0) goto L93
            r5 = r2
            goto Lc8
        L93:
            java.lang.Object r5 = r13.next()
            boolean r6 = r13.hasNext()
            if (r6 != 0) goto L9e
            goto Lc8
        L9e:
            android.app.ApplicationExitInfo r6 = g3.o0.d(r5)
            long r6 = g3.o0.p(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        Laa:
            java.lang.Object r7 = r13.next()
            android.app.ApplicationExitInfo r8 = g3.o0.d(r7)
            long r8 = g3.o0.p(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r9 = r6.compareTo(r8)
            if (r9 >= 0) goto Lc2
            r5 = r7
            r6 = r8
        Lc2:
            boolean r7 = r13.hasNext()
            if (r7 != 0) goto Laa
        Lc8:
            android.app.ApplicationExitInfo r13 = g3.o0.d(r5)
            if (r13 == 0) goto Ld0
            goto L1b7
        Ld0:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        Ld9:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto Lfd
            java.lang.Object r5 = r12.next()
            android.app.ApplicationExitInfo r6 = g3.o0.d(r5)
            int r7 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r7 <= 0) goto Lf6
            long r6 = g3.o0.p(r6)
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 < 0) goto Lf4
            goto Lf6
        Lf4:
            r6 = r3
            goto Lf7
        Lf6:
            r6 = r4
        Lf7:
            if (r6 == 0) goto Ld9
            r13.add(r5)
            goto Ld9
        Lfd:
            java.util.Iterator r7 = r13.iterator()
            boolean r12 = r7.hasNext()
            if (r12 != 0) goto L109
            r12 = r2
            goto L13e
        L109:
            java.lang.Object r12 = r7.next()
            boolean r13 = r7.hasNext()
            if (r13 != 0) goto L114
            goto L13e
        L114:
            android.app.ApplicationExitInfo r13 = g3.o0.d(r12)
            long r0 = g3.o0.p(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
        L120:
            java.lang.Object r0 = r7.next()
            android.app.ApplicationExitInfo r1 = g3.o0.d(r0)
            long r3 = g3.o0.p(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            int r3 = r13.compareTo(r1)
            if (r3 >= 0) goto L138
            r12 = r0
            r13 = r1
        L138:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L120
        L13e:
            android.app.ApplicationExitInfo r13 = g3.o0.d(r12)
            goto L1b7
        L144:
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 <= 0) goto L1b6
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L151:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L170
            java.lang.Object r0 = r12.next()
            android.app.ApplicationExitInfo r1 = g3.o0.d(r0)
            long r5 = g3.o0.p(r1)
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 < 0) goto L169
            r1 = r4
            goto L16a
        L169:
            r1 = r3
        L16a:
            if (r1 == 0) goto L151
            r13.add(r0)
            goto L151
        L170:
            java.util.Iterator r12 = r13.iterator()
            boolean r13 = r12.hasNext()
            if (r13 != 0) goto L17c
            r13 = r2
            goto L1b1
        L17c:
            java.lang.Object r13 = r12.next()
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L187
            goto L1b1
        L187:
            android.app.ApplicationExitInfo r0 = g3.o0.d(r13)
            long r0 = g3.o0.p(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L193:
            java.lang.Object r1 = r12.next()
            android.app.ApplicationExitInfo r3 = g3.o0.d(r1)
            long r3 = g3.o0.p(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            int r4 = r0.compareTo(r3)
            if (r4 >= 0) goto L1ab
            r13 = r1
            r0 = r3
        L1ab:
            boolean r1 = r12.hasNext()
            if (r1 != 0) goto L193
        L1b1:
            android.app.ApplicationExitInfo r13 = g3.o0.d(r13)
            goto L1b7
        L1b6:
            r13 = r2
        L1b7:
            if (r13 == 0) goto L1c7
            h.Hchat.crash.h r12 = new h.Hchat.crash.h
            long r0 = g3.o0.p(r13)
            java.lang.String r13 = r11.formatExitInfo(r13)
            r12.<init>(r0, r13)
            return r12
        L1c7:
            return r2
    }

    private static final boolean findExit$lambda$0(int r0, android.app.ApplicationExitInfo r1) {
            int r1 = g3.o0.u(r1)
            if (r1 != r0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static final boolean findExit$lambda$1(int r0, android.app.ApplicationExitInfo r1) {
            if (r0 <= 0) goto Lb
            int r1 = g3.o0.b(r1)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    private static final boolean findExit$lambda$2(int r0, android.app.Application r1, android.app.ApplicationExitInfo r2) {
            if (r0 > 0) goto L20
            java.lang.String r0 = g3.o0.r(r2)
            if (r0 == 0) goto L20
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto Lf
            goto L20
        Lf:
            java.lang.String r0 = g3.o0.r(r2)
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            return r0
        L20:
            r0 = 1
            return r0
    }

    private static final boolean findExit$lambda$3(long r2, android.app.ApplicationExitInfo r4) {
            long r0 = g3.o0.p(r4)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    private final java.lang.String formatExitInfo(android.app.ApplicationExitInfo r10) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = g3.o0.r(r10)
            java.lang.String r2 = ""
            if (r1 != 0) goto Le
            r1 = r2
        Le:
            java.lang.String r3 = "进程: "
            java.lang.String r1 = r3.concat(r1)
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            int r3 = g3.o0.b(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "PID: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.append(r3)
            r0.append(r1)
            int r3 = g3.o0.v(r10)
            int r4 = g3.o0.w(r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "UID: real="
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", package="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r0.append(r3)
            r0.append(r1)
            h.Hchat.crash.CrashExitInfoApi30 r3 = h.Hchat.crash.CrashExitInfoApi30.INSTANCE
            int r4 = g3.o0.u(r10)
            java.lang.String r4 = r3.reasonName(r4)
            int r5 = g3.o0.u(r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "原因: "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = " ("
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = ")"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = g3.o0.i(r10)
            if (r4 != 0) goto L8e
            goto L8f
        L8e:
            r2 = r4
        L8f:
            boolean r4 = og.m.t0(r2)
            if (r4 != 0) goto L96
            goto L97
        L96:
            r2 = 0
        L97:
            if (r2 == 0) goto La5
            java.lang.String r4 = "说明: "
            java.lang.String r2 = r4.concat(r2)
            r0.append(r2)
            r0.append(r1)
        La5:
            int r2 = g3.o0.o(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "状态: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.append(r2)
            r0.append(r1)
            int r2 = g3.o0.s(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "重要性: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.append(r2)
            r0.append(r1)
            long r4 = g3.o0.c(r10)
            long r6 = g3.o0.t(r10)
            java.lang.String r2 = "PSS/RSS: "
            java.lang.String r8 = " KB / "
            java.lang.StringBuilder r2 = p.a.o(r4, r2, r8)
            r2.append(r6)
            java.lang.String r4 = " KB"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r0.append(r1)
            int r2 = g3.o0.u(r10)
            r4 = 6
            if (r2 != r4) goto L101
            java.lang.String r2 = "系统 ANR Trace"
            goto L103
        L101:
            java.lang.String r2 = "系统 Tombstone"
        L103:
            java.lang.String r10 = r3.readSystemTrace(r10, r2)
            if (r10 == 0) goto L129
            r0.append(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "--- "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " ---"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            r0.append(r1)
            r0.append(r10)
            goto L135
        L129:
            java.lang.String r10 = ": 当前系统未提供"
            java.lang.String r10 = r2.concat(r10)
            r0.append(r10)
            r0.append(r1)
        L135:
            java.lang.String r10 = r0.toString()
            java.lang.CharSequence r10 = og.m.T0(r10)
            java.lang.String r10 = r10.toString()
            return r10
    }

    private final boolean isMostlyText(byte[] r7) {
            r6 = this;
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L5
            return r1
        L5:
            int r0 = r7.length
            r2 = 4096(0x1000, float:5.74E-42)
            int r0 = java.lang.Math.min(r0, r2)
            r2 = r1
            r3 = r2
        Le:
            if (r2 < r0) goto L1a
            int r3 = r3 * 100
            int r3 = r3 / r0
            r7 = 85
            if (r3 < r7) goto L19
            r7 = 1
            return r7
        L19:
            return r1
        L1a:
            r4 = r7[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 9
            if (r4 == r5) goto L37
            r5 = 10
            if (r4 == r5) goto L37
            r5 = 13
            if (r4 == r5) goto L37
            r5 = 32
            if (r5 > r4) goto L33
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L33
            goto L37
        L33:
            r5 = 128(0x80, float:1.8E-43)
            if (r4 < r5) goto L39
        L37:
            int r3 = r3 + 1
        L39:
            int r2 = r2 + 1
            goto Le
    }

    private final java.lang.String readSystemTrace(android.app.ApplicationExitInfo r9, java.lang.String r10) {
            r8 = this;
            r0 = 0
            java.io.InputStream r9 = g3.o0.h(r9)     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto La5
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r5 = r4
        L12:
            r6 = 786432(0xc0000, float:1.102026E-39)
            if (r5 >= r6) goto L2b
            int r7 = r6 - r5
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L28
            int r7 = r9.read(r3, r4, r7)     // Catch: java.lang.Throwable -> L28
            if (r7 > 0) goto L23
            goto L2b
        L23:
            r1.write(r3, r4, r7)     // Catch: java.lang.Throwable -> L28
            int r5 = r5 + r7
            goto L12
        L28:
            r10 = move-exception
            goto L9f
        L2b:
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> L28
            r1.getClass()     // Catch: java.lang.Throwable -> L28
            int r2 = r1.length     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L37
            r10 = r0
            goto L99
        L37:
            boolean r2 = r8.isMostlyText(r1)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L5d
            int r1 = r1.length     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "系统返回了 "
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            r2.append(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = " 字节二进制 "
            r2.append(r1)     // Catch: java.lang.Throwable -> L28
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = "，无法直接显示文本。"
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L28
            goto L99
        L5d:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L28
            r2.getClass()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L28
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.CharSequence r1 = og.m.T0(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            if (r5 < r6) goto L88
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "\n["
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = " 超过保存上限]"
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L28
            goto L8a
        L88:
            java.lang.String r10 = ""
        L8a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r2.append(r1)     // Catch: java.lang.Throwable -> L28
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L28
        L99:
            r9.close()     // Catch: java.lang.Throwable -> L9d
            goto Lac
        L9d:
            r9 = move-exception
            goto La7
        L9f:
            throw r10     // Catch: java.lang.Throwable -> La0
        La0:
            r1 = move-exception
            ig.a.i(r9, r10)     // Catch: java.lang.Throwable -> L9d
            throw r1     // Catch: java.lang.Throwable -> L9d
        La5:
            r10 = r0
            goto Lac
        La7:
            sf.f r10 = new sf.f
            r10.<init>(r9)
        Lac:
            boolean r9 = r10 instanceof sf.f
            if (r9 == 0) goto Lb1
            goto Lb2
        Lb1:
            r0 = r10
        Lb2:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private final java.lang.String reasonName(int r1) {
            r0 = this;
            switch(r1) {
                case 1: goto L27;
                case 2: goto L24;
                case 3: goto L21;
                case 4: goto L1e;
                case 5: goto L1b;
                case 6: goto L18;
                case 7: goto L15;
                case 8: goto L12;
                case 9: goto Lf;
                case 10: goto Lc;
                case 11: goto L3;
                case 12: goto L9;
                case 13: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r1 = "未知"
            return r1
        L6:
            java.lang.String r1 = "其他"
            return r1
        L9:
            java.lang.String r1 = "依赖进程退出"
            return r1
        Lc:
            java.lang.String r1 = "用户请求退出"
            return r1
        Lf:
            java.lang.String r1 = "资源使用过量"
            return r1
        L12:
            java.lang.String r1 = "权限变化"
            return r1
        L15:
            java.lang.String r1 = "初始化失败"
            return r1
        L18:
            java.lang.String r1 = "ANR"
            return r1
        L1b:
            java.lang.String r1 = "Native 崩溃"
            return r1
        L1e:
            java.lang.String r1 = "Java 崩溃"
            return r1
        L21:
            java.lang.String r1 = "低内存"
            return r1
        L24:
            java.lang.String r1 = "收到信号"
            return r1
        L27:
            java.lang.String r1 = "进程自行退出"
            return r1
    }

    public final h.Hchat.crash.h findAnrExit(android.app.Application r11, long r12, long r14) {
            r10 = this;
            r11.getClass()
            r7 = 0
            r9 = 0
            r2 = 6
            r0 = r10
            r1 = r11
            r3 = r12
            r5 = r14
            h.Hchat.crash.h r11 = r0.findExit(r1, r2, r3, r5, r7, r9)
            return r11
    }

    public final h.Hchat.crash.h findNativeExit(android.app.Application r11, long r12, long r14, long r16, int r18) {
            r10 = this;
            r11.getClass()
            r2 = 5
            r0 = r10
            r1 = r11
            r3 = r12
            r5 = r14
            r7 = r16
            r9 = r18
            h.Hchat.crash.h r11 = r0.findExit(r1, r2, r3, r5, r7, r9)
            return r11
    }
}
