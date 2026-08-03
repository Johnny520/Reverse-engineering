package com.alibaba.fastjson2.filter;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: com.alibaba.fastjson2.filter.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0621c implements ValueFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1939b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1940c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0621c(Object obj, int i9, Object obj2) {
        this.f1938a = i9;
        this.f1939b = obj;
        this.f1940c = obj2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.filter.ValueFilter.c(java.util.function.Predicate, java.util.function.Function, java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.filter.ValueFilter
    public final Object apply(Object obj, String str, Object obj2) {
        switch (this.f1938a) {
            case 0:
                return ValueFilter.lambda$compose$0((ValueFilter) this.f1939b, (ValueFilter) this.f1940c, obj, str, obj2);
            case 1:
                return ValueFilter.lambda$of$1((String) this.f1939b, (Function) this.f1940c, obj, str, obj2);
            case 2:
                return ValueFilter.lambda$of$2((String) this.f1939b, (Map) this.f1940c, obj, str, obj2);
            default:
                return ValueFilter.lambda$of$3((Predicate) this.f1939b, (Function) this.f1940c, obj, str, obj2);
        }
    }
}
