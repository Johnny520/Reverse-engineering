package p116i;

import gg.AbstractC1416l;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: i.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1735a1 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5772g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1765k1 f5773h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1735a1(C1765k1 c1765k1, int i9) {
        this.f5772g = i9;
        this.f5773h = c1765k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f5772g) {
            case 0:
                C1765k1 c1765k1 = this.f5773h;
                return Boolean.valueOf((AbstractC1416l.m3825a(c1765k1.f5892d.getValue(), c1765k1.m4414c()) && c1765k1.f5895g.m4564g() == Long.MIN_VALUE && !((Boolean) c1765k1.f5896h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f5773h.m4413b());
        }
    }
}
