package p303v;

import androidx.compose.foundation.lazy.layout.InterfaceC0438y0;
import java.util.List;
import p185m8.AbstractC5081g0;
import p219p.InterfaceC5836c1;

/* JADX INFO: renamed from: v.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8710n0 {

    /* JADX INFO: renamed from: v.n0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0438y0, InterfaceC5836c1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5836c1 f28910a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C8722t0 f28911b;

        public a(InterfaceC5836c1 interfaceC5836c1, C8722t0 c8722t0) {
            this.f28911b = c8722t0;
            this.f28910a = interfaceC5836c1;
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: a */
        public int mo1457a() {
            return this.f28911b.m33474B().mo33393i();
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: c */
        public int mo1458c() {
            InterfaceC8709n interfaceC8709n = (InterfaceC8709n) AbstractC5081g0.m20589w0(this.f28911b.m33474B().mo33395k());
            if (interfaceC8709n != null) {
                return interfaceC8709n.getIndex();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: d */
        public int mo1459d(int i10, int i11) {
            Object obj;
            InterfaceC8729x interfaceC8729xM33474B = this.f28911b.m33474B();
            int iM33514a = 0;
            if (interfaceC8729xM33474B.mo33395k().isEmpty()) {
                return 0;
            }
            int iMo1462h = mo1462h();
            if (i10 > mo1458c() || iMo1462h > i10) {
                iM33514a = (AbstractC8731y.m33514a(interfaceC8729xM33474B) * (i10 - mo1462h())) - mo1461f();
            } else {
                List listMo33395k = interfaceC8729xM33474B.mo33395k();
                int size = listMo33395k.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        obj = null;
                        break;
                    }
                    obj = listMo33395k.get(i12);
                    if (((InterfaceC8709n) obj).getIndex() == i10) {
                        break;
                    }
                    i12++;
                }
                InterfaceC8709n interfaceC8709n = (InterfaceC8709n) obj;
                if (interfaceC8709n != null) {
                    iM33514a = interfaceC8709n.getOffset();
                }
            }
            return iM33514a + i11;
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: e */
        public void mo1460e(int i10, int i11) {
            this.f28911b.m33489R(i10, i11, true);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: f */
        public int mo1461f() {
            return this.f28911b.m33499x();
        }

        @Override // p219p.InterfaceC5836c1
        /* JADX INFO: renamed from: g */
        public float mo23523g(float f10) {
            return this.f28910a.mo23523g(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: h */
        public int mo1462h() {
            return this.f28911b.m33498w();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0438y0 m33451a(C8722t0 c8722t0, InterfaceC5836c1 interfaceC5836c1) {
        return new a(interfaceC5836c1, c8722t0);
    }
}
