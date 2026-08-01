package p123;

import bsh.C2632;
import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7399 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f20070;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f20071 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7407[] f20072;

    public AbstractC7399(C7406 c7406, AbstractC7407[] abstractC7407Arr) {
        this.f20072 = abstractC7407Arr;
        abstractC7407Arr[0].m12570(c7406.f20082, Integer.bitCount(c7406.f20085) * 2, 0);
        this.f20070 = 0;
        m12544();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20071;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f20071) {
            C2632.m5291();
            return null;
        }
        Object next = this.f20072[this.f20070].next();
        m12544();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m12543(int i) {
        AbstractC7407[] abstractC7407Arr = this.f20072;
        AbstractC7407 abstractC7407 = abstractC7407Arr[i];
        int i2 = abstractC7407.f20087;
        if (i2 < abstractC7407.f20086) {
            return i;
        }
        Object[] objArr = abstractC7407.f20088;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        C7406 c7406 = (C7406) obj;
        if (i == 6) {
            AbstractC7407 abstractC74072 = abstractC7407Arr[i + 1];
            Object[] objArr2 = c7406.f20082;
            abstractC74072.m12570(objArr2, objArr2.length, 0);
        } else {
            abstractC7407Arr[i + 1].m12570(c7406.f20082, Integer.bitCount(c7406.f20085) * 2, 0);
        }
        return m12543(i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12544() {
        int i = this.f20070;
        AbstractC7407[] abstractC7407Arr = this.f20072;
        AbstractC7407 abstractC7407 = abstractC7407Arr[i];
        if (abstractC7407.f20087 < abstractC7407.f20086) {
            return;
        }
        while (-1 < i) {
            int iM12543 = m12543(i);
            if (iM12543 == -1) {
                AbstractC7407 abstractC74072 = abstractC7407Arr[i];
                int i2 = abstractC74072.f20087;
                Object[] objArr = abstractC74072.f20088;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    abstractC74072.f20087 = i2 + 1;
                    iM12543 = m12543(i);
                }
            }
            if (iM12543 != -1) {
                this.f20070 = iM12543;
                return;
            }
            if (i > 0) {
                AbstractC7407 abstractC74073 = abstractC7407Arr[i - 1];
                int i3 = abstractC74073.f20087;
                int length2 = abstractC74073.f20088.length;
                abstractC74073.f20087 = i3 + 1;
            }
            abstractC7407Arr[i].m12570(C7406.f20081.f20082, 0, 0);
            i--;
        }
        this.f20071 = false;
    }
}
