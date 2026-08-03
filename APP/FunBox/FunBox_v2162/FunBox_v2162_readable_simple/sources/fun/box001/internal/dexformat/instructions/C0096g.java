package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.C0032i;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0187q;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;
import fun.box001.internal.error.DexGenerationException;
import java.util.Iterator;

/* JADX INFO: renamed from: g.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0096g extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final C0187q f357e;

    /* JADX INFO: renamed from: f */
    private final C0032i f358f;

    /* JADX INFO: renamed from: g */
    private C0092c f359g;

    /* JADX INFO: renamed from: h */
    private final boolean f360h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC0197e f361i;

    /* JADX INFO: renamed from: j */
    private C0099j f362j;

    public C0096g(C0187q r3, C0032i r4, boolean r5, C0194b r6) {
        super(4, -1);
        if (r3 == null) goto L13;
        if (r4 == null) goto L11;
        if (r6 == null) goto L9;
        this.f357e = r3;
        this.f358f = r4;
        this.f360h = r5;
        this.f361i = r6;
        this.f359g = null;
        this.f362j = null;
        return;
    L9:
        throw new NullPointerException("throwsList == null");
    L11:
        throw new NullPointerException("code == null");
    L13:
        throw new NullPointerException("ref == null");
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r7) {
        C0079B r0 = r7.m293c();
        C0113x r1 = r7.m307q();
        C0032i r2 = this.f358f;
        if (r2.m130k() == false) goto L5;
    L6:
        C0099j r3 = new C0099j(r2, this.f360h, this.f357e);
        this.f362j = r3;
        r0.m229o(r3);
    L8:
        if (r2.m128i() == false) goto L14;
        Iterator r02 = r2.m122c().iterator();
    L11:
        if (r02.hasNext() == false) goto L13;
        r1.m335x((C0195c) r02.next());
        goto L11
    L13:
        this.f359g = new C0092c(r2);
    L14:
        Iterator r03 = r2.m124e().iterator();
    L16:
        if (r03.hasNext() == false) goto L18;
        r7.m310t((AbstractC0171a) r03.next());
        goto L16
    L18:
        return;
    L5:
        if (r2.m129j() == false) goto L8;
        goto L6
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f417m;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E r2, int r3) {
        C0100k r22 = r2.m246d();
        C0095f r32 = new C0095f(r22);
        C0032i r0 = this.f358f;
        r0.m121a(r32);
        C0092c r33 = this.f359g;
        if (r33 == null) goto L5;
        r33.m264a(r22);
        int r23 = this.f359g.m266d();
    L6:
        int r34 = r0.m125f().m147F();
        if ((r34 & 1) == 0) goto L9;
        r34 = r34 + 1;
    L9:
        m240k(((r34 * 2) + 16) + r23);
        return;
    L5:
        r23 = 0;
        goto L6
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
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k r19, C0202d r20) {
        boolean r2 = r20.m486d();
        C0032i r3 = this.f358f;
        int r4 = r3.m125f().m149H();
        int r5 = r3.m125f().m148G();
        C0187q r6 = this.f357e;
        int r7 = r6.m430i(this.f360h);
        int r8 = r3.m125f().m147F();
        if ((r8 & 1) == 0) goto L5;
        boolean r9 = true;
    L6:
        C0092c r11 = this.f359g;
        if (r11 != null) goto L9;
        int r112 = 0;
    L10:
        C0099j r12 = this.f362j;
        if (r12 != null) goto L13;
        int r122 = 0;
    L15:
        if (r2 == false) goto L29;
        r20.m484b(0, m237h() + ' ' + r6.mo107a());
        r20.m484b(2, "  registers_size: ".concat(RuntimeDexGenerator.m11q(r4)));
        r20.m484b(2, "  ins_size:       ".concat(RuntimeDexGenerator.m11q(r7)));
        r20.m484b(2, "  outs_size:      ".concat(RuntimeDexGenerator.m11q(r5)));
        r20.m484b(2, "  tries_size:     ".concat(RuntimeDexGenerator.m11q(r112)));
        r20.m484b(4, "  debug_off:      ".concat(RuntimeDexGenerator.m13s(r122)));
        r20.m484b(4, "  insns_size:     ".concat(RuntimeDexGenerator.m13s(r8)));
        InterfaceC0197e r13 = this.f361i;
        AbstractC0203e r14 = (AbstractC0203e) r13;
        if (r14.m504B() == 0) goto L29;
        StringBuilder r15 = new StringBuilder("  throws ");
        int r10 = r14.m504B();
        if (r10 != 0) goto L21;
        String r102 = "<empty>";
        C0187q r16 = r6;
    L28:
        r15.append(r102);
        r20.m484b(0, r15.toString());
    L30:
        r20.m498r(r4);
        r20.m498r(r7);
        r20.m498r(r5);
        r20.m498r(r112);
        r20.m497q(r122);
        r20.m497q(r8);
        r3.m125f().m150J(r20);     // Catch: RuntimeException -> L46
        if (this.f359g == null) goto L40;
        if (r9 == false) goto L38;
        if (r2 == false) goto L37;
        r20.m484b(2, "  padding: 0");
    L37:
        int r32 = 0;
        r20.m498r(0);
    L39:
        this.f359g.m267e(r20);
    L41:
        if (r2 == true) goto L43;
        return;
    L43:
        if (this.f362j == null) goto L55;
        r20.m484b(r32, "  debug info");
        this.f362j.m290m(r19, r20);
        return;
    L55:
        return;
    L38:
        r32 = 0;
        goto L39
    L40:
        r32 = 0;
    L46:
        e = move-exception;
        throw DexGenerationException.m22b("...while writing instructions for " + r16.mo107a(), e);
    L21:
        r16 = r6;
        StringBuilder r142 = new StringBuilder(100);
        int r62 = 0;
    L22:
        if (r62 >= r10) goto L27;
        int r17 = r10;
        if (r62 == 0) goto L26;
        r142.append(", ");
    L26:
        r142.append(r13.mo403b(r62).mo107a());
        r62 = r62 + 1;
        r10 = r17;
        goto L22
    L27:
        r102 = r142.toString();
    L29:
        r16 = r6;
        goto L30
    L13:
        r122 = r12.m235f();
        goto L15
    L9:
        r112 = r11.m265c();
        goto L10
    L5:
        r9 = false;
        goto L6
    }

    /* JADX INFO: renamed from: m */
    public final String m280m() {
        return this.f357e.mo107a();
    }

    public final String toString() {
        return "CodeItem{" + m280m() + "}";
    }
}
