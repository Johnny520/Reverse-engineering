package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class of3 implements nf3 {
    public final f70 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public of3() {
        this.b = Build.VERSION.SDK_INT >= 34 ? g70.h : sn.E;
        eu.w(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
