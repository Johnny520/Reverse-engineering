package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0564p5;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p080f9.C2363j;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0407o0 implements InterfaceC0564p5 {

    /* JADX INFO: renamed from: u */
    public static final a f1162u = new a(null);

    /* JADX INFO: renamed from: q */
    public final int f1163q;

    /* JADX INFO: renamed from: r */
    public final int f1164r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0512i2 f1165s;

    /* JADX INFO: renamed from: t */
    public int f1166t;

    public C0407o0(int i10, int i11, int i12) {
        this.f1163q = i11;
        this.f1164r = i12;
        this.f1165s = AbstractC0473c5.m1570i(f1162u.m1304b(i10, i11, i12), AbstractC0473c5.m1579r());
        this.f1166t = i10;
    }

    @Override // androidx.compose.runtime.InterfaceC0564p5
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C2363j getValue() {
        return (C2363j) this.f1165s.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m1301e(C2363j c2363j) {
        this.f1165s.setValue(c2363j);
    }

    /* JADX INFO: renamed from: k */
    public final void m1302k(int i10) {
        if (i10 != this.f1166t) {
            this.f1166t = i10;
            m1301e(f1162u.m1304b(i10, this.f1163q, this.f1164r));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.o0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final C2363j m1304b(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return AbstractC2368o.m8592s(Math.max(i13 - i12, 0), i13 + i11 + i12);
        }

        public a() {
        }
    }
}
