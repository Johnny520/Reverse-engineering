package org.luckypray.dexkit.wrap;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import org.luckypray.dexkit.util.AbstractC6561;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: org.luckypray.dexkit.wrap.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6565 implements InterfaceC6563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f16068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f16069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16071;

    public C6565(String str) {
        str.getClass();
        this.f16068 = AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.wrap.DexField$typeSign$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final String invoke() {
                return AbstractC6561.m11688(this.this$0.f16069);
            }
        });
        int iM10729 = AbstractC5976.m10729(str, "->", 0, false, 6);
        int iM107292 = AbstractC5976.m10729(str, ":", iM10729 + 1, false, 4);
        if (iM10729 == -1 || iM107292 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.f16071 = AbstractC6561.m11690(str.substring(0, iM10729));
        this.f16070 = str.substring(iM10729 + 2, iM107292);
        this.f16069 = AbstractC6561.m11690(str.substring(iM107292 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6565)) {
            return false;
        }
        C6565 c6565 = (C6565) obj;
        return AbstractC5227.m9466(this.f16071, c6565.f16071) && AbstractC5227.m9466(this.f16070, c6565.f16070) && AbstractC5227.m9466(this.f16069, c6565.f16069);
    }

    public final int hashCode() {
        return this.f16069.hashCode() + (this.f16070.hashCode() * 31) + (this.f16071.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC6561.m11688(this.f16071) + "->" + this.f16070 + ":" + ((String) this.f16068.getValue());
    }
}
