package p303v;

import androidx.compose.foundation.lazy.layout.AbstractC0364d1;
import androidx.compose.foundation.lazy.layout.InterfaceC0360c1;
import p172l8.C4700i0;
import p219p.EnumC5898w0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p277t2.C8065d;

/* JADX INFO: renamed from: v.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8695g {

    /* JADX INFO: renamed from: v.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0360c1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8722t0 f28887a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f28888b;

        public a(C8722t0 c8722t0, boolean z10) {
            this.f28887a = c8722t0;
            this.f28888b = z10;
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: a */
        public int mo1146a() {
            EnumC5898w0 enumC5898w0Mo33390f = this.f28887a.m33474B().mo33390f();
            EnumC5898w0 enumC5898w0 = EnumC5898w0.f18786q;
            C8722t0 c8722t0 = this.f28887a;
            return (int) (enumC5898w0Mo33390f == enumC5898w0 ? c8722t0.m33474B().mo33387b() & 4294967295L : c8722t0.m33474B().mo33387b() >> 32);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: b */
        public float mo1147b() {
            return AbstractC0364d1.m1157b(this.f28887a.m33498w(), this.f28887a.m33499x());
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: c */
        public int mo1148c() {
            return this.f28887a.m33474B().mo33391g() + this.f28887a.m33474B().mo33388c();
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: d */
        public float mo1149d() {
            return AbstractC0364d1.m1156a(this.f28887a.m33498w(), this.f28887a.m33499x(), this.f28887a.mo2980e());
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: e */
        public C8065d mo1150e() {
            return this.f28888b ? new C8065d(this.f28887a.m33474B().mo33393i(), 1) : new C8065d(1, this.f28887a.m33474B().mo33393i());
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: f */
        public Object mo1151f(int i10, InterfaceC5976f interfaceC5976f) {
            Object objM33462O = C8722t0.m33462O(this.f28887a, i10, 0, interfaceC5976f, 2, null);
            return objM33462O == AbstractC6325c.m24992g() ? objM33462O : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0360c1 m33416a(C8722t0 c8722t0, boolean z10) {
        return new a(c8722t0, z10);
    }
}
