package yyds;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Gainmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000ss.android.ugc.awemes.WardDatabase;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: yyds.ᲀᛳᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1960 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C1985 f9827;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static boolean f9828;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static Boolean f9829;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Application f9830;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1681 f9831;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C0469 f9832;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1586 f9833;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C0135 f9834 = new C0135(19);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static C0805 f9835;

    static {
        int i = 18;
        f9832 = new C0469(i);
        f9827 = new C1985(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3774(WardDatabase wardDatabase, InterfaceC0274 interfaceC0274, InterfaceC1549 interfaceC1549, boolean z, boolean z2) throws Throwable {
        C0253 c0253;
        InterfaceC2213 interfaceC2213Mo422;
        WardDatabase wardDatabase2;
        boolean z3;
        boolean z4;
        InterfaceC1549 interfaceC15492;
        if (interfaceC0274 instanceof C0253) {
            c0253 = (C0253) interfaceC0274;
            int i = c0253.f1401;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0253.f1401 = i - Integer.MIN_VALUE;
            } else {
                c0253 = new C0253(interfaceC0274);
            }
        }
        C0253 c02532 = c0253;
        Object obj = c02532.f1402;
        int i2 = c02532.f1401;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            if (wardDatabase.m345() && wardDatabase.m352() && wardDatabase.m347()) {
                C2002 c2002 = new C2002(wardDatabase, null, interfaceC1549, z2, z);
                c02532.f1401 = 1;
                Object objM346 = wardDatabase.m346(z, c2002, c02532);
                if (objM346 != enumC1765) {
                    return objM346;
                }
            } else {
                c02532.f1403 = wardDatabase;
                c02532.f1400 = interfaceC1549;
                c02532.f1398 = z;
                c02532.f1399 = z2;
                c02532.f1401 = 2;
                C0058 c0058 = (C0058) c02532.f6070.mo423(C0058.f575);
                InterfaceC2213 interfaceC2213 = c0058 != null ? c0058.f576 : null;
                if (!wardDatabase.m345()) {
                    C2454 c2454 = wardDatabase.f497;
                    if (c2454 == null) {
                        c2454 = null;
                    }
                    InterfaceC2213 interfaceC22132 = c2454.f12093;
                    if (interfaceC2213 == null) {
                        interfaceC2213 = C2586.f12764;
                    }
                    interfaceC2213Mo422 = interfaceC22132.mo422(interfaceC2213);
                } else if (interfaceC2213 != null) {
                    C2454 c24542 = wardDatabase.f497;
                    if (c24542 == null) {
                        c24542 = null;
                    }
                    interfaceC2213Mo422 = c24542.f12093.mo422(interfaceC2213);
                } else if (z2) {
                    interfaceC2213Mo422 = wardDatabase.f498;
                    if (interfaceC2213Mo422 == null) {
                        interfaceC2213Mo422 = null;
                    }
                } else {
                    C2454 c24543 = wardDatabase.f497;
                    if (c24543 == null) {
                        c24543 = null;
                    }
                    interfaceC2213Mo422 = c24543.f12093;
                }
                if (interfaceC2213Mo422 != enumC1765) {
                    wardDatabase2 = wardDatabase;
                    z3 = z2;
                    obj = interfaceC2213Mo422;
                    z4 = z;
                    interfaceC15492 = interfaceC1549;
                }
            }
        }
        if (i2 == 1) {
            AbstractC1544.m3189(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                AbstractC1544.m3189(obj);
                return obj;
            }
            C0188.m800("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z5 = c02532.f1399;
        boolean z6 = c02532.f1398;
        InterfaceC1549 interfaceC15493 = c02532.f1400;
        WardDatabase wardDatabase3 = c02532.f1403;
        AbstractC1544.m3189(obj);
        z3 = z5;
        z4 = z6;
        interfaceC15492 = interfaceC15493;
        wardDatabase2 = wardDatabase3;
        C0325 c0325 = new C0325(wardDatabase2, null, interfaceC15492, z4, z3);
        c02532.f1403 = null;
        c02532.f1400 = null;
        c02532.f1401 = 3;
        Object objM3955 = AbstractC2071.m3955((InterfaceC2213) obj, c0325, c02532);
        return objM3955 == enumC1765 ? enumC1765 : objM3955;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static boolean m3775(String str) {
        if (str.length() < 3) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'n') {
            return str.equals("null");
        }
        if (cCharAt == 't') {
            return str.equals("true");
        }
        if (cCharAt == 'f') {
            return str.equals("false");
        }
        if (cCharAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final Object m3776(WardDatabase wardDatabase, InterfaceC1549 interfaceC1549) {
        ThreadLocal threadLocal = wardDatabase.f495;
        wardDatabase.m349();
        InterfaceC0274 interfaceC0274 = null;
        if (wardDatabase.m345() && !wardDatabase.m347()) {
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) threadLocal.get();
            if ((interfaceC2213 != null ? (C0058) interfaceC2213.mo423(C0058.f575) : null) != null) {
                C0188.m800("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        InterfaceC2213 interfaceC22132 = (InterfaceC2213) threadLocal.get();
        C2586 c2586 = C2586.f12764;
        C1647 c1647 = new C1647(interfaceC22132 == null ? c2586 : interfaceC22132, wardDatabase, interfaceC1549, interfaceC0274, 2);
        Thread.interrupted();
        return AbstractC2217.m4197(c2586, new C2576(c1647, null));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static boolean m3777(C0644 c0644) throws Throwable {
        try {
            boolean zM1550 = c0644.m1550();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zM1550;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zM1550);
            return zM1550;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static Bitmap m3778(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            Log.d("BaseBlurView", "Converting hardware bitmap to software bitmap for blur processing");
            try {
                return bitmap.copy(Bitmap.Config.ARGB_8888, false);
            } catch (Exception e) {
                Log.e("BaseBlurView", "Failed to convert hardware bitmap: " + e.getMessage());
            }
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final void m3779(TextView textView, float f) {
        textView.setText(AbstractC2104.m4000(new Object[]{Float.valueOf(f)}, 1, AbstractC2328.m4341(-181414696485742L), -181436171322222L).concat("x"));
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static void m3780(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static Bitmap m3781(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null && gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8) {
            bitmap.setGainmap(AbstractC0530.m1370(gainmap));
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static void m3782(String str) {
        C2791 c2791 = new C2791(2);
        c2791.f13650 = str;
        c2791.f13648 = 1;
        m3784(c2791);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m3783(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            C0188.m798(AbstractC0897.m1987(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static void m3784(C2791 c2791) {
        if (f9830 == null) {
            C0188.m800("Toaster has not been initialized");
            return;
        }
        CharSequence charSequence = (CharSequence) c2791.f13650;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (((C1681) c2791.f13647) == null) {
            c2791.f13647 = f9831;
        }
        int i = 0;
        if (((C0805) c2791.f13649) == null) {
            C0805 c0805 = f9835;
            if (c0805 == null) {
                c0805 = new C0805(i);
                f9835 = c0805;
            }
            c2791.f13649 = c0805;
        }
        if (((C1586) c2791.f13645) == null) {
            c2791.f13645 = f9833;
        }
        CharSequence charSequence2 = (CharSequence) c2791.f13650;
        Boolean boolValueOf = f9829;
        if (boolValueOf == null) {
            Application application = f9830;
            if (application == null) {
                C0188.m800("Toaster has not been initialized");
                return;
            } else {
                boolValueOf = Boolean.valueOf((application.getApplicationInfo().flags & 2) != 0);
                f9829 = boolValueOf;
            }
        }
        if (boolValueOf.booleanValue()) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                int lineNumber = stackTraceElement.getLineNumber();
                if (lineNumber > 0) {
                    try {
                        Class<?> cls = Class.forName(stackTraceElement.getClassName());
                        if (!C0805.class.isAssignableFrom(cls) && !AbstractC1960.class.equals(cls) && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
                            Log.i("Toaster", "(" + stackTraceElement.getFileName() + ":" + lineNumber + ") " + charSequence2.toString());
                            break;
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (c2791.f13648 == -1) {
            C1681 c1681 = (C1681) c2791.f13647;
            CharSequence charSequence3 = (CharSequence) c2791.f13650;
            c1681.getClass();
            c2791.f13648 = charSequence3.length() <= 20 ? 0 : 1;
        }
        C1681 c16812 = (C1681) c2791.f13647;
        c16812.getClass();
        C1681.f8569.postDelayed(new RunnableC1291(c16812, c2791, i), 100L);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static boolean m3785(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static boolean m3786(char c) {
        if (c >= 0 && c <= 31) {
            return true;
        }
        if (c < 127 || c > 159) {
            return c >= 8192 && c <= 8447;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static void m3787(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                m3780(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m3780(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m3780(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m3780(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static boolean m3788(char c) {
        return c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '\"';
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static void m3789(CharSequence charSequence) {
        C2791 c2791 = new C2791(2);
        c2791.f13650 = charSequence;
        c2791.f13648 = 0;
        m3784(c2791);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static Bitmap m3790(InputStream inputStream, BitmapFactory.Options options, C0644 c0644) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !AbstractC2071.m3958(options) || !m3777(c0644)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        Bitmap.Config config = options.inPreferredConfig;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        AbstractC0319.m985("", config == config2);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                options.inPreferredConfig = config2;
                return null;
            }
            try {
                Bitmap bitmapM3781 = m3781(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = config2;
                return bitmapM3781;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeStream;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static void m3791(String str) {
        C2791 c2791 = new C2791(2);
        c2791.f13650 = str;
        m3784(c2791);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final int m3792(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                C0188.m798("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m3793(View view) {
        Bitmap bitmap;
        if (view != null) {
            try {
                if (view instanceof ImageView) {
                    ImageView imageView = (ImageView) view;
                    Drawable drawable = imageView.getDrawable();
                    if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                        Log.d("BaseBlurView", "Converting hardware bitmap in ImageView to software");
                        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                        if (bitmapCopy != null) {
                            imageView.setImageBitmap(bitmapCopy);
                        }
                    }
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m3793(viewGroup.getChildAt(i));
                    }
                }
            } catch (Exception e) {
                Log.e("BaseBlurView", "Error disabling hardware bitmaps: " + e.getMessage());
            }
        }
    }
}
