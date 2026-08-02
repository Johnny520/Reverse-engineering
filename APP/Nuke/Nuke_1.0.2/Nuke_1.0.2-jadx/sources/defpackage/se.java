package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;
import nuke.module.wechat.ai.AIModelInfo;
import nuke.module.wechat.ai.a;
import nuke.module.wechat.ai.b;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class se {
    public static final oq a = new oq();
    public static final sl0 b = new sl0(10);
    public static final af0 c = new af0(new c80(6));
    public static final StackTraceElement[] d = new StackTraceElement[0];
    public static final long[] e = new long[0];
    public static sx0 f;
    public static sx0 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Handler A(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return s90.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ji0 B(DexKitBridge dexKitBridge, q qVar) {
        dexKitBridge.getClass();
        int iB = qVar.b(4);
        int i = iB != 0 ? qVar.b.getInt(iB + qVar.a) : 0;
        int iB2 = qVar.b(6);
        int i2 = iB2 != 0 ? qVar.b.getInt(iB2 + qVar.a) : 0;
        int iB3 = qVar.b(8);
        int i3 = iB3 != 0 ? qVar.b.getInt(iB3 + qVar.a) : 0;
        int iB4 = qVar.b(10);
        int i4 = iB4 != 0 ? qVar.b.getInt(iB4 + qVar.a) : 0;
        int iB5 = qVar.b(12);
        String strD = iB5 != 0 ? qVar.d(iB5 + qVar.a) : null;
        strD.getClass();
        int iB6 = qVar.b(14);
        return new ji0(dexKitBridge, i, i2, i3, i4, strD, iB6 != 0 ? qVar.b.getInt(iB6 + qVar.a) : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final m13 C(px pxVar) {
        return new m13(((lp1) ((go0) pxVar).j(ur1.a)).f, rg3.D(12), null, 0L, 0, rg3.D(17), null, null, 16646140);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final w41 D(w41 w41Var) {
        w41Var.getClass();
        return w41Var.e().h() ? w41Var : new zr1(w41Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int E(List list, InputStream inputStream, td1 td1Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new r62(inputStream, td1Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iB = ((kx0) list.get(i)).b(inputStream, td1Var);
                if (iB != -1) {
                    return iB;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String F(ClassLoader classLoader, Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("path");
            declaredField.setAccessible(true);
            return (String) declaredField.get(classLoader);
        } catch (ClassCastException | IllegalAccessException | NoSuchFieldException unused) {
            String string = classLoader.toString();
            if (!string.contains("DexPathList")) {
                int iLastIndexOf = string.lastIndexOf(91);
                if (iLastIndexOf != -1) {
                    string = string.substring(iLastIndexOf + 1);
                }
                int iIndexOf = string.indexOf(93);
                return iIndexOf == -1 ? string : string.substring(0, iIndexOf);
            }
            int iIndexOf2 = string.indexOf("DexPathList");
            int i = iIndexOf2 + 11;
            if (string.length() <= iIndexOf2 + 15) {
                return string;
            }
            String strSubstring = string.substring(i);
            int iIndexOf3 = strSubstring.indexOf(93);
            if (strSubstring.charAt(0) != '[' || strSubstring.charAt(1) != '[' || iIndexOf3 < 0) {
                return string;
            }
            String[] strArrSplit = strSubstring.substring(2, iIndexOf3).split(",");
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                int iIndexOf4 = strArrSplit[i2].indexOf(34);
                int iLastIndexOf2 = strArrSplit[i2].lastIndexOf(34);
                if (iIndexOf4 > 0 && iIndexOf4 < iLastIndexOf2) {
                    strArrSplit[i2] = strArrSplit[i2].substring(iIndexOf4 + 1, iLastIndexOf2);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String str : strArrSplit) {
                if (sb.length() > 0) {
                    sb.append(':');
                }
                sb.append(str);
            }
            return sb.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final mb2 G(if1 if1Var) {
        Object objI = if1Var.i();
        if (objI instanceof mb2) {
            return (mb2) objI;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sx0 H() {
        sx0 sx0Var = g;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = s93.a;
        ft2 ft2Var = new ft2(ju.b);
        ye0 ye0Var = new ye0(3);
        ye0Var.k(15.5f, 14.0f);
        ye0Var.h(-0.79f);
        ye0Var.j(-0.28f, -0.27f);
        ye0Var.d(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        ye0Var.d(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        ye0Var.l(3.0f, 5.91f, 3.0f, 9.5f);
        ye0Var.l(5.91f, 16.0f, 9.5f, 16.0f);
        ye0Var.e(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        ye0Var.j(0.27f, 0.28f);
        ye0Var.o(0.79f);
        ye0Var.j(5.0f, 4.99f);
        ye0Var.i(20.49f, 19.0f);
        ye0Var.j(-4.99f, -5.0f);
        ye0Var.c();
        ye0Var.k(9.5f, 14.0f);
        ye0Var.d(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        ye0Var.l(7.01f, 5.0f, 9.5f, 5.0f);
        ye0Var.l(14.0f, 7.01f, 14.0f, 9.5f);
        ye0Var.l(11.99f, 14.0f, 9.5f, 14.0f);
        ye0Var.c();
        rx0.a(rx0Var, ye0Var.a, ft2Var);
        sx0 sx0VarB = rx0Var.b();
        g = sx0VarB;
        return sx0VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ImageHeaderParser$ImageType I(List list, InputStream inputStream, td1 td1Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new r62(inputStream, td1Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeF = ((kx0) list.get(i)).f(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeF != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeF;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ImageHeaderParser$ImageType J(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((kx0) list.get(i)).a(byteBuffer);
                AtomicReference atomicReference = lo.a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = lo.a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float K(mb2 mb2Var) {
        if (mb2Var != null) {
            return mb2Var.a;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static File[] L(String str) {
        int iLastIndexOf;
        int iLastIndexOf2;
        int iLastIndexOf3;
        int iIndexOf;
        Integer num;
        ArrayList arrayList = new ArrayList();
        if (str.startsWith("dexPath=")) {
            int iIndexOf2 = str.indexOf(44);
            str = iIndexOf2 == -1 ? str.substring(8) : str.substring(8, iIndexOf2);
        }
        for (String str2 : str.split(":")) {
            if (str2.startsWith("/data/app/") && (iLastIndexOf = str2.lastIndexOf(".apk")) == str2.length() - 4 && (iLastIndexOf2 = str2.lastIndexOf("/", iLastIndexOf)) != 9 && (iLastIndexOf3 = str2.lastIndexOf("/", iLastIndexOf2 - 1)) != -1 && (iIndexOf = str2.indexOf("-", iLastIndexOf3)) != -1) {
                String strSubstring = str2.substring(iLastIndexOf3 + 1, iIndexOf);
                File file = new File("/data/data/".concat(strSubstring));
                File file2 = null;
                if (!file.isDirectory() || !file.canWrite()) {
                    file = null;
                }
                if (file == null) {
                    try {
                        num = (Integer) Class.forName("android.os.Process").getMethod("myUid", null).invoke(null, null);
                    } catch (Exception unused) {
                        num = null;
                    }
                    if (num != null) {
                        File file3 = new File(String.format("/data/user/%d/%s", Integer.valueOf(num.intValue() / 100000), strSubstring));
                        if (file3.isDirectory() && file3.canWrite()) {
                            file2 = file3;
                        }
                    }
                    file = file2;
                }
                if (file != null) {
                    File file4 = new File(file, "cache");
                    if ((file4.exists() || file4.mkdir()) && file4.isDirectory() && file4.canWrite()) {
                        arrayList.add(file4);
                    }
                }
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void M(a20 a20Var, Throwable th) {
        if (th instanceof j90) {
            th = ((j90) th).h;
        }
        try {
            d20 d20Var = (d20) a20Var.o(gd3.q);
            if (d20Var != null) {
                d20Var.p(a20Var, th);
            } else {
                p7.w(a20Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                fg1.m(runtimeException, th);
                th = runtimeException;
            }
            p7.w(a20Var, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean N(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 O(uh1 uh1Var, l9 l9Var, t91 t91Var, b03 b03Var) {
        return uh1Var.c(new l91(l9Var, t91Var, b03Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List P(tr2 tr2Var, int i, tr2 tr2Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iU = tr2Var.u(i);
        int i4 = i + iU;
        int iF = tr2Var.f(i);
        int iF2 = tr2Var.f(i4);
        int i5 = iF2 - iF;
        boolean z5 = i >= 0 && (tr2Var.b[(tr2Var.r(i) * 5) + 1] & 201326592) != 0;
        tr2Var2.w(iU);
        tr2Var2.x(i5, tr2Var2.t);
        if (tr2Var.g < i4) {
            tr2Var.B(i4);
        }
        if (tr2Var.k < iF2) {
            tr2Var.C(iF2, i4);
        }
        int[] iArr = tr2Var2.b;
        int i6 = tr2Var2.t;
        int i7 = i6 * 5;
        mg.a0(tr2Var.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = tr2Var2.c;
        int i8 = tr2Var2.i;
        System.arraycopy(tr2Var.c, iF, objArr, i8, i5);
        int i9 = tr2Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iU;
        int iG = i8 - tr2Var2.g(iArr, i6);
        int i12 = tr2Var2.m;
        int i13 = tr2Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int iG2 = tr2Var2.g(iArr, i15) + iG;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = tr2Var2.k;
            }
            iArr2[(i15 * 5) + 4] = tr2.i(iG2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        tr2Var2.m = i14;
        int iA = sr2.a(tr2Var.d, i, tr2Var.p());
        int iA2 = sr2.a(tr2Var.d, i4, tr2Var.p());
        if (iA < iA2) {
            ArrayList arrayList = tr2Var.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i17 = iA; i17 < iA2; i17++) {
                ao0 ao0Var = (ao0) arrayList.get(i17);
                ao0Var.a += i10;
                arrayList2.add(ao0Var);
            }
            tr2Var2.d.addAll(sr2.a(tr2Var2.d, tr2Var2.t, tr2Var2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = be0.h;
        }
        if (!list.isEmpty()) {
            HashMap map = tr2Var.e;
            HashMap map2 = tr2Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = tr2Var2.v;
        tr2Var2.O(i9);
        int iE = tr2Var.E(tr2Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iE >= 0;
            if (z7) {
                tr2Var.P();
                tr2Var.a(iE - tr2Var.t);
                tr2Var.P();
            }
            tr2Var.a(i - tr2Var.t);
            boolean zH = tr2Var.H();
            if (z7) {
                tr2Var.M();
                tr2Var.j();
                tr2Var.M();
                tr2Var.j();
            }
            z4 = zH;
        } else {
            boolean zI = tr2Var.I(i, iU);
            tr2Var.J(iF, i5, i - 1);
            z4 = zI;
        }
        if (z4) {
            tx.a("Unexpectedly removed anchors");
        }
        int i20 = tr2Var2.o;
        int i21 = iArr3[i7 + 1];
        tr2Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            tr2Var2.t = i11;
            tr2Var2.i = i8 + i5;
        }
        if (z6) {
            tr2Var2.T(i9);
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int Q(yj1 yj1Var) {
        int iC;
        int i = yj1Var.b;
        int iC2 = yj1Var.c(0);
        while (yj1Var.b != 0 && yj1Var.c(0) == iC2) {
            int i2 = yj1Var.b;
            if (i2 == 0) {
                um2.i("IntList is empty.");
                return 0;
            }
            yj1Var.e(0, yj1Var.a[i2 - 1]);
            yj1Var.d(yj1Var.b - 1);
            int i3 = yj1Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = yj1Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = yj1Var.c(i7);
                if (i6 >= i3 || (iC = yj1Var.c(i6)) <= iC4) {
                    if (iC4 > iC3) {
                        yj1Var.e(i5, iC4);
                        yj1Var.e(i7, iC3);
                        i5 = i7;
                    }
                } else if (iC > iC3) {
                    yj1Var.e(i5, iC);
                    yj1Var.e(i6, iC3);
                    i5 = i6;
                }
            }
        }
        return iC2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean R(Throwable th, xm0 xm0Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = h21.a;
        j80 j80Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = c02.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = be0.h;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof j80) {
                return false;
            }
        }
        try {
            ex exVar = (ex) xm0Var.a();
            if (exVar != null) {
                boolean z2 = exVar.b;
                List list = exVar.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((fx) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                exVar.getClass();
                j80Var = new j80(exVar);
            }
        } catch (Throwable th2) {
            j80Var = th2;
        }
        if (j80Var != null) {
            fg1.m(th, j80Var);
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v6, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final AIChatConfig aIChatConfig, final xm0 xm0Var, final in0 in0Var, px pxVar, final int i) {
        int i2;
        xm0 xm0Var2;
        b62 b62VarR;
        mn0 mn0Var;
        boolean z;
        boolean z2;
        aIChatConfig.getClass();
        xm0Var.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(955088616);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.f(aIChatConfig) : go0Var.h(aIChatConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xm0Var2 = xm0Var;
            i2 |= go0Var.h(xm0Var2) ? 32 : 16;
        } else {
            xm0Var2 = xm0Var;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(in0Var) ? 256 : 128;
        }
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z3 || objL == ebVar) {
                objL = op0.u(aIChatConfig.getBaseUrl());
                go0Var.f0(objL);
            }
            final xk1 xk1Var = (xk1) objL;
            boolean z4 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL2 = go0Var.L();
            if (z4 || objL2 == ebVar) {
                objL2 = op0.u(aIChatConfig.getApiKey());
                go0Var.f0(objL2);
            }
            final xk1 xk1Var2 = (xk1) objL2;
            boolean z5 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL3 = go0Var.L();
            if (z5 || objL3 == ebVar) {
                objL3 = op0.u(aIChatConfig.getModel());
                go0Var.f0(objL3);
            }
            final xk1 xk1Var3 = (xk1) objL3;
            boolean z6 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL4 = go0Var.L();
            if (z6 || objL4 == ebVar) {
                objL4 = op0.u(aIChatConfig.getSystemPrompt());
                go0Var.f0(objL4);
            }
            final xk1 xk1Var4 = (xk1) objL4;
            boolean z7 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL5 = go0Var.L();
            if (z7 || objL5 == ebVar) {
                objL5 = op0.u(String.valueOf(aIChatConfig.getTemperature()));
                go0Var.f0(objL5);
            }
            final xk1 xk1Var5 = (xk1) objL5;
            boolean z8 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL6 = go0Var.L();
            if (z8 || objL6 == ebVar) {
                objL6 = op0.u(String.valueOf(aIChatConfig.getMaxTokens()));
                go0Var.f0(objL6);
            }
            final xk1 xk1Var6 = (xk1) objL6;
            boolean z9 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL7 = go0Var.L();
            if (z9 || objL7 == ebVar) {
                objL7 = op0.u(String.valueOf(aIChatConfig.getContextRounds()));
                go0Var.f0(objL7);
            }
            final xk1 xk1Var7 = (xk1) objL7;
            boolean z10 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL8 = go0Var.L();
            if (z10 || objL8 == ebVar) {
                objL8 = op0.u(String.valueOf(aIChatConfig.getReplyDelayMs()));
                go0Var.f0(objL8);
            }
            final xk1 xk1Var8 = (xk1) objL8;
            boolean z11 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL9 = go0Var.L();
            if (z11 || objL9 == ebVar) {
                objL9 = op0.u(aIChatConfig.getListMode());
                go0Var.f0(objL9);
            }
            final xk1 xk1Var9 = (xk1) objL9;
            boolean z12 = i3 == 4 || ((i2 & 8) != 0 && go0Var.f(aIChatConfig));
            Object objL10 = go0Var.L();
            if (z12 || objL10 == ebVar) {
                objL10 = op0.u(aIChatConfig.getTargetIds());
                go0Var.f0(objL10);
            }
            final xk1 xk1Var10 = (xk1) objL10;
            Object objL11 = go0Var.L();
            if (objL11 == ebVar) {
                objL11 = op0.u(Boolean.FALSE);
                go0Var.f0(objL11);
            }
            final xk1 xk1Var11 = (xk1) objL11;
            Object objL12 = go0Var.L();
            if (objL12 == ebVar) {
                objL12 = op0.u(Boolean.FALSE);
                go0Var.f0(objL12);
            }
            final xk1 xk1Var12 = (xk1) objL12;
            String str = (String) xk1Var5.getValue();
            str.getClass();
            Float fValueOf = null;
            try {
                if (vv2.U(str)) {
                    fValueOf = Float.valueOf(Float.parseFloat(str));
                }
            } catch (NumberFormatException unused) {
            }
            final Integer numE0 = wv2.e0((String) xk1Var6.getValue());
            final Integer numE02 = wv2.e0((String) xk1Var7.getValue());
            final Long lF0 = wv2.f0((String) xk1Var8.getValue());
            vf1 vf1Var = b.e;
            String str2 = (String) xk1Var.getValue();
            str2.getClass();
            boolean z13 = a.e(str2, "chat/completions") != null;
            if (!z13 || pv2.s0((String) xk1Var2.getValue()) || pv2.s0((String) xk1Var3.getValue()) || fValueOf == null) {
                z = false;
                if (((Boolean) xk1Var12.getValue()).booleanValue()) {
                    go0Var.W(-1111072326);
                    go0Var.p(false);
                    if (((Boolean) xk1Var11.getValue()).booleanValue()) {
                        go0Var.W(-1111022137);
                        String strP = rg3.P(((c1) xk1Var9.getValue()) == c1.j ? R.string.ai_chat_select_whitelist_title : R.string.ai_chat_select_blacklist_title, go0Var);
                        Set set = (Set) xk1Var10.getValue();
                        Object objL13 = go0Var.L();
                        if (objL13 == ebVar) {
                            objL13 = new f0(xk1Var11, 3);
                            go0Var.f0(objL13);
                        }
                        xm0 xm0Var3 = (xm0) objL13;
                        boolean zF = go0Var.f(xk1Var10);
                        Object objL14 = go0Var.L();
                        if (zF || objL14 == ebVar) {
                            objL14 = new i0(xk1Var10, xk1Var11, 1);
                            go0Var.f0(objL14);
                        }
                        u(strP, set, false, xm0Var3, (in0) objL14, go0Var, 3456);
                        go0Var.p(false);
                        b62VarR = go0Var.r();
                        if (b62VarR == null) {
                            return;
                        }
                        final int i4 = 1;
                        mn0Var = new mn0() { // from class: p0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.mn0
                            public final Object g(Object obj, Object obj2) {
                                int i5 = i4;
                                a83 a83Var = a83.a;
                                int i6 = i;
                                in0 in0Var2 = in0Var;
                                xm0 xm0Var4 = xm0Var;
                                AIChatConfig aIChatConfig2 = aIChatConfig;
                                px pxVar2 = (px) obj;
                                ((Integer) obj2).intValue();
                                switch (i5) {
                                    case 0:
                                        se.a(aIChatConfig2, xm0Var4, in0Var2, pxVar2, pp0.N(i6 | 1));
                                        break;
                                    case 1:
                                        se.a(aIChatConfig2, xm0Var4, in0Var2, pxVar2, pp0.N(i6 | 1));
                                        break;
                                    default:
                                        se.a(aIChatConfig2, xm0Var4, in0Var2, pxVar2, pp0.N(i6 | 1));
                                        break;
                                }
                                return a83Var;
                            }
                        };
                    } else {
                        go0Var.W(-1110419590);
                        go0Var.p(false);
                        final String strP2 = rg3.P(R.string.ai_chat_list_blacklist, go0Var);
                        final String strP3 = rg3.P(R.string.ai_chat_list_whitelist, go0Var);
                        String strP4 = rg3.P(R.string.ai_chat_config_title, go0Var);
                        final Float f2 = fValueOf;
                        final boolean z14 = z;
                        kw kwVarI0 = xe1.i0(1505821381, new nn0() { // from class: s0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.nn0
                            public final Object e(Object obj, Object obj2, Object obj3) {
                                pb2 pb2Var = (pb2) obj;
                                px pxVar2 = (px) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                pb2Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((go0) pxVar2).f(pb2Var) ? 4 : 2;
                                }
                                go0 go0Var2 = (go0) pxVar2;
                                if (go0Var2.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    se.r(rg3.P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.a(pb2Var), false, 0, go0Var2, 0, 56);
                                    String strP5 = rg3.P(R.string.home_settings_save, go0Var2);
                                    uh1 uh1VarA = pb2.a(pb2Var);
                                    final Float f3 = f2;
                                    boolean zF2 = go0Var2.f(f3);
                                    final Integer num = numE0;
                                    boolean zF3 = zF2 | go0Var2.f(num);
                                    final Integer num2 = numE02;
                                    boolean zF4 = zF3 | go0Var2.f(num2);
                                    final Long l = lF0;
                                    boolean zF5 = zF4 | go0Var2.f(l);
                                    final in0 in0Var2 = in0Var;
                                    boolean zF6 = zF5 | go0Var2.f(in0Var2);
                                    final xk1 xk1Var13 = xk1Var;
                                    boolean zF7 = zF6 | go0Var2.f(xk1Var13);
                                    final xk1 xk1Var14 = xk1Var2;
                                    boolean zF8 = zF7 | go0Var2.f(xk1Var14);
                                    final xk1 xk1Var15 = xk1Var3;
                                    boolean zF9 = zF8 | go0Var2.f(xk1Var15);
                                    final xk1 xk1Var16 = xk1Var4;
                                    boolean zF10 = zF9 | go0Var2.f(xk1Var16);
                                    final xk1 xk1Var17 = xk1Var9;
                                    boolean zF11 = zF10 | go0Var2.f(xk1Var17);
                                    final xk1 xk1Var18 = xk1Var10;
                                    boolean zF12 = zF11 | go0Var2.f(xk1Var18);
                                    Object objL15 = go0Var2.L();
                                    if (zF12 || objL15 == nx.a) {
                                        xm0 xm0Var4 = new xm0() { // from class: j0
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // defpackage.xm0
                                            public final Object a() {
                                                Float f4 = f3;
                                                a83 a83Var = a83.a;
                                                if (f4 != null) {
                                                    float fFloatValue = f4.floatValue();
                                                    Integer num3 = num;
                                                    if (num3 != null) {
                                                        int iIntValue2 = num3.intValue();
                                                        Integer num4 = num2;
                                                        if (num4 != null) {
                                                            int iIntValue3 = num4.intValue();
                                                            Long l2 = l;
                                                            if (l2 != null) {
                                                                in0Var2.j(new AIChatConfig(pv2.J0(pv2.I0((String) xk1Var13.getValue()).toString(), '/'), pv2.I0((String) xk1Var14.getValue()).toString(), pv2.I0((String) xk1Var15.getValue()).toString(), pv2.I0((String) xk1Var16.getValue()).toString(), fFloatValue, iIntValue2, iIntValue3, l2.longValue(), (c1) xk1Var17.getValue(), (Set) xk1Var18.getValue()));
                                                            }
                                                        }
                                                    }
                                                }
                                                return a83Var;
                                            }
                                        };
                                        go0Var2.f0(xm0Var4);
                                        objL15 = xm0Var4;
                                    }
                                    se.q(strP5, (xm0) objL15, uh1VarA, z14, 0, go0Var2, 0, 48);
                                } else {
                                    go0Var2.R();
                                }
                                return a83.a;
                            }
                        }, go0Var);
                        final boolean z15 = z13;
                        qp0.d(true, xm0Var, null, strP4, null, kwVarI0, xe1.i0(1192223036, new nn0() { // from class: t0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.nn0
                            public final Object e(Object obj, Object obj2, Object obj3) {
                                m13 m13VarC;
                                px pxVar2 = (px) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((bv) obj).getClass();
                                go0 go0Var2 = (go0) pxVar2;
                                if (go0Var2.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    rh1 rh1Var = rh1.a;
                                    uh1 uh1VarB0 = gf1.b0(te.P(rh1Var, 0.0f, 560.0f, 1), gf1.P(go0Var2));
                                    av avVarA = yu.a(tp0.c, sn.u, go0Var2, 0);
                                    int iHashCode = Long.hashCode(go0Var2.T);
                                    yy1 yy1VarL = go0Var2.l();
                                    uh1 uh1VarM = tl.M(go0Var2, uh1VarB0);
                                    hx.c.getClass();
                                    jy jyVar = gx.b;
                                    go0Var2.Z();
                                    if (go0Var2.S) {
                                        go0Var2.k(jyVar);
                                    } else {
                                        go0Var2.i0();
                                    }
                                    yf3.c(go0Var2, gx.e, avVarA);
                                    yf3.c(go0Var2, gx.d, yy1VarL);
                                    yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
                                    yf3.b(go0Var2, gx.g);
                                    yf3.c(go0Var2, gx.c, uh1VarM);
                                    eu.a(rg3.P(R.string.ai_chat_config_description, go0Var2), null, se.C(go0Var2), 0, false, 0, 0, go0Var2, 0, 1018);
                                    se.b(vi0.f(rh1Var, 14.0f, go0Var2, R.string.ai_chat_provider, go0Var2), go0Var2, 0);
                                    uh1 uh1VarE = fg1.E(rh1Var, 0.0f, 6.0f, 1);
                                    String strP5 = rg3.P(R.string.ai_chat_provider_openai, go0Var2);
                                    tu2 tu2Var = ur1.a;
                                    eu.a(strP5, uh1VarE, new m13(((lp1) go0Var2.j(tu2Var)).e, rg3.D(14), im0.l, 0L, 0, rg3.D(19), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                                    se.b(vi0.f(rh1Var, 10.0f, go0Var2, R.string.ai_chat_base_url, go0Var2), go0Var2, 0);
                                    xk1 xk1Var13 = xk1Var;
                                    String str3 = (String) xk1Var13.getValue();
                                    boolean zF2 = go0Var2.f(xk1Var13);
                                    Object objL15 = go0Var2.L();
                                    eb ebVar2 = nx.a;
                                    if (zF2 || objL15 == ebVar2) {
                                        objL15 = new h0(xk1Var13, 9);
                                        go0Var2.f0(objL15);
                                    }
                                    tp0.b(str3, (in0) objL15, null, rg3.P(R.string.ai_chat_base_url_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(5, 123), null, go0Var2, 0, 384, 12276);
                                    uh1 uh1VarG = fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                                    boolean zS0 = pv2.s0((String) xk1Var13.getValue());
                                    boolean z16 = z15;
                                    String strP6 = rg3.P((zS0 || z16) ? R.string.ai_chat_base_url_description : R.string.ai_chat_base_url_invalid, go0Var2);
                                    if (pv2.s0((String) xk1Var13.getValue()) || z16) {
                                        go0Var2.W(-715470495);
                                        m13VarC = se.C(go0Var2);
                                        go0Var2.p(false);
                                    } else {
                                        go0Var2.W(-715535936);
                                        m13VarC = new m13(((lp1) go0Var2.j(tu2Var)).g, rg3.D(12), im0.k, 0L, 0, rg3.D(17), null, null, 16646136);
                                        go0Var2.p(false);
                                    }
                                    eu.a(strP6, uh1VarG, m13VarC, 0, false, 0, 0, go0Var2, 48, 1016);
                                    se.b(vi0.f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_api_key, go0Var2), go0Var2, 0);
                                    xk1 xk1Var14 = xk1Var2;
                                    String str4 = (String) xk1Var14.getValue();
                                    boolean zF3 = go0Var2.f(xk1Var14);
                                    Object objL16 = go0Var2.L();
                                    if (zF3 || objL16 == ebVar2) {
                                        objL16 = new h0(xk1Var14, 0);
                                        go0Var2.f0(objL16);
                                    }
                                    tp0.b(str4, (in0) objL16, null, rg3.P(R.string.ai_chat_api_key_hint, go0Var2), null, null, false, 0, 0, false, false, new tx1(), null, null, go0Var2, 0, 0, 14324);
                                    eu.a(rg3.P(R.string.ai_chat_api_key_description, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), se.C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    se.b(vi0.f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_model, go0Var2), go0Var2, 0);
                                    xk1 xk1Var15 = xk1Var3;
                                    String str5 = (String) xk1Var15.getValue();
                                    boolean zF4 = go0Var2.f(xk1Var15);
                                    Object objL17 = go0Var2.L();
                                    if (zF4 || objL17 == ebVar2) {
                                        objL17 = new h0(xk1Var15, 1);
                                        go0Var2.f0(objL17);
                                    }
                                    tp0.b(str5, (in0) objL17, null, rg3.P(R.string.ai_chat_model_hint, go0Var2), null, null, false, 0, 0, false, false, null, null, null, go0Var2, 0, 0, 16372);
                                    eu.a(rg3.P(R.string.ai_chat_model_manual_description, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), se.C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    String strP7 = rg3.P(R.string.ai_chat_choose_model, go0Var2);
                                    String strP8 = rg3.P((!z16 || pv2.s0((String) xk1Var14.getValue())) ? R.string.ai_chat_choose_model_unavailable : R.string.ai_chat_choose_model_description, go0Var2);
                                    boolean z17 = z16 && !pv2.s0((String) xk1Var14.getValue());
                                    Object objL18 = go0Var2.L();
                                    if (objL18 == ebVar2) {
                                        objL18 = new f0(xk1Var12, 2);
                                        go0Var2.f0(objL18);
                                    }
                                    qp0.h(strP7, (xm0) objL18, null, strP8, null, null, null, z17, null, go0Var2, 48, 372);
                                    se.b(vi0.f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_system_prompt, go0Var2), go0Var2, 0);
                                    xk1 xk1Var16 = xk1Var4;
                                    String str6 = (String) xk1Var16.getValue();
                                    boolean zF5 = go0Var2.f(xk1Var16);
                                    Object objL19 = go0Var2.L();
                                    if (zF5 || objL19 == ebVar2) {
                                        objL19 = new h0(xk1Var16, 2);
                                        go0Var2.f0(objL19);
                                    }
                                    tp0.b(str6, (in0) objL19, null, rg3.P(R.string.ai_chat_system_prompt_hint, go0Var2), null, null, false, 3, 6, false, false, null, null, null, go0Var2, 114819072, 0, 15924);
                                    eu.a(rg3.P(R.string.ai_chat_system_prompt_description, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), se.C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    se.b(vi0.f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_temperature, go0Var2), go0Var2, 0);
                                    xk1 xk1Var17 = xk1Var5;
                                    String str7 = (String) xk1Var17.getValue();
                                    boolean zF6 = go0Var2.f(xk1Var17);
                                    Object objL20 = go0Var2.L();
                                    if (zF6 || objL20 == ebVar2) {
                                        objL20 = new h0(xk1Var17, 3);
                                        go0Var2.f0(objL20);
                                    }
                                    tp0.b(str7, (in0) objL20, null, rg3.P(R.string.ai_chat_temperature_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(9, 123), null, go0Var2, 0, 384, 12276);
                                    eu.a(rg3.P(R.string.ai_chat_temperature_description, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), se.C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    se.b(vi0.f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_max_tokens, go0Var2), go0Var2, 0);
                                    xk1 xk1Var18 = xk1Var6;
                                    String str8 = (String) xk1Var18.getValue();
                                    boolean zF7 = go0Var2.f(xk1Var18);
                                    Object objL21 = go0Var2.L();
                                    if (zF7 || objL21 == ebVar2) {
                                        objL21 = new h0(xk1Var18, 4);
                                        go0Var2.f0(objL21);
                                    }
                                    tp0.b(str8, (in0) objL21, null, rg3.P(R.string.ai_chat_max_tokens_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                                    eu.a(rg3.P(R.string.ai_chat_max_tokens_description, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), se.C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    se.b(vi0.f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_context_rounds, go0Var2), go0Var2, 0);
                                    xk1 xk1Var19 = xk1Var7;
                                    String str9 = (String) xk1Var19.getValue();
                                    boolean zF8 = go0Var2.f(xk1Var19);
                                    Object objL22 = go0Var2.L();
                                    if (zF8 || objL22 == ebVar2) {
                                        objL22 = new h0(xk1Var19, 5);
                                        go0Var2.f0(objL22);
                                    }
                                    tp0.b(str9, (in0) objL22, null, rg3.P(R.string.ai_chat_context_rounds_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                                    eu.a(rg3.P(R.string.ai_chat_context_rounds_description, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), se.C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    se.b(vi0.f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_reply_delay, go0Var2), go0Var2, 0);
                                    xk1 xk1Var20 = xk1Var8;
                                    String str10 = (String) xk1Var20.getValue();
                                    boolean zF9 = go0Var2.f(xk1Var20);
                                    Object objL23 = go0Var2.L();
                                    if (zF9 || objL23 == ebVar2) {
                                        objL23 = new h0(xk1Var20, 6);
                                        go0Var2.f0(objL23);
                                    }
                                    tp0.b(str10, (in0) objL23, null, rg3.P(R.string.ai_chat_reply_delay_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                                    eu.a(rg3.P(R.string.ai_chat_reply_delay_description, go0Var2), fg1.G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), se.C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    String strF = vi0.f(rh1Var, 8.0f, go0Var2, R.string.ai_chat_list_mode, go0Var2);
                                    xk1 xk1Var21 = xk1Var9;
                                    c1 c1Var = (c1) xk1Var21.getValue();
                                    c1 c1Var2 = c1.j;
                                    String strP9 = rg3.P(c1Var == c1Var2 ? R.string.ai_chat_whitelist_description : R.string.ai_chat_blacklist_description, go0Var2);
                                    yf0 yf0Var = c1.l;
                                    c1 c1Var3 = (c1) xk1Var21.getValue();
                                    boolean zF10 = go0Var2.f(xk1Var21);
                                    Object objL24 = go0Var2.L();
                                    if (zF10 || objL24 == ebVar2) {
                                        objL24 = new h0(xk1Var21, 7);
                                        go0Var2.f0(objL24);
                                    }
                                    in0 in0Var2 = (in0) objL24;
                                    String str11 = strP2;
                                    boolean zF11 = go0Var2.f(str11);
                                    String str12 = strP3;
                                    boolean zF12 = zF11 | go0Var2.f(str12);
                                    Object objL25 = go0Var2.L();
                                    if (zF12 || objL25 == ebVar2) {
                                        objL25 = new g0(0, str11, str12);
                                        go0Var2.f0(objL25);
                                    }
                                    eu.m(strF, yf0Var, c1Var3, in0Var2, null, strP9, (in0) objL25, false, go0Var2, 0);
                                    String strP10 = rg3.P(((c1) xk1Var21.getValue()) == c1Var2 ? R.string.ai_chat_configure_whitelist : R.string.ai_chat_configure_blacklist, go0Var2);
                                    String strQ = rg3.Q(R.string.ai_chat_selected_count, new Object[]{Integer.valueOf(((Set) xk1Var10.getValue()).size())}, go0Var2);
                                    Object objL26 = go0Var2.L();
                                    if (objL26 == ebVar2) {
                                        objL26 = new f0(xk1Var11, 1);
                                        go0Var2.f0(objL26);
                                    }
                                    qp0.h(strP10, (xm0) objL26, null, strQ, null, null, null, false, null, go0Var2, 48, 500);
                                    go0Var2.p(true);
                                } else {
                                    go0Var2.R();
                                }
                                return a83.a;
                            }
                        }, go0Var), go0Var, (i2 & 112) | 1769478, 20);
                        go0Var = go0Var;
                    }
                } else {
                    go0Var.W(-1111407715);
                    String str3 = (String) xk1Var.getValue();
                    String str4 = (String) xk1Var2.getValue();
                    String str5 = (String) xk1Var3.getValue();
                    Object objL15 = go0Var.L();
                    if (objL15 == ebVar) {
                        objL15 = new f0(xk1Var12, 0);
                        go0Var.f0(objL15);
                    }
                    xm0 xm0Var4 = (xm0) objL15;
                    boolean zF2 = go0Var.f(xk1Var3);
                    Object objL16 = go0Var.L();
                    if (zF2 || objL16 == ebVar) {
                        z2 = false;
                        objL16 = new i0(xk1Var3, xk1Var12, 0 == true ? 1 : 0);
                        go0Var.f0(objL16);
                    } else {
                        z2 = false;
                    }
                    d(str3, str4, str5, xm0Var4, (in0) objL16, go0Var, 3072);
                    go0Var.p(z2);
                    b62VarR = go0Var.r();
                    if (b62VarR == null) {
                        return;
                    }
                    final int i5 = 0;
                    final xm0 xm0Var5 = xm0Var2;
                    mn0Var = new mn0() { // from class: p0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i52 = i5;
                            a83 a83Var = a83.a;
                            int i6 = i;
                            in0 in0Var2 = in0Var;
                            xm0 xm0Var42 = xm0Var5;
                            AIChatConfig aIChatConfig2 = aIChatConfig;
                            px pxVar2 = (px) obj;
                            ((Integer) obj2).intValue();
                            switch (i52) {
                                case 0:
                                    se.a(aIChatConfig2, xm0Var42, in0Var2, pxVar2, pp0.N(i6 | 1));
                                    break;
                                case 1:
                                    se.a(aIChatConfig2, xm0Var42, in0Var2, pxVar2, pp0.N(i6 | 1));
                                    break;
                                default:
                                    se.a(aIChatConfig2, xm0Var42, in0Var2, pxVar2, pp0.N(i6 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                }
            } else {
                float fFloatValue = fValueOf.floatValue();
                if ((0.0f <= fFloatValue && fFloatValue <= 2.0f) && numE0 != null) {
                    int iIntValue = numE0.intValue();
                    if ((1 <= iIntValue && iIntValue < 32769) && numE02 != null) {
                        int iIntValue2 = numE02.intValue();
                        if ((iIntValue2 >= 0 && iIntValue2 < 21) && lF0 != null) {
                            long jLongValue = lF0.longValue();
                            if (0 <= jLongValue && jLongValue < 60001) {
                                z = true;
                            }
                            if (((Boolean) xk1Var12.getValue()).booleanValue()) {
                            }
                        }
                    }
                }
            }
            b62VarR.d = mn0Var;
        }
        go0Var.R();
        b62VarR = go0Var.r();
        if (b62VarR != null) {
            final int i6 = 2;
            mn0Var = new mn0() { // from class: p0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int i52 = i6;
                    a83 a83Var = a83.a;
                    int i62 = i;
                    in0 in0Var2 = in0Var;
                    xm0 xm0Var42 = xm0Var;
                    AIChatConfig aIChatConfig2 = aIChatConfig;
                    px pxVar2 = (px) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            se.a(aIChatConfig2, xm0Var42, in0Var2, pxVar2, pp0.N(i62 | 1));
                            break;
                        case 1:
                            se.a(aIChatConfig2, xm0Var42, in0Var2, pxVar2, pp0.N(i62 | 1));
                            break;
                        default:
                            se.a(aIChatConfig2, xm0Var42, in0Var2, pxVar2, pp0.N(i62 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarR.d = mn0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1646797186);
        int i2 = (go0Var.f(str) ? 4 : 2) | i;
        int i3 = 0;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            eu.a(str, fg1.G(rh1.a, 0.0f, 0.0f, 0.0f, 6.0f, 7), new m13(((lp1) go0Var.j(ur1.a)).e, rg3.D(13), im0.l, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, (i2 & 14) | 48, 1016);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(AIModelInfo aIModelInfo, boolean z, xm0 xm0Var, px pxVar, int i) {
        int i2;
        rh1 rh1Var;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1521596899);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.f(aIModelInfo) : go0Var.h(aIModelInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(xm0Var) ? 256 : 128;
        }
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            uh1 uh1VarD = fg1.D(tl.O(te.e, xm0Var), 8.0f, 11.0f);
            ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var, 48);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarD);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            lc lcVar = gx.e;
            yf3.c(go0Var, lcVar, ob2VarA);
            lc lcVar2 = gx.d;
            yf3.c(go0Var, lcVar2, yy1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lc lcVar3 = gx.f;
            yf3.c(go0Var, lcVar3, numValueOf);
            v6 v6Var = gx.g;
            yf3.b(go0Var, v6Var);
            lc lcVar4 = gx.c;
            yf3.c(go0Var, lcVar4, uh1VarM);
            g71 g71Var = new g71(1.0f, true);
            av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
            int iHashCode2 = Long.hashCode(go0Var.T);
            yy1 yy1VarL2 = go0Var.l();
            uh1 uh1VarM2 = tl.M(go0Var, g71Var);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, avVarA);
            yf3.c(go0Var, lcVar2, yy1VarL2);
            vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM2);
            String id = aIModelInfo.getId();
            tu2 tu2Var = ur1.a;
            long j = ((lp1) go0Var.j(tu2Var)).e;
            long jD = rg3.D(14);
            long jD2 = rg3.D(19);
            im0 im0Var = im0.l;
            eu.a(id, null, new m13(j, jD, im0Var, 0L, 0, jD2, null, null, 16646136), 2, false, 1, 0, go0Var, 1597440, 938);
            String ownedBy = aIModelInfo.getOwnedBy();
            rh1 rh1Var2 = rh1.a;
            if (ownedBy == null) {
                go0Var.W(30239819);
                go0Var.p(false);
                rh1Var = rh1Var2;
            } else {
                go0Var.W(30239820);
                rh1Var = rh1Var2;
                eu.a(rg3.Q(R.string.ai_chat_model_owner, new Object[]{ownedBy}, go0Var), fg1.G(rh1Var2, 0.0f, 3.0f, 0.0f, 0.0f, 13), C(go0Var), 2, false, 1, 0, go0Var, 1597488, 936);
                go0Var.p(false);
            }
            go0Var.p(true);
            if (z) {
                go0Var.W(-1375897659);
                rp0.O(go0Var, te.q0(rh1Var, 12.0f));
                eu.a(rg3.P(R.string.ai_chat_model_selected, go0Var), null, new m13(((lp1) go0Var.j(tu2Var)).g, rg3.D(12), im0Var, 0L, 0, rg3.D(17), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1018);
                go0Var.p(false);
            } else {
                go0Var.W(-1375501727);
                go0Var.p(false);
            }
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new r0(aIModelInfo, z, xm0Var, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(String str, String str2, String str3, xm0 xm0Var, in0 in0Var, px pxVar, int i) {
        String ownedBy;
        String str4 = str;
        String str5 = str2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(883131579);
        int i2 = i | (go0Var.f(str4) ? 4 : 2) | (go0Var.f(str5) ? 32 : 16) | (go0Var.f(str3) ? 256 : 128) | (go0Var.h(in0Var) ? 16384 : 8192);
        if (go0Var.O(i2 & 1, (i2 & 9363) != 9362)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u("");
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = new kx1(0);
                go0Var.f0(objL2);
            }
            kx1 kx1Var = (kx1) objL2;
            Object objL3 = go0Var.L();
            if (objL3 == ebVar) {
                objL3 = op0.u(m1.a);
                go0Var.f0(objL3);
            }
            xk1 xk1Var2 = (xk1) objL3;
            Integer numValueOf = Integer.valueOf(kx1Var.g());
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objL4 = go0Var.L();
            if (z || objL4 == ebVar) {
                v0 v0Var = new v0(xk1Var2, str4, str5, str3, (t00) null, 0);
                xk1Var2 = xk1Var2;
                str4 = str4;
                str5 = str5;
                go0Var.f0(v0Var);
                objL4 = v0Var;
            }
            mn0 mn0Var = (mn0) objL4;
            a20 a20Var = go0Var.R;
            boolean zF = go0Var.f(str4) | go0Var.f(str5) | go0Var.f(numValueOf);
            Object objL5 = go0Var.L();
            if (zF || objL5 == ebVar) {
                objL5 = new y51(a20Var, mn0Var);
                go0Var.f0(objL5);
            }
            n1 n1Var = (n1) xk1Var2.getValue();
            l1 l1Var = n1Var instanceof l1 ? (l1) n1Var : null;
            Iterable iterable = l1Var != null ? l1Var.a : null;
            if (iterable == null) {
                iterable = be0.h;
            }
            String string = pv2.I0((String) xk1Var.getValue()).toString();
            boolean zF2 = go0Var.f(iterable) | go0Var.f(string);
            Object objL6 = go0Var.L();
            if (zF2 || objL6 == ebVar) {
                if (!pv2.s0(string)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : iterable) {
                        AIModelInfo aIModelInfo = (AIModelInfo) obj;
                        if (pv2.h0(aIModelInfo.getId(), string, true) || ((ownedBy = aIModelInfo.getOwnedBy()) != null && pv2.h0(ownedBy, string, true))) {
                            arrayList.add(obj);
                        }
                    }
                    iterable = arrayList;
                }
                go0Var.f0(iterable);
                objL6 = iterable;
            }
            qp0.d(true, xm0Var, null, rg3.P(R.string.ai_chat_model_list_title, go0Var), null, xe1.i0(-303307586, new k0(xm0Var, 0), go0Var), xe1.i0(-455465497, new l0((List) objL6, str3, in0Var, xk1Var, xk1Var2, kx1Var, 0), go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ze(str, str2, str3, xm0Var, in0Var, i, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(kw kwVar, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1033667179);
        int i2 = 0;
        if (go0Var.O(i & 1, (i & 3) != 2)) {
            uh1 uh1VarO = te.O(te.e, 220.0f);
            av avVarA = yu.a(tp0.d, sn.v, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarO);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            kwVar.e(bv.a, go0Var, 54);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new o0(kwVar, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(String str, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(780076107);
        int i2 = (go0Var.f(str) ? 4 : 2) | i;
        int i3 = 1;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            eu.a(str, fg1.E(rh1.a, 12.0f, 0.0f, 2), new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(13), null, 0L, 0, rg3.D(18), null, null, 16646140), 0, false, 0, 0, go0Var, (i2 & 14) | 48, 1016);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(in0 in0Var, in0 in0Var2, px pxVar, int i) {
        int i2;
        in0 in0Var3;
        in0 in0Var4;
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1799899728);
        int i3 = 4;
        int i4 = (go0Var.h(in0Var) ? 4 : 2) | i | 16;
        if (go0Var.O(i4 & 1, (i4 & 19) != 18)) {
            go0Var.T();
            int i5 = i & 1;
            eb ebVar = nx.a;
            if (i5 == 0 || go0Var.y()) {
                Object objL = go0Var.L();
                if (objL == ebVar) {
                    objL = new bf(1, null);
                    go0Var.f0(objL);
                }
                in0Var4 = (in0) objL;
            } else {
                go0Var.R();
                in0Var4 = in0Var2;
            }
            go0Var.q();
            Context context = (Context) go0Var.j(r7.b);
            Object[] objArr = new Object[0];
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = new c0(i3);
                go0Var.f0(objL2);
            }
            kx1 kx1Var = (kx1) gf1.M(objArr, (xm0) objL2, go0Var, 48);
            Object objL3 = go0Var.L();
            if (objL3 == ebVar) {
                objL3 = op0.u(cf.a);
                go0Var.f0(objL3);
            }
            xk1 xk1Var = (xk1) objL3;
            Object objL4 = go0Var.L();
            if (objL4 == ebVar) {
                objL4 = op0.u(Boolean.FALSE);
                go0Var.f0(objL4);
            }
            xk1 xk1Var2 = (xk1) objL4;
            Integer numValueOf = Integer.valueOf(kx1Var.g());
            boolean zH = go0Var.h(in0Var4);
            Object objL5 = go0Var.L();
            if (zH || objL5 == ebVar) {
                objL5 = new k9(xk1Var, in0Var4, null);
                go0Var.f0(objL5);
            }
            eu.f(go0Var, (mn0) objL5, numValueOf);
            kw kwVarI0 = xe1.i0(-1461823813, new ze(in0Var, context, kx1Var, xk1Var, xk1Var2), go0Var);
            int i6 = 6;
            ci0.p(kwVarI0, go0Var, 6);
            if (((Boolean) xk1Var2.getValue()).booleanValue()) {
                go0Var.W(1856553731);
                Object objL6 = go0Var.L();
                if (objL6 == ebVar) {
                    objL6 = new f0(xk1Var2, i6);
                    go0Var.f0(objL6);
                }
                xm0 xm0Var = (xm0) objL6;
                String strP = rg3.P(R.string.home_settings_update_open_failed_title, go0Var);
                String strP2 = rg3.P(R.string.home_settings_update_open_failed_message, go0Var);
                String strP3 = rg3.P(R.string.home_settings_ok, go0Var);
                Object objL7 = go0Var.L();
                if (objL7 == ebVar) {
                    objL7 = new f0(xk1Var2, 7);
                    go0Var.f0(objL7);
                }
                i2 = 0;
                in0Var3 = in0Var4;
                qp0.c(xm0Var, strP, strP2, strP3, (xm0) objL7, null, null, null, go0Var, 24582, 224);
                go0Var.p(false);
            } else {
                i2 = 0;
                in0Var3 = in0Var4;
                go0Var.W(1856937170);
                go0Var.p(false);
            }
        } else {
            i2 = 0;
            go0Var.R();
            in0Var3 = in0Var2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new af(i, i2, in0Var, in0Var3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(int i, px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1100896517);
        int i2 = 0;
        if (go0Var.O(i & 1, i != 0)) {
            eu.n(null, rg3.P(R.string.home_settings_update_section, go0Var), ci0.k, go0Var, 384, 1);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ye(i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(jc3 jc3Var, px pxVar, int i) {
        go0 go0Var;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(1609715501);
        int i2 = i | (go0Var2.f(jc3Var) ? 4 : 2);
        if (go0Var2.O(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) go0Var2.j(r7.b);
            rh1 rh1Var = rh1.a;
            uh1 uh1VarG0 = te.g0(rh1Var, 42.0f);
            fb2 fb2Var = gb2.a;
            uh1 uh1VarZ = ci0.z(uh1VarG0, fb2Var);
            tu2 tu2Var = ur1.a;
            uh1 uh1VarN = gf1.n(uh1VarZ, ju.b(0.14f, ((lp1) go0Var2.j(tu2Var)).g), sp0.h);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var2.T);
            yy1 yy1VarL = go0Var2.l();
            uh1 uh1VarM = tl.M(go0Var2, uh1VarN);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var2.Z();
            if (go0Var2.S) {
                go0Var2.k(jyVar);
            } else {
                go0Var2.i0();
            }
            yf3.c(go0Var2, gx.e, nf1VarD);
            yf3.c(go0Var2, gx.d, yy1VarL);
            yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var2, gx.g);
            yf3.c(go0Var2, gx.c, uh1VarM);
            Character chN0 = pv2.n0(pv2.I0(jc3Var.b).toString());
            String strValueOf = chN0 != null ? String.valueOf(Character.toUpperCase(chN0.charValue())) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            go0Var = go0Var2;
            eu.a(strValueOf, null, new m13(((lp1) go0Var2.j(tu2Var)).g, rg3.D(15), im0.m, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 0, 1018);
            if (pv2.s0(jc3Var.c)) {
                go0Var.W(-1220502705);
                go0Var.p(false);
            } else {
                go0Var.W(-1221176676);
                uh1 uh1VarZ2 = ci0.z(te.g0(rh1Var, 42.0f), fb2Var);
                Object objL = go0Var.L();
                eb ebVar = nx.a;
                if (objL == ebVar) {
                    objL = new yb3(9);
                    go0Var.f0(objL);
                }
                in0 in0Var = (in0) objL;
                boolean zH = go0Var.h(context) | ((i2 & 14) == 4);
                Object objL2 = go0Var.L();
                if (zH || objL2 == ebVar) {
                    objL2 = new d62(8, context, jc3Var);
                    go0Var.f0(objL2);
                }
                pp0.b(in0Var, uh1VarZ2, (in0) objL2, go0Var, 6, 0);
                go0Var.p(false);
            }
            go0Var.p(true);
        } else {
            go0Var = go0Var2;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new s9(i, 24, jc3Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(jc3 jc3Var, boolean z, in0 in0Var, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1321112051);
        int i3 = i | (go0Var.f(jc3Var) ? 4 : 2) | (go0Var.g(z) ? 32 : 16) | (go0Var.h(in0Var) ? 256 : 128);
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            yi0 yi0Var = te.e;
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objL = go0Var.L();
            if (z2 || objL == nx.a) {
                objL = new qh(6, in0Var, z);
                go0Var.f0(objL);
            }
            uh1 uh1VarD = fg1.D(tl.O(yi0Var, (xm0) objL), 6.0f, 10.0f);
            ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var, 48);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarD);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            lc lcVar = gx.e;
            yf3.c(go0Var, lcVar, ob2VarA);
            lc lcVar2 = gx.d;
            yf3.c(go0Var, lcVar2, yy1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lc lcVar3 = gx.f;
            yf3.c(go0Var, lcVar3, numValueOf);
            v6 v6Var = gx.g;
            yf3.b(go0Var, v6Var);
            lc lcVar4 = gx.c;
            yf3.c(go0Var, lcVar4, uh1VarM);
            i(jc3Var, go0Var, i3 & 14);
            rh1 rh1Var = rh1.a;
            rp0.O(go0Var, te.q0(rh1Var, 12.0f));
            g71 g71Var = new g71(1.0f, true);
            av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
            int iHashCode2 = Long.hashCode(go0Var.T);
            yy1 yy1VarL2 = go0Var.l();
            uh1 uh1VarM2 = tl.M(go0Var, g71Var);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, avVarA);
            yf3.c(go0Var, lcVar2, yy1VarL2);
            vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM2);
            String str = jc3Var.b;
            tu2 tu2Var = ur1.a;
            eu.a(str, null, new m13(((lp1) go0Var.j(tu2Var)).e, rg3.D(14), im0.l, 0L, 0, rg3.D(19), null, null, 16646136), 2, false, 1, 0, go0Var, 1597440, 938);
            int iOrdinal = jc3Var.d.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string.wechat_contact_selector_friend;
            } else if (iOrdinal == 1) {
                i2 = R.string.wechat_contact_selector_group;
            } else {
                if (iOrdinal != 2) {
                    c80.s();
                    return;
                }
                i2 = R.string.wechat_contact_selector_official_account;
            }
            eu.a(rg3.P(i2, go0Var) + " · " + jc3Var.a, null, new m13(((lp1) go0Var.j(tu2Var)).f, rg3.D(11), null, 0L, 0, rg3.D(16), null, null, 16646140), 2, false, 1, 0, go0Var, 1597440, 938);
            go0Var.p(true);
            rp0.O(go0Var, te.q0(rh1Var, 10.0f));
            te.g(z, in0Var, null, false, go0Var, (i3 >> 3) & 126);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new rh(jc3Var, z, in0Var, i, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(kw kwVar, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1636497897);
        if (go0Var.O(i & 1, (i & 3) != 2)) {
            uh1 uh1VarO = te.O(te.e, 220.0f);
            av avVarA = yu.a(tp0.d, sn.v, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarO);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            kwVar.e(bv.a, go0Var, 54);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new o0(kwVar, i, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(String str, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1075828327);
        int i2 = (go0Var.f(str) ? 4 : 2) | i;
        int i3 = 13;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            eu.a(str, null, new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(13), null, 0L, 0, rg3.D(18), null, null, 16646140), 0, false, 0, 0, go0Var, i2 & 14, 1018);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final i70 m(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        dm0 dm0VarA = em0.a(f2);
        if (dm0VarA == null) {
            dm0VarA = new ab1(f2);
        }
        return new i70(f3, f2, dm0VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(xm0 xm0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(465591258);
        int i2 = (go0Var.h(xm0Var) ? 4 : 2) | i;
        byte b2 = 0;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            eu.n(null, rg3.P(R.string.home_settings_update_section, go0Var), xe1.i0(237150491, new we(xm0Var, b2, b2), go0Var), go0Var, 384, 1);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new we(xm0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static v31 o(in0 in0Var) {
        t21 t21Var = u21.d;
        t21Var.getClass();
        d31 d31Var = new d31();
        f31 f31Var = t21Var.a;
        d31Var.a = f31Var.c;
        d31Var.b = f31Var.a;
        d31Var.c = f31Var.b;
        String str = f31Var.d;
        d31Var.d = str;
        d31Var.e = f31Var.e;
        d31Var.f = f31Var.g;
        d31Var.g = f31Var.f;
        d31Var.h = t21Var.b;
        d31Var.i = f31Var.h;
        in0Var.j(d31Var);
        if (d31Var.c) {
            if (!t11.l(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        s.c("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!t11.l(str, "    ")) {
            s.j("Indent should not be specified when default printing mode is used");
            return null;
        }
        f31 f31Var2 = new f31(d31Var.b, d31Var.c, d31Var.a, d31Var.d, d31Var.e, d31Var.g, d31Var.f, d31Var.i);
        i51 i51Var = d31Var.h;
        i51Var.getClass();
        return new v31(f31Var2, i51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(final uh1 uh1Var, final boolean z, final xm0 xm0Var, boolean z2, final int i, final kw kwVar, px pxVar, final int i2, final int i3) {
        int i4;
        boolean z3;
        b62 b62VarR;
        long jB;
        go0 go0Var = (go0) pxVar;
        go0Var.X(271232923);
        if ((i2 & 6) == 0) {
            i4 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go0Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= go0Var.h(xm0Var) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                z3 = z2;
                i4 |= go0Var.g(z3) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i4 |= go0Var.f(null) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i4 |= go0Var.d(i) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i4 |= go0Var.h(kwVar) ? 1048576 : 524288;
            }
            int i6 = 0;
            if (go0Var.O(i4 & 1, (599187 & i4) == 599186)) {
                go0Var.R();
            } else {
                go0Var.T();
                if ((i2 & 1) != 0 && !go0Var.y()) {
                    go0Var.R();
                } else if (i5 != 0) {
                    z3 = false;
                }
                go0Var.q();
                kr1 kr1Var = new kr1(11.0f);
                if (z3) {
                    go0Var.W(1466890964);
                    jB = ju.b(z ? 0.3f : 0.08f, ((lp1) go0Var.j(ur1.a)).g);
                    go0Var.p(false);
                } else {
                    go0Var.W(1466983189);
                    if (((lp1) go0Var.j(ur1.a)).a) {
                        jB = ju.b(z ? 0.06f : 0.02f, ju.b);
                    } else {
                        jB = ju.b(z ? 0.06f : 0.02f, ju.c);
                    }
                    go0Var.p(false);
                }
                uh1Var.getClass();
                xm0Var.getClass();
                uh1 uh1VarD = fg1.D(gf1.n(ci0.z(tl.s(uh1Var, new hp1(i, new gp1(xm0Var, i6), z)), kr1Var), jB, sp0.h), 17.0f, 11.0f);
                nf1 nf1VarD = dm.d(sn.n, false);
                int iHashCode = Long.hashCode(go0Var.T);
                yy1 yy1VarL = go0Var.l();
                uh1 uh1VarM = tl.M(go0Var, uh1VarD);
                hx.c.getClass();
                jy jyVar = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                    go0Var.k(jyVar);
                } else {
                    go0Var.i0();
                }
                yf3.c(go0Var, gx.e, nf1VarD);
                yf3.c(go0Var, gx.d, yy1VarL);
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM);
                kwVar.g(go0Var, Integer.valueOf((i4 >> 18) & 14));
                go0Var.p(true);
            }
            final boolean z4 = z3;
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                b62VarR.d = new mn0() { // from class: to1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.mn0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        se.p(uh1Var, z, xm0Var, z4, i, kwVar, (px) obj, pp0.N(i2 | 1), i3);
                        return a83.a;
                    }
                };
                return;
            }
            return;
        }
        i4 |= 3072;
        z3 = z2;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        int i62 = 0;
        if (go0Var.O(i4 & 1, (599187 & i4) == 599186)) {
        }
        final boolean z42 = z3;
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(final String str, final xm0 xm0Var, final uh1 uh1Var, boolean z, int i, px pxVar, final int i2, final int i3) {
        int i4;
        final boolean z2;
        final int i5;
        boolean z3;
        int i6;
        int i7;
        str.getClass();
        xm0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1938994224);
        int i8 = i2 | (go0Var.f(str) ? 4 : 2) | (go0Var.h(xm0Var) ? 32 : 16) | (go0Var.f(uh1Var) ? 256 : 128);
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 = i8 | 3072;
        } else {
            i4 = i8 | (go0Var.g(z) ? 2048 : 1024);
        }
        int i10 = i4 | 90112;
        int i11 = 1;
        if (go0Var.O(i10 & 1, (74899 & i10) != 74898)) {
            go0Var.T();
            if ((i2 & 1) == 0 || go0Var.y()) {
                z3 = i9 != 0 ? true : z;
                i6 = i10 & (-458753);
                i7 = 1;
            } else {
                go0Var.R();
                i6 = i10 & (-458753);
                z3 = z;
                i7 = i;
            }
            go0Var.q();
            int i12 = i6 >> 6;
            boolean z4 = z3;
            p(uh1Var, z4, xm0Var, true, i7, xe1.i0(-780053401, new qo1(i11, str, z3), go0Var), go0Var, ((i6 << 3) & 896) | (i12 & 112) | (i12 & 14) | 1575936 | 24576, 0);
            z2 = z4;
            i5 = i7;
        } else {
            go0Var.R();
            z2 = z;
            i5 = i;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(str, xm0Var, uh1Var, z2, i5, i2, i3) { // from class: so1
                public final /* synthetic */ String h;
                public final /* synthetic */ xm0 i;
                public final /* synthetic */ uh1 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ int l;
                public final /* synthetic */ int m;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.m = i3;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(1);
                    se.q(this.h, this.i, this.j, this.k, this.l, (px) obj, iN, this.m);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final String str, final xm0 xm0Var, uh1 uh1Var, boolean z, int i, px pxVar, final int i2, final int i3) {
        int i4;
        final uh1 uh1Var2;
        int i5;
        boolean z2;
        int i6;
        final boolean z3;
        final int i7;
        b62 b62VarR;
        uh1 uh1Var3;
        int i8;
        str.getClass();
        xm0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(2140635699);
        if ((i2 & 6) == 0) {
            i4 = (go0Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                uh1Var2 = uh1Var;
                i4 |= go0Var.f(uh1Var2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    z2 = z;
                    i4 |= go0Var.g(z2) ? 2048 : 1024;
                }
                i6 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    i6 = 90112 | i4;
                }
                int i10 = 0;
                int i11 = 1;
                if (go0Var.O(i6 & 1, (74899 & i6) != 74898)) {
                    go0Var.T();
                    if ((i2 & 1) == 0 || go0Var.y()) {
                        uh1 uh1Var4 = i9 != 0 ? rh1.a : uh1Var2;
                        if (i5 != 0) {
                            z2 = true;
                        }
                        int i12 = i6 & (-458753);
                        uh1Var3 = uh1Var4;
                        i8 = i12;
                    } else {
                        go0Var.R();
                        i8 = i6 & (-458753);
                        i11 = i;
                        uh1Var3 = uh1Var2;
                    }
                    boolean z4 = z2;
                    go0Var.q();
                    int i13 = i8 >> 6;
                    p(uh1Var3, z4, xm0Var, false, i11, xe1.i0(242402442, new qo1(i10, str, z4), go0Var), go0Var, (i13 & 112) | (i13 & 14) | 1572864 | ((i8 << 3) & 896) | (i8 & 57344), 8);
                    uh1Var2 = uh1Var3;
                    z3 = z4;
                    i7 = i11;
                } else {
                    go0Var.R();
                    z3 = z2;
                    i7 = i;
                }
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                    b62VarR.d = new mn0() { // from class: ro1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            se.r(str, xm0Var, uh1Var2, z3, i7, (px) obj, pp0.N(i2 | 1), i3);
                            return a83.a;
                        }
                    };
                    return;
                }
                return;
            }
            i4 |= 3072;
            z2 = z;
            i6 = i4 | 24576;
            if ((196608 & i2) == 0) {
            }
            int i102 = 0;
            int i112 = 1;
            if (go0Var.O(i6 & 1, (74899 & i6) != 74898)) {
            }
            b62VarR = go0Var.r();
            if (b62VarR != null) {
            }
        }
        uh1Var2 = uh1Var;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i4 | 24576;
        if ((196608 & i2) == 0) {
        }
        int i1022 = 0;
        int i1122 = 1;
        if (go0Var.O(i6 & 1, (74899 & i6) != 74898)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void s(t81 t81Var, Object obj, int i, Object obj2, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1439843069);
        int i3 = (go0Var.f(t81Var) ? 4 : 2) | i2 | (go0Var.f(obj) ? 32 : 16) | (go0Var.d(i) ? 256 : 128) | (go0Var.f(obj2) ? 2048 : 1024);
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            ((cc2) obj).e(obj2, xe1.i0(980966366, new a81(i, t81Var, obj2), go0Var), go0Var, 48);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(t81Var, obj, i, obj2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void t(final mt mtVar, final in0 in0Var, final xm0 xm0Var, px pxVar, final int i) {
        int i2;
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1000435833);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.f(mtVar) : go0Var.h(mtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.h(in0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(xm0Var) ? 256 : 128;
        }
        byte b2 = 0;
        if (!go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            i3 = i;
            go0Var.R();
        } else {
            if (!mtVar.n()) {
                go0Var.W(1206003686);
                eu.n(null, rg3.P(R.string.home_settings_update_section, go0Var), xe1.i0(-19332289, new we(xm0Var, i4, b2), go0Var), go0Var, 384, 1);
                go0Var.p(false);
                b62 b62VarR = go0Var.r();
                if (b62VarR != null) {
                    final int i5 = 0;
                    b62VarR.d = new mn0() { // from class: xe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i6 = i5;
                            a83 a83Var = a83.a;
                            int i7 = i;
                            xm0 xm0Var2 = xm0Var;
                            in0 in0Var2 = in0Var;
                            mt mtVar2 = mtVar;
                            px pxVar2 = (px) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    se.t(mtVar2, in0Var2, xm0Var2, pxVar2, pp0.N(i7 | 1));
                                    break;
                                default:
                                    se.t(mtVar2, in0Var2, xm0Var2, pxVar2, pp0.N(i7 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    return;
                }
                return;
            }
            i3 = i;
            go0Var.W(1206652361);
            go0Var.p(false);
            eu.n(null, rg3.P(R.string.home_settings_update_available, go0Var), xe1.i0(-1640290950, new tt0(mtVar, in0Var, xm0Var), go0Var), go0Var, 384, 1);
        }
        b62 b62VarR2 = go0Var.r();
        if (b62VarR2 != null) {
            final int i6 = 1;
            final int i7 = i3;
            b62VarR2.d = new mn0() { // from class: xe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int i62 = i6;
                    a83 a83Var = a83.a;
                    int i72 = i7;
                    xm0 xm0Var2 = xm0Var;
                    in0 in0Var2 = in0Var;
                    mt mtVar2 = mtVar;
                    px pxVar2 = (px) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            se.t(mtVar2, in0Var2, xm0Var2, pxVar2, pp0.N(i72 | 1));
                            break;
                        default:
                            se.t(mtVar2, in0Var2, xm0Var2, pxVar2, pp0.N(i72 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(String str, Set set, boolean z, final xm0 xm0Var, final in0 in0Var, px pxVar, int i) {
        int i2;
        int i3;
        xk1 xk1Var;
        str.getClass();
        set.getClass();
        xm0Var.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(2129268193);
        int i4 = i | (go0Var.f(str) ? 4 : 2) | (go0Var.f(set) ? 32 : 16) | (go0Var.h(in0Var) ? 16384 : 8192);
        if (go0Var.O(i4 & 1, (i4 & 9363) != 9362)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u("");
                go0Var.f0(objL);
            }
            xk1 xk1Var2 = (xk1) objL;
            boolean z2 = (i4 & 112) == 32;
            Object objL2 = go0Var.L();
            if (z2 || objL2 == ebVar) {
                objL2 = op0.u(set);
                go0Var.f0(objL2);
            }
            final xk1 xk1Var3 = (xk1) objL2;
            Object objL3 = go0Var.L();
            if (objL3 == ebVar) {
                objL3 = new kx1(0);
                go0Var.f0(objL3);
            }
            kx1 kx1Var = (kx1) objL3;
            Object objL4 = go0Var.L();
            if (objL4 == ebVar) {
                objL4 = op0.u(mc3.a);
                go0Var.f0(objL4);
            }
            final xk1 xk1Var4 = (xk1) objL4;
            Integer numValueOf = Integer.valueOf(kx1Var.g());
            Boolean boolValueOf = Boolean.valueOf(z);
            Object objL5 = go0Var.L();
            if (objL5 == ebVar) {
                i2 = i4;
                objL5 = new qc3(xk1Var4, z, null);
                go0Var.f0(objL5);
            } else {
                i2 = i4;
            }
            eu.g(numValueOf, boolValueOf, (mn0) objL5, go0Var);
            nc3 nc3Var = (nc3) xk1Var4.getValue();
            lc3 lc3Var = nc3Var instanceof lc3 ? (lc3) nc3Var : null;
            Iterable iterable = lc3Var != null ? lc3Var.a : null;
            if (iterable == null) {
                iterable = be0.h;
            }
            boolean zF = go0Var.f(iterable);
            Object objL6 = go0Var.L();
            Object obj = objL6;
            if (zF || objL6 == ebVar) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((jc3) it.next()).a);
                }
                go0Var.f0(linkedHashSet);
                obj = linkedHashSet;
            }
            final Set set2 = (Set) obj;
            Set set3 = (Set) xk1Var3.getValue();
            if ((set3 instanceof Collection) && set3.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it2 = set3.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    if (set2.contains((String) it2.next()) && (i5 = i5 + 1) < 0) {
                        eu.Z();
                        throw null;
                    }
                }
                i3 = i5;
            }
            String string = pv2.I0((String) xk1Var2.getValue()).toString();
            boolean zF2 = go0Var.f(iterable) | go0Var.f(string);
            Object objL7 = go0Var.L();
            if (zF2 || objL7 == ebVar) {
                if (!pv2.s0(string)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        jc3 jc3Var = (jc3) obj2;
                        xk1 xk1Var5 = xk1Var2;
                        if (pv2.h0(jc3Var.b, string, true) || pv2.h0(jc3Var.a, string, true)) {
                            arrayList.add(obj2);
                        }
                        xk1Var2 = xk1Var5;
                    }
                    iterable = arrayList;
                }
                xk1Var = xk1Var2;
                go0Var.f0(iterable);
                objL7 = iterable;
            } else {
                xk1Var = xk1Var2;
            }
            final int i6 = i3;
            qp0.d(true, xm0Var, null, str, null, xe1.i0(-338228546, new nn0() { // from class: oc3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.nn0
                public final Object e(Object obj3, Object obj4, Object obj5) {
                    pb2 pb2Var = (pb2) obj3;
                    px pxVar2 = (px) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    pb2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((go0) pxVar2).f(pb2Var) ? 4 : 2;
                    }
                    go0 go0Var2 = (go0) pxVar2;
                    if (go0Var2.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                        se.r(rg3.P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.a(pb2Var), false, 0, go0Var2, 0, 56);
                        String strQ = rg3.Q(R.string.wechat_contact_selector_confirm_count, new Object[]{Integer.valueOf(i6)}, go0Var2);
                        boolean z3 = ((nc3) xk1Var4.getValue()) instanceof lc3;
                        uh1 uh1VarA = pb2.a(pb2Var);
                        in0 in0Var2 = in0Var;
                        boolean zF3 = go0Var2.f(in0Var2);
                        xk1 xk1Var6 = xk1Var3;
                        boolean zF4 = zF3 | go0Var2.f(xk1Var6);
                        Set set4 = set2;
                        boolean zH = zF4 | go0Var2.h(set4);
                        Object objL8 = go0Var2.L();
                        if (zH || objL8 == nx.a) {
                            objL8 = new s1(in0Var2, set4, xk1Var6, 17);
                            go0Var2.f0(objL8);
                        }
                        se.q(strQ, (xm0) objL8, uh1VarA, z3, 0, go0Var2, 0, 48);
                    } else {
                        go0Var2.R();
                    }
                    return a83.a;
                }
            }, go0Var), xe1.i0(-1537231819, new jh((List) objL7, xk1Var3, xk1Var, xk1Var4, kx1Var, 2), go0Var), go0Var, 1769526 | ((i2 << 9) & 7168), 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new qp1(str, set, z, xm0Var, in0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean v(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return ((Boolean) c.get()).booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean w(gb0 gb0Var, long j) {
        if (!gb0Var.h.u) {
            return false;
        }
        qz0 qz0Var = (qz0) sp0.c0(gb0Var).M.d;
        if (!qz0Var.Y.u) {
            return false;
        }
        long jM = qz0Var.M(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM & 4294967295L));
        long j2 = gb0Var.x;
        float f2 = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void x(yj1 yj1Var, int i) {
        if (yj1Var.b == 0 || !(yj1Var.c(0) == i || yj1Var.c(yj1Var.b - 1) == i)) {
            int i2 = yj1Var.b;
            yj1Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = yj1Var.c(i3);
                if (i <= iC) {
                    break;
                }
                yj1Var.e(i2, iC);
                i2 = i3;
            }
            yj1Var.e(i2, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(StringBuilder sb, Object obj, in0 in0Var) {
        if (in0Var != null) {
            sb.append((CharSequence) in0Var.j(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void z(long j, fn fnVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            s.j("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((no) arrayList4.get(i8)).a() < i7) {
                s.j("Failed requirement.");
                return;
            }
        }
        no noVar = (no) arrayList.get(i2);
        no noVar2 = (no) arrayList4.get(i3 - 1);
        if (i7 == noVar.a()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            no noVar3 = (no) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            noVar = noVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (noVar.d(i7) == noVar2.d(i7)) {
            int iMin = Math.min(noVar.a(), noVar2.a());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && noVar.d(i11) == noVar2.d(i11); i11++) {
                i10++;
            }
            long j3 = (fnVar.i / 4) + j + 2 + ((long) i10) + 1;
            fnVar.H(-i10);
            fnVar.H(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                fnVar.H(noVar.d(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((no) arrayList4.get(i4)).a()) {
                    fnVar.H(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    s.l("Check failed.");
                    return;
                }
            }
            fn fnVar2 = new fn();
            fnVar.H(((int) ((fnVar2.i / 4) + j3)) * (-1));
            z(j3, fnVar2, i12, arrayList4, i4, i3, arrayList5);
            fnVar.D(fnVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((no) arrayList4.get(i14 - 1)).d(i7) != ((no) arrayList4.get(i14)).d(i7)) {
                i13++;
            }
        }
        long j4 = (fnVar.i / 4) + j + 2 + ((long) (i13 * 2));
        fnVar.H(i13);
        fnVar.H(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iD = ((no) arrayList4.get(i15)).d(i7);
            if (i15 == i4 || iD != ((no) arrayList4.get(i15 - 1)).d(i7)) {
                fnVar.H(iD & 255);
            }
        }
        fn fnVar3 = new fn();
        int i16 = i4;
        while (i16 < i3) {
            byte bD = ((no) arrayList4.get(i16)).d(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bD != ((no) arrayList4.get(i18)).d(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((no) arrayList4.get(i16)).a()) {
                fnVar.H(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                fnVar.H(((int) ((fnVar3.i / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                z(j2, fnVar3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        fnVar.D(fnVar3);
    }
}
