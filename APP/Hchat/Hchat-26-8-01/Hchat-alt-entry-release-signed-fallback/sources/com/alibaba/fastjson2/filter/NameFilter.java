package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface NameFilter extends com.alibaba.fastjson2.filter.Filter {
    static /* synthetic */ java.lang.String a(com.alibaba.fastjson2.PropertyNamingStrategy r0, java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.String r0 = lambda$of$0(r0, r1, r2, r3)
            return r0
    }

    static com.alibaba.fastjson2.filter.NameFilter compose(com.alibaba.fastjson2.filter.NameFilter r1, com.alibaba.fastjson2.filter.NameFilter r2) {
            com.alibaba.fastjson2.filter.a r0 = new com.alibaba.fastjson2.filter.a
            r0.<init>(r2, r1)
            return r0
    }

    static /* synthetic */ java.lang.String d(java.util.function.Function r0, java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.String r0 = lambda$of$2(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ java.lang.String f(com.alibaba.fastjson2.filter.NameFilter r0, com.alibaba.fastjson2.filter.NameFilter r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.String r0 = lambda$compose$1(r0, r1, r2, r3, r4)
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$compose$1(com.alibaba.fastjson2.filter.NameFilter r0, com.alibaba.fastjson2.filter.NameFilter r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.String r1 = r1.process(r2, r3, r4)
            java.lang.String r0 = r0.process(r2, r1, r4)
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$of$0(com.alibaba.fastjson2.PropertyNamingStrategy r0, java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.String r0 = r0.name()
            java.lang.String r0 = com.alibaba.fastjson2.util.BeanUtils.fieldName(r2, r0)
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$of$2(java.util.function.Function r0, java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.Object r0 = r0.apply(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    static com.alibaba.fastjson2.filter.NameFilter of(com.alibaba.fastjson2.PropertyNamingStrategy r2) {
            com.alibaba.fastjson2.filter.b r0 = new com.alibaba.fastjson2.filter.b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    static com.alibaba.fastjson2.filter.NameFilter of(java.util.function.Function<java.lang.String, java.lang.String> r2) {
            com.alibaba.fastjson2.filter.b r0 = new com.alibaba.fastjson2.filter.b
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    java.lang.String process(java.lang.Object r1, java.lang.String r2, java.lang.Object r3);
}
