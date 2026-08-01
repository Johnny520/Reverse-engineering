package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p301.C8613;
import p392.AbstractC9124;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3155 extends AbstractC9124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f10503;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f10504;

    public /* synthetic */ C3155(Object obj, int i) {
        this.f10503 = i;
        this.f10504 = obj;
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo7192(Typeface typeface, boolean z) {
        int i = this.f10503;
        Object obj = this.f10504;
        switch (i) {
            case 0:
                if (!z) {
                    C3154 c3154 = (C3154) obj;
                    c3154.f10499 = true;
                    C8613 c8613 = (C8613) c3154.f10498.get();
                    if (c8613 != null) {
                        c8613.m14243();
                        c8613.invalidateSelf();
                    }
                    break;
                }
                break;
            default:
                Chip chip = (Chip) obj;
                C8613 c86132 = chip.f10224;
                chip.setText(c86132.f24094 ? c86132.f24130 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo7193(int i) {
        switch (this.f10503) {
            case 0:
                C3154 c3154 = (C3154) this.f10504;
                c3154.f10499 = true;
                C8613 c8613 = (C8613) c3154.f10498.get();
                if (c8613 != null) {
                    c8613.m14243();
                    c8613.invalidateSelf();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    private final void m7191(int i) {
    }
}
