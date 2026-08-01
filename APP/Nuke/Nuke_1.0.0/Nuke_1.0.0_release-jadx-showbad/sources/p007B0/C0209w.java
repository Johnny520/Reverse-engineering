package p007B0;

import java.util.ArrayList;
import p061L2.C0981u;
import p204n0.C2683b;

/* JADX INFO: renamed from: B0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0209w {

    /* JADX INFO: renamed from: a */
    public final long f711a;

    /* JADX INFO: renamed from: b */
    public final long f712b;

    /* JADX INFO: renamed from: c */
    public final long f713c;

    /* JADX INFO: renamed from: d */
    public final boolean f714d;

    /* JADX INFO: renamed from: e */
    public final float f715e;

    /* JADX INFO: renamed from: f */
    public final long f716f;

    /* JADX INFO: renamed from: g */
    public final long f717g;

    /* JADX INFO: renamed from: h */
    public final boolean f718h;

    /* JADX INFO: renamed from: i */
    public final int f719i;

    /* JADX INFO: renamed from: j */
    public final long f720j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f721k;

    /* JADX INFO: renamed from: l */
    public final long f722l;

    /* JADX INFO: renamed from: m */
    public boolean f723m;

    /* JADX INFO: renamed from: n */
    public boolean f724n;

    /* JADX INFO: renamed from: o */
    public C0209w f725o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0209w(long j5, long j6, long j7, boolean z5, float f2, long j8, long j9, boolean z6, boolean z7, int i5, long j10) {
        this.f711a = j5;
        this.f712b = j6;
        this.f713c = j7;
        this.f714d = z5;
        this.f715e = f2;
        this.f716f = j8;
        this.f717g = j9;
        this.f718h = z6;
        this.f719i = i5;
        this.f720j = j10;
        this.f722l = 0L;
        this.f723m = z7;
        this.f724n = z7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m320a() {
        C0209w c0209w = this.f725o;
        if (c0209w == null) {
            this.f723m = true;
            this.f724n = true;
        } else if (c0209w != null) {
            c0209w.m320a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m321b() {
        C0209w c0209w = this.f725o;
        return c0209w != null ? c0209w.m321b() : this.f723m || this.f724n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) AbstractC0208v.m319i(this.f711a));
        sb.append(", uptimeMillis=");
        sb.append(this.f712b);
        sb.append(", position=");
        sb.append((Object) C2683b.m4649g(this.f713c));
        sb.append(", pressed=");
        sb.append(this.f714d);
        sb.append(", pressure=");
        sb.append(this.f715e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f716f);
        sb.append(", previousPosition=");
        sb.append((Object) C2683b.m4649g(this.f717g));
        sb.append(", previousPressed=");
        sb.append(this.f718h);
        sb.append(", isConsumed=");
        sb.append(m321b());
        sb.append(", type=");
        sb.append((Object) AbstractC0177J.m262a(this.f719i));
        sb.append(", historical=");
        Object obj = this.f721k;
        if (obj == null) {
            obj = C0981u.f3047d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C2683b.m4649g(this.f720j));
        sb.append(')');
        return sb.toString();
    }

    public C0209w(long j5, long j6, long j7, boolean z5, float f2, long j8, long j9, boolean z6, int i5, ArrayList arrayList, long j10, long j11) {
        this(j5, j6, j7, z5, f2, j8, j9, z6, false, i5, j10);
        this.f721k = arrayList;
        this.f722l = j11;
    }
}
