package p326w4;

import bsh.C0353j;
import java.util.concurrent.ConcurrentHashMap;
import p136j8.C2104o;

/* JADX INFO: renamed from: w4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4681a implements Comparable {

    /* JADX INFO: renamed from: k */
    public static final ConcurrentHashMap f15568k = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: g */
    public final String f15569g;

    /* JADX INFO: renamed from: h */
    public final C4683c f15570h;

    /* JADX INFO: renamed from: i */
    public final C4682b f15571i;

    /* JADX INFO: renamed from: j */
    public C4682b f15572j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4681a(String str, C4683c c4683c, C4682b c4682b) {
        if (str == null) {
            C0353j.m1305c("descriptor == null");
            throw null;
        }
        if (c4683c == null) {
            C0353j.m1305c("returnType == null");
            throw null;
        }
        this.f15569g = str;
        this.f15570h = c4683c;
        this.f15571i = c4682b;
        this.f15572j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C4681a m9173b(String str) {
        int i9;
        C4681a c4681a = (C4681a) f15568k.get(str);
        if (c4681a != null) {
            return c4681a;
        }
        int length = str.length();
        if (str.charAt(0) != '(') {
            C2104o.m5294t("bad descriptor");
            return null;
        }
        int i10 = 0;
        int i11 = 1;
        while (true) {
            if (i11 >= length) {
                i11 = 0;
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i10++;
            }
            i11++;
        }
        if (i11 == 0 || i11 == length - 1) {
            C2104o.m5294t("bad descriptor");
            return null;
        }
        if (str.indexOf(41, i11 + 1) != -1) {
            C2104o.m5294t("bad descriptor");
            return null;
        }
        C4683c[] c4683cArr = new C4683c[i10];
        int i12 = 0;
        int i13 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 == ')') {
                C4683c c4683cM9184o = C4683c.m9184o(str.substring(i13 + 1));
                C4682b c4682b = new C4682b(i12);
                for (int i14 = 0; i14 < i12; i14++) {
                    c4682b.m10841m(i14, c4683cArr[i14]);
                }
                return new C4681a(str, c4683cM9184o, c4682b);
            }
            int i15 = i13;
            while (cCharAt2 == '[') {
                i15++;
                cCharAt2 = str.charAt(i15);
            }
            if (cCharAt2 == 'L') {
                int iIndexOf = str.indexOf(59, i15);
                if (iIndexOf == -1) {
                    C2104o.m5294t("bad descriptor");
                    return null;
                }
                i9 = iIndexOf + 1;
            } else {
                i9 = i15 + 1;
            }
            c4683cArr[i12] = C4683c.m9182m(str.substring(i13, i9));
            i12++;
            i13 = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C4681a m9174d(String str) {
        if (str == null) {
            C0353j.m1305c("descriptor == null");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f15568k;
        C4681a c4681a = (C4681a) concurrentHashMap.get(str);
        if (c4681a != null) {
            return c4681a;
        }
        C4681a c4681aM9173b = m9173b(str);
        C4681a c4681a2 = (C4681a) concurrentHashMap.putIfAbsent(c4681aM9173b.f15569g, c4681aM9173b);
        return c4681a2 != null ? c4681a2 : c4681aM9173b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4681a c4681a) {
        if (this != c4681a) {
            C4683c c4683c = c4681a.f15570h;
            C4682b c4682b = c4681a.f15571i;
            int iCompareTo = this.f15570h.f15648g.compareTo(c4683c.f15648g);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            C4682b c4682b2 = this.f15571i;
            int length = c4682b2.f24601h.length;
            int length2 = c4682b.f24601h.length;
            int iMin = Math.min(length, length2);
            for (int i9 = 0; i9 < iMin; i9++) {
                int iCompareTo2 = ((C4683c) c4682b2.m10840l(i9)).f15648g.compareTo(((C4683c) c4682b.m10840l(i9)).f15648g);
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final C4682b m9176c() {
        if (this.f15572j == null) {
            C4682b c4682b = this.f15571i;
            int length = c4682b.f24601h.length;
            C4682b c4682b2 = new C4682b(length);
            boolean z9 = false;
            for (int i9 = 0; i9 < length; i9++) {
                C4683c c4683c = (C4683c) c4682b.m10840l(i9);
                if (c4683c.m9195s()) {
                    c4683c = C4683c.f15641t;
                    z9 = true;
                }
                c4682b2.m10841m(i9, c4683c);
            }
            if (z9) {
                c4682b = c4682b2;
            }
            this.f15572j = c4682b;
        }
        return this.f15572j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C4681a m9177e(C4683c c4683c) {
        String str = "(" + c4683c.f15648g + this.f15569g.substring(1);
        C4682b c4682b = this.f15571i;
        int length = c4682b.f24601h.length;
        C4682b c4682b2 = new C4682b(length + 1);
        c4682b2.m10841m(0, c4683c);
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 1;
            c4682b2.m10841m(i10, c4682b.f24601h[i9]);
            i9 = i10;
        }
        c4682b2.f24613g = false;
        C4681a c4681a = new C4681a(str, this.f15570h, c4682b2);
        C4681a c4681a2 = (C4681a) f15568k.putIfAbsent(str, c4681a);
        return c4681a2 != null ? c4681a2 : c4681a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4681a)) {
            return false;
        }
        return this.f15569g.equals(((C4681a) obj).f15569g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15569g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f15569g;
    }
}
