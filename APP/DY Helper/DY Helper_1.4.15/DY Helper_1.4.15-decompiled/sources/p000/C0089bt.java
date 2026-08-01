package p000;

/* JADX INFO: renamed from: bt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0089bt extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f1827;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.String f1828;

    public C0089bt(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.f1827 = r0
            java.util.List r0 = p000.if0.f5065
            r1.f1828 = r2
            r1.<init>()
            return
    }

    public /* synthetic */ C0089bt(java.lang.String r1, int r2) {
            r0 = this;
            r0.f1827 = r2
            r0.f1828 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r8) {
            r7 = this;
            int r0 = r7.f1827
            r1 = 4
            r2 = 1077936128(0x40400000, float:3.0)
            r3 = 0
            r4 = 0
            switch(r0) {
                case 0: goto L13d;
                case 1: goto L100;
                case 2: goto Lae;
                case 3: goto L88;
                case 4: goto L34;
                case 5: goto La;
                case 6: goto Le;
                default: goto La;
            }
        La:
            super.afterHookedMethod(r8)
            return
        Le:
            r8.getClass()
            java.lang.Object[] r0 = r8.f5692
            r0 = r0[r3]
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L1c
            r4 = r0
            java.lang.Float r4 = (java.lang.Float) r4
        L1c:
            if (r4 == 0) goto L33
            float r0 = r4.floatValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L27
            goto L33
        L27:
            java.lang.String[] r0 = p000.n82.f7460
            java.lang.Object r8 = r8.f5691
            r8.getClass()
            java.lang.String r7 = r7.f1828
            p000.n82.m4013(r8, r7)
        L33:
            return
        L34:
            r8.getClass()
            java.lang.Object[] r8 = r8.f5692
            r8.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r8.length
        L42:
            if (r3 >= r2) goto L50
            r5 = r8[r3]
            boolean r6 = r5 instanceof java.lang.Float
            if (r6 == 0) goto L4d
            r0.add(r5)
        L4d:
            int r3 = r3 + 1
            goto L42
        L50:
            java.lang.String r7 = r7.f1828
            java.util.Iterator r8 = r0.iterator()
        L56:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r8.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.String r2 = "rfe847aaa60ab2d90"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "📦 new "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r5 = "(speed="
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.C0888ux.m5988(r2, r0, r4, r1, r4)
            goto L56
        L87:
            return
        L88:
            r8.getClass()
            java.lang.Object[] r0 = r8.f5692
            r0 = r0[r3]
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L96
            r4 = r0
            java.lang.Float r4 = (java.lang.Float) r4
        L96:
            if (r4 == 0) goto Lad
            float r0 = r4.floatValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto La1
            goto Lad
        La1:
            java.lang.String[] r0 = p000.n82.f7460
            java.lang.Object r8 = r8.f5691
            r8.getClass()
            java.lang.String r7 = r7.f1828
            p000.n82.m4013(r8, r7)
        Lad:
            return
        Lae:
            r8.getClass()
            java.lang.String r7 = r7.f1828
            java.lang.String r8 = "cache_loader"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto Lbc
            goto Lfc
        Lbc:
            int r7 = p000.jx0.f5634
            xn0 r8 = p000.xn0.f12231
            monitor-enter(r8)
            java.lang.Integer r0 = p000.xn0.f12233     // Catch: java.lang.Throwable -> Lfd
            if (r0 != 0) goto Lc6
            goto Ld6
        Lc6:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Lfd
            if (r0 == r7) goto Lcd
            goto Ld6
        Lcd:
            p000.xn0.f12233 = r4     // Catch: java.lang.Throwable -> Lfd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lfd
            p000.xn0.f12232 = r0     // Catch: java.lang.Throwable -> Lfd
            r3 = 1
        Ld6:
            monitor-exit(r8)
            if (r3 != 0) goto Lda
            goto Lfc
        Lda:
            java.lang.Object r8 = p000.ui1.f10844
            java.lang.String r8 = "offline_cache_applied_count"
            r0 = 10
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = p000.j81.m2906(r7, r0, r1)
            p000.ui1.m5873(r8, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "[rebuild] applied count="
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "DYH-OfflineCache"
            p000.C0888ux.m5975(r8, r7)
        Lfc:
            return
        Lfd:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L100:
            r8.getClass()
            java.lang.Object r8 = r8.f5691
            boolean r0 = r8 instanceof android.view.ViewGroup
            if (r0 == 0) goto L10c
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L10d
        L10c:
            r8 = r4
        L10d:
            if (r8 != 0) goto L110
            goto L13c
        L110:
            java.util.List r0 = p000.if0.f5065
            int r0 = p000.gf0.m2300()     // Catch: java.lang.Throwable -> L11c
            p000.if0.m2757(r8, r0)     // Catch: java.lang.Throwable -> L11c
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L11c
            goto L123
        L11c:
            r8 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r8)
            r8 = r0
        L123:
            java.lang.String r7 = r7.f1828
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto L13c
            java.lang.String r0 = "r3a3868dbf7747834"
            java.lang.String r8 = r8.getMessage()
            java.lang.String r2 = "同步长按倍速提示失败: "
            java.lang.String r3 = ", "
            java.lang.String r7 = p000.a12.m18(r2, r7, r3, r8)
            p000.C0888ux.m5988(r0, r7, r4, r1, r4)
        L13c:
            return
        L13d:
            r8.getClass()
            java.lang.String r7 = r7.f1828
            p000.C0187ct.m1614(r8, r7)     // Catch: java.lang.Throwable -> L148
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L148
            goto L14f
        L148:
            r8 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r8)
            r8 = r0
        L14f:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto L16d
            java.lang.String r0 = "rf839340cfbdf7ea6"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "骰子 "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " Hook 回调失败，保留原始结果"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            p000.C0888ux.m5977(r0, r7, r8)
        L16d:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r12) {
            r11 = this;
            int r0 = r11.f1827
            java.lang.String r1 = "▶ "
            java.lang.String r2 = ".setPlaySpeed("
            r3 = 4
            java.lang.String r4 = ")"
            java.lang.String r5 = "rfe847aaa60ab2d90"
            r6 = 0
            r7 = 0
            switch(r0) {
                case 2: goto Lb7;
                case 3: goto L95;
                case 4: goto L10;
                case 5: goto L38;
                case 6: goto L14;
                default: goto L10;
            }
        L10:
            super.beforeHookedMethod(r12)
            return
        L14:
            r12.getClass()
            java.lang.String r11 = r11.f1828
            java.lang.Object[] r12 = r12.f5692
            r12 = r12[r7]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "▶ [动态] "
            r0.<init>(r1)
            r0.append(r11)
            r0.append(r2)
            r0.append(r12)
            r0.append(r4)
            java.lang.String r11 = r0.toString()
            p000.C0888ux.m5988(r5, r11, r6, r3, r6)
            return
        L38:
            r12.getClass()
            java.lang.Object[] r12 = r12.f5692
            r12 = r12[r7]
            if (r12 != 0) goto L42
            goto L94
        L42:
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> L94
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L94
            r0.getClass()     // Catch: java.lang.Throwable -> L94
            int r2 = r0.length     // Catch: java.lang.Throwable -> L94
        L4e:
            if (r7 >= r2) goto L62
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L94
            java.lang.Class r9 = r8.getType()     // Catch: java.lang.Throwable -> L94
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L94
            boolean r9 = p000.ln0.m3626(r9, r10)     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto L5f
            goto L63
        L5f:
            int r7 = r7 + 1
            goto L4e
        L62:
            r8 = r6
        L63:
            if (r8 == 0) goto L69
            r0 = 1
            r8.setAccessible(r0)     // Catch: java.lang.Throwable -> L94
        L69:
            if (r8 == 0) goto L74
            float r12 = r8.getFloat(r12)     // Catch: java.lang.Throwable -> L94
            java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch: java.lang.Throwable -> L94
            goto L75
        L74:
            r12 = r6
        L75:
            java.lang.String r11 = r11.f1828     // Catch: java.lang.Throwable -> L94
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r0.<init>()     // Catch: java.lang.Throwable -> L94
            r0.append(r1)     // Catch: java.lang.Throwable -> L94
            r0.append(r11)     // Catch: java.lang.Throwable -> L94
            java.lang.String r11 = ".setPlaybackParameters(speed="
            r0.append(r11)     // Catch: java.lang.Throwable -> L94
            r0.append(r12)     // Catch: java.lang.Throwable -> L94
            r0.append(r4)     // Catch: java.lang.Throwable -> L94
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L94
            p000.C0888ux.m5988(r5, r11, r6, r3, r6)     // Catch: java.lang.Throwable -> L94
        L94:
            return
        L95:
            r12.getClass()
            java.lang.String r11 = r11.f1828
            java.lang.Object[] r12 = r12.f5692
            r12 = r12[r7]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            r0.append(r2)
            r0.append(r12)
            r0.append(r4)
            java.lang.String r11 = r0.toString()
            p000.C0888ux.m5988(r5, r11, r6, r3, r6)
            return
        Lb7:
            r12.getClass()
            boolean r0 = p000.jx0.f5633
            if (r0 != 0) goto Lbf
            goto Lfd
        Lbf:
            java.lang.Object[] r0 = r12.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r7, r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto Lcf
            r6 = r0
            java.lang.Integer r6 = (java.lang.Integer) r6
        Lcf:
            if (r6 == 0) goto Lfd
            int r0 = r6.intValue()
            if (r0 > 0) goto Ld8
            goto Lfd
        Ld8:
            int r1 = p000.jx0.f5634
            if (r0 != r1) goto Ldd
            goto Lfd
        Ldd:
            java.lang.Object[] r12 = r12.f5692
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r12[r7] = r2
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.m41.f6932
            java.lang.String r11 = r11.f1828
            java.lang.String r12 = " original="
            java.lang.String r2 = " custom="
            java.lang.String r3 = "[override] role="
            java.lang.StringBuilder r11 = p000.AbstractC0602nx.m4135(r0, r3, r11, r12, r2)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            p000.m41.m3727(r11)
        Lfd:
            return
    }
}
