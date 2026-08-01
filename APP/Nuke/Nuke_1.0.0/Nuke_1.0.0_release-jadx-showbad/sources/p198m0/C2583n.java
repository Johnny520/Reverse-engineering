package p198m0;

import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p117X2.C1675t;

/* JADX INFO: renamed from: m0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2583n extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1675t f8220e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f8221f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2583n(C1675t c1675t, int i5) {
        super(1);
        this.f8220e = c1675t;
        this.f8221f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((C2567A) obj).m4490Q0(this.f8221f));
        this.f8220e.f5710e = boolValueOf;
        return boolValueOf;
    }
}
