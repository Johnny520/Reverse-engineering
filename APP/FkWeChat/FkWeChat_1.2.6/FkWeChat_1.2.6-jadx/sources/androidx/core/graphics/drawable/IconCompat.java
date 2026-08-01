package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p254r5.C6494d0;
import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f1835k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public Object f1837b;

    /* JADX INFO: renamed from: j */
    public String f1845j;

    /* JADX INFO: renamed from: a */
    public int f1836a = -1;

    /* JADX INFO: renamed from: c */
    public byte[] f1838c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f1839d = null;

    /* JADX INFO: renamed from: e */
    public int f1840e = 0;

    /* JADX INFO: renamed from: f */
    public int f1841f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1842g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1843h = f1835k;

    /* JADX INFO: renamed from: i */
    public String f1844i = null;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class C0635a {
        /* JADX INFO: renamed from: a */
        public static int m2487a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0636b.m2488a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class C0636b {
        /* JADX INFO: renamed from: a */
        public static int m2488a(Object obj) {
            return ((Icon) obj).getResId();
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m2483d(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2484a() {
        int i10 = this.f1836a;
        if (i10 == -1) {
            return C0635a.m2487a(this.f1837b);
        }
        if (i10 == 2) {
            return this.f1840e;
        }
        C6494d0.m25749a("called getResId() on ", this);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m2485b() {
        this.f1843h = PorterDuff.Mode.valueOf(this.f1844i);
        switch (this.f1836a) {
            case -1:
                Parcelable parcelable = this.f1839d;
                if (parcelable == null) {
                    C9987e.m38645a("Invalid icon");
                } else {
                    this.f1837b = parcelable;
                }
                break;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f1839d;
                if (parcelable2 == null) {
                    byte[] bArr = this.f1838c;
                    this.f1837b = bArr;
                    this.f1836a = 3;
                    this.f1840e = 0;
                    this.f1841f = bArr.length;
                } else {
                    this.f1837b = parcelable2;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1838c, Charset.forName("UTF-16"));
                this.f1837b = str;
                if (this.f1836a == 2 && this.f1845j == null) {
                    this.f1845j = str.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                this.f1837b = this.f1838c;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2486c(boolean z10) {
        this.f1844i = this.f1843h.name();
        switch (this.f1836a) {
            case -1:
                if (!z10) {
                    this.f1839d = (Parcelable) this.f1837b;
                } else {
                    C9987e.m38645a("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                Object obj = this.f1837b;
                if (!z10) {
                    this.f1839d = (Parcelable) obj;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1838c = byteArrayOutputStream.toByteArray();
                }
                break;
            case 2:
                this.f1838c = ((String) this.f1837b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                this.f1838c = (byte[]) this.f1837b;
                break;
            case 4:
            case 6:
                this.f1838c = this.f1837b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
    }

    public String toString() {
        if (this.f1836a == -1) {
            return String.valueOf(this.f1837b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m2483d(this.f1836a));
        switch (this.f1836a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1837b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1837b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1845j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m2484a())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1840e);
                if (this.f1841f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1841f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1837b);
                break;
        }
        if (this.f1842g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1842g);
        }
        if (this.f1843h != f1835k) {
            sb2.append(" mode=");
            sb2.append(this.f1843h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
