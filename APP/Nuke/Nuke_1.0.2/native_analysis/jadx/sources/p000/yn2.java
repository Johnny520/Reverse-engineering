package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yn2 {

    /* JADX INFO: renamed from: a */
    public final String f13533a;

    /* JADX INFO: renamed from: b */
    public final mn0 f13534b;

    /* JADX INFO: renamed from: c */
    public final boolean f13535c;

    public yn2(String str, mn0 mn0Var) {
        this.f13533a = str;
        this.f13534b = mn0Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f13533a;
    }

    public /* synthetic */ yn2(String str) {
        this(str, un2.f11380p);
    }

    public yn2(String str, int i) {
        this(str);
        this.f13535c = true;
    }

    public yn2(String str, boolean z, mn0 mn0Var) {
        this(str, mn0Var);
        this.f13535c = z;
    }
}
