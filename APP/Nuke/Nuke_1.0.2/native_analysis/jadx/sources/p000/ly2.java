package p000;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ly2 {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f6404a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f6405b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (t11.m5086l(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (t11.m5086l(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f6404a = alignment;
        f6405b = alignment2;
    }
}
