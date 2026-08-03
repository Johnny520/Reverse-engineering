package a;

/* JADX INFO: renamed from: a.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0342qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0342qf f660a = null;
    public static final java.util.Set<java.lang.String> b = null;
    public static final java.util.List<a.InterfaceC0359rf> c = null;

    static {
            r0 = 1
            r1 = 0
            r2 = 2
            a.qf r3 = new a.qf
            r3.<init>()
            a.C0342qf.f660a = r3
            java.lang.String r3 = "Weixin"
            java.lang.String r4 = "微信"
            java.lang.String r5 = "WeChat"
            java.lang.String[] r3 = new java.lang.String[]{r4, r5, r3}
            java.util.Set r3 = a.C0282n9.z(r3)
            a.C0342qf.b = r3
            a.V3 r3 = new a.V3
            r3.<init>(r2)
            a.V3 r4 = new a.V3
            r4.<init>(r1)
            a.od r5 = new a.od
            r5.<init>()
            a.V3 r6 = new a.V3
            r6.<init>(r0)
            r7 = 4
            a.rf[] r7 = new a.InterfaceC0359rf[r7]
            r7[r1] = r3
            r7[r0] = r4
            r7[r2] = r5
            r0 = 3
            r7[r0] = r6
            java.util.List r0 = a.C0294o3.d0(r7)
            a.C0342qf.c = r0
            return
    }

    public static android.widget.TextView a(android.app.Activity r6, android.view.View r7) {
            java.lang.String r0 = "rootView"
            a.C0193i9.e(r7, r0)
            java.util.List<a.rf> r0 = a.C0342qf.c
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            a.rf r1 = (a.InterfaceC0359rf) r1
            android.widget.TextView r4 = r1.a(r6, r7)     // Catch: java.lang.Throwable -> L1e
            goto L23
        L1e:
            r4 = move-exception
            a.wd$a r4 = a.C0465xd.a(r4)
        L23:
            boolean r5 = r4 instanceof a.C0447wd.a
            if (r5 == 0) goto L28
            goto L29
        L28:
            r3 = r4
        L29:
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto Lb
            java.lang.Class r6 = r1.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.CharSequence r7 = r3.getText()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TitleLocator: located by "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " text='"
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = "'"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            a.C0453x1.b(r6)
            return r3
        L60:
            java.lang.String r6 = "TitleLocator: all strategies failed, title not found"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            a.C0453x1.e(r6)
            return r3
    }

    public static int b(android.app.Activity r2) {
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r0 = r2.heightPixels
            float r2 = r2.density
            float r0 = (float) r0
            r1 = 1050253722(0x3e99999a, float:0.3)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 200(0xc8, float:2.8E-43)
            float r1 = (float) r1
            float r1 = r1 * r2
            int r2 = (int) r1
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 120(0x78, float:1.68E-43)
            if (r2 >= r0) goto L20
            return r0
        L20:
            return r2
    }
}
