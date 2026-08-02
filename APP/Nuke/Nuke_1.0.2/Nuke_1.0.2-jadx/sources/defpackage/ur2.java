package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ur2 extends c3 {
    public static final ur2 i = new ur2(new Object[0]);
    public final Object[] h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ur2(Object[] objArr) {
        this.h = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2
    public final int a() {
        return this.h.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 b(int i2, Object obj) {
        Object[] objArr = this.h;
        up0.m(i2, objArr.length);
        if (i2 == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            mg.f0(objArr, objArr2, 0, i2, 6);
            mg.c0(objArr, objArr2, i2 + 1, i2, objArr.length);
            objArr2[i2] = obj;
            return new ur2(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        mg.c0(objArr, objArrCopyOf, i2 + 1, i2, objArr.length - 1);
        objArrCopyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new kz1(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 c(Object obj) {
        Object[] objArr = this.h;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new ur2(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new kz1(objArr, objArr2, objArr.length + 1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 d(Collection collection) {
        Object[] objArr = this.h;
        if (collection.size() + objArr.length > 32) {
            lz1 lz1VarE = e();
            lz1VarE.addAll(collection);
            return lz1VarE.c();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final lz1 e() {
        return new lz1(this, null, this.h, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 f(b3 b3Var) {
        Object[] objArr = this.h;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            if (((Boolean) b3Var.j(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i2;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? i : new ur2(mg.h0(objArrCopyOf, 0, length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 g(int i2) {
        Object[] objArr = this.h;
        up0.k(i2, objArr.length);
        if (objArr.length == 1) {
            return i;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        mg.c0(objArr, objArrCopyOf, i2, i2 + 1, objArr.length);
        return new ur2(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i2) {
        Object[] objArr = this.h;
        up0.k(i2, objArr.length);
        return objArr[i2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c3
    public final c3 h(int i2, Object obj) {
        Object[] objArr = this.h;
        up0.k(i2, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i2] = obj;
        return new ur2(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w2, java.util.List
    public final int indexOf(Object obj) {
        return mg.o0(this.h, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w2, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.h;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w2, java.util.List
    public final ListIterator listIterator(int i2) {
        Object[] objArr = this.h;
        up0.m(i2, objArr.length);
        return new gn(objArr, i2, objArr.length);
    }
}
