package p117i;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p132j.AbstractC3492d;
import p215oc.C5725t;

/* JADX INFO: renamed from: i.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3089v {

    /* JADX INFO: renamed from: a */
    public long[] f8227a;

    /* JADX INFO: renamed from: b */
    public int f8228b;

    public AbstractC3089v(int i10) {
        this.f8227a = i10 == 0 ? AbstractC3097z.m11618a() : new long[i10];
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m11572c(AbstractC3089v abstractC3089v, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return abstractC3089v.m11574b(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    /* JADX INFO: renamed from: a */
    public final long m11573a(int i10) {
        if (i10 < 0 || i10 >= this.f8228b) {
            AbstractC3492d.m13017c("Index must be between 0 and size");
        }
        return this.f8227a[i10];
    }

    /* JADX INFO: renamed from: b */
    public final String m11574b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        long[] jArr = this.f8227a;
        int i11 = this.f8228b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(charSequence3);
                break;
            }
            long j10 = jArr[i12];
            if (i12 == i10) {
                sb2.append(charSequence4);
                break;
            }
            if (i12 != 0) {
                sb2.append(charSequence);
            }
            sb2.append(j10);
            i12++;
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3089v) {
            AbstractC3089v abstractC3089v = (AbstractC3089v) obj;
            int i10 = abstractC3089v.f8228b;
            int i11 = this.f8228b;
            if (i10 == i11) {
                long[] jArr = this.f8227a;
                long[] jArr2 = abstractC3089v.f8227a;
                C2363j c2363jM8592s = AbstractC2368o.m8592s(0, i11);
                int iM8560o = c2363jM8592s.m8560o();
                int iM8561p = c2363jM8592s.m8561p();
                if (iM8560o > iM8561p) {
                    return true;
                }
                while (jArr[iM8560o] == jArr2[iM8560o]) {
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

    public int hashCode() {
        long[] jArr = this.f8227a;
        int i10 = this.f8228b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return m11572c(this, null, "[", "]", 0, null, 25, null);
    }

    public /* synthetic */ AbstractC3089v(int i10, AbstractC1043k abstractC1043k) {
        this(i10);
    }
}
