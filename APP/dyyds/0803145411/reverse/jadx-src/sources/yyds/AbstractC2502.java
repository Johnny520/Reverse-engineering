package yyds;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲇᛸᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2502 extends C2610 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f12316;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Rect[][] f12317;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final WindowInsets f12318;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Rect[][] f12319;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C1870 f12320;

    public AbstractC2502(C2693 c2693, WindowInsets windowInsets) {
        super(c2693);
        this.f12320 = null;
        this.f12319 = new Rect[10][];
        this.f12317 = new Rect[10][];
        this.f12318 = windowInsets;
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static boolean m4541(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    private static List<Rect> m4542(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC0476.m1325(i2)]) != null) {
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

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    private C0100 m4543(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f12816.f13242.mo4546()) {
            return C0100.m505(point.x, point.y, true, 0, 0, 0, 0);
        }
        C1489 c1489M4455 = AbstractC2408.m4455(display, 0);
        C1489 c1489M44552 = AbstractC2408.m4455(display, 1);
        C1489 c1489M44553 = AbstractC2408.m4455(display, 2);
        C1489 c1489M44554 = AbstractC2408.m4455(display, 3);
        return C0100.m505(point.x, point.y, false, c1489M4455 != null ? c1489M4455.f7034 : 0, c1489M44552 != null ? c1489M44552.f7034 : 0, c1489M44553 != null ? c1489M44553.f7034 : 0, c1489M44554 != null ? c1489M44554.f7034 : 0);
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    private Rect[] m4544(C1870 c1870) {
        ArrayList arrayList = new ArrayList();
        int i = c1870.f9413;
        int i2 = c1870.f9416;
        int i3 = c1870.f9415;
        int i4 = c1870.f9414;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c1870.f9413, 0));
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

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public abstract C1870 mo2800(int i);

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public List<Rect> mo1062(int i) {
        return m4542(this.f12319, i);
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public void mo4545(int i) {
        this.f12316 = i;
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean mo4546() {
        return this.f12318.isRound();
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public void mo4547(C1870[] c1870Arr) {
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ */
    public abstract C1870 mo2801(int i);

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public void mo4548(C0100 c0100) {
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public void mo4549(Rect[][] rectArr) {
        this.f12317 = (Rect[][]) rectArr.clone();
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public void mo4550(Rect[][] rectArr) {
        this.f12319 = (Rect[][]) rectArr.clone();
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public void mo2802(View view) {
        m4543(view);
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public void mo1063() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM1325 = AbstractC0476.m1325(i);
            this.f12319[iM1325] = m4544(mo2800(i));
            if (i != 8) {
                this.f12317[iM1325] = m4544(mo2801(i));
            }
        }
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C1870 mo4551() {
        C1870 c1870 = this.f12320;
        if (c1870 != null) {
            return c1870;
        }
        WindowInsets windowInsets = this.f12318;
        C1870 c1870M3654 = C1870.m3654(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.f12320 = c1870M3654;
        return c1870M3654;
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public void mo4552(C2693 c2693) {
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public List<Rect> mo1064(int i) {
        return m4542(this.f12317, i);
    }
}
