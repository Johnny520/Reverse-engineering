package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p251.AbstractC8175;
import p301.C8605;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3156 extends AbstractC8175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f10508;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f10509;

    public /* synthetic */ C3156(Object obj, int i) {
        this.f10509 = i;
        this.f10508 = obj;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo7179(Typeface typeface, boolean z) {
        int i = this.f10509;
        Object obj = this.f10508;
        switch (i) {
            case 0:
                if (!z) {
                    C3155 c3155 = (C3155) obj;
                    c3155.f10504 = true;
                    C8605 c8605 = (C8605) c3155.f10503.get();
                    if (c8605 != null) {
                        c8605.m14262();
                        c8605.invalidateSelf();
                    }
                    break;
                }
                break;
            default:
                Chip chip = (Chip) obj;
                C8605 c86052 = chip.f10229;
                chip.setText(c86052.f24085 ? c86052.f24121 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo7180(int i) {
        switch (this.f10509) {
            case 0:
                C3155 c3155 = (C3155) this.f10508;
                c3155.f10504 = true;
                C8605 c8605 = (C8605) c3155.f10503.get();
                if (c8605 != null) {
                    c8605.m14262();
                    c8605.invalidateSelf();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    private final void m7178(int i) {
    }
}
