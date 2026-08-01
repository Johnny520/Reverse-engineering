package p189n;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p221p1.AbstractC5927j;
import p274t.AbstractC7848i3;

/* JADX INFO: renamed from: n.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5306z {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m21621a(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        m21622b(interfaceC4507m, interfaceC0184l, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m21622b(final InterfaceC4507m interfaceC4507m, final InterfaceC0184l interfaceC0184l, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2162U(interfaceC4507m) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2175k(interfaceC0184l) ? 32 : 16;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & 19) != 18, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-932836462, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:40)");
            }
            AbstractC7848i3.m30394a(AbstractC5927j.m23842b(interfaceC4507m, interfaceC0184l), interfaceC0572rMo2181q, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: n.y
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5306z.m21621a(interfaceC4507m, interfaceC0184l, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
