package p133j2;

import android.text.Layout;
import gg.AbstractC1416l;

/* JADX INFO: renamed from: j2.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2059i {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f6912a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f6913b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC1416l.m3825a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC1416l.m3825a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f6912a = alignment;
        f6913b = alignment2;
    }
}
