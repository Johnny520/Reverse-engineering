package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k62 {

    /* JADX INFO: renamed from: δ */
    public static final java.lang.ThreadLocal f5775 = null;

    /* JADX INFO: renamed from: α */
    public final int f5776;

    /* JADX INFO: renamed from: β */
    public final p000.C0379i0 f5777;

    /* JADX INFO: renamed from: γ */
    public volatile int f5778;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.k62.f5775 = r0
            return
    }

    public k62(p000.C0379i0 r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5778 = r0
            r1.f5777 = r2
            r1.f5776 = r3
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            g01 r1 = r5.m3167()
            r2 = 4
            int r2 = r1.m7040(r2)
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Object r4 = r1.f12860
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r1 = r1.f12857
            int r2 = r2 + r1
            int r1 = r4.getInt(r2)
            goto L2a
        L29:
            r1 = r3
        L2a:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ", codepoints:"
            r0.append(r1)
            g01 r1 = r5.m3167()
            r2 = 16
            int r2 = r1.m7040(r2)
            if (r2 == 0) goto L57
            int r4 = r1.f12857
            int r2 = r2 + r4
            java.lang.Object r4 = r1.f12860
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.getInt(r2)
            int r4 = r4 + r2
            java.lang.Object r1 = r1.f12860
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt(r4)
            goto L58
        L57:
            r1 = r3
        L58:
            if (r3 >= r1) goto L6d
            int r2 = r5.m3166(r3)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            int r3 = r3 + 1
            goto L58
        L6d:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final int m3166(int r3) {
            r2 = this;
            g01 r2 = r2.m3167()
            r0 = 16
            int r0 = r2.m7040(r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.f12860
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r2.f12857
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            int r2 = r2 + r0
            int r2 = r2 + 4
            int r3 = r3 * 4
            int r3 = r3 + r2
            int r2 = r1.getInt(r3)
            return r2
        L22:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final p000.g01 m3167() {
            r4 = this;
            java.lang.ThreadLocal r0 = p000.k62.f5775
            java.lang.Object r1 = r0.get()
            g01 r1 = (p000.g01) r1
            if (r1 != 0) goto L12
            g01 r1 = new g01
            r1.<init>()
            r0.set(r1)
        L12:
            i0 r0 = r4.f5777
            java.lang.Object r0 = r0.f4857
            h01 r0 = (p000.h01) r0
            r2 = 6
            int r2 = r0.m7040(r2)
            if (r2 == 0) goto L5e
            int r3 = r0.f12857
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f12860
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r4 = r4.f5776
            int r4 = r4 * 4
            int r4 = r4 + r3
            java.lang.Object r2 = r0.f12860
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r4)
            int r2 = r2 + r4
            java.lang.Object r4 = r0.f12860
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r1.f12860 = r4
            if (r4 == 0) goto L57
            r1.f12857 = r2
            int r4 = r4.getInt(r2)
            int r2 = r2 - r4
            r1.f12858 = r2
            java.lang.Object r4 = r1.f12860
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            short r4 = r4.getShort(r2)
            r1.f12859 = r4
            return r1
        L57:
            r4 = 0
            r1.f12857 = r4
            r1.f12858 = r4
            r1.f12859 = r4
        L5e:
            return r1
    }
}
