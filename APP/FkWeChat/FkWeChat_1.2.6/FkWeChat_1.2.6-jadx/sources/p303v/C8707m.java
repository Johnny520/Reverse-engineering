package p303v;

import androidx.compose.foundation.lazy.layout.AbstractC0413q;
import androidx.compose.foundation.lazy.layout.C0433w1;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p010a9.InterfaceC0190r;
import p057e1.AbstractC1984l;
import p117i.AbstractC3071m;
import p117i.AbstractC3073n;
import p117i.C3055g0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: v.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8707m extends AbstractC0413q implements InterfaceC8706l0 {

    /* JADX INFO: renamed from: a */
    public final C0433w1 f28902a = new C0433w1();

    /* JADX INFO: renamed from: b */
    public C3055g0 f28903b;

    /* JADX INFO: renamed from: v.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0190r {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0189q f28904q;

        public a(InterfaceC0189q interfaceC0189q) {
            this.f28904q = interfaceC0189q;
        }

        /* JADX INFO: renamed from: a */
        public final void m33440a(InterfaceC8691e interfaceC8691e, int i10, InterfaceC0572r interfaceC0572r, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= interfaceC0572r.mo2162U(interfaceC8691e) ? 4 : 2;
            }
            if (!interfaceC0572r.mo2144C((i11 & Opcodes.LXOR) != 130, i11 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-857469575, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:56)");
            }
            this.f28904q.mo236e(interfaceC8691e, interfaceC0572r, Integer.valueOf(i11 & 14));
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0190r
        /* JADX INFO: renamed from: p */
        public /* bridge */ /* synthetic */ Object mo284p(Object obj, Object obj2, Object obj3, Object obj4) {
            m33440a((InterfaceC8691e) obj, ((Number) obj2).intValue(), (InterfaceC0572r) obj3, ((Number) obj4).intValue());
            return C4700i0.f13910a;
        }
    }

    public C8707m(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.mo27m(this);
    }

    @Override // p303v.InterfaceC8706l0
    /* JADX INFO: renamed from: b */
    public void mo33433b(final Object obj, final Object obj2, InterfaceC0189q interfaceC0189q) {
        mo1319h().m1443c(1, new C8701j(obj != null ? new InterfaceC0184l() { // from class: v.k
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj3) {
                return C8707m.m33437l(obj, ((Integer) obj3).intValue());
            }
        } : null, new InterfaceC0184l() { // from class: v.l
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj3) {
                return C8707m.m33436k(obj2, ((Integer) obj3).intValue());
            }
        }, AbstractC1984l.m7162b(-857469575, true, new a(interfaceC0189q))));
    }

    @Override // p303v.InterfaceC8706l0
    /* JADX INFO: renamed from: c */
    public void mo33434c(int i10, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0190r interfaceC0190r) {
        mo1319h().m1443c(i10, new C8701j(interfaceC0184l, interfaceC0184l2, interfaceC0190r));
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC3071m m33438m() {
        C3055g0 c3055g0 = this.f28903b;
        return c3055g0 != null ? c3055g0 : AbstractC3073n.m11431a();
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0413q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0433w1 mo1319h() {
        return this.f28902a;
    }

    /* JADX INFO: renamed from: k */
    public static Object m33436k(Object obj, int i10) {
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public static Object m33437l(Object obj, int i10) {
        return obj;
    }
}
