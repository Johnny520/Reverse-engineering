package p174m;

import gg.C1424t;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.j2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2617j2 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C1424t f8510g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f8511h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2637o2 f8512i;

    /* JADX INFO: renamed from: j */
    public int f8513j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2617j2(C2637o2 c2637o2, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8512i = c2637o2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8511h = obj;
        this.f8513j |= Integer.MIN_VALUE;
        return this.f8512i.m6088a(0L, this);
    }
}
