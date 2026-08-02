package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 extends z32 implements u41, v41 {
    public pk1(String str, String str2) {
        super(C0026ap.f317h, xn2.class, str, str2, 1);
    }

    @Override // p000.AbstractC0063bp
    /* JADX INFO: renamed from: d */
    public final p41 mo581d() {
        d72.f1901a.getClass();
        return this;
    }

    @Override // p000.u41
    public final Object get(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final void m3869i() {
        if (this.f13711n) {
            c80.m676t("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return;
        }
        p41 p41VarM6382h = m6382h();
        if (p41VarM6382h == this) {
            throw new n20("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((pk1) ((v41) p41VarM6382h)).m3869i();
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        m3869i();
        throw null;
    }
}
