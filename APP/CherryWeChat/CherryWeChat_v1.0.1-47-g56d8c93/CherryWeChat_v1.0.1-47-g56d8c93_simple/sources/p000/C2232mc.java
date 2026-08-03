package p000;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: mc */
/* JADX INFO: loaded from: classes.dex */
public final class C2232mc extends AbstractC1221bg {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7871e;

    public /* synthetic */ C2232mc(C1141ag r1, int r2) {
        this.f7871e = r2;
        super(r1);
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: q */
    public void mo957q() {
        switch(this.f7871e) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C1141ag r0 = this.f4174b;
        r0.f3620o = null;
        CheckableImageButton r02 = r0.f3612g;
        r02.setOnLongClickListener(null);
        AbstractC0295Gu.m602C(r02, null);
    }
}
