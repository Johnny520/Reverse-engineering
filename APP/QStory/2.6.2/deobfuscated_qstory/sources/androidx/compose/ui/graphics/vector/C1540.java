package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1540 extends AbstractC1538 implements Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final List f4469;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f4470;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f4471;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f4472;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final List f4473;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final float f4474;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float f4475;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f4476;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f4477;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f4478;

    public C1540(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f4478 = str;
        this.f4476 = f;
        this.f4477 = f2;
        this.f4471 = f3;
        this.f4470 = f4;
        this.f4474 = f5;
        this.f4475 = f6;
        this.f4472 = f7;
        this.f4473 = list;
        this.f4469 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1540)) {
            C1540 c1540 = (C1540) obj;
            return AbstractC4394.m8917(this.f4478, c1540.f4478) && this.f4476 == c1540.f4476 && this.f4477 == c1540.f4477 && this.f4471 == c1540.f4471 && this.f4470 == c1540.f4470 && this.f4474 == c1540.f4474 && this.f4475 == c1540.f4475 && this.f4472 == c1540.f4472 && AbstractC4394.m8917(this.f4473, c1540.f4473) && AbstractC4394.m8917(this.f4469, c1540.f4469);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4469.hashCode() + AbstractC0053.m159(this.f4473, AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(this.f4478.hashCode() * 31, this.f4476, 31), this.f4477, 31), this.f4471, 31), this.f4470, 31), this.f4474, 31), this.f4475, 31), this.f4472, 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1541(this);
    }
}
