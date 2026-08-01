package p111ha;

import la.AbstractC4726f;
import la.C4728h;
import la.InterfaceC4724d;
import ma.AbstractC5140a;
import na.AbstractC5529d;
import na.C5533h;
import p111ha.C2905a0;
import p143ja.C3782o;
import qa.AbstractC6353j;

/* JADX INFO: renamed from: ha.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2914f {
    /* JADX INFO: renamed from: a */
    public static final C2905a0 m10604a(C3782o c3782o, InterfaceC4724d interfaceC4724d, C4728h c4728h, boolean z10, boolean z11, boolean z12) {
        c3782o.getClass();
        interfaceC4724d.getClass();
        c4728h.getClass();
        AbstractC6353j.f fVar = AbstractC5140a.f15652d;
        fVar.getClass();
        AbstractC5140a.d dVar = (AbstractC5140a.d) AbstractC4726f.m18872a(c3782o, fVar);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            AbstractC5529d.a aVarM22552c = C5533h.f17305a.m22552c(c3782o, interfaceC4724d, c4728h, z12);
            if (aVarM22552c == null) {
                return null;
            }
            return C2905a0.f7654b.m10555b(aVarM22552c);
        }
        if (!z11 || !dVar.m21055I()) {
            return null;
        }
        C2905a0.a aVar = C2905a0.f7654b;
        AbstractC5140a.c cVarM21050D = dVar.m21050D();
        cVarM21050D.getClass();
        return aVar.m10556c(interfaceC4724d, cVarM21050D);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2905a0 m10605b(C3782o c3782o, InterfaceC4724d interfaceC4724d, C4728h c4728h, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return m10604a(c3782o, interfaceC4724d, c4728h, z10, z11, z12);
    }
}
