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

    public C0166q(int r9, C0194b r10, C0194b r11) {
        this(r9, C0195c.f770o, r10, r11, 6, true, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m411a() {
        if (((AbstractC0203e) this.f518d).m504B() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m412b() {
        return this.f519e;
    }

    /* JADX INFO: renamed from: c */
    public final String m413c() {
        String r0 = this.f521g;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return toString();
    }

    /* JADX INFO: renamed from: d */
    public final int m414d() {
        return this.f515a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m415e() {
        return this.f520f;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0166q) == true) goto L8;
        return false;
    L8:
        C0166q r52 = (C0166q) r5;
        int r1 = r52.f515a;
        if (this.f515a != r1) goto L20;
        if (this.f519e != r52.f519e) goto L20;
        if (this.f516b != r52.f516b) goto L20;
        if (this.f517c.equals(r52.f517c) == false) goto L20;
        if (this.f518d.equals(r52.f518d) == false) goto L20;
        return true;
    L20:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m416f() {
        int r1 = this.f515a;
        if (r1 != 14) goto L5;
        return true;
    L5:
        if (r1 == 16) goto L11;
        switch(r1) {
            case 20: goto L12;
            case 21: goto L12;
            case 22: goto L12;
            default: goto L7;
        };
    L7:
        return false;
    L12:
        return true;
    L11:
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.f515a * 31) + this.f519e) * 31;
        int r1 = (this.f516b.hashCode() + r0) * 31;
        int r02 = (this.f517c.hashCode() + r1) * 31;
        return this.f518d.hashCode() + r02;
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
        StringBuilder r0 = new StringBuilder(40);
        r0.append("Rop{");
        int r1 = this.f515a;
        switch(r1) {
            case 1: goto L62;
            case 2: goto L61;
            case 3: goto L60;
            case 4: goto L59;
            case 5: goto L58;
            case 6: goto L57;
            case 7: goto L56;
            case 8: goto L55;
            case 9: goto L54;
            case 10: goto L53;
            case 11: goto L52;
            case 12: goto L51;
            case 13: goto L50;
            case 14: goto L49;
            case 15: goto L48;
            case 16: goto L47;
            case 17: goto L46;
            case 18: goto L45;
            case 19: goto L44;
            case 20: goto L43;
            case 21: goto L42;
            case 22: goto L41;
            case 23: goto L40;
            case 24: goto L39;
            case 25: goto L38;
            case 26: goto L37;
            case 27: goto L36;
            case 28: goto L35;
            case 29: goto L34;
            case 30: goto L33;
            case 31: goto L32;
            case 32: goto L31;
            case 33: goto L30;
            case 34: goto L29;
            case 35: goto L28;
            case 36: goto L27;
            case 37: goto L26;
            case 38: goto L25;
            case 39: goto L24;
            case 40: goto L23;
            case 41: goto L22;
            case 42: goto L21;
            case 43: goto L20;
            case 44: goto L19;
            case 45: goto L18;
            case 46: goto L17;
            case 47: goto L16;
            case 48: goto L15;
            case 49: goto L14;
            case 50: goto L13;
            case 51: goto L12;
            case 52: goto L11;
            case 53: goto L10;
            case 54: goto L4;
            case 55: goto L9;
            case 56: goto L8;
            case 57: goto L7;
            case 58: goto L6;
            case 59: goto L5;
            default: goto L4;
        };
    L4:
        String r12 = "unknown-".concat(RuntimeDexGenerator.m10p(r1));
    L63:
        r0.append(r12);
        C0195c r13 = C0195c.f770o;
        C0195c r4 = this.f516b;
        if (r4 == r13) goto L66;
        r0.append(" ");
        r0.append(r4);
    L67:
        r0.append(" <-");
        InterfaceC0197e r14 = this.f517c;
        int r42 = ((AbstractC0203e) r14).m504B();
        int r6 = 0;
        if (r42 != 0) goto L70;
        r0.append(" .");
    L74:
        if (this.f520f == false) goto L76;
        r0.append(" call");
    L76:
        InterfaceC0197e r15 = this.f518d;
        int r3 = ((AbstractC0203e) r15).m504B();
        if (r3 == 0) goto L85;
        r0.append(" throws");
    L79:
        if (r6 >= r3) goto L102;
        r0.append(' ');
        if (r15.mo403b(r6) != C0195c.f778w) goto L83;
        r0.append("<any>");
    L84:
        r6 = r6 + 1;
        goto L79
    L83:
        r0.append(r15.mo403b(r6));
    L102:
        r0.append('}');
        return r0.toString();
    L85:
        int r32 = this.f519e;
        if (r32 != 1) goto L88;
        String r16 = " flows";
    L101:
        r0.append(r16);
        goto L102
    L88:
        if (r32 != 2) goto L90;
        r16 = " returns";
        goto L101
    L90:
        if (r32 != 3) goto L92;
        r16 = " gotos";
        goto L101
    L92:
        if (r32 != 4) goto L94;
        r16 = " ifs";
        goto L101
    L94:
        if (r32 == 5) goto L96;
        r16 = " ".concat(RuntimeDexGenerator.m10p(r32));
        goto L101
    L96:
        r16 = " switches";
        goto L101
    L70:
        int r33 = 0;
    L71:
        if (r33 >= r42) goto L74;
        r0.append(' ');
        r0.append(r14.mo403b(r33));
        r33 = r33 + 1;
        goto L71
    L66:
        r0.append(" .");
        goto L67
    L5:
        r12 = "invoke-custom";
        goto L63
    L6:
        r12 = "invoke-polymorphic";
        goto L63
    L7:
        r12 = "fill-array-data";
        goto L63
    L8:
        r12 = "move-result-pseudo";
        goto L63
    L9:
        r12 = "move-result";
        goto L63
    L10:
        r12 = "invoke-interface";
        goto L63
    L11:
        r12 = "invoke-direct";
        goto L63
    L12:
        r12 = "invoke-super";
        goto L63
    L13:
        r12 = "invoke-virtual";
        goto L63
    L14:
        r12 = "invoke-static";
        goto L63
    L15:
        r12 = "put-static";
        goto L63
    L16:
        r12 = "put-field";
        goto L63
    L17:
        r12 = "get-static";
        goto L63
    L18:
        r12 = "get-field";
        goto L63
    L19:
        r12 = "instance-of";
        goto L63
    L20:
        r12 = "check-cast";
        goto L63
    L21:
        r12 = "filled-new-array";
        goto L63
    L22:
        r12 = "new-array";
        goto L63
    L23:
        r12 = "new-instance";
        goto L63
    L24:
        r12 = "aput";
        goto L63
    L25:
        r12 = "aget";
        goto L63
    L26:
        r12 = "monitor-exit";
        goto L63
    L27:
        r12 = "monitor-enter";
        goto L63
    L28:
        r12 = "throw";
        goto L63
    L29:
        r12 = "array-length";
        goto L63
    L30:
        r12 = "return";
        goto L63
    L31:
        r12 = "to-short";
        goto L63
    L32:
        r12 = "to-char";
        goto L63
    L33:
        r12 = "to-byte";
        goto L63
    L34:
        r12 = "conv";
        goto L63
    L35:
        r12 = "cmpg";
        goto L63
    L36:
        r12 = "cmpl";
        goto L63
    L37:
        r12 = "not";
        goto L63
    L38:
        r12 = "ushr";
        goto L63
    L39:
        r12 = "shr";
        goto L63
    L40:
        r12 = "shl";
        goto L63
    L41:
        r12 = "xor";
        goto L63
    L42:
        r12 = "or";
        goto L63
    L43:
        r12 = "and";
        goto L63
    L44:
        r12 = "neg";
        goto L63
    L45:
        r12 = "rem";
        goto L63
    L46:
        r12 = "div";
        goto L63
    L47:
        r12 = "mul";
        goto L63
    L48:
        r12 = "sub";
        goto L63
    L49:
        r12 = "add";
        goto L63
    L50:
        r12 = "switch";
        goto L63
    L51:
        r12 = "if-gt";
        goto L63
    L52:
        r12 = "if-le";
        goto L63
    L53:
        r12 = "if-ge";
        goto L63
    L54:
        r12 = "if-lt";
        goto L63
    L55:
        r12 = "if-ne";
        goto L63
    L56:
        r12 = "if-eq";
        goto L63
    L57:
        r12 = "goto";
        goto L63
    L58:
        r12 = "const";
        goto L63
    L59:
        r12 = "move-exception";
        goto L63
    L60:
        r12 = "move-param";
        goto L63
    L61:
        r12 = "move";
        goto L63
    L62:
        r12 = "nop";
        goto L63
    }

    public C0166q(int r9, C0195c r10, C0194b r11, int r12, String r13) {
        this(r9, r10, r11, C0194b.f722c, r12, false, r13);
    }

    public C0166q(int r9, C0195c r10, C0194b r11, String r12) {
        this(r9, r10, r11, C0194b.f722c, 1, false, r12);
    }

    public C0166q(int r3, C0195c r4, C0194b r5, C0194b r6, int r7, boolean r8, String r9) {
        if (r4 == null) goto L25;
        if (r5 == null) goto L23;
        if (r6 == null) goto L21;
        if (r7 < 1) goto L19;
        if (r7 > 6) goto L19;
        if (r6.m504B() == 0) goto L16;
        if (r7 == 6) goto L16;
        throw new IllegalArgumentException("exceptions / branchingness mismatch");
    L16:
        this.f515a = r3;
        this.f516b = r4;
        this.f517c = r5;
        this.f518d = r6;
        this.f519e = r7;
        this.f520f = r8;
        this.f521g = r9;
        return;
    L19:
        throw new IllegalArgumentException("invalid branchingness: " + r7);
    L21:
        throw new NullPointerException("exceptions == null");
    L23:
        throw new NullPointerException("sources == null");
    L25:
        throw new NullPointerException("result == null");
    }

    public C0166q(int r9, C0195c r10, C0194b r11, C0194b r12, String r13) {
        this(r9, r10, r11, r12, 6, false, r13);
    }
}
