package p251r;

import p144k.EnumC2164d1;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6044i;

/* JADX INFO: renamed from: r.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3640y extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public EnumC2164d1 f11791g;

    /* JADX INFO: renamed from: h */
    public AbstractC6044i f11792h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f11793i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3641z f11794j;

    /* JADX INFO: renamed from: k */
    public int f11795k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3640y(C3641z c3641z, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f11794j = c3641z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f11793i = obj;
        this.f11795k |= Integer.MIN_VALUE;
        return this.f11794j.mo5459b(null, null, this);
    }
}
