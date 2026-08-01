package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.os.AbstractC2179;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p144.C7546;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final PorterDuff.Mode f6432 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f6437;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String f6442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f6438 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public byte[] f6436 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Parcelable f6435 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6434 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6433 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ColorStateList f6440 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public PorterDuff.Mode f6439 = f6432;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f6441 = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f6438 == -1) {
            return String.valueOf(this.f6437);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f6438) {
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
        switch (this.f6438) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f6437).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f6437).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f6442);
                sb.append(" id=");
                int i = this.f6438;
                if (i == -1) {
                    Object obj = this.f6437;
                    if (Build.VERSION.SDK_INT >= 28) {
                        iIntValue = AbstractC2179.m3967(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            iIntValue = 0;
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i != 2) {
                        C7546.m12745(this, "called getResId() on ");
                        return null;
                    }
                    iIntValue = this.f6434;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f6434);
                if (this.f6433 != 0) {
                    sb.append(" off=");
                    sb.append(this.f6433);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f6437);
                break;
        }
        if (this.f6440 != null) {
            sb.append(" tint=");
            sb.append(this.f6440);
        }
        if (this.f6439 != f6432) {
            sb.append(" mode=");
            sb.append(this.f6439);
        }
        sb.append(")");
        return sb.toString();
    }
}
