package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.filter.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0620b implements NameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1936a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1937b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0620b(Object obj, int i9) {
        this.f1936a = i9;
        this.f1937b = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.filter.NameFilter.d(java.util.function.Function, java.lang.Object, java.lang.String, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.filter.NameFilter
    public final String process(Object obj, String str, Object obj2) {
        switch (this.f1936a) {
            case 0:
                return NameFilter.lambda$of$0((PropertyNamingStrategy) this.f1937b, obj, str, obj2);
            default:
                return NameFilter.lambda$of$2((Function) this.f1937b, obj, str, obj2);
        }
    }
}
