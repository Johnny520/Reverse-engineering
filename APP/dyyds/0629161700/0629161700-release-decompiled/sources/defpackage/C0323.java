package defpackage;

/* JADX INFO: renamed from: ᛲᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0323 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f1680;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f1681;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1003 f1682;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f1683;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1184 f1684;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f1685;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.HashMap f1686;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f1687;

    static {
            ᲇᛲᛴᛲ r0 = new ᲇᛲᛴᛲ
            r0.<init>()
            return
    }

    public C0323(defpackage.C1003 r2, java.lang.Object r3, defpackage.C1184 r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1686 = r0
            r0 = 0
            r1.f1680 = r0
            java.lang.String r0 = "root can not be null"
            defpackage.AbstractC1849.m3253(r3, r0)
            java.lang.String r0 = "configuration can not be null"
            defpackage.AbstractC1849.m3253(r4, r0)
            r1.f1682 = r2
            r1.f1681 = r3
            r1.f1684 = r4
            ᛸᲈᛸᲈ r2 = r4.f5376
            java.lang.Object r3 = r2.f7101
            ᛳᛲᛵᛳ r3 = (defpackage.C0419) r3
            r3.getClass()
            ᛵᛲᛳᛸ r3 = new ᛵᛲᛳᛸ
            r3.<init>()
            r1.f1685 = r3
            java.lang.Object r2 = r2.f7101
            ᛳᛲᛵᛳ r2 = (defpackage.C0419) r2
            r2.getClass()
            ᛵᛲᛳᛸ r2 = new ᛵᛲᛳᛸ
            r2.<init>()
            r1.f1683 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ᛸᛳᲇ r2 = defpackage.EnumC1463.f6485
            java.util.Set r3 = r4.f5375
            boolean r2 = r3.contains(r2)
            r1.f1687 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m995(boolean r5) {
            r4 = this;
            ᛶᛱᛳᲁ r0 = r4.f1682
            ᲀᛳᲁᛵ r0 = r0.f4461
            boolean r1 = r0.m3199()
            java.lang.Object r2 = r4.f1685
            if (r1 == 0) goto L4d
            int r1 = r4.f1680
            r3 = 0
            if (r1 != 0) goto L2e
            boolean r4 = r4.f1687
            if (r4 == 0) goto L16
            return r3
        L16:
            ᛸᲇᛱᛵ r4 = new ᛸᲇᛱᛵ
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No results for path: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L2e:
            ᛶᲈᛵᛲ r4 = r4.f1684
            ᛸᲈᛸᲈ r0 = r4.f5376
            ᛸᲈᛸᲈ r4 = r4.f5376
            int r0 = r0.m2902(r2)
            if (r0 <= 0) goto L45
            int r0 = r0 + (-1)
            r4.getClass()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r2.get(r0)
        L45:
            if (r3 == 0) goto L4c
            if (r5 == 0) goto L4c
            r4.getClass()
        L4c:
            return r3
        L4d:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m996(java.lang.String r4, defpackage.AbstractC1109 r5, java.lang.Object r6) {
            r3 = this;
            ᛶᲈᛵᛲ r5 = r3.f1684
            ᛸᲈᛸᲈ r0 = r5.f5376
            int r1 = r3.f1680
            java.lang.Object r2 = r3.f1685
            r0.m2900(r2, r1, r6)
            ᛸᲈᛸᲈ r6 = r5.f5376
            int r0 = r3.f1680
            java.lang.Object r1 = r3.f1683
            r6.m2900(r1, r0, r4)
            int r4 = r3.f1680
            int r4 = r4 + 1
            r3.f1680 = r4
            java.util.Collection r3 = r5.f5374
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L37
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L2d
            goto L37
        L2d:
            java.lang.Object r3 = r3.next()
            r3.getClass()
            defpackage.C2264.m3679()
        L37:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList m997() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r2.f1680
            if (r1 <= 0) goto L27
            ᛶᲈᛵᛲ r1 = r2.f1684
            ᛸᲈᛸᲈ r1 = r1.f5376
            java.lang.Object r2 = r2.f1683
            java.lang.Iterable r2 = r1.m2893(r2)
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L17
        L27:
            return r0
    }
}
