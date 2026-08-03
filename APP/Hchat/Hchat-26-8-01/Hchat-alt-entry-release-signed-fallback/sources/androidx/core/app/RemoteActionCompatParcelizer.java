package androidx.core.app;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.RemoteActionCompat read(z3.b r5) {
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r0.f256a
            r2 = 1
            boolean r3 = r5.e(r2)
            if (r3 != 0) goto Lf
            goto L13
        Lf:
            z3.d r1 = r5.g()
        L13:
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.f256a = r1
            java.lang.CharSequence r1 = r0.f257b
            r3 = 2
            boolean r3 = r5.e(r3)
            if (r3 != 0) goto L21
            goto L2e
        L21:
            r1 = r5
            z3.c r1 = (z3.c) r1
            android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r1.f22524e
            java.lang.Object r1 = r3.createFromParcel(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L2e:
            r0.f257b = r1
            java.lang.CharSequence r1 = r0.f258c
            r3 = 3
            boolean r3 = r5.e(r3)
            if (r3 != 0) goto L3a
            goto L47
        L3a:
            r1 = r5
            z3.c r1 = (z3.c) r1
            android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r1.f22524e
            java.lang.Object r1 = r3.createFromParcel(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L47:
            r0.f258c = r1
            android.app.PendingIntent r1 = r0.f259d
            r3 = 4
            android.os.Parcelable r1 = r5.f(r1, r3)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.f259d = r1
            boolean r1 = r0.f260e
            r3 = 5
            boolean r3 = r5.e(r3)
            r4 = 0
            if (r3 != 0) goto L5f
            goto L6d
        L5f:
            r1 = r5
            z3.c r1 = (z3.c) r1
            android.os.Parcel r1 = r1.f22524e
            int r1 = r1.readInt()
            if (r1 == 0) goto L6c
            r1 = r2
            goto L6d
        L6c:
            r1 = r4
        L6d:
            r0.f260e = r1
            boolean r1 = r0.f261f
            r3 = 6
            boolean r3 = r5.e(r3)
            if (r3 != 0) goto L7a
            r2 = r1
            goto L86
        L7a:
            z3.c r5 = (z3.c) r5
            android.os.Parcel r5 = r5.f22524e
            int r5 = r5.readInt()
            if (r5 == 0) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            r0.f261f = r2
            return r0
    }

    public static void write(androidx.core.app.RemoteActionCompat r4, z3.b r5) {
            r5.getClass()
            androidx.core.graphics.drawable.IconCompat r0 = r4.f256a
            r1 = 1
            r5.h(r1)
            r5.i(r0)
            java.lang.CharSequence r0 = r4.f257b
            r1 = 2
            r5.h(r1)
            r1 = r5
            z3.c r1 = (z3.c) r1
            android.os.Parcel r1 = r1.f22524e
            r2 = 0
            android.text.TextUtils.writeToParcel(r0, r1, r2)
            java.lang.CharSequence r0 = r4.f258c
            r3 = 3
            r5.h(r3)
            android.text.TextUtils.writeToParcel(r0, r1, r2)
            android.app.PendingIntent r0 = r4.f259d
            r3 = 4
            r5.h(r3)
            r1.writeParcelable(r0, r2)
            boolean r0 = r4.f260e
            r2 = 5
            r5.h(r2)
            r1.writeInt(r0)
            boolean r4 = r4.f261f
            r0 = 6
            r5.h(r0)
            r1.writeInt(r4)
            return
    }
}
