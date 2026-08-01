package p001A0;

import p084Q2.AbstractC1178c;

/* JADX INFO: renamed from: A0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0103c extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f464g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0105e f465h;

    /* JADX INFO: renamed from: i */
    public int f466i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103c(C0105e c0105e, AbstractC1178c abstractC1178c) {
        super(abstractC1178c);
        this.f465h = c0105e;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f464g = obj;
        this.f466i |= Integer.MIN_VALUE;
        return this.f465h.m137a(0L, 0L, this);
    }
}
