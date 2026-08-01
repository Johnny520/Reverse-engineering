package androidx.core.app;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.RemoteActionCompat read(xhss.AbstractC0668 r5) {
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r0.f11
            r2 = 1
            boolean r3 = r5.mo232(r2)
            if (r3 != 0) goto Lf
            goto L13
        Lf:
            xhss.ᛵᛲᛲᛴ r1 = r5.m1151()
        L13:
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.f11 = r1
            java.lang.CharSequence r1 = r0.f8
            r3 = 2
            boolean r3 = r5.mo232(r3)
            if (r3 != 0) goto L21
            goto L2e
        L21:
            r1 = r5
            xhss.ᛱᛸᛵᛳ r1 = (xhss.C0076) r1
            android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r1.f410
            java.lang.Object r1 = r3.createFromParcel(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L2e:
            r0.f8 = r1
            java.lang.CharSequence r1 = r0.f9
            r3 = 3
            boolean r3 = r5.mo232(r3)
            if (r3 != 0) goto L3a
            goto L47
        L3a:
            r1 = r5
            xhss.ᛱᛸᛵᛳ r1 = (xhss.C0076) r1
            android.os.Parcelable$Creator r3 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r1.f410
            java.lang.Object r1 = r3.createFromParcel(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L47:
            r0.f9 = r1
            android.app.PendingIntent r1 = r0.f12
            r3 = 4
            android.os.Parcelable r1 = r5.m1153(r1, r3)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.f12 = r1
            boolean r1 = r0.f10
            r3 = 5
            boolean r3 = r5.mo232(r3)
            r4 = 0
            if (r3 != 0) goto L5f
            goto L6d
        L5f:
            r1 = r5
            xhss.ᛱᛸᛵᛳ r1 = (xhss.C0076) r1
            android.os.Parcel r1 = r1.f410
            int r1 = r1.readInt()
            if (r1 == 0) goto L6c
            r1 = r2
            goto L6d
        L6c:
            r1 = r4
        L6d:
            r0.f10 = r1
            boolean r1 = r0.f13
            r3 = 6
            boolean r3 = r5.mo232(r3)
            if (r3 != 0) goto L7a
            r2 = r1
            goto L86
        L7a:
            xhss.ᛱᛸᛵᛳ r5 = (xhss.C0076) r5
            android.os.Parcel r5 = r5.f410
            int r5 = r5.readInt()
            if (r5 == 0) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            r0.f13 = r2
            return r0
    }

    public static void write(androidx.core.app.RemoteActionCompat r4, xhss.AbstractC0668 r5) {
            r5.getClass()
            androidx.core.graphics.drawable.IconCompat r0 = r4.f11
            r1 = 1
            r5.mo234(r1)
            r5.m1150(r0)
            java.lang.CharSequence r0 = r4.f8
            r1 = 2
            r5.mo234(r1)
            r1 = r5
            xhss.ᛱᛸᛵᛳ r1 = (xhss.C0076) r1
            android.os.Parcel r1 = r1.f410
            r2 = 0
            android.text.TextUtils.writeToParcel(r0, r1, r2)
            java.lang.CharSequence r0 = r4.f9
            r3 = 3
            r5.mo234(r3)
            android.text.TextUtils.writeToParcel(r0, r1, r2)
            android.app.PendingIntent r0 = r4.f12
            r3 = 4
            r5.mo234(r3)
            r1.writeParcelable(r0, r2)
            boolean r0 = r4.f10
            r2 = 5
            r5.mo234(r2)
            r1.writeInt(r0)
            boolean r4 = r4.f13
            r0 = 6
            r5.mo234(r0)
            r1.writeInt(r4)
            return
    }
}
