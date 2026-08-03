package org.luckypray.dexkit.query.base;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0006\u0010\t\u001a\u00020\nJ\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lorg/luckypray/dexkit/query/base/BaseFinder;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "()V", "equals", "", "other", "", "hashCode", "", "hashKey", "", "serializedBytes", "", "serializedBytes$dexkit_android_release", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseFinder extends org.luckypray.dexkit.query.base.BaseMatcher {
    public BaseFinder() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L24
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 != 0) goto L15
            goto L24
        L15:
            org.luckypray.dexkit.query.base.BaseFinder r3 = (org.luckypray.dexkit.query.base.BaseFinder) r3
            byte[] r0 = r2.serializedBytes$dexkit_android_release()
            byte[] r3 = r3.serializedBytes$dexkit_android_release()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L24:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r5 = this;
            byte[] r0 = r5.serializedBytes$dexkit_android_release()
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

    @Yue.InterfaceC4418
    public final java.lang.String hashKey() {
            r9 = this;
            byte[] r0 = r9.serializedBytes$dexkit_android_release()
            int r1 = r0.length
            r2 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r4 = 0
        Lb:
            if (r4 >= r1) goto L2d
            r5 = r0[r4]
            byte r5 = Yue.C6517.m24798(r5)
            long r5 = (long) r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            long r5 = Yue.C6539.m25038(r5)
            long r2 = r2 ^ r5
            long r2 = Yue.C6539.m25038(r2)
            r5 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r2 = r2 * r5
            long r2 = Yue.C6539.m25038(r2)
            int r4 = r4 + 1
            goto Lb
        L2d:
            r0 = 16
            java.lang.String r1 = Yue.C6565.m25322(r2, r0)
            r2 = 48
            java.lang.String r0 = Yue.C5989.m22392(r1, r0, r2)
            return r0
    }

    public final /* synthetic */ byte[] serializedBytes$dexkit_android_release() {
            r2 = this;
            com.google.flatbuffers.FlatBufferBuilder r0 = new com.google.flatbuffers.FlatBufferBuilder
            r0.<init>()
            r2.build$dexkit_android_release(r0)
            byte[] r0 = r0.sizedByteArray()
            java.lang.String r1 = "fbb.sizedByteArray()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }
}
