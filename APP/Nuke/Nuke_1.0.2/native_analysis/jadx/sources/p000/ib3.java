package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface ib3 {
    /* JADX INFO: renamed from: a */
    default fb3 mo2139a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* JADX INFO: renamed from: b */
    default fb3 mo2140b(Class cls, wj1 wj1Var) {
        return mo2139a(cls);
    }

    /* JADX INFO: renamed from: c */
    fb3 mo2319c(C0067bt c0067bt, wj1 wj1Var);
}
