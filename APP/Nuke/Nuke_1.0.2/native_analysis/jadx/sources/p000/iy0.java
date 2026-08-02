package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iy0 extends f21 {

    /* JADX INFO: renamed from: h */
    public int f4831h = -1;

    /* JADX INFO: renamed from: e */
    public final int m2415e() {
        int i = this.f4831h;
        if (i >= 0) {
            return i;
        }
        c80.m667j("index not yet set");
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final String m2416f() {
        return "[" + Integer.toHexString(this.f4831h) + ']';
    }

    /* JADX INFO: renamed from: g */
    public final void m2417g(int i) {
        if (this.f4831h == -1) {
            this.f4831h = i;
        } else {
            c80.m667j("index already set");
        }
    }
}
