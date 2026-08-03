package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z1 extends a.AbstractC0040a2 {
    public Z1() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L24
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L24
        L15:
            a.Z1 r3 = (a.Z1) r3
            byte[] r0 = r2.g()
            byte[] r3 = r3.g()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final byte[] g() {
            r4 = this;
            a.B6 r0 = new a.B6
            r0.<init>()
            r4.b(r0)
            int r1 = r0.b
            java.nio.ByteBuffer r2 = r0.f26a
            int r2 = r2.capacity()
            int r3 = r0.b
            int r2 = r2 - r3
            boolean r3 = r0.g
            if (r3 == 0) goto L24
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r3 = r0.f26a
            r3.position(r1)
            java.nio.ByteBuffer r0 = r0.f26a
            r0.get(r2)
            return r2
        L24:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."
            r0.<init>(r1)
            throw r0
    }

    public final int hashCode() {
            r5 = this;
            byte[] r0 = r5.g()
            r1 = 2166136261(0x811c9dc5, double:1.070213511E-314)
            int r1 = (int) r1
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1a
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r1 = r1 ^ r4
            r4 = 16777619(0x1000193, float:2.3511016E-38)
            int r1 = r1 * r4
            int r3 = r3 + 1
            goto Lc
        L1a:
            return r1
    }
}
