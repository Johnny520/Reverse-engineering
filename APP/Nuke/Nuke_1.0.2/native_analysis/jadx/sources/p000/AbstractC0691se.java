package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.module.wechat.p002ai.AIModelInfo;
import nuke.module.wechat.p002ai.C0516a;
import nuke.module.wechat.p002ai.C0517b;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: se */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0691se {

    /* JADX INFO: renamed from: a */
    public static final C0552oq f10068a = new C0552oq();

    /* JADX INFO: renamed from: b */
    public static final sl0 f10069b = new sl0(10);

    /* JADX INFO: renamed from: c */
    public static final af0 f10070c = new af0(new c80(6));

    /* JADX INFO: renamed from: d */
    public static final StackTraceElement[] f10071d = new StackTraceElement[0];

    /* JADX INFO: renamed from: e */
    public static final long[] f10072e = new long[0];

    /* JADX INFO: renamed from: f */
    public static sx0 f10073f;

    /* JADX INFO: renamed from: g */
    public static sx0 f10074g;

    /* JADX INFO: renamed from: A */
    public static Handler m4812A(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return s90.m4771a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: B */
    public static ji0 m4813B(DexKitBridge dexKitBridge, C0599q c0599q) {
        dexKitBridge.getClass();
        int iM3661b = c0599q.m3661b(4);
        int i = iM3661b != 0 ? c0599q.f7869b.getInt(iM3661b + c0599q.f7868a) : 0;
        int iM3661b2 = c0599q.m3661b(6);
        int i2 = iM3661b2 != 0 ? c0599q.f7869b.getInt(iM3661b2 + c0599q.f7868a) : 0;
        int iM3661b3 = c0599q.m3661b(8);
        int i3 = iM3661b3 != 0 ? c0599q.f7869b.getInt(iM3661b3 + c0599q.f7868a) : 0;
        int iM3661b4 = c0599q.m3661b(10);
        int i4 = iM3661b4 != 0 ? c0599q.f7869b.getInt(iM3661b4 + c0599q.f7868a) : 0;
        int iM3661b5 = c0599q.m3661b(12);
        String strM3663d = iM3661b5 != 0 ? c0599q.m3663d(iM3661b5 + c0599q.f7868a) : null;
        strM3663d.getClass();
        int iM3661b6 = c0599q.m3661b(14);
        return new ji0(dexKitBridge, i, i2, i3, i4, strM3663d, iM3661b6 != 0 ? c0599q.f7869b.getInt(iM3661b6 + c0599q.f7868a) : 0);
    }

    /* JADX INFO: renamed from: C */
    public static final m13 m4814C(InterfaceC0596px interfaceC0596px) {
        return new m13(((lp1) ((go0) interfaceC0596px).m1988j(ur1.f11452a)).f6238f, rg3.m4450D(12), null, 0L, 0, rg3.m4450D(17), null, null, 16646140);
    }

    /* JADX INFO: renamed from: D */
    public static final w41 m4815D(w41 w41Var) {
        w41Var.getClass();
        return w41Var.mo168e().mo363h() ? w41Var : new zr1(w41Var);
    }

    /* JADX INFO: renamed from: E */
    public static int m4816E(List list, InputStream inputStream, td1 td1Var) throws IOException {
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
                int iMo2754b = ((kx0) list.get(i)).mo2754b(inputStream, td1Var);
                if (iMo2754b != -1) {
                    return iMo2754b;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: F */
    public static String m4817F(ClassLoader classLoader, Class cls) {
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

    /* JADX INFO: renamed from: G */
    public static final mb2 m4818G(if1 if1Var) {
        Object objMo2342i = if1Var.mo2342i();
        if (objMo2342i instanceof mb2) {
            return (mb2) objMo2342i;
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static final sx0 m4819H() {
        sx0 sx0Var = f10074g;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = s93.f9998a;
        ft2 ft2Var = new ft2(C0363ju.f5212b);
        ye0 ye0Var = new ye0(3);
        ye0Var.m6259k(15.5f, 14.0f);
        ye0Var.m6256h(-0.79f);
        ye0Var.m6258j(-0.28f, -0.27f);
        ye0Var.m6252d(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        ye0Var.m6252d(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        ye0Var.m6260l(3.0f, 5.91f, 3.0f, 9.5f);
        ye0Var.m6260l(5.91f, 16.0f, 9.5f, 16.0f);
        ye0Var.m6253e(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        ye0Var.m6258j(0.27f, 0.28f);
        ye0Var.m6263o(0.79f);
        ye0Var.m6258j(5.0f, 4.99f);
        ye0Var.m6257i(20.49f, 19.0f);
        ye0Var.m6258j(-4.99f, -5.0f);
        ye0Var.m6251c();
        ye0Var.m6259k(9.5f, 14.0f);
        ye0Var.m6252d(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        ye0Var.m6260l(7.01f, 5.0f, 9.5f, 5.0f);
        ye0Var.m6260l(14.0f, 7.01f, 14.0f, 9.5f);
        ye0Var.m6260l(11.99f, 14.0f, 9.5f, 14.0f);
        ye0Var.m6251c();
        rx0.m4624a(rx0Var, ye0Var.f13428a, ft2Var);
        sx0 sx0VarM4625b = rx0Var.m4625b();
        f10074g = sx0VarM4625b;
        return sx0VarM4625b;
    }

    /* JADX INFO: renamed from: I */
    public static ImageHeaderParser$ImageType m4820I(List list, InputStream inputStream, td1 td1Var) throws IOException {
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
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2758f = ((kx0) list.get(i)).mo2758f(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo2758f != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2758f;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: J */
    public static ImageHeaderParser$ImageType m4821J(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2753a = ((kx0) list.get(i)).mo2753a(byteBuffer);
                AtomicReference atomicReference = AbstractC0431lo.f6225a;
                if (imageHeaderParser$ImageTypeMo2753a != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2753a;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC0431lo.f6225a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: K */
    public static final float m4822K(mb2 mb2Var) {
        if (mb2Var != null) {
            return mb2Var.f6551a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: L */
    public static File[] m4823L(String str) {
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

    /* JADX INFO: renamed from: M */
    public static final void m4824M(a20 a20Var, Throwable th) {
        if (th instanceof j90) {
            th = ((j90) th).f4923h;
        }
        try {
            d20 d20Var = (d20) a20Var.mo15o(gd3.f3439q);
            if (d20Var != null) {
                d20Var.mo490p(a20Var, th);
            } else {
                AbstractC0570p7.m3787w(a20Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                fg1.m1638m(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0570p7.m3787w(a20Var, th);
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m4825N(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: O */
    public static final uh1 m4826O(uh1 uh1Var, C0416l9 c0416l9, t91 t91Var, b03 b03Var) {
        return uh1Var.mo4491c(new l91(c0416l9, t91Var, b03Var));
    }

    /* JADX INFO: renamed from: P */
    public static List m4827P(tr2 tr2Var, int i, tr2 tr2Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iM5429u = tr2Var.m5429u(i);
        int i4 = i + iM5429u;
        int iM5415f = tr2Var.m5415f(i);
        int iM5415f2 = tr2Var.m5415f(i4);
        int i5 = iM5415f2 - iM5415f;
        boolean z5 = i >= 0 && (tr2Var.f10914b[(tr2Var.m5426r(i) * 5) + 1] & 201326592) != 0;
        tr2Var2.m5431w(iM5429u);
        tr2Var2.m5432x(i5, tr2Var2.f10932t);
        if (tr2Var.f10919g < i4) {
            tr2Var.m5390B(i4);
        }
        if (tr2Var.f10923k < iM5415f2) {
            tr2Var.m5391C(iM5415f2, i4);
        }
        int[] iArr = tr2Var2.f10914b;
        int i6 = tr2Var2.f10932t;
        int i7 = i6 * 5;
        AbstractC0460mg.m3086a0(tr2Var.f10914b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = tr2Var2.f10915c;
        int i8 = tr2Var2.f10921i;
        System.arraycopy(tr2Var.f10915c, iM5415f, objArr, i8, i5);
        int i9 = tr2Var2.f10934v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iM5429u;
        int iM5416g = i8 - tr2Var2.m5416g(iArr, i6);
        int i12 = tr2Var2.f10925m;
        int i13 = tr2Var2.f10924l;
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
            int iM5416g2 = tr2Var2.m5416g(iArr, i15) + iM5416g;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = tr2Var2.f10923k;
            }
            iArr2[(i15 * 5) + 4] = tr2.m5387i(iM5416g2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        tr2Var2.f10925m = i14;
        int iM4989a = sr2.m4989a(tr2Var.f10916d, i, tr2Var.m5424p());
        int iM4989a2 = sr2.m4989a(tr2Var.f10916d, i4, tr2Var.m5424p());
        if (iM4989a < iM4989a2) {
            ArrayList arrayList = tr2Var.f10916d;
            ArrayList arrayList2 = new ArrayList(iM4989a2 - iM4989a);
            for (int i17 = iM4989a; i17 < iM4989a2; i17++) {
                ao0 ao0Var = (ao0) arrayList.get(i17);
                ao0Var.f313a += i10;
                arrayList2.add(ao0Var);
            }
            tr2Var2.f10916d.addAll(sr2.m4989a(tr2Var2.f10916d, tr2Var2.f10932t, tr2Var2.m5424p()), arrayList2);
            arrayList.subList(iM4989a, iM4989a2).clear();
            list = arrayList2;
        } else {
            list = be0.f819h;
        }
        if (!list.isEmpty()) {
            HashMap map = tr2Var.f10917e;
            HashMap map2 = tr2Var2.f10917e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = tr2Var2.f10934v;
        tr2Var2.m5403O(i9);
        int iM5393E = tr2Var.m5393E(tr2Var.f10914b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iM5393E >= 0;
            if (z7) {
                tr2Var.m5404P();
                tr2Var.m5410a(iM5393E - tr2Var.f10932t);
                tr2Var.m5404P();
            }
            tr2Var.m5410a(i - tr2Var.f10932t);
            boolean zM5396H = tr2Var.m5396H();
            if (z7) {
                tr2Var.m5401M();
                tr2Var.m5418j();
                tr2Var.m5401M();
                tr2Var.m5418j();
            }
            z4 = zM5396H;
        } else {
            boolean zM5397I = tr2Var.m5397I(i, iM5429u);
            tr2Var.m5398J(iM5415f, i5, i - 1);
            z4 = zM5397I;
        }
        if (z4) {
            AbstractC0752tx.m5443a("Unexpectedly removed anchors");
        }
        int i20 = tr2Var2.f10927o;
        int i21 = iArr3[i7 + 1];
        tr2Var2.f10927o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            tr2Var2.f10932t = i11;
            tr2Var2.f10921i = i8 + i5;
        }
        if (z6) {
            tr2Var2.m5408T(i9);
        }
        return list;
    }

    /* JADX INFO: renamed from: Q */
    public static final int m4828Q(yj1 yj1Var) {
        int iM6283c;
        int i = yj1Var.f13491b;
        int iM6283c2 = yj1Var.m6283c(0);
        while (yj1Var.f13491b != 0 && yj1Var.m6283c(0) == iM6283c2) {
            int i2 = yj1Var.f13491b;
            if (i2 == 0) {
                um2.m5519i("IntList is empty.");
                return 0;
            }
            yj1Var.m6285e(0, yj1Var.f13490a[i2 - 1]);
            yj1Var.m6284d(yj1Var.f13491b - 1);
            int i3 = yj1Var.f13491b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iM6283c3 = yj1Var.m6283c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iM6283c4 = yj1Var.m6283c(i7);
                if (i6 >= i3 || (iM6283c = yj1Var.m6283c(i6)) <= iM6283c4) {
                    if (iM6283c4 > iM6283c3) {
                        yj1Var.m6285e(i5, iM6283c4);
                        yj1Var.m6285e(i7, iM6283c3);
                        i5 = i7;
                    }
                } else if (iM6283c > iM6283c3) {
                    yj1Var.m6285e(i5, iM6283c);
                    yj1Var.m6285e(i6, iM6283c3);
                    i5 = i6;
                }
            }
        }
        return iM6283c2;
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m4829R(Throwable th, xm0 xm0Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = h21.f3794a;
        j80 j80Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = c02.f1096b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = be0.f819h;
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
            C0182ex c0182ex = (C0182ex) xm0Var.mo6a();
            if (c0182ex != null) {
                boolean z2 = c0182ex.f2665b;
                List list = c0182ex.f2664a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0219fx) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                c0182ex.getClass();
                j80Var = new j80(c0182ex);
            }
        } catch (Throwable th2) {
            j80Var = th2;
        }
        if (j80Var != null) {
            fg1.m1638m(th, j80Var);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4830a(final AIChatConfig aIChatConfig, final xm0 xm0Var, final in0 in0Var, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        xm0 xm0Var2;
        b62 b62VarM1996r;
        mn0 mn0Var;
        boolean z;
        boolean z2;
        aIChatConfig.getClass();
        xm0Var.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(955088616);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(aIChatConfig) : go0Var.m1984h(aIChatConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xm0Var2 = xm0Var;
            i2 |= go0Var.m1984h(xm0Var2) ? 32 : 16;
        } else {
            xm0Var2 = xm0Var;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z3 || objM1956L == c0160eb) {
                objM1956L = op0.m3598u(aIChatConfig.getBaseUrl());
                go0Var.m1981f0(objM1956L);
            }
            final xk1 xk1Var = (xk1) objM1956L;
            boolean z4 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L2 = go0Var.m1956L();
            if (z4 || objM1956L2 == c0160eb) {
                objM1956L2 = op0.m3598u(aIChatConfig.getApiKey());
                go0Var.m1981f0(objM1956L2);
            }
            final xk1 xk1Var2 = (xk1) objM1956L2;
            boolean z5 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L3 = go0Var.m1956L();
            if (z5 || objM1956L3 == c0160eb) {
                objM1956L3 = op0.m3598u(aIChatConfig.getModel());
                go0Var.m1981f0(objM1956L3);
            }
            final xk1 xk1Var3 = (xk1) objM1956L3;
            boolean z6 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L4 = go0Var.m1956L();
            if (z6 || objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(aIChatConfig.getSystemPrompt());
                go0Var.m1981f0(objM1956L4);
            }
            final xk1 xk1Var4 = (xk1) objM1956L4;
            boolean z7 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L5 = go0Var.m1956L();
            if (z7 || objM1956L5 == c0160eb) {
                objM1956L5 = op0.m3598u(String.valueOf(aIChatConfig.getTemperature()));
                go0Var.m1981f0(objM1956L5);
            }
            final xk1 xk1Var5 = (xk1) objM1956L5;
            boolean z8 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L6 = go0Var.m1956L();
            if (z8 || objM1956L6 == c0160eb) {
                objM1956L6 = op0.m3598u(String.valueOf(aIChatConfig.getMaxTokens()));
                go0Var.m1981f0(objM1956L6);
            }
            final xk1 xk1Var6 = (xk1) objM1956L6;
            boolean z9 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L7 = go0Var.m1956L();
            if (z9 || objM1956L7 == c0160eb) {
                objM1956L7 = op0.m3598u(String.valueOf(aIChatConfig.getContextRounds()));
                go0Var.m1981f0(objM1956L7);
            }
            final xk1 xk1Var7 = (xk1) objM1956L7;
            boolean z10 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L8 = go0Var.m1956L();
            if (z10 || objM1956L8 == c0160eb) {
                objM1956L8 = op0.m3598u(String.valueOf(aIChatConfig.getReplyDelayMs()));
                go0Var.m1981f0(objM1956L8);
            }
            final xk1 xk1Var8 = (xk1) objM1956L8;
            boolean z11 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L9 = go0Var.m1956L();
            if (z11 || objM1956L9 == c0160eb) {
                objM1956L9 = op0.m3598u(aIChatConfig.getListMode());
                go0Var.m1981f0(objM1956L9);
            }
            final xk1 xk1Var9 = (xk1) objM1956L9;
            boolean z12 = i3 == 4 || ((i2 & 8) != 0 && go0Var.m1980f(aIChatConfig));
            Object objM1956L10 = go0Var.m1956L();
            if (z12 || objM1956L10 == c0160eb) {
                objM1956L10 = op0.m3598u(aIChatConfig.getTargetIds());
                go0Var.m1981f0(objM1956L10);
            }
            final xk1 xk1Var10 = (xk1) objM1956L10;
            Object objM1956L11 = go0Var.m1956L();
            if (objM1956L11 == c0160eb) {
                objM1956L11 = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L11);
            }
            final xk1 xk1Var11 = (xk1) objM1956L11;
            Object objM1956L12 = go0Var.m1956L();
            if (objM1956L12 == c0160eb) {
                objM1956L12 = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L12);
            }
            final xk1 xk1Var12 = (xk1) objM1956L12;
            String str = (String) xk1Var5.getValue();
            str.getClass();
            Float fValueOf = null;
            try {
                if (vv2.m5801U(str)) {
                    fValueOf = Float.valueOf(Float.parseFloat(str));
                }
            } catch (NumberFormatException unused) {
            }
            final Integer numM6013e0 = wv2.m6013e0((String) xk1Var6.getValue());
            final Integer numM6013e02 = wv2.m6013e0((String) xk1Var7.getValue());
            final Long lM6014f0 = wv2.m6014f0((String) xk1Var8.getValue());
            vf1 vf1Var = C0517b.f7334e;
            String str2 = (String) xk1Var.getValue();
            str2.getClass();
            boolean z13 = C0516a.m3435e(str2, "chat/completions") != null;
            if (!z13 || pv2.m4006s0((String) xk1Var2.getValue()) || pv2.m4006s0((String) xk1Var3.getValue()) || fValueOf == null) {
                z = false;
                if (((Boolean) xk1Var12.getValue()).booleanValue()) {
                    go0Var.m1966W(-1111072326);
                    go0Var.m1994p(false);
                    if (((Boolean) xk1Var11.getValue()).booleanValue()) {
                        go0Var.m1966W(-1111022137);
                        String strM4462P = rg3.m4462P(((EnumC0075c1) xk1Var9.getValue()) == EnumC0075c1.f1101j ? R.string.ai_chat_select_whitelist_title : R.string.ai_chat_select_blacklist_title, go0Var);
                        Set set = (Set) xk1Var10.getValue();
                        Object objM1956L13 = go0Var.m1956L();
                        if (objM1956L13 == c0160eb) {
                            objM1956L13 = new C0186f0(xk1Var11, 3);
                            go0Var.m1981f0(objM1956L13);
                        }
                        xm0 xm0Var3 = (xm0) objM1956L13;
                        boolean zM1980f = go0Var.m1980f(xk1Var10);
                        Object objM1956L14 = go0Var.m1956L();
                        if (zM1980f || objM1956L14 == c0160eb) {
                            objM1956L14 = new C0297i0(xk1Var10, xk1Var11, 1);
                            go0Var.m1981f0(objM1956L14);
                        }
                        m4850u(strM4462P, set, false, xm0Var3, (in0) objM1956L14, go0Var, 3456);
                        go0Var.m1994p(false);
                        b62VarM1996r = go0Var.m1996r();
                        if (b62VarM1996r == null) {
                            return;
                        }
                        final int i4 = 1;
                        mn0Var = new mn0() { // from class: p0
                            @Override // p000.mn0
                            /* JADX INFO: renamed from: g */
                            public final Object mo12g(Object obj, Object obj2) {
                                int i5 = i4;
                                a83 a83Var = a83.f116a;
                                int i6 = i;
                                in0 in0Var2 = in0Var;
                                xm0 xm0Var4 = xm0Var;
                                AIChatConfig aIChatConfig2 = aIChatConfig;
                                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                                ((Integer) obj2).intValue();
                                switch (i5) {
                                    case 0:
                                        AbstractC0691se.m4830a(aIChatConfig2, xm0Var4, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                        break;
                                    case 1:
                                        AbstractC0691se.m4830a(aIChatConfig2, xm0Var4, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                        break;
                                    default:
                                        AbstractC0691se.m4830a(aIChatConfig2, xm0Var4, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                        break;
                                }
                                return a83Var;
                            }
                        };
                    } else {
                        go0Var.m1966W(-1110419590);
                        go0Var.m1994p(false);
                        final String strM4462P2 = rg3.m4462P(R.string.ai_chat_list_blacklist, go0Var);
                        final String strM4462P3 = rg3.m4462P(R.string.ai_chat_list_whitelist, go0Var);
                        String strM4462P4 = rg3.m4462P(R.string.ai_chat_config_title, go0Var);
                        final Float f = fValueOf;
                        final boolean z14 = z;
                        C0402kw c0402kwM6126i0 = xe1.m6126i0(1505821381, new nn0() { // from class: s0
                            @Override // p000.nn0
                            /* JADX INFO: renamed from: e */
                            public final Object mo489e(Object obj, Object obj2, Object obj3) {
                                pb2 pb2Var = (pb2) obj;
                                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                pb2Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((go0) interfaceC0596px2).m1980f(pb2Var) ? 4 : 2;
                                }
                                go0 go0Var2 = (go0) interfaceC0596px2;
                                if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.m3843a(pb2Var), false, 0, go0Var2, 0, 56);
                                    String strM4462P5 = rg3.m4462P(R.string.home_settings_save, go0Var2);
                                    uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
                                    final Float f2 = f;
                                    boolean zM1980f2 = go0Var2.m1980f(f2);
                                    final Integer num = numM6013e0;
                                    boolean zM1980f3 = zM1980f2 | go0Var2.m1980f(num);
                                    final Integer num2 = numM6013e02;
                                    boolean zM1980f4 = zM1980f3 | go0Var2.m1980f(num2);
                                    final Long l = lM6014f0;
                                    boolean zM1980f5 = zM1980f4 | go0Var2.m1980f(l);
                                    final in0 in0Var2 = in0Var;
                                    boolean zM1980f6 = zM1980f5 | go0Var2.m1980f(in0Var2);
                                    final xk1 xk1Var13 = xk1Var;
                                    boolean zM1980f7 = zM1980f6 | go0Var2.m1980f(xk1Var13);
                                    final xk1 xk1Var14 = xk1Var2;
                                    boolean zM1980f8 = zM1980f7 | go0Var2.m1980f(xk1Var14);
                                    final xk1 xk1Var15 = xk1Var3;
                                    boolean zM1980f9 = zM1980f8 | go0Var2.m1980f(xk1Var15);
                                    final xk1 xk1Var16 = xk1Var4;
                                    boolean zM1980f10 = zM1980f9 | go0Var2.m1980f(xk1Var16);
                                    final xk1 xk1Var17 = xk1Var9;
                                    boolean zM1980f11 = zM1980f10 | go0Var2.m1980f(xk1Var17);
                                    final xk1 xk1Var18 = xk1Var10;
                                    boolean zM1980f12 = zM1980f11 | go0Var2.m1980f(xk1Var18);
                                    Object objM1956L15 = go0Var2.m1956L();
                                    if (zM1980f12 || objM1956L15 == C0520nx.f7360a) {
                                        xm0 xm0Var4 = new xm0() { // from class: j0
                                            @Override // p000.xm0
                                            /* JADX INFO: renamed from: a */
                                            public final Object mo6a() {
                                                Float f3 = f2;
                                                a83 a83Var = a83.f116a;
                                                if (f3 != null) {
                                                    float fFloatValue = f3.floatValue();
                                                    Integer num3 = num;
                                                    if (num3 != null) {
                                                        int iIntValue2 = num3.intValue();
                                                        Integer num4 = num2;
                                                        if (num4 != null) {
                                                            int iIntValue3 = num4.intValue();
                                                            Long l2 = l;
                                                            if (l2 != null) {
                                                                in0Var2.mo5j(new AIChatConfig(pv2.m3994J0(pv2.m3993I0((String) xk1Var13.getValue()).toString(), '/'), pv2.m3993I0((String) xk1Var14.getValue()).toString(), pv2.m3993I0((String) xk1Var15.getValue()).toString(), pv2.m3993I0((String) xk1Var16.getValue()).toString(), fFloatValue, iIntValue2, iIntValue3, l2.longValue(), (EnumC0075c1) xk1Var17.getValue(), (Set) xk1Var18.getValue()));
                                                            }
                                                        }
                                                    }
                                                }
                                                return a83Var;
                                            }
                                        };
                                        go0Var2.m1981f0(xm0Var4);
                                        objM1956L15 = xm0Var4;
                                    }
                                    AbstractC0691se.m4846q(strM4462P5, (xm0) objM1956L15, uh1VarM3843a, z14, 0, go0Var2, 0, 48);
                                } else {
                                    go0Var2.m1961R();
                                }
                                return a83.f116a;
                            }
                        }, go0Var);
                        final boolean z15 = z13;
                        qp0.m4249d(true, xm0Var, null, strM4462P4, null, c0402kwM6126i0, xe1.m6126i0(1192223036, new nn0() { // from class: t0
                            @Override // p000.nn0
                            /* JADX INFO: renamed from: e */
                            public final Object mo489e(Object obj, Object obj2, Object obj3) {
                                m13 m13VarM4814C;
                                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((C0069bv) obj).getClass();
                                go0 go0Var2 = (go0) interfaceC0596px2;
                                if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    rh1 rh1Var = rh1.f9587a;
                                    uh1 uh1VarM1882b0 = gf1.m1882b0(AbstractC0731te.m5187P(rh1Var, 0.0f, 560.0f, 1), gf1.m1868P(go0Var2));
                                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var2, 0);
                                    int iHashCode = Long.hashCode(go0Var2.f3614T);
                                    yy1 yy1VarM1990l = go0Var2.m1990l();
                                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1882b0);
                                    InterfaceC0293hx.f4166c.getClass();
                                    C0367jy c0367jy = C0256gx.f3727b;
                                    go0Var2.m1969Z();
                                    if (go0Var2.f3613S) {
                                        go0Var2.m1989k(c0367jy);
                                    } else {
                                        go0Var2.m1987i0();
                                    }
                                    yf3.m6268c(go0Var2, C0256gx.f3730e, c0032avM6346a);
                                    yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
                                    yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
                                    yf3.m6267b(go0Var2, C0256gx.f3732g);
                                    yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_config_description, go0Var2), null, AbstractC0691se.m4814C(go0Var2), 0, false, 0, 0, go0Var2, 0, 1018);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 14.0f, go0Var2, R.string.ai_chat_provider, go0Var2), go0Var2, 0);
                                    uh1 uh1VarM1613E = fg1.m1613E(rh1Var, 0.0f, 6.0f, 1);
                                    String strM4462P5 = rg3.m4462P(R.string.ai_chat_provider_openai, go0Var2);
                                    tu2 tu2Var = ur1.f11452a;
                                    AbstractC0179eu.m1446a(strM4462P5, uh1VarM1613E, new m13(((lp1) go0Var2.m1988j(tu2Var)).f6237e, rg3.m4450D(14), im0.f4682l, 0L, 0, rg3.m4450D(19), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 10.0f, go0Var2, R.string.ai_chat_base_url, go0Var2), go0Var2, 0);
                                    xk1 xk1Var13 = xk1Var;
                                    String str3 = (String) xk1Var13.getValue();
                                    boolean zM1980f2 = go0Var2.m1980f(xk1Var13);
                                    Object objM1956L15 = go0Var2.m1956L();
                                    C0160eb c0160eb2 = C0520nx.f7360a;
                                    if (zM1980f2 || objM1956L15 == c0160eb2) {
                                        objM1956L15 = new C0260h0(xk1Var13, 9);
                                        go0Var2.m1981f0(objM1956L15);
                                    }
                                    tp0.m5357b(str3, (in0) objM1956L15, null, rg3.m4462P(R.string.ai_chat_base_url_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(5, 123), null, go0Var2, 0, 384, 12276);
                                    uh1 uh1VarM1615G = fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                                    boolean zM4006s0 = pv2.m4006s0((String) xk1Var13.getValue());
                                    boolean z16 = z15;
                                    String strM4462P6 = rg3.m4462P((zM4006s0 || z16) ? R.string.ai_chat_base_url_description : R.string.ai_chat_base_url_invalid, go0Var2);
                                    if (pv2.m4006s0((String) xk1Var13.getValue()) || z16) {
                                        go0Var2.m1966W(-715470495);
                                        m13VarM4814C = AbstractC0691se.m4814C(go0Var2);
                                        go0Var2.m1994p(false);
                                    } else {
                                        go0Var2.m1966W(-715535936);
                                        m13VarM4814C = new m13(((lp1) go0Var2.m1988j(tu2Var)).f6239g, rg3.m4450D(12), im0.f4681k, 0L, 0, rg3.m4450D(17), null, null, 16646136);
                                        go0Var2.m1994p(false);
                                    }
                                    AbstractC0179eu.m1446a(strM4462P6, uh1VarM1615G, m13VarM4814C, 0, false, 0, 0, go0Var2, 48, 1016);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_api_key, go0Var2), go0Var2, 0);
                                    xk1 xk1Var14 = xk1Var2;
                                    String str4 = (String) xk1Var14.getValue();
                                    boolean zM1980f3 = go0Var2.m1980f(xk1Var14);
                                    Object objM1956L16 = go0Var2.m1956L();
                                    if (zM1980f3 || objM1956L16 == c0160eb2) {
                                        objM1956L16 = new C0260h0(xk1Var14, 0);
                                        go0Var2.m1981f0(objM1956L16);
                                    }
                                    tp0.m5357b(str4, (in0) objM1956L16, null, rg3.m4462P(R.string.ai_chat_api_key_hint, go0Var2), null, null, false, 0, 0, false, false, new tx1(), null, null, go0Var2, 0, 0, 14324);
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_api_key_description, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), AbstractC0691se.m4814C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_model, go0Var2), go0Var2, 0);
                                    xk1 xk1Var15 = xk1Var3;
                                    String str5 = (String) xk1Var15.getValue();
                                    boolean zM1980f4 = go0Var2.m1980f(xk1Var15);
                                    Object objM1956L17 = go0Var2.m1956L();
                                    if (zM1980f4 || objM1956L17 == c0160eb2) {
                                        objM1956L17 = new C0260h0(xk1Var15, 1);
                                        go0Var2.m1981f0(objM1956L17);
                                    }
                                    tp0.m5357b(str5, (in0) objM1956L17, null, rg3.m4462P(R.string.ai_chat_model_hint, go0Var2), null, null, false, 0, 0, false, false, null, null, null, go0Var2, 0, 0, 16372);
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_model_manual_description, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), AbstractC0691se.m4814C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    String strM4462P7 = rg3.m4462P(R.string.ai_chat_choose_model, go0Var2);
                                    String strM4462P8 = rg3.m4462P((!z16 || pv2.m4006s0((String) xk1Var14.getValue())) ? R.string.ai_chat_choose_model_unavailable : R.string.ai_chat_choose_model_description, go0Var2);
                                    boolean z17 = z16 && !pv2.m4006s0((String) xk1Var14.getValue());
                                    Object objM1956L18 = go0Var2.m1956L();
                                    if (objM1956L18 == c0160eb2) {
                                        objM1956L18 = new C0186f0(xk1Var12, 2);
                                        go0Var2.m1981f0(objM1956L18);
                                    }
                                    qp0.m4253h(strM4462P7, (xm0) objM1956L18, null, strM4462P8, null, null, null, z17, null, go0Var2, 48, 372);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_system_prompt, go0Var2), go0Var2, 0);
                                    xk1 xk1Var16 = xk1Var4;
                                    String str6 = (String) xk1Var16.getValue();
                                    boolean zM1980f5 = go0Var2.m1980f(xk1Var16);
                                    Object objM1956L19 = go0Var2.m1956L();
                                    if (zM1980f5 || objM1956L19 == c0160eb2) {
                                        objM1956L19 = new C0260h0(xk1Var16, 2);
                                        go0Var2.m1981f0(objM1956L19);
                                    }
                                    tp0.m5357b(str6, (in0) objM1956L19, null, rg3.m4462P(R.string.ai_chat_system_prompt_hint, go0Var2), null, null, false, 3, 6, false, false, null, null, null, go0Var2, 114819072, 0, 15924);
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_system_prompt_description, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), AbstractC0691se.m4814C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_temperature, go0Var2), go0Var2, 0);
                                    xk1 xk1Var17 = xk1Var5;
                                    String str7 = (String) xk1Var17.getValue();
                                    boolean zM1980f6 = go0Var2.m1980f(xk1Var17);
                                    Object objM1956L20 = go0Var2.m1956L();
                                    if (zM1980f6 || objM1956L20 == c0160eb2) {
                                        objM1956L20 = new C0260h0(xk1Var17, 3);
                                        go0Var2.m1981f0(objM1956L20);
                                    }
                                    tp0.m5357b(str7, (in0) objM1956L20, null, rg3.m4462P(R.string.ai_chat_temperature_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(9, 123), null, go0Var2, 0, 384, 12276);
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_temperature_description, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), AbstractC0691se.m4814C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_max_tokens, go0Var2), go0Var2, 0);
                                    xk1 xk1Var18 = xk1Var6;
                                    String str8 = (String) xk1Var18.getValue();
                                    boolean zM1980f7 = go0Var2.m1980f(xk1Var18);
                                    Object objM1956L21 = go0Var2.m1956L();
                                    if (zM1980f7 || objM1956L21 == c0160eb2) {
                                        objM1956L21 = new C0260h0(xk1Var18, 4);
                                        go0Var2.m1981f0(objM1956L21);
                                    }
                                    tp0.m5357b(str8, (in0) objM1956L21, null, rg3.m4462P(R.string.ai_chat_max_tokens_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_max_tokens_description, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), AbstractC0691se.m4814C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_context_rounds, go0Var2), go0Var2, 0);
                                    xk1 xk1Var19 = xk1Var7;
                                    String str9 = (String) xk1Var19.getValue();
                                    boolean zM1980f8 = go0Var2.m1980f(xk1Var19);
                                    Object objM1956L22 = go0Var2.m1956L();
                                    if (zM1980f8 || objM1956L22 == c0160eb2) {
                                        objM1956L22 = new C0260h0(xk1Var19, 5);
                                        go0Var2.m1981f0(objM1956L22);
                                    }
                                    tp0.m5357b(str9, (in0) objM1956L22, null, rg3.m4462P(R.string.ai_chat_context_rounds_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_context_rounds_description, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), AbstractC0691se.m4814C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    AbstractC0691se.m4831b(vi0.m5687f(rh1Var, 12.0f, go0Var2, R.string.ai_chat_reply_delay, go0Var2), go0Var2, 0);
                                    xk1 xk1Var20 = xk1Var8;
                                    String str10 = (String) xk1Var20.getValue();
                                    boolean zM1980f9 = go0Var2.m1980f(xk1Var20);
                                    Object objM1956L23 = go0Var2.m1956L();
                                    if (zM1980f9 || objM1956L23 == c0160eb2) {
                                        objM1956L23 = new C0260h0(xk1Var20, 6);
                                        go0Var2.m1981f0(objM1956L23);
                                    }
                                    tp0.m5357b(str10, (in0) objM1956L23, null, rg3.m4462P(R.string.ai_chat_reply_delay_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_reply_delay_description, go0Var2), fg1.m1615G(rh1Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), AbstractC0691se.m4814C(go0Var2), 0, false, 0, 0, go0Var2, 48, 1016);
                                    String strM5687f = vi0.m5687f(rh1Var, 8.0f, go0Var2, R.string.ai_chat_list_mode, go0Var2);
                                    xk1 xk1Var21 = xk1Var9;
                                    EnumC0075c1 enumC0075c1 = (EnumC0075c1) xk1Var21.getValue();
                                    EnumC0075c1 enumC0075c12 = EnumC0075c1.f1101j;
                                    String strM4462P9 = rg3.m4462P(enumC0075c1 == enumC0075c12 ? R.string.ai_chat_whitelist_description : R.string.ai_chat_blacklist_description, go0Var2);
                                    yf0 yf0Var = EnumC0075c1.f1103l;
                                    EnumC0075c1 enumC0075c13 = (EnumC0075c1) xk1Var21.getValue();
                                    boolean zM1980f10 = go0Var2.m1980f(xk1Var21);
                                    Object objM1956L24 = go0Var2.m1956L();
                                    if (zM1980f10 || objM1956L24 == c0160eb2) {
                                        objM1956L24 = new C0260h0(xk1Var21, 7);
                                        go0Var2.m1981f0(objM1956L24);
                                    }
                                    in0 in0Var2 = (in0) objM1956L24;
                                    String str11 = strM4462P2;
                                    boolean zM1980f11 = go0Var2.m1980f(str11);
                                    String str12 = strM4462P3;
                                    boolean zM1980f12 = zM1980f11 | go0Var2.m1980f(str12);
                                    Object objM1956L25 = go0Var2.m1956L();
                                    if (zM1980f12 || objM1956L25 == c0160eb2) {
                                        objM1956L25 = new C0223g0(0, str11, str12);
                                        go0Var2.m1981f0(objM1956L25);
                                    }
                                    AbstractC0179eu.m1463m(strM5687f, yf0Var, enumC0075c13, in0Var2, null, strM4462P9, (in0) objM1956L25, false, go0Var2, 0);
                                    String strM4462P10 = rg3.m4462P(((EnumC0075c1) xk1Var21.getValue()) == enumC0075c12 ? R.string.ai_chat_configure_whitelist : R.string.ai_chat_configure_blacklist, go0Var2);
                                    String strM4463Q = rg3.m4463Q(R.string.ai_chat_selected_count, new Object[]{Integer.valueOf(((Set) xk1Var10.getValue()).size())}, go0Var2);
                                    Object objM1956L26 = go0Var2.m1956L();
                                    if (objM1956L26 == c0160eb2) {
                                        objM1956L26 = new C0186f0(xk1Var11, 1);
                                        go0Var2.m1981f0(objM1956L26);
                                    }
                                    qp0.m4253h(strM4462P10, (xm0) objM1956L26, null, strM4463Q, null, null, null, false, null, go0Var2, 48, 500);
                                    go0Var2.m1994p(true);
                                } else {
                                    go0Var2.m1961R();
                                }
                                return a83.f116a;
                            }
                        }, go0Var), go0Var, (i2 & 112) | 1769478, 20);
                        go0Var = go0Var;
                    }
                } else {
                    go0Var.m1966W(-1111407715);
                    String str3 = (String) xk1Var.getValue();
                    String str4 = (String) xk1Var2.getValue();
                    String str5 = (String) xk1Var3.getValue();
                    Object objM1956L15 = go0Var.m1956L();
                    if (objM1956L15 == c0160eb) {
                        objM1956L15 = new C0186f0(xk1Var12, 0);
                        go0Var.m1981f0(objM1956L15);
                    }
                    xm0 xm0Var4 = (xm0) objM1956L15;
                    boolean zM1980f2 = go0Var.m1980f(xk1Var3);
                    Object objM1956L16 = go0Var.m1956L();
                    if (zM1980f2 || objM1956L16 == c0160eb) {
                        z2 = false;
                        objM1956L16 = new C0297i0(xk1Var3, xk1Var12, 0 == true ? 1 : 0);
                        go0Var.m1981f0(objM1956L16);
                    } else {
                        z2 = false;
                    }
                    m4833d(str3, str4, str5, xm0Var4, (in0) objM1956L16, go0Var, 3072);
                    go0Var.m1994p(z2);
                    b62VarM1996r = go0Var.m1996r();
                    if (b62VarM1996r == null) {
                        return;
                    }
                    final int i5 = 0;
                    final xm0 xm0Var5 = xm0Var2;
                    mn0Var = new mn0() { // from class: p0
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i52 = i5;
                            a83 a83Var = a83.f116a;
                            int i6 = i;
                            in0 in0Var2 = in0Var;
                            xm0 xm0Var42 = xm0Var5;
                            AIChatConfig aIChatConfig2 = aIChatConfig;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                            ((Integer) obj2).intValue();
                            switch (i52) {
                                case 0:
                                    AbstractC0691se.m4830a(aIChatConfig2, xm0Var42, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                    break;
                                case 1:
                                    AbstractC0691se.m4830a(aIChatConfig2, xm0Var42, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                    break;
                                default:
                                    AbstractC0691se.m4830a(aIChatConfig2, xm0Var42, in0Var2, interfaceC0596px2, pp0.m3902N(i6 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                }
            } else {
                float fFloatValue = fValueOf.floatValue();
                if ((0.0f <= fFloatValue && fFloatValue <= 2.0f) && numM6013e0 != null) {
                    int iIntValue = numM6013e0.intValue();
                    if ((1 <= iIntValue && iIntValue < 32769) && numM6013e02 != null) {
                        int iIntValue2 = numM6013e02.intValue();
                        if ((iIntValue2 >= 0 && iIntValue2 < 21) && lM6014f0 != null) {
                            long jLongValue = lM6014f0.longValue();
                            if (0 <= jLongValue && jLongValue < 60001) {
                                z = true;
                            }
                            if (((Boolean) xk1Var12.getValue()).booleanValue()) {
                            }
                        }
                    }
                }
            }
            b62VarM1996r.f616d = mn0Var;
        }
        go0Var.m1961R();
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final int i6 = 2;
            mn0Var = new mn0() { // from class: p0
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int i52 = i6;
                    a83 a83Var = a83.f116a;
                    int i62 = i;
                    in0 in0Var2 = in0Var;
                    xm0 xm0Var42 = xm0Var;
                    AIChatConfig aIChatConfig2 = aIChatConfig;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            AbstractC0691se.m4830a(aIChatConfig2, xm0Var42, in0Var2, interfaceC0596px2, pp0.m3902N(i62 | 1));
                            break;
                        case 1:
                            AbstractC0691se.m4830a(aIChatConfig2, xm0Var42, in0Var2, interfaceC0596px2, pp0.m3902N(i62 | 1));
                            break;
                        default:
                            AbstractC0691se.m4830a(aIChatConfig2, xm0Var42, in0Var2, interfaceC0596px2, pp0.m3902N(i62 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarM1996r.f616d = mn0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4831b(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1646797186);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        int i3 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, fg1.m1615G(rh1.f9587a, 0.0f, 0.0f, 0.0f, 6.0f, 7), new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6237e, rg3.m4450D(13), im0.f4682l, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, (i2 & 14) | 48, 1016);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4832c(AIModelInfo aIModelInfo, boolean z, xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        rh1 rh1Var;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1521596899);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(aIModelInfo) : go0Var.m1984h(aIModelInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1982g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            uh1 uh1VarM1612D = fg1.m1612D(AbstractC0738tl.m5287O(AbstractC0731te.f10693e, xm0Var), 8.0f, 11.0f);
            ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var, 48);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            C0419lc c0419lc = C0256gx.f3730e;
            yf3.m6268c(go0Var, c0419lc, ob2VarM3265a);
            C0419lc c0419lc2 = C0256gx.f3729d;
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0419lc c0419lc3 = C0256gx.f3731f;
            yf3.m6268c(go0Var, c0419lc3, numValueOf);
            C0799v6 c0799v6 = C0256gx.f3732g;
            yf3.m6267b(go0Var, c0799v6);
            C0419lc c0419lc4 = C0256gx.f3728c;
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
            g71 g71Var = new g71(1.0f, true);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l2 = go0Var.m1990l();
            uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, g71Var);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, c0032avM6346a);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
            vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
            String id = aIModelInfo.getId();
            tu2 tu2Var = ur1.f11452a;
            long j = ((lp1) go0Var.m1988j(tu2Var)).f6237e;
            long jM4450D = rg3.m4450D(14);
            long jM4450D2 = rg3.m4450D(19);
            im0 im0Var = im0.f4682l;
            AbstractC0179eu.m1446a(id, null, new m13(j, jM4450D, im0Var, 0L, 0, jM4450D2, null, null, 16646136), 2, false, 1, 0, go0Var, 1597440, 938);
            String ownedBy = aIModelInfo.getOwnedBy();
            rh1 rh1Var2 = rh1.f9587a;
            if (ownedBy == null) {
                go0Var.m1966W(30239819);
                go0Var.m1994p(false);
                rh1Var = rh1Var2;
            } else {
                go0Var.m1966W(30239820);
                rh1Var = rh1Var2;
                AbstractC0179eu.m1446a(rg3.m4463Q(R.string.ai_chat_model_owner, new Object[]{ownedBy}, go0Var), fg1.m1615G(rh1Var2, 0.0f, 3.0f, 0.0f, 0.0f, 13), m4814C(go0Var), 2, false, 1, 0, go0Var, 1597488, 936);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
            if (z) {
                go0Var.m1966W(-1375897659);
                rp0.m4529O(go0Var, AbstractC0731te.m5231q0(rh1Var, 12.0f));
                AbstractC0179eu.m1446a(rg3.m4462P(R.string.ai_chat_model_selected, go0Var), null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6239g, rg3.m4450D(12), im0Var, 0L, 0, rg3.m4450D(17), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1018);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1375501727);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0639r0(aIModelInfo, z, xm0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4833d(String str, String str2, String str3, xm0 xm0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        String ownedBy;
        String str4 = str;
        String str5 = str2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(883131579);
        int i2 = i | (go0Var.m1980f(str4) ? 4 : 2) | (go0Var.m1980f(str5) ? 32 : 16) | (go0Var.m1980f(str3) ? 256 : 128) | (go0Var.m1984h(in0Var) ? 16384 : 8192);
        if (go0Var.m1958O(i2 & 1, (i2 & 9363) != 9362)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u("");
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = new kx1(0);
                go0Var.m1981f0(objM1956L2);
            }
            kx1 kx1Var = (kx1) objM1956L2;
            Object objM1956L3 = go0Var.m1956L();
            if (objM1956L3 == c0160eb) {
                objM1956L3 = op0.m3598u(C0445m1.f6429a);
                go0Var.m1981f0(objM1956L3);
            }
            xk1 xk1Var2 = (xk1) objM1956L3;
            Integer numValueOf = Integer.valueOf(kx1Var.m2759g());
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM1956L4 = go0Var.m1956L();
            if (z || objM1956L4 == c0160eb) {
                C0793v0 c0793v0 = new C0793v0(xk1Var2, str4, str5, str3, (t00) null, 0);
                xk1Var2 = xk1Var2;
                str4 = str4;
                str5 = str5;
                go0Var.m1981f0(c0793v0);
                objM1956L4 = c0793v0;
            }
            mn0 mn0Var = (mn0) objM1956L4;
            a20 a20Var = go0Var.f3612R;
            boolean zM1980f = go0Var.m1980f(str4) | go0Var.m1980f(str5) | go0Var.m1980f(numValueOf);
            Object objM1956L5 = go0Var.m1956L();
            if (zM1980f || objM1956L5 == c0160eb) {
                objM1956L5 = new y51(a20Var, mn0Var);
                go0Var.m1981f0(objM1956L5);
            }
            InterfaceC0482n1 interfaceC0482n1 = (InterfaceC0482n1) xk1Var2.getValue();
            C0408l1 c0408l1 = interfaceC0482n1 instanceof C0408l1 ? (C0408l1) interfaceC0482n1 : null;
            Iterable iterable = c0408l1 != null ? c0408l1.f5868a : null;
            if (iterable == null) {
                iterable = be0.f819h;
            }
            String string = pv2.m3993I0((String) xk1Var.getValue()).toString();
            boolean zM1980f2 = go0Var.m1980f(iterable) | go0Var.m1980f(string);
            Object objM1956L6 = go0Var.m1956L();
            if (zM1980f2 || objM1956L6 == c0160eb) {
                if (!pv2.m4006s0(string)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : iterable) {
                        AIModelInfo aIModelInfo = (AIModelInfo) obj;
                        if (pv2.m3995h0(aIModelInfo.getId(), string, true) || ((ownedBy = aIModelInfo.getOwnedBy()) != null && pv2.m3995h0(ownedBy, string, true))) {
                            arrayList.add(obj);
                        }
                    }
                    iterable = arrayList;
                }
                go0Var.m1981f0(iterable);
                objM1956L6 = iterable;
            }
            qp0.m4249d(true, xm0Var, null, rg3.m4462P(R.string.ai_chat_model_list_title, go0Var), null, xe1.m6126i0(-303307586, new C0370k0(xm0Var, 0), go0Var), xe1.m6126i0(-455465497, new C0407l0((List) objM1956L6, str3, in0Var, xk1Var, xk1Var2, kx1Var, 0), go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0959ze(str, str2, str3, xm0Var, in0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4834e(C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1033667179);
        int i2 = 0;
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            uh1 uh1VarM5186O = AbstractC0731te.m5186O(AbstractC0731te.f10693e, 220.0f);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10877d, C0700sn.f10234v, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5186O);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            c0402kw.mo489e(C0069bv.f1040a, go0Var, 54);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0524o0(c0402kw, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m4835f(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(780076107);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, fg1.m1613E(rh1.f9587a, 12.0f, 0.0f, 2), new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), null, 0L, 0, rg3.m4450D(18), null, null, 16646140), 0, false, 0, 0, go0Var, (i2 & 14) | 48, 1016);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m4836g(in0 in0Var, in0 in0Var2, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        in0 in0Var3;
        in0 in0Var4;
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1799899728);
        int i3 = 4;
        int i4 = (go0Var.m1984h(in0Var) ? 4 : 2) | i | 16;
        if (go0Var.m1958O(i4 & 1, (i4 & 19) != 18)) {
            go0Var.m1963T();
            int i5 = i & 1;
            C0160eb c0160eb = C0520nx.f7360a;
            if (i5 == 0 || go0Var.m2003y()) {
                Object objM1956L = go0Var.m1956L();
                if (objM1956L == c0160eb) {
                    objM1956L = new C0053bf(1, null);
                    go0Var.m1981f0(objM1956L);
                }
                in0Var4 = (in0) objM1956L;
            } else {
                go0Var.m1961R();
                in0Var4 = in0Var2;
            }
            go0Var.m1995q();
            Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
            Object[] objArr = new Object[0];
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = new C0074c0(i3);
                go0Var.m1981f0(objM1956L2);
            }
            kx1 kx1Var = (kx1) gf1.m1865M(objArr, (xm0) objM1956L2, go0Var, 48);
            Object objM1956L3 = go0Var.m1956L();
            if (objM1956L3 == c0160eb) {
                objM1956L3 = op0.m3598u(C0089cf.f1497a);
                go0Var.m1981f0(objM1956L3);
            }
            xk1 xk1Var = (xk1) objM1956L3;
            Object objM1956L4 = go0Var.m1956L();
            if (objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L4);
            }
            xk1 xk1Var2 = (xk1) objM1956L4;
            Integer numValueOf = Integer.valueOf(kx1Var.m2759g());
            boolean zM1984h = go0Var.m1984h(in0Var4);
            Object objM1956L5 = go0Var.m1956L();
            if (zM1984h || objM1956L5 == c0160eb) {
                objM1956L5 = new C0379k9(xk1Var, in0Var4, null);
                go0Var.m1981f0(objM1956L5);
            }
            AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L5, numValueOf);
            C0402kw c0402kwM6126i0 = xe1.m6126i0(-1461823813, new C0959ze(in0Var, context, kx1Var, xk1Var, xk1Var2), go0Var);
            int i6 = 6;
            ci0.m815p(c0402kwM6126i0, go0Var, 6);
            if (((Boolean) xk1Var2.getValue()).booleanValue()) {
                go0Var.m1966W(1856553731);
                Object objM1956L6 = go0Var.m1956L();
                if (objM1956L6 == c0160eb) {
                    objM1956L6 = new C0186f0(xk1Var2, i6);
                    go0Var.m1981f0(objM1956L6);
                }
                xm0 xm0Var = (xm0) objM1956L6;
                String strM4462P = rg3.m4462P(R.string.home_settings_update_open_failed_title, go0Var);
                String strM4462P2 = rg3.m4462P(R.string.home_settings_update_open_failed_message, go0Var);
                String strM4462P3 = rg3.m4462P(R.string.home_settings_ok, go0Var);
                Object objM1956L7 = go0Var.m1956L();
                if (objM1956L7 == c0160eb) {
                    objM1956L7 = new C0186f0(xk1Var2, 7);
                    go0Var.m1981f0(objM1956L7);
                }
                i2 = 0;
                in0Var3 = in0Var4;
                qp0.m4248c(xm0Var, strM4462P, strM4462P2, strM4462P3, (xm0) objM1956L7, null, null, null, go0Var, 24582, 224);
                go0Var.m1994p(false);
            } else {
                i2 = 0;
                in0Var3 = in0Var4;
                go0Var.m1966W(1856937170);
                go0Var.m1994p(false);
            }
        } else {
            i2 = 0;
            go0Var.m1961R();
            in0Var3 = in0Var2;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0016af(i, i2, in0Var, in0Var3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m4837h(int i, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1100896517);
        int i2 = 0;
        if (go0Var.m1958O(i & 1, i != 0)) {
            AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_update_section, go0Var), ci0.f1555k, go0Var, 384, 1);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0920ye(i, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m4838i(jc3 jc3Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(1609715501);
        int i2 = i | (go0Var2.m1980f(jc3Var) ? 4 : 2);
        if (go0Var2.m1958O(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) go0Var2.m1988j(AbstractC0646r7.f9411b);
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM5211g0 = AbstractC0731te.m5211g0(rh1Var, 42.0f);
            fb2 fb2Var = gb2.f3387a;
            uh1 uh1VarM825z = ci0.m825z(uh1VarM5211g0, fb2Var);
            tu2 tu2Var = ur1.f11452a;
            uh1 uh1VarM1896n = gf1.m1896n(uh1VarM825z, C0363ju.m2565b(0.14f, ((lp1) go0Var2.m1988j(tu2Var)).f6239g), sp0.f10267h);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var2.f3614T);
            yy1 yy1VarM1990l = go0Var2.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1896n);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var2.m1969Z();
            if (go0Var2.f3613S) {
                go0Var2.m1989k(c0367jy);
            } else {
                go0Var2.m1987i0();
            }
            yf3.m6268c(go0Var2, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var2, C0256gx.f3732g);
            yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
            Character chM4001n0 = pv2.m4001n0(pv2.m3993I0(jc3Var.f4965b).toString());
            String strValueOf = chM4001n0 != null ? String.valueOf(Character.toUpperCase(chM4001n0.charValue())) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            go0Var = go0Var2;
            AbstractC0179eu.m1446a(strValueOf, null, new m13(((lp1) go0Var2.m1988j(tu2Var)).f6239g, rg3.m4450D(15), im0.f4683m, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 0, 1018);
            if (pv2.m4006s0(jc3Var.f4966c)) {
                go0Var.m1966W(-1220502705);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1221176676);
                uh1 uh1VarM825z2 = ci0.m825z(AbstractC0731te.m5211g0(rh1Var, 42.0f), fb2Var);
                Object objM1956L = go0Var.m1956L();
                C0160eb c0160eb = C0520nx.f7360a;
                if (objM1956L == c0160eb) {
                    objM1956L = new yb3(9);
                    go0Var.m1981f0(objM1956L);
                }
                in0 in0Var = (in0) objM1956L;
                boolean zM1984h = go0Var.m1984h(context) | ((i2 & 14) == 4);
                Object objM1956L2 = go0Var.m1956L();
                if (zM1984h || objM1956L2 == c0160eb) {
                    objM1956L2 = new d62(8, context, jc3Var);
                    go0Var.m1981f0(objM1956L2);
                }
                pp0.m3904b(in0Var, uh1VarM825z2, (in0) objM1956L2, go0Var, 6, 0);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
        } else {
            go0Var = go0Var2;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0686s9(i, 24, jc3Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m4839j(jc3 jc3Var, boolean z, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1321112051);
        int i3 = i | (go0Var.m1980f(jc3Var) ? 4 : 2) | (go0Var.m1982g(z) ? 32 : 16) | (go0Var.m1984h(in0Var) ? 256 : 128);
        if (go0Var.m1958O(i3 & 1, (i3 & 147) != 146)) {
            yi0 yi0Var = AbstractC0731te.f10693e;
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objM1956L = go0Var.m1956L();
            if (z2 || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0619qh(6, in0Var, z);
                go0Var.m1981f0(objM1956L);
            }
            uh1 uh1VarM1612D = fg1.m1612D(AbstractC0738tl.m5287O(yi0Var, (xm0) objM1956L), 6.0f, 10.0f);
            ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var, 48);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            C0419lc c0419lc = C0256gx.f3730e;
            yf3.m6268c(go0Var, c0419lc, ob2VarM3265a);
            C0419lc c0419lc2 = C0256gx.f3729d;
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0419lc c0419lc3 = C0256gx.f3731f;
            yf3.m6268c(go0Var, c0419lc3, numValueOf);
            C0799v6 c0799v6 = C0256gx.f3732g;
            yf3.m6267b(go0Var, c0799v6);
            C0419lc c0419lc4 = C0256gx.f3728c;
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
            m4838i(jc3Var, go0Var, i3 & 14);
            rh1 rh1Var = rh1.f9587a;
            rp0.m4529O(go0Var, AbstractC0731te.m5231q0(rh1Var, 12.0f));
            g71 g71Var = new g71(1.0f, true);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l2 = go0Var.m1990l();
            uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, g71Var);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, c0032avM6346a);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
            vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
            String str = jc3Var.f4965b;
            tu2 tu2Var = ur1.f11452a;
            AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6237e, rg3.m4450D(14), im0.f4682l, 0L, 0, rg3.m4450D(19), null, null, 16646136), 2, false, 1, 0, go0Var, 1597440, 938);
            int iOrdinal = jc3Var.f4967d.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string.wechat_contact_selector_friend;
            } else if (iOrdinal == 1) {
                i2 = R.string.wechat_contact_selector_group;
            } else {
                if (iOrdinal != 2) {
                    c80.m675s();
                    return;
                }
                i2 = R.string.wechat_contact_selector_official_account;
            }
            AbstractC0179eu.m1446a(rg3.m4462P(i2, go0Var) + " · " + jc3Var.f4964a, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6238f, rg3.m4450D(11), null, 0L, 0, rg3.m4450D(16), null, null, 16646140), 2, false, 1, 0, go0Var, 1597440, 938);
            go0Var.m1994p(true);
            rp0.m4529O(go0Var, AbstractC0731te.m5231q0(rh1Var, 10.0f));
            AbstractC0731te.m5210g(z, in0Var, null, false, go0Var, (i3 >> 3) & 126);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0656rh(jc3Var, z, in0Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m4840k(C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1636497897);
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            uh1 uh1VarM5186O = AbstractC0731te.m5186O(AbstractC0731te.f10693e, 220.0f);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10877d, C0700sn.f10234v, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5186O);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            c0402kw.mo489e(C0069bv.f1040a, go0Var, 54);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0524o0(c0402kw, i, 7);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m4841l(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1075828327);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        int i3 = 13;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), null, 0L, 0, rg3.m4450D(18), null, null, 16646140), 0, false, 0, 0, go0Var, i2 & 14, 1018);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, i3);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final i70 m4842m(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        dm0 dm0VarM1365a = em0.m1365a(f);
        if (dm0VarM1365a == null) {
            dm0VarM1365a = new ab1(f);
        }
        return new i70(f2, f, dm0VarM1365a);
    }

    /* JADX INFO: renamed from: n */
    public static final void m4843n(xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(465591258);
        int i2 = (go0Var.m1984h(xm0Var) ? 4 : 2) | i;
        byte b = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_update_section, go0Var), xe1.m6126i0(237150491, new C0844we(xm0Var, b, b), go0Var), go0Var, 384, 1);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0844we(xm0Var, i);
        }
    }

    /* JADX INFO: renamed from: o */
    public static v31 m4844o(in0 in0Var) {
        t21 t21Var = u21.f11071d;
        t21Var.getClass();
        d31 d31Var = new d31();
        f31 f31Var = t21Var.f11072a;
        d31Var.f1847a = f31Var.f2756c;
        d31Var.f1848b = f31Var.f2754a;
        d31Var.f1849c = f31Var.f2755b;
        String str = f31Var.f2757d;
        d31Var.f1850d = str;
        d31Var.f1851e = f31Var.f2758e;
        d31Var.f1852f = f31Var.f2760g;
        d31Var.f1853g = f31Var.f2759f;
        d31Var.f1854h = t21Var.f11073b;
        d31Var.f1855i = f31Var.f2761h;
        in0Var.mo5j(d31Var);
        if (d31Var.f1849c) {
            if (!t11.m5086l(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        C0676s.m4645c("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!t11.m5086l(str, "    ")) {
            C0676s.m4651j("Indent should not be specified when default printing mode is used");
            return null;
        }
        f31 f31Var2 = new f31(d31Var.f1848b, d31Var.f1849c, d31Var.f1847a, d31Var.f1850d, d31Var.f1851e, d31Var.f1853g, d31Var.f1852f, d31Var.f1855i);
        i51 i51Var = d31Var.f1854h;
        i51Var.getClass();
        return new v31(f31Var2, i51Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a4  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4845p(final uh1 uh1Var, final boolean z, final xm0 xm0Var, boolean z2, final int i, final C0402kw c0402kw, InterfaceC0596px interfaceC0596px, final int i2, final int i3) {
        int i4;
        boolean z3;
        b62 b62VarM1996r;
        long jM2565b;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(271232923);
        if ((i2 & 6) == 0) {
            i4 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go0Var.m1982g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= go0Var.m1984h(xm0Var) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                z3 = z2;
                i4 |= go0Var.m1982g(z3) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i4 |= go0Var.m1980f(null) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i4 |= go0Var.m1976d(i) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i4 |= go0Var.m1984h(c0402kw) ? 1048576 : 524288;
            }
            int i6 = 0;
            if (go0Var.m1958O(i4 & 1, (599187 & i4) == 599186)) {
                go0Var.m1961R();
            } else {
                go0Var.m1963T();
                if ((i2 & 1) != 0 && !go0Var.m2003y()) {
                    go0Var.m1961R();
                } else if (i5 != 0) {
                    z3 = false;
                }
                go0Var.m1995q();
                kr1 kr1Var = new kr1(11.0f);
                if (z3) {
                    go0Var.m1966W(1466890964);
                    jM2565b = C0363ju.m2565b(z ? 0.3f : 0.08f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g);
                    go0Var.m1994p(false);
                } else {
                    go0Var.m1966W(1466983189);
                    if (((lp1) go0Var.m1988j(ur1.f11452a)).f6233a) {
                        jM2565b = C0363ju.m2565b(z ? 0.06f : 0.02f, C0363ju.f5212b);
                    } else {
                        jM2565b = C0363ju.m2565b(z ? 0.06f : 0.02f, C0363ju.f5213c);
                    }
                    go0Var.m1994p(false);
                }
                uh1Var.getClass();
                xm0Var.getClass();
                uh1 uh1VarM1612D = fg1.m1612D(gf1.m1896n(ci0.m825z(AbstractC0738tl.m5320s(uh1Var, new hp1(i, new gp1(xm0Var, i6), z)), kr1Var), jM2565b, sp0.f10267h), 17.0f, 11.0f);
                nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
                int iHashCode = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l = go0Var.m1990l();
                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1989k(c0367jy);
                } else {
                    go0Var.m1987i0();
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                c0402kw.mo12g(go0Var, Integer.valueOf((i4 >> 18) & 14));
                go0Var.m1994p(true);
            }
            final boolean z4 = z3;
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                b62VarM1996r.f616d = new mn0() { // from class: to1
                    @Override // p000.mn0
                    /* JADX INFO: renamed from: g */
                    public final Object mo12g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0691se.m4845p(uh1Var, z, xm0Var, z4, i, c0402kw, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1), i3);
                        return a83.f116a;
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
        if (go0Var.m1958O(i4 & 1, (599187 & i4) == 599186)) {
        }
        final boolean z42 = z3;
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m4846q(final String str, final xm0 xm0Var, final uh1 uh1Var, boolean z, int i, InterfaceC0596px interfaceC0596px, final int i2, final int i3) {
        int i4;
        final boolean z2;
        final int i5;
        boolean z3;
        int i6;
        int i7;
        str.getClass();
        xm0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1938994224);
        int i8 = i2 | (go0Var.m1980f(str) ? 4 : 2) | (go0Var.m1984h(xm0Var) ? 32 : 16) | (go0Var.m1980f(uh1Var) ? 256 : 128);
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 = i8 | 3072;
        } else {
            i4 = i8 | (go0Var.m1982g(z) ? 2048 : 1024);
        }
        int i10 = i4 | 90112;
        int i11 = 1;
        if (go0Var.m1958O(i10 & 1, (74899 & i10) != 74898)) {
            go0Var.m1963T();
            if ((i2 & 1) == 0 || go0Var.m2003y()) {
                z3 = i9 != 0 ? true : z;
                i6 = i10 & (-458753);
                i7 = 1;
            } else {
                go0Var.m1961R();
                i6 = i10 & (-458753);
                z3 = z;
                i7 = i;
            }
            go0Var.m1995q();
            int i12 = i6 >> 6;
            boolean z4 = z3;
            m4845p(uh1Var, z4, xm0Var, true, i7, xe1.m6126i0(-780053401, new qo1(i11, str, z3), go0Var), go0Var, ((i6 << 3) & 896) | (i12 & 112) | (i12 & 14) | 1575936 | 24576, 0);
            z2 = z4;
            i5 = i7;
        } else {
            go0Var.m1961R();
            z2 = z;
            i5 = i;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(str, xm0Var, uh1Var, z2, i5, i2, i3) { // from class: so1

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ String f10250h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ xm0 f10251i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ uh1 f10252j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ boolean f10253k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ int f10254l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ int f10255m;

                {
                    this.f10255m = i3;
                }

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(1);
                    AbstractC0691se.m4846q(this.f10250h, this.f10251i, this.f10252j, this.f10253k, this.f10254l, (InterfaceC0596px) obj, iM3902N, this.f10255m);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4847r(final String str, final xm0 xm0Var, uh1 uh1Var, boolean z, int i, InterfaceC0596px interfaceC0596px, final int i2, final int i3) {
        int i4;
        final uh1 uh1Var2;
        int i5;
        boolean z2;
        int i6;
        final boolean z3;
        final int i7;
        b62 b62VarM1996r;
        uh1 uh1Var3;
        int i8;
        str.getClass();
        xm0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2140635699);
        if ((i2 & 6) == 0) {
            i4 = (go0Var.m1980f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                uh1Var2 = uh1Var;
                i4 |= go0Var.m1980f(uh1Var2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    z2 = z;
                    i4 |= go0Var.m1982g(z2) ? 2048 : 1024;
                }
                i6 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    i6 = 90112 | i4;
                }
                int i10 = 0;
                int i11 = 1;
                if (go0Var.m1958O(i6 & 1, (74899 & i6) != 74898)) {
                    go0Var.m1963T();
                    if ((i2 & 1) == 0 || go0Var.m2003y()) {
                        uh1 uh1Var4 = i9 != 0 ? rh1.f9587a : uh1Var2;
                        if (i5 != 0) {
                            z2 = true;
                        }
                        int i12 = i6 & (-458753);
                        uh1Var3 = uh1Var4;
                        i8 = i12;
                    } else {
                        go0Var.m1961R();
                        i8 = i6 & (-458753);
                        i11 = i;
                        uh1Var3 = uh1Var2;
                    }
                    boolean z4 = z2;
                    go0Var.m1995q();
                    int i13 = i8 >> 6;
                    m4845p(uh1Var3, z4, xm0Var, false, i11, xe1.m6126i0(242402442, new qo1(i10, str, z4), go0Var), go0Var, (i13 & 112) | (i13 & 14) | 1572864 | ((i8 << 3) & 896) | (i8 & 57344), 8);
                    uh1Var2 = uh1Var3;
                    z3 = z4;
                    i7 = i11;
                } else {
                    go0Var.m1961R();
                    z3 = z2;
                    i7 = i;
                }
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                    b62VarM1996r.f616d = new mn0() { // from class: ro1
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0691se.m4847r(str, xm0Var, uh1Var2, z3, i7, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1), i3);
                            return a83.f116a;
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
            if (go0Var.m1958O(i6 & 1, (74899 & i6) != 74898)) {
            }
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r != null) {
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
        if (go0Var.m1958O(i6 & 1, (74899 & i6) != 74898)) {
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m4848s(t81 t81Var, Object obj, int i, Object obj2, InterfaceC0596px interfaceC0596px, int i2) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1439843069);
        int i3 = (go0Var.m1980f(t81Var) ? 4 : 2) | i2 | (go0Var.m1980f(obj) ? 32 : 16) | (go0Var.m1976d(i) ? 256 : 128) | (go0Var.m1980f(obj2) ? 2048 : 1024);
        if (go0Var.m1958O(i3 & 1, (i3 & 1171) != 1170)) {
            ((cc2) obj).mo742e(obj2, xe1.m6126i0(980966366, new a81(i, t81Var, obj2), go0Var), go0Var, 48);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(t81Var, obj, i, obj2, i2);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m4849t(final C0473mt c0473mt, final in0 in0Var, final xm0 xm0Var, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        int i3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1000435833);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(c0473mt) : go0Var.m1984h(c0473mt) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 256 : 128;
        }
        byte b = 0;
        if (!go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            i3 = i;
            go0Var.m1961R();
        } else {
            if (!c0473mt.m3204n()) {
                go0Var.m1966W(1206003686);
                AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_update_section, go0Var), xe1.m6126i0(-19332289, new C0844we(xm0Var, i4, b), go0Var), go0Var, 384, 1);
                go0Var.m1994p(false);
                b62 b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                    final int i5 = 0;
                    b62VarM1996r.f616d = new mn0() { // from class: xe
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i6 = i5;
                            a83 a83Var = a83.f116a;
                            int i7 = i;
                            xm0 xm0Var2 = xm0Var;
                            in0 in0Var2 = in0Var;
                            C0473mt c0473mt2 = c0473mt;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    AbstractC0691se.m4849t(c0473mt2, in0Var2, xm0Var2, interfaceC0596px2, pp0.m3902N(i7 | 1));
                                    break;
                                default:
                                    AbstractC0691se.m4849t(c0473mt2, in0Var2, xm0Var2, interfaceC0596px2, pp0.m3902N(i7 | 1));
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
            go0Var.m1966W(1206652361);
            go0Var.m1994p(false);
            AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_update_available, go0Var), xe1.m6126i0(-1640290950, new tt0(c0473mt, in0Var, xm0Var), go0Var), go0Var, 384, 1);
        }
        b62 b62VarM1996r2 = go0Var.m1996r();
        if (b62VarM1996r2 != null) {
            final int i6 = 1;
            final int i7 = i3;
            b62VarM1996r2.f616d = new mn0() { // from class: xe
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int i62 = i6;
                    a83 a83Var = a83.f116a;
                    int i72 = i7;
                    xm0 xm0Var2 = xm0Var;
                    in0 in0Var2 = in0Var;
                    C0473mt c0473mt2 = c0473mt;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            AbstractC0691se.m4849t(c0473mt2, in0Var2, xm0Var2, interfaceC0596px2, pp0.m3902N(i72 | 1));
                            break;
                        default:
                            AbstractC0691se.m4849t(c0473mt2, in0Var2, xm0Var2, interfaceC0596px2, pp0.m3902N(i72 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m4850u(String str, Set set, boolean z, final xm0 xm0Var, final in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        int i3;
        xk1 xk1Var;
        str.getClass();
        set.getClass();
        xm0Var.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2129268193);
        int i4 = i | (go0Var.m1980f(str) ? 4 : 2) | (go0Var.m1980f(set) ? 32 : 16) | (go0Var.m1984h(in0Var) ? 16384 : 8192);
        if (go0Var.m1958O(i4 & 1, (i4 & 9363) != 9362)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u("");
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var2 = (xk1) objM1956L;
            boolean z2 = (i4 & 112) == 32;
            Object objM1956L2 = go0Var.m1956L();
            if (z2 || objM1956L2 == c0160eb) {
                objM1956L2 = op0.m3598u(set);
                go0Var.m1981f0(objM1956L2);
            }
            final xk1 xk1Var3 = (xk1) objM1956L2;
            Object objM1956L3 = go0Var.m1956L();
            if (objM1956L3 == c0160eb) {
                objM1956L3 = new kx1(0);
                go0Var.m1981f0(objM1956L3);
            }
            kx1 kx1Var = (kx1) objM1956L3;
            Object objM1956L4 = go0Var.m1956L();
            if (objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(mc3.f6566a);
                go0Var.m1981f0(objM1956L4);
            }
            final xk1 xk1Var4 = (xk1) objM1956L4;
            Integer numValueOf = Integer.valueOf(kx1Var.m2759g());
            Boolean boolValueOf = Boolean.valueOf(z);
            Object objM1956L5 = go0Var.m1956L();
            if (objM1956L5 == c0160eb) {
                i2 = i4;
                objM1956L5 = new qc3(xk1Var4, z, null);
                go0Var.m1981f0(objM1956L5);
            } else {
                i2 = i4;
            }
            AbstractC0179eu.m1457g(numValueOf, boolValueOf, (mn0) objM1956L5, go0Var);
            nc3 nc3Var = (nc3) xk1Var4.getValue();
            lc3 lc3Var = nc3Var instanceof lc3 ? (lc3) nc3Var : null;
            Iterable iterable = lc3Var != null ? lc3Var.f6062a : null;
            if (iterable == null) {
                iterable = be0.f819h;
            }
            boolean zM1980f = go0Var.m1980f(iterable);
            Object objM1956L6 = go0Var.m1956L();
            Object obj = objM1956L6;
            if (zM1980f || objM1956L6 == c0160eb) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((jc3) it.next()).f4964a);
                }
                go0Var.m1981f0(linkedHashSet);
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
                        AbstractC0179eu.m1445Z();
                        throw null;
                    }
                }
                i3 = i5;
            }
            String string = pv2.m3993I0((String) xk1Var2.getValue()).toString();
            boolean zM1980f2 = go0Var.m1980f(iterable) | go0Var.m1980f(string);
            Object objM1956L7 = go0Var.m1956L();
            if (zM1980f2 || objM1956L7 == c0160eb) {
                if (!pv2.m4006s0(string)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        jc3 jc3Var = (jc3) obj2;
                        xk1 xk1Var5 = xk1Var2;
                        if (pv2.m3995h0(jc3Var.f4965b, string, true) || pv2.m3995h0(jc3Var.f4964a, string, true)) {
                            arrayList.add(obj2);
                        }
                        xk1Var2 = xk1Var5;
                    }
                    iterable = arrayList;
                }
                xk1Var = xk1Var2;
                go0Var.m1981f0(iterable);
                objM1956L7 = iterable;
            } else {
                xk1Var = xk1Var2;
            }
            final int i6 = i3;
            qp0.m4249d(true, xm0Var, null, str, null, xe1.m6126i0(-338228546, new nn0() { // from class: oc3
                @Override // p000.nn0
                /* JADX INFO: renamed from: e */
                public final Object mo489e(Object obj3, Object obj4, Object obj5) {
                    pb2 pb2Var = (pb2) obj3;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    pb2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((go0) interfaceC0596px2).m1980f(pb2Var) ? 4 : 2;
                    }
                    go0 go0Var2 = (go0) interfaceC0596px2;
                    if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                        AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.m3843a(pb2Var), false, 0, go0Var2, 0, 56);
                        String strM4463Q = rg3.m4463Q(R.string.wechat_contact_selector_confirm_count, new Object[]{Integer.valueOf(i6)}, go0Var2);
                        boolean z3 = ((nc3) xk1Var4.getValue()) instanceof lc3;
                        uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
                        in0 in0Var2 = in0Var;
                        boolean zM1980f3 = go0Var2.m1980f(in0Var2);
                        xk1 xk1Var6 = xk1Var3;
                        boolean zM1980f4 = zM1980f3 | go0Var2.m1980f(xk1Var6);
                        Set set4 = set2;
                        boolean zM1984h = zM1980f4 | go0Var2.m1984h(set4);
                        Object objM1956L8 = go0Var2.m1956L();
                        if (zM1984h || objM1956L8 == C0520nx.f7360a) {
                            objM1956L8 = new C0678s1(in0Var2, set4, xk1Var6, 17);
                            go0Var2.m1981f0(objM1956L8);
                        }
                        AbstractC0691se.m4846q(strM4463Q, (xm0) objM1956L8, uh1VarM3843a, z3, 0, go0Var2, 0, 48);
                    } else {
                        go0Var2.m1961R();
                    }
                    return a83.f116a;
                }
            }, go0Var), xe1.m6126i0(-1537231819, new C0350jh((List) objM1956L7, xk1Var3, xk1Var, xk1Var4, kx1Var, 2), go0Var), go0Var, 1769526 | ((i2 << 9) & 7168), 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new qp1(str, set, z, xm0Var, in0Var, i);
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m4851v(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return ((Boolean) f10070c.get()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m4852w(gb0 gb0Var, long j) {
        if (!gb0Var.f10757h.f10770u) {
            return false;
        }
        qz0 qz0Var = (qz0) sp0.m4933c0(gb0Var).f9372M.f12033d;
        if (!qz0Var.f9293Y.f10770u) {
            return false;
        }
        long jMo646M = qz0Var.mo646M(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo646M >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo646M & 4294967295L));
        long j2 = gb0Var.f3384x;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX INFO: renamed from: x */
    public static final void m4853x(yj1 yj1Var, int i) {
        if (yj1Var.f13491b == 0 || !(yj1Var.m6283c(0) == i || yj1Var.m6283c(yj1Var.f13491b - 1) == i)) {
            int i2 = yj1Var.f13491b;
            yj1Var.m6281a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iM6283c = yj1Var.m6283c(i3);
                if (i <= iM6283c) {
                    break;
                }
                yj1Var.m6285e(i2, iM6283c);
                i2 = i3;
            }
            yj1Var.m6285e(i2, i);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m4854y(StringBuilder sb, Object obj, in0 in0Var) {
        if (in0Var != null) {
            sb.append((CharSequence) in0Var.mo5j(obj));
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

    /* JADX INFO: renamed from: z */
    public static void m4855z(long j, C0209fn c0209fn, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            C0676s.m4651j("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C0505no) arrayList4.get(i8)).mo3322a() < i7) {
                C0676s.m4651j("Failed requirement.");
                return;
            }
        }
        C0505no c0505no = (C0505no) arrayList.get(i2);
        C0505no c0505no2 = (C0505no) arrayList4.get(i3 - 1);
        if (i7 == c0505no.mo3322a()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            C0505no c0505no3 = (C0505no) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c0505no = c0505no3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c0505no.mo3325d(i7) == c0505no2.mo3325d(i7)) {
            int iMin = Math.min(c0505no.mo3322a(), c0505no2.mo3322a());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && c0505no.mo3325d(i11) == c0505no2.mo3325d(i11); i11++) {
                i10++;
            }
            long j3 = (c0209fn.f3068i / 4) + j + 2 + ((long) i10) + 1;
            c0209fn.m1673H(-i10);
            c0209fn.m1673H(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c0209fn.m1673H(c0505no.mo3325d(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((C0505no) arrayList4.get(i4)).mo3322a()) {
                    c0209fn.m1673H(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C0676s.m4653l("Check failed.");
                    return;
                }
            }
            C0209fn c0209fn2 = new C0209fn();
            c0209fn.m1673H(((int) ((c0209fn2.f3068i / 4) + j3)) * (-1));
            m4855z(j3, c0209fn2, i12, arrayList4, i4, i3, arrayList5);
            c0209fn.m1669D(c0209fn2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C0505no) arrayList4.get(i14 - 1)).mo3325d(i7) != ((C0505no) arrayList4.get(i14)).mo3325d(i7)) {
                i13++;
            }
        }
        long j4 = (c0209fn.f3068i / 4) + j + 2 + ((long) (i13 * 2));
        c0209fn.m1673H(i13);
        c0209fn.m1673H(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iMo3325d = ((C0505no) arrayList4.get(i15)).mo3325d(i7);
            if (i15 == i4 || iMo3325d != ((C0505no) arrayList4.get(i15 - 1)).mo3325d(i7)) {
                c0209fn.m1673H(iMo3325d & 255);
            }
        }
        C0209fn c0209fn3 = new C0209fn();
        int i16 = i4;
        while (i16 < i3) {
            byte bMo3325d = ((C0505no) arrayList4.get(i16)).mo3325d(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bMo3325d != ((C0505no) arrayList4.get(i18)).mo3325d(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((C0505no) arrayList4.get(i16)).mo3322a()) {
                c0209fn.m1673H(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                c0209fn.m1673H(((int) ((c0209fn3.f3068i / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                m4855z(j2, c0209fn3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        c0209fn.m1669D(c0209fn3);
    }
}
