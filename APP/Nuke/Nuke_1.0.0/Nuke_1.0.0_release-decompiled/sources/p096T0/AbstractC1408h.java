package p096T0;

import android.text.Layout;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1408h {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f5036a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f5037b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC1665j.m2981a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC1665j.m2981a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f5036a = alignment;
        f5037b = alignment2;
    }
}
