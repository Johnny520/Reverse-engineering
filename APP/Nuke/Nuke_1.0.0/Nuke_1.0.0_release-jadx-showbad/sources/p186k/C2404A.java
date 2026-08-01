package p186k;

import com.bumptech.glide.AbstractC1926h;
import java.util.List;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0972l;
import p105V.C1480b;
import p117X2.AbstractC1665j;
import p132a3.C1804d;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2404A {

    /* JADX INFO: renamed from: a */
    public Object[] f7766a;

    /* JADX INFO: renamed from: b */
    public int f7767b;

    /* JADX INFO: renamed from: c */
    public C1480b f7768c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2404A(int i5) {
        this.f7766a = i5 == 0 ? AbstractC2413J.f7813a : new Object[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4243a(Object obj) {
        int i5 = this.f7767b + 1;
        Object[] objArr = this.f7766a;
        if (objArr.length < i5) {
            m4255m(i5, objArr);
        }
        Object[] objArr2 = this.f7766a;
        int i6 = this.f7767b;
        objArr2[i6] = obj;
        this.f7767b = i6 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4244b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i5 = this.f7767b;
        int size = list.size() + i5;
        Object[] objArr = this.f7766a;
        if (objArr.length < size) {
            m4255m(size, objArr);
        }
        Object[] objArr2 = this.f7766a;
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            objArr2[i6 + i5] = list.get(i6);
        }
        this.f7767b = list.size() + this.f7767b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4245c(C2404A c2404a) {
        AbstractC1665j.m2985e(c2404a, "elements");
        if (c2404a.m4250h()) {
            return;
        }
        int i5 = this.f7767b + c2404a.f7767b;
        Object[] objArr = this.f7766a;
        if (objArr.length < i5) {
            m4255m(i5, objArr);
        }
        AbstractC0972l.m1993Q(c2404a.f7766a, this.f7766a, this.f7767b, 0, c2404a.f7767b);
        this.f7767b += c2404a.f7767b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4246d() {
        AbstractC0972l.m1998V(this.f7766a, 0, this.f7767b);
        this.f7767b = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m4247e() {
        if (!m4250h()) {
            return this.f7766a[0];
        }
        AbstractC2477a.m4424e("ObjectList is empty.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2404A) {
            C2404A c2404a = (C2404A) obj;
            int i5 = c2404a.f7767b;
            int i6 = this.f7767b;
            if (i5 == i6) {
                Object[] objArr = this.f7766a;
                Object[] objArr2 = c2404a.f7766a;
                C1804d c1804dM3557J = AbstractC1926h.m3557J(0, i6);
                int i7 = c1804dM3557J.f6140d;
                int i8 = c1804dM3557J.f6141e;
                if (i7 > i8) {
                    return true;
                }
                while (AbstractC1665j.m2981a(objArr[i7], objArr2[i7])) {
                    if (i7 == i8) {
                        return true;
                    }
                    i7++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m4248f(int i5) {
        if (i5 >= 0 && i5 < this.f7767b) {
            return this.f7766a[i5];
        }
        m4256n(i5);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m4249g(Object obj) {
        int i5 = 0;
        if (obj == null) {
            Object[] objArr = this.f7766a;
            int i6 = this.f7767b;
            while (i5 < i6) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        Object[] objArr2 = this.f7766a;
        int i7 = this.f7767b;
        while (i5 < i7) {
            if (obj.equals(objArr2[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4250h() {
        return this.f7767b == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f7766a;
        int i5 = this.f7767b;
        int iHashCode = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj = objArr[i6];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m4251i() {
        return this.f7767b != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4252j(Object obj) {
        int iM4249g = m4249g(obj);
        if (iM4249g < 0) {
            return false;
        }
        m4253k(iM4249g);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m4253k(int i5) {
        int i6;
        if (i5 < 0 || i5 >= (i6 = this.f7767b)) {
            m4256n(i5);
            throw null;
        }
        Object[] objArr = this.f7766a;
        Object obj = objArr[i5];
        if (i5 != i6 - 1) {
            AbstractC0972l.m1993Q(objArr, objArr, i5, i5 + 1, i6);
        }
        int i7 = this.f7767b - 1;
        this.f7767b = i7;
        objArr[i7] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m4254l(int i5, int i6) {
        int i7;
        if (i5 < 0 || i5 > (i7 = this.f7767b) || i6 < 0 || i6 > i7) {
            AbstractC2477a.m4423d("Start (" + i5 + ") and end (" + i6 + ") must be in 0.." + this.f7767b);
            throw null;
        }
        if (i6 < i5) {
            AbstractC2477a.m4422c("Start (" + i5 + ") is more than end (" + i6 + ')');
            throw null;
        }
        if (i6 != i5) {
            if (i6 < i7) {
                Object[] objArr = this.f7766a;
                AbstractC0972l.m1993Q(objArr, objArr, i5, i6, i7);
            }
            int i8 = this.f7767b;
            int i9 = i8 - (i6 - i5);
            AbstractC0972l.m1998V(this.f7766a, i9, i8);
            this.f7767b = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4255m(int i5, Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i5, (length * 3) / 2)];
        AbstractC0972l.m1993Q(objArr, objArr2, 0, 0, length);
        this.f7766a = objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4256n(int i5) {
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Index ", " must be in 0..");
        sbM404o.append(this.f7767b - 1);
        AbstractC2477a.m4423d(sbM404o.toString());
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f7766a;
        int i5 = this.f7767b;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i6];
            if (i6 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i6 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i6++;
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (16 int) A[MD:(int):void (m)] (LINE:5) call: k.A.<init>(int):void type: THIS */
    public /* synthetic */ C2404A() {
        this(16);
    }
}
