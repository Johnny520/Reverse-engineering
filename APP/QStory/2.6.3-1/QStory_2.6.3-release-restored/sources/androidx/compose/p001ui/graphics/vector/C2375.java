package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2375 extends AbstractC2373 implements Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final List f4815;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f4816;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f4817;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f4818;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final List f4819;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final float f4820;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float f4821;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f4822;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f4823;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f4824;

    public C2375(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f4824 = str;
        this.f4822 = f;
        this.f4823 = f2;
        this.f4817 = f3;
        this.f4816 = f4;
        this.f4820 = f5;
        this.f4821 = f6;
        this.f4818 = f7;
        this.f4819 = list;
        this.f4815 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2375)) {
            C2375 c2375 = (C2375) obj;
            return AbstractC5227.m9466(this.f4824, c2375.f4824) && this.f4822 == c2375.f4822 && this.f4823 == c2375.f4823 && this.f4817 == c2375.f4817 && this.f4816 == c2375.f4816 && this.f4820 == c2375.f4820 && this.f4821 == c2375.f4821 && this.f4818 == c2375.f4818 && AbstractC5227.m9466(this.f4819, c2375.f4819) && AbstractC5227.m9466(this.f4815, c2375.f4815);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4815.hashCode() + AbstractC0900.m720(this.f4819, AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(this.f4824.hashCode() * 31, this.f4822, 31), this.f4823, 31), this.f4817, 31), this.f4816, 31), this.f4820, 31), this.f4821, 31), this.f4818, 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2376(this);
    }
}
