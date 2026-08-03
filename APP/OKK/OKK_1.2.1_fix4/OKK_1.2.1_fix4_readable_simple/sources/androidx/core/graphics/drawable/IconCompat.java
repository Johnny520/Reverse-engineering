package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p087w.AbstractC1113c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f1303k = null;

    /* JADX INFO: renamed from: a */
    public int f1304a;

    /* JADX INFO: renamed from: b */
    public Object f1305b;

    /* JADX INFO: renamed from: c */
    public byte[] f1306c;

    /* JADX INFO: renamed from: d */
    public Parcelable f1307d;

    /* JADX INFO: renamed from: e */
    public int f1308e;

    /* JADX INFO: renamed from: f */
    public int f1309f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1310g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1311h;

    /* JADX INFO: renamed from: i */
    public String f1312i;

    /* JADX INFO: renamed from: j */
    public String f1313j;

    static {
        f1303k = PorterDuff.Mode.SRC_IN;
    }

    public IconCompat() {
        this.f1304a = -1;
        this.f1306c = null;
        this.f1307d = null;
        this.f1308e = 0;
        this.f1309f = 0;
        this.f1310g = null;
        this.f1311h = f1303k;
        this.f1312i = null;
    }

    public final String toString() {
        if (this.f1304a == (-1)) goto L5;
        StringBuilder r02 = new StringBuilder("Icon(typ=");
        switch(this.f1304a) {
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
        r02.append(r2);
        switch(this.f1304a) {
            case 1: goto L36;
            case 2: goto L22;
            case 3: goto L19;
            case 4: goto L18;
            case 5: goto L36;
            case 6: goto L18;
            default: goto L38;
        };
    L18:
        r02.append(" uri=");
        r02.append(this.f1305b);
        goto L38
    L19:
        r02.append(" len=");
        r02.append(this.f1308e);
        if (this.f1309f == 0) goto L38;
        r02.append(" off=");
        r02.append(this.f1309f);
        goto L38
    L22:
        r02.append(" pkg=");
        r02.append(this.f1313j);
        r02.append(" id=");
        int r22 = this.f1304a;
        if (r22 != (-1)) goto L31;
        int r1 = Build.VERSION.SDK_INT;
        Object r23 = this.f1305b;
        if (r1 < 28) goto L27;
        int r12 = AbstractC1113c.m2630a(r23);
    L33:
        r02.append(String.format("0x%08x", new Object[]{Integer.valueOf(r12)}));
        goto L38
    L27:
        r12 = 0;
        r12 = ((Integer) r23.getClass().getMethod("getResId", null).invoke(r23, null)).intValue();     // Catch: Throwable -> L45
        goto L33
    L31:
        if (r22 != 2) goto L35;
        r12 = this.f1308e;
        goto L33
    L35:
        throw new IllegalStateException("called getResId() on " + this);
    L36:
        r02.append(" size=");
        r02.append(((Bitmap) this.f1305b).getWidth());
        r02.append("x");
        r02.append(((Bitmap) this.f1305b).getHeight());
    L38:
        if (this.f1310g == null) goto L41;
        r02.append(" tint=");
        r02.append(this.f1310g);
    L41:
        if (this.f1311h == f1303k) goto L43;
        r02.append(" mode=");
        r02.append(this.f1311h);
    L43:
        r02.append(")");
        return r02.toString();
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
        return String.valueOf(this.f1305b);
    }
}
