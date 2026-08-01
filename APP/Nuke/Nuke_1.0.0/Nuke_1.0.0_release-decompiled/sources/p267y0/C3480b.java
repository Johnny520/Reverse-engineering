package p267y0;

import p007B0.AbstractC0208v;
import p204n0.C2683b;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3480b {

    /* JADX INFO: renamed from: a */
    public final long f10801a;

    /* JADX INFO: renamed from: b */
    public final long f10802b;

    /* JADX INFO: renamed from: c */
    public final long f10803c;

    /* JADX INFO: renamed from: d */
    public final boolean f10804d;

    /* JADX INFO: renamed from: e */
    public final float f10805e;

    /* JADX INFO: renamed from: f */
    public final long f10806f;

    /* JADX INFO: renamed from: g */
    public final long f10807g;

    /* JADX INFO: renamed from: h */
    public final boolean f10808h;

    /* JADX INFO: renamed from: i */
    public boolean f10809i;

    public C3480b(long j5, long j6, long j7, boolean z5, float f2, long j8, long j9, boolean z6) {
        this.f10801a = j5;
        this.f10802b = j6;
        this.f10803c = j7;
        this.f10804d = z5;
        this.f10805e = f2;
        this.f10806f = j8;
        this.f10807g = j9;
        this.f10808h = z6;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) AbstractC0208v.m319i(this.f10801a)) + ", uptimeMillis=" + this.f10802b + ", position=" + ((Object) C2683b.m4649g(this.f10803c)) + ", pressed=" + this.f10804d + ", pressure=" + this.f10805e + ", previousUptimeMillis=" + this.f10806f + ", previousPosition=" + ((Object) C2683b.m4649g(this.f10807g)) + ", previousPressed=" + this.f10808h + ", isConsumed=" + this.f10809i + ')';
    }
}
