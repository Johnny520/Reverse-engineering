package p190k3;

import p095T.InterfaceC1339T0;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1670o;
import p117X2.AbstractC1676u;
import p137b3.InterfaceC1853a;
import p137b3.InterfaceC1855c;

/* JADX INFO: renamed from: k3.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2461i extends AbstractC1670o implements InterfaceC1855c, InterfaceC1599a {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f7941k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2461i(int i5, int i6, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i5);
        this.f7941k = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f7941k) {
            case 0:
                return this.f5693e.getClass().getSimpleName();
            default:
                return ((InterfaceC1339T0) this.f5693e).getValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117X2.AbstractC1658c
    /* JADX INFO: renamed from: c */
    public final InterfaceC1853a mo2975c() {
        AbstractC1676u.f5711a.getClass();
        return this;
    }
}
