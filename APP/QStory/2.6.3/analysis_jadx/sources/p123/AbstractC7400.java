package p123;

import bsh.C2633;
import java.util.Iterator;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7400 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f20065;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f20066 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7408[] f20067;

    public AbstractC7400(C7407 c7407, AbstractC7408[] abstractC7408Arr) {
        this.f20067 = abstractC7408Arr;
        abstractC7408Arr[0].m12597(c7407.f20077, Integer.bitCount(c7407.f20080) * 2, 0);
        this.f20065 = 0;
        m12571();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20066;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f20066) {
            C2633.m5336();
            return null;
        }
        Object next = this.f20067[this.f20065].next();
        m12571();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m12570(int i) {
        AbstractC7408[] abstractC7408Arr = this.f20067;
        AbstractC7408 abstractC7408 = abstractC7408Arr[i];
        int i2 = abstractC7408.f20082;
        if (i2 < abstractC7408.f20081) {
            return i;
        }
        Object[] objArr = abstractC7408.f20083;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        C7407 c7407 = (C7407) obj;
        if (i == 6) {
            AbstractC7408 abstractC74082 = abstractC7408Arr[i + 1];
            Object[] objArr2 = c7407.f20077;
            abstractC74082.m12597(objArr2, objArr2.length, 0);
        } else {
            abstractC7408Arr[i + 1].m12597(c7407.f20077, Integer.bitCount(c7407.f20080) * 2, 0);
        }
        return m12570(i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12571() {
        int i = this.f20065;
        AbstractC7408[] abstractC7408Arr = this.f20067;
        AbstractC7408 abstractC7408 = abstractC7408Arr[i];
        if (abstractC7408.f20082 < abstractC7408.f20081) {
            return;
        }
        while (-1 < i) {
            int iM12570 = m12570(i);
            if (iM12570 == -1) {
                AbstractC7408 abstractC74082 = abstractC7408Arr[i];
                int i2 = abstractC74082.f20082;
                Object[] objArr = abstractC74082.f20083;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    abstractC74082.f20082 = i2 + 1;
                    iM12570 = m12570(i);
                }
            }
            if (iM12570 != -1) {
                this.f20065 = iM12570;
                return;
            }
            if (i > 0) {
                AbstractC7408 abstractC74083 = abstractC7408Arr[i - 1];
                int i3 = abstractC74083.f20082;
                int length2 = abstractC74083.f20083.length;
                abstractC74083.f20082 = i3 + 1;
            }
            abstractC7408Arr[i].m12597(C7407.f20076.f20077, 0, 0);
            i--;
        }
        this.f20066 = false;
    }
}
