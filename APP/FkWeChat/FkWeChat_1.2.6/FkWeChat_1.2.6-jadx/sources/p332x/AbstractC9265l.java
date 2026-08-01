package p332x;

import androidx.compose.foundation.lazy.layout.InterfaceC0360c1;
import p172l8.C4700i0;
import p219p.EnumC5898w0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p277t2.C8065d;

/* JADX INFO: renamed from: x.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9265l {

    /* JADX INFO: renamed from: x.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0360c1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC9242c1 f31673a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f31674b;

        public a(AbstractC9242c1 abstractC9242c1, boolean z10) {
            this.f31673a = abstractC9242c1;
            this.f31674b = z10;
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: a */
        public int mo1146a() {
            EnumC5898w0 enumC5898w0Mo35967f = this.f31673a.m35994E().mo35967f();
            EnumC5898w0 enumC5898w0 = EnumC5898w0.f18786q;
            AbstractC9242c1 abstractC9242c1 = this.f31673a;
            return (int) (enumC5898w0Mo35967f == enumC5898w0 ? abstractC9242c1.m35994E().mo35964b() & 4294967295L : abstractC9242c1.m35994E().mo35964b() >> 32);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: b */
        public float mo1147b() {
            return AbstractC9282t0.m36124a(this.f31673a);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: c */
        public int mo1148c() {
            return this.f31673a.m35994E().mo35968g() + this.f31673a.m35994E().mo35965c();
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: d */
        public float mo1149d() {
            return AbstractC9254g1.m36061i(this.f31673a.m35994E(), this.f31673a.mo35999J());
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: e */
        public C8065d mo1150e() {
            return this.f31674b ? new C8065d(this.f31673a.mo35999J(), 1) : new C8065d(1, this.f31673a.mo35999J());
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0360c1
        /* JADX INFO: renamed from: f */
        public Object mo1151f(int i10, InterfaceC5976f interfaceC5976f) {
            Object objM35978f0 = AbstractC9242c1.m35978f0(this.f31673a, i10, 0.0f, interfaceC5976f, 2, null);
            return objM35978f0 == AbstractC6325c.m24992g() ? objM35978f0 : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0360c1 m36076a(AbstractC9242c1 abstractC9242c1, boolean z10) {
        return new a(abstractC9242c1, z10);
    }
}
