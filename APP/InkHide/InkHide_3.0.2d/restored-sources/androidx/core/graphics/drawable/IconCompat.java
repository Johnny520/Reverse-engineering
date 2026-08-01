package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p087s.AbstractC0964c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f1122k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f1124b;

    /* JADX INFO: renamed from: j */
    public String f1132j;

    /* JADX INFO: renamed from: a */
    public int f1123a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f1125c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f1126d = null;

    /* JADX INFO: renamed from: e */
    public int f1127e = 0;

    /* JADX INFO: renamed from: f */
    public int f1128f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1129g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1130h = f1122k;

    /* JADX INFO: renamed from: i */
    public String f1131i = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        int iIntValue;
        if (this.f1123a == -1) {
            return String.valueOf(this.f1124b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1123a) {
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
        switch (this.f1123a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1124b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1124b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1132j);
                sb.append(" id=");
                int i2 = this.f1123a;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f1124b;
                    if (i3 >= 28) {
                        iIntValue = AbstractC0964c.m2147a(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            iIntValue = 0;
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f1127e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1127e);
                if (this.f1128f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1128f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1124b);
                break;
        }
        if (this.f1129g != null) {
            sb.append(" tint=");
            sb.append(this.f1129g);
        }
        if (this.f1130h != f1122k) {
            sb.append(" mode=");
            sb.append(this.f1130h);
        }
        sb.append(")");
        return sb.toString();
    }
}
