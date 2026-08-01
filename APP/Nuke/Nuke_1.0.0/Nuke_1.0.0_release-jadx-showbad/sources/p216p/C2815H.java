package p216p;

import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2732G;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: p.H */
/* JADX INFO: loaded from: classes.dex */
public final class C2815H implements InterfaceC2738M {

    /* JADX INFO: renamed from: b */
    public static final C2815H f8866b = new C2815H(0);

    /* JADX INFO: renamed from: c */
    public static final C2815H f8867c = new C2815H(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8868a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [p.H.<clinit>():void] */
    public /* synthetic */ C2815H(int i5) {
        this.f8868a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p211o0.InterfaceC2738M
    /* JADX INFO: renamed from: a */
    public final AbstractC2767z mo1116a(long j5, EnumC2017m enumC2017m, InterfaceC2007c interfaceC2007c) {
        switch (this.f8868a) {
            case 0:
                float fMo270S = interfaceC2007c.mo270S(AbstractC2867x.f9055a);
                return new C2732G(new C2684c(0.0f, -fMo270S, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)) + fMo270S));
            default:
                float fMo270S2 = interfaceC2007c.mo270S(AbstractC2867x.f9055a);
                return new C2732G(new C2684c(-fMo270S2, 0.0f, Float.intBitsToFloat((int) (j5 >> 32)) + fMo270S2, Float.intBitsToFloat((int) (j5 & 4294967295L))));
        }
    }
}
