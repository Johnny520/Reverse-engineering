package yyds;

import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛷᲇᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1658 {
    static {
        AbstractC2328.m4341(-145740698125166L);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ArrayList m3377() {
        String string = AbstractC0027.m3912().getString(AbstractC2328.m4341(-145543129629550L), AbstractC2328.m4341(-145629028975470L));
        if (string == null) {
            string = AbstractC2328.m4341(-145633323942766L);
        }
        if (AbstractC0473.m1313(string)) {
            return new ArrayList();
        }
        List listM1296 = AbstractC0473.m1296(string, new String[]{AbstractC2328.m4341(-145637618910062L)}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM1296.iterator();
        while (it.hasNext()) {
            Integer numM1693 = AbstractC0733.m1693((String) it.next());
            if (numM1693 != null) {
                arrayList.add(numM1693);
            }
        }
        return new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final GradientDrawable m3378(int i, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(10.0f);
        gradientDrawable.setColor(i);
        if (z) {
            gradientDrawable.setStroke(4, -1);
            return gradientDrawable;
        }
        gradientDrawable.setStroke(1, 436207616);
        return gradientDrawable;
    }
}
