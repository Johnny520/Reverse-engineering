package p211o0;

import android.graphics.Shader;

/* JADX INFO: renamed from: o0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C2740O extends AbstractC2758q {

    /* JADX INFO: renamed from: a */
    public final long f8719a;

    public C2740O(long j5) {
        this.f8719a = j5;
    }

    @Override // p211o0.AbstractC2758q
    /* JADX INFO: renamed from: a */
    public final void mo4805a(float f2, long j5, C2748g c2748g) {
        c2748g.m4867e(1.0f);
        long jM4920b = this.f8719a;
        if (f2 != 1.0f) {
            jM4920b = C2762u.m4920b(C2762u.m4922d(jM4920b) * f2, jM4920b);
        }
        c2748g.m4869g(jM4920b);
        if (((Shader) c2748g.f8738d) != null) {
            c2748g.m4872j(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2740O) {
            return C2762u.m4921c(this.f8719a, ((C2740O) obj).f8719a);
        }
        return false;
    }

    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f8719a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C2762u.m4927i(this.f8719a)) + ')';
    }
}
