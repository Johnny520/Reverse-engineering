package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
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

    private java.lang.String[] read(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.regex.Pattern r3 = r1.pattern
            java.lang.String[] r2 = r3.split(r2)
            r3 = 0
        L7:
            int r0 = r2.length
            if (r3 >= r0) goto L17
            r0 = r2[r3]
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.trim()
            r2[r3] = r0
        L14:
            int r3 = r3 + 1
            goto L7
        L17:
            return r2
    }

    private java.lang.String write(java.lang.String[] r5, java.lang.String r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L21
            r2 = r5[r1]
            if (r2 == 0) goto L1e
            int r3 = r0.length()
            if (r3 <= 0) goto L1b
            r0.append(r6)
            r3 = 32
            r0.append(r3)
        L1b:
            r0.append(r2)
        L1e:
            int r1 = r1 + 1
            goto L6
        L21:
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String[] read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String[] r1 = r0.read2(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.lang.String[] read2(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.token
            java.lang.String[] r2 = r1.read(r2, r0)
            return r2
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.String[] r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.String[] r2) {
            r1 = this;
            java.lang.String r0 = r1.token
            java.lang.String r2 = r1.write(r2, r0)
            return r2
    }
}
