package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ p1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r20 = this;
            r1 = r20
            int r0 = r1.a
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L1c6;
                case 1: goto L1be;
                case 2: goto L1b6;
                case 3: goto L1ae;
                case 4: goto L1a0;
                case 5: goto L198;
                case 6: goto L188;
                case 7: goto Lcf;
                case 8: goto Lc8;
                case 9: goto L81;
                case 10: goto L60;
                case 11: goto L58;
                case 12: goto L34;
                case 13: goto L2a;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r1.b
            mb0 r0 = (defpackage.mb0) r0
            android.view.View r3 = r0.a
            r4 = 2114322440(0x7e060008, float:4.452918E37)
            java.lang.Object r3 = r3.getTag(r4)
            long r5 = r0.d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r3 = defpackage.ip.i(r3, r5)
            if (r3 == 0) goto L29
            android.view.View r0 = r0.a
            r0.setTag(r4, r2)
        L29:
            return
        L2a:
            java.lang.Object r0 = r1.b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.d
            r0.requestLayout()
            return
        L34:
            java.lang.Object r0 = r1.b
            u7 r0 = (defpackage.u7) r0
            r0.c = r5
            wd r2 = r0.e
            com.google.android.material.sidesheet.SideSheetBehavior r2 = (com.google.android.material.sidesheet.SideSheetBehavior) r2
            ma0 r4 = r2.i
            if (r4 == 0) goto L4e
            boolean r4 = r4.f()
            if (r4 == 0) goto L4e
            int r2 = r0.b
            r0.a(r2)
            goto L57
        L4e:
            int r4 = r2.h
            if (r4 != r3) goto L57
            int r0 = r0.b
            r2.r(r0)
        L57:
            return
        L58:
            java.lang.Object r0 = r1.b
            yy r0 = (defpackage.yy) r0
            r0.e()
            return
        L60:
            java.lang.Object r0 = r1.b
            gy r0 = (defpackage.gy) r0
            androidx.lifecycle.a r2 = r0.f
            int r3 = r0.b
            if (r3 != 0) goto L71
            r0.c = r4
            iq r3 = defpackage.iq.ON_PAUSE
            r2.d(r3)
        L71:
            int r3 = r0.a
            if (r3 != 0) goto L80
            boolean r3 = r0.c
            if (r3 == 0) goto L80
            iq r3 = defpackage.iq.ON_STOP
            r2.d(r3)
            r0.d = r4
        L80:
            return
        L81:
            java.lang.Object r0 = r1.b
            i00 r0 = (defpackage.i00) r0
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            gn r2 = defpackage.gn.a
            r2.getClass()
            java.lang.ref.WeakReference r2 = defpackage.gn.f
            if (r2 == 0) goto Lc7
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 != 0) goto L9b
            goto Lc7
        L9b:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> Lc7
            r3.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = r2.getPackageName()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = defpackage.pb0.b0     // Catch: java.lang.Throwable -> Lc7
            r3.setClassName(r5, r6)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = "siphfbKnIOivKkdXrqo=\n"
            java.lang.String r6 = "2U8YItzGVIE=\n"
            java.lang.String r5 = "key_native_url"     // Catch: java.lang.Throwable -> Lc7
            r3.putExtra(r5, r0)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "2fnoxzRSwA==\n"
            java.lang.String r5 = "spyRmEMzubQ=\n"
            java.lang.String r0 = "key_way"     // Catch: java.lang.Throwable -> Lc7
            r3.putExtra(r0, r4)     // Catch: java.lang.Throwable -> Lc7
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r0)     // Catch: java.lang.Throwable -> Lc7
            r2.startActivity(r3)     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            return
        Lc8:
            java.lang.Object r0 = r1.b
            e00 r0 = (defpackage.e00) r0
            r0.a = r5
            return
        Lcf:
            java.lang.Object r0 = r1.b
            r2 = r0
            vk r2 = (defpackage.vk) r2
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.Object r4 = r2.d
            monitor-enter(r4)
            ip r6 = r2.h     // Catch: java.lang.Throwable -> Le0
            if (r6 != 0) goto Le3
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le0
            goto L183
        Le0:
            r0 = move-exception
            goto L186
        Le3:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le0
            gl r4 = r2.b()     // Catch: java.lang.Throwable -> Lf4
            int r6 = r4.e     // Catch: java.lang.Throwable -> Lf4
            if (r6 != r3) goto Lf7
            java.lang.Object r3 = r2.d     // Catch: java.lang.Throwable -> Lf4
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lf4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf1
            goto Lf7
        Lf1:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf1
            throw r0     // Catch: java.lang.Throwable -> Lf4
        Lf4:
            r0 = move-exception
            goto L172
        Lf7:
            if (r6 != 0) goto L15b
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = defpackage.n70.a     // Catch: java.lang.Throwable -> L154
            defpackage.m70.a(r0)     // Catch: java.lang.Throwable -> L154
            vh r0 = r2.c     // Catch: java.lang.Throwable -> L154
            android.content.Context r3 = r2.a     // Catch: java.lang.Throwable -> L154
            r0.getClass()     // Catch: java.lang.Throwable -> L154
            gl[] r0 = new defpackage.gl[]{r4}     // Catch: java.lang.Throwable -> L154
            ct r6 = defpackage.b80.a     // Catch: java.lang.Throwable -> L154
            android.graphics.Typeface r0 = r6.h(r3, r0, r5)     // Catch: java.lang.Throwable -> L154
            android.content.Context r3 = r2.a     // Catch: java.lang.Throwable -> L154
            android.net.Uri r4 = r4.a     // Catch: java.lang.Throwable -> L154
            java.nio.MappedByteBuffer r3 = defpackage.gt.o(r3, r4)     // Catch: java.lang.Throwable -> L154
            if (r3 == 0) goto L14c
            if (r0 == 0) goto L14c
            java.lang.String r4 = "EmojiCompat.MetadataRepo.create"
            defpackage.m70.a(r4)     // Catch: java.lang.Throwable -> L145
            a8 r4 = new a8     // Catch: java.lang.Throwable -> L145
            wv r3 = defpackage.gt.x(r3)     // Catch: java.lang.Throwable -> L145
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L145
            defpackage.m70.b()     // Catch: java.lang.Throwable -> L154
            defpackage.m70.b()     // Catch: java.lang.Throwable -> Lf4
            java.lang.Object r3 = r2.d     // Catch: java.lang.Throwable -> Lf4
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lf4
            ip r0 = r2.h     // Catch: java.lang.Throwable -> L13c
            if (r0 == 0) goto L13e
            r0.I(r4)     // Catch: java.lang.Throwable -> L13c
            goto L13e
        L13c:
            r0 = move-exception
            goto L143
        L13e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13c
            r2.a()     // Catch: java.lang.Throwable -> Lf4
            goto L183
        L143:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13c
            throw r0     // Catch: java.lang.Throwable -> Lf4
        L145:
            r0 = move-exception
            int r3 = defpackage.n70.a     // Catch: java.lang.Throwable -> L154
            defpackage.m70.b()     // Catch: java.lang.Throwable -> L154
            throw r0     // Catch: java.lang.Throwable -> L154
        L14c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L154
            java.lang.String r3 = "Unable to open file."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L154
            throw r0     // Catch: java.lang.Throwable -> L154
        L154:
            r0 = move-exception
            int r3 = defpackage.n70.a     // Catch: java.lang.Throwable -> Lf4
            defpackage.m70.b()     // Catch: java.lang.Throwable -> Lf4
            throw r0     // Catch: java.lang.Throwable -> Lf4
        L15b:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lf4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf4
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lf4
            r4.append(r6)     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf4
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lf4
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lf4
            throw r3     // Catch: java.lang.Throwable -> Lf4
        L172:
            java.lang.Object r3 = r2.d
            monitor-enter(r3)
            ip r4 = r2.h     // Catch: java.lang.Throwable -> L17d
            if (r4 == 0) goto L17f
            r4.F(r0)     // Catch: java.lang.Throwable -> L17d
            goto L17f
        L17d:
            r0 = move-exception
            goto L184
        L17f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17d
            r2.a()
        L183:
            return
        L184:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17d
            throw r0
        L186:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le0
            throw r0
        L188:
            java.lang.Object r0 = r1.b
            ph r0 = (defpackage.ph) r0
            android.widget.AutoCompleteTextView r2 = r0.h
            boolean r2 = r2.isPopupShowing()
            r0.s(r2)
            r0.m = r2
            return
        L198:
            java.lang.Object r0 = r1.b
            g2 r0 = (defpackage.g2) r0
            defpackage.g2.a(r0)
            return
        L1a0:
            java.lang.Object r0 = r1.b
            vb r0 = (defpackage.vb) r0
            java.lang.Runnable r3 = r0.b
            if (r3 == 0) goto L1ad
            r3.run()
            r0.b = r2
        L1ad:
            return
        L1ae:
            java.lang.Object r0 = r1.b
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.invalidateOptionsMenu()
            return
        L1b6:
            java.lang.Object r0 = r1.b
            ua r0 = (defpackage.ua) r0
            r0.s(r4)
            return
        L1be:
            java.lang.Object r0 = r1.b
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.j0()
            return
        L1c6:
            java.lang.Object r0 = r1.b
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L25e
            android.os.Handler r6 = defpackage.s1.g
            java.lang.reflect.Method r0 = defpackage.s1.f
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r7 < r8) goto L1e0
            r2.recreate()
            goto L25e
        L1e0:
            r8 = 27
            r9 = 26
            if (r7 == r9) goto L1e8
            if (r7 != r8) goto L1ec
        L1e8:
            if (r0 != 0) goto L1ec
            goto L25b
        L1ec:
            java.lang.reflect.Method r10 = defpackage.s1.e
            if (r10 != 0) goto L1f6
            java.lang.reflect.Method r10 = defpackage.s1.d
            if (r10 != 0) goto L1f6
            goto L25b
        L1f6:
            java.lang.reflect.Field r10 = defpackage.s1.c     // Catch: java.lang.Throwable -> L25b
            java.lang.Object r11 = r10.get(r2)     // Catch: java.lang.Throwable -> L25b
            if (r11 != 0) goto L1ff
            goto L25b
        L1ff:
            java.lang.reflect.Field r10 = defpackage.s1.b     // Catch: java.lang.Throwable -> L25b
            java.lang.Object r10 = r10.get(r2)     // Catch: java.lang.Throwable -> L25b
            if (r10 != 0) goto L208
            goto L25b
        L208:
            android.app.Application r12 = r2.getApplication()     // Catch: java.lang.Throwable -> L25b
            r1 r13 = new r1     // Catch: java.lang.Throwable -> L25b
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L25b
            r12.registerActivityLifecycleCallbacks(r13)     // Catch: java.lang.Throwable -> L25b
            h1 r14 = new h1     // Catch: java.lang.Throwable -> L25b
            r14.<init>(r13, r11, r4, r5)     // Catch: java.lang.Throwable -> L25b
            r6.post(r14)     // Catch: java.lang.Throwable -> L25b
            if (r7 == r9) goto L222
            if (r7 != r8) goto L221
            goto L222
        L221:
            r4 = r5
        L222:
            if (r4 == 0) goto L244
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L240
            java.lang.Boolean r15 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L240
            r16 = 0
            r17 = 0
            r4 = r12
            r12 = 0
            r7 = r13
            r13 = 0
            r18 = r15
            r19 = r15
            java.lang.Object[] r8 = new java.lang.Object[]{r11, r12, r13, r14, r15, r16, r17, r18, r19}     // Catch: java.lang.Throwable -> L23e
            r0.invoke(r10, r8)     // Catch: java.lang.Throwable -> L23e
            goto L249
        L23e:
            r0 = move-exception
            goto L252
        L240:
            r0 = move-exception
            r4 = r12
            r7 = r13
            goto L252
        L244:
            r4 = r12
            r7 = r13
            r2.recreate()     // Catch: java.lang.Throwable -> L23e
        L249:
            h1 r0 = new h1     // Catch: java.lang.Throwable -> L25b
            r0.<init>(r4, r7, r3, r5)     // Catch: java.lang.Throwable -> L25b
            r6.post(r0)     // Catch: java.lang.Throwable -> L25b
            goto L25e
        L252:
            h1 r8 = new h1     // Catch: java.lang.Throwable -> L25b
            r8.<init>(r4, r7, r3, r5)     // Catch: java.lang.Throwable -> L25b
            r6.post(r8)     // Catch: java.lang.Throwable -> L25b
            throw r0     // Catch: java.lang.Throwable -> L25b
        L25b:
            r2.recreate()
        L25e:
            return
    }
}
