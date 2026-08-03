package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: j.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0166q {

    /* JADX INFO: renamed from: a */
    private final int f515a;

    /* JADX INFO: renamed from: b */
    private final C0195c f516b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0197e f517c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0197e f518d;

    /* JADX INFO: renamed from: e */
    private final int f519e;

    /* JADX INFO: renamed from: f */
    private final boolean f520f;

    /* JADX INFO: renamed from: g */
    private final String f521g;

    public C0166q(int i2, C0194b c0194b, C0194b c0194b2) {
        this(i2, C0195c.f770o, c0194b, c0194b2, 6, true, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m411a() {
        return ((AbstractC0203e) this.f518d).m504B() != 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m412b() {
        return this.f519e;
    }

    /* JADX INFO: renamed from: c */
    public final String m413c() {
        String str = this.f521g;
        return str != null ? str : toString();
    }

    /* JADX INFO: renamed from: d */
    public final int m414d() {
        return this.f515a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m415e() {
        return this.f520f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0166q)) {
            return false;
        }
        C0166q c0166q = (C0166q) obj;
        return this.f515a == c0166q.f515a && this.f519e == c0166q.f519e && this.f516b == c0166q.f516b && this.f517c.equals(c0166q.f517c) && this.f518d.equals(c0166q.f518d);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m416f() {
        int i2 = this.f515a;
        if (i2 == 14 || i2 == 16) {
            return true;
        }
        switch (i2) {
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return false;
        }
    }

    public final int hashCode() {
        return this.f518d.hashCode() + ((this.f517c.hashCode() + ((this.f516b.hashCode() + (((this.f515a * 31) + this.f519e) * 31)) * 31)) * 31);
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
        int i2 = this.f515a;
        switch (i2) {
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
            case 6:
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
            case 20:
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
                strConcat = "unknown-".concat(RuntimeDexGenerator.m10p(i2));
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
        C0195c c0195c = C0195c.f770o;
        C0195c c0195c2 = this.f516b;
        if (c0195c2 != c0195c) {
            sb.append(" ");
            sb.append(c0195c2);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        InterfaceC0197e interfaceC0197e = this.f517c;
        int iM504B = ((AbstractC0203e) interfaceC0197e).m504B();
        if (iM504B == 0) {
            sb.append(" .");
        } else {
            for (int i3 = 0; i3 < iM504B; i3++) {
                sb.append(' ');
                sb.append(interfaceC0197e.mo403b(i3));
            }
        }
        if (this.f520f) {
            sb.append(" call");
        }
        InterfaceC0197e interfaceC0197e2 = this.f518d;
        int iM504B2 = ((AbstractC0203e) interfaceC0197e2).m504B();
        if (iM504B2 != 0) {
            sb.append(" throws");
            for (int i4 = 0; i4 < iM504B2; i4++) {
                sb.append(' ');
                if (interfaceC0197e2.mo403b(i4) == C0195c.f778w) {
                    sb.append("<any>");
                } else {
                    sb.append(interfaceC0197e2.mo403b(i4));
                }
            }
        } else {
            int i5 = this.f519e;
            sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? " ".concat(RuntimeDexGenerator.m10p(i5)) : " switches" : " ifs" : " gotos" : " returns" : " flows");
        }
        sb.append('}');
        return sb.toString();
    }

    public C0166q(int i2, C0195c c0195c, C0194b c0194b, int i3, String str) {
        this(i2, c0195c, c0194b, C0194b.f722c, i3, false, str);
    }

    public C0166q(int i2, C0195c c0195c, C0194b c0194b, String str) {
        this(i2, c0195c, c0194b, C0194b.f722c, 1, false, str);
    }

    public C0166q(int i2, C0195c c0195c, C0194b c0194b, C0194b c0194b2, int i3, boolean z, String str) {
        if (c0195c == null) {
            throw new NullPointerException("result == null");
        }
        if (c0194b == null) {
            throw new NullPointerException("sources == null");
        }
        if (c0194b2 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i3 < 1 || i3 > 6) {
            throw new IllegalArgumentException("invalid branchingness: " + i3);
        }
        if (c0194b2.m504B() != 0 && i3 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f515a = i2;
        this.f516b = c0195c;
        this.f517c = c0194b;
        this.f518d = c0194b2;
        this.f519e = i3;
        this.f520f = z;
        this.f521g = str;
    }

    public C0166q(int i2, C0195c c0195c, C0194b c0194b, C0194b c0194b2, String str) {
        this(i2, c0195c, c0194b, c0194b2, 6, false, str);
    }
}
