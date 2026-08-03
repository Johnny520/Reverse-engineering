package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ValueFilter extends com.alibaba.fastjson2.filter.Filter {
    static /* synthetic */ java.lang.Object b(java.lang.String r0, java.util.function.Function r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.Object r0 = lambda$of$1(r0, r1, r2, r3, r4)
            return r0
    }

    static /* synthetic */ java.lang.Object c(java.util.function.Predicate r0, java.util.function.Function r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.Object r0 = lambda$of$3(r0, r1, r2, r3, r4)
            return r0
    }

    static com.alibaba.fastjson2.filter.ValueFilter compose(com.alibaba.fastjson2.filter.ValueFilter r2, com.alibaba.fastjson2.filter.ValueFilter r3) {
            com.alibaba.fastjson2.filter.c r0 = new com.alibaba.fastjson2.filter.c
            r1 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object e(com.alibaba.fastjson2.filter.ValueFilter r0, com.alibaba.fastjson2.filter.ValueFilter r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.Object r0 = lambda$compose$0(r0, r1, r2, r3, r4)
            return r0
    }

    static /* synthetic */ java.lang.Object g(java.lang.String r0, java.util.Map r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.Object r0 = lambda$of$2(r0, r1, r2, r3, r4)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$compose$0(com.alibaba.fastjson2.filter.ValueFilter r0, com.alibaba.fastjson2.filter.ValueFilter r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.Object r1 = r1.apply(r2, r3, r4)
            java.lang.Object r0 = r0.apply(r2, r3, r1)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$1(java.lang.String r0, java.util.function.Function r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            if (r0 == 0) goto La
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9
            goto La
        L9:
            return r4
        La:
            java.lang.Object r0 = r1.apply(r4)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$2(java.lang.String r0, java.util.Map r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            if (r0 == 0) goto L8
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L15
        L8:
            java.lang.Object r0 = r1.get(r4)
            if (r0 != 0) goto L16
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r4
        L16:
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$3(java.util.function.Predicate r0, java.util.function.Function r1, java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            if (r0 == 0) goto La
            boolean r0 = r0.test(r3)
            if (r0 == 0) goto L9
            goto La
        L9:
            return r4
        La:
            java.lang.Object r0 = r1.apply(r4)
            return r0
    }

    static com.alibaba.fastjson2.filter.ValueFilter of(java.lang.String r2, java.util.Map r3) {
            com.alibaba.fastjson2.filter.c r0 = new com.alibaba.fastjson2.filter.c
            r1 = 2
            r0.<init>(r2, r1, r3)
            return r0
    }

    static com.alibaba.fastjson2.filter.ValueFilter of(java.lang.String r2, java.util.function.Function r3) {
            com.alibaba.fastjson2.filter.c r0 = new com.alibaba.fastjson2.filter.c
            r1 = 1
            r0.<init>(r2, r1, r3)
            return r0
    }

    static com.alibaba.fastjson2.filter.ValueFilter of(java.util.function.Predicate<java.lang.String> r2, java.util.function.Function r3) {
            com.alibaba.fastjson2.filter.c r0 = new com.alibaba.fastjson2.filter.c
            r1 = 3
            r0.<init>(r2, r1, r3)
            return r0
    }

    java.lang.Object apply(java.lang.Object r1, java.lang.String r2, java.lang.Object r3);
}
