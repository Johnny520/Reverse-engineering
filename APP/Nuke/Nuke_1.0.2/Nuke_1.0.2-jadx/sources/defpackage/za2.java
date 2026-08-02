package defpackage;

import java.util.Arrays;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class za2 {
    public final int a;
    public final o43 b;
    public final d63 c;
    public final d63 d;
    public final int e;
    public final boolean f;
    public final String g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: d63 */
    /* JADX WARN: Multi-variable type inference failed */
    public za2(int i, o43 o43Var, d63 d63Var, d63 d63Var2, int i2, boolean z, String str) {
        if (o43Var == null) {
            um2.f("result == null");
            throw null;
        }
        if (d63Var == null) {
            um2.f("sources == null");
            throw null;
        }
        if (d63Var2 == 0) {
            um2.f("exceptions == null");
            throw null;
        }
        if (i2 < 1 || i2 > 6) {
            s.j(vi0.g("invalid branchingness: ", i2));
            throw null;
        }
        if (((kj0) d63Var2).i.length != 0 && i2 != 6) {
            s.j("exceptions / branchingness mismatch");
            throw null;
        }
        this.a = i;
        this.b = o43Var;
        this.c = d63Var;
        this.d = d63Var2;
        this.e = i2;
        this.f = z;
        this.g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za2)) {
            return false;
        }
        za2 za2Var = (za2) obj;
        return this.a == za2Var.a && this.e == za2Var.e && this.b == za2Var.b && this.c.equals(za2Var.c) && this.d.equals(za2Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(((kj0) this.d).i) + ((Arrays.hashCode(((kj0) this.c).i) + hk1.f(this.b.h, ((this.a * 31) + this.e) * 31, 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v64, resolved type: d63 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v66, resolved type: d63 */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder(40);
        sb.append("Rop{");
        int i = this.a;
        switch (i) {
            case 1:
                strConcat = "nop";
                break;
            case 2:
                strConcat = "move";
                break;
            case 3:
                strConcat = "move-param";
                break;
            case 4:
                strConcat = "move-exception";
                break;
            case 5:
                strConcat = "const";
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                strConcat = "goto";
                break;
            case 7:
                strConcat = "if-eq";
                break;
            case 8:
                strConcat = "if-ne";
                break;
            case 9:
                strConcat = "if-lt";
                break;
            case 10:
                strConcat = "if-ge";
                break;
            case 11:
                strConcat = "if-le";
                break;
            case 12:
                strConcat = "if-gt";
                break;
            case 13:
                strConcat = "switch";
                break;
            case 14:
                strConcat = "add";
                break;
            case 15:
                strConcat = "sub";
                break;
            case 16:
                strConcat = "mul";
                break;
            case 17:
                strConcat = "div";
                break;
            case 18:
                strConcat = "rem";
                break;
            case 19:
                strConcat = "neg";
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                strConcat = "and";
                break;
            case 21:
                strConcat = "or";
                break;
            case 22:
                strConcat = "xor";
                break;
            case 23:
                strConcat = "shl";
                break;
            case 24:
                strConcat = "shr";
                break;
            case 25:
                strConcat = "ushr";
                break;
            case 26:
                strConcat = "not";
                break;
            case 27:
                strConcat = "cmpl";
                break;
            case 28:
                strConcat = "cmpg";
                break;
            case 29:
                strConcat = "conv";
                break;
            case 30:
                strConcat = "to-byte";
                break;
            case 31:
                strConcat = "to-char";
                break;
            case 32:
                strConcat = "to-short";
                break;
            case 33:
                strConcat = "return";
                break;
            case 34:
                strConcat = "array-length";
                break;
            case 35:
                strConcat = "throw";
                break;
            case 36:
                strConcat = "monitor-enter";
                break;
            case 37:
                strConcat = "monitor-exit";
                break;
            case 38:
                strConcat = "aget";
                break;
            case 39:
                strConcat = "aput";
                break;
            case 40:
                strConcat = "new-instance";
                break;
            case 41:
                strConcat = "new-array";
                break;
            case 42:
                strConcat = "filled-new-array";
                break;
            case 43:
                strConcat = "check-cast";
                break;
            case 44:
                strConcat = "instance-of";
                break;
            case 45:
                strConcat = "get-field";
                break;
            case 46:
                strConcat = "get-static";
                break;
            case 47:
                strConcat = "put-field";
                break;
            case 48:
                strConcat = "put-static";
                break;
            case 49:
                strConcat = "invoke-static";
                break;
            case 50:
                strConcat = "invoke-virtual";
                break;
            case 51:
                strConcat = "invoke-super";
                break;
            case 52:
                strConcat = "invoke-direct";
                break;
            case 53:
                strConcat = "invoke-interface";
                break;
            case 54:
            default:
                strConcat = "unknown-".concat(pp0.I(i));
                break;
            case 55:
                strConcat = "move-result";
                break;
            case 56:
                strConcat = "move-result-pseudo";
                break;
            case 57:
                strConcat = "fill-array-data";
                break;
            case 58:
                strConcat = "invoke-polymorphic";
                break;
            case 59:
                strConcat = "invoke-custom";
                break;
        }
        sb.append(strConcat);
        o43 o43Var = o43.v;
        o43 o43Var2 = this.b;
        if (o43Var2 != o43Var) {
            sb.append(" ");
            sb.append(o43Var2);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        d63 d63Var = this.c;
        int length = ((kj0) d63Var).i.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(' ');
                sb.append(d63Var.getType(i2));
            }
        }
        if (this.f) {
            sb.append(" call");
        }
        d63 d63Var2 = this.d;
        int length2 = ((kj0) d63Var2).i.length;
        if (length2 != 0) {
            sb.append(" throws");
            for (int i3 = 0; i3 < length2; i3++) {
                sb.append(' ');
                if (d63Var2.getType(i3) == o43.D) {
                    sb.append("<any>");
                } else {
                    sb.append(d63Var2.getType(i3));
                }
            }
        } else {
            int i4 = this.e;
            if (i4 == 1) {
                sb.append(" flows");
            } else if (i4 == 2) {
                sb.append(" returns");
            } else if (i4 == 3) {
                sb.append(" gotos");
            } else if (i4 == 4) {
                sb.append(" ifs");
            } else if (i4 != 5) {
                sb.append(" ".concat(pp0.I(i4)));
            } else {
                sb.append(" switches");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public za2(int i, o43 o43Var, d63 d63Var, int i2, String str) {
        this(i, o43Var, d63Var, wu2.j, i2, false, str);
    }

    public za2(int i, o43 o43Var, d63 d63Var, String str) {
        this(i, o43Var, d63Var, wu2.j, 1, false, str);
    }

    public za2(int i, wu2 wu2Var, d63 d63Var) {
        this(i, o43.v, wu2Var, d63Var, 6, true, null);
    }
}
