package defpackage;

/* JADX INFO: renamed from: ᛱᲁᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0182 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0160 f1223 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class f1224;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2200 f1225;

    static {
            ᛱᲀᛲᲀ r0 = new ᛱᲀᛲᲀ
            r0.<init>()
            defpackage.C0182.f1223 = r0
            return
    }

    public C0182(defpackage.C1950 r3, defpackage.AbstractC0758 r4, java.lang.Class r5) {
            r2 = this;
            r2.<init>()
            ᲈᛲᲈ r0 = new ᲈᛲᲈ
            r1 = 2
            r0.<init>(r3, r4, r5, r1)
            r2.f1225 = r0
            r2.f1224 = r5
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L6
            r5.m1067()
            return
        L6:
            r5.m1082()
            int r0 = java.lang.reflect.Array.getLength(r6)
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = java.lang.reflect.Array.get(r6, r1)
            ᲈᛲᲈ r3 = r4.f1225
            r3.mo561(r5, r2)
            int r1 = r1 + 1
            goto Le
        L1c:
            r5.m1068()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r4) {
            r3 = this;
            int r0 = r4.m2090()
            r1 = 9
            if (r0 != r1) goto Ld
            r4.m2108()
            r3 = 0
            return r3
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.m2101()
        L15:
            boolean r1 = r4.m2082()
            if (r1 == 0) goto L27
            ᲈᛲᲈ r1 = r3.f1225
            ᛴᲀᲈᛴ r1 = r1.f9377
            java.lang.Object r1 = r1.mo562(r4)
            r0.add(r1)
            goto L15
        L27:
            r4.m2083()
            int r4 = r0.size()
            java.lang.Class r3 = r3.f1224
            boolean r1 = r3.isPrimitive()
            if (r1 == 0) goto L48
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            r1 = 0
        L3b:
            if (r1 >= r4) goto L47
            java.lang.Object r2 = r0.get(r1)
            java.lang.reflect.Array.set(r3, r1, r2)
            int r1 = r1 + 1
            goto L3b
        L47:
            return r3
        L48:
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r3 = r0.toArray(r3)
            return r3
    }
}
