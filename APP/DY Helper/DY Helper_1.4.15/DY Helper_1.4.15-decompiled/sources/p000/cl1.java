package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2203;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2204;

    public /* synthetic */ cl1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2203 = r1
            r0.f2204 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f2203
            r1 = 1
            java.lang.Object r6 = r6.f2204
            switch(r0) {
                case 0: goto Lf4;
                case 1: goto Lb1;
                case 2: goto L91;
                case 3: goto L7a;
                case 4: goto L60;
                case 5: goto L50;
                case 6: goto L33;
                default: goto L8;
            }
        L8:
            kx1 r6 = (p000.kx1) r6
            java.lang.Object r0 = r6.f6304
            monitor-enter(r0)
            jx1 r6 = r6.f6306     // Catch: java.lang.Throwable -> L30
            r6.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r6.f5636     // Catch: java.lang.Throwable -> L30
            r1.getClass()     // Catch: java.lang.Throwable -> L30
            int r2 = r6.f5638     // Catch: java.lang.Throwable -> L30
            u11 r3 = r6.f5637     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L29
            u11 r3 = new u11     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r6.f5637 = r3     // Catch: java.lang.Throwable -> L30
            b21 r4 = r6.f5640     // Catch: java.lang.Throwable -> L30
            r4.m701(r1, r3)     // Catch: java.lang.Throwable -> L30
        L29:
            r6.m3068(r7, r2, r1, r3)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)
            s62 r6 = p000.s62.f9751
            return r6
        L30:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L33:
            com.example.dyhelper.ui.SettingsUIComponents r6 = (com.example.dyhelper.p002ui.SettingsUIComponents) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r0 = com.example.dyhelper.p002ui.SettingsUIComponents.f2571
            float r7 = (float) r7
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = android.util.TypedValue.applyDimension(r1, r7, r6)
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L50:
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r6 = r6.getString(r7)
            r6.getClass()
            return r6
        L60:
            ic r6 = (p000.C0391ic) r6
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L77
            java.lang.String r7 = "pet_elf_task_image_name"
            java.lang.String r0 = ""
            java.lang.String r7 = p000.ui1.m5893(r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.invoke(r7, r0)
        L77:
            s62 r6 = p000.s62.f9751
            return r6
        L7a:
            android.widget.Switch r6 = (android.widget.Switch) r6
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8e
            bv1 r7 = p000.bv1.f1853
            java.lang.String r7 = "pet_elf_auto_image_enabled"
            p000.ui1.m5871(r7, r1)
            r6.setChecked(r1)
        L8e:
            s62 r6 = p000.s62.f9751
            return r6
        L91:
            sm1 r6 = (p000.sm1) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = 50
            r1 = 150(0x96, float:2.1E-43)
            int r7 = p000.j81.m2906(r7, r0, r1)
            int r0 = r6.f9967
            if (r7 == r0) goto Lae
            r6.f9967 = r7
            bv1 r6 = p000.bv1.f1853
            java.lang.String r6 = "liquid_glass_bottom_bar_scale_percent"
            p000.ui1.m5873(r6, r7)
        Lae:
            s62 r6 = p000.s62.f9751
            return r6
        Lb1:
            kl1 r6 = (p000.kl1) r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.String r0 = "Recomposer effect job completed"
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            r1.<init>(r0)
            r1.initCause(r7)
            java.lang.Object r0 = r6.f6003
            monitor-enter(r0)
            fo0 r2 = r6.f6004     // Catch: java.lang.Throwable -> Le0
            r3 = 0
            if (r2 == 0) goto Le2
            f02 r4 = r6.f6021     // Catch: java.lang.Throwable -> Le0
            fl1 r5 = p000.fl1.f4006     // Catch: java.lang.Throwable -> Le0
            r4.getClass()     // Catch: java.lang.Throwable -> Le0
            r4.m1988(r3, r5)     // Catch: java.lang.Throwable -> Le0
            r2.mo2180(r1)     // Catch: java.lang.Throwable -> Le0
            r6.f6018 = r3     // Catch: java.lang.Throwable -> Le0
            qh1 r1 = new qh1     // Catch: java.lang.Throwable -> Le0
            r3 = 4
            r1.<init>(r6, r3, r7)     // Catch: java.lang.Throwable -> Le0
            r2.m2167(r1)     // Catch: java.lang.Throwable -> Le0
            goto Lee
        Le0:
            r6 = move-exception
            goto Lf2
        Le2:
            r6.f6005 = r1     // Catch: java.lang.Throwable -> Le0
            f02 r6 = r6.f6021     // Catch: java.lang.Throwable -> Le0
            fl1 r7 = p000.fl1.f4005     // Catch: java.lang.Throwable -> Le0
            r6.getClass()     // Catch: java.lang.Throwable -> Le0
            r6.m1988(r3, r7)     // Catch: java.lang.Throwable -> Le0
        Lee:
            monitor-exit(r0)
            s62 r6 = p000.s62.f9751
            return r6
        Lf2:
            monitor-exit(r0)
            throw r6
        Lf4:
            zn r6 = (p000.C1064zn) r6
            r6.m7205(r7)
            s62 r6 = p000.s62.f9751
            return r6
    }
}
