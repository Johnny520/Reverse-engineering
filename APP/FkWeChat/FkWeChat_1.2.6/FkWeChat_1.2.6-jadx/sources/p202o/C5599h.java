package p202o;

import p024b9.AbstractC1043k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: o.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5599h {

    /* JADX INFO: renamed from: a */
    public final long f17516a;

    /* JADX INFO: renamed from: b */
    public final long f17517b;

    /* JADX INFO: renamed from: c */
    public final long f17518c;

    /* JADX INFO: renamed from: d */
    public final long f17519d;

    /* JADX INFO: renamed from: e */
    public final long f17520e;

    public C5599h(long j10, long j11, long j12, long j13, long j14) {
        this.f17516a = j10;
        this.f17517b = j11;
        this.f17518c = j12;
        this.f17519d = j13;
        this.f17520e = j14;
    }

    /* JADX INFO: renamed from: a */
    public final long m22705a() {
        return this.f17516a;
    }

    /* JADX INFO: renamed from: b */
    public final long m22706b() {
        return this.f17520e;
    }

    /* JADX INFO: renamed from: c */
    public final long m22707c() {
        return this.f17519d;
    }

    /* JADX INFO: renamed from: d */
    public final long m22708d() {
        return this.f17518c;
    }

    /* JADX INFO: renamed from: e */
    public final long m22709e() {
        return this.f17517b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5599h)) {
            return false;
        }
        C5599h c5599h = (C5599h) obj;
        return C7128q1.m28131q(this.f17516a, c5599h.f17516a) && C7128q1.m28131q(this.f17517b, c5599h.f17517b) && C7128q1.m28131q(this.f17518c, c5599h.f17518c) && C7128q1.m28131q(this.f17519d, c5599h.f17519d) && C7128q1.m28131q(this.f17520e, c5599h.f17520e);
    }

    public int hashCode() {
        return (((((((C7128q1.m28137w(this.f17516a) * 31) + C7128q1.m28137w(this.f17517b)) * 31) + C7128q1.m28137w(this.f17518c)) * 31) + C7128q1.m28137w(this.f17519d)) * 31) + C7128q1.m28137w(this.f17520e);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) C7128q1.m28138x(this.f17516a)) + ", textColor=" + ((Object) C7128q1.m28138x(this.f17517b)) + ", iconColor=" + ((Object) C7128q1.m28138x(this.f17518c)) + ", disabledTextColor=" + ((Object) C7128q1.m28138x(this.f17519d)) + ", disabledIconColor=" + ((Object) C7128q1.m28138x(this.f17520e)) + ')';
    }

    public /* synthetic */ C5599h(long j10, long j11, long j12, long j13, long j14, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13, j14);
    }
}
