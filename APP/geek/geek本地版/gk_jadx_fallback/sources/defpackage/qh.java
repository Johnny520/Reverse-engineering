package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh extends defpackage.ip {
    public final /* synthetic */ int C;

    public /* synthetic */ qh(int r1) {
            r0 = this;
            r0.C = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ip
    public final void V(java.lang.Object r2, float r3) {
            r1 = this;
            int r0 = r1.C
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L29;
                case 2: goto L23;
                case 3: goto L1d;
                case 4: goto L17;
                case 5: goto L11;
                case 6: goto Lb;
                default: goto L5;
            }
        L5:
            android.view.View r2 = (android.view.View) r2
            r2.setRotationY(r3)
            return
        Lb:
            android.view.View r2 = (android.view.View) r2
            r2.setRotationX(r3)
            return
        L11:
            android.view.View r2 = (android.view.View) r2
            r2.setRotation(r3)
            return
        L17:
            android.view.View r2 = (android.view.View) r2
            r2.setScaleY(r3)
            return
        L1d:
            android.view.View r2 = (android.view.View) r2
            r2.setScaleX(r3)
            return
        L23:
            android.view.View r2 = (android.view.View) r2
            r2.setTranslationY(r3)
            return
        L29:
            android.view.View r2 = (android.view.View) r2
            r2.setTranslationX(r3)
            return
        L2f:
            android.view.View r2 = (android.view.View) r2
            r2.setAlpha(r3)
            return
    }

    @Override // defpackage.ip
    public final float y(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.C
            switch(r0) {
                case 0: goto L36;
                case 1: goto L2f;
                case 2: goto L28;
                case 3: goto L21;
                case 4: goto L1a;
                case 5: goto L13;
                case 6: goto Lc;
                default: goto L5;
            }
        L5:
            android.view.View r2 = (android.view.View) r2
            float r2 = r2.getRotationY()
            return r2
        Lc:
            android.view.View r2 = (android.view.View) r2
            float r2 = r2.getRotationX()
            return r2
        L13:
            android.view.View r2 = (android.view.View) r2
            float r2 = r2.getRotation()
            return r2
        L1a:
            android.view.View r2 = (android.view.View) r2
            float r2 = r2.getScaleY()
            return r2
        L21:
            android.view.View r2 = (android.view.View) r2
            float r2 = r2.getScaleX()
            return r2
        L28:
            android.view.View r2 = (android.view.View) r2
            float r2 = r2.getTranslationY()
            return r2
        L2f:
            android.view.View r2 = (android.view.View) r2
            float r2 = r2.getTranslationX()
            return r2
        L36:
            android.view.View r2 = (android.view.View) r2
            float r2 = r2.getAlpha()
            return r2
    }
}
