package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class TemplateFilter implements org.simpleframework.xml.filter.Filter {
    private org.simpleframework.xml.core.Context context;
    private org.simpleframework.xml.filter.Filter filter;

    public TemplateFilter(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.filter.Filter r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.filter = r2
            return
    }

    @Override // org.simpleframework.xml.filter.Filter
    public java.lang.String replace(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.Context r0 = r1.context
            java.lang.Object r0 = r0.getAttribute(r2)
            if (r0 == 0) goto Ld
            java.lang.String r2 = r0.toString()
            return r2
        Ld:
            org.simpleframework.xml.filter.Filter r0 = r1.filter
            java.lang.String r2 = r0.replace(r2)
            return r2
    }
}
