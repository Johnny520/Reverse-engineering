package p340x7;

import ec.AbstractC2140i;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p356y7.C9605a;
import p356y7.C9607c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: x7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9461a {

    /* JADX INFO: renamed from: x7.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f32151q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0184l f32152r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f32152r = interfaceC0184l;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new a(this.f32152r, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f32151q;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC4713t.m18808b(obj);
                    return obj;
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            InterfaceC0184l interfaceC0184l = this.f32152r;
            this.f32151q = 1;
            Object objMo27m = interfaceC0184l.mo27m(this);
            return objMo27m == objM24992g ? objM24992g : objMo27m;
        }
    }

    /* JADX INFO: renamed from: x7.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f32153q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0184l f32154r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f32154r = interfaceC0184l;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new b(this.f32154r, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f32153q;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC4713t.m18808b(obj);
                    return obj;
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            InterfaceC0184l interfaceC0184l = this.f32154r;
            this.f32153q = 1;
            Object objMo27m = interfaceC0184l.mo27m(this);
            return objMo27m == objM24992g ? objM24992g : objMo27m;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m36876a(String str, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return !C9463c.f32155a.m36881b() ? interfaceC0184l.mo27m(interfaceC5976f) : AbstractC2140i.m7762g(interfaceC5976f.getContext().mo1651c0(new C9605a(str)), new a(interfaceC0184l, null), interfaceC5976f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final Object m36877b(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        if (!C9463c.f32155a.m36881b()) {
            return interfaceC0184l.mo27m(interfaceC5976f);
        }
        return AbstractC2140i.m7762g(interfaceC5976f.getContext().mo1651c0(new C9607c(null, 1, 0 == true ? 1 : 0)), new b(interfaceC0184l, null), interfaceC5976f);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m36878c(InterfaceC5980j.c cVar, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        if (!C9463c.f32155a.m36881b()) {
            return C4700i0.f13910a;
        }
        InterfaceC5980j.b bVarMo1654h = interfaceC5976f.getContext().mo1654h(cVar);
        if (bVarMo1654h != null) {
            interfaceC0184l.mo27m(bVarMo1654h);
        }
        return C4700i0.f13910a;
    }
}
