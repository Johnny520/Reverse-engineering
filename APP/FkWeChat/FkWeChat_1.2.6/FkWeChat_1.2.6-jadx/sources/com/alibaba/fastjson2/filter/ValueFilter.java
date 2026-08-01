package com.alibaba.fastjson2.filter;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface ValueFilter extends Filter {
    static ValueFilter compose(final ValueFilter valueFilter, final ValueFilter valueFilter2) {
        return new ValueFilter() { // from class: com.alibaba.fastjson2.filter.d
            @Override // com.alibaba.fastjson2.filter.ValueFilter
            public final Object apply(Object obj, String str, Object obj2) {
                return this.f4549a.apply(obj, str, valueFilter.apply(obj, str, obj2));
            }
        };
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m6269d(Predicate predicate, Function function, Object obj, String str, Object obj2) {
        return (predicate == null || predicate.test(str)) ? function.apply(obj2) : obj2;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Object m6270e(String str, Map map, Object obj, String str2, Object obj2) {
        Object obj3;
        return ((str == null || str.equals(str2)) && ((obj3 = map.get(obj2)) != null || map.containsKey(obj2))) ? obj3 : obj2;
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m6271f(String str, Function function, Object obj, String str2, Object obj2) {
        return (str == null || str.equals(str2)) ? function.apply(obj2) : obj2;
    }

    /* JADX INFO: renamed from: of */
    static ValueFilter m6274of(final String str, final Function function) {
        return new ValueFilter() { // from class: com.alibaba.fastjson2.filter.e
            @Override // com.alibaba.fastjson2.filter.ValueFilter
            public final Object apply(Object obj, String str2, Object obj2) {
                return ValueFilter.m6271f(str, function, obj, str2, obj2);
            }
        };
    }

    Object apply(Object obj, String str, Object obj2);

    /* JADX INFO: renamed from: of */
    static ValueFilter m6273of(final String str, final Map map) {
        return new ValueFilter() { // from class: com.alibaba.fastjson2.filter.f
            @Override // com.alibaba.fastjson2.filter.ValueFilter
            public final Object apply(Object obj, String str2, Object obj2) {
                return ValueFilter.m6270e(str, map, obj, str2, obj2);
            }
        };
    }

    /* JADX INFO: renamed from: of */
    static ValueFilter m6275of(final Predicate<String> predicate, final Function function) {
        return new ValueFilter() { // from class: com.alibaba.fastjson2.filter.g
            @Override // com.alibaba.fastjson2.filter.ValueFilter
            public final Object apply(Object obj, String str, Object obj2) {
                return ValueFilter.m6269d(predicate, function, obj, str, obj2);
            }
        };
    }
}
