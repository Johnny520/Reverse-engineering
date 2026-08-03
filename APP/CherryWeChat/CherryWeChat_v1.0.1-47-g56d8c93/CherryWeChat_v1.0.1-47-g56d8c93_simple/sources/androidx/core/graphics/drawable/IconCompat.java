package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f3917k = null;

    /* JADX INFO: renamed from: a */
    public int f3918a;

    /* JADX INFO: renamed from: b */
    public Object f3919b;

    /* JADX INFO: renamed from: c */
    public byte[] f3920c;

    /* JADX INFO: renamed from: d */
    public Parcelable f3921d;

    /* JADX INFO: renamed from: e */
    public int f3922e;

    /* JADX INFO: renamed from: f */
    public int f3923f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f3924g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f3925h;

    /* JADX INFO: renamed from: i */
    public String f3926i;

    /* JADX INFO: renamed from: j */
    public String f3927j;

    static {
        f3917k = PorterDuff.Mode.SRC_IN;
    }

    public IconCompat() {
        this.f3918a = -1;
        this.f3920c = null;
        this.f3921d = null;
        this.f3922e = 0;
        this.f3923f = 0;
        this.f3924g = null;
        this.f3925h = f3917k;
        this.f3926i = null;
    }

    public final String toString() {
        if (this.f3918a == (-1)) goto L5;
        StringBuilder r0 = new StringBuilder("Icon(typ=");
        switch(this.f3918a) {
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
        switch(this.f3918a) {
            case 1: goto L31;
            case 2: goto L22;
            case 3: goto L19;
            case 4: goto L18;
            case 5: goto L31;
            case 6: goto L18;
            default: goto L33;
        };
    L18:
        r0.append(" uri=");
        r0.append(this.f3919b);
        goto L33
    L19:
        r0.append(" len=");
        r0.append(this.f3922e);
        if (this.f3923f == 0) goto L33;
        r0.append(" off=");
        r0.append(this.f3923f);
        goto L33
    L22:
        r0.append(" pkg=");
        r0.append(this.f3927j);
        r0.append(" id=");
        int r22 = this.f3918a;
        if (r22 != (-1)) goto L26;
        int r1 = ((Icon) this.f3919b).getResId();
    L28:
        r0.append(String.format("0x%08x", new Object[]{Integer.valueOf(r1)}));
        goto L33
    L26:
        if (r22 != 2) goto L30;
        r1 = this.f3922e;
        goto L28
    L30:
        throw new IllegalStateException("called getResId() on " + this);
    L31:
        r0.append(" size=");
        r0.append(((Bitmap) this.f3919b).getWidth());
        r0.append("x");
        r0.append(((Bitmap) this.f3919b).getHeight());
    L33:
        if (this.f3924g == null) goto L36;
        r0.append(" tint=");
        r0.append(this.f3924g);
    L36:
        if (this.f3925h == f3917k) goto L38;
        r0.append(" mode=");
        r0.append(this.f3925h);
    L38:
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
        return String.valueOf(this.f3919b);
    }
}
