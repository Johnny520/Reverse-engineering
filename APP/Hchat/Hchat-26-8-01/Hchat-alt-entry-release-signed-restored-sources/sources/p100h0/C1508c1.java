package p100h0;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: h0.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1508c1 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C1511d1 f5017g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f5018h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1511d1 f5019i;

    /* JADX INFO: renamed from: j */
    public int f5020j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508c1(C1511d1 c1511d1, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f5019i = c1511d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f5018h = obj;
        this.f5020j |= Integer.MIN_VALUE;
        return this.f5019i.m4033s(this);
    }
}
