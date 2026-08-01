package p000;

/* JADX INFO: renamed from: b8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0068b8 implements p000.o91 {

    /* JADX INFO: renamed from: α */
    public java.lang.Object f1555;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f1556;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f1557;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f1558;

    /* JADX INFO: renamed from: ε */
    public java.lang.Object f1559;

    public C0068b8(int r2) {
            r1 = this;
            switch(r2) {
                case 5: goto L37;
                case 6: goto L24;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f1555 = r2
            j7 r2 = new j7
            r0 = 0
            r2.<init>(r0)
            r1.f1557 = r2
            v11 r2 = new v11
            r2.<init>()
            r1.f1558 = r2
            v11 r2 = new v11
            r2.<init>()
            r1.f1559 = r2
            return
        L24:
            r1.<init>()
            x r2 = p000.C0966x.f11928
            r1.f1559 = r2
            java.lang.String r2 = "GET"
            r1.f1556 = r2
            uc0 r2 = new uc0
            r2.<init>()
            r1.f1557 = r2
            return
        L37:
            r1.<init>()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1.f1559 = r2
            return
    }

    /* JADX INFO: renamed from: ε */
    public static p000.C0552mk m804(java.lang.String r3) {
            java.util.List r0 = p000.AbstractC0515lk.f6694
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            r2 = r1
            mk r2 = (p000.C0552mk) r2
            java.lang.String r2 = r2.f7186
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6
            goto L1d
        L1c:
            r1 = 0
        L1d:
            mk r1 = (p000.C0552mk) r1
            if (r1 == 0) goto L22
            return r1
        L22:
            java.lang.String r0 = "未知评论控件："
            java.lang.String r3 = r0.concat(r3)
            p000.C1080.m7266(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ν */
    public static android.widget.FrameLayout m805(p000.C0068b8 r9, p000.C0552mk r10, android.view.View r11, int r12, int r13) {
            r0 = r13 & 8
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r11 instanceof android.widget.TextView
            if (r0 == 0) goto Ld
            r0 = r11
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            r5 = r0
            goto L11
        L10:
            r5 = r1
        L11:
            boolean r0 = r11 instanceof android.widget.ImageView
            if (r0 == 0) goto L1a
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6 = r0
            goto L1b
        L1a:
            r6 = r1
        L1b:
            r0 = r13 & 32
            if (r0 == 0) goto L21
        L1f:
            r8 = r1
            goto L24
        L21:
            java.lang.String r1 = "让沃尔玛保持混乱，@小助手 说得很对"
            goto L1f
        L24:
            r13 = r13 & 64
            if (r13 == 0) goto L2a
            r13 = 0
            goto L2b
        L2a:
            r13 = 1
        L2b:
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            java.lang.Object r0 = r9.f1555
            android.content.Context r0 = (android.content.Context) r0
            r4.<init>(r0)
            java.lang.String r0 = r10.f7187
            java.lang.String r1 = "编辑"
            java.lang.String r0 = r1.concat(r0)
            r4.setContentDescription(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r2 = -1
            if (r13 == 0) goto L47
            r3 = r2
            goto L48
        L47:
            r3 = r1
        L48:
            if (r13 == 0) goto L4b
            r1 = r2
        L4b:
            r0.<init>(r3, r1)
            r4.addView(r11, r0)
            l9 r11 = new l9
            r13 = 3
            r11.<init>(r9, r13, r10)
            r4.setOnClickListener(r11)
            java.lang.Object r9 = r9.f1558
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            java.lang.String r11 = r10.f7186
            ok r2 = new ok
            r3 = r10
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.put(r11, r2)
            return r4
    }

    /* JADX INFO: renamed from: ο */
    public static android.widget.TextView m806(p000.C0068b8 r2, java.lang.String r3, float r4, int r5) {
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r0.getClass()
            android.widget.TextView r1 = new android.widget.TextView
            java.lang.Object r2 = r2.f1555
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2)
            r1.setText(r3)
            r1.setTextSize(r4)
            r1.setTypeface(r0)
            r1.setTextColor(r5)
            r2 = 0
            r1.setIncludeFontPadding(r2)
            return r1
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: α */
    public boolean mo807() {
            r4 = this;
            java.lang.Object r4 = r4.f1559
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L1f
            java.lang.Object r3 = r4.get(r2)
            n91 r3 = (p000.n91) r3
            w2 r3 = r3.f7474
            boolean r3 = r3.mo807()
            if (r3 == 0) goto L1c
            r4 = 1
            return r4
        L1c:
            int r2 = r2 + 1
            goto La
        L1f:
            return r1
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: β */
    public float mo808() {
            r0 = this;
            java.lang.Object r0 = r0.f1558
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public void m809(java.lang.Object r12, java.lang.String r13) {
            r11 = this;
            ym1 r0 = p000.he1.f4708
            r0 = 95
            r1 = 45
            r2 = 0
            if (r13 == 0) goto L24
            java.lang.CharSequence r3 = p000.q02.m4660(r13)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L24
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.String r3 = r3.replace(r1, r0)
            r3.getClass()
            goto L25
        L24:
            r3 = r2
        L25:
            java.lang.String r4 = "other_uid"
            java.lang.String r5 = "conversation_id"
            java.lang.String r6 = "group_id"
            java.lang.String r7 = "conversation_short_id"
            java.lang.String r8 = "to_user_id"
            if (r3 == 0) goto L96
            int r9 = r3.hashCode()
            switch(r9) {
                case -1945539935: goto L8d;
                case -1891435340: goto L82;
                case -1676094242: goto L77;
                case -1171117248: goto L6e;
                case -804833183: goto L63;
                case -419323305: goto L5c;
                case 293429210: goto L50;
                case 506361563: goto L49;
                case 877233146: goto L42;
                case 2126379083: goto L3a;
                default: goto L38;
            }
        L38:
            goto L96
        L3a:
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L6c
            goto L96
        L42:
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L8b
            goto L96
        L49:
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L59
            goto L96
        L50:
            java.lang.String r9 = "groupid"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L59
            goto L96
        L59:
            r13 = r6
            goto Lba
        L5c:
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L80
            goto L96
        L63:
            java.lang.String r9 = "touserid"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L6c
            goto L96
        L6c:
            r13 = r8
            goto Lba
        L6e:
            java.lang.String r9 = "otheruid"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L94
            goto L96
        L77:
            java.lang.String r9 = "conversationid"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L80
            goto L96
        L80:
            r13 = r5
            goto Lba
        L82:
            java.lang.String r9 = "conversationshortid"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L8b
            goto L96
        L8b:
            r13 = r7
            goto Lba
        L8d:
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L94
            goto L96
        L94:
            r13 = r4
            goto Lba
        L96:
            if (r13 == 0) goto Lb9
            java.lang.CharSequence r13 = p000.q02.m4660(r13)
            java.lang.String r13 = r13.toString()
            if (r13 == 0) goto Lb9
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r3)
            r13.getClass()
            java.lang.String r13 = r13.replace(r1, r0)
            r13.getClass()
            int r0 = r13.length()
            if (r0 <= 0) goto Lb9
            goto Lba
        Lb9:
            r13 = r2
        Lba:
            if (r13 != 0) goto Lbe
            goto L163
        Lbe:
            java.lang.Object r0 = r11.f1559
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            r0.add(r13)
            if (r12 == 0) goto Ldd
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r12 != r0) goto Lcc
            r12 = r2
        Lcc:
            if (r12 == 0) goto Ldd
            java.lang.String r12 = r12.toString()
            if (r12 == 0) goto Ldd
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r12 = r12.toString()
            goto Lde
        Ldd:
            r12 = r2
        Lde:
            if (r12 != 0) goto Le2
            java.lang.String r12 = ""
        Le2:
            int r0 = r13.hashCode()
            r9 = 0
            r1 = 10
            switch(r0) {
                case -1945539935: goto L145;
                case -419323305: goto L12e;
                case 506361563: goto L117;
                case 877233146: goto Lf7;
                case 2126379083: goto Lef;
                default: goto Led;
            }
        Led:
            goto L163
        Lef:
            boolean r13 = r13.equals(r8)
            if (r13 != 0) goto L14c
            goto L163
        Lf7:
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto Lff
            goto L163
        Lff:
            java.lang.Object r13 = r11.f1555
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 != 0) goto L163
            java.lang.Long r12 = p000.x02.m6489(r12, r1)
            if (r12 == 0) goto L114
            long r0 = r12.longValue()
            int r13 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r13 <= 0) goto L114
            r2 = r12
        L114:
            r11.f1555 = r2
            return
        L117:
            boolean r13 = r13.equals(r6)
            if (r13 != 0) goto L11e
            goto L163
        L11e:
            java.lang.Object r13 = r11.f1558
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L163
            int r13 = r12.length()
            if (r13 <= 0) goto L12b
            r2 = r12
        L12b:
            r11.f1558 = r2
            return
        L12e:
            boolean r13 = r13.equals(r5)
            if (r13 != 0) goto L135
            goto L163
        L135:
            java.lang.Object r13 = r11.f1556
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L163
            int r13 = r12.length()
            if (r13 <= 0) goto L142
            r2 = r12
        L142:
            r11.f1556 = r2
            return
        L145:
            boolean r13 = r13.equals(r4)
            if (r13 != 0) goto L14c
            goto L163
        L14c:
            java.lang.Object r13 = r11.f1557
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 != 0) goto L163
            java.lang.Long r12 = p000.x02.m6489(r12, r1)
            if (r12 == 0) goto L161
            long r0 = r12.longValue()
            int r13 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r13 <= 0) goto L161
            r2 = r12
        L161:
            r11.f1557 = r2
        L163:
            return
    }

    /* JADX INFO: renamed from: δ */
    public p000.InterfaceC0074be m810(p000.AbstractC0009a8 r8, p000.p70 r9) {
            r7 = this;
            sm1 r0 = new sm1
            r0.<init>()
            r1 = -1
            r0.f9967 = r1
            java.lang.Object r1 = r7.f1555
            monitor-enter(r1)
            java.lang.Object r2 = r7.f1556     // Catch: java.lang.Throwable -> L18
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1b
            r8.mo49(r2)     // Catch: java.lang.Throwable -> L18
            γ r7 = p000.C0966x.f11952     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            return r7
        L18:
            r7 = move-exception
            goto L9d
        L1b:
            java.lang.Object r2 = r7.f1557     // Catch: java.lang.Throwable -> L18
            j7 r2 = (p000.C0421j7) r2     // Catch: java.lang.Throwable -> L18
        L1f:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L18
            int r4 = r3 + 1
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1f
            r2 = 134217727(0x7ffffff, float:3.8518597E-34)
            r2 = r2 & r4
            r3 = 1
            r5 = 0
            if (r2 != r3) goto L35
            r2 = r3
            goto L36
        L35:
            r2 = r5
        L36:
            int r4 = r4 >>> 27
            r4 = r4 & 15
            r0.f9967 = r4     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r7.f1558     // Catch: java.lang.Throwable -> L18
            v11 r4 = (p000.v11) r4     // Catch: java.lang.Throwable -> L18
            r4.m6015(r8)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            if (r2 == 0) goto L91
            if (r9 == 0) goto L91
            r9.invoke()     // Catch: java.lang.Throwable -> L4c
            goto L91
        L4c:
            r9 = move-exception
            java.lang.Object r1 = r7.f1555
            monitor-enter(r1)
            java.lang.Object r2 = r7.f1556     // Catch: java.lang.Throwable -> L6e
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L58
        L56:
            monitor-exit(r1)
            goto L91
        L58:
            r7.f1556 = r9     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r7.f1558     // Catch: java.lang.Throwable -> L6e
            v11 r2 = (p000.v11) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Object[] r4 = r2.f11064     // Catch: java.lang.Throwable -> L6e
            int r2 = r2.f11065     // Catch: java.lang.Throwable -> L6e
        L62:
            if (r5 >= r2) goto L70
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L6e
            a8 r6 = (p000.AbstractC0009a8) r6     // Catch: java.lang.Throwable -> L6e
            r6.mo49(r9)     // Catch: java.lang.Throwable -> L6e
            int r5 = r5 + 1
            goto L62
        L6e:
            r7 = move-exception
            goto L8f
        L70:
            java.lang.Object r9 = r7.f1558     // Catch: java.lang.Throwable -> L6e
            v11 r9 = (p000.v11) r9     // Catch: java.lang.Throwable -> L6e
            r9.m6018()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r9 = r7.f1557     // Catch: java.lang.Throwable -> L6e
            j7 r9 = (p000.C0421j7) r9     // Catch: java.lang.Throwable -> L6e
        L7b:
            int r2 = r9.get()     // Catch: java.lang.Throwable -> L6e
            int r4 = r2 >>> 27
            r4 = r4 & 15
            int r4 = r4 + r3
            r4 = r4 & 15
            int r4 = r4 << 27
            boolean r2 = r9.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L7b
            goto L56
        L8f:
            monitor-exit(r1)
            throw r7
        L91:
            n5 r9 = new n5
            z7 r1 = new z7
            r2 = 0
            r1.<init>(r8, r7, r0, r2)
            r9.<init>(r1)
            return r9
        L9d:
            monitor-exit(r1)
            throw r7
    }

    /* JADX INFO: renamed from: ζ */
    public void m811(p000.a80 r5) {
            r4 = this;
            java.lang.Object r0 = r4.f1555
            monitor-enter(r0)
            java.lang.Object r1 = r4.f1558     // Catch: java.lang.Throwable -> L36
            v11 r1 = (p000.v11) r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r4.f1559     // Catch: java.lang.Throwable -> L36
            v11 r2 = (p000.v11) r2     // Catch: java.lang.Throwable -> L36
            r4.f1558 = r2     // Catch: java.lang.Throwable -> L36
            r4.f1559 = r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.f1557     // Catch: java.lang.Throwable -> L36
            j7 r4 = (p000.C0421j7) r4     // Catch: java.lang.Throwable -> L36
        L13:
            int r2 = r4.get()     // Catch: java.lang.Throwable -> L36
            int r3 = r2 >>> 27
            r3 = r3 & 15
            int r3 = r3 + 1
            r3 = r3 & 15
            int r3 = r3 << 27
            boolean r2 = r4.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L13
            int r4 = r1.f11065     // Catch: java.lang.Throwable -> L36
            r2 = 0
        L2a:
            if (r2 >= r4) goto L38
            java.lang.Object r3 = r1.m6020(r2)     // Catch: java.lang.Throwable -> L36
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L36
            int r2 = r2 + 1
            goto L2a
        L36:
            r4 = move-exception
            goto L3d
        L38:
            r1.m6018()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            return
        L3d:
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: η */
    public float m812(int r2, boolean r3) {
            r1 = this;
            java.lang.Object r1 = r1.f1555
            android.text.Layout r1 = (android.text.Layout) r1
            int r0 = r1.getLineForOffset(r2)
            int r0 = r1.getLineEnd(r0)
            if (r2 <= r0) goto Lf
            r2 = r0
        Lf:
            if (r3 == 0) goto L16
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L16:
            float r1 = r1.getSecondaryHorizontal(r2)
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public float m813(int r29, boolean r30, boolean r31) {
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r31
            java.lang.Object r3 = r0.f1556
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r0.f1555
            android.text.Layout r4 = (android.text.Layout) r4
            if (r2 != 0) goto L15
            float r0 = r28.m812(r29, r30)
            return r0
        L15:
            int r5 = p000.pd2.m4499(r4, r1, r2)
            int r6 = r4.getLineStart(r5)
            int r7 = r4.getLineEnd(r5)
            if (r1 == r6) goto L2a
            if (r1 == r7) goto L2a
            float r0 = r28.m812(r29, r30)
            return r0
        L2a:
            if (r1 == 0) goto L263
            java.lang.CharSequence r8 = r4.getText()
            int r8 = r8.length()
            if (r1 != r8) goto L38
            goto L263
        L38:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            int r8 = p000.AbstractC1021yh.m6882(r3, r8)
            r9 = 1
            if (r8 >= 0) goto L46
            int r8 = r8 + r9
            int r8 = -r8
            goto L47
        L46:
            int r8 = r8 + r9
        L47:
            if (r2 == 0) goto L5a
            if (r8 <= 0) goto L5a
            int r2 = r8 + (-1)
            java.lang.Object r10 = r3.get(r2)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r1 != r10) goto L5a
            r8 = r2
        L5a:
            if (r8 != 0) goto L5e
            r10 = 0
            goto L6a
        L5e:
            int r10 = r8 + (-1)
            java.lang.Object r10 = r3.get(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
        L6a:
            int r10 = r4.getLineForOffset(r10)
            int r10 = r4.getParagraphDirection(r10)
            r11 = -1
            if (r10 != r11) goto L77
            r10 = r9
            goto L78
        L77:
            r10 = 0
        L78:
            int r7 = r0.m816(r7, r6)
            if (r8 != 0) goto L80
            r12 = 0
            goto L8c
        L80:
            int r12 = r8 + (-1)
            java.lang.Object r12 = r3.get(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
        L8c:
            int r13 = r6 - r12
            int r12 = r7 - r12
            java.lang.Object r14 = r0.f1557
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r0.f1558
            boolean[] r15 = (boolean[]) r15
            boolean r16 = r15[r8]
            r17 = 0
            if (r16 == 0) goto Lab
            java.lang.Object r3 = r14.get(r8)
            java.text.Bidi r3 = (java.text.Bidi) r3
            r27 = r5
            r26 = r7
            r5 = r11
            goto L139
        Lab:
            if (r8 != 0) goto Laf
            r9 = 0
            goto Lbb
        Laf:
            int r9 = r8 + (-1)
            java.lang.Object r9 = r3.get(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        Lbb:
            java.lang.Object r18 = r3.get(r8)
            java.lang.Number r18 = (java.lang.Number) r18
            int r11 = r18.intValue()
            int r2 = r11 - r9
            r25 = r15
            java.lang.Object r15 = r0.f1559
            char[] r15 = (char[]) r15
            r26 = r7
            if (r15 == 0) goto Ld4
            int r7 = r15.length
            if (r7 >= r2) goto Ld6
        Ld4:
            char[] r15 = new char[r2]
        Ld6:
            java.lang.CharSequence r7 = r4.getText()
            r27 = r5
            r5 = 0
            android.text.TextUtils.getChars(r7, r9, r11, r15, r5)
            boolean r7 = java.text.Bidi.requiresBidi(r15, r5, r2)
            if (r7 == 0) goto L122
            if (r8 != 0) goto Lea
            r5 = 0
            goto Lf6
        Lea:
            int r5 = r8 + (-1)
            java.lang.Object r3 = r3.get(r5)
            java.lang.Number r3 = (java.lang.Number) r3
            int r5 = r3.intValue()
        Lf6:
            int r3 = r4.getLineForOffset(r5)
            int r3 = r4.getParagraphDirection(r3)
            r5 = -1
            if (r3 != r5) goto L104
            r24 = 1
            goto L106
        L104:
            r24 = 0
        L106:
            java.text.Bidi r18 = new java.text.Bidi
            r21 = 0
            r22 = 0
            r20 = 0
            r23 = r2
            r19 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24)
            int r2 = r18.getRunCount()
            r3 = 1
            if (r2 != r3) goto L11f
        L11c:
            r2 = r17
            goto L125
        L11f:
            r2 = r18
            goto L125
        L122:
            r3 = 1
            r5 = -1
            goto L11c
        L125:
            r14.set(r8, r2)
            r25[r8] = r3
            if (r2 == 0) goto L136
            java.lang.Object r3 = r0.f1559
            char[] r3 = (char[]) r3
            if (r15 != r3) goto L135
            r15 = r17
            goto L136
        L135:
            r15 = r3
        L136:
            r0.f1559 = r15
            r3 = r2
        L139:
            if (r3 == 0) goto L13f
            java.text.Bidi r17 = r3.createLineBidi(r13, r12)
        L13f:
            r2 = r17
            if (r2 == 0) goto L23b
            int r3 = r2.getRunCount()
            r7 = 1
            if (r3 != r7) goto L151
            r16 = r7
        L14c:
            r8 = r27
            r11 = 0
            goto L23f
        L151:
            int r3 = r2.getRunCount()
            op0[] r7 = new p000.op0[r3]
            r8 = 0
        L158:
            if (r8 >= r3) goto L17a
            op0 r9 = new op0
            int r11 = r2.getRunStart(r8)
            int r11 = r11 + r6
            int r12 = r2.getRunLimit(r8)
            int r12 = r12 + r6
            int r13 = r2.getRunLevel(r8)
            int r13 = r13 % 2
            r14 = 1
            if (r13 != r14) goto L171
            r13 = 1
            goto L172
        L171:
            r13 = 0
        L172:
            r9.<init>(r11, r12, r13)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L158
        L17a:
            int r8 = r2.getRunCount()
            byte[] r9 = new byte[r8]
            r11 = 0
        L181:
            if (r11 >= r8) goto L18d
            int r12 = r2.getRunLevel(r11)
            byte r12 = (byte) r12
            r9[r11] = r12
            int r11 = r11 + 1
            goto L181
        L18d:
            r11 = 0
            java.text.Bidi.reorderVisually(r9, r11, r7, r11, r3)
            if (r1 != r6) goto L1e3
            r0 = r11
        L194:
            if (r0 >= r3) goto L1a0
            r2 = r7[r0]
            int r2 = r2.f8169
            if (r2 != r1) goto L19d
            goto L1a1
        L19d:
            int r0 = r0 + 1
            goto L194
        L1a0:
            r0 = r5
        L1a1:
            r1 = r7[r0]
            if (r30 != 0) goto L1ac
            boolean r1 = r1.f8171
            if (r10 != r1) goto L1aa
            goto L1ac
        L1aa:
            r2 = r10
            goto L1b1
        L1ac:
            if (r10 != 0) goto L1b0
            r2 = 1
            goto L1b1
        L1b0:
            r2 = r11
        L1b1:
            if (r0 != 0) goto L1bc
            if (r2 == 0) goto L1bc
            r8 = r27
            float r0 = r4.getLineLeft(r8)
            return r0
        L1bc:
            r8 = r27
            r16 = 1
            int r3 = r3 + (-1)
            if (r0 != r3) goto L1cb
            if (r2 != 0) goto L1cb
            float r0 = r4.getLineRight(r8)
            return r0
        L1cb:
            if (r2 == 0) goto L1d8
            int r0 = r0 + (-1)
            r0 = r7[r0]
            int r0 = r0.f8169
            float r0 = r4.getPrimaryHorizontal(r0)
            return r0
        L1d8:
            int r0 = r0 + 1
            r0 = r7[r0]
            int r0 = r0.f8169
            float r0 = r4.getPrimaryHorizontal(r0)
            return r0
        L1e3:
            r2 = r26
            r8 = r27
            if (r1 <= r2) goto L1ee
            int r0 = r0.m816(r1, r6)
            goto L1ef
        L1ee:
            r0 = r1
        L1ef:
            r1 = r11
        L1f0:
            if (r1 >= r3) goto L1fc
            r2 = r7[r1]
            int r2 = r2.f8170
            if (r2 != r0) goto L1f9
            goto L1fd
        L1f9:
            int r1 = r1 + 1
            goto L1f0
        L1fc:
            r1 = r5
        L1fd:
            r0 = r7[r1]
            if (r30 != 0) goto L20c
            boolean r0 = r0.f8171
            if (r10 != r0) goto L206
            goto L20c
        L206:
            if (r10 != 0) goto L20a
            r2 = 1
            goto L20d
        L20a:
            r2 = r11
            goto L20d
        L20c:
            r2 = r10
        L20d:
            if (r1 != 0) goto L216
            if (r2 == 0) goto L216
            float r0 = r4.getLineLeft(r8)
            return r0
        L216:
            r16 = 1
            int r3 = r3 + (-1)
            if (r1 != r3) goto L223
            if (r2 != 0) goto L223
            float r0 = r4.getLineRight(r8)
            return r0
        L223:
            if (r2 == 0) goto L230
            int r1 = r1 + (-1)
            r0 = r7[r1]
            int r0 = r0.f8170
            float r0 = r4.getPrimaryHorizontal(r0)
            return r0
        L230:
            int r1 = r1 + 1
            r0 = r7[r1]
            int r0 = r0.f8170
            float r0 = r4.getPrimaryHorizontal(r0)
            return r0
        L23b:
            r16 = 1
            goto L14c
        L23f:
            boolean r0 = r4.isRtlCharAt(r6)
            if (r30 != 0) goto L247
            if (r10 != r0) goto L24d
        L247:
            if (r10 != 0) goto L24c
            r10 = r16
            goto L24d
        L24c:
            r10 = r11
        L24d:
            if (r1 != r6) goto L251
            r9 = r10
            goto L257
        L251:
            if (r10 != 0) goto L256
            r9 = r16
            goto L257
        L256:
            r9 = r11
        L257:
            if (r9 == 0) goto L25e
            float r0 = r4.getLineLeft(r8)
            return r0
        L25e:
            float r0 = r4.getLineRight(r8)
            return r0
        L263:
            float r0 = r28.m812(r29, r30)
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public void m814(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r2.getClass()
            java.lang.Object r0 = r0.f1557
            uc0 r0 = (p000.uc0) r0
            r0.getClass()
            p000.v81.m6124(r1)
            p000.v81.m6125(r2, r1)
            r0.m5841(r1)
            p000.v81.m6120(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: κ */
    public android.widget.ImageView m815(java.lang.String r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = new android.widget.ImageView
            java.lang.Object r1 = r3.f1555
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            x01 r1 = p000.x01.f11964
            android.content.Context r2 = r0.getContext()
            r2.getClass()
            android.graphics.drawable.Drawable r5 = r1.m6475(r2, r5)
            if (r5 == 0) goto L1d
            android.graphics.drawable.Drawable r5 = r5.mutate()
            goto L1e
        L1d:
            r5 = 0
        L1e:
            r0.setImageDrawable(r5)
            r0.setContentDescription(r4)
            java.lang.Object r3 = r3.f1556
            xx r3 = (p000.C1000xx) r3
            java.lang.String r3 = r3.f12356
            int r3 = android.graphics.Color.parseColor(r3)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r3)
            r0.setImageTintList(r4)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.setColorFilter(r3, r4)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0.setScaleType(r3)
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public int m816(int r3, int r4) {
            r2 = this;
        L0:
            if (r3 <= r4) goto L3d
            java.lang.Object r0 = r2.f1555
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.CharSequence r0 = r0.getText()
            int r1 = r3 + (-1)
            char r0 = r0.charAt(r1)
            r1 = 32
            if (r0 == r1) goto L3a
            r1 = 10
            if (r0 == r1) goto L3a
            r1 = 5760(0x1680, float:8.071E-42)
            if (r0 == r1) goto L3a
            r1 = 8192(0x2000, float:1.148E-41)
            int r1 = p000.ln0.m3632(r0, r1)
            if (r1 < 0) goto L30
            r1 = 8202(0x200a, float:1.1493E-41)
            int r1 = p000.ln0.m3632(r0, r1)
            if (r1 > 0) goto L30
            r1 = 8199(0x2007, float:1.1489E-41)
            if (r0 != r1) goto L3a
        L30:
            r1 = 8287(0x205f, float:1.1613E-41)
            if (r0 == r1) goto L3a
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto L39
            goto L3a
        L39:
            return r3
        L3a:
            int r3 = r3 + (-1)
            goto L0
        L3d:
            return r3
    }

    /* JADX INFO: renamed from: μ */
    public void m817(java.lang.String r3, p000.kn1 r4) {
            r2 = this;
            r3.getClass()
            int r0 = r3.length()
            if (r0 <= 0) goto L5d
            java.lang.String r0 = "method "
            if (r4 != 0) goto L48
            java.lang.String r1 = "POST"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "PUT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "PATCH"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "PROPPATCH"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "QUERY"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "REPORT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            goto L4e
        L3e:
            java.lang.String r2 = " must have a request body."
            java.lang.String r2 = p000.lz1.m3674(r0, r3, r2)
            p000.C1080.m7266(r2)
            return
        L48:
            boolean r1 = p000.jx0.m3031(r3)
            if (r1 == 0) goto L53
        L4e:
            r2.f1556 = r3
            r2.f1558 = r4
            return
        L53:
            java.lang.String r2 = " must not have a request body."
            java.lang.String r2 = p000.lz1.m3674(r0, r3, r2)
            p000.C1080.m7266(r2)
            return
        L5d:
            java.lang.String r2 = "method.isEmpty() == true"
            p000.C1080.m7275(r2)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public void m818(p000.C0552mk r14, boolean r15, boolean r16) {
            r13 = this;
            java.lang.Object r0 = r13.f1556
            r1 = r0
            xx r1 = (p000.C1000xx) r1
            r14.getClass()
            java.lang.Object r0 = r13.f1558
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        L19:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L10d
            java.lang.Object r0 = r2.next()
            r3 = r0
            ok r3 = (p000.C0626ok) r3
            mk r0 = r3.f8123
            java.lang.String r4 = r0.f7186
            int r5 = r3.f8127
            android.widget.ImageView r6 = r3.f8126
            android.widget.TextView r7 = r3.f8125
            android.widget.FrameLayout r8 = r3.f8124
            r9 = 0
            if (r15 == 0) goto L45
            boolean r10 = r0.f7188
            if (r10 == 0) goto L45
            java.lang.Object r10 = p000.ui1.f10844
            boolean r10 = p000.ui1.m5902(r4)
            if (r10 == 0) goto L42
            goto L45
        L42:
            r10 = 8
            goto L46
        L45:
            r10 = r9
        L46:
            r8.setVisibility(r10)
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r15 == 0) goto L5c
            boolean r11 = r0.f7189
            if (r11 == 0) goto L5c
            java.lang.Object r11 = p000.ui1.f10844
            float r11 = p000.ui1.m5888(r4)
            r12 = 0
            float r10 = p000.j81.m2905(r11, r12, r10)
        L5c:
            r8.setAlpha(r10)
            java.lang.String r10 = r14.f7186
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L87
            android.graphics.drawable.GradientDrawable r10 = p000.lz1.m3681(r9)
            java.lang.Object r11 = r13.f1555
            android.content.Context r11 = (android.content.Context) r11
            r12 = 4
            int r12 = p000.jx0.m3056(r11, r12)
            float r12 = (float) r12
            r10.setCornerRadius(r12)
            r12 = 1
            int r11 = p000.jx0.m3056(r11, r12)
            java.lang.String r12 = r1.f12358
            int r12 = android.graphics.Color.parseColor(r12)
            r10.setStroke(r11, r12)
            goto L8c
        L87:
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable
            r10.<init>(r9)
        L8c:
            r8.setBackground(r10)
            if (r7 != 0) goto L93
            if (r6 == 0) goto L19
        L93:
            if (r15 == 0) goto Lc2
            boolean r0 = r0.f7190
            if (r0 == 0) goto Lc2
            boolean r0 = p000.ui1.m5900(r4)
            if (r0 == 0) goto Lc2
            java.lang.String r0 = p000.ui1.m5889(r4)     // Catch: java.lang.Throwable -> Lac
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lac
            goto Lb3
        Lac:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        Lb3:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto Lbc
            r0 = r4
        Lbc:
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
        Lc2:
            if (r7 == 0) goto Lfd
            java.lang.String r0 = r3.f8128
            if (r0 == 0) goto Lfa
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r4.<init>(r5)
            int r8 = r3.length()
            r10 = 33
            r3.setSpan(r4, r9, r8, r10)
            if (r16 == 0) goto Lf6
            java.lang.String r4 = "@小助手"
            r8 = 6
            int r0 = p000.q02.m4669(r0, r4, r9, r9, r8)
            if (r0 < 0) goto Lf6
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            java.lang.String r8 = r1.f12360
            int r8 = android.graphics.Color.parseColor(r8)
            r4.<init>(r8)
            int r8 = r0 + 4
            r3.setSpan(r4, r0, r8, r10)
        Lf6:
            r7.setText(r3)
            goto Lfd
        Lfa:
            r7.setTextColor(r5)
        Lfd:
            if (r6 == 0) goto L19
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r5)
            r6.setImageTintList(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r6.setColorFilter(r5, r0)
            goto L19
        L10d:
            return
    }

    /* JADX INFO: renamed from: π */
    public void m819(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "ws:"
            r1 = 1
            boolean r0 = p000.x02.m6485(r3, r0, r1)
            if (r0 == 0) goto L15
            r0 = 3
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r0 = "http:"
            java.lang.String r3 = r0.concat(r3)
            goto L28
        L15:
            java.lang.String r0 = "wss:"
            boolean r0 = p000.x02.m6485(r3, r0, r1)
            if (r0 == 0) goto L28
            r0 = 4
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r0 = "https:"
            java.lang.String r3 = r0.concat(r3)
        L28:
            ng0 r0 = new ng0
            r0.<init>()
            r1 = 0
            r0.m4042(r1, r3)
            og0 r3 = r0.m4040()
            r2.f1555 = r3
            return
    }

    /* JADX INFO: renamed from: ρ */
    public void m820(int r4, java.lang.Object r5) {
            r3 = this;
            if (r5 == 0) goto L71
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r5 == r0) goto L71
            r0 = 6
            if (r4 <= r0) goto La
            goto L71
        La:
            boolean r0 = r5 instanceof org.json.JSONObject
            if (r0 == 0) goto L30
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.util.Iterator r0 = r5.keys()
            r0.getClass()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.opt(r1)
            r3.m809(r2, r1)
            int r1 = r4 + 1
            r3.m820(r1, r2)
            goto L17
        L30:
            boolean r0 = r5 instanceof org.json.JSONArray
            if (r0 == 0) goto L5a
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r0 = r5.length()
            r1 = 0
            xm0 r0 = p000.j81.m2893(r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            r1 = r0
            wm0 r1 = (p000.wm0) r1
            int r1 = r1.nextInt()
            java.lang.Object r1 = r5.opt(r1)
            int r2 = r4 + 1
            r3.m820(r2, r1)
            goto L43
        L5a:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L66
            java.util.Map r5 = (java.util.Map) r5
            int r4 = r4 + 1
            r3.m821(r5, r4)
            return
        L66:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L71
            java.lang.String r5 = (java.lang.String) r5
            int r4 = r4 + 1
            r3.m822(r5, r4)
        L71:
            return
    }

    /* JADX INFO: renamed from: σ */
    public void m821(java.util.Map r3, int r4) {
            r2 = this;
            r3.getClass()
            r0 = 6
            if (r4 <= r0) goto L7
            goto L34
        L7:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r1 == 0) goto L2a
            java.lang.String r1 = r1.toString()
            goto L2b
        L2a:
            r1 = 0
        L2b:
            r2.m809(r0, r1)
            int r1 = r4 + 1
            r2.m820(r1, r0)
            goto Lf
        L34:
            return
    }

    /* JADX INFO: renamed from: τ */
    public void m822(java.lang.String r3, int r4) {
            r2 = this;
            r3.getClass()
            r0 = 6
            if (r4 <= r0) goto L7
            goto L57
        L7:
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            r0 = 123(0x7b, float:1.72E-43)
            boolean r0 = p000.q02.m4684(r3, r0)
            r1 = 0
            if (r0 == 0) goto L34
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            goto L24
        L1e:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L24:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L29
            goto L2a
        L29:
            r1 = r0
        L2a:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L57
            int r4 = r4 + 1
            r2.m820(r4, r1)
            goto L57
        L34:
            r0 = 91
            boolean r0 = p000.q02.m4684(r3, r0)
            if (r0 == 0) goto L57
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L42
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L42
            goto L48
        L42:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L48:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r0
        L4e:
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            if (r1 == 0) goto L57
            int r4 = r4 + 1
            r2.m820(r4, r1)
        L57:
            return
    }
}
