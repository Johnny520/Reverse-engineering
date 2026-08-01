package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class ha extends gt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.gt
    public final void p(int r2) {
        switch(this.a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        d60 r22 = (d60) this.b;
        r22.d = true;
        c60 r23 = (c60) r22.e.get();
        if (r23 == null) goto L9;
        ka r24 = (ka) r23;
        r24.u();
        r24.invalidateSelf();
        return;
    L9:
        return;
    }

    @Override // defpackage.gt
    public final void q(Typeface r2, boolean r3) {
        switch(this.a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        if (r3 == true) goto L17;
        d60 r22 = (d60) this.b;
        r22.d = true;
        c60 r23 = (c60) r22.e.get();
        if (r23 == null) goto L16;
        ka r24 = (ka) r23;
        r24.u();
        r24.invalidateSelf();
        return;
    L16:
        return;
    L17:
        return;
    L10:
        Chip r25 = (Chip) this.b;
        ka r32 = r25.e;
        if (r32.C0 == false) goto L13;
        CharSequence r33 = r32.E;
    L14:
        r25.setText(r33);
        r25.requestLayout();
        r25.invalidate();
        return;
    L13:
        r33 = r25.getText();
        goto L14
    }

    private final void I(int r1) {
    }
}
