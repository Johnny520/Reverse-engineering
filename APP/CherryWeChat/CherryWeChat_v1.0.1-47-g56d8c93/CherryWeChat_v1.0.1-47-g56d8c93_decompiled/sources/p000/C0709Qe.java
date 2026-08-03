package p000;

import android.view.View;

/* JADX INFO: renamed from: Qe */
/* JADX INFO: loaded from: classes.dex */
public final class C0709Qe extends AbstractC0671Pj {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2282g;

    public /* synthetic */ C0709Qe(int i) {
        this.f2282g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: o */
    public final float mo191o(InterfaceC1300cy interfaceC1300cy) {
        switch (this.f2282g) {
            case 0:
                return ((View) interfaceC1300cy).getAlpha();
            case 1:
                return ((View) interfaceC1300cy).getScaleX();
            case 2:
                return ((View) interfaceC1300cy).getScaleY();
            case 3:
                return ((View) interfaceC1300cy).getRotation();
            case 4:
                return ((View) interfaceC1300cy).getRotationX();
            default:
                return ((View) interfaceC1300cy).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: z */
    public final void mo192z(InterfaceC1300cy interfaceC1300cy, float f) {
        switch (this.f2282g) {
            case 0:
                ((View) interfaceC1300cy).setAlpha(f);
                break;
            case 1:
                ((View) interfaceC1300cy).setScaleX(f);
                break;
            case 2:
                ((View) interfaceC1300cy).setScaleY(f);
                break;
            case 3:
                ((View) interfaceC1300cy).setRotation(f);
                break;
            case 4:
                ((View) interfaceC1300cy).setRotationX(f);
                break;
            default:
                ((View) interfaceC1300cy).setRotationY(f);
                break;
        }
    }
}
