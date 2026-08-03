package p100h0;

import p370yf.AbstractC6038c;
import p371yg.C6046b;

/* JADX INFO: renamed from: h0.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1536m extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public CharSequence f5117g;

    /* JADX INFO: renamed from: h */
    public Object f5118h;

    /* JADX INFO: renamed from: i */
    public C6046b f5119i;

    /* JADX INFO: renamed from: j */
    public long f5120j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f5121k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1542p f5122l;

    /* JADX INFO: renamed from: m */
    public int f5123m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536m(C1542p c1542p, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f5122l = c1542p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f5121k = obj;
        this.f5123m |= Integer.MIN_VALUE;
        return C1542p.m4038a(this.f5122l, null, 0L, null, this);
    }
}
