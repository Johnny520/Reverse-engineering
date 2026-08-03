package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: CF */
/* JADX INFO: loaded from: classes.dex */
public class C0102CF extends C0059BF {
    public C0102CF(C0489LF r1, WindowInsets r2) {
        super(r1, r2);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: a */
    public C0489LF mo149a() {
        return C0489LF.m939h(null, this.f26c.consumeDisplayCutout());
    }

    @Override // p000.C0016AF, p000.C0317HF
    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0102CF) == true) goto L8;
        return false;
    L8:
        C0102CF r52 = (C0102CF) r5;
        if (Objects.equals(this.f26c, r52.f26c) == true) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.f30g, r52.f30g) == false) goto L15;
        if (C0016AF.m11z(this.f31h, r52.f31h) == false) goto L15;
        return true;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: f */
    public C1543ie mo150f() {
        DisplayCutout r0 = this.f26c.getDisplayCutout();
        if (r0 != null) goto L7;
        return null;
    L7:
        return new C1543ie(r0);
    }

    @Override // p000.C0317HF
    public int hashCode() {
        return this.f26c.hashCode();
    }

    public C0102CF(C0489LF r1, C0102CF r2) {
        super(r1, r2);
    }
}
