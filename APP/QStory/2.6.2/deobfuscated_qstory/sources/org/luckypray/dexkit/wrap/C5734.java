package org.luckypray.dexkit.wrap;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import org.luckypray.dexkit.util.AbstractC5730;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5734 implements InterfaceC5732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f15723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f15724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f15725;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15726;

    public C5734(String str) {
        str.getClass();
        this.f15723 = AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.wrap.DexField$typeSign$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final String invoke() {
                return AbstractC5730.m11072(this.this$0.f15724);
            }
        });
        int iM10167 = AbstractC5143.m10167(str, "->", 0, false, 6);
        int iM101672 = AbstractC5143.m10167(str, ":", iM10167 + 1, false, 4);
        if (iM10167 == -1 || iM101672 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.f15726 = AbstractC5730.m11074(str.substring(0, iM10167));
        this.f15725 = str.substring(iM10167 + 2, iM101672);
        this.f15724 = AbstractC5730.m11074(str.substring(iM101672 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5734)) {
            return false;
        }
        C5734 c5734 = (C5734) obj;
        return AbstractC4394.m8917(this.f15726, c5734.f15726) && AbstractC4394.m8917(this.f15725, c5734.f15725) && AbstractC4394.m8917(this.f15724, c5734.f15724);
    }

    public final int hashCode() {
        return this.f15724.hashCode() + (this.f15725.hashCode() * 31) + (this.f15726.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC5730.m11072(this.f15726) + "->" + this.f15725 + ":" + ((String) this.f15723.getValue());
    }
}
