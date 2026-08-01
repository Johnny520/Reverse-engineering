package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class u00 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f10545 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f10546 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.u00.f10545 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.u00.f10546 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.reflect.Field m5770(java.lang.Class r5, java.lang.ClassLoader r6) {
            r0 = 0
            java.lang.String r1 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.Class r1 = java.lang.Class.forName(r1, r0, r6)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L13:
            boolean r2 = r1 instanceof p000.eo1
            r3 = 0
            if (r2 == 0) goto L19
            r1 = r3
        L19:
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 != 0) goto L1e
            return r3
        L1e:
            zt0 r2 = p000.AbstractC1021yh.m6893()
            if (r5 == 0) goto L27
            r2.add(r5)
        L27:
            java.lang.String r5 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"
            java.lang.String r5 = p000.jf0.m2957(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.Class r5 = java.lang.Class.forName(r5, r0, r6)     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L39:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L3e
            r5 = r3
        L3e:
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L45
            r2.add(r5)
        L45:
            zt0 r5 = p000.AbstractC1021yh.m6883(r2)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ListIterator r5 = r5.listIterator(r0)
        L57:
            r0 = r5
            le0 r0 = (p000.le0) r0
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r0 = r0.next()
            r4 = r0
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = r6.add(r4)
            if (r4 == 0) goto L57
            r2.add(r0)
            goto L57
        L75:
            f7 r5 = new f7
            r6 = 1
            r5.<init>(r6, r2)
            q00 r6 = new q00
            r0 = 3
            r6.<init>(r0)
            c40 r0 = new c40
            vs1 r2 = p000.vs1.f11382
            r0.<init>(r5, r6, r2)
            q00 r5 = new q00
            r6 = 4
            r5.<init>(r6)
            y30 r6 = new y30
            r2 = 1
            r6.<init>(r0, r2, r5)
            t00 r5 = new t00
            r0 = 0
            r5.<init>(r1, r0)
            y30 r0 = new y30
            r0.<init>(r6, r2, r5)
            q00 r5 = new q00
            r6 = 5
            r5.<init>(r6)
            t52 r5 = p000.us1.m5945(r0, r5)
            a80 r6 = r5.f10208
            ss1 r5 = r5.f10207
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto Lb8
            goto Le7
        Lb8:
            java.lang.Object r0 = r5.next()
            java.lang.Object r3 = r6.invoke(r0)
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto Lc7
            goto Le7
        Lc7:
            r0 = r3
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = m5772(r0)
        Lce:
            java.lang.Object r1 = r5.next()
            java.lang.Object r1 = r6.invoke(r1)
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = m5772(r2)
            if (r0 >= r2) goto Le1
            r3 = r1
            r0 = r2
        Le1:
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto Lce
        Le7:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            return r3
    }

    /* JADX INFO: renamed from: β */
    public static void m5771(java.lang.ClassLoader r3, boolean r4) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6204
            java.lang.reflect.Field r1 = p000.C0666ox.m4322(r0, r3)
            r2 = 1
            if (r1 == 0) goto Lf
            r1.setAccessible(r2)
            return
        Lf:
            if (r4 == 0) goto L2e
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.C0666ox.f8305
            boolean r4 = r4.get()
            if (r4 == 0) goto L2e
            bb r4 = new bb
            r1 = 22
            r4.<init>(r3, r1)
            java.lang.String r1 = "定位 Feed ViewHolder 当前作品字段"
            java.lang.reflect.Field r4 = p000.C0666ox.m4315(r0, r3, r1, r4)
            if (r4 == 0) goto L2b
            r4.setAccessible(r2)
        L2b:
            if (r4 == 0) goto L2e
            goto L38
        L2e:
            r4 = 0
            java.lang.reflect.Field r3 = m5770(r4, r3)
            if (r3 == 0) goto L38
            r3.setAccessible(r2)
        L38:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static int m5772(java.lang.reflect.Field r4) {
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L18
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L19
        L18:
            r0 = r1
        L19:
            java.lang.Class r2 = r4.getType()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2f
            int r0 = r0 + 1500
        L2f:
            int r2 = r4.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L3b
            int r0 = r0 + 500
        L3b:
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = "feed.adapter"
            boolean r4 = p000.q02.m4654(r4, r2, r1)
            if (r4 == 0) goto L4d
            int r0 = r0 + 300
        L4d:
            return r0
    }
}
