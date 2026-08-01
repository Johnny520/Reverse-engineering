package p076P;

import java.util.LinkedHashMap;
import java.util.Map;
import p029F0.AbstractC0391b0;
import p029F0.C0410l;
import p029F0.C0419p0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p153e1.C2010f;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: P.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1064J extends AbstractC2206o implements InterfaceC0595h, InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public LinkedHashMap f3316r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        float f2 = ((C2010f) AbstractC0601k.m1032h(this, AbstractC1059E.f3303c)).f6732d;
        float f5 = 0;
        if (f2 < f5) {
            f2 = f5;
        }
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
        boolean z5 = this.f7199q && !Float.isNaN(f2) && C2010f.m3695a(f2, f5) > 0;
        int iMo270S = !Float.isNaN(f2) ? interfaceC0379Q.mo270S(f2) : 0;
        int iMax = z5 ? Math.max(abstractC0391b0Mo648e.f1206d, iMo270S) : abstractC0391b0Mo648e.f1206d;
        int iMax2 = z5 ? Math.max(abstractC0391b0Mo648e.f1207e, iMo270S) : abstractC0391b0Mo648e.f1207e;
        if (z5) {
            LinkedHashMap linkedHashMap = this.f3316r;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f3316r = linkedHashMap;
            }
            C0419p0 c0419p0 = AbstractC1059E.f3302b;
            int iRound = Math.round((iMo270S - abstractC0391b0Mo648e.f1206d) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(c0419p0, Integer.valueOf(iRound));
            C0410l c0410l = AbstractC1059E.f3301a;
            int iRound2 = Math.round((iMo270S - abstractC0391b0Mo648e.f1207e) / 2.0f);
            linkedHashMap.put(c0410l, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f3316r;
        if (map == null) {
            map = C0982v.f3048d;
        }
        return interfaceC0379Q.mo604f0(iMax, iMax2, map, new C1063I(iMax, iMax2, abstractC0391b0Mo648e));
    }
}
