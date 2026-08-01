package p117i;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p132j.AbstractC3492d;
import p215oc.C5725t;

/* JADX INFO: renamed from: i.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3071m {

    /* JADX INFO: renamed from: a */
    public int[] f8150a;

    /* JADX INFO: renamed from: b */
    public int f8151b;

    public AbstractC3071m(int i10) {
        this.f8150a = i10 == 0 ? AbstractC3081r.m11513a() : new int[i10];
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m11412b(AbstractC3071m abstractC3071m, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: binarySearch");
            return 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = abstractC3071m.f8151b;
        }
        return abstractC3071m.m11414a(i10, i11, i12);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m11413g(AbstractC3071m abstractC3071m, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return abstractC3071m.m11418f(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    /* JADX INFO: renamed from: a */
    public final int m11414a(int i10, int i11, int i12) {
        if (i11 < 0 || i11 >= i12 || i12 > this.f8151b) {
            AbstractC3492d.m13017c(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = this.f8150a[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11415c(int i10) {
        int[] iArr = this.f8150a;
        int i11 = this.f8151b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m11416d() {
        if (this.f8151b == 0) {
            AbstractC3492d.m13018d("IntList is empty.");
        }
        return this.f8150a[0];
    }

    /* JADX INFO: renamed from: e */
    public final int m11417e(int i10) {
        if (i10 < 0 || i10 >= this.f8151b) {
            AbstractC3492d.m13017c("Index must be between 0 and size");
        }
        return this.f8150a[i10];
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3071m) {
            AbstractC3071m abstractC3071m = (AbstractC3071m) obj;
            int i10 = abstractC3071m.f8151b;
            int i11 = this.f8151b;
            if (i10 == i11) {
                int[] iArr = this.f8150a;
                int[] iArr2 = abstractC3071m.f8150a;
                C2363j c2363jM8592s = AbstractC2368o.m8592s(0, i11);
                int iM8560o = c2363jM8592s.m8560o();
                int iM8561p = c2363jM8592s.m8561p();
                if (iM8560o > iM8561p) {
                    return true;
                }
                while (iArr[iM8560o] == iArr2[iM8560o]) {
                    if (iM8560o == iM8561p) {
                        return true;
                    }
                    iM8560o++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m11418f(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        int[] iArr = this.f8150a;
        int i11 = this.f8151b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(charSequence3);
                break;
            }
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(charSequence4);
                break;
            }
            if (i12 != 0) {
                sb2.append(charSequence);
            }
            sb2.append(i13);
            i12++;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public final int m11419h() {
        if (this.f8151b == 0) {
            AbstractC3492d.m13018d("IntList is empty.");
        }
        return this.f8150a[this.f8151b - 1];
    }

    public int hashCode() {
        int[] iArr = this.f8150a;
        int i10 = this.f8151b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return m11413g(this, null, "[", "]", 0, null, 25, null);
    }

    public /* synthetic */ AbstractC3071m(int i10, AbstractC1043k abstractC1043k) {
        this(i10);
    }
}
