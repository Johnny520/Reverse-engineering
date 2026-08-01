package p047I0;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import p007B0.C0187a;
import p007B0.InterfaceC0206t;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: I0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0677J {

    /* JADX INFO: renamed from: a */
    public static final C0677J f2157a = new C0677J();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1175a(View view, InterfaceC0206t interfaceC0206t) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC0206t instanceof C0187a ? PointerIcon.getSystemIcon(context, ((C0187a) interfaceC0206t).f657b) : PointerIcon.getSystemIcon(context, 1000);
        if (AbstractC1665j.m2981a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
