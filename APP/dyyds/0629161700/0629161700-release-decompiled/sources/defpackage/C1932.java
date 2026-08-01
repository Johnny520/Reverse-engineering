package defpackage;

/* JADX INFO: renamed from: ᲁᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1932 extends defpackage.AbstractC1883 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f8401;

    @Override // defpackage.AbstractC1883
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo954(android.app.Activity r11, java.util.ArrayList r12, int r13) {
            r10 = this;
            ᛵᛳᲀ r0 = r10.f8173
            boolean r1 = r12.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L10
            java.util.ArrayList r1 = defpackage.AbstractC2193.m3599(r11)
            goto Ld9
        L10:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.util.Iterator r4 = r12.iterator()
        L19:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r4.next()
            ᲁᛱᛲᛳ r5 = (defpackage.AbstractC1793) r5
            int r6 = r5.mo1202()
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r6 <= r7) goto L31
            r1.remove(r5)
            goto L19
        L31:
            java.util.List r6 = r5.mo1208()
            if (r6 == 0) goto L19
            r7 = r6
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L19
            int r5 = r5.mo2345(r11)
            r8 = 2
            if (r5 == r8) goto L64
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L4e
            goto L19
        L4e:
            java.util.Iterator r5 = r7.iterator()
        L52:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L19
            java.lang.Object r7 = r5.next()
            ᲁᛱᛲᛳ r7 = (defpackage.AbstractC1793) r7
            int r7 = r7.mo2345(r11)
            if (r7 != r8) goto L52
        L64:
            r1.removeAll(r6)
            goto L19
        L68:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L74
            java.util.ArrayList r1 = defpackage.AbstractC2193.m3599(r11)
            goto Ld9
        L74:
            int r4 = r1.size()
            if (r4 != r3) goto L85
            java.lang.Object r1 = r1.get(r2)
            ᲁᛱᛲᛳ r1 = (defpackage.AbstractC1793) r1
            java.util.ArrayList r1 = r1.mo2346(r11)
            goto Ld9
        L85:
            java.lang.Object r4 = r1.get(r2)
            ᲁᛱᛲᛳ r4 = (defpackage.AbstractC1793) r4
            java.util.ArrayList r4 = r4.mo2346(r11)
            r5 = r3
        L90:
            int r6 = r1.size()
            if (r5 >= r6) goto Ld5
            java.lang.Object r6 = r1.get(r5)
            ᲁᛱᛲᛳ r6 = (defpackage.AbstractC1793) r6
            java.util.ArrayList r6 = r6.mo2346(r11)
            int r7 = r6.size()
            int r8 = r4.size()
            if (r7 == r8) goto Lab
            goto Ld5
        Lab:
            r7 = r2
        Lac:
            int r8 = r6.size()
            if (r7 >= r8) goto Lc8
            java.lang.Object r8 = r6.get(r7)
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.Object r9 = r4.get(r7)
            android.content.Intent r9 = (android.content.Intent) r9
            boolean r8 = r8.filterEquals(r9)
            if (r8 != 0) goto Lc5
            goto Ld5
        Lc5:
            int r7 = r7 + 1
            goto Lac
        Lc8:
            int r4 = r1.size()
            int r4 = r4 - r3
            if (r5 != r4) goto Ld1
            r1 = r6
            goto Ld9
        Ld1:
            int r5 = r5 + 1
            r4 = r6
            goto L90
        Ld5:
            java.util.ArrayList r1 = defpackage.AbstractC2193.m3599(r11)
        Ld9:
            java.util.Iterator r4 = r1.iterator()
        Ldd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L11a
            java.lang.Object r5 = r4.next()
            android.content.Intent r5 = (android.content.Intent) r5
            if (r5 != 0) goto Led
        Leb:
            r5 = r2
            goto L113
        Led:
            android.content.pm.PackageManager r6 = r11.getPackageManager()
            if (r6 != 0) goto Lf4
            goto Leb
        Lf4:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r7 < r8) goto L108
            android.content.pm.PackageManager$ResolveInfoFlags r7 = defpackage.AbstractC1306.m2428()
            java.util.List r5 = defpackage.AbstractC1306.m2423(r6, r5, r7)
            boolean r5 = r5.isEmpty()
        L106:
            r5 = r5 ^ r3
            goto L113
        L108:
            r7 = 65536(0x10000, float:9.1835E-41)
            java.util.List r5 = r6.queryIntentActivities(r5, r7)
            boolean r5 = r5.isEmpty()
            goto L106
        L113:
            if (r5 == 0) goto L116
            goto Ldd
        L116:
            r4.remove()
            goto Ldd
        L11a:
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L12a
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r2 = "android.settings.SETTINGS"
            r11.<init>(r2)
            r1.add(r11)
        L12a:
            java.util.Iterator r11 = r1.iterator()
        L12e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L151
            java.lang.Object r1 = r11.next()
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 != 0) goto L13d
            goto L12e
        L13d:
            r0.startActivityForResult(r1, r13)     // Catch: java.lang.Exception -> L141
            goto L151
        L141:
            r1 = move-exception
            r1.printStackTrace()
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L12e
            int r1 = r10.f8401
            int r1 = r1 + r3
            r10.f8401 = r1
            goto L12e
        L151:
            defpackage.AbstractC2363.m3864(r12)
            return
    }

    @Override // defpackage.AbstractC1883
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo3293(int r3) {
            r2 = this;
            ᛵᛳᲀ r0 = r2.f8173
            android.os.Bundle r0 = r0.getArguments()
            if (r0 != 0) goto La
            r0 = 0
            goto L10
        La:
            java.lang.String r1 = "request_code"
            int r0 = r0.getInt(r1)
        L10:
            if (r3 == r0) goto L13
            return
        L13:
            int r0 = r2.f8401
            if (r0 <= 0) goto L1c
            int r0 = r0 + (-1)
            r2.f8401 = r0
            return
        L1c:
            java.util.ArrayList r0 = defpackage.AbstractC1871.f8126
            java.lang.Class<ᲁᛶᛵᛲ> r0 = defpackage.AbstractC1871.class
            monitor-enter(r0)
            java.util.ArrayList r1 = defpackage.AbstractC1871.f8126     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2f
            r1.remove(r3)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            r2.m3292()
            return
        L2f:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r2
    }
}
