package p070f0;

import af.C0081d;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.C0119x;
import ci.C0577d;
import ci.C0589j;
import ci.C0609u;
import gg.AbstractC1416l;
import gg.C1425u;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p014b.C0126e;
import p015b0.C0144j;
import p015b0.C0146l;
import p015b0.C0154t;
import p020b5.C0192k;
import p027c0.C0368m;
import p036c9.C0414a;
import p056e0.AbstractC0805e;
import p057e1.C0808c;
import p068eh.AbstractC0921a;
import p071f1.AbstractC1018n0;
import p077f8.AbstractC1089i;
import p080fb.C1165q1;
import p080fb.C1183v;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p100h0.C1511d1;
import p100h0.C1538n;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1861n1;
import p117i0.AbstractC1874r;
import p117i0.C1819d;
import p117i0.C1823e;
import p117i0.C1830f2;
import p117i0.C1871q;
import p117i0.C1876r1;
import p117i0.C1894x1;
import p117i0.C1897y1;
import p117i0.EnumC1885u1;
import p117i0.InterfaceC1809a1;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p136j8.C2104o;
import p144k.C2160c0;
import p162l3.C2463q;
import p174m.C2571a;
import p174m.C2580b3;
import p174m.C2590d3;
import p174m.C2629m2;
import p174m.C2637o2;
import p174m.C2656t1;
import p190n2.C2875j;
import p190n2.C2884s;
import p190n2.C2885t;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p223p0.C3274b;
import p235q0.C3419a;
import p235q0.C3420b;
import p243q9.C3465a;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p252r0.C3643b;
import p267s1.InterfaceC3918x;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p277t.C4071c;
import p279t1.C4084d;
import p321w.AbstractC4582a1;
import p321w.AbstractC4634s;
import p321w.C4594e1;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.C4639u0;
import p321w.C4645x0;
import p322w0.AbstractC4662m;
import p332wb.AbstractC4955ho;
import p332wb.C4867f2;
import p332wb.C4933h2;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p357y1.C5899k0;
import p370yf.AbstractC6044i;
import sg.AbstractC3978j;
import sg.C3971c;
import sg.InterfaceC3975g;
import tf.AbstractC4166m;
import tg.C4183b0;
import tg.InterfaceC4187e;
import ug.AbstractC4338c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0970b extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3052h;

    /* JADX INFO: renamed from: i */
    public int f3053i;

    /* JADX INFO: renamed from: j */
    public Object f3054j;

    /* JADX INFO: renamed from: k */
    public Object f3055k;

    /* JADX INFO: renamed from: l */
    public Object f3056l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f3057m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f3058n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0970b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f3052h = i9;
        this.f3054j = obj;
        this.f3055k = obj2;
        this.f3056l = obj3;
        this.f3057m = obj4;
        this.f3058n = obj5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f3052h) {
            case 0:
                C0970b c0970b = new C0970b((C5899k0) this.f3055k, (InterfaceC1231l) this.f3056l, (C0971c) this.f3057m, (C0984p) this.f3058n, interfaceC5557c, 0);
                c0970b.f3054j = obj;
                return c0970b;
            case 1:
                C0970b c0970b2 = new C0970b((C1897y1) this.f3056l, (C1894x1) this.f3057m, (C1819d) this.f3058n, interfaceC5557c, 1);
                c0970b2.f3054j = obj;
                return c0970b2;
            case 2:
                C0970b c0970b3 = new C0970b((InterfaceC1220a) this.f3058n, interfaceC5557c);
                c0970b3.f3057m = obj;
                return c0970b3;
            case 3:
                C0970b c0970b4 = new C0970b((InterfaceC3918x) this.f3055k, (C4594e1) this.f3056l, (C0146l) this.f3057m, (C2656t1) this.f3058n, interfaceC5557c, 3);
                c0970b4.f3054j = obj;
                return c0970b4;
            case 4:
                C0970b c0970b5 = new C0970b((C2590d3) this.f3056l, (C2637o2) this.f3057m, (C1425u) this.f3058n, interfaceC5557c, 4);
                c0970b5.f3054j = obj;
                return c0970b5;
            case 5:
                return new C0970b((C4629q0) this.f3054j, (InterfaceC1809a1) this.f3055k, (C2885t) this.f3056l, (C1511d1) this.f3057m, (C2875j) this.f3058n, interfaceC5557c, 5);
            case 6:
                return new C0970b((C4071c) this.f3054j, (C2884s) this.f3055k, (C4629q0) this.f3056l, (C4618m1) this.f3057m, (C0192k) this.f3058n, interfaceC5557c, 6);
            case 7:
                return new C0970b((InterfaceC1809a1) this.f3054j, (InterfaceC1809a1) this.f3055k, (List) this.f3056l, (C0414a) this.f3057m, (InterfaceC1809a1) this.f3058n, interfaceC5557c, 7);
            case 8:
                return new C0970b((Context) this.f3054j, (String) this.f3055k, (String) this.f3056l, (InterfaceC1809a1) this.f3057m, (InterfaceC1809a1) this.f3058n, interfaceC5557c, 8);
            case 9:
                return new C0970b((C1183v) this.f3054j, (InterfaceC1809a1) this.f3055k, (InterfaceC1809a1) this.f3056l, (InterfaceC1809a1) this.f3057m, (InterfaceC1809a1) this.f3058n, interfaceC5557c, 9);
            case 10:
                return new C0970b((Context) this.f3055k, (C1165q1) this.f3056l, (InterfaceC1809a1) this.f3057m, (InterfaceC1809a1) this.f3058n, interfaceC5557c, 10);
            default:
                return new C0970b((InterfaceC1809a1) this.f3054j, (InterfaceC1809a1) this.f3055k, (C0035c) this.f3056l, (InterfaceC1809a1) this.f3057m, (InterfaceC1809a1) this.f3058n, interfaceC5557c, 11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f3052h) {
            case 0:
                ((C0970b) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
                break;
            case 2:
                ((C0970b) create((InterfaceC4187e) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
                break;
        }
        return ((C0970b) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, CONSTRUCTOR]}, finally: {[CONST] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, CONST]}, finally: {[CONST] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, INVOKE]}, finally: {[CONST] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, IPUT]}, finally: {[CONST] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:166:0x047d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:338:0x0524 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:340:0x0462 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[CONST, CONST] complete}, expected: {[CONST] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:177:0x04d2, B:182:0x04ed], limit reached: 353 */
    /* JADX WARN: Path cross not found for [B:182:0x04ed, B:177:0x04d2], limit reached: 353 */
    /* JADX WARN: Removed duplicated region for block: B:137:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04e3 A[Catch: all -> 0x047d, PHI: r4 r6 r8 r9
  0x04e3: PHI (r4v20 java.lang.Object) = (r4v19 java.lang.Object), (r4v24 java.lang.Object) binds: [B:178:0x04e0, B:170:0x0496] A[DONT_GENERATE, DONT_INLINE]
  0x04e3: PHI (r6v15 sg.g) = (r6v14 sg.g), (r6v19 sg.g) binds: [B:178:0x04e0, B:170:0x0496] A[DONT_GENERATE, DONT_INLINE]
  0x04e3: PHI (r8v18 ??) = (r8v58 ??), (r8v59 ??) binds: [B:178:0x04e0, B:170:0x0496] A[DONT_GENERATE, DONT_INLINE]
  0x04e3: PHI (r9v16 tg.e) = (r9v15 tg.e), (r9v21 tg.e) binds: [B:178:0x04e0, B:170:0x0496] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {all -> 0x047d, blocks: (B:170:0x0496, B:180:0x04e3, B:177:0x04d2, B:182:0x04ed, B:164:0x0479), top: B:340:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04ed A[Catch: all -> 0x047d, TRY_LEAVE, TryCatch #8 {all -> 0x047d, blocks: (B:170:0x0496, B:180:0x04e3, B:177:0x04d2, B:182:0x04ed, B:164:0x0479), top: B:340:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0611 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, q9.a] */
    /* JADX WARN: Type inference failed for: r2v27, types: [q9.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [q9.a] */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, qg.r0] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.lifecycle.x] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18, types: [androidx.lifecycle.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x0385 -> B:141:0x0387). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x04eb -> B:177:0x04d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x04ff -> B:177:0x04d2). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C4183b0 c4183b0;
        C3420b c3420b;
        C1897y1 c1897y1;
        List listM4661D;
        C1871q c1871q;
        Object obj2;
        ?? r32;
        ?? r2;
        InterfaceC4187e interfaceC4187e;
        ?? r82;
        Object obj3;
        Object objM586Q;
        C2629m2 c2629m2;
        Object objM7570x;
        Object objM7570x2;
        Object objM7570x3;
        Object objM7570x4;
        InterfaceC1809a1 interfaceC1809a1;
        Object objM7570x5;
        ?? M7557k = 11;
        int i9 = 11;
        long j3 = 4294967295L;
        InterfaceC3975g interfaceC3975g = null;
        boolean z9 = false;
        int i10 = 2;
        ?? r83 = 6;
        char c10 = 6;
        char c11 = 6;
        int i11 = 1;
        InterfaceC5557c interfaceC5557c = null;
        switch (this.f3052h) {
            case 0:
                C0971c c0971c = (C0971c) this.f3057m;
                C5899k0 c5899k0 = (C5899k0) this.f3055k;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                int i12 = this.f3053i;
                try {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                        throw new C0081d();
                    }
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f3054j;
                    C0987s c0987s = AbstractC0988t.f3122a;
                    View view = c5899k0.f23967g;
                    c0987s.getClass();
                    C0982n c0982n = new C0982n(view);
                    C0989u c0989u = new C0989u(c5899k0.f23967g, new C0969a((C0984p) this.f3058n), c0982n);
                    if (AbstractC0805e.f2409a) {
                        AbstractC3603v.m7563q(interfaceC3599t, null, new C0589j(c0971c, c0982n, (InterfaceC5557c) null, i10), 3);
                    }
                    InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f3056l;
                    if (interfaceC1231l != null) {
                        interfaceC1231l.invoke(c0989u);
                    }
                    c0971c.f3061c = c0989u;
                    this.f3053i = 1;
                    c5899k0.m10616a(c0989u, this);
                    return enumC5799a;
                } catch (Throwable th2) {
                    c0971c.f3061c = null;
                    throw th2;
                }
            case 1:
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                ?? c3465a = this.f3053i;
                try {
                    if (c3465a == 0) {
                        AbstractC1089i.m2732I0(obj);
                        M7557k = AbstractC3603v.m7557k(((InterfaceC3599t) this.f3054j).mo4457n());
                        C1897y1 c1897y12 = (C1897y1) this.f3056l;
                        synchronized (c1897y12.f6305c) {
                            Throwable th3 = c1897y12.f6307e;
                            if (th3 != null) {
                                throw th3;
                            }
                            if (((EnumC1885u1) c1897y12.f6323u.getValue()).compareTo(EnumC1885u1.f6257h) <= 0) {
                                throw new IllegalStateException("Recomposer shut down");
                            }
                            if (c1897y12.f6306d != null) {
                                throw new IllegalStateException("Recomposer already running");
                            }
                            c1897y12.f6306d = M7557k;
                            if (c1897y12.m4670y() != null) {
                                AbstractC1855m.m4573a("called outside of runRecomposeAndApplyChanges");
                            }
                        }
                        C0154t c0154t = new C0154t((C1897y1) this.f3056l, 11);
                        AbstractC4662m.m9124e(AbstractC4662m.f15510a);
                        synchronized (AbstractC4662m.f15512c) {
                            AbstractC4662m.f15517h = AbstractC4166m.m8398G1(AbstractC4662m.f15517h, c0154t);
                        }
                        c3465a = new C3465a(c0154t, 10);
                        C4183b0 c4183b02 = C1897y1.f6302z;
                        C1823e c1823e = ((C1897y1) this.f3056l).f6327y;
                        do {
                            c4183b0 = C1897y1.f6302z;
                            C3420b c3420b2 = (C3420b) c4183b0.getValue();
                            C3643b c3643b = C3643b.f11822a;
                            C3274b c3274b = c3420b2.f11049i;
                            if (c3274b.containsKey(c1823e)) {
                                c3420b = c3420b2;
                            } else if (c3420b2.isEmpty()) {
                                c3420b = new C3420b(c1823e, c1823e, c3274b.m6938a(c1823e, new C3419a(c3643b, c3643b)));
                            } else {
                                Object obj4 = c3420b2.f11048h;
                                Object obj5 = c3274b.get(obj4);
                                obj5.getClass();
                                c3420b = new C3420b(c3420b2.f11047g, c1823e, c3274b.m6938a(obj4, new C3419a(((C3419a) obj5).f11044a, c1823e)).m6938a(c1823e, new C3419a(obj4, c3643b)));
                            }
                            if (c3420b2 != c3420b) {
                                C2463q c2463q = AbstractC4338c.f14500b;
                                obj2 = c3420b2;
                                if (c3420b2 == null) {
                                    obj2 = c2463q;
                                }
                            }
                            c1897y1 = (C1897y1) this.f3056l;
                            synchronized (c1897y1.f6305c) {
                                listM4661D = c1897y1.m4661D();
                            }
                            int size = listM4661D.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                for (Object obj6 : ((C1871q) listM4661D.get(i13)).f6207l.f7951i) {
                                    C1876r1 c1876r1 = obj6 instanceof C1876r1 ? (C1876r1) obj6 : null;
                                    if (c1876r1 != null && (c1871q = c1876r1.f6238a) != null) {
                                        c1871q.m4606s(c1876r1, null);
                                    }
                                }
                            }
                            C0368m c0368m = new C0368m((C1894x1) this.f3057m, (C1819d) this.f3058n, null, 5);
                            this.f3054j = M7557k;
                            this.f3055k = c3465a;
                            this.f3053i = 1;
                            r2 = c3465a;
                            r32 = M7557k;
                            if (AbstractC3603v.m7551e(c0368m, this) == enumC5799a2) {
                                return enumC5799a2;
                            }
                        } while (!c4183b0.m8446h(obj2, c3420b));
                        c1897y1 = (C1897y1) this.f3056l;
                        synchronized (c1897y1.f6305c) {
                        }
                    } else {
                        if (c3465a != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        C3465a c3465a2 = (C3465a) this.f3055k;
                        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) this.f3054j;
                        AbstractC1089i.m2732I0(obj);
                        r2 = c3465a2;
                        r32 = interfaceC3596r0;
                    }
                    r2.m7269e();
                    C1897y1 c1897y13 = (C1897y1) this.f3056l;
                    synchronized (c1897y13.f6305c) {
                        try {
                            if (c1897y13.f6306d == r32) {
                                c1897y13.f6306d = null;
                            }
                            if (c1897y13.m4670y() != null) {
                                AbstractC1855m.m4573a("called outside of runRecomposeAndApplyChanges");
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                        break;
                    }
                    C4183b0 c4183b03 = C1897y1.f6302z;
                    C1823e.m4459a(((C1897y1) this.f3056l).f6327y);
                    return C3967n.f12976a;
                } catch (Throwable th5) {
                    c3465a.m7269e();
                    C1897y1 c1897y14 = (C1897y1) this.f3056l;
                    synchronized (c1897y14.f6305c) {
                        try {
                            if (c1897y14.f6306d == M7557k) {
                                c1897y14.f6306d = null;
                            }
                            if (c1897y14.m4670y() != null) {
                                AbstractC1855m.m4573a("called outside of runRecomposeAndApplyChanges");
                                break;
                            }
                            C4183b0 c4183b04 = C1897y1.f6302z;
                            C1823e.m4459a(((C1897y1) this.f3056l).f6327y);
                            throw th5;
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            case 2:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f3058n;
                EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                int i14 = this.f3053i;
                try {
                    if (i14 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        interfaceC4187e = (InterfaceC4187e) this.f3057m;
                        C0119x c0119x = new C0119x(24, z9 ? 1 : 0);
                        c0119x.f310h = new C1830f2();
                        C3971c c3971cM8218a = AbstractC3978j.m8218a(1, 6, null);
                        try {
                            Object objM586Q2 = c0119x.m586Q(c3971cM8218a, interfaceC1220a);
                            this.f3057m = interfaceC4187e;
                            this.f3055k = c0119x;
                            this.f3056l = c3971cM8218a;
                            this.f3054j = objM586Q2;
                            this.f3053i = 1;
                            if (interfaceC4187e.mo1602e(objM586Q2, this) != enumC5799a3) {
                                r82 = c0119x;
                                obj3 = objM586Q2;
                                interfaceC3975g = c3971cM8218a;
                            }
                            return enumC5799a3;
                        } catch (Throwable th7) {
                            th = th7;
                            interfaceC3975g = c3971cM8218a;
                            r83 = c0119x;
                            AbstractC1018n0 abstractC1018n0 = (AbstractC1018n0) r83.f310h;
                            if (abstractC1018n0 != null) {
                                abstractC1018n0.mo2626o(interfaceC3975g);
                            }
                            AbstractC1018n0 abstractC1018n02 = (AbstractC1018n0) r83.f310h;
                            if (abstractC1018n02 == null) {
                                AbstractC1861n1.m4584b("Called dispose on a manager that has been disposed of");
                            }
                            abstractC1018n02.mo2622j();
                            r83.f310h = null;
                            throw th;
                        }
                    }
                    if (i14 != 1) {
                        if (i14 == 2) {
                            obj3 = this.f3054j;
                            interfaceC3975g = (InterfaceC3975g) this.f3056l;
                            C0119x c0119x2 = (C0119x) this.f3055k;
                            interfaceC4187e = (InterfaceC4187e) this.f3057m;
                            AbstractC1089i.m2732I0(obj);
                            r83 = c0119x2;
                            objM586Q = r83.m586Q(interfaceC3975g, interfaceC1220a);
                            r82 = r83;
                            if (!AbstractC1416l.m3825a(objM586Q, obj3)) {
                                this.f3057m = interfaceC4187e;
                                this.f3055k = r83;
                                this.f3056l = interfaceC3975g;
                                this.f3054j = objM586Q;
                                this.f3053i = 3;
                                if (interfaceC4187e.mo1602e(objM586Q, this) != enumC5799a3) {
                                    obj3 = objM586Q;
                                    r82 = r83;
                                }
                                return enumC5799a3;
                            }
                        } else if (i14 != 3) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    obj3 = this.f3054j;
                    interfaceC3975g = (InterfaceC3975g) this.f3056l;
                    C0119x c0119x3 = (C0119x) this.f3055k;
                    interfaceC4187e = (InterfaceC4187e) this.f3057m;
                    AbstractC1089i.m2732I0(obj);
                    r82 = c0119x3;
                    this.f3057m = interfaceC4187e;
                    this.f3055k = r82;
                    this.f3056l = interfaceC3975g;
                    this.f3054j = obj3;
                    this.f3053i = 2;
                    r83 = r82;
                    if (interfaceC3975g.mo8198f(this) == enumC5799a3) {
                        objM586Q = r83.m586Q(interfaceC3975g, interfaceC1220a);
                        r82 = r83;
                        if (!AbstractC1416l.m3825a(objM586Q, obj3)) {
                        }
                        this.f3057m = interfaceC4187e;
                        this.f3055k = r82;
                        this.f3056l = interfaceC3975g;
                        this.f3054j = obj3;
                        this.f3053i = 2;
                        r83 = r82;
                        if (interfaceC3975g.mo8198f(this) == enumC5799a3) {
                        }
                    }
                    return enumC5799a3;
                } catch (Throwable th8) {
                    th = th8;
                }
                break;
            case 3:
                EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                int i15 = this.f3053i;
                if (i15 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f3054j;
                    InterfaceC3918x interfaceC3918x = (InterfaceC3918x) this.f3055k;
                    C0577d c0577d = new C0577d(interfaceC3599t2, (C4594e1) this.f3056l, (C0146l) this.f3057m, (C2656t1) this.f3058n, (InterfaceC5557c) null, 2);
                    this.f3053i = 1;
                    if (AbstractC0000a.m78n(interfaceC3918x, c0577d, this) == enumC5799a4) {
                        return enumC5799a4;
                    }
                } else {
                    if (i15 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 4:
                C2637o2 c2637o2 = (C2637o2) this.f3057m;
                C1425u c1425u = (C1425u) this.f3058n;
                C2590d3 c2590d3 = (C2590d3) this.f3056l;
                EnumC5799a enumC5799a5 = EnumC5799a.f23547g;
                int i16 = this.f3053i;
                if (i16 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2629m2 c2629m22 = (C2629m2) this.f3054j;
                    float fM6096i = c2637o2.m6096i(c2637o2.m6092e(((C2580b3) c1425u.f4738g).f8368a));
                    C2637o2 c2637o22 = c2590d3.f8583a;
                    c2637o22.m6094g(c2637o22.m6092e(c2629m22.m6085a(1, c2637o22.m6095h(c2637o22.m6091d(fM6096i)))));
                    c2629m2 = c2629m22;
                    if (!((C2580b3) c1425u.f4738g).f8370c) {
                    }
                } else {
                    if (i16 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C1425u c1425u2 = (C1425u) this.f3055k;
                    C2629m2 c2629m23 = (C2629m2) this.f3054j;
                    AbstractC1089i.m2732I0(obj);
                    C2629m2 c2629m24 = c2629m23;
                    C1425u c1425u3 = c1425u2;
                    Object objM7551e = obj;
                    c1425u3.f4738g = objM7551e;
                    C2580b3 c2580b3 = (C2580b3) c1425u.f4738g;
                    C0126e c0126e = c2590d3.f8587e;
                    long j4 = c2580b3.f8369b;
                    long j5 = j3;
                    long j10 = c2580b3.f8368a;
                    ((C4084d) c0126e.f332h).m8265a(j4, Float.intBitsToFloat((int) (j10 >> 32)));
                    ((C4084d) c0126e.f333i).m8265a(j4, Float.intBitsToFloat((int) (j10 & j5)));
                    C2580b3 c2580b3M6054e = C2590d3.m6054e(c2590d3.f8389f);
                    if (c2580b3M6054e != null) {
                        C0126e c0126e2 = c2590d3.f8587e;
                        long j11 = c2580b3M6054e.f8369b;
                        long j12 = c2580b3M6054e.f8368a;
                        ((C4084d) c0126e2.f332h).m8265a(j11, Float.intBitsToFloat((int) (j12 >> 32)));
                        ((C4084d) c0126e2.f333i).m8265a(j11, Float.intBitsToFloat((int) (j12 & j5)));
                        c1425u.f4738g = ((C2580b3) c1425u.f4738g).m6050a(c2580b3M6054e);
                    }
                    float fM6096i2 = c2637o2.m6096i(c2637o2.m6092e(((C2580b3) c1425u.f4738g).f8368a));
                    C2637o2 c2637o23 = c2590d3.f8583a;
                    c2637o23.m6094g(c2637o23.m6092e(c2629m24.m6085a(1, c2637o23.m6095h(c2637o23.m6091d(fM6096i2)))));
                    i11 = 1;
                    c2629m2 = c2629m24;
                    j3 = j5;
                    i9 = 11;
                    interfaceC5557c = null;
                    if (!((C2580b3) c1425u.f4738g).f8370c) {
                        C3971c c3971c = c2590d3.f8389f;
                        this.f3054j = c2629m2;
                        this.f3055k = c1425u;
                        this.f3053i = i11;
                        objM7551e = AbstractC3603v.m7551e(new C0589j(c3971c, interfaceC5557c, i9), this);
                        if (objM7551e == enumC5799a5) {
                            return enumC5799a5;
                        }
                        c2629m24 = c2629m2;
                        c1425u3 = c1425u;
                        c1425u3.f4738g = objM7551e;
                        C2580b3 c2580b32 = (C2580b3) c1425u.f4738g;
                        C0126e c0126e3 = c2590d3.f8587e;
                        long j42 = c2580b32.f8369b;
                        long j52 = j3;
                        long j102 = c2580b32.f8368a;
                        ((C4084d) c0126e3.f332h).m8265a(j42, Float.intBitsToFloat((int) (j102 >> 32)));
                        ((C4084d) c0126e3.f333i).m8265a(j42, Float.intBitsToFloat((int) (j102 & j52)));
                        C2580b3 c2580b3M6054e2 = C2590d3.m6054e(c2590d3.f8389f);
                        if (c2580b3M6054e2 != null) {
                        }
                        float fM6096i22 = c2637o2.m6096i(c2637o2.m6092e(((C2580b3) c1425u.f4738g).f8368a));
                        C2637o2 c2637o232 = c2590d3.f8583a;
                        c2637o232.m6094g(c2637o232.m6092e(c2629m24.m6085a(1, c2637o232.m6095h(c2637o232.m6091d(fM6096i22)))));
                        i11 = 1;
                        c2629m2 = c2629m24;
                        j3 = j52;
                        i9 = 11;
                        interfaceC5557c = null;
                        if (!((C2580b3) c1425u.f4738g).f8370c) {
                            return C3967n.f12976a;
                        }
                    }
                }
                break;
            case 5:
                C4629q0 c4629q0 = (C4629q0) this.f3054j;
                EnumC5799a enumC5799a6 = EnumC5799a.f23547g;
                int i17 = this.f3053i;
                try {
                    if (i17 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        C2571a c2571aM4616B = AbstractC1874r.m4616B(new C0144j((InterfaceC1809a1) this.f3055k, 15));
                        C2160c0 c2160c0 = new C2160c0(c4629q0, (C2885t) this.f3056l, (C1511d1) this.f3057m, (C2875j) this.f3058n, 2);
                        this.f3053i = 1;
                        if (c2571aM4616B.mo6025b(c2160c0, this) == enumC5799a6) {
                            return enumC5799a6;
                        }
                    } else {
                        if (i17 != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                    }
                    AbstractC4634s.m9072o(c4629q0);
                    return C3967n.f12976a;
                } catch (Throwable th9) {
                    AbstractC4634s.m9072o(c4629q0);
                    throw th9;
                }
            case 6:
                C3967n c3967n = C3967n.f12976a;
                EnumC5799a enumC5799a7 = EnumC5799a.f23547g;
                int i18 = this.f3053i;
                if (i18 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C4071c c4071c = (C4071c) this.f3054j;
                    C2884s c2884s = (C2884s) this.f3055k;
                    C4645x0 c4645x0 = ((C4629q0) this.f3056l).f15326a;
                    C1935k0 c1935k0 = ((C4618m1) this.f3057m).f15293a;
                    C0192k c0192k = (C0192k) this.f3058n;
                    this.f3053i = 1;
                    int iM4815e = C1939m0.m4815e(c2884s.f9317b);
                    c0192k.m859l(iM4815e);
                    Object objM8260a = c4071c.m8260a(iM4815e < c1935k0.f6561a.f6549a.f6529h.length() ? c1935k0.m4802b(iM4815e) : iM4815e != 0 ? c1935k0.m4802b(iM4815e - 1) : new C0808c(0.0f, 0.0f, 1.0f, (int) (4294967295L & AbstractC4582a1.m9025a(c4645x0.f15437b, c4645x0.f15442g, c4645x0.f15443h, AbstractC4582a1.f15098a, 1))), this);
                    if (objM8260a != enumC5799a7) {
                        objM8260a = c3967n;
                    }
                    if (objM8260a == enumC5799a7) {
                        return enumC5799a7;
                    }
                } else {
                    if (i18 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return c3967n;
            case 7:
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f3055k;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f3054j;
                EnumC5799a enumC5799a8 = EnumC5799a.f23547g;
                int i19 = this.f3053i;
                if (i19 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C4933h2 c4933h2 = C4933h2.f17518a;
                    interfaceC1809a13.setValue(Boolean.TRUE);
                    interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    C5808e c5808e = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                    C4639u0 c4639u0 = new C4639u0((List) this.f3056l, (C0414a) this.f3057m, interfaceC5557c, i11);
                    this.f3053i = 1;
                    objM7570x = AbstractC3603v.m7570x(executorC5807d, c4639u0, this);
                    if (objM7570x == enumC5799a8) {
                        return enumC5799a8;
                    }
                } else {
                    if (i19 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x = obj;
                }
                Object obj7 = ((C3960g) objM7570x).f12964g;
                C4933h2 c4933h22 = C4933h2.f17518a;
                interfaceC1809a13.setValue(Boolean.FALSE);
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f3058n;
                if (!(obj7 instanceof C3959f)) {
                    interfaceC1809a14.setValue((C4867f2) obj7);
                }
                Throwable thM8182b = C3960g.m8182b(obj7);
                if (thM8182b != null) {
                    String message = thM8182b.getMessage();
                    if (message == null) {
                        message = "读取会话列表失败";
                    }
                    interfaceC1809a12.setValue(message);
                }
                return C3967n.f12976a;
            case 8:
                EnumC5799a enumC5799a9 = EnumC5799a.f23547g;
                int i20 = this.f3053i;
                if (i20 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e2 = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d2 = ExecutorC5807d.f23583i;
                    C0609u c0609u = new C0609u((String) this.f3055k, (String) this.f3056l, interfaceC5557c, i10);
                    this.f3053i = 1;
                    objM7570x2 = AbstractC3603v.m7570x(executorC5807d2, c0609u, this);
                    if (objM7570x2 == enumC5799a9) {
                        return enumC5799a9;
                    }
                } else {
                    if (i20 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x2 = obj;
                }
                List list = (List) objM7570x2;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f3057m;
                C3147k c3147k = AbstractC4955ho.f17686a;
                interfaceC1809a15.setValue(list);
                ((InterfaceC1809a1) this.f3058n).setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                Toast.makeText((Context) this.f3054j, list.isEmpty() ? "未获取到模型" : AbstractC0921a.m2250m(list.size(), "已获取 ", " 个模型"), 0).show();
                return C3967n.f12976a;
            case 9:
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f3058n;
                EnumC5799a enumC5799a10 = EnumC5799a.f23547g;
                int i21 = this.f3053i;
                if (i21 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e3 = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d3 = ExecutorC5807d.f23583i;
                    C1538n c1538n = new C1538n((C1183v) this.f3054j, interfaceC5557c, c10);
                    this.f3053i = 1;
                    objM7570x3 = AbstractC3603v.m7570x(executorC5807d3, c1538n, this);
                    if (objM7570x3 == enumC5799a10) {
                        return enumC5799a10;
                    }
                } else {
                    if (i21 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x3 = obj;
                }
                Object obj8 = ((C3960g) objM7570x3).f12964g;
                ((InterfaceC1809a1) this.f3055k).setValue(Boolean.FALSE);
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f3056l;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f3057m;
                if (!(obj8 instanceof C3959f)) {
                    List list2 = (List) obj8;
                    interfaceC1809a17.setValue(list2);
                    if (AbstractC3149m.m6721t0((String) interfaceC1809a18.getValue())) {
                        String str = (String) AbstractC4166m.m8424v1(list2);
                        if (str == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        interfaceC1809a18.setValue(str);
                    }
                    if (list2.isEmpty()) {
                        interfaceC1809a16.setValue("未获取到模型");
                    }
                }
                Throwable thM8182b2 = C3960g.m8182b(obj8);
                if (thM8182b2 != null) {
                    String message2 = thM8182b2.getMessage();
                    if (message2 == null) {
                        message2 = "拉取模型失败";
                    }
                    interfaceC1809a16.setValue(message2);
                }
                return C3967n.f12976a;
            case 10:
                EnumC5799a enumC5799a11 = EnumC5799a.f23547g;
                int i22 = this.f3053i;
                if (i22 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f3057m;
                    C5808e c5808e4 = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d4 = ExecutorC5807d.f23583i;
                    C0609u c0609u2 = new C0609u((Context) this.f3055k, (C1165q1) this.f3056l, interfaceC5557c, c11);
                    this.f3054j = interfaceC1809a19;
                    this.f3053i = 1;
                    objM7570x4 = AbstractC3603v.m7570x(executorC5807d4, c0609u2, this);
                    if (objM7570x4 == enumC5799a11) {
                        return enumC5799a11;
                    }
                    interfaceC1809a1 = interfaceC1809a19;
                } else {
                    if (i22 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC1809a1 = (InterfaceC1809a1) this.f3054j;
                    AbstractC1089i.m2732I0(obj);
                    objM7570x4 = obj;
                }
                interfaceC1809a1.setValue((String) objM7570x4);
                ((InterfaceC1809a1) this.f3058n).setValue(Boolean.FALSE);
                return C3967n.f12976a;
            default:
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f3058n;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f3057m;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f3055k;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f3054j;
                EnumC5799a enumC5799a12 = EnumC5799a.f23547g;
                int i23 = this.f3053i;
                if (i23 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    interfaceC1809a113.setValue(Boolean.TRUE);
                    interfaceC1809a112.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    C5808e c5808e5 = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d5 = ExecutorC5807d.f23583i;
                    C1538n c1538n2 = new C1538n((C0035c) this.f3056l, interfaceC5557c, 7);
                    this.f3053i = 1;
                    objM7570x5 = AbstractC3603v.m7570x(executorC5807d5, c1538n2, this);
                    if (objM7570x5 == enumC5799a12) {
                        return enumC5799a12;
                    }
                } else {
                    if (i23 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x5 = obj;
                }
                String str2 = (String) objM7570x5;
                interfaceC1809a113.setValue(Boolean.FALSE);
                if (str2 == null || AbstractC3149m.m6721t0(str2)) {
                    interfaceC1809a111.setValue(null);
                    interfaceC1809a112.setValue("预览加载失败");
                } else {
                    interfaceC1809a111.setValue(str2);
                    int iIntValue = ((Number) interfaceC1809a110.getValue()).intValue();
                    interfaceC1809a110.setValue(Integer.valueOf(iIntValue + 1));
                    new Integer(iIntValue);
                }
                return C3967n.f12976a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0970b(InterfaceC1220a interfaceC1220a, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f3052h = 2;
        this.f3058n = interfaceC1220a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0970b(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f3052h = i9;
        this.f3055k = obj;
        this.f3056l = obj2;
        this.f3057m = obj3;
        this.f3058n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0970b(Object obj, Object obj2, Object obj3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f3052h = i9;
        this.f3056l = obj;
        this.f3057m = obj2;
        this.f3058n = obj3;
    }
}
