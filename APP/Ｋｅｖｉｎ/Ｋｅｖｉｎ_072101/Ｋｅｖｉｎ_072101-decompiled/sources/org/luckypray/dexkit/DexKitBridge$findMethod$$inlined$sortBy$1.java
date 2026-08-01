package org.luckypray.dexkit;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m115d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m116k = 3, m117mv = {1, 5, 1}, m119xi = 128)
public final class DexKitBridge$findMethod$$inlined$sortBy$1<T> implements java.util.Comparator<T> {
    public DexKitBridge$findMethod$$inlined$sortBy$1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(T r4, T r5) {
            r3 = this;
            r0 = r4
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            r1 = 0
            java.lang.String r0 = r0.getDescriptor()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r1 = r5
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1
            r2 = 0
            java.lang.String r1 = r1.getDescriptor()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = kotlin.comparisons.ComparisonsKt.compareValues(r0, r1)
            return r0
    }
}
