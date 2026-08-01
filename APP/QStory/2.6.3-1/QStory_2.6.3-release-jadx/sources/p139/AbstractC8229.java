package p139;

import bsh.C3466;
import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8229 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f20410;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f20411 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC8237[] f20412;

    public AbstractC8229(C8236 c8236, AbstractC8237[] abstractC8237Arr) {
        this.f20412 = abstractC8237Arr;
        abstractC8237Arr[0].m13156(c8236.f20422, Integer.bitCount(c8236.f20425) * 2, 0);
        this.f20410 = 0;
        m13130();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20411;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f20411) {
            C3466.m5896();
            return null;
        }
        Object next = this.f20412[this.f20410].next();
        m13130();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13129(int i) {
        AbstractC8237[] abstractC8237Arr = this.f20412;
        AbstractC8237 abstractC8237 = abstractC8237Arr[i];
        int i2 = abstractC8237.f20427;
        if (i2 < abstractC8237.f20426) {
            return i;
        }
        Object[] objArr = abstractC8237.f20428;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        C8236 c8236 = (C8236) obj;
        if (i == 6) {
            AbstractC8237 abstractC82372 = abstractC8237Arr[i + 1];
            Object[] objArr2 = c8236.f20422;
            abstractC82372.m13156(objArr2, objArr2.length, 0);
        } else {
            abstractC8237Arr[i + 1].m13156(c8236.f20422, Integer.bitCount(c8236.f20425) * 2, 0);
        }
        return m13129(i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13130() {
        int i = this.f20410;
        AbstractC8237[] abstractC8237Arr = this.f20412;
        AbstractC8237 abstractC8237 = abstractC8237Arr[i];
        if (abstractC8237.f20427 < abstractC8237.f20426) {
            return;
        }
        while (-1 < i) {
            int iM13129 = m13129(i);
            if (iM13129 == -1) {
                AbstractC8237 abstractC82372 = abstractC8237Arr[i];
                int i2 = abstractC82372.f20427;
                Object[] objArr = abstractC82372.f20428;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    abstractC82372.f20427 = i2 + 1;
                    iM13129 = m13129(i);
                }
            }
            if (iM13129 != -1) {
                this.f20410 = iM13129;
                return;
            }
            if (i > 0) {
                AbstractC8237 abstractC82373 = abstractC8237Arr[i - 1];
                int i3 = abstractC82373.f20427;
                int length2 = abstractC82373.f20428.length;
                abstractC82373.f20427 = i3 + 1;
            }
            abstractC8237Arr[i].m13156(C8236.f20421.f20422, 0, 0);
            i--;
        }
        this.f20411 = false;
    }
}
