package p000;

/* JADX INFO: renamed from: θ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1085 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13398;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f13399;

    public /* synthetic */ C1085(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f13398 = r1
            r0.f13399 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C1085(p000.r21 r1, p000.q21 r2) {
            r0 = this;
            r2 = 28
            r0.f13398 = r2
            r0.<init>()
            r0.f13399 = r1
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r45) {
            r44 = this;
            r0 = r44
            r1 = r45
            int r2 = r0.f13398
            r3 = 131072(0x20000, float:1.83671E-40)
            r4 = 0
            r6 = 2
            r7 = 0
            r8 = 0
            r9 = 1
            switch(r2) {
                case 0: goto Lb16;
                case 1: goto Lb08;
                case 2: goto Lad1;
                case 3: goto La69;
                case 4: goto L491;
                case 5: goto L475;
                case 6: goto L456;
                case 7: goto L44b;
                case 8: goto L3fd;
                case 9: goto L3af;
                case 10: goto L350;
                case 11: goto L337;
                case 12: goto L329;
                case 13: goto L310;
                case 14: goto L244;
                case 15: goto L229;
                case 16: goto L215;
                case 17: goto L1fd;
                case 18: goto L1c5;
                case 19: goto L1ac;
                case 20: goto L194;
                case 21: goto L169;
                case 22: goto L14e;
                case 23: goto L138;
                case 24: goto L124;
                case 25: goto L115;
                case 26: goto Lfa;
                case 27: goto L28;
                case 28: goto L1c;
                default: goto L11;
            }
        L11:
            java.lang.Object r0 = r0.f13399
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r0 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog) r0
            java.lang.String r1 = (java.lang.String) r1
            s62 r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1449(r0, r1)
            return r0
        L1c:
            java.lang.Object r0 = r0.f13399
            r21 r0 = (p000.r21) r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.m5054(r7)
            s62 r0 = p000.s62.f9751
            return r0
        L28:
            java.lang.Object r0 = r0.f13399
            r2 = r0
            cv r2 = (p000.C0189cv) r2
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L3f:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L44
            r0 = r7
        L44:
            r1 = r0
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 != 0) goto L4b
            goto Lf9
        L4b:
            java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r1)     // Catch: java.lang.Throwable -> L50
            goto L57
        L50:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L57:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L5c
            r0 = r7
        L5c:
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r3 = p000.AbstractC0262ev.f3673
            java.lang.String r3 = ""
            if (r0 == 0) goto L90
            boolean r4 = p000.q02.m4671(r0)
            if (r4 == 0) goto L6b
            goto L90
        L6b:
            char[] r4 = new char[r9]
            r5 = 58
            r4[r8] = r5
            java.util.List r0 = p000.q02.m4682(r0, r4, r6, r6)
            java.lang.Object r4 = p000.AbstractC0984xh.m6640(r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L86
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            goto L87
        L86:
            r4 = r7
        L87:
            if (r4 != 0) goto L8a
            r4 = r3
        L8a:
            boolean r5 = p000.q02.m4671(r4)
            if (r5 == 0) goto L92
        L90:
            r8 = r7
            goto Lb6
        L92:
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r9, r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p000.AbstractC0262ev.m1963(r0)
            java.lang.String r5 = "primary"
            boolean r6 = r4.equalsIgnoreCase(r5)
            cv r8 = new cv
            if (r6 == 0) goto La7
            goto La8
        La7:
            r5 = r4
        La8:
            if (r6 == 0) goto Lad
            java.lang.String r4 = "/sdcard"
            goto Lb3
        Lad:
            java.lang.String r6 = "/storage/"
            java.lang.String r4 = r6.concat(r4)
        Lb3:
            r8.<init>(r5, r4, r0)
        Lb6:
            if (r8 != 0) goto Lb9
            goto Lf9
        Lb9:
            java.lang.String r0 = r8.f2777
            java.lang.String r4 = r2.f2777
            java.lang.String r2 = r2.f2775
            java.lang.String r5 = r8.f2775
            boolean r2 = p000.x02.m6480(r2, r5)
            if (r2 != 0) goto Lc9
        Lc7:
            r3 = r7
            goto Led
        Lc9:
            boolean r2 = p000.q02.m4671(r0)
            if (r2 == 0) goto Ld1
            r3 = r4
            goto Led
        Ld1:
            boolean r2 = r4.equalsIgnoreCase(r0)
            if (r2 == 0) goto Ld8
            goto Led
        Ld8:
            java.lang.String r2 = "/"
            java.lang.String r2 = r0.concat(r2)
            boolean r3 = p000.x02.m6485(r4, r2, r9)
            if (r3 != 0) goto Le5
            goto Lc7
        Le5:
            int r2 = r2.length()
            java.lang.String r3 = r4.substring(r2)
        Led:
            if (r3 != 0) goto Lf0
            goto Lf9
        Lf0:
            ly0 r7 = new ly0
            int r0 = r0.length()
            r7.<init>(r1, r3, r0)
        Lf9:
            return r7
        Lfa:
            java.lang.Object r0 = r0.f13399
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            boolean r2 = p000.q02.m4671(r1)
            if (r2 != 0) goto L110
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L110
            r8 = r9
        L110:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L115:
            java.lang.Object r0 = r0.f13399
            hx0 r0 = (p000.hx0) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            fx0 r0 = r0.m2544(r1)
            return r0
        L124:
            java.lang.Object r0 = r0.f13399
            mv0 r0 = (p000.mv0) r0
            nv0 r1 = (p000.nv0) r1
            r1.getClass()
            java.util.Set r1 = r1.f7761
            boolean r0 = r1.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L138:
            java.lang.Object r0 = r0.f13399
            i0 r0 = (p000.C0379i0) r0
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            r0.getClass()
            java.util.ArrayList r0 = p000.C0379i0.m2549(r1)
            f7 r1 = new f7
            r1.<init>(r9, r0)
            return r1
        L14e:
            java.lang.Object r0 = r0.f13399
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            r1.getClass()
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L161
            r8 = r9
            goto L164
        L161:
            r0.add(r1)
        L164:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L169:
            java.lang.Object r0 = r0.f13399
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.ri0.f9382
            android.view.View r0 = r0.getChildAt(r1)
            java.lang.String r0 = p000.ri0.m5094(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "#"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L194:
            java.lang.Object r0 = r0.f13399
            li0 r0 = (p000.li0) r0
            pt r1 = (p000.C0699pt) r1
            r1.getClass()
            android.os.Handler r2 = p000.mi0.f7160
            w1 r3 = new w1
            r4 = 26
            r3.<init>(r0, r4, r1)
            r2.post(r3)
            s62 r0 = p000.s62.f9751
            return r0
        L1ac:
            java.lang.Object r0 = r0.f13399
            bi0 r0 = (p000.bi0) r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            ci0 r2 = p000.ci0.f2128
            int r1 = p000.ci0.m1212(r0, r1)
            int r0 = r0.f1728
            if (r1 < r0) goto L1c0
            r8 = r9
        L1c0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L1c5:
            java.lang.Object r0 = r0.f13399
            ih0 r0 = (p000.ih0) r0
            r1.getClass()
            nh0 r2 = p000.nh0.f7619
            java.lang.Long r2 = r0.f5085
            java.lang.Long r0 = r0.f5086
            java.lang.String r3 = "getCreatedAt"
            long r6 = p000.nh0.m4049(r1, r3)
            long r6 = p000.nh0.m4061(r6)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 > 0) goto L1e1
            goto L1f7
        L1e1:
            if (r2 == 0) goto L1ec
            long r1 = r2.longValue()
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L1ec
            goto L1f8
        L1ec:
            if (r0 == 0) goto L1f7
            long r0 = r0.longValue()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1f7
            goto L1f8
        L1f7:
            r8 = r9
        L1f8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L1fd:
            java.lang.Object r0 = r0.f13399
            gc r0 = (p000.C0317gc) r0
            jh0 r1 = (p000.jh0) r1
            r1.getClass()
            nh0 r2 = p000.nh0.f7619
            p3 r2 = new p3
            r3 = 22
            r2.<init>(r0, r3, r1)
            p000.nh0.m4063(r2)
            s62 r0 = p000.s62.f9751
            return r0
        L215:
            java.lang.Object r0 = r0.f13399
            xd0 r0 = (p000.xd0) r0
            xd0 r1 = (p000.xd0) r1
            r1.getClass()
            be0 r2 = p000.be0.f1670
            boolean r0 = p000.be0.m933(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L229:
            java.lang.Object r0 = r0.f13399
            g50 r0 = (p000.g50) r0
            m62 r1 = (p000.m62) r1
            d60 r4 = r1.f6982
            int r5 = r1.f6983
            int r6 = r1.f6984
            java.lang.Object r7 = r1.f6985
            m62 r2 = new m62
            r3 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            n62 r0 = r0.m2230(r2)
            java.lang.Object r0 = r0.f7443
            return r0
        L244:
            java.lang.Object r0 = r0.f13399
            r00 r0 = (p000.r00) r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.s00.f9638
            java.lang.Class r2 = r1.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L265
            r8 = 1000(0x3e8, float:1.401E-42)
        L265:
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L271
            int r8 = r8 + 300
        L271:
            java.lang.Class r2 = r1.getType()
            r2.getClass()
            boolean r2 = p000.s00.m5312(r2)
            if (r2 == 0) goto L280
            int r8 = r8 + 800
        L280:
            java.util.Set r2 = r0.f9191
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L292
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L292
            goto L2ae
        L292:
            java.util.Iterator r2 = r2.iterator()
        L296:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2ae
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r1.getName()
            boolean r3 = p000.x02.m6480(r3, r4)
            if (r3 == 0) goto L296
            int r8 = r8 + 4000
        L2ae:
            java.util.Set r0 = r0.f9192
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.annotation.Annotation[] r0 = r1.getDeclaredAnnotations()
            τ r0 = p000.h62.m2434(r0)
        L2bb:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2fe
            java.lang.Object r3 = r0.next()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            wf r4 = p000.ln0.m3599(r3)
            java.lang.Class r4 = p000.ln0.m3604(r4)
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "com.google.gson.annotations.SerializedName"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2bb
            java.lang.String r0 = "value"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r0, r7)     // Catch: java.lang.Throwable -> L2ec
            java.lang.Object r0 = r0.invoke(r3, r7)     // Catch: java.lang.Throwable -> L2ec
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2ec
            if (r3 == 0) goto L2ee
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2ec
            goto L2f6
        L2ec:
            r0 = move-exception
            goto L2f0
        L2ee:
            r0 = r7
            goto L2f6
        L2f0:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L2f6:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L2fb
            goto L2fc
        L2fb:
            r7 = r0
        L2fc:
            java.lang.String r7 = (java.lang.String) r7
        L2fe:
            boolean r0 = p000.AbstractC0984xh.m6632(r2, r7)
            if (r0 == 0) goto L306
            int r8 = r8 + 5000
        L306:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            l91 r2 = new l91
            r2.<init>(r1, r0)
            return r2
        L310:
            java.lang.Object r0 = r0.f13399
            aw r0 = (p000.C0055aw) r0
            za0 r1 = (p000.za0) r1
            r1.getClass()
            r1.mo2781(r9)
            kv1 r0 = r0.f1331
            jv1 r0 = r0.f6129
            r1.mo2793(r0)
            r1.mo2796(r9)
            s62 r0 = p000.s62.f9751
            return r0
        L329:
            java.lang.Object r0 = r0.f13399
            lu r0 = (p000.C0525lu) r0
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.String r0 = p000.kn0.m3343(r1, r0)
            return r0
        L337:
            java.lang.Object r0 = r0.f13399
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            android.text.style.ClickableSpan r1 = (android.text.style.ClickableSpan) r1
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r2 = r0.getSpanStart(r1)
            int r0 = r0.getSpanEnd(r1)
            if (r2 < 0) goto L34f
            if (r0 <= r2) goto L34f
            xm0 r7 = p000.j81.m2893(r2, r0)
        L34f:
            return r7
        L350:
            java.lang.Object r0 = r0.f13399
            uk r0 = (p000.C0875uk) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = p000.ui1.f10844
            mk r2 = r0.f10866
            java.lang.String r2 = r2.f7186
            java.lang.String r1 = p000.h62.m2388(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "comment_control_"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "_color"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            p000.ui1.m5875(r2, r1)
            mk r1 = r0.f10866
            java.lang.String r1 = r1.f7186
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = "_color_enabled"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            p000.ui1.m5871(r1, r9)
            r0.m5921()
            b8 r1 = r0.f10862
            if (r1 == 0) goto L3a9
            mk r0 = r0.f10866
            boolean r2 = p000.ui1.m5901()
            boolean r3 = p000.C0875uk.m5915()
            r1.m818(r0, r2, r3)
            s62 r0 = p000.s62.f9751
            return r0
        L3a9:
            java.lang.String r0 = "preview"
            p000.ln0.m3650(r0)
            throw r7
        L3af:
            java.lang.Object r0 = r0.f13399
            xj r0 = (p000.C0986xj) r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r1.getClass()
            java.util.Set r0 = r0.f12191
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L3ca
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3ca
            goto L3f8
        L3ca:
            java.util.Iterator r0 = r0.iterator()
        L3ce:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f8
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r3 = r1.getType()
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f7
            kk r3 = p000.C0472kk.f5953
            java.lang.Class r3 = r1.getType()
            r3.getClass()
            boolean r2 = p000.C0472kk.m3291(r3, r2)
            if (r2 == 0) goto L3ce
        L3f7:
            r8 = r9
        L3f8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L3fd:
            java.lang.Object r0 = r0.f13399
            ak r0 = (p000.C0021ak) r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r1.getClass()
            java.util.Set r0 = r0.f295
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L418
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L418
            goto L446
        L418:
            java.util.Iterator r0 = r0.iterator()
        L41c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L446
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r3 = r1.getType()
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L445
            kk r3 = p000.C0472kk.f5953
            java.lang.Class r3 = r1.getType()
            r3.getClass()
            boolean r2 = p000.C0472kk.m3291(r3, r2)
            if (r2 == 0) goto L41c
        L445:
            r8 = r9
        L446:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L44b:
            java.lang.Object r0 = r0.f13399
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog) r0
            java.lang.String r1 = (java.lang.String) r1
            s62 r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1406(r0, r1)
            return r0
        L456:
            java.lang.Object r0 = r0.f13399
            java.io.File r0 = (java.io.File) r0
            java.io.OutputStream r1 = (java.io.OutputStream) r1
            r1.getClass()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            p000.h62.m2364(r2, r1, r3)     // Catch: java.lang.Throwable -> L46d
            r2.close()
            s62 r0 = p000.s62.f9751
            return r0
        L46d:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L470
        L470:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r2, r1)
            throw r0
        L475:
            java.lang.Object r0 = r0.f13399
            vx r0 = (p000.C0926vx) r0
            java.io.OutputStream r1 = (java.io.OutputStream) r1
            r1.getClass()
            java.io.BufferedInputStream r2 = r0.f11459
            p000.h62.m2364(r2, r1, r3)     // Catch: java.lang.Throwable -> L489
            r2.close()
            s62 r0 = p000.s62.f9751
            return r0
        L489:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L48c
        L48c:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r2, r1)
            throw r0
        L491:
            java.lang.Object r0 = r0.f13399
            ya r0 = (p000.C1014ya) r0
            hd r1 = (p000.C0355hd) r1
            float r2 = r0.f12514
            float r3 = r1.mo586()
            float r3 = r3 * r2
            r2 = 0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 < 0) goto La5e
            cd r3 = r1.f4690
            long r10 = r3.mo1177()
            float r3 = p000.jw1.m2998(r10)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 <= 0) goto La5e
            float r3 = r0.f12514
            boolean r2 = p000.C0408iv.m2806(r3, r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L4bd
            r2 = r3
            goto L4ca
        L4bd:
            float r2 = r0.f12514
            float r10 = r1.mo586()
            float r10 = r10 * r2
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            float r2 = (float) r10
        L4ca:
            cd r10 = r1.f4690
            long r10 = r10.mo1177()
            float r10 = p000.jw1.m2998(r10)
            float r6 = (float) r6
            float r10 = r10 / r6
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            float r10 = (float) r10
            float r12 = java.lang.Math.min(r2, r10)
            float r16 = r12 / r6
            int r2 = java.lang.Float.floatToRawIntBits(r16)
            long r10 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r16)
            long r13 = (long) r2
            r2 = 32
            long r10 = r10 << r2
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r17
            long r10 = r10 | r13
            cd r13 = r1.f4690
            long r13 = r13.mo1177()
            long r13 = r13 >> r2
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r13 = r13 - r12
            cd r14 = r1.f4690
            long r14 = r14.mo1177()
            long r14 = r14 & r17
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r14 = r14 - r12
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            long r4 = (long) r13
            int r13 = java.lang.Float.floatToRawIntBits(r14)
            long r13 = (long) r13
            long r4 = r4 << r2
            long r13 = r13 & r17
            long r4 = r4 | r13
            float r6 = r6 * r12
            cd r13 = r1.f4690
            long r13 = r13.mo1177()
            float r13 = p000.jw1.m2998(r13)
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 <= 0) goto L531
            r13 = r9
            goto L532
        L531:
            r13 = r8
        L532:
            iv1 r14 = r0.f12516
            cd r15 = r1.f4690
            long r7 = r15.mo1177()
            cd r15 = r1.f4690
            np0 r15 = r15.getLayoutDirection()
            u81 r7 = r14.mo2812(r7, r15, r1)
            boolean r8 = r7 instanceof p000.r81
            if (r8 == 0) goto L993
            px1 r4 = r0.f12515
            r81 r7 = (p000.r81) r7
            z91 r5 = r7.f9289
            if (r13 == 0) goto L55b
            wa r0 = new wa
            r0.<init>(r7, r9, r4)
            n r7 = r1.m2493(r0)
            goto La68
        L55b:
            if (r4 == 0) goto L56b
            long r7 = r4.f8755
            long r7 = p000.C0114ci.m1191(r7, r3)
            ga r3 = new ga
            r3.<init>(r7)
            r15 = r3
            r3 = r9
            goto L56d
        L56b:
            r3 = 0
            r15 = 0
        L56d:
            r7 = r5
            x2 r7 = (p000.C0969x2) r7
            ml1 r11 = r7.m6503()
            float r7 = r11.f7201
            float r8 = r11.f7200
            ta r10 = r0.f12513
            if (r10 != 0) goto L583
            ta r10 = new ta
            r10.<init>()
            r0.f12513 = r10
        L583:
            ta r10 = r0.f12513
            r10.getClass()
            x2 r12 = r10.f10261
            if (r12 != 0) goto L592
            x2 r12 = p000.AbstractC1006y2.m6812()
            r10.f10261 = r12
        L592:
            android.graphics.Path r10 = r12.f11999
            r10.reset()
            float r10 = r11.f7200
            float r13 = r11.f7203
            float r14 = r11.f7202
            r44 = r2
            float r2 = r11.f7201
            boolean r16 = java.lang.Float.isNaN(r10)
            if (r16 != 0) goto L5b9
            boolean r16 = java.lang.Float.isNaN(r2)
            if (r16 != 0) goto L5b9
            boolean r16 = java.lang.Float.isNaN(r14)
            if (r16 != 0) goto L5b9
            boolean r16 = java.lang.Float.isNaN(r13)
            if (r16 == 0) goto L5be
        L5b9:
            java.lang.String r16 = "Invalid rectangle, make sure no value is NaN"
            p000.AbstractC1006y2.m6813(r16)
        L5be:
            android.graphics.RectF r9 = r12.f12000
            if (r9 != 0) goto L5c9
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>()
            r12.f12000 = r9
        L5c9:
            android.graphics.RectF r9 = r12.f12000
            r9.getClass()
            r9.set(r10, r2, r14, r13)
            android.graphics.Path r2 = r12.f11999
            android.graphics.RectF r9 = r12.f12000
            r9.getClass()
            android.graphics.Path$Direction r10 = android.graphics.Path.Direction.CCW
            r2.addRect(r9, r10)
            r2 = 0
            r12.m6504(r12, r5, r2)
            um1 r2 = new um1
            r2.<init>()
            float r9 = r11.f7202
            float r9 = r9 - r8
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            float r9 = (float) r9
            int r9 = (int) r9
            float r10 = r11.f7203
            float r10 = r10 - r7
            double r13 = (double) r10
            double r13 = java.lang.Math.ceil(r13)
            float r10 = (float) r13
            int r10 = (int) r10
            long r13 = (long) r9
            long r13 = r13 << r44
            long r9 = (long) r10
            long r9 = r9 & r17
            long r13 = r13 | r9
            ta r0 = r0.f12513
            r0.getClass()
            m2 r9 = r0.f10258
            l0 r10 = r0.f10259
            r16 = r10
            if (r9 == 0) goto L61a
            int r10 = r9.m3712()
            r45 = r11
            sk0 r11 = new sk0
            r11.<init>(r10)
            goto L61d
        L61a:
            r45 = r11
            r11 = 0
        L61d:
            if (r11 != 0) goto L620
            goto L625
        L620:
            int r10 = r11.f9940
            if (r10 != 0) goto L625
            goto L63b
        L625:
            if (r9 == 0) goto L631
            int r10 = r9.m3712()
            sk0 r11 = new sk0
            r11.<init>(r10)
            goto L632
        L631:
            r11 = 0
        L632:
            if (r11 != 0) goto L635
            goto L639
        L635:
            int r10 = r11.f9940
            if (r3 == r10) goto L63b
        L639:
            r10 = 0
            goto L63c
        L63b:
            r10 = 1
        L63c:
            if (r9 == 0) goto L67d
            android.graphics.Bitmap r11 = r9.f6906
            if (r16 == 0) goto L67d
            r19 = r3
            cd r3 = r1.f4690
            long r25 = r3.mo1177()
            r3 = r9
            r20 = r10
            long r9 = r25 >> r44
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r10 = r11.getWidth()
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L67f
            cd r9 = r1.f4690
            long r9 = r9.mo1177()
            long r9 = r9 & r17
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r10 = r11.getHeight()
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L67f
            if (r20 != 0) goto L676
            goto L67f
        L676:
            r9 = r3
            r19 = r13
            r10 = r16
            goto L87a
        L67d:
            r19 = r3
        L67f:
            long r9 = r13 >> r44
            int r3 = (int) r9
            long r9 = r13 & r17
            int r9 = (int) r9
            po1 r10 = p000.C0550mi.f7140
            p000.h62.m2419(r19)
            android.graphics.Bitmap$Config r28 = p000.h62.m2419(r19)
            boolean r11 = p000.ln0.m3626(r10, r10)
            if (r11 == 0) goto L6a4
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
        L69a:
            r26 = r3
            r27 = r9
            r30 = r10
        L6a0:
            r19 = r13
            goto L85b
        L6a4:
            po1 r11 = p000.C0550mi.f7152
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L6b3
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.ACES
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L6b3:
            po1 r11 = p000.C0550mi.f7153
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L6c2
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.ACESCG
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L6c2:
            po1 r11 = p000.C0550mi.f7150
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L6d1
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.ADOBE_RGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L6d1:
            po1 r11 = p000.C0550mi.f7145
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L6e0
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.BT2020
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L6e0:
            po1 r11 = p000.C0550mi.f7144
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L6ef
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.BT709
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L6ef:
            ap0 r11 = p000.C0550mi.f7155
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L6fe
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.CIE_LAB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L6fe:
            ap0 r11 = p000.C0550mi.f7154
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L70d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.CIE_XYZ
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L70d:
            po1 r11 = p000.C0550mi.f7146
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L71d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.DCI_P3
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L71d:
            po1 r11 = p000.C0550mi.f7147
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L72d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.DISPLAY_P3
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L72d:
            po1 r11 = p000.C0550mi.f7142
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L73d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.EXTENDED_SRGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L73d:
            po1 r11 = p000.C0550mi.f7143
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L74d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L74d:
            po1 r11 = p000.C0550mi.f7141
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L75d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.LINEAR_SRGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L75d:
            po1 r11 = p000.C0550mi.f7148
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L76d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.NTSC_1953
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L76d:
            po1 r11 = p000.C0550mi.f7151
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L77d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.PRO_PHOTO_RGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L77d:
            po1 r11 = p000.C0550mi.f7149
            boolean r11 = p000.ln0.m3626(r10, r11)
            if (r11 == 0) goto L78d
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.SMPTE_C
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
            goto L69a
        L78d:
            int r11 = android.os.Build.VERSION.SDK_INT
            r26 = r3
            r3 = 34
            if (r11 < r3) goto L7c0
            po1 r3 = p000.C0550mi.f7157
            boolean r3 = p000.ln0.m3626(r10, r3)
            if (r3 == 0) goto L7a6
            android.graphics.ColorSpace$Named r3 = p000.AbstractC0513li.m3566()
            android.graphics.ColorSpace r3 = android.graphics.ColorSpace.get(r3)
            goto L7b8
        L7a6:
            po1 r3 = p000.C0550mi.f7158
            boolean r3 = p000.ln0.m3626(r10, r3)
            if (r3 == 0) goto L7b7
            android.graphics.ColorSpace$Named r3 = p000.AbstractC0513li.m3567()
            android.graphics.ColorSpace r3 = android.graphics.ColorSpace.get(r3)
            goto L7b8
        L7b7:
            r3 = 0
        L7b8:
            if (r3 == 0) goto L7c0
            r30 = r3
            r27 = r9
            goto L6a0
        L7c0:
            if (r10 == 0) goto L850
            java.lang.String r3 = r10.f5474
            nb2 r11 = r10.f8625
            float[] r11 = r11.m4018()
            r27 = r9
            q52 r9 = r10.f8628
            if (r9 == 0) goto L7f6
            android.graphics.ColorSpace$Rgb$TransferParameters r29 = new android.graphics.ColorSpace$Rgb$TransferParameters
            r19 = r13
            double r13 = r9.f8877
            r30 = r13
            double r13 = r9.f8878
            r32 = r13
            double r13 = r9.f8879
            r34 = r13
            double r13 = r9.f8880
            r36 = r13
            double r13 = r9.f8881
            r38 = r13
            double r13 = r9.f8882
            r40 = r13
            double r13 = r9.f8876
            r42 = r13
            r29.<init>(r30, r32, r34, r36, r38, r40, r42)
            r9 = r29
            goto L7f9
        L7f6:
            r19 = r13
            r9 = 0
        L7f9:
            float[] r13 = r10.f8630
            if (r9 == 0) goto L824
            android.graphics.ColorSpace$Rgb r14 = new android.graphics.ColorSpace$Rgb
            float[] r10 = r10.f8629
            r14.<init>(r3, r10, r11, r9)
            r24 = 0
            r10 = r13[r24]
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L80f
            goto L819
        L80f:
            float[] r10 = r14.getTransform()
            boolean r10 = java.util.Arrays.equals(r10, r13)
            if (r10 == 0) goto L81c
        L819:
            r30 = r14
            goto L85b
        L81c:
            android.graphics.ColorSpace$Rgb r10 = new android.graphics.ColorSpace$Rgb
            r10.<init>(r3, r13, r9)
        L821:
            r30 = r10
            goto L85b
        L824:
            android.graphics.ColorSpace$Rgb r29 = new android.graphics.ColorSpace$Rgb
            float[] r9 = r10.f8629
            oo1 r13 = r10.f8633
            ki r14 = new ki
            r30 = r3
            r3 = 0
            r14.<init>(r13, r3)
            oo1 r3 = r10.f8636
            ki r13 = new ki
            r31 = r9
            r9 = 1
            r13.<init>(r3, r9)
            float r3 = r10.f8626
            float r9 = r10.f8627
            r35 = r3
            r36 = r9
            r32 = r11
            r34 = r13
            r33 = r14
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r30 = r29
            goto L85b
        L850:
            r27 = r9
            r19 = r13
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r3)
            goto L821
        L85b:
            r25 = 0
            r29 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r25, r26, r27, r28, r29, r30)
            m2 r9 = new m2
            r9.<init>(r3)
            r0.f10258 = r9
            android.graphics.Canvas r10 = p000.AbstractC0532m0.f6880
            l0 r10 = new l0
            r10.<init>()
            android.graphics.Canvas r11 = new android.graphics.Canvas
            r11.<init>(r3)
            r10.f6337 = r11
            r0.f10259 = r10
        L87a:
            fe r3 = r0.f10260
            if (r3 != 0) goto L885
            fe r3 = new fe
            r3.<init>()
            r0.f10260 = r3
        L885:
            m6 r11 = r3.f3907
            ee r0 = r3.f3906
            long r13 = p000.AbstractC0782s1.m5322(r19)
            r23 = r3
            cd r3 = r1.f4690
            np0 r3 = r3.getLayoutDirection()
            r16 = r15
            yr r15 = r0.f3514
            r30 = r2
            np0 r2 = r0.f3515
            r31 = r9
            de r9 = r0.f3516
            r33 = r4
            r32 = r5
            long r4 = r0.f3517
            r0.f3514 = r1
            r0.f3515 = r3
            r0.f3516 = r10
            r0.f3517 = r13
            r10.mo1729()
            long r24 = p000.C0114ci.f2120
            r28 = 0
            r29 = 58
            r26 = r13
            p000.InterfaceC0190cw.m1617(r23, r24, r26, r28, r29)
            r3 = r23
            float r8 = -r8
            float r7 = -r7
            java.lang.Object r13 = r11.f6967
            n r13 = (p000.C0568n) r13
            r13.m3925(r8, r7)
            y02 r13 = new y02     // Catch: java.lang.Throwable -> L97b
            r13.<init>(r6)     // Catch: java.lang.Throwable -> L97b
            r6 = 52
            r23 = r10
            r10 = r32
            r14 = r33
            p000.InterfaceC0190cw.m1619(r3, r10, r14, r13, r6)     // Catch: java.lang.Throwable -> L97b
            long r24 = r3.mo585()     // Catch: java.lang.Throwable -> L97b
            r26 = r4
            long r4 = r24 >> r44
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L97b
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> L97b
            r5 = 1
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L97b
            float r4 = r4 + r5
            long r24 = r3.mo585()     // Catch: java.lang.Throwable -> L97b
            r10 = r4
            r6 = r5
            long r4 = r24 >> r44
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L97b
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> L97b
            float r4 = r10 / r4
            long r24 = r3.mo585()     // Catch: java.lang.Throwable -> L97b
            r44 = r6
            long r5 = r24 & r17
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L97b
            float r5 = java.lang.Float.intBitsToFloat(r5)     // Catch: java.lang.Throwable -> L97b
            float r5 = r5 + r44
            long r24 = r3.mo585()     // Catch: java.lang.Throwable -> L97b
            r44 = r5
            long r5 = r24 & r17
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L97b
            float r5 = java.lang.Float.intBitsToFloat(r5)     // Catch: java.lang.Throwable -> L97b
            float r5 = r44 / r5
            long r17 = r11.m3758()     // Catch: java.lang.Throwable -> L97b
            r6 = r9
            long r9 = p000.i91.m2683(r17)     // Catch: java.lang.Throwable -> L97b
            r44 = r1
            r13 = r2
            long r1 = r11.m3758()     // Catch: java.lang.Throwable -> L97b
            de r17 = r11.m3787()     // Catch: java.lang.Throwable -> L97b
            r17.mo1729()     // Catch: java.lang.Throwable -> L97b
            r17 = r6
            java.lang.Object r6 = r11.f6967     // Catch: java.lang.Throwable -> L97d
            n r6 = (p000.C0568n) r6     // Catch: java.lang.Throwable -> L97d
            r6.m3923(r4, r5, r9)     // Catch: java.lang.Throwable -> L97d
            r4 = 28
            r5 = 0
            p000.InterfaceC0190cw.m1619(r3, r12, r14, r5, r4)     // Catch: java.lang.Throwable -> L97d
            de r3 = r11.m3787()     // Catch: java.lang.Throwable -> L97b
            r3.mo1727()     // Catch: java.lang.Throwable -> L97b
            r11.m3771(r1)     // Catch: java.lang.Throwable -> L97b
            java.lang.Object r1 = r11.f6967
            n r1 = (p000.C0568n) r1
            float r2 = -r8
            float r3 = -r7
            r1.m3925(r2, r3)
            r23.mo1727()
            r0.f3514 = r15
            r0.f3515 = r13
            r6 = r17
            r0.f3516 = r6
            r1 = r26
            r0.f3517 = r1
            r3 = r31
            android.graphics.Bitmap r0 = r3.f6906
            r0.prepareToDraw()
            r12 = r30
            r12.f10912 = r3
            xa r10 = new xa
            r11 = r45
            r15 = r16
            r13 = r19
            r10.<init>(r11, r12, r13, r15)
            r1 = r44
            n r7 = r1.m2493(r10)
            goto La68
        L97b:
            r0 = move-exception
            goto L989
        L97d:
            r0 = move-exception
            de r3 = r11.m3787()     // Catch: java.lang.Throwable -> L97b
            r3.mo1727()     // Catch: java.lang.Throwable -> L97b
            r11.m3771(r1)     // Catch: java.lang.Throwable -> L97b
            throw r0     // Catch: java.lang.Throwable -> L97b
        L989:
            java.lang.Object r1 = r11.f6967
            n r1 = (p000.C0568n) r1
            float r2 = -r8
            float r3 = -r7
            r1.m3925(r2, r3)
            throw r0
        L993:
            boolean r2 = r7 instanceof p000.t81
            if (r2 == 0) goto La25
            r8 = r13
            px1 r13 = r0.f12515
            t81 r7 = (p000.t81) r7
            wo1 r2 = r7.f10247
            boolean r3 = p000.u81.m5810(r2)
            if (r3 == 0) goto L9bf
            long r14 = r2.f11792
            y02 r0 = new y02
            r0.<init>(r12)
            r18 = r10
            va r11 = new va
            r22 = r0
            r20 = r4
            r17 = r12
            r12 = r8
            r11.<init>(r12, r13, r14, r16, r17, r18, r20, r22)
            n r7 = r1.m2493(r11)
            goto La68
        L9bf:
            r3 = r13
            ta r4 = r0.f12513
            if (r4 != 0) goto L9cb
            ta r4 = new ta
            r4.<init>()
            r0.f12513 = r4
        L9cb:
            ta r0 = r0.f12513
            r0.getClass()
            x2 r4 = r0.f10261
            if (r4 != 0) goto L9da
            x2 r4 = p000.AbstractC1006y2.m6812()
            r0.f10261 = r4
        L9da:
            android.graphics.Path r0 = r4.f11999
            r0.reset()
            p000.z91.m7119(r4, r2)
            if (r8 != 0) goto La1a
            x2 r0 = p000.AbstractC1006y2.m6812()
            float r5 = r2.m6400()
            float r14 = r5 - r12
            float r5 = r2.m6399()
            float r15 = r5 - r12
            long r5 = r2.f11792
            long r16 = p000.AbstractC0073bd.m892(r5, r12)
            long r5 = r2.f11793
            long r18 = p000.AbstractC0073bd.m892(r5, r12)
            long r5 = r2.f11795
            long r22 = p000.AbstractC0073bd.m892(r5, r12)
            long r5 = r2.f11794
            long r20 = p000.AbstractC0073bd.m892(r5, r12)
            wo1 r11 = new wo1
            r13 = r12
            r11.<init>(r12, r13, r14, r15, r16, r18, r20, r22)
            p000.z91.m7119(r0, r11)
            r2 = 0
            r4.m6504(r4, r0, r2)
            goto La1b
        La1a:
            r2 = 0
        La1b:
            wa r0 = new wa
            r0.<init>(r4, r2, r3)
            n r7 = r1.m2493(r0)
            goto La68
        La25:
            r2 = r10
            r8 = r13
            boolean r6 = r7 instanceof p000.s81
            if (r6 == 0) goto La59
            px1 r0 = r0.f12515
            if (r8 == 0) goto La32
            r24 = 0
            goto La34
        La32:
            r24 = r2
        La34:
            if (r8 == 0) goto La3c
            cd r2 = r1.f4690
            long r4 = r2.mo1177()
        La3c:
            r26 = r4
            if (r8 == 0) goto La45
            t30 r2 = p000.t30.f10165
        La42:
            r28 = r2
            goto La4b
        La45:
            y02 r2 = new y02
            r2.<init>(r12)
            goto La42
        La4b:
            ua r22 = new ua
            r23 = r0
            r22.<init>(r23, r24, r26, r28)
            r0 = r22
            n r7 = r1.m2493(r0)
            goto La68
        La59:
            p000.C1080.m7272()
            r7 = 0
            goto La68
        La5e:
            n7 r0 = new n7
            r2 = 4
            r0.<init>(r2)
            n r7 = r1.m2493(r0)
        La68:
            return r7
        La69:
            r2 = r8
            java.lang.Object r0 = r0.f13399
            p7 r0 = (p000.C0677p7) r0
            f8 r1 = (p000.C0276f8) r1
            r1.getClass()
            p7 r3 = p000.AbstractC0825t7.f10218
            pq r4 = p000.C0696pq.f8651
            mq r4 = p000.C0696pq.m4566()
            if (r3 != r0) goto Lace
            if (r4 == 0) goto Lace
            long r3 = r4.f7247
            long r5 = r0.f8439
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Lace
            r5 = 0
            r0.f8443 = r5
            boolean r3 = r0.f8441
            h8 r4 = r1.f3798
            h8 r5 = p000.EnumC0350h8.f4616
            if (r4 == r5) goto Laa5
            h8 r5 = p000.EnumC0350h8.f4617
            if (r4 == r5) goto Laa5
            boolean r4 = r1.m2050()
            if (r4 != 0) goto Laa5
            boolean r4 = r1.m2051()
            if (r4 == 0) goto Laa3
            goto Laa5
        Laa3:
            r4 = r2
            goto Laa6
        Laa5:
            r4 = 1
        Laa6:
            h8 r5 = r1.f3798
            h8 r6 = p000.EnumC0350h8.f4615
            if (r5 == r6) goto Lab5
            boolean r1 = r1.m2053()
            if (r1 == 0) goto Lab3
            goto Lab5
        Lab3:
            r8 = r2
            goto Lab6
        Lab5:
            r8 = 1
        Lab6:
            if (r3 == 0) goto Labb
            m7 r1 = p000.EnumC0539m7.f6988
            goto Lac7
        Labb:
            if (r4 == 0) goto Lac0
            m7 r1 = p000.EnumC0539m7.f6987
            goto Lac7
        Lac0:
            if (r8 == 0) goto Lac5
            m7 r1 = p000.EnumC0539m7.f6986
            goto Lac7
        Lac5:
            m7 r1 = p000.EnumC0539m7.f6989
        Lac7:
            r0.f8442 = r1
            p000.AbstractC0825t7.f10216 = r1
            p000.AbstractC0825t7.m5613(r0)
        Lace:
            s62 r0 = p000.s62.f9751
            return r0
        Lad1:
            java.lang.Object r0 = r0.f13399
            ga1 r0 = (p000.ga1) r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r4 = "(this Map)"
            if (r3 != r0) goto Lae9
            r3 = r4
            goto Laed
        Lae9:
            java.lang.String r3 = java.lang.String.valueOf(r3)
        Laed:
            r2.append(r3)
            r3 = 61
            r2.append(r3)
            java.lang.Object r1 = r1.getValue()
            if (r1 != r0) goto Lafc
            goto Lb00
        Lafc:
            java.lang.String r4 = java.lang.String.valueOf(r1)
        Lb00:
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            return r0
        Lb08:
            java.lang.Object r0 = r0.f13399
            μ r0 = (p000.AbstractC1089) r0
            if (r1 != r0) goto Lb11
            java.lang.String r0 = "(this Collection)"
            goto Lb15
        Lb11:
            java.lang.String r0 = java.lang.String.valueOf(r1)
        Lb15:
            return r0
        Lb16:
            java.lang.Object r0 = r0.f13399
            com.example.dyhelper.ui.AboutActivity r0 = (com.example.dyhelper.p002ui.AboutActivity) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = com.example.dyhelper.p002ui.AboutActivity.f2435
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r5 = 1
            float r0 = android.util.TypedValue.applyDimension(r5, r1, r0)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
