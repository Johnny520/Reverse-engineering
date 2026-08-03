package p357y1;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import gg.AbstractC1416l;
import p267s1.C3883a;
import p267s1.InterfaceC3911q;

/* JADX INFO: renamed from: y1.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5875e0 {

    /* JADX INFO: renamed from: a */
    public static final C5875e0 f23848a = new C5875e0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10579a(View view, InterfaceC3911q interfaceC3911q) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC3911q instanceof C3883a ? PointerIcon.getSystemIcon(context, ((C3883a) interfaceC3911q).f12740b) : PointerIcon.getSystemIcon(context, 1000);
        if (AbstractC1416l.m3825a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
