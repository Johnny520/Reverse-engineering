package be;

import java.util.Map;
import java.util.function.Predicate;
import p020b5.C0192k;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.InterfaceC4316l;

/* JADX INFO: renamed from: be.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0282g0 implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f822g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4309e f823h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0282g0(C4309e c4309e, int i9) {
        this.f822g = i9;
        this.f823h = c4309e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f822g) {
            case 0:
                C4322r c4322r = (C4322r) obj;
                return c4322r.m8698W() && c4322r.f14411l.equals(this.f823h);
            case 1:
                C4311g c4311g = (C4311g) obj;
                C0192k c0192k = c4311g.f14391m;
                int[] iArr = {1, 8, 16};
                c0192k.getClass();
                int i9 = 0;
                while (true) {
                    if (i9 < 3) {
                        if ((iArr[i9] & c0192k.f488b) != 0) {
                            i9++;
                        }
                    } else if (c4311g.f14390l.f10148i.equals(this.f823h.f14373m.f10138g)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return ((String) obj).equals(this.f823h.m8655Z());
            default:
                InterfaceC4316l interfaceC4316l = (InterfaceC4316l) ((Map.Entry) obj).getValue();
                if (interfaceC4316l instanceof C4311g) {
                    return ((C4311g) interfaceC4316l).f14389k.equals(this.f823h);
                }
                return false;
        }
    }
}
