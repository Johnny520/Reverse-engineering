package ne;

import be.C1116d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import me.C5164c;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p024b9.C1046l0;
import p080f9.AbstractC2368o;
import p175le.C4752a;
import p185m8.AbstractC5101q0;
import p185m8.AbstractC5106t;
import p247qe.C6420e;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: ne.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5589a implements InterfaceC5590b {

    /* JADX INFO: renamed from: e */
    public static final a f17471e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C5589a f17472f = new C5589a(new int[0], new char[0], new boolean[0], 0);

    /* JADX INFO: renamed from: a */
    public final int[] f17473a;

    /* JADX INFO: renamed from: b */
    public final char[] f17474b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f17475c;

    /* JADX INFO: renamed from: d */
    public final int f17476d;

    /* JADX INFO: renamed from: ne.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f17477a;

        /* JADX INFO: renamed from: b */
        public final char f17478b;

        /* JADX INFO: renamed from: c */
        public final int f17479c;

        public b(int i10, char c10, int i11) {
            this.f17477a = i10;
            this.f17478b = c10;
            this.f17479c = i11;
        }

        /* JADX INFO: renamed from: a */
        public final int m22683a() {
            return this.f17479c;
        }

        /* JADX INFO: renamed from: b */
        public final int m22684b() {
            return this.f17477a;
        }

        /* JADX INFO: renamed from: c */
        public final char m22685c() {
            return this.f17478b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17477a == bVar.f17477a && this.f17478b == bVar.f17478b && this.f17479c == bVar.f17479c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f17477a) * 31) + Character.hashCode(this.f17478b)) * 31) + Integer.hashCode(this.f17479c);
        }

        public String toString() {
            return "ListMarkerInfo(markerLength=" + this.f17477a + ", markerType=" + this.f17478b + ", markerIndent=" + this.f17479c + ')';
        }
    }

    /* JADX INFO: renamed from: ne.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1046l0 f17480r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ int f17481s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ String f17482t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C5589a f17483u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC0184l f17484v;

        /* JADX INFO: renamed from: ne.a$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C1046l0 f17485r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C1046l0 f17486s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ String f17487t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C1046l0 f17488u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1046l0 c1046l0, C1046l0 c1046l02, String str, C1046l0 c1046l03) {
                super(1);
                this.f17485r = c1046l0;
                this.f17486s = c1046l02;
                this.f17487t = str;
                this.f17488u = c1046l03;
            }

            /* JADX INFO: renamed from: a */
            public final Boolean m22687a(int i10) {
                boolean z10;
                int i11;
                int i12 = this.f17485r.f3205q;
                int i13 = this.f17486s.f3205q;
                while (true) {
                    z10 = true;
                    if (this.f17485r.f3205q >= i10 || this.f17486s.f3205q >= this.f17487t.length()) {
                        break;
                    }
                    char cCharAt = this.f17487t.charAt(this.f17486s.f3205q);
                    if (cCharAt != ' ') {
                        if (cCharAt != '\t') {
                            break;
                        }
                        i11 = 4 - (this.f17488u.f3205q % 4);
                    } else {
                        i11 = 1;
                    }
                    this.f17485r.f3205q += i11;
                    this.f17488u.f3205q += i11;
                    this.f17486s.f3205q++;
                }
                if (this.f17486s.f3205q == this.f17487t.length()) {
                    this.f17485r.f3205q = Integer.MAX_VALUE;
                }
                C1046l0 c1046l0 = this.f17485r;
                int i14 = c1046l0.f3205q;
                if (i10 <= i14) {
                    c1046l0.f3205q = i14 - i10;
                } else {
                    this.f17486s.f3205q = i13;
                    c1046l0.f3205q = i12;
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                return m22687a(((Number) obj).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1046l0 c1046l0, int i10, String str, C5589a c5589a, InterfaceC0184l interfaceC0184l) {
            super(1);
            this.f17480r = c1046l0;
            this.f17481s = i10;
            this.f17482t = str;
            this.f17483u = c5589a;
            this.f17484v = interfaceC0184l;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5589a mo27m(C5589a c5589a) {
            Integer num;
            C5589a c5589aM22681b;
            c5589a.getClass();
            if (this.f17480r.f3205q < this.f17481s) {
                C1046l0 c1046l0 = new C1046l0();
                c1046l0.f3205q = AbstractC5591c.m22694f(c5589a, this.f17482t);
                a aVar = new a(new C1046l0(), c1046l0, this.f17482t, new C1046l0());
                if (this.f17483u.mo22669b()[this.f17480r.f3205q] == '>') {
                    num = (Integer) this.f17484v.mo27m(Integer.valueOf(c1046l0.f3205q));
                    if (num != null) {
                        c1046l0.f3205q += num.intValue();
                        this.f17480r.f3205q++;
                    }
                } else {
                    num = null;
                }
                int i10 = this.f17480r.f3205q;
                while (this.f17480r.f3205q < this.f17481s && this.f17483u.mo22669b()[this.f17480r.f3205q] != '>') {
                    int[] iArr = this.f17483u.f17473a;
                    int i11 = this.f17480r.f3205q;
                    if (!((Boolean) aVar.mo27m(Integer.valueOf(iArr[i11] - (i11 == 0 ? 0 : this.f17483u.f17473a[this.f17480r.f3205q - 1])))).booleanValue()) {
                        break;
                    }
                    this.f17480r.f3205q++;
                }
                if (num != null) {
                    c5589aM22681b = C5589a.f17471e.m22681b(c5589a, (((Boolean) aVar.mo27m(1)).booleanValue() ? 1 : 0) + num.intValue(), '>', true, c1046l0.f3205q);
                } else {
                    c5589aM22681b = c5589a;
                }
                int i12 = this.f17480r.f3205q;
                C5589a c5589aM22681b2 = c5589aM22681b;
                while (i10 < i12) {
                    c5589aM22681b2 = C5589a.f17471e.m22681b(c5589aM22681b2, this.f17483u.f17473a[i10] - (i10 == 0 ? 0 : this.f17483u.f17473a[i10 - 1]), this.f17483u.mo22669b()[i10], false, c1046l0.f3205q);
                    i10++;
                }
                return c5589aM22681b2;
            }
            return c5589a;
        }
    }

    /* JADX INFO: renamed from: ne.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ String f17489r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.f17489r = str;
        }

        /* JADX INFO: renamed from: a */
        public final Integer m22688a(int i10) {
            int i11 = 0;
            while (i11 < 3 && i10 < this.f17489r.length() && this.f17489r.charAt(i10) == ' ') {
                i11++;
                i10++;
            }
            if (i10 >= this.f17489r.length() || this.f17489r.charAt(i10) != '>') {
                return null;
            }
            return Integer.valueOf(i11 + 1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m22688a(((Number) obj).intValue());
        }
    }

    public C5589a(int[] iArr, char[] cArr, boolean[] zArr, int i10) {
        iArr.getClass();
        cArr.getClass();
        zArr.getClass();
        this.f17473a = iArr;
        this.f17474b = cArr;
        this.f17475c = zArr;
        this.f17476d = i10;
    }

    @Override // ne.InterfaceC5590b
    /* JADX INFO: renamed from: a */
    public int mo22668a() {
        Integer numM20681B0 = AbstractC5106t.m20681B0(this.f17473a);
        if (numM20681B0 != null) {
            return numM20681B0.intValue();
        }
        return 0;
    }

    @Override // ne.InterfaceC5590b
    /* JADX INFO: renamed from: b */
    public char[] mo22669b() {
        return this.f17474b;
    }

    @Override // ne.InterfaceC5590b
    /* JADX INFO: renamed from: c */
    public boolean mo22670c(int i10) {
        Iterable iterableM8592s = AbstractC2368o.m8592s(0, i10);
        if ((iterableM8592s instanceof Collection) && ((Collection) iterableM8592s).isEmpty()) {
            return false;
        }
        Iterator it = iterableM8592s.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC5101q0) it).nextInt();
            if (mo22669b()[iNextInt] != '>' && mo22673f()[iNextInt]) {
                return true;
            }
        }
        return false;
    }

    @Override // ne.InterfaceC5590b
    /* JADX INFO: renamed from: f */
    public boolean[] mo22673f() {
        return this.f17475c;
    }

    @Override // ne.InterfaceC5590b
    /* JADX INFO: renamed from: g */
    public int mo22674g() {
        return this.f17476d;
    }

    @Override // ne.InterfaceC5590b
    /* JADX INFO: renamed from: h */
    public boolean mo22675h(InterfaceC5590b interfaceC5590b) {
        interfaceC5590b.getClass();
        if (!(interfaceC5590b instanceof C5589a)) {
            return false;
        }
        int length = this.f17473a.length;
        int length2 = ((C5589a) interfaceC5590b).f17473a.length;
        if (length < length2) {
            return false;
        }
        Iterable iterableM8592s = AbstractC2368o.m8592s(0, length2);
        if ((iterableM8592s instanceof Collection) && ((Collection) iterableM8592s).isEmpty()) {
            return true;
        }
        Iterator it = iterableM8592s.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC5101q0) it).nextInt();
            if (mo22669b()[iNextInt] != interfaceC5590b.mo22669b()[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    @Override // ne.InterfaceC5590b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5589a mo22671d(C5164c.a aVar) {
        C5589a c5589aM22679q = null;
        if (aVar != null && aVar.m21192i() != -1) {
            if (C6420e.f20215b.m25444a(aVar.m21186c(), aVar.m21192i())) {
                return null;
            }
            c5589aM22679q = m22679q(aVar);
            if (c5589aM22679q == null) {
                return m22678p(aVar);
            }
        }
        return c5589aM22679q;
    }

    @Override // ne.InterfaceC5590b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C5589a mo22672e(C5164c.a aVar) {
        if (aVar == null) {
            return mo9935o();
        }
        C4752a c4752a = C4752a.f14072a;
        if (!(aVar.m21192i() == -1)) {
            throw new C1116d("given " + aVar);
        }
        String strM21186c = aVar.m21186c();
        c cVar = new c(new C1046l0(), this.f17473a.length, strM21186c, this, new d(strM21186c));
        C5589a c5589aMo9935o = mo9935o();
        while (true) {
            C5589a c5589a = (C5589a) cVar.mo27m(c5589aMo9935o);
            if (AbstractC1061t.m3842c(c5589a, c5589aMo9935o)) {
                return c5589aMo9935o;
            }
            c5589aMo9935o = c5589a;
        }
    }

    /* JADX INFO: renamed from: m */
    public C5589a mo9933m(int[] iArr, char[] cArr, boolean[] zArr, int i10) {
        iArr.getClass();
        cArr.getClass();
        zArr.getClass();
        return new C5589a(iArr, cArr, zArr, i10);
    }

    /* JADX INFO: renamed from: n */
    public b mo9934n(C5164c.a aVar) {
        char cCharAt;
        aVar.getClass();
        char cM21185b = aVar.m21185b();
        if (cM21185b == '*' || cM21185b == '-' || cM21185b == '+') {
            return new b(1, cM21185b, 1);
        }
        String strM21186c = aVar.m21186c();
        int iM21192i = aVar.m21192i();
        while (iM21192i < strM21186c.length() && '0' <= (cCharAt = strM21186c.charAt(iM21192i)) && cCharAt < ':') {
            iM21192i++;
        }
        if (iM21192i <= aVar.m21192i() || iM21192i - aVar.m21192i() > 9 || iM21192i >= strM21186c.length()) {
            return null;
        }
        if (strM21186c.charAt(iM21192i) != '.' && strM21186c.charAt(iM21192i) != ')') {
            return null;
        }
        int i10 = iM21192i + 1;
        return new b(i10 - aVar.m21192i(), strM21186c.charAt(iM21192i), i10 - aVar.m21192i());
    }

    /* JADX INFO: renamed from: o */
    public C5589a mo9935o() {
        return f17472f;
    }

    /* JADX INFO: renamed from: p */
    public final C5589a m22678p(C5164c.a aVar) {
        int i10;
        String strM21186c = aVar.m21186c();
        int iM21192i = aVar.m21192i();
        int i11 = 0;
        int i12 = 0;
        while (iM21192i < strM21186c.length() && strM21186c.charAt(iM21192i) == ' ' && i12 < 3) {
            i12++;
            iM21192i++;
        }
        if (iM21192i == strM21186c.length() || strM21186c.charAt(iM21192i) != '>') {
            return null;
        }
        int i13 = iM21192i + 1;
        if (i13 >= strM21186c.length() || strM21186c.charAt(i13) == ' ' || strM21186c.charAt(i13) == '\t') {
            if (i13 < strM21186c.length()) {
                i13 = iM21192i + 2;
            }
            i10 = i13;
            i11 = 1;
        } else {
            i10 = i13;
        }
        return f17471e.m22681b(this, i12 + 1 + i11, '>', true, i10);
    }

    /* JADX INFO: renamed from: q */
    public final C5589a m22679q(C5164c.a aVar) {
        String strM21186c = aVar.m21186c();
        int iM21192i = aVar.m21192i();
        int i10 = 0;
        int iMo22668a = (iM21192i <= 0 || strM21186c.charAt(iM21192i + (-1)) != '\t') ? 0 : (4 - (mo22668a() % 4)) % 4;
        while (iM21192i < strM21186c.length() && strM21186c.charAt(iM21192i) == ' ' && iMo22668a < 3) {
            iMo22668a++;
            iM21192i++;
        }
        if (iM21192i == strM21186c.length()) {
            return null;
        }
        C5164c.a aVarM21196m = aVar.m21196m(iM21192i - aVar.m21192i());
        aVarM21196m.getClass();
        b bVarMo9934n = mo9934n(aVarM21196m);
        if (bVarMo9934n == null) {
            return null;
        }
        int iM22684b = iM21192i + bVarMo9934n.m22684b();
        int i11 = iM22684b;
        while (i11 < strM21186c.length()) {
            char cCharAt = strM21186c.charAt(i11);
            if (cCharAt != ' ') {
                if (cCharAt != '\t') {
                    break;
                }
                i10 += 4 - (i10 % 4);
            } else {
                i10++;
            }
            i11++;
        }
        if (1 <= i10 && i10 < 5 && i11 < strM21186c.length()) {
            return f17471e.m22681b(this, iMo22668a + bVarMo9934n.m22683a() + i10, bVarMo9934n.m22685c(), true, i11);
        }
        if ((i10 < 5 || i11 >= strM21186c.length()) && i11 != strM21186c.length()) {
            return null;
        }
        return f17471e.m22681b(this, iMo22668a + bVarMo9934n.m22683a() + 1, bVarMo9934n.m22685c(), true, Math.min(i11, iM22684b + 1));
    }

    public String toString() {
        return "MdConstraints: " + AbstractC8611a0.m33076w(mo22669b()) + '(' + mo22668a() + ')';
    }

    /* JADX INFO: renamed from: ne.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final C5589a m22681b(C5589a c5589a, int i10, char c10, boolean z10, int i11) {
            int length = c5589a.f17473a.length;
            int i12 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(c5589a.f17473a, i12);
            char[] cArrCopyOf = Arrays.copyOf(c5589a.mo22669b(), i12);
            boolean[] zArrCopyOf = Arrays.copyOf(c5589a.mo22673f(), i12);
            iArrCopyOf[length] = c5589a.mo22668a() + i10;
            cArrCopyOf[length] = c10;
            zArrCopyOf[length] = z10;
            return c5589a.mo9933m(iArrCopyOf, cArrCopyOf, zArrCopyOf, i11);
        }

        /* JADX INFO: renamed from: c */
        public final C5589a m22682c() {
            return C5589a.f17472f;
        }

        public a() {
        }
    }
}
