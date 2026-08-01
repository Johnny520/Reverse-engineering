package p316w;

import androidx.compose.foundation.lazy.layout.AbstractC0364d1;
import androidx.compose.foundation.lazy.layout.InterfaceC0360c1;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p172l8.C4700i0;
import p219p.EnumC5898w0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p277t2.C8065d;

/* JADX INFO: renamed from: w.i1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8957i1 {

    /* JADX INFO: renamed from: w.i1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0360c1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8939c1 f29693a;

        public a(C8939c1 c8939c1) {
            this.f29693a = c8939c1;
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: a */
        public int mo1146a() {
            EnumC5898w0 enumC5898w0Mo34309f = this.f29693a.m34358y().mo34309f();
            EnumC5898w0 enumC5898w0 = EnumC5898w0.f18786q;
            C8939c1 c8939c1 = this.f29693a;
            return (int) (enumC5898w0Mo34309f == enumC5898w0 ? c8939c1.m34358y().mo34306b() & 4294967295L : c8939c1.m34358y().mo34306b() >> 32);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: b */
        public float mo1147b() {
            return AbstractC0364d1.m1157b(this.f29693a.m34353t(), this.f29693a.m34354u());
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: c */
        public int mo1148c() {
            return this.f29693a.m34358y().mo34310g() + this.f29693a.m34358y().mo34307c();
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: d */
        public float mo1149d() {
            return AbstractC0364d1.m1156a(this.f29693a.m34353t(), this.f29693a.m34354u(), this.f29693a.mo2980e());
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: e */
        public C8065d mo1150e() {
            return new C8065d(-1, -1);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: f */
        public Object mo1151f(int i10, InterfaceC5976f interfaceC5976f) {
            Object objM34324L = C8939c1.m34324L(this.f29693a, i10, 0, interfaceC5976f, 2, null);
            return objM34324L == AbstractC6325c.m24992g() ? objM34324L : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0360c1 m34398a(C8939c1 c8939c1, boolean z10, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1247008005, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && interfaceC0572r.mo2162U(c8939c1)) || (i10 & 6) == 4) | ((((i10 & Opcodes.IREM) ^ 48) > 32 && interfaceC0572r.mo2167c(z10)) || (i10 & 48) == 32);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (z11 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new a(c8939c1);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        a aVar = (a) objMo2170f;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return aVar;
    }
}
