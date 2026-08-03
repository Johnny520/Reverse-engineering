package p267s1;

import p249qg.C3560e1;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: s1.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3900i0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C3560e1 f12791g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f12792h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3904k0 f12793i;

    /* JADX INFO: renamed from: j */
    public int f12794j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3900i0(C3904k0 c3904k0, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f12793i = c3904k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f12792h = obj;
        this.f12794j |= Integer.MIN_VALUE;
        return this.f12793i.m8100C(0L, null, this);
    }
}
