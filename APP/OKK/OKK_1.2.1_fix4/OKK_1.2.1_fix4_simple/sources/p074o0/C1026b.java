package p074o0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p056f0.AbstractC0805P;
import p081s0.C1075i;
import p081s0.InterfaceC1074h;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1026b extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3774c;

    public /* synthetic */ C1026b(int r1, Object r2) {
        this.f3773b = r1;
        this.f3774c = r2;
    }

    /* JADX INFO: renamed from: Y */
    private final void m2476Y(int r1) {
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: M */
    public final void mo2059M(int r2) {
        switch(this.f3773b) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        C1075i r02 = (C1075i) this.f3774c;
        r02.f4175d = true;
        InterfaceC1074h r22 = (InterfaceC1074h) r02.f4176e.get();
        if (r22 == null) goto L9;
        C1030f r23 = (C1030f) r22;
        r23.m2506v();
        r23.invalidateSelf();
        return;
    L9:
        return;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: N */
    public final void mo2060N(Typeface r2, boolean r3) {
        switch(this.f3773b) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        if (r3 == true) goto L17;
        C1075i r32 = (C1075i) this.f3774c;
        r32.f4175d = true;
        InterfaceC1074h r22 = (InterfaceC1074h) r32.f4176e.get();
        if (r22 == null) goto L16;
        C1030f r23 = (C1030f) r22;
        r23.m2506v();
        r23.invalidateSelf();
        return;
    L16:
        return;
    L17:
        return;
    L10:
        Chip r24 = (Chip) this.f3774c;
        C1030f r33 = r24.f2370e;
        if (r33.f3786D0 == false) goto L13;
        CharSequence r34 = r33.f3787E;
    L14:
        r24.setText(r34);
        r24.requestLayout();
        r24.invalidate();
        return;
    L13:
        r34 = r24.getText();
        goto L14
    }
}
