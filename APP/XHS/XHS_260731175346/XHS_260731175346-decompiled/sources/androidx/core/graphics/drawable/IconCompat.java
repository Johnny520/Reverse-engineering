package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final android.graphics.PorterDuff.Mode f14 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.Object f15;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public byte[] f16;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f17;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f18;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public java.lang.String f19;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f20;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public java.lang.String f21;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public android.content.res.ColorStateList f22;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public android.os.Parcelable f23;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f24;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.f14 = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f18
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r3 = r3.f15
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r3.f18
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
            int r2 = r3.f18
            switch(r2) {
                case 1: goto La2;
                case 2: goto L5b;
                case 3: goto L42;
                case 4: goto L36;
                case 5: goto La2;
                case 6: goto L36;
                default: goto L34;
            }
        L34:
            goto Lc2
        L36:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r3.f15
            r0.append(r1)
            goto Lc2
        L42:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r3.f17
            r0.append(r1)
            int r1 = r3.f24
            if (r1 == 0) goto Lc2
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r3.f24
            r0.append(r1)
            goto Lc2
        L5b:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            java.lang.String r2 = r3.f21
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            int r2 = r3.f18
            if (r2 != r1) goto L77
            java.lang.Object r1 = r3.f15
            android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
            int r1 = r1.getResId()
            goto L7c
        L77:
            r1 = 2
            if (r2 != r1) goto L8e
            int r1 = r3.f17
        L7c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto Lc2
        L8e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getResId() on "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        La2:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r3.f15
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r3.f15
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        Lc2:
            android.content.res.ColorStateList r1 = r3.f22
            if (r1 == 0) goto Ld0
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r3.f22
            r0.append(r1)
        Ld0:
            android.graphics.PorterDuff$Mode r1 = r3.f20
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f14
            if (r1 == r2) goto Le0
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r3 = r3.f20
            r0.append(r3)
        Le0:
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
