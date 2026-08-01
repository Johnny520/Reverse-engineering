package org.luckypray.dexkit.wrap;

import java.util.ArrayList;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import org.luckypray.dexkit.util.AbstractC5730;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5733 implements InterfaceC5732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5183 f15718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f15719;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f15720;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f15721;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15722;

    public C5733(String str) {
        int i;
        str.getClass();
        this.f15718 = AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final String invoke() {
                C5733 c5733 = this.this$0;
                return "(" + AbstractC4343.m8813(c5733.f15720, "", null, null, new InterfaceC6557() { // from class: org.luckypray.dexkit.wrap.DexMethod$getSign$1$1
                    @Override // p052.InterfaceC6557
                    public final CharSequence invoke(String str2) {
                        str2.getClass();
                        return AbstractC5730.m11072(str2);
                    }
                }, 30) + ")" + AbstractC5730.m11072(c5733.f15719);
            }
        });
        int iM10151 = 0;
        int iM10167 = AbstractC5143.m10167(str, "->", 0, false, 6);
        int iM101672 = AbstractC5143.m10167(str, "(", iM10167 + 1, false, 4);
        int i2 = iM101672 + 1;
        int iM101673 = AbstractC5143.m10167(str, ")", i2, false, 4);
        if (iM10167 == -1 || iM101672 == -1 || iM101673 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f15722 = AbstractC5730.m11074(str.substring(0, iM10167));
        this.f15721 = str.substring(iM10167 + 2, iM101672);
        String strSubstring = str.substring(i2, iM101673);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM10151;
            while (iM10151 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(iM10151);
                if (cCharAt == '[') {
                    iM10151++;
                } else {
                    if (cCharAt == 'L') {
                        iM10151 = AbstractC5143.m10151(strSubstring, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, iM10151, 4);
                    }
                    iM10151++;
                    arrayList.add(AbstractC5730.m11074(strSubstring.substring(i, iM10151)));
                }
            }
            break loop0;
        }
        if (i != iM10151) {
            C5919.m11250("Unknown signString: ".concat(strSubstring));
            throw null;
        }
        this.f15720 = arrayList;
        this.f15719 = AbstractC5730.m11074(str.substring(iM101673 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5733)) {
            return false;
        }
        C5733 c5733 = (C5733) obj;
        return AbstractC4394.m8917(this.f15722, c5733.f15722) && AbstractC4394.m8917(this.f15721, c5733.f15721) && AbstractC4394.m8917(this.f15720, c5733.f15720) && AbstractC4394.m8917(this.f15719, c5733.f15719);
    }

    public final int hashCode() {
        return this.f15719.hashCode() + (this.f15720.hashCode() * 31) + (this.f15721.hashCode() * 31) + (this.f15722.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC5730.m11072(this.f15722) + "->" + this.f15721 + ((String) this.f15718.getValue());
    }
}
