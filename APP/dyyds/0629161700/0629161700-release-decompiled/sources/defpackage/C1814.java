package defpackage;

/* JADX INFO: renamed from: ᲁᛲᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1814 implements defpackage.InterfaceC1405, java.lang.Cloneable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1814 f7940 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.List f7941;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.List f7942;

    static {
            ᲁᛲᛷᛲ r0 = new ᲁᛲᛷᛲ
            r0.<init>()
            defpackage.C1814.f7940 = r0
            return
    }

    public C1814() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f7942 = r0
            r1.f7941 = r0
            return
    }

    public final java.lang.Object clone() {
            r1 = this;
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            ᲁᛲᛷᛲ r1 = (defpackage.C1814) r1     // Catch: java.lang.CloneNotSupportedException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r9, defpackage.C1949 r10) {
            r8 = this;
            java.lang.Class r0 = r10.f8476
            r1 = 1
            boolean r5 = r8.m3209(r0, r1)
            r1 = 0
            boolean r4 = r8.m3209(r0, r1)
            if (r5 != 0) goto L12
            if (r4 != 0) goto L12
            r8 = 0
            return r8
        L12:
            ᛱᛵᲁᲈ r2 = new ᛱᛵᲁᲈ
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m3209(java.lang.Class r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L24
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L24
            ᛲᲈᲀᲈ r0 = defpackage.AbstractC2026.f8732
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L24
            boolean r0 = r2.isAnonymousClass()
            if (r0 != 0) goto L22
            boolean r2 = r2.isLocalClass()
            if (r2 == 0) goto L24
        L22:
            r1 = 1
            return r1
        L24:
            if (r3 == 0) goto L29
            java.util.List r1 = r1.f7942
            goto L2b
        L29:
            java.util.List r1 = r1.f7941
        L2b:
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 != 0) goto L37
            return r3
        L37:
            java.lang.Object r1 = r1.next()
            r1.getClass()
            defpackage.C2264.m3679()
            return r3
    }
}
