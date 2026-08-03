package p117i0;

import p085fg.InterfaceC1231l;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i0.k1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1849k1 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public InterfaceC1231l f6149g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f6150h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1819d f6151i;

    /* JADX INFO: renamed from: j */
    public int f6152j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1849k1(C1819d c1819d, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f6151i = c1819d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f6150h = obj;
        this.f6152j |= Integer.MIN_VALUE;
        return this.f6151i.m4458d(null, this);
    }
}
