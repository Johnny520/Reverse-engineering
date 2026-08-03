package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1365i;

    public /* synthetic */ t(android.app.Activity r2, java.lang.String r3) {
            r1 = this;
            r0 = 11
            r1.f1363g = r0
            r1.<init>()
            r1.f1364h = r2
            r1.f1365i = r3
            return
    }

    public /* synthetic */ t(android.app.Activity r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f1363g = r3
            r0.f1364h = r1
            r0.f1365i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f1363g
            switch(r0) {
                case 0: goto L35f;
                case 1: goto L32c;
                case 2: goto L31f;
                case 3: goto L312;
                case 4: goto L305;
                case 5: goto L2ea;
                case 6: goto L2dd;
                case 7: goto L2cc;
                case 8: goto L2bf;
                case 9: goto L2b2;
                case 10: goto L188;
                default: goto L5;
            }
        L5:
            android.app.Activity r0 = r11.f1364h
            android.view.Window r1 = r0.getWindow()
            r2 = 0
            if (r1 == 0) goto L13
            android.view.View r1 = r1.getDecorView()
            goto L14
        L13:
            r1 = r2
        L14:
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L1c
        L1b:
            r1 = r2
        L1c:
            if (r1 == 0) goto L187
            android.view.View r3 = uf.d.n(r1)
            java.lang.String r4 = r11.f1365i
            if (r3 == 0) goto L2b
            uf.d.i(r3, r0, r4)
            goto L187
        L2b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            uf.d.k(r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L3c:
            boolean r5 = r3.hasNext()
            r6 = 2
            if (r5 == 0) goto L54
            java.lang.Object r5 = r3.next()
            r7 = r5
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r7 = r7.getChildCount()
            if (r7 < r6) goto L3c
            r1.add(r5)
            goto L3c
        L54:
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L5f
            goto L92
        L5f:
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L6a
            goto L92
        L6a:
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r3 = uf.d.L(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L75:
            java.lang.Object r5 = r1.next()
            r7 = r5
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r7 = uf.d.L(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r8 = r3.compareTo(r7)
            if (r8 >= 0) goto L8c
            r2 = r5
            r3 = r7
        L8c:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L75
        L92:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L187
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r3 = 0
            r1.setOrientation(r3)
            r5 = 16
            r1.setGravity(r5)
            r5 = 1113587712(0x42600000, float:56.0)
            int r5 = uf.d.m(r0, r5)
            r1.setMinimumHeight(r5)
            r5 = 1098907648(0x41800000, float:16.0)
            int r7 = uf.d.m(r0, r5)
            r8 = 1094713344(0x41400000, float:12.0)
            int r9 = uf.d.m(r0, r8)
            int r10 = uf.d.m(r0, r5)
            int r8 = uf.d.m(r0, r8)
            r1.setPadding(r7, r9, r10, r8)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r7.<init>(r8, r9)
            r1.setLayoutParams(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            r7.setTextSize(r5)
            r5 = 1
            r7.setIncludeFontPadding(r5)
            r7.setMaxLines(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r3, r9, r8)
            r7.setLayoutParams(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r8 = "›"
            r6.setText(r8)
            r8 = 1103101952(0x41c00000, float:24.0)
            r6.setTextSize(r8)
            r10 = 17
            r6.setGravity(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            int r8 = uf.d.m(r0, r8)
            r10.<init>(r8, r9)
            r6.setLayoutParams(r10)
            r1.addView(r7)
            r1.addView(r6)
            uf.d.i(r1, r0, r4)
            int r0 = r2.getChildCount()
            r4 = r3
        L115:
            if (r4 < r0) goto L120
            int r0 = r2.getChildCount()
            if (r0 <= 0) goto L11e
            goto L178
        L11e:
            r5 = r3
            goto L178
        L120:
            android.view.View r6 = r2.getChildAt(r4)
            r6.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            nb.a r8 = new nb.a
            r9 = 19
            r8.<init>(r7, r9)
            uf.d.l(r6, r3, r8)
            java.lang.String r7 = r7.toString()
            boolean r8 = r6 instanceof android.widget.AbsListView
            if (r8 != 0) goto L177
            boolean r8 = r6 instanceof android.widget.ScrollView
            if (r8 != 0) goto L177
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "RecyclerView"
            boolean r6 = og.m.h0(r6, r8, r3)
            if (r6 == 0) goto L153
            goto L177
        L153:
            java.lang.String r6 = "备注"
            boolean r6 = og.m.h0(r7, r6, r3)
            if (r6 != 0) goto L177
            java.lang.String r6 = "标签"
            boolean r6 = og.m.h0(r7, r6, r3)
            if (r6 != 0) goto L177
            java.lang.String r6 = "群聊名称"
            boolean r6 = og.m.h0(r7, r6, r3)
            if (r6 != 0) goto L177
            java.lang.String r6 = "查找聊天记录"
            boolean r6 = og.m.h0(r7, r6, r3)
            if (r6 == 0) goto L174
            goto L177
        L174:
            int r4 = r4 + 1
            goto L115
        L177:
            r5 = r4
        L178:
            int r0 = r2.getChildCount()
            int r0 = r9.e0.r(r5, r3, r0)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r2.addView(r1, r0, r3)
        L187:
            return
        L188:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            android.app.Activity r2 = r11.f1364h
            java.lang.String r3 = "getPreferenceScreen"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r3, r1)
            if (r1 == 0) goto L2b1
            java.lang.String r3 = "room_name"
            java.lang.Object r3 = uf.d.o(r1, r3)
            r4 = 0
            if (r3 == 0) goto L1ff
            java.lang.Class r5 = r3.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L1a7:
            if (r5 == 0) goto L1bd
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L1bd
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            tf.r.h1(r6, r7)
            java.lang.Class r5 = r5.getSuperclass()
            goto L1a7
        L1bd:
            java.util.Iterator r5 = r6.iterator()
        L1c1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1fb
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L1c1
            java.lang.Class<java.lang.CharSequence> r8 = java.lang.CharSequence.class
            java.lang.Class r9 = r7.getReturnType()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L1c1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r7, r3, r8)
            if (r7 == 0) goto L1f1
            java.lang.String r7 = r7.toString()
            goto L1f2
        L1f1:
            r7 = r4
        L1f2:
            java.lang.String r8 = "群聊名称"
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L1c1
            goto L1fc
        L1fb:
            r6 = r4
        L1fc:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            goto L200
        L1ff:
            r6 = r4
        L200:
            java.lang.String r3 = "hchat_profile_id"
            java.lang.Object r5 = uf.d.o(r1, r3)
            java.lang.String r7 = r11.f1365i
            if (r5 == 0) goto L218
            uf.d.f(r5, r7, r6)
            uf.d.g(r5, r2, r7)
            uf.d.H(r1)
            uf.d.h(r2, r7, r0)
            goto L2b1
        L218:
            java.lang.String r5 = "com.tencent.mm.ui.base.preference.Preference"
            java.lang.ClassLoader r8 = r2.getClassLoader()
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r8)
            if (r5 == 0) goto L2b1
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            java.lang.Class[] r8 = new java.lang.Class[]{r8}
            java.lang.reflect.Constructor r5 = h.Hchat.utils.KavaReflector.findConstructor(r5, r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r5, r8)
            if (r5 == 0) goto L2b1
            java.lang.String r8 = "q"
            h.Hchat.utils.KavaReflector.writeField(r5, r8, r3)
            java.lang.Class r8 = r5.getClass()
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class[] r9 = new java.lang.Class[]{r9}
            java.lang.String r10 = "C"
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findMethod(r8, r10, r9)
            if (r8 == 0) goto L256
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            h.Hchat.utils.KavaReflector.invoke(r8, r5, r3)
        L256:
            uf.d.f(r5, r7, r6)
            uf.d.g(r5, r2, r7)
            r3 = r0
        L25d:
            r6 = 3
            java.lang.String[] r8 = va.c.f14299f
            if (r3 < r6) goto L264
            r9 = r4
            goto L26c
        L264:
            r9 = r8[r3]
            java.lang.Object r9 = uf.d.o(r1, r9)
            if (r9 == 0) goto L2ae
        L26c:
            if (r9 != 0) goto L270
        L26e:
            r3 = r4
            goto L27a
        L270:
            java.lang.String r3 = uf.d.J(r9)
            if (r3 == 0) goto L26e
            java.lang.Integer r3 = uf.d.I(r1, r3)
        L27a:
            if (r3 == 0) goto L27d
            goto L28e
        L27d:
            r3 = r0
        L27e:
            if (r3 >= r6) goto L28d
            r9 = r8[r3]
            java.lang.Integer r9 = uf.d.I(r1, r9)
            if (r9 == 0) goto L28a
            r4 = r9
            goto L28d
        L28a:
            int r3 = r3 + 1
            goto L27e
        L28d:
            r3 = r4
        L28e:
            if (r3 == 0) goto L29b
            int r3 = r3.intValue()
            boolean r3 = uf.d.B(r1, r3, r5)
            if (r3 == 0) goto L29b
            goto L2a1
        L29b:
            boolean r3 = uf.d.B(r1, r0, r5)
            if (r3 == 0) goto L2a8
        L2a1:
            uf.d.H(r1)
            uf.d.h(r2, r7, r0)
            goto L2b1
        L2a8:
            java.lang.String r0 = "[Hchat:ProfileId] 群聊 ID Preference 插入失败"
            fb.v0.m(r0)
            goto L2b1
        L2ae:
            int r3 = r3 + 1
            goto L25d
        L2b1:
            return
        L2b2:
            java.lang.String r0 = r11.f1365i
            r1 = 0
            android.app.Activity r2 = r11.f1364h
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
        L2bf:
            java.lang.String r0 = r11.f1365i
            r1 = 0
            android.app.Activity r2 = r11.f1364h
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
        L2cc:
            android.app.Activity r0 = r11.f1364h
            android.content.Context r0 = r0.getApplicationContext()
            r1 = 0
            java.lang.String r2 = r11.f1365i
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            return
        L2dd:
            java.lang.String r0 = r11.f1365i
            r1 = 0
            android.app.Activity r2 = r11.f1364h
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
        L2ea:
            android.app.Activity r0 = r11.f1364h
            if (r0 == 0) goto L304
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L304
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L304
            r1 = 1
            java.lang.String r2 = r11.f1365i
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
        L304:
            return
        L305:
            java.lang.String r0 = r11.f1365i
            r1 = 0
            android.app.Activity r2 = r11.f1364h
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
        L312:
            java.lang.String r0 = r11.f1365i
            r1 = 0
            android.app.Activity r2 = r11.f1364h
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
        L31f:
            java.lang.String r0 = r11.f1365i
            r1 = 0
            android.app.Activity r2 = r11.f1364h
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
        L32c:
            android.app.Activity r0 = r11.f1364h
            java.util.List r1 = c9.o2.i(r0)
            java.util.Iterator r1 = r1.iterator()
        L336:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L352
            java.lang.Object r2 = r1.next()
            r3 = r2
            c9.a r3 = (c9.a) r3
            java.lang.String r3 = r3.f1081a
            java.lang.String r3 = c9.d2.F(r3)
            java.lang.String r4 = r11.f1365i
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L336
            goto L353
        L352:
            r2 = 0
        L353:
            c9.a r2 = (c9.a) r2
            if (r2 == 0) goto L35e
            java.lang.String r1 = r2.f1081a
            if (r1 == 0) goto L35e
            c9.d2.h(r0, r1)
        L35e:
            return
        L35f:
            android.app.Activity r0 = r11.f1364h
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L37b
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L37b
            android.content.Context r0 = r0.getApplicationContext()
            r1 = 0
            java.lang.String r2 = r11.f1365i
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
        L37b:
            return
    }
}
