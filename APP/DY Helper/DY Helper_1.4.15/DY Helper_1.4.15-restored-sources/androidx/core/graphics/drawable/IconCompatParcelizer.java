package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(p000.v72 r7) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            r1 = -1
            r0.f1005 = r1
            r2 = 0
            r0.f1007 = r2
            r0.f1008 = r2
            r3 = 0
            r0.f1009 = r3
            r0.f1010 = r3
            r0.f1011 = r2
            android.graphics.PorterDuff$Mode r4 = androidx.core.graphics.drawable.IconCompat.f1004
            r0.f1012 = r4
            r0.f1013 = r2
            r4 = 1
            boolean r4 = r7.mo6057(r4)
            if (r4 != 0) goto L23
            r4 = r1
            goto L2c
        L23:
            r4 = r7
            w72 r4 = (p000.w72) r4
            android.os.Parcel r4 = r4.f11594
            int r4 = r4.readInt()
        L2c:
            r0.f1005 = r4
            byte[] r4 = r0.f1007
            r5 = 2
            boolean r6 = r7.mo6057(r5)
            if (r6 != 0) goto L39
            r2 = r4
            goto L4a
        L39:
            r4 = r7
            w72 r4 = (p000.w72) r4
            android.os.Parcel r4 = r4.f11594
            int r6 = r4.readInt()
            if (r6 >= 0) goto L45
            goto L4a
        L45:
            byte[] r2 = new byte[r6]
            r4.readByteArray(r2)
        L4a:
            r0.f1007 = r2
            android.os.Parcelable r2 = r0.f1008
            r4 = 3
            android.os.Parcelable r2 = r7.m6058(r2, r4)
            r0.f1008 = r2
            int r2 = r0.f1009
            r6 = 4
            boolean r6 = r7.mo6057(r6)
            if (r6 != 0) goto L5f
            goto L68
        L5f:
            r2 = r7
            w72 r2 = (p000.w72) r2
            android.os.Parcel r2 = r2.f11594
            int r2 = r2.readInt()
        L68:
            r0.f1009 = r2
            int r2 = r0.f1010
            r6 = 5
            boolean r6 = r7.mo6057(r6)
            if (r6 != 0) goto L74
            goto L7d
        L74:
            r2 = r7
            w72 r2 = (p000.w72) r2
            android.os.Parcel r2 = r2.f11594
            int r2 = r2.readInt()
        L7d:
            r0.f1010 = r2
            android.content.res.ColorStateList r2 = r0.f1011
            r6 = 6
            android.os.Parcelable r2 = r7.m6058(r2, r6)
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r0.f1011 = r2
            java.lang.String r2 = r0.f1013
            r6 = 7
            boolean r6 = r7.mo6057(r6)
            if (r6 != 0) goto L94
            goto L9d
        L94:
            r2 = r7
            w72 r2 = (p000.w72) r2
            android.os.Parcel r2 = r2.f11594
            java.lang.String r2 = r2.readString()
        L9d:
            r0.f1013 = r2
            java.lang.String r2 = r0.f1014
            r6 = 8
            boolean r6 = r7.mo6057(r6)
            if (r6 != 0) goto Laa
            goto Lb2
        Laa:
            w72 r7 = (p000.w72) r7
            android.os.Parcel r7 = r7.f11594
            java.lang.String r2 = r7.readString()
        Lb2:
            r0.f1014 = r2
            java.lang.String r7 = r0.f1013
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.valueOf(r7)
            r0.f1012 = r7
            int r7 = r0.f1005
            switch(r7) {
                case -1: goto Lfc;
                case 0: goto Lc1;
                case 1: goto Le9;
                case 2: goto Lc7;
                case 3: goto Lc2;
                case 4: goto Lc7;
                case 5: goto Le9;
                case 6: goto Lc7;
                default: goto Lc1;
            }
        Lc1:
            goto Le8
        Lc2:
            byte[] r7 = r0.f1007
            r0.f1006 = r7
            return r0
        Lc7:
            java.lang.String r7 = new java.lang.String
            byte[] r2 = r0.f1007
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r7.<init>(r2, r4)
            r0.f1006 = r7
            int r2 = r0.f1005
            if (r2 != r5) goto Le8
            java.lang.String r2 = r0.f1014
            if (r2 != 0) goto Le8
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2, r1)
            r7 = r7[r3]
            r0.f1014 = r7
        Le8:
            return r0
        Le9:
            android.os.Parcelable r7 = r0.f1008
            if (r7 == 0) goto Lf0
            r0.f1006 = r7
            return r0
        Lf0:
            byte[] r7 = r0.f1007
            r0.f1006 = r7
            r0.f1005 = r4
            r0.f1009 = r3
            int r7 = r7.length
            r0.f1010 = r7
            return r0
        Lfc:
            android.os.Parcelable r7 = r0.f1008
            if (r7 == 0) goto L103
            r0.f1006 = r7
            return r0
        L103:
            java.lang.String r7 = "Invalid icon"
            p000.C1080.m7275(r7)
            r7 = 0
            return r7
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r3, p000.v72 r4) {
            r4.getClass()
            android.graphics.PorterDuff$Mode r0 = r3.f1012
            java.lang.String r0 = r0.name()
            r3.f1013 = r0
            int r0 = r3.f1005
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
            java.lang.Object r0 = r3.f1006
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r3.f1007 = r0
            goto L47
        L24:
            java.lang.Object r0 = r3.f1006
            byte[] r0 = (byte[]) r0
            r3.f1007 = r0
            goto L47
        L2b:
            java.lang.Object r0 = r3.f1006
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r3.f1007 = r0
            goto L47
        L3a:
            java.lang.Object r0 = r3.f1006
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.f1008 = r0
            goto L47
        L41:
            java.lang.Object r0 = r3.f1006
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.f1008 = r0
        L47:
            int r0 = r3.f1005
            r1 = -1
            if (r1 == r0) goto L58
            r1 = 1
            r4.mo6060(r1)
            r1 = r4
            w72 r1 = (p000.w72) r1
            android.os.Parcel r1 = r1.f11594
            r1.writeInt(r0)
        L58:
            byte[] r0 = r3.f1007
            if (r0 == 0) goto L6c
            r1 = 2
            r4.mo6060(r1)
            r1 = r4
            w72 r1 = (p000.w72) r1
            android.os.Parcel r1 = r1.f11594
            int r2 = r0.length
            r1.writeInt(r2)
            r1.writeByteArray(r0)
        L6c:
            android.os.Parcelable r0 = r3.f1008
            r1 = 0
            if (r0 == 0) goto L7d
            r2 = 3
            r4.mo6060(r2)
            r2 = r4
            w72 r2 = (p000.w72) r2
            android.os.Parcel r2 = r2.f11594
            r2.writeParcelable(r0, r1)
        L7d:
            int r0 = r3.f1009
            if (r0 == 0) goto L8d
            r2 = 4
            r4.mo6060(r2)
            r2 = r4
            w72 r2 = (p000.w72) r2
            android.os.Parcel r2 = r2.f11594
            r2.writeInt(r0)
        L8d:
            int r0 = r3.f1010
            if (r0 == 0) goto L9d
            r2 = 5
            r4.mo6060(r2)
            r2 = r4
            w72 r2 = (p000.w72) r2
            android.os.Parcel r2 = r2.f11594
            r2.writeInt(r0)
        L9d:
            android.content.res.ColorStateList r0 = r3.f1011
            if (r0 == 0) goto Lad
            r2 = 6
            r4.mo6060(r2)
            r2 = r4
            w72 r2 = (p000.w72) r2
            android.os.Parcel r2 = r2.f11594
            r2.writeParcelable(r0, r1)
        Lad:
            java.lang.String r0 = r3.f1013
            if (r0 == 0) goto Lbd
            r1 = 7
            r4.mo6060(r1)
            r1 = r4
            w72 r1 = (p000.w72) r1
            android.os.Parcel r1 = r1.f11594
            r1.writeString(r0)
        Lbd:
            java.lang.String r3 = r3.f1014
            if (r3 == 0) goto Lcd
            r0 = 8
            r4.mo6060(r0)
            w72 r4 = (p000.w72) r4
            android.os.Parcel r4 = r4.f11594
            r4.writeString(r3)
        Lcd:
            return
    }
}
