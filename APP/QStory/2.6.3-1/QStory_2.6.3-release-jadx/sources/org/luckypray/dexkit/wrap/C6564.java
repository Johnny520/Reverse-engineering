package org.luckypray.dexkit.wrap;

import java.util.ArrayList;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import org.luckypray.dexkit.util.AbstractC6561;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6564 implements InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6016 f16063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f16064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f16065;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16066;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16067;

    public C6564(String str) {
        int i;
        str.getClass();
        this.f16063 = AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final String invoke() {
                C6564 c6564 = this.this$0;
                return "(" + AbstractC5176.m9369(c6564.f16065, "", null, null, new InterfaceC7387() { // from class: org.luckypray.dexkit.wrap.DexMethod$getSign$1$1
                    @Override // p068.InterfaceC7387
                    public final CharSequence invoke(String str2) {
                        str2.getClass();
                        return AbstractC6561.m11688(str2);
                    }
                }, 30) + ")" + AbstractC6561.m11688(c6564.f16064);
            }
        });
        int iM10730 = 0;
        int iM10729 = AbstractC5976.m10729(str, "->", 0, false, 6);
        int iM107292 = AbstractC5976.m10729(str, "(", iM10729 + 1, false, 4);
        int i2 = iM107292 + 1;
        int iM107293 = AbstractC5976.m10729(str, ")", i2, false, 4);
        if (iM10729 == -1 || iM107292 == -1 || iM107293 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f16067 = AbstractC6561.m11690(str.substring(0, iM10729));
        this.f16066 = str.substring(iM10729 + 2, iM107292);
        String strSubstring = str.substring(i2, iM107293);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM10730;
            while (iM10730 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(iM10730);
                if (cCharAt == '[') {
                    iM10730++;
                } else {
                    if (cCharAt == 'L') {
                        iM10730 = AbstractC5976.m10730(strSubstring, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, iM10730, 4);
                    }
                    iM10730++;
                    arrayList.add(AbstractC6561.m11690(strSubstring.substring(i, iM10730)));
                }
            }
            break loop0;
        }
        if (i != iM10730) {
            C6755.m11870("Unknown signString: ".concat(strSubstring));
            throw null;
        }
        this.f16065 = arrayList;
        this.f16064 = AbstractC6561.m11690(str.substring(iM107293 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6564)) {
            return false;
        }
        C6564 c6564 = (C6564) obj;
        return AbstractC5227.m9466(this.f16067, c6564.f16067) && AbstractC5227.m9466(this.f16066, c6564.f16066) && AbstractC5227.m9466(this.f16065, c6564.f16065) && AbstractC5227.m9466(this.f16064, c6564.f16064);
    }

    public final int hashCode() {
        return this.f16064.hashCode() + (this.f16065.hashCode() * 31) + (this.f16066.hashCode() * 31) + (this.f16067.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC6561.m11688(this.f16067) + "->" + this.f16066 + ((String) this.f16063.getValue());
    }
}
