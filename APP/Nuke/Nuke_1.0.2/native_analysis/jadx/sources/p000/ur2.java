package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ur2 extends AbstractC0077c3 {

    /* JADX INFO: renamed from: i */
    public static final ur2 f11454i = new ur2(new Object[0]);

    /* JADX INFO: renamed from: h */
    public final Object[] f11455h;

    public ur2(Object[] objArr) {
        this.f11455h = objArr;
    }

    @Override // p000.AbstractC0372k2
    /* JADX INFO: renamed from: a */
    public final int mo529a() {
        return this.f11455h.length;
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: b */
    public final AbstractC0077c3 mo619b(int i, Object obj) {
        Object[] objArr = this.f11455h;
        up0.m5548m(i, objArr.length);
        if (i == objArr.length) {
            return mo620c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC0460mg.m3091f0(objArr, objArr2, 0, i, 6);
            AbstractC0460mg.m3088c0(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new ur2(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC0460mg.m3088c0(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new kz1(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: c */
    public final AbstractC0077c3 mo620c(Object obj) {
        Object[] objArr = this.f11455h;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new ur2(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new kz1(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: d */
    public final AbstractC0077c3 mo621d(Collection collection) {
        Object[] objArr = this.f11455h;
        if (collection.size() + objArr.length > 32) {
            lz1 lz1VarMo622e = mo622e();
            lz1VarMo622e.addAll(collection);
            return lz1VarMo622e.m2997c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new ur2(objArrCopyOf);
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: e */
    public final lz1 mo622e() {
        return new lz1(this, null, this.f11455h, 0);
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: f */
    public final AbstractC0077c3 mo623f(C0041b3 c0041b3) {
        Object[] objArr = this.f11455h;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c0041b3.mo5j(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f11454i : new ur2(AbstractC0460mg.m3093h0(objArrCopyOf, 0, length));
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: g */
    public final AbstractC0077c3 mo624g(int i) {
        Object[] objArr = this.f11455h;
        up0.m5546k(i, objArr.length);
        if (objArr.length == 1) {
            return f11454i;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC0460mg.m3088c0(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new ur2(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.f11455h;
        up0.m5546k(i, objArr.length);
        return objArr[i];
    }

    @Override // p000.AbstractC0077c3
    /* JADX INFO: renamed from: h */
    public final AbstractC0077c3 mo625h(int i, Object obj) {
        Object[] objArr = this.f11455h;
        up0.m5546k(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new ur2(objArrCopyOf);
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC0460mg.m3100o0(this.f11455h, obj);
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f11455h;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f11455h;
        up0.m5548m(i, objArr.length);
        return new C0246gn(objArr, i, objArr.length);
    }
}
