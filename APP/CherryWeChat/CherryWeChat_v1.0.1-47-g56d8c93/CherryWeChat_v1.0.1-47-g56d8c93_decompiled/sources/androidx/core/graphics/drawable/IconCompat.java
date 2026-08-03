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
    public static final PorterDuff.Mode f3917k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f3919b;

    /* JADX INFO: renamed from: j */
    public String f3927j;

    /* JADX INFO: renamed from: a */
    public int f3918a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f3920c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f3921d = null;

    /* JADX INFO: renamed from: e */
    public int f3922e = 0;

    /* JADX INFO: renamed from: f */
    public int f3923f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f3924g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f3925h = f3917k;

    /* JADX INFO: renamed from: i */
    public String f3926i = null;

    public final String toString() {
        String str;
        int resId;
        if (this.f3918a == -1) {
            return String.valueOf(this.f3919b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3918a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f3918a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3919b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3919b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3927j);
                sb.append(" id=");
                int i = this.f3918a;
                if (i == -1) {
                    resId = ((Icon) this.f3919b).getResId();
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    resId = this.f3922e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(resId)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3922e);
                if (this.f3923f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3923f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3919b);
                break;
        }
        if (this.f3924g != null) {
            sb.append(" tint=");
            sb.append(this.f3924g);
        }
        if (this.f3925h != f3917k) {
            sb.append(" mode=");
            sb.append(this.f3925h);
        }
        sb.append(")");
        return sb.toString();
    }
}
