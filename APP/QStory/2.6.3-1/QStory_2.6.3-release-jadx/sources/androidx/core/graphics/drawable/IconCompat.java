package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.os.AbstractC3012;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p160.C8376;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final PorterDuff.Mode f6778 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f6783;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String f6788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f6784 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public byte[] f6782 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Parcelable f6781 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f6780 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6779 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ColorStateList f6786 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public PorterDuff.Mode f6785 = f6778;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public String f6787 = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f6784 == -1) {
            return String.valueOf(this.f6783);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f6784) {
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
        switch (this.f6784) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f6783).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f6783).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f6788);
                sb.append(" id=");
                int i = this.f6784;
                if (i == -1) {
                    Object obj = this.f6783;
                    if (Build.VERSION.SDK_INT >= 28) {
                        iIntValue = AbstractC3012.m4537(obj);
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
                        C8376.m13333(this, "called getResId() on ");
                        return null;
                    }
                    iIntValue = this.f6780;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f6780);
                if (this.f6779 != 0) {
                    sb.append(" off=");
                    sb.append(this.f6779);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f6783);
                break;
        }
        if (this.f6786 != null) {
            sb.append(" tint=");
            sb.append(this.f6786);
        }
        if (this.f6785 != f6778) {
            sb.append(" mode=");
            sb.append(this.f6785);
        }
        sb.append(")");
        return sb.toString();
    }
}
