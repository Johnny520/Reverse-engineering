package p150k5;

import p193n5.C2897d;
import p193n5.C2898e;
import p207o5.AbstractC3050e;

/* JADX INFO: renamed from: k5.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2274y extends AbstractC2269t {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7566g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7567h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7568i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f7569j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2274y(Object obj, int i9, int i10, int i11) {
        this.f7566g = i11;
        this.f7569j = obj;
        this.f7567h = i9;
        this.f7568i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p150k5.AbstractC2269t
    /* JADX INFO: renamed from: a */
    public final Object mo5496a(int i9) {
        switch (this.f7566g) {
            case 0:
                C2270u c2270u = ((C2275z) this.f7569j).f7570j;
                return c2270u.f7549s.m5521b(c2270u.f7532b.m585P((i9 * 2) + this.f7567h));
            case 1:
                C2270u c2270u2 = ((C2897d) this.f7569j).f9359j;
                return c2270u2.f7549s.m5521b(c2270u2.f7532b.m585P((i9 * 2) + this.f7567h));
            case 2:
                C2270u c2270u3 = ((C2898e) this.f7569j).f9361j;
                return c2270u3.f7549s.m5521b(c2270u3.f7532b.m585P((i9 * 2) + this.f7567h));
            default:
                C2270u c2270u4 = (C2270u) this.f7569j;
                return AbstractC3050e.m6493a(c2270u4, c2270u4.f7532b.m583N((i9 * 4) + this.f7567h + 4));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f7566g) {
        }
        return this.f7568i;
    }
}
