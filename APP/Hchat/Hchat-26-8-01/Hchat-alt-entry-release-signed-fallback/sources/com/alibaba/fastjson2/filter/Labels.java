package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Labels {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class DefaultLabelFilter implements com.alibaba.fastjson2.filter.LabelFilter {
        final java.lang.String[] excludes;
        final java.lang.String[] includes;

        public DefaultLabelFilter(java.lang.String[] r5, java.lang.String[] r6) {
                r4 = this;
                r4.<init>()
                r0 = 0
                r1 = 0
                if (r5 == 0) goto L14
                int r2 = r5.length
                java.lang.String[] r2 = new java.lang.String[r2]
                r4.includes = r2
                int r3 = r5.length
                java.lang.System.arraycopy(r5, r1, r2, r1, r3)
                java.util.Arrays.sort(r2)
                goto L16
            L14:
                r4.includes = r0
            L16:
                if (r6 == 0) goto L25
                int r5 = r6.length
                java.lang.String[] r5 = new java.lang.String[r5]
                r4.excludes = r5
                int r0 = r6.length
                java.lang.System.arraycopy(r6, r1, r5, r1, r0)
                java.util.Arrays.sort(r5)
                return
            L25:
                r4.excludes = r0
                return
        }

        @Override // com.alibaba.fastjson2.filter.LabelFilter
        public boolean apply(java.lang.String r4) {
                r3 = this;
                java.lang.String[] r0 = r3.excludes
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Le
                int r4 = java.util.Arrays.binarySearch(r0, r4)
                if (r4 >= 0) goto Ld
                return r2
            Ld:
                return r1
            Le:
                java.lang.String[] r0 = r3.includes
                if (r0 == 0) goto L19
                int r4 = java.util.Arrays.binarySearch(r0, r4)
                if (r4 < 0) goto L19
                return r2
            L19:
                return r1
        }
    }

    public Labels() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.alibaba.fastjson2.filter.LabelFilter excludes(java.lang.String... r2) {
            com.alibaba.fastjson2.filter.Labels$DefaultLabelFilter r0 = new com.alibaba.fastjson2.filter.Labels$DefaultLabelFilter
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.filter.LabelFilter includes(java.lang.String... r2) {
            com.alibaba.fastjson2.filter.Labels$DefaultLabelFilter r0 = new com.alibaba.fastjson2.filter.Labels$DefaultLabelFilter
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
