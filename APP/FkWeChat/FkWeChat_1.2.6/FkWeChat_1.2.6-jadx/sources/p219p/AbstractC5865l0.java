package p219p;

import java.util.List;
import p010a9.InterfaceC0188p;
import p073f2.C2236d0;
import p073f2.EnumC2265s;
import p073f2.InterfaceC2230b;
import p073f2.InterfaceC2254m0;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6542k;

/* JADX INFO: renamed from: p.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5865l0 {

    /* JADX INFO: renamed from: p.l0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f18448q;

        /* JADX INFO: renamed from: r */
        public Object f18449r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f18450s;

        /* JADX INFO: renamed from: t */
        public int f18451t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f18450s = obj;
            this.f18451t |= Integer.MIN_VALUE;
            return AbstractC5865l0.m23629b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: p.l0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public int f18452r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f18453s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC5980j f18454t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC0188p f18455u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5980j interfaceC5980j, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18454t = interfaceC5980j;
            this.f18455u = interfaceC0188p;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f18454t, this.f18455u, interfaceC5976f);
            bVar.f18453s = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        
            if (r9 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [f2.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [f2.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [a9.p] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v8 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r8.f18452r
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L34
                if (r1 == r5) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r8.f18453s
                f2.b r1 = (p073f2.InterfaceC2230b) r1
                p172l8.AbstractC4713t.m18808b(r9)
                goto L28
            L1a:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r9)
                r9 = 0
                return r9
            L21:
                java.lang.Object r1 = r8.f18453s
                f2.b r1 = (p073f2.InterfaceC2230b) r1
                p172l8.AbstractC4713t.m18808b(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r9 = r1
                goto L3b
            L2a:
                r9 = move-exception
                goto L60
            L2c:
                java.lang.Object r1 = r8.f18453s
                f2.b r1 = (p073f2.InterfaceC2230b) r1
                p172l8.AbstractC4713t.m18808b(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
                goto L51
            L34:
                p172l8.AbstractC4713t.m18808b(r9)
                java.lang.Object r9 = r8.f18453s
                f2.b r9 = (p073f2.InterfaceC2230b) r9
            L3b:
                p8.j r1 = r8.f18454t
                boolean r1 = ec.AbstractC2210z1.m7963p(r1)
                if (r1 == 0) goto L74
                a9.p r1 = r8.f18455u     // Catch: java.util.concurrent.CancellationException -> L5c
                r8.f18453s = r9     // Catch: java.util.concurrent.CancellationException -> L5c
                r8.f18452r = r5     // Catch: java.util.concurrent.CancellationException -> L5c
                java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5c
                if (r1 != r0) goto L50
                goto L72
            L50:
                r1 = r9
            L51:
                r8.f18453s = r1     // Catch: java.util.concurrent.CancellationException -> L2a
                r8.f18452r = r3     // Catch: java.util.concurrent.CancellationException -> L2a
                java.lang.Object r9 = p219p.AbstractC5865l0.m23630c(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L2a
                if (r9 != r0) goto L28
                goto L72
            L5c:
                r1 = move-exception
                r7 = r1
                r1 = r9
                r9 = r7
            L60:
                p8.j r6 = r8.f18454t
                boolean r6 = ec.AbstractC2210z1.m7963p(r6)
                if (r6 == 0) goto L73
                r8.f18453s = r1
                r8.f18452r = r2
                java.lang.Object r9 = p219p.AbstractC5865l0.m23630c(r1, r4, r8, r5, r4)
                if (r9 != r0) goto L28
            L72:
                return r0
            L73:
                throw r9
            L74:
                l8.i0 r9 = p172l8.C4700i0.f13910a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p219p.AbstractC5865l0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2230b interfaceC2230b, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2230b, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m23628a(InterfaceC2230b interfaceC2230b) {
        List listM8216c = interfaceC2230b.mo8031V().m8216c();
        int size = listM8216c.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((C2236d0) listM8216c.get(i10)).m8078i()) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (m23628a(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:19:0x0051). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m23629b(p073f2.InterfaceC2230b r7, p073f2.EnumC2265s r8, p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof p219p.AbstractC5865l0.a
            if (r0 == 0) goto L13
            r0 = r9
            p.l0$a r0 = (p219p.AbstractC5865l0.a) r0
            int r1 = r0.f18451t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18451t = r1
            goto L18
        L13:
            p.l0$a r0 = new p.l0$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f18450s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f18451t
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f18449r
            f2.s r7 = (p073f2.EnumC2265s) r7
            java.lang.Object r8 = r0.f18448q
            f2.b r8 = (p073f2.InterfaceC2230b) r8
            p172l8.AbstractC4713t.m18808b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L51
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
            r7 = 0
            return r7
        L3b:
            p172l8.AbstractC4713t.m18808b(r9)
            boolean r9 = m23628a(r7)
            if (r9 != 0) goto L6e
        L44:
            r0.f18448q = r7
            r0.f18449r = r8
            r0.f18451t = r3
            java.lang.Object r9 = r7.mo8033b0(r8, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            f2.q r9 = (p073f2.C2261q) r9
            java.util.List r9 = r9.m8216c()
            int r2 = r9.size()
            r4 = 0
        L5c:
            if (r4 >= r2) goto L6e
            java.lang.Object r5 = r9.get(r4)
            f2.d0 r5 = (p073f2.C2236d0) r5
            boolean r5 = r5.m8078i()
            if (r5 == 0) goto L6b
            goto L44
        L6b:
            int r4 = r4 + 1
            goto L5c
        L6e:
            l8.i0 r7 = p172l8.C4700i0.f13910a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p219p.AbstractC5865l0.m23629b(f2.b, f2.s, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m23630c(InterfaceC2230b interfaceC2230b, EnumC2265s enumC2265s, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC2265s = EnumC2265s.f6227s;
        }
        return m23629b(interfaceC2230b, enumC2265s, interfaceC5976f);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m23631d(InterfaceC2254m0 interfaceC2254m0, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        Object objMo8053R = interfaceC2254m0.mo8053R(new b(interfaceC5976f.getContext(), interfaceC0188p, null), interfaceC5976f);
        return objMo8053R == AbstractC6325c.m24992g() ? objMo8053R : C4700i0.f13910a;
    }
}
