package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h10 extends defpackage.ip {
    @Override // defpackage.ip
    public final void w(defpackage.p30 r7, float r8, float r9) {
            r6 = this;
            float r0 = r9 * r8
            r1 = 1127481344(0x43340000, float:180.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r7.d(r0, r1, r2)
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r0
            float r9 = r9 * r8
            l30 r8 = new l30
            r3 = 0
            r8.<init>(r3, r3, r9, r9)
            r8.f = r1
            r8.g = r2
            java.util.ArrayList r2 = r7.f
            r2.add(r8)
            j30 r2 = new j30
            r2.<init>(r8)
            r7.a(r1)
            java.util.ArrayList r8 = r7.g
            r8.add(r2)
            r8 = 1132920832(0x43870000, float:270.0)
            r7.d = r8
            float r1 = r3 + r9
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            float r9 = r9 - r3
            float r9 = r9 / r0
            double r2 = (double) r8
            double r4 = java.lang.Math.toRadians(r2)
            double r4 = java.lang.Math.cos(r4)
            float r8 = (float) r4
            float r8 = r8 * r9
            float r8 = r8 + r1
            r7.b = r8
            double r2 = java.lang.Math.toRadians(r2)
            double r2 = java.lang.Math.sin(r2)
            float r8 = (float) r2
            float r9 = r9 * r8
            float r9 = r9 + r1
            r7.c = r9
            return
    }
}
