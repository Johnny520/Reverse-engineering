package p246qd;

import af.C0084g;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import p012ah.C0086a;
import p066ed.C0910c;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p302ud.C4325u;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: qd.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3506j {

    /* JADX INFO: renamed from: A */
    public static final C3504h f11376A;

    /* JADX INFO: renamed from: B */
    public static final C3504h f11377B;

    /* JADX INFO: renamed from: C */
    public static final C3504h f11378C;

    /* JADX INFO: renamed from: D */
    public static final C3504h f11379D;

    /* JADX INFO: renamed from: E */
    public static final C3504h f11380E;

    /* JADX INFO: renamed from: F */
    public static final C3504h f11381F;

    /* JADX INFO: renamed from: G */
    public static final C3504h f11382G;

    /* JADX INFO: renamed from: H */
    public static final C3504h f11383H;

    /* JADX INFO: renamed from: I */
    public static final C3504h f11384I;

    /* JADX INFO: renamed from: b */
    public static final C3503g f11385b;

    /* JADX INFO: renamed from: c */
    public static final C3503g f11386c;

    /* JADX INFO: renamed from: d */
    public static final C3503g f11387d;

    /* JADX INFO: renamed from: e */
    public static final C3503g f11388e;

    /* JADX INFO: renamed from: f */
    public static final C3503g f11389f;

    /* JADX INFO: renamed from: g */
    public static final C3503g f11390g;

    /* JADX INFO: renamed from: h */
    public static final C3503g f11391h;

    /* JADX INFO: renamed from: i */
    public static final C3503g f11392i;

    /* JADX INFO: renamed from: j */
    public static final C3503g f11393j;

    /* JADX INFO: renamed from: k */
    public static final C3501e f11394k;

    /* JADX INFO: renamed from: l */
    public static final C3501e f11395l;

    /* JADX INFO: renamed from: m */
    public static final C3501e f11396m;

    /* JADX INFO: renamed from: n */
    public static final C3501e f11397n;

    /* JADX INFO: renamed from: o */
    public static final C3501e f11398o;

    /* JADX INFO: renamed from: p */
    public static final C3501e f11399p;

    /* JADX INFO: renamed from: q */
    public static final C3501e f11400q;

    /* JADX INFO: renamed from: r */
    public static final C3501e f11401r;

    /* JADX INFO: renamed from: s */
    public static final C3497a f11402s;

    /* JADX INFO: renamed from: t */
    public static final C3505i f11403t;

    /* JADX INFO: renamed from: u */
    public static final C3504h f11404u;

    /* JADX INFO: renamed from: v */
    public static final C3504h f11405v;

    /* JADX INFO: renamed from: w */
    public static final C3504h f11406w;

    /* JADX INFO: renamed from: x */
    public static final C3497a f11407x;

    /* JADX INFO: renamed from: y */
    public static final C3504h f11408y;

    /* JADX INFO: renamed from: z */
    public static final C3504h f11409z;

    /* JADX INFO: renamed from: a */
    public int f11410a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3513q enumC3513q = EnumC3513q.INT;
        f11385b = new C3503g(enumC3513q);
        EnumC3513q enumC3513q2 = EnumC3513q.BOOLEAN;
        f11386c = new C3503g(enumC3513q2);
        EnumC3513q enumC3513q3 = EnumC3513q.BYTE;
        f11387d = new C3503g(enumC3513q3);
        EnumC3513q enumC3513q4 = EnumC3513q.SHORT;
        f11388e = new C3503g(enumC3513q4);
        EnumC3513q enumC3513q5 = EnumC3513q.CHAR;
        f11389f = new C3503g(enumC3513q5);
        EnumC3513q enumC3513q6 = EnumC3513q.FLOAT;
        f11390g = new C3503g(enumC3513q6);
        EnumC3513q enumC3513q7 = EnumC3513q.DOUBLE;
        f11391h = new C3503g(enumC3513q7);
        EnumC3513q enumC3513q8 = EnumC3513q.LONG;
        f11392i = new C3503g(enumC3513q8);
        f11393j = new C3503g(EnumC3513q.VOID);
        C3501e c3501e = new C3501e("java.lang.Object");
        f11394k = c3501e;
        f11395l = new C3501e("java.lang.Class");
        f11396m = new C3501e("java.lang.String");
        f11397n = new C3501e("java.lang.Enum");
        f11398o = new C3501e("java.lang.Throwable");
        f11399p = new C3501e("java.lang.Error");
        f11400q = new C3501e("java.lang.Exception");
        f11401r = new C3501e("java.lang.RuntimeException");
        f11402s = new C3497a(c3501e);
        f11403t = new C3505i(2, c3501e);
        C3504h c3504h = new C3504h(EnumC3513q.values());
        f11404u = c3504h;
        EnumC3513q enumC3513q9 = EnumC3513q.OBJECT;
        EnumC3513q enumC3513q10 = EnumC3513q.ARRAY;
        f11405v = new C3504h(new EnumC3513q[]{enumC3513q9, enumC3513q10});
        f11406w = new C3504h(new EnumC3513q[]{enumC3513q9});
        f11407x = new C3497a(c3504h);
        f11408y = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q6, enumC3513q2, enumC3513q4, enumC3513q3, enumC3513q5, enumC3513q9, enumC3513q10});
        f11409z = new C3504h(new EnumC3513q[]{enumC3513q2, enumC3513q, enumC3513q6, enumC3513q4, enumC3513q3, enumC3513q5});
        f11376A = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q4, enumC3513q3, enumC3513q5});
        f11377B = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q6, enumC3513q4, enumC3513q3, enumC3513q5});
        f11378C = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q4, enumC3513q3, enumC3513q6});
        f11379D = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q2, enumC3513q4, enumC3513q3, enumC3513q5});
        f11380E = new C3504h(new EnumC3513q[]{enumC3513q8, enumC3513q7});
        f11381F = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q6});
        f11382G = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q2});
        f11383H = new C3504h(new EnumC3513q[]{enumC3513q3, enumC3513q2});
        f11384I = new C3504h(new EnumC3513q[]{enumC3513q});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static AbstractC3500d m7357d(EnumC3513q enumC3513q) {
        switch (enumC3513q.ordinal()) {
            case 0:
                return f11386c;
            case 1:
                return f11389f;
            case 2:
                return f11387d;
            case 3:
                return f11388e;
            case 4:
                return f11385b;
            case 5:
                return f11390g;
            case 6:
                return f11392i;
            case 7:
                return f11391h;
            case 8:
            default:
                return f11394k;
            case 9:
                return f11402s;
            case 10:
                return f11393j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C3498b m7358e(AbstractC3506j abstractC3506j, List list) {
        if (abstractC3506j.mo7351v()) {
            return new C3498b(abstractC3506j.mo7350l(), list);
        }
        C2104o.m5294t("Expected Object as ArgType, got: ".concat(String.valueOf(abstractC3506j)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m7359u(C4325u c4325u, AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        if (abstractC3506j.equals(abstractC3506j2)) {
            return true;
        }
        if (!abstractC3506j.mo7351v() || !abstractC3506j2.mo7351v()) {
            return false;
        }
        C0910c c0910c = c4325u.f14453s;
        String strMo7350l = abstractC3506j.mo7350l();
        return c0910c.m2215d(strMo7350l).contains(abstractC3506j2.mo7350l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static AbstractC3506j m7360x(String str) {
        String strM10508b;
        strM10508b = AbstractC5798s.m10508b(str);
        strM10508b.getClass();
        switch (strM10508b) {
            case "java.lang.Class":
                return f11395l;
            case "java.lang.Exception":
                return f11400q;
            case "java.lang.Object":
                return f11394k;
            case "java.lang.String":
                return f11396m;
            case "java.lang.Throwable":
                return f11398o;
            default:
                return new C3501e(strM10508b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static C3503g m7361y(char c10) {
        if (c10 == 'F') {
            return f11390g;
        }
        if (c10 == 'S') {
            return f11388e;
        }
        if (c10 == 'V') {
            return f11393j;
        }
        if (c10 == 'Z') {
            return f11386c;
        }
        if (c10 == 'I') {
            return f11385b;
        }
        if (c10 == 'J') {
            return f11392i;
        }
        switch (c10) {
            case 'B':
                return f11387d;
            case 'C':
                return f11389f;
            case 'D':
                return f11391h;
            default:
                throw new C0084g("Unknown type char: '" + c10 + "' (0x" + Integer.toHexString(c10) + ")");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static AbstractC3506j m7362z(String str) {
        if (str == null || str.isEmpty()) {
            C0086a.m452k(AbstractC4855en.m9263g("Failed to parse type string: ", str));
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'L') {
            return m7360x(str);
        }
        if (cCharAt == 'T') {
            return new C3499c(AbstractC4855en.m9262f(1, 1, str), Collections.EMPTY_LIST);
        }
        if (cCharAt == '[') {
            return new C3497a(m7362z(str.substring(1)));
        }
        if (str.length() == 1) {
            return m7361y(cCharAt);
        }
        C0086a.m452k(AbstractC0921a.m2251n("Unknown type string: \"", str, "\""));
        return null;
    }

    /* JADX INFO: renamed from: A */
    public abstract AbstractC3506j mo7338A();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final Object m7363C(Function function) {
        List listMo7346j;
        Object objM7363C;
        AbstractC3506j abstractC3506j;
        Object objApply = function.apply(this);
        if (objApply != null) {
            return objApply;
        }
        if ((this instanceof C3497a) && (abstractC3506j = ((C3497a) this).f11365K) != null) {
            return abstractC3506j.m7363C(function);
        }
        AbstractC3506j abstractC3506jMo7356r = mo7356r();
        if (abstractC3506jMo7356r != null && (objM7363C = abstractC3506jMo7356r.m7363C(function)) != null) {
            return objM7363C;
        }
        if (!mo7354t() || (listMo7346j = mo7346j()) == null) {
            return null;
        }
        Iterator it = listMo7346j.iterator();
        while (it.hasNext()) {
            Object objM7363C2 = ((AbstractC3506j) it.next()).m7363C(function);
            if (objM7363C2 != null) {
                return objM7363C2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo7349a(EnumC3513q enumC3513q);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m7364b() {
        AbstractC3506j abstractC3506j;
        if (mo7354t() || (this instanceof C3499c)) {
            return true;
        }
        if (!(this instanceof C3497a) || (abstractC3506j = ((C3497a) this).f11365K) == null) {
            return false;
        }
        return abstractC3506j.m7364b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m7365c() {
        AbstractC3506j abstractC3506j;
        if (this instanceof C3499c) {
            return true;
        }
        AbstractC3506j abstractC3506jMo7356r = mo7356r();
        if (abstractC3506jMo7356r != null) {
            return abstractC3506jMo7356r.m7365c();
        }
        if (!mo7354t()) {
            if (!(this instanceof C3497a) || (abstractC3506j = ((C3497a) this).f11365K) == null) {
                return false;
            }
            return abstractC3506j.m7365c();
        }
        List listMo7346j = mo7346j();
        if (listMo7346j != null) {
            Iterator it = listMo7346j.iterator();
            while (it.hasNext()) {
                if (((AbstractC3506j) it.next()).m7365c()) {
                    return true;
                }
            }
        }
        AbstractC3506j abstractC3506jMo7353m = mo7353m();
        if (abstractC3506jMo7353m != null) {
            return abstractC3506jMo7353m.m7365c();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && this.f11410a == obj.hashCode() && getClass() == obj.getClass()) {
            return mo7344s(obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public int mo7339f() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public AbstractC3506j mo7340g() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public List mo7348i() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public List mo7346j() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public AbstractC3506j mo7352k() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public String mo7350l() {
        throw new UnsupportedOperationException("ArgType.getObject(), call class: ".concat(String.valueOf(getClass())));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public AbstractC3506j mo7353m() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public abstract EnumC3513q[] mo7342n();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public EnumC3513q mo7343o() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m7366p() {
        if (!(this instanceof C3503g)) {
            return !mo7345w() ? 0 : 1;
        }
        EnumC3513q enumC3513qMo7343o = mo7343o();
        return (enumC3513qMo7343o == EnumC3513q.LONG || enumC3513qMo7343o == EnumC3513q.DOUBLE) ? 2 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public int mo7355q() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public AbstractC3506j mo7356r() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo7344s(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public boolean mo7354t() {
        return this instanceof C3498b;
    }

    public abstract String toString();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public boolean mo7351v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public abstract boolean mo7345w();

    /* JADX INFO: renamed from: h */
    public AbstractC3506j mo7341h() {
        return this;
    }

    /* JADX INFO: renamed from: B */
    public void mo7347B(List list) {
    }
}
