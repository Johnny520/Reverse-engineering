package p211o0;

import android.graphics.Paint;
import android.graphics.Shader;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p204n0.C2686e;

/* JADX INFO: renamed from: o0.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2736K extends AbstractC2758q {

    /* JADX INFO: renamed from: a */
    public C1753n f8701a;

    /* JADX INFO: renamed from: b */
    public long f8702b = 9205357640488583168L;

    @Override // p211o0.AbstractC2758q
    /* JADX INFO: renamed from: a */
    public final void mo4805a(float f2, long j5, C2748g c2748g) {
        C1753n c1753n = this.f8701a;
        if (c1753n == null || !C2686e.m4661a(this.f8702b, j5)) {
            if (C2686e.m4663c(j5)) {
                this.f8701a = null;
                this.f8702b = 9205357640488583168L;
                c1753n = null;
            } else {
                c1753n = this.f8701a;
                if (c1753n == null) {
                    c1753n = new C1753n(19, false);
                    this.f8701a = c1753n;
                }
                c1753n.f6028e = mo4781b(j5);
                this.f8701a = c1753n;
                this.f8702b = j5;
            }
        }
        long jM4933c = AbstractC2767z.m4933c(((Paint) c2748g.f8737c).getColor());
        long j6 = C2762u.f8757b;
        if (!C2762u.m4921c(jM4933c, j6)) {
            c2748g.m4869g(j6);
        }
        if (!AbstractC1665j.m2981a((Shader) c2748g.f8738d, c1753n != null ? (Shader) c1753n.f6028e : null)) {
            c2748g.m4872j(c1753n != null ? (Shader) c1753n.f6028e : null);
        }
        if (r8.getAlpha() / 255.0f == f2) {
            return;
        }
        c2748g.m4867e(f2);
    }

    /* JADX INFO: renamed from: b */
    public abstract Shader mo4781b(long j5);
}
