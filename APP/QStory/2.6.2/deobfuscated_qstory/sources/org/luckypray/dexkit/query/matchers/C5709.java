package org.luckypray.dexkit.query.matchers;

import com.bumptech.glide.AbstractC3055;
import com.google.flatbuffers.C3218;
import org.luckypray.dexkit.query.enums.UsingType;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5709 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public UsingType f15654 = UsingType.Any;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5715 f15655;

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        C5715 c5715 = this.f15655;
        if (c5715 == null) {
            C5919.m11249("UsingFieldMatcher matcher not set");
            return 0;
        }
        int iMo6650 = c5715.mo6650(c3218);
        byte value = this.f15654.getValue();
        c3218.m7312(2);
        c3218.m7305(0, iMo6650);
        c3218.m7308(value, 1);
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }
}
