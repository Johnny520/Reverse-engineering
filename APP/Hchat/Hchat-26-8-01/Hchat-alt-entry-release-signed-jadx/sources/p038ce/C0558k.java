package p038ce;

import java.util.function.Consumer;
import md.C2825b;
import md.EnumC2824a;
import p000a.AbstractC0000a;
import p199nd.C2988t;
import p302ud.C4305a;

/* JADX INFO: renamed from: ce.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0558k implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4305a f1747b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0558k(C4305a c4305a, int i9) {
        this.f1746a = i9;
        this.f1747b = c4305a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C4305a c4305a = (C4305a) obj;
        switch (this.f1746a) {
            case 0:
                C4305a c4305a2 = this.f1747b;
                if (c4305a2.f14355p.get(c4305a.f14349j) || c4305a2 == c4305a) {
                    c4305a.m6231w(EnumC2824a.f9155k);
                    c4305a2.m6231w(EnumC2824a.f9157l);
                    C2988t c2988t = new C2988t(AbstractC0000a.m29P(c4305a, c4305a2), c4305a, c4305a2);
                    C2825b c2825b = C2825b.f9211z;
                    c4305a.m6232x(c2825b, c2988t);
                    c4305a2.m6232x(c2825b, c2988t);
                }
                break;
            default:
                c4305a.f14353n.remove(this.f1747b);
                c4305a.m8642H();
                break;
        }
    }
}
