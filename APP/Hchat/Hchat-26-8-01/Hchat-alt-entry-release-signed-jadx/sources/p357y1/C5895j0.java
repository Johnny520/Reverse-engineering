package p357y1;

import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: y1.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5895j0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f23956g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5899k0 f23957h;

    /* JADX INFO: renamed from: i */
    public int f23958i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5895j0(C5899k0 c5899k0, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f23957h = c5899k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f23956g = obj;
        this.f23958i |= Integer.MIN_VALUE;
        this.f23957h.m10616a(null, this);
        return EnumC5799a.f23547g;
    }
}
