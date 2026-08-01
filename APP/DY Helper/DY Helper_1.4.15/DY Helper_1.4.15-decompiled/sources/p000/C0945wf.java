package p000;

/* JADX INFO: renamed from: wf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0945wf implements p000.InterfaceC0907vf, p000.jo0, p000.ho0 {

    /* JADX INFO: renamed from: ζ */
    public static final java.util.Map f11700 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Class f11701;

    static {
            java.lang.Class<c80> r22 = p000.c80.class
            java.lang.Class<d80> r23 = p000.d80.class
            java.lang.Class<p70> r1 = p000.p70.class
            java.lang.Class<a80> r2 = p000.a80.class
            java.lang.Class<e80> r3 = p000.e80.class
            java.lang.Class<f80> r4 = p000.f80.class
            java.lang.Class<g80> r5 = p000.g80.class
            java.lang.Class<h80> r6 = p000.h80.class
            java.lang.Class<i80> r7 = p000.i80.class
            java.lang.Class<j80> r8 = p000.j80.class
            java.lang.Class<k80> r9 = p000.k80.class
            java.lang.Class<l80> r10 = p000.l80.class
            java.lang.Class<q70> r11 = p000.q70.class
            java.lang.Class<r70> r12 = p000.r70.class
            java.lang.Class<s70> r13 = p000.s70.class
            java.lang.Class<t70> r14 = p000.t70.class
            java.lang.Class<u70> r15 = p000.u70.class
            java.lang.Class<v70> r16 = p000.v70.class
            java.lang.Class<w70> r17 = p000.w70.class
            java.lang.Class<x70> r18 = p000.x70.class
            java.lang.Class<y70> r19 = p000.y70.class
            java.lang.Class<z70> r20 = p000.z70.class
            java.lang.Class<b80> r21 = p000.b80.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L46:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L64
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            l91 r5 = new l91
            r5.<init>(r3, r2)
            r1.add(r5)
            r2 = r4
            goto L46
        L64:
            p000.AbstractC1021yh.m6917()
            r0 = 0
            throw r0
        L69:
            java.util.Map r0 = p000.ex0.m1974(r1)
            p000.C0945wf.f11700 = r0
            return
    }

    public C0945wf(java.lang.Class r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f11701 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C0945wf
            if (r0 == 0) goto L16
            java.lang.Class r1 = p000.ln0.m3605(r1)
            wf r2 = (p000.C0945wf) r2
            java.lang.Class r2 = p000.ln0.m3605(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = p000.ln0.m3605(r0)
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r1.f11701
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // p000.InterfaceC0907vf
    /* JADX INFO: renamed from: α */
    public final java.lang.Class mo50() {
            r0 = this;
            java.lang.Class r0 = r0.f11701
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m6377() {
            r2 = this;
            java.lang.Class r2 = r2.f11701
            r2.getClass()
            boolean r0 = r2.isAnonymousClass()
            r1 = 0
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            boolean r0 = r2.isLocalClass()
            if (r0 == 0) goto L14
        L13:
            return r1
        L14:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L3a
            java.lang.Class r2 = r2.getComponentType()
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L34
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = p000.h62.m2361(r2)
            if (r2 == 0) goto L34
            java.lang.String r0 = "Array"
            java.lang.String r1 = r2.concat(r0)
        L34:
            if (r1 != 0) goto L39
            java.lang.String r2 = "kotlin.Array"
            return r2
        L39:
            return r1
        L3a:
            java.lang.String r0 = r2.getName()
            java.lang.String r0 = p000.h62.m2361(r0)
            if (r0 != 0) goto L49
            java.lang.String r2 = r2.getCanonicalName()
            return r2
        L49:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.String m6378() {
            r3 = this;
            java.lang.Class r3 = r3.f11701
            r3.getClass()
            boolean r0 = r3.isAnonymousClass()
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = r3.isLocalClass()
            if (r0 == 0) goto L5a
            java.lang.String r0 = r3.getSimpleName()
            java.lang.reflect.Method r1 = r3.getEnclosingMethod()
            r2 = 36
            if (r1 == 0) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = p000.q02.m4686(r0, r3, r0)
            return r3
        L37:
            java.lang.reflect.Constructor r3 = r3.getEnclosingConstructor()
            if (r3 == 0) goto L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = p000.q02.m4686(r0, r3, r0)
            return r3
        L55:
            java.lang.String r3 = p000.q02.m4685(r0, r2, r0)
            return r3
        L5a:
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L7e
            java.lang.Class r3 = r3.getComponentType()
            boolean r0 = r3.isPrimitive()
            java.lang.String r2 = "Array"
            if (r0 == 0) goto L7a
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = p000.h62.m2412(r3)
            if (r3 == 0) goto L7a
            java.lang.String r1 = r3.concat(r2)
        L7a:
            if (r1 != 0) goto L7d
            return r2
        L7d:
            return r1
        L7e:
            java.lang.String r0 = r3.getName()
            java.lang.String r0 = p000.h62.m2412(r0)
            if (r0 != 0) goto L8d
            java.lang.String r3 = r3.getSimpleName()
            return r3
        L8d:
            return r0
    }
}
