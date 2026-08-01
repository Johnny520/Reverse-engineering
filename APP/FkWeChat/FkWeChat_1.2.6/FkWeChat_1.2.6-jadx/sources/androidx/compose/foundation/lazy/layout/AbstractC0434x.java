package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0188p;
import p057e1.AbstractC1984l;
import p102h1.InterfaceC2828i;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0434x {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0437y f1267q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ int f1268r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Object f1269s;

        public a(InterfaceC0437y interfaceC0437y, int i10, Object obj) {
            this.f1267q = interfaceC0437y;
            this.f1268r = i10;
            this.f1269s = obj;
        }

        /* JADX INFO: renamed from: a */
        public final void m1449a(InterfaceC0572r interfaceC0572r, int i10) {
            if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
            }
            this.f1267q.mo1455h(this.f1268r, this.f1269s, interfaceC0572r, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m1449a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m1446a(InterfaceC0437y interfaceC0437y, Object obj, int i10, Object obj2, int i11, InterfaceC0572r interfaceC0572r, int i12) {
        m1447b(interfaceC0437y, obj, i10, obj2, interfaceC0572r, AbstractC0541m3.m1929a(i11 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1447b(final InterfaceC0437y interfaceC0437y, final Object obj, final int i10, final Object obj2, InterfaceC0572r interfaceC0572r, final int i11) {
        int i12;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC0572rMo2181q.mo2162U(interfaceC0437y) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2162U(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2172h(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2162U(obj2) ? 2048 : 1024;
        }
        if (interfaceC0572rMo2181q.mo2144C((i12 & 1171) != 1170, i12 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((InterfaceC2828i) obj).mo1351f(obj2, AbstractC1984l.m7164d(980966366, true, new a(interfaceC0437y, i10, obj2), interfaceC0572rMo2181q, 54), interfaceC0572rMo2181q, 48);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: androidx.compose.foundation.lazy.layout.w
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj3, Object obj4) {
                    return AbstractC0434x.m1446a(interfaceC0437y, obj, i10, obj2, i11, (InterfaceC0572r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }
}
