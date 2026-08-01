package p000;

/* JADX INFO: renamed from: tl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0839tl {

    /* JADX INFO: renamed from: α */
    public static final android.util.LruCache f10408 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.ym1 f10409 = null;

    static {
            android.util.LruCache r0 = new android.util.LruCache
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1)
            p000.C0839tl.f10408 = r0
            ym1 r0 = new ym1
            java.lang.String r1 = "tos-cn-i-[^/]+/([^~/?#]+)~tplv"
            r0.<init>(r1)
            p000.C0839tl.f10409 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object m5715(java.lang.Object r1, java.lang.reflect.Field r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L10:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L15
            goto L16
        L15:
            r0 = r1
        L16:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.reflect.Field m5716(java.lang.Class r11, java.lang.String r12) {
            java.lang.reflect.Field[] r11 = r11.getDeclaredFields()
            r11.getClass()
            int r0 = r11.length
            r1 = 0
            r2 = r1
        La:
            r3 = 0
            if (r2 >= r0) goto L53
            r4 = r11[r2]
            java.lang.annotation.Annotation[] r5 = r4.getDeclaredAnnotations()
            r5.getClass()
            int r6 = r5.length
            r7 = r1
        L18:
            if (r7 >= r6) goto L50
            r8 = r5[r7]
            wf r9 = p000.ln0.m3599(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.Class r9 = p000.ln0.m3604(r9)     // Catch: java.lang.Throwable -> L35
            java.lang.String r10 = "value"
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r9.invoke(r8, r3)     // Catch: java.lang.Throwable -> L35
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L37
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L35
            goto L3f
        L35:
            r8 = move-exception
            goto L39
        L37:
            r8 = r3
            goto L3f
        L39:
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L3f:
            boolean r9 = r8 instanceof p000.eo1
            if (r9 == 0) goto L44
            r8 = r3
        L44:
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = p000.ln0.m3626(r8, r12)
            if (r8 == 0) goto L4d
            goto L54
        L4d:
            int r7 = r7 + 1
            goto L18
        L50:
            int r2 = r2 + 1
            goto La
        L53:
            r4 = r3
        L54:
            if (r4 == 0) goto L5b
            r11 = 1
            r4.setAccessible(r11)
            r3 = r4
        L5b:
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m5717() {
            java.lang.String r0 = "comment_image_watermark_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L13:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1a
            r0 = r1
        L1a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m5718(java.lang.String r12) {
            boolean r0 = m5717()
            if (r0 != 0) goto L8
            goto L151
        L8:
            java.lang.String r0 = "watermark"
            r1 = 1
            boolean r2 = p000.q02.m4654(r12, r0, r1)
            java.lang.String r3 = "DYHelper_ImageWatermark"
            if (r2 == 0) goto L25
            java.lang.String r2 = m5719(r12)
            if (r2 == 0) goto L25
            boolean r4 = r2.equals(r12)
            if (r4 != 0) goto L25
            java.lang.String r12 = "拦截通用水印参数"
            p000.C0888ux.m5975(r3, r12)
            return r2
        L25:
            java.lang.String r2 = "douyinpic.com"
            r4 = 0
            boolean r2 = p000.q02.m4654(r12, r2, r4)
            if (r2 == 0) goto L151
            java.lang.String r2 = "tos-cn-i-"
            boolean r2 = p000.q02.m4654(r12, r2, r4)
            if (r2 == 0) goto L151
            java.lang.String r2 = "~tplv"
            boolean r2 = p000.q02.m4654(r12, r2, r4)
            if (r2 != 0) goto L40
            goto L151
        L40:
            ym1 r2 = p000.C0839tl.f10409
            r2.getClass()
            java.util.regex.Pattern r2 = r2.f12688
            java.util.regex.Matcher r2 = r2.matcher(r12)
            r2.getClass()
            ix0 r2 = p000.v71.m6032(r2, r4, r12)
            if (r2 == 0) goto L151
            hx0 r2 = r2.f5236
            fx0 r2 = r2.m2544(r1)
            if (r2 == 0) goto L151
            java.lang.String r2 = r2.f4162
            r5 = 63
            r6 = 6
            int r5 = p000.q02.m4668(r12, r5, r4, r6)
            if (r5 >= 0) goto L6a
            jz r4 = p000.C0450jz.f5672
            goto La8
        L6a:
            int r5 = r5 + r1
            r7 = 4
            r8 = 35
            int r7 = p000.q02.m4668(r12, r8, r5, r7)
            if (r7 < 0) goto L75
            goto L79
        L75:
            int r7 = r12.length()
        L79:
            java.lang.String r5 = r12.substring(r5, r7)
            char[] r7 = new char[r1]
            r8 = 38
            r7[r4] = r8
            java.util.List r4 = p000.q02.m4682(r5, r7, r4, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L90:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = p000.q02.m4671(r7)
            if (r7 != 0) goto L90
            r5.add(r6)
            goto L90
        La7:
            r4 = r5
        La8:
            boolean r5 = r4.isEmpty()
            java.lang.String r6 = "download-webp"
            android.util.LruCache r7 = p000.C0839tl.f10408
            if (r5 == 0) goto Lb4
            goto L138
        Lb4:
            java.util.Iterator r4 = r4.iterator()
        Lb8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L138
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r8 = "="
            java.lang.String r9 = ""
            java.lang.String r10 = p000.q02.m4690(r5, r8, r9)
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r11)
            r10.getClass()
            java.lang.String r5 = p000.q02.m4686(r5, r8, r9)
            java.lang.String r5 = r5.toLowerCase(r11)
            r5.getClass()
            java.lang.String r8 = "sc"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto Lee
            boolean r8 = r5.equals(r0)
            if (r8 != 0) goto L106
        Lee:
            boolean r8 = r10.equals(r0)
            if (r8 == 0) goto Lb8
            java.lang.String r8 = "1"
            java.lang.String r9 = "true"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9, r0}
            java.util.Set r8 = p000.AbstractC0312g7.m2263(r8)
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto Lb8
        L106:
            java.lang.Object r0 = r7.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p000.q02.m4654(r12, r6, r1)
            if (r1 != 0) goto L11e
            if (r0 == 0) goto L11e
            java.lang.String r12 = "拦截水印预览，替换为缓存原图: ID="
            java.lang.String r12 = r12.concat(r2)
            p000.C0888ux.m5975(r3, r12)
            return r0
        L11e:
            java.lang.String r0 = m5719(r12)
            if (r0 == 0) goto L12e
            java.lang.String r12 = "拦截水印参数，保留原链路: ID="
            java.lang.String r12 = r12.concat(r2)
            p000.C0888ux.m5975(r3, r12)
            return r0
        L12e:
            java.lang.String r0 = "缓存中未找到原图，保持原 URL: ID="
            java.lang.String r0 = r0.concat(r2)
            p000.C0888ux.m5975(r3, r0)
            return r12
        L138:
            java.lang.Object r0 = r7.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L14e
            boolean r0 = p000.q02.m4654(r0, r6, r1)
            if (r0 == 0) goto L14d
            boolean r0 = p000.q02.m4654(r12, r6, r1)
            if (r0 != 0) goto L14d
            goto L14e
        L14d:
            return r12
        L14e:
            r7.put(r2, r12)
        L151:
            return r12
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m5719(java.lang.String r13) {
            r0 = 63
            r1 = 0
            r2 = 6
            int r0 = p000.q02.m4668(r13, r0, r1, r2)
            if (r0 >= 0) goto Lc
            goto La1
        Lc:
            int r3 = r0 + 1
            r4 = 4
            r5 = 35
            int r4 = p000.q02.m4668(r13, r5, r3, r4)
            java.lang.String r0 = r13.substring(r1, r0)
            if (r4 < 0) goto L1d
            r5 = r4
            goto L21
        L1d:
            int r5 = r13.length()
        L21:
            java.lang.String r3 = r13.substring(r3, r5)
            java.lang.String r5 = ""
            if (r4 < 0) goto L2e
            java.lang.String r13 = r13.substring(r4)
            goto L2f
        L2e:
            r13 = r5
        L2f:
            r4 = 1
            char[] r6 = new char[r4]
            r7 = 38
            r6[r1] = r7
            java.util.List r2 = p000.q02.m4682(r3, r6, r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L44:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r2.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "="
            java.lang.String r10 = p000.q02.m4690(r8, r9, r5)
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r11)
            r10.getClass()
            java.lang.String r8 = p000.q02.m4686(r8, r9, r5)
            java.lang.String r8 = r8.toLowerCase(r11)
            r8.getClass()
            java.lang.String r9 = "sc"
            boolean r9 = r10.equals(r9)
            java.lang.String r11 = "watermark"
            if (r9 == 0) goto L7b
            boolean r9 = r8.equals(r11)
            if (r9 != 0) goto L93
        L7b:
            boolean r9 = r10.equals(r11)
            if (r9 == 0) goto L95
            java.lang.String r9 = "1"
            java.lang.String r10 = "true"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10, r11}
            java.util.Set r9 = p000.AbstractC0312g7.m2263(r9)
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L95
        L93:
            r8 = r4
            goto L96
        L95:
            r8 = r1
        L96:
            if (r8 == 0) goto L99
            r3 = r4
        L99:
            if (r8 != 0) goto L44
            r6.add(r7)
            goto L44
        L9f:
            if (r3 != 0) goto La3
        La1:
            r13 = 0
            return r13
        La3:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Lae
            java.lang.String r13 = r0.concat(r13)
            return r13
        Lae:
            r11 = 0
            r12 = 62
            java.lang.String r7 = "&"
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r6, r7, r8, r9, r10, r11, r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "?"
            r2.append(r0)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            return r13
    }
}
