package p000;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 extends AbstractC0024an {

    /* JADX INFO: renamed from: a */
    public final long f3140a;

    public ft2(long j) {
        this.f3140a = j;
    }

    @Override // p000.AbstractC0024an
    /* JADX INFO: renamed from: a */
    public final void mo234a(float f, long j, C0611q9 c0611q9) {
        c0611q9.m4093i(1.0f);
        long jM2565b = this.f3140a;
        if (f != 1.0f) {
            jM2565b = C0363ju.m2565b(C0363ju.m2567d(jM2565b) * f, jM2565b);
        }
        c0611q9.m4095k(jM2565b);
        if (((Shader) c0611q9.f8831d) != null) {
            c0611q9.m4098n(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ft2) {
            return C0363ju.m2566c(this.f3140a, ((ft2) obj).f3140a);
        }
        return false;
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return Long.hashCode(this.f3140a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C0363ju.m2572i(this.f3140a)) + ')';
    }
}
