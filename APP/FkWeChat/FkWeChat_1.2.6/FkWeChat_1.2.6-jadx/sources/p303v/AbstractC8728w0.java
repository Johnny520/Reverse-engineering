package p303v;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import ec.AbstractC2169p0;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p102h1.AbstractC2825f;
import p102h1.InterfaceC2843x;
import p121i3.AbstractC3174d;
import p121i3.AbstractC3177g;
import p135j2.InterfaceC3558p0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p219p.EnumC5898w0;
import p228p8.C5981k;

/* JADX INFO: renamed from: v.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8728w0 {

    /* JADX INFO: renamed from: a */
    public static final C8692e0 f29021a = new C8692e0(null, 0, false, 0.0f, new a(), 0.0f, false, AbstractC2169p0.m7878a(C5981k.f18917q), AbstractC3177g.m11997b(1.0f, 0.0f, 2, null), AbstractC3174d.m11985b(0, 0, 0, 0, 15, null), AbstractC5114x.m20800o(), 0, 0, 0, false, EnumC5898w0.f18786q, 0, 0, null);

    /* JADX INFO: renamed from: a */
    public static C8722t0 m33510a(int i10, int i11) {
        return new C8722t0(i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public static final C8722t0 m33512c(final int i10, final int i11, InterfaceC0572r interfaceC0572r, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1470655220, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)");
        }
        Object[] objArr = new Object[0];
        InterfaceC2843x interfaceC2843xM33502a = C8722t0.f28929y.m33502a();
        boolean z10 = true;
        boolean z11 = (((i12 & 14) ^ 6) > 4 && interfaceC0572r.mo2172h(i10)) || (i12 & 6) == 4;
        if ((((i12 & Opcodes.IREM) ^ 48) <= 32 || !interfaceC0572r.mo2172h(i11)) && (i12 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (z12 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new InterfaceC0173a() { // from class: v.v0
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return AbstractC8728w0.m33510a(i10, i11);
                }
            };
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C8722t0 c8722t0 = (C8722t0) AbstractC2825f.m10052k(objArr, interfaceC2843xM33502a, (InterfaceC0173a) objMo2170f, interfaceC0572r, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c8722t0;
    }

    /* JADX INFO: renamed from: v.w0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC3558p0 {

        /* JADX INFO: renamed from: a */
        public final int f29022a;

        /* JADX INFO: renamed from: b */
        public final int f29023b;

        /* JADX INFO: renamed from: c */
        public final Map f29024c = AbstractC5109u0.m20768i();

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: a */
        public int mo13077a() {
            return this.f29023b;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: e */
        public int mo13078e() {
            return this.f29022a;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: l */
        public Map mo13079l() {
            return this.f29024c;
        }

        @Override // p135j2.InterfaceC3558p0
        /* JADX INFO: renamed from: m */
        public void mo13080m() {
        }
    }
}
