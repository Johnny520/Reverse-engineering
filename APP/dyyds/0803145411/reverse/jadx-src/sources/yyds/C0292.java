package yyds;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: yyds.ᛲᛲᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0292 extends AbstractC0931 {

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f1554 = AbstractC2112.f10448.objectFieldOffset(C0292.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public InterfaceC0970 f1555;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1571 f1556;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1853 f1557;

    public C0292(C1571 c1571, C1853 c1853) {
        this.f1556 = c1571;
        this.f1557 = c1853;
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo925(Throwable th) {
        C1853 c1853 = this.f1557;
        if (th != null) {
            C0415 c0415M3630 = c1853.m3630(new C0417(th, false), null);
            if (c0415M3630 != null) {
                c1853.mo3313(c0415M3630);
                C1218 c1218 = (C1218) AbstractC2112.f10448.getObjectVolatile(this, f1554);
                if (c1218 != null) {
                    c1218.m2477();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1571.f7967;
        C1571 c1571 = this.f1556;
        if (atomicIntegerFieldUpdater.decrementAndGet(c1571) == 0) {
            InterfaceC1659[] interfaceC1659Arr = c1571.f7968;
            ArrayList arrayList = new ArrayList(interfaceC1659Arr.length);
            for (InterfaceC1659 interfaceC1659 : interfaceC1659Arr) {
                arrayList.add(interfaceC1659.m3379());
            }
            c1853.mo812(arrayList);
        }
    }

    @Override // yyds.AbstractC0931
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final boolean mo926() {
        return false;
    }
}
