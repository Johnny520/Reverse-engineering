package org.luckypray.dexkit.query.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseFinder extends org.luckypray.dexkit.query.base.BaseMatcher {
    public BaseFinder() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L24
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L24
        L15:
            org.luckypray.dexkit.query.base.BaseFinder r3 = (org.luckypray.dexkit.query.base.BaseFinder) r3
            byte[] r2 = r2.serializedBytes$dexkit_android_release()
            byte[] r3 = r3.serializedBytes$dexkit_android_release()
            boolean r2 = java.util.Arrays.equals(r2, r3)
            return r2
        L24:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r4 = this;
            byte[] r4 = r4.serializedBytes$dexkit_android_release()
            r0 = 2166136261(0x811c9dc5, double:1.070213511E-314)
            int r0 = (int) r0
            int r1 = r4.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1a
            r3 = r4[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0 ^ r3
            r3 = 16777619(0x1000193, float:2.3511016E-38)
            int r0 = r0 * r3
            int r2 = r2 + 1
            goto Lc
        L1a:
            return r0
    }

    public final java.lang.String hashKey() {
            r8 = this;
            byte[] r8 = r8.serializedBytes$dexkit_android_release()
            int r0 = r8.length
            r1 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r3 = 0
        Lb:
            if (r3 >= r0) goto L1d
            r4 = r8[r3]
            long r4 = (long) r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            long r1 = r1 ^ r4
            r4 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r1 = r1 * r4
            int r3 = r3 + 1
            goto Lb
        L1d:
            r8 = 16
            p000.jx0.m3045(r8)
            java.lang.String r0 = p000.v71.m6049(r1)
            java.lang.String r8 = p000.q02.m4676(r0, r8)
            return r8
    }

    public final byte[] serializedBytes$dexkit_android_release() {
            r3 = this;
            b40 r0 = new b40
            r0.<init>()
            r3.build$dexkit_android_release(r0)
            int r3 = r0.f1453
            java.nio.ByteBuffer r1 = r0.f1452
            int r1 = r1.capacity()
            int r2 = r0.f1453
            int r1 = r1 - r2
            boolean r2 = r0.f1458
            if (r2 == 0) goto L24
            byte[] r1 = new byte[r1]
            java.nio.ByteBuffer r2 = r0.f1452
            r2.position(r3)
            java.nio.ByteBuffer r3 = r0.f1452
            r3.get(r1)
            return r1
        L24:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."
            r3.<init>(r0)
            throw r3
    }
}
