package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a5 extends WeakReference {
    public final a51 a;
    public final boolean b;
    public d92 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a5(a51 a51Var, hf0 hf0Var, ReferenceQueue referenceQueue) {
        super(hf0Var, referenceQueue);
        fg1.q("Argument must not be null", a51Var);
        this.a = a51Var;
        boolean z = hf0Var.h;
        this.c = null;
        this.b = z;
    }
}
