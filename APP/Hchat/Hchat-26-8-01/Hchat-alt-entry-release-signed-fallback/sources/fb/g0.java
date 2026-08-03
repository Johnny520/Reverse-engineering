package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3522g;

    public /* synthetic */ g0(int r1) {
            r0 = this;
            r0.f3522g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f3522g
            java.lang.String r1 = "data:"
            r2 = 0
            java.lang.String r3 = "%02x"
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L2c1;
                case 1: goto L256;
                case 2: goto L245;
                case 3: goto L23e;
                case 4: goto L230;
                case 5: goto L21e;
                case 6: goto L20e;
                case 7: goto L1f4;
                case 8: goto L1ca;
                case 9: goto L1b1;
                case 10: goto L169;
                case 11: goto L157;
                case 12: goto L14c;
                case 13: goto L141;
                case 14: goto L137;
                case 15: goto L11d;
                case 16: goto Lfa;
                case 17: goto Ldd;
                case 18: goto Lc4;
                case 19: goto Lbc;
                case 20: goto Lb4;
                case 21: goto L74;
                case 22: goto L6a;
                case 23: goto L5c;
                case 24: goto L43;
                case 25: goto L38;
                case 26: goto L30;
                case 27: goto L22;
                case 28: goto L14;
                default: goto Lc;
            }
        Lc:
            fb.a0 r7 = (fb.a0) r7
            r7.getClass()
            java.lang.String r7 = r7.f3392b
            return r7
        L14:
            java.io.File r7 = (java.io.File) r7
            r7.getClass()
            boolean r7 = r7.isFile()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L22:
            java.io.File r7 = (java.io.File) r7
            r7.getClass()
            boolean r7 = r7.isFile()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L30:
            fb.a0 r7 = (fb.a0) r7
            r7.getClass()
            java.lang.String r7 = r7.f3392b
            return r7
        L38:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            return r7
        L43:
            java.lang.Byte r7 = (java.lang.Byte) r7
            byte r7 = r7.byteValue()
            r7 = r7 & 255(0xff, float:3.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r7 = java.lang.String.format(r3, r7)
            return r7
        L5c:
            java.io.File r7 = (java.io.File) r7
            r7.getClass()
            boolean r7 = r7.isFile()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L6a:
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getPath()
            r7.getClass()
            return r7
        L74:
            java.io.File r7 = (java.io.File) r7
            r7.getClass()
            boolean r0 = r7.isFile()
            if (r0 == 0) goto Laf
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = "main.java"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "js"
            java.lang.String r1 = "kt"
            java.lang.String r2 = "java"
            java.lang.String r3 = "bsh"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            java.lang.String r7 = dg.l.c0(r7)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r1)
            r7.getClass()
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto Laf
            r4 = r5
        Laf:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        Lb4:
            fb.a0 r7 = (fb.a0) r7
            r7.getClass()
            java.lang.String r7 = r7.f3392b
            return r7
        Lbc:
            fb.a0 r7 = (fb.a0) r7
            r7.getClass()
            java.lang.String r7 = r7.f3392b
            return r7
        Lc4:
            java.lang.Byte r7 = (java.lang.Byte) r7
            byte r7 = r7.byteValue()
            r7 = r7 & 255(0xff, float:3.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r7 = java.lang.String.format(r3, r7)
            return r7
        Ldd:
            java.util.zip.ZipEntry r7 = (java.util.zip.ZipEntry) r7
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto Lf5
            og.k r0 = fb.l1.f3623e
            java.lang.String r7 = r7.getName()
            r7.getClass()
            boolean r7 = r0.d(r7)
            if (r7 == 0) goto Lf5
            r4 = r5
        Lf5:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        Lfa:
            java.io.File r7 = (java.io.File) r7
            fb.g1 r0 = fb.g1.f3523a
            r7.getClass()     // Catch: java.lang.Throwable -> L10c
            java.nio.charset.Charset r1 = og.a.f9804a     // Catch: java.lang.Throwable -> L10c
            java.lang.String r7 = dg.l.h0(r7, r1)     // Catch: java.lang.Throwable -> L10c
            fb.d1 r7 = r0.c(r7)     // Catch: java.lang.Throwable -> L10c
            goto L113
        L10c:
            r7 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L113:
            boolean r0 = r7 instanceof sf.f
            if (r0 == 0) goto L119
            goto L11a
        L119:
            r2 = r7
        L11a:
            fb.d1 r2 = (fb.d1) r2
            return r2
        L11d:
            java.io.File r7 = (java.io.File) r7
            boolean r0 = r7.isFile()
            if (r0 == 0) goto L132
            java.lang.String r7 = dg.l.c0(r7)
            java.lang.String r0 = "json"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L132
            r4 = r5
        L132:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L137:
            java.io.File r7 = (java.io.File) r7
            r7.getClass()
            java.lang.String r7 = r7.getPath()
            return r7
        L141:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            return r7
        L14c:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            return r7
        L157:
            fb.d1 r7 = (fb.d1) r7
            r7.getClass()
            fb.g1 r0 = fb.g1.f3523a
            java.util.List r7 = r7.f3487e
            boolean r7 = fb.g1.h(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L169:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.Class<fb.v0> r0 = fb.v0.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L19a
            if (r0 == 0) goto L198
            java.io.InputStream r7 = r0.getResourceAsStream(r7)     // Catch: java.lang.Throwable -> L19a
            if (r7 == 0) goto L198
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L19a
            java.nio.charset.Charset r1 = og.a.f9804a     // Catch: java.lang.Throwable -> L19a
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L19a
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L19a
            r1 = 8192(0x2000, float:1.148E-41)
            r7.<init>(r0, r1)     // Catch: java.lang.Throwable -> L19a
            java.lang.String r0 = r9.e0.e0(r7)     // Catch: java.lang.Throwable -> L19c
            r7.close()     // Catch: java.lang.Throwable -> L19a
            boolean r7 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L19a
            if (r7 != 0) goto L198
            goto L1a8
        L198:
            r0 = r2
            goto L1a8
        L19a:
            r7 = move-exception
            goto L1a3
        L19c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L19e
        L19e:
            r1 = move-exception
            ig.a.i(r7, r0)     // Catch: java.lang.Throwable -> L19a
            throw r1     // Catch: java.lang.Throwable -> L19a
        L1a3:
            sf.f r0 = new sf.f
            r0.<init>(r7)
        L1a8:
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto L1ad
            goto L1ae
        L1ad:
            r2 = r0
        L1ae:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L1b1:
            java.lang.Byte r7 = (java.lang.Byte) r7
            byte r7 = r7.byteValue()
            r7 = r7 & 255(0xff, float:3.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r7 = java.lang.String.format(r3, r7)
            return r7
        L1ca:
            eb.c0 r7 = (eb.c0) r7
            r7.getClass()
            java.lang.String r0 = r7.f2506a
            java.lang.String r1 = r7.f2513h
            if (r1 == 0) goto L1d6
            goto L1d8
        L1d6:
            java.lang.String r1 = r7.f2507b
        L1d8:
            java.lang.String r7 = r7.f2511f
            boolean r2 = og.m.t0(r7)
            if (r2 == 0) goto L1e2
            java.lang.String r7 = "unknown"
        L1e2:
            java.lang.String r2 = ", name="
            java.lang.String r3 = ", version="
            java.lang.String r4 = "- id="
            java.lang.StringBuilder r0 = bc.e.p(r4, r0, r2, r1, r3)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
        L1f4:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1ff
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L1ff
            goto L205
        L1ff:
            r7 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r7)
        L205:
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto L20a
            goto L20b
        L20a:
            r2 = r0
        L20b:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            return r2
        L20e:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.String r0 = "{"
            boolean r7 = og.t.d0(r7, r0, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L21e:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            java.lang.String r7 = og.m.A0(r7, r1)
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            return r7
        L230:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            boolean r7 = og.t.d0(r7, r1, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L23e:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = p.a.l(r7, r7)
            return r7
        L245:
            fb.l0 r7 = (fb.l0) r7
            r7.getClass()
            java.lang.String r7 = r7.f3620a
            boolean r7 = og.m.t0(r7)
            r7 = r7 ^ r5
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L256:
            java.lang.Class<l7.m> r0 = l7.m.class
            v7.d r7 = (v7.d) r7
            fb.l0 r1 = new fb.l0     // Catch: java.lang.Throwable -> L28c
            v7.g0 r3 = r7.f14150k     // Catch: java.lang.Throwable -> L28c
            boolean r5 = r3 instanceof v7.b0     // Catch: java.lang.Throwable -> L28c
            if (r5 == 0) goto L269
            v7.b0 r3 = (v7.b0) r3     // Catch: java.lang.Throwable -> L28c
            k7.a r3 = r3.f14154l     // Catch: java.lang.Throwable -> L28c
            v7.d0 r3 = (v7.d0) r3     // Catch: java.lang.Throwable -> L28c
            goto L26a
        L269:
            r3 = r2
        L26a:
            if (r3 == 0) goto L271
            java.lang.String r3 = r3.S()     // Catch: java.lang.Throwable -> L28c
            goto L272
        L271:
            r3 = r2
        L272:
            r3.getClass()     // Catch: java.lang.Throwable -> L28c
            k7.a r5 = r7.u(r0)     // Catch: java.lang.Throwable -> L28c
            l7.m r5 = (l7.m) r5     // Catch: java.lang.Throwable -> L28c
            if (r5 == 0) goto L284
            p7.a r5 = r5.f7869m     // Catch: java.lang.Throwable -> L28c
            p7.k r5 = (p7.k) r5     // Catch: java.lang.Throwable -> L28c
            v7.y r5 = r5.f10302v     // Catch: java.lang.Throwable -> L28c
            goto L285
        L284:
            r5 = r2
        L285:
            if (r5 == 0) goto L28e
            java.lang.String r5 = r5.T()     // Catch: java.lang.Throwable -> L28c
            goto L28f
        L28c:
            r7 = move-exception
            goto L2b3
        L28e:
            r5 = r2
        L28f:
            if (r5 != 0) goto L293
            java.lang.String r5 = ""
        L293:
            k7.a r7 = r7.u(r0)     // Catch: java.lang.Throwable -> L28c
            l7.m r7 = (l7.m) r7     // Catch: java.lang.Throwable -> L28c
            if (r7 == 0) goto L2a2
            p7.a r7 = r7.f7869m     // Catch: java.lang.Throwable -> L28c
            p7.k r7 = (p7.k) r7     // Catch: java.lang.Throwable -> L28c
            v7.y r7 = r7.f10302v     // Catch: java.lang.Throwable -> L28c
            goto L2a3
        L2a2:
            r7 = r2
        L2a3:
            if (r7 == 0) goto L2af
            v7.a0 r7 = r7.f14200n     // Catch: java.lang.Throwable -> L28c
            byte[] r7 = r7.r()     // Catch: java.lang.Throwable -> L28c
            boolean r4 = v7.z.R(r7)     // Catch: java.lang.Throwable -> L28c
        L2af:
            r1.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L28c
            goto L2b8
        L2b3:
            sf.f r1 = new sf.f
            r1.<init>(r7)
        L2b8:
            boolean r7 = r1 instanceof sf.f
            if (r7 == 0) goto L2bd
            goto L2be
        L2bd:
            r2 = r1
        L2be:
            fb.l0 r2 = (fb.l0) r2
            return r2
        L2c1:
            java.lang.Byte r7 = (java.lang.Byte) r7
            byte r7 = r7.byteValue()
            r7 = r7 & 255(0xff, float:3.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r7 = java.lang.String.format(r3, r7)
            return r7
    }
}
