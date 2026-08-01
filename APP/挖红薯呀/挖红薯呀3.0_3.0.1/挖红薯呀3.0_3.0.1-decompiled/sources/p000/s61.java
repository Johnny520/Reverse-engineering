package p000;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s61 {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f5660a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f5661b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (p30.m3002l(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (p30.m3002l(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f5660a = alignment;
        f5661b = alignment2;
    }
}
