package p000;

import android.graphics.Typeface;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: pa */
/* JADX INFO: loaded from: classes.dex */
public final class C0589pa extends AbstractC0387ju {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3633c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3634d;

    public /* synthetic */ C0589pa(int i, Object obj) {
        this.f3633c = i;
        this.f3634d = obj;
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: r */
    public final void mo1073r(int i) {
        switch (this.f3633c) {
            case Base64.DEFAULT /* 0 */:
                break;
            default:
                j60 j60Var = (j60) this.f3634d;
                j60Var.f2667d = true;
                i60 i60Var = (i60) j60Var.f2668e.get();
                if (i60Var != null) {
                    C0700sa c0700sa = (C0700sa) i60Var;
                    c0700sa.m2355u();
                    c0700sa.invalidateSelf();
                }
                break;
        }
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: s */
    public final void mo1074s(Typeface typeface, boolean z) {
        switch (this.f3633c) {
            case Base64.DEFAULT /* 0 */:
                Chip chip = (Chip) this.f3634d;
                C0700sa c0700sa = chip.f1026e;
                chip.setText(c0700sa.f4232C0 ? c0700sa.f4235E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    j60 j60Var = (j60) this.f3634d;
                    j60Var.f2667d = true;
                    i60 i60Var = (i60) j60Var.f2668e.get();
                    if (i60Var != null) {
                        C0700sa c0700sa2 = (C0700sa) i60Var;
                        c0700sa2.m2355u();
                        c0700sa2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m2078y(int i) {
    }
}
