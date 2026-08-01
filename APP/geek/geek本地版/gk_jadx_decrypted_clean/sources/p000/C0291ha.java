package p000;

import android.graphics.Typeface;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: ha */
/* JADX INFO: loaded from: classes.dex */
public final class C0291ha extends AbstractC0273gt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2258b;

    public /* synthetic */ C0291ha(int i, Object obj) {
        this.f2257a = i;
        this.f2258b = obj;
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: p */
    public final void mo1266p(int i) {
        switch (this.f2257a) {
            case Base64.DEFAULT /* 0 */:
                break;
            default:
                d60 d60Var = (d60) this.f2258b;
                d60Var.f1392d = true;
                c60 c60Var = (c60) d60Var.f1393e.get();
                if (c60Var != null) {
                    C0404ka c0404ka = (C0404ka) c60Var;
                    c0404ka.m1681u();
                    c0404ka.invalidateSelf();
                }
                break;
        }
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: q */
    public final void mo1267q(Typeface typeface, boolean z) {
        switch (this.f2257a) {
            case Base64.DEFAULT /* 0 */:
                Chip chip = (Chip) this.f2258b;
                C0404ka c0404ka = chip.f1101e;
                chip.setText(c0404ka.f2753C0 ? c0404ka.f2756E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    d60 d60Var = (d60) this.f2258b;
                    d60Var.f1392d = true;
                    c60 c60Var = (c60) d60Var.f1393e.get();
                    if (c60Var != null) {
                        C0404ka c0404ka2 = (C0404ka) c60Var;
                        c0404ka2.m1681u();
                        c0404ka2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m1350I(int i) {
    }
}
