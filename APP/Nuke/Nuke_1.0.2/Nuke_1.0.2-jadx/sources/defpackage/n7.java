package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n7 {
    public static final n7 a = new n7();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(View view, m12 m12Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = m12Var instanceof ha ? PointerIcon.getSystemIcon(context, ((ha) m12Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (t11.l(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
