package defpackage;

/* JADX INFO: renamed from: ᛶᲈᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1184 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.Collection f5374;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.Set f5375;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1606 f5376;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0226 f5377;

    public C1184(defpackage.C1606 r2, defpackage.C0226 r3, java.util.EnumSet r4, java.util.ArrayList r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "jsonProvider can not be null"
            defpackage.AbstractC1849.m3253(r2, r0)
            java.lang.String r0 = "mappingProvider can not be null"
            defpackage.AbstractC1849.m3253(r3, r0)
            java.lang.String r0 = "setOptions can not be null"
            defpackage.AbstractC1849.m3253(r4, r0)
            java.lang.String r0 = "evaluationListeners can not be null"
            defpackage.AbstractC1849.m3253(r5, r0)
            r1.f5376 = r2
            r1.f5377 = r3
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r4)
            r1.f5375 = r2
            java.util.Collection r2 = java.util.Collections.unmodifiableCollection(r5)
            r1.f5374 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0302 m2312() {
            ᛲᛶᛲᲁ r0 = new ᛲᛶᛲᲁ
            r1 = 3
            r0.<init>(r1)
            java.lang.Class<ᛸᛳᲇ> r1 = defpackage.EnumC1463.class
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r1)
            r0.f1618 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f1619 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L39
            java.lang.Class<ᛶᲈᛵᛲ> r2 = defpackage.C1184.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L39
        L10:
            ᛶᲈᛵᛲ r5 = (defpackage.C1184) r5
            ᛸᲈᛸᲈ r2 = r4.f5376
            java.lang.Class r2 = r2.getClass()
            ᛸᲈᛸᲈ r3 = r5.f5376
            java.lang.Class r3 = r3.getClass()
            if (r2 != r3) goto L39
            ᛱᲈᲇ r2 = r4.f5377
            java.lang.Class r2 = r2.getClass()
            ᛱᲈᲇ r3 = r5.f5377
            java.lang.Class r3 = r3.getClass()
            if (r2 != r3) goto L39
            java.util.Set r4 = r4.f5375
            java.util.Set r5 = r5.f5375
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L39
            return r0
        L39:
            return r1
    }
}
