package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o22 {

    /* JADX INFO: renamed from: a */
    public final List f7449a;

    /* JADX INFO: renamed from: b */
    public final List[] f7450b;

    /* JADX INFO: renamed from: c */
    public int f7451c;

    /* JADX INFO: renamed from: d */
    public int f7452d;

    /* JADX INFO: renamed from: e */
    public boolean f7453e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ p22 f7454f;

    public o22(p22 p22Var, List list) {
        this.f7454f = p22Var;
        this.f7449a = list;
        this.f7450b = new List[list.size()];
        if (list.isEmpty()) {
            nz0.m3456a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
