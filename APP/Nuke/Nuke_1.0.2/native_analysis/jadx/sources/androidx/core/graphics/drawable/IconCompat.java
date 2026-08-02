package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import nuke.module.wechat.p002ai.AIChatConfig;
import p000.c80;
import p000.s90;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f299k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f300a;

    /* JADX INFO: renamed from: b */
    public Object f301b;

    /* JADX INFO: renamed from: c */
    public byte[] f302c;

    /* JADX INFO: renamed from: d */
    public Parcelable f303d;

    /* JADX INFO: renamed from: e */
    public int f304e;

    /* JADX INFO: renamed from: f */
    public int f305f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f306g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f307h;

    /* JADX INFO: renamed from: i */
    public String f308i;

    /* JADX INFO: renamed from: j */
    public String f309j;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f300a == -1) {
            return String.valueOf(this.f301b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f300a) {
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
            case AIChatConfig.DefaultContextRounds /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f300a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f301b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f301b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f309j);
                sb.append(" id=");
                int i = this.f300a;
                if (i == -1) {
                    Object obj = this.f301b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        iIntValue = s90.m4773c(obj);
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
                        c80.m669m("called getResId() on ", this);
                        return null;
                    }
                    iIntValue = this.f304e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f304e);
                if (this.f305f != 0) {
                    sb.append(" off=");
                    sb.append(this.f305f);
                }
                break;
            case 4:
            case AIChatConfig.DefaultContextRounds /* 6 */:
                sb.append(" uri=");
                sb.append(this.f301b);
                break;
        }
        if (this.f306g != null) {
            sb.append(" tint=");
            sb.append(this.f306g);
        }
        if (this.f307h != f299k) {
            sb.append(" mode=");
            sb.append(this.f307h);
        }
        sb.append(")");
        return sb.toString();
    }
}
