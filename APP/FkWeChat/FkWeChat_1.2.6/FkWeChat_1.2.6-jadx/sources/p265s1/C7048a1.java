package p265s1;

import android.graphics.ColorFilter;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7048a1 extends AbstractC7133r1 {

    /* JADX INFO: renamed from: c */
    public final long f23481c;

    /* JADX INFO: renamed from: d */
    public final int f23482d;

    public C7048a1(long j10, int i10) {
        this(j10, i10, AbstractC7077g0.m27878a(j10, i10), null);
    }

    /* JADX INFO: renamed from: b */
    public final int m27742b() {
        return this.f23482d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7048a1)) {
            return false;
        }
        C7048a1 c7048a1 = (C7048a1) obj;
        return C7128q1.m28131q(this.f23481c, c7048a1.f23481c) && AbstractC7168z0.m28276E(this.f23482d, c7048a1.f23482d);
    }

    public int hashCode() {
        return (C7128q1.m28137w(this.f23481c) * 31) + AbstractC7168z0.m28277F(this.f23482d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) C7128q1.m28138x(this.f23481c)) + ", blendMode=" + ((Object) AbstractC7168z0.m28278G(this.f23482d)) + ')';
    }

    public /* synthetic */ C7048a1(long j10, int i10, AbstractC1043k abstractC1043k) {
        this(j10, i10);
    }

    public C7048a1(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f23481c = j10;
        this.f23482d = i10;
    }

    public /* synthetic */ C7048a1(long j10, int i10, ColorFilter colorFilter, AbstractC1043k abstractC1043k) {
        this(j10, i10, colorFilter);
    }
}
