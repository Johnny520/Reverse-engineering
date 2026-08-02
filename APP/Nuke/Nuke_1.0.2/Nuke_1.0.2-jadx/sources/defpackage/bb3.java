package defpackage;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb3 extends yn0 implements in0 {
    public static final bb3 o = new bb3(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        viewParent.getClass();
        return viewParent.getParent();
    }
}
