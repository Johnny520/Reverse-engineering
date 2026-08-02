package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o22 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ p22 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o22(p22 p22Var, List list) {
        this.f = p22Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            nz0.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
