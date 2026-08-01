package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b70 {
    public HashMap a;
    public double b;
    public double c;

    public static b70 a(double r16, double r18) {
        mo r7 = mo.a(r16, r18, 50.0d);
        double r12 = Math.abs(r7.a - r18);
        double r14 = 1.0d;
    L4:
        if (r14 >= 50.0d) goto L15;
        if (Math.round(r18) == Math.round(r7.a)) goto L15;
        mo r4 = mo.a(r16, r18, 50.0d + r14);
        double r0 = Math.abs(r4.a - r18);
        if (r0 >= r12) goto L11;
        r12 = r0;
        r7 = r4;
    L11:
        mo r42 = mo.a(r16, r18, 50.0d - r14);
        double r02 = Math.abs(r42.a - r18);
        if (r02 >= r12) goto L14;
        r12 = r02;
        r7 = r42;
    L14:
        r14 = r14 + 1.0d;
    L15:
        b70 r6 = new b70();
        r6.a = new HashMap();
        r6.b = r16;
        r6.c = r18;
        return r6;
    }

    public final int b(int r9) {
        HashMap r0 = this.a;
        Integer r1 = (Integer) r0.get(Integer.valueOf(r9));
        if (r1 != null) goto L6;
        r1 = Integer.valueOf(mo.a(this.b, this.c, r9).b);
        r0.put(Integer.valueOf(r9), r1);
    L6:
        return r1.intValue();
    }
}
