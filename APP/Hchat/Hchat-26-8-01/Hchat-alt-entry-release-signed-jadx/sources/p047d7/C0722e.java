package p047d7;

import p095g7.C1358b;
import p095g7.C1359c;
import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: d7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0722e extends AbstractC0729l {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f2158p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0722e(int i9, boolean z9) {
        super(z9);
        this.f2158p = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public final AbstractC2331a mo1892n() {
        switch (this.f2158p) {
            case 0:
                return new C0723f();
            default:
                C1358b c1358b = new C1358b(2, false);
                C1359c c1359c = new C1359c();
                C0719b c0719b = new C0719b(null, 0);
                c1358b.m6539P(c1359c);
                c1358b.m6539P(c0719b);
                return c1358b;
        }
    }
}
