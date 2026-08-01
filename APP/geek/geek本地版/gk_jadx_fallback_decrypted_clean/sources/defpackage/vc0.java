package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vc0 {
    public static int a(int r4) {
            r0 = 0
            r1 = 1
            r2 = r1
        L3:
            r3 = 256(0x100, float:3.59E-43)
            if (r2 > r3) goto L54
            r3 = r4 & r2
            if (r3 == 0) goto L51
            if (r2 == r1) goto L4c
            r3 = 2
            if (r2 == r3) goto L47
            r3 = 4
            if (r2 == r3) goto L42
            r3 = 8
            if (r2 == r3) goto L3d
            r3 = 16
            if (r2 == r3) goto L38
            r3 = 32
            if (r2 == r3) goto L33
            r3 = 64
            if (r2 == r3) goto L2e
            r3 = 128(0x80, float:1.8E-43)
            if (r2 == r3) goto L28
            goto L51
        L28:
            int r3 = defpackage.uc0.a()
        L2c:
            r0 = r0 | r3
            goto L51
        L2e:
            int r3 = defpackage.d0.D()
            goto L2c
        L33:
            int r3 = defpackage.d0.C()
            goto L2c
        L38:
            int r3 = defpackage.d0.B()
            goto L2c
        L3d:
            int r3 = defpackage.d0.A()
            goto L2c
        L42:
            int r3 = defpackage.d0.z()
            goto L2c
        L47:
            int r3 = defpackage.d0.w()
            goto L2c
        L4c:
            int r3 = defpackage.d0.b()
            goto L2c
        L51:
            int r2 = r2 << 1
            goto L3
        L54:
            return r0
    }
}
