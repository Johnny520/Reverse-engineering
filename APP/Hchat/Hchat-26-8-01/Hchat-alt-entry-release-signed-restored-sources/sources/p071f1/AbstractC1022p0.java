package p071f1;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import p057e1.C0810e;

/* JADX INFO: renamed from: f1.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1022p0 extends AbstractC1027s {

    /* JADX INFO: renamed from: a */
    public C0119x f3230a;

    /* JADX INFO: renamed from: b */
    public long f3231b = 9205357640488583168L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1027s
    /* JADX INFO: renamed from: a */
    public final void mo2628a(float f3, long j3, C1005h c1005h) {
        Paint paint = (Paint) c1005h.f3182i;
        C0119x c0119x = this.f3230a;
        if (c0119x == null || !C0810e.m2054a(this.f3231b, j3)) {
            if (C0810e.m2056c(j3)) {
                this.f3230a = null;
                this.f3231b = 9205357640488583168L;
                c0119x = null;
            } else {
                c0119x = this.f3230a;
                if (c0119x == null) {
                    c0119x = new C0119x(10, false);
                    this.f3230a = c0119x;
                }
                c0119x.f310h = mo2592b(j3);
                this.f3230a = c0119x;
                this.f3231b = j3;
            }
        }
        long jM2507c = AbstractC0996c0.m2507c(paint.getColor());
        long j4 = C1034w.f3258b;
        if (!C1034w.m2635c(jM2507c, j4)) {
            c1005h.m2588w(j4);
        }
        if (!AbstractC1416l.m3825a((Shader) c1005h.f3183j, c0119x != null ? (Shader) c0119x.f310h : null)) {
            c1005h.m2591z(c0119x != null ? (Shader) c0119x.f310h : null);
        }
        if (paint.getAlpha() / 255.0f == f3) {
            return;
        }
        c1005h.m2586u(f3);
    }

    /* JADX INFO: renamed from: b */
    public abstract Shader mo2592b(long j3);
}
