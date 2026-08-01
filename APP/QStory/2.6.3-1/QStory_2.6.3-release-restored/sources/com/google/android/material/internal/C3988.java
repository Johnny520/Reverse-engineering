package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p267.AbstractC9004;
import p317.C9434;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3988 extends AbstractC9004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f10853;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f10854;

    public /* synthetic */ C3988(Object obj, int i) {
        this.f10854 = i;
        this.f10853 = obj;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo7738(Typeface typeface, boolean z) {
        int i = this.f10854;
        Object obj = this.f10853;
        switch (i) {
            case 0:
                if (!z) {
                    C3987 c3987 = (C3987) obj;
                    c3987.f10849 = true;
                    C9434 c9434 = (C9434) c3987.f10848.get();
                    if (c9434 != null) {
                        c9434.m14821();
                        c9434.invalidateSelf();
                    }
                    break;
                }
                break;
            default:
                Chip chip = (Chip) obj;
                C9434 c94342 = chip.f10574;
                chip.setText(c94342.f24430 ? c94342.f24466 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo7739(int i) {
        switch (this.f10854) {
            case 0:
                C3987 c3987 = (C3987) this.f10853;
                c3987.f10849 = true;
                C9434 c9434 = (C9434) c3987.f10848.get();
                if (c9434 != null) {
                    c9434.m14821();
                    c9434.invalidateSelf();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    private final void m7737(int i) {
    }
}
