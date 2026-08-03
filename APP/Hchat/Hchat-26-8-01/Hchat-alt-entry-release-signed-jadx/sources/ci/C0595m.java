package ci;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: ci.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0595m extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public long f1863g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f1864h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0601p f1865i;

    /* JADX INFO: renamed from: j */
    public int f1866j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0595m(C0601p c0601p, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f1865i = c0601p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f1864h = obj;
        this.f1866j |= Integer.MIN_VALUE;
        return this.f1865i.mo1615a(0L, null, this);
    }
}
