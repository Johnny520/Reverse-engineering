package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sm0 implements ht2 {

    /* JADX INFO: renamed from: h */
    public final ht2 f10190h;

    public sm0(ht2 ht2Var) {
        ht2Var.getClass();
        this.f10190h = ht2Var;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return this.f10190h.mo889a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10190h.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f10190h + ')';
    }
}
