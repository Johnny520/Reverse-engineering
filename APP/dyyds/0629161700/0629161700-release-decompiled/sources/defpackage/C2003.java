package defpackage;

/* JADX INFO: renamed from: ᲇᛲᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2003 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0882 f8651 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.HashMap f8652;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.HashMap f8653;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.HashMap f8654;

    static {
            ᛵᛴᲈᛷ r0 = new ᛵᛴᲈᛷ
            r0.<init>()
            defpackage.C2003.f8651 = r0
            return
    }

    public C2003(java.lang.Class r12) {
            r11 = this;
            r11.<init>()
            java.lang.reflect.Field[] r12 = r12.getDeclaredFields()     // Catch: java.lang.IllegalAccessException -> L8e
            int r0 = r12.length     // Catch: java.lang.IllegalAccessException -> L8e
            r1 = 0
            r2 = r1
            r3 = r2
        Lb:
            if (r2 >= r0) goto L1d
            r4 = r12[r2]     // Catch: java.lang.IllegalAccessException -> L8e
            boolean r5 = r4.isEnumConstant()     // Catch: java.lang.IllegalAccessException -> L8e
            if (r5 == 0) goto L1a
            int r5 = r3 + 1
            r12[r3] = r4     // Catch: java.lang.IllegalAccessException -> L8e
            r3 = r5
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r3)     // Catch: java.lang.IllegalAccessException -> L8e
            java.lang.reflect.Field[] r12 = (java.lang.reflect.Field[]) r12     // Catch: java.lang.IllegalAccessException -> L8e
            float r0 = (float) r3     // Catch: java.lang.IllegalAccessException -> L8e
            r2 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 / r2
            double r2 = (double) r0     // Catch: java.lang.IllegalAccessException -> L8e
            double r2 = java.lang.Math.ceil(r2)     // Catch: java.lang.IllegalAccessException -> L8e
            int r0 = (int) r2     // Catch: java.lang.IllegalAccessException -> L8e
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.IllegalAccessException -> L8e
            r2.<init>(r0)     // Catch: java.lang.IllegalAccessException -> L8e
            r11.f8653 = r2     // Catch: java.lang.IllegalAccessException -> L8e
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.IllegalAccessException -> L8e
            r2.<init>(r0)     // Catch: java.lang.IllegalAccessException -> L8e
            r11.f8654 = r2     // Catch: java.lang.IllegalAccessException -> L8e
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.IllegalAccessException -> L8e
            r2.<init>(r0)     // Catch: java.lang.IllegalAccessException -> L8e
            r11.f8652 = r2     // Catch: java.lang.IllegalAccessException -> L8e
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r12, r0)     // Catch: java.lang.IllegalAccessException -> L8e
            int r0 = r12.length     // Catch: java.lang.IllegalAccessException -> L8e
            r2 = r1
        L48:
            if (r2 >= r0) goto L8d
            r3 = r12[r2]     // Catch: java.lang.IllegalAccessException -> L8e
            r4 = 0
            java.lang.Object r4 = r3.get(r4)     // Catch: java.lang.IllegalAccessException -> L8e
            java.lang.Enum r4 = (java.lang.Enum) r4     // Catch: java.lang.IllegalAccessException -> L8e
            java.lang.String r5 = r4.name()     // Catch: java.lang.IllegalAccessException -> L8e
            java.lang.String r6 = r4.toString()     // Catch: java.lang.IllegalAccessException -> L8e
            java.lang.Class<ᛷᛳᲇᲀ> r7 = defpackage.InterfaceC1248.class
            java.lang.annotation.Annotation r3 = r3.getAnnotation(r7)     // Catch: java.lang.IllegalAccessException -> L8e
            ᛷᛳᲇᲀ r3 = (defpackage.InterfaceC1248) r3     // Catch: java.lang.IllegalAccessException -> L8e
            if (r3 == 0) goto L7b
            java.lang.String r5 = r3.value()     // Catch: java.lang.IllegalAccessException -> L8e
            java.lang.String[] r3 = r3.alternate()     // Catch: java.lang.IllegalAccessException -> L8e
            int r7 = r3.length     // Catch: java.lang.IllegalAccessException -> L8e
            r8 = r1
        L6f:
            if (r8 >= r7) goto L7b
            r9 = r3[r8]     // Catch: java.lang.IllegalAccessException -> L8e
            java.util.HashMap r10 = r11.f8653     // Catch: java.lang.IllegalAccessException -> L8e
            r10.put(r9, r4)     // Catch: java.lang.IllegalAccessException -> L8e
            int r8 = r8 + 1
            goto L6f
        L7b:
            java.util.HashMap r3 = r11.f8653     // Catch: java.lang.IllegalAccessException -> L8e
            r3.put(r5, r4)     // Catch: java.lang.IllegalAccessException -> L8e
            java.util.HashMap r3 = r11.f8654     // Catch: java.lang.IllegalAccessException -> L8e
            r3.put(r6, r4)     // Catch: java.lang.IllegalAccessException -> L8e
            java.util.HashMap r3 = r11.f8652     // Catch: java.lang.IllegalAccessException -> L8e
            r3.put(r4, r5)     // Catch: java.lang.IllegalAccessException -> L8e
            int r2 = r2 + 1
            goto L48
        L8d:
            return
        L8e:
            r11 = move-exception
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>(r11)
            throw r12
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto Le
        L6:
            java.util.HashMap r0 = r0.f8652
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
        Le:
            r1.m1075(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r3) {
            r2 = this;
            int r0 = r3.m2090()
            r1 = 9
            if (r0 != r1) goto Ld
            r3.m2108()
            r2 = 0
            return r2
        Ld:
            java.lang.String r3 = r3.m2096()
            java.util.HashMap r0 = r2.f8653
            java.lang.Object r0 = r0.get(r3)
            java.lang.Enum r0 = (java.lang.Enum) r0
            if (r0 != 0) goto L24
            java.util.HashMap r2 = r2.f8654
            java.lang.Object r2 = r2.get(r3)
            java.lang.Enum r2 = (java.lang.Enum) r2
            return r2
        L24:
            return r0
    }
}
