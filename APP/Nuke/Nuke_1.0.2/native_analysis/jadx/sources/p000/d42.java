package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d42 implements Comparable {

    /* JADX INFO: renamed from: l */
    public static final ConcurrentHashMap f1862l = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: h */
    public final String f1863h;

    /* JADX INFO: renamed from: i */
    public final o43 f1864i;

    /* JADX INFO: renamed from: j */
    public final wu2 f1865j;

    /* JADX INFO: renamed from: k */
    public wu2 f1866k;

    public d42(String str, o43 o43Var, wu2 wu2Var) {
        if (str == null) {
            um2.m5516f("descriptor == null");
            throw null;
        }
        if (o43Var == null) {
            um2.m5516f("returnType == null");
            throw null;
        }
        this.f1863h = str;
        this.f1864i = o43Var;
        this.f1865j = wu2Var;
        this.f1866k = null;
    }

    /* JADX INFO: renamed from: b */
    public static d42 m959b(String str) {
        int i;
        d42 d42Var = (d42) f1862l.get(str);
        if (d42Var != null) {
            return d42Var;
        }
        int length = str.length();
        if (str.charAt(0) != '(') {
            C0676s.m4651j("bad descriptor");
            return null;
        }
        int i2 = 0;
        int i3 = 1;
        while (true) {
            if (i3 >= length) {
                i3 = 0;
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i2++;
            }
            i3++;
        }
        if (i3 == 0 || i3 == length - 1) {
            C0676s.m4651j("bad descriptor");
            return null;
        }
        if (str.indexOf(41, i3 + 1) != -1) {
            C0676s.m4651j("bad descriptor");
            return null;
        }
        o43[] o43VarArr = new o43[i2];
        int i4 = 0;
        int i5 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == ')') {
                String strSubstring = str.substring(i5 + 1);
                ConcurrentHashMap concurrentHashMap = o43.f7507m;
                try {
                    o43 o43VarM3504g = strSubstring.equals("V") ? o43.f7516v : o43.m3504g(strSubstring);
                    wu2 wu2Var = new wu2(i4);
                    for (int i6 = 0; i6 < i4; i6++) {
                        wu2Var.m2694f(i6, o43VarArr[i6]);
                    }
                    return new d42(str, o43VarM3504g, wu2Var);
                } catch (NullPointerException unused) {
                    um2.m5516f("descriptor == null");
                    return null;
                }
            }
            int i7 = i5;
            while (cCharAt2 == '[') {
                i7++;
                cCharAt2 = str.charAt(i7);
            }
            if (cCharAt2 == 'L') {
                int iIndexOf = str.indexOf(59, i7);
                if (iIndexOf == -1) {
                    C0676s.m4651j("bad descriptor");
                    return null;
                }
                i = iIndexOf + 1;
            } else {
                i = i7 + 1;
            }
            o43VarArr[i4] = o43.m3504g(str.substring(i5, i));
            i4++;
            i5 = i;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d42 d42Var) {
        if (this != d42Var) {
            o43 o43Var = d42Var.f1864i;
            wu2 wu2Var = d42Var.f1865j;
            int iCompareTo = this.f1864i.f7521h.compareTo(o43Var.f7521h);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            wu2 wu2Var2 = this.f1865j;
            int length = wu2Var2.f5590i.length;
            int length2 = wu2Var.f5590i.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo2 = ((o43) wu2Var2.m2693e(i)).f7521h.compareTo(((o43) wu2Var.m2693e(i)).f7521h);
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
    public final wu2 m961c() {
        if (this.f1866k == null) {
            wu2 wu2Var = this.f1865j;
            int length = wu2Var.f5590i.length;
            wu2 wu2Var2 = new wu2(length);
            boolean z = false;
            for (int i = 0; i < length; i++) {
                o43 o43Var = (o43) wu2Var.m2693e(i);
                int i2 = o43Var.f7522i;
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 6 || i2 == 8) {
                    o43Var = o43.f7513s;
                    z = true;
                }
                wu2Var2.m2694f(i, o43Var);
            }
            if (z) {
                wu2Var = wu2Var2;
            }
            this.f1866k = wu2Var;
        }
        return this.f1866k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d42)) {
            return false;
        }
        return this.f1863h.equals(((d42) obj).f1863h);
    }

    public final int hashCode() {
        return this.f1863h.hashCode();
    }

    public final String toString() {
        return this.f1863h;
    }
}
