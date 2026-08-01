package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.util.function.Predicate;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5690 implements Predicate {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15622;

    public /* synthetic */ C5690(int i) {
        this.f15622 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f15622) {
            case 0:
                return Annotation.class.isAssignableFrom((Class) obj);
            default:
                return AbstractC5686.m11054(obj, null);
        }
    }
}
