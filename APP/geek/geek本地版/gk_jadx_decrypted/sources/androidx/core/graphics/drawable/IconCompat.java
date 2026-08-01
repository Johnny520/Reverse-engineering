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
import p000.AbstractC0715so;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f453k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f455b;

    /* JADX INFO: renamed from: j */
    public String f463j;

    /* JADX INFO: renamed from: a */
    public int f454a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f456c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f457d = null;

    /* JADX INFO: renamed from: e */
    public int f458e = 0;

    /* JADX INFO: renamed from: f */
    public int f459f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f460g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f461h = f453k;

    /* JADX INFO: renamed from: i */
    public String f462i = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f454a == -1) {
            return String.valueOf(this.f455b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f454a) {
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
        switch (this.f454a) {
            case Base64.NO_PADDING /* 1 */:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f455b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f455b).getHeight());
                break;
            case Base64.NO_WRAP /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f463j);
                sb.append(" id=");
                int i = this.f454a;
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Object obj = this.f455b;
                    if (i2 >= 28) {
                        iIntValue = AbstractC0715so.m2332a(obj);
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
                    iIntValue = this.f458e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f458e);
                if (this.f459f != 0) {
                    sb.append(" off=");
                    sb.append(this.f459f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f455b);
                break;
        }
        if (this.f460g != null) {
            sb.append(" tint=");
            sb.append(this.f460g);
        }
        if (this.f461h != f453k) {
            sb.append(" mode=");
            sb.append(this.f461h);
        }
        sb.append(")");
        return sb.toString();
    }
}
