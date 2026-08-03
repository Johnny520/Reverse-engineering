package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ad extends a.C0435w1 {
    public Ad() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.C0435w1
    public final void z(a.Yd r10, float r11, float r12) {
            r9 = this;
            float r0 = r12 * r11
            r1 = 1127481344(0x43340000, float:180.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r10.d(r0, r1, r2)
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r0
            float r12 = r12 * r11
            r11 = 0
            r0 = 0
            r10.getClass()
            a.Yd$c r3 = new a.Yd$c
            r3.<init>(r11, r0, r12, r12)
            r3.f = r1
            r3.g = r2
            java.util.ArrayList r4 = r10.f
            r4.add(r3)
            a.Yd$a r4 = new a.Yd$a
            r4.<init>(r3)
            float r3 = r1 + r2
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = 1127481344(0x43340000, float:180.0)
            if (r2 == 0) goto L37
            float r1 = r1 + r6
            float r1 = r1 % r5
        L37:
            if (r2 == 0) goto L3c
            float r6 = r6 + r3
            float r6 = r6 % r5
            goto L3d
        L3c:
            r6 = r3
        L3d:
            r10.a(r1)
            java.util.ArrayList r1 = r10.g
            r1.add(r4)
            r10.d = r6
            float r1 = r11 + r12
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r11 = r12 - r11
            r4 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r4
            double r5 = (double) r3
            double r7 = java.lang.Math.toRadians(r5)
            double r7 = java.lang.Math.cos(r7)
            float r3 = (float) r7
            float r11 = r11 * r3
            float r11 = r11 + r1
            r10.b = r11
            float r11 = r0 + r12
            float r11 = r11 * r2
            float r12 = r12 - r0
            float r12 = r12 / r4
            double r0 = java.lang.Math.toRadians(r5)
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            float r12 = r12 * r0
            float r12 = r12 + r11
            r10.c = r12
            return
    }
}
