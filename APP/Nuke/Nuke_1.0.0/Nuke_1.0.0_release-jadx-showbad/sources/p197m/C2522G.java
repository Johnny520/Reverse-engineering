package p197m;

import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p211o0.C2735J;

/* JADX INFO: renamed from: m.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2522G extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f8061e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1599a f8062f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2522G(boolean z5, InterfaceC1599a interfaceC1599a) {
        super(1);
        this.f8061e = z5;
        this.f8062f = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        ((C2735J) obj).m4795i(!this.f8061e && ((Boolean) this.f8062f.mo6a()).booleanValue());
        return C0891q.f2780a;
    }
}
