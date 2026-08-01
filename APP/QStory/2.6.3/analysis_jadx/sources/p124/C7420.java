package p124;

import bsh.C2633;
import io.ktor.client.plugins.AbstractC3933;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7420 extends AbstractC7416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f20112;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object[] f20113;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f20114;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C7420(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f20114 = i3;
        Object[] objArr2 = new Object[i3];
        this.f20113 = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f20112 = r5;
        objArr2[0] = objArr;
        m12648(i - r5, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2633.m5336();
            return null;
        }
        Object objM12649 = m12649();
        int i = this.f20103 + 1;
        this.f20103 = i;
        if (i == this.f20102) {
            this.f20112 = true;
            return objM12649;
        }
        m12647(0);
        return objM12649;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C2633.m5336();
            return null;
        }
        this.f20103--;
        if (this.f20112) {
            this.f20112 = false;
            return m12649();
        }
        m12647(31);
        return m12649();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12647(int i) {
        int i2 = 0;
        while (AbstractC3933.m8306(this.f20103, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m12648(this.f20103, ((this.f20114 - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12648(int i, int i2) {
        int i3 = (this.f20114 - i2) * 5;
        while (i2 < this.f20114) {
            Object[] objArr = this.f20113;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[AbstractC3933.m8306(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m12649() {
        int i = this.f20103 & 31;
        Object obj = this.f20113[this.f20114 - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }
}
