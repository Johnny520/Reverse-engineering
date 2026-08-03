package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9194h;

    public /* synthetic */ a(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f9193g = r2
            r0.f9194h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ a(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f9193g = r2
            r0.f9194h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ a(nb.c r1, android.content.pm.PackageManager r2) {
            r0 = this;
            r1 = 0
            r0.f9193g = r1
            r0.<init>()
            r0.f9194h = r2
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f9193g
            switch(r0) {
                case 0: goto L58c;
                case 1: goto L57d;
                case 2: goto L418;
                case 3: goto L372;
                case 4: goto L33e;
                case 5: goto L328;
                case 6: goto L31b;
                case 7: goto L30e;
                case 8: goto L2fd;
                case 9: goto L2ef;
                case 10: goto L2dc;
                case 11: goto L2c1;
                case 12: goto L2b3;
                case 13: goto L27c;
                case 14: goto L260;
                case 15: goto L230;
                case 16: goto L21d;
                case 17: goto L1af;
                case 18: goto L19d;
                case 19: goto L189;
                case 20: goto L16d;
                case 21: goto L131;
                case 22: goto L103;
                case 23: goto Lee;
                case 24: goto Ldc;
                case 25: goto Lcb;
                case 26: goto Lb2;
                case 27: goto La3;
                case 28: goto L96;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r12.f9194h
            z8.d r0 = (z8.d) r0
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L16:
            if (r13 == 0) goto L5d
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r13.equals(r1)
            if (r1 != 0) goto L5d
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r4 != 0) goto L2d
            r2.add(r3)
            goto L2d
        L44:
            java.util.Iterator r1 = r2.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r0.add(r2)
            goto L48
        L58:
            java.lang.Class r13 = r13.getSuperclass()
            goto L16
        L5d:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r3 != 0) goto L66
            java.lang.Class r3 = r2.getType()
            java.lang.Class r4 = java.lang.Boolean.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L91
            java.lang.Class r2 = r2.getType()
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L66
        L91:
            r13.add(r1)
            goto L66
        L95:
            return r13
        L96:
            java.lang.Object r0 = r12.f9194h
            yg.b r0 = (yg.b) r0
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            r13 = 0
            r0.f(r13)
            sf.n r13 = sf.n.f12433a
            return r13
        La3:
            java.lang.Object r0 = r12.f9194h
            fb.d1 r0 = (fb.d1) r0
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            wb.yt r13 = new wb.yt
            r13.<init>(r0)
            return r13
        Lb2:
            java.lang.Object r0 = r12.f9194h
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r13 = h.Hchat.utils.KavaReflector.invoke(r13, r0, r1)
            boolean r0 = r13 instanceof java.lang.String
            if (r0 == 0) goto Lc9
            java.lang.String r13 = (java.lang.String) r13
            goto Lca
        Lc9:
            r13 = 0
        Lca:
            return r13
        Lcb:
            java.lang.Object r0 = r12.f9194h
            wb.cp r0 = (wb.cp) r0
            wb.bp r13 = (wb.bp) r13
            r13.getClass()
            fg.l r0 = r0.f15529d
            r0.invoke(r13)
            sf.n r13 = sf.n.f12433a
            return r13
        Ldc:
            java.lang.Object r0 = r12.f9194h
            wb.ec r0 = (wb.ec) r0
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Leb
            r0.invoke()
        Leb:
            sf.n r13 = sf.n.f12433a
            return r13
        Lee:
            java.lang.Object r0 = r12.f9194h
            wb.j r0 = (wb.j) r0
            wb.bp r13 = (wb.bp) r13
            r13.getClass()
            wb.i r0 = (wb.i) r0
            wb.cp r0 = r0.f16693a
            fg.l r0 = r0.f15529d
            r0.invoke(r13)
            sf.n r13 = sf.n.f12433a
            return r13
        L103:
            java.lang.Object r0 = r12.f9194h
            w0.s r0 = (w0.s) r0
            java.lang.Object r1 = r0.f14816g
            monitor-enter(r1)
            w0.r r0 = r0.f14818i     // Catch: java.lang.Throwable -> L12d
            r0.getClass()     // Catch: java.lang.Throwable -> L12d
            java.lang.Object r2 = r0.f14798b     // Catch: java.lang.Throwable -> L12d
            r2.getClass()     // Catch: java.lang.Throwable -> L12d
            int r3 = r0.f14800d     // Catch: java.lang.Throwable -> L12d
            f.b0 r4 = r0.f14799c     // Catch: java.lang.Throwable -> L12d
            if (r4 != 0) goto L126
            f.b0 r4 = new f.b0     // Catch: java.lang.Throwable -> L12d
            r4.<init>()     // Catch: java.lang.Throwable -> L12d
            r0.f14799c = r4     // Catch: java.lang.Throwable -> L12d
            f.k0 r5 = r0.f14802f     // Catch: java.lang.Throwable -> L12d
            r5.m(r2, r4)     // Catch: java.lang.Throwable -> L12d
        L126:
            r0.b(r13, r3, r2, r4)     // Catch: java.lang.Throwable -> L12d
            monitor-exit(r1)
            sf.n r13 = sf.n.f12433a
            return r13
        L12d:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
        L131:
            java.lang.Object r0 = r12.f9194h
            w.j1 r0 = (w.j1) r0
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            i0.f1 r1 = r0.f14510a
            float r2 = r1.g()
            float r2 = r2 + r13
            i0.f1 r0 = r0.f14511b
            float r3 = r0.g()
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L156
            float r13 = r0.g()
            float r0 = r1.g()
            float r13 = r13 - r0
            goto L160
        L156:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L160
            float r13 = r1.g()
            float r13 = -r13
        L160:
            float r0 = r1.g()
            float r0 = r0 + r13
            r1.h(r0)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            return r13
        L16d:
            java.lang.Object r0 = r12.f9194h
            h0.l r0 = (h0.l) r0
            f2.y r13 = (f2.y) r13
            f2.x r1 = h0.h0.f4904c
            h0.g0 r2 = new h0.g0
            w.g0 r3 = w.g0.f14460g
            long r4 = r0.a()
            h0.f0 r6 = h0.f0.f4885h
            r7 = 1
            r2.<init>(r3, r4, r6, r7)
            r13.a(r1, r2)
            sf.n r13 = sf.n.f12433a
            return r13
        L189:
            java.lang.Object r0 = r12.f9194h
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            r0.append(r13)
            r13 = 10
            r0.append(r13)
            sf.n r13 = sf.n.f12433a
            return r13
        L19d:
            java.lang.Object r0 = r12.f9194h
            java.util.Map r0 = (java.util.Map) r0
            v8.a r13 = (v8.a) r13
            r13.getClass()
            java.lang.String r13 = r13.f14201a
            java.lang.Object r13 = r0.get(r13)
            java.lang.Long r13 = (java.lang.Long) r13
            return r13
        L1af:
            java.lang.Object r0 = r12.f9194h
            v8.g r0 = (v8.g) r0
            h.Hchat.hooks.api.model.WeChatMessage r13 = (h.Hchat.hooks.api.model.WeChatMessage) r13
            r13.getClass()
            long r1 = r13.msgId
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L217
            java.util.LinkedHashSet r3 = r0.f14240d
            java.lang.String r4 = r0.f14239c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L217
            long r1 = r13.createTime
            r5 = 1
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L1e2
            r5 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L1e2
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r5
        L1e2:
            long r5 = r0.f14241e
            r7 = 5000(0x1388, double:2.4703E-320)
            long r5 = r5 - r7
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L217
            boolean r0 = og.m.t0(r4)
            if (r0 != 0) goto L215
            java.lang.String r0 = r13.content
            java.lang.String r13 = r13.bodyContent()
            java.lang.String[] r13 = new java.lang.String[]{r0, r13}
            ng.j r13 = tf.l.k0(r13)
            java.util.Iterator r13 = r13.iterator()
        L203:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L217
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = gg.l.a(r0, r4)
            if (r0 == 0) goto L203
        L215:
            r13 = 1
            goto L218
        L217:
            r13 = 0
        L218:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L21d:
            java.lang.Object r0 = r12.f9194h
            v0.d r0 = (v0.d) r0
            v0.f r0 = r0.f13877i
            if (r0 == 0) goto L22a
            boolean r13 = r0.a(r13)
            goto L22b
        L22a:
            r13 = 1
        L22b:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L230:
            java.lang.Object r0 = r12.f9194h
            f2.y r0 = (f2.y) r0
            z0.f r13 = (z0.f) r13
            android.view.autofill.AutofillValue r13 = r13.f22489a
            boolean r1 = r13.isToggle()
            if (r1 == 0) goto L247
            boolean r13 = r13.getToggleValue()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            goto L248
        L247:
            r13 = 0
        L248:
            if (r13 == 0) goto L25a
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L253
            h2.a r13 = h2.a.f5048g
            goto L255
        L253:
            h2.a r13 = h2.a.f5049h
        L255:
            f2.w.e(r0, r13)
            r13 = 1
            goto L25b
        L25a:
            r13 = 0
        L25b:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L260:
            java.lang.Object r0 = r12.f9194h
            th.i r0 = (th.i) r0
            f1.d0 r13 = (f1.d0) r13
            r13.getClass()
            r1 = 1
            r13.r(r1)
            vh.f r0 = r0.B
            java.lang.Object r0 = r0.f14392g
            vh.e r0 = (vh.e) r0
            r13.Q0(r0)
            r13.Y(r1)
            sf.n r13 = sf.n.f12433a
            return r13
        L27c:
            java.lang.String r0 = "(this Map)"
            java.lang.Object r1 = r12.f9194h
            p0.b r1 = (p0.b) r1
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            r13.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r13.getKey()
            if (r3 != r1) goto L294
            r3 = r0
            goto L298
        L294:
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L298:
            r2.append(r3)
            r3 = 61
            r2.append(r3)
            java.lang.Object r13 = r13.getValue()
            if (r13 != r1) goto L2a7
            goto L2ab
        L2a7:
            java.lang.String r0 = java.lang.String.valueOf(r13)
        L2ab:
            r2.append(r0)
            java.lang.String r13 = r2.toString()
            return r13
        L2b3:
            java.lang.Object r0 = r12.f9194h
            tf.a r0 = (tf.a) r0
            if (r13 != r0) goto L2bc
            java.lang.String r13 = "(this Collection)"
            goto L2c0
        L2bc:
            java.lang.String r13 = java.lang.String.valueOf(r13)
        L2c0:
            return r13
        L2c1:
            java.lang.Object r0 = r12.f9194h
            sh.e2 r0 = (sh.e2) r0
            i.j r13 = (i.j) r13
            r13.getClass()
            i0.j1 r13 = r13.f5698e
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r0.b(r13)
            sf.n r13 = sf.n.f12433a
            return r13
        L2dc:
            java.lang.Object r0 = r12.f9194h
            f1.r0 r0 = (f1.r0) r0
            f1.d0 r13 = (f1.d0) r13
            r13.getClass()
            r13.Q0(r0)
            r0 = 1
            r13.r(r0)
            sf.n r13 = sf.n.f12433a
            return r13
        L2ef:
            java.lang.Object r0 = r12.f9194h
            s3.e r0 = (s3.e) r0
            r3.e r13 = (r3.e) r13
            i0.j1 r0 = r0.f12358a
            r0.setValue(r13)
            sf.n r13 = sf.n.f12433a
            return r13
        L2fd:
            java.lang.Object r0 = r12.f9194h
            v0.f r0 = (v0.f) r0
            if (r0 == 0) goto L308
            boolean r13 = r0.a(r13)
            goto L309
        L308:
            r13 = 1
        L309:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L30e:
            java.lang.Object r0 = r12.f9194h
            s.h0 r0 = (s.h0) r0
            i0.a0 r13 = (i0.a0) r13
            b0.m r13 = new b0.m
            r1 = 5
            r13.<init>(r0, r1)
            return r13
        L31b:
            java.lang.Object r0 = r12.f9194h
            s.a0 r0 = (s.a0) r0
            i0.a0 r13 = (i0.a0) r13
            b0.m r13 = new b0.m
            r1 = 3
            r13.<init>(r0, r1)
            return r13
        L328:
            java.lang.Object r0 = r12.f9194h
            rb.d r0 = (rb.d) r0
            rb.d r13 = (rb.d) r13
            r13.getClass()
            java.lang.String r13 = r13.f11881a
            java.lang.String r0 = r0.f11881a
            boolean r13 = gg.l.a(r13, r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L33e:
            java.lang.Object r0 = r12.f9194h
            r9.k r0 = (r9.k) r0
            og.f r13 = (og.f) r13
            r13.getClass()
            og.i r13 = (og.i) r13
            og.h r1 = r13.f9830c
            r2 = 1
            og.e r2 = r1.a(r2)
            if (r2 == 0) goto L355
            java.lang.String r1 = r2.f9822a
            goto L364
        L355:
            r2 = 2
            og.e r1 = r1.a(r2)
            if (r1 == 0) goto L35f
            java.lang.String r1 = r1.f9822a
            goto L360
        L35f:
            r1 = 0
        L360:
            if (r1 != 0) goto L364
            java.lang.String r1 = ""
        L364:
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L36d
            goto L371
        L36d:
            java.lang.String r0 = r13.c()
        L371:
            return r0
        L372:
            java.lang.Object r0 = r12.f9194h
            r.z r0 = (r.z) r0
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            float r13 = -r13
            r1 = 0
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 >= 0) goto L388
            boolean r2 = r0.d()
            if (r2 == 0) goto L392
        L388:
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 <= 0) goto L395
            boolean r2 = r0.c()
            if (r2 != 0) goto L395
        L392:
            r13 = r1
            goto L412
        L395:
            float r2 = r0.f11287h
            float r2 = java.lang.Math.abs(r2)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L3a2
            goto L3a7
        L3a2:
            java.lang.String r2 = "entered drag with non-zero pending scroll"
            o.b.c(r2)
        L3a7:
            r2 = 1
            r0.f11283d = r2
            float r4 = r0.f11287h
            float r4 = r4 + r13
            r0.f11287h = r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 <= 0) goto L402
            float r4 = r0.f11287h
            int r5 = java.lang.Math.round(r4)
            i0.j1 r6 = r0.f11285f
            java.lang.Object r6 = r6.getValue()
            r.p r6 = (r.p) r6
            boolean r7 = r0.f11281b
            r7 = r7 ^ r2
            r.p r6 = r6.a(r5, r7)
            if (r6 == 0) goto L3dc
            r.p r7 = r0.f11282c
            if (r7 == 0) goto L3dc
            r.p r5 = r7.a(r5, r2)
            if (r5 == 0) goto L3db
            r0.f11282c = r5
            goto L3dc
        L3db:
            r6 = 0
        L3dc:
            if (r6 == 0) goto L3f1
            boolean r5 = r0.f11281b
            r0.g(r6, r5, r2)
            i0.a1 r2 = r0.f11302w
            sf.n r5 = sf.n.f12433a
            r2.setValue(r5)
            float r2 = r0.f11287h
            float r4 = r4 - r2
            r0.k(r4, r6)
            goto L402
        L3f1:
            x1.f0 r2 = r0.f11291l
            if (r2 == 0) goto L3f8
            r2.k()
        L3f8:
            float r2 = r0.f11287h
            float r4 = r4 - r2
            r.p r2 = r0.j()
            r0.k(r4, r2)
        L402:
            float r2 = r0.f11287h
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L40d
            goto L412
        L40d:
            float r2 = r0.f11287h
            float r13 = r13 - r2
            r0.f11287h = r1
        L412:
            float r13 = -r13
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            return r13
        L418:
            java.lang.Object r0 = r12.f9194h
            qb.k r0 = (qb.k) r0
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r8.g r0 = r0.f10834a
            boolean r13 = eh.a.y(r1)
            if (r13 == 0) goto L42c
            goto L574
        L42c:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r13 = og.m.t0(r1)
            r3 = 0
            r4 = 0
            if (r13 == 0) goto L439
        L436:
            r7 = r4
            goto L4ca
        L439:
            java.lang.String r13 = "com.tencent.mm.vfs.w6"
            java.lang.String r5 = "com.tencent.mm.vfs.p6"
            java.lang.String[] r5 = new java.lang.String[]{r13, r5}
            r13 = r3
        L442:
            r6 = 2
            if (r13 < r6) goto L446
            goto L436
        L446:
            r7 = r5[r13]
            java.lang.ClassLoader r8 = r0.f11622c
            java.lang.Class r7 = h.Hchat.utils.KavaReflector.loadClass(r7, r8)
            if (r7 == 0) goto L579
            java.lang.String r8 = "E"
            java.lang.String r9 = "F"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9}
            r9 = r3
        L459:
            if (r9 < r6) goto L4ab
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredMethods(r7)
            java.util.Iterator r6 = r6.iterator()
        L463:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L579
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L47a
            goto L463
        L47a:
            java.lang.Class r8 = r7.getReturnType()
            java.lang.Class<java.io.InputStream> r9 = java.io.InputStream.class
            boolean r8 = gg.l.a(r8, r9)
            if (r8 != 0) goto L487
            goto L463
        L487:
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r9 = r8.length
            r10 = 1
            if (r9 != r10) goto L463
            r8 = r8[r3]
            boolean r8 = gg.l.a(r8, r2)
            if (r8 != 0) goto L498
            goto L463
        L498:
            java.lang.Object[] r8 = new java.lang.Object[]{r1}
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r7, r4, r8)
            boolean r8 = r7 instanceof java.io.InputStream
            if (r8 == 0) goto L4a7
            java.io.InputStream r7 = (java.io.InputStream) r7
            goto L4a8
        L4a7:
            r7 = r4
        L4a8:
            if (r7 == 0) goto L463
            goto L4ca
        L4ab:
            r10 = r8[r9]
            java.lang.Class[] r11 = new java.lang.Class[]{r2}
            java.lang.reflect.Method r10 = h.Hchat.utils.KavaReflector.findMethod(r7, r10, r11)
            if (r10 == 0) goto L575
            java.lang.Object[] r11 = new java.lang.Object[]{r1}
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invoke(r10, r4, r11)
            boolean r11 = r10 instanceof java.io.InputStream
            if (r11 == 0) goto L4c6
            java.io.InputStream r10 = (java.io.InputStream) r10
            goto L4c7
        L4c6:
            r10 = r4
        L4c7:
            if (r10 == 0) goto L575
            r7 = r10
        L4ca:
            if (r7 == 0) goto L573
            java.io.File r13 = new java.io.File
            r13.<init>(r1)
            java.lang.String r13 = dg.l.c0(r13)
            boolean r2 = og.m.t0(r13)
            if (r2 != 0) goto L4e4
            int r2 = r13.length()
            r5 = 8
            if (r2 > r5) goto L4e4
            goto L4e5
        L4e4:
            r13 = r4
        L4e5:
            if (r13 == 0) goto L4e8
            goto L4ea
        L4e8:
            java.lang.String r13 = "silk"
        L4ea:
            java.io.File r2 = new java.io.File
            android.content.Context r0 = r0.f11620a
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r5 = "Hchat_fav_voice"
            r2.<init>(r0, r5)
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L505
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L505
            goto L573
        L505:
            java.io.File r0 = new java.io.File
            int r1 = r1.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r5 = "fav_"
            java.lang.String r6 = "."
            java.lang.String r13 = bc.e.j(r5, r1, r6, r13)
            r0.<init>(r2, r13)
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54d
            r13.<init>(r0, r3)     // Catch: java.lang.Throwable -> L54d
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L554
        L523:
            int r2 = r7.read(r1)     // Catch: java.lang.Throwable -> L554
            if (r2 > 0) goto L550
            r13.close()     // Catch: java.lang.Throwable -> L54d
            r7.close()     // Catch: java.lang.Throwable -> L540
            boolean r13 = r0.isFile()     // Catch: java.lang.Throwable -> L540
            if (r13 == 0) goto L543
            long r1 = r0.length()     // Catch: java.lang.Throwable -> L540
            r5 = 0
            int r13 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r13 <= 0) goto L543
            goto L544
        L540:
            r0 = move-exception
            r13 = r0
            goto L562
        L543:
            r0 = r4
        L544:
            if (r0 == 0) goto L54b
            java.lang.String r13 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L540
            goto L568
        L54b:
            r13 = r4
            goto L568
        L54d:
            r0 = move-exception
            r13 = r0
            goto L55c
        L550:
            r13.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L554
            goto L523
        L554:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L557
        L557:
            r0 = move-exception
            ig.a.i(r13, r1)     // Catch: java.lang.Throwable -> L54d
            throw r0     // Catch: java.lang.Throwable -> L54d
        L55c:
            throw r13     // Catch: java.lang.Throwable -> L55d
        L55d:
            r0 = move-exception
            ig.a.i(r7, r13)     // Catch: java.lang.Throwable -> L540
            throw r0     // Catch: java.lang.Throwable -> L540
        L562:
            sf.f r0 = new sf.f
            r0.<init>(r13)
            r13 = r0
        L568:
            boolean r0 = r13 instanceof sf.f
            if (r0 == 0) goto L56e
            goto L56f
        L56e:
            r4 = r13
        L56f:
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
            goto L574
        L573:
            r1 = r4
        L574:
            return r1
        L575:
            int r9 = r9 + 1
            goto L459
        L579:
            int r13 = r13 + 1
            goto L442
        L57d:
            java.lang.Object r0 = r12.f9194h
            og.h r0 = (og.h) r0
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            og.e r13 = r0.a(r13)
            return r13
        L58c:
            java.lang.Object r0 = r12.f9194h
            android.content.pm.PackageManager r0 = (android.content.pm.PackageManager) r0
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13
            java.lang.String r1 = ""
            android.content.pm.ServiceInfo r2 = r13.serviceInfo
            r3 = 0
            if (r2 == 0) goto L5ff
            java.lang.String r4 = r2.packageName
            if (r4 == 0) goto L5a6
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            goto L5a7
        L5a6:
            r4 = r3
        L5a7:
            if (r4 != 0) goto L5aa
            r4 = r1
        L5aa:
            int r5 = r4.length()
            if (r5 != 0) goto L5b1
            goto L5ff
        L5b1:
            boolean r5 = r2.enabled
            if (r5 == 0) goto L5ff
            boolean r5 = r2.exported
            if (r5 == 0) goto L5ff
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            if (r2 == 0) goto L5c2
            boolean r2 = r2.enabled
            r2 = r2 ^ 1
            goto L5c3
        L5c2:
            r2 = 0
        L5c3:
            if (r2 == 0) goto L5c6
            goto L5ff
        L5c6:
            java.lang.CharSequence r13 = r13.loadLabel(r0)     // Catch: java.lang.Throwable -> L5db
            if (r13 == 0) goto L5de
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L5db
            if (r13 == 0) goto L5de
            java.lang.CharSequence r13 = og.m.R0(r13)     // Catch: java.lang.Throwable -> L5db
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L5db
            goto L5e6
        L5db:
            r0 = move-exception
            r13 = r0
            goto L5e0
        L5de:
            r13 = r3
            goto L5e6
        L5e0:
            sf.f r0 = new sf.f
            r0.<init>(r13)
            r13 = r0
        L5e6:
            boolean r0 = r13 instanceof sf.f
            if (r0 == 0) goto L5ec
            goto L5ed
        L5ec:
            r3 = r13
        L5ed:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L5f2
            goto L5f3
        L5f2:
            r1 = r3
        L5f3:
            boolean r13 = og.m.t0(r1)
            if (r13 == 0) goto L5fa
            r1 = r4
        L5fa:
            nb.d r3 = new nb.d
            r3.<init>(r4, r1)
        L5ff:
            return r3
    }
}
