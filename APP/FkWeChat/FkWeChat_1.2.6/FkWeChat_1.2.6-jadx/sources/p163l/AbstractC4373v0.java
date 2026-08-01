package p163l;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.C1047m;
import p163l.C4348q0;
import p163l.C4348q0.a;
import p172l8.C4700i0;

/* JADX INFO: renamed from: l.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4373v0 {

    /* JADX INFO: renamed from: l.v0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0469c1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4348q0 f12797a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4348q0.a f12798b;

        public a(C4348q0 c4348q0, C4348q0.a aVar) {
            this.f12797a = c4348q0;
            this.f12798b = aVar;
        }

        @Override // androidx.compose.runtime.InterfaceC0469c1
        /* JADX INFO: renamed from: a */
        public void mo1209a() {
            this.f12797a.m17071k(this.f12798b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0469c1 m17130a(C4348q0 c4348q0, C4348q0.a aVar, C0476d1 c0476d1) {
        c4348q0.m17067g(aVar);
        return new a(c4348q0, aVar);
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m17131b(Object obj, C4348q0.a aVar, Object obj2, C4338o0 c4338o0) {
        if (!AbstractC1061t.m3842c(obj, aVar.m17075d()) || !AbstractC1061t.m3842c(obj2, aVar.m17076e())) {
            aVar.m17082w(obj, obj2, c4338o0);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0564p5 m17132c(C4348q0 c4348q0, float f10, float f11, C4338o0 c4338o0, String str, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i12 = i10 << 3;
        InterfaceC0564p5 interfaceC0564p5M17133d = m17133d(c4348q0, Float.valueOf(f10), Float.valueOf(f11), AbstractC4336n3.m17025t(C1047m.f3206a), c4338o0, str2, interfaceC0572r, (i10 & 1022) | (57344 & i12) | (i12 & 458752), 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0564p5M17133d;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0564p5 m17133d(C4348q0 c4348q0, Object obj, Object obj2, InterfaceC4365t2 interfaceC4365t2, C4338o0 c4338o0, String str, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        final C4348q0 c4348q02;
        final Object obj3;
        final Object obj4;
        final C4338o0 c4338o02;
        if ((i11 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1062847727, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        if (objMo2170f == aVar.m2191a()) {
            c4348q02 = c4348q0;
            obj3 = obj;
            obj4 = obj2;
            c4338o02 = c4338o0;
            C4348q0.a aVar2 = c4348q02.new a(obj3, obj4, interfaceC4365t2, c4338o02, str2);
            interfaceC0572r.mo2153L(aVar2);
            objMo2170f = aVar2;
        } else {
            c4348q02 = c4348q0;
            obj3 = obj;
            obj4 = obj2;
            c4338o02 = c4338o0;
        }
        final C4348q0.a aVar3 = (C4348q0.a) objMo2170f;
        boolean z10 = true;
        boolean z11 = ((((i10 & Opcodes.IREM) ^ 48) > 32 && interfaceC0572r.mo2175k(obj3)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC0572r.mo2175k(obj4)) || (i10 & 384) == 256);
        if ((((57344 & i10) ^ 24576) <= 16384 || !interfaceC0572r.mo2175k(c4338o02)) && (i10 & 24576) != 16384) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        if (z12 || objMo2170f2 == aVar.m2191a()) {
            objMo2170f2 = new InterfaceC0173a() { // from class: l.t0
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return AbstractC4373v0.m17131b(obj3, aVar3, obj4, c4338o02);
                }
            };
            interfaceC0572r.mo2153L(objMo2170f2);
        }
        AbstractC0497g1.m1683g((InterfaceC0173a) objMo2170f2, interfaceC0572r, 0);
        boolean zMo2175k = interfaceC0572r.mo2175k(c4348q02);
        Object objMo2170f3 = interfaceC0572r.mo2170f();
        if (zMo2175k || objMo2170f3 == aVar.m2191a()) {
            objMo2170f3 = new InterfaceC0184l() { // from class: l.u0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj5) {
                    return AbstractC4373v0.m17130a(c4348q02, aVar3, (C0476d1) obj5);
                }
            };
            interfaceC0572r.mo2153L(objMo2170f3);
        }
        AbstractC0497g1.m1677a(aVar3, (InterfaceC0184l) objMo2170f3, interfaceC0572r, 6);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return aVar3;
    }

    /* JADX INFO: renamed from: e */
    public static final C4348q0 m17134e(String str, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new C4348q0(str);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C4348q0 c4348q0 = (C4348q0) objMo2170f;
        c4348q0.m17072l(interfaceC0572r, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c4348q0;
    }
}
