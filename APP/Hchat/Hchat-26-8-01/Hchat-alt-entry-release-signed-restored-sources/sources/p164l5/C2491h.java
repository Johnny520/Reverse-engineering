package p164l5;

import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p074f5.C1072h;
import p150k5.C2270u;
import p219oh.AbstractC3165h;
import p283t5.InterfaceC4121d;
import p283t5.InterfaceC4125h;
import p312v5.InterfaceC4479b;

/* JADX INFO: renamed from: l5.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2491h extends AbstractC2479a0 implements InterfaceC4125h, InterfaceC4121d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4125h
    /* JADX INFO: renamed from: a */
    public final InterfaceC4479b mo5888a() {
        C2270u c2270u = this.f8116a;
        C0119x c0119x = c2270u.f7532b;
        int i9 = this.f8118c;
        int iM585P = c0119x.m585P(i9 + 2);
        try {
            int iM584O = (c2270u.f7532b.m584O(i9 + 1) >>> 6) + 1;
            if (iM584O < 0 || iM584O > 4) {
                throw new C1072h(iM584O);
            }
            return AbstractC3165h.m6762N(c2270u, iM584O, iM585P);
        } catch (C1072h e6) {
            return new C0016a(iM585P, 6, e6);
        }
    }
}
