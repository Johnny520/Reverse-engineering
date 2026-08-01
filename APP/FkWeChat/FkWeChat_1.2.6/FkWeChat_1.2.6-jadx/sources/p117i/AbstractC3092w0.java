package p117i;

import java.util.Iterator;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p132j.AbstractC3492d;
import p215oc.C5725t;

/* JADX INFO: renamed from: i.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3092w0 {

    /* JADX INFO: renamed from: a */
    public Object[] f8235a;

    /* JADX INFO: renamed from: b */
    public int f8236b;

    /* JADX INFO: renamed from: i.w0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo27m(Object obj) {
            return obj == AbstractC3092w0.this ? "(this)" : String.valueOf(obj);
        }
    }

    public AbstractC3092w0(int i10) {
        this.f8235a = i10 == 0 ? AbstractC3094x0.f8239a : new Object[i10];
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m11582j(AbstractC3092w0 abstractC3092w0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
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
        if ((i11 & 32) != 0) {
            interfaceC0184l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        return abstractC3092w0.m11591i(charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11583a(Object obj) {
        return m11588f(obj) >= 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11584b(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!m11583a(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final Object m11585c() {
        if (m11589g()) {
            AbstractC3492d.m13018d("ObjectList is empty.");
        }
        return this.f8235a[0];
    }

    /* JADX INFO: renamed from: d */
    public final Object m11586d(int i10) {
        if (i10 < 0 || i10 >= this.f8236b) {
            m11593l(i10);
        }
        return this.f8235a[i10];
    }

    /* JADX INFO: renamed from: e */
    public final int m11587e() {
        return this.f8236b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3092w0) {
            AbstractC3092w0 abstractC3092w0 = (AbstractC3092w0) obj;
            int i10 = abstractC3092w0.f8236b;
            int i11 = this.f8236b;
            if (i10 == i11) {
                Object[] objArr = this.f8235a;
                Object[] objArr2 = abstractC3092w0.f8235a;
                C2363j c2363jM8592s = AbstractC2368o.m8592s(0, i11);
                int iM8560o = c2363jM8592s.m8560o();
                int iM8561p = c2363jM8592s.m8561p();
                if (iM8560o > iM8561p) {
                    return true;
                }
                while (AbstractC1061t.m3842c(objArr[iM8560o], objArr2[iM8560o])) {
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
    public final int m11588f(Object obj) {
        Object[] objArr = this.f8235a;
        int i10 = 0;
        if (obj == null) {
            int i11 = this.f8236b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int i12 = this.f8236b;
        while (i10 < i12) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11589g() {
        return this.f8236b == 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11590h() {
        return this.f8236b != 0;
    }

    public int hashCode() {
        Object[] objArr = this.f8235a;
        int i10 = this.f8236b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final String m11591i(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        Object[] objArr = this.f8235a;
        int i11 = this.f8236b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(charSequence3);
                break;
            }
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb2.append(charSequence4);
                break;
            }
            if (i12 != 0) {
                sb2.append(charSequence);
            }
            if (interfaceC0184l == null) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) interfaceC0184l.mo27m(obj));
            }
            i12++;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public final int m11592k(Object obj) {
        Object[] objArr = this.f8235a;
        if (obj == null) {
            for (int i10 = this.f8236b - 1; -1 < i10; i10--) {
                if (objArr[i10] == null) {
                    return i10;
                }
            }
        } else {
            for (int i11 = this.f8236b - 1; -1 < i11; i11--) {
                if (obj.equals(objArr[i11])) {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public final void m11593l(int i10) {
        StringBuilder sb2 = new StringBuilder("Index ");
        sb2.append(i10);
        sb2.append(" must be in 0..");
        sb2.append(this.f8236b - 1);
        AbstractC3492d.m13017c(sb2.toString());
    }

    public String toString() {
        return m11582j(this, null, "[", "]", 0, null, new a(), 25, null);
    }

    public /* synthetic */ AbstractC3092w0(int i10, AbstractC1043k abstractC1043k) {
        this(i10);
    }
}
