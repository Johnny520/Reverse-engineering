package p000;

/* JADX INFO: renamed from: gp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0248gp implements dl0 {

    /* JADX INFO: renamed from: a */
    public static final C0248gp f3644a = new C0248gp();

    /* JADX INFO: renamed from: b */
    public static Boolean f3645b;

    @Override // p000.dl0
    /* JADX INFO: renamed from: c */
    public final boolean mo1054c() {
        Boolean bool = f3645b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw vi0.m5686e("canFocus is read before it is written");
    }

    @Override // p000.dl0
    /* JADX INFO: renamed from: d */
    public final void mo1055d(boolean z) {
        f3645b = Boolean.valueOf(z);
    }
}
