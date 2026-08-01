package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class as0 {

    /* JADX INFO: renamed from: a */
    public final List f254a;

    /* JADX INFO: renamed from: b */
    public final List[] f255b;

    /* JADX INFO: renamed from: c */
    public int f256c;

    /* JADX INFO: renamed from: d */
    public int f257d;

    /* JADX INFO: renamed from: e */
    public boolean f258e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ bs0 f259f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public as0(bs0 bs0Var, List list) {
        this.f259f = bs0Var;
        this.f254a = list;
        this.f255b = new List[list.size()];
        if (list.isEmpty()) {
            z10.m5361a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
