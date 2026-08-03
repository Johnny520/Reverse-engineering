package p000a;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: a.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0906x<E> extends AbstractList<E> implements List<E>, InterfaceC0802r9 {
    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        C0094F1 c0094f1 = (C0094F1) this;
        int i2 = c0094f1.f305c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == C0739o3.m1756c0(c0094f1)) {
            return (E) c0094f1.removeLast();
        }
        if (i == 0) {
            return (E) c0094f1.removeFirst();
        }
        c0094f1.m254g();
        int iM253f = c0094f1.m253f(c0094f1.f303a + i);
        Object[] objArr = c0094f1.f304b;
        E e = (E) objArr[iM253f];
        if (i < (c0094f1.f305c >> 1)) {
            int i3 = c0094f1.f303a;
            if (iM253f >= i3) {
                C0889w1.m2149h(objArr, objArr, i3 + 1, i3, iM253f);
            } else {
                C0889w1.m2149h(objArr, objArr, 1, 0, iM253f);
                Object[] objArr2 = c0094f1.f304b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = c0094f1.f303a;
                C0889w1.m2149h(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = c0094f1.f304b;
            int i5 = c0094f1.f303a;
            objArr3[i5] = null;
            c0094f1.f303a = c0094f1.m250c(i5);
        } else {
            int iM253f2 = c0094f1.m253f(C0739o3.m1756c0(c0094f1) + c0094f1.f303a);
            if (iM253f <= iM253f2) {
                Object[] objArr4 = c0094f1.f304b;
                C0889w1.m2149h(objArr4, objArr4, iM253f, iM253f + 1, iM253f2 + 1);
            } else {
                Object[] objArr5 = c0094f1.f304b;
                C0889w1.m2149h(objArr5, objArr5, iM253f, iM253f + 1, objArr5.length);
                Object[] objArr6 = c0094f1.f304b;
                objArr6[objArr6.length - 1] = objArr6[0];
                C0889w1.m2149h(objArr6, objArr6, 0, 1, iM253f2 + 1);
            }
            c0094f1.f304b[iM253f2] = null;
        }
        c0094f1.f305c--;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C0094F1) this).f305c;
    }
}
