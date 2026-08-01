package p248r;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import ec.InterfaceC2165o0;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0188p;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6436l;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: r.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6437m {

    /* JADX INFO: renamed from: r.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f20243q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC6432h f20244r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0512i2 f20245s;

        /* JADX INFO: renamed from: r.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10187a implements InterfaceC2974d {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ List f20246q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ InterfaceC0512i2 f20247r;

            public C10187a(List list, InterfaceC0512i2 interfaceC0512i2) {
                this.f20246q = list;
                this.f20247r = interfaceC0512i2;
            }

            @Override // p113hc.InterfaceC2974d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object mo400a(InterfaceC6431g interfaceC6431g, InterfaceC5976f interfaceC5976f) {
                if (interfaceC6431g instanceof InterfaceC6436l.b) {
                    this.f20246q.add(interfaceC6431g);
                } else if (interfaceC6431g instanceof InterfaceC6436l.c) {
                    this.f20246q.remove(((InterfaceC6436l.c) interfaceC6431g).m25469a());
                } else if (interfaceC6431g instanceof InterfaceC6436l.a) {
                    this.f20246q.remove(((InterfaceC6436l.a) interfaceC6431g).m25467a());
                }
                this.f20247r.setValue(AbstractC6533b.m25845a(!this.f20246q.isEmpty()));
                return C4700i0.f13910a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6432h interfaceC6432h, InterfaceC0512i2 interfaceC0512i2, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f20244r = interfaceC6432h;
            this.f20245s = interfaceC0512i2;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new a(this.f20244r, this.f20245s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f20243q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC2972c interfaceC2972cMo25462a = this.f20244r.mo25462a();
                C10187a c10187a = new C10187a(arrayList, this.f20245s);
                this.f20243q = 1;
                if (interfaceC2972cMo25462a.mo399b(c10187a, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0564p5 m25470a(InterfaceC6432h interfaceC6432h, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1692965168, i10, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:80)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        if (objMo2170f == aVar.m2191a()) {
            objMo2170f = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) objMo2170f;
        int i11 = i10 & 14;
        boolean z10 = ((i11 ^ 6) > 4 && interfaceC0572r.mo2162U(interfaceC6432h)) || (i10 & 6) == 4;
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        if (z10 || objMo2170f2 == aVar.m2191a()) {
            objMo2170f2 = new a(interfaceC6432h, interfaceC0512i2, null);
            interfaceC0572r.mo2153L(objMo2170f2);
        }
        AbstractC0497g1.m1680d(interfaceC6432h, (InterfaceC0188p) objMo2170f2, interfaceC0572r, i11);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0512i2;
    }
}
