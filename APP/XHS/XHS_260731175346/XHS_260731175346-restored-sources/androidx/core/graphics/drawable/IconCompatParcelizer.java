package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(xhss.AbstractC0668 r8) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            r1 = -1
            r0.f18 = r1
            r2 = 0
            r0.f16 = r2
            r0.f23 = r2
            r3 = 0
            r0.f17 = r3
            r0.f24 = r3
            r0.f22 = r2
            android.graphics.PorterDuff$Mode r4 = androidx.core.graphics.drawable.IconCompat.f14
            r0.f20 = r4
            r0.f19 = r2
            r4 = 1
            boolean r4 = r8.mo232(r4)
            if (r4 != 0) goto L23
            r4 = r1
            goto L2c
        L23:
            r4 = r8
            xhss.ᛱᛸᛵᛳ r4 = (xhss.C0076) r4
            android.os.Parcel r4 = r4.f410
            int r4 = r4.readInt()
        L2c:
            r0.f18 = r4
            byte[] r4 = r0.f16
            r5 = 2
            boolean r6 = r8.mo232(r5)
            if (r6 != 0) goto L38
            goto L4b
        L38:
            r4 = r8
            xhss.ᛱᛸᛵᛳ r4 = (xhss.C0076) r4
            android.os.Parcel r4 = r4.f410
            int r6 = r4.readInt()
            if (r6 >= 0) goto L45
            r4 = r2
            goto L4b
        L45:
            byte[] r6 = new byte[r6]
            r4.readByteArray(r6)
            r4 = r6
        L4b:
            r0.f16 = r4
            android.os.Parcelable r4 = r0.f23
            r6 = 3
            android.os.Parcelable r4 = r8.m1153(r4, r6)
            r0.f23 = r4
            int r4 = r0.f17
            r7 = 4
            boolean r7 = r8.mo232(r7)
            if (r7 != 0) goto L60
            goto L69
        L60:
            r4 = r8
            xhss.ᛱᛸᛵᛳ r4 = (xhss.C0076) r4
            android.os.Parcel r4 = r4.f410
            int r4 = r4.readInt()
        L69:
            r0.f17 = r4
            int r4 = r0.f24
            r7 = 5
            boolean r7 = r8.mo232(r7)
            if (r7 != 0) goto L75
            goto L7e
        L75:
            r4 = r8
            xhss.ᛱᛸᛵᛳ r4 = (xhss.C0076) r4
            android.os.Parcel r4 = r4.f410
            int r4 = r4.readInt()
        L7e:
            r0.f24 = r4
            android.content.res.ColorStateList r4 = r0.f22
            r7 = 6
            android.os.Parcelable r4 = r8.m1153(r4, r7)
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            r0.f22 = r4
            java.lang.String r4 = r0.f19
            r7 = 7
            boolean r7 = r8.mo232(r7)
            if (r7 != 0) goto L95
            goto L9e
        L95:
            r4 = r8
            xhss.ᛱᛸᛵᛳ r4 = (xhss.C0076) r4
            android.os.Parcel r4 = r4.f410
            java.lang.String r4 = r4.readString()
        L9e:
            r0.f19 = r4
            java.lang.String r4 = r0.f21
            r7 = 8
            boolean r7 = r8.mo232(r7)
            if (r7 != 0) goto Lab
            goto Lb3
        Lab:
            xhss.ᛱᛸᛵᛳ r8 = (xhss.C0076) r8
            android.os.Parcel r8 = r8.f410
            java.lang.String r4 = r8.readString()
        Lb3:
            r0.f21 = r4
            java.lang.String r8 = r0.f19
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.valueOf(r8)
            r0.f20 = r8
            int r8 = r0.f18
            switch(r8) {
                case -1: goto Lfd;
                case 0: goto Lc2;
                case 1: goto Lea;
                case 2: goto Lc8;
                case 3: goto Lc3;
                case 4: goto Lc8;
                case 5: goto Lea;
                case 6: goto Lc8;
                default: goto Lc2;
            }
        Lc2:
            goto Le9
        Lc3:
            byte[] r8 = r0.f16
            r0.f15 = r8
            return r0
        Lc8:
            java.lang.String r8 = new java.lang.String
            byte[] r2 = r0.f16
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r8.<init>(r2, r4)
            r0.f15 = r8
            int r2 = r0.f18
            if (r2 != r5) goto Le9
            java.lang.String r2 = r0.f21
            if (r2 != 0) goto Le9
            java.lang.String r2 = ":"
            java.lang.String[] r8 = r8.split(r2, r1)
            r8 = r8[r3]
            r0.f21 = r8
        Le9:
            return r0
        Lea:
            android.os.Parcelable r8 = r0.f23
            if (r8 == 0) goto Lf1
            r0.f15 = r8
            return r0
        Lf1:
            byte[] r8 = r0.f16
            r0.f15 = r8
            r0.f18 = r6
            r0.f17 = r3
            int r8 = r8.length
            r0.f24 = r8
            return r0
        Lfd:
            android.os.Parcelable r8 = r0.f23
            if (r8 == 0) goto L104
            r0.f15 = r8
            return r0
        L104:
            java.lang.String r8 = "Invalid icon"
            xhss.C0532.m959(r8)
            return r2
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r3, xhss.AbstractC0668 r4) {
            r4.getClass()
            android.graphics.PorterDuff$Mode r0 = r3.f20
            java.lang.String r0 = r0.name()
            r3.f19 = r0
            int r0 = r3.f18
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
            java.lang.Object r0 = r3.f15
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r3.f16 = r0
            goto L47
        L24:
            java.lang.Object r0 = r3.f15
            byte[] r0 = (byte[]) r0
            r3.f16 = r0
            goto L47
        L2b:
            java.lang.Object r0 = r3.f15
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r3.f16 = r0
            goto L47
        L3a:
            java.lang.Object r0 = r3.f15
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.f23 = r0
            goto L47
        L41:
            java.lang.Object r0 = r3.f15
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.f23 = r0
        L47:
            int r0 = r3.f18
            r1 = -1
            if (r1 == r0) goto L58
            r1 = 1
            r4.mo234(r1)
            r1 = r4
            xhss.ᛱᛸᛵᛳ r1 = (xhss.C0076) r1
            android.os.Parcel r1 = r1.f410
            r1.writeInt(r0)
        L58:
            byte[] r0 = r3.f16
            if (r0 == 0) goto L6c
            r1 = 2
            r4.mo234(r1)
            r1 = r4
            xhss.ᛱᛸᛵᛳ r1 = (xhss.C0076) r1
            android.os.Parcel r1 = r1.f410
            int r2 = r0.length
            r1.writeInt(r2)
            r1.writeByteArray(r0)
        L6c:
            android.os.Parcelable r0 = r3.f23
            r1 = 0
            if (r0 == 0) goto L7d
            r2 = 3
            r4.mo234(r2)
            r2 = r4
            xhss.ᛱᛸᛵᛳ r2 = (xhss.C0076) r2
            android.os.Parcel r2 = r2.f410
            r2.writeParcelable(r0, r1)
        L7d:
            int r0 = r3.f17
            if (r0 == 0) goto L8d
            r2 = 4
            r4.mo234(r2)
            r2 = r4
            xhss.ᛱᛸᛵᛳ r2 = (xhss.C0076) r2
            android.os.Parcel r2 = r2.f410
            r2.writeInt(r0)
        L8d:
            int r0 = r3.f24
            if (r0 == 0) goto L9d
            r2 = 5
            r4.mo234(r2)
            r2 = r4
            xhss.ᛱᛸᛵᛳ r2 = (xhss.C0076) r2
            android.os.Parcel r2 = r2.f410
            r2.writeInt(r0)
        L9d:
            android.content.res.ColorStateList r0 = r3.f22
            if (r0 == 0) goto Lad
            r2 = 6
            r4.mo234(r2)
            r2 = r4
            xhss.ᛱᛸᛵᛳ r2 = (xhss.C0076) r2
            android.os.Parcel r2 = r2.f410
            r2.writeParcelable(r0, r1)
        Lad:
            java.lang.String r0 = r3.f19
            if (r0 == 0) goto Lbd
            r1 = 7
            r4.mo234(r1)
            r1 = r4
            xhss.ᛱᛸᛵᛳ r1 = (xhss.C0076) r1
            android.os.Parcel r1 = r1.f410
            r1.writeString(r0)
        Lbd:
            java.lang.String r3 = r3.f21
            if (r3 == 0) goto Lcd
            r0 = 8
            r4.mo234(r0)
            xhss.ᛱᛸᛵᛳ r4 = (xhss.C0076) r4
            android.os.Parcel r4 = r4.f410
            r4.writeString(r3)
        Lcd:
            return
    }
}
