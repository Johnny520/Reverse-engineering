package p219p;

import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p189n.EnumC5190a2;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5828a1 {

    /* JADX INFO: renamed from: p.a1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18257q;

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new a(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f18257q == 0) {
                AbstractC4713t.m18808b(obj);
                return C4700i0.f13910a;
            }
            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5836c1 interfaceC5836c1, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC5836c1, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m23480a(InterfaceC5881q1 interfaceC5881q1, EnumC5190a2 enumC5190a2, InterfaceC5976f interfaceC5976f) {
        Object objMo2979c = interfaceC5881q1.mo2979c(enumC5190a2, new a(null), interfaceC5976f);
        return objMo2979c == AbstractC6325c.m24992g() ? objMo2979c : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m23481b(InterfaceC5881q1 interfaceC5881q1, EnumC5190a2 enumC5190a2, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC5190a2 = EnumC5190a2.f15823q;
        }
        return m23480a(interfaceC5881q1, enumC5190a2, interfaceC5976f);
    }
}
