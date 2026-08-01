package p179m2;

import androidx.compose.runtime.InterfaceC0502h;
import androidx.lifecycle.AbstractC0671l0;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1067w;
import p072f1.InterfaceC2226e;
import p117i.AbstractC3077p;
import p117i.C3058h0;
import p117i.C3076o0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: m2.m2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4876m2 extends AbstractC0671l0 {

    /* JADX INFO: renamed from: b */
    public final C3058h0 f14568b = AbstractC3077p.m11480c();

    /* JADX INFO: renamed from: m2.m2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC0502h mo19506a(InterfaceC0173a interfaceC0173a);
    }

    /* JADX INFO: renamed from: m2.m2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C4871l2 f14569a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2226e f14570b;

        /* JADX INFO: renamed from: c */
        public boolean f14571c;

        /* JADX INFO: renamed from: d */
        public InterfaceC0502h f14572d;

        /* JADX INFO: renamed from: m2.m2$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC1067w implements InterfaceC0173a {
            public a() {
                super(0);
            }

            /* JADX INFO: renamed from: a */
            public final void m19516a() {
                b.this.f14569a.m19482b();
            }

            @Override // p010a9.InterfaceC0173a
            public /* bridge */ /* synthetic */ Object invoke() {
                m19516a();
                return C4700i0.f13910a;
            }
        }

        public b() {
            C4871l2 c4871l2 = new C4871l2(null, 1, null);
            this.f14569a = c4871l2;
            this.f14570b = c4871l2;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC2226e m19508b() {
            return this.f14570b;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m19509c() {
            return this.f14571c;
        }

        /* JADX INFO: renamed from: d */
        public final void m19510d() {
            m19512f(null);
            this.f14569a.m19481a();
        }

        /* JADX INFO: renamed from: e */
        public final void m19511e() {
            this.f14571c = false;
        }

        /* JADX INFO: renamed from: f */
        public final void m19512f(InterfaceC0502h interfaceC0502h) {
            InterfaceC0502h interfaceC0502h2 = this.f14572d;
            if (interfaceC0502h2 != null) {
                interfaceC0502h2.cancel();
            }
            this.f14572d = interfaceC0502h;
        }

        /* JADX INFO: renamed from: g */
        public final void m19513g(boolean z10) {
            this.f14571c = z10;
        }

        /* JADX INFO: renamed from: h */
        public final void m19514h() {
            if (this.f14569a.m19483c()) {
                m19512f(null);
            } else {
                this.f14569a.m19484d();
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m19515i(a aVar) {
            InterfaceC0502h interfaceC0502hMo19506a;
            if (this.f14569a.m19483c()) {
                try {
                    interfaceC0502hMo19506a = aVar.mo19506a(new a());
                } catch (CancellationException unused) {
                    this.f14569a.m19482b();
                    interfaceC0502hMo19506a = null;
                }
                m19512f(interfaceC0502hMo19506a);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC0671l0
    /* JADX INFO: renamed from: d */
    public void mo2641d() {
        C3058h0 c3058h0 = this.f14568b;
        int[] iArr = c3058h0.f8156b;
        Object[] objArr = c3058h0.f8157c;
        long[] jArr = c3058h0.f8155a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        int i14 = iArr[i13];
                        C3076o0 c3076o0 = (C3076o0) objArr[i13];
                        Object[] objArr2 = c3076o0.f8235a;
                        int i15 = c3076o0.f8236b;
                        for (int i16 = 0; i16 < i15; i16++) {
                            ((b) objArr2[i16]).m19510d();
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final b m19505e(int i10) {
        Object obj;
        C3058h0 c3058h0 = this.f14568b;
        Object objM11449b = c3058h0.m11449b(i10);
        if (objM11449b == null) {
            objM11449b = new C3076o0(1);
            c3058h0.m11326r(i10, objM11449b);
        }
        C3076o0 c3076o0 = (C3076o0) objM11449b;
        Object[] objArr = c3076o0.f8235a;
        int i11 = c3076o0.f8236b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                obj = null;
                break;
            }
            obj = objArr[i12];
            if (!((b) obj).m19509c()) {
                break;
            }
            i12++;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            bVar = new b();
            c3076o0.m11461n(bVar);
        }
        bVar.m19513g(true);
        return bVar;
    }
}
