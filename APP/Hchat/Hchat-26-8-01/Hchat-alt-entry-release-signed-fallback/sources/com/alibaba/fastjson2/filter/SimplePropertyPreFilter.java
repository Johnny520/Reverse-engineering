package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class SimplePropertyPreFilter implements com.alibaba.fastjson2.filter.PropertyPreFilter {
    private final java.lang.Class<?> clazz;
    private final java.util.Set<java.lang.String> excludes;
    private final java.util.Set<java.lang.String> includes;
    private int maxLevel;

    public SimplePropertyPreFilter(java.lang.Class<?> r3, java.lang.String... r4) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.includes = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.excludes = r0
            r2.clazz = r3
            r3 = 0
        L14:
            int r0 = r4.length
            if (r3 >= r0) goto L23
            r0 = r4[r3]
            if (r0 == 0) goto L20
            java.util.Set<java.lang.String> r1 = r2.includes
            r1.add(r0)
        L20:
            int r3 = r3 + 1
            goto L14
        L23:
            return
    }

    public SimplePropertyPreFilter(java.lang.String... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public java.lang.Class<?> getClazz() {
            r1 = this;
            java.lang.Class<?> r0 = r1.clazz
            return r0
    }

    public java.util.Set<java.lang.String> getExcludes() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.excludes
            return r0
    }

    public java.util.Set<java.lang.String> getIncludes() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.includes
            return r0
    }

    public int getMaxLevel() {
            r1 = this;
            int r0 = r1.maxLevel
            return r0
    }

    @Override // com.alibaba.fastjson2.filter.PropertyPreFilter
    public boolean process(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.String r5) {
            r2 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Class<?> r1 = r2.clazz
            if (r1 == 0) goto Lf
            boolean r4 = r1.isInstance(r4)
            if (r4 != 0) goto Lf
            return r0
        Lf:
            java.util.Set<java.lang.String> r4 = r2.excludes
            boolean r4 = r4.contains(r5)
            r1 = 0
            if (r4 == 0) goto L19
            return r1
        L19:
            int r4 = r2.maxLevel
            if (r4 <= 0) goto L26
            int r3 = r3.level()
            int r4 = r2.maxLevel
            if (r3 <= r4) goto L26
            return r1
        L26:
            java.util.Set<java.lang.String> r3 = r2.includes
            int r3 = r3.size()
            if (r3 == 0) goto L38
            java.util.Set<java.lang.String> r3 = r2.includes
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L37
            goto L38
        L37:
            return r1
        L38:
            return r0
    }

    public void setMaxLevel(int r1) {
            r0 = this;
            r0.maxLevel = r1
            return
    }
}
