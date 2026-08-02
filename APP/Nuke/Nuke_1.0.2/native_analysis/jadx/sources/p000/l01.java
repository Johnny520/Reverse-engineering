package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l01 extends AbstractC0738tl {

    /* JADX INFO: renamed from: i */
    public Object f5866i;

    /* JADX INFO: renamed from: e0 */
    public final void m2781e0(Object obj) {
        if (this.f5866i == null) {
            this.f5866i = obj;
            return;
        }
        throw new IllegalStateException(("Instance already set for this resolver \"" + getClass() + "\" of \"" + mo2762H() + "(" + this.f5866i + ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver.").toString());
    }

    /* JADX INFO: renamed from: f0 */
    public abstract l01 mo2782f0(Object obj);
}
