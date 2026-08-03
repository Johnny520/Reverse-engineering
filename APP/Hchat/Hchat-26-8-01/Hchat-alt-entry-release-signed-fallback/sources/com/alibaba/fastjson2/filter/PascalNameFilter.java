package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class PascalNameFilter implements com.alibaba.fastjson2.filter.NameFilter {
    public PascalNameFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.filter.NameFilter
    public java.lang.String process(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            com.alibaba.fastjson2.PropertyNamingStrategy r1 = com.alibaba.fastjson2.PropertyNamingStrategy.PascalCase
            java.lang.String r1 = r1.name()
            java.lang.String r1 = com.alibaba.fastjson2.util.BeanUtils.fieldName(r2, r1)
            return r1
    }
}
