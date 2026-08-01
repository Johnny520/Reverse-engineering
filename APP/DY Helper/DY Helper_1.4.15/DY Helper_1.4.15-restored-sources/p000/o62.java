package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o62 implements java.lang.Comparable {

    /* JADX INFO: renamed from: ε */
    public final byte f7966;

    public /* synthetic */ o62(byte r1) {
            r0 = this;
            r0.<init>()
            r0.f7966 = r1
            return
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            o62 r1 = (p000.o62) r1
            byte r1 = r1.f7966
            byte r0 = r0.f7966
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = p000.ln0.m3632(r0, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.o62
            if (r0 != 0) goto L5
            goto Ld
        L5:
            o62 r2 = (p000.o62) r2
            byte r2 = r2.f7966
            byte r1 = r1.f7966
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            byte r0 = r0.f7966
            int r0 = java.lang.Byte.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            byte r0 = r0.f7966
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
