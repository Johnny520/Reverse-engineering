package yyds;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᛳᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1976 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Rect[][] f9906;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Rect[][] f9907;

    public AbstractC1976(C2693 c2693) {
        this.f9906 = new Rect[10][];
        this.f9907 = new Rect[10][];
        mo2968(c2693);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3808() {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public abstract C2693 mo1889();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public void mo2968(C2693 c2693) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo1062 = c2693.f13242.mo1062(i);
            int iM1325 = AbstractC0476.m1325(i);
            this.f9906[iM1325] = (Rect[]) listMo1062.toArray(new Rect[listMo1062.size()]);
            if (i != 8) {
                List<Rect> listMo1064 = c2693.f13242.mo1064(i);
                this.f9907[iM1325] = (Rect[]) listMo1064.toArray(new Rect[listMo1064.size()]);
            }
        }
    }

    public AbstractC1976() {
        this(new C2693());
    }
}
