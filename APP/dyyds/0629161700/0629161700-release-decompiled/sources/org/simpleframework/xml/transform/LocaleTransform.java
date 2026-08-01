package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class LocaleTransform implements org.simpleframework.xml.transform.Transform<java.util.Locale> {
    private final java.util.regex.Pattern pattern;

    public LocaleTransform() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "_"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r1.pattern = r0
            return
    }

    private java.util.Locale read(java.lang.String[] r7) {
            r6 = this;
            r6 = 3
            java.lang.String[] r0 = new java.lang.String[r6]
            r1 = 0
            java.lang.String r2 = ""
            r0[r1] = r2
            r3 = 1
            r0[r3] = r2
            r4 = 2
            r0[r4] = r2
            r2 = r1
        Lf:
            if (r2 >= r6) goto L1b
            int r5 = r7.length
            if (r2 >= r5) goto L18
            r5 = r7[r2]
            r0[r2] = r5
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            java.util.Locale r6 = new java.util.Locale
            r7 = r0[r1]
            r1 = r0[r3]
            r0 = r0[r4]
            r6.<init>(r7, r1, r0)
            return r6
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.util.Locale read(java.lang.String r1) {
            r0 = this;
            java.util.Locale r0 = r0.read2(r1)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.Locale read2(java.lang.String r4) {
            r3 = this;
            java.util.regex.Pattern r0 = r3.pattern
            java.lang.String[] r0 = r0.split(r4)
            int r1 = r0.length
            r2 = 1
            if (r1 < r2) goto Lf
            java.util.Locale r3 = r3.read(r0)
            return r3
        Lf:
            org.simpleframework.xml.transform.InvalidFormatException r3 = new org.simpleframework.xml.transform.InvalidFormatException
            java.lang.String r0 = "Invalid locale %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r3.<init>(r0, r4)
            throw r3
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.util.Locale r1) {
            r0 = this;
            java.util.Locale r1 = (java.util.Locale) r1
            java.lang.String r0 = r0.write2(r1)
            return r0
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.util.Locale r1) {
            r0 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }
}
