package v0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13866h;

    public /* synthetic */ a(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f13865g = r2
            r0.f13866h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r22 = this;
            r1 = r22
            int r0 = r1.f13865g
            switch(r0) {
                case 0: goto L328;
                case 1: goto L308;
                case 2: goto L2b5;
                case 3: goto L2b0;
                case 4: goto L2a7;
                case 5: goto L29c;
                case 6: goto L28e;
                case 7: goto L1f8;
                case 8: goto L1f3;
                case 9: goto L1df;
                case 10: goto L12f;
                case 11: goto L9c;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f13866h
            z8.e r0 = (z8.e) r0
            z8.g r2 = r0.f22643e
            r3 = 0
            if (r2 == 0) goto L97
            monitor-enter(r2)
            boolean r0 = r2.f22653f     // Catch: java.lang.Throwable -> L94
            r4 = 1
            if (r0 == 0) goto L1a
            monitor-exit(r2)
            r0 = r4
            goto L90
        L1a:
            java.util.List r0 = r2.e()     // Catch: java.lang.Throwable -> L31
            java.util.List r5 = r2.d()     // Catch: java.lang.Throwable -> L31
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L33
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L33
            monitor-exit(r2)
            r0 = r3
            goto L90
        L31:
            r0 = move-exception
            goto L73
        L33:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L31
        L37:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L4f
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L31
            r8.i r7 = r8.i.f11631b     // Catch: java.lang.Throwable -> L31
            wb.yo r8 = new wb.yo     // Catch: java.lang.Throwable -> L31
            r9 = 4
            r8.<init>(r2, r9)     // Catch: java.lang.Throwable -> L31
            r7.b(r6, r8)     // Catch: java.lang.Throwable -> L31
            goto L37
        L4f:
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L31
        L53:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L31
            z8.f r5 = (z8.f) r5     // Catch: java.lang.Throwable -> L31
            r8.i r6 = r8.i.f11631b     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r7 = r5.f22644a     // Catch: java.lang.Throwable -> L31
            c9.c2 r8 = new c9.c2     // Catch: java.lang.Throwable -> L31
            r9 = 17
            r8.<init>(r2, r9, r5)     // Catch: java.lang.Throwable -> L31
            r6.b(r7, r8)     // Catch: java.lang.Throwable -> L31
            goto L53
        L6e:
            r2.f22653f = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L31
            goto L79
        L73:
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L94
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L94
            r0 = r5
        L79:
            java.lang.Throwable r5 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L94
            if (r5 != 0) goto L80
            goto L89
        L80:
            y9.b r0 = r2.f22649b     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = "通话铃声屏蔽 Hook 安装失败"
            r0.invoke(r6, r5)     // Catch: java.lang.Throwable -> L94
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L94
        L89:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L94
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L94
            monitor-exit(r2)
        L90:
            if (r0 != r4) goto L97
            r3 = r4
            goto L97
        L94:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L94
            throw r0
        L97:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L9c:
            java.lang.Object r0 = r1.f13866h
            z8.a r0 = (z8.a) r0
            z8.d r2 = r0.f22630e
            r3 = 0
            if (r2 == 0) goto L12a
            monitor-enter(r2)
            boolean r0 = r2.f22642g     // Catch: java.lang.Throwable -> L127
            r4 = 1
            if (r0 == 0) goto Laf
            monitor-exit(r2)
            r0 = r4
            goto L123
        Laf:
            java.util.List r0 = r2.d()     // Catch: java.lang.Throwable -> Le4
            boolean r5 = z8.d.b(r0)     // Catch: java.lang.Throwable -> Le4
            if (r5 != 0) goto Lbc
            monitor-exit(r2)
        Lba:
            r0 = r3
            goto L123
        Lbc:
            java.lang.reflect.Method r5 = r2.e()     // Catch: java.lang.Throwable -> Le4
            if (r5 == 0) goto L104
            z8.b r6 = r2.f()     // Catch: java.lang.Throwable -> Le4
            if (r6 == 0) goto L102
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le4
        Lcc:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> Le4
            if (r7 == 0) goto Le6
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> Le4
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> Le4
            r8.i r8 = r8.i.f11631b     // Catch: java.lang.Throwable -> Le4
            z8.c r9 = new z8.c     // Catch: java.lang.Throwable -> Le4
            r10 = 0
            r9.<init>(r2, r10)     // Catch: java.lang.Throwable -> Le4
            r8.b(r7, r9)     // Catch: java.lang.Throwable -> Le4
            goto Lcc
        Le4:
            r0 = move-exception
            goto L106
        Le6:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> Le4
            java.lang.reflect.Method r7 = r6.f22631a     // Catch: java.lang.Throwable -> Le4
            c9.c2 r8 = new c9.c2     // Catch: java.lang.Throwable -> Le4
            r9 = 16
            r8.<init>(r2, r9, r6)     // Catch: java.lang.Throwable -> Le4
            r0.b(r7, r8)     // Catch: java.lang.Throwable -> Le4
            z8.c r6 = new z8.c     // Catch: java.lang.Throwable -> Le4
            r7 = 1
            r6.<init>(r2, r7)     // Catch: java.lang.Throwable -> Le4
            r0.b(r5, r6)     // Catch: java.lang.Throwable -> Le4
            r2.f22642g = r4     // Catch: java.lang.Throwable -> Le4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le4
            goto L10c
        L102:
            monitor-exit(r2)
            goto Lba
        L104:
            monitor-exit(r2)
            goto Lba
        L106:
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L127
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L127
            r0 = r5
        L10c:
            java.lang.Throwable r5 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L127
            if (r5 != 0) goto L113
            goto L11c
        L113:
            y9.b r0 = r2.f22637b     // Catch: java.lang.Throwable -> L127
            java.lang.String r6 = "通话媒体限制 Hook 安装失败"
            r0.invoke(r6, r5)     // Catch: java.lang.Throwable -> L127
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L127
        L11c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L127
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L127
            monitor-exit(r2)
        L123:
            if (r0 != r4) goto L12a
            r3 = r4
            goto L12a
        L127:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L127
            throw r0
        L12a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L12f:
            java.lang.Object r0 = r1.f13866h
            y9.c r0 = (y9.c) r0
            y9.e r2 = r0.f22329e
            r3 = 0
            if (r2 == 0) goto L1da
            boolean r0 = r2.f22341j
            r4 = 1
            if (r0 == 0) goto L13f
            goto L1d0
        L13f:
            java.lang.String r0 = "fillingUsername:need getKfInfo"
            r8.g r5 = r2.f22332a
            android.content.Context r6 = r5.f11620a
            java.lang.ClassLoader r7 = r5.f11622c
            r7.getClass()
            l8.i r6 = o8.k.a(r6, r7)
            java.lang.String r6 = r6.f7933h
            android.content.SharedPreferences r7 = r2.f22340i
            java.lang.ClassLoader r5 = r5.f11622c
            java.lang.String r8 = "username_bind"
            java.lang.reflect.Method r5 = e8.b.c(r7, r6, r5, r8)
            r9 = 0
            if (r5 == 0) goto L168
            boolean r10 = r2.i(r5)
            if (r10 == 0) goto L164
            goto L165
        L164:
            r5 = r9
        L165:
            if (r5 == 0) goto L168
            goto L1c1
        L168:
            java.lang.String r5 = "MicroMsg.ChattingItem"
            java.lang.String[] r5 = new java.lang.String[]{r5, r0}
            java.util.List r5 = r2.c(r5)
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L180
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r5 = r2.c(r0)
        L180:
            java.util.Iterator r0 = r5.iterator()
        L184:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L198
            java.lang.Object r5 = r0.next()
            r10 = r5
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            boolean r10 = r2.i(r10)
            if (r10 == 0) goto L184
            r9 = r5
        L198:
            r5 = r9
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L1a1
            e8.b.h(r7, r6, r8, r5)
            goto L1c1
        L1a1:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r9 = r7.edit()     // Catch: java.lang.Throwable -> L1c1
            java.lang.String r10 = ""
            java.lang.String r7 = r7.getString(r0, r10)     // Catch: java.lang.Throwable -> L1c1
            boolean r7 = gg.l.a(r7, r6)     // Catch: java.lang.Throwable -> L1c1
            if (r7 != 0) goto L1ba
            android.content.SharedPreferences$Editor r7 = r9.clear()     // Catch: java.lang.Throwable -> L1c1
            r7.putString(r0, r6)     // Catch: java.lang.Throwable -> L1c1
        L1ba:
            android.content.SharedPreferences$Editor r0 = r9.remove(r8)     // Catch: java.lang.Throwable -> L1c1
            r0.apply()     // Catch: java.lang.Throwable -> L1c1
        L1c1:
            if (r5 == 0) goto L1da
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1d2
            wb.yo r6 = new wb.yo     // Catch: java.lang.Throwable -> L1d2
            r7 = 2
            r6.<init>(r2, r7)     // Catch: java.lang.Throwable -> L1d2
            r0.b(r5, r6)     // Catch: java.lang.Throwable -> L1d2
            r2.f22341j = r4     // Catch: java.lang.Throwable -> L1d2
        L1d0:
            r3 = r4
            goto L1da
        L1d2:
            r0 = move-exception
            y9.b r2 = r2.f22334c
            java.lang.String r4 = "群员头衔Hook安装失败"
            r2.invoke(r4, r0)
        L1da:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L1df:
            java.lang.Object r0 = r1.f13866h
            xb.o r0 = (xb.o) r0
            qg.t r2 = r0.f21523a
            xb.n r3 = new xb.n
            r4 = 2
            r5 = 0
            r3.<init>(r0, r5, r4)
            r0 = 3
            qg.v.q(r2, r5, r3, r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L1f3:
            java.lang.Object r0 = r1.f13866h
            v.d r0 = (v.d) r0
            return r0
        L1f8:
            java.lang.Object r0 = r1.f13866h
            r2 = r0
            w0.s r2 = (w0.s) r2
        L1fd:
            java.lang.Object r3 = r2.f14816g
            monitor-enter(r3)
            boolean r0 = r2.f14812c     // Catch: java.lang.Throwable -> L27d
            if (r0 != 0) goto L282
            r0 = 1
            r2.f14812c = r0     // Catch: java.lang.Throwable -> L27d
            j0.b r0 = r2.f14815f     // Catch: java.lang.Throwable -> L277
            java.lang.Object[] r5 = r0.f6671g     // Catch: java.lang.Throwable -> L277
            int r0 = r0.f6673i     // Catch: java.lang.Throwable -> L277
            r6 = 0
        L20e:
            if (r6 >= r0) goto L279
            r7 = r5[r6]     // Catch: java.lang.Throwable -> L277
            w0.r r7 = (w0.r) r7     // Catch: java.lang.Throwable -> L277
            f.l0 r8 = r7.f14803g     // Catch: java.lang.Throwable -> L277
            fg.l r7 = r7.f14797a     // Catch: java.lang.Throwable -> L277
            java.lang.Object[] r9 = r8.f2856b     // Catch: java.lang.Throwable -> L277
            long[] r10 = r8.f2855a     // Catch: java.lang.Throwable -> L277
            int r11 = r10.length     // Catch: java.lang.Throwable -> L277
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26b
            r12 = 0
        L222:
            r13 = r10[r12]     // Catch: java.lang.Throwable -> L277
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L277
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L264
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L277
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L241:
            if (r15 >= r4) goto L262
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L259
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L277
            r7.invoke(r5)     // Catch: java.lang.Throwable -> L277
            goto L25b
        L259:
            r19 = r5
        L25b:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L241
        L262:
            if (r4 != r5) goto L26d
        L264:
            if (r12 == r11) goto L26d
            int r12 = r12 + 1
            r5 = r16
            goto L222
        L26b:
            r16 = r5
        L26d:
            r8.b()     // Catch: java.lang.Throwable -> L277
            int r6 = r6 + 1
            r5 = r16
            goto L20e
        L275:
            r15 = 0
            goto L27f
        L277:
            r0 = move-exception
            goto L275
        L279:
            r15 = 0
            r2.f14812c = r15     // Catch: java.lang.Throwable -> L27d
            goto L282
        L27d:
            r0 = move-exception
            goto L28c
        L27f:
            r2.f14812c = r15     // Catch: java.lang.Throwable -> L27d
            throw r0     // Catch: java.lang.Throwable -> L27d
        L282:
            monitor-exit(r3)
            boolean r0 = r2.b()
            if (r0 != 0) goto L1fd
            sf.n r0 = sf.n.f12433a
            return r0
        L28c:
            monitor-exit(r3)
            throw r0
        L28e:
            java.lang.Object r0 = r1.f13866h
            u2.k r0 = (u2.k) r0
            long r2 = r0.b()
            u2.j r0 = new u2.j
            r0.<init>(r2)
            return r0
        L29c:
            java.lang.Object r0 = r1.f13866h
            m.p1 r0 = (m.p1) r0
            w.j1 r2 = new w.j1
            r3 = 0
            r2.<init>(r0, r3)
            return r2
        L2a7:
            java.lang.Object r0 = r1.f13866h
            w.q0 r0 = (w.q0) r0
            w.m1 r0 = r0.d()
            return r0
        L2b0:
            java.lang.Object r0 = r1.f13866h
            i2.g r0 = (i2.g) r0
            return r0
        L2b5:
            java.lang.Object r0 = r1.f13866h
            v8.q r0 = (v8.q) r0
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r0.f14275b
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r4 = "Hchat_auto_message_forward"
            r2.<init>(r3, r4)
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 - r5
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L2f9
            ng.j r2 = tf.l.k0(r2)
            eb.s0 r5 = new eb.s0
            r6 = 3
            r5.<init>(r3, r0, r6)
            ng.i r3 = new ng.i
            r4 = 1
            r3.<init>(r2, r4, r5)
            ng.h r2 = new ng.h
            r2.<init>(r3)
        L2e9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f9
            java.lang.Object r3 = r2.next()
            java.io.File r3 = (java.io.File) r3
            r0.a(r3)
            goto L2e9
        L2f9:
            v0.a r2 = new v0.a
            r3 = 2
            r2.<init>(r0, r3)
            r3 = 21600000(0x1499700, double:1.0671818E-316)
            r0.o(r3, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L308:
            java.lang.Object r0 = r1.f13866h
            v0.i r0 = (v0.i) r0
            p4.t r0 = r0.f13885i
            if (r0 == 0) goto L326
            r2 = 0
            sf.e[] r3 = new sf.e[r2]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            sf.e[] r2 = (sf.e[]) r2
            android.os.Bundle r2 = x6.d.n(r2)
            r0.G(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L327
        L326:
            r2 = 0
        L327:
            return r2
        L328:
            java.lang.Object r0 = r1.f13866h
            v0.b r0 = (v0.b) r0
            v0.j r2 = r0.f13867g
            java.lang.Object r3 = r0.f13870j
            if (r3 == 0) goto L337
            java.lang.Object r0 = r2.d(r0, r3)
            goto L33d
        L337:
            java.lang.String r0 = "Value should be initialized"
            j8.o.t(r0)
            r0 = 0
        L33d:
            return r0
    }
}
