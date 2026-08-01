package org.luckypray.dexkit.wrap;

import java.util.ArrayList;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import org.luckypray.dexkit.util.AbstractC5731;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5734 implements InterfaceC5733 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5184 f15718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f15719;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f15720;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f15721;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15722;

    public C5734(String str) {
        int i;
        str.getClass();
        this.f15718 = AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final String invoke() {
                C5734 c5734 = this.this$0;
                return "(" + AbstractC4344.m8810(c5734.f15720, "", null, null, new InterfaceC6558() { // from class: org.luckypray.dexkit.wrap.DexMethod$getSign$1$1
                    @Override // p052.InterfaceC6558
                    public final CharSequence invoke(String str2) {
                        str2.getClass();
                        return AbstractC5731.m11129(str2);
                    }
                }, 30) + ")" + AbstractC5731.m11129(c5734.f15719);
            }
        });
        int iM10171 = 0;
        int iM10170 = AbstractC5144.m10170(str, "->", 0, false, 6);
        int iM101702 = AbstractC5144.m10170(str, "(", iM10170 + 1, false, 4);
        int i2 = iM101702 + 1;
        int iM101703 = AbstractC5144.m10170(str, ")", i2, false, 4);
        if (iM10170 == -1 || iM101702 == -1 || iM101703 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f15722 = AbstractC5731.m11131(str.substring(0, iM10170));
        this.f15721 = str.substring(iM10170 + 2, iM101702);
        String strSubstring = str.substring(i2, iM101703);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM10171;
            while (iM10171 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(iM10171);
                if (cCharAt == '[') {
                    iM10171++;
                } else {
                    if (cCharAt == 'L') {
                        iM10171 = AbstractC5144.m10171(strSubstring, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, iM10171, 4);
                    }
                    iM10171++;
                    arrayList.add(AbstractC5731.m11131(strSubstring.substring(i, iM10171)));
                }
            }
            break loop0;
        }
        if (i != iM10171) {
            C5925.m11311("Unknown signString: ".concat(strSubstring));
            throw null;
        }
        this.f15720 = arrayList;
        this.f15719 = AbstractC5731.m11131(str.substring(iM101703 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5734)) {
            return false;
        }
        C5734 c5734 = (C5734) obj;
        return AbstractC4395.m8907(this.f15722, c5734.f15722) && AbstractC4395.m8907(this.f15721, c5734.f15721) && AbstractC4395.m8907(this.f15720, c5734.f15720) && AbstractC4395.m8907(this.f15719, c5734.f15719);
    }

    public final int hashCode() {
        return this.f15719.hashCode() + (this.f15720.hashCode() * 31) + (this.f15721.hashCode() * 31) + (this.f15722.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC5731.m11129(this.f15722) + "->" + this.f15721 + ((String) this.f15718.getValue());
    }
}
