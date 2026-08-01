package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final android.graphics.PorterDuff.Mode f232 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f233;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.lang.String f234;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f235;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.os.Parcelable f236;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public byte[] f237;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f238;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public java.lang.String f239;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f240;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f241;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.content.res.ColorStateList f242;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.f232 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static androidx.core.graphics.drawable.IconCompat m83(int r3) {
            if (r3 == 0) goto L23
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            r1 = 0
            r0.f237 = r1
            r0.f236 = r1
            r2 = 0
            r0.f241 = r2
            r0.f242 = r1
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f232
            r0.f233 = r2
            r0.f234 = r1
            r1 = 2
            r0.f238 = r1
            r0.f235 = r3
            java.lang.String r3 = ""
            r0.f240 = r3
            r0.f239 = r3
            return r0
        L23:
            java.lang.String r3 = "Drawable resource ID must not be 0"
            defpackage.C2264.m3684(r3)
            r3 = 0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f238
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r3 = r3.f240
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r3.f238
            switch(r1) {
                case 1: goto L2a;
                case 2: goto L27;
                case 3: goto L24;
                case 4: goto L21;
                case 5: goto L1e;
                case 6: goto L1b;
                default: goto L18;
            }
        L18:
            java.lang.String r1 = "UNKNOWN"
            goto L2c
        L1b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L2c
        L1e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L2c
        L21:
            java.lang.String r1 = "URI"
            goto L2c
        L24:
            java.lang.String r1 = "DATA"
            goto L2c
        L27:
            java.lang.String r1 = "RESOURCE"
            goto L2c
        L2a:
            java.lang.String r1 = "BITMAP"
        L2c:
            r0.append(r1)
            int r1 = r3.f238
            switch(r1) {
                case 1: goto L7e;
                case 2: goto L59;
                case 3: goto L40;
                case 4: goto L35;
                case 5: goto L7e;
                case 6: goto L35;
                default: goto L34;
            }
        L34:
            goto L9e
        L35:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r3.f240
            r0.append(r1)
            goto L9e
        L40:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r3.f235
            r0.append(r1)
            int r1 = r3.f241
            if (r1 == 0) goto L9e
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r3.f241
            r0.append(r1)
            goto L9e
        L59:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r3.f239
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            int r1 = r3.m84()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L9e
        L7e:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r3.f240
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r3.f240
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L9e:
            android.content.res.ColorStateList r1 = r3.f242
            if (r1 == 0) goto Lac
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r3.f242
            r0.append(r1)
        Lac:
            android.graphics.PorterDuff$Mode r1 = r3.f233
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f232
            if (r1 == r2) goto Lbc
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r3 = r3.f233
            r0.append(r3)
        Lbc:
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m84() {
            r2 = this;
            int r0 = r2.f238
            r1 = -1
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.f240
            android.graphics.drawable.Icon r2 = (android.graphics.drawable.Icon) r2
            int r2 = r2.getResId()
            return r2
        Le:
            r1 = 2
            if (r0 != r1) goto L14
            int r2 = r2.f235
            return r2
        L14:
            java.lang.String r0 = "called getResId() on "
            defpackage.C2264.m3671(r2, r0)
            r2 = 0
            return r2
    }
}
