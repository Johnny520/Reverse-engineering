package p335x2;

import android.text.Layout;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: x2.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9325f1 {

    /* JADX INFO: renamed from: a */
    public static final C9325f1 f31902a = new C9325f1();

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f31903b;

    /* JADX INFO: renamed from: c */
    public static final Layout.Alignment f31904c;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC1061t.m3842c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC1061t.m3842c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f31903b = alignment;
        f31904c = alignment2;
    }

    /* JADX INFO: renamed from: a */
    public final Layout.Alignment m36328a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : f31904c : f31903b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
