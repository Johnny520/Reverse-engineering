package p156e4;

import java.io.IOException;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p123Y3.AbstractC1774e;

/* JADX INFO: renamed from: e4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2053p implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final C2058u f6841d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2054q f6842e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2053p(C2054q c2054q, C2058u c2058u) {
        this.f6842e = c2054q;
        this.f6841d = c2058u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x0008 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e4.q] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [e4.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws Throwable {
        Throwable th;
        EnumC2039b enumC2039b;
        ?? r02 = this.f6842e;
        C2058u c2058u = this.f6841d;
        EnumC2039b enumC2039b2 = EnumC2039b.f6786h;
        ?? r32 = 1;
        IOException e5 = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e6) {
                e5 = e6;
                enumC2039b = enumC2039b2;
            }
            if (!c2058u.m3761b(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
            } while (c2058u.m3761b(false, this));
            enumC2039b = EnumC2039b.f6784f;
            try {
                enumC2039b2 = EnumC2039b.f6789k;
                r02.m3752b(enumC2039b, enumC2039b2, null);
                r32 = enumC2039b;
            } catch (IOException e7) {
                e5 = e7;
                enumC2039b2 = EnumC2039b.f6785g;
                r02.m3752b(enumC2039b2, enumC2039b2, e5);
                r32 = enumC2039b;
            }
            AbstractC1774e.m3161b(c2058u);
            return C0891q.f2780a;
        } catch (Throwable th4) {
            th = th4;
        }
        r32 = enumC2039b2;
        r02.m3752b(r32, enumC2039b2, e5);
        AbstractC1774e.m3161b(c2058u);
        throw th;
    }
}
