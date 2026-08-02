package p000;

import java.util.Arrays;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class za2 {

    /* JADX INFO: renamed from: a */
    public final int f13811a;

    /* JADX INFO: renamed from: b */
    public final o43 f13812b;

    /* JADX INFO: renamed from: c */
    public final d63 f13813c;

    /* JADX INFO: renamed from: d */
    public final d63 f13814d;

    /* JADX INFO: renamed from: e */
    public final int f13815e;

    /* JADX INFO: renamed from: f */
    public final boolean f13816f;

    /* JADX INFO: renamed from: g */
    public final String f13817g;

    /* JADX WARN: Multi-variable type inference failed */
    public za2(int i, o43 o43Var, d63 d63Var, d63 d63Var2, int i2, boolean z, String str) {
        if (o43Var == null) {
            um2.m5516f("result == null");
            throw null;
        }
        if (d63Var == null) {
            um2.m5516f("sources == null");
            throw null;
        }
        if (d63Var2 == 0) {
            um2.m5516f("exceptions == null");
            throw null;
        }
        if (i2 < 1 || i2 > 6) {
            C0676s.m4651j(vi0.m5688g("invalid branchingness: ", i2));
            throw null;
        }
        if (((kj0) d63Var2).f5590i.length != 0 && i2 != 6) {
            C0676s.m4651j("exceptions / branchingness mismatch");
            throw null;
        }
        this.f13811a = i;
        this.f13812b = o43Var;
        this.f13813c = d63Var;
        this.f13814d = d63Var2;
        this.f13815e = i2;
        this.f13816f = z;
        this.f13817g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za2)) {
            return false;
        }
        za2 za2Var = (za2) obj;
        return this.f13811a == za2Var.f13811a && this.f13815e == za2Var.f13815e && this.f13812b == za2Var.f13812b && this.f13813c.equals(za2Var.f13813c) && this.f13814d.equals(za2Var.f13814d);
    }

    public final int hashCode() {
        return Arrays.hashCode(((kj0) this.f13814d).f5590i) + ((Arrays.hashCode(((kj0) this.f13813c).f5590i) + hk1.m2207f(this.f13812b.f7521h, ((this.f13811a * 31) + this.f13815e) * 31, 31)) * 31);
    }

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
        int i = this.f13811a;
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
                strConcat = "unknown-".concat(pp0.m3897I(i));
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
        o43 o43Var = o43.f7516v;
        o43 o43Var2 = this.f13812b;
        if (o43Var2 != o43Var) {
            sb.append(" ");
            sb.append(o43Var2);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        d63 d63Var = this.f13813c;
        int length = ((kj0) d63Var).f5590i.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(' ');
                sb.append(d63Var.getType(i2));
            }
        }
        if (this.f13816f) {
            sb.append(" call");
        }
        d63 d63Var2 = this.f13814d;
        int length2 = ((kj0) d63Var2).f5590i.length;
        if (length2 != 0) {
            sb.append(" throws");
            for (int i3 = 0; i3 < length2; i3++) {
                sb.append(' ');
                if (d63Var2.getType(i3) == o43.f7488D) {
                    sb.append("<any>");
                } else {
                    sb.append(d63Var2.getType(i3));
                }
            }
        } else {
            int i4 = this.f13815e;
            if (i4 == 1) {
                sb.append(" flows");
            } else if (i4 == 2) {
                sb.append(" returns");
            } else if (i4 == 3) {
                sb.append(" gotos");
            } else if (i4 == 4) {
                sb.append(" ifs");
            } else if (i4 != 5) {
                sb.append(" ".concat(pp0.m3897I(i4)));
            } else {
                sb.append(" switches");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public za2(int i, o43 o43Var, d63 d63Var, int i2, String str) {
        this(i, o43Var, d63Var, wu2.f12672j, i2, false, str);
    }

    public za2(int i, o43 o43Var, d63 d63Var, String str) {
        this(i, o43Var, d63Var, wu2.f12672j, 1, false, str);
    }

    public za2(int i, wu2 wu2Var, d63 d63Var) {
        this(i, o43.f7516v, wu2Var, d63Var, 6, true, null);
    }
}
