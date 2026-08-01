package p000;

/* JADX INFO: renamed from: η */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1084 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13396;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f13397;

    public /* synthetic */ C1084(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f13396 = r1
            r0.f13397 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C1084(p000.kn0 r1, long r2) {
            r0 = this;
            r2 = 1
            r0.f13396 = r2
            r0.<init>()
            r0.f13397 = r1
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r22 = this;
            r0 = r22
            int r1 = r0.f13396
            r2 = 2
            r3 = 1
            r5 = 0
            java.lang.Object r0 = r0.f13397
            switch(r1) {
                case 0: goto L2e7;
                case 1: goto L2e2;
                case 2: goto L2da;
                case 3: goto L281;
                case 4: goto L25e;
                case 5: goto L1bb;
                case 6: goto L172;
                case 7: goto L16a;
                case 8: goto L162;
                case 9: goto L158;
                case 10: goto L14b;
                case 11: goto L134;
                case 12: goto L127;
                case 13: goto L119;
                case 14: goto L107;
                case 15: goto Lae;
                case 16: goto L1c;
                default: goto Lc;
            }
        Lc:
            v32 r0 = (p000.v32) r0
            r0.f11095 = r5
            p000.i91.m2685(r0)
            p000.AbstractC0073bd.m847(r0)
            p000.AbstractC1021yh.m6865(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L1c:
            r1 = r0
            kx1 r1 = (p000.kx1) r1
        L1f:
            java.lang.Object r5 = r1.f6304
            monitor-enter(r5)
            boolean r0 = r1.f6300     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L9e
            r1.f6300 = r3     // Catch: java.lang.Throwable -> L99
            k21 r0 = r1.f6303     // Catch: java.lang.Throwable -> L93
            java.lang.Object[] r6 = r0.f5716     // Catch: java.lang.Throwable -> L93
            int r0 = r0.f5718     // Catch: java.lang.Throwable -> L93
            r7 = 0
        L2f:
            if (r7 >= r0) goto L95
            r8 = r6[r7]     // Catch: java.lang.Throwable -> L93
            jx1 r8 = (p000.jx1) r8     // Catch: java.lang.Throwable -> L93
            c21 r9 = r8.f5641     // Catch: java.lang.Throwable -> L93
            a80 r8 = r8.f5635     // Catch: java.lang.Throwable -> L93
            java.lang.Object[] r10 = r9.f1942     // Catch: java.lang.Throwable -> L93
            long[] r11 = r9.f1941     // Catch: java.lang.Throwable -> L93
            int r12 = r11.length     // Catch: java.lang.Throwable -> L93
            int r12 = r12 - r2
            if (r12 < 0) goto L89
            r13 = 0
        L42:
            r14 = r11[r13]     // Catch: java.lang.Throwable -> L93
            long r2 = ~r14     // Catch: java.lang.Throwable -> L93
            r17 = 7
            long r2 = r2 << r17
            long r2 = r2 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r17
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 == 0) goto L82
            int r2 = r13 - r12
            int r2 = ~r2     // Catch: java.lang.Throwable -> L93
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r4 = 0
        L5f:
            if (r4 >= r2) goto L80
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L77
            int r18 = r13 << 3
            int r18 = r18 + r4
            r22 = r3
            r3 = r10[r18]     // Catch: java.lang.Throwable -> L93
            r8.invoke(r3)     // Catch: java.lang.Throwable -> L93
            goto L79
        L77:
            r22 = r3
        L79:
            long r14 = r14 >> r22
            int r4 = r4 + 1
            r3 = r22
            goto L5f
        L80:
            if (r2 != r3) goto L89
        L82:
            if (r13 == r12) goto L89
            int r13 = r13 + 1
            r2 = 2
            r3 = 1
            goto L42
        L89:
            r9.m1108()     // Catch: java.lang.Throwable -> L93
            int r7 = r7 + 1
            r2 = 2
            r3 = 1
            goto L2f
        L91:
            r2 = 0
            goto L9b
        L93:
            r0 = move-exception
            goto L91
        L95:
            r2 = 0
            r1.f6300 = r2     // Catch: java.lang.Throwable -> L99
            goto L9e
        L99:
            r0 = move-exception
            goto Lac
        L9b:
            r1.f6300 = r2     // Catch: java.lang.Throwable -> L99
            throw r0     // Catch: java.lang.Throwable -> L99
        L9e:
            monitor-exit(r5)
            boolean r0 = r1.m3424()
            if (r0 != 0) goto La8
            s62 r0 = p000.s62.f9751
            return r0
        La8:
            r2 = 2
            r3 = 1
            goto L1f
        Lac:
            monitor-exit(r5)
            throw r0
        Lae:
            dv1 r0 = (p000.dv1) r0
            x91 r0 = r0.f3302
            java.lang.Object r1 = r0.getValue()
            jw1 r1 = (p000.jw1) r1
            long r1 = r1.f5615
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Lc4
            goto Lfd
        Lc4:
            java.lang.Object r1 = r0.getValue()
            jw1 r1 = (p000.jw1) r1
            long r1 = r1.f5615
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto Ld2
            r3 = 1
            goto Ld3
        Ld2:
            r3 = 0
        Ld3:
            r4 = 32
            long r6 = r1 >> r4
            int r4 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto Le3
            r4 = 1
            goto Le4
        Le3:
            r4 = 0
        Le4:
            r3 = r3 | r4
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r7
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto Lf7
            r16 = 1
            goto Lf9
        Lf7:
            r16 = 0
        Lf9:
            r1 = r3 | r16
            if (r1 == 0) goto Lfe
        Lfd:
            return r5
        Lfe:
            java.lang.Object r0 = r0.getValue()
            jw1 r0 = (p000.jw1) r0
            long r0 = r0.f5615
            throw r5
        L107:
            kq1 r0 = (p000.kq1) r0
            jr0 r1 = r0.mo192()
            ll1 r2 = new ll1
            r3 = 0
            r2.<init>(r3, r0)
            r1.m2980(r2)
            s62 r0 = p000.s62.f9751
            return r0
        L119:
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            cf1 r1 = new cf1
            r2 = 23
            r1.<init>(r2)
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r1)
            return r0
        L127:
            li0 r0 = (p000.li0) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f6679
            boolean r0 = r0.get()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L134:
            r1 = r0
            dg0 r1 = (p000.dg0) r1
            r1.getClass()
            lg0 r0 = r1.f3129     // Catch: java.io.IOException -> L142
            r2 = 2
            r3 = 0
            r0.m3562(r2, r3, r3)     // Catch: java.io.IOException -> L142
            goto L148
        L142:
            r0 = move-exception
            sz r2 = p000.EnumC0816sz.f10088
            r1.m1738(r2, r2, r0)
        L148:
            s62 r0 = p000.s62.f9751
            return r0
        L14b:
            nd0 r0 = (p000.nd0) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7537
            boolean r0 = r0.get()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L158:
            java.lang.Long r0 = (java.lang.Long) r0
            com.example.dyhelper.hook.γ r1 = com.example.dyhelper.hook.C0157.f2411
            com.example.dyhelper.hook.C0157.m1470(r0)
            s62 r0 = p000.s62.f9751
            return r0
        L162:
            aw r0 = (p000.C0055aw) r0
            r0.m612()
            s62 r0 = p000.s62.f9751
            return r0
        L16a:
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            int r1 = androidx.activity.ComponentActivity.f339
            r0.reportFullyDrawn()
            return r5
        L172:
            android.widget.TextView r0 = (android.widget.TextView) r0
            rz r1 = p000.EnumC0077bh.f1715
            if (r1 == 0) goto L180
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L180
            r4 = 0
            goto L1a2
        L180:
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L185:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a2
            java.lang.Object r2 = r1.next()
            bh r2 = (p000.EnumC0077bh) r2
            ch r2 = p000.AbstractC0782s1.m5339(r2)
            boolean r2 = r2.f2110
            if (r2 == 0) goto L185
            int r4 = r4 + 1
            if (r4 < 0) goto L19e
            goto L185
        L19e:
            p000.AbstractC1021yh.m6916()
            throw r5
        L1a2:
            android.content.Context r1 = r0.getContext()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 2131689530(0x7f0f003a, float:1.9008078E38)
            java.lang.String r1 = r1.getString(r3, r2)
            r0.setText(r1)
            s62 r0 = p000.s62.f9751
            return r0
        L1bb:
            rb r0 = (p000.C0755rb) r0
            s62 r1 = p000.s62.f9751
            java.util.IdentityHashMap r2 = r0.f9319
            java.util.IdentityHashMap r3 = r0.f9320
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L1cb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L21a
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r0.getValue()
            qb r0 = (p000.C0718qb) r0
            r5.getClass()     // Catch: java.lang.Throwable -> L204
            r0.getClass()     // Catch: java.lang.Throwable -> L204
            float r6 = r0.f8947     // Catch: java.lang.Throwable -> L204
            r5.setAlpha(r6)     // Catch: java.lang.Throwable -> L204
            boolean r6 = r0.f8948     // Catch: java.lang.Throwable -> L204
            r5.setClickable(r6)     // Catch: java.lang.Throwable -> L204
            boolean r6 = r0.f8949     // Catch: java.lang.Throwable -> L204
            r5.setLongClickable(r6)     // Catch: java.lang.Throwable -> L204
            boolean r6 = r0.f8950     // Catch: java.lang.Throwable -> L204
            r5.setFocusable(r6)     // Catch: java.lang.Throwable -> L204
            int r0 = r0.f8951     // Catch: java.lang.Throwable -> L204
            r5.setImportantForAccessibility(r0)     // Catch: java.lang.Throwable -> L204
            r5 = r1
            goto L20a
        L204:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
        L20a:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 == 0) goto L1cb
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "r4d245d98269851e7"
            p000.AbstractC0602nx.m4142(r5, r0)
            goto L1cb
        L21a:
            r2.clear()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L225:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25a
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r0 = r0.getValue()
            pb r0 = (p000.C0681pb) r0
            android.graphics.drawable.Drawable r0 = r0.f8481     // Catch: java.lang.Throwable -> L244
            r4.setBackground(r0)     // Catch: java.lang.Throwable -> L244
            r4 = r1
            goto L24a
        L244:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
        L24a:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)
            if (r0 == 0) goto L225
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "r9f2bf9809d31c9dd"
            p000.AbstractC0602nx.m4142(r4, r0)
            goto L225
        L25a:
            r3.clear()
            return r1
        L25e:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.util.Map r1 = p000.C0792sb.f9783
            r1.getClass()
            monitor-enter(r1)
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L27e
            rb r0 = (p000.C0755rb) r0     // Catch: java.lang.Throwable -> L27e
            monitor-exit(r1)
            if (r0 != 0) goto L270
            goto L27b
        L270:
            sb r1 = p000.C0792sb.f9786
            η r1 = new η
            r2 = 5
            r1.<init>(r2, r0)
            p000.C0792sb.m5402(r1)
        L27b:
            s62 r0 = p000.s62.f9751
            return r0
        L27e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L281:
            p9 r0 = (p000.C0679p9) r0
            android.os.Handler r1 = p000.C0753r9.f9291
            java.lang.String r0 = r0.f8457
            java.lang.String r1 = "shown_dates"
            boolean r2 = p000.q02.m4671(r0)
            if (r2 == 0) goto L290
            goto L2d7
        L290:
            android.content.SharedPreferences r2 = p000.C0753r9.f9295
            if (r2 == 0) goto L295
            goto L2a0
        L295:
            android.content.Context r2 = p000.C0753r9.f9294
            if (r2 != 0) goto L29b
            r2 = r5
            goto L2a0
        L29b:
            p000.C0753r9.m5069(r2)
            android.content.SharedPreferences r2 = p000.C0753r9.f9295
        L2a0:
            if (r2 != 0) goto L2a3
            goto L2d7
        L2a3:
            nz r3 = p000.C0604nz.f7825
            java.util.Set r3 = r2.getStringSet(r1, r3)
            if (r3 == 0) goto L2b2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r3)
            goto L2b7
        L2b2:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
        L2b7:
            r3.add(r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r1 = r2.putStringSet(r1, r3)
            java.lang.String r2 = "last_shown_date"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r0)
            r1.apply()
            java.lang.String r1 = "r62fe5deb53d30681"
            java.lang.String r2 = "notice marked shown date="
            java.lang.String r0 = r2.concat(r0)
            r2 = 4
            p000.C0888ux.m5988(r1, r0, r5, r2, r5)
        L2d7:
            s62 r0 = p000.s62.f9751
            return r0
        L2da:
            mq r0 = (p000.C0558mq) r0
            p000.AbstractC0825t7.m5610(r0)
            s62 r0 = p000.s62.f9751
            return r0
        L2e2:
            kn0 r0 = (p000.kn0) r0
            pc r0 = (p000.AbstractC0682pc) r0
            throw r5
        L2e7:
            com.example.dyhelper.ui.AboutActivity r0 = (com.example.dyhelper.p002ui.AboutActivity) r0
            int r1 = com.example.dyhelper.p002ui.AboutActivity.f2435
            θ r1 = new θ
            r3 = 0
            r1.<init>(r3, r0)
            return r1
    }
}
