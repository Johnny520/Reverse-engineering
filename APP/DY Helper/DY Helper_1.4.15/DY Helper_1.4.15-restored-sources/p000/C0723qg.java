package p000;

/* JADX INFO: renamed from: qg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0723qg extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8997;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f8998;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.Object f8999;

    public /* synthetic */ C0723qg(int r1, java.lang.Object r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.f8997 = r1
            r0.f8999 = r3
            r0.f8998 = r2
            r0.<init>()
            return
    }

    public C0723qg(java.lang.ClassLoader r2, java.lang.reflect.Method r3) {
            r1 = this;
            r0 = 8
            r1.f8997 = r0
            c82 r0 = p000.c82.f1991
            r1.f8998 = r2
            r1.f8999 = r3
            r1.<init>()
            return
    }

    public /* synthetic */ C0723qg(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f8997 = r2
            r0.f8998 = r1
            r0.f8999 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ C0723qg(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f8997 = r4
            r0.f8998 = r2
            r0.f8999 = r3
            r0.<init>()
            return
    }

    public C0723qg(java.lang.String r2, p000.a80 r3) {
            r1 = this;
            r0 = 5
            r1.f8997 = r0
            p80 r3 = (p000.p80) r3
            r1.f8998 = r3
            r1.f8999 = r2
            r1.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r10) {
            r9 = this;
            int r0 = r9.f8997
            r1 = 0
            r2 = 4
            r3 = 0
            java.lang.Object r4 = r9.f8999
            java.lang.Object r5 = r9.f8998
            switch(r0) {
                case 0: goto L208;
                case 1: goto L1eb;
                case 2: goto L199;
                case 3: goto L16d;
                case 4: goto L91;
                case 5: goto L69;
                case 6: goto L10;
                default: goto Lc;
            }
        Lc:
            super.afterHookedMethod(r10)
            return
        L10:
            r10.getClass()
            java.lang.Object[] r9 = r10.f5692
            r9.getClass()
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r1, r9)
            boolean r10 = r9 instanceof android.content.Context
            if (r10 == 0) goto L23
            r3 = r9
            android.content.Context r3 = (android.content.Context) r3
        L23:
            if (r3 != 0) goto L26
            goto L68
        L26:
            java.lang.String r9 = r3.getPackageName()
            java.lang.String r10 = "com.xingin.xhs"
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 != 0) goto L33
            goto L68
        L33:
            z81 r5 = (p000.z81) r5
            n5 r4 = (p000.C0574n5) r4
            java.lang.ClassLoader r9 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L54
            if (r9 != 0) goto L3f
            java.lang.ClassLoader r9 = r5.f13011     // Catch: java.lang.Throwable -> L54
        L3f:
            r9.getClass()     // Catch: java.lang.Throwable -> L54
            r5.f13011 = r9     // Catch: java.lang.Throwable -> L54
            p000.md2.m3814(r3, r5)     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.CopyOnWriteArrayList r9 = p000.od2.f8054     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.sw0.f10061     // Catch: java.lang.Throwable -> L54
            boolean r9 = p000.od2.m4227(r5, r4, r9)     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L54
            goto L5b
        L54:
            r9 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L5b:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L68
            java.lang.String r10 = "XHSHelper"
            java.lang.String r0 = "SAMPLE attach 阶段 Hook 安装失败"
            p000.C0888ux.m5977(r10, r0, r9)
        L68:
            return
        L69:
            r10.getClass()
            p80 r5 = (p000.p80) r5
            java.lang.Object r9 = r10.f5691     // Catch: java.lang.Throwable -> L76
            r5.invoke(r9)     // Catch: java.lang.Throwable -> L76
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L76
            goto L7d
        L76:
            r9 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L7d:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L90
            java.lang.String r10 = " lifecycle callback failed"
            java.lang.String r10 = r4.concat(r10)
            java.lang.String r0 = "rfae3094b732ade5a"
            p000.C0888ux.m5977(r0, r10, r9)
        L90:
            return
        L91:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r10.getClass()
            java.lang.Object r9 = r10.f5694
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto La1
            android.view.View r9 = (android.view.View) r9
            goto La2
        La1:
            r9 = r3
        La2:
            if (r9 != 0) goto La6
            goto L16c
        La6:
            java.util.Set r10 = p000.c30.f1954
            java.lang.String r10 = r4.getName()
            java.lang.String r0 = "onCreateView"
            boolean r10 = p000.ln0.m3626(r10, r0)
            if (r10 == 0) goto Lb5
            goto Ld8
        Lb5:
            java.lang.Class[] r10 = r4.getParameterTypes()
            r10.getClass()
            int r0 = r10.length
            r6 = r1
        Lbe:
            if (r6 >= r0) goto L103
            r7 = r10[r6]
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L100
            int r0 = r10.length
            r6 = r1
        Lcc:
            if (r6 >= r0) goto L103
            r7 = r10[r6]
            java.lang.Class<android.view.ViewGroup> r8 = android.view.ViewGroup.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto Lfd
        Ld8:
            q10 r10 = p000.q10.f8786
            p3 r10 = new p3
            r0 = 7
            r10.<init>(r5, r0, r9)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r6)
            if (r0 == 0) goto Lf2
            r10.invoke()
            goto L103
        Lf2:
            android.os.Handler r0 = p000.q10.f8788
            r0 r6 = new r0
            r6.<init>(r2, r10)
            r0.post(r6)
            goto L103
        Lfd:
            int r6 = r6 + 1
            goto Lcc
        L100:
            int r6 = r6 + 1
            goto Lbe
        L103:
            boolean r10 = p000.ui1.m5904(r5)
            if (r10 != 0) goto L10a
            goto L16c
        L10a:
            java.util.Set r10 = p000.c30.f1954
            java.lang.Class r10 = r4.getDeclaringClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r0 = r4.getName()
            java.lang.String r4 = "factory:"
            java.lang.String r6 = "#"
            java.lang.String r10 = p000.a12.m18(r4, r10, r6, r0)
            r9.setVisibility(r2)
            r0 = 0
            r9.setAlpha(r0)
            r9.setClickable(r1)
            r9.setFocusable(r1)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            if (r0 == 0) goto L144
            r0.width = r1
            r0.height = r1
            boolean r4 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L141
            r4 = r0
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r4.setMargins(r1, r1, r1, r1)
        L141:
            r9.setLayoutParams(r0)
        L144:
            jb r0 = new jb
            r1 = 21
            r0.<init>(r9, r1)
            r9.post(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r0 = " reason="
            java.lang.String r1 = " view="
            java.lang.String r4 = "已隐藏 3903 右侧控件 control="
            java.lang.StringBuilder r10 = p000.lz1.m3695(r4, r5, r0, r10, r1)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "FeedRightControlsHide3903"
            p000.C0888ux.m5988(r10, r9, r3, r2, r3)
        L16c:
            return
        L16d:
            r10.getClass()
            a80 r5 = (p000.a80) r5     // Catch: java.lang.Throwable -> L176
            r5.invoke(r10)     // Catch: java.lang.Throwable -> L176
            goto L198
        L176:
            r9 = move-exception
            h22 r10 = p000.AbstractC0551mj.f7171
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "hook after "
            r10.<init>(r0)
            r10.append(r4)
            java.lang.String r0 = " failed: "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            p000.AbstractC0551mj.m3859(r9)
        L198:
            return
        L199:
            dh r4 = (p000.C0212dh) r4
            ig r5 = (p000.C0394ig) r5
            r10.getClass()
            java.lang.Object r9 = r10.f5694
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto L1a9
            r3 = r9
            android.view.View r3 = (android.view.View) r3
        L1a9:
            if (r3 != 0) goto L1ac
            goto L1ea
        L1ac:
            java.util.concurrent.ConcurrentHashMap$KeySetView r9 = p000.C0248eh.f3553
            r9.getClass()
            java.util.Iterator r10 = r9.iterator()
        L1b5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L1cf
            java.lang.Object r0 = r10.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1cb
            if (r0 != r3) goto L1b5
        L1cb:
            r10.remove()
            goto L1b5
        L1cf:
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            r10.<init>(r3)
            r9.add(r10)
            java.lang.String r9 = r4.f3159
            java.lang.String r10 = " create"
            java.lang.String r9 = r9.concat(r10)
            r5.invoke(r3, r9)
            e9 r9 = new e9
            r9.<init>(r3, r5, r4, r2)
            r3.post(r9)
        L1ea:
            return
        L1eb:
            r10.getClass()
            java.lang.Object r9 = r10.f5694
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto L1f7
            r3 = r9
            android.view.View r3 = (android.view.View) r3
        L1f7:
            if (r3 != 0) goto L1fa
            goto L207
        L1fa:
            e80 r5 = (p000.e80) r5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r9 = " onCreateView"
            java.lang.String r9 = r4.concat(r9)
            r5.invoke(r3, r9)
        L207:
            return
        L208:
            r10.getClass()
            java.lang.Object r9 = r10.f5694
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto L214
            r3 = r9
            android.view.View r3 = (android.view.View) r3
        L214:
            if (r3 != 0) goto L217
            goto L230
        L217:
            ig r5 = (p000.C0394ig) r5
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r9 = r4.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "bottom misc flux register "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r5.invoke(r3, r9)
        L230:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r12) {
            r11 = this;
            int r0 = r11.f8997
            s62 r1 = p000.s62.f9751
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r11.f8999
            java.lang.Object r5 = r11.f8998
            switch(r0) {
                case 7: goto Ldd;
                case 8: goto La6;
                case 9: goto L11;
                default: goto Ld;
            }
        Ld:
            super.beforeHookedMethod(r12)
            return
        L11:
            r12.getClass()
            java.lang.Object[] r11 = r12.f5692
            ya2 r5 = (p000.ya2) r5
            java.lang.String r4 = (java.lang.String) r4
            if (r11 != 0) goto L1f
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8e
            goto L20
        L1f:
            r0 = r11
        L20:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8e
            r6.<init>()     // Catch: java.lang.Throwable -> L8e
            int r7 = r0.length     // Catch: java.lang.Throwable -> L8e
            r8 = r3
        L27:
            if (r8 >= r7) goto L35
            r9 = r0[r8]     // Catch: java.lang.Throwable -> L8e
            boolean r10 = r9 instanceof java.lang.Enum     // Catch: java.lang.Throwable -> L8e
            if (r10 == 0) goto L32
            r6.add(r9)     // Catch: java.lang.Throwable -> L8e
        L32:
            int r8 = r8 + 1
            goto L27
        L35:
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L3d
            goto La5
        L3d:
            java.util.Iterator r0 = r6.iterator()     // Catch: java.lang.Throwable -> L8e
        L41:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r6 == 0) goto La5
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L8e
            java.lang.Enum r6 = (java.lang.Enum) r6     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = "RECORD_COMPLETE"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L8e
            if (r6 == 0) goto L41
            if (r11 != 0) goto L5d
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8e
        L5d:
            int r0 = r11.length     // Catch: java.lang.Throwable -> L8e
            r6 = r3
        L5f:
            if (r6 >= r0) goto L7b
            r7 = r11[r6]     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L78
            ib2 r8 = p000.ib2.f4981     // Catch: java.lang.Throwable -> L8e
            java.lang.Class r8 = r7.getClass()     // Catch: java.lang.Throwable -> L8e
            bb2 r8 = p000.ib2.m2723(r8)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L73
            r8 = 1
            goto L74
        L73:
            r8 = r3
        L74:
            if (r8 == 0) goto L78
            r2 = r7
            goto L7b
        L78:
            int r6 = r6 + 1
            goto L5f
        L7b:
            if (r2 != 0) goto L7e
            goto La5
        L7e:
            ib2 r11 = p000.ib2.f4981     // Catch: java.lang.Throwable -> L8e
            r5.getClass()     // Catch: java.lang.Throwable -> L8e
            boolean r11 = p000.ib2.m2728()     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L8a
            goto L94
        L8a:
            p000.ib2.m2725(r12, r5, r2, r4)     // Catch: java.lang.Throwable -> L8e
            goto L94
        L8e:
            r11 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r11)
        L94:
            java.lang.Throwable r11 = p000.fo1.m2190(r1)
            if (r11 == 0) goto La5
            java.lang.String r12 = " 回调处理失败，已保留宿主原发送"
            java.lang.String r12 = r4.concat(r12)
            java.lang.String r0 = "re4b6c41332ef57c6"
            p000.C0888ux.m5977(r0, r12, r11)
        La5:
            return
        La6:
            r12.getClass()
            java.lang.Object[] r11 = r12.f5692
            r11.getClass()
            java.lang.Object r12 = p000.AbstractC0312g7.m2253(r3, r11)
            boolean r0 = r12 instanceof java.util.List
            if (r0 == 0) goto Lb9
            r2 = r12
            java.util.List r2 = (java.util.List) r2
        Lb9:
            if (r2 != 0) goto Lbc
            goto Ldc
        Lbc:
            c82 r12 = p000.c82.f1991
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r12 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setter:"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.util.ArrayList r12 = p000.c82.m1149(r2, r5, r12)
            if (r12 == 0) goto Ldc
            r11[r3] = r12
        Ldc:
            return
        Ldd:
            r12.getClass()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Object r11 = r12.f5691     // Catch: java.lang.Throwable -> Lfb
            if (r11 != 0) goto Le9
            goto L112
        Le9:
            yz0 r12 = p000.yz0.f12886     // Catch: java.lang.Throwable -> Lfb
            java.lang.Class r12 = r11.getClass()     // Catch: java.lang.Throwable -> Lfb
            p000.yz0.m7051(r12, r4)     // Catch: java.lang.Throwable -> Lfb
            java.util.Map r12 = p000.yz0.f12889     // Catch: java.lang.Throwable -> Lfb
            r12.getClass()     // Catch: java.lang.Throwable -> Lfb
            r12.put(r11, r5)     // Catch: java.lang.Throwable -> Lfb
            goto L101
        Lfb:
            r11 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r11)
        L101:
            java.lang.Throwable r11 = p000.fo1.m2190(r1)
            if (r11 == 0) goto L112
            java.lang.String r11 = r11.getMessage()
            java.lang.String r12 = "session pipeline callback failed: "
            java.lang.String r0 = "r1e0d2867edbb56e0"
            p000.AbstractC0602nx.m4143(r12, r11, r0)
        L112:
            return
    }
}
