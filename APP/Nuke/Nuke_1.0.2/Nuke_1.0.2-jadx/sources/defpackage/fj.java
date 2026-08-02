package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fj {
    public final ArrayList a;
    public boolean b;
    public final CopyOnWriteArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fj(boolean z) {
        this.a = new ArrayList();
        this.b = z;
        this.c = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fj(v3 v3Var) {
        this(false);
        this.d = 0;
        this.e = v3Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fj(g8 g8Var) {
        this(true);
        this.d = 1;
        this.e = g8Var;
    }

    public final void a() {
    }

    public final void b(dj djVar) {
    }

    public final void c(dj djVar) {
    }
}
