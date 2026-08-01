package org.simpleframework.xml.filter;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class MapFilter implements org.simpleframework.xml.filter.Filter {
    private org.simpleframework.xml.filter.Filter filter;
    private java.util.Map map;

    public MapFilter(java.util.Map r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MapFilter(java.util.Map r1, org.simpleframework.xml.filter.Filter r2) {
            r0 = this;
            r0.<init>()
            r0.filter = r2
            r0.map = r1
            return
    }

    @Override // org.simpleframework.xml.filter.Filter
    public java.lang.String replace(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.map
            r1 = 0
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.get(r3)
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L12
            java.lang.String r2 = r0.toString()
            return r2
        L12:
            org.simpleframework.xml.filter.Filter r2 = r2.filter
            if (r2 == 0) goto L1b
            java.lang.String r2 = r2.replace(r3)
            return r2
        L1b:
            return r1
    }
}
