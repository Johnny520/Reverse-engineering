package p190n0;

import p024b9.AbstractC1043k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: n0.c5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5330c5 {

    /* JADX INFO: renamed from: a */
    public final long f16466a;

    /* JADX INFO: renamed from: b */
    public final long f16467b;

    public C5330c5(long j10, long j11) {
        this.f16466a = j10;
        this.f16467b = j11;
    }

    /* JADX INFO: renamed from: a */
    public final long m21788a() {
        return this.f16467b;
    }

    /* JADX INFO: renamed from: b */
    public final long m21789b() {
        return this.f16466a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5330c5)) {
            return false;
        }
        C5330c5 c5330c5 = (C5330c5) obj;
        return C7128q1.m28131q(this.f16466a, c5330c5.f16466a) && C7128q1.m28131q(this.f16467b, c5330c5.f16467b);
    }

    public int hashCode() {
        return (C7128q1.m28137w(this.f16466a) * 31) + C7128q1.m28137w(this.f16467b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C7128q1.m28138x(this.f16466a)) + ", selectionBackgroundColor=" + ((Object) C7128q1.m28138x(this.f16467b)) + ')';
    }

    public /* synthetic */ C5330c5(long j10, long j11, AbstractC1043k abstractC1043k) {
        this(j10, j11);
    }
}
