package p000;

/* JADX INFO: renamed from: wa */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0940wa implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11617;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f11618;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f11619;

    public /* synthetic */ C0940wa(p000.ci0 r1, java.lang.ClassLoader r2, p000.bi0 r3) {
            r0 = this;
            r1 = 19
            r0.f11617 = r1
            r0.<init>()
            r0.f11619 = r2
            r0.f11618 = r3
            return
    }

    public /* synthetic */ C0940wa(p000.e80 r2, java.lang.ClassLoader r3) {
            r1 = this;
            r0 = 13
            r1.f11617 = r0
            r1.<init>()
            p80 r2 = (p000.p80) r2
            r1.f11619 = r2
            r1.f11618 = r3
            return
    }

    public /* synthetic */ C0940wa(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f11617 = r2
            r0.f11619 = r1
            r0.f11618 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ C0940wa(p000.C0940wa r2, p000.C0448jx r3) {
            r1 = this;
            r0 = 9
            r1.f11617 = r0
            r1.<init>()
            r1.f11619 = r2
            r1.f11618 = r3
            return
    }

    /* JADX INFO: renamed from: β */
    private final java.lang.Object m6333(java.lang.Object r13) {
            r12 = this;
            java.lang.Object r0 = r12.f11619
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object r12 = r12.f11618
            java.lang.Class r12 = (java.lang.Class) r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            java.lang.Class r1 = r13.getReturnType()
            r1.getClass()
            r0.getClass()
            r12.getClass()
            java.util.List r1 = p000.C0966x.m6438(r1)
            java.util.Iterator r2 = r1.iterator()
        L22:
            boolean r3 = r2.hasNext()
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L61
            java.lang.Object r3 = r2.next()
            r8 = r3
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Class[] r8 = r8.getParameterTypes()
            int r9 = r8.length
            r10 = 4
            if (r9 != r10) goto L22
            r9 = r8[r6]
            java.lang.Class r10 = java.lang.Long.TYPE
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 == 0) goto L22
            r9 = r8[r5]
            java.lang.Class r11 = java.lang.Integer.TYPE
            boolean r9 = p000.ln0.m3626(r9, r11)
            if (r9 == 0) goto L22
            r9 = r8[r4]
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 == 0) goto L22
            r9 = 3
            r8 = r8[r9]
            boolean r8 = r0.isAssignableFrom(r8)
            if (r8 == 0) goto L22
            goto L62
        L61:
            r3 = r7
        L62:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L69
        L66:
            r12 = r7
            goto L148
        L69:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L72:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto La6
            java.lang.Object r8 = r1.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r9 = r9.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 != 0) goto L72
            int r9 = r10.length
            if (r9 != r4) goto L72
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r11 = r10[r6]
            boolean r9 = r9.isAssignableFrom(r11)
            if (r9 == 0) goto L72
            r9 = r10[r5]
            boolean r9 = r0.isAssignableFrom(r9)
            if (r9 == 0) goto L72
            r2.add(r8)
            goto L72
        La6:
            java.util.Iterator r1 = r2.iterator()
        Laa:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L104
            java.lang.Object r4 = r1.next()
            r8 = r4
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.reflect.Type[] r8 = r8.getGenericParameterTypes()
            r8 = r8[r6]
            r8.getClass()
            boolean r9 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r9 == 0) goto Lc7
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            goto Lc8
        Lc7:
            r8 = r7
        Lc8:
            if (r8 == 0) goto Lfc
            java.lang.reflect.Type[] r8 = r8.getActualTypeArguments()
            if (r8 == 0) goto Lfc
            int r9 = r8.length
            if (r9 != r5) goto Ld6
            r8 = r8[r6]
            goto Ld7
        Ld6:
            r8 = r7
        Ld7:
            if (r8 != 0) goto Lda
            goto Lfc
        Lda:
            boolean r9 = r8 instanceof java.lang.Class
            if (r9 == 0) goto Le1
            java.lang.Class r8 = (java.lang.Class) r8
            goto Lfd
        Le1:
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto Lfc
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            r8.getClass()
            int r9 = r8.length
            if (r9 != r5) goto Lf4
            r8 = r8[r6]
            goto Lf5
        Lf4:
            r8 = r7
        Lf5:
            boolean r9 = r8 instanceof java.lang.Class
            if (r9 == 0) goto Lfc
            java.lang.Class r8 = (java.lang.Class) r8
            goto Lfd
        Lfc:
            r8 = r7
        Lfd:
            boolean r8 = p000.ln0.m3626(r8, r12)
            if (r8 == 0) goto Laa
            goto L105
        L104:
            r4 = r7
        L105:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L10a
            goto L13f
        L10a:
            java.util.Iterator r12 = r2.iterator()
            r1 = r7
        L10f:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L12f
            java.lang.Object r4 = r12.next()
            r8 = r4
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Class[] r8 = r8.getParameterTypes()
            r8 = r8[r5]
            boolean r8 = p000.ln0.m3626(r8, r0)
            if (r8 == 0) goto L10f
            if (r6 == 0) goto L12c
        L12a:
            r1 = r7
            goto L132
        L12c:
            r1 = r4
            r6 = r5
            goto L10f
        L12f:
            if (r6 != 0) goto L132
            goto L12a
        L132:
            r4 = r1
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L138
            goto L13f
        L138:
            java.lang.Object r12 = p000.AbstractC0984xh.m6656(r2)
            r4 = r12
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
        L13f:
            if (r4 != 0) goto L143
            goto L66
        L143:
            ob0 r12 = new ob0
            r12.<init>(r3, r4)
        L148:
            if (r12 == 0) goto L150
            l91 r0 = new l91
            r0.<init>(r13, r12)
            return r0
        L150:
            return r7
    }

    /* JADX INFO: renamed from: γ */
    private final java.lang.Object m6334(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.f11619
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Object r9 = r9.f11618
            bi0 r9 = (p000.bi0) r9
            org.luckypray.dexkit.DexKitBridge r10 = (org.luckypray.dexkit.DexKitBridge) r10
            r10.getClass()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r2 = r9.ordinal()
            r3 = 0
            if (r2 == 0) goto L63
            r4 = 1
            if (r2 == r4) goto L57
            r4 = 2
            if (r2 == r4) goto L4b
            r4 = 3
            if (r2 != r4) goto L46
            xh0 r2 = new xh0
            r4 = 3
            r2.<init>(r10, r0, r4)
            java.lang.String r4 = "AccountProxyService no-arg methods"
            p000.ci0.m1204(r9, r1, r4, r2)
            java.lang.String[] r2 = p000.ci0.f2130
            int r4 = r2.length
        L30:
            if (r3 >= r4) goto L87
            r5 = r2[r3]
            java.lang.String r6 = "fallback uid class "
            java.lang.String r6 = p000.lz1.m3687(r6, r5)
            xi r7 = new xi
            r8 = 2
            r7.<init>(r10, r5, r0, r8)
            p000.ci0.m1204(r9, r1, r6, r7)
            int r3 = r3 + 1
            goto L30
        L46:
            p000.C1080.m7272()
        L49:
            r9 = 0
            return r9
        L4b:
            xh0 r2 = new xh0
            r3 = 2
            r2.<init>(r10, r0, r3)
            java.lang.String r10 = "IConversationListModel return void"
            p000.ci0.m1204(r9, r1, r10, r2)
            goto L87
        L57:
            xh0 r2 = new xh0
            r3 = 1
            r2.<init>(r10, r0, r3)
            java.lang.String r10 = "IConversationListModel return List"
            p000.ci0.m1204(r9, r1, r10, r2)
            goto L87
        L63:
            xh0 r2 = new xh0
            r4 = 0
            r2.<init>(r10, r0, r4)
            java.lang.String r4 = "return IConversationListModel"
            p000.ci0.m1204(r9, r1, r4, r2)
            java.lang.String[] r2 = p000.ci0.f2129
            int r4 = r2.length
        L71:
            if (r3 >= r4) goto L87
            r5 = r2[r3]
            java.lang.String r6 = "known provider class "
            java.lang.String r6 = p000.lz1.m3687(r6, r5)
            xi r7 = new xi
            r8 = 1
            r7.<init>(r10, r5, r0, r8)
            p000.ci0.m1204(r9, r1, r6, r7)
            int r3 = r3 + 1
            goto L71
        L87:
            java.util.List r10 = p000.AbstractC0984xh.m6666(r1)
            java.util.List r10 = p000.ci0.m1209(r9, r10)
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L96
            goto L9a
        L96:
            java.util.List r10 = p000.ci0.m1210(r0, r9)
        L9a:
            java.util.List r10 = p000.ci0.m1209(r9, r10)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto La5
            return r10
        La5:
            java.lang.String r9 = r9.f1727
            java.lang.String r10 = " 未定位到有效结果"
            java.lang.String r9 = r9.concat(r10)
            p000.C1080.m7279(r9)
            goto L49
    }

    /* JADX INFO: renamed from: δ */
    private final java.lang.Object m6335(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.f11619
            java.lang.Object r3 = r3.f11618
            e80 r3 = (p000.e80) r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            r1 = 1
            r2 = 0
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r4 = r4.getType()     // Catch: java.lang.Throwable -> L2a
            r4.getClass()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r3.invoke(r4, r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L28
            goto L30
        L28:
            r0 = r2
            goto L30
        L2a:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L30:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L35
            goto L36
        L35:
            r2 = r0
        L36:
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    private final java.lang.Object m6336(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.f11619
            c91 r0 = (p000.c91) r0
            java.lang.Object r3 = r3.f11618
            ch1 r3 = (p000.ch1) r3
            bh1 r4 = (p000.bh1) r4
            boolean r1 = r0.f2020
            float r2 = r0.f2016
            if (r1 == 0) goto L1e
            int r1 = r4.mo583(r2)
            float r0 = r0.f2017
            int r0 = r4.mo583(r0)
            p000.bh1.m960(r4, r3, r1, r0)
            goto L2b
        L1e:
            int r1 = r4.mo583(r2)
            float r0 = r0.f2017
            int r0 = r4.mo583(r0)
            p000.bh1.m958(r4, r3, r1, r0)
        L2b:
            s62 r3 = p000.s62.f9751
            return r3
    }

    /* JADX INFO: renamed from: η */
    private final java.lang.Object m6337(java.lang.Object r11) {
            r10 = this;
            ky1 r11 = (p000.ky1) r11
            r11.getClass()
            long r1 = r11.f6323
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r3 = r10.f11619
            java.lang.Object r0 = r3.get(r0)
            sd r0 = (p000.C0794sd) r0
            if (r0 != 0) goto L1a
            sd r0 = new sd
            r0.<init>(r1)
        L1a:
            r7 = r0
            java.lang.String r3 = r11.f6322
            long r4 = r11.f6324
            ry1 r0 = p000.ry1.f9602
            java.lang.String r0 = p000.ry1.m5197(r11)
            boolean r6 = p000.q02.m4671(r0)
            if (r6 == 0) goto L31
            java.lang.String r0 = "会话 "
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r1, r0)
        L31:
            r6 = r0
            sd r8 = p000.ry1.m5198(r11, r7)
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            java.lang.Object r10 = r10.f11618
            java.lang.Object r10 = r10.get(r11)
            r9 = r10
            id r9 = (p000.C0392id) r9
            ec1 r0 = new ec1
            r0.<init>(r1, r3, r4, r6, r7, r8, r9)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    private final java.lang.Object m6338(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f11619
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r1.f11618
            java.lang.String r1 = (java.lang.String) r1
            be1 r2 = (p000.be1) r2
            r2.getClass()
            java.lang.Object r2 = r0.get(r2)
            boolean r1 = p000.ln0.m3626(r2, r1)
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: ι */
    private final java.lang.Object m6339(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.f11619
            com.example.dyhelper.ui.dialog.PetElfCampTrendChartView r0 = (com.example.dyhelper.p002ui.dialog.PetElfCampTrendChartView) r0
            java.lang.Object r9 = r9.f11618
            java.lang.String r9 = (java.lang.String) r9
            ce1 r10 = (p000.ce1) r10
            int r1 = com.example.dyhelper.p002ui.dialog.PetElfCampTrendChartView.f2626
            r10.getClass()
            java.util.List r1 = r0.f2632
            xm0 r2 = p000.AbstractC1021yh.m6857(r1)
            m3 r7 = new m3
            r1 = 7
            r7.<init>(r0, r10, r9, r1)
            r8 = 30
            java.lang.String r3 = "，"
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = r10.f2088
            java.lang.String r0 = "："
            java.lang.String r9 = p000.lz1.m3688(r10, r0, r9)
            return r9
    }

    /* JADX INFO: renamed from: κ */
    private final java.lang.Object m6340(java.lang.Object r15) {
            r14 = this;
            java.lang.Object r0 = r14.f11619
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r14 = r14.f11618
            xg1 r14 = (p000.xg1) r14
            r2 = r15
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L96
            r15 = 0
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L35
            r5 = 0
            r6 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L2e
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L36
            r4 = 1
            if (r3 != r4) goto L2e
            r3 = 0
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L36
            goto L2f
        L2e:
            r3 = r15
        L2f:
            if (r1 == 0) goto L3c
            r1.close()
            goto L3c
        L35:
            r1 = r15
        L36:
            if (r1 == 0) goto L3b
            r1.close()
        L3b:
            r3 = r15
        L3c:
            if (r3 != 0) goto L40
            java.lang.String r3 = "所选图片"
        L40:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            java.lang.String r4 = "确认发送图片"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r4)
            java.lang.String r4 = r14.f12170
            java.util.ArrayList r5 = r14.f12171
            java.util.ArrayList r6 = r14.f12172
            java.util.ArrayList r7 = p000.AbstractC0984xh.m6672(r5, r6)
            cf1 r12 = new cf1
            r5 = 16
            r12.<init>(r5)
            r13 = 30
            java.lang.String r8 = "\n"
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r6 = "\n文件："
            java.lang.String r7 = "\n\n进行中的相关任务：\n"
            java.lang.String r8 = "目标："
            java.lang.StringBuilder r3 = p000.lz1.m3695(r8, r4, r6, r3, r7)
            r3.append(r5)
            java.lang.String r4 = "\n\n确认后会通过宿主官方图片链发送一条真实私信。"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.app.AlertDialog$Builder r1 = r1.setMessage(r3)
            dd0 r3 = new dd0
            r4 = 2
            r3.<init>(r0, r14, r2, r4)
            java.lang.String r14 = "发送"
            android.app.AlertDialog$Builder r14 = r1.setPositiveButton(r14, r3)
            java.lang.String r0 = "取消"
            android.app.AlertDialog$Builder r14 = r14.setNegativeButton(r0, r15)
            r14.show()
        L96:
            s62 r14 = p000.s62.f9751
            return r14
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r30) {
            r29 = this;
            r0 = r29
            int r1 = r0.f11617
            r2 = 60
            r3 = 16
            java.lang.String r4 = "):"
            java.lang.String r5 = "("
            java.lang.String r6 = "#"
            r7 = 0
            r9 = 0
            r11 = 1
            s62 r12 = p000.s62.f9751
            java.lang.Object r13 = r0.f11618
            java.lang.Object r14 = r0.f11619
            switch(r1) {
                case 0: goto L956;
                case 1: goto L942;
                case 2: goto L87d;
                case 3: goto L842;
                case 4: goto L74d;
                case 5: goto L682;
                case 6: goto L5f7;
                case 7: goto L5df;
                case 8: goto L5bc;
                case 9: goto L589;
                case 10: goto L4f1;
                case 11: goto L3bb;
                case 12: goto L3a1;
                case 13: goto L38f;
                case 14: goto L2ea;
                case 15: goto L2a1;
                case 16: goto L1d4;
                case 17: goto L1cf;
                case 18: goto L1c1;
                case 19: goto L1bc;
                case 20: goto L190;
                case 21: goto L18b;
                case 22: goto L161;
                case 23: goto L14c;
                case 24: goto L147;
                case 25: goto L142;
                case 26: goto L13d;
                case 27: goto L138;
                case 28: goto L133;
                default: goto L1b;
            }
        L1b:
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r1 = r30
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            boolean r0 = r1.isShown()
            r2 = -1
            if (r0 != 0) goto L2f
            goto L124
        L2f:
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r4 = r0.toLowerCase(r3)
            r4.getClass()
            java.lang.String r5 = "pager"
            boolean r5 = p000.q02.m4654(r4, r5, r9)
            if (r5 != 0) goto L4a
            goto L124
        L4a:
            java.lang.String r0 = r0.toLowerCase(r3)
            r0.getClass()
            java.lang.String r3 = "mainscrollableviewpager"
            boolean r3 = p000.q02.m4654(r0, r3, r9)
            if (r3 != 0) goto L124
            java.lang.String r3 = "nearby"
            boolean r3 = p000.q02.m4654(r0, r3, r9)
            if (r3 == 0) goto L6b
            java.lang.String r3 = "multitab"
            boolean r0 = p000.q02.m4654(r0, r3, r9)
            if (r0 == 0) goto L6b
            goto L124
        L6b:
            int r0 = r1.getWidth()
            float r0 = (float) r0
            int r3 = r14.getWidth()
            float r3 = (float) r3
            r5 = 1057803469(0x3f0ccccd, float:0.55)
            float r3 = r3 * r5
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L7f
            goto L124
        L7f:
            int r0 = r1.getHeight()
            float r0 = (float) r0
            int r3 = r14.getHeight()
            float r3 = (float) r3
            r5 = 1055286886(0x3ee66666, float:0.45)
            float r3 = r3 * r5
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L93
            goto L124
        L93:
            java.lang.String r0 = "viewpager2"
            boolean r0 = p000.q02.m4654(r4, r0, r9)
            if (r0 == 0) goto Lc9
            java.lang.String r0 = "getOrientation"
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = p000.qe0.m4869(r1, r0, r3)     // Catch: java.lang.Throwable -> Laa
            boolean r3 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto Lac
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> Laa
            goto Lb4
        Laa:
            r0 = move-exception
            goto Lae
        Lac:
            r0 = 0
            goto Lb4
        Lae:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        Lb4:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto Lba
            r10 = 0
            goto Lbb
        Lba:
            r10 = r0
        Lbb:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto Lc6
            int r0 = r10.intValue()
            if (r0 == r11) goto Lc6
            goto L124
        Lc6:
            r0 = 40
            goto Lca
        Lc9:
            r0 = r9
        Lca:
            boolean r3 = r1.canScrollVertically(r11)
            if (r3 != 0) goto Ld6
            boolean r3 = r1.canScrollVertically(r2)
            if (r3 == 0) goto Ld8
        Ld6:
            int r0 = r0 + 50
        Ld8:
            java.lang.String r3 = "vertical"
            boolean r3 = p000.q02.m4654(r4, r3, r9)
            if (r3 == 0) goto Le2
            int r0 = r0 + 30
        Le2:
            java.lang.String r3 = "feed"
            boolean r3 = p000.q02.m4654(r4, r3, r9)
            if (r3 == 0) goto Lec
            int r0 = r0 + 20
        Lec:
            java.lang.Class r3 = r1.getClass()
        Lf0:
            if (r3 == 0) goto L112
            java.lang.Class<android.view.View> r4 = android.view.View.class
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L112
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F23F37A5F0AB93F0714122F07952088CF32781F7A07FEC215334EF1F2F65A2"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L10d
            int r0 = r0 + 200
            goto L112
        L10d:
            java.lang.Class r3 = r3.getSuperclass()
            goto Lf0
        L112:
            boolean r3 = r1.canScrollHorizontally(r11)
            if (r3 != 0) goto L121
            boolean r2 = r1.canScrollHorizontally(r2)
            if (r2 == 0) goto L11f
            goto L121
        L11f:
            r2 = r0
            goto L124
        L121:
            int r0 = r0 + (-25)
            goto L11f
        L124:
            if (r2 <= 0) goto L132
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            l91 r2 = new l91
            r2.<init>(r1, r0)
            r13.add(r2)
        L132:
            return r12
        L133:
            java.lang.Object r0 = r29.m6340(r30)
            return r0
        L138:
            java.lang.Object r0 = r29.m6339(r30)
            return r0
        L13d:
            java.lang.Object r0 = r29.m6338(r30)
            return r0
        L142:
            java.lang.Object r0 = r29.m6337(r30)
            return r0
        L147:
            java.lang.Object r0 = r29.m6336(r30)
            return r0
        L14c:
            android.app.Activity r14 = (android.app.Activity) r14
            p3 r13 = (p000.C0673p3) r13
            r0 = r30
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            hy0 r1 = new hy0
            r1.<init>(r0, r14, r13)
            r14.runOnUiThread(r1)
            return r12
        L161:
            q41 r14 = (p000.q41) r14
            ch1 r13 = (p000.ch1) r13
            r0 = r30
            bh1 r0 = (p000.bh1) r0
            boolean r1 = r14.f8859
            float r2 = r14.f8857
            if (r1 == 0) goto L17d
            int r1 = r0.mo583(r2)
            float r2 = r14.f8858
            int r2 = r0.mo583(r2)
            p000.bh1.m960(r0, r13, r1, r2)
            goto L18a
        L17d:
            int r1 = r0.mo583(r2)
            float r2 = r14.f8858
            int r2 = r0.mo583(r2)
            p000.bh1.m958(r0, r13, r1, r2)
        L18a:
            return r12
        L18b:
            java.lang.Object r0 = r29.m6335(r30)
            return r0
        L190:
            gt0 r14 = (p000.gt0) r14
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r13 = (com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout) r13
            r0 = r30
            os0 r0 = (p000.os0) r0
            r0.getClass()
            boolean r0 = r14.f4457
            if (r0 == 0) goto L1bb
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r0 = r14.f4458
            if (r0 == r13) goto L1a4
            goto L1bb
        L1a4:
            x91 r0 = r14.f4453
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            ps0 r2 = (p000.ps0) r2
            r7 = 0
            r8 = 25
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            ps0 r1 = p000.ps0.m4587(r2, r3, r4, r5, r6, r7, r8)
            r0.setValue(r1)
        L1bb:
            return r12
        L1bc:
            java.lang.Object r0 = r29.m6334(r30)
            return r0
        L1c1:
            nc0 r14 = (p000.nc0) r14
            ｓ r13 = (p000.RunnableC1149) r13
            r0 = r30
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            android.os.Handler r0 = r14.f7513
            r0.removeCallbacks(r13)
            return r12
        L1cf:
            java.lang.Object r0 = r29.m6333(r30)
            return r0
        L1d4:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r1 = r30
            th0 r1 = (p000.th0) r1
            r1.getClass()
            java.lang.String r2 = r1.f10373
            r13.setAccessible(r11)     // Catch: java.lang.Throwable -> L1eb
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1eb
            java.lang.Object r0 = r13.invoke(r14, r0)     // Catch: java.lang.Throwable -> L1eb
            goto L1f2
        L1eb:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L1f2:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L1f7
            r0 = 0
        L1f7:
            if (r0 != 0) goto L1fc
        L1f9:
            r10 = 0
            goto L2a0
        L1fc:
            java.lang.String r3 = "isGroupChat"
            java.lang.Object r3 = p000.C0966x.m6450(r0, r3)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L209
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L20a
        L209:
            r3 = 0
        L20a:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L213
            goto L1f9
        L213:
            java.lang.String r3 = "getConversationShortId"
            java.lang.Object r3 = p000.C0966x.m6450(r0, r3)
            java.lang.Long r3 = p000.C0966x.m6420(r3)
            if (r3 == 0) goto L1f9
            long r17 = r3.longValue()
            int r3 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r3 > 0) goto L228
            goto L1f9
        L228:
            java.lang.String r3 = "getMember"
            java.lang.Object r3 = p000.C0966x.m6450(r0, r3)
            if (r3 != 0) goto L231
            goto L1f9
        L231:
            java.lang.String r4 = "getRole"
            java.lang.Object r3 = p000.C0966x.m6450(r3, r4)
            java.lang.Integer r3 = p000.C0966x.m6418(r3)
            if (r3 == 0) goto L1f9
            int r3 = r3.intValue()
            if (r3 == r11) goto L246
            r4 = 2
            if (r3 != r4) goto L1f9
        L246:
            java.lang.String r4 = "getCoreInfo"
            java.lang.Object r0 = p000.C0966x.m6450(r0, r4)
            java.lang.String r4 = "getName"
            java.lang.Object r0 = p000.C0966x.m6450(r0, r4)
            boolean r4 = r0 instanceof java.lang.String
            if (r4 == 0) goto L259
            java.lang.String r0 = (java.lang.String) r0
            goto L25a
        L259:
            r0 = 0
        L25a:
            r4 = 500(0x1f4, float:7.0E-43)
            if (r0 == 0) goto L279
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L279
            boolean r5 = p000.q02.m4671(r0)
            if (r5 != 0) goto L26f
            goto L270
        L26f:
            r0 = 0
        L270:
            if (r0 == 0) goto L279
            java.lang.String r0 = p000.q02.m4693(r0, r4)
        L276:
            r19 = r0
            goto L296
        L279:
            java.lang.String r0 = r1.f10376
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L28b
            r10 = r0
            goto L28c
        L28b:
            r10 = 0
        L28c:
            if (r10 == 0) goto L293
            java.lang.String r0 = p000.q02.m4693(r10, r4)
            goto L276
        L293:
            java.lang.String r0 = "未命名群聊"
            goto L276
        L296:
            uw0 r15 = new uw0
            r16 = r2
            r20 = r3
            r15.<init>(r16, r17, r19, r20)
            r10 = r15
        L2a0:
            return r10
        L2a1:
            g50 r14 = (p000.g50) r14
            m62 r13 = (p000.m62) r13
            r0 = r30
            a80 r0 = (p000.a80) r0
            k50 r0 = r14.f4254
            r0.getClass()
            rk0 r0 = r14.f4255
            r0.getClass()
            br r0 = r13.f6981
            if (r0 == 0) goto L2be
            boolean r0 = r0 instanceof p000.C0087br
            if (r0 == 0) goto L2bc
            goto L2be
        L2bc:
            r1 = 0
            goto L2df
        L2be:
            d60 r0 = r13.f6982
            int r1 = r13.f6983
            if (r1 != 0) goto L2cf
            d60 r2 = p000.d60.f2921
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto L2cf
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            goto L2da
        L2cf:
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            int r0 = r0.f2924
            if (r1 != r11) goto L2d6
            r9 = r11
        L2d6:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r2, r0, r9)
        L2da:
            n62 r1 = new n62
            r1.<init>(r0)
        L2df:
            if (r1 == 0) goto L2e3
            r10 = r1
            goto L2e9
        L2e3:
            java.lang.String r0 = "Could not load font"
            p000.C1080.m7279(r0)
            r10 = 0
        L2e9:
            return r10
        L2ea:
            java.lang.ClassLoader r14 = (java.lang.ClassLoader) r14
            g30 r13 = (p000.g30) r13
            r0 = r30
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.h30.f4556
            f30 r1 = new f30     // Catch: java.lang.Throwable -> L31f
            r1.<init>(r13, r11)     // Catch: java.lang.Throwable -> L31f
            org.luckypray.dexkit.result.FieldDataList r0 = r0.findField(r1)     // Catch: java.lang.Throwable -> L31f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31f
            r1.<init>()     // Catch: java.lang.Throwable -> L31f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L31f
        L309:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L31f
            if (r2 == 0) goto L321
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L31f
            org.luckypray.dexkit.result.FieldData r2 = (org.luckypray.dexkit.result.FieldData) r2     // Catch: java.lang.Throwable -> L31f
            java.lang.reflect.Field r2 = r2.getFieldInstance(r14)     // Catch: java.lang.Throwable -> L31f
            if (r2 == 0) goto L309
            r1.add(r2)     // Catch: java.lang.Throwable -> L31f
            goto L309
        L31f:
            r0 = move-exception
            goto L378
        L321:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L31f
        L325:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L31f
            if (r2 == 0) goto L335
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L31f
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L31f
            r2.setAccessible(r11)     // Catch: java.lang.Throwable -> L31f
            goto L325
        L335:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L31f
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L31f
            if (r1 != 0) goto L341
            r1 = 0
            goto L368
        L341:
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L31f
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L31f
            if (r2 != 0) goto L34c
            goto L368
        L34c:
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L31f
            int r2 = p000.h30.m2350(r2, r13)     // Catch: java.lang.Throwable -> L31f
        L353:
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L31f
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L31f
            int r4 = p000.h30.m2350(r4, r13)     // Catch: java.lang.Throwable -> L31f
            if (r2 >= r4) goto L362
            r1 = r3
            r2 = r4
        L362:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L31f
            if (r3 != 0) goto L353
        L368:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L31f
            if (r1 == 0) goto L376
            int r0 = p000.h30.m2350(r1, r13)     // Catch: java.lang.Throwable -> L31f
            r2 = 3000(0xbb8, float:4.204E-42)
            if (r0 < r2) goto L376
            r10 = r1
            goto L388
        L376:
            r10 = 0
            goto L388
        L378:
            kx r1 = r13.f4220
            java.lang.String r1 = r1.f6296
            java.lang.String r2 = "DexKit 定位视频字段失败 key="
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "r45da87c70c377d6f"
            p000.C0888ux.m5977(r2, r1, r0)
            goto L376
        L388:
            if (r10 != 0) goto L38e
            java.lang.reflect.Field r10 = p000.h30.m2347(r14, r13)
        L38e:
            return r10
        L38f:
            p80 r14 = (p000.p80) r14
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r0 = r30
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.lang.Object r0 = r14.invoke(r0, r13)
            java.util.List r0 = (java.util.List) r0
            return r0
        L3a1:
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            a80 r13 = (p000.a80) r13
            r0 = r30
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.lang.Object r0 = r13.invoke(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r14, r0)
            java.util.ArrayList r0 = p000.pd2.m4493(r0)
            return r0
        L3bb:
            java.lang.ClassLoader r14 = (java.lang.ClassLoader) r14
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r0 = r30
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            x00 r1 = p000.x00.f11959
            nb r1 = new nb     // Catch: java.lang.Throwable -> L3ff
            r1.<init>(r11, r13)     // Catch: java.lang.Throwable -> L3ff
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L3ff
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ff
            r1.<init>()     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L3ff
        L3da:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r0 == 0) goto L402
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L3ff
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L3ff
            java.lang.reflect.Method r0 = r0.getMethodInstance(r14)     // Catch: java.lang.Throwable -> L3eb
            goto L3f2
        L3eb:
            r0 = move-exception
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> L3ff
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3ff
            r0 = r3
        L3f2:
            boolean r3 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L3ff
            if (r3 == 0) goto L3f7
            r0 = 0
        L3f7:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L3ff
            if (r0 == 0) goto L3da
            r1.add(r0)     // Catch: java.lang.Throwable -> L3ff
            goto L3da
        L3ff:
            r0 = move-exception
            goto L4d0
        L402:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ff
            r0.<init>()     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3ff
        L40b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r2 == 0) goto L422
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3ff
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L3ff
            boolean r3 = p000.x00.m6465(r3, r13)     // Catch: java.lang.Throwable -> L3ff
            if (r3 == 0) goto L40b
            r0.add(r2)     // Catch: java.lang.Throwable -> L3ff
            goto L40b
        L422:
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L3ff
        L426:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r2 == 0) goto L436
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3ff
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L3ff
            r2.setAccessible(r11)     // Catch: java.lang.Throwable -> L3ff
            goto L426
        L436:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3ff
            r1.<init>()     // Catch: java.lang.Throwable -> L3ff
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ff
            r2.<init>()     // Catch: java.lang.Throwable -> L3ff
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3ff
        L444:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L3ff
            if (r3 == 0) goto L4d5
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L3ff
            r7 = r3
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L3ff
            r7.getClass()     // Catch: java.lang.Throwable -> L3ff
            java.lang.Class r8 = r7.getDeclaringClass()     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r10 = r7.getName()     // Catch: java.lang.Throwable -> L3ff
            r10.getClass()     // Catch: java.lang.Throwable -> L3ff
            java.lang.Class r11 = r7.getReturnType()     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> L3ff
            java.lang.Class[] r12 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L3ff
            r12.getClass()     // Catch: java.lang.Throwable -> L3ff
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3ff
            int r15 = r12.length     // Catch: java.lang.Throwable -> L3ff
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L3ff
            int r15 = r12.length     // Catch: java.lang.Throwable -> L3ff
        L479:
            if (r9 >= r15) goto L48b
            r16 = r12[r9]     // Catch: java.lang.Throwable -> L3ff
            r29 = r0
            java.lang.String r0 = r16.getName()     // Catch: java.lang.Throwable -> L3ff
            r14.add(r0)     // Catch: java.lang.Throwable -> L3ff
            int r9 = r9 + 1
            r0 = r29
            goto L479
        L48b:
            r29 = r0
            int r0 = r7.getModifiers()     // Catch: java.lang.Throwable -> L3ff
            java.lang.reflect.Modifier.isStatic(r0)     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r15 = ","
            r19 = 0
            r20 = 62
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L3ff
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ff
            r7.<init>()     // Catch: java.lang.Throwable -> L3ff
            r7.append(r8)     // Catch: java.lang.Throwable -> L3ff
            r7.append(r6)     // Catch: java.lang.Throwable -> L3ff
            r7.append(r10)     // Catch: java.lang.Throwable -> L3ff
            r7.append(r5)     // Catch: java.lang.Throwable -> L3ff
            r7.append(r0)     // Catch: java.lang.Throwable -> L3ff
            r7.append(r4)     // Catch: java.lang.Throwable -> L3ff
            r7.append(r11)     // Catch: java.lang.Throwable -> L3ff
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L3ff
            boolean r0 = r1.add(r0)     // Catch: java.lang.Throwable -> L3ff
            if (r0 == 0) goto L4cb
            r2.add(r3)     // Catch: java.lang.Throwable -> L3ff
        L4cb:
            r0 = r29
            r9 = 0
            goto L444
        L4d0:
            eo1 r2 = new eo1
            r2.<init>(r0)
        L4d5:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L4e8
            java.lang.String r1 = r13.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "r9da2d880fcceba3c"
            p000.AbstractC0602nx.m4121(r3, r1, r0)
        L4e8:
            boolean r0 = r2 instanceof p000.eo1
            if (r0 == 0) goto L4ee
            jz r2 = p000.C0450jz.f5672
        L4ee:
            java.util.List r2 = (java.util.List) r2
            return r2
        L4f1:
            java.lang.ClassLoader r14 = (java.lang.ClassLoader) r14
            r00 r13 = (p000.r00) r13
            r1 = r30
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.s00.f9638
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L557
            r2.<init>()     // Catch: java.lang.Throwable -> L557
            java.lang.String r0 = "int"
            java.lang.String r3 = "java.lang.Integer"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "java.lang.Boolean"
            java.lang.String[] r0 = new java.lang.String[]{r0, r3, r4, r5}     // Catch: java.lang.Throwable -> L557
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)     // Catch: java.lang.Throwable -> L557
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L557
        L517:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L557
            if (r0 == 0) goto L559
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L557
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L557
            s9 r4 = new s9     // Catch: java.lang.Throwable -> L557
            r5 = 17
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L557
            org.luckypray.dexkit.result.FieldDataList r0 = r1.findField(r4)     // Catch: java.lang.Throwable -> L557
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L557
        L532:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L557
            if (r0 == 0) goto L517
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L557
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0     // Catch: java.lang.Throwable -> L557
            java.lang.reflect.Field r0 = r0.getFieldInstance(r14)     // Catch: java.lang.Throwable -> L543
            goto L54a
        L543:
            r0 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L557
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L557
            r0 = r5
        L54a:
            boolean r5 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L557
            if (r5 == 0) goto L54f
            r0 = 0
        L54f:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L557
            if (r0 == 0) goto L532
            r2.add(r0)     // Catch: java.lang.Throwable -> L557
            goto L532
        L557:
            r0 = move-exception
            goto L55e
        L559:
            java.lang.reflect.Field r0 = p000.s00.m5316(r2, r13)     // Catch: java.lang.Throwable -> L557
            goto L564
        L55e:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L564:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 == 0) goto L579
            kx r2 = r13.f9190
            java.lang.String r2 = r2.f6296
            java.lang.String r3 = "DexKit 定位文章模式字段失败 key="
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "re7f25b3ea5f98fa0"
            p000.C0888ux.m5977(r3, r2, r1)
        L579:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L57f
            r10 = 0
            goto L580
        L57f:
            r10 = r0
        L580:
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            if (r10 != 0) goto L588
            java.lang.reflect.Field r10 = p000.s00.m5314(r14, r13)
        L588:
            return r10
        L589:
            wa r14 = (p000.C0940wa) r14
            jx r13 = (p000.C0448jx) r13
            r0 = r30
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            java.lang.Object r1 = p000.C0666ox.f8297
            r0.getClass()
            java.lang.Object r0 = r14.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5b6
            cx r1 = new cx
            r1.<init>(r0)
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            kx r2 = p000.EnumC0491kx.f6145
            r13.m3008(r2, r1)
            java.lang.String r1 = "DexKit query class done, key=comment_control_legacy_holder_class_v2, className="
            java.lang.String r1 = r1.concat(r0)
            p000.C0666ox.m4319(r1)
            goto L5bb
        L5b6:
            java.lang.String r1 = "DexKit query class empty, key=comment_control_legacy_holder_class_v2"
            p000.C0666ox.m4319(r1)
        L5bb:
            return r0
        L5bc:
            aw r14 = (p000.C0055aw) r14
            ch1 r13 = (p000.ch1) r13
            r0 = r30
            bh1 r0 = (p000.bh1) r0
            r0.getClass()
            boolean r1 = r14.f1330
            if (r1 == 0) goto L5db
            θ r1 = r14.f1338
            p000.bh1.m957(r0, r13)
            long r2 = r13.f2119
            long r2 = p000.um0.m5940(r7, r2)
            r0 = 0
            r13.mo1187(r2, r0, r1)
            goto L5de
        L5db:
            p000.bh1.m959(r0, r13, r7)
        L5de:
            return r12
        L5df:
            java.util.concurrent.atomic.AtomicReference r14 = (java.util.concurrent.atomic.AtomicReference) r14
            θ r13 = (p000.C1085) r13
            r0 = r30
            f8 r0 = (p000.C0276f8) r0
            r0.getClass()
            android.os.Handler r1 = p000.C0696pq.f8654
            e9 r2 = new e9
            r3 = 9
            r2.<init>(r14, r13, r0, r3)
            r1.post(r2)
            return r12
        L5f7:
            r17 = r14
            kk r17 = (p000.C0472kk) r17
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r0 = r30
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            wj r1 = new wj     // Catch: java.lang.Throwable -> L66e
            r2 = 7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L66e
            org.luckypray.dexkit.result.ClassDataList r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L66e
            f7 r0 = p000.AbstractC0984xh.m6661(r0)     // Catch: java.lang.Throwable -> L66e
            bb r1 = new bb     // Catch: java.lang.Throwable -> L66e
            r1.<init>(r13, r3)     // Catch: java.lang.Throwable -> L66e
            y30 r0 = p000.us1.m5943(r0, r1)     // Catch: java.lang.Throwable -> L66e
            ng r15 = new ng     // Catch: java.lang.Throwable -> L66e
            java.lang.Class<kk> r18 = p000.C0472kk.class
            java.lang.String r19 = "isLegacyHolderClass"
            java.lang.String r20 = "isLegacyHolderClass(Ljava/lang/Class;)Z"
            r21 = 0
            r22 = 1
            r16 = 1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L66e
            y30 r1 = new y30     // Catch: java.lang.Throwable -> L66e
            r1.<init>(r0, r11, r15)     // Catch: java.lang.Throwable -> L66e
            x30 r0 = new x30     // Catch: java.lang.Throwable -> L66e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L66e
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L66e
            if (r1 != 0) goto L63e
            r1 = 0
            goto L665
        L63e:
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L66e
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L66e
            if (r2 != 0) goto L649
            goto L665
        L649:
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L66e
            int r2 = p000.C0472kk.m3298(r2)     // Catch: java.lang.Throwable -> L66e
        L650:
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L66e
            r4 = r3
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L66e
            int r4 = p000.C0472kk.m3298(r4)     // Catch: java.lang.Throwable -> L66e
            if (r2 >= r4) goto L65f
            r1 = r3
            r2 = r4
        L65f:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L66e
            if (r3 != 0) goto L650
        L665:
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L66e
            if (r1 == 0) goto L670
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L66e
            goto L678
        L66e:
            r0 = move-exception
            goto L672
        L670:
            r0 = 0
            goto L678
        L672:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L678:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L67e
            r10 = 0
            goto L67f
        L67e:
            r10 = r0
        L67f:
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L682:
            dj r14 = (p000.C0214dj) r14
            ej r13 = (p000.C0250ej) r13
            r0 = r30
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            r0.getClass()
            java.io.File r1 = r14.f3177
            long r4 = r1.length()
            int r2 = r13.f3569
            r6 = 8
            r7 = 4
            r8 = 3
            if (r2 == r8) goto L6a2
            if (r2 == r7) goto L69f
            r9 = r3
            goto L6a3
        L69f:
            r9 = 32
            goto L6a3
        L6a2:
            r9 = r6
        L6a3:
            int r10 = r13.f3568
            if (r10 >= r11) goto L6a8
            r10 = r11
        L6a8:
            int r13 = r13.f3567
            r14 = 8000(0x1f40, float:1.121E-41)
            if (r13 >= r14) goto L6af
            r13 = r14
        L6af:
            int r14 = r10 * r9
            int r14 = r14 / r6
            int r6 = r13 * r14
            r15 = 36
            long r15 = r15 + r4
            r17 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 <= 0) goto L6c3
            r19 = r12
            r11 = r17
            goto L6c6
        L6c3:
            r19 = r12
            r11 = r15
        L6c6:
            int r11 = (int) r11
            int r12 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r12 <= 0) goto L6cd
            r4 = r17
        L6cd:
            int r4 = (int) r4
            r5 = 44
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r5 = r5.order(r12)
            java.nio.charset.Charset r12 = p000.AbstractC0547mf.f7106
            java.lang.String r15 = "RIFF"
            byte[] r15 = r15.getBytes(r12)
            r15.getClass()
            r5.put(r15)
            r5.putInt(r11)
            java.lang.String r11 = "WAVE"
            byte[] r11 = r11.getBytes(r12)
            r11.getClass()
            r5.put(r11)
            java.lang.String r11 = "fmt "
            byte[] r11 = r11.getBytes(r12)
            r11.getClass()
            r5.put(r11)
            r5.putInt(r3)
            if (r2 != r7) goto L70a
            r11 = r8
            goto L70b
        L70a:
            r11 = 1
        L70b:
            short r2 = (short) r11
            r5.putShort(r2)
            short r2 = (short) r10
            r5.putShort(r2)
            r5.putInt(r13)
            r5.putInt(r6)
            short r2 = (short) r14
            r5.putShort(r2)
            short r2 = (short) r9
            r5.putShort(r2)
            java.lang.String r2 = "data"
            byte[] r2 = r2.getBytes(r12)
            r2.getClass()
            r5.put(r2)
            r5.putInt(r4)
            byte[] r2 = r5.array()
            r0.write(r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r1)
            r1 = 131072(0x20000, float:1.83671E-40)
            p000.h62.m2364(r2, r0, r1)     // Catch: java.lang.Throwable -> L745
            r2.close()
            return r19
        L745:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L748
        L748:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r2, r1)
            throw r0
        L74d:
            r19 = r12
            kh r14 = (p000.C0469kh) r14
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r1 = r30
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            kh r0 = p000.C0469kh.f5917
            r2 = 0
            java.util.List r0 = r14.m3267(r13, r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L76b
            java.util.ArrayList r0 = p000.C0469kh.m3257(r13)
        L76b:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r3 = r0.iterator()
        L774:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L811
            java.lang.Object r0 = r3.next()
            r4 = r0
            java.lang.Class r4 = (java.lang.Class) r4
            java.util.List r0 = p000.C0469kh.f5919
            java.util.Iterator r5 = r0.iterator()
        L787:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L774
            java.lang.Object r0 = r5.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            fh r0 = new fh     // Catch: java.lang.Throwable -> L7e0
            r7 = 0
            r0.<init>(r7, r4, r6)     // Catch: java.lang.Throwable -> L7e0
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L7e0
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7e0
        L7a2:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L7e0
            if (r7 == 0) goto L7e2
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L7e0
            org.luckypray.dexkit.result.MethodData r7 = (org.luckypray.dexkit.result.MethodData) r7     // Catch: java.lang.Throwable -> L7e0
            java.lang.reflect.Method r7 = r7.getMethodInstance(r13)     // Catch: java.lang.Throwable -> L7a2
            java.lang.Class r8 = r7.getDeclaringClass()     // Catch: java.lang.Throwable -> L7a2
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L7a2
            java.lang.String r9 = r4.getName()     // Catch: java.lang.Throwable -> L7a2
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L7a2
            if (r8 == 0) goto L7a2
            int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> L7a2
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)     // Catch: java.lang.Throwable -> L7a2
            if (r8 != 0) goto L7a2
            int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> L7a2
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)     // Catch: java.lang.Throwable -> L7a2
            if (r8 != 0) goto L7a2
            r8 = 1
            r7.setAccessible(r8)     // Catch: java.lang.Throwable -> L7a2
            r2.add(r7)     // Catch: java.lang.Throwable -> L7a2
            goto L7a2
        L7e0:
            r0 = move-exception
            goto L7e5
        L7e2:
            r7 = r19
            goto L7ea
        L7e5:
            eo1 r7 = new eo1
            r7.<init>(r0)
        L7ea:
            java.lang.Throwable r0 = p000.fo1.m2190(r7)
            if (r0 == 0) goto L787
            java.lang.String r7 = r4.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ra843337d996e6c9f"
            r8.<init>(r9)
            r8.append(r7)
            r8.append(r6)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            p000.C0888ux.m5985(r0)
            goto L787
        L811:
            java.util.ArrayList r0 = p000.C0469kh.m3256(r13)
            r2.addAll(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L826:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L841
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.C0469kh.m3261(r4)
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L826
            r1.add(r3)
            goto L826
        L841:
            return r1
        L842:
            r19 = r12
            zg r14 = (p000.C1057zg) r14
            η r13 = (p000.C1084) r13
            r0 = r30
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            bh r1 = r14.f13086
            java.lang.Object r2 = p000.ui1.f10844
            java.lang.String r2 = r1.f1716
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "clean_misc_control_"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "_enabled"
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            p000.ui1.m5871(r3, r0)
            java.lang.String r0 = r1.f1716
            java.lang.String r0 = p000.lz1.m3674(r4, r0, r2)
            tg r1 = p000.AbstractC0871ug.f10771
            java.lang.String r1 = "clean_misc_dialog"
            p000.C0834tg.m5649(r0, r1)
            r13.invoke()
            return r19
        L87d:
            af r14 = (p000.C0016af) r14
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r0 = r30
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            we r2 = new we
            r3 = 5
            r2.<init>(r3)
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r2)
            java.util.Iterator r2 = r0.iterator()
        L89b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L92a
            java.lang.Object r0 = r2.next()
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            java.lang.reflect.Method r0 = r0.getMethodInstance(r13)     // Catch: java.lang.Throwable -> L8ac
            goto L8b3
        L8ac:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L8b3:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L8b8
            r0 = 0
        L8b8:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L8c0
        L8bc:
            r29 = r2
            r2 = 1
            goto L926
        L8c0:
            af r3 = p000.C0016af.f205
            boolean r3 = p000.C0016af.m100(r0)
            if (r3 == 0) goto L8bc
            r8 = 1
            r0.setAccessible(r8)
            java.lang.Class r3 = r0.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r7 = r0.getName()
            java.lang.String r8 = p000.lz1.m3690(r7, r0)
            java.lang.Class[] r9 = r0.getParameterTypes()
            r9.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r9.length
            r11.<init>(r12)
            int r12 = r9.length
            r15 = 0
        L8eb:
            if (r15 >= r12) goto L8f9
            r10 = r9[r15]
            r29 = r2
            r2 = 1
            int r15 = p000.lz1.m3679(r10, r11, r15, r2)
            r2 = r29
            goto L8eb
        L8f9:
            r29 = r2
            r2 = 1
            int r9 = r0.getModifiers()
            java.lang.reflect.Modifier.isStatic(r9)
            r27 = 0
            r28 = 62
            java.lang.String r23 = ","
            r24 = 0
            r25 = 0
            r26 = 0
            r22 = r11
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r22, r23, r24, r25, r26, r27, r28)
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4138(r3, r6, r7, r5, r9)
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r1.put(r3, r0)
        L926:
            r2 = r29
            goto L89b
        L92a:
            java.util.Collection r0 = r1.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            ze r1 = new ze
            r2 = 0
            r1.<init>(r14, r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.ArrayList r0 = p000.C0016af.m97(r0)
            return r0
        L942:
            r19 = r12
            r81 r14 = (p000.r81) r14
            kn0 r13 = (p000.kn0) r13
            r0 = r30
            aq0 r0 = (p000.aq0) r0
            r0.m587()
            z91 r1 = r14.f9289
            r3 = 0
            p000.InterfaceC0190cw.m1619(r0, r1, r13, r3, r2)
            return r19
        L956:
            r19 = r12
            r3 = 0
            x2 r14 = (p000.C0969x2) r14
            kn0 r13 = (p000.kn0) r13
            r0 = r30
            aq0 r0 = (p000.aq0) r0
            r0.m587()
            p000.InterfaceC0190cw.m1619(r0, r14, r13, r3, r2)
            return r19
    }
}
