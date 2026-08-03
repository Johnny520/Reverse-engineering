package p277t;

import p057e1.C0808c;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: t.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4070b extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C0808c f13494g;

    /* JADX INFO: renamed from: h */
    public Object[] f13495h;

    /* JADX INFO: renamed from: i */
    public int f13496i;

    /* JADX INFO: renamed from: j */
    public int f13497j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f13498k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4071c f13499l;

    /* JADX INFO: renamed from: m */
    public int f13500m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4070b(C4071c c4071c, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f13499l = c4071c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f13498k = obj;
        this.f13500m |= Integer.MIN_VALUE;
        return this.f13499l.m8260a(null, this);
    }
}
