package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.util.BeanUtils;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface NameFilter extends Filter {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static NameFilter compose(final NameFilter nameFilter, final NameFilter nameFilter2) {
        return new NameFilter() { // from class: com.alibaba.fastjson2.filter.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // com.alibaba.fastjson2.filter.NameFilter
            public final String process(Object obj, String str, Object obj2) {
                return NameFilter.lambda$compose$1(this.f1934a, nameFilter, obj, str, obj2);
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$compose$1(NameFilter nameFilter, NameFilter nameFilter2, Object obj, String str, Object obj2) {
        return nameFilter.process(obj, nameFilter2.process(obj, str, obj2), obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$of$0(PropertyNamingStrategy propertyNamingStrategy, Object obj, String str, Object obj2) {
        return BeanUtils.fieldName(str, propertyNamingStrategy.name());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$of$2(Function function, Object obj, String str, Object obj2) {
        return (String) function.apply(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    static NameFilter m1695of(PropertyNamingStrategy propertyNamingStrategy) {
        return new C0620b(propertyNamingStrategy, 0);
    }

    String process(Object obj, String str, Object obj2);

    /* JADX INFO: renamed from: of */
    static NameFilter m1696of(Function<String, String> function) {
        return new C0620b(function, 1);
    }
}
