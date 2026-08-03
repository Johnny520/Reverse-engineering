package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb.l1 f3482b;

    static {
            og.k r0 = fb.l1.f3623e
            return
    }

    public d0(fb.l1 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f3481a = r2
            r0.f3482b = r1
            return
    }

    public static java.lang.String b(fb.j1 r6, fb.b r7, fg.l r8) {
            java.lang.String r0 = "JADX 没有找到类: "
            r7.d()
            java.lang.String r1 = r6.f3587a
            java.lang.String r2 = "L"
            java.lang.String r2 = og.m.A0(r1, r2)
            java.lang.String r3 = ";"
            java.lang.String r2 = og.m.B0(r2, r3)
            r3 = 47
            r4 = 46
            java.lang.String r2 = r2.replace(r3, r4)
            r2.getClass()
            bc.g r3 = new bc.g
            r3.<init>()
            r4 = 1
            int r5 = java.lang.Math.max(r4, r4)
            r3.f719n = r5
            r3.f728w = r4
            r5 = 0
            r3.f727v = r5
            r3.f724s = r5
            r3.f720o = r4
            r3.B = r5
            r3.P = r5
            fc.d r4 = fc.d.f3879g
            r3.f716k = r4
            cd.a r4 = new cd.a
            r4.<init>()
            r3.f717l = r4
            fb.c0 r4 = new fb.c0
            r4.<init>()
            r3.O = r4
            ff.c r4 = new ff.c
            r4.<init>()
            byte[] r5 = r6.f3589c
            java.lang.String r6 = r6.f3588b
            ff.a r4 = r4.f3929b
            java.util.List r6 = r4.d(r6, r5)
            ff.d r4 = new ff.d
            r4.<init>(r6)
            bc.k r6 = new bc.k
            r6.<init>(r3)
            java.util.ArrayList r3 = r6.f745n     // Catch: java.lang.Throwable -> La6
            r3.add(r4)     // Catch: java.lang.Throwable -> La6
            r6.e()     // Catch: java.lang.Throwable -> La6
            r7.d()     // Catch: java.lang.Throwable -> La6
            ud.u r3 = r6.f742k     // Catch: java.lang.Throwable -> La6
            java.util.ArrayList r3 = r3.f13755n     // Catch: java.lang.Throwable -> La6
            java.util.stream.Stream r3 = r3.stream()     // Catch: java.lang.Throwable -> La6
            bc.i r4 = new bc.i     // Catch: java.lang.Throwable -> La6
            r5 = 0
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> La6
            java.util.stream.Stream r2 = r3.filter(r4)     // Catch: java.lang.Throwable -> La6
            java.util.Optional r2 = r2.findFirst()     // Catch: java.lang.Throwable -> La6
            bc.j r3 = new bc.j     // Catch: java.lang.Throwable -> La6
            r4 = 0
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> La6
            java.util.Optional r2 = r2.map(r3)     // Catch: java.lang.Throwable -> La6
            r3 = 0
            java.lang.Object r2 = r2.orElse(r3)     // Catch: java.lang.Throwable -> La6
            bc.l r2 = (bc.l) r2     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto La8
            java.lang.Object r8 = r8.invoke(r2)     // Catch: java.lang.Throwable -> La6
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La6
            r7.d()     // Catch: java.lang.Throwable -> La6
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> La6
            r6.close()
            return r8
        La6:
            r7 = move-exception
            goto Lba
        La8:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r8.<init>(r0)     // Catch: java.lang.Throwable -> La6
            r8.append(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> La6
            r7.<init>(r8)     // Catch: java.lang.Throwable -> La6
            throw r7     // Catch: java.lang.Throwable -> La6
        Lba:
            throw r7     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r8 = move-exception
            ig.a.i(r6, r7)
            throw r8
    }

    public final java.lang.String a(java.lang.String r8, java.lang.String r9, java.lang.String r10, org.json.JSONObject r11) {
            r7 = this;
            java.lang.String r0 = "offset"
            r1 = 0
            int r2 = r11.optInt(r0, r1)
            int r3 = r10.length()
            int r2 = r9.e0.r(r2, r1, r3)
            java.lang.String r3 = "max_chars"
            r4 = 24000(0x5dc0, float:3.3631E-41)
            int r11 = r11.optInt(r3, r4)
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 48000(0xbb80, float:6.7262E-41)
            int r11 = r9.e0.r(r11, r3, r4)
            int r11 = r11 + r2
            int r3 = r10.length()
            if (r11 <= r3) goto L28
            r11 = r3
        L28:
            int r3 = r10.length()
            r4 = 1
            if (r11 >= r3) goto L3e
            int r3 = r11 + (-1)
            r5 = 4
            r6 = 10
            int r3 = og.m.w0(r10, r6, r3, r5)
            int r5 = r2 + 1000
            if (r3 < r5) goto L3e
            int r11 = r3 + 1
        L3e:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r5 = "ok"
            r3.put(r5, r4)
            java.lang.String r5 = "descriptor"
            r3.put(r5, r8)
            java.lang.String r8 = "sourceEntry"
            r3.put(r8, r9)
            java.lang.String r8 = "sourcePath"
            java.lang.String r9 = r7.f3481a
            r3.put(r8, r9)
            r3.put(r0, r2)
            java.lang.String r8 = "returnedLength"
            int r9 = r11 - r2
            r3.put(r8, r9)
            java.lang.String r8 = "totalLength"
            int r9 = r10.length()
            r3.put(r8, r9)
            int r8 = r10.length()
            if (r11 >= r8) goto L73
            r1 = r4
        L73:
            java.lang.String r8 = "truncated"
            r3.put(r8, r1)
            int r8 = r10.length()
            if (r11 >= r8) goto L83
            java.lang.String r8 = "nextOffset"
            r3.put(r8, r11)
        L83:
            java.lang.String r8 = "java"
            java.lang.String r9 = r10.substring(r2, r11)
            r3.put(r8, r9)
            java.lang.String r8 = r3.toString()
            r8.getClass()
            return r8
    }
}
