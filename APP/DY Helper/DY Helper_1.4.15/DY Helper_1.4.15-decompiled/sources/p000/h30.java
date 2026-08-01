package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class h30 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f4556 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.h30.f4556 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.reflect.Field m2345(java.lang.Class r3, java.lang.String r4, java.lang.String r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r3 == 0) goto L14
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L14
            java.lang.Class r3 = p000.lz1.m3684(r3, r0)
            goto L5
        L14:
            f7 r3 = new f7
            r1 = 1
            r3.<init>(r1, r0)
            s20 r0 = new s20
            r1 = 13
            r0.<init>(r1)
            y30 r1 = new y30
            r2 = 1
            r1.<init>(r3, r2, r0)
            s9 r3 = new s9
            r0 = 24
            r3.<init>(r5, r0)
            y30 r5 = new y30
            r5.<init>(r1, r2, r3)
            s20 r3 = new s20
            r0 = 20
            r3.<init>(r0)
            t52 r3 = p000.us1.m5945(r5, r3)
            ss1 r5 = r3.f10207
            java.util.Iterator r5 = r5.iterator()
        L44:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L62
            a80 r0 = r3.f10208
            java.lang.Object r1 = r5.next()
            java.lang.Object r0 = r0.invoke(r1)
            r1 = r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.String r1 = m2352(r1)
            boolean r1 = p000.ln0.m3626(r1, r4)
            if (r1 == 0) goto L44
            goto L63
        L62:
            r0 = 0
        L63:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m2346(java.lang.ClassLoader r5) {
            r5.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6203
            java.util.List r5 = p000.C0666ox.m4323(r0, r5)
            if (r5 != 0) goto Lf
            jz r5 = p000.C0450jz.f5672
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r5.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L18
            java.lang.Class r3 = r2.getReturnType()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"
            java.lang.String r4 = p000.jf0.m2957(r4)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L57
            java.lang.Class r2 = r2.getReturnType()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L18
        L57:
            r0.add(r1)
            goto L18
        L5b:
            java.util.Iterator r5 = r0.iterator()
        L5f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2 = 1
            r1.setAccessible(r2)
            goto L5f
        L70:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.reflect.Field m2347(java.lang.ClassLoader r2, p000.g30 r3) {
            java.lang.String r0 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L13:
            boolean r0 = r2 instanceof p000.eo1
            r1 = 0
            if (r0 == 0) goto L19
            r2 = r1
        L19:
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L1e
            return r1
        L1e:
            java.lang.String r0 = r3.f4221
            java.lang.String r3 = r3.f4222
            java.lang.reflect.Field r2 = m2345(r2, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static void m2348(p000.g30 r4, java.lang.ClassLoader r5, boolean r6) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = r4.f4220
            java.lang.reflect.Field r0 = p000.C0666ox.m4322(r0, r5)
            r1 = 1
            if (r0 == 0) goto Lf
            r0.setAccessible(r1)
            return
        Lf:
            if (r6 == 0) goto L30
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.C0666ox.f8305
            boolean r6 = r6.get()
            if (r6 == 0) goto L30
            kx r6 = r4.f4220
            java.lang.String r0 = r6.f6297
            wa r2 = new wa
            r3 = 14
            r2.<init>(r5, r3, r4)
            java.lang.reflect.Field r6 = p000.C0666ox.m4315(r6, r5, r0, r2)
            if (r6 == 0) goto L2d
            r6.setAccessible(r1)
        L2d:
            if (r6 == 0) goto L30
            return
        L30:
            java.lang.reflect.Field r4 = m2347(r5, r4)
            if (r4 == 0) goto L39
            r4.setAccessible(r1)
        L39:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m2349(java.lang.ClassLoader r6, boolean r7) {
            java.util.ArrayList r0 = m2346(r6)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            goto Le1
        Lc:
            java.lang.String r0 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L18
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r6)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L1f:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L24
            r0 = 0
        L24:
            java.lang.Class r0 = (java.lang.Class) r0
            r1 = 1
            jz r2 = p000.C0450jz.f5672
            if (r0 != 0) goto L2c
            goto L92
        L2c:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            s20 r3 = new s20
            r4 = 17
            r3.<init>(r4)
            y30 r4 = new y30
            r4.<init>(r0, r1, r3)
            s20 r0 = new s20
            r3 = 18
            r0.<init>(r3)
            t52 r0 = p000.us1.m5945(r4, r0)
            qt r4 = new qt
            r4.<init>(r3)
            s20 r3 = new s20
            r5 = 19
            r3.<init>(r5)
            bu r5 = new bu
            java.util.List r0 = p000.us1.m5949(r0)
            p000.AbstractC0019ai.m168(r0, r4)
            java.util.Iterator r0 = r0.iterator()
            r5.<init>(r0, r3)
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L71
            goto L92
        L71:
            java.lang.Object r0 = r5.next()
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L80
            java.util.List r2 = p000.AbstractC1021yh.m6896(r0)
            goto L92
        L80:
            java.util.ArrayList r2 = p000.lz1.m3696(r0)
        L84:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r5.next()
            r2.add(r0)
            goto L84
        L92:
            boolean r0 = r2.isEmpty()
            kx r3 = p000.EnumC0491kx.f6203
            if (r0 != 0) goto Lb4
            java.util.Iterator r6 = r2.iterator()
        L9e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lae
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r1)
            goto L9e
        Lae:
            java.lang.Object r6 = p000.C0666ox.f8297
            p000.C0666ox.m4327(r3, r2)
            return
        Lb4:
            if (r7 == 0) goto Le1
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto Lc1
            goto Le1
        Lc1:
            t20 r7 = new t20
            r0 = 2
            r7.<init>(r6, r0)
            java.lang.String r0 = "定位视频播放地址模型 Getter 方法"
            java.util.List r6 = p000.C0666ox.m4316(r3, r6, r0, r7)
            java.util.Iterator r6 = r6.iterator()
        Ld1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Le1
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r1)
            goto Ld1
        Le1:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static int m2350(java.lang.reflect.Field r3, p000.g30 r4) {
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L18
        L17:
            r0 = 0
        L18:
            int r1 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L24
            int r0 = r0 + 300
        L24:
            java.lang.String r1 = m2352(r3)
            java.lang.String r2 = r4.f4221
            java.lang.String r4 = r4.f4222
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L34
            int r0 = r0 + 5000
        L34:
            java.lang.String r1 = "java.util.List"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L4b
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class r2 = r3.getType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L4b
            int r0 = r0 + 800
            return r0
        L4b:
            java.lang.String r1 = "boolean"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6e
            java.lang.Class r1 = r3.getType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L6b
            java.lang.Class r1 = r3.getType()
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L6e
        L6b:
            int r0 = r0 + 800
            return r0
        L6e:
            java.lang.Class r3 = r3.getType()
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7e
            int r0 = r0 + 800
        L7e:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static int m2351(java.lang.reflect.Method r2) {
            java.lang.Class r0 = r2.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L18
        L17:
            r0 = 0
        L18:
            int r1 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L24
            int r0 = r0 + 300
        L24:
            java.lang.Class[] r1 = r2.getParameterTypes()
            r1.getClass()
            int r1 = r1.length
            if (r1 != 0) goto L30
            int r0 = r0 + 300
        L30:
            java.lang.Class r2 = r2.getReturnType()
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L47
            int r0 = r0 + 600
            return r0
        L47:
            java.lang.String r1 = "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L55
            int r0 = r0 + 500
        L55:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m2352(java.lang.reflect.Field r5) {
            java.lang.annotation.Annotation[] r5 = r5.getDeclaredAnnotations()
            τ r5 = p000.h62.m2434(r5)
        L8:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r5.next()
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            wf r2 = p000.ln0.m3599(r0)
            java.lang.Class r2 = p000.ln0.m3604(r2)
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "com.google.gson.annotations.SerializedName"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L8
            java.lang.String r5 = "value"
            java.lang.reflect.Method r5 = r2.getDeclaredMethod(r5, r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L3c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3a
            goto L44
        L3a:
            r5 = move-exception
            goto L3e
        L3c:
            r5 = r1
            goto L44
        L3e:
            eo1 r0 = new eo1
            r0.<init>(r5)
            r5 = r0
        L44:
            boolean r0 = r5 instanceof p000.eo1
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r1 = r5
        L4a:
            java.lang.String r1 = (java.lang.String) r1
        L4c:
            return r1
    }
}
