package p000;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: mc */
/* JADX INFO: loaded from: classes.dex */
public final class C2232mc extends AbstractC1221bg {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2232mc(C1141ag c1141ag, int i) {
        super(c1141ag);
        this.f7871e = i;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: q */
    public void mo957q() {
        switch (this.f7871e) {
            case 0:
                C1141ag c1141ag = this.f4174b;
                c1141ag.f3620o = null;
                CheckableImageButton checkableImageButton = c1141ag.f3612g;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0295Gu.m602C(checkableImageButton, null);
                break;
        }
    }
}
