package p124;

import bsh.C2632;
import com.bumptech.glide.AbstractC3056;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7419 extends AbstractC7415 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f20117;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object[] f20118;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f20119;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C7419(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f20119 = i3;
        Object[] objArr2 = new Object[i3];
        this.f20118 = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f20117 = r5;
        objArr2[0] = objArr;
        m12621(i - r5, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2632.m5291();
            return null;
        }
        Object objM12622 = m12622();
        int i = this.f20108 + 1;
        this.f20108 = i;
        if (i == this.f20107) {
            this.f20117 = true;
            return objM12622;
        }
        m12620(0);
        return objM12622;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C2632.m5291();
            return null;
        }
        this.f20108--;
        if (this.f20117) {
            this.f20117 = false;
            return m12622();
        }
        m12620(31);
        return m12622();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12620(int i) {
        int i2 = 0;
        while (AbstractC3056.m6665(this.f20108, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m12621(this.f20108, ((this.f20119 - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12621(int i, int i2) {
        int i3 = (this.f20119 - i2) * 5;
        while (i2 < this.f20119) {
            Object[] objArr = this.f20118;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[AbstractC3056.m6665(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m12622() {
        int i = this.f20108 & 31;
        Object obj = this.f20118[this.f20119 - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }
}
