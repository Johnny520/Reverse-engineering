package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.github.megatronking.stringfog.Base64;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC0863wo;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f416k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f418b;

    /* JADX INFO: renamed from: j */
    public String f426j;

    /* JADX INFO: renamed from: a */
    public int f417a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f419c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f420d = null;

    /* JADX INFO: renamed from: e */
    public int f421e = 0;

    /* JADX INFO: renamed from: f */
    public int f422f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f423g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f424h = f416k;

    /* JADX INFO: renamed from: i */
    public String f425i = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f417a == -1) {
            return String.valueOf(this.f418b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f417a) {
            case Base64.NO_PADDING /* 1 */:
                str = "BITMAP";
                break;
            case Base64.NO_WRAP /* 2 */:
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
        switch (this.f417a) {
            case Base64.NO_PADDING /* 1 */:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f418b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f418b).getHeight());
                break;
            case Base64.NO_WRAP /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f426j);
                sb.append(" id=");
                int i = this.f417a;
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Object obj = this.f418b;
                    if (i2 >= 28) {
                        iIntValue = AbstractC0863wo.m2614a(obj);
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
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f421e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f421e);
                if (this.f422f != 0) {
                    sb.append(" off=");
                    sb.append(this.f422f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f418b);
                break;
        }
        if (this.f423g != null) {
            sb.append(" tint=");
            sb.append(this.f423g);
        }
        if (this.f424h != f416k) {
            sb.append(" mode=");
            sb.append(this.f424h);
        }
        sb.append(")");
        return sb.toString();
    }
}
