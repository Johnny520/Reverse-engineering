package org.simpleframework.xml.filter;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class EnvironmentFilter implements org.simpleframework.xml.filter.Filter {
    private org.simpleframework.xml.filter.Filter filter;

    public EnvironmentFilter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public EnvironmentFilter(org.simpleframework.xml.filter.Filter r1) {
            r0 = this;
            r0.<init>()
            r0.filter = r1
            return
    }

    @Override // org.simpleframework.xml.filter.Filter
    public java.lang.String replace(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = java.lang.System.getenv(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            org.simpleframework.xml.filter.Filter r1 = r1.filter
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.replace(r2)
            return r1
        L10:
            r1 = 0
            return r1
    }
}
