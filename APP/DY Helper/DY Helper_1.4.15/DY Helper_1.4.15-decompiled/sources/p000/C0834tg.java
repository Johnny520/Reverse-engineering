package p000;

/* JADX INFO: renamed from: tg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0834tg {
    /* JADX INFO: renamed from: Α */
    public static void m5634(java.lang.ClassLoader r5, java.lang.String r6, java.lang.String r7, p000.e80 r8) {
            java.lang.String r0 = "r4d8c1d36f219aeac"
            java.lang.Class r5 = m5661(r5, r6)
            if (r5 != 0) goto Le
            java.lang.String r5 = "rf1adadb627527086"
            p000.AbstractC0602nx.m4121(r5, r7, r6)
            return
        Le:
            java.lang.String r6 = "onCreateView"
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            qg r3 = new qg     // Catch: java.lang.Throwable -> L3a
            r4 = 1
            r3.<init>(r8, r4, r7)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object[] r8 = new java.lang.Object[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L3a
            p000.qe0.m4873(r5, r6, r8)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            r6.append(r7)     // Catch: java.lang.Throwable -> L3a
            r6.append(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L3a
            p000.C0888ux.m5985(r5)     // Catch: java.lang.Throwable -> L3a
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L41:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L50
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "r55744285c1a5b894"
            p000.AbstractC0602nx.m4121(r6, r7, r5)
        L50:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public static void m5635(p000.z81 r4) {
            java.lang.ClassLoader r0 = r4.f13011
            java.lang.String r1 = "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE65551CC6F74BBDC4A802DF0A0C73E9975D27BB6DCD3B3DE86AF70F88B9EC0E24D1C402FCC3E011F44CC7A933AD83D0"
            java.lang.String r1 = p000.jf0.m2957(r1)
            ig r2 = new ig
            r3 = 2
            r2.<init>(r3)
            java.lang.String r3 = "bottom video group module"
            m5634(r0, r1, r3, r2)
            java.lang.ClassLoader r0 = r4.f13011
            java.lang.String r1 = "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9FAC476C366B9EFD2D3FF83C8E39C4F624AFBA84CA46A1773AD6E91DAB4ED08DF6129FD8ED6B09EC29BA598ACCF76719841F23C647694"
            java.lang.String r1 = p000.jf0.m2957(r1)
            ig r2 = new ig
            r3 = 3
            r2.<init>(r3)
            java.lang.String r3 = "bottom action group module"
            m5634(r0, r1, r3, r2)
            java.lang.ClassLoader r4 = r4.f13011
            m5638(r4)
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public static void m5636(p000.z81 r8) {
            java.lang.String r0 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BB38ACFA1A4C4DE4BF4639733A5CC5A954D77DF2D1F2F66A8C556D44DCD72183EB"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C6D8DCD83B75146CBF9196B2C921758D9CBA4D1CA59A5F99A4AA8365B129A65D23E9E653551AF9B481B4"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            tg r2 = p000.AbstractC0871ug.f10771
            java.lang.ClassLoader r3 = r8.f13011
            java.lang.Class r3 = m5661(r3, r1)
            if (r3 != 0) goto L34
            java.lang.String r2 = "rb8181a9b5998cac"
            p000.AbstractC0602nx.m4142(r2, r1)
            goto L18
        L34:
            java.lang.String r6 = "顶栏"
            r7 = 0
            r4 = 3
            java.lang.String r5 = "top bar"
            r2.m5689(r3, r4, r5, r6, r7)
            goto L18
        L3e:
            return
    }

    /* JADX INFO: renamed from: Η */
    public static void m5637(p000.z81 r16) {
            boolean r0 = p000.AbstractC0871ug.f10760
            if (r0 != 0) goto L6
            goto Ldc
        L6:
            java.util.Set r0 = p000.AbstractC0724qh.f9005
            r0 = r16
            java.lang.ClassLoader r1 = r0.f13011
            ig r2 = new ig
            r3 = 4
            r2.<init>(r3)
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.AbstractC0724qh.f9006
            r5 = 0
            r6 = 1
            boolean r0 = r4.compareAndSet(r5, r6)
            if (r0 != 0) goto L21
            goto Ldc
        L21:
            java.util.Set r0 = p000.AbstractC0724qh.f9005
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r7 = r0.iterator()
            r8 = r5
        L2a:
            boolean r0 = r7.hasNext()
            java.lang.String r9 = "r3712eeb14c86ce94"
            r10 = 0
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r7.next()
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            s62 r12 = p000.s62.f9751
            java.lang.Class r0 = p000.qe0.m4876(r1, r11)     // Catch: java.lang.Throwable -> L41
            goto L48
        L41:
            r0 = move-exception
            eo1 r13 = new eo1
            r13.<init>(r0)
            r0 = r13
        L48:
            boolean r13 = r0 instanceof p000.eo1
            if (r13 == 0) goto L4d
            r0 = r10
        L4d:
            r13 = r0
            java.lang.Class r13 = (java.lang.Class) r13
            if (r13 != 0) goto L5d
            java.lang.String r0 = "3903 顶栏类未命中: "
            java.lang.String r0 = p000.lz1.m3687(r0, r11)
            p000.C0888ux.m5988(r9, r0, r10, r3, r10)
        L5b:
            r14 = r5
            goto Lbf
        L5d:
            java.lang.Class<android.view.View> r0 = android.view.View.class
            boolean r0 = r0.isAssignableFrom(r13)
            if (r0 != 0) goto L6f
            java.lang.String r0 = "3903 顶栏类不是 View，跳过: "
            java.lang.String r0 = p000.lz1.m3687(r0, r11)
            p000.C0888ux.m5988(r9, r0, r10, r3, r10)
            goto L5b
        L6f:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L7c
            ph r10 = new ph     // Catch: java.lang.Throwable -> L7c
            r10.<init>(r2, r5)     // Catch: java.lang.Throwable -> L7c
            r0.m6773(r13, r10)     // Catch: java.lang.Throwable -> L7c
            r14 = r6
            r10 = r12
            goto L83
        L7c:
            r0 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r0)
            r14 = r5
        L83:
            java.lang.Throwable r0 = p000.fo1.m2190(r10)
            java.lang.String r10 = ", "
            if (r0 == 0) goto L98
            java.lang.String r15 = r0.getMessage()
            java.lang.String r3 = "3903 顶栏构造 Hook 失败: "
            java.lang.String r3 = p000.a12.m18(r3, r11, r10, r15)
            p000.C0888ux.m5987(r9, r3, r0)
        L98:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = "onAttachedToWindow"
            ph r15 = new ph     // Catch: java.lang.Throwable -> La6
            r15.<init>(r2, r6)     // Catch: java.lang.Throwable -> La6
            r0.m6774(r13, r3, r15)     // Catch: java.lang.Throwable -> La6
            r14 = r6
            goto Lac
        La6:
            r0 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r0)
        Lac:
            java.lang.Throwable r0 = p000.fo1.m2190(r12)
            if (r0 == 0) goto Lbf
            java.lang.String r3 = r0.getMessage()
            java.lang.String r12 = "3903 顶栏 onAttachedToWindow Hook 失败: "
            java.lang.String r3 = p000.a12.m18(r12, r11, r10, r3)
            p000.C0888ux.m5987(r9, r3, r0)
        Lbf:
            if (r14 == 0) goto Lc3
            int r8 = r8 + 1
        Lc3:
            r3 = 4
            goto L2a
        Lc6:
            if (r8 != 0) goto Ld2
            r4.set(r5)
            java.lang.String r0 = "3903 顶栏透明度 Hook 未命中目标类"
            r1 = 4
            p000.C0888ux.m5988(r9, r0, r10, r1, r10)
            goto Ldc
        Ld2:
            r1 = 4
            java.lang.String r0 = "3903 顶栏透明度 Hook 已安装 classes="
            java.lang.String r0 = p000.a12.m17(r0, r8)
            p000.C0888ux.m5988(r9, r0, r10, r1, r10)
        Ldc:
            return
    }

    /* JADX INFO: renamed from: Κ */
    public static void m5638(java.lang.ClassLoader r12) {
            r12.getClass()
            ag r0 = p000.C0017ag.f217
            r1 = 0
            java.util.ArrayList r12 = r0.m108(r12, r1)
            java.util.Iterator r12 = r12.iterator()
        Le:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L10f
            java.lang.Object r0 = r12.next()
            java.lang.Class r0 = (java.lang.Class) r0
            tg r2 = p000.AbstractC0871ug.f10771
            java.lang.String r2 = "bottom misc flux register"
            ig r3 = new ig
            r3.<init>(r1)
            ag r4 = p000.C0017ag.f217
            r0.getClass()
            java.lang.String r4 = p000.C0017ag.m107(r0)
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L6a
            java.lang.String r7 = "BOTTOM_BAR_CONTAINER"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L40
            java.lang.String r7 = "BUTTON_CONTAINER"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L6a
        L40:
            java.lang.reflect.Method[] r4 = r0.getDeclaredMethods()
            r4.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r4.length
            r9 = r1
        L4e:
            if (r9 >= r8) goto L5e
            r10 = r4[r9]
            boolean r11 = p000.C0017ag.m106(r10)
            if (r11 == 0) goto L5b
            r7.add(r10)
        L5b:
            int r9 = r9 + 1
            goto L4e
        L5e:
            java.lang.Object r4 = p000.AbstractC0984xh.m6656(r7)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L6a
            r4.setAccessible(r6)
            goto L6b
        L6a:
            r4 = r5
        L6b:
            if (r4 != 0) goto L7b
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "r91f9eeeb280fa734bottom misc flux register"
            java.lang.String r0 = r2.concat(r0)
            p000.C0888ux.m5985(r0)
            goto Le
        L7b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r0.getName()
            r7.append(r8)
            r8 = 35
            r7.append(r8)
            java.lang.String r8 = r4.getName()
            r7.append(r8)
            r8 = 40
            r7.append(r8)
            java.lang.Class[] r8 = r4.getParameterTypes()
            r8.getClass()
            we r9 = new we
            r10 = 24
            r9.<init>(r10)
            r10 = 31
            java.lang.String r5 = p000.AbstractC0312g7.m2256(r8, r5, r5, r9, r10)
            r8 = 41
            java.lang.String r5 = p000.AbstractC0602nx.m4132(r7, r5, r8)
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = p000.AbstractC0871ug.f10779
            boolean r7 = r7.add(r5)
            if (r7 != 0) goto Lbc
            goto Le
        Lbc:
            r4.setAccessible(r6)     // Catch: java.lang.Throwable -> Lee
            xq0 r6 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lee
            qg r7 = new qg     // Catch: java.lang.Throwable -> Lee
            r7.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> Lee
            r6.m6775(r4, r7)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lee
            java.lang.String r3 = r4.getName()     // Catch: java.lang.Throwable -> Lee
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lee
            r6.<init>()     // Catch: java.lang.Throwable -> Lee
            java.lang.String r7 = "rb4a46d880497e25b"
            r6.append(r7)     // Catch: java.lang.Throwable -> Lee
            r6.append(r2)     // Catch: java.lang.Throwable -> Lee
            r6.append(r0)     // Catch: java.lang.Throwable -> Lee
            r6.append(r3)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lee
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> Lee
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lee
            goto Lf5
        Lee:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        Lf5:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Le
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.AbstractC0871ug.f10779
            r2.remove(r5)
            java.lang.String r2 = r4.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "rdd2d21e754a48f7bbottom misc flux register"
            p000.AbstractC0602nx.m4121(r3, r2, r0)
            goto Le
        L10f:
            return
    }

    /* JADX INFO: renamed from: Λ */
    public static void m5639(android.view.View r1, int r2) {
            int r0 = p000.AbstractC0871ug.f10792
            int r0 = r0 + 1
            p000.AbstractC0871ug.f10792 = r0
            r1.setVisibility(r2)     // Catch: java.lang.Throwable -> L10
            int r1 = p000.AbstractC0871ug.f10792
            int r1 = r1 + (-1)
            p000.AbstractC0871ug.f10792 = r1
            return
        L10:
            r1 = move-exception
            int r2 = p000.AbstractC0871ug.f10792
            int r2 = r2 + (-1)
            p000.AbstractC0871ug.f10792 = r2
            throw r1
    }

    /* JADX INFO: renamed from: Μ */
    public static boolean m5640() {
            boolean r0 = p000.AbstractC0871ug.f10765
            if (r0 == 0) goto La
            boolean r0 = p000.AbstractC0871ug.f10783
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Ν */
    public static boolean m5641(android.view.View r3) {
            java.lang.String r0 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D6AA2F8632C81877EA9DEE34649246A2C86F42"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m5642(r3, r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m5642(r3, r0)
            if (r0 != 0) goto L51
            r0 = 2131618522(0x7f0deada, float:1.8864057E38)
            java.lang.Object r0 = r3.getTag(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L41
            r0 = 2131618513(0x7f0dead1, float:1.8864038E38)
            java.lang.Object r0 = r3.getTag(r0)
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L35
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L36
        L35:
            r0 = 0
        L36:
            if (r0 != 0) goto L39
            goto L41
        L39:
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L41
            goto L51
        L41:
            r0 = 2131618537(0x7f0deae9, float:1.8864087E38)
            java.lang.Object r3 = r3.getTag(r0)
            boolean r3 = p000.ln0.m3626(r3, r1)
            if (r3 == 0) goto L4f
            goto L51
        L4f:
            r3 = 0
            return r3
        L51:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: Ξ */
    public static boolean m5642(android.view.View r1, java.lang.String r2) {
            java.lang.Class r1 = r1.getClass()
        L4:
            if (r1 == 0) goto L1f
            java.lang.Class<android.view.View> r0 = android.view.View.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = r1.getName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            r1 = 1
            return r1
        L1a:
            java.lang.Class r1 = r1.getSuperclass()
            goto L4
        L1f:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Ο */
    public static boolean m5643(android.view.View r3, android.view.View r4) {
            r0 = 0
            r1 = r0
        L2:
            if (r3 == 0) goto L1b
            r2 = 32
            if (r1 >= r2) goto L1b
            if (r3 != r4) goto Lc
            r3 = 1
            return r3
        Lc:
            android.view.ViewParent r3 = r3.getParent()
            boolean r2 = r3 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r3 = (android.view.View) r3
            goto L18
        L17:
            r3 = 0
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: Π */
    public static boolean m5644(int r2) {
            r0 = 1
            if (r2 == r0) goto L15
            r1 = 2
            if (r2 == r1) goto L15
            r1 = 3
            if (r2 == r1) goto L15
            boolean r1 = m5645(r2)
            if (r1 != 0) goto L15
            r1 = 5
            if (r2 != r1) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            return r0
    }

    /* JADX INFO: renamed from: Ρ */
    public static boolean m5645(int r1) {
            r0 = 4
            if (r1 == r0) goto L10
            r0 = 6
            if (r1 == r0) goto L10
            r0 = 7
            if (r1 == r0) goto L10
            r0 = 8
            if (r1 != r0) goto Le
            goto L10
        Le:
            r1 = 0
            return r1
        L10:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: Σ */
    public static boolean m5646(android.view.View r9, int r10) {
            r0 = 1
            if (r10 == r0) goto L8
            r1 = 2
            if (r10 != r1) goto L7
            goto L8
        L7:
            return r0
        L8:
            long r1 = p000.AbstractC0871ug.f10747
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 > 0) goto L11
            goto L67
        L11:
            r10 = 2131618526(0x7f0deade, float:1.8864065E38)
            java.lang.Object r3 = r9.getTag(r10)
            boolean r4 = r3 instanceof java.lang.Long
            r5 = 0
            if (r4 == 0) goto L20
            java.lang.Long r3 = (java.lang.Long) r3
            goto L21
        L20:
            r3 = r5
        L21:
            if (r3 != 0) goto L24
            goto L2d
        L24:
            long r3 = r3.longValue()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L2d
            return r0
        L2d:
            java.lang.Long r3 = p000.AbstractC0871ug.f10748
            if (r3 == 0) goto L67
            long r3 = r3.longValue()
            pq r6 = p000.C0696pq.f8651
            kq r6 = p000.C0696pq.m4567()
            if (r6 != 0) goto L3e
            goto L67
        L3e:
            mq r7 = r6.f6079
            long r7 = r7.f7247
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L47
            goto L67
        L47:
            android.view.View r3 = r6.f6078
            if (r3 != 0) goto L58
            java.lang.Object r3 = r6.f6076
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L54
            r5 = r3
            android.view.View r5 = (android.view.View) r5
        L54:
            if (r5 != 0) goto L57
            goto L67
        L57:
            r3 = r5
        L58:
            boolean r3 = m5643(r9, r3)
            if (r3 != 0) goto L5f
            goto L67
        L5f:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r9.setTag(r10, r1)
            return r0
        L67:
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: Χ */
    public static boolean m5647(android.view.View r5) {
            r0 = 2131618521(0x7f0dead9, float:1.8864055E38)
            java.lang.Object r1 = r5.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r2)
            r3 = 1
            if (r1 == 0) goto L11
            return r3
        L11:
            int r1 = r5.getVisibility()
            r4 = 0
            if (r1 == 0) goto L19
            return r4
        L19:
            r1 = 2131618525(0x7f0deadd, float:1.8864063E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.setTag(r1, r4)
            r5.setTag(r0, r2)
            return r3
    }

    /* JADX INFO: renamed from: Ψ */
    public static p000.EnumC0077bh m5648(int r2) {
            r0 = 4
            bh r1 = p000.EnumC0077bh.f1711
            if (r2 == r0) goto L17
            r0 = 6
            if (r2 == r0) goto L17
            r0 = 7
            if (r2 == r0) goto L14
            r0 = 8
            if (r2 == r0) goto L11
            r2 = 0
            return r2
        L11:
            bh r2 = p000.EnumC0077bh.f1713
            return r2
        L14:
            bh r2 = p000.EnumC0077bh.f1712
            return r2
        L17:
            return r1
    }

    /* JADX INFO: renamed from: Ω */
    public static void m5649(java.lang.String r3, java.lang.String r4) {
            if (r3 == 0) goto Lb
            java.util.LinkedHashSet r0 = p000.AbstractC0871ug.f10770
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto Lb
            return
        Lb:
            android.os.Handler r0 = p000.AbstractC0871ug.f10780
            w1 r1 = new w1
            r2 = 6
            r1.<init>(r3, r2, r4)
            r0.post(r1)
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5650(boolean r6) {
            m5680()
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0871ug.f10769
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            eg r3 = new eg
            r4 = 0
            r3.<init>(r2, r4)
            p000.AbstractC0984xh.m6652(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r1.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L4d
            goto L38
        L4d:
            tg r4 = p000.AbstractC0871ug.f10771
            java.lang.Integer r5 = m5664(r3)
            if (r5 != 0) goto L56
            goto L38
        L56:
            int r5 = r5.intValue()
            if (r5 != r2) goto L38
            r4.m5694(r3, r2, r6)
            goto L38
        L60:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m5651(android.view.View r4, int r5, float r6, boolean r7) {
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
            m5676(r4)
        L8:
            r2 = 8
            if (r7 == 0) goto L7e
            boolean r7 = r4.isAttachedToWindow()
            if (r7 == 0) goto L7e
            if (r1 <= 0) goto L18
            m5676(r4)
            goto L21
        L18:
            boolean r7 = m5678(r5)
            if (r7 == 0) goto L21
            m5647(r4)
        L21:
            m5653(r4)
            float r7 = r4.getAlpha()
            float r1 = r7 - r6
            float r1 = java.lang.Math.abs(r1)
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L52
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto L97
            boolean r5 = m5678(r5)
            if (r5 == 0) goto L97
            r5 = 2131618521(0x7f0dead9, float:1.8864055E38)
            java.lang.Object r5 = r4.getTag(r5)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L97
            m5639(r4, r2)
            return
        L52:
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r7
            r7 = 1
            r0[r7] = r6
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r0)
            r2 = 250(0xfa, double:1.235E-321)
            r7.setDuration(r2)
            fg r0 = new fg
            r0.<init>(r4, r1)
            r7.addUpdateListener(r0)
            kg r0 = new kg
            r0.<init>(r6, r5, r4)
            r7.addListener(r0)
            r5 = 2131618514(0x7f0dead2, float:1.886404E38)
            r4.setTag(r5, r7)
            r7.start()
            return
        L7e:
            m5653(r4)
            m5677(r4, r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto L97
            boolean r5 = m5678(r5)
            if (r5 == 0) goto L97
            boolean r5 = m5647(r4)
            if (r5 == 0) goto L97
            m5639(r4, r2)
        L97:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m5652(android.view.View r3) {
            boolean r0 = m5641(r3)
            if (r0 != 0) goto L7
            goto L4b
        L7:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L22
            android.os.Handler r0 = p000.AbstractC0871ug.f10780
            jb r1 = new jb
            r2 = 15
            r1.<init>(r3, r2)
            r0.post(r1)
            return
        L22:
            m5675(r3)     // Catch: java.lang.Throwable -> L2d
            tg r0 = p000.AbstractC0871ug.f10771     // Catch: java.lang.Throwable -> L2d
            m5673(r3)     // Catch: java.lang.Throwable -> L2d
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L34:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L4b
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "r6f43e25c86fc96d6"
            p000.AbstractC0602nx.m4121(r1, r3, r0)
        L4b:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m5653(android.view.View r4) {
            r0 = 2131618514(0x7f0dead2, float:1.886404E38)
            java.lang.Object r1 = r4.getTag(r0)
            boolean r2 = r1 instanceof android.animation.ValueAnimator
            r3 = 0
            if (r2 == 0) goto Lf
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            goto L10
        Lf:
            r1 = r3
        L10:
            if (r1 != 0) goto L13
            return
        L13:
            r4.setTag(r0, r3)
            r1.cancel()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m5654(java.lang.String r6) {
            ν r0 = p000.AbstractC0871ug.f10767
            if (r0 == 0) goto L9
            android.os.Handler r1 = p000.AbstractC0871ug.f10780
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            p000.AbstractC0871ug.f10767 = r0
            rf r1 = p000.AbstractC0871ug.f10781
            java.lang.Object r2 = r1.f9359
            lh r2 = (p000.C0512lh) r2
            if (r2 != 0) goto L15
            return
        L15:
            long r2 = r1.f9358
            r4 = 1
            long r2 = r2 + r4
            r1.f9358 = r2
            r1.f9359 = r0
            java.lang.String r0 = "r8eaaa04942e6a77c"
            java.lang.String r6 = r0.concat(r6)
            java.lang.String r0 = "rf9ef3362bd85f5b5"
            p000.C0888ux.m5975(r0, r6)
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m5655() {
            s0 r0 = p000.AbstractC0871ug.f10766
            if (r0 == 0) goto L9
            android.os.Handler r1 = p000.AbstractC0871ug.f10780
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            p000.AbstractC0871ug.f10766 = r0
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m5656() {
            r0 = -9223372036854775808
            p000.AbstractC0871ug.f10753 = r0
            r0 = 0
            p000.AbstractC0871ug.f10754 = r0
            m5670()
            return
    }

    /* JADX INFO: renamed from: ι */
    public static void m5657(boolean r18, java.lang.String r19, boolean r20, int r21) {
            r0 = r18
            r1 = r19
            tg r2 = p000.AbstractC0871ug.f10771
            r2 = r21 & 4
            r4 = 1
            if (r2 == 0) goto Ld
            r2 = r4
            goto Le
        Ld:
            r2 = 0
        Le:
            r5 = r21 & 8
            if (r5 == 0) goto L14
            r5 = 0
            goto L16
        L14:
            r5 = r20
        L16:
            boolean r6 = p000.AbstractC0871ug.f10793
            boolean r7 = p000.AbstractC0871ug.f10794
            if (r0 == 0) goto L22
            if (r7 != 0) goto L20
            if (r5 == 0) goto L22
        L20:
            r5 = r4
            goto L23
        L22:
            r5 = 0
        L23:
            if (r6 == r0) goto L27
            r8 = r4
            goto L28
        L27:
            r8 = 0
        L28:
            if (r7 == r5) goto L2c
            r9 = r4
            goto L2d
        L2c:
            r9 = 0
        L2d:
            p000.AbstractC0871ug.f10793 = r0
            p000.AbstractC0871ug.f10794 = r5
            r10 = 0
            if (r5 == 0) goto L105
            if (r6 == 0) goto L38
            if (r7 != 0) goto L105
        L38:
            long r11 = p000.AbstractC0871ug.f10747
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r11 = 1
            if (r7 != 0) goto L46
            goto L49
        L46:
            long r13 = p000.AbstractC0871ug.f10747
            long r11 = r11 + r13
        L49:
            p000.AbstractC0871ug.f10747 = r11
            pq r7 = p000.C0696pq.f8651
            kq r7 = p000.C0696pq.m4567()
            if (r7 == 0) goto L5c
            mq r13 = r7.f6079
            long r13 = r13.f7247
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L5d
        L5c:
            r13 = r10
        L5d:
            p000.AbstractC0871ug.f10748 = r13
            if (r7 == 0) goto L65
            android.view.View r13 = r7.f6078
            if (r13 != 0) goto L74
        L65:
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r7.f6076
            goto L6b
        L6a:
            r7 = r10
        L6b:
            boolean r13 = r7 instanceof android.view.View
            if (r13 == 0) goto L73
            r13 = r7
            android.view.View r13 = (android.view.View) r13
            goto L74
        L73:
            r13 = r10
        L74:
            java.util.concurrent.ConcurrentHashMap r7 = p000.AbstractC0871ug.f10769
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L7e:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L109
            java.lang.Object r14 = r7.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getKey()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.Object r14 = r14.getValue()
            java.util.Set r14 = (java.util.Set) r14
            tg r16 = p000.AbstractC0871ug.f10771
            if (r15 == r4) goto La1
            r3 = 2
            if (r15 != r3) goto L102
        La1:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            we r3 = new we
            r15 = 23
            r3.<init>(r15)
            p000.AbstractC0984xh.m6652(r14, r3)
            java.util.Iterator r3 = r14.iterator()
        Lb1:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L102
            java.lang.Object r14 = r3.next()
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            java.lang.Object r14 = r14.get()
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto Lc6
            goto L100
        Lc6:
            if (r13 == 0) goto Lcf
            tg r15 = p000.AbstractC0871ug.f10771
            boolean r15 = m5643(r14, r13)
            goto Lf2
        Lcf:
            tg r15 = p000.AbstractC0871ug.f10771
            boolean r15 = r14.isAttachedToWindow()
            if (r15 == 0) goto Lf1
            boolean r15 = r14.isShown()
            if (r15 != 0) goto Lde
            goto Lf1
        Lde:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            boolean r17 = r14.getGlobalVisibleRect(r15)
            if (r17 == 0) goto Lf1
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto Lf1
            r15 = r4
            goto Lf2
        Lf1:
            r15 = 0
        Lf2:
            if (r15 == 0) goto Lf9
            java.lang.Long r15 = java.lang.Long.valueOf(r11)
            goto Lfa
        Lf9:
            r15 = r10
        Lfa:
            r4 = 2131618526(0x7f0deade, float:1.8864065E38)
            r14.setTag(r4, r15)
        L100:
            r4 = 1
            goto Lb1
        L102:
            r4 = 1
            goto L7e
        L105:
            if (r5 != 0) goto L109
            p000.AbstractC0871ug.f10748 = r10
        L109:
            oh r3 = p000.C0623oh.f8099
            p000.C0623oh.m4242(r0)
            boolean r3 = m5640()
            if (r3 != 0) goto L115
            return
        L115:
            boolean r3 = p000.AbstractC0871ug.f10783
            boolean r4 = p000.AbstractC0871ug.f10788
            boolean r7 = p000.AbstractC0871ug.f10790
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "rd1afa54545715f71"
            r10.<init>(r11)
            r10.append(r0)
            r10.append(r6)
            r10.append(r5)
            r10.append(r3)
            r10.append(r4)
            r10.append(r7)
            r10.append(r1)
            java.lang.String r3 = r10.toString()
            java.lang.String r4 = "rf9ef3362bd85f5b5"
            p000.C0888ux.m5975(r4, r3)
            if (r8 != 0) goto L14e
            if (r9 != 0) goto L14e
            java.lang.String r0 = "playback unchanged: "
            java.lang.String r0 = r0.concat(r1)
            m5685(r0)
            return
        L14e:
            java.lang.String r3 = "playback changed: "
            java.lang.String r1 = r3.concat(r1)
            m5685(r1)
            boolean r1 = p000.AbstractC0871ug.f10788
            if (r1 == 0) goto L173
            if (r9 != 0) goto L15e
            goto L173
        L15e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "applying all states due to paused="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5975(r4, r0)
            m5650(r2)
            return
        L173:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "r2802425e750d8502"
            r0.<init>(r1)
            r0.append(r8)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r4, r0)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.Float m5658(android.view.View r6, int r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r2 = -2
            if (r7 != r2) goto Lb
            goto L96
        Lb:
            boolean r2 = p000.AbstractC0871ug.f10765
            if (r2 != 0) goto L11
            goto L96
        L11:
            bh r2 = m5648(r7)
            r3 = 1120403456(0x42c80000, float:100.0)
            r4 = 1
            if (r2 == 0) goto L6d
            java.util.LinkedHashMap r0 = p000.AbstractC0871ug.f10787
            java.lang.Object r0 = r0.get(r2)
            ch r0 = (p000.C0113ch) r0
            if (r0 != 0) goto L25
            goto L6b
        L25:
            boolean r2 = p000.AbstractC0871ug.f10788
            r5 = 0
            if (r2 == 0) goto L3a
            boolean r2 = p000.AbstractC0871ug.f10793
            if (r2 == 0) goto L3a
            boolean r2 = p000.AbstractC0871ug.f10794
            if (r2 == 0) goto L3a
            boolean r6 = m5646(r6, r7)
            if (r6 == 0) goto L3a
            r6 = r4
            goto L3b
        L3a:
            r6 = r5
        L3b:
            boolean r7 = p000.AbstractC0871ug.f10789
            if (r7 == 0) goto L45
            boolean r7 = p000.AbstractC0871ug.f10791
            if (r7 == 0) goto L45
            r7 = r4
            goto L46
        L45:
            r7 = r5
        L46:
            boolean r2 = p000.AbstractC0871ug.f10783
            if (r6 != 0) goto L4e
            if (r7 == 0) goto L4d
            goto L4e
        L4d:
            r4 = r5
        L4e:
            if (r2 == 0) goto L6b
            boolean r6 = r0.f2110
            if (r6 != 0) goto L55
            goto L6b
        L55:
            if (r4 == 0) goto L5c
            boolean r6 = r0.f2112
            if (r6 == 0) goto L5c
            goto L96
        L5c:
            int r6 = r0.f2111
            r7 = 100
            int r6 = p000.j81.m2906(r6, r5, r7)
            float r6 = (float) r6
            float r6 = r6 / r3
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            return r6
        L6b:
            r6 = 0
            return r6
        L6d:
            r2 = 5
            if (r7 != r2) goto L7a
            boolean r6 = p000.AbstractC0871ug.f10783
            if (r6 == 0) goto L96
            r6 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            return r6
        L7a:
            boolean r2 = p000.AbstractC0871ug.f10788
            if (r2 == 0) goto L8d
            boolean r2 = p000.AbstractC0871ug.f10793
            if (r2 == 0) goto L8d
            boolean r2 = p000.AbstractC0871ug.f10794
            if (r2 == 0) goto L8d
            boolean r6 = m5646(r6, r7)
            if (r6 == 0) goto L8d
            goto L96
        L8d:
            boolean r6 = p000.AbstractC0871ug.f10791
            if (r6 == 0) goto L92
            goto L96
        L92:
            boolean r6 = p000.AbstractC0871ug.f10783
            if (r6 != 0) goto L97
        L96:
            return r1
        L97:
            if (r7 == r4) goto La9
            r6 = 2
            if (r7 == r6) goto La6
            r6 = 3
            if (r7 == r6) goto La0
            goto Lac
        La0:
            int r6 = p000.AbstractC0871ug.f10786
        La2:
            float r6 = (float) r6
            float r0 = r6 / r3
            goto Lac
        La6:
            int r6 = p000.AbstractC0871ug.f10785
            goto La2
        La9:
            int r6 = p000.AbstractC0871ug.f10784
            goto La2
        Lac:
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            return r6
    }

    /* JADX INFO: renamed from: λ */
    public static boolean m5659(android.view.View r6, int r7) {
            java.lang.Integer r0 = m5664(r6)
            r1 = 1
            if (r0 == 0) goto L14
            int r0 = r0.intValue()
            bh r0 = m5648(r0)
            bh r2 = p000.EnumC0077bh.f1711
            if (r0 != r2) goto L14
            goto L5e
        L14:
            java.lang.String r0 = "~796896D9FD9A99E3FF60F870F520A872CAB9C9E837D81AFF017266A3E9979F463DE356D00EC2BD454B6297D77AC58FCC046CA8A6B257A19D285C5090E83692"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m5642(r6, r0)
            if (r0 == 0) goto L3e
            java.lang.String r0 = m5663(r6)
            java.lang.String r2 = "cfm"
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto L2f
            cg r0 = p000.EnumC0112cg.f2102
            goto L3b
        L2f:
            java.lang.String r2 = "e68"
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L3a
            cg r0 = p000.EnumC0112cg.f2103
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L3e
            goto L5e
        L3e:
            r0 = 0
            if (r7 <= 0) goto L62
            boolean r2 = r6 instanceof android.view.ViewGroup
            if (r2 != 0) goto L46
            goto L62
        L46:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r2 = r6.getChildCount()
            r3 = r0
        L4d:
            if (r3 >= r2) goto L62
            android.view.View r4 = r6.getChildAt(r3)
            r4.getClass()
            int r5 = r7 + (-1)
            boolean r4 = m5659(r4, r5)
            if (r4 == 0) goto L5f
        L5e:
            return r1
        L5f:
            int r3 = r3 + 1
            goto L4d
        L62:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m5660(int r2) {
            switch(r2) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "TYPE_UNKNOWN("
            java.lang.String r1 = ")"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r0, r2, r1)
            return r2
        Lc:
            java.lang.String r2 = "TYPE_MISC_DANMAKU"
            return r2
        Lf:
            java.lang.String r2 = "TYPE_MISC_FULLSCREEN"
            return r2
        L12:
            java.lang.String r2 = "TYPE_MISC_BOTTOM_ENTRY"
            return r2
        L15:
            java.lang.String r2 = "TYPE_DOCUMENT_FORCE_HIDE"
            return r2
        L18:
            java.lang.String r2 = "TYPE_MISC_BOTTOM_BAR"
            return r2
        L1b:
            java.lang.String r2 = "TYPE_TOP_BAR"
            return r2
        L1e:
            java.lang.String r2 = "TYPE_BOTTOM_INFO"
            return r2
        L21:
            java.lang.String r2 = "TYPE_RIGHT_PANEL"
            return r2
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.Class m5661(java.lang.ClassLoader r0, java.lang.String r1) {
            java.lang.Class r0 = p000.qe0.m4876(r0, r1)     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lc:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L11
            r0 = 0
        L11:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static p000.l91 m5662(android.view.View r4) {
            android.view.ViewParent r4 = r4.getParent()
            r0 = 0
        L5:
            boolean r1 = r4 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L46
            r1 = 32
            if (r0 >= r1) goto L46
            android.view.View r4 = (android.view.View) r4
            r1 = 2131618513(0x7f0dead1, float:1.8864038E38)
            java.lang.Object r1 = r4.getTag(r1)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L1e
            r2 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2
        L1e:
            r1 = 2131618522(0x7f0deada, float:1.8864057E38)
            java.lang.Object r1 = r4.getTag(r1)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L3f
            if (r2 == 0) goto L3f
            int r1 = r2.intValue()
            boolean r1 = m5644(r1)
            if (r1 == 0) goto L3f
            l91 r0 = new l91
            r0.<init>(r4, r2)
            return r0
        L3f:
            android.view.ViewParent r4 = r4.getParent()
            int r0 = r0 + 1
            goto L5
        L46:
            return r2
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.String m5663(android.view.View r3) {
            int r0 = r3.getId()
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            android.content.res.Resources r0 = r3.getResources()     // Catch: java.lang.Throwable -> L16
            int r3 = r3.getId()     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r0.getResourceEntryName(r3)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L1d:
            boolean r0 = r3 instanceof p000.eo1
            if (r0 == 0) goto L22
            goto L23
        L22:
            r2 = r3
        L23:
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* JADX INFO: renamed from: а */
    public static java.lang.Integer m5664(android.view.View r4) {
            r0 = 2131618513(0x7f0dead1, float:1.8864038E38)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            r2 = 0
            if (r1 == 0) goto Lf
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L31
            int r1 = r0.intValue()
            boolean r3 = m5644(r1)
            if (r3 != 0) goto L1d
            goto L31
        L1d:
            r3 = 5
            if (r1 != r3) goto L21
            goto L30
        L21:
            r1 = 2131618522(0x7f0deada, float:1.8864057E38)
            java.lang.Object r4 = r4.getTag(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r4 = p000.ln0.m3626(r4, r1)
            if (r4 == 0) goto L31
        L30:
            return r0
        L31:
            return r2
    }

    /* JADX INFO: renamed from: б */
    public static void m5665(android.view.View r6, int r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r7 = m5660(r7)
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            boolean r1 = r6.isAttachedToWindow()
            int r2 = r6.getWidth()
            int r6 = r6.getHeight()
            java.lang.String r3 = "] type="
            java.lang.String r4 = " source="
            java.lang.String r5 = "清爽调试入口 ["
            java.lang.StringBuilder r7 = p000.lz1.m3695(r5, r9, r3, r7, r4)
            java.lang.String r9 = " class="
            java.lang.String r3 = " attached="
            p000.AbstractC0602nx.m4119(r7, r8, r9, r0, r3)
            r7.append(r1)
            java.lang.String r8 = " size="
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = "x"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "rf9ef3362bd85f5b5"
            p000.C0888ux.m5975(r7, r6)
            return
    }

    /* JADX INFO: renamed from: г */
    public static /* synthetic */ void m5666(p000.C0834tg r6, android.view.View r7, int r8, java.lang.String r9, java.lang.String r10, int r11) {
            r0 = r11 & 8
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r4 = r10
            r10 = r11 & 16
            if (r10 == 0) goto L11
            r10 = 0
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            goto L13
        L11:
            r10 = 1
            goto Lb
        L13:
            r0.m5704(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: д */
    public static void m5667() {
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0871ug.f10769
            r1 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r2)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 != 0) goto L10
            goto L5c
        L10:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r3.getClass()
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L16
            r2.remove()
            goto L16
        L2f:
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L48
            goto L33
        L48:
            tg r3 = p000.AbstractC0871ug.f10771
            java.lang.Integer r4 = m5664(r2)
            if (r4 != 0) goto L51
            goto L33
        L51:
            int r4 = r4.intValue()
            if (r4 != r1) goto L33
            r4 = 0
            r3.m5694(r2, r1, r4)
            goto L33
        L5c:
            return
    }

    /* JADX INFO: renamed from: е */
    public static void m5668() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L15
            java.lang.ref.WeakReference r0 = p000.AbstractC0871ug.f10777
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L15
            p000.ui1.m5896(r0)
        L15:
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L1d
            goto L1ea
        L1d:
            r1 = 0
            boolean r0 = p000.AbstractC0871ug.f10763     // Catch: java.lang.Throwable -> L35
            r2 = 1
            if (r0 != 0) goto L37
            java.lang.ref.WeakReference r0 = p000.AbstractC0871ug.f10777     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L35
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            p000.AbstractC0976x9.m6537(r0)     // Catch: java.lang.Throwable -> L35
            p000.AbstractC0871ug.f10763 = r2     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r0 = move-exception
            goto L44
        L37:
            boolean r0 = p000.AbstractC0976x9.m6538()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L4d
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1283()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L4d
            goto L4e
        L44:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "rf7136ca2f759796a"
            p000.AbstractC0602nx.m4142(r2, r0)
        L4d:
            r2 = r1
        L4e:
            p000.AbstractC0871ug.f10765 = r2
            boolean r0 = p000.AbstractC0871ug.f10765
            if (r0 == 0) goto L5b
            java.lang.String r0 = "clean_mode_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            goto L5c
        L5b:
            r0 = r1
        L5c:
            boolean r2 = p000.AbstractC0871ug.f10765
            if (r2 == 0) goto L67
            java.lang.String r2 = "clean_auto_hide"
            boolean r2 = p000.ui1.m5887(r2, r1)
            goto L68
        L67:
            r2 = r1
        L68:
            p000.AbstractC0871ug.f10783 = r0
            p000.AbstractC0871ug.f10788 = r2
            boolean r3 = p000.AbstractC0871ug.f10783
            if (r3 == 0) goto L74
            boolean r3 = p000.AbstractC0871ug.f10788
            if (r3 != 0) goto L7c
        L74:
            m5656()
            p000.AbstractC0871ug.f10794 = r1
            r3 = 0
            p000.AbstractC0871ug.f10748 = r3
        L7c:
            boolean r3 = p000.AbstractC0871ug.f10765
            if (r3 == 0) goto L87
            java.lang.String r3 = "clean_touch_restore_controls"
            boolean r3 = p000.ui1.m5887(r3, r1)
            goto L88
        L87:
            r3 = r1
        L88:
            p000.AbstractC0871ug.f10789 = r3
            boolean r3 = p000.AbstractC0871ug.f10765
            if (r3 == 0) goto L95
            java.lang.String r3 = "clean_pause_show_bottom_bar"
            boolean r3 = p000.ui1.m5887(r3, r1)
            goto L96
        L95:
            r3 = r1
        L96:
            p000.AbstractC0871ug.f10790 = r3
            java.lang.String r3 = "clean_right_panel_alpha"
            r4 = 40
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> La5
            int r3 = r5.getInt(r3, r4)     // Catch: java.lang.Throwable -> La5
            goto La6
        La5:
            r3 = r4
        La6:
            r5 = 100
            int r3 = p000.j81.m2906(r3, r1, r5)
            p000.AbstractC0871ug.f10784 = r3
            java.lang.String r3 = "clean_bottom_info_alpha"
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lb9
            int r3 = r6.getInt(r3, r4)     // Catch: java.lang.Throwable -> Lb9
            goto Lba
        Lb9:
            r3 = r4
        Lba:
            int r3 = p000.j81.m2906(r3, r1, r5)
            p000.AbstractC0871ug.f10785 = r3
            java.lang.String r3 = "clean_top_bar_alpha"
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lca
            int r4 = r6.getInt(r3, r4)     // Catch: java.lang.Throwable -> Lca
        Lca:
            int r1 = p000.j81.m2906(r4, r1, r5)
            p000.AbstractC0871ug.f10786 = r1
            rz r1 = p000.EnumC0077bh.f1715
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r1, r4)
            int r4 = p000.ex0.m1970(r4)
            r5 = 16
            if (r4 >= r5) goto Le3
            r4 = r5
        Le3:
            r3.<init>(r4)
            τ r4 = new τ
            r4.<init>(r1)
        Leb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L100
            java.lang.Object r1 = r4.next()
            r5 = r1
            bh r5 = (p000.EnumC0077bh) r5
            ch r5 = p000.AbstractC0782s1.m5339(r5)
            r3.put(r1, r5)
            goto Leb
        L100:
            p000.AbstractC0871ug.f10787 = r3
            boolean r1 = p000.AbstractC0871ug.f10765
            boolean r3 = p000.AbstractC0871ug.f10789
            boolean r4 = p000.AbstractC0871ug.f10790
            java.util.LinkedHashMap r5 = p000.AbstractC0871ug.f10787
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            int r7 = r5.size()
            int r7 = p000.ex0.m1970(r7)
            r6.<init>(r7)
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L121:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L141
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            ch r7 = (p000.C0113ch) r7
            boolean r7 = r7.f2110
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6.put(r8, r7)
            goto L121
        L141:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "rf7b64370f033a806"
            r5.<init>(r7)
            r5.append(r1)
            r5.append(r0)
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            p000.C0888ux.m5985(r0)
            boolean r0 = m5640()
            if (r0 == 0) goto L18a
            eh r0 = p000.C0248eh.f3550
            java.util.ArrayList r0 = p000.C0248eh.m1920()
            java.util.Iterator r0 = r0.iterator()
        L171:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18a
            java.lang.Object r1 = r0.next()
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            tg r2 = p000.AbstractC0871ug.f10771
            java.lang.String r5 = "captured music cover sync"
            r6 = 0
            r7 = 8
            r4 = 1
            m5666(r2, r3, r4, r5, r6, r7)
            goto L171
        L18a:
            eh r0 = p000.C0248eh.f3550
            boolean r0 = p000.C0248eh.m1922()
            if (r0 != 0) goto L193
            goto L1ea
        L193:
            java.util.Map r1 = p000.C0248eh.f3554
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L1c7
            r0.<init>()     // Catch: java.lang.Throwable -> L1c7
            java.util.Set r2 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c7
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1c7
        L1a3:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1c7
            if (r3 == 0) goto L1c9
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1c7
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L1c7
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> L1c7
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L1c7
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L1c7
            if (r4 != 0) goto L1a3
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L1c7
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L1c7
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L1c7
            goto L1a3
        L1c7:
            r0 = move-exception
            goto L1eb
        L1c9:
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L1c7
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L1c7
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)     // Catch: java.lang.Throwable -> L1c7
            monitor-exit(r1)
            java.util.Iterator r0 = r0.iterator()
        L1d8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1ea
            java.lang.Object r1 = r0.next()
            eh r2 = p000.C0248eh.f3550
            java.lang.String r2 = "clean state sync"
            p000.C0248eh.m1924(r1, r2)
            goto L1d8
        L1ea:
            return
        L1eb:
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ж */
    public static void m5669(p000.C0834tg r2, android.view.View r3) {
            float r2 = r3.getAlpha()
            r0 = 2131618523(0x7f0deadb, float:1.8864059E38)
            java.lang.Object r1 = r3.getTag(r0)
            if (r1 != 0) goto L14
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.setTag(r0, r2)
        L14:
            return
    }

    /* JADX INFO: renamed from: з */
    public static void m5670() {
            r0 = 0
            p000.AbstractC0871ug.f10749 = r0
            r0 = 0
            p000.AbstractC0871ug.f10750 = r0
            p000.AbstractC0871ug.f10751 = r0
            r0 = 0
            p000.AbstractC0871ug.f10752 = r0
            return
    }

    /* JADX INFO: renamed from: и */
    public static java.lang.String m5671(int r2, android.view.View r3, java.lang.String r4) {
            r0 = 1
            if (r2 != r0) goto L22
            java.lang.String r1 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11171B5DA0BE514FE985D742D83AAE78638743D2BA3687C926224D31E60992AEED40D196DAE2A28FB8E8F48913"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r3 = m5642(r3, r1)
            if (r3 != 0) goto L1f
            java.lang.String r3 = "music cover"
            boolean r3 = p000.q02.m4654(r4, r3, r0)
            if (r3 != 0) goto L1f
            java.lang.String r3 = "listen cover"
            boolean r3 = p000.q02.m4654(r4, r3, r0)
            if (r3 == 0) goto L22
        L1f:
            java.lang.String r2 = "唱片"
            return r2
        L22:
            if (r2 != r0) goto L27
            java.lang.String r2 = "右侧控件区"
            return r2
        L27:
            r3 = 3
            if (r2 != r3) goto L2d
            java.lang.String r2 = "顶栏"
            return r2
        L2d:
            r3 = 2
            if (r2 != r3) goto L33
            java.lang.String r2 = "文案区"
            return r2
        L33:
            r3 = 4
            if (r2 != r3) goto L39
            java.lang.String r2 = "底栏杂项"
            return r2
        L39:
            r3 = 6
            if (r2 != r3) goto L3f
            java.lang.String r2 = "底栏杂项入口"
            return r2
        L3f:
            r3 = 7
            if (r2 != r3) goto L45
            java.lang.String r2 = "全屏观看"
            return r2
        L45:
            r3 = 8
            if (r2 != r3) goto L4c
            java.lang.String r2 = "Feed 弹幕按钮"
            return r2
        L4c:
            r3 = 5
            if (r2 != r3) goto L52
            java.lang.String r2 = "文档异常控件"
            return r2
        L52:
            java.lang.String r2 = "未知区域"
            return r2
    }

    /* JADX INFO: renamed from: й */
    public static void m5672() {
            m5680()
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0871ug.f10769
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lad
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            eg r3 = new eg
            r4 = 1
            r3.<init>(r2, r4)
            p000.AbstractC0984xh.m6652(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r1.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L38
            r4 = 2131618514(0x7f0dead2, float:1.886404E38)
            java.lang.Object r5 = r3.getTag(r4)
            boolean r6 = r5 instanceof android.animation.ValueAnimator
            r7 = 0
            if (r6 == 0) goto L5b
            android.animation.ValueAnimator r5 = (android.animation.ValueAnimator) r5
            goto L5c
        L5b:
            r5 = r7
        L5c:
            if (r5 == 0) goto L61
            r5.cancel()
        L61:
            r3.setTag(r4, r7)
            tg r4 = p000.AbstractC0871ug.f10771
            m5676(r3)
            r4 = 2
            if (r2 != r4) goto L88
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 != 0) goto L71
            goto L88
        L71:
            r4 = r3
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r5 = r4.getChildCount()
            r6 = 0
        L79:
            if (r6 >= r5) goto L88
            android.view.View r8 = r4.getChildAt(r6)
            r8.getClass()
            m5681(r8)
            int r6 = r6 + 1
            goto L79
        L88:
            r4 = 2131618523(0x7f0deadb, float:1.8864059E38)
            java.lang.Object r5 = r3.getTag(r4)
            boolean r6 = r5 instanceof java.lang.Float
            if (r6 == 0) goto L96
            java.lang.Float r5 = (java.lang.Float) r5
            goto L97
        L96:
            r5 = r7
        L97:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto La0
            float r5 = r5.floatValue()
            goto La1
        La0:
            r5 = r6
        La1:
            r3.setTag(r4, r7)
            r4 = 0
            float r4 = p000.j81.m2905(r5, r4, r6)
            m5677(r3, r4)
            goto L38
        Lad:
            return
    }

    /* JADX INFO: renamed from: к */
    public static void m5673(android.view.View r7) {
            int r0 = r7.getTop()     // Catch: java.lang.Throwable -> L13
            r1 = 2131618535(0x7f0deae7, float:1.8864083E38)
            java.lang.Object r2 = r7.getTag(r1)     // Catch: java.lang.Throwable -> L13
            boolean r3 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L13
            r4 = 0
            if (r3 == 0) goto L15
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = move-exception
            goto L46
        L15:
            r2 = r4
        L16:
            r3 = 2131618536(0x7f0deae8, float:1.8864085E38)
            java.lang.Object r5 = r7.getTag(r3)     // Catch: java.lang.Throwable -> L13
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L24
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L13
            goto L25
        L24:
            r5 = r4
        L25:
            if (r2 == 0) goto L3d
            if (r5 == 0) goto L3d
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L13
            if (r0 != r5) goto L3d
            int r5 = r2.intValue()     // Catch: java.lang.Throwable -> L13
            if (r0 == r5) goto L3d
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L13
            int r2 = r2 - r0
            r7.offsetTopAndBottom(r2)     // Catch: java.lang.Throwable -> L13
        L3d:
            r7.setTag(r1, r4)     // Catch: java.lang.Throwable -> L13
            r7.setTag(r3, r4)     // Catch: java.lang.Throwable -> L13
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L13
            goto L4c
        L46:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L4c:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L63
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "rdc76cfdafb4a32b8"
            p000.AbstractC0602nx.m4121(r1, r7, r0)
        L63:
            return
    }

    /* JADX INFO: renamed from: л */
    public static void m5674(android.view.View r4) {
            m5653(r4)
            m5676(r4)
            java.lang.String r0 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m5642(r4, r0)
            if (r0 == 0) goto L2e
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 != 0) goto L17
            goto L2e
        L17:
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            r2 = 0
        L1f:
            if (r2 >= r1) goto L2e
            android.view.View r3 = r0.getChildAt(r2)
            r3.getClass()
            m5681(r3)
            int r2 = r2 + 1
            goto L1f
        L2e:
            m5682(r4)
            r0 = 2131618523(0x7f0deadb, float:1.8864059E38)
            java.lang.Object r1 = r4.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Float
            r3 = 0
            if (r2 == 0) goto L40
            java.lang.Float r1 = (java.lang.Float) r1
            goto L41
        L40:
            r1 = r3
        L41:
            if (r1 == 0) goto L54
            float r1 = r1.floatValue()
            r4.setTag(r0, r3)
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = p000.j81.m2905(r1, r0, r2)
            m5677(r4, r0)
        L54:
            return
    }

    /* JADX INFO: renamed from: м */
    public static void m5675(android.view.View r6) {
            java.lang.String r0 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D6AA2F8632C81877EA9DEE34649246A2C86F42"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = m5642(r6, r0)
            if (r0 != 0) goto Le
            goto La9
        Le:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r1 = p000.AbstractC0871ug.f10769
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.util.Set r1 = (java.util.Set) r1
            r2 = 2131618537(0x7f0deae9, float:1.8864087E38)
            if (r1 == 0) goto L53
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r1.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L2b
            java.lang.Object r4 = r3.getTag(r2)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L4c
            goto L4d
        L4c:
            r3 = 0
        L4d:
            if (r3 == 0) goto L2b
            r0.add(r3)
            goto L2b
        L53:
            eh r1 = p000.C0248eh.f3550
            java.util.ArrayList r1 = p000.C0248eh.m1920()
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r1.next()
            android.view.View r3 = (android.view.View) r3
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.setTag(r2, r4)
            tg r4 = p000.AbstractC0871ug.f10771
            r4.m5695(r3)
            r0.add(r3)
            goto L5d
        L77:
            java.util.Iterator r0 = r0.iterator()
        L7b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            if (r1 == r6) goto L7b
            tg r2 = p000.AbstractC0871ug.f10771
            android.view.ViewParent r2 = r1.getParent()
            r3 = 0
        L90:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L7b
            r4 = 24
            if (r3 >= r4) goto L7b
            if (r2 != r6) goto La0
            tg r2 = p000.AbstractC0871ug.f10771
            m5673(r1)
            goto L7b
        La0:
            android.view.View r2 = (android.view.View) r2
            android.view.ViewParent r2 = r2.getParent()
            int r3 = r3 + 1
            goto L90
        La9:
            return
    }

    /* JADX INFO: renamed from: н */
    public static void m5676(android.view.View r5) {
            r0 = 2131618521(0x7f0dead9, float:1.8864055E38)
            java.lang.Object r1 = r5.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L10
            return
        L10:
            r1 = 2131618525(0x7f0deadd, float:1.8864063E38)
            java.lang.Object r2 = r5.getTag(r1)
            boolean r3 = r2 instanceof java.lang.Integer
            r4 = 0
            if (r3 == 0) goto L1f
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L20
        L1f:
            r2 = r4
        L20:
            if (r2 == 0) goto L27
            int r2 = r2.intValue()
            goto L28
        L27:
            r2 = 0
        L28:
            r5.setTag(r0, r4)
            r5.setTag(r1, r4)
            m5639(r5, r2)
            return
    }

    /* JADX INFO: renamed from: р */
    public static void m5677(android.view.View r1, float r2) {
            int r0 = p000.AbstractC0871ug.f10792
            int r0 = r0 + 1
            p000.AbstractC0871ug.f10792 = r0
            r1.setAlpha(r2)     // Catch: java.lang.Throwable -> L10
            int r1 = p000.AbstractC0871ug.f10792
            int r1 = r1 + (-1)
            p000.AbstractC0871ug.f10792 = r1
            return
        L10:
            r1 = move-exception
            int r2 = p000.AbstractC0871ug.f10792
            int r2 = r2 + (-1)
            p000.AbstractC0871ug.f10792 = r2
            throw r1
    }

    /* JADX INFO: renamed from: с */
    public static boolean m5678(int r1) {
            r0 = 3
            if (r1 == r0) goto Lc
            boolean r1 = m5645(r1)
            if (r1 == 0) goto La
            goto Lc
        La:
            r1 = 0
            return r1
        Lc:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: т */
    public static boolean m5679(android.view.View r5, int r6) {
            r0 = 4
            r1 = 0
            if (r6 == r0) goto L6
            goto L7d
        L6:
            r6 = 7
            r0 = 8
            int[] r6 = new int[]{r6, r0}
            r0 = r1
        Le:
            r2 = 2
            if (r0 >= r2) goto L7d
            r2 = r6[r0]
            java.util.concurrent.ConcurrentHashMap r3 = p000.AbstractC0871ug.f10769
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L22
            goto L7a
        L22:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r4.getClass()
            java.lang.Object r4 = r4.get()
            if (r4 != 0) goto L28
            r3.remove()
            goto L28
        L41:
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L4f
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4f
            goto L7a
        L4f:
            java.util.Iterator r2 = r2.iterator()
        L53:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L68
            goto L53
        L68:
            boolean r4 = r3.isAttachedToWindow()
            if (r4 == 0) goto L53
            if (r3 == r5) goto L53
            tg r4 = p000.AbstractC0871ug.f10771
            boolean r3 = m5643(r3, r5)
            if (r3 == 0) goto L53
            r5 = 1
            return r5
        L7a:
            int r0 = r0 + 1
            goto Le
        L7d:
            return r1
    }

    /* JADX INFO: renamed from: у */
    public static void m5680() {
            java.util.Set r0 = p000.cp0.f2703
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r1 = p000.cp0.f2706
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            θ r2 = new θ
            r3 = 22
            r2.<init>(r3, r0)
            p000.AbstractC0984xh.m6652(r1, r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r0.next()
            r4 = r3
            android.view.View r4 = (android.view.View) r4
            int r4 = java.lang.System.identityHashCode(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L23
            r2.add(r3)
            goto L23
        L42:
            java.util.Iterator r0 = r2.iterator()
        L46:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            tg r2 = p000.AbstractC0871ug.f10771
            r3 = 0
            r2.m5693(r1, r3)
            goto L46
        L59:
            return
    }

    /* JADX INFO: renamed from: ф */
    public static void m5681(android.view.View r4) {
            r0 = 2131618524(0x7f0deadc, float:1.886406E38)
            java.lang.Object r1 = r4.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Float
            r3 = 0
            if (r2 == 0) goto Lf
            java.lang.Float r1 = (java.lang.Float) r1
            goto L10
        Lf:
            r1 = r3
        L10:
            if (r1 == 0) goto L33
            float r1 = r1.floatValue()
            r4.setTag(r0, r3)
            float r0 = r4.getAlpha()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r2 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L33
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = p000.j81.m2905(r1, r0, r2)
            m5677(r4, r0)
        L33:
            return
    }

    /* JADX INFO: renamed from: х */
    public static void m5682(android.view.View r5) {
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 != 0) goto L5
            goto L2b
        L5:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L2b
            android.view.View r2 = r5.getChildAt(r1)
            r3 = 2131618522(0x7f0deada, float:1.8864057E38)
            java.lang.Object r3 = r2.getTag(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L22
            goto L28
        L22:
            m5681(r2)
            m5682(r2)
        L28:
            int r1 = r1 + 1
            goto Lc
        L2b:
            return
    }

    /* JADX INFO: renamed from: ч */
    public static void m5683(android.view.View r2, int r3) {
            boolean r0 = m5644(r3)
            if (r0 != 0) goto L7
            goto L15
        L7:
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0871ug.f10769
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            if (r3 != 0) goto L16
        L15:
            return
        L16:
            r0 = r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            r1.getClass()
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L1d
        L36:
            r0.remove()
            goto L1d
        L3a:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r3.add(r0)
            return
    }

    /* JADX INFO: renamed from: ш */
    public static void m5684(android.view.View r1, int r2) {
            boolean r0 = m5644(r2)
            if (r0 != 0) goto L7
            goto L38
        L7:
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0871ug.f10769
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L38
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            r0.getClass()
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L34
            if (r0 != r1) goto L1b
        L34:
            r2.remove()
            goto L1b
        L38:
            return
    }

    /* JADX INFO: renamed from: щ */
    public static void m5685(java.lang.String r7) {
            boolean r0 = m5640()
            if (r0 == 0) goto L18
            boolean r0 = p000.AbstractC0871ug.f10788
            if (r0 == 0) goto L18
            boolean r0 = p000.AbstractC0871ug.f10790
            if (r0 == 0) goto L18
            boolean r0 = p000.AbstractC0871ug.f10793
            if (r0 == 0) goto L18
            boolean r0 = p000.AbstractC0871ug.f10794
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            boolean r1 = p000.AbstractC0871ug.f10793
            boolean r2 = p000.AbstractC0871ug.f10794
            boolean r3 = p000.AbstractC0871ug.f10788
            boolean r4 = p000.AbstractC0871ug.f10790
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "re92b1ad19855843a"
            r5.<init>(r6)
            r5.append(r0)
            r5.append(r1)
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            java.lang.String r1 = "rf9ef3362bd85f5b5"
            p000.C0888ux.m5975(r1, r7)
            sb r7 = p000.C0792sb.f9786     // Catch: java.lang.Throwable -> L4b
            p000.C0792sb.m5428(r0)     // Catch: java.lang.Throwable -> L4b
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L4b
            goto L52
        L4b:
            r7 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r7)
            r7 = r0
        L52:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L61
            java.lang.String r7 = r7.getMessage()
            java.lang.String r0 = "r45145d7acf794178"
            p000.AbstractC0602nx.m4142(r0, r7)
        L61:
            return
    }

    /* JADX INFO: renamed from: Β */
    public final void m5686(p000.z81 r6) {
            r5 = this;
            java.lang.String r0 = "r73fa9ffd19a3a15b"
            java.lang.ClassLoader r6 = r6.f13011
            java.lang.ClassLoader r1 = p000.AbstractC0871ug.f10778
            if (r1 != r6) goto L9
            goto L4c
        L9:
            java.lang.String r1 = "~796896D9FD9A99E3FF60F870F520A872CAB9C9E837D81AFF017266A3E9979F463DE356D00EC2BD454B6297D77AC58FCC046CA8A6B257A19D285C5090E83692"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = m5661(r6, r1)
            if (r1 != 0) goto L1b
            java.lang.String r5 = "r58be7ef7c971f2c9"
            p000.C0888ux.m5985(r5)
            return
        L1b:
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L36
            pg r3 = new pg     // Catch: java.lang.Throwable -> L36
            r4 = 3
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L36
            r2.m6773(r1, r3)     // Catch: java.lang.Throwable -> L36
            p000.AbstractC0871ug.f10778 = r6     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r1.getName()     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L36
            p000.C0888ux.m5985(r5)     // Catch: java.lang.Throwable -> L36
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L3d:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L4c
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "r53cbe97f99eca8a4"
            p000.AbstractC0602nx.m4142(r6, r5)
        L4c:
            return
    }

    /* JADX INFO: renamed from: Δ */
    public final void m5687(p000.z81 r5) {
            r4 = this;
            kh r0 = p000.C0469kh.f5917
            java.lang.String r0 = "clean_mode_playback"
            boolean r1 = p000.C0469kh.f5920
            r2 = 1
            if (r1 == 0) goto La
            goto L25
        La:
            p000.C0469kh.f5920 = r2
            java.util.concurrent.ConcurrentHashMap r1 = p000.C0777rx.f9562
            gh r1 = new gh
            r3 = 4
            r1.<init>(r3)
            p000.C0777rx.m5178(r0, r1)
            gh r1 = new gh
            r3 = 5
            r1.<init>(r3)
            p000.C0777rx.m5177(r0, r1)
            java.lang.String r0 = "re6db9aaa4394f758"
            p000.C0888ux.m5985(r0)
        L25:
            x00 r0 = p000.x00.f11959     // Catch: java.lang.Throwable -> L2f
            java.lang.ClassLoader r1 = r5.f13011     // Catch: java.lang.Throwable -> L2f
            r0.m6471(r1)     // Catch: java.lang.Throwable -> L2f
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L36:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "rd584aa97335f952f"
            p000.AbstractC0602nx.m4142(r1, r0)
        L45:
            boolean r0 = p000.AbstractC0871ug.f10756
            if (r0 == 0) goto L4a
            goto L60
        L4a:
            monitor-enter(r4)
            boolean r0 = p000.AbstractC0871ug.f10756     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L51
            monitor-exit(r4)
            goto L60
        L51:
            pq r0 = p000.C0696pq.f8651     // Catch: java.lang.Throwable -> L6f
            we r0 = p000.AbstractC0871ug.f10768     // Catch: java.lang.Throwable -> L6f
            r0.getClass()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.CopyOnWriteArraySet r1 = p000.C0696pq.f8660     // Catch: java.lang.Throwable -> L6f
            r1.add(r0)     // Catch: java.lang.Throwable -> L6f
            p000.AbstractC0871ug.f10756 = r2     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
        L60:
            boolean r4 = p000.AbstractC0871ug.f10755
            if (r4 == 0) goto L65
            return
        L65:
            p000.AbstractC0871ug.f10755 = r2
            kh r4 = p000.C0469kh.f5917
            java.lang.ClassLoader r5 = r5.f13011
            r4.m3264(r5)
            return
        L6f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* JADX INFO: renamed from: Ε */
    public final void m5688(p000.z81 r10) {
            r9 = this;
            java.lang.String r0 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D6AA2F8632C81877EA9DEE34649246A2C86F42"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.ClassLoader r10 = r10.f13011
            java.lang.Class r2 = m5661(r10, r0)
            if (r2 != 0) goto L14
            java.lang.String r9 = "r1928b29b38ea3aa6"
            p000.C0888ux.m5985(r9)
            return
        L14:
            java.lang.String r5 = "右侧控件区"
            r6 = 0
            r3 = 1
            java.lang.String r4 = "right panel"
            r1 = r9
            r1.m5689(r2, r3, r4, r5, r6)
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r9.getClass()
            java.lang.Class r10 = java.lang.Integer.TYPE
            r10.getClass()
            java.lang.Class[] r4 = new java.lang.Class[]{r9, r10, r10, r10, r10}
            r9 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.String r8 = "右侧控件区"
            java.lang.String r3 = "onLayout"
            java.lang.String r5 = "right panel layout"
            r1.m5701(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    /* JADX INFO: renamed from: Θ */
    public final void m5689(java.lang.Class r11, int r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            r10 = this;
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L12
            rg r2 = new rg     // Catch: java.lang.Throwable -> L12
            r8 = 0
            r3 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.m6773(r11, r2)     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L19:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "r1ec63fc92b91b33d"
            p000.AbstractC0602nx.m4121(r2, r13, r0)
        L28:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L3c
            java.lang.String r9 = "onAttachedToWindow"
            rg r2 = new rg     // Catch: java.lang.Throwable -> L3c
            r8 = 1
            r3 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3c
            java.util.Set r0 = r0.m6774(r11, r9, r2)     // Catch: java.lang.Throwable -> L3c
            goto L43
        L3c:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L43:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L52
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "rb9064f75649eda9"
            p000.AbstractC0602nx.m4121(r1, r13, r0)
        L52:
            return
    }

    /* JADX INFO: renamed from: Ι */
    public final void m5690(p000.z81 r13, boolean r14, boolean r15) {
            r12 = this;
            java.lang.String r0 = "rc06208ca4f0fef1f"
            p000.C0888ux.m5985(r0)
            p000.AbstractC0871ug.f10760 = r14
            p000.AbstractC0871ug.f10761 = r15
            p000.AbstractC0871ug.f10762 = r13
            java.lang.String r14 = "clean_mode_bottom_misc_resolver"
            java.util.concurrent.atomic.AtomicBoolean r15 = p000.C0017ag.f219
            r1 = 0
            r2 = 1
            boolean r15 = r15.compareAndSet(r1, r2)
            if (r15 != 0) goto L18
            goto L2e
        L18:
            java.util.concurrent.ConcurrentHashMap r15 = p000.C0777rx.f9562
            we r15 = new we
            r0 = 18
            r15.<init>(r0)
            p000.C0777rx.m5178(r14, r15)
            we r15 = new we
            r0 = 19
            r15.<init>(r0)
            p000.C0777rx.m5177(r14, r15)
        L2e:
            java.lang.String r14 = "android.app.Activity"
            java.lang.Object r15 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L55
            java.lang.ClassLoader r15 = r13.f13011     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "onResume"
            h r3 = new h     // Catch: java.lang.Throwable -> L55
            r4 = 5
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L55
            p000.qe0.m4874(r14, r15, r0, r3)     // Catch: java.lang.Throwable -> L55
            java.lang.ClassLoader r15 = r13.f13011     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "onPause"
            h r3 = new h     // Catch: java.lang.Throwable -> L55
            r4 = 6
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L55
            p000.qe0.m4874(r14, r15, r0, r3)     // Catch: java.lang.Throwable -> L55
            goto L60
        L55:
            r0 = move-exception
            r14 = r0
            java.lang.String r14 = r14.getMessage()
            java.lang.String r15 = "ra1a282e126eadf5b"
            p000.AbstractC0602nx.m4142(r15, r14)
        L60:
            eh r14 = p000.C0248eh.f3550
            java.lang.ClassLoader r15 = r13.f13011
            ig r0 = new ig
            r0.<init>(r2)
            w0 r3 = new w0
            java.lang.Class<tg> r6 = p000.C0834tg.class
            java.lang.String r7 = "shouldSuppressGlMusicCover"
            java.lang.String r8 = "shouldSuppressGlMusicCover()Z"
            r9 = 0
            r10 = 1
            r4 = 0
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            monitor-enter(r14)
            r15.getClass()     // Catch: java.lang.Throwable -> L96
            p000.C0248eh.f3557 = r3     // Catch: java.lang.Throwable -> L96
            java.util.List r12 = p000.C0248eh.f3551     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L96
        L84:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> L96
            dh r3 = (p000.C0212dh) r3     // Catch: java.lang.Throwable -> L96
            eh r4 = p000.C0248eh.f3550     // Catch: java.lang.Throwable -> L96
            r4.m1925(r15, r3, r0)     // Catch: java.lang.Throwable -> L96
            goto L84
        L96:
            r0 = move-exception
            r12 = r0
            goto L183
        L9a:
            p000.C0248eh.m1921(r15)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r14)
            java.lang.ClassLoader r12 = r13.f13011
            java.lang.ClassLoader r14 = p000.AbstractC0871ug.f10775
            if (r14 != r12) goto La5
            goto Le3
        La5:
            monitor-enter(r5)
            java.lang.ClassLoader r14 = p000.AbstractC0871ug.f10775     // Catch: java.lang.Throwable -> L17f
            if (r14 != r12) goto Lac
            monitor-exit(r5)
            goto Le3
        Lac:
            tg r6 = p000.AbstractC0871ug.f10771     // Catch: java.lang.Throwable -> L17f
            r6.m5688(r13)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r14 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11171B5DA0BE514FE985D742D83AAE78638743D2BA3687C926224D31E60992AEED40D196DAE2A28FB8E8F48913"
            java.lang.String r14 = p000.jf0.m2957(r14)     // Catch: java.lang.Throwable -> L17f
            java.lang.ClassLoader r15 = r13.f13011     // Catch: java.lang.Throwable -> L17f
            java.lang.Class r7 = m5661(r15, r14)     // Catch: java.lang.Throwable -> L17f
            if (r7 != 0) goto Lc5
            java.lang.String r14 = "r509ac0e31486e47c"
            p000.C0888ux.m5985(r14)     // Catch: java.lang.Throwable -> L17f
            goto Lce
        Lc5:
            java.lang.String r9 = "music cover container"
            java.lang.String r10 = "唱片"
            r11 = 1
            r8 = 1
            r6.m5689(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L17f
        Lce:
            r6.m5700(r13)     // Catch: java.lang.Throwable -> L17f
            m5636(r13)     // Catch: java.lang.Throwable -> L17f
            m5637(r13)     // Catch: java.lang.Throwable -> L17f
            m5635(r13)     // Catch: java.lang.Throwable -> L17f
            r6.m5686(r13)     // Catch: java.lang.Throwable -> L17f
            r6.m5702(r13)     // Catch: java.lang.Throwable -> L17f
            p000.AbstractC0871ug.f10775 = r12     // Catch: java.lang.Throwable -> L17f
            monitor-exit(r5)
        Le3:
            java.lang.Class<android.view.View> r12 = android.view.View.class
            boolean r13 = p000.AbstractC0871ug.f10774
            if (r13 == 0) goto Lea
            goto L135
        Lea:
            p000.AbstractC0871ug.f10774 = r2
            java.lang.Object r13 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L11a
            java.lang.String r13 = "setAlpha"
            java.lang.Class r14 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L11a
            h r15 = new h     // Catch: java.lang.Throwable -> L11a
            r0 = 9
            r15.<init>(r0, r5)     // Catch: java.lang.Throwable -> L11a
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r15}     // Catch: java.lang.Throwable -> L11a
            p000.qe0.m4873(r12, r13, r14)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r13 = "setVisibility"
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L11a
            h r15 = new h     // Catch: java.lang.Throwable -> L11a
            r0 = 10
            r15.<init>(r0, r5)     // Catch: java.lang.Throwable -> L11a
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r15}     // Catch: java.lang.Throwable -> L11a
            p000.qe0.m4873(r12, r13, r14)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r12 = "re4cefdf117d5eb0f"
            p000.C0888ux.m5985(r12)     // Catch: java.lang.Throwable -> L11a
            s62 r12 = p000.s62.f9751     // Catch: java.lang.Throwable -> L11a
            goto L122
        L11a:
            r0 = move-exception
            r12 = r0
            eo1 r13 = new eo1
            r13.<init>(r12)
            r12 = r13
        L122:
            java.lang.Throwable r12 = p000.fo1.m2190(r12)
            if (r12 == 0) goto L135
            tg r13 = p000.AbstractC0871ug.f10771
            p000.AbstractC0871ug.f10774 = r1
            java.lang.String r12 = r12.getMessage()
            java.lang.String r13 = "ra93b4920430201a3"
            p000.AbstractC0602nx.m4142(r13, r12)
        L135:
            boolean r12 = p000.AbstractC0871ug.f10764
            if (r12 != 0) goto L153
            p000.AbstractC0871ug.f10764 = r2
            we r12 = new we
            r13 = 25
            r12.<init>(r13)
            java.util.concurrent.CopyOnWriteArrayList r13 = p000.ui1.f10852
            r13.add(r12)
            we r12 = new we
            r13 = 26
            r12.<init>(r13)
            java.util.concurrent.CopyOnWriteArrayList r13 = p000.ui1.f10853
            r13.add(r12)
        L153:
            boolean r12 = p000.ui1.m5867()
            if (r12 == 0) goto L17e
            java.lang.String r12 = "clean_mode_enabled"
            boolean r12 = p000.ui1.m5887(r12, r1)
            if (r12 != 0) goto L16f
            java.lang.String r12 = "clean_auto_hide"
            boolean r12 = p000.ui1.m5887(r12, r1)
            if (r12 != 0) goto L16f
            boolean r12 = p000.ui1.m5899()
            if (r12 == 0) goto L17e
        L16f:
            m5668()
            boolean r12 = m5640()
            if (r12 == 0) goto L17b
            r5.m5697()
        L17b:
            r5.m5698()
        L17e:
            return
        L17f:
            r0 = move-exception
            r12 = r0
            monitor-exit(r5)
            throw r12
        L183:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L96
            throw r12
    }

    /* JADX INFO: renamed from: Τ */
    public final void m5691(android.view.View r7, java.lang.String r8) {
            r6 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1a
            android.os.Handler r6 = p000.AbstractC0871ug.f10780
            dg r0 = new dg
            r1 = 1
            r0.<init>(r1, r7, r8)
            r6.post(r0)
            return
        L1a:
            r0 = 2131618513(0x7f0dead1, float:1.8864038E38)
            java.lang.Object r1 = r7.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Integer
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L2a
        L29:
            r1 = r3
        L2a:
            r2 = 2
            if (r1 == 0) goto L3a
            int r4 = r1.intValue()
            if (r4 == r2) goto L3a
            int r4 = r1.intValue()
            m5684(r7, r4)
        L3a:
            r4 = 0
            if (r1 != 0) goto L3e
            goto L44
        L3e:
            int r1 = r1.intValue()
            if (r1 == r2) goto L46
        L44:
            r1 = 1
            goto L47
        L46:
            r1 = r4
        L47:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r7.setTag(r0, r5)
            r0 = 2131618522(0x7f0deada, float:1.8864057E38)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r7.setTag(r0, r5)
            m5669(r6, r7)
            m5683(r7, r2)
            m5652(r7)
            r0 = 2131618531(0x7f0deae3, float:1.8864075E38)
            java.lang.String r5 = "文案区"
            r7.setTag(r0, r5)
            if (r1 == 0) goto L72
            r0 = 2131618532(0x7f0deae4, float:1.8864077E38)
            r7.setTag(r0, r3)
            m5665(r7, r2, r8, r5)
        L72:
            boolean r8 = m5640()
            if (r8 == 0) goto L8b
            r6.m5694(r7, r2, r4)
            boolean r6 = r7.isAttachedToWindow()
            if (r6 != 0) goto L8b
            jb r6 = new jb
            r8 = 12
            r6.<init>(r7, r8)
            r7.post(r6)
        L8b:
            return
    }

    /* JADX INFO: renamed from: Υ */
    public final void m5692(android.view.View r5) {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1b
            android.os.Handler r4 = p000.AbstractC0871ug.f10780
            jb r0 = new jb
            r1 = 11
            r0.<init>(r5, r1)
            r4.post(r0)
            return
        L1b:
            r0 = 2131618513(0x7f0dead1, float:1.8864038E38)
            java.lang.Object r1 = r5.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L29
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L2a
        L29:
            r1 = 0
        L2a:
            r2 = 5
            if (r1 == 0) goto L3a
            int r3 = r1.intValue()
            if (r3 == r2) goto L3a
            int r1 = r1.intValue()
            m5684(r5, r1)
        L3a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5.setTag(r0, r1)
            m5683(r5, r2)
            m5669(r4, r5)
            boolean r0 = p000.AbstractC0871ug.f10783
            if (r0 == 0) goto L4f
            r0 = 0
            r4.m5694(r5, r2, r0)
        L4f:
            return
    }

    /* JADX INFO: renamed from: Φ */
    public final void m5693(android.view.View r7, boolean r8) {
            r6 = this;
            r0 = 2131618513(0x7f0dead1, float:1.8864038E38)
            java.lang.Object r1 = r7.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Integer
            r3 = 0
            if (r2 == 0) goto Lf
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L10
        Lf:
            r1 = r3
        L10:
            l91 r2 = m5662(r7)
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r2.f6502
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L1b:
            r2 = 2131618522(0x7f0deada, float:1.8864057E38)
            r4 = 7
            if (r1 != 0) goto L22
            goto L28
        L22:
            int r5 = r1.intValue()
            if (r5 == r4) goto L46
        L28:
            if (r1 == 0) goto L33
            int r1 = r1.intValue()
            tg r5 = p000.AbstractC0871ug.f10771
            m5684(r7, r1)
        L33:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r7.setTag(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.setTag(r2, r0)
            m5669(r6, r7)
            m5683(r7, r4)
            goto L49
        L46:
            m5683(r7, r4)
        L49:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.setTag(r2, r0)
            r1 = 2131618531(0x7f0deae3, float:1.8864075E38)
            java.lang.String r2 = "全屏观看"
            r7.setTag(r1, r2)
            m5669(r6, r7)
            r1 = 2131618541(0x7f0deaed, float:1.8864095E38)
            java.lang.Object r2 = r7.getTag(r1)
            boolean r2 = p000.ln0.m3626(r2, r0)
            if (r2 == 0) goto L67
            goto L73
        L67:
            r7.setTag(r1, r0)
            lg r0 = new lg
            r1 = 3
            r0.<init>(r1)
            r7.addOnAttachStateChangeListener(r0)
        L73:
            if (r8 == 0) goto L94
            boolean r8 = m5640()
            if (r8 == 0) goto L94
            r8 = 0
            r6.m5694(r7, r4, r8)
            if (r3 == 0) goto L94
            tg r6 = p000.AbstractC0871ug.f10771
            java.lang.Integer r7 = m5664(r3)
            if (r7 != 0) goto L8a
            goto L94
        L8a:
            int r7 = r7.intValue()
            r0 = 4
            if (r7 != r0) goto L94
            r6.m5694(r3, r0, r8)
        L94:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m5694(android.view.View r13, int r14, boolean r15) {
            r12 = this;
            r0 = -2
            if (r14 != r0) goto L5
            goto L1ef
        L5:
            boolean r0 = m5644(r14)
            if (r0 == 0) goto Le
            m5669(r12, r13)
        Le:
            boolean r12 = m5679(r13, r14)
            if (r12 == 0) goto L18
            m5674(r13)
            return
        L18:
            r12 = 3
            r0 = 0
            r1 = 0
            if (r14 != r12) goto Lc0
            int r12 = r13.getVisibility()
            r2 = 8
            if (r12 != r2) goto L36
            r12 = 2131618521(0x7f0dead9, float:1.8864055E38)
            java.lang.Object r12 = r13.getTag(r12)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r12 = p000.ln0.m3626(r12, r3)
            if (r12 != 0) goto L36
            goto L1ef
        L36:
            boolean r12 = r13 instanceof android.widget.TextView
            if (r12 == 0) goto Lc0
            r12 = r13
            r3 = r1
        L3c:
            if (r12 == 0) goto Lc0
            r4 = 15
            if (r3 >= r4) goto Lc0
            java.lang.Class r4 = r12.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BB38ACFA1A4C4DE4BF4639733A5CC5A954D77DF2D1F2F66A8C556D44DCD72183EB"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L90
            java.lang.Class r4 = r12.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C6D8DCD83B75146CBF9196B2C921758D9CBA4D1CA59A5F99A4AA8365B129A65D23E9E653551AF9B481B4"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L90
            boolean r4 = p000.AbstractC0871ug.f10760
            if (r4 == 0) goto L81
            java.util.Set r4 = p000.AbstractC0724qh.f9005
            java.lang.Class r4 = r12.getClass()
            java.lang.String r4 = r4.getName()
            java.util.Set r5 = p000.AbstractC0724qh.f9005
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L81
            goto L90
        L81:
            android.view.ViewParent r12 = r12.getParent()
            boolean r4 = r12 instanceof android.view.View
            if (r4 == 0) goto L8c
            android.view.View r12 = (android.view.View) r12
            goto L8d
        L8c:
            r12 = r0
        L8d:
            int r3 = r3 + 1
            goto L3c
        L90:
            r12 = r13
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.CharSequence r12 = r12.getText()
            if (r12 == 0) goto Lc0
            java.lang.String r12 = r12.toString()
            if (r12 == 0) goto Lc0
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r12 = r12.toString()
            if (r12 == 0) goto Lc0
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toLowerCase(r3)
            r12.getClass()
            int r3 = r12.length()
            if (r3 <= 0) goto Lc0
            int r12 = r12.length()
            if (r12 > r2) goto Lc0
            goto L1ef
        Lc0:
            r12 = 7
            if (r14 != r12) goto Lea
            java.util.Set r2 = p000.cp0.f2703
            if (r13 != 0) goto Lc9
            r2 = r1
            goto Ld6
        Lc9:
            r2 = 2131618529(0x7f0deae1, float:1.886407E38)
            java.lang.Object r2 = r13.getTag(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = p000.ln0.m3626(r2, r3)
        Ld6:
            if (r2 == 0) goto Lea
            java.lang.Float r14 = m5658(r13, r12)
            if (r14 != 0) goto Le2
            m5674(r13)
            return
        Le2:
            float r14 = r14.floatValue()
            m5651(r13, r12, r14, r15)
            return
        Lea:
            java.lang.Float r12 = m5658(r13, r14)
            if (r12 != 0) goto Lf4
            m5674(r13)
            return
        Lf4:
            float r2 = r12.floatValue()
            boolean r3 = m5644(r14)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L104
            goto L184
        L104:
            float r2 = p000.j81.m2905(r2, r5, r4)
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            if (r2 != 0) goto L116
            boolean r3 = m5678(r14)
            if (r3 == 0) goto L116
            r3 = r6
            goto L117
        L116:
            r3 = r1
        L117:
            int r7 = r14 << 10
            int r8 = r2 << 1
            r7 = r7 | r8
            r7 = r7 | r3
            r8 = 2131618532(0x7f0deae4, float:1.8864077E38)
            java.lang.Object r9 = r13.getTag(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 == 0) goto L12f
            goto L184
        L12f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.setTag(r8, r7)
            r7 = 2131618531(0x7f0deae3, float:1.8864075E38)
            java.lang.Object r7 = r13.getTag(r7)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L144
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
        L144:
            if (r0 != 0) goto L14c
            java.lang.String r0 = "state fallback"
            java.lang.String r0 = m5671(r14, r13, r0)
        L14c:
            java.lang.String r7 = m5660(r14)
            if (r3 == 0) goto L155
            java.lang.String r3 = "GONE"
            goto L157
        L155:
            java.lang.String r3 = "alpha"
        L157:
            java.lang.Class r8 = r13.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "] type="
            java.lang.String r10 = " target="
            java.lang.String r11 = "清爽调试状态 ["
            java.lang.StringBuilder r0 = p000.lz1.m3695(r11, r0, r9, r7, r10)
            java.lang.String r7 = "% hide="
            java.lang.String r9 = " animate="
            p000.lz1.m3671(r0, r2, r7, r3, r9)
            r0.append(r15)
            java.lang.String r2 = " class="
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "rf9ef3362bd85f5b5"
            p000.C0888ux.m5975(r2, r0)
        L184:
            r0 = 2
            if (r14 != r0) goto L1f0
            float r12 = r12.floatValue()
            m5653(r13)
            m5676(r13)
            float r14 = r13.getAlpha()
            float r14 = r14 - r4
            float r14 = java.lang.Math.abs(r14)
            r15 = 1008981770(0x3c23d70a, float:0.01)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L1a4
            m5677(r13, r4)
        L1a4:
            boolean r14 = r13 instanceof android.view.ViewGroup
            if (r14 != 0) goto L1a9
            goto L1ef
        L1a9:
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r14 = r13.getChildCount()
        L1af:
            if (r1 >= r14) goto L1ef
            android.view.View r0 = r13.getChildAt(r1)
            r0.getClass()
            r2 = 12
            boolean r2 = m5659(r0, r2)
            if (r2 == 0) goto L1c4
            m5681(r0)
            goto L1ec
        L1c4:
            r2 = 2131618524(0x7f0deadc, float:1.886406E38)
            java.lang.Object r3 = r0.getTag(r2)
            if (r3 != 0) goto L1d8
            float r3 = r0.getAlpha()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.setTag(r2, r3)
        L1d8:
            float r2 = r0.getAlpha()
            float r2 = r2 - r12
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 <= 0) goto L1ec
            float r2 = p000.j81.m2905(r12, r5, r4)
            m5677(r0, r2)
        L1ec:
            int r1 = r1 + 1
            goto L1af
        L1ef:
            return
        L1f0:
            float r12 = r12.floatValue()
            if (r15 == 0) goto L1fa
            r15 = 5
            if (r14 == r15) goto L1fa
            r1 = r6
        L1fa:
            m5651(r13, r14, r12, r1)
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m5695(android.view.View r6) {
            r5 = this;
            r0 = 2131618539(0x7f0deaeb, float:1.8864091E38)
            java.lang.Object r1 = r6.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L10
            goto L79
        L10:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2b
            android.os.Handler r5 = p000.AbstractC0871ug.f10780
            jb r0 = new jb
            r1 = 13
            r0.<init>(r6, r1)
            r5.post(r0)
            return
        L2b:
            java.lang.Object r1 = r6.getTag(r0)
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L36
            goto L79
        L36:
            lg r1 = new lg
            r3 = 1
            r1.<init>(r3)
            mg r3 = new mg
            r4 = 0
            r3.<init>(r4)
            r6.setTag(r0, r2)
            r6.addOnAttachStateChangeListener(r1)     // Catch: java.lang.Throwable -> L55
            r6.addOnLayoutChangeListener(r3)     // Catch: java.lang.Throwable -> L55
            boolean r2 = r6.isAttachedToWindow()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L57
            r5.m5705(r6)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r5 = move-exception
            goto L5a
        L57:
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L55
            goto L60
        L5a:
            eo1 r2 = new eo1
            r2.<init>(r5)
            r5 = r2
        L60:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L79
            r6.removeOnAttachStateChangeListener(r1)
            r6.removeOnLayoutChangeListener(r3)
            r1 = 0
            r6.setTag(r0, r1)
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "rccdb3dc3d2848481"
            p000.AbstractC0602nx.m4142(r6, r5)
        L79:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m5696(android.view.View r6) {
            r5 = this;
            r0 = 2131618540(0x7f0deaec, float:1.8864093E38)
            java.lang.Object r1 = r6.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L10
            goto L79
        L10:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2b
            android.os.Handler r5 = p000.AbstractC0871ug.f10780
            jb r0 = new jb
            r1 = 14
            r0.<init>(r6, r1)
            r5.post(r0)
            return
        L2b:
            java.lang.Object r1 = r6.getTag(r0)
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L36
            goto L79
        L36:
            lg r1 = new lg
            r3 = 2
            r1.<init>(r3)
            mg r3 = new mg
            r4 = 1
            r3.<init>(r4)
            r6.setTag(r0, r2)
            r6.addOnAttachStateChangeListener(r1)     // Catch: java.lang.Throwable -> L55
            r6.addOnLayoutChangeListener(r3)     // Catch: java.lang.Throwable -> L55
            boolean r2 = r6.isAttachedToWindow()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L57
            r5.m5705(r6)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r5 = move-exception
            goto L5a
        L57:
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L55
            goto L60
        L5a:
            eo1 r2 = new eo1
            r2.<init>(r5)
            r5 = r2
        L60:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L79
            r6.removeOnAttachStateChangeListener(r1)
            r6.removeOnLayoutChangeListener(r3)
            r1 = 0
            r6.setTag(r0, r1)
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "r81b4e64bc05b3429"
            p000.AbstractC0602nx.m4142(r6, r5)
        L79:
            return
    }

    /* JADX INFO: renamed from: ο */
    public final boolean m5697() {
            r11 = this;
            boolean r0 = p000.AbstractC0871ug.f10757
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            z81 r0 = p000.AbstractC0871ug.f10762
            if (r0 != 0) goto Lc
            r11 = 0
            return r11
        Lc:
            monitor-enter(r11)
            boolean r2 = p000.AbstractC0871ug.f10757     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L13
            monitor-exit(r11)
            return r1
        L13:
            java.util.Set r2 = p000.cp0.f2703     // Catch: java.lang.Throwable -> L3d
            ng r3 = new ng     // Catch: java.lang.Throwable -> L3d
            tg r5 = p000.AbstractC0871ug.f10771     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<tg> r6 = p000.C0834tg.class
            java.lang.String r7 = "onLandscapeEntranceMiscControlRecorded"
            java.lang.String r8 = "onLandscapeEntranceMiscControlRecorded(Landroid/view/View;)V"
            r9 = 0
            r10 = 0
            r4 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3d
            p000.cp0.m1604(r0, r3)     // Catch: java.lang.Throwable -> L3d
            r5.m5703(r0)     // Catch: java.lang.Throwable -> L3d
            r5.m5687(r0)     // Catch: java.lang.Throwable -> L3d
            r5.m5698()     // Catch: java.lang.Throwable -> L3d
            r5.m5707()     // Catch: java.lang.Throwable -> L3d
            p000.AbstractC0871ug.f10757 = r1     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "r2c2f7248a5741c55"
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r11)
            return r1
        L3d:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
    }

    /* JADX INFO: renamed from: π */
    public final void m5698() {
            r3 = this;
            z81 r0 = p000.AbstractC0871ug.f10762
            if (r0 != 0) goto L5
            goto L3d
        L5:
            boolean r1 = p000.ui1.m5867()
            if (r1 == 0) goto L3d
            boolean r1 = p000.ui1.m5899()
            if (r1 != 0) goto L12
            goto L3d
        L12:
            boolean r1 = p000.AbstractC0871ug.f10758
            r2 = 1
            if (r1 != 0) goto L32
            monitor-enter(r3)
            boolean r1 = p000.AbstractC0871ug.f10758     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L2e
            boolean r1 = p000.ui1.m5899()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2e
            oh r1 = p000.C0623oh.f8099     // Catch: java.lang.Throwable -> L2c
            r1.m4245(r0)     // Catch: java.lang.Throwable -> L2c
            tg r1 = p000.AbstractC0871ug.f10771     // Catch: java.lang.Throwable -> L2c
            p000.AbstractC0871ug.f10758 = r2     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            monitor-exit(r3)
            goto L32
        L30:
            monitor-exit(r3)
            throw r0
        L32:
            java.lang.String r1 = "clean_progress_bar_restore_alpha_on_pause"
            boolean r1 = p000.ui1.m5887(r1, r2)
            if (r1 == 0) goto L3d
            r3.m5687(r0)
        L3d:
            return
    }

    /* JADX INFO: renamed from: υ */
    public final void m5699(android.view.View r6, java.lang.String r7) {
            r5 = this;
            if (r6 != 0) goto L4
            goto L77
        L4:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1d
            android.os.Handler r5 = p000.AbstractC0871ug.f10780
            dg r0 = new dg
            r0.<init>(r6, r7)
            r5.post(r0)
            return
        L1d:
            r0 = 0
            if (r7 == 0) goto L2e
            boolean r1 = p000.q02.m4671(r7)
            if (r1 == 0) goto L27
            goto L2e
        L27:
            java.util.Set r1 = p000.AbstractC0871ug.f10773
            boolean r7 = r1.contains(r7)
            goto L2f
        L2e:
            r7 = r0
        L2f:
            if (r7 != 0) goto L78
            boolean r7 = p000.AbstractC0871ug.f10760
            boolean r1 = p000.AbstractC0871ug.f10761
            int r2 = r6.getId()
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L3e
            goto L55
        L3e:
            if (r1 == 0) goto L44
            r7 = 2131415938(0x7f0ad382, float:1.8453167E38)
            goto L4d
        L44:
            if (r7 == 0) goto L4a
            r7 = 2131415976(0x7f0ad3a8, float:1.8453245E38)
            goto L4d
        L4a:
            r7 = 2131415709(0x7f0ad29d, float:1.8452703E38)
        L4d:
            int r1 = r6.getId()
            if (r1 != r7) goto L55
        L53:
            r0 = r4
            goto L75
        L55:
            java.lang.Class r7 = r6.getClass()
        L59:
            if (r7 == 0) goto L75
            java.lang.Class<android.view.View> r1 = android.view.View.class
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L75
            java.util.Set r1 = p000.AbstractC0871ug.f10773
            java.lang.String r2 = r7.getName()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L70
            goto L53
        L70:
            java.lang.Class r7 = r7.getSuperclass()
            goto L59
        L75:
            if (r0 != 0) goto L78
        L77:
            return
        L78:
            r5.m5692(r6)
            return
    }

    /* JADX INFO: renamed from: φ */
    public final void m5700(p000.z81 r10) {
            r9 = this;
            boolean r0 = p000.AbstractC0871ug.f10776
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.ClassLoader r10 = r10.f13011     // Catch: java.lang.Throwable -> L4c
            java.lang.Class r2 = p000.qe0.m4876(r10, r0)     // Catch: java.lang.Throwable -> L4c
            xq0 r10 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L4c
            h r0 = new h     // Catch: java.lang.Throwable -> L4c
            r1 = 7
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            r10.m6773(r2, r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "onAttachedToWindow"
            h r1 = new h     // Catch: java.lang.Throwable -> L4c
            r3 = 8
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            r10.m6774(r2, r0, r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "onMeasure"
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L4c
            r10.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.Class[] r4 = new java.lang.Class[]{r10, r10}     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "bottom info measure"
            r10 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = "文案区"
            r6 = 1
            r1 = r9
            r1.m5701(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4c
            r9 = 1
            p000.AbstractC0871ug.f10776 = r9     // Catch: java.lang.Throwable -> L4c
            java.lang.String r9 = "re18843b7ac92ec96"
            p000.C0888ux.m5985(r9)     // Catch: java.lang.Throwable -> L4c
            return
        L4c:
            r0 = move-exception
            r9 = r0
            java.lang.String r9 = r9.getMessage()
            java.lang.String r10 = "r2c9d446a8038a7a8"
            p000.AbstractC0602nx.m4142(r10, r9)
            return
    }

    /* JADX INFO: renamed from: χ */
    public final void m5701(java.lang.Class r9, java.lang.String r10, java.lang.Class[] r11, java.lang.String r12, boolean r13, java.lang.Integer r14, java.lang.String r15) {
            r8 = this;
            java.lang.String r1 = "rcf8060bfb76400f5"
            int r0 = r11.length     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Class[] r11 = (java.lang.Class[]) r11     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r10, r11)     // Catch: java.lang.Throwable -> L12
            r0 = 1
            r11.setAccessible(r0)     // Catch: java.lang.Throwable -> L12
            goto L1a
        L12:
            r0 = move-exception
            r11 = r0
            eo1 r0 = new eo1
            r0.<init>(r11)
            r11 = r0
        L1a:
            java.lang.Throwable r0 = p000.fo1.m2190(r11)
            if (r0 != 0) goto L82
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L50
            og r2 = new og     // Catch: java.lang.Throwable -> L50
            r4 = r8
            r5 = r12
            r7 = r13
            r3 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4d
            r0.m6775(r11, r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r8 = r9.getName()     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L4d
            r11.append(r5)     // Catch: java.lang.Throwable -> L4d
            r11.append(r8)     // Catch: java.lang.Throwable -> L4d
            r11.append(r10)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r8 = r11.toString()     // Catch: java.lang.Throwable -> L4d
            p000.C0888ux.m5985(r8)     // Catch: java.lang.Throwable -> L4d
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L4d
            goto L59
        L4d:
            r0 = move-exception
        L4e:
            r8 = r0
            goto L53
        L50:
            r0 = move-exception
            r5 = r12
            goto L4e
        L53:
            eo1 r11 = new eo1
            r11.<init>(r8)
            r8 = r11
        L59:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto L81
            java.lang.String r9 = r9.getName()
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "r79b26c01a8572a1d"
            r11.<init>(r12)
            r11.append(r5)
            r11.append(r9)
            r11.append(r10)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            p000.C0888ux.m5985(r8)
        L81:
            return
        L82:
            r5 = r12
            java.lang.String r8 = r9.getName()
            java.lang.String r9 = r0.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "r530a1652494ba007"
            r11.<init>(r12)
            r11.append(r5)
            r11.append(r8)
            r11.append(r10)
            r11.append(r9)
            java.lang.String r8 = r11.toString()
            p000.C0888ux.m5985(r8)
            return
    }

    /* JADX INFO: renamed from: ψ */
    public final void m5702(p000.z81 r8) {
            r7 = this;
            java.lang.String r0 = "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE65551CC6F74BA8D0AF0CD54F0C34F2915C25F94C821335EC65C03695BEEA011BD4C913EAC2E01FEC59C6A72EB79AC1"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.ClassLoader r8 = r8.f13011
            java.lang.Class r2 = m5661(r8, r0)
            if (r2 != 0) goto L14
            java.lang.String r7 = "r50b5152a486079c1"
            p000.C0888ux.m5985(r7)
            return
        L14:
            java.lang.Class<android.view.View> r8 = android.view.View.class
            boolean r8 = r8.isAssignableFrom(r2)
            if (r8 != 0) goto L2a
            java.lang.String r7 = r2.getName()
            java.lang.String r8 = "rd58f16edd7a21c6c"
            java.lang.String r7 = r8.concat(r7)
            p000.C0888ux.m5985(r7)
            return
        L2a:
            java.lang.String r5 = "Feed 弹幕按钮"
            r6 = 0
            r3 = 8
            java.lang.String r4 = "danmaku visibility frame"
            r1 = r7
            r1.m5689(r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ω */
    public final void m5703(p000.z81 r8) {
            r7 = this;
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            java.lang.String r1 = "createView"
            java.lang.Class<android.view.LayoutInflater> r2 = android.view.LayoutInflater.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r4 = p000.AbstractC0871ug.f10772
            if (r4 == 0) goto Le
            goto L97
        Le:
            r4 = 1
            p000.AbstractC0871ug.f10772 = r4
            pg r5 = new pg     // Catch: java.lang.Throwable -> L20
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r3, r0, r5}     // Catch: java.lang.Throwable -> L20
            l01 r5 = p000.qe0.m4873(r2, r1, r5)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L27:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L36
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "rcf7159b38fd7b0ca"
            p000.AbstractC0602nx.m4142(r6, r5)
        L36:
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            pg r6 = new pg     // Catch: java.lang.Throwable -> L46
            r6.<init>(r7, r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r3, r3, r0, r6}     // Catch: java.lang.Throwable -> L46
            l01 r0 = p000.qe0.m4873(r2, r1, r0)     // Catch: java.lang.Throwable -> L46
            goto L4d
        L46:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L4d:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "rec2e7a7ea2a1f3f9"
            p000.AbstractC0602nx.m4142(r1, r0)
        L5c:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "android.telephony.PhaeshVadZenaith"
            java.lang.ClassLoader r8 = r8.f13011     // Catch: java.lang.Throwable -> L81
            java.lang.Class r8 = p000.qe0.m4876(r8, r0)     // Catch: java.lang.Throwable -> L81
            java.lang.Class<android.view.View> r0 = android.view.View.class
            boolean r0 = r0.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L7e
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L81
            pg r1 = new pg     // Catch: java.lang.Throwable -> L81
            r2 = 2
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L81
            r0.m6773(r8, r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = "r4eab92dc2e52f0af"
            p000.C0888ux.m5985(r7)     // Catch: java.lang.Throwable -> L81
        L7e:
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L81
            goto L88
        L81:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L88:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L97
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = "r6d0c7b096d9be830"
            p000.AbstractC0602nx.m4142(r8, r7)
        L97:
            return
    }

    /* JADX INFO: renamed from: в */
    public final void m5704(android.view.View r17, int r18, java.lang.String r19, java.lang.String r20, boolean r21) {
            r16 = this;
            boolean r0 = m5644(r18)
            if (r0 != 0) goto L8
            goto L1d7
        L8:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            android.os.Handler r6 = p000.AbstractC0871ug.f10780
            gg r0 = new gg
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.post(r0)
            return
        L2b:
            r1 = r17
            r2 = r18
            r3 = r19
            r0 = 2131618513(0x7f0dead1, float:1.8864038E38)
            java.lang.Object r4 = r1.getTag(r0)
            boolean r5 = r4 instanceof java.lang.Integer
            r6 = 0
            if (r5 == 0) goto L40
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L41
        L40:
            r4 = r6
        L41:
            if (r21 == 0) goto L4e
            r5 = 2131618537(0x7f0deae9, float:1.8864087E38)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r1.setTag(r5, r7)
            r16.m5695(r17)
        L4e:
            l91 r5 = m5662(r1)
            bh r7 = m5648(r2)
            bh r8 = p000.EnumC0077bh.f1711
            r9 = 1
            r10 = 0
            if (r7 == 0) goto L60
            if (r7 == r8) goto L60
            r7 = r9
            goto L61
        L60:
            r7 = r10
        L61:
            r11 = 2
            if (r5 == 0) goto L8a
            java.lang.Object r12 = r5.f6503
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            tg r13 = p000.AbstractC0871ug.f10771
            bh r13 = m5648(r2)
            if (r13 == r8) goto L75
            goto L8a
        L75:
            bg r13 = p000.EnumC0076bg.f1698
            if (r12 != r11) goto L7b
            r12 = r13
            goto L86
        L7b:
            bh r12 = m5648(r12)
            if (r12 != r8) goto L84
            bg r12 = p000.EnumC0076bg.f1699
            goto L86
        L84:
            bg r12 = p000.EnumC0076bg.f1700
        L86:
            if (r12 != r13) goto L8a
            r12 = r9
            goto L8b
        L8a:
            r12 = r10
        L8b:
            r13 = 2131618522(0x7f0deada, float:1.8864057E38)
            if (r5 == 0) goto L114
            if (r7 != 0) goto L114
            if (r12 != 0) goto L114
            if (r4 == 0) goto La7
            int r2 = r4.intValue()
            boolean r2 = m5644(r2)
            if (r2 == 0) goto La7
            int r2 = r4.intValue()
            m5684(r1, r2)
        La7:
            boolean r2 = m5641(r1)
            if (r2 == 0) goto Lb0
            m5673(r1)
        Lb0:
            r1.setTag(r13, r6)
            java.lang.Object r2 = r1.getTag(r13)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto Lcb
            if (r4 == 0) goto L10b
            int r2 = r4.intValue()
            boolean r2 = m5644(r2)
            if (r2 != r9) goto L10b
        Lcb:
            if (r4 == 0) goto Lde
            int r2 = r4.intValue()
            boolean r2 = m5644(r2)
            if (r2 == 0) goto Lde
            int r2 = r4.intValue()
            m5684(r1, r2)
        Lde:
            r2 = 2131618523(0x7f0deadb, float:1.8864059E38)
            java.lang.Object r3 = r1.getTag(r2)
            boolean r4 = r3 instanceof java.lang.Float
            if (r4 == 0) goto Lec
            java.lang.Float r3 = (java.lang.Float) r3
            goto Led
        Lec:
            r3 = r6
        Led:
            if (r3 == 0) goto Lf4
            float r3 = r3.floatValue()
            goto Lf8
        Lf4:
            float r3 = r1.getAlpha()
        Lf8:
            r1.setTag(r2, r6)
            r1.setTag(r13, r6)
            m5676(r1)
            r2 = 2131618524(0x7f0deadc, float:1.886406E38)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.setTag(r2, r3)
        L10b:
            r2 = -2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setTag(r0, r2)
            return
        L114:
            r12 = 4
            if (r2 != r12) goto L11a
            r16.m5696(r17)
        L11a:
            if (r7 == 0) goto L138
            r7 = 2131618541(0x7f0deaed, float:1.8864095E38)
            java.lang.Object r14 = r1.getTag(r7)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto L12c
            goto L138
        L12c:
            r1.setTag(r7, r15)
            lg r7 = new lg
            r14 = 3
            r7.<init>(r14)
            r1.addOnAttachStateChangeListener(r7)
        L138:
            if (r4 != 0) goto L13b
            goto L150
        L13b:
            int r7 = r4.intValue()
            if (r7 != r2) goto L150
            java.lang.Object r7 = r1.getTag(r13)
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r7 = p000.ln0.m3626(r7, r14)
            if (r7 != 0) goto L14e
            goto L150
        L14e:
            r7 = r10
            goto L151
        L150:
            r7 = r9
        L151:
            if (r20 != 0) goto L158
            java.lang.String r14 = m5671(r2, r1, r3)
            goto L15a
        L158:
            r14 = r20
        L15a:
            if (r4 == 0) goto L169
            int r15 = r4.intValue()
            if (r15 == r2) goto L169
            int r4 = r4.intValue()
            m5684(r1, r4)
        L169:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.setTag(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setTag(r13, r0)
            r0 = 2131618531(0x7f0deae3, float:1.8864075E38)
            r1.setTag(r0, r14)
            m5669(r16, r17)
            if (r7 == 0) goto L18c
            m5683(r17, r18)
            r0 = 2131618532(0x7f0deae4, float:1.8864077E38)
            r1.setTag(r0, r6)
            m5665(r1, r2, r3, r14)
        L18c:
            m5652(r1)
            boolean r0 = m5640()
            if (r0 == 0) goto L1d7
            r0 = r16
            r0.m5694(r1, r2, r10)
            if (r5 == 0) goto L1c7
            java.lang.Object r0 = r5.f6502
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1c7
            tg r3 = p000.AbstractC0871ug.f10771
            java.lang.Integer r4 = m5664(r0)
            if (r4 != 0) goto L1ab
            goto L1b1
        L1ab:
            int r5 = r4.intValue()
            if (r5 == r12) goto L1c0
        L1b1:
            if (r4 != 0) goto L1b4
            goto L1c7
        L1b4:
            int r5 = r4.intValue()
            if (r5 != r11) goto L1c7
            bh r5 = m5648(r2)
            if (r5 != r8) goto L1c7
        L1c0:
            int r4 = r4.intValue()
            r3.m5694(r0, r4, r10)
        L1c7:
            if (r7 == 0) goto L1d7
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L1d7
            lb r0 = new lb
            r0.<init>(r1, r2, r9)
            r1.post(r0)
        L1d7:
            return
    }

    /* JADX INFO: renamed from: о */
    public final void m5705(android.view.View r4) {
            r3 = this;
            r0 = 2131618538(0x7f0deaea, float:1.886409E38)
            java.lang.Object r1 = r4.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L10
            goto L3b
        L10:
            r4.setTag(r0, r2)
            jb r1 = new jb     // Catch: java.lang.Throwable -> L21
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L21
            boolean r3 = r4.post(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r3 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r3)
            r3 = r1
        L28:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r3 instanceof p000.eo1
            if (r2 == 0) goto L2f
            r3 = r1
        L2f:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L3b
            r3 = 0
            r4.setTag(r0, r3)
        L3b:
            return
    }

    /* JADX INFO: renamed from: п */
    public final void m5706(android.view.View r4, java.lang.String r5) {
            r3 = this;
            r0 = 2131618533(0x7f0deae5, float:1.8864079E38)
            java.lang.Object r1 = r4.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L10
            goto L3c
        L10:
            r4.setTag(r0, r2)
            e9 r1 = new e9     // Catch: java.lang.Throwable -> L22
            r2 = 3
            r1.<init>(r4, r3, r5, r2)     // Catch: java.lang.Throwable -> L22
            boolean r3 = r4.post(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L22
            goto L29
        L22:
            r3 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r3)
            r3 = r5
        L29:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r1 = r3 instanceof p000.eo1
            if (r1 == 0) goto L30
            r3 = r5
        L30:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L3c
            r3 = 0
            r4.setTag(r0, r3)
        L3c:
            return
    }

    /* JADX INFO: renamed from: ц */
    public final void m5707() {
            r3 = this;
            z81 r0 = p000.AbstractC0871ug.f10762
            if (r0 != 0) goto L5
            goto L65
        L5:
            boolean r1 = p000.AbstractC0871ug.f10789
            if (r1 != 0) goto Ld
            boolean r1 = p000.AbstractC0871ug.f10788
            if (r1 == 0) goto L52
        Ld:
            boolean r1 = m5640()
            if (r1 == 0) goto L52
            boolean r1 = p000.AbstractC0871ug.f10759
            if (r1 == 0) goto L18
            goto L65
        L18:
            monitor-enter(r3)
            boolean r1 = p000.AbstractC0871ug.f10759     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L1f
            monitor-exit(r3)
            return
        L1f:
            boolean r1 = p000.AbstractC0871ug.f10789     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2a
            boolean r1 = p000.AbstractC0871ug.f10788     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L32
            goto L2a
        L28:
            r0 = move-exception
            goto L50
        L2a:
            tg r1 = p000.AbstractC0871ug.f10771     // Catch: java.lang.Throwable -> L28
            boolean r1 = m5640()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L34
        L32:
            monitor-exit(r3)
            return
        L34:
            e30 r1 = p000.e30.f3390     // Catch: java.lang.Throwable -> L28
            java.lang.ClassLoader r0 = r0.f13011     // Catch: java.lang.Throwable -> L28
            r1.m1839(r0)     // Catch: java.lang.Throwable -> L28
            sg r0 = p000.AbstractC0871ug.f10799     // Catch: java.lang.Throwable -> L28
            r0.getClass()     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.e30.f3392     // Catch: java.lang.Throwable -> L28
            boolean r2 = r1.contains(r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L4b
            r1.add(r0)     // Catch: java.lang.Throwable -> L28
        L4b:
            r0 = 1
            p000.AbstractC0871ug.f10759 = r0     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            return
        L50:
            monitor-exit(r3)
            throw r0
        L52:
            boolean r3 = p000.AbstractC0871ug.f10759
            if (r3 == 0) goto L65
            e30 r3 = p000.e30.f3390
            sg r3 = p000.AbstractC0871ug.f10799
            r3.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.e30.f3392
            r0.remove(r3)
            r3 = 0
            p000.AbstractC0871ug.f10759 = r3
        L65:
            return
    }
}
