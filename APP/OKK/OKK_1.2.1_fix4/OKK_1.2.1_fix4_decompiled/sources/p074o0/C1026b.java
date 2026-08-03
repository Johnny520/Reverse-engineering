package p074o0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p056f0.AbstractC0805P;
import p081s0.C1075i;
import p081s0.InterfaceC1074h;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1026b extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3774c;

    public /* synthetic */ C1026b(int i2, Object obj) {
        this.f3773b = i2;
        this.f3774c = obj;
    }

    /* JADX INFO: renamed from: Y */
    private final void m2476Y(int i2) {
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: M */
    public final void mo2059M(int i2) {
        switch (this.f3773b) {
            case 0:
                break;
            default:
                C1075i c1075i = (C1075i) this.f3774c;
                c1075i.f4175d = true;
                InterfaceC1074h interfaceC1074h = (InterfaceC1074h) c1075i.f4176e.get();
                if (interfaceC1074h != null) {
                    C1030f c1030f = (C1030f) interfaceC1074h;
                    c1030f.m2506v();
                    c1030f.invalidateSelf();
                }
                break;
        }
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: N */
    public final void mo2060N(Typeface typeface, boolean z2) {
        switch (this.f3773b) {
            case 0:
                Chip chip = (Chip) this.f3774c;
                C1030f c1030f = chip.f2370e;
                chip.setText(c1030f.f3786D0 ? c1030f.f3787E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    C1075i c1075i = (C1075i) this.f3774c;
                    c1075i.f4175d = true;
                    InterfaceC1074h interfaceC1074h = (InterfaceC1074h) c1075i.f4176e.get();
                    if (interfaceC1074h != null) {
                        C1030f c1030f2 = (C1030f) interfaceC1074h;
                        c1030f2.m2506v();
                        c1030f2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }
}
