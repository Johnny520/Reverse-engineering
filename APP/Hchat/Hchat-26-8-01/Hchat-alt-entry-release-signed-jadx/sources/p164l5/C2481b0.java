package p164l5;

import p150k5.AbstractC2269t;
import p150k5.C2267r;

/* JADX INFO: renamed from: l5.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2481b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8123b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC2269t f8124c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2481b0(AbstractC2269t abstractC2269t, int i9, int i10) {
        this.f8122a = i10;
        this.f8124c = abstractC2269t;
        this.f8123b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5880a() {
        switch (this.f8122a) {
            case 0:
                return ((C2267r) this.f8124c).f7527h + this.f8123b;
            default:
                C2487e0 c2487e0 = ((C2485d0) this.f8124c).f8127g;
                return c2487e0.f8116a.f7532b.m579J((this.f8123b * 4) + c2487e0.f8118c + 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m5881b() {
        switch (this.f8122a) {
            case 0:
                C2483c0 c2483c0 = (C2483c0) ((C2267r) this.f8124c).f7528i;
                return c2483c0.f8116a.f7532b.m579J((this.f8123b * 4) + c2483c0.f8118c + 8);
            default:
                C2487e0 c2487e0 = ((C2485d0) this.f8124c).f8127g;
                return c2487e0.f8116a.f7532b.m579J((this.f8123b * 4) + (c2487e0.f8129d * 4) + c2487e0.f8118c + 4);
        }
    }
}
