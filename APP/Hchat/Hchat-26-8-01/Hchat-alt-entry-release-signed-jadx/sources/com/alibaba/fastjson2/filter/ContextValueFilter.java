package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ContextValueFilter extends Filter {
    Object process(BeanContext beanContext, Object obj, String str, Object obj2);
}
