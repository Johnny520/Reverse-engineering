package p000;

import com.github.megatronking.stringfog.Base64;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: ze */
/* JADX INFO: loaded from: classes.dex */
public final class C0964ze extends AbstractC0300hj {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0964ze(C0263gj c0263gj, int i) {
        super(c0263gj);
        this.f5581e = i;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: q */
    public void mo606q() {
        switch (this.f5581e) {
            case Base64.DEFAULT /* 0 */:
                C0263gj c0263gj = this.f2229b;
                c0263gj.f2011o = null;
                CheckableImageButton checkableImageButton = c0263gj.f2003g;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0259gf.m1236T(checkableImageButton, null);
                break;
        }
    }
}
