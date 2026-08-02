package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0006a5 extends WeakReference {

    /* JADX INFO: renamed from: a */
    public final a51 f59a;

    /* JADX INFO: renamed from: b */
    public final boolean f60b;

    /* JADX INFO: renamed from: c */
    public d92 f61c;

    public C0006a5(a51 a51Var, hf0 hf0Var, ReferenceQueue referenceQueue) {
        super(hf0Var, referenceQueue);
        fg1.m1642q("Argument must not be null", a51Var);
        this.f59a = a51Var;
        boolean z = hf0Var.f3985h;
        this.f61c = null;
        this.f60b = z;
    }
}
