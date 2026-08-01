package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.util.BeanUtils;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface NameFilter extends Filter {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ String m6264a(Function function, Object obj, String str, Object obj2) {
        return (String) function.apply(str);
    }

    static NameFilter compose(final NameFilter nameFilter, final NameFilter nameFilter2) {
        return new NameFilter() { // from class: com.alibaba.fastjson2.filter.a
            @Override // com.alibaba.fastjson2.filter.NameFilter
            public final String process(Object obj, String str, Object obj2) {
                return this.f4545a.process(obj, nameFilter.process(obj, str, obj2), obj2);
            }
        };
    }

    /* JADX INFO: renamed from: of */
    static NameFilter m6267of(final PropertyNamingStrategy propertyNamingStrategy) {
        return new NameFilter() { // from class: com.alibaba.fastjson2.filter.b
            @Override // com.alibaba.fastjson2.filter.NameFilter
            public final String process(Object obj, String str, Object obj2) {
                return BeanUtils.fieldName(str, propertyNamingStrategy.name());
            }
        };
    }

    String process(Object obj, String str, Object obj2);

    /* JADX INFO: renamed from: of */
    static NameFilter m6268of(final Function<String, String> function) {
        return new NameFilter() { // from class: com.alibaba.fastjson2.filter.c
            @Override // com.alibaba.fastjson2.filter.NameFilter
            public final String process(Object obj, String str, Object obj2) {
                return NameFilter.m6264a(function, obj, str, obj2);
            }
        };
    }
}
