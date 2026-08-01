package org.apache.commons.compress.archivers.zip;

import java.util.function.Predicate;
import org.apache.commons.lang3.exception.DefaultExceptionContext;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.p014io.IOCase;
import org.apache.commons.p014io.filefilter.WildcardFilter;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6421 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f15724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15725;

    public /* synthetic */ C6421(String str, int i) {
        this.f15725 = i;
        this.f15724 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f15725;
        String str = this.f15724;
        switch (i) {
            case 0:
                return str.equalsIgnoreCase((String) obj);
            case 1:
                return WildcardFilter.lambda$accept$1(str, (String) obj);
            case 2:
                return DefaultExceptionContext.lambda$getContextValues$0(str, (Pair) obj);
            case 3:
                return DefaultExceptionContext.lambda$setContextValue$2(str, (Pair) obj);
            case 4:
                return DefaultExceptionContext.lambda$getFirstContextValue$1(str, (Pair) obj);
            default:
                return IOCase.lambda$forName$0(str, (IOCase) obj);
        }
    }
}
