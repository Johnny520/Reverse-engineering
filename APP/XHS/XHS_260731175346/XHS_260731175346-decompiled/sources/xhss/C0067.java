package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛷᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0067 implements xhss.InterfaceC0341, java.lang.Cloneable {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0067 f362 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.List f363;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.List f364;

    static {
            xhss.ᛱᛷᲈᛱ r0 = new xhss.ᛱᛷᲈᛱ
            r0.<init>()
            xhss.C0067.f362 = r0
            return
    }

    public C0067() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f363 = r0
            r1.f364 = r0
            return
    }

    public final java.lang.Object clone() {
            r1 = this;
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            xhss.ᛱᛷᲈᛱ r1 = (xhss.C0067) r1     // Catch: java.lang.CloneNotSupportedException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean m215(java.lang.Class r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L24
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L24
            xhss.ᲈᲀᲀᛱ r0 = xhss.AbstractC1031.f3335
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
            java.util.List r1 = r1.f363
            goto L2b
        L29:
            java.util.List r1 = r1.f364
        L2b:
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L37
            r1 = 0
            return r1
        L37:
            java.lang.Object r1 = r1.next()
            r1.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
    }

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r9, xhss.C0032 r10) {
            r8 = this;
            java.lang.Class r0 = r10.f211
            r1 = 1
            boolean r5 = r8.m215(r0, r1)
            r1 = 0
            boolean r4 = r8.m215(r0, r1)
            if (r5 != 0) goto L12
            if (r4 != 0) goto L12
            r8 = 0
            return r8
        L12:
            xhss.ᛵᲈᛴᲁ r2 = new xhss.ᛵᲈᛴᲁ
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }
}
