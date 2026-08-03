package q6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r6.a {
    @Override // r6.a, r6.d
    public final java.util.Map a() {
            r13 = this;
            java.util.Map r0 = super.a()
            sf.e r1 = new sf.e
            java.lang.String r2 = "returnType"
            r3 = 0
            r1.<init>(r2, r3)
            sf.e r2 = new sf.e
            java.lang.String r4 = "returnTypeCondition"
            r2.<init>(r4, r3)
            r4 = r3
            sf.e r3 = new sf.e
            java.lang.String r5 = "genericReturnType"
            r3.<init>(r5, r4)
            r5 = r4
            sf.e r4 = new sf.e
            java.lang.String r6 = "genericReturnTypeCondition"
            r4.<init>(r6, r5)
            r6 = r5
            sf.e r5 = new sf.e
            java.lang.String r7 = "isBridge"
            r5.<init>(r7, r6)
            r7 = r6
            sf.e r6 = new sf.e
            java.lang.String r8 = "isBridgeNot"
            r6.<init>(r8, r7)
            r8 = r7
            sf.e r7 = new sf.e
            java.lang.String r9 = "isDefault"
            r7.<init>(r9, r8)
            r9 = r8
            sf.e r8 = new sf.e
            java.lang.String r10 = "isDefaultNot"
            r8.<init>(r10, r9)
            r10 = r9
            sf.e r9 = new sf.e
            java.lang.String r11 = "defaultValue"
            r9.<init>(r11, r10)
            r11 = r10
            sf.e r10 = new sf.e
            java.lang.String r12 = "defaultValueCondition"
            r10.<init>(r12, r11)
            sf.e[] r1 = new sf.e[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r1 = tf.y.b0(r1)
            java.util.LinkedHashMap r0 = tf.y.c0(r0, r1)
            return r0
    }

    public final java.util.List b() {
            r4 = this;
            r6.c r0 = r4.f11543a
            if (r0 == 0) goto L11
            java.lang.Class r1 = r0.f11541a
            i0.q0 r2 = new i0.q0
            r3 = 6
            r2.<init>(r4, r3, r0)
            java.util.List r0 = x6.g.i(r4, r0, r1, r2)
            return r0
        L11:
            java.lang.String r0 = "You must provide a configuration to resolve the member use build(configuration)."
            j8.o.t(r0)
            r0 = 0
            return r0
    }
}
