package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qh extends ip {
    public final /* synthetic */ int C;

    public /* synthetic */ qh(int r1) {
        this.C = r1;
    }

    @Override // defpackage.ip
    public final void V(Object r2, float r3) {
        switch(this.C) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
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
        ((View) r2).setTranslationY(r3);
        return;
    L16:
        ((View) r2).setTranslationX(r3);
        return;
    L18:
        ((View) r2).setAlpha(r3);
    }

    @Override // defpackage.ip
    public final float y(Object r2) {
        switch(this.C) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
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
        return ((View) r2).getTranslationY();
    L17:
        return ((View) r2).getTranslationX();
    L19:
        return ((View) r2).getAlpha();
    }
}
