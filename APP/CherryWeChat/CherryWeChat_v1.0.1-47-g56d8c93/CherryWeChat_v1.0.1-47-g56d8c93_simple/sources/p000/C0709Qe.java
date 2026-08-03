package p000;

import android.view.View;

/* JADX INFO: renamed from: Qe */
/* JADX INFO: loaded from: classes.dex */
public final class C0709Qe extends AbstractC0671Pj {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2282g;

    public /* synthetic */ C0709Qe(int r1) {
        this.f2282g = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: o */
    public final float mo191o(InterfaceC1300cy r2) {
        switch(this.f2282g) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        return ((View) r2).getRotationY();
    L7:
        return ((View) r2).getRotationX();
    L9:
        return ((View) r2).getRotation();
    L11:
        return ((View) r2).getScaleY();
    L13:
        return ((View) r2).getScaleX();
    L15:
        return ((View) r2).getAlpha();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: z */
    public final void mo192z(InterfaceC1300cy r2, float r3) {
        switch(this.f2282g) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        ((View) r2).setRotationY(r3);
        return;
    L6:
        ((View) r2).setRotationX(r3);
        return;
    L8:
        ((View) r2).setRotation(r3);
        return;
    L10:
        ((View) r2).setScaleY(r3);
        return;
    L12:
        ((View) r2).setScaleX(r3);
        return;
    L14:
        ((View) r2).setAlpha(r3);
    }
}
