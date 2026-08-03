package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p087w.AbstractC1113c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f1303k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f1305b;

    /* JADX INFO: renamed from: j */
    public String f1313j;

    /* JADX INFO: renamed from: a */
    public int f1304a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f1306c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f1307d = null;

    /* JADX INFO: renamed from: e */
    public int f1308e = 0;

    /* JADX INFO: renamed from: f */
    public int f1309f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1310g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1311h = f1303k;

    /* JADX INFO: renamed from: i */
    public String f1312i = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f1304a == -1) {
            return String.valueOf(this.f1305b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1304a) {
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
        switch (this.f1304a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1305b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1305b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1313j);
                sb.append(" id=");
                int i2 = this.f1304a;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f1305b;
                    if (i3 >= 28) {
                        iIntValue = AbstractC1113c.m2630a(obj);
                    } else {
                        iIntValue = 0;
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                            break;
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f1308e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1308e);
                if (this.f1309f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1309f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1305b);
                break;
        }
        if (this.f1310g != null) {
            sb.append(" tint=");
            sb.append(this.f1310g);
        }
        if (this.f1311h != f1303k) {
            sb.append(" mode=");
            sb.append(this.f1311h);
        }
        sb.append(")");
        return sb.toString();
    }
}
