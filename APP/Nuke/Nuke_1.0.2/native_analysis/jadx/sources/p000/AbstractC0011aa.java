package p000;

import android.graphics.Path;

/* JADX INFO: renamed from: aa */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0011aa {
    /* JADX INFO: renamed from: a */
    public static final C0915y9 m117a() {
        return new C0915y9(new Path());
    }

    /* JADX INFO: renamed from: b */
    public static final Path.Direction m118b(ux1 ux1Var) {
        int iOrdinal = ux1Var.ordinal();
        if (iOrdinal == 0) {
            return Path.Direction.CCW;
        }
        if (iOrdinal == 1) {
            return Path.Direction.CW;
        }
        c80.m675s();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m119c(String str) {
        throw new IllegalStateException(str);
    }
}
