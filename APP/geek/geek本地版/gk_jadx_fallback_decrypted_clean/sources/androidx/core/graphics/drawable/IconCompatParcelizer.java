package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(defpackage.j90 r5) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.a
            r2 = 1
            boolean r2 = r5.e(r2)
            if (r2 != 0) goto Lf
            goto L18
        Lf:
            r1 = r5
            k90 r1 = (defpackage.k90) r1
            android.os.Parcel r1 = r1.e
            int r1 = r1.readInt()
        L18:
            r0.a = r1
            byte[] r1 = r0.c
            r2 = 2
            boolean r3 = r5.e(r2)
            if (r3 != 0) goto L24
            goto L37
        L24:
            r1 = r5
            k90 r1 = (defpackage.k90) r1
            android.os.Parcel r1 = r1.e
            int r3 = r1.readInt()
            if (r3 >= 0) goto L31
            r1 = 0
            goto L37
        L31:
            byte[] r3 = new byte[r3]
            r1.readByteArray(r3)
            r1 = r3
        L37:
            r0.c = r1
            android.os.Parcelable r1 = r0.d
            r3 = 3
            android.os.Parcelable r1 = r5.f(r1, r3)
            r0.d = r1
            int r1 = r0.e
            r4 = 4
            boolean r4 = r5.e(r4)
            if (r4 != 0) goto L4c
            goto L55
        L4c:
            r1 = r5
            k90 r1 = (defpackage.k90) r1
            android.os.Parcel r1 = r1.e
            int r1 = r1.readInt()
        L55:
            r0.e = r1
            int r1 = r0.f
            r4 = 5
            boolean r4 = r5.e(r4)
            if (r4 != 0) goto L61
            goto L6a
        L61:
            r1 = r5
            k90 r1 = (defpackage.k90) r1
            android.os.Parcel r1 = r1.e
            int r1 = r1.readInt()
        L6a:
            r0.f = r1
            android.content.res.ColorStateList r1 = r0.g
            r4 = 6
            android.os.Parcelable r1 = r5.f(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.g = r1
            java.lang.String r1 = r0.i
            r4 = 7
            boolean r4 = r5.e(r4)
            if (r4 != 0) goto L81
            goto L8a
        L81:
            r1 = r5
            k90 r1 = (defpackage.k90) r1
            android.os.Parcel r1 = r1.e
            java.lang.String r1 = r1.readString()
        L8a:
            r0.i = r1
            java.lang.String r1 = r0.j
            r4 = 8
            boolean r4 = r5.e(r4)
            if (r4 != 0) goto L97
            goto L9f
        L97:
            k90 r5 = (defpackage.k90) r5
            android.os.Parcel r5 = r5.e
            java.lang.String r1 = r5.readString()
        L9f:
            r0.j = r1
            java.lang.String r5 = r0.i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.h = r5
            int r5 = r0.a
            r1 = 0
            switch(r5) {
                case -1: goto Leb;
                case 0: goto Laf;
                case 1: goto Ld8;
                case 2: goto Lb5;
                case 3: goto Lb0;
                case 4: goto Lb5;
                case 5: goto Ld8;
                case 6: goto Lb5;
                default: goto Laf;
            }
        Laf:
            goto Ld7
        Lb0:
            byte[] r5 = r0.c
            r0.b = r5
            return r0
        Lb5:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.b = r5
            int r3 = r0.a
            if (r3 != r2) goto Ld7
            java.lang.String r2 = r0.j
            if (r2 != 0) goto Ld7
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r5 = r5.split(r2, r3)
            r5 = r5[r1]
            r0.j = r5
        Ld7:
            return r0
        Ld8:
            android.os.Parcelable r5 = r0.d
            if (r5 == 0) goto Ldf
            r0.b = r5
            return r0
        Ldf:
            byte[] r5 = r0.c
            r0.b = r5
            r0.a = r3
            r0.e = r1
            int r5 = r5.length
            r0.f = r5
            return r0
        Leb:
            android.os.Parcelable r5 = r0.d
            if (r5 == 0) goto Lf2
            r0.b = r5
            return r0
        Lf2:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r3, defpackage.j90 r4) {
            r4.getClass()
            android.graphics.PorterDuff$Mode r0 = r3.h
            java.lang.String r0 = r0.name()
            r3.i = r0
            int r0 = r3.a
            java.lang.String r1 = "UTF-16"
            switch(r0) {
                case -1: goto L41;
                case 0: goto L12;
                case 1: goto L3a;
                case 2: goto L2b;
                case 3: goto L24;
                case 4: goto L13;
                case 5: goto L3a;
                case 6: goto L13;
                default: goto L12;
            }
        L12:
            goto L47
        L13:
            java.lang.Object r0 = r3.b
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r3.c = r0
            goto L47
        L24:
            java.lang.Object r0 = r3.b
            byte[] r0 = (byte[]) r0
            r3.c = r0
            goto L47
        L2b:
            java.lang.Object r0 = r3.b
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r3.c = r0
            goto L47
        L3a:
            java.lang.Object r0 = r3.b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.d = r0
            goto L47
        L41:
            java.lang.Object r0 = r3.b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.d = r0
        L47:
            int r0 = r3.a
            r1 = -1
            if (r1 == r0) goto L58
            r1 = 1
            r4.h(r1)
            r1 = r4
            k90 r1 = (defpackage.k90) r1
            android.os.Parcel r1 = r1.e
            r1.writeInt(r0)
        L58:
            byte[] r0 = r3.c
            if (r0 == 0) goto L6c
            r1 = 2
            r4.h(r1)
            r1 = r4
            k90 r1 = (defpackage.k90) r1
            android.os.Parcel r1 = r1.e
            int r2 = r0.length
            r1.writeInt(r2)
            r1.writeByteArray(r0)
        L6c:
            android.os.Parcelable r0 = r3.d
            r1 = 0
            if (r0 == 0) goto L7d
            r2 = 3
            r4.h(r2)
            r2 = r4
            k90 r2 = (defpackage.k90) r2
            android.os.Parcel r2 = r2.e
            r2.writeParcelable(r0, r1)
        L7d:
            int r0 = r3.e
            if (r0 == 0) goto L8d
            r2 = 4
            r4.h(r2)
            r2 = r4
            k90 r2 = (defpackage.k90) r2
            android.os.Parcel r2 = r2.e
            r2.writeInt(r0)
        L8d:
            int r0 = r3.f
            if (r0 == 0) goto L9d
            r2 = 5
            r4.h(r2)
            r2 = r4
            k90 r2 = (defpackage.k90) r2
            android.os.Parcel r2 = r2.e
            r2.writeInt(r0)
        L9d:
            android.content.res.ColorStateList r0 = r3.g
            if (r0 == 0) goto Lad
            r2 = 6
            r4.h(r2)
            r2 = r4
            k90 r2 = (defpackage.k90) r2
            android.os.Parcel r2 = r2.e
            r2.writeParcelable(r0, r1)
        Lad:
            java.lang.String r0 = r3.i
            if (r0 == 0) goto Lbd
            r1 = 7
            r4.h(r1)
            r1 = r4
            k90 r1 = (defpackage.k90) r1
            android.os.Parcel r1 = r1.e
            r1.writeString(r0)
        Lbd:
            java.lang.String r3 = r3.j
            if (r3 == 0) goto Lcd
            r0 = 8
            r4.h(r0)
            k90 r4 = (defpackage.k90) r4
            android.os.Parcel r4 = r4.e
            r4.writeString(r3)
        Lcd:
            return
    }
}
