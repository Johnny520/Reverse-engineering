package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qd1 extends yd1 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets f5126c;

    /* JADX INFO: renamed from: d */
    public i20 f5127d;

    /* JADX INFO: renamed from: e */
    public int f5128e;

    /* JADX INFO: renamed from: f */
    public Rect[][] f5129f;

    /* JADX INFO: renamed from: g */
    public Rect[][] f5130g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qd1(be1 be1Var, WindowInsets windowInsets) {
        super(be1Var);
        this.f5127d = null;
        this.f5129f = new Rect[10][];
        this.f5130g = new Rect[10][];
        this.f5126c = windowInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m3215A(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    private C0438lo m3216x(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f7613a.f503a.mo3226p()) {
            return C0438lo.m2029a(point.x, point.y, true, 0, 0, 0, 0);
        }
        cw0 cw0VarM2779s = o30.m2779s(display, 0);
        cw0 cw0VarM2779s2 = o30.m2779s(display, 1);
        cw0 cw0VarM2779s3 = o30.m2779s(display, 2);
        cw0 cw0VarM2779s4 = o30.m2779s(display, 3);
        return C0438lo.m2029a(point.x, point.y, false, cw0VarM2779s != null ? cw0VarM2779s.f905b : 0, cw0VarM2779s2 != null ? cw0VarM2779s2.f905b : 0, cw0VarM2779s3 != null ? cw0VarM2779s3.f905b : 0, cw0VarM2779s4 != null ? cw0VarM2779s4.f905b : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    private static List<Rect> m3217y(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[z60.m5416C(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private Rect[] m3218z(i20 i20Var) {
        ArrayList arrayList = new ArrayList();
        int i = i20Var.f2404a;
        int i2 = i20Var.f2407d;
        int i3 = i20Var.f2406c;
        int i4 = i20Var.f2405b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, i20Var.f2404a, 0));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, 0, i4));
        }
        if (i3 != 0) {
            arrayList.add(new Rect(0 - i3, 0, 0, 0));
        }
        if (i2 != 0) {
            arrayList.add(new Rect(0, 0 - i2, 0, 0));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: e */
    public List<Rect> mo3219e(int i) {
        return m3217y(this.f5129f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: f */
    public List<Rect> mo3220f(int i) {
        return m3217y(this.f5130g, i);
    }

    @Override // p000.yd1
    /* JADX INFO: renamed from: h */
    public abstract i20 mo3221h(int i);

    @Override // p000.yd1
    /* JADX INFO: renamed from: i */
    public abstract i20 mo3222i(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: k */
    public final i20 mo3223k() {
        if (this.f5127d == null) {
            WindowInsets windowInsets = this.f5126c;
            this.f5127d = i20.m1512a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f5127d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: l */
    public void mo3224l(View view) {
        m3216x(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: m */
    public void mo3225m() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM5416C = z60.m5416C(i);
            this.f5129f[iM5416C] = m3218z(mo3221h(i));
            if (i != 8) {
                this.f5130g[iM5416C] = m3218z(mo3222i(i));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: p */
    public boolean mo3226p() {
        return this.f5126c.isRound();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: u */
    public void mo3230u(int i) {
        this.f5128e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: v */
    public void mo3231v(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f5129f = (Rect[][]) rectArr.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: w */
    public void mo3232w(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f5130g = (Rect[][]) rectArr.clone();
    }

    @Override // p000.yd1
    /* JADX INFO: renamed from: r */
    public void mo3227r(C0438lo c0438lo) {
    }

    @Override // p000.yd1
    /* JADX INFO: renamed from: s */
    public void mo3228s(i20[] i20VarArr) {
    }

    @Override // p000.yd1
    /* JADX INFO: renamed from: t */
    public void mo3229t(be1 be1Var) {
    }
}
