package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.so;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = null;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    static {
        k = PorterDuff.Mode.SRC_IN;
    }

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
    }

    public final String toString() {
        if (this.a == (-1)) goto L5;
        StringBuilder r0 = new StringBuilder("Icon(typ=");
        switch(this.a) {
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L9;
            default: goto L8;
        };
    L8:
        String r2 = "UNKNOWN";
    L15:
        r0.append(r2);
        switch(this.a) {
            case 1: goto L45;
            case 2: goto L22;
            case 3: goto L19;
            case 4: goto L18;
            case 5: goto L45;
            case 6: goto L18;
            default: goto L47;
        };
    L18:
        r0.append(" uri=");
        r0.append(this.b);
        goto L47
    L19:
        r0.append(" len=");
        r0.append(this.e);
        if (this.f == 0) goto L47;
        r0.append(" off=");
        r0.append(this.f);
        goto L47
    L22:
        r0.append(" pkg=");
        r0.append(this.j);
        r0.append(" id=");
        int r22 = this.a;
        if (r22 != (-1)) goto L40;
        int r1 = Build.VERSION.SDK_INT;
        Object r23 = this.b;
        if (r1 < 28) goto L54;
        int r12 = so.a(r23);
    L42:
        r0.append(String.format("0x%08x", new Object[]{Integer.valueOf(r12)}));
        goto L47
    L54:
        r12 = ((Integer) r23.getClass().getMethod("getResId", null).invoke(r23, null)).intValue();     // Catch: NoSuchMethodException -> L29 InvocationTargetException -> L31 IllegalAccessException -> L33
    L33:
        e = move-exception;
        Log.e("IconCompat", "Unable to get icon resource", e);
    L38:
        r12 = 0;
    L29:
        e = move-exception;
        Log.e("IconCompat", "Unable to get icon resource", e);
    L31:
        e = move-exception;
        Log.e("IconCompat", "Unable to get icon resource", e);
        goto L38
    L40:
        if (r22 != 2) goto L44;
        r12 = this.e;
        goto L42
    L44:
        throw new IllegalStateException("called getResId() on " + this);
    L45:
        r0.append(" size=");
        r0.append(((Bitmap) this.b).getWidth());
        r0.append("x");
        r0.append(((Bitmap) this.b).getHeight());
    L47:
        if (this.g == null) goto L50;
        r0.append(" tint=");
        r0.append(this.g);
    L50:
        if (this.h == k) goto L52;
        r0.append(" mode=");
        r0.append(this.h);
    L52:
        r0.append(")");
        return r0.toString();
    L9:
        r2 = "URI_MASKABLE";
        goto L15
    L10:
        r2 = "BITMAP_MASKABLE";
        goto L15
    L11:
        r2 = "URI";
        goto L15
    L12:
        r2 = "DATA";
        goto L15
    L13:
        r2 = "RESOURCE";
        goto L15
    L14:
        r2 = "BITMAP";
        goto L15
    L5:
        return String.valueOf(this.b);
    }
}
