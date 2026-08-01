package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff.Mode k = null;
    public int a;
    public java.lang.Object b;
    public byte[] c;
    public android.os.Parcelable d;
    public int e;
    public int f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public java.lang.String i;
    public java.lang.String j;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.IconCompat.k = r0
            return
    }

    public IconCompat() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.a = r0
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
            r7 = this;
            int r0 = r7.a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r7.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r7.a
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
            int r2 = r7.a
            switch(r2) {
                case 1: goto Ld4;
                case 2: goto L5c;
                case 3: goto L42;
                case 4: goto L36;
                case 5: goto Ld4;
                case 6: goto L36;
                default: goto L34;
            }
        L34:
            goto Lf4
        L36:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r7.b
            r0.append(r1)
            goto Lf4
        L42:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r7.e
            r0.append(r1)
            int r1 = r7.f
            if (r1 == 0) goto Lf4
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r7.f
            r0.append(r1)
            goto Lf4
        L5c:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            java.lang.String r2 = r7.j
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            int r2 = r7.a
            if (r2 != r1) goto La9
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r2 = r7.b
            java.lang.String r3 = "Unable to get icon resource"
            java.lang.String r4 = "IconCompat"
            r5 = 28
            if (r1 < r5) goto L80
            int r1 = defpackage.so.a(r2)
            goto Lae
        L80:
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.NoSuchMethodException -> L96 java.lang.reflect.InvocationTargetException -> L98 java.lang.IllegalAccessException -> L9a
            java.lang.String r5 = "getResId"
            r6 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L96 java.lang.reflect.InvocationTargetException -> L98 java.lang.IllegalAccessException -> L9a
            java.lang.Object r1 = r1.invoke(r2, r6)     // Catch: java.lang.NoSuchMethodException -> L96 java.lang.reflect.InvocationTargetException -> L98 java.lang.IllegalAccessException -> L9a
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
            android.util.Log.e(r4, r3, r1)
            goto La7
        La0:
            android.util.Log.e(r4, r3, r1)
            goto La7
        La4:
            android.util.Log.e(r4, r3, r1)
        La7:
            r1 = 0
            goto Lae
        La9:
            r1 = 2
            if (r2 != r1) goto Lc0
            int r1 = r7.e
        Lae:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto Lf4
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getResId() on "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Ld4:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r7.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r7.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        Lf4:
            android.content.res.ColorStateList r1 = r7.g
            if (r1 == 0) goto L102
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r7.g
            r0.append(r1)
        L102:
            android.graphics.PorterDuff$Mode r1 = r7.h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.k
            if (r1 == r2) goto L112
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r7.h
            r0.append(r1)
        L112:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
