package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class j81 {
    /* JADX INFO: renamed from: Α */
    public static final boolean m2876(int r0, p000.C0526lv r1, p000.c50 r2, p000.ml1 r3) {
            boolean r0 = m2888(r0, r1, r2, r3)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.h62.m2446(r2)
            v40 r0 = r0.getFocusOwner()
            y40 r0 = (p000.y40) r0
            r0.m6827()
            p000.AbstractC0782s1.m5318(r2)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Β */
    public static final float m2877(p000.InterfaceC0880up r11) {
            xn0 r0 = p000.xn0.f12228
            sp r11 = r11.mo1785(r0)
            z01 r11 = (p000.z01) r11
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto Lad
            xz1 r2 = r11.f12919
            if (r2 != 0) goto La6
            android.content.Context r8 = r11.f12916
            b21 r2 = p000.dd2.f3101
            monitor-enter(r2)
            java.lang.Object r3 = r2.m695(r8)     // Catch: java.lang.Throwable -> L76
            r10 = 0
            if (r3 != 0) goto L79
            android.content.ContentResolver r4 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "animator_duration_scale"
            android.net.Uri r5 = android.provider.Settings.Global.getUriFor(r3)     // Catch: java.lang.Throwable -> L76
            r3 = -1
            r6 = 6
            wc r7 = p000.ln0.m3619(r3, r10, r6)     // Catch: java.lang.Throwable -> L76
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L76
            android.os.Handler r3 = android.os.Handler.createAsync(r3)     // Catch: java.lang.Throwable -> L76
            qq r6 = new qq     // Catch: java.lang.Throwable -> L76
            r6.<init>(r7, r3)     // Catch: java.lang.Throwable -> L76
            o21 r3 = new o21     // Catch: java.lang.Throwable -> L76
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76
            y21 r4 = new y21     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            y12 r3 = (p000.y12) r3     // Catch: java.lang.Throwable -> L76
            r4.f12428 = r3     // Catch: java.lang.Throwable -> L76
            mp r3 = new mp     // Catch: java.lang.Throwable -> L76
            o12 r5 = new o12     // Catch: java.lang.Throwable -> L76
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L76
            jr r6 = p000.AbstractC0524lt.f6767     // Catch: java.lang.Throwable -> L76
            nc0 r6 = p000.qw0.f9151     // Catch: java.lang.Throwable -> L76
            up r5 = p000.pd2.m4462(r5, r6)     // Catch: java.lang.Throwable -> L76
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L76
            b02 r5 = new b02     // Catch: java.lang.Throwable -> L76
            r5.<init>()     // Catch: java.lang.Throwable -> L76
            android.content.ContentResolver r6 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = "animator_duration_scale"
            float r1 = android.provider.Settings.Global.getFloat(r6, r7, r1)     // Catch: java.lang.Throwable -> L76
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Throwable -> L76
            pk1 r3 = p000.AbstractC0073bd.m894(r4, r3, r5, r1)     // Catch: java.lang.Throwable -> L76
            r2.m701(r8, r3)     // Catch: java.lang.Throwable -> L76
            goto L79
        L76:
            r0 = move-exception
            r11 = r0
            goto La4
        L79:
            d02 r3 = (p000.d02) r3     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)
            java.lang.Object r1 = r3.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            t91 r2 = r11.f12918
            r2.m5622(r1)
            mp r1 = r11.f12917
            if (r1 == 0) goto L9d
            oe r2 = new oe
            r4 = 2
            r2.<init>(r3, r11, r10, r4)
            r3 = 3
            xz1 r1 = p000.ln0.m3610(r1, r10, r2, r3)
            r11.f12919 = r1
            goto La6
        L9d:
            java.lang.String r11 = "MotionDurationScale scale factor requested before recomposer loop start"
            p000.C1080.m7279(r11)
            r1 = r0
            goto Lad
        La4:
            monitor-exit(r2)
            throw r11
        La6:
            t91 r11 = r11.f12918
            float r11 = r11.m5621()
            r1 = r11
        Lad:
            int r11 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r11 < 0) goto Lb2
            return r1
        Lb2:
            java.lang.String r11 = "negative scale factor"
            p000.ri1.m5099(r11)
            return r1
    }

    /* JADX INFO: renamed from: Γ */
    public static final boolean m2878(p000.ml1 r2, p000.ml1 r3, p000.ml1 r4, int r5) {
            boolean r0 = m2879(r5, r2, r4)
            if (r0 != 0) goto L7
            goto L2a
        L7:
            boolean r0 = m2879(r5, r3, r4)
            if (r0 != 0) goto Le
            goto L28
        Le:
            boolean r0 = m2897(r4, r2, r3, r5)
            if (r0 == 0) goto L15
            goto L28
        L15:
            boolean r0 = m2897(r4, r3, r2, r5)
            if (r0 == 0) goto L1c
            goto L2a
        L1c:
            long r0 = m2880(r5, r4, r2)
            long r2 = m2880(r5, r4, r3)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2a
        L28:
            r2 = 1
            return r2
        L2a:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Δ */
    public static final boolean m2879(int r4, p000.ml1 r5, p000.ml1 r6) {
            float r0 = r5.f7201
            float r1 = r5.f7203
            float r2 = r5.f7200
            float r5 = r5.f7202
            r3 = 3
            if (r4 != r3) goto L1c
            float r4 = r6.f7202
            float r6 = r6.f7200
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L17
            int r4 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r4 < 0) goto L59
        L17:
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L59
            goto L57
        L1c:
            r3 = 4
            if (r4 != r3) goto L30
            float r4 = r6.f7200
            float r6 = r6.f7202
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L2b
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L59
        L2b:
            int r4 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r4 >= 0) goto L59
            goto L57
        L30:
            r5 = 5
            if (r4 != r5) goto L44
            float r4 = r6.f7203
            float r5 = r6.f7201
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 > 0) goto L3f
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 < 0) goto L59
        L3f:
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L59
            goto L57
        L44:
            r5 = 6
            if (r4 != r5) goto L5b
            float r4 = r6.f7201
            float r5 = r6.f7203
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L53
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 > 0) goto L59
        L53:
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L59
        L57:
            r4 = 1
            return r4
        L59:
            r4 = 0
            return r4
        L5b:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: Ε */
    public static final long m2880(int r11, p000.ml1 r12, p000.ml1 r13) {
            float r0 = r13.f7201
            float r1 = r13.f7203
            float r2 = r13.f7200
            float r13 = r13.f7202
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 3
            if (r11 != r7) goto L14
            float r8 = r12.f7200
            float r8 = r8 - r13
            goto L27
        L14:
            if (r11 != r6) goto L1b
            float r8 = r12.f7202
            float r8 = r2 - r8
            goto L27
        L1b:
            if (r11 != r5) goto L21
            float r8 = r12.f7201
            float r8 = r8 - r1
            goto L27
        L21:
            if (r11 != r4) goto L61
            float r8 = r12.f7203
            float r8 = r0 - r8
        L27:
            r9 = 0
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 >= 0) goto L2d
            r8 = r9
        L2d:
            long r8 = (long) r8
            r10 = 2
            if (r11 != r7) goto L32
            goto L34
        L32:
            if (r11 != r6) goto L41
        L34:
            float r11 = r12.f7201
            float r12 = r12.f7203
            float r12 = r12 - r11
            float r13 = (float) r10
            float r12 = r12 / r13
            float r12 = r12 + r11
            float r1 = r1 - r0
            float r1 = r1 / r13
            float r1 = r1 + r0
            float r12 = r12 - r1
            goto L52
        L41:
            if (r11 != r5) goto L44
            goto L46
        L44:
            if (r11 != r4) goto L5b
        L46:
            float r11 = r12.f7200
            float r12 = r12.f7202
            float r12 = r12 - r11
            float r0 = (float) r10
            float r12 = r12 / r0
            float r12 = r12 + r11
            float r13 = r13 - r2
            float r13 = r13 / r0
            float r13 = r13 + r2
            float r12 = r12 - r13
        L52:
            long r11 = (long) r12
            r13 = 13
            long r0 = (long) r13
            long r0 = r0 * r8
            long r0 = r0 * r8
            long r11 = r11 * r11
            long r11 = r11 + r0
            return r11
        L5b:
            p000.C1080.m7279(r3)
            r11 = 0
            return r11
        L61:
            p000.C1080.m7279(r3)
            r11 = 0
            return r11
    }

    /* JADX INFO: renamed from: Ζ */
    public static boolean m2881(java.lang.reflect.Method r10, p000.a80 r11) {
            java.lang.Class r0 = r10.getDeclaringClass()
            boolean r0 = r0.isInterface()
            r1 = 0
            if (r0 == 0) goto Ld
            goto Lb2
        Ld:
            int r0 = r10.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto Lb2
            int r0 = r10.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isNative(r0)
            if (r0 == 0) goto L23
            goto Lb2
        L23:
            java.lang.Class r0 = r10.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto Lb2
            java.lang.Class[] r0 = r10.getParameterTypes()
            int r0 = r0.length
            r2 = 2
            if (r2 > r0) goto Lb2
            r2 = 5
            if (r0 >= r2) goto Lb2
            java.lang.Class[] r0 = r10.getParameterTypes()
            r0.getClass()
            int r2 = r0.length
            r3 = r1
        L43:
            if (r3 >= r2) goto Lb2
            r4 = r0[r3]
            r4.getClass()
            boolean r5 = r4.isEnum()
            if (r5 != 0) goto L51
            goto Laf
        L51:
            java.lang.Object[] r4 = r4.getEnumConstants()
            if (r4 != 0) goto L59
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L59:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r4.length
            r7 = r1
        L60:
            if (r7 >= r6) goto L6e
            r8 = r4[r7]
            boolean r9 = r8 instanceof java.lang.Enum
            if (r9 == 0) goto L6b
            r5.add(r8)
        L6b:
            int r7 = r7 + 1
            goto L60
        L6e:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L75
            goto Laf
        L75:
            java.util.Iterator r4 = r5.iterator()
        L79:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Laf
            java.lang.Object r5 = r4.next()
            java.lang.Enum r5 = (java.lang.Enum) r5
            java.lang.String r5 = r5.name()
            java.lang.String r6 = "RECORD_COMPLETE"
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L79
            java.lang.Class[] r10 = r10.getParameterTypes()
            r10.getClass()
            int r0 = r10.length
            r2 = r1
        L9a:
            if (r2 >= r0) goto Lb2
            r3 = r10[r2]
            java.lang.Object r3 = r11.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lac
            r10 = 1
            return r10
        Lac:
            int r2 = r2 + 1
            goto L9a
        Laf:
            int r3 = r3 + 1
            goto L43
        Lb2:
            return r1
    }

    /* JADX INFO: renamed from: Η */
    public static p000.x91 m2882(java.lang.Object r2) {
            xn0 r0 = p000.xn0.f12220
            x91 r1 = new x91
            r1.<init>(r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: Θ */
    public static java.util.List m2883(java.lang.String r7) {
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "["
            r1 = 0
            boolean r0 = p000.x02.m6485(r7, r0, r1)
            if (r0 == 0) goto L105
            java.lang.String r0 = "]"
            boolean r0 = p000.x02.m6479(r7, r0, r1)
            if (r0 != 0) goto L1b
            goto L105
        L1b:
            int r0 = r7.length()
            r2 = 1
            int r0 = r0 - r2
            java.lang.String r7 = r7.substring(r2, r0)
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            boolean r0 = p000.q02.m4671(r7)
            if (r0 == 0) goto L36
            jz r7 = p000.C0450jz.f5672
            return r7
        L36:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L3b:
            int r2 = r7.length()
            if (r1 >= r2) goto L104
        L41:
            int r2 = r7.length()
            if (r1 >= r2) goto L54
            char r2 = r7.charAt(r1)
            boolean r2 = p000.jx0.m3020(r2)
            if (r2 == 0) goto L54
            int r1 = r1 + 1
            goto L41
        L54:
            int r2 = r7.length()
            if (r1 >= r2) goto L105
            char r2 = r7.charAt(r1)
            r3 = 34
            if (r2 == r3) goto L64
            goto L105
        L64:
            int r1 = r1 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L6b:
            int r4 = r7.length()
            if (r1 >= r4) goto Ld7
            int r4 = r1 + 1
            char r5 = r7.charAt(r1)
            if (r5 == r3) goto Ld6
            r6 = 92
            if (r5 != r6) goto Ld1
            int r6 = r7.length()
            if (r4 >= r6) goto Ld1
            int r5 = r1 + 2
            char r4 = r7.charAt(r4)
            r6 = 98
            if (r4 == r6) goto Lca
            r6 = 102(0x66, float:1.43E-43)
            if (r4 == r6) goto Lc7
            r6 = 110(0x6e, float:1.54E-43)
            if (r4 == r6) goto Lc4
            r6 = 114(0x72, float:1.6E-43)
            if (r4 == r6) goto Lc1
            r6 = 116(0x74, float:1.63E-43)
            if (r4 == r6) goto Lbe
            r6 = 117(0x75, float:1.64E-43)
            if (r4 == r6) goto La2
            goto Lcc
        La2:
            int r1 = r1 + 6
            int r4 = r7.length()
            if (r1 <= r4) goto Lab
            goto L105
        Lab:
            java.lang.String r4 = r7.substring(r5, r1)
            r5 = 16
            java.lang.Integer r4 = p000.x02.m6487(r4, r5)
            if (r4 == 0) goto L105
            int r4 = r4.intValue()
            char r4 = (char) r4
            r5 = r1
            goto Lcc
        Lbe:
            r4 = 9
            goto Lcc
        Lc1:
            r4 = 13
            goto Lcc
        Lc4:
            r4 = 10
            goto Lcc
        Lc7:
            r4 = 12
            goto Lcc
        Lca:
            r4 = 8
        Lcc:
            r2.append(r4)
            r1 = r5
            goto L6b
        Ld1:
            r2.append(r5)
            r1 = r4
            goto L6b
        Ld6:
            r1 = r4
        Ld7:
            java.lang.String r2 = r2.toString()
            r0.add(r2)
        Lde:
            int r2 = r7.length()
            if (r1 >= r2) goto Lf1
            char r2 = r7.charAt(r1)
            boolean r2 = p000.jx0.m3020(r2)
            if (r2 == 0) goto Lf1
            int r1 = r1 + 1
            goto Lde
        Lf1:
            int r2 = r7.length()
            if (r1 >= r2) goto L104
            char r2 = r7.charAt(r1)
            r3 = 44
            if (r2 == r3) goto L100
            goto L105
        L100:
            int r1 = r1 + 1
            goto L3b
        L104:
            return r0
        L105:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: Ι */
    public static final long m2884(p000.ai1 r4, boolean r5) {
            long r0 = r4.f265
            long r2 = r4.f261
            long r0 = p000.o41.m4204(r2, r0)
            if (r5 != 0) goto L13
            boolean r4 = r4.m170()
            if (r4 == 0) goto L13
            r4 = 0
            return r4
        L13:
            return r0
    }

    /* JADX INFO: renamed from: Κ */
    public static final p000.g21 m2885(java.lang.Object r2, p000.v80 r3) {
            java.lang.Object r0 = r3.m6073()
            i2 r1 = p000.C0730qn.f9051
            if (r0 != r1) goto Lf
            x91 r0 = m2882(r2)
            r3.m6115(r0)
        Lf:
            g21 r0 = (p000.g21) r0
            r0.setValue(r2)
            return r0
    }

    /* JADX INFO: renamed from: Λ */
    public static p000.eb1 m2886(java.lang.ClassLoader r0, java.lang.String r1, java.lang.String r2, java.util.Map r3, java.util.Map r4, java.util.Map r5) {
            rf1 r0 = p000.xn0.m6754(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0.m5085()
            if (r1 != 0) goto L16
            java.lang.Throwable r0 = r0.f9363
            if (r0 != 0) goto L15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "营地初始化宿主请求失败"
            r0.<init>(r1)
        L15:
            throw r0
        L16:
            java.lang.Object r0 = r0.f9362
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L9d
            java.lang.String r1 = "data"
            java.lang.Object r1 = r0.get(r1)
            boolean r2 = r1 instanceof java.util.Map
            r3 = 0
            if (r2 == 0) goto L2a
            java.util.Map r1 = (java.util.Map) r1
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 == 0) goto L32
            zw0 r1 = m2891(r1)
            goto L33
        L32:
            r1 = r3
        L33:
            if (r1 != 0) goto L37
            kz r1 = p000.C0493kz.f6332
        L37:
            java.lang.String r2 = "response"
            java.lang.Object r2 = r1.get(r2)
            org.json.JSONObject r2 = m2890(r2)
            if (r2 != 0) goto L54
            java.lang.String r2 = "rawResponse"
            java.lang.Object r2 = r1.get(r2)
            org.json.JSONObject r2 = m2890(r2)
            if (r2 != 0) goto L54
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L54:
            eb1 r4 = new eb1
            java.lang.String r5 = "code"
            java.lang.Object r0 = r0.get(r5)
            boolean r5 = r0 instanceof java.lang.Number
            if (r5 == 0) goto L67
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L79
        L67:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r5)
            if (r0 == 0) goto L78
            int r0 = r0.intValue()
            goto L79
        L78:
            r0 = -1
        L79:
            java.lang.String r5 = "httpCode"
            java.lang.Object r1 = r1.get(r5)
            boolean r5 = r1 instanceof java.lang.Number
            if (r5 == 0) goto L8e
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            goto L99
        L8e:
            if (r1 != 0) goto L91
            goto L99
        L91:
            java.lang.String r1 = r1.toString()
            java.lang.Integer r3 = p000.x02.m6486(r1)
        L99:
            r4.<init>(r0, r3, r2)
            return r4
        L9d:
            java.lang.String r0 = "营地初始化 Bridge 结果为空"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Μ */
    public static final p000.w32 m2887(p000.w32 r27, p000.np0 r28) {
            r0 = r27
            w32 r1 = new w32
            ux1 r2 = r0.f11556
            f32 r3 = p000.vx1.f11475
            f32 r3 = r2.f10996
            xn0 r4 = p000.xn0.f12221
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L14
        L12:
            r5 = r3
            goto L17
        L14:
            f32 r3 = p000.vx1.f11475
            goto L12
        L17:
            long r3 = r2.f10997
            z32[] r6 = p000.y32.f12440
            r23 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r6 = r3 & r23
            r25 = 0
            int r6 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r6 != 0) goto L2a
            long r3 = p000.vx1.f11472
        L2a:
            r6 = r3
            d60 r3 = r2.f10998
            if (r3 != 0) goto L31
            d60 r3 = p000.d60.f2921
        L31:
            r8 = r3
            b60 r3 = r2.f10999
            if (r3 == 0) goto L39
            int r3 = r3.f1499
            goto L3a
        L39:
            r3 = 0
        L3a:
            b60 r9 = new b60
            r9.<init>(r3)
            c60 r3 = r2.f11000
            if (r3 == 0) goto L46
            int r3 = r3.f1968
            goto L49
        L46:
            r3 = 65535(0xffff, float:9.1834E-41)
        L49:
            c60 r10 = new c60
            r10.<init>(r3)
            br r3 = r2.f11001
            if (r3 != 0) goto L54
            br r3 = p000.C0087br.f1817
        L54:
            r11 = r3
            java.lang.String r3 = r2.f11002
            if (r3 != 0) goto L5b
            java.lang.String r3 = ""
        L5b:
            r12 = r3
            long r3 = r2.f11003
            long r13 = r3 & r23
            int r13 = (r13 > r25 ? 1 : (r13 == r25 ? 0 : -1))
            if (r13 != 0) goto L66
            long r3 = p000.vx1.f11473
        L66:
            r13 = r3
            r8 r3 = r2.f11004
            r4 = 0
            if (r3 == 0) goto L6f
            float r3 = r3.f9286
            goto L70
        L6f:
            r3 = r4
        L70:
            boolean r15 = java.lang.Float.isNaN(r3)
            if (r15 == 0) goto L77
            goto L78
        L77:
            r4 = r3
        L78:
            r8 r15 = new r8
            r15.<init>(r4)
            g32 r3 = r2.f11005
            if (r3 != 0) goto L83
            g32 r3 = p000.g32.f4224
        L83:
            r16 = r3
            av0 r3 = r2.f11006
            if (r3 != 0) goto L8f
            av0 r3 = p000.av0.f1319
            av0 r3 = p000.ln0.m3602()
        L8f:
            r17 = r3
            long r3 = r2.f11007
            r18 = 16
            int r18 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r18 == 0) goto L9c
        L99:
            r18 = r3
            goto L9f
        L9c:
            long r3 = p000.vx1.f11474
            goto L99
        L9f:
            c32 r3 = r2.f11008
            if (r3 != 0) goto La5
            c32 r3 = p000.c32.f1958
        La5:
            r20 = r3
            fv1 r3 = r2.f11009
            if (r3 != 0) goto Lad
            fv1 r3 = p000.fv1.f4142
        Lad:
            r21 = r3
            kn0 r2 = r2.f11010
            if (r2 != 0) goto Lb5
            t30 r2 = p000.t30.f10165
        Lb5:
            r22 = r2
            ux1 r4 = new ux1
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22)
            r91 r2 = r0.f11557
            int r3 = p000.s91.f9774
            r91 r5 = new r91
            int r3 = r2.f9301
            r6 = 5
            if (r3 != 0) goto Lc8
            r3 = r6
        Lc8:
            int r7 = r2.f9302
            r8 = 3
            r9 = 0
            r10 = 1
            if (r7 != r8) goto Ldf
            int r7 = r28.ordinal()
            if (r7 == 0) goto Ldd
            if (r7 != r10) goto Ld9
        Ld7:
            r7 = r6
            goto Lf0
        Ld9:
            p000.C1080.m7272()
            return r9
        Ldd:
            r6 = 4
            goto Ld7
        Ldf:
            if (r7 != 0) goto Lf0
            int r6 = r28.ordinal()
            if (r6 == 0) goto Lef
            if (r6 != r10) goto Leb
            r6 = 2
            goto Ld7
        Leb:
            p000.C1080.m7272()
            return r9
        Lef:
            r7 = r10
        Lf0:
            long r8 = r2.f9303
            long r11 = r8 & r23
            int r6 = (r11 > r25 ? 1 : (r11 == r25 ? 0 : -1))
            if (r6 != 0) goto Lfa
            long r8 = p000.s91.f9773
        Lfa:
            h32 r6 = r2.f9304
            if (r6 != 0) goto L100
            h32 r6 = p000.h32.f4565
        L100:
            kh1 r11 = r2.f9305
            wr0 r12 = r2.f9306
            int r13 = r2.f9307
            if (r13 != 0) goto L10a
            int r13 = p000.rr0.f9469
        L10a:
            int r14 = r2.f9308
            if (r14 != 0) goto L10f
            r14 = r10
        L10f:
            q32 r2 = r2.f9309
            if (r2 != 0) goto L115
            q32 r2 = p000.q32.f8846
        L115:
            r15 = r2
            r10 = r6
            r6 = r3
            r5.<init>(r6, r7, r8, r10, r11, r12, r13, r14, r15)
            nh1 r0 = r0.f11558
            r1.<init>(r4, r5, r0)
            return r1
    }

    /* JADX INFO: renamed from: Ν */
    public static final boolean m2888(int r10, p000.C0526lv r11, p000.c50 r12, p000.ml1 r13) {
            k21 r0 = new k21
            r1 = 16
            c50[] r2 = new p000.c50[r1]
            r0.<init>(r2)
            q01 r2 = r12.f8771
            boolean r2 = r2.f8784
            if (r2 != 0) goto L14
            java.lang.String r2 = "visitChildren called on an unattached node"
            p000.am0.m178(r2)
        L14:
            k21 r2 = new k21
            q01[] r3 = new p000.q01[r1]
            r2.<init>(r3)
            q01 r12 = r12.f8771
            q01 r3 = r12.f8776
            if (r3 != 0) goto L25
            p000.h62.m2386(r2, r12)
            goto L28
        L25:
            r2.m3127(r3)
        L28:
            int r12 = r2.f5718
            r3 = 1
            r4 = 0
            if (r12 == 0) goto L98
            int r12 = r12 + (-1)
            java.lang.Object r12 = r2.m3136(r12)
            q01 r12 = (p000.q01) r12
            int r5 = r12.f8774
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L40
            p000.h62.m2386(r2, r12)
            goto L28
        L40:
            if (r12 == 0) goto L28
            int r5 = r12.f8773
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L95
            r5 = 0
            r6 = r5
        L4a:
            if (r12 == 0) goto L28
            boolean r7 = r12 instanceof p000.c50
            if (r7 == 0) goto L5a
            c50 r12 = (p000.c50) r12
            boolean r7 = r12.f8784
            if (r7 == 0) goto L90
            r0.m3127(r12)
            goto L90
        L5a:
            int r7 = r12.f8773
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L90
            boolean r7 = r12 instanceof p000.C1014ya
            if (r7 == 0) goto L90
            r7 = r12
            ya r7 = (p000.C1014ya) r7
            q01 r7 = r7.f12512
            r8 = r4
        L6a:
            if (r7 == 0) goto L8d
            int r9 = r7.f8773
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L8a
            int r8 = r8 + 1
            if (r8 != r3) goto L78
            r12 = r7
            goto L8a
        L78:
            if (r6 != 0) goto L81
            k21 r6 = new k21
            q01[] r9 = new p000.q01[r1]
            r6.<init>(r9)
        L81:
            if (r12 == 0) goto L87
            r6.m3127(r12)
            r12 = r5
        L87:
            r6.m3127(r7)
        L8a:
            q01 r7 = r7.f8776
            goto L6a
        L8d:
            if (r8 != r3) goto L90
            goto L4a
        L90:
            q01 r12 = p000.h62.m2387(r6)
            goto L4a
        L95:
            q01 r12 = r12.f8776
            goto L40
        L98:
            int r12 = r0.f5718
            if (r12 == 0) goto Lc1
            c50 r12 = m2917(r0, r13, r10)
            if (r12 != 0) goto La3
            goto Lc1
        La3:
            z40 r1 = r12.m1135()
            boolean r1 = r1.f12958
            if (r1 == 0) goto Lb6
            java.lang.Object r10 = r11.invoke(r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        Lb6:
            boolean r1 = m2876(r10, r11, r12, r13)
            if (r1 == 0) goto Lbd
            return r3
        Lbd:
            r0.m3135(r12)
            goto L98
        Lc1:
            return r4
    }

    /* JADX INFO: renamed from: Ξ */
    public static p000.vm0 m2889(int r2, p000.xm0 r3) {
            r3.getClass()
            if (r2 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L1e
            int r0 = r3.f11347
            int r1 = r3.f11348
            int r3 = r3.f11349
            if (r3 <= 0) goto L17
            goto L18
        L17:
            int r2 = -r2
        L18:
            vm0 r3 = new vm0
            r3.<init>(r0, r1, r2)
            return r3
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Step must be positive, was: "
            r3.<init>(r0)
            r3.append(r1)
            r0 = 46
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: Ο */
    public static org.json.JSONObject m2890(java.lang.Object r2) {
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 == 0) goto L7
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            return r2
        L7:
            boolean r0 = r2 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L27
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L18
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L18
            zw0 r2 = m2891(r2)     // Catch: java.lang.Throwable -> L18
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L18
            goto L1e
        L18:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
        L1e:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L23
            goto L24
        L23:
            r1 = r0
        L24:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            goto L41
        L27:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L41
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L33
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L33
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33
            goto L39
        L33:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
        L39:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L3e
            goto L3f
        L3e:
            r1 = r0
        L3f:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L41:
            return r1
    }

    /* JADX INFO: renamed from: Π */
    public static p000.zw0 m2891(java.util.Map r3) {
            zw0 r0 = new zw0
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            if (r2 == 0) goto Ld
            java.lang.String r2 = r2.toString()
            r0.put(r2, r1)
            goto Ld
        L2b:
            zw0 r3 = r0.m7241()
            return r3
    }

    /* JADX INFO: renamed from: Ρ */
    public static final java.lang.Boolean m2892(int r6, p000.C0526lv r7, p000.c50 r8, p000.ml1 r9) {
            b50 r0 = r8.m1137()
            int r0 = r0.ordinal()
            if (r0 == 0) goto La8
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L3b
            if (r0 == r2) goto La8
            if (r0 != r1) goto L36
            z40 r0 = r8.m1135()
            boolean r0 = r0.f12958
            if (r0 == 0) goto L22
            java.lang.Object r6 = r7.invoke(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            return r6
        L22:
            if (r9 != 0) goto L2d
            boolean r6 = m2918(r8, r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L2d:
            boolean r6 = m2888(r6, r7, r8, r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L36:
            p000.C1080.m7272()
            r6 = 0
            return r6
        L3b:
            c50 r0 = p000.ln0.m3598(r8)
            java.lang.String r4 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto La3
            b50 r5 = r0.m1137()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L94
            if (r5 == r3) goto L5d
            if (r5 == r2) goto L94
            if (r5 == r1) goto L58
            p000.C1080.m7272()
            r6 = 0
            return r6
        L58:
            p000.C1080.m7279(r4)
            r6 = 0
            return r6
        L5d:
            java.lang.Boolean r1 = m2892(r6, r7, r0, r9)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = p000.ln0.m3626(r1, r2)
            if (r2 != 0) goto L6a
            return r1
        L6a:
            if (r9 != 0) goto L8b
            b50 r9 = r0.m1137()
            b50 r1 = p000.b50.f1477
            if (r9 != r1) goto L84
            c50 r9 = p000.ln0.m3641(r0)
            if (r9 == 0) goto L7f
            ml1 r9 = p000.ln0.m3597(r9)
            goto L8b
        L7f:
            p000.C1080.m7279(r4)
            r6 = 0
            return r6
        L84:
            java.lang.String r6 = "Searching for active node in inactive hierarchy"
            p000.C1080.m7279(r6)
            r6 = 0
            return r6
        L8b:
            boolean r6 = m2876(r6, r7, r8, r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L94:
            if (r9 != 0) goto L9a
            ml1 r9 = p000.ln0.m3597(r0)
        L9a:
            boolean r6 = m2876(r6, r7, r8, r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        La3:
            p000.C1080.m7279(r4)
            r6 = 0
            return r6
        La8:
            boolean r6 = m2918(r8, r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
    }

    /* JADX INFO: renamed from: Σ */
    public static p000.xm0 m2893(int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 > r0) goto L9
            xm0 r2 = p000.xm0.f12213
            xm0 r2 = p000.xm0.f12213
            return r2
        L9:
            xm0 r0 = new xm0
            r1 = 1
            int r3 = r3 - r1
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: Τ */
    public static final void m2894(p000.C0895v3 r5, p000.C0970x3 r6) {
            x91 r0 = r5.f11082
            java.lang.Object r0 = r0.getValue()
            x91 r1 = r6.f12020
            r1.setValue(r0)
            c4 r0 = r6.f12021
            c4 r1 = r5.f11083
            int r2 = r0.mo28()
            r3 = 0
        L14:
            if (r3 >= r2) goto L20
            float r4 = r1.mo27(r3)
            r0.mo31(r3, r4)
            int r3 = r3 + 1
            goto L14
        L20:
            long r0 = r5.f11085
            r6.f12023 = r0
            long r0 = r5.f11084
            r6.f12022 = r0
            x91 r5 = r5.f11086
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6.f12024 = r5
            return
    }

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object m2895(p000.C0970x3 r21, p000.s22 r22, long r23, p000.C0535m3 r25, p000.AbstractC0695pp r26) {
            r3 = r22
            r0 = r26
            boolean r1 = r0 instanceof p000.x12
            if (r1 == 0) goto L18
            r1 = r0
            x12 r1 = (p000.x12) r1
            int r2 = r1.f11998
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.f11998 = r2
        L16:
            r8 = r1
            goto L1e
        L18:
            x12 r1 = new x12
            r1.<init>(r0)
            goto L16
        L1e:
            up r0 = r8.f8639
            java.lang.Object r1 = r8.f11997
            int r2 = r8.f11998
            r9 = 2
            r10 = 1
            cq r11 = p000.EnumC0184cq.f2716
            if (r2 == 0) goto L4d
            if (r2 == r10) goto L44
            if (r2 != r9) goto L3d
            um1 r2 = r8.f11996
            a80 r0 = r8.f11995
            s22 r3 = r8.f11994
            x3 r4 = r8.f11993
        L36:
            p000.i81.m2649(r1)     // Catch: java.util.concurrent.CancellationException -> L3a
            goto L8f
        L3a:
            r0 = move-exception
            goto L12b
        L3d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L44:
            um1 r2 = r8.f11996
            a80 r0 = r8.f11995
            s22 r3 = r8.f11994
            x3 r4 = r8.f11993
            goto L36
        L4d:
            p000.i81.m2649(r1)
            r1 = 0
            java.lang.Object r13 = r3.m5357(r1)
            c4 r14 = r3.m5358(r1)
            um1 r1 = new um1
            r1.<init>()
            r4 = -9223372036854775808
            int r2 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r2 != 0) goto L9d
            r0.getClass()     // Catch: java.util.concurrent.CancellationException -> L99
            float r6 = m2877(r0)     // Catch: java.util.concurrent.CancellationException -> L99
            u12 r0 = new u12     // Catch: java.util.concurrent.CancellationException -> L99
            r5 = r21
            r7 = r25
            r2 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L96
            r7 = r1
            r8.f11993 = r5     // Catch: java.util.concurrent.CancellationException -> L91
            r8.f11994 = r3     // Catch: java.util.concurrent.CancellationException -> L91
            r6 = r25
            r8.f11995 = r6     // Catch: java.util.concurrent.CancellationException -> L91
            r8.f11996 = r7     // Catch: java.util.concurrent.CancellationException -> L91
            r8.f11998 = r10     // Catch: java.util.concurrent.CancellationException -> L91
            java.lang.Object r0 = m2900(r3, r0, r8)     // Catch: java.util.concurrent.CancellationException -> L91
            if (r0 != r11) goto L8c
            goto L119
        L8c:
            r4 = r5
            r0 = r6
            r2 = r7
        L8f:
            r1 = r2
            goto Ld0
        L91:
            r0 = move-exception
        L92:
            r4 = r5
        L93:
            r2 = r7
            goto L12b
        L96:
            r0 = move-exception
        L97:
            r7 = r1
            goto L92
        L99:
            r0 = move-exception
            r5 = r21
            goto L97
        L9d:
            r5 = r21
            r6 = r25
            r7 = r1
            v3 r12 = new v3     // Catch: java.util.concurrent.CancellationException -> L126
            java.lang.Object r1 = r3.f9693     // Catch: java.util.concurrent.CancellationException -> L126
            v12 r2 = new v12     // Catch: java.util.concurrent.CancellationException -> L126
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.util.concurrent.CancellationException -> L126
            r18 = r23
            r15 = r23
            r17 = r1
            r20 = r2
            r12.<init>(r13, r14, r15, r17, r18, r20)     // Catch: java.util.concurrent.CancellationException -> L126
            r0.getClass()     // Catch: java.util.concurrent.CancellationException -> L126
            float r0 = m2877(r0)     // Catch: java.util.concurrent.CancellationException -> L126
            r1 = r23
            r4 = r3
            r3 = r0
            r0 = r12
            m2913(r0, r1, r3, r4, r5, r6)     // Catch: java.util.concurrent.CancellationException -> L126
            r12 = r0
            r7.f10912 = r12     // Catch: java.util.concurrent.CancellationException -> L126
            r4 = r21
            r3 = r22
            r0 = r25
            r1 = r7
        Ld0:
            java.lang.Object r2 = r1.f10912     // Catch: java.util.concurrent.CancellationException -> L120
            r2.getClass()     // Catch: java.util.concurrent.CancellationException -> L120
            v3 r2 = (p000.C0895v3) r2     // Catch: java.util.concurrent.CancellationException -> L120
            x91 r2 = r2.f11086     // Catch: java.util.concurrent.CancellationException -> L120
            java.lang.Object r2 = r2.getValue()     // Catch: java.util.concurrent.CancellationException -> L120
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.util.concurrent.CancellationException -> L120
            boolean r2 = r2.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L120
            if (r2 == 0) goto L123
            up r2 = r8.f8639     // Catch: java.util.concurrent.CancellationException -> L120
            r2.getClass()     // Catch: java.util.concurrent.CancellationException -> L120
            float r2 = m2877(r2)     // Catch: java.util.concurrent.CancellationException -> L120
            w12 r5 = new w12     // Catch: java.util.concurrent.CancellationException -> L120
            r26 = r0
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r21 = r5
            r21.<init>(r22, r23, r24, r25, r26)     // Catch: java.util.concurrent.CancellationException -> L11a
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = r25
            r0 = r26
            r8.f11993 = r4     // Catch: java.util.concurrent.CancellationException -> L3a
            r8.f11994 = r3     // Catch: java.util.concurrent.CancellationException -> L3a
            r8.f11995 = r0     // Catch: java.util.concurrent.CancellationException -> L3a
            r8.f11996 = r2     // Catch: java.util.concurrent.CancellationException -> L3a
            r8.f11998 = r9     // Catch: java.util.concurrent.CancellationException -> L3a
            java.lang.Object r1 = m2900(r3, r1, r8)     // Catch: java.util.concurrent.CancellationException -> L3a
            if (r1 != r11) goto L8f
        L119:
            return r11
        L11a:
            r0 = move-exception
            r2 = r22
            r4 = r25
            goto L12b
        L120:
            r0 = move-exception
            r2 = r1
            goto L12b
        L123:
            s62 r0 = p000.s62.f9751
            return r0
        L126:
            r0 = move-exception
            r4 = r21
            goto L93
        L12b:
            java.lang.Object r1 = r2.f10912
            v3 r1 = (p000.C0895v3) r1
            if (r1 == 0) goto L138
            x91 r1 = r1.f11086
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.setValue(r3)
        L138:
            java.lang.Object r1 = r2.f10912
            v3 r1 = (p000.C0895v3) r1
            if (r1 == 0) goto L149
            long r1 = r1.f11084
            long r5 = r4.f12022
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L149
            r1 = 0
            r4.f12024 = r1
        L149:
            throw r0
    }

    /* JADX INFO: renamed from: β */
    public static float m2896(float[] r8) {
            int r0 = r8.length
            r1 = 6
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            r0 = 0
            r0 = r8[r0]
            r1 = 1
            r1 = r8[r1]
            r3 = 2
            r3 = r8[r3]
            r4 = 3
            r4 = r8[r4]
            r5 = 4
            r5 = r8[r5]
            r6 = 5
            r8 = r8[r6]
            float r6 = r0 * r4
            float r7 = r1 * r5
            float r7 = r7 + r6
            float r6 = r3 * r8
            float r6 = r6 + r7
            float r4 = r4 * r5
            float r6 = r6 - r4
            float r1 = r1 * r3
            float r6 = r6 - r1
            float r0 = r0 * r8
            float r6 = r6 - r0
            r8 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r8
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L2f
            float r8 = -r6
            return r8
        L2f:
            return r6
    }

    /* JADX INFO: renamed from: γ */
    public static final boolean m2897(p000.ml1 r17, p000.ml1 r18, p000.ml1 r19, int r20) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = m2898(r3, r2, r0)
            float r5 = r2.f7201
            float r6 = r2.f7203
            float r7 = r2.f7200
            float r2 = r2.f7202
            float r8 = r0.f7203
            float r9 = r0.f7201
            float r10 = r0.f7202
            float r11 = r0.f7200
            if (r4 != 0) goto L99
            boolean r0 = m2898(r3, r1, r0)
            if (r0 != 0) goto L26
            goto L99
        L26:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            r4 = 6
            r12 = 5
            r13 = 4
            r14 = 3
            if (r3 != r14) goto L33
            int r15 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r15 < 0) goto L93
            goto L47
        L33:
            if (r3 != r13) goto L3a
            int r15 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r15 > 0) goto L93
            goto L47
        L3a:
            if (r3 != r12) goto L41
            int r15 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r15 < 0) goto L93
            goto L47
        L41:
            if (r3 != r4) goto L95
            int r15 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r15 > 0) goto L93
        L47:
            if (r3 != r14) goto L4a
            goto L93
        L4a:
            if (r3 != r13) goto L4d
            goto L93
        L4d:
            if (r3 != r14) goto L54
            float r1 = r1.f7202
            float r1 = r11 - r1
            goto L66
        L54:
            if (r3 != r13) goto L5a
            float r1 = r1.f7200
            float r1 = r1 - r10
            goto L66
        L5a:
            if (r3 != r12) goto L61
            float r1 = r1.f7203
            float r1 = r9 - r1
            goto L66
        L61:
            if (r3 != r4) goto L8f
            float r1 = r1.f7201
            float r1 = r1 - r8
        L66:
            r15 = 0
            int r16 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r16 >= 0) goto L6c
            r1 = r15
        L6c:
            if (r3 != r14) goto L70
            float r11 = r11 - r7
            goto L7e
        L70:
            if (r3 != r13) goto L75
            float r11 = r2 - r10
            goto L7e
        L75:
            if (r3 != r12) goto L7a
            float r11 = r9 - r5
            goto L7e
        L7a:
            if (r3 != r4) goto L8a
            float r11 = r6 - r8
        L7e:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L85
            r11 = r0
        L85:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L99
            goto L93
        L8a:
            p000.C1080.m7279(r0)
        L8d:
            r0 = 0
            return r0
        L8f:
            p000.C1080.m7279(r0)
            goto L8d
        L93:
            r0 = 1
            return r0
        L95:
            p000.C1080.m7279(r0)
            goto L8d
        L99:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static final boolean m2898(int r1, p000.ml1 r2, p000.ml1 r3) {
            r0 = 3
            if (r1 != r0) goto L4
            goto L7
        L4:
            r0 = 4
            if (r1 != r0) goto L18
        L7:
            float r1 = r2.f7203
            float r0 = r3.f7201
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L31
            float r1 = r2.f7201
            float r2 = r3.f7203
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L31
            goto L2f
        L18:
            r0 = 5
            if (r1 != r0) goto L1c
            goto L1f
        L1c:
            r0 = 6
            if (r1 != r0) goto L33
        L1f:
            float r1 = r2.f7202
            float r0 = r3.f7200
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L31
            float r1 = r2.f7200
            float r2 = r3.f7202
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L31
        L2f:
            r1 = 1
            return r1
        L31:
            r1 = 0
            return r1
        L33:
            java.lang.String r1 = "This function should only be used for 2-D focus search"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static void m2899(long r20, p000.C0793sc r22, int r23, java.util.ArrayList r24, int r25, int r26, java.util.ArrayList r27) {
            r0 = r22
            r1 = r23
            r5 = r24
            r2 = r25
            r10 = r26
            r8 = r27
            java.lang.String r3 = "Failed requirement."
            if (r2 >= r10) goto L1ab
            r4 = r2
        L11:
            if (r4 >= r10) goto L26
            java.lang.Object r6 = r5.get(r4)
            dd r6 = (p000.C0208dd) r6
            int r6 = r6.mo1701()
            if (r6 < r1) goto L22
            int r4 = r4 + 1
            goto L11
        L22:
            p000.C1080.m7275(r3)
            return
        L26:
            java.lang.Object r3 = r24.get(r25)
            dd r3 = (p000.C0208dd) r3
            int r4 = r10 + (-1)
            java.lang.Object r4 = r5.get(r4)
            dd r4 = (p000.C0208dd) r4
            int r6 = r3.mo1701()
            if (r1 != r6) goto L53
            java.lang.Object r3 = r8.get(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r2 = r2 + 1
            java.lang.Object r6 = r5.get(r2)
            dd r6 = (p000.C0208dd) r6
            r19 = r6
            r6 = r2
            r2 = r3
            r3 = r19
            goto L55
        L53:
            r6 = r2
            r2 = -1
        L55:
            byte r7 = r3.mo1704(r1)
            byte r9 = r4.mo1704(r1)
            r12 = 4
            r13 = 2
            if (r7 == r9) goto L125
            int r3 = r6 + 1
            r4 = 1
        L64:
            if (r3 >= r10) goto L83
            int r7 = r3 + (-1)
            java.lang.Object r7 = r5.get(r7)
            dd r7 = (p000.C0208dd) r7
            byte r7 = r7.mo1704(r1)
            java.lang.Object r9 = r5.get(r3)
            dd r9 = (p000.C0208dd) r9
            byte r9 = r9.mo1704(r1)
            if (r7 == r9) goto L80
            int r4 = r4 + 1
        L80:
            int r3 = r3 + 1
            goto L64
        L83:
            long r14 = r0.f9828
            r16 = -1
            long r11 = (long) r12
            long r14 = r14 / r11
            long r14 = r14 + r20
            r17 = r11
            long r11 = (long) r13
            long r14 = r14 + r11
            int r3 = r4 * 2
            long r11 = (long) r3
            long r14 = r14 + r11
            r0.m5448(r4)
            r0.m5448(r2)
            r2 = r6
        L9a:
            if (r2 >= r10) goto Lbe
            java.lang.Object r3 = r5.get(r2)
            dd r3 = (p000.C0208dd) r3
            byte r3 = r3.mo1704(r1)
            if (r2 == r6) goto Lb6
            int r4 = r2 + (-1)
            java.lang.Object r4 = r5.get(r4)
            dd r4 = (p000.C0208dd) r4
            byte r4 = r4.mo1704(r1)
            if (r3 == r4) goto Lbb
        Lb6:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.m5448(r3)
        Lbb:
            int r2 = r2 + 1
            goto L9a
        Lbe:
            sc r4 = new sc
            r4.<init>()
            r7 = r6
        Lc4:
            if (r7 >= r10) goto L121
            java.lang.Object r2 = r5.get(r7)
            dd r2 = (p000.C0208dd) r2
            byte r2 = r2.mo1704(r1)
            int r3 = r7 + 1
            r6 = r3
        Ld3:
            if (r6 >= r10) goto Le5
            java.lang.Object r9 = r5.get(r6)
            dd r9 = (p000.C0208dd) r9
            byte r9 = r9.mo1704(r1)
            if (r2 == r9) goto Le2
            goto Le6
        Le2:
            int r6 = r6 + 1
            goto Ld3
        Le5:
            r6 = r10
        Le6:
            if (r3 != r6) goto L107
            int r2 = r1 + 1
            java.lang.Object r3 = r5.get(r7)
            dd r3 = (p000.C0208dd) r3
            int r3 = r3.mo1701()
            if (r2 != r3) goto L107
            java.lang.Object r2 = r8.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.m5448(r2)
            r9 = r8
            r2 = r14
            r8 = r6
            goto L11d
        L107:
            long r2 = r4.f9828
            long r2 = r2 / r17
            long r2 = r2 + r14
            int r2 = (int) r2
            int r2 = r2 * (-1)
            r0.m5448(r2)
            int r5 = r1 + 1
            r9 = r8
            r2 = r14
            r8 = r6
            r6 = r24
            m2899(r2, r4, r5, r6, r7, r8, r9)
            r5 = r6
        L11d:
            r14 = r2
            r7 = r8
            r8 = r9
            goto Lc4
        L121:
            r0.m5465(r4)
            return
        L125:
            r9 = r8
            r16 = -1
            int r7 = r3.mo1701()
            int r8 = r4.mo1701()
            int r7 = java.lang.Math.min(r7, r8)
            r8 = 0
            r11 = r1
        L136:
            if (r11 >= r7) goto L147
            byte r14 = r3.mo1704(r11)
            byte r15 = r4.mo1704(r11)
            if (r14 != r15) goto L147
            int r8 = r8 + 1
            int r11 = r11 + 1
            goto L136
        L147:
            long r14 = r0.f9828
            long r11 = (long) r12
            long r14 = r14 / r11
            long r14 = r14 + r20
            r17 = r11
            long r11 = (long) r13
            long r14 = r14 + r11
            long r11 = (long) r8
            long r14 = r14 + r11
            r11 = 1
            long r14 = r14 + r11
            int r4 = -r8
            r0.m5448(r4)
            r0.m5448(r2)
            int r4 = r1 + r8
        L15f:
            if (r1 >= r4) goto L16d
            byte r2 = r3.mo1704(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.m5448(r2)
            int r1 = r1 + 1
            goto L15f
        L16d:
            int r1 = r6 + 1
            if (r1 != r10) goto L191
            java.lang.Object r1 = r5.get(r6)
            dd r1 = (p000.C0208dd) r1
            int r1 = r1.mo1701()
            if (r4 != r1) goto L18b
            java.lang.Object r1 = r9.get(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.m5448(r1)
            return
        L18b:
            java.lang.String r0 = "Check failed."
            p000.C1080.m7279(r0)
            return
        L191:
            sc r3 = new sc
            r3.<init>()
            long r1 = r3.f9828
            long r1 = r1 / r17
            long r1 = r1 + r14
            int r1 = (int) r1
            int r1 = r1 * (-1)
            r0.m5448(r1)
            r8 = r9
            r7 = r10
            r1 = r14
            m2899(r1, r3, r4, r5, r6, r7, r8)
            r0.m5465(r3)
            return
        L1ab:
            p000.C1080.m7275(r3)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.Object m2900(p000.s22 r1, p000.a80 r2, p000.x12 r3) {
            n72 r1 = r1.f9691
            r1.mo4011()
            xj0 r1 = new xj0
            r0 = 11
            r1.<init>(r2, r0)
            up r2 = r3.f8639
            r2.getClass()
            k3 r2 = p000.AbstractC0782s1.m5335(r2)
            java.lang.Object r1 = r2.m3139(r1, r3)
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static final boolean m2901(p000.ai1 r1) {
            boolean r0 = r1.f266
            if (r0 != 0) goto La
            boolean r1 = r1.f262
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static final boolean m2902(p000.ai1 r1) {
            boolean r0 = r1.f266
            if (r0 == 0) goto La
            boolean r1 = r1.f262
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static long m2903(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            return r0
        L7:
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public static double m2904(double r1, double r3, double r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r2.<init>(r0)
            r2.append(r5)
            java.lang.String r5 = " is less than minimum "
            r2.append(r5)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: λ */
    public static float m2905(float r2, float r3, float r4) {
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r4
        Le:
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: μ */
    public static int m2906(int r2, int r3, int r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ν */
    public static int m2907(int r3, p000.xm0 r4) {
            int r0 = r4.f11348
            int r1 = r4.f11347
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r4 = r4.intValue()
            if (r3 >= r4) goto L1d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r3 = r3.intValue()
            return r3
        L1d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r4 = r4.intValue()
            if (r3 <= r4) goto L2f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r3 = r3.intValue()
        L2f:
            return r3
        L30:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.<init>(r1)
            r0.append(r4)
            r4 = 46
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ξ */
    public static long m2908(long r1, long r3, long r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r2.<init>(r0)
            r2.append(r5)
            java.lang.String r5 = " is less than minimum "
            r2.append(r5)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ο */
    public static final void m2909(p000.c50 r8, p000.k21 r9) {
            q01 r0 = r8.f8771
            boolean r0 = r0.f8784
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitChildren called on an unattached node"
            p000.am0.m178(r0)
        Lb:
            k21 r0 = new k21
            r1 = 16
            q01[] r2 = new p000.q01[r1]
            r0.<init>(r2)
            q01 r8 = r8.f8771
            q01 r2 = r8.f8776
            if (r2 != 0) goto L1e
            p000.h62.m2386(r0, r8)
            goto L21
        L1e:
            r0.m3127(r2)
        L21:
            int r8 = r0.f5718
            if (r8 == 0) goto La5
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.m3136(r8)
            q01 r8 = (p000.q01) r8
            int r2 = r8.f8774
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L37
            p000.h62.m2386(r0, r8)
            goto L21
        L37:
            if (r8 == 0) goto L21
            int r2 = r8.f8773
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto La2
            r2 = 0
            r3 = r2
        L41:
            if (r8 == 0) goto L21
            boolean r4 = r8 instanceof p000.c50
            if (r4 == 0) goto L66
            c50 r8 = (p000.c50) r8
            boolean r4 = r8.f8784
            if (r4 == 0) goto L9d
            yp0 r4 = p000.h62.m2445(r8)
            boolean r4 = r4.f12742
            if (r4 == 0) goto L56
            goto L9d
        L56:
            z40 r4 = r8.m1135()
            boolean r4 = r4.f12958
            if (r4 == 0) goto L62
            r9.m3127(r8)
            goto L9d
        L62:
            m2909(r8, r9)
            goto L9d
        L66:
            int r4 = r8.f8773
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9d
            boolean r4 = r8 instanceof p000.C1014ya
            if (r4 == 0) goto L9d
            r4 = r8
            ya r4 = (p000.C1014ya) r4
            q01 r4 = r4.f12512
            r5 = 0
        L76:
            r6 = 1
            if (r4 == 0) goto L9a
            int r7 = r4.f8773
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L97
            int r5 = r5 + 1
            if (r5 != r6) goto L85
            r8 = r4
            goto L97
        L85:
            if (r3 != 0) goto L8e
            k21 r3 = new k21
            q01[] r6 = new p000.q01[r1]
            r3.<init>(r6)
        L8e:
            if (r8 == 0) goto L94
            r3.m3127(r8)
            r8 = r2
        L94:
            r3.m3127(r4)
        L97:
            q01 r4 = r4.f8776
            goto L76
        L9a:
            if (r5 != r6) goto L9d
            goto L41
        L9d:
            q01 r8 = p000.h62.m2387(r3)
            goto L41
        La2:
            q01 r8 = r8.f8776
            goto L37
        La5:
            return
    }

    /* JADX INFO: renamed from: π */
    public static int m2910(p000.km1 r0, p000.AbstractC1118 r1, android.view.View r2, android.view.View r3, p000.zl1 r4, boolean r5) {
            int r4 = r4.m7175()
            if (r4 == 0) goto L30
            int r0 = r0.m3336()
            if (r0 == 0) goto L30
            if (r2 == 0) goto L30
            if (r3 != 0) goto L11
            goto L30
        L11:
            if (r5 == 0) goto L25
            int r0 = r1.mo3523(r3)
            int r2 = r1.mo3524(r2)
            int r0 = r0 - r2
            int r1 = r1.mo3530()
            int r0 = java.lang.Math.min(r1, r0)
            return r0
        L25:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            am1 r0 = (p000.am1) r0
            r0.getClass()
            r0 = 0
            throw r0
        L30:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static int m2911(p000.km1 r0, p000.AbstractC1118 r1, android.view.View r2, android.view.View r3, p000.zl1 r4, boolean r5) {
            int r4 = r4.m7175()
            if (r4 == 0) goto L29
            int r4 = r0.m3336()
            if (r4 == 0) goto L29
            if (r2 == 0) goto L29
            if (r3 != 0) goto L11
            goto L29
        L11:
            if (r5 != 0) goto L18
            int r0 = r0.m3336()
            return r0
        L18:
            r1.mo3523(r3)
            r1.mo3524(r2)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            am1 r0 = (p000.am1) r0
            r0.getClass()
            r0 = 0
            throw r0
        L29:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static final p000.k21 m2912() {
            m6 r0 = p000.gx1.f4503
            java.lang.Object r1 = r0.m3786()
            k21 r1 = (p000.k21) r1
            if (r1 != 0) goto L15
            k21 r1 = new k21
            r2 = 0
            u80[] r2 = new p000.u80[r2]
            r1.<init>(r2)
            r0.m3767(r1)
        L15:
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public static final void m2913(p000.C0895v3 r2, long r3, float r5, p000.s22 r6, p000.C0970x3 r7, p000.a80 r8) {
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            long r0 = r6.m5356()
            goto L11
        La:
            long r0 = r2.f11080
            long r0 = r3 - r0
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
        L11:
            r2.f11084 = r3
            java.lang.Object r3 = r6.m5357(r0)
            x91 r4 = r2.f11082
            r4.setValue(r3)
            c4 r3 = r6.m5358(r0)
            r2.f11083 = r3
            long r3 = r6.m5356()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L35
            long r3 = r2.f11084
            r2.f11085 = r3
            x91 r3 = r2.f11086
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.setValue(r4)
        L35:
            m2894(r2, r7)
            r8.invoke(r2)
            return
    }

    /* JADX INFO: renamed from: υ */
    public static final boolean m2914(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public static java.lang.Object m2915(java.lang.ClassLoader r6) {
            java.lang.String r1 = "POST"
            java.lang.String r2 = "https://stark-game.zijieapi.com/config/v2/load"
            java.lang.String r0 = "get_all"
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2e
            l91 r4 = new l91     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L2e
            java.util.Map r3 = p000.ex0.m1971(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "stark_app_id"
            r4 = 720263(0xafd87, float:1.009303E-39)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2e
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r0, r4)     // Catch: java.lang.Throwable -> L2e
            java.util.Map r4 = p000.ex0.m1971(r5)     // Catch: java.lang.Throwable -> L2e
            kz r5 = p000.C0493kz.f6332     // Catch: java.lang.Throwable -> L2e
            r0 = r6
            eb1 r6 = m2886(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2e
            return r6
        L2e:
            r0 = move-exception
            r6 = r0
            eo1 r0 = new eo1
            r0.<init>(r6)
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static java.lang.Object m2916(java.lang.ClassLoader r6, int r7) {
            if (r7 < 0) goto L3b
            java.lang.String r1 = "GET"
            java.lang.String r2 = "https://vassets-backend.douyin.com/room/user/pet/relation_list"
            kz r3 = p000.C0493kz.f6332     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "offset"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L43
            l91 r4 = new l91     // Catch: java.lang.Throwable -> L43
            r4.<init>(r0, r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = "count"
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L43
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L43
            r5.<init>(r7, r0)     // Catch: java.lang.Throwable -> L43
            l91[] r7 = new p000.l91[]{r4, r5}     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashMap r4 = p000.ex0.m1969(r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = "Agw-Js-Conv"
            java.lang.String r0 = "str"
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L43
            r5.<init>(r7, r0)     // Catch: java.lang.Throwable -> L43
            java.util.Map r5 = p000.ex0.m1971(r5)     // Catch: java.lang.Throwable -> L43
            r0 = r6
            eb1 r6 = m2886(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            return r6
        L3b:
            java.lang.String r6 = "offset 不能小于 0"
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L43
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L43
            throw r7     // Catch: java.lang.Throwable -> L43
        L43:
            r0 = move-exception
            r6 = r0
            eo1 r7 = new eo1
            r7.<init>(r6)
            return r7
    }

    /* JADX INFO: renamed from: ψ */
    public static final p000.c50 m2917(p000.k21 r7, p000.ml1 r8, int r9) {
            r0 = 3
            r1 = 0
            r2 = 1
            if (r9 != r0) goto L11
            float r0 = r8.f7202
            float r3 = r8.f7200
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 + r2
            ml1 r0 = r8.m3869(r0, r1)
            goto L3f
        L11:
            r0 = 4
            if (r9 != r0) goto L21
            float r0 = r8.f7202
            float r3 = r8.f7200
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 + r2
            float r0 = -r0
            ml1 r0 = r8.m3869(r0, r1)
            goto L3f
        L21:
            r0 = 5
            if (r9 != r0) goto L30
            float r0 = r8.f7203
            float r3 = r8.f7201
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 + r2
            ml1 r0 = r8.m3869(r1, r0)
            goto L3f
        L30:
            r0 = 6
            if (r9 != r0) goto L61
            float r0 = r8.f7203
            float r3 = r8.f7201
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 + r2
            float r0 = -r0
            ml1 r0 = r8.m3869(r1, r0)
        L3f:
            java.lang.Object[] r1 = r7.f5716
            int r7 = r7.f5718
            r2 = 0
            r3 = 0
        L45:
            if (r3 >= r7) goto L60
            r4 = r1[r3]
            c50 r4 = (p000.c50) r4
            boolean r5 = p000.ln0.m3609(r4)
            if (r5 == 0) goto L5d
            ml1 r5 = p000.ln0.m3597(r4)
            boolean r6 = m2878(r5, r0, r8, r9)
            if (r6 == 0) goto L5d
            r2 = r4
            r0 = r5
        L5d:
            int r3 = r3 + 1
            goto L45
        L60:
            return r2
        L61:
            java.lang.String r7 = "This function should only be used for 2-D focus search"
            p000.C1080.m7279(r7)
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: ω */
    public static final boolean m2918(p000.c50 r4, int r5, p000.a80 r6) {
            k21 r0 = new k21
            r1 = 16
            c50[] r1 = new p000.c50[r1]
            r0.<init>(r1)
            m2909(r4, r0)
            int r1 = r0.f5718
            r2 = 1
            r3 = 0
            if (r1 > r2) goto L29
            if (r1 != 0) goto L16
            r4 = 0
            goto L1a
        L16:
            java.lang.Object[] r4 = r0.f5716
            r4 = r4[r3]
        L1a:
            c50 r4 = (p000.c50) r4
            if (r4 == 0) goto L67
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L29:
            r1 = 7
            r2 = 4
            if (r5 != r1) goto L2e
            r5 = r2
        L2e:
            if (r5 != r2) goto L31
            goto L34
        L31:
            r1 = 6
            if (r5 != r1) goto L42
        L34:
            ml1 r4 = p000.ln0.m3597(r4)
            ml1 r1 = new ml1
            float r2 = r4.f7200
            float r4 = r4.f7201
            r1.<init>(r2, r4, r2, r4)
            goto L56
        L42:
            r1 = 3
            if (r5 != r1) goto L46
            goto L49
        L46:
            r1 = 5
            if (r5 != r1) goto L68
        L49:
            ml1 r4 = p000.ln0.m3597(r4)
            ml1 r1 = new ml1
            float r2 = r4.f7202
            float r4 = r4.f7203
            r1.<init>(r2, r4, r2, r4)
        L56:
            c50 r4 = m2917(r0, r1, r5)
            if (r4 == 0) goto L67
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L67:
            return r3
        L68:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
    }
}
