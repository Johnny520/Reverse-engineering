package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sb {
    public final java.util.HashMap a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public java.util.ArrayList d;
    public final transient java.util.HashMap e;
    public final java.util.HashMap f;
    public final android.os.Bundle g;

    public sb() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.g = r0
            return
    }

    public final boolean a(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            java.util.HashMap r0 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.HashMap r0 = r3.e
            java.lang.Object r0 = r0.get(r4)
            w1 r0 = (defpackage.w1) r0
            if (r0 == 0) goto L33
            rl r1 = r0.a
            java.util.ArrayList r2 = r3.d
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L33
            ff r0 = r0.b
            java.lang.Object r5 = r0.D(r5, r6)
            r1.a(r5)
            java.util.ArrayList r5 = r3.d
            r5.remove(r4)
            goto L42
        L33:
            java.util.HashMap r0 = r3.f
            r0.remove(r4)
            u1 r0 = new u1
            r0.<init>(r5, r6)
            android.os.Bundle r5 = r3.g
            r5.putParcelable(r4, r0)
        L42:
            r4 = 1
            return r4
    }

    public final defpackage.d4 b(java.lang.String r7, defpackage.ff r8, defpackage.rl r9) {
            r6 = this;
            java.util.HashMap r0 = r6.b
            java.lang.Object r1 = r0.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lb
            goto L43
        Lb:
            m r1 = defpackage.az.a
            m r1 = defpackage.az.a
            java.util.Random r1 = r1.d()
            r2 = 2147418112(0x7fff0000, float:NaN)
            int r1 = r1.nextInt(r2)
            r3 = 65536(0x10000, float:9.1835E-41)
        L1b:
            int r1 = r1 + r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r5 = r6.a
            boolean r4 = r5.containsKey(r4)
            if (r4 == 0) goto L35
            m r1 = defpackage.az.a
            m r1 = defpackage.az.a
            java.util.Random r1 = r1.d()
            int r1 = r1.nextInt(r2)
            goto L1b
        L35:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.put(r2, r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r7, r1)
        L43:
            w1 r0 = new w1
            r0.<init>(r9, r8)
            java.util.HashMap r1 = r6.e
            r1.put(r7, r0)
            java.util.HashMap r0 = r6.f
            boolean r1 = r0.containsKey(r7)
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.get(r7)
            r0.remove(r7)
            r9.a(r1)
        L5f:
            android.os.Bundle r0 = r6.g
            android.os.Parcelable r1 = r0.getParcelable(r7)
            u1 r1 = (defpackage.u1) r1
            if (r1 == 0) goto L77
            r0.remove(r7)
            int r0 = r1.a
            android.content.Intent r1 = r1.b
            java.lang.Object r8 = r8.D(r0, r1)
            r9.a(r8)
        L77:
            d4 r8 = new d4
            r9 = 1
            r8.<init>(r6, r9, r7)
            return r8
    }
}
