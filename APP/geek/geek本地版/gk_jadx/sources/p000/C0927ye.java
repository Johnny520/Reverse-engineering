package p000;

import com.github.megatronking.stringfog.Base64;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: ye */
/* JADX INFO: loaded from: classes.dex */
public final class C0927ye extends AbstractC0226fj {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0927ye(C0189ej c0189ej, int i) {
        super(c0189ej);
        this.f5334e = i;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: q */
    public void mo1229q() {
        switch (this.f5334e) {
            case Base64.DEFAULT /* 0 */:
                C0189ej c0189ej = this.f1970b;
                c0189ej.f1800o = null;
                CheckableImageButton checkableImageButton = c0189ej.f1792g;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0222ff.m1167M(checkableImageButton, null);
                break;
        }
    }
}
