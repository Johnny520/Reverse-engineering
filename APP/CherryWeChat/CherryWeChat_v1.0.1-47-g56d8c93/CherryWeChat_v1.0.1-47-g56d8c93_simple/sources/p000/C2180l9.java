package p000;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2180l9 extends AbstractC0295Gu {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7609n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f7610o;

    public /* synthetic */ C2180l9(int r1, Object r2) {
        this.f7609n = r1;
        this.f7610o = r2;
    }

    /* JADX INFO: renamed from: I */
    private final void m4387I(int r1) {
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: y */
    public final void mo632y(int r2) {
        switch(this.f7609n) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        C2533tA r22 = (C2533tA) this.f7610o;
        r22.f8836d = true;
        InterfaceC2490sA r23 = (InterfaceC2490sA) r22.f8837e.get();
        if (r23 == null) goto L9;
        C2309o9 r24 = (C2309o9) r23;
        r24.m4688A();
        r24.invalidateSelf();
        return;
    L9:
        return;
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: z */
    public final void mo633z(Typeface r2, boolean r3) {
        switch(this.f7609n) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        if (r3 == true) goto L17;
        C2533tA r22 = (C2533tA) this.f7610o;
        r22.f8836d = true;
        InterfaceC2490sA r23 = (InterfaceC2490sA) r22.f8837e.get();
        if (r23 == null) goto L16;
        C2309o9 r24 = (C2309o9) r23;
        r24.m4688A();
        r24.invalidateSelf();
        return;
    L16:
        return;
    L17:
        return;
    L10:
        Chip r25 = (Chip) this.f7610o;
        C2309o9 r32 = r25.f4511e;
        if (r32.f8109L0 == false) goto L13;
        CharSequence r33 = r32.f8112N;
    L14:
        r25.setText(r33);
        r25.requestLayout();
        r25.invalidate();
        return;
    L13:
        r33 = r25.getText();
        goto L14
    }
}
