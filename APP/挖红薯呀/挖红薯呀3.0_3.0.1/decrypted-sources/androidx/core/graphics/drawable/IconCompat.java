package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p000.C0921xc;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f205k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f206a;

    /* JADX INFO: renamed from: b */
    public Object f207b;

    /* JADX INFO: renamed from: c */
    public byte[] f208c;

    /* JADX INFO: renamed from: d */
    public Parcelable f209d;

    /* JADX INFO: renamed from: e */
    public int f210e;

    /* JADX INFO: renamed from: f */
    public int f211f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f212g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f213h;

    /* JADX INFO: renamed from: i */
    public String f214i;

    /* JADX INFO: renamed from: j */
    public String f215j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        int resId;
        if (this.f206a == -1) {
            return String.valueOf(this.f207b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f206a) {
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
        switch (this.f206a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f207b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f207b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f215j);
                sb.append(" id=");
                int i = this.f206a;
                if (i == -1) {
                    resId = ((Icon) this.f207b).getResId();
                } else {
                    if (i != 2) {
                        C0921xc.m5124e(this, "called getResId() on ");
                        return null;
                    }
                    resId = this.f210e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(resId)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f210e);
                if (this.f211f != 0) {
                    sb.append(" off=");
                    sb.append(this.f211f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f207b);
                break;
        }
        if (this.f212g != null) {
            sb.append(" tint=");
            sb.append(this.f212g);
        }
        if (this.f213h != f205k) {
            sb.append(" mode=");
            sb.append(this.f213h);
        }
        sb.append(")");
        return sb.toString();
    }
}
