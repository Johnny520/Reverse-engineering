package p164l5;

import androidx.lifecycle.C0119x;
import p150k5.AbstractC2269t;

/* JADX INFO: renamed from: l5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2478a extends AbstractC2269t {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2480b f8112g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8113h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8114i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2480b f8115j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2478a(C2480b c2480b, int i9, int i10) {
        this.f8113h = i10;
        this.f8115j = c2480b;
        this.f8114i = i9;
        this.f8112g = c2480b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p150k5.AbstractC2269t
    /* JADX INFO: renamed from: a */
    public final Object mo5496a(int i9) {
        switch (this.f8113h) {
            case 0:
                C0119x c0119x = this.f8115j.f8116a.f7532b;
                return Integer.valueOf(((byte[]) c0119x.f310h)[this.f8114i + i9]);
            case 1:
                return Integer.valueOf(this.f8115j.f8116a.f7532b.m582M((i9 * 2) + this.f8114i));
            case 2:
                return Integer.valueOf(this.f8115j.f8116a.f7532b.m579J((i9 * 4) + this.f8114i));
            default:
                return Long.valueOf(this.f8115j.f8116a.f7532b.m580K((i9 * 8) + this.f8114i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8112g.f8121e;
    }
}
