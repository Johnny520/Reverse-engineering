package org.simpleframework.xml.filter;

/* JADX INFO: loaded from: classes2.dex */
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
            org.simpleframework.xml.filter.Filter r0 = r1.filter
            if (r0 == 0) goto L10
            java.lang.String r2 = r0.replace(r2)
            return r2
        L10:
            r2 = 0
            return r2
    }
}
