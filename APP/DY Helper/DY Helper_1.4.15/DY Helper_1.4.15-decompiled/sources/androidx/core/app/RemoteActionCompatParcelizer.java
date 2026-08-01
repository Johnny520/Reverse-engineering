package androidx.core.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.RemoteActionCompat read(p000.v72 r5) {
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r0.f991
            r2 = 1
            boolean r3 = r5.mo6057(r2)
            if (r3 != 0) goto Lf
            goto L13
        Lf:
            x72 r1 = r5.m6059()
        L13:
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.f991 = r1
            java.lang.CharSequence r1 = r0.f992
            r3 = 2
            boolean r3 = r5.mo6057(r3)
            if (r3 != 0) goto L21
            goto L2e
        L21:
            r1 = r5
            w72 r1 = (p000.w72) r1
            android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r1.f11594
            java.lang.Object r1 = r3.createFromParcel(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L2e:
            r0.f992 = r1
            java.lang.CharSequence r1 = r0.f993
            r3 = 3
            boolean r3 = r5.mo6057(r3)
            if (r3 != 0) goto L3a
            goto L47
        L3a:
            r1 = r5
            w72 r1 = (p000.w72) r1
            android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r1.f11594
            java.lang.Object r1 = r3.createFromParcel(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L47:
            r0.f993 = r1
            android.app.PendingIntent r1 = r0.f994
            r3 = 4
            android.os.Parcelable r1 = r5.m6058(r1, r3)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.f994 = r1
            boolean r1 = r0.f995
            r3 = 5
            boolean r3 = r5.mo6057(r3)
            r4 = 0
            if (r3 != 0) goto L5f
            goto L6d
        L5f:
            r1 = r5
            w72 r1 = (p000.w72) r1
            android.os.Parcel r1 = r1.f11594
            int r1 = r1.readInt()
            if (r1 == 0) goto L6c
            r1 = r2
            goto L6d
        L6c:
            r1 = r4
        L6d:
            r0.f995 = r1
            boolean r1 = r0.f996
            r3 = 6
            boolean r3 = r5.mo6057(r3)
            if (r3 != 0) goto L7a
            r2 = r1
            goto L86
        L7a:
            w72 r5 = (p000.w72) r5
            android.os.Parcel r5 = r5.f11594
            int r5 = r5.readInt()
            if (r5 == 0) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            r0.f996 = r2
            return r0
    }

    public static void write(androidx.core.app.RemoteActionCompat r4, p000.v72 r5) {
            r5.getClass()
            androidx.core.graphics.drawable.IconCompat r0 = r4.f991
            r1 = 1
            r5.mo6060(r1)
            r5.m6061(r0)
            java.lang.CharSequence r0 = r4.f992
            r1 = 2
            r5.mo6060(r1)
            r1 = r5
            w72 r1 = (p000.w72) r1
            android.os.Parcel r1 = r1.f11594
            r2 = 0
            android.text.TextUtils.writeToParcel(r0, r1, r2)
            java.lang.CharSequence r0 = r4.f993
            r3 = 3
            r5.mo6060(r3)
            android.text.TextUtils.writeToParcel(r0, r1, r2)
            android.app.PendingIntent r0 = r4.f994
            r3 = 4
            r5.mo6060(r3)
            r1.writeParcelable(r0, r2)
            boolean r0 = r4.f995
            r2 = 5
            r5.mo6060(r2)
            r1.writeInt(r0)
            boolean r4 = r4.f996
            r0 = 6
            r5.mo6060(r0)
            r1.writeInt(r4)
            return
    }
}
