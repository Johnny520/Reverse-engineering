package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class if0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f5065 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f5066 = null;

    static {
            java.lang.String r0 = "~78D771E8EDF777FCD63305F705F385C32437F8A58A06E57B236CBE52EE80690C87062CCF8375AD4388FCF0F5F78DB89E313078C0432356E4724AD1766356CFE4EE7D09AF8F5E60784E408CC10DD2631F"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9C9B975819B818F3ADA4B36E4ACA44C1601E3B314B37AE43A7B0DDBE45749DE061A534361A60B66540430C9018C112790C01FF65DFD96CB"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.if0.f5065 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.if0.f5066 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m2754(java.lang.Class r6) {
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L44
            r3 = r6[r2]
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L41
            boolean r4 = r3.isSynthetic()
            if (r4 != 0) goto L41
            java.lang.Class r4 = r3.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L41
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.Class r5 = java.lang.Boolean.TYPE
            java.lang.Class[] r5 = new java.lang.Class[]{r5}
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L41
            r0.add(r3)
        L41:
            int r2 = r2 + 1
            goto Le
        L44:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static void m2755(java.lang.ClassLoader r16) {
            r16.getClass()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.List r0 = p000.if0.f5065
            java.util.Iterator r2 = r0.iterator()
        Le:
            boolean r0 = r2.hasNext()
            java.lang.String r3 = ", "
            s62 r4 = p000.s62.f9751
            java.lang.String r6 = "r3a3868dbf7747834"
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r2.next()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            r9 = r16
            java.lang.Class r0 = p000.qe0.m4877(r9, r8)     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L2b
            goto Lb4
        L2b:
            java.lang.reflect.Field[] r10 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L59
            r10.getClass()     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L59
            r11.<init>()     // Catch: java.lang.Throwable -> L59
            int r12 = r10.length     // Catch: java.lang.Throwable -> L59
            r14 = 0
        L39:
            java.lang.Class<android.view.ViewGroup> r15 = android.view.ViewGroup.class
            if (r14 >= r12) goto L5e
            r13 = r10[r14]     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r13.getName()     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = "mLongPressSpeedView"
            boolean r5 = p000.ln0.m3626(r5, r7)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5b
            java.lang.Class r5 = r13.getType()     // Catch: java.lang.Throwable -> L59
            boolean r5 = r15.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5b
            r11.add(r13)     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r0 = move-exception
            goto Laf
        L5b:
            int r14 = r14 + 1
            goto L39
        L5e:
            boolean r5 = r11.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L97
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L59
            r0.getClass()     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L59
            r11.<init>()     // Catch: java.lang.Throwable -> L59
            int r5 = r0.length     // Catch: java.lang.Throwable -> L59
            r13 = 0
        L72:
            if (r13 >= r5) goto L97
            r7 = r0[r13]     // Catch: java.lang.Throwable -> L59
            java.lang.Class r10 = r7.getType()     // Catch: java.lang.Throwable -> L59
            boolean r10 = r15.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L59
            if (r10 == 0) goto L94
            java.lang.Class r10 = r7.getType()     // Catch: java.lang.Throwable -> L59
            r10.getClass()     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r10 = m2754(r10)     // Catch: java.lang.Throwable -> L59
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r10 != 0) goto L94
            r11.add(r7)     // Catch: java.lang.Throwable -> L59
        L94:
            int r13 = r13 + 1
            goto L72
        L97:
            java.util.Iterator r0 = r11.iterator()     // Catch: java.lang.Throwable -> L59
        L9b:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L59
            java.lang.Class r5 = r5.getType()     // Catch: java.lang.Throwable -> L59
            r1.add(r5)     // Catch: java.lang.Throwable -> L59
            goto L9b
        Laf:
            eo1 r4 = new eo1
            r4.<init>(r0)
        Lb4:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "解析宿主长按浮层失败: "
            java.lang.String r0 = p000.a12.m18(r4, r8, r3, r0)
            r5 = 4
            r7 = 0
            p000.C0888ux.m5988(r6, r0, r7, r5, r7)
            goto Le
        Lcb:
            r5 = 4
            r7 = 0
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld9
            java.lang.String r0 = "未解析到宿主长按倍速浮层，跳过提示同步"
            p000.C0888ux.m5988(r6, r0, r7, r5, r7)
            return
        Ld9:
            java.util.Iterator r1 = r1.iterator()
        Ldd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L112
            java.lang.Object r0 = r1.next()
            r2 = r0
            java.lang.Class r2 = (java.lang.Class) r2
            m2756(r2)     // Catch: java.lang.Throwable -> Lef
            r5 = r4
            goto Lf5
        Lef:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
        Lf5:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 == 0) goto L10f
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "安装浮层提示同步失败: "
            java.lang.String r0 = p000.a12.m18(r5, r2, r3, r0)
            r5 = 4
            r7 = 0
            p000.C0888ux.m5988(r6, r0, r7, r5, r7)
            goto Ldd
        L10f:
            r5 = 4
            r7 = 0
            goto Ldd
        L112:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m2756(java.lang.Class r8) {
            java.util.ArrayList r0 = m2754(r8)
            boolean r1 = r0.isEmpty()
            r2 = 4
            java.lang.String r3 = "r3a3868dbf7747834"
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = "长按倍速浮层缺少兼容状态方法: "
            java.lang.String r8 = r0.concat(r8)
            p000.C0888ux.m5988(r3, r8, r4, r2, r4)
            return
        L1c:
            java.util.Iterator r8 = r0.iterator()
        L20:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r8.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class r1 = r0.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.Class r5 = r0.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = r0.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r1 = ":"
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = "#"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = "(boolean)"
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            java.util.concurrent.ConcurrentHashMap$KeySetView r5 = p000.if0.f5066
            boolean r6 = r5.add(r1)
            if (r6 == 0) goto L20
            xq0 r6 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L79
            bt r7 = new bt     // Catch: java.lang.Throwable -> L79
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L79
            l01 r0 = r6.m6775(r0, r7)     // Catch: java.lang.Throwable -> L79
            goto L80
        L79:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L80:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 != 0) goto L90
            r6 = r0
            l01 r6 = (p000.l01) r6
            java.lang.String r6 = "宿主长按倍速提示 Hook 已安装: "
            java.lang.String r6 = r6.concat(r1)
            p000.C0888ux.m5988(r3, r6, r4, r2, r4)
        L90:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L20
            r5.remove(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "宿主长按倍速提示 Hook 安装失败: "
            java.lang.String r6 = ", "
            java.lang.String r0 = p000.a12.m18(r5, r1, r6, r0)
            p000.C0888ux.m5988(r3, r0, r4, r2, r4)
            goto L20
        Laa:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m2757(android.view.View r11, int r12) {
            boolean r0 = r11 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L97
            r0 = r11
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r2 = r0.getText()
            if (r2 == 0) goto L13
            java.lang.String r2 = r2.toString()
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 != 0) goto L18
            java.lang.String r2 = ""
        L18:
            ym1 r3 = p000.gf0.f4353
            r3 = 5
            r4 = 1
            int r3 = p000.j81.m2906(r12, r4, r3)
            ym1 r5 = p000.gf0.f4353
            r5.getClass()
            java.util.regex.Pattern r5 = r5.f12688
            java.util.regex.Matcher r5 = r5.matcher(r2)
            r5.getClass()
            ix0 r5 = p000.v71.m6032(r5, r1, r2)
            if (r5 != 0) goto L39
            java.lang.String r3 = r2.toString()
            goto L8e
        L39:
            int r6 = r2.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r8 = r1
        L43:
            xm0 r9 = r5.m2825()
            int r9 = r9.f11347
            r7.append(r2, r8, r9)
            java.util.List r8 = r5.m2824()
            gx0 r8 = (p000.gx0) r8
            java.lang.Object r8 = r8.get(r4)
            java.util.List r9 = r5.m2824()
            r10 = 2
            gx0 r9 = (p000.gx0) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r3)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            r7.append(r8)
            xm0 r8 = r5.m2825()
            int r8 = r8.f11348
            int r8 = r8 + r4
            ix0 r5 = r5.m2826()
            if (r8 >= r6) goto L85
            if (r5 != 0) goto L43
        L85:
            if (r8 >= r6) goto L8a
            r7.append(r2, r8, r6)
        L8a:
            java.lang.String r3 = r7.toString()
        L8e:
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 != 0) goto L97
            r0.setText(r3)
        L97:
            boolean r0 = r11 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lb0
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            int r0 = r11.getChildCount()
        La1:
            if (r1 >= r0) goto Lb0
            android.view.View r2 = r11.getChildAt(r1)
            r2.getClass()
            m2757(r2, r12)
            int r1 = r1 + 1
            goto La1
        Lb0:
            return
    }
}
