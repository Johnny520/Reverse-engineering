package p105V;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: V.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1483e implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public Object[] f5181d;

    /* JADX INFO: renamed from: e */
    public C1480b f5182e;

    /* JADX INFO: renamed from: f */
    public int f5183f = 0;

    public C1483e(Object[] objArr) {
        this.f5181d = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m2752a(int i5, Object obj) {
        int i6 = this.f5183f + 1;
        if (this.f5181d.length < i6) {
            m2764m(i6);
        }
        Object[] objArr = this.f5181d;
        int i7 = this.f5183f;
        if (i5 != i7) {
            System.arraycopy(objArr, i5, objArr, i5 + 1, i7 - i5);
        }
        objArr[i5] = obj;
        this.f5183f++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2753b(Object obj) {
        int i5 = this.f5183f + 1;
        if (this.f5181d.length < i5) {
            m2764m(i5);
        }
        Object[] objArr = this.f5181d;
        int i6 = this.f5183f;
        objArr[i6] = obj;
        this.f5183f = i6 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2754c(int i5, C1483e c1483e) {
        int i6 = c1483e.f5183f;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f5183f + i6;
        if (this.f5181d.length < i7) {
            m2764m(i7);
        }
        Object[] objArr = this.f5181d;
        int i8 = this.f5183f;
        if (i5 != i8) {
            System.arraycopy(objArr, i5, objArr, i5 + i6, i8 - i5);
        }
        System.arraycopy(c1483e.f5181d, 0, objArr, i5, i6);
        this.f5183f += i6;
    }

    /* JADX INFO: renamed from: d */
    public final void m2755d(int i5, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i6 = this.f5183f + size;
        if (this.f5181d.length < i6) {
            m2764m(i6);
        }
        Object[] objArr = this.f5181d;
        int i7 = this.f5183f;
        if (i5 != i7) {
            System.arraycopy(objArr, i5, objArr, i5 + size, i7 - i5);
        }
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            objArr[i5 + i8] = list.get(i8);
        }
        this.f5183f += size;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2756e(int i5, Collection collection) {
        int i6 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i7 = this.f5183f + size;
        if (this.f5181d.length < i7) {
            m2764m(i7);
        }
        Object[] objArr = this.f5181d;
        int i8 = this.f5183f;
        if (i5 != i8) {
            System.arraycopy(objArr, i5, objArr, i5 + size, i8 - i5);
        }
        for (Object obj : collection) {
            int i9 = i6 + 1;
            if (i6 < 0) {
                AbstractC2352g.m4187J();
                throw null;
            }
            objArr[i6 + i5] = obj;
            i6 = i9;
        }
        this.f5183f += size;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final List m2757f() {
        C1480b c1480b = this.f5182e;
        if (c1480b != null) {
            return c1480b;
        }
        C1480b c1480b2 = new C1480b(0, this);
        this.f5182e = c1480b2;
        return c1480b2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2758g() {
        Object[] objArr = this.f5181d;
        int i5 = this.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.f5183f = 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2759h(Object obj) {
        int i5 = this.f5183f - 1;
        if (i5 >= 0) {
            for (int i6 = 0; !AbstractC1665j.m2981a(this.f5181d[i6], obj); i6++) {
                if (i6 != i5) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final int m2760i(Object obj) {
        Object[] objArr = this.f5181d;
        int i5 = this.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            if (AbstractC1665j.m2981a(obj, objArr[i6])) {
                return i6;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2761j(Object obj) {
        int iM2760i = m2760i(obj);
        if (iM2760i < 0) {
            return false;
        }
        m2762k(iM2760i);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Object m2762k(int i5) {
        Object[] objArr = this.f5181d;
        Object obj = objArr[i5];
        int i6 = this.f5183f;
        if (i5 != i6 - 1) {
            int i7 = i5 + 1;
            System.arraycopy(objArr, i7, objArr, i5, i6 - i7);
        }
        int i8 = this.f5183f - 1;
        this.f5183f = i8;
        objArr[i8] = null;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public final void m2763l(int i5, int i6) {
        if (i6 > i5) {
            int i7 = this.f5183f;
            if (i6 < i7) {
                Object[] objArr = this.f5181d;
                System.arraycopy(objArr, i6, objArr, i5, i7 - i6);
            }
            int i8 = this.f5183f;
            int i9 = i8 - (i6 - i5);
            int i10 = i8 - 1;
            if (i9 <= i10) {
                int i11 = i9;
                while (true) {
                    this.f5181d[i11] = null;
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f5183f = i9;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2764m(int i5) {
        Object[] objArr = this.f5181d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i5, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f5181d = objArr2;
    }
}
