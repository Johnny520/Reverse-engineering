package a;

/* JADX INFO: loaded from: classes.dex */
public final class Kf {
    public Kf() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.Object r2) {
            if (r2 == 0) goto Lc2
            boolean r0 = r2 instanceof a.P7
            if (r0 == 0) goto Lbb
            boolean r0 = r2 instanceof a.Q7
            r1 = 2
            if (r0 == 0) goto L14
            r0 = r2
            a.Q7 r0 = (a.Q7) r0
            int r0 = r0.b()
            goto Lb8
        L14:
            boolean r0 = r2 instanceof a.InterfaceC0369s7
            if (r0 == 0) goto L1b
            r0 = 0
            goto Lb8
        L1b:
            boolean r0 = r2 instanceof a.D7
            if (r0 == 0) goto L22
            r0 = 1
            goto Lb8
        L22:
            boolean r0 = r2 instanceof a.H7
            if (r0 == 0) goto L29
            r0 = r1
            goto Lb8
        L29:
            boolean r0 = r2 instanceof a.I7
            if (r0 == 0) goto L30
            r0 = 3
            goto Lb8
        L30:
            boolean r0 = r2 instanceof a.J7
            if (r0 == 0) goto L37
            r0 = 4
            goto Lb8
        L37:
            boolean r0 = r2 instanceof a.K7
            if (r0 == 0) goto L3e
            r0 = 5
            goto Lb8
        L3e:
            boolean r0 = r2 instanceof a.L7
            if (r0 == 0) goto L45
            r0 = 6
            goto Lb8
        L45:
            boolean r0 = r2 instanceof a.M7
            if (r0 == 0) goto L4c
            r0 = 7
            goto Lb8
        L4c:
            boolean r0 = r2 instanceof a.N7
            if (r0 == 0) goto L54
            r0 = 8
            goto Lb8
        L54:
            boolean r0 = r2 instanceof a.O7
            if (r0 == 0) goto L5c
            r0 = 9
            goto Lb8
        L5c:
            boolean r0 = r2 instanceof a.InterfaceC0387t7
            if (r0 == 0) goto L63
            r0 = 10
            goto Lb8
        L63:
            boolean r0 = r2 instanceof a.InterfaceC0405u7
            if (r0 == 0) goto L6a
            r0 = 11
            goto Lb8
        L6a:
            boolean r0 = r2 instanceof a.InterfaceC0423v7
            if (r0 == 0) goto L71
            r0 = 12
            goto Lb8
        L71:
            boolean r0 = r2 instanceof a.InterfaceC0441w7
            if (r0 == 0) goto L78
            r0 = 13
            goto Lb8
        L78:
            boolean r0 = r2 instanceof a.InterfaceC0459x7
            if (r0 == 0) goto L7f
            r0 = 14
            goto Lb8
        L7f:
            boolean r0 = r2 instanceof a.InterfaceC0477y7
            if (r0 == 0) goto L86
            r0 = 15
            goto Lb8
        L86:
            boolean r0 = r2 instanceof a.InterfaceC0495z7
            if (r0 == 0) goto L8d
            r0 = 16
            goto Lb8
        L8d:
            boolean r0 = r2 instanceof a.A7
            if (r0 == 0) goto L94
            r0 = 17
            goto Lb8
        L94:
            boolean r0 = r2 instanceof a.B7
            if (r0 == 0) goto L9b
            r0 = 18
            goto Lb8
        L9b:
            boolean r0 = r2 instanceof a.C7
            if (r0 == 0) goto La2
            r0 = 19
            goto Lb8
        La2:
            boolean r0 = r2 instanceof a.E7
            if (r0 == 0) goto La9
            r0 = 20
            goto Lb8
        La9:
            boolean r0 = r2 instanceof a.F7
            if (r0 == 0) goto Lb0
            r0 = 21
            goto Lb8
        Lb0:
            boolean r0 = r2 instanceof a.G7
            if (r0 == 0) goto Lb7
            r0 = 22
            goto Lb8
        Lb7:
            r0 = -1
        Lb8:
            if (r0 != r1) goto Lbb
            goto Lc2
        Lbb:
            java.lang.String r0 = "kotlin.jvm.functions.Function2"
            c(r2, r0)
            r2 = 0
            throw r2
        Lc2:
            return
    }

    public static boolean b(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof a.InterfaceC0336q9
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof a.InterfaceC0353r9
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static void c(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " cannot be cast to "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>(r1)
            java.lang.Class<a.Kf> r1 = a.Kf.class
            java.lang.String r1 = r1.getName()
            a.C0193i9.f(r2, r1)
            throw r2
    }
}
