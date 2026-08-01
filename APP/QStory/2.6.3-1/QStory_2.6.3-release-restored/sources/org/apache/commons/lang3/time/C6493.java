package org.apache.commons.lang3.time;

import androidx.compose.foundation.layout.C1481;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6493 implements BiConsumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15916;

    public /* synthetic */ C6493(Object obj, int i) {
        this.f15916 = i;
        this.f15915 = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.f15916;
        Object obj3 = this.f15915;
        switch (i) {
            case 0:
                ((String[]) obj3)[((Integer) obj2).intValue()] = (String) obj;
                break;
            default:
                ((C1481) obj3).invoke(obj, obj2);
                break;
        }
    }
}
