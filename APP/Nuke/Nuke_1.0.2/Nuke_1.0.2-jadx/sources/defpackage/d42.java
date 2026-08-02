package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d42 implements Comparable {
    public static final ConcurrentHashMap l = new ConcurrentHashMap(10000, 0.75f);
    public final String h;
    public final o43 i;
    public final wu2 j;
    public wu2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d42(String str, o43 o43Var, wu2 wu2Var) {
        if (str == null) {
            um2.f("descriptor == null");
            throw null;
        }
        if (o43Var == null) {
            um2.f("returnType == null");
            throw null;
        }
        this.h = str;
        this.i = o43Var;
        this.j = wu2Var;
        this.k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d42 b(String str) {
        int i;
        d42 d42Var = (d42) l.get(str);
        if (d42Var != null) {
            return d42Var;
        }
        int length = str.length();
        if (str.charAt(0) != '(') {
            s.j("bad descriptor");
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
            s.j("bad descriptor");
            return null;
        }
        if (str.indexOf(41, i3 + 1) != -1) {
            s.j("bad descriptor");
            return null;
        }
        o43[] o43VarArr = new o43[i2];
        int i4 = 0;
        int i5 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == ')') {
                String strSubstring = str.substring(i5 + 1);
                ConcurrentHashMap concurrentHashMap = o43.m;
                try {
                    o43 o43VarG = strSubstring.equals("V") ? o43.v : o43.g(strSubstring);
                    wu2 wu2Var = new wu2(i4);
                    for (int i6 = 0; i6 < i4; i6++) {
                        wu2Var.f(i6, o43VarArr[i6]);
                    }
                    return new d42(str, o43VarG, wu2Var);
                } catch (NullPointerException unused) {
                    um2.f("descriptor == null");
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
                    s.j("bad descriptor");
                    return null;
                }
                i = iIndexOf + 1;
            } else {
                i = i7 + 1;
            }
            o43VarArr[i4] = o43.g(str.substring(i5, i));
            i4++;
            i5 = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d42 d42Var) {
        if (this != d42Var) {
            o43 o43Var = d42Var.i;
            wu2 wu2Var = d42Var.j;
            int iCompareTo = this.i.h.compareTo(o43Var.h);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            wu2 wu2Var2 = this.j;
            int length = wu2Var2.i.length;
            int length2 = wu2Var.i.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo2 = ((o43) wu2Var2.e(i)).h.compareTo(((o43) wu2Var.e(i)).h);
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
    public final wu2 c() {
        if (this.k == null) {
            wu2 wu2Var = this.j;
            int length = wu2Var.i.length;
            wu2 wu2Var2 = new wu2(length);
            boolean z = false;
            for (int i = 0; i < length; i++) {
                o43 o43Var = (o43) wu2Var.e(i);
                int i2 = o43Var.i;
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 6 || i2 == 8) {
                    o43Var = o43.s;
                    z = true;
                }
                wu2Var2.f(i, o43Var);
            }
            if (z) {
                wu2Var = wu2Var2;
            }
            this.k = wu2Var;
        }
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d42)) {
            return false;
        }
        return this.h.equals(((d42) obj).h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.h;
    }
}
