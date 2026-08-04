package yyds;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᲈᛳᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2626 extends AbstractC1878 {
    public AbstractC2626(C2693 c2693, WindowInsets windowInsets) {
        super(c2693, windowInsets);
    }

    @Override // yyds.C2610
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2626)) {
            return false;
        }
        AbstractC2626 abstractC2626 = (AbstractC2626) obj;
        return Objects.equals(this.f12318, abstractC2626.f12318) && Objects.equals(null, null) && AbstractC2502.m4541(this.f12316, abstractC2626.f12316);
    }

    @Override // yyds.C2610
    public int hashCode() {
        return this.f12318.hashCode();
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public C2693 mo4693() {
        return C2693.m4783(null, this.f12318.consumeDisplayCutout());
    }

    @Override // yyds.C2610
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public C0515 mo4694() {
        DisplayCutout displayCutout = this.f12318.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0515(displayCutout);
    }
}
