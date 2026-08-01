package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* JADX INFO: renamed from: λ */
    public static final android.graphics.PorterDuff.Mode f1004 = null;

    /* JADX INFO: renamed from: α */
    public int f1005;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f1006;

    /* JADX INFO: renamed from: γ */
    public byte[] f1007;

    /* JADX INFO: renamed from: δ */
    public android.os.Parcelable f1008;

    /* JADX INFO: renamed from: ε */
    public int f1009;

    /* JADX INFO: renamed from: ζ */
    public int f1010;

    /* JADX INFO: renamed from: η */
    public android.content.res.ColorStateList f1011;

    /* JADX INFO: renamed from: θ */
    public android.graphics.PorterDuff.Mode f1012;

    /* JADX INFO: renamed from: ι */
    public java.lang.String f1013;

    /* JADX INFO: renamed from: κ */
    public java.lang.String f1014;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.f1004 = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f1005
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r3 = r3.f1006
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r3.f1005
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
            int r2 = r3.f1005
            switch(r2) {
                case 1: goto L94;
                case 2: goto L5a;
                case 3: goto L41;
                case 4: goto L36;
                case 5: goto L94;
                case 6: goto L36;
                default: goto L34;
            }
        L34:
            goto Lb4
        L36:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r3.f1006
            r0.append(r1)
            goto Lb4
        L41:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r3.f1009
            r0.append(r1)
            int r1 = r3.f1010
            if (r1 == 0) goto Lb4
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r3.f1010
            r0.append(r1)
            goto Lb4
        L5a:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            java.lang.String r2 = r3.f1014
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            int r2 = r3.f1005
            if (r2 != r1) goto L76
            java.lang.Object r1 = r3.f1006
            android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
            int r1 = r1.getResId()
            goto L7b
        L76:
            r1 = 2
            if (r2 != r1) goto L8d
            int r1 = r3.f1009
        L7b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto Lb4
        L8d:
            java.lang.String r0 = "called getResId() on "
            p000.C1080.m7268(r3, r0)
            r3 = 0
            return r3
        L94:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r3.f1006
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r3.f1006
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        Lb4:
            android.content.res.ColorStateList r1 = r3.f1011
            if (r1 == 0) goto Lc2
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r3.f1011
            r0.append(r1)
        Lc2:
            android.graphics.PorterDuff$Mode r1 = r3.f1012
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f1004
            if (r1 == r2) goto Ld2
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r3 = r3.f1012
            r0.append(r3)
        Ld2:
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
