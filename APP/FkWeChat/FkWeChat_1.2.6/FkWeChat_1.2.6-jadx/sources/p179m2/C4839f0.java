package p179m2;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import p024b9.AbstractC1061t;
import p073f2.C2227a;
import p073f2.InterfaceC2277y;

/* JADX INFO: renamed from: m2.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4839f0 {

    /* JADX INFO: renamed from: a */
    public static final C4839f0 f14391a = new C4839f0();

    /* JADX INFO: renamed from: a */
    public final void m19342a(View view, InterfaceC2277y interfaceC2277y) {
        PointerIcon pointerIconM19343b = m19343b(view.getContext(), interfaceC2277y);
        if (AbstractC1061t.m3842c(view.getPointerIcon(), pointerIconM19343b)) {
            return;
        }
        view.setPointerIcon(pointerIconM19343b);
    }

    /* JADX INFO: renamed from: b */
    public final PointerIcon m19343b(Context context, InterfaceC2277y interfaceC2277y) {
        return interfaceC2277y instanceof C2227a ? PointerIcon.getSystemIcon(context, ((C2227a) interfaceC2277y).m8025a()) : PointerIcon.getSystemIcon(context, 1000);
    }
}
