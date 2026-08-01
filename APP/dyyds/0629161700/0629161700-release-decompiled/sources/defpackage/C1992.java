package defpackage;

/* JADX INFO: renamed from: ᲇᛱᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1992 implements defpackage.InterfaceC1781 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f8624;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f8625;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8626;

    public /* synthetic */ C1992(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f8626 = r2
            r0.f8625 = r1
            r0.f8624 = r3
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1781
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Object mo1032() {
            r13 = this;
            int r0 = r13.f8626
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L1ba;
                case 1: goto L19c;
                case 2: goto L16b;
                case 3: goto La4;
                case 4: goto L90;
                case 5: goto L61;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r13.f8625
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r13 = r13.f8624
            android.app.Activity r13 = (android.app.Activity) r13
            ᛲᲈᛶᲈ r1 = defpackage.AbstractC0902.f4107
            java.lang.Object r1 = r1.getValue()
            com.tencent.mmkv.MMKV r1 = (com.tencent.mmkv.MMKV) r1
            r5 = -558466292162094(0xfffe0413ef0961d2, double:NaN)
            java.lang.String r2 = "privacy_agreement_"
            java.lang.String r0 = r2.concat(r0)
            r1.putBoolean(r0, r4)
            com.tencent.mmkv.MMKV r0 = defpackage.AbstractC0902.m1871()
            r0.m316()
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            r0 = -477514748567086(0xfffe4db3ef0961d2, double:NaN)
            android.content.pm.PackageManager r0 = r13.getPackageManager()
            java.lang.String r1 = r13.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            r13.finishAffinity()
            r13.startActivity(r0)
            java.lang.System.exit(r3)
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            r0 = -477553403272750(0xfffe4daaef0961d2, double:NaN)
            java.lang.String r0 = "System.exit returned normally, while it was supposed to halt JVM."
            r13.<init>(r0)
            throw r13
        L61:
            java.lang.Object r0 = r13.f8625
            ᛵᛴᲇᲁ r0 = (defpackage.C0880) r0
            java.lang.Object r13 = r13.f8624
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r1 = r0.f3966
            java.lang.String r2 = r0.f3968
            r3 = -620412605472302(0xfffdcbbcef0961d2, double:NaN)
            java.lang.String r3 = "user"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L86
            java.lang.String r0 = r0.f3965
            if (r0 != 0) goto L81
            goto L82
        L81:
            r2 = r0
        L82:
            defpackage.AbstractC1533.m2782(r13, r2)
            goto L8d
        L86:
            java.util.Map r1 = defpackage.C1746.f7729
            java.lang.String r0 = r0.f3969
            defpackage.C1746.m3125(r2, r0, r13)
        L8d:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
            return r13
        L90:
            java.lang.Object r0 = r13.f8625
            ᲈᲈ r0 = (defpackage.C2361) r0
            java.lang.Object r13 = r13.f8624
            ᛸᛱᛴᲁ r13 = (defpackage.C1419) r13
            ᲁᲁᛳᛵ r0 = r0.f10218
            java.lang.Object r13 = r13.f6211
            ᛴᛶᛳᛷ r13 = (defpackage.C0688) r13
            r0.mo3329(r13)
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
            return r13
        La4:
            java.lang.Object r0 = r13.f8625
            ᛵᲈᛴᲈ r0 = (defpackage.C0996) r0
            java.lang.Object r13 = r13.f8624
            ᛴᛶᛳᛷ r13 = (defpackage.C0688) r13
            ᛸᛱᛴᲁ r5 = new ᛸᛱᛴᲁ
            r5.<init>()
            ᲈᲈ r0 = r0.f4438
            ᛴᲈᛲᲀ r6 = r0.f10229
            monitor-enter(r6)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L144
            ᛴᛶᛳᛷ r7 = r0.f10211     // Catch: java.lang.Throwable -> L113
            ᛴᛶᛳᛷ r8 = new ᛴᛶᛳᛷ     // Catch: java.lang.Throwable -> L113
            r8.<init>()     // Catch: java.lang.Throwable -> L113
            r9 = r3
        Lbf:
            r10 = 10
            if (r9 >= r10) goto Ld4
            int r10 = r4 << r9
            int r11 = r7.f3312     // Catch: java.lang.Throwable -> L113
            r10 = r10 & r11
            if (r10 == 0) goto Ld1
            int[] r10 = r7.f3313     // Catch: java.lang.Throwable -> L113
            r10 = r10[r9]     // Catch: java.lang.Throwable -> L113
            r8.m1575(r9, r10)     // Catch: java.lang.Throwable -> L113
        Ld1:
            int r9 = r9 + 1
            goto Lbf
        Ld4:
            r9 = r3
        Ld5:
            if (r9 >= r10) goto Le8
            int r11 = r4 << r9
            int r12 = r13.f3312     // Catch: java.lang.Throwable -> L113
            r11 = r11 & r12
            if (r11 == 0) goto Le5
            int[] r11 = r13.f3313     // Catch: java.lang.Throwable -> L113
            r11 = r11[r9]     // Catch: java.lang.Throwable -> L113
            r8.m1575(r9, r11)     // Catch: java.lang.Throwable -> L113
        Le5:
            int r9 = r9 + 1
            goto Ld5
        Le8:
            r5.f6211 = r8     // Catch: java.lang.Throwable -> L113
            int r13 = r8.m1574()     // Catch: java.lang.Throwable -> L113
            long r8 = (long) r13     // Catch: java.lang.Throwable -> L113
            int r13 = r7.m1574()     // Catch: java.lang.Throwable -> L113
            long r10 = (long) r13     // Catch: java.lang.Throwable -> L113
            long r8 = r8 - r10
            r10 = 0
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 == 0) goto L115
            java.util.LinkedHashMap r4 = r0.f10216     // Catch: java.lang.Throwable -> L113
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L113
            if (r4 == 0) goto L104
            goto L115
        L104:
            java.util.LinkedHashMap r2 = r0.f10216     // Catch: java.lang.Throwable -> L113
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L113
            ᲁᲈᛲᛱ[] r4 = new defpackage.C1958[r3]     // Catch: java.lang.Throwable -> L113
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch: java.lang.Throwable -> L113
            ᲁᲈᛲᛱ[] r2 = (defpackage.C1958[]) r2     // Catch: java.lang.Throwable -> L113
            goto L115
        L113:
            r13 = move-exception
            goto L167
        L115:
            java.lang.Object r4 = r5.f6211     // Catch: java.lang.Throwable -> L113
            ᛴᛶᛳᛷ r4 = (defpackage.C0688) r4     // Catch: java.lang.Throwable -> L113
            r0.f10211 = r4     // Catch: java.lang.Throwable -> L113
            ᛴᛴᛸᛴ r4 = r0.f10208     // Catch: java.lang.Throwable -> L113
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113
            r7.<init>()     // Catch: java.lang.Throwable -> L113
            java.lang.String r10 = r0.f10214     // Catch: java.lang.Throwable -> L113
            r7.append(r10)     // Catch: java.lang.Throwable -> L113
            java.lang.String r10 = " onSettings"
            r7.append(r10)     // Catch: java.lang.Throwable -> L113
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L113
            ᲇᛱᲈᲀ r10 = new ᲇᛱᲈᲀ     // Catch: java.lang.Throwable -> L113
            r11 = 4
            r10.<init>(r0, r11, r5)     // Catch: java.lang.Throwable -> L113
            defpackage.C0658.m1488(r4, r7, r10)     // Catch: java.lang.Throwable -> L113
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L144
            ᛴᲈᛲᲀ r4 = r0.f10229     // Catch: java.lang.Throwable -> L144 java.io.IOException -> L146
            java.lang.Object r5 = r5.f6211     // Catch: java.lang.Throwable -> L144 java.io.IOException -> L146
            ᛴᛶᛳᛷ r5 = (defpackage.C0688) r5     // Catch: java.lang.Throwable -> L144 java.io.IOException -> L146
            r4.m1720(r5)     // Catch: java.lang.Throwable -> L144 java.io.IOException -> L146
            goto L14a
        L144:
            r13 = move-exception
            goto L169
        L146:
            r4 = move-exception
            r0.m3861(r1, r1, r4)     // Catch: java.lang.Throwable -> L144
        L14a:
            monitor-exit(r6)
            if (r2 == 0) goto L164
            int r0 = r2.length
        L14e:
            if (r3 >= r0) goto L164
            r1 = r2[r3]
            monitor-enter(r1)
            long r4 = r1.f8522     // Catch: java.lang.Throwable -> L161
            long r4 = r4 + r8
            r1.f8522 = r4     // Catch: java.lang.Throwable -> L161
            if (r13 <= 0) goto L15d
            r1.notifyAll()     // Catch: java.lang.Throwable -> L161
        L15d:
            monitor-exit(r1)
            int r3 = r3 + 1
            goto L14e
        L161:
            r13 = move-exception
            monitor-exit(r1)
            throw r13
        L164:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
            return r13
        L167:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L144
            throw r13     // Catch: java.lang.Throwable -> L144
        L169:
            monitor-exit(r6)
            throw r13
        L16b:
            java.lang.Object r0 = r13.f8625
            ᲈᲈ r0 = (defpackage.C2361) r0
            java.lang.Object r13 = r13.f8624
            ᲁᲈᛲᛱ r13 = (defpackage.C1958) r13
            ᲁᲁᛳᛵ r2 = r0.f10218     // Catch: java.io.IOException -> L179
            r2.mo1955(r13)     // Catch: java.io.IOException -> L179
            goto L199
        L179:
            r2 = move-exception
            ᛴᲈᲀᲇ r3 = defpackage.AbstractC1692.f7550
            ᛴᲈᲀᲇ r3 = defpackage.AbstractC1692.f7550
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Http2Connection.Listener failure for "
            r4.<init>(r5)
            java.lang.String r0 = r0.f10214
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.getClass()
            java.lang.String r3 = "OkHttp"
            android.util.Log.i(r3, r0, r2)
            r13.m3377(r1, r2)     // Catch: java.io.IOException -> L199
        L199:
            ᲁᲀᛱᲁ r13 = defpackage.C1907.f8270
            return r13
        L19c:
            java.lang.Object r0 = r13.f8625
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            java.lang.Object r13 = r13.f8624
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r0 = r0.getCheckedRadioButtonId()
            r1 = -1
            if (r0 == r1) goto L1b9
            int r1 = r13.size()
            if (r0 >= r1) goto L1b9
            java.lang.Object r13 = r13.get(r0)
            ᲈᛷᛶᛳ r13 = (defpackage.C2286) r13
            java.lang.Object r2 = r13.f9650
        L1b9:
            return r2
        L1ba:
            java.lang.Object r0 = r13.f8625
            ᲀᲇᛸᛶ r0 = (defpackage.C1771) r0
            java.lang.Object r13 = r13.f8624
            ᲁᛷᛶᛶ r13 = (defpackage.InterfaceC1886) r13
            ᲇᛷᛳᲀ r1 = r0.f7835
            ᲈᛴᲁᲇ r13 = (defpackage.AbstractC2232) r13
            java.lang.String r13 = r13.f9528
            java.lang.Object r0 = r0.f7834
            java.lang.Object r13 = r1.mo388(r13, r0)
            return r13
    }
}
