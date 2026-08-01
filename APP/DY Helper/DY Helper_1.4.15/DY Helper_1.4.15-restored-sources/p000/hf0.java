package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hf0 {

    /* JADX INFO: renamed from: α */
    public static final p000.hf0 f4718 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f4719 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f4720 = null;

    static {
            hf0 r0 = new hf0
            r0.<init>()
            p000.hf0.f4718 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.hf0.f4719 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.hf0.f4720 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m2503(java.util.List r7) {
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r7.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class r1 = r0.getDeclaringClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.Class r2 = r0.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = r0.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = "#"
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = "()"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.hf0.f4720
            boolean r3 = r2.add(r1)
            if (r3 == 0) goto L4
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L5f
            f10 r4 = new f10     // Catch: java.lang.Throwable -> L5f
            r5 = 15
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5f
            l01 r0 = r3.m6775(r0, r4)     // Catch: java.lang.Throwable -> L5f
            goto L66
        L5f:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L66:
            boolean r3 = r0 instanceof p000.eo1
            r4 = 4
            java.lang.String r5 = "r57da051d00c44d33"
            r6 = 0
            if (r3 != 0) goto L7a
            r3 = r0
            l01 r3 = (p000.l01) r3
            java.lang.String r3 = "宿主长按倍率 Hook 已安装: "
            java.lang.String r3 = r3.concat(r1)
            p000.C0888ux.m5988(r5, r3, r6, r4, r6)
        L7a:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L4
            r2.remove(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "宿主长按倍率 Hook 安装失败: "
            java.lang.String r3 = ", "
            java.lang.String r0 = p000.a12.m18(r2, r1, r3, r0)
            p000.C0888ux.m5988(r5, r0, r6, r4, r6)
            goto L4
        L94:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2504(p000.z81 r14) {
            r13 = this;
            s62 r1 = p000.s62.f9751
            l82 r0 = p000.l82.f6483     // Catch: java.lang.Throwable -> Lb
            java.lang.ClassLoader r2 = r14.f13011     // Catch: java.lang.Throwable -> Lb
            r0.m3539(r2)     // Catch: java.lang.Throwable -> Lb
            r2 = r1
            goto L11
        Lb:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
        L11:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            r2 = 4
            java.lang.String r3 = "r57da051d00c44d33"
            r4 = 0
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "安装旧版播放器倍速兜底失败: "
            java.lang.String r0 = p000.lz1.m3687(r5, r0)
            p000.C0888ux.m5988(r3, r0, r4, r2, r4)
        L28:
            java.lang.String[] r0 = p000.n82.f7460     // Catch: java.lang.Throwable -> L2f
            p000.n82.m4014(r14)     // Catch: java.lang.Throwable -> L2f
            r5 = r1
            goto L35
        L2f:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
        L35:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "安装高倍速 native 能力失败: "
            java.lang.String r0 = p000.lz1.m3687(r5, r0)
            p000.C0888ux.m5988(r3, r0, r4, r2, r4)
        L48:
            java.util.List r0 = p000.if0.f5065     // Catch: java.lang.Throwable -> L51
            java.lang.ClassLoader r0 = r14.f13011     // Catch: java.lang.Throwable -> L51
            p000.if0.m2755(r0)     // Catch: java.lang.Throwable -> L51
            r5 = r1
            goto L57
        L51:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
        L57:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "安装宿主长按倍速提示同步失败: "
            java.lang.String r0 = p000.lz1.m3687(r5, r0)
            p000.C0888ux.m5988(r3, r0, r4, r2, r4)
        L6a:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.hf0.f4719
            r5 = 1
            r6 = 0
            boolean r0 = r0.compareAndSet(r6, r5)
            if (r0 == 0) goto L8b
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.m20.f6907
            ng r5 = new ng
            r11 = 0
            r12 = 12
            r6 = 1
            java.lang.Class<hf0> r8 = p000.hf0.class
            java.lang.String r9 = "installResolvedMethods"
            java.lang.String r10 = "installResolvedMethods(Ljava/util/List;)V"
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.CopyOnWriteArrayList r13 = p000.m20.f6908
            r13.addIfAbsent(r5)
        L8b:
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.m20.f6907     // Catch: java.lang.Throwable -> L97
            java.lang.ClassLoader r13 = r14.f13011     // Catch: java.lang.Throwable -> L97
            java.util.List r13 = p000.m20.m3715(r13)     // Catch: java.lang.Throwable -> L97
            m2503(r13)     // Catch: java.lang.Throwable -> L97
            goto L9e
        L97:
            r0 = move-exception
            r13 = r0
            eo1 r1 = new eo1
            r1.<init>(r13)
        L9e:
            java.lang.Throwable r13 = p000.fo1.m2190(r1)
            if (r13 == 0) goto Lb1
            java.lang.String r13 = r13.getMessage()
            java.lang.String r14 = "安装宿主长按倍率提供 Hook 失败: "
            java.lang.String r13 = p000.lz1.m3687(r14, r13)
            p000.C0888ux.m5988(r3, r13, r4, r2, r4)
        Lb1:
            return
    }
}
