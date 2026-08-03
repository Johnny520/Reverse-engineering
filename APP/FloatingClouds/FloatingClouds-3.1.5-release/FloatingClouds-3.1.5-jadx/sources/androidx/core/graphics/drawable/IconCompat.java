package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f4435k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f4437b;

    /* JADX INFO: renamed from: j */
    public String f4445j;

    /* JADX INFO: renamed from: a */
    public int f4436a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f4438c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f4439d = null;

    /* JADX INFO: renamed from: e */
    public int f4440e = 0;

    /* JADX INFO: renamed from: f */
    public int f4441f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f4442g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f4443h = f4435k;

    /* JADX INFO: renamed from: i */
    public String f4444i = null;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C1071a {
        /* JADX INFO: renamed from: a */
        public static int m2477a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* JADX INFO: renamed from: b */
        public static String m2478b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* JADX INFO: renamed from: c */
        public static int m2479c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* JADX INFO: renamed from: d */
        public static Uri m2480d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public final String toString() {
        String str;
        int iM2477a;
        if (this.f4436a == -1) {
            return String.valueOf(this.f4437b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4436a) {
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
        switch (this.f4436a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4437b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4437b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4445j);
                sb.append(" id=");
                int i = this.f4436a;
                if (i == -1) {
                    iM2477a = C1071a.m2477a(this.f4437b);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iM2477a = this.f4440e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iM2477a)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4440e);
                if (this.f4441f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4441f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4437b);
                break;
        }
        if (this.f4442g != null) {
            sb.append(" tint=");
            sb.append(this.f4442g);
        }
        if (this.f4443h != f4435k) {
            sb.append(" mode=");
            sb.append(this.f4443h);
        }
        sb.append(")");
        return sb.toString();
    }
}
