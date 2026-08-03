package p000;

/* JADX INFO: renamed from: GC */
/* JADX INFO: loaded from: classes.dex */
public final class C0271GC extends AbstractC0233Fb {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f876d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0357IC f877e;

    /* JADX INFO: renamed from: f */
    public int f878f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0271GC(C0357IC c0357ic, AbstractC0233Fb abstractC0233Fb) {
        super(abstractC0233Fb);
        this.f877e = c0357ic;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) {
        this.f876d = obj;
        this.f878f |= Integer.MIN_VALUE;
        return C0357IC.m789a(this.f877e, this);
    }
}
