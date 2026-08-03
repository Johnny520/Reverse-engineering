package p332wb;

import android.content.Context;
import android.widget.Toast;
import gb.C1382f;
import gb.C1388l;
import gb.C1391o;
import gg.AbstractC1416l;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3960g;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.cq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4793cq extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f16424h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f16425i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Context f16426j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1391o f16427k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f16428l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f16429m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f16430n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f16431o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f16432p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f16433q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f16434r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4793cq(boolean z9, Context context, C1391o c1391o, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f16425i = z9;
        this.f16426j = context;
        this.f16427k = c1391o;
        this.f16428l = interfaceC1809a1;
        this.f16429m = interfaceC1809a12;
        this.f16430n = interfaceC1809a13;
        this.f16431o = interfaceC1809a14;
        this.f16432p = interfaceC1809a15;
        this.f16433q = interfaceC1809a16;
        this.f16434r = interfaceC1809a17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C4793cq(this.f16425i, this.f16426j, this.f16427k, this.f16428l, this.f16429m, this.f16430n, this.f16431o, this.f16432p, this.f16433q, this.f16434r, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4793cq) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0089 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [i0.a1, i0.l2] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r5v0, types: [wf.c] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
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
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? simpleName;
        int i9 = this.f16424h;
        ?? r5 = 0;
        r5 = 0;
        C1391o c1391o = this.f16427k;
        Context context = this.f16426j;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C5808e c5808e = AbstractC3553c0.f11555a;
            ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
            C5514yp c5514yp = new C5514yp(this.f16425i, context, c1391o, r5, 1);
            this.f16424h = 1;
            obj = AbstractC3603v.m7570x(executorC5807d, c5514yp, this);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (obj == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
        }
        Object obj2 = ((C3960g) obj).f12964g;
        Throwable thM8182b = C3960g.m8182b(obj2);
        if (thM8182b == null) {
            C1388l c1388l = (C1388l) obj2;
            this.f16428l.setValue(Boolean.valueOf(c1388l.f4609a));
            this.f16429m.setValue(Boolean.TRUE);
            C5491y2.m9767A1(this.f16430n, this.f16431o, this.f16432p, c1391o.f4617a, new Long(c1388l.f4610b), null, 32);
        } else {
            if ((thM8182b instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b).f4589g, "UPLOADER_BLACKLISTED")) {
                simpleName = "当前微信账号已被禁止上传在线插件";
            } else {
                String message = thM8182b.getMessage();
                String string = message != null ? AbstractC3149m.m6703R0(message).toString() : null;
                if (string != null && !AbstractC3149m.m6721t0(string)) {
                    r5 = string;
                }
                simpleName = r5 != 0 ? r5 : thM8182b.getClass().getSimpleName();
            }
            ?? r02 = this.f16433q;
            r02.setValue(simpleName);
            Toast.makeText(context, "操作失败: " + ((String) r02.getValue()), 1).show();
        }
        this.f16434r.setValue(Boolean.FALSE);
        return C3967n.f12976a;
    }
}
