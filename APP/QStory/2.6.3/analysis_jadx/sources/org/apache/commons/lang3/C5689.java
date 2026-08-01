package org.apache.commons.lang3;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5689 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15621;

    public /* synthetic */ C5689(int i) {
        this.f15621 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f15621) {
            case 0:
                return AnnotationUtils$1.lambda$getShortClassName$0((Class) obj);
            case 1:
                return (String) ((Map.Entry) obj).getValue();
            default:
                return (String) ((Map.Entry) obj).getKey();
        }
    }
}
