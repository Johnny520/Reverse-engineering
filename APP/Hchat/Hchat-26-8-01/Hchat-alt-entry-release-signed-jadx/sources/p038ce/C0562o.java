package p038ce;

import ae.C0075f;
import java.util.function.Predicate;
import p000a.AbstractC0000a;
import p199nd.C2975h0;
import p302ud.C4305a;
import p302ud.C4310f;

/* JADX INFO: renamed from: ce.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0562o implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1752g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4305a f1753h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0562o(C4305a c4305a, int i9) {
        this.f1752g = i9;
        this.f1753h = c4305a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1752g) {
            case 0:
                return ((C2975h0) obj).f9737i == this.f1753h;
            case 1:
                return ((C2975h0) obj).f9736h == this.f1753h;
            case 2:
                return ((C4305a) obj) != this.f1753h;
            case 3:
                return ((C4310f) obj).f14387a == this.f1753h;
            default:
                return AbstractC0000a.m89s0(((C0075f) obj).f234c, this.f1753h);
        }
    }
}
