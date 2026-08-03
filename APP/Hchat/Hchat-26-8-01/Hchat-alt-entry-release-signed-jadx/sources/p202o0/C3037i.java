package p202o0;

import be.AbstractC0283h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: o0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3037i extends AbstractC3031c {

    /* JADX INFO: renamed from: h */
    public static final C3037i f9857h = new C3037i(new Object[0]);

    /* JADX INFO: renamed from: g */
    public final Object[] f9858g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3037i(Object[] objArr) {
        this.f9858g = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: a */
    public final AbstractC3031c mo6434a(int i9, Object obj) {
        AbstractC0283h.m1173n(i9, size());
        if (i9 == size()) {
            return mo6435c(obj);
        }
        int size = size();
        Object[] objArr = this.f9858g;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            AbstractC4165l.m8383r0(0, i9, objArr, 6, objArr2);
            AbstractC4165l.m8379n0(i9 + 1, i9, objArr, size(), objArr2);
            objArr2[i9] = obj;
            return new C3037i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC4165l.m8379n0(i9 + 1, i9, objArr, size() - 1, objArrCopyOf);
        objArrCopyOf[i9] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C3033e(objArrCopyOf, objArr3, size() + 1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: c */
    public final AbstractC3031c mo6435c(Object obj) {
        int size = size();
        Object[] objArr = this.f9858g;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
            objArrCopyOf[size()] = obj;
            return new C3037i(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C3033e(objArr, objArr2, size() + 1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: d */
    public final AbstractC3031c mo6436d(Collection collection) {
        if (collection.size() + size() > 32) {
            C3034f c3034fMo6437e = mo6437e();
            c3034fMo6437e.addAll(collection);
            return c3034fMo6437e.m6459d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f9858g, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new C3037i(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: e */
    public final C3034f mo6437e() {
        return new C3034f(this, null, this.f9858g, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: f */
    public final AbstractC3031c mo6438f(C3030b c3030b) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f9858g;
        Object[] objArrCopyOf = objArr;
        boolean z9 = false;
        for (int i9 = 0; i9 < size2; i9++) {
            Object obj = objArr[i9];
            if (((Boolean) c3030b.invoke(obj)).booleanValue()) {
                if (!z9) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z9 = true;
                    size = i9;
                }
            } else if (z9) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f9857h : new C3037i(AbstractC4165l.m8386u0(objArrCopyOf, 0, size));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: g */
    public final AbstractC3031c mo6439g(int i9) {
        AbstractC0283h.m1171m(i9, size());
        if (size() == 1) {
            return f9857h;
        }
        int size = size() - 1;
        Object[] objArr = this.f9858g;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        AbstractC4165l.m8379n0(i9, i9 + 1, objArr, size(), objArrCopyOf);
        return new C3037i(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        AbstractC0283h.m1171m(i9, size());
        return this.f9858g[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        return this.f9858g.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p202o0.AbstractC3031c
    /* JADX INFO: renamed from: h */
    public final AbstractC3031c mo6440h(int i9, Object obj) {
        AbstractC0283h.m1171m(i9, size());
        Object[] objArr = this.f9858g;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i9] = obj;
        return new C3037i(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC4165l.m8367D0(this.f9858g, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f9858g;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i9 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i9 < 0) {
                        break;
                    }
                    length = i9;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final ListIterator listIterator(int i9) {
        AbstractC0283h.m1173n(i9, size());
        return new C3032d(this.f9858g, i9, size());
    }
}
