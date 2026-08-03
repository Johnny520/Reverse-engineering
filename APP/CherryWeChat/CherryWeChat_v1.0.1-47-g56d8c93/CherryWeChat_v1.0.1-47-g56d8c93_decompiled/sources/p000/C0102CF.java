package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: CF */
/* JADX INFO: loaded from: classes.dex */
public class C0102CF extends C0059BF {
    public C0102CF(C0489LF c0489lf, WindowInsets windowInsets) {
        super(c0489lf, windowInsets);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: a */
    public C0489LF mo149a() {
        return C0489LF.m939h(null, this.f26c.consumeDisplayCutout());
    }

    @Override // p000.C0016AF, p000.C0317HF
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0102CF)) {
            return false;
        }
        C0102CF c0102cf = (C0102CF) obj;
        return Objects.equals(this.f26c, c0102cf.f26c) && Objects.equals(this.f30g, c0102cf.f30g) && C0016AF.m11z(this.f31h, c0102cf.f31h);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: f */
    public C1543ie mo150f() {
        DisplayCutout displayCutout = this.f26c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1543ie(displayCutout);
    }

    @Override // p000.C0317HF
    public int hashCode() {
        return this.f26c.hashCode();
    }

    public C0102CF(C0489LF c0489lf, C0102CF c0102cf) {
        super(c0489lf, c0102cf);
    }
}
