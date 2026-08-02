package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m6 implements Runnable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        lk1 lk1Var = b7.X0;
        synchronized (lk1Var) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = lk1Var.a;
                int i2 = lk1Var.b;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        b7 b7Var = (b7) objArr[i3];
                        boolean showLayoutBounds = b7Var.getShowLayoutBounds();
                        Class cls = b7.U0;
                        b7Var.setShowLayoutBounds(gf1.w());
                        if (showLayoutBounds != b7Var.getShowLayoutBounds()) {
                            b7Var.post(new k6(b7Var, 2));
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        b7 b7Var2 = (b7) objArr[i3];
                        b7Var2.post(new k6(b7Var2, 3));
                        i3++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
