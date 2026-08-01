package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class c30 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f1954 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f1955 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f1956 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.LinkedHashSet f1957 = null;

    static {
            java.lang.String r0 = "Follow"
            java.lang.String r1 = "Relation"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.c30.f1954 = r0
            java.lang.String r0 = "ColorRing"
            java.util.Set r0 = p000.g81.m2288(r0)
            p000.c30.f1955 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.c30.f1956 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            p000.c30.f1957 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m1124(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r0)
            goto L5
        L14:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Object m1125(java.lang.Object r7) {
            java.lang.String r0 = "getFirst"
            r1 = 0
            if (r7 != 0) goto L6
            goto L5a
        L6:
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.Throwable -> L3b
            r2.getClass()     // Catch: java.lang.Throwable -> L3b
            int r3 = r2.length     // Catch: java.lang.Throwable -> L3b
            r4 = 0
        L13:
            if (r4 >= r3) goto L2f
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L3b
            boolean r6 = p000.ln0.m3626(r6, r0)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L2c
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L3b
            r6.getClass()     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.length     // Catch: java.lang.Throwable -> L3b
            if (r6 != 0) goto L2c
            goto L30
        L2c:
            int r4 = r4 + 1
            goto L13
        L2f:
            r5 = r1
        L30:
            if (r5 == 0) goto L3b
            r2 = 1
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r7 = r5.invoke(r7, r1)     // Catch: java.lang.Throwable -> L3b
            return r7
        L3b:
            java.lang.String r2 = "first"
            java.lang.Object r7 = p000.qe0.m4879(r7, r2)     // Catch: java.lang.Throwable -> L42
            return r7
        L42:
            java.lang.String r2 = "a"
            java.lang.Object r7 = p000.qe0.m4879(r7, r2)     // Catch: java.lang.Throwable -> L49
            return r7
        L49:
            java.lang.Class<l91> r2 = p000.l91.class
            boolean r3 = r2.isInstance(r7)     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L5a
            java.lang.reflect.Method r0 = r2.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r0.invoke(r7, r1)     // Catch: java.lang.Throwable -> L5a
            return r7
        L5a:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static int m1126(java.lang.Class r16, java.lang.String r17) {
            r1 = r17
            java.lang.reflect.Method[] r2 = r16.getDeclaredMethods()
            r2.getClass()
            int r3 = r2.length
            r4 = 0
            r5 = r4
            r6 = r5
        Ld:
            r0 = 0
            java.lang.String r7 = "FeedRightControlsHide3903"
            if (r5 >= r3) goto Lfd
            r8 = r2[r5]
            r8.getClass()
            java.lang.Class<android.view.View> r9 = android.view.View.class
            java.lang.Class r10 = r8.getReturnType()
            boolean r9 = r9.isAssignableFrom(r10)
            if (r9 != 0) goto L25
            goto Lf9
        L25:
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r10 = r9.length
            r11 = 1
            java.lang.Class<android.view.ViewGroup> r12 = android.view.ViewGroup.class
            if (r10 != r11) goto L38
            r10 = r9[r4]
            boolean r10 = r12.isAssignableFrom(r10)
            if (r10 == 0) goto L38
            goto L52
        L38:
            int r10 = r9.length
            r13 = r4
        L3a:
            if (r13 >= r10) goto Lf9
            r14 = r9[r13]
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            boolean r14 = r15.isAssignableFrom(r14)
            if (r14 == 0) goto Lf5
            int r10 = r9.length
            r13 = r4
        L48:
            if (r13 >= r10) goto Lf9
            r14 = r9[r13]
            boolean r14 = r12.isAssignableFrom(r14)
            if (r14 == 0) goto Lf1
        L52:
            java.lang.String r9 = "viewFactory:"
            java.lang.String r9 = r9.concat(r1)
            java.lang.Class r10 = r8.getDeclaringClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r12 = r8.getName()
            java.lang.Class[] r13 = r8.getParameterTypes()
            r13.getClass()
            s20 r14 = new s20
            r15 = 12
            r14.<init>(r15)
            r15 = 31
            java.lang.String r0 = p000.AbstractC0312g7.m2256(r13, r0, r0, r14, r15)
            java.lang.Class r13 = r8.getReturnType()
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = "#"
            java.lang.String r15 = "("
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r10, r14, r12, r15, r0)
            java.lang.String r10 = "):"
            r0.append(r10)
            r0.append(r13)
            java.lang.String r10 = ":"
            r0.append(r10)
            r0.append(r9)
            java.lang.String r10 = r0.toString()
            java.util.LinkedHashSet r12 = p000.c30.f1957
            boolean r0 = r12.add(r10)
            if (r0 != 0) goto La6
            r0 = r4
            goto Lec
        La6:
            r8.setAccessible(r11)     // Catch: java.lang.Throwable -> Lb7
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lb7
            qg r11 = new qg     // Catch: java.lang.Throwable -> Lb7
            r13 = 4
            r11.<init>(r13, r1, r8)     // Catch: java.lang.Throwable -> Lb7
            r0.m6775(r8, r11)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lb7
            goto Lbe
        Lb7:
            r0 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        Lbe:
            java.lang.Throwable r8 = p000.fo1.m2190(r0)
            if (r8 == 0) goto Ldf
            r12.remove(r10)
            java.lang.String r11 = r8.getMessage()
            java.lang.String r12 = " method="
            java.lang.String r13 = " err="
            java.lang.String r14 = "Hook 3903 右侧控件方法失败 reason="
            java.lang.StringBuilder r9 = p000.lz1.m3695(r14, r9, r12, r10, r13)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            p000.C0888ux.m5987(r7, r9, r8)
        Ldf:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto Le6
            r0 = r7
        Le6:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        Lec:
            if (r0 == 0) goto Lf9
            int r6 = r6 + 1
            goto Lf9
        Lf1:
            int r13 = r13 + 1
            goto L48
        Lf5:
            int r13 = r13 + 1
            goto L3a
        Lf9:
            int r5 = r5 + 1
            goto Ld
        Lfd:
            java.lang.String r2 = r16.getName()
            java.lang.String r3 = " class="
            java.lang.String r4 = " methods="
            java.lang.String r5 = "已安装 3903 右侧控件 Hook control="
            java.lang.StringBuilder r1 = p000.lz1.m3695(r5, r1, r3, r2, r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 4
            p000.C0888ux.m5988(r7, r1, r0, r2, r0)
            return r6
    }

    /* JADX INFO: renamed from: δ */
    public static void m1127(java.lang.ClassLoader r8) {
            java.lang.String r0 = "FeedRightControlsHide3903"
            r8.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.c30.f1956
            r3 = 0
            boolean r1 = r2.compareAndSet(r3, r1)
            if (r1 != 0) goto L11
            goto La5
        L11:
            b30 r1 = p000.b30.f1438     // Catch: java.lang.Throwable -> L36
            java.util.List r1 = r1.m710(r8, r3)     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L36
            r4 = r3
        L1c:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L38
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L36
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L36
            b30 r6 = p000.b30.f1438     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r6.m709(r5)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L1c
            int r5 = m1126(r5, r6)     // Catch: java.lang.Throwable -> L36
            int r4 = r4 + r5
            goto L1c
        L36:
            r8 = move-exception
            goto L81
        L38:
            b30 r1 = p000.b30.f1438     // Catch: java.lang.Throwable -> L36
            java.util.List r8 = r1.m708(r8, r3)     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L36
        L42:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L36
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L36
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L36
            f10 r6 = new f10     // Catch: java.lang.Throwable -> L36
            r7 = 13
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L36
            r5.m6773(r1, r6)     // Catch: java.lang.Throwable -> L36
            int r4 = r4 + 1
            goto L42
        L5d:
            r8 = 4
            r1 = 0
            if (r4 != 0) goto L6a
            r2.set(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "Feed 右侧控件屏蔽 3903 未命中目标类，等待 DexKit 预热后重试"
            p000.C0888ux.m5988(r0, r4, r1, r8, r1)     // Catch: java.lang.Throwable -> L36
            return
        L6a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "Feed 右侧控件屏蔽 3903 Hook 已安装 targets="
            r5.append(r6)     // Catch: java.lang.Throwable -> L36
            r5.append(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L36
            p000.C0888ux.m5988(r0, r4, r1, r8, r1)     // Catch: java.lang.Throwable -> L36
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L36
            goto L87
        L81:
            eo1 r1 = new eo1
            r1.<init>(r8)
            r8 = r1
        L87:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto La5
            r2.set(r3)
            java.lang.String r1 = r8.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Feed 右侧控件屏蔽 3903 Hook 安装失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            p000.C0888ux.m5987(r0, r1, r8)
        La5:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1128(java.lang.Class r6) {
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC4A7715FFCC5AB89D9F2F8D22FF033ED3A0ED25608D469AD56F47"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            java.lang.Class[] r0 = r6.getInterfaces()
            r0.getClass()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L1c:
            if (r4 >= r2) goto L2d
            r5 = r0[r4]
            r5.getClass()
            boolean r5 = m1128(r5)
            if (r5 == 0) goto L2a
            goto L5b
        L2a:
            int r4 = r4 + 1
            goto L1c
        L2d:
            java.lang.Class r6 = r6.getSuperclass()     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L3b
            boolean r6 = m1128(r6)     // Catch: java.lang.Throwable -> L3d
            if (r6 != r1) goto L3b
            r6 = r1
            goto L3f
        L3b:
            r6 = r3
            goto L3f
        L3d:
            r6 = move-exception
            goto L44
        L3f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L3d
            goto L4a
        L44:
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L4a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r2 = r6 instanceof p000.eo1
            if (r2 == 0) goto L51
            r6 = r0
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r1 = r3
        L5b:
            return r1
    }
}
