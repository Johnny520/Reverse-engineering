package p186k;

import java.util.Arrays;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.O */
/* JADX INFO: loaded from: classes.dex */
public final class C2418O implements Cloneable {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int[] f7821d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object[] f7822e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ int f7823f;

    public C2418O() {
        int i5;
        int i6 = 4;
        while (true) {
            i5 = 40;
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (40 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 4;
        this.f7821d = new int[i8];
        this.f7822e = new Object[i8];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2418O clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC1665j.m2983c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C2418O c2418o = (C2418O) objClone;
        c2418o.f7821d = (int[]) this.f7821d.clone();
        c2418o.f7822e = (Object[]) this.f7822e.clone();
        return c2418o;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4310e(int i5) {
        return AbstractC2477a.m4420a(this.f7821d, this.f7823f, i5) >= 0;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4311g(int i5) {
        Object obj;
        int iM4420a = AbstractC2477a.m4420a(this.f7821d, this.f7823f, i5);
        if (iM4420a < 0 || (obj = this.f7822e[iM4420a]) == AbstractC2434p.f7860c) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m4312h(int i5, Object obj) {
        int iM4420a = AbstractC2477a.m4420a(this.f7821d, this.f7823f, i5);
        if (iM4420a >= 0) {
            this.f7822e[iM4420a] = obj;
            return;
        }
        int i6 = ~iM4420a;
        int i7 = this.f7823f;
        if (i6 < i7) {
            Object[] objArr = this.f7822e;
            if (objArr[i6] == AbstractC2434p.f7860c) {
                this.f7821d[i6] = i5;
                objArr[i6] = obj;
                return;
            }
        }
        if (i7 >= this.f7821d.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f7821d, i11);
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f7821d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7822e, i11);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            this.f7822e = objArrCopyOf;
        }
        int i12 = this.f7823f;
        if (i12 - i6 != 0) {
            int[] iArr = this.f7821d;
            int i13 = i6 + 1;
            AbstractC0972l.m1991O(iArr, iArr, i13, i6, i12);
            Object[] objArr2 = this.f7822e;
            AbstractC0972l.m1993Q(objArr2, objArr2, i13, i6, this.f7823f);
        }
        this.f7821d[i6] = i5;
        this.f7822e[i6] = obj;
        this.f7823f++;
    }

    /* JADX INFO: renamed from: i */
    public final Object m4313i(int i5) {
        Object[] objArr = this.f7822e;
        if (i5 < objArr.length) {
            return objArr[i5];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i5 = this.f7823f;
        if (i5 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i5 * 28);
        sb.append('{');
        int i6 = this.f7823f;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(this.f7821d[i7]);
            sb.append('=');
            Object objM4313i = m4313i(i7);
            if (objM4313i != this) {
                sb.append(objM4313i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }
}
