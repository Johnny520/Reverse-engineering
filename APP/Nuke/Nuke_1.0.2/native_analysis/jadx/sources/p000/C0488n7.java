package p000;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: n7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0488n7 {

    /* JADX INFO: renamed from: a */
    public static final C0488n7 f7029a = new C0488n7();

    /* JADX INFO: renamed from: a */
    public final void m3252a(View view, m12 m12Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = m12Var instanceof C0270ha ? PointerIcon.getSystemIcon(context, ((C0270ha) m12Var).f3929b) : PointerIcon.getSystemIcon(context, 1000);
        if (t11.m5086l(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
