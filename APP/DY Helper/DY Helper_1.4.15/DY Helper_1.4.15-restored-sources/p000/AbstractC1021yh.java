package p000;

/* JADX INFO: renamed from: yh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1021yh {

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object f12615 = null;

    /* JADX INFO: renamed from: β */
    public static final int[] f12616 = null;

    /* JADX INFO: renamed from: γ */
    public static final long[] f12617 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.lang.Object[] f12618 = null;

    /* JADX INFO: renamed from: ε */
    public static final p000.C0889uy f12619 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.C0889uy f12620 = null;

    /* JADX INFO: renamed from: η */
    public static final byte[] f12621 = null;

    /* JADX INFO: renamed from: θ */
    public static final byte[] f12622 = null;

    /* JADX INFO: renamed from: ι */
    public static final byte[] f12623 = null;

    /* JADX INFO: renamed from: κ */
    public static final byte[] f12624 = null;

    /* JADX INFO: renamed from: λ */
    public static final byte[] f12625 = null;

    /* JADX INFO: renamed from: μ */
    public static final byte[] f12626 = null;

    /* JADX INFO: renamed from: ν */
    public static final byte[] f12627 = null;

    /* JADX INFO: renamed from: ξ */
    public static final p000.e42 f12628 = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.AbstractC1021yh.f12615 = r0
            r0 = 0
            int[] r1 = new int[r0]
            p000.AbstractC1021yh.f12616 = r1
            long[] r1 = new long[r0]
            p000.AbstractC1021yh.f12617 = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            p000.AbstractC1021yh.f12618 = r1
            uy r1 = new uy
            java.lang.String r2 = "REMOVED_TASK"
            r3 = 1
            r1.<init>(r2, r3)
            p000.AbstractC1021yh.f12619 = r1
            uy r1 = new uy
            java.lang.String r2 = "CLOSED_EMPTY"
            r1.<init>(r2, r3)
            p000.AbstractC1021yh.f12620 = r1
            r1 = 4
            byte[] r2 = new byte[r1]
            r2 = {x0066: FILL_ARRAY_DATA , data: [48, 49, 53, 0} // fill-array
            p000.AbstractC1021yh.f12621 = r2
            byte[] r2 = new byte[r1]
            r2 = {x006c: FILL_ARRAY_DATA , data: [48, 49, 48, 0} // fill-array
            p000.AbstractC1021yh.f12622 = r2
            byte[] r2 = new byte[r1]
            r2 = {x0072: FILL_ARRAY_DATA , data: [48, 48, 57, 0} // fill-array
            p000.AbstractC1021yh.f12623 = r2
            byte[] r2 = new byte[r1]
            r2 = {x0078: FILL_ARRAY_DATA , data: [48, 48, 53, 0} // fill-array
            p000.AbstractC1021yh.f12624 = r2
            byte[] r2 = new byte[r1]
            r2 = {x007e: FILL_ARRAY_DATA , data: [48, 48, 49, 0} // fill-array
            p000.AbstractC1021yh.f12625 = r2
            byte[] r2 = new byte[r1]
            r2 = {x0084: FILL_ARRAY_DATA , data: [48, 48, 49, 0} // fill-array
            p000.AbstractC1021yh.f12626 = r2
            byte[] r1 = new byte[r1]
            r1 = {x008a: FILL_ARRAY_DATA , data: [48, 48, 50, 0} // fill-array
            p000.AbstractC1021yh.f12627 = r1
            e42 r1 = new e42
            long[] r2 = new long[r0]
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1.<init>(r0, r2, r3)
            p000.AbstractC1021yh.f12628 = r1
            return
    }

    /* JADX INFO: renamed from: Α */
    public static final void m6848(p000.InterfaceC0880up r1) {
            xn0 r0 = p000.xn0.f12226
            sp r1 = r1.mo1785(r0)
            fo0 r1 = (p000.fo0) r1
            if (r1 == 0) goto L16
            boolean r0 = r1.m2169()
            if (r0 == 0) goto L11
            goto L16
        L11:
            java.util.concurrent.CancellationException r1 = r1.m2159()
            throw r1
        L16:
            return
    }

    /* JADX INFO: renamed from: Β */
    public static java.util.List m6849(java.lang.Object r3) {
            r3.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.List r3 = m6856(r3)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L10
            return r1
        L10:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2a
        L14:
            boolean r2 = r3.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L34
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L14
            java.lang.String r2 = m6854(r2)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L14
            r0.add(r2)     // Catch: java.lang.Throwable -> L2a
            goto L14
        L2a:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r2 = "DYHelper: 动图提取失败: "
            p000.AbstractC0602nx.m4142(r2, r3)
        L34:
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r0)
            java.util.List r3 = p000.AbstractC0984xh.m6666(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L43
            goto L44
        L43:
            r1 = r3
        L44:
            return r1
    }

    /* JADX INFO: renamed from: Γ */
    public static java.util.ArrayList m6850(java.lang.Object r3) {
            r3.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.List r3 = m6856(r3)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L10
            return r1
        L10:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2a
        L14:
            boolean r2 = r3.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L34
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L14
            java.lang.String r2 = m6863(r2)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L14
            r0.add(r2)     // Catch: java.lang.Throwable -> L2a
            goto L14
        L2a:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r2 = "DYHelper: 图文提取失败: "
            p000.AbstractC0602nx.m4142(r2, r3)
        L34:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L3b
            r0 = r1
        L3b:
            return r0
    }

    /* JADX INFO: renamed from: Δ */
    public static java.util.List m6851(java.lang.Object r5) {
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L56
        L4:
            if (r0 == 0) goto L56
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L56
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L56
            τ r1 = p000.h62.m2434(r1)     // Catch: java.lang.Throwable -> L56
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L56
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class r4 = r2.getType()     // Catch: java.lang.Throwable -> L56
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L16
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L56
            boolean r3 = r2 instanceof java.util.List     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L16
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L56
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L56
            if (r3 != 0) goto L16
            r3 = r2
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = p000.AbstractC0984xh.m6638(r3)     // Catch: java.lang.Throwable -> L56
            boolean r3 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L16
            java.util.List r2 = (java.util.List) r2
            return r2
        L51:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L56
            goto L4
        L56:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: Ε */
    public static long m6852(int r4, int r5, int r6, int r7) {
            r0 = 262142(0x3fffe, float:3.67339E-40)
            int r6 = java.lang.Math.min(r6, r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r1) goto Le
            r7 = r1
            goto L12
        Le:
            int r7 = java.lang.Math.min(r7, r0)
        L12:
            if (r7 != r1) goto L16
            r2 = r6
            goto L17
        L16:
            r2 = r7
        L17:
            r3 = 8191(0x1fff, float:1.1478E-41)
            if (r2 >= r3) goto L1c
            goto L33
        L1c:
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L24
            r0 = 65534(0xfffe, float:9.1833E-41)
            goto L33
        L24:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r0) goto L2c
            r0 = 32766(0x7ffe, float:4.5915E-41)
            goto L33
        L2c:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r2 >= r0) goto L43
            r0 = 8190(0x1ffe, float:1.1477E-41)
        L33:
            if (r5 != r1) goto L36
            goto L3a
        L36:
            int r1 = java.lang.Math.min(r0, r5)
        L3a:
            int r4 = java.lang.Math.min(r0, r4)
            long r4 = p000.AbstractC1065zo.m7207(r4, r1, r6, r7)
            return r4
        L43:
            p000.AbstractC1065zo.m7215(r2)
            pm r4 = new pm
            r4.<init>()
            throw r4
    }

    /* JADX INFO: renamed from: Ζ */
    public static long m6853(int r4, int r5, int r6, int r7) {
            r0 = 262142(0x3fffe, float:3.67339E-40)
            int r4 = java.lang.Math.min(r4, r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r1) goto Le
            r5 = r1
            goto L12
        Le:
            int r5 = java.lang.Math.min(r5, r0)
        L12:
            if (r5 != r1) goto L16
            r2 = r4
            goto L17
        L16:
            r2 = r5
        L17:
            r3 = 8191(0x1fff, float:1.1478E-41)
            if (r2 >= r3) goto L1c
            goto L33
        L1c:
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L24
            r0 = 65534(0xfffe, float:9.1833E-41)
            goto L33
        L24:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r0) goto L2c
            r0 = 32766(0x7ffe, float:4.5915E-41)
            goto L33
        L2c:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r2 >= r0) goto L43
            r0 = 8190(0x1ffe, float:1.1477E-41)
        L33:
            if (r7 != r1) goto L36
            goto L3a
        L36:
            int r1 = java.lang.Math.min(r0, r7)
        L3a:
            int r6 = java.lang.Math.min(r0, r6)
            long r4 = p000.AbstractC1065zo.m7207(r4, r5, r6, r1)
            return r4
        L43:
            p000.AbstractC1065zo.m7215(r2)
            pm r4 = new pm
            r4.<init>()
            throw r4
    }

    /* JADX INFO: renamed from: Η */
    public static java.lang.String m6854(java.lang.Object r15) {
            java.lang.String r13 = "webpImage"
            java.lang.String r14 = "webp_image"
            java.lang.String r0 = "animatedImage"
            java.lang.String r1 = "animated_image"
            java.lang.String r2 = "dynamicImage"
            java.lang.String r3 = "dynamic_image"
            java.lang.String r4 = "motionImage"
            java.lang.String r5 = "motion_image"
            java.lang.String r6 = "livePhoto"
            java.lang.String r7 = "live_photo"
            java.lang.String r8 = "video"
            java.lang.String r9 = "videoInfo"
            java.lang.String r10 = "video_info"
            java.lang.String r11 = "gifImage"
            java.lang.String r12 = "gif_image"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            java.util.List r0 = m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r15, r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L3e
            goto L2a
        L3e:
            java.util.ArrayList r1 = m6888(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.List r3 = p000.el0.f3589     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = p000.el0.m1933(r1, r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            return r1
        L4b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r15.getClass()     // Catch: java.lang.Throwable -> L9f
        L54:
            if (r1 == 0) goto L9f
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto L9f
            java.lang.reflect.Field[] r3 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L9f
            τ r3 = p000.h62.m2434(r3)     // Catch: java.lang.Throwable -> L9f
        L66:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r4 == 0) goto L9a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L9f
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L9f
            r5.getClass()     // Catch: java.lang.Throwable -> L9f
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r5.toLowerCase(r6)     // Catch: java.lang.Throwable -> L9f
            r5.getClass()     // Catch: java.lang.Throwable -> L9f
            boolean r5 = m6868(r5)     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L66
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r4 = r4.get(r15)     // Catch: java.lang.Throwable -> L9f
            if (r4 != 0) goto L92
            goto L66
        L92:
            java.util.ArrayList r4 = m6888(r4)     // Catch: java.lang.Throwable -> L9f
            r0.addAll(r4)     // Catch: java.lang.Throwable -> L9f
            goto L66
        L9a:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L9f
            goto L54
        L9f:
            java.util.List r15 = p000.el0.f3589
            java.lang.String r15 = p000.el0.m1933(r0, r2)
            return r15
    }

    /* JADX INFO: renamed from: Θ */
    public static final java.lang.String m6855(java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    /* JADX INFO: renamed from: Ι */
    public static java.util.List m6856(java.lang.Object r4) {
            java.lang.String r0 = "images"
            r1 = 0
            java.lang.String r2 = "imagePostInfo"
            java.lang.Object r2 = p000.qe0.m4879(r4, r2)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L21
            java.lang.Object r2 = p000.qe0.m4879(r2, r0)     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2 instanceof java.util.List     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L16
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L21
            goto L17
        L16:
            r2 = r1
        L17:
            if (r2 == 0) goto L21
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L20
            goto L21
        L20:
            return r2
        L21:
            java.lang.Object r4 = p000.qe0.m4879(r4, r0)     // Catch: java.lang.Throwable -> L37
            boolean r0 = r4 instanceof java.util.List     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L2c
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L37
            goto L2d
        L2c:
            r4 = r1
        L2d:
            if (r4 == 0) goto L37
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L36
            goto L37
        L36:
            return r4
        L37:
            return r1
    }

    /* JADX INFO: renamed from: Κ */
    public static p000.xm0 m6857(java.util.Collection r3) {
            r3.getClass()
            xm0 r0 = new xm0
            int r3 = r3.size()
            r1 = 1
            int r3 = r3 - r1
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: Λ */
    public static int m6858(java.util.List r0) {
            r0.getClass()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    /* JADX INFO: renamed from: Μ */
    public static android.content.Intent m6859(androidx.appcompat.app.AppCompatActivity r3) {
            android.content.Intent r0 = r3.getParentActivityIntent()
            if (r0 == 0) goto L7
            return r0
        L7:
            android.content.ComponentName r0 = r3.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            java.lang.String r0 = m6861(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = m6861(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r3 != 0) goto L23
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            return r3
        L23:
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.Intent r3 = r3.setComponent(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            return r3
        L2d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "getParentActivityIntent: bad parentActivityName '"
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "' in manifest"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "NavUtils"
            android.util.Log.e(r0, r3)
            return r1
        L46:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: Ν */
    public static android.content.Intent m6860(androidx.appcompat.app.AppCompatActivity r2, android.content.ComponentName r3) {
            java.lang.String r0 = m6861(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = m6861(r2, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            return r2
        L1c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
            return r2
    }

    /* JADX INFO: renamed from: Ξ */
    public static java.lang.String m6861(android.content.Context r2, android.content.ComponentName r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            r1 = 269222528(0x100c0280, float:2.7612058E-29)
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r3, r1)
            java.lang.String r0 = r3.parentActivityName
            if (r0 == 0) goto L10
            return r0
        L10:
            android.os.Bundle r3 = r3.metaData
            r0 = 0
            if (r3 != 0) goto L16
            return r0
        L16:
            java.lang.String r1 = "android.support.PARENT_ACTIVITY"
            java.lang.String r3 = r3.getString(r1)
            if (r3 != 0) goto L1f
            return r0
        L1f:
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.getPackageName()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
        L3c:
            return r3
    }

    /* JADX INFO: renamed from: Ο */
    public static java.lang.String m6862(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto Lb
            java.lang.String r2 = p000.ui1.m5893(r3, r4)     // Catch: java.lang.Throwable -> L1e
            return r2
        Lb:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "dyhelper_prefs"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L1d
            goto L1e
        L1d:
            return r2
        L1e:
            return r4
    }

    /* JADX INFO: renamed from: Π */
    public static java.lang.String m6863(java.lang.Object r5) {
            java.lang.String r0 = "displayImage"
            java.lang.String r1 = "display_image"
            java.lang.String r2 = "originImage"
            java.lang.String r3 = "origin_image"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "urlList"
            r3 = 0
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r5, r1)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L14
            java.lang.Object r2 = p000.qe0.m4879(r1, r2)     // Catch: java.lang.Throwable -> L35
            boolean r4 = r2 instanceof java.util.List     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L3c
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L35
            r3 = r2
            goto L3c
        L35:
            java.util.List r1 = m6851(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L3c
            r3 = r1
        L3c:
            if (r3 == 0) goto L14
            java.util.List r1 = p000.el0.f3589     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L14
        L49:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L14
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L49
            r1.add(r3)     // Catch: java.lang.Throwable -> L14
            goto L49
        L5b:
            java.lang.String r1 = p000.el0.m1934(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L14
            return r1
        L62:
            java.lang.Object r5 = p000.qe0.m4879(r5, r2)     // Catch: java.lang.Throwable -> L96
            boolean r0 = r5 instanceof java.util.List     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L6d
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L96
            goto L6e
        L6d:
            r5 = r3
        L6e:
            if (r5 == 0) goto L92
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L96
        L79:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L96
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L79
            r0.add(r1)     // Catch: java.lang.Throwable -> L96
            goto L79
        L8b:
            java.util.List r5 = p000.el0.f3589     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = p000.el0.m1934(r0)     // Catch: java.lang.Throwable -> L96
            goto L93
        L92:
            r5 = r3
        L93:
            if (r5 == 0) goto L96
            return r5
        L96:
            return r3
    }

    /* JADX INFO: renamed from: Ρ */
    public static android.net.Uri m6864(android.content.Context r2) {
            r2.getClass()
            iu r2 = m6915(r2)
            boolean r0 = r2.m2799()
            r1 = 0
            if (r0 != 0) goto Lf
            goto L27
        Lf:
            java.lang.String r2 = r2.f5186
            if (r2 == 0) goto L27
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L1f:
            boolean r0 = r2 instanceof p000.eo1
            if (r0 == 0) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            android.net.Uri r1 = (android.net.Uri) r1
        L27:
            return r1
    }

    /* JADX INFO: renamed from: Σ */
    public static final void m6865(p000.InterfaceC0092bw r1) {
            r0 = r1
            q01 r0 = (p000.q01) r0
            q01 r0 = r0.f8771
            boolean r0 = r0.f8784
            if (r0 == 0) goto L11
            r0 = 1
            q31 r1 = p000.h62.m2443(r1, r0)
            r1.m4743()
        L11:
            return
    }

    /* JADX INFO: renamed from: Τ */
    public static final p000.InterfaceC0922vt m6866(p000.fo0 r9, boolean r10, p000.co0 r11) {
            boolean r0 = r9 instanceof p000.fo0
            if (r0 == 0) goto L9
            vt r9 = r9.m2168(r10, r11)
            return r9
        L9:
            boolean r0 = r11.mo1280()
            ng r1 = new ng
            r7 = 0
            r8 = 25
            r2 = 1
            java.lang.Class<co0> r4 = p000.co0.class
            java.lang.String r5 = "invoke"
            java.lang.String r6 = "invoke(Ljava/lang/Throwable;)V"
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.getClass()
            if (r0 == 0) goto L28
            un0 r11 = new un0
            r11.<init>(r1)
            goto L2e
        L28:
            of r11 = new of
            r0 = 2
            r11.<init>(r0, r1)
        L2e:
            vt r9 = r9.m2168(r10, r11)
            return r9
    }

    /* JADX INFO: renamed from: Υ */
    public static final boolean m6867(p000.InterfaceC0880up r1) {
            xn0 r0 = p000.xn0.f12226
            sp r1 = r1.mo1785(r0)
            fo0 r1 = (p000.fo0) r1
            if (r1 == 0) goto Lf
            boolean r1 = r1.m2169()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: Φ */
    public static boolean m6868(java.lang.String r2) {
            java.lang.String r0 = "animated"
            r1 = 0
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "animate"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "animation"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "dynamic"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "motion"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "live"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "gif"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "webp"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "video"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L4a
            goto L4b
        L4a:
            return r1
        L4b:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: Χ */
    public static final boolean m6869(float[] r5) {
            int r0 = r5.length
            r1 = 16
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = r5[r2]
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L82
            r0 = 1
            r3 = r5[r0]
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 2
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 3
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 4
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 5
            r3 = r5[r3]
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 6
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 7
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 8
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 9
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 10
            r3 = r5[r3]
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 11
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 12
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 13
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 14
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 15
            r5 = r5[r3]
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L82
            return r0
        L82:
            return r2
    }

    /* JADX INFO: renamed from: Ψ */
    public static final boolean m6870(p000.yp0 r1) {
            yp0 r0 = r1.f12750
            if (r0 == 0) goto L18
            yp0 r0 = r1.m7005()
            if (r0 == 0) goto Ld
            yp0 r0 = r0.f12750
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            bq0 r1 = r1.f12734
            boolean r1 = r1.f1801
            if (r1 == 0) goto L18
        L16:
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Ω */
    public static final p000.r01 m6871(p000.r01 r1, p000.ep0 r2) {
            r1.getClass()
            r2.getClass()
            fp0 r0 = new fp0
            r0.<init>(r2)
            r01 r1 = r1.mo4345(r0)
            return r1
    }

    /* JADX INFO: renamed from: α */
    public static final void m6872(p000.r01 r6, p000.C0011aa r7, p000.C0024an r8, p000.v80 r9, int r10) {
            r0 = 380139498(0x16a877ea, float:2.721754E-25)
            r9.m6083(r0)
            r0 = r10 & 6
            if (r0 != 0) goto L15
            boolean r0 = r9.m6090(r6)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r10
            goto L16
        L15:
            r0 = r10
        L16:
            r1 = r10 & 48
            if (r1 != 0) goto L26
            boolean r1 = r9.m6090(r7)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r0 = r0 | 384(0x180, float:5.38E-43)
            r1 = r10 & 3072(0xc00, float:4.305E-42)
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L39
            boolean r1 = r9.m6092(r8)
            if (r1 == 0) goto L36
            r1 = r2
            goto L38
        L36:
            r1 = 1024(0x400, float:1.435E-42)
        L38:
            r0 = r0 | r1
        L39:
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r3 = 1170(0x492, float:1.64E-42)
            r4 = 0
            r5 = 1
            if (r1 == r3) goto L43
            r1 = r5
            goto L44
        L43:
            r1 = r4
        L44:
            r3 = r0 & 1
            boolean r1 = r9.m6075(r3, r1)
            if (r1 == 0) goto L75
            px0 r1 = p000.AbstractC0243ec.m1896(r7)
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != r2) goto L55
            r4 = r5
        L55:
            boolean r2 = r9.m6090(r1)
            r2 = r2 | r4
            java.lang.Object r3 = r9.m6073()
            if (r2 != 0) goto L64
            i2 r2 = p000.C0730qn.f9051
            if (r3 != r2) goto L6d
        L64:
            ic r3 = new ic
            r2 = 0
            r3.<init>(r1, r2, r8)
            r9.m6115(r3)
        L6d:
            e80 r3 = (p000.e80) r3
            r0 = r0 & 14
            p000.jx0.m3041(r6, r3, r9, r0)
            goto L78
        L75:
            r9.m6078()
        L78:
            bl1 r9 = r9.m6101()
            if (r9 == 0) goto L85
            jc r0 = new jc
            r0.<init>(r6, r7, r8, r10)
            r9.f1780 = r0
        L85:
            return
    }

    /* JADX INFO: renamed from: β */
    public static final p000.C0557mp m6873(p000.InterfaceC0880up r3) {
            mp r0 = new mp
            xn0 r1 = p000.xn0.f12226
            sp r1 = r3.mo1785(r1)
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            zn0 r1 = new zn0
            r2 = 0
            r1.<init>(r2)
            up r3 = r3.mo1784(r1)
        L15:
            r0.<init>(r3)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static final void m6874(p000.C0070ba r8, java.lang.String r9, p000.r01 r10, p000.C0381i2 r11, p000.v80 r12, int r13) {
            aa r0 = p000.C0966x.f11941
            r1 = 1142754848(0x441d0e20, float:628.2207)
            r12.m6083(r1)
            boolean r1 = r12.m6092(r8)
            if (r1 == 0) goto L10
            r1 = 4
            goto L11
        L10:
            r1 = 2
        L11:
            r1 = r1 | r13
            r2 = r13 & 48
            r3 = 32
            if (r2 != 0) goto L23
            boolean r2 = r12.m6090(r9)
            if (r2 == 0) goto L20
            r2 = r3
            goto L22
        L20:
            r2 = 16
        L22:
            r1 = r1 | r2
        L23:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L33
            boolean r2 = r12.m6090(r10)
            if (r2 == 0) goto L30
            r2 = 256(0x100, float:3.59E-43)
            goto L32
        L30:
            r2 = 128(0x80, float:1.8E-43)
        L32:
            r1 = r1 | r2
        L33:
            boolean r0 = r12.m6090(r0)
            if (r0 == 0) goto L3c
            r0 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r0 = 1024(0x400, float:1.435E-42)
        L3e:
            r0 = r0 | r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = r12.m6088(r1)
            if (r1 == 0) goto L4a
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L4c
        L4a:
            r1 = 65536(0x10000, float:9.1835E-41)
        L4c:
            r0 = r0 | r1
            r1 = 0
            boolean r2 = r12.m6090(r1)
            if (r2 == 0) goto L57
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L59
        L57:
            r2 = 524288(0x80000, float:7.34684E-40)
        L59:
            r0 = r0 | r2
            r2 = 599187(0x92493, float:8.3964E-40)
            r2 = r2 & r0
            r4 = 599186(0x92492, float:8.39638E-40)
            r5 = 0
            r6 = 1
            if (r2 == r4) goto L67
            r2 = r6
            goto L68
        L67:
            r2 = r5
        L68:
            r4 = r0 & 1
            boolean r2 = r12.m6075(r4, r2)
            if (r2 == 0) goto L107
            p01 r2 = p000.p01.f8378
            i2 r4 = p000.C0730qn.f9051
            if (r9 == 0) goto L9e
            r7 = 1899222916(0x7133d784, float:8.9053375E29)
            r12.m6082(r7)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r3) goto L82
            r0 = r6
            goto L83
        L82:
            r0 = r5
        L83:
            java.lang.Object r3 = r12.m6073()
            if (r0 != 0) goto L8b
            if (r3 != r4) goto L94
        L8b:
            yh0 r3 = new yh0
            r0 = 1
            r3.<init>(r9, r0)
            r12.m6115(r3)
        L94:
            a80 r3 = (p000.a80) r3
            r01 r2 = p000.yr1.m7023(r2, r3)
            r12.m6100(r5)
            goto La7
        L9e:
            r0 = 1899381698(0x713643c2, float:9.02531E29)
            r12.m6082(r0)
            r12.m6100(r5)
        La7:
            r01 r0 = r10.mo4345(r2)
            r2 = 520191(0x7efff, float:7.28943E-40)
            r01 r0 = p000.h62.m2427(r0, r1, r2)
            r01 r0 = p000.kn0.m3345(r0, r8, r11)
            java.lang.Object r1 = r12.m6073()
            if (r1 != r4) goto Lc1
            dc r1 = p000.C0207dc.f3050
            r12.m6115(r1)
        Lc1:
            px0 r1 = (p000.px0) r1
            long r2 = r12.f11155
            int r2 = java.lang.Long.hashCode(r2)
            r01 r0 = p000.pd2.m4459(r12, r0)
            androidx.compose.runtime.internal.α r3 = r12.m6096()
            kn r4 = p000.InterfaceC0518ln.f6713
            r4.getClass()
            u40 r4 = p000.C0475kn.f6034
            r12.m6084()
            boolean r5 = r12.f11154
            if (r5 == 0) goto Le3
            r12.m6095(r4)
            goto Le6
        Le3:
            r12.m6118()
        Le6:
            ui r4 = p000.C0475kn.f6037
            p000.e81.m1887(r4, r12, r1)
            ui r1 = p000.C0475kn.f6036
            p000.e81.m1887(r1, r12, r3)
            a1 r1 = p000.C0475kn.f6039
            p000.e81.m1884(r12, r1)
            ui r1 = p000.C0475kn.f6035
            p000.e81.m1887(r1, r12, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            ui r1 = p000.C0475kn.f6038
            p000.e81.m1887(r1, r12, r0)
            r12.m6100(r6)
            goto L10a
        L107:
            r12.m6078()
        L10a:
            bl1 r12 = r12.m6101()
            if (r12 == 0) goto L11c
            vk0 r0 = new vk0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r12.f1780 = r0
        L11c:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final void m6875(p000.C0534m2 r6, java.lang.String r7, p000.r01 r8, p000.C0381i2 r9, p000.v80 r10, int r11) {
            boolean r0 = r10.m6090(r6)
            java.lang.Object r1 = r10.m6073()
            if (r0 != 0) goto Le
            i2 r0 = p000.C0730qn.f9051
            if (r1 != r0) goto L32
        Le:
            android.graphics.Bitmap r0 = r6.f6906
            int r0 = r0.getWidth()
            android.graphics.Bitmap r1 = r6.f6906
            int r1 = r1.getHeight()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            ba r2 = new ba
            r2.<init>(r6, r0)
            r6 = 1
            r2.f1579 = r6
            r10.m6115(r2)
            r1 = r2
        L32:
            r6 = r1
            ba r6 = (p000.C0070ba) r6
            r0 = r11 & 112(0x70, float:1.57E-43)
            r1 = 8
            r0 = r0 | r1
            r11 = r11 & 896(0x380, float:1.256E-42)
            r11 = r11 | r0
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            m6874(r6, r7, r8, r9, r10, r11)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static final int m6876(char r3) {
            r0 = 48
            if (r0 > r3) goto La
            r1 = 58
            if (r3 >= r1) goto La
            int r3 = r3 - r0
            return r3
        La:
            r0 = 97
            if (r0 > r3) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L15
            int r3 = r3 + (-87)
            return r3
        L15:
            r0 = 65
            if (r0 > r3) goto L20
            r0 = 71
            if (r3 >= r0) goto L20
            int r3 = r3 + (-55)
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected hex digit: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m6877(p000.C1128 r4, p000.bs1 r5) {
            xr1 r0 = r5.f1824
            b21 r1 = r0.f12268
            is1 r2 = p000.fs1.f4120
            b21 r0 = r0.f12268
            java.lang.Object r0 = r0.m695(r2)
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r2
        L10:
            so1 r0 = (p000.so1) r0
            boolean r5 = p000.kn0.m3362(r5)
            if (r5 == 0) goto L8a
            if (r0 != 0) goto L1b
            goto L22
        L1b:
            int r5 = r0.f9982
            r0 = 8
            if (r5 != r0) goto L22
            goto L8a
        L22:
            is1 r5 = p000.wr1.f11834
            java.lang.Object r5 = r1.m695(r5)
            if (r5 != 0) goto L2b
            r5 = r2
        L2b:
            м r5 = (p000.C1114) r5
            if (r5 == 0) goto L3c
            ч r0 = new ч
            r3 = 16908358(0x1020046, float:2.3877425E-38)
            java.lang.String r5 = r5.f13446
            r0.<init>(r2, r3, r5, r2)
            r4.m7354(r0)
        L3c:
            is1 r5 = p000.wr1.f11809
            java.lang.Object r5 = r1.m695(r5)
            if (r5 != 0) goto L45
            r5 = r2
        L45:
            м r5 = (p000.C1114) r5
            if (r5 == 0) goto L56
            ч r0 = new ч
            r3 = 16908359(0x1020047, float:2.3877428E-38)
            java.lang.String r5 = r5.f13446
            r0.<init>(r2, r3, r5, r2)
            r4.m7354(r0)
        L56:
            is1 r5 = p000.wr1.f11835
            java.lang.Object r5 = r1.m695(r5)
            if (r5 != 0) goto L5f
            r5 = r2
        L5f:
            м r5 = (p000.C1114) r5
            if (r5 == 0) goto L70
            ч r0 = new ч
            r3 = 16908360(0x1020048, float:2.387743E-38)
            java.lang.String r5 = r5.f13446
            r0.<init>(r2, r3, r5, r2)
            r4.m7354(r0)
        L70:
            is1 r5 = p000.wr1.f11810
            java.lang.Object r5 = r1.m695(r5)
            if (r5 != 0) goto L79
            r5 = r2
        L79:
            м r5 = (p000.C1114) r5
            if (r5 == 0) goto L8a
            ч r0 = new ч
            r1 = 16908361(0x1020049, float:2.3877434E-38)
            java.lang.String r5 = r5.f13446
            r0.<init>(r2, r1, r5, r2)
            r4.m7354(r0)
        L8a:
            return
    }

    /* JADX INFO: renamed from: η */
    public static final void m6878(p000.C0063b3 r10, java.lang.String r11, p000.pr0 r12, boolean r13) {
            r12.getClass()
            long r0 = r12.f8669
            or0 r2 = r12.f8668
            r2.getClass()
            float r3 = r2.f8178
            r4 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 - r4
            float r2 = r2.f8179
            float r4 = r3 * r3
            r5 = 0
            float r4 = r4 + r5
            float r6 = r2 * r2
            float r6 = r6 + r4
            double r6 = (double) r6
            double r6 = java.lang.Math.sqrt(r6)
            float r4 = (float) r6
            r6 = 897988541(0x358637bd, float:1.0E-6)
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 >= 0) goto L27
            r4 = r6
        L27:
            float r6 = r5 / r4
            float r3 = r3 / r4
            java.lang.String r7 = "lightDir"
            java.lang.String r7 = r7.concat(r11)
            float r2 = r2 / r4
            android.graphics.RuntimeShader r4 = r10.f1437
            p000.AbstractC1124.m7335(r4, r7, r6, r3, r2)
            java.lang.String r2 = "lightColor"
            java.lang.String r2 = r2.concat(r11)
            r4 = 1065353216(0x3f800000, float:1.0)
            long r7 = p000.C0114ci.m1191(r0, r4)
            android.graphics.RuntimeShader r9 = r10.f1437
            int r7 = p000.kn0.m3355(r7)
            p000.AbstractC1124.m7336(r9, r2, r7)
            java.lang.String r2 = "lightIntensity"
            java.lang.String r2 = r2.concat(r11)
            float r0 = p000.C0114ci.m1193(r0)
            float r12 = r12.f8670
            float r0 = r0 * r12
            android.graphics.RuntimeShader r12 = r10.f1437
            p000.AbstractC1124.m7333(r12, r2, r0)
            if (r13 == 0) goto L92
            float r12 = r6 * r6
            float r13 = r3 * r3
            float r13 = r13 + r12
            double r12 = (double) r13
            double r12 = java.lang.Math.sqrt(r12)
            float r12 = (float) r12
            r13 = 981668463(0x3a83126f, float:0.001)
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            java.lang.String r0 = "axis"
            if (r13 <= 0) goto L7f
            java.lang.String r11 = r0.concat(r11)
            float r6 = r6 / r12
            float r3 = r3 / r12
            android.graphics.RuntimeShader r10 = r10.f1437
            p000.AbstractC1124.m7334(r10, r11, r6, r3)
            return
        L7f:
            java.lang.String r12 = "1"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L89
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L89:
            java.lang.String r11 = r0.concat(r11)
            android.graphics.RuntimeShader r10 = r10.f1437
            p000.AbstractC1124.m7334(r10, r11, r5, r4)
        L92:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static java.util.ArrayList m6879(java.lang.Object... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            v6 r1 = new v6
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static final int m6880(int r3, int r4, int[] r5) {
            r5.getClass()
            int r3 = r3 + (-1)
            r0 = 0
        L6:
            if (r0 > r3) goto L19
            int r1 = r0 + r3
            int r1 = r1 >>> 1
            r2 = r5[r1]
            if (r2 >= r4) goto L13
            int r0 = r1 + 1
            goto L6
        L13:
            if (r2 <= r4) goto L18
            int r3 = r1 + (-1)
            goto L6
        L18:
            return r1
        L19:
            int r3 = ~r0
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public static final int m6881(long[] r4, int r5, long r6) {
            r4.getClass()
            int r5 = r5 + (-1)
            r0 = 0
        L6:
            if (r0 > r5) goto L1b
            int r1 = r0 + r5
            int r1 = r1 >>> 1
            r2 = r4[r1]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L15
            int r0 = r1 + 1
            goto L6
        L15:
            if (r2 <= 0) goto L1a
            int r5 = r1 + (-1)
            goto L6
        L1a:
            return r1
        L1b:
            int r4 = ~r0
            return r4
    }

    /* JADX INFO: renamed from: λ */
    public static int m6882(java.util.ArrayList r4, java.lang.Comparable r5) {
            int r0 = r4.size()
            r4.getClass()
            int r1 = r4.size()
            r2 = 0
            java.lang.String r3 = ")."
            if (r0 < 0) goto L40
            if (r0 > r1) goto L33
            int r0 = r0 + (-1)
        L14:
            if (r2 > r0) goto L2f
            int r1 = r2 + r0
            int r1 = r1 >>> 1
            java.lang.Object r3 = r4.get(r1)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = p000.AbstractC0073bd.m877(r3, r5)
            if (r3 >= 0) goto L29
            int r2 = r1 + 1
            goto L14
        L29:
            if (r3 <= 0) goto L2e
            int r0 = r1 + (-1)
            goto L14
        L2e:
            return r1
        L2f:
            int r2 = r2 + 1
            int r4 = -r2
            return r4
        L33:
            java.lang.String r4 = "toIndex ("
            java.lang.String r5 = ") is greater than size ("
            java.lang.String r4 = p000.AbstractC0602nx.m4128(r4, r0, r5, r1, r3)
            p000.C1080.m7269(r4)
            r4 = 0
            return r4
        L40:
            java.lang.String r4 = ") is greater than toIndex ("
            java.lang.String r5 = "fromIndex ("
            java.lang.String r4 = p000.AbstractC0602nx.m4128(r5, r2, r4, r0, r3)
            p000.C1080.m7275(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: μ */
    public static p000.zt0 m6883(p000.zt0 r1) {
            r1.m7228()
            r0 = 1
            r1.f13278 = r0
            int r0 = r1.f13277
            if (r0 <= 0) goto Lb
            return r1
        Lb:
            zt0 r1 = p000.zt0.f13275
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static boolean m6884(android.content.Context r7, android.net.Uri r8) {
            r7.getClass()
            r8.getClass()
            r0 = 0
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L71
            r1.getClass()     // Catch: java.lang.Throwable -> L71
            r2 = 1
            char[] r3 = new char[r2]     // Catch: java.lang.Throwable -> L71
            r4 = 47
            r3[r0] = r4     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = p000.q02.m4663(r1, r3)     // Catch: java.lang.Throwable -> L71
            android.content.ContentResolver r3 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L71
            java.util.List r3 = r3.getPersistedUriPermissions()     // Catch: java.lang.Throwable -> L71
            r3.getClass()     // Catch: java.lang.Throwable -> L71
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L2b
            goto L71
        L2b:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L71
        L2f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L71
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L71
            android.content.UriPermission r5 = (android.content.UriPermission) r5     // Catch: java.lang.Throwable -> L71
            boolean r6 = r5.isReadPermission()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L2f
            boolean r6 = r5.isWritePermission()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L2f
            android.net.Uri r5 = r5.getUri()     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L71
            r5.getClass()     // Catch: java.lang.Throwable -> L71
            char[] r6 = new char[r2]     // Catch: java.lang.Throwable -> L71
            r6[r0] = r4     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = p000.q02.m4663(r5, r6)     // Catch: java.lang.Throwable -> L71
            boolean r5 = p000.ln0.m3626(r5, r1)     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L2f
            cw1 r7 = p000.cw1.m1627(r7, r8)     // Catch: java.lang.Throwable -> L71
            boolean r8 = r7.m1631()     // Catch: java.lang.Throwable -> L71
            if (r8 == 0) goto L71
            boolean r7 = r7.m1628()     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L71
            return r2
        L71:
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static final void m6885(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 >= r3) goto L5
            return
        L5:
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r2, r3, r0, r1)
            p000.C1080.m7269(r2)
            return
    }

    /* JADX INFO: renamed from: ο */
    public static final void m6886(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 > r3) goto L5
            return
        L5:
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r2, r3, r0, r1)
            p000.C1080.m7269(r2)
            return
    }

    /* JADX INFO: renamed from: π */
    public static final void m6887(int r4, int r5, int r6) {
            java.lang.String r0 = "fromIndex: "
            if (r4 < 0) goto L13
            if (r5 > r6) goto L13
            if (r4 > r5) goto L9
            return
        L9:
            java.lang.String r6 = " > toIndex: "
            java.lang.String r4 = p000.AbstractC0602nx.m4125(r4, r5, r0, r6)
            p000.C1080.m7275(r4)
            return
        L13:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = ", toIndex: "
            java.lang.String r3 = ", size: "
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r0, r4, r2, r5, r3)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
    }

    /* JADX INFO: renamed from: ρ */
    public static java.util.ArrayList m6888(java.lang.Object r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r11 instanceof java.lang.String
            r2 = 0
            java.lang.String r3 = "http"
            if (r1 == 0) goto L18
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.x02.m6485(r1, r3, r2)
            if (r1 == 0) goto L18
            r0.add(r11)
        L18:
            boolean r1 = r11 instanceof java.util.List
            if (r1 == 0) goto L6e
            r1 = r11
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L3a
            java.lang.Object r5 = r1.next()
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L28
            r4.add(r5)
            goto L28
        L3a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L43:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.x02.m6485(r6, r3, r2)
            if (r6 == 0) goto L43
            r1.add(r5)
            goto L43
        L5a:
            java.util.Iterator r1 = r1.iterator()
        L5e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L5e
        L6e:
            java.lang.String r9 = "uri"
            java.lang.String r10 = "url"
            java.lang.String r5 = "urlList"
            java.lang.String r6 = "url_list"
            java.lang.String r7 = "urls"
            java.lang.String r8 = "_urlList"
            java.lang.String[] r1 = new java.lang.String[]{r5, r6, r7, r8, r9, r10}
            java.util.List r1 = m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L86:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lfc
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = p000.qe0.m4879(r11, r4)     // Catch: java.lang.Throwable -> L86
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto La7
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L86
            boolean r5 = p000.x02.m6485(r5, r3, r2)     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L86
            r0.add(r4)     // Catch: java.lang.Throwable -> L86
            goto L86
        La7:
            boolean r5 = r4 instanceof java.util.List     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L86
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r5.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L86
        Lb6:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto Lc8
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L86
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L86
            if (r7 == 0) goto Lb6
            r5.add(r6)     // Catch: java.lang.Throwable -> L86
            goto Lb6
        Lc8:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r4.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L86
        Ld1:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto Le8
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L86
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L86
            boolean r7 = p000.x02.m6485(r7, r3, r2)     // Catch: java.lang.Throwable -> L86
            if (r7 == 0) goto Ld1
            r4.add(r6)     // Catch: java.lang.Throwable -> L86
            goto Ld1
        Le8:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L86
        Lec:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L86
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L86
            r0.add(r5)     // Catch: java.lang.Throwable -> L86
            goto Lec
        Lfc:
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static int m6889(java.lang.Iterable r1, int r2) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            return r1
        Le:
            return r2
    }

    /* JADX INFO: renamed from: τ */
    public static byte[] m6890(byte[] r3) {
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = 1
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L1e
            r2.write(r3)     // Catch: java.lang.Throwable -> L20
            r2.close()     // Catch: java.lang.Throwable -> L1e
            r0.end()
            byte[] r3 = r1.toByteArray()
            return r3
        L1e:
            r3 = move-exception
            goto L2a
        L20:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch: java.lang.Throwable -> L1e
        L29:
            throw r3     // Catch: java.lang.Throwable -> L1e
        L2a:
            r0.end()
            throw r3
    }

    /* JADX INFO: renamed from: υ */
    public static final p000.AbstractC0100c4 m6891(p000.AbstractC0100c4 r4) {
            c4 r0 = r4.mo29()
            int r1 = r0.mo28()
            r2 = 0
        L9:
            if (r2 >= r1) goto L15
            float r3 = r4.mo27(r2)
            r0.mo31(r2, r3)
            int r2 = r2 + 1
            goto L9
        L15:
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public static final java.lang.Object m6892(p000.e80 r2, p000.InterfaceC0631op r3) {
            wq1 r0 = new wq1
            up r1 = r3.mo72()
            r0.<init>(r3, r1)
            java.lang.Object r2 = p000.i91.m2687(r0, r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: χ */
    public static p000.zt0 m6893() {
            zt0 r0 = new zt0
            r1 = 10
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ψ */
    public static java.lang.String m6894(java.lang.String r2) {
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L22
            java.lang.String r0 = "tree/"
            java.lang.String r2 = p000.q02.m4688(r2, r0, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "primary:"
            java.lang.String r1 = "内部存储/"
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)     // Catch: java.lang.Throwable -> L22
            return r2
        L22:
            java.lang.String r2 = "已选择自定义目录"
            return r2
    }

    /* JADX INFO: renamed from: ω */
    public static final java.lang.Object m6895(p000.g40 r7, p000.xi1 r8, boolean r9, p000.AbstractC0695pp r10) {
            boolean r0 = r10 instanceof p000.i40
            if (r0 == 0) goto L13
            r0 = r10
            i40 r0 = (p000.i40) r0
            int r1 = r0.f4907
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4907 = r1
            goto L18
        L13:
            i40 r0 = new i40
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f4906
            int r1 = r0.f4907
            r2 = 0
            r3 = 2
            r4 = 1
            cq r5 = p000.EnumC0184cq.f2716
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L37
            boolean r9 = r0.f4905
            vc r7 = r0.f4904
            me r8 = r0.f4903
            g40 r1 = r0.f4902
            p000.i81.m2649(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L51
        L35:
            r7 = move-exception
            goto L8b
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r7)
            r7 = 0
            return r7
        L3e:
            boolean r9 = r0.f4905
            vc r7 = r0.f4904
            me r8 = r0.f4903
            g40 r1 = r0.f4902
            p000.i81.m2649(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4a:
            p000.i81.m2649(r10)
            vc r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L51:
            r0.f4902 = r7     // Catch: java.lang.Throwable -> L35
            r0.f4903 = r8     // Catch: java.lang.Throwable -> L35
            r0.f4904 = r10     // Catch: java.lang.Throwable -> L35
            r0.f4905 = r9     // Catch: java.lang.Throwable -> L35
            r0.f4907 = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.m6166(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L62
            goto L82
        L62:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L83
            java.lang.Object r10 = r7.m6167()     // Catch: java.lang.Throwable -> L35
            r0.f4902 = r1     // Catch: java.lang.Throwable -> L35
            r0.f4903 = r8     // Catch: java.lang.Throwable -> L35
            r0.f4904 = r7     // Catch: java.lang.Throwable -> L35
            r0.f4905 = r9     // Catch: java.lang.Throwable -> L35
            r0.f4907 = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.mo1985(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L82:
            return r5
        L83:
            if (r9 == 0) goto L88
            r8.mo2180(r2)
        L88:
            s62 r7 = p000.s62.f9751
            return r7
        L8b:
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r10 = move-exception
            if (r9 == 0) goto La5
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L96
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L96:
            if (r2 != 0) goto La2
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La2:
            r8.mo2180(r2)
        La5:
            throw r10
    }

    /* JADX INFO: renamed from: а */
    public static java.util.List m6896(java.lang.Object r0) {
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r0.getClass()
            return r0
    }

    /* JADX INFO: renamed from: б */
    public static java.util.List m6897(java.lang.Object... r1) {
            int r0 = r1.length
            if (r0 <= 0) goto Lb
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            return r1
        Lb:
            jz r1 = p000.C0450jz.f5672
            return r1
    }

    /* JADX INFO: renamed from: в */
    public static java.util.List m6898(java.lang.Object r0) {
            if (r0 == 0) goto L7
            java.util.List r0 = m6896(r0)
            return r0
        L7:
            jz r0 = p000.C0450jz.f5672
            return r0
    }

    /* JADX INFO: renamed from: г */
    public static java.util.ArrayList m6899(java.lang.Object... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            v6 r1 = new v6
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: д */
    public static final java.util.List m6900(java.util.List r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L14
            r1 = 1
            if (r0 == r1) goto La
            return r2
        La:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = m6896(r2)
            return r2
        L14:
            jz r2 = p000.C0450jz.f5672
            return r2
    }

    /* JADX INFO: renamed from: е */
    public static final p000.r01 m6901(p000.r01 r1, float r2) {
            b91 r0 = new b91
            r0.<init>(r2, r2, r2, r2)
            r01 r1 = r1.mo4345(r0)
            return r1
    }

    /* JADX INFO: renamed from: ж */
    public static p000.r01 m6902(p000.r01 r2, float r3, float r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            float r3 = (float) r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            float r4 = (float) r1
        Lb:
            b91 r5 = new b91
            r5.<init>(r3, r4, r3, r4)
            r01 r2 = r2.mo4345(r5)
            return r2
    }

    /* JADX INFO: renamed from: з */
    public static void m6903(android.content.Context r5, java.lang.String r6) {
            java.lang.Object r0 = p000.AbstractC1021yh.f12615
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
    }

    /* JADX INFO: renamed from: и */
    public static java.lang.String m6904(java.security.cert.X509Certificate r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sha256/"
            r0.<init>(r1)
            dd r1 = p000.C0208dd.f3085
            java.security.PublicKey r13 = r13.getPublicKey()
            byte[] r13 = r13.getEncoded()
            r13.getClass()
            int r1 = r13.length
            int r2 = r13.length
            long r3 = (long) r2
            r2 = 0
            long r5 = (long) r2
            long r7 = (long) r1
            p000.ln0.m3629(r3, r5, r7)
            dd r3 = new dd
            byte[] r13 = p000.AbstractC0312g7.m2241(r13, r2, r1)
            r3.<init>(r13)
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
            int r3 = r3.mo1701()
            r1.update(r13, r2, r3)
            byte[] r13 = r1.digest()
            dd r1 = new dd
            r13.getClass()
            r1.<init>(r13)
            byte[] r1 = p000.AbstractC1078.f13386
            r1.getClass()
            int r3 = r13.length
            r4 = 2
            int r3 = r3 + r4
            int r3 = r3 / 3
            int r3 = r3 * 4
            byte[] r3 = new byte[r3]
            int r5 = r13.length
            int r6 = r13.length
            int r6 = r6 % 3
            int r5 = r5 - r6
            r6 = r2
        L53:
            if (r2 >= r5) goto L90
            int r7 = r2 + 1
            r8 = r13[r2]
            int r9 = r2 + 2
            r7 = r13[r7]
            int r2 = r2 + 3
            r9 = r13[r9]
            int r10 = r6 + 1
            r11 = r8 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> r4
            r11 = r1[r11]
            r3[r6] = r11
            int r11 = r6 + 2
            r8 = r8 & 3
            int r8 = r8 << 4
            r12 = r7 & 255(0xff, float:3.57E-43)
            int r12 = r12 >> 4
            r8 = r8 | r12
            r8 = r1[r8]
            r3[r10] = r8
            int r8 = r6 + 3
            r7 = r7 & 15
            int r7 = r7 << r4
            r10 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 6
            r7 = r7 | r10
            r7 = r1[r7]
            r3[r11] = r7
            int r6 = r6 + 4
            r7 = r9 & 63
            r7 = r1[r7]
            r3[r8] = r7
            goto L53
        L90:
            int r7 = r13.length
            int r7 = r7 - r5
            r5 = 1
            r8 = 61
            if (r7 == r5) goto Lc4
            if (r7 == r4) goto L9a
            goto Le0
        L9a:
            int r5 = r2 + 1
            r2 = r13[r2]
            r13 = r13[r5]
            int r5 = r6 + 1
            r7 = r2 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> r4
            r7 = r1[r7]
            r3[r6] = r7
            int r7 = r6 + 2
            r2 = r2 & 3
            int r2 = r2 << 4
            r9 = r13 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 4
            r2 = r2 | r9
            r2 = r1[r2]
            r3[r5] = r2
            int r6 = r6 + 3
            r13 = r13 & 15
            int r13 = r13 << r4
            r13 = r1[r13]
            r3[r7] = r13
            r3[r6] = r8
            goto Le0
        Lc4:
            r13 = r13[r2]
            int r2 = r6 + 1
            r5 = r13 & 255(0xff, float:3.57E-43)
            int r4 = r5 >> 2
            r4 = r1[r4]
            r3[r6] = r4
            int r4 = r6 + 2
            r13 = r13 & 3
            int r13 = r13 << 4
            r13 = r1[r13]
            r3[r2] = r13
            int r6 = r6 + 3
            r3[r4] = r8
            r3[r6] = r8
        Le0:
            java.lang.String r13 = new java.lang.String
            java.nio.charset.Charset r1 = p000.AbstractC0547mf.f7105
            r13.<init>(r3, r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            return r13
    }

    /* JADX INFO: renamed from: й */
    public static void m6905(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            p000.ui1.m5875(r3, r4)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            goto L23
        Lc:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "dyhelper_prefs"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> La
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> La
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r4)     // Catch: java.lang.Throwable -> La
            r2.apply()     // Catch: java.lang.Throwable -> La
            return
        L23:
            java.lang.String r4 = "保存下载目录授权状态失败: "
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r4 = "DYHelper"
            p000.C0888ux.m5977(r4, r3, r2)
            return
    }

    /* JADX INFO: renamed from: к */
    public static byte[] m6906(java.io.InputStream r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
        L3:
            if (r1 >= r4) goto L1a
            int r2 = r4 - r1
            int r2 = r3.read(r0, r1, r2)
            if (r2 < 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.lang.String r3 = "Not enough bytes to read: "
            java.lang.String r3 = p000.a12.m17(r3, r4)
            p000.C1080.m7279(r3)
            r3 = 0
            return r3
        L1a:
            return r0
    }

    /* JADX INFO: renamed from: л */
    public static byte[] m6907(java.io.FileInputStream r8, int r9, int r10) {
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
    }

    /* JADX INFO: renamed from: м */
    public static java.lang.String m6908(android.content.Context r8) {
            java.lang.Object r0 = p000.AbstractC1021yh.f12615
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
    }

    /* JADX INFO: renamed from: н */
    public static long m6909(java.io.InputStream r6, int r7) {
            byte[] r6 = m6906(r6, r7)
            r0 = 0
            r2 = 0
        L7:
            if (r2 >= r7) goto L15
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    /* JADX INFO: renamed from: о */
    public static final java.lang.Object m6910(java.lang.Object r1) {
            boolean r0 = r1 instanceof p000.C0628om
            if (r0 == 0) goto Lc
            om r1 = (p000.C0628om) r1
            java.lang.Throwable r1 = r1.f8149
            eo1 r1 = p000.i81.m2661(r1)
        Lc:
            return r1
    }

    /* JADX INFO: renamed from: п */
    public static void m6911(android.app.Activity r3, p000.a80 r4) {
            r3.getClass()
            ju r0 = new ju     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            hu r1 = new hu     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r1.<init>(r3, r4, r2)     // Catch: java.lang.Throwable -> L22
            r0.f5582 = r1     // Catch: java.lang.Throwable -> L22
            android.app.FragmentManager r1 = r3.getFragmentManager()     // Catch: java.lang.Throwable -> L22
            android.app.FragmentTransaction r1 = r1.beginTransaction()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "DYHelper_DownloadDirectoryPicker"
            android.app.FragmentTransaction r0 = r1.add(r0, r2)     // Catch: java.lang.Throwable -> L22
            r0.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r0 = move-exception
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "启动下载目录授权失败"
            p000.C0888ux.m5977(r1, r2, r0)
            java.lang.String r1 = "download_saf_auth_state"
            java.lang.String r2 = "canceled"
            m6905(r3, r1, r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "无法打开目录选择器: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
            r3.show()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.invoke(r3)
            return
    }

    /* JADX INFO: renamed from: р */
    public static final void m6912(p000.qm1 r3, p000.um1 r4, android.app.Activity r5, android.app.AlertDialog r6) {
            r0 = 1
            r3.f9050 = r0
            java.lang.Object r3 = r4.f10912
            t90 r3 = (p000.t90) r3
            r1 = 0
            if (r3 == 0) goto L17
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.f10254
            boolean r2 = r2.compareAndSet(r1, r0)
            if (r2 == 0) goto L17
            p3 r3 = r3.f10253
            r3.invoke()
        L17:
            r3 = 0
            r4.f10912 = r3
            long[] r3 = p000.u90.f10651
            r5.getClass()
            java.lang.String r3 = "geonames_database"
            android.content.SharedPreferences r3 = r5.getSharedPreferences(r3, r1)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = "prompt_suppressed"
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r4, r0)
            r3.apply()
            r6.dismiss()
            return
    }

    /* JADX INFO: renamed from: с */
    public static final void m6913(p000.um1 r1, android.widget.ProgressBar r2, android.widget.TextView r3, p000.C1000xx r4, android.widget.LinearLayout r5, android.widget.Button r6, android.widget.Button r7, java.lang.Throwable r8) {
            r0 = 0
            r1.f10912 = r0
            r1 = 0
            r2.setVisibility(r1)
            r3.setVisibility(r1)
            java.lang.String r2 = r4.f12366
            int r2 = android.graphics.Color.parseColor(r2)
            r3.setTextColor(r2)
            java.lang.String r2 = r8.getMessage()
            if (r2 != 0) goto L1b
            java.lang.String r2 = "网络错误"
        L1b:
            java.lang.String r4 = "下载失败："
            java.lang.String r2 = r4.concat(r2)
            r3.setText(r2)
            r2 = 1
            r5.setEnabled(r2)
            r6.setVisibility(r1)
            r2 = 8
            r7.setVisibility(r2)
            r7.setEnabled(r1)
            return
    }

    /* JADX INFO: renamed from: т */
    public static final void m6914(p000.um1 r19, p000.um1 r20, android.widget.Button r21, android.widget.Button r22, android.widget.LinearLayout r23, android.widget.ProgressBar r24, android.widget.TextView r25, p000.C1000xx r26, android.app.Activity r27, android.app.AlertDialog r28, p000.qm1 r29, android.widget.TextView r30, p000.p70 r31) {
            r4 = r19
            r10 = r22
            r5 = r24
            r6 = r25
            java.lang.Object r0 = r4.f10912
            if (r0 == 0) goto Ld
            return
        Ld:
            r0 = r20
            java.lang.Object r0 = r0.f10912
            r9 = r0
            s90 r9 = (p000.s90) r9
            r0 = 8
            r1 = r21
            r1.setVisibility(r0)
            r0 = 0
            r10.setVisibility(r0)
            r10.setEnabled(r0)
            java.lang.String r2 = "下载中..."
            r10.setText(r2)
            r2 = r23
            r2.setEnabled(r0)
            r5.setVisibility(r0)
            r5.setProgress(r0)
            r6.setVisibility(r0)
            r3 = r26
            java.lang.String r7 = r3.f12356
            int r7 = android.graphics.Color.parseColor(r7)
            r6.setTextColor(r7)
            java.lang.String r7 = r9.f9771
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "准备从 "
            r8.<init>(r11)
            r8.append(r7)
            java.lang.String r7 = " 下载..."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.setText(r7)
            long[] r7 = p000.u90.f10651
            android.content.Context r18 = r27.getApplicationContext()
            r18.getClass()
            m90 r11 = new m90
            r17 = 0
            r12 = r27
            r13 = r28
            r16 = r3
            r14 = r5
            r15 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            n90 r7 = new n90
            r8 = r25
            r1 = r26
            r5 = r27
            r6 = r28
            r3 = r29
            r2 = r31
            r12 = r0
            r0 = r7
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13 = r0
            pu r8 = new pu
            r4 = r19
            r5 = r24
            r6 = r25
            r7 = r26
            r1 = r27
            r2 = r28
            r0 = r8
            r14 = r9
            r9 = r21
            r8 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r8 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.u90.f10654
            r1 = 1
            boolean r0 = r0.compareAndSet(r12, r1)
            java.lang.String r2 = r14.f9771
            r3 = 4
            java.lang.String r4 = "raf02e3c7781e553e"
            r5 = 0
            if (r0 != 0) goto Lb7
            java.lang.String r0 = "GeoNames 下载请求已忽略：已有下载任务进行中，来源="
            java.lang.String r0 = r0.concat(r2)
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            goto Lf2
        Lb7:
            java.lang.String r0 = r14.m5377(r1)
            java.lang.String r1 = "开始下载 GeoNames 国外地区数据库，来源="
            java.lang.String r6 = "，首个分卷 URL="
            java.lang.String r0 = p000.a12.m18(r1, r2, r6, r0)
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r12)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r5)
            t90 r9 = new t90
            p3 r1 = new p3
            r2 = 10
            r1.<init>(r4, r2, r0)
            r9.<init>(r1)
            java.lang.Thread r10 = new java.lang.Thread
            o90 r1 = new o90
            r5 = r0
            r6 = r11
            r7 = r13
            r3 = r14
            r2 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "DY-GeoNames-Download"
            r10.<init>(r1, r0)
            r10.start()
            r5 = r9
        Lf2:
            if (r5 != 0) goto L10d
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "已有下载任务正在运行"
            r7.<init>(r0)
            r0 = r19
            r5 = r21
            r6 = r22
            r4 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            m6913(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L10d:
            r4 = r19
            r4.f10912 = r5
            return
    }

    /* JADX INFO: renamed from: у */
    public static p000.C0407iu m6915(android.content.Context r6) {
            r6.getClass()
            java.lang.String r0 = "download_uri"
            java.lang.String r1 = ""
            java.lang.String r0 = m6862(r6, r0, r1)
            boolean r1 = p000.q02.m4671(r0)
            r2 = 0
            if (r1 != 0) goto L13
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L31
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r1 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        L22:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L27
            goto L28
        L27:
            r2 = r1
        L28:
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L31
            boolean r1 = m6884(r6, r2)
            goto L32
        L31:
            r1 = 0
        L32:
            java.lang.String r2 = "download_saf_auth_state"
            java.lang.String r3 = "unasked"
            java.lang.String r4 = m6862(r6, r2, r3)
            if (r1 == 0) goto L3f
            java.lang.String r3 = "granted"
            goto L48
        L3f:
            java.lang.String r5 = "canceled"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L48
            r3 = r4
        L48:
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L51
            m6905(r6, r2, r3)
        L51:
            iu r6 = new iu
            r6.<init>(r3, r0, r1)
            return r6
    }

    /* JADX INFO: renamed from: ф */
    public static void m6916() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: х */
    public static void m6917() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ц */
    public static final java.lang.String m6918(p000.InterfaceC0631op r3) {
            boolean r0 = r3 instanceof p000.C0334gt
            if (r0 == 0) goto Lb
            gt r3 = (p000.C0334gt) r3
            java.lang.String r3 = r3.toString()
            return r3
        Lb:
            r0 = 64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r1.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = m6855(r3)     // Catch: java.lang.Throwable -> L24
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L2b:
            java.lang.Throwable r2 = p000.fo1.m2190(r1)
            if (r2 != 0) goto L32
            goto L50
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = m6855(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L50:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    /* JADX INFO: renamed from: ч */
    public static void m6919(java.io.ByteArrayOutputStream r6, long r7, int r9) {
            byte[] r0 = new byte[r9]
            r1 = 0
        L3:
            if (r1 >= r9) goto L13
            int r2 = r1 * 8
            long r2 = r7 >> r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        L13:
            r6.write(r0)
            return
    }

    /* JADX INFO: renamed from: ш */
    public static void m6920(java.io.ByteArrayOutputStream r2, int r3) {
            long r0 = (long) r3
            r3 = 2
            m6919(r2, r0, r3)
            return
    }
}
