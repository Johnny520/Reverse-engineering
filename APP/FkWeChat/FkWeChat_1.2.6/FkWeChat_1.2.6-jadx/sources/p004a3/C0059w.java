package p004a3;

import android.graphics.Typeface;
import p004a3.InterfaceC0045i0;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: a3.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0059w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0062z f134a = AbstractC0035d0.m141a();

    /* JADX INFO: renamed from: a */
    public InterfaceC0045i0 m214a(C0039f0 c0039f0, InterfaceC0060x interfaceC0060x, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        Typeface typefaceMo132a;
        AbstractC0042h abstractC0042hM146c = c0039f0.m146c();
        if (abstractC0042hM146c == null || (abstractC0042hM146c instanceof C0038f)) {
            typefaceMo132a = this.f134a.mo132a(c0039f0.m148e(), c0039f0.m147d());
        } else {
            if (!(abstractC0042hM146c instanceof C0058v)) {
                return null;
            }
            typefaceMo132a = this.f134a.mo133b((C0058v) c0039f0.m146c(), c0039f0.m148e(), c0039f0.m147d());
        }
        return new InterfaceC0045i0.a(typefaceMo132a, false, 2, null);
    }
}
