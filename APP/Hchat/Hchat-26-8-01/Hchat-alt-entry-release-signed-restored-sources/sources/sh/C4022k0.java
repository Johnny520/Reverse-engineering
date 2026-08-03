package sh;

import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p222p.InterfaceC3252r1;
import p266s0.C3874d;
import p276sf.C3967n;

/* JADX INFO: renamed from: sh.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4022k0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13188g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3874d f13189h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1235p f13190i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1235p f13191j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1235p f13192k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f13193l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1235p f13194m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f13195n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1235p f13196o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C3874d f13197p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC3252r1 f13198q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4022k0(C3874d c3874d, InterfaceC1235p interfaceC1235p, InterfaceC1235p interfaceC1235p2, InterfaceC1235p interfaceC1235p3, int i9, InterfaceC1235p interfaceC1235p4, int i10, InterfaceC1235p interfaceC1235p5, InterfaceC3252r1 interfaceC3252r1, C3874d c3874d2, int i11) {
        this.f13189h = c3874d;
        this.f13190i = interfaceC1235p;
        this.f13191j = interfaceC1235p2;
        this.f13192k = interfaceC1235p3;
        this.f13193l = i9;
        this.f13194m = interfaceC1235p4;
        this.f13195n = i10;
        this.f13196o = interfaceC1235p5;
        this.f13198q = interfaceC3252r1;
        this.f13197p = c3874d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13188g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4037p0.m8236b(this.f13189h, this.f13190i, this.f13191j, this.f13192k, this.f13193l, this.f13194m, this.f13195n, this.f13196o, this.f13198q, this.f13197p, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            default:
                C4003e0 c4003e0 = (C4003e0) this.f13198q;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4037p0.m8236b(this.f13189h, this.f13190i, this.f13191j, this.f13192k, this.f13193l, this.f13194m, this.f13195n, this.f13196o, c4003e0, this.f13197p, c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4022k0(C3874d c3874d, InterfaceC1235p interfaceC1235p, InterfaceC1235p interfaceC1235p2, InterfaceC1235p interfaceC1235p3, int i9, InterfaceC1235p interfaceC1235p4, int i10, InterfaceC1235p interfaceC1235p5, C4003e0 c4003e0, C3874d c3874d2) {
        this.f13189h = c3874d;
        this.f13190i = interfaceC1235p;
        this.f13191j = interfaceC1235p2;
        this.f13192k = interfaceC1235p3;
        this.f13193l = i9;
        this.f13194m = interfaceC1235p4;
        this.f13195n = i10;
        this.f13196o = interfaceC1235p5;
        this.f13198q = c4003e0;
        this.f13197p = c3874d2;
    }
}
