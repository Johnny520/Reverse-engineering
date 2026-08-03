package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
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

    private java.util.Locale read(java.lang.String[] r8) throws java.lang.Exception {
            r7 = this;
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = ""
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            r5 = 2
            r1[r5] = r3
            r3 = r2
        Lf:
            if (r3 >= r0) goto L1b
            int r6 = r8.length
            if (r3 >= r6) goto L18
            r6 = r8[r3]
            r1[r3] = r6
        L18:
            int r3 = r3 + 1
            goto Lf
        L1b:
            java.util.Locale r8 = new java.util.Locale
            r0 = r1[r2]
            r2 = r1[r4]
            r1 = r1[r5]
            r8.<init>(r0, r2, r1)
            return r8
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.util.Locale read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.util.Locale r1 = r0.read2(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.Locale read2(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            java.util.regex.Pattern r0 = r3.pattern
            java.lang.String[] r0 = r0.split(r4)
            int r1 = r0.length
            r2 = 1
            if (r1 < r2) goto Lf
            java.util.Locale r4 = r3.read(r0)
            return r4
        Lf:
            org.simpleframework.xml.transform.InvalidFormatException r0 = new org.simpleframework.xml.transform.InvalidFormatException
            java.lang.String r1 = "Invalid locale %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.util.Locale r1) throws java.lang.Exception {
            r0 = this;
            java.util.Locale r1 = (java.util.Locale) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.util.Locale r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }
}
