package p332wb;

import android.content.Context;
import android.widget.Toast;
import gb.C1382f;
import gb.C1384h;
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
import p321w.C4639u0;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.aq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4727aq extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f15879h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f15880i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1391o f15881j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1384h f15882k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f15883l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC3599t f15884m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f15885n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f15886o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f15887p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f15888q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f15889r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f15890s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f15891t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4727aq(Context context, C1391o c1391o, C1384h c1384h, InterfaceC1809a1 interfaceC1809a1, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f15880i = context;
        this.f15881j = c1391o;
        this.f15882k = c1384h;
        this.f15883l = interfaceC1809a1;
        this.f15884m = interfaceC3599t;
        this.f15885n = interfaceC1809a12;
        this.f15886o = interfaceC1809a13;
        this.f15887p = interfaceC1809a14;
        this.f15888q = interfaceC1809a15;
        this.f15889r = interfaceC1809a16;
        this.f15890s = interfaceC1809a17;
        this.f15891t = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C4727aq(this.f15880i, this.f15881j, this.f15882k, this.f15883l, this.f15884m, this.f15885n, this.f15886o, this.f15887p, this.f15888q, this.f15889r, this.f15890s, this.f15891t, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4727aq) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x007e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r5v0, types: [wf.c] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        ?? simpleName;
        int i9 = this.f15879h;
        Context context2 = this.f15880i;
        ?? r5 = 0;
        r5 = 0;
        if (i9 == 0) {
            AbstractC1089i.m2732I0(obj);
            C5808e c5808e = AbstractC3553c0.f11555a;
            ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
            context = context2;
            C4639u0 c4639u0 = new C4639u0(context, this.f15881j, this.f15882k, r5, 7);
            this.f15879h = 1;
            obj = AbstractC3603v.m7570x(executorC5807d, c4639u0, this);
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
            context = context2;
        }
        Object obj2 = ((C3960g) obj).f12964g;
        this.f15883l.setValue(null);
        Throwable thM8182b = C3960g.m8182b(obj2);
        if (thM8182b == null) {
            C5491y2.m9773E1(context, (C1391o) obj2, this.f15885n, this.f15886o, this.f15887p, this.f15888q, this.f15889r, this.f15890s, this.f15891t, this.f15884m);
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
            Toast.makeText(context, "读取历史版本失败: ".concat(simpleName), 1).show();
        }
        return C3967n.f12976a;
    }
}
