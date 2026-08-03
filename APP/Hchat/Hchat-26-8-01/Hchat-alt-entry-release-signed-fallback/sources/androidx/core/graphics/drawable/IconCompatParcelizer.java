package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(z3.b r7) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            r1 = -1
            r0.f263a = r1
            r2 = 0
            r0.f265c = r2
            r0.f266d = r2
            r3 = 0
            r0.f267e = r3
            r0.f268f = r3
            r0.f269g = r2
            android.graphics.PorterDuff$Mode r4 = androidx.core.graphics.drawable.IconCompat.f262k
            r0.f270h = r4
            r0.f271i = r2
            r4 = 1
            boolean r4 = r7.e(r4)
            if (r4 != 0) goto L23
            r4 = r1
            goto L2c
        L23:
            r4 = r7
            z3.c r4 = (z3.c) r4
            android.os.Parcel r4 = r4.f22524e
            int r4 = r4.readInt()
        L2c:
            r0.f263a = r4
            byte[] r4 = r0.f265c
            r5 = 2
            boolean r6 = r7.e(r5)
            if (r6 != 0) goto L39
            r2 = r4
            goto L4a
        L39:
            r4 = r7
            z3.c r4 = (z3.c) r4
            android.os.Parcel r4 = r4.f22524e
            int r6 = r4.readInt()
            if (r6 >= 0) goto L45
            goto L4a
        L45:
            byte[] r2 = new byte[r6]
            r4.readByteArray(r2)
        L4a:
            r0.f265c = r2
            android.os.Parcelable r2 = r0.f266d
            r4 = 3
            android.os.Parcelable r2 = r7.f(r2, r4)
            r0.f266d = r2
            int r2 = r0.f267e
            r6 = 4
            boolean r6 = r7.e(r6)
            if (r6 != 0) goto L5f
            goto L68
        L5f:
            r2 = r7
            z3.c r2 = (z3.c) r2
            android.os.Parcel r2 = r2.f22524e
            int r2 = r2.readInt()
        L68:
            r0.f267e = r2
            int r2 = r0.f268f
            r6 = 5
            boolean r6 = r7.e(r6)
            if (r6 != 0) goto L74
            goto L7d
        L74:
            r2 = r7
            z3.c r2 = (z3.c) r2
            android.os.Parcel r2 = r2.f22524e
            int r2 = r2.readInt()
        L7d:
            r0.f268f = r2
            android.content.res.ColorStateList r2 = r0.f269g
            r6 = 6
            android.os.Parcelable r2 = r7.f(r2, r6)
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r0.f269g = r2
            java.lang.String r2 = r0.f271i
            r6 = 7
            boolean r6 = r7.e(r6)
            if (r6 != 0) goto L94
            goto L9d
        L94:
            r2 = r7
            z3.c r2 = (z3.c) r2
            android.os.Parcel r2 = r2.f22524e
            java.lang.String r2 = r2.readString()
        L9d:
            r0.f271i = r2
            java.lang.String r2 = r0.f272j
            r6 = 8
            boolean r6 = r7.e(r6)
            if (r6 != 0) goto Laa
            goto Lb2
        Laa:
            z3.c r7 = (z3.c) r7
            android.os.Parcel r7 = r7.f22524e
            java.lang.String r2 = r7.readString()
        Lb2:
            r0.f272j = r2
            java.lang.String r7 = r0.f271i
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.valueOf(r7)
            r0.f270h = r7
            int r7 = r0.f263a
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
            byte[] r7 = r0.f265c
            r0.f264b = r7
            return r0
        Lc7:
            java.lang.String r7 = new java.lang.String
            byte[] r2 = r0.f265c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r7.<init>(r2, r4)
            r0.f264b = r7
            int r2 = r0.f263a
            if (r2 != r5) goto Le8
            java.lang.String r2 = r0.f272j
            if (r2 != 0) goto Le8
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2, r1)
            r7 = r7[r3]
            r0.f272j = r7
        Le8:
            return r0
        Le9:
            android.os.Parcelable r7 = r0.f266d
            if (r7 == 0) goto Lf0
            r0.f264b = r7
            return r0
        Lf0:
            byte[] r7 = r0.f265c
            r0.f264b = r7
            r0.f263a = r4
            r0.f267e = r3
            int r7 = r7.length
            r0.f268f = r7
            return r0
        Lfc:
            android.os.Parcelable r7 = r0.f266d
            if (r7 == 0) goto L103
            r0.f264b = r7
            return r0
        L103:
            java.lang.String r7 = "Invalid icon"
            j8.o.t(r7)
            r7 = 0
            return r7
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r3, z3.b r4) {
            r4.getClass()
            android.graphics.PorterDuff$Mode r0 = r3.f270h
            java.lang.String r0 = r0.name()
            r3.f271i = r0
            int r0 = r3.f263a
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
            java.lang.Object r0 = r3.f264b
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r3.f265c = r0
            goto L47
        L24:
            java.lang.Object r0 = r3.f264b
            byte[] r0 = (byte[]) r0
            r3.f265c = r0
            goto L47
        L2b:
            java.lang.Object r0 = r3.f264b
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r3.f265c = r0
            goto L47
        L3a:
            java.lang.Object r0 = r3.f264b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.f266d = r0
            goto L47
        L41:
            java.lang.Object r0 = r3.f264b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.f266d = r0
        L47:
            int r0 = r3.f263a
            r1 = -1
            if (r1 == r0) goto L58
            r1 = 1
            r4.h(r1)
            r1 = r4
            z3.c r1 = (z3.c) r1
            android.os.Parcel r1 = r1.f22524e
            r1.writeInt(r0)
        L58:
            byte[] r0 = r3.f265c
            if (r0 == 0) goto L6c
            r1 = 2
            r4.h(r1)
            r1 = r4
            z3.c r1 = (z3.c) r1
            android.os.Parcel r1 = r1.f22524e
            int r2 = r0.length
            r1.writeInt(r2)
            r1.writeByteArray(r0)
        L6c:
            android.os.Parcelable r0 = r3.f266d
            r1 = 0
            if (r0 == 0) goto L7d
            r2 = 3
            r4.h(r2)
            r2 = r4
            z3.c r2 = (z3.c) r2
            android.os.Parcel r2 = r2.f22524e
            r2.writeParcelable(r0, r1)
        L7d:
            int r0 = r3.f267e
            if (r0 == 0) goto L8d
            r2 = 4
            r4.h(r2)
            r2 = r4
            z3.c r2 = (z3.c) r2
            android.os.Parcel r2 = r2.f22524e
            r2.writeInt(r0)
        L8d:
            int r0 = r3.f268f
            if (r0 == 0) goto L9d
            r2 = 5
            r4.h(r2)
            r2 = r4
            z3.c r2 = (z3.c) r2
            android.os.Parcel r2 = r2.f22524e
            r2.writeInt(r0)
        L9d:
            android.content.res.ColorStateList r0 = r3.f269g
            if (r0 == 0) goto Lad
            r2 = 6
            r4.h(r2)
            r2 = r4
            z3.c r2 = (z3.c) r2
            android.os.Parcel r2 = r2.f22524e
            r2.writeParcelable(r0, r1)
        Lad:
            java.lang.String r0 = r3.f271i
            if (r0 == 0) goto Lbd
            r1 = 7
            r4.h(r1)
            r1 = r4
            z3.c r1 = (z3.c) r1
            android.os.Parcel r1 = r1.f22524e
            r1.writeString(r0)
        Lbd:
            java.lang.String r3 = r3.f272j
            if (r3 == 0) goto Lcd
            r0 = 8
            r4.h(r0)
            z3.c r4 = (z3.c) r4
            android.os.Parcel r4 = r4.f22524e
            r4.writeString(r3)
        Lcd:
            return
    }
}
