package p229r1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: r1.T */
/* JADX INFO: loaded from: classes.dex */
public class C3058T extends C3057S {
    public C3058T(C3070c0 c3070c0, WindowInsets windowInsets) {
        super(c3070c0, windowInsets);
    }

    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: a */
    public C3070c0 mo5384a() {
        return C3070c0.m5393c(null, this.f9758c.consumeDisplayCutout());
    }

    @Override // p229r1.C3056Q, p229r1.C3064Z
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3058T)) {
            return false;
        }
        C3058T c3058t = (C3058T) obj;
        return Objects.equals(this.f9758c, c3058t.f9758c) && Objects.equals(this.f9762g, c3058t.f9762g) && C3056Q.m5357M(this.f9763h, c3058t.f9763h);
    }

    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: h */
    public C3071d mo5385h() {
        DisplayCutout displayCutout = this.f9758c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C3071d(displayCutout);
    }

    @Override // p229r1.C3064Z
    public int hashCode() {
        return this.f9758c.hashCode();
    }

    public C3058T(C3070c0 c3070c0, C3058T c3058t) {
        super(c3070c0, c3058t);
    }
}
