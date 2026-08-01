package p140;

import bsh.C3466;
import io.ktor.client.plugins.AbstractC4765;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8249 extends AbstractC8245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f20457;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object[] f20458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f20459;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C8249(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f20459 = i3;
        Object[] objArr2 = new Object[i3];
        this.f20458 = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f20457 = r5;
        objArr2[0] = objArr;
        m13207(i - r5, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C3466.m5896();
            return null;
        }
        Object objM13208 = m13208();
        int i = this.f20448 + 1;
        this.f20448 = i;
        if (i == this.f20447) {
            this.f20457 = true;
            return objM13208;
        }
        m13206(0);
        return objM13208;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C3466.m5896();
            return null;
        }
        this.f20448--;
        if (this.f20457) {
            this.f20457 = false;
            return m13208();
        }
        m13206(31);
        return m13208();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13206(int i) {
        int i2 = 0;
        while (AbstractC4765.m8865(this.f20448, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m13207(this.f20448, ((this.f20459 - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13207(int i, int i2) {
        int i3 = (this.f20459 - i2) * 5;
        while (i2 < this.f20459) {
            Object[] objArr = this.f20458;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[AbstractC4765.m8865(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m13208() {
        int i = this.f20448 & 31;
        Object obj = this.f20458[this.f20459 - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }
}
