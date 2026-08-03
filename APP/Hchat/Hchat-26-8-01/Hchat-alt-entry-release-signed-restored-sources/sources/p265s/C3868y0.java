package p265s;

import java.util.List;
import p201o.AbstractC3026b;

/* JADX INFO: renamed from: s.y0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3868y0 {

    /* JADX INFO: renamed from: a */
    public final List f12678a;

    /* JADX INFO: renamed from: b */
    public final List[] f12679b;

    /* JADX INFO: renamed from: c */
    public int f12680c;

    /* JADX INFO: renamed from: d */
    public int f12681d;

    /* JADX INFO: renamed from: e */
    public boolean f12682e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3870z0 f12683f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3868y0(C3870z0 c3870z0, List list) {
        this.f12683f = c3870z0;
        this.f12678a = list;
        this.f12679b = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC3026b.m6428a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
