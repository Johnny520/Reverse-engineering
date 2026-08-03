package p267s1;

import java.util.ArrayList;
import p057e1.C0807b;
import tf.C4173t;

/* JADX INFO: renamed from: s1.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3914t {

    /* JADX INFO: renamed from: a */
    public final long f12834a;

    /* JADX INFO: renamed from: b */
    public final long f12835b;

    /* JADX INFO: renamed from: c */
    public final long f12836c;

    /* JADX INFO: renamed from: d */
    public final boolean f12837d;

    /* JADX INFO: renamed from: e */
    public final float f12838e;

    /* JADX INFO: renamed from: f */
    public final long f12839f;

    /* JADX INFO: renamed from: g */
    public final long f12840g;

    /* JADX INFO: renamed from: h */
    public final boolean f12841h;

    /* JADX INFO: renamed from: i */
    public final int f12842i;

    /* JADX INFO: renamed from: j */
    public final long f12843j;

    /* JADX INFO: renamed from: k */
    public final float f12844k;

    /* JADX INFO: renamed from: l */
    public final long f12845l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f12846m;

    /* JADX INFO: renamed from: n */
    public final long f12847n;

    /* JADX INFO: renamed from: o */
    public boolean f12848o;

    /* JADX INFO: renamed from: p */
    public boolean f12849p;

    /* JADX INFO: renamed from: q */
    public C3914t f12850q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3914t(long j3, long j4, long j5, boolean z9, float f3, long j10, long j11, boolean z10, boolean z11, int i9, long j12, float f10, long j13) {
        this.f12834a = j3;
        this.f12835b = j4;
        this.f12836c = j5;
        this.f12837d = z9;
        this.f12838e = f3;
        this.f12839f = j10;
        this.f12840g = j11;
        this.f12841h = z10;
        this.f12842i = i9;
        this.f12843j = j12;
        this.f12844k = f10;
        this.f12845l = j13;
        this.f12847n = 0L;
        this.f12848o = z11;
        this.f12849p = z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8118a() {
        C3914t c3914t = this.f12850q;
        if (c3914t == null) {
            this.f12848o = true;
            this.f12849p = true;
        } else if (c3914t != null) {
            c3914t.m8118a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m8119b() {
        C3914t c3914t = this.f12850q;
        return c3914t != null ? c3914t.m8119b() : this.f12848o || this.f12849p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) AbstractC3913s.m8117j(this.f12834a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f12835b);
        sb2.append(", position=");
        sb2.append((Object) C0807b.m2044g(this.f12836c));
        sb2.append(", pressed=");
        sb2.append(this.f12837d);
        sb2.append(", pressure=");
        sb2.append(this.f12838e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f12839f);
        sb2.append(", previousPosition=");
        sb2.append((Object) C0807b.m2044g(this.f12840g));
        sb2.append(", previousPressed=");
        sb2.append(this.f12841h);
        sb2.append(", isConsumed=");
        sb2.append(m8119b());
        sb2.append(", type=");
        sb2.append((Object) C3890d0.m8079a(this.f12842i));
        sb2.append(", historical=");
        Object obj = this.f12846m;
        if (obj == null) {
            obj = C4173t.f13710g;
        }
        sb2.append(obj);
        sb2.append(", scrollDelta=");
        sb2.append((Object) C0807b.m2044g(this.f12843j));
        sb2.append(", scaleFactor=");
        sb2.append(this.f12844k);
        sb2.append(", panOffset=");
        sb2.append((Object) C0807b.m2044g(this.f12845l));
        sb2.append(')');
        return sb2.toString();
    }

    public C3914t(long j3, long j4, long j5, boolean z9, float f3, long j10, long j11, boolean z10, int i9, ArrayList arrayList, long j12, float f10, long j13, long j14) {
        this(j3, j4, j5, z9, f3, j10, j11, z10, false, i9, j12, f10, j13);
        this.f12846m = arrayList;
        this.f12847n = j14;
    }
}
