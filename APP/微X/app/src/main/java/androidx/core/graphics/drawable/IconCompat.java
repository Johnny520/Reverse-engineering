// Decompiled by JEB v5.42.0.202606242140

package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    public byte[] FLD62;
    public String FLD63;
    public int FLD64;
    public Parcelable FLD65;
    public int FLD66;
    public PorterDuff.Mode FLD67;
    public static final PorterDuff.Mode FLD68;
    public int FLD69;
    public ColorStateList FLD70;
    public Object FLD71;

    static {
        IconCompat.FLD68 = PorterDuff.Mode.SRC_IN;
    }

    public IconCompat() {
        this.FLD70 = null;
        this.FLD67 = IconCompat.FLD68;
    }

    @Override
    public String toString() {
        if(this.FLD69 == -1) {
            return String.valueOf(this.FLD71);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Icon(typ=");
        stringBuilder0.append(IconCompat.MTH676(this.FLD69));
        switch(this.FLD69) {
            case 2: {
                stringBuilder0.append(" pkg=");
                stringBuilder0.append(this.MTH671());
                stringBuilder0.append(" id=");
                stringBuilder0.append(String.format("0x%08x", this.MTH675()));
                break;
            }
            case 3: {
                stringBuilder0.append(" len=");
                stringBuilder0.append(this.FLD64);
                if(this.FLD66 != 0) {
                    stringBuilder0.append(" off=");
                    stringBuilder0.append(this.FLD66);
                }
                break;
            }
            case 4: {
                stringBuilder0.append(" uri=");
                stringBuilder0.append(this.FLD71);
                break;
            }
            case 1: 
            case 5: {
                stringBuilder0.append(" size=");
                stringBuilder0.append(((Bitmap)this.FLD71).getWidth());
                stringBuilder0.append("x");
                stringBuilder0.append(((Bitmap)this.FLD71).getHeight());
            }
        }
        if(this.FLD70 != null) {
            stringBuilder0.append(" tint=");
            stringBuilder0.append(this.FLD70);
        }
        if(this.FLD67 != IconCompat.FLD68) {
            stringBuilder0.append(" mode=");
            stringBuilder0.append(this.FLD67);
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public String MTH671() {
        int v = this.FLD69;
        if(v == -1 && Build.VERSION.SDK_INT >= 23) {
            return IconCompat.MTH673(((Icon)this.FLD71));
        }
        if(v != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return ((String)this.FLD71).split(":", -1)[0];
    }

    public void MTH672() {
        Parcelable parcelable0;
        this.FLD67 = PorterDuff.Mode.valueOf(this.FLD63);
        switch(this.FLD69) {
            case -1: {
                parcelable0 = this.FLD65;
                if(parcelable0 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            }
            case 3: {
                this.FLD71 = this.FLD62;
                return;
            }
            case 2: 
            case 4: {
                this.FLD71 = new String(this.FLD62, Charset.forName("UTF-16"));
                return;
            }
            case 1: 
            case 5: {
                parcelable0 = this.FLD65;
                if(parcelable0 == null) {
                    this.FLD71 = this.FLD62;
                    this.FLD69 = 3;
                    this.FLD64 = 0;
                    this.FLD66 = this.FLD62.length;
                    return;
                }
                break;
            }
            default: {
                return;
            }
        }
        this.FLD71 = parcelable0;
    }

    public static String MTH673(Icon icon0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return icon0.getResPackage();
        }
        try {
            return (String)icon0.getClass().getMethod("getResPackage").invoke(icon0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("IconCompat", "Unable to get icon package", illegalAccessException0);
            return null;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("IconCompat", "Unable to get icon package", invocationTargetException0);
            return null;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("IconCompat", "Unable to get icon package", noSuchMethodException0);
            return null;
        }
    }

    public void MTH674(boolean z) {
        this.FLD63 = this.FLD67.name();
        switch(this.FLD69) {
            case -1: {
                if(z) {
                    throw new IllegalArgumentException("Can\'t serialize Icon created with IconCompat#createFromIcon");
                }
                this.FLD65 = (Parcelable)this.FLD71;
                return;
            }
            case 2: {
                this.FLD62 = ((String)this.FLD71).getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 3: {
                this.FLD62 = (byte[])this.FLD71;
                return;
            }
            case 4: {
                this.FLD62 = this.FLD71.toString().getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 1: 
            case 5: {
                if(!z) {
                    this.FLD65 = (Parcelable)this.FLD71;
                    return;
                }
                Bitmap bitmap0 = (Bitmap)this.FLD71;
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                bitmap0.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream0);
                this.FLD62 = byteArrayOutputStream0.toByteArray();
            }
        }
    }

    public int MTH675() {
        int v = this.FLD69;
        if(v == -1 && Build.VERSION.SDK_INT >= 23) {
            return IconCompat.MTH677(((Icon)this.FLD71));
        }
        if(v != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.FLD64;
    }

    public static String MTH676(int v) {
        switch(v) {
            case 1: {
                return "BITMAP";
            }
            case 2: {
                return "RESOURCE";
            }
            case 3: {
                return "DATA";
            }
            case 4: {
                return "URI";
            }
            case 5: {
                return "BITMAP_MASKABLE";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    public static int MTH677(Icon icon0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return icon0.getResId();
        }
        try {
            return (int)(((Integer)icon0.getClass().getMethod("getResId").invoke(icon0)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("IconCompat", "Unable to get icon resource", illegalAccessException0);
            return 0;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.e("IconCompat", "Unable to get icon resource", invocationTargetException0);
            return 0;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("IconCompat", "Unable to get icon resource", noSuchMethodException0);
            return 0;
        }
    }
}

