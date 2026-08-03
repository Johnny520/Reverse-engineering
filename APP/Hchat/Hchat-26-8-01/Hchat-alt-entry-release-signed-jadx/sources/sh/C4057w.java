package sh;

import p174m.C2571a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: sh.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4057w extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public long f13416g;

    /* JADX INFO: renamed from: h */
    public long f13417h;

    /* JADX INFO: renamed from: i */
    public long f13418i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f13419j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2571a f13420k;

    /* JADX INFO: renamed from: l */
    public int f13421l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4057w(C2571a c2571a, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f13420k = c2571a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f13419j = obj;
        this.f13421l |= Integer.MIN_VALUE;
        return this.f13420k.mo1583m0(0L, 0L, this);
    }
}
