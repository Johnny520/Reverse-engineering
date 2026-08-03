package p158l;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p332wb.C5491y2;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: l.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2417h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7913g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f7914h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f7915i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC5853o f7916j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1220a f7917k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f7918l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f7919m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f7920n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2417h(int i9, InterfaceC1220a interfaceC1220a, String str, String str2, C5491y2 c5491y2, InterfaceC5853o interfaceC5853o, boolean z9) {
        this.f7919m = c5491y2;
        this.f7914h = str;
        this.f7920n = str2;
        this.f7915i = z9;
        this.f7916j = interfaceC5853o;
        this.f7917k = interfaceC1220a;
        this.f7918l = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7913g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2418i.m5755c(this.f7914h, this.f7915i, (C2413d) this.f7919m, this.f7916j, (InterfaceC1236q) this.f7920n, this.f7917k, (C1836h0) obj, AbstractC1874r.m4617C(this.f7918l | 1));
                break;
            default:
                C5491y2 c5491y2 = (C5491y2) this.f7919m;
                String str = (String) this.f7920n;
                ((Integer) obj2).getClass();
                c5491y2.m9898j0(AbstractC1874r.m4617C(this.f7918l | 1), this.f7917k, (C1836h0) obj, this.f7914h, str, this.f7916j, this.f7915i);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C2417h(String str, boolean z9, C2413d c2413d, InterfaceC5853o interfaceC5853o, InterfaceC1236q interfaceC1236q, InterfaceC1220a interfaceC1220a, int i9) {
        this.f7914h = str;
        this.f7915i = z9;
        this.f7919m = c2413d;
        this.f7916j = interfaceC5853o;
        this.f7920n = interfaceC1236q;
        this.f7917k = interfaceC1220a;
        this.f7918l = i9;
    }
}
