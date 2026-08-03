package androidx.core.graphics.drawable;

import Yue.C4187;
import Yue.C6499;
import Yue.C6740;
import Yue.C7130;
import Yue.C8273;
import Yue.InterfaceC3897;
import Yue.InterfaceC4482;
import Yue.InterfaceC4525;
import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.C1629;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f29457 = "IconCompat";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f29458 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f29459 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f29460 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f29461 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f29462 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f29463 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f29464 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final float f29465 = 0.25f;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final float f29466 = 0.6666667f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final float f29467 = 0.9166667f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final float f29468 = 0.010416667f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final float f29469 = 0.020833334f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f29470 = 61;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f29471 = 30;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f29472 = "type";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f29473 = "obj";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f29474 = "int1";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f29475 = "int2";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f29476 = "tint_list";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f29477 = "tint_mode";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @InterfaceC8392
    public static final String f29478 = "string1";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final PorterDuff.Mode f29479 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int f3752;

    /* JADX INFO: renamed from: ۥ۟ */
    public Object f3753;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    public byte[] f29480;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    public Parcelable f29481;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public int f29482;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public int f29483;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    public ColorStateList f29484;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public PorterDuff.Mode f29485;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    public String f29486;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    public String f29487;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$ۥ */
    @InterfaceC7113(23)
    public static class C1660 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public static IconCompat m4756(@InterfaceC6391 Context context, @InterfaceC6391 Icon icon) {
            int iM29574 = m29574(icon);
            if (iM29574 == 2) {
                String strM29573 = m29573(icon);
                try {
                    return IconCompat.m29553(IconCompat.m29554(context, strM29573), strM29573, m29572(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (iM29574 == 4) {
                return IconCompat.m29549(m29575(icon));
            }
            if (iM29574 == 6) {
                return IconCompat.m29546(m29575(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f3753 = icon;
            return iconCompat;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static IconCompat m4757(@InterfaceC6391 Object obj) {
            C6740.m21415(obj);
            int iM29574 = m29574(obj);
            if (iM29574 == 2) {
                return IconCompat.m29553(null, m29573(obj), m29572(obj));
            }
            if (iM29574 == 4) {
                return IconCompat.m29549(m29575(obj));
            }
            if (iM29574 == 6) {
                return IconCompat.m29546(m29575(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f3753 = obj;
            return iconCompat;
        }

        @InterfaceC4525
        @InterfaceC5411
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m29572(@InterfaceC6391 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C8800.m4760(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.f29457, "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e(IconCompat.f29457, "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e(IconCompat.f29457, "Unable to get icon resource", e3);
                return 0;
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static String m29573(@InterfaceC6391 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C8800.m4761(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.f29457, "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e(IconCompat.f29457, "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e(IconCompat.f29457, "Unable to get icon package", e3);
                return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m29574(@InterfaceC6391 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C8800.m29578(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.f29457, "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e(IconCompat.f29457, "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e(IconCompat.f29457, "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        @InterfaceC4482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static Uri m29575(@InterfaceC6391 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C8800.m29579(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                Log.e(IconCompat.f29457, "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e(IconCompat.f29457, "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e(IconCompat.f29457, "Unable to get icon uri", e3);
                return null;
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Drawable m29576(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static Icon m29577(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f3752) {
                case -1:
                    return (Icon) iconCompat.f3753;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3753);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m29560(), iconCompat.f29482);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f3753, iconCompat.f29482, iconCompat.f29483);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f3753);
                    break;
                case 5:
                    iconCreateWithBitmap = C1661.m4759((Bitmap) iconCompat.f3753);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = C8801.m4762(iconCompat.m29562());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m29562());
                        }
                        InputStream inputStreamM29563 = iconCompat.m29563(context);
                        if (inputStreamM29563 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m29562());
                        }
                        iconCreateWithBitmap = C1661.m4759(BitmapFactory.decodeStream(inputStreamM29563));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f29484;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f29485;
            if (mode != IconCompat.f29479) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$ۥ۟ */
    @InterfaceC7113(26)
    public static class C1661 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Drawable m4758(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Icon m4759(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C8800 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m4760(Object obj) {
            return ((Icon) obj).getResId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m4761(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m29578(Object obj) {
            return ((Icon) obj).getType();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Uri m29579(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C8801 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Icon m4762(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8802 {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public IconCompat() {
        this.f3752 = -1;
        this.f29480 = null;
        this.f29481 = null;
        this.f29482 = 0;
        this.f29483 = 0;
        this.f29484 = null;
        this.f29485 = f29479;
        this.f29486 = null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static IconCompat m29540(@InterfaceC6391 Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f29482 = bundle.getInt(f29474);
        iconCompat.f29483 = bundle.getInt(f29475);
        iconCompat.f29487 = bundle.getString(f29478);
        if (bundle.containsKey(f29476)) {
            iconCompat.f29484 = (ColorStateList) bundle.getParcelable(f29476);
        }
        if (bundle.containsKey(f29477)) {
            iconCompat.f29485 = PorterDuff.Mode.valueOf(bundle.getString(f29477));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.f3753 = bundle.getParcelable(f29473);
                return iconCompat;
            case 0:
            default:
                Log.w(f29457, "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f3753 = bundle.getString(f29473);
                return iconCompat;
            case 3:
                iconCompat.f3753 = bundle.getByteArray(f29473);
                return iconCompat;
        }
    }

    @InterfaceC6490
    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static IconCompat m29541(@InterfaceC6391 Context context, @InterfaceC6391 Icon icon) {
        C6740.m21415(icon);
        return C1660.m4756(context, icon);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static IconCompat m29542(@InterfaceC6391 Icon icon) {
        return C1660.m4757(icon);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static IconCompat m29543(@InterfaceC6391 Icon icon) {
        if (C1660.m29574(icon) == 2 && C1660.m29572(icon) == 0) {
            return null;
        }
        return C1660.m4757(icon);
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Bitmap m29544(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(C8273.f24692);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static IconCompat m29545(@InterfaceC6391 Bitmap bitmap) {
        C6499.m20592(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f3753 = bitmap;
        return iconCompat;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static IconCompat m29546(@InterfaceC6391 Uri uri) {
        C6499.m20592(uri);
        return m29547(uri.toString());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static IconCompat m29547(@InterfaceC6391 String str) {
        C6499.m20592(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3753 = str;
        return iconCompat;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static IconCompat m29548(@InterfaceC6391 Bitmap bitmap) {
        C6499.m20592(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3753 = bitmap;
        return iconCompat;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static IconCompat m29549(@InterfaceC6391 Uri uri) {
        C6499.m20592(uri);
        return m29550(uri.toString());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static IconCompat m29550(@InterfaceC6391 String str) {
        C6499.m20592(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3753 = str;
        return iconCompat;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static IconCompat m29551(@InterfaceC6391 byte[] bArr, int i, int i2) {
        C6499.m20592(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f3753 = bArr;
        iconCompat.f29482 = i;
        iconCompat.f29483 = i2;
        return iconCompat;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static IconCompat m29552(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        C6499.m20592(context);
        return m29553(context.getResources(), context.getPackageName(), i);
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static IconCompat m29553(@InterfaceC6490 Resources resources, @InterfaceC6391 String str, @InterfaceC4525 int i) {
        C6499.m20592(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f29482 = i;
        if (resources != null) {
            try {
                iconCompat.f3753 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3753 = str;
        }
        iconCompat.f29487 = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static Resources m29554(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f29457, String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static String m29555(int i) {
        switch (i) {
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

    @InterfaceC6391
    public String toString() {
        if (this.f3752 == -1) {
            return String.valueOf(this.f3753);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m29555(this.f3752));
        switch (this.f3752) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3753).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3753).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f29487);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m29559())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f29482);
                if (this.f29483 != 0) {
                    sb.append(" off=");
                    sb.append(this.f29483);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3753);
                break;
        }
        if (this.f29484 != null) {
            sb.append(" tint=");
            sb.append(this.f29484);
        }
        if (this.f29485 != f29479) {
            sb.append(" mode=");
            sb.append(this.f29485);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    /* JADX INFO: renamed from: ۥ */
    public void mo4754() {
        this.f29485 = PorterDuff.Mode.valueOf(this.f29486);
        switch (this.f3752) {
            case -1:
                Parcelable parcelable = this.f29481;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f3753 = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f29481;
                if (parcelable2 != null) {
                    this.f3753 = parcelable2;
                    return;
                }
                byte[] bArr = this.f29480;
                this.f3753 = bArr;
                this.f3752 = 3;
                this.f29482 = 0;
                this.f29483 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f29480, Charset.forName("UTF-16"));
                this.f3753 = str;
                if (this.f3752 == 2 && this.f29487 == null) {
                    this.f29487 = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3753 = this.f29480;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo4755(boolean z) {
        this.f29486 = this.f29485.name();
        switch (this.f3752) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f29481 = (Parcelable) this.f3753;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z) {
                    this.f29481 = (Parcelable) this.f3753;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f3753;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f29480 = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f29480 = ((String) this.f3753).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f29480 = (byte[]) this.f3753;
                return;
            case 4:
            case 6:
                this.f29480 = this.f3753.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29556(@InterfaceC6391 Intent intent, @InterfaceC6490 Drawable drawable, @InterfaceC6391 Context context) {
        Bitmap bitmapCopy;
        m29557(context);
        int i = this.f3752;
        if (i == 1) {
            bitmapCopy = (Bitmap) this.f3753;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(m29560(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f29482));
                    return;
                }
                Drawable drawableM12065 = C4187.m12065(contextCreatePackageContext, this.f29482);
                if (drawableM12065.getIntrinsicWidth() <= 0 || drawableM12065.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService(C1629.f26361)).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableM12065.getIntrinsicWidth(), drawableM12065.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableM12065.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableM12065.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f3753, e);
            }
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = m29544((Bitmap) this.f3753, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29557(@InterfaceC6391 Context context) {
        Object obj;
        if (this.f3752 != 2 || (obj = this.f3753) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(f29457, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strM29560 = m29560();
            int identifier = m29554(context, strM29560).getIdentifier(str4, str3, str5);
            if (this.f29482 != identifier) {
                Log.i(f29457, "Id has changed for " + strM29560 + " " + str);
                this.f29482 = identifier;
            }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Bitmap m29558() {
        int i = this.f3752;
        if (i == -1) {
            Object obj = this.f3753;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f3753;
        }
        if (i == 5) {
            return m29544((Bitmap) this.f3753, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @InterfaceC4525
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m29559() {
        int i = this.f3752;
        if (i == -1) {
            return C1660.m29572(this.f3753);
        }
        if (i == 2) {
            return this.f29482;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String m29560() {
        int i = this.f3752;
        if (i == -1) {
            return C1660.m29573(this.f3753);
        }
        if (i == 2) {
            String str = this.f29487;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3753).split(":", -1)[0] : this.f29487;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int m29561() {
        int i = this.f3752;
        return i == -1 ? C1660.m29574(this.f3753) : i;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Uri m29562() {
        int i = this.f3752;
        if (i == -1) {
            return C1660.m29575(this.f3753);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3753);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public InputStream m29563(@InterfaceC6391 Context context) {
        Uri uriM29562 = m29562();
        String scheme = uriM29562.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM29562);
            } catch (Exception e) {
                Log.w(f29457, "Unable to load image from URI: " + uriM29562, e);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f3753));
        } catch (FileNotFoundException e2) {
            Log.w(f29457, "Unable to load image from path: " + uriM29562, e2);
            return null;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Drawable m29564(@InterfaceC6391 Context context) {
        m29557(context);
        return C1660.m29576(m29571(context), context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final Drawable m29565(Context context) {
        switch (this.f3752) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f3753);
            case 2:
                String strM29560 = m29560();
                if (TextUtils.isEmpty(strM29560)) {
                    strM29560 = context.getPackageName();
                }
                try {
                    return C7130.m22275(m29554(context, strM29560), this.f29482, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e(f29457, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f29482), this.f3753), e);
                }
                break;
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f3753, this.f29482, this.f29483));
            case 4:
                InputStream inputStreamM29563 = m29563(context);
                if (inputStreamM29563 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamM29563));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), m29544((Bitmap) this.f3753, false));
            case 6:
                InputStream inputStreamM295632 = m29563(context);
                if (inputStreamM295632 != null) {
                    return C1661.m4758(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamM295632)));
                }
                return null;
            default:
                return null;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public IconCompat m29566(@InterfaceC3897 int i) {
        return m29567(ColorStateList.valueOf(i));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public IconCompat m29567(@InterfaceC6490 ColorStateList colorStateList) {
        this.f29484 = colorStateList;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public IconCompat m29568(@InterfaceC6490 PorterDuff.Mode mode) {
        this.f29485 = mode;
        return this;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Bundle m29569() {
        Bundle bundle = new Bundle();
        switch (this.f3752) {
            case -1:
                bundle.putParcelable(f29473, (Parcelable) this.f3753);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(f29473, (Bitmap) this.f3753);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(f29473, (String) this.f3753);
                break;
            case 3:
                bundle.putByteArray(f29473, (byte[]) this.f3753);
                break;
        }
        bundle.putInt("type", this.f3752);
        bundle.putInt(f29474, this.f29482);
        bundle.putInt(f29475, this.f29483);
        bundle.putString(f29478, this.f29487);
        ColorStateList colorStateList = this.f29484;
        if (colorStateList != null) {
            bundle.putParcelable(f29476, colorStateList);
        }
        PorterDuff.Mode mode = this.f29485;
        if (mode != f29479) {
            bundle.putString(f29477, mode.name());
        }
        return bundle;
    }

    @InterfaceC6391
    @InterfaceC7113(23)
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Icon m29570() {
        return m29571(null);
    }

    @InterfaceC6391
    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Icon m29571(@InterfaceC6490 Context context) {
        return C1660.m29577(this, context);
    }

    public IconCompat(int i) {
        this.f29480 = null;
        this.f29481 = null;
        this.f29482 = 0;
        this.f29483 = 0;
        this.f29484 = null;
        this.f29485 = f29479;
        this.f29486 = null;
        this.f3752 = i;
    }
}
