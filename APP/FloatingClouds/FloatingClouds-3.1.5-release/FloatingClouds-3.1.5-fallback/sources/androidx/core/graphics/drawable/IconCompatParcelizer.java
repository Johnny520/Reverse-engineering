package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(a.AbstractC0253lg r5) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f884a
            r2 = 1
            boolean r2 = r5.h(r2)
            if (r2 != 0) goto Lf
            goto L13
        Lf:
            int r1 = r5.i()
        L13:
            r0.f884a = r1
            byte[] r1 = r0.c
            r2 = 2
            boolean r3 = r5.h(r2)
            if (r3 != 0) goto L1f
            goto L23
        L1f:
            byte[] r1 = r5.f()
        L23:
            r0.c = r1
            android.os.Parcelable r1 = r0.d
            r3 = 3
            boolean r4 = r5.h(r3)
            if (r4 != 0) goto L2f
            goto L33
        L2f:
            android.os.Parcelable r1 = r5.j()
        L33:
            r0.d = r1
            int r1 = r0.e
            r4 = 4
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L3f
            goto L43
        L3f:
            int r1 = r5.i()
        L43:
            r0.e = r1
            int r1 = r0.f
            r4 = 5
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L4f
            goto L53
        L4f:
            int r1 = r5.i()
        L53:
            r0.f = r1
            android.content.res.ColorStateList r1 = r0.g
            r4 = 6
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L5f
            goto L63
        L5f:
            android.os.Parcelable r1 = r5.j()
        L63:
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.g = r1
            java.lang.String r1 = r0.i
            r4 = 7
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L71
            goto L75
        L71:
            java.lang.String r1 = r5.k()
        L75:
            r0.i = r1
            java.lang.String r1 = r0.j
            r4 = 8
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L82
            goto L86
        L82:
            java.lang.String r1 = r5.k()
        L86:
            r0.j = r1
            java.lang.String r5 = r0.i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.h = r5
            int r5 = r0.f884a
            r1 = 0
            switch(r5) {
                case -1: goto Ld2;
                case 0: goto L96;
                case 1: goto Lbf;
                case 2: goto L9c;
                case 3: goto L97;
                case 4: goto L9c;
                case 5: goto Lbf;
                case 6: goto L9c;
                default: goto L96;
            }
        L96:
            goto Lbe
        L97:
            byte[] r5 = r0.c
            r0.b = r5
            return r0
        L9c:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.b = r5
            int r3 = r0.f884a
            if (r3 != r2) goto Lbe
            java.lang.String r2 = r0.j
            if (r2 != 0) goto Lbe
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r5 = r5.split(r2, r3)
            r5 = r5[r1]
            r0.j = r5
        Lbe:
            return r0
        Lbf:
            android.os.Parcelable r5 = r0.d
            if (r5 == 0) goto Lc6
            r0.b = r5
            return r0
        Lc6:
            byte[] r5 = r0.c
            r0.b = r5
            r0.f884a = r3
            r0.e = r1
            int r5 = r5.length
            r0.f = r5
            return r0
        Ld2:
            android.os.Parcelable r5 = r0.d
            if (r5 == 0) goto Ld9
            r0.b = r5
            return r0
        Ld9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r2, a.AbstractC0253lg r3) {
            r3.getClass()
            android.graphics.PorterDuff$Mode r0 = r2.h
            java.lang.String r0 = r0.name()
            r2.i = r0
            int r0 = r2.f884a
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
            java.lang.Object r0 = r2.b
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r2.c = r0
            goto L47
        L24:
            java.lang.Object r0 = r2.b
            byte[] r0 = (byte[]) r0
            r2.c = r0
            goto L47
        L2b:
            java.lang.Object r0 = r2.b
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            r2.c = r0
            goto L47
        L3a:
            java.lang.Object r0 = r2.b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r2.d = r0
            goto L47
        L41:
            java.lang.Object r0 = r2.b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r2.d = r0
        L47:
            int r0 = r2.f884a
            r1 = -1
            if (r1 == r0) goto L53
            r1 = 1
            r3.m(r1)
            r3.q(r0)
        L53:
            byte[] r0 = r2.c
            if (r0 == 0) goto L5e
            r1 = 2
            r3.m(r1)
            r3.o(r0)
        L5e:
            android.os.Parcelable r0 = r2.d
            if (r0 == 0) goto L69
            r1 = 3
            r3.m(r1)
            r3.r(r0)
        L69:
            int r0 = r2.e
            if (r0 == 0) goto L74
            r1 = 4
            r3.m(r1)
            r3.q(r0)
        L74:
            int r0 = r2.f
            if (r0 == 0) goto L7f
            r1 = 5
            r3.m(r1)
            r3.q(r0)
        L7f:
            android.content.res.ColorStateList r0 = r2.g
            if (r0 == 0) goto L8a
            r1 = 6
            r3.m(r1)
            r3.r(r0)
        L8a:
            java.lang.String r0 = r2.i
            if (r0 == 0) goto L95
            r1 = 7
            r3.m(r1)
            r3.s(r0)
        L95:
            java.lang.String r2 = r2.j
            if (r2 == 0) goto La1
            r0 = 8
            r3.m(r0)
            r3.s(r2)
        La1:
            return
    }
}
