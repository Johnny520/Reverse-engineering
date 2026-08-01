package p015b0;

import java.util.List;
import p004a3.AbstractC0042h;
import p024b9.AbstractC1061t;
import p104h3.AbstractC2869v;
import p121i3.InterfaceC3175e;
import p319w2.C9058e;
import p319w2.C9147v3;

/* JADX INFO: renamed from: b0.i3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0783i3 {
    /* JADX INFO: renamed from: a */
    public static final int m2945a(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    /* JADX INFO: renamed from: b */
    public static final C0776h3 m2946b(C0776h3 c0776h3, C9058e c9058e, C9147v3 c9147v3, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar, boolean z10, int i10, int i11, int i12, List list) {
        AbstractC0042h.b bVar2;
        boolean z11;
        int i13;
        int i14;
        int i15;
        List list2;
        if (AbstractC1061t.m3842c(c0776h3.m2911k(), c9058e) && AbstractC1061t.m3842c(c0776h3.m2910j(), c9147v3)) {
            z11 = z10;
            if (c0776h3.m2909i() == z11) {
                i13 = i10;
                if (!AbstractC2869v.m10303g(c0776h3.m2907g(), i13)) {
                    bVar2 = bVar;
                    i14 = i11;
                    i15 = i12;
                    list2 = list;
                    return new C0776h3(c9058e, c9147v3, i14, i15, z11, i13, interfaceC3175e, bVar2, list2, null);
                }
                i14 = i11;
                if (c0776h3.m2904d() != i14) {
                    bVar2 = bVar;
                    i15 = i12;
                    list2 = list;
                    return new C0776h3(c9058e, c9147v3, i14, i15, z11, i13, interfaceC3175e, bVar2, list2, null);
                }
                i15 = i12;
                if (c0776h3.m2905e() != i15 || !AbstractC1061t.m3842c(c0776h3.m2901a(), interfaceC3175e)) {
                    bVar2 = bVar;
                    list2 = list;
                    return new C0776h3(c9058e, c9147v3, i14, i15, z11, i13, interfaceC3175e, bVar2, list2, null);
                }
                list2 = list;
                if (AbstractC1061t.m3842c(c0776h3.m2908h(), list2)) {
                    bVar2 = bVar;
                    if (c0776h3.m2902b() == bVar2) {
                        return c0776h3;
                    }
                } else {
                    bVar2 = bVar;
                }
                return new C0776h3(c9058e, c9147v3, i14, i15, z11, i13, interfaceC3175e, bVar2, list2, null);
            }
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            z11 = z10;
        }
        i13 = i10;
        i14 = i11;
        i15 = i12;
        list2 = list;
        return new C0776h3(c9058e, c9147v3, i14, i15, z11, i13, interfaceC3175e, bVar2, list2, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C0776h3 m2947c(C0776h3 c0776h3, C9058e c9058e, C9147v3 c9147v3, InterfaceC3175e interfaceC3175e, AbstractC0042h.b bVar, boolean z10, int i10, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        if ((i13 & 64) != 0) {
            i10 = AbstractC2869v.f7516a.m10306a();
        }
        if ((i13 & 128) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & 256) != 0) {
            i12 = 1;
        }
        return m2946b(c0776h3, c9058e, c9147v3, interfaceC3175e, bVar, z10, i10, i11, i12, list);
    }
}
