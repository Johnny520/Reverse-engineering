package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class StringArrayTransform implements org.simpleframework.xml.transform.Transform<java.lang.String[]> {
    private final java.util.regex.Pattern pattern;
    private final java.lang.String token;

    public StringArrayTransform() {
            r1 = this;
            java.lang.String r0 = ","
            r1.<init>(r0)
            return
    }

    public StringArrayTransform(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2)
            r1.pattern = r0
            r1.token = r2
            return
    }

    private java.lang.String[] read(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.util.regex.Pattern r0 = r0.pattern
            java.lang.String[] r0 = r0.split(r1)
            r1 = 0
        L7:
            int r2 = r0.length
            if (r1 >= r2) goto L17
            r2 = r0[r1]
            if (r2 == 0) goto L14
            java.lang.String r2 = r2.trim()
            r0[r1] = r2
        L14:
            int r1 = r1 + 1
            goto L7
        L17:
            return r0
    }

    private java.lang.String write(java.lang.String[] r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r0 = 0
        L6:
            int r1 = r4.length
            if (r0 >= r1) goto L21
            r1 = r4[r0]
            if (r1 == 0) goto L1e
            int r2 = r3.length()
            if (r2 <= 0) goto L1b
            r3.append(r5)
            r2 = 32
            r3.append(r2)
        L1b:
            r3.append(r1)
        L1e:
            int r0 = r0 + 1
            goto L6
        L21:
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String[] read(java.lang.String r1) {
            r0 = this;
            java.lang.String[] r0 = r0.read2(r1)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.lang.String[] read2(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.token
            java.lang.String[] r1 = r1.read(r2, r0)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.String[] r1) {
            r0 = this;
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r0 = r0.write2(r1)
            return r0
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.String[] r2) {
            r1 = this;
            java.lang.String r0 = r1.token
            java.lang.String r1 = r1.write(r2, r0)
            return r1
    }
}
