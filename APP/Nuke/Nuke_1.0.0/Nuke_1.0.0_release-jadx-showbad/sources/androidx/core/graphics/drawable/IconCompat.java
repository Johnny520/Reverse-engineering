package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import me.dartcv.nuke.BuildConfig;
import p212o1.AbstractC2768a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f6178k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f6180b;

    /* JADX INFO: renamed from: j */
    public String f6188j;

    /* JADX INFO: renamed from: a */
    public int f6179a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f6181c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f6182d = null;

    /* JADX INFO: renamed from: e */
    public int f6183e = 0;

    /* JADX INFO: renamed from: f */
    public int f6184f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f6185g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f6186h = f6178k;

    /* JADX INFO: renamed from: i */
    public String f6187i = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        int iIntValue;
        if (this.f6179a == -1) {
            return String.valueOf(this.f6180b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f6179a) {
            case BuildConfig.VERSION_CODE /* 1 */:
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
        switch (this.f6179a) {
            case BuildConfig.VERSION_CODE /* 1 */:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f6180b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f6180b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f6188j);
                sb.append(" id=");
                int i5 = this.f6179a;
                if (i5 == -1) {
                    Object obj = this.f6180b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        iIntValue = AbstractC2768a.m4958c(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e5) {
                            Log.e("IconCompat", "Unable to get icon resource", e5);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e6) {
                            Log.e("IconCompat", "Unable to get icon resource", e6);
                            iIntValue = 0;
                        } catch (InvocationTargetException e7) {
                            Log.e("IconCompat", "Unable to get icon resource", e7);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f6183e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f6183e);
                if (this.f6184f != 0) {
                    sb.append(" off=");
                    sb.append(this.f6184f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f6180b);
                break;
        }
        if (this.f6185g != null) {
            sb.append(" tint=");
            sb.append(this.f6185g);
        }
        if (this.f6186h != f6178k) {
            sb.append(" mode=");
            sb.append(this.f6186h);
        }
        sb.append(")");
        return sb.toString();
    }
}
