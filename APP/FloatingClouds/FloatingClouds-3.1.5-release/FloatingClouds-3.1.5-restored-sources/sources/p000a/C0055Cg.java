package p000a;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: a.Cg */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC0205L4(m577c = "androidx.core.view.ViewKt$allViews$1", m578f = "View.kt", m579l = {409, 411}, m580m = "invokeSuspend")
public final class C0055Cg extends AbstractC0882vd implements InterfaceC0136H7<AbstractC0321Rd<? super View>, InterfaceC0474a4<? super C0413Wf>, Object>, InterfaceC0298Q7<Object> {

    /* JADX INFO: renamed from: b */
    public final int f188b;

    /* JADX INFO: renamed from: c */
    public int f189c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f190d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055Cg(View view, InterfaceC0474a4<? super C0055Cg> interfaceC0474a4) {
        super(interfaceC0474a4);
        this.f191e = view;
        this.f188b = 2;
    }

    @Override // p000a.InterfaceC0298Q7
    /* JADX INFO: renamed from: b */
    public final int mo145b() {
        return this.f188b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p000a.InterfaceC0136H7
    /* JADX INFO: renamed from: e */
    public final Object mo146e(AbstractC0321Rd<? super View> abstractC0321Rd, InterfaceC0474a4<? super C0413Wf> interfaceC0474a4) {
        return ((C0055Cg) mo147g(abstractC0321Rd, interfaceC0474a4)).mo148h(C0413Wf.f1577a);
    }

    @Override // p000a.AbstractC0399W1
    /* JADX INFO: renamed from: g */
    public final InterfaceC0474a4<C0413Wf> mo147g(Object obj, InterfaceC0474a4<?> interfaceC0474a4) {
        C0055Cg c0055Cg = new C0055Cg(this.f191e, interfaceC0474a4);
        c0055Cg.f190d = obj;
        return c0055Cg;
    }

    @Override // p000a.AbstractC0399W1
    /* JADX INFO: renamed from: h */
    public final Object mo148h(Object obj) throws Throwable {
        EnumC0930y4 enumC0930y4 = EnumC0930y4.f3540a;
        int i = this.f189c;
        View view = this.f191e;
        if (i == 0) {
            C0920xd.m2207b(obj);
            AbstractC0321Rd abstractC0321Rd = (AbstractC0321Rd) this.f190d;
            this.f190d = abstractC0321Rd;
            this.f189c = 1;
            abstractC0321Rd.mo844a(view, this);
            return enumC0930y4;
        }
        if (i == 1) {
            AbstractC0321Rd abstractC0321Rd2 = (AbstractC0321Rd) this.f190d;
            C0920xd.m2207b(obj);
            if (view instanceof ViewGroup) {
                this.f190d = null;
                this.f189c = 2;
                abstractC0321Rd2.getClass();
                Object objMo845b = abstractC0321Rd2.mo845b(new C0126Gf(new C0112G1((ViewGroup) view)), this);
                if (objMo845b != enumC0930y4) {
                    objMo845b = C0413Wf.f1577a;
                }
                if (objMo845b == enumC0930y4) {
                    return enumC0930y4;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0920xd.m2207b(obj);
        }
        return C0413Wf.f1577a;
    }

    @Override // p000a.AbstractC0399W1
    public final String toString() {
        if (this.f1526a != null) {
            return super.toString();
        }
        C0356Tc.f1350a.getClass();
        String strM1002a = C0374Uc.m1002a(this);
        C0631i9.m1481d(strM1002a, "renderLambdaToString(...)");
        return strM1002a;
    }
}
