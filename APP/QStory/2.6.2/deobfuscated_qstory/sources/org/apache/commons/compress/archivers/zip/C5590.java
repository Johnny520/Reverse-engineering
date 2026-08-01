package org.apache.commons.compress.archivers.zip;

import java.util.function.Predicate;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.WildcardFilter;
import org.apache.commons.lang3.exception.DefaultExceptionContext;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5590 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f15379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15380;

    public /* synthetic */ C5590(String str, int i) {
        this.f15380 = i;
        this.f15379 = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f15380;
        String str = this.f15379;
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
