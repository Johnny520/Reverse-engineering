package p000;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pd1 {

    /* JADX INFO: renamed from: a */
    public final Rect[][] f4813a;

    /* JADX INFO: renamed from: b */
    public final Rect[][] f4814b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pd1(be1 be1Var) {
        this.f4813a = new Rect[10][];
        this.f4814b = new Rect[10][];
        mo2693c(be1Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract be1 mo1693b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void mo2693c(be1 be1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo3219e = be1Var.f503a.mo3219e(i);
            int iM5416C = z60.m5416C(i);
            this.f4813a[iM5416C] = (Rect[]) listMo3219e.toArray(new Rect[listMo3219e.size()]);
            if (i != 8) {
                List<Rect> listMo3220f = be1Var.f503a.mo3220f(i);
                this.f4814b[iM5416C] = (Rect[]) listMo3220f.toArray(new Rect[listMo3220f.size()]);
            }
        }
    }

    public pd1() {
        this(new be1());
    }

    /* JADX INFO: renamed from: a */
    public final void m3024a() {
    }
}
