package p114X;

import com.bumptech.glide.AbstractC1925g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: X.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1621j extends AbstractC1614c {

    /* JADX INFO: renamed from: e */
    public static final C1621j f5578e = new C1621j(new Object[0]);

    /* JADX INFO: renamed from: d */
    public final Object[] f5579d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1621j(Object[] objArr) {
        this.f5579d = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        return this.f5579d.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: b */
    public final AbstractC1614c mo2877b(int i5, Object obj) {
        Object[] objArr = this.f5579d;
        AbstractC1925g.m3531h(i5, objArr.length);
        if (i5 == objArr.length) {
            return mo2878c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC0972l.m1995S(objArr, objArr2, 0, i5, 6);
            AbstractC0972l.m1993Q(objArr, objArr2, i5 + 1, i5, objArr.length);
            objArr2[i5] = obj;
            return new C1621j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        AbstractC0972l.m1993Q(objArr, objArrCopyOf, i5 + 1, i5, objArr.length - 1);
        objArrCopyOf[i5] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C1617f(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: c */
    public final AbstractC1614c mo2878c(Object obj) {
        Object[] objArr = this.f5579d;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new C1617f(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new C1621j(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: d */
    public final AbstractC1614c mo2879d(Collection collection) {
        Object[] objArr = this.f5579d;
        if (collection.size() + objArr.length > 32) {
            C1618g c1618gMo2880e = mo2880e();
            c1618gMo2880e.addAll(collection);
            return c1618gMo2880e.m2899c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new C1621j(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: e */
    public final C1618g mo2880e() {
        return new C1618g(this, null, this.f5579d, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: f */
    public final AbstractC1614c mo2881f(C1613b c1613b) {
        Object[] objArr = this.f5579d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z5 = false;
        for (int i5 = 0; i5 < length2; i5++) {
            Object obj = objArr[i5];
            if (((Boolean) c1613b.mo1h(obj)).booleanValue()) {
                if (!z5) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
                    z5 = true;
                    length = i5;
                }
            } else if (z5) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f5578e : new C1621j(AbstractC0972l.m1997U(objArrCopyOf, 0, length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: g */
    public final AbstractC1614c mo2882g(int i5) {
        Object[] objArr = this.f5579d;
        AbstractC1925g.m3530g(i5, objArr.length);
        if (objArr.length == 1) {
            return f5578e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        AbstractC0972l.m1993Q(objArr, objArrCopyOf, i5, i5 + 1, objArr.length);
        return new C1621j(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i5) {
        AbstractC1925g.m3530g(i5, mo1974a());
        return this.f5579d[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p114X.AbstractC1614c
    /* JADX INFO: renamed from: h */
    public final AbstractC1614c mo2883h(int i5, Object obj) {
        Object[] objArr = this.f5579d;
        AbstractC1925g.m3530g(i5, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i5] = obj;
        return new C1621j(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0965e, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC0972l.m2004b0(this.f5579d, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0965e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f5579d;
        AbstractC1665j.m2985e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    length2 = i6;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0965e, java.util.List
    public final ListIterator listIterator(int i5) {
        Object[] objArr = this.f5579d;
        AbstractC1925g.m3531h(i5, objArr.length);
        return new C1615d(objArr, i5, objArr.length);
    }
}
