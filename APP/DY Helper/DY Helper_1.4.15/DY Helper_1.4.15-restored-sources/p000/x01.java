package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x01 {

    /* JADX INFO: renamed from: α */
    public static final p000.x01 f11964 = null;

    /* JADX INFO: renamed from: β */
    public static volatile java.lang.String f11965;

    /* JADX INFO: renamed from: γ */
    public static volatile android.content.res.Resources f11966;

    /* JADX INFO: renamed from: δ */
    public static volatile java.lang.ClassLoader f11967;

    static {
            x01 r0 = new x01
            r0.<init>()
            p000.x01.f11964 = r0
            java.lang.Class<x01> r0 = p000.x01.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            p000.x01.f11967 = r0
            return
    }

    /* JADX INFO: renamed from: ε */
    public static android.view.View m6472(android.view.View r5, java.lang.String r6, int r7, java.lang.Class r8) {
            r5.getClass()
            android.content.res.Resources r0 = r5.getResources()
            r0.getClass()
            java.lang.String r1 = "id"
            r2 = 0
            int r0 = m6473(r0, r1, r6, r2)
            zt0 r1 = p000.AbstractC1021yh.m6893()
            if (r0 == 0) goto L1e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.add(r3)
        L1e:
            if (r7 == 0) goto L29
            if (r7 == r0) goto L29
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1.add(r3)
        L29:
            zt0 r1 = p000.AbstractC1021yh.m6883(r1)
            java.util.ListIterator r1 = r1.listIterator(r2)
            r2 = 0
        L32:
            r3 = r1
            le0 r3 = (p000.le0) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r3 = r3.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            android.view.View r3 = r5.findViewById(r3)
            if (r3 != 0) goto L4c
            goto L32
        L4c:
            boolean r2 = r8.isInstance(r3)
            if (r2 == 0) goto L66
            java.lang.Object r5 = r8.cast(r3)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L5b
            return r5
        L5b:
            java.lang.String r5 = "模块控件转换失败: id/"
            java.lang.String r5 = r5.concat(r6)
            p000.C1080.m7279(r5)
            r5 = 0
            return r5
        L66:
            r2 = r3
            goto L32
        L68:
            if (r2 == 0) goto L8d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r7 = r8.getName()
            java.lang.Class r8 = r2.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = ", expected="
            java.lang.String r1 = ", actual="
            java.lang.String r2 = "模块控件类型不匹配: id/"
            java.lang.StringBuilder r6 = p000.lz1.m3695(r2, r6, r0, r7, r1)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L8d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r8 = 16
            p000.jx0.m3045(r8)
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r0 = p000.v71.m6049(r0)
            p000.jx0.m3045(r8)
            long r7 = (long) r7
            long r7 = r7 & r2
            java.lang.String r7 = p000.v71.m6049(r7)
            java.lang.String r8 = ", runtimeId=0x"
            java.lang.String r1 = ", fallbackId=0x"
            java.lang.String r2 = "模块布局缺少必需控件: id/"
            java.lang.StringBuilder r6 = p000.lz1.m3695(r2, r6, r8, r0, r1)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ζ */
    public static int m6473(android.content.res.Resources r1, java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String r0 = "com.example.dyhelper"
            int r1 = r1.getIdentifier(r3, r2, r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L12:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L1c
            r1 = r2
        L1c:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L29
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L30
            int r4 = r2.intValue()
        L30:
            return r4
    }

    /* JADX INFO: renamed from: α */
    public final p000.w01 m6474(android.content.Context r5) {
            r4 = this;
            r5.getClass()
            java.lang.String r0 = "com.example.dyhelper"
            r1 = 2
            android.content.Context r0 = r5.createPackageContext(r0, r1)     // Catch: java.lang.Throwable -> L38
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Throwable -> L38
            r1.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r0.getPackageResourcePath()     // Catch: java.lang.Throwable -> L38
            r2.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r0 = move-exception
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> L38
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L38
            r0 = r3
        L24:
            boolean r3 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L29
            r0 = 0
        L29:
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3a
            java.lang.ClassLoader r0 = p000.x01.f11967     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3a
            java.lang.Class<x01> r0 = p000.x01.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r0 = move-exception
            goto L40
        L3a:
            w01 r3 = new w01     // Catch: java.lang.Throwable -> L38
            r3.<init>(r5, r1, r2, r0)     // Catch: java.lang.Throwable -> L38
            return r3
        L40:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "DYHelper: createPackageContext 失败，改用 modulePath 加载资源: "
            p000.AbstractC0602nx.m4142(r1, r0)
            java.lang.String r0 = p000.x01.f11965
            if (r0 == 0) goto L73
            android.content.res.Resources r1 = p000.x01.f11966
            if (r1 != 0) goto L63
            monitor-enter(r4)
            android.content.res.Resources r1 = p000.x01.f11966     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            android.content.res.Resources r1 = p000.pd2.m4492(r5, r0)     // Catch: java.lang.Throwable -> L5d
            p000.x01.f11966 = r1     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r5 = move-exception
            goto L61
        L5f:
            monitor-exit(r4)
            goto L63
        L61:
            monitor-exit(r4)
            throw r5
        L63:
            java.lang.ClassLoader r4 = p000.x01.f11967
            if (r4 != 0) goto L6d
            java.lang.Class<x01> r4 = p000.x01.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
        L6d:
            w01 r2 = new w01
            r2.<init>(r5, r1, r0, r4)
            return r2
        L73:
            java.lang.String r4 = "modulePath 为空，请确认 MainHook 已完成 libxposed onModuleLoaded 初始化"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: β */
    public final android.graphics.drawable.Drawable m6475(android.content.Context r5, int r6) {
            r4 = this;
            r5.getClass()
            w01 r4 = r4.m6474(r5)     // Catch: java.lang.Throwable -> Lc
            android.graphics.drawable.Drawable r4 = p000.ln0.m3603(r4, r6)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L13:
            java.lang.Throwable r5 = p000.fo1.m2190(r4)
            if (r5 == 0) goto L34
            r0 = 16
            p000.jx0.m3045(r0)
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r6 = p000.v71.m6049(r0)
            java.lang.String r0 = "模块 Drawable 加载失败: id=0x"
            java.lang.String r6 = r0.concat(r6)
            java.lang.String r0 = "DYHelper"
            p000.C0888ux.m5977(r0, r6, r5)
        L34:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L39
            r4 = 0
        L39:
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public final android.view.View m6476(int r2, android.content.Context r3, java.lang.String r4) {
            r1 = this;
            r3.getClass()
            w01 r1 = r1.m6474(r3)
            android.content.res.Resources r3 = r1.f11505
            r3.getClass()
            java.lang.String r0 = "layout"
            int r2 = m6473(r3, r0, r4, r2)
            if (r2 == 0) goto L39
            java.lang.String r3 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r3)
            boolean r3 = r1 instanceof android.view.LayoutInflater
            r0 = 0
            if (r3 == 0) goto L22
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            goto L23
        L22:
            r1 = r0
        L23:
            if (r1 == 0) goto L2e
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            r1.getClass()
            return r1
        L2e:
            java.lang.String r1 = "模块布局加载器不可用: layout/"
            java.lang.String r1 = r1.concat(r4)
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
        L39:
            java.lang.String r1 = "模块布局资源不存在: layout/"
            java.lang.String r1 = r1.concat(r4)
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final android.view.LayoutInflater m6477(android.content.Context r1) {
            r0 = this;
            r1.getClass()
            w01 r0 = r0.m6474(r1)
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.String m6478(android.content.Context r1, int r2, java.lang.Object... r3) {
            r0 = this;
            r1.getClass()
            w01 r0 = r0.m6474(r1)
            android.content.res.Resources r0 = r0.f11505
            int r1 = r3.length
            if (r1 != 0) goto L14
            java.lang.String r0 = r0.getString(r2)
            r0.getClass()
            return r0
        L14:
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r0 = r0.getString(r2, r1)
            r0.getClass()
            return r0
    }
}
