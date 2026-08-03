package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f262k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.os.Parcelable f266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.String f272j;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.f262k = r0
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            int r0 = r7.f263a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r7.f264b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r7.f263a
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
            int r2 = r7.f263a
            switch(r2) {
                case 1: goto Lc7;
                case 2: goto L5c;
                case 3: goto L42;
                case 4: goto L36;
                case 5: goto Lc7;
                case 6: goto L36;
                default: goto L34;
            }
        L34:
            goto Le7
        L36:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r7.f264b
            r0.append(r1)
            goto Le7
        L42:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r7.f267e
            r0.append(r1)
            int r1 = r7.f268f
            if (r1 == 0) goto Le7
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r7.f268f
            r0.append(r1)
            goto Le7
        L5c:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            java.lang.String r2 = r7.f272j
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            int r2 = r7.f263a
            if (r2 != r1) goto La9
            java.lang.Object r1 = r7.f264b
            java.lang.String r2 = "Unable to get icon resource"
            java.lang.String r3 = "IconCompat"
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto L80
            int r1 = c3.a.c(r1)
            goto Lae
        L80:
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L96 java.lang.reflect.InvocationTargetException -> L98 java.lang.IllegalAccessException -> L9a
            java.lang.String r5 = "getResId"
            r6 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L96 java.lang.reflect.InvocationTargetException -> L98 java.lang.IllegalAccessException -> L9a
            java.lang.Object r1 = r4.invoke(r1, r6)     // Catch: java.lang.NoSuchMethodException -> L96 java.lang.reflect.InvocationTargetException -> L98 java.lang.IllegalAccessException -> L9a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.NoSuchMethodException -> L96 java.lang.reflect.InvocationTargetException -> L98 java.lang.IllegalAccessException -> L9a
            int r1 = r1.intValue()     // Catch: java.lang.NoSuchMethodException -> L96 java.lang.reflect.InvocationTargetException -> L98 java.lang.IllegalAccessException -> L9a
            goto Lae
        L96:
            r1 = move-exception
            goto L9c
        L98:
            r1 = move-exception
            goto La0
        L9a:
            r1 = move-exception
            goto La4
        L9c:
            android.util.Log.e(r3, r2, r1)
            goto La7
        La0:
            android.util.Log.e(r3, r2, r1)
            goto La7
        La4:
            android.util.Log.e(r3, r2, r1)
        La7:
            r1 = 0
            goto Lae
        La9:
            r1 = 2
            if (r2 != r1) goto Lc0
            int r1 = r7.f267e
        Lae:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto Le7
        Lc0:
            java.lang.String r0 = "called getResId() on "
            g1.d.g(r7, r0)
            r0 = 0
            return r0
        Lc7:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r7.f264b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r7.f264b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        Le7:
            android.content.res.ColorStateList r1 = r7.f269g
            if (r1 == 0) goto Lf5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r7.f269g
            r0.append(r1)
        Lf5:
            android.graphics.PorterDuff$Mode r1 = r7.f270h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f262k
            if (r1 == r2) goto L105
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r7.f270h
            r0.append(r1)
        L105:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
