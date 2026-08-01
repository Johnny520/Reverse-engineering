package org.apache.commons.lang3.time;

import androidx.compose.foundation.layout.C0640;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5662 implements BiConsumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15570;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15571;

    public /* synthetic */ C5662(Object obj, int i) {
        this.f15571 = i;
        this.f15570 = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.f15571;
        Object obj3 = this.f15570;
        switch (i) {
            case 0:
                ((String[]) obj3)[((Integer) obj2).intValue()] = (String) obj;
                break;
            default:
                ((C0640) obj3).invoke(obj, obj2);
                break;
        }
    }
}
