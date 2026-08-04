package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import yyds.C0188;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final PorterDuff.Mode f261 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f262;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public String f263;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f264;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f265;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Object f266;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public ColorStateList f267;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public String f268;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public byte[] f269;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f270;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Parcelable f271;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static IconCompat m97(int i) {
        if (i == 0) {
            C0188.m798("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f269 = null;
        iconCompat.f271 = null;
        iconCompat.f270 = 0;
        iconCompat.f267 = null;
        iconCompat.f262 = f261;
        iconCompat.f263 = null;
        iconCompat.f265 = 2;
        iconCompat.f264 = i;
        iconCompat.f266 = "";
        iconCompat.f268 = "";
        return iconCompat;
    }

    public final String toString() {
        String str;
        if (this.f265 == -1) {
            return String.valueOf(this.f266);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f265) {
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
        switch (this.f265) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f266).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f266).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f268);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m98())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f264);
                if (this.f270 != 0) {
                    sb.append(" off=");
                    sb.append(this.f270);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f266);
                break;
        }
        if (this.f267 != null) {
            sb.append(" tint=");
            sb.append(this.f267);
        }
        if (this.f262 != f261) {
            sb.append(" mode=");
            sb.append(this.f262);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m98() {
        int i = this.f265;
        if (i == -1) {
            return ((Icon) this.f266).getResId();
        }
        if (i == 2) {
            return this.f264;
        }
        C0188.m799(this, "called getResId() on ");
        return 0;
    }
}
