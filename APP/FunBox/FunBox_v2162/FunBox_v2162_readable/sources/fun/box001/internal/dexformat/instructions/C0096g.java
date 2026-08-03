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

    public C0096g(C0187q c0187q, C0032i c0032i, boolean z, C0194b c0194b) {
        super(4, -1);
        if (c0187q == null) {
            throw new NullPointerException("ref == null");
        }
        if (c0032i == null) {
            throw new NullPointerException("code == null");
        }
        if (c0194b == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f357e = c0187q;
        this.f358f = c0032i;
        this.f360h = z;
        this.f361i = c0194b;
        this.f359g = null;
        this.f362j = null;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        C0079B c0079bM293c = c0100k.m293c();
        C0113x c0113xM307q = c0100k.m307q();
        C0032i c0032i = this.f358f;
        if (c0032i.m130k() || c0032i.m129j()) {
            C0099j c0099j = new C0099j(c0032i, this.f360h, this.f357e);
            this.f362j = c0099j;
            c0079bM293c.m229o(c0099j);
        }
        if (c0032i.m128i()) {
            Iterator it = c0032i.m122c().iterator();
            while (it.hasNext()) {
                c0113xM307q.m335x((C0195c) it.next());
            }
            this.f359g = new C0092c(c0032i);
        }
        Iterator it2 = c0032i.m124e().iterator();
        while (it2.hasNext()) {
            c0100k.m310t((AbstractC0171a) it2.next());
        }
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f417m;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E abstractC0082E, int i2) {
        int iM266d;
        C0100k c0100kM246d = abstractC0082E.m246d();
        C0095f c0095f = new C0095f(c0100kM246d);
        C0032i c0032i = this.f358f;
        c0032i.m121a(c0095f);
        C0092c c0092c = this.f359g;
        if (c0092c != null) {
            c0092c.m264a(c0100kM246d);
            iM266d = this.f359g.m266d();
        } else {
            iM266d = 0;
        }
        int iM147F = c0032i.m125f().m147F();
        if ((iM147F & 1) != 0) {
            iM147F++;
        }
        m240k((iM147F * 2) + 16 + iM266d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void mo241l(C0100k c0100k, C0202d c0202d) {
        C0187q c0187q;
        int i2;
        String string;
        boolean zM486d = c0202d.m486d();
        C0032i c0032i = this.f358f;
        int iM149H = c0032i.m125f().m149H();
        int iM148G = c0032i.m125f().m148G();
        C0187q c0187q2 = this.f357e;
        int iM430i = c0187q2.m430i(this.f360h);
        int iM147F = c0032i.m125f().m147F();
        boolean z = (iM147F & 1) != 0;
        C0092c c0092c = this.f359g;
        int iM265c = c0092c == null ? 0 : c0092c.m265c();
        C0099j c0099j = this.f362j;
        int iM235f = c0099j == null ? 0 : c0099j.m235f();
        if (zM486d) {
            c0202d.m484b(0, m237h() + ' ' + c0187q2.mo107a());
            c0202d.m484b(2, "  registers_size: ".concat(RuntimeDexGenerator.m11q(iM149H)));
            c0202d.m484b(2, "  ins_size:       ".concat(RuntimeDexGenerator.m11q(iM430i)));
            c0202d.m484b(2, "  outs_size:      ".concat(RuntimeDexGenerator.m11q(iM148G)));
            c0202d.m484b(2, "  tries_size:     ".concat(RuntimeDexGenerator.m11q(iM265c)));
            c0202d.m484b(4, "  debug_off:      ".concat(RuntimeDexGenerator.m13s(iM235f)));
            c0202d.m484b(4, "  insns_size:     ".concat(RuntimeDexGenerator.m13s(iM147F)));
            InterfaceC0197e interfaceC0197e = this.f361i;
            AbstractC0203e abstractC0203e = (AbstractC0203e) interfaceC0197e;
            if (abstractC0203e.m504B() != 0) {
                StringBuilder sb = new StringBuilder("  throws ");
                int iM504B = abstractC0203e.m504B();
                if (iM504B == 0) {
                    string = "<empty>";
                    c0187q = c0187q2;
                } else {
                    c0187q = c0187q2;
                    StringBuilder sb2 = new StringBuilder(100);
                    int i3 = 0;
                    while (i3 < iM504B) {
                        int i4 = iM504B;
                        if (i3 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(interfaceC0197e.mo403b(i3).mo107a());
                        i3++;
                        iM504B = i4;
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                c0202d.m484b(0, sb.toString());
            } else {
                c0187q = c0187q2;
            }
        }
        c0202d.m498r(iM149H);
        c0202d.m498r(iM430i);
        c0202d.m498r(iM148G);
        c0202d.m498r(iM265c);
        c0202d.m497q(iM235f);
        c0202d.m497q(iM147F);
        try {
            c0032i.m125f().m150J(c0202d);
            if (this.f359g != null) {
                if (z) {
                    if (zM486d) {
                        c0202d.m484b(2, "  padding: 0");
                    }
                    i2 = 0;
                    c0202d.m498r(0);
                } else {
                    i2 = 0;
                }
                this.f359g.m267e(c0202d);
            } else {
                i2 = 0;
            }
            if (!zM486d || this.f362j == null) {
                return;
            }
            c0202d.m484b(i2, "  debug info");
            this.f362j.m290m(c0100k, c0202d);
        } catch (RuntimeException e2) {
            throw DexGenerationException.m22b("...while writing instructions for " + c0187q.mo107a(), e2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m280m() {
        return this.f357e.mo107a();
    }

    public final String toString() {
        return "CodeItem{" + m280m() + "}";
    }
}
