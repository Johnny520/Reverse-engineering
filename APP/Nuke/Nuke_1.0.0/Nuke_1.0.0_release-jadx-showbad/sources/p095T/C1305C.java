package p095T;

import p076P.C1073T;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: T.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1305C extends AbstractC1384r0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4669b = 1;

    /* JADX INFO: renamed from: c */
    public final Object f4670c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305C(InterfaceC1599a interfaceC1599a) {
        super(interfaceC1599a);
        C1357e c1357e = C1357e.f4798j;
        this.f4670c = c1357e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1384r0
    /* JADX INFO: renamed from: a */
    public final C1386s0 mo2399a(Object obj) {
        switch (this.f4669b) {
            case 0:
                return new C1386s0(this, obj, obj == null, null, true);
            default:
                return new C1386s0(this, obj, obj == null, (InterfaceC1334Q0) this.f4670c, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.AbstractC1384r0
    /* JADX INFO: renamed from: b */
    public InterfaceC1345W0 mo2400b() {
        switch (this.f4669b) {
            case 0:
                return (C1307D) this.f4670c;
            default:
                return super.mo2400b();
        }
    }

    public C1305C(InterfaceC1601c interfaceC1601c) {
        super(new C1073T(5));
        this.f4670c = new C1307D(interfaceC1601c);
    }
}
