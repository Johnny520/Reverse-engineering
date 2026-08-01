package org.luckypray.dexkit.wrap;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import org.luckypray.dexkit.util.AbstractC5731;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5735 implements InterfaceC5733 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f15723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f15724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f15725;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15726;

    public C5735(String str) {
        str.getClass();
        this.f15723 = AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.wrap.DexField$typeSign$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final String invoke() {
                return AbstractC5731.m11129(this.this$0.f15724);
            }
        });
        int iM10170 = AbstractC5144.m10170(str, "->", 0, false, 6);
        int iM101702 = AbstractC5144.m10170(str, ":", iM10170 + 1, false, 4);
        if (iM10170 == -1 || iM101702 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.f15726 = AbstractC5731.m11131(str.substring(0, iM10170));
        this.f15725 = str.substring(iM10170 + 2, iM101702);
        this.f15724 = AbstractC5731.m11131(str.substring(iM101702 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5735)) {
            return false;
        }
        C5735 c5735 = (C5735) obj;
        return AbstractC4395.m8907(this.f15726, c5735.f15726) && AbstractC4395.m8907(this.f15725, c5735.f15725) && AbstractC4395.m8907(this.f15724, c5735.f15724);
    }

    public final int hashCode() {
        return this.f15724.hashCode() + (this.f15725.hashCode() * 31) + (this.f15726.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC5731.m11129(this.f15726) + "->" + this.f15725 + ":" + ((String) this.f15723.getValue());
    }
}
