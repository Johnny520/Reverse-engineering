package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(Yue.AbstractC6680 r3) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f28993
            r2 = 1
            int r1 = r3.m25761(r1, r2)
            r0.f28993 = r1
            byte[] r1 = r0.f28995
            r2 = 2
            byte[] r1 = r3.m25742(r1, r2)
            r0.f28995 = r1
            android.os.Parcelable r1 = r0.f28996
            r2 = 3
            android.os.Parcelable r1 = r3.m25771(r1, r2)
            r0.f28996 = r1
            int r1 = r0.f28997
            r2 = 4
            int r1 = r3.m25761(r1, r2)
            r0.f28997 = r1
            int r1 = r0.f28998
            r2 = 5
            int r1 = r3.m25761(r1, r2)
            r0.f28998 = r1
            android.content.res.ColorStateList r1 = r0.f28999
            r2 = 6
            android.os.Parcelable r1 = r3.m25771(r1, r2)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f28999 = r1
            java.lang.String r1 = r0.f29001
            r2 = 7
            java.lang.String r1 = r3.m25778(r1, r2)
            r0.f29001 = r1
            java.lang.String r1 = r0.f29002
            r2 = 8
            java.lang.String r3 = r3.m25778(r1, r2)
            r0.f29002 = r3
            r0.mo28847()
            return r0
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r3, Yue.AbstractC6680 r4) {
            r0 = 1
            r4.mo25784(r0, r0)
            boolean r1 = r4.mo25731()
            r3.mo28848(r1)
            int r1 = r3.f28993
            r2 = -1
            if (r2 == r1) goto L13
            r4.m25813(r1, r0)
        L13:
            byte[] r0 = r3.f28995
            if (r0 == 0) goto L1b
            r1 = 2
            r4.m25795(r0, r1)
        L1b:
            android.os.Parcelable r0 = r3.f28996
            if (r0 == 0) goto L23
            r1 = 3
            r4.m25824(r0, r1)
        L23:
            int r0 = r3.f28997
            if (r0 == 0) goto L2b
            r1 = 4
            r4.m25813(r0, r1)
        L2b:
            int r0 = r3.f28998
            if (r0 == 0) goto L33
            r1 = 5
            r4.m25813(r0, r1)
        L33:
            android.content.res.ColorStateList r0 = r3.f28999
            if (r0 == 0) goto L3b
            r1 = 6
            r4.m25824(r0, r1)
        L3b:
            java.lang.String r0 = r3.f29001
            if (r0 == 0) goto L43
            r1 = 7
            r4.m25832(r0, r1)
        L43:
            java.lang.String r3 = r3.f29002
            if (r3 == 0) goto L4c
            r0 = 8
            r4.m25832(r3, r0)
        L4c:
            return
    }
}
