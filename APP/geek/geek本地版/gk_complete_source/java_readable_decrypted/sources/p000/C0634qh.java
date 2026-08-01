package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: qh */
/* JADX INFO: loaded from: classes.dex */
public final class C0634qh extends AbstractC0346ip {

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ int f4087C;

    public /* synthetic */ C0634qh(int i) {
        this.f4087C = i;
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: V */
    public final void mo1515V(Object obj, float f) {
        switch (this.f4087C) {
            case Base64.DEFAULT /* 0 */:
                ((View) obj).setAlpha(f);
                break;
            case Base64.NO_PADDING /* 1 */:
                ((View) obj).setTranslationX(f);
                break;
            case Base64.NO_WRAP /* 2 */:
                ((View) obj).setTranslationY(f);
                break;
            case 3:
                ((View) obj).setScaleX(f);
                break;
            case 4:
                ((View) obj).setScaleY(f);
                break;
            case 5:
                ((View) obj).setRotation(f);
                break;
            case 6:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: y */
    public final float mo1516y(Object obj) {
        switch (this.f4087C) {
            case Base64.DEFAULT /* 0 */:
                return ((View) obj).getAlpha();
            case Base64.NO_PADDING /* 1 */:
                return ((View) obj).getTranslationX();
            case Base64.NO_WRAP /* 2 */:
                return ((View) obj).getTranslationY();
            case 3:
                return ((View) obj).getScaleX();
            case 4:
                return ((View) obj).getScaleY();
            case 5:
                return ((View) obj).getRotation();
            case 6:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }
}
