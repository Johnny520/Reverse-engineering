package p000;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2180l9 extends AbstractC0295Gu {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7609n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f7610o;

    public /* synthetic */ C2180l9(int i, Object obj) {
        this.f7609n = i;
        this.f7610o = obj;
    }

    /* JADX INFO: renamed from: I */
    private final void m4387I(int i) {
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: y */
    public final void mo632y(int i) {
        switch (this.f7609n) {
            case 0:
                break;
            default:
                C2533tA c2533tA = (C2533tA) this.f7610o;
                c2533tA.f8836d = true;
                InterfaceC2490sA interfaceC2490sA = (InterfaceC2490sA) c2533tA.f8837e.get();
                if (interfaceC2490sA != null) {
                    C2309o9 c2309o9 = (C2309o9) interfaceC2490sA;
                    c2309o9.m4688A();
                    c2309o9.invalidateSelf();
                }
                break;
        }
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: z */
    public final void mo633z(Typeface typeface, boolean z) {
        switch (this.f7609n) {
            case 0:
                Chip chip = (Chip) this.f7610o;
                C2309o9 c2309o9 = chip.f4511e;
                chip.setText(c2309o9.f8109L0 ? c2309o9.f8112N : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    C2533tA c2533tA = (C2533tA) this.f7610o;
                    c2533tA.f8836d = true;
                    InterfaceC2490sA interfaceC2490sA = (InterfaceC2490sA) c2533tA.f8837e.get();
                    if (interfaceC2490sA != null) {
                        C2309o9 c2309o92 = (C2309o9) interfaceC2490sA;
                        c2309o92.m4688A();
                        c2309o92.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }
}
