package p000;

import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.View;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.theme.ThemeProvider;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: hw */
/* JADX INFO: loaded from: classes.dex */
public class C1517hw implements InterfaceC1054Yg, InterfaceC2142kc, InterfaceC2476rx, InterfaceC1233bs {

    /* JADX INFO: renamed from: b */
    public static C1517hw f5366b;

    /* JADX INFO: renamed from: c */
    public static C1517hw f5367c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5368a;

    public /* synthetic */ C1517hw(int i) {
        this.f5368a = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m2889a(int i, String str) {
        AbstractC0295Gu.m625r(-791652666964021L);
        C0183EA.f539a.getClass();
        if (C0183EA.m374b().f232j && m2895h() && !str.equals(AbstractC0295Gu.m625r(-791674141800501L)) && !str.equals(AbstractC0295Gu.m625r(-791802990819381L)) && !AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-791923249903669L), false)) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1002704833) {
                if (iHashCode != 520448727) {
                    if (iHashCode != 1114773987 || !str.equals(AbstractC0295Gu.m625r(-792507365455925L))) {
                        return -1;
                    }
                } else if (!str.equals(AbstractC0295Gu.m625r(-792619034605621L))) {
                    return -1;
                }
            } else if (!str.equals(AbstractC0295Gu.m625r(-792215307679797L))) {
                return -1;
            }
        }
        Integer num = (Integer) AbstractC0999XA.f3193a.get(str);
        return num != null ? num.intValue() : i;
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2890b(String str) {
        String strConcat;
        if (str == null || str.length() == 0) {
            return null;
        }
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        Resources resources = contextCurrentApplication.getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        boolean zM2895h = m2895h();
        if (zM2895h) {
            int iM5061V = AbstractC2564tz.m5061V(str, '/');
            if (iM5061V >= 0) {
                StringBuilder sb = new StringBuilder();
                int i = iM5061V + 1;
                String strSubstring = str.substring(0, i);
                AbstractC0295Gu.m625r(-793830215383093L);
                AbstractC2374ph.m4817n(sb, strSubstring, -793344884078645L);
                String strSubstring2 = str.substring(i);
                AbstractC0295Gu.m625r(-793370653882421L);
                sb.append(strSubstring2);
                strConcat = sb.toString();
            } else {
                strConcat = AbstractC0295Gu.m625r(-793435078391861L).concat(str);
            }
            Drawable drawableForSize = m2893e(strConcat) ? ThemeProvider.getDrawableForSize(resources, strConcat, AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32)) : ThemeProvider.getDrawable(resources, strConcat);
            if (drawableForSize != null) {
                return drawableForSize;
            }
        }
        Drawable drawableForSize2 = m2893e(str) ? ThemeProvider.getDrawableForSize(resources, str, AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32)) : ThemeProvider.getDrawable(resources, str);
        if (drawableForSize2 == null) {
            return null;
        }
        C0183EA.f539a.getClass();
        if (C0183EA.m374b().f232j && zM2895h) {
            int i2 = AbstractC2564tz.m5068c0(str, '/').startsWith(AbstractC0295Gu.m625r(-793460848195637L)) ? -1073741824 : 536870912;
            if (m2893e(str)) {
                AbstractC0295Gu.m625r(-793478028064821L);
                Bitmap bitmapCopy = ((BitmapDrawable) drawableForSize2).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                Canvas canvas = new Canvas(bitmapCopy);
                Paint paint = new Paint();
                paint.setColor(i2);
                paint.setColorFilter(new PorterDuffColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmapCopy, 0.0f, 0.0f, paint);
                Context contextCurrentApplication2 = MainApplication.f5549a;
                if (contextCurrentApplication2 == null && (contextCurrentApplication2 = C1456gf.f5172p) == null) {
                    contextCurrentApplication2 = AndroidAppHelper.currentApplication();
                    AbstractC0295Gu.m625r(-836852902787125L);
                }
                Resources resources2 = contextCurrentApplication2.getResources();
                AbstractC0295Gu.m625r(-836955982002229L);
                return new BitmapDrawable(resources2, bitmapCopy);
            }
            drawableForSize2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
        }
        return drawableForSize2;
    }

    /* JADX INFO: renamed from: c */
    public static Path m2891c(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX INFO: renamed from: d */
    public static String m2892d(String str, String str2) {
        AbstractC0295Gu.m625r(-792163768072245L);
        AbstractC0295Gu.m625r(-792185242908725L);
        String str3 = (String) AbstractC0999XA.f3194b.get(str);
        return str3 == null ? str2 : str3;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2893e(String str) {
        return (!AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-793752905971765L), false) || AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-793795855644725L), false) || AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-793813035513909L), false)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2894f(Context context) {
        AbstractC0295Gu.m625r(-793675596560437L);
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2895h() {
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        return m2894f(contextCurrentApplication);
    }

    @Override // p000.InterfaceC1054Yg
    /* JADX INFO: renamed from: g */
    public Object mo235g() {
        try {
            return new C1070Yw(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.InterfaceC2476rx
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p000.InterfaceC2476rx
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs c2428qs) {
        switch (this.f5368a) {
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return new C2392pz(c2428qs.m4872j(Uri.class, AssetFileDescriptor.class), 0);
            case 10:
                return new C2392pz(c2428qs.m4872j(Uri.class, ParcelFileDescriptor.class), 0);
            case 11:
                return new C2392pz(c2428qs.m4872j(Uri.class, InputStream.class), 0);
            case 17:
                return new C2392pz(c2428qs.m4872j(C1057Yj.class, InputStream.class), 1);
            default:
                return new C2356pD(c2428qs.m4872j(C1057Yj.class, InputStream.class));
        }
    }

    public C1517hw(View view, int i) {
        this.f5368a = i;
        switch (i) {
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                if (Build.VERSION.SDK_INT < 30) {
                    new C1517hw(view, 7);
                } else {
                    new C0170Dy(view, 7);
                }
                break;
        }
    }
}
