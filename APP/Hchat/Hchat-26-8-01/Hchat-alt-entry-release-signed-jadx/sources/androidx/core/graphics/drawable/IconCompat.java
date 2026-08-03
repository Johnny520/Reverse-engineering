package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p030c3.AbstractC0390a;
import p089g1.C1275d;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f262k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f263a;

    /* JADX INFO: renamed from: b */
    public Object f264b;

    /* JADX INFO: renamed from: c */
    public byte[] f265c;

    /* JADX INFO: renamed from: d */
    public Parcelable f266d;

    /* JADX INFO: renamed from: e */
    public int f267e;

    /* JADX INFO: renamed from: f */
    public int f268f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f269g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f270h;

    /* JADX INFO: renamed from: i */
    public String f271i;

    /* JADX INFO: renamed from: j */
    public String f272j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        int iIntValue;
        if (this.f263a == -1) {
            return String.valueOf(this.f264b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f263a) {
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
        sb2.append(str);
        switch (this.f263a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f264b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f264b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f272j);
                sb2.append(" id=");
                int i9 = this.f263a;
                if (i9 == -1) {
                    Object obj = this.f264b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        iIntValue = AbstractC0390a.m1356c(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e6) {
                            Log.e("IconCompat", "Unable to get icon resource", e6);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e7) {
                            Log.e("IconCompat", "Unable to get icon resource", e7);
                            iIntValue = 0;
                        } catch (InvocationTargetException e10) {
                            Log.e("IconCompat", "Unable to get icon resource", e10);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i9 != 2) {
                        C1275d.m3413g(this, "called getResId() on ");
                        return null;
                    }
                    iIntValue = this.f267e;
                }
                sb2.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f267e);
                if (this.f268f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f268f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f264b);
                break;
        }
        if (this.f269g != null) {
            sb2.append(" tint=");
            sb2.append(this.f269g);
        }
        if (this.f270h != f262k) {
            sb2.append(" mode=");
            sb2.append(this.f270h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
