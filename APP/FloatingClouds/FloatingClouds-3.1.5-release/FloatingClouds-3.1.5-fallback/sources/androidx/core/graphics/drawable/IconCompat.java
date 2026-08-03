package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff.Mode k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f884a;
    public java.lang.Object b;
    public byte[] c;
    public android.os.Parcelable d;
    public int e;
    public int f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public java.lang.String i;
    public java.lang.String j;

    public static class a {
        public static int a(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                int r0 = r0.getResId()
                return r0
        }

        public static java.lang.String b(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                java.lang.String r0 = r0.getResPackage()
                return r0
        }

        public static int c(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                int r0 = r0.getType()
                return r0
        }

        public static android.net.Uri d(java.lang.Object r0) {
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                android.net.Uri r0 = r0.getUri()
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.k = r0
            return
    }

    public IconCompat() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f884a = r0
            r0 = 0
            r2.c = r0
            r2.d = r0
            r1 = 0
            r2.e = r1
            r2.f = r1
            r2.g = r0
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.k
            r2.h = r1
            r2.i = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f884a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r3.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r3.f884a
            switch(r2) {
                case 1: goto L2a;
                case 2: goto L27;
                case 3: goto L24;
                case 4: goto L21;
                case 5: goto L1e;
                case 6: goto L1b;
                default: goto L18;
            }
        L18:
            java.lang.String r2 = "UNKNOWN"
            goto L2c
        L1b:
            java.lang.String r2 = "URI_MASKABLE"
            goto L2c
        L1e:
            java.lang.String r2 = "BITMAP_MASKABLE"
            goto L2c
        L21:
            java.lang.String r2 = "URI"
            goto L2c
        L24:
            java.lang.String r2 = "DATA"
            goto L2c
        L27:
            java.lang.String r2 = "RESOURCE"
            goto L2c
        L2a:
            java.lang.String r2 = "BITMAP"
        L2c:
            r0.append(r2)
            int r2 = r3.f884a
            switch(r2) {
                case 1: goto La0;
                case 2: goto L5b;
                case 3: goto L42;
                case 4: goto L36;
                case 5: goto La0;
                case 6: goto L36;
                default: goto L34;
            }
        L34:
            goto Lc0
        L36:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r3.b
            r0.append(r1)
            goto Lc0
        L42:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r3.e
            r0.append(r1)
            int r1 = r3.f
            if (r1 == 0) goto Lc0
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r3.f
            r0.append(r1)
            goto Lc0
        L5b:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            java.lang.String r2 = r3.j
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            int r2 = r3.f884a
            if (r2 != r1) goto L75
            java.lang.Object r1 = r3.b
            int r1 = androidx.core.graphics.drawable.IconCompat.a.a(r1)
            goto L7a
        L75:
            r1 = 2
            if (r2 != r1) goto L8c
            int r1 = r3.e
        L7a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto Lc0
        L8c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getResId() on "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La0:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r3.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r3.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        Lc0:
            android.content.res.ColorStateList r1 = r3.g
            if (r1 == 0) goto Lce
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r3.g
            r0.append(r1)
        Lce:
            android.graphics.PorterDuff$Mode r1 = r3.h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.k
            if (r1 == r2) goto Lde
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r3.h
            r0.append(r1)
        Lde:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
