package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.util.function.Predicate;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5689 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15622;

    public /* synthetic */ C5689(int i) {
        this.f15622 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f15622) {
            case 0:
                return Annotation.class.isAssignableFrom((Class) obj);
            default:
                return AbstractC5685.m10997(obj, null);
        }
    }
}
