package androidx.lifecycle;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import bsh.org.objectweb.asm.Opcodes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import p020b5.C0184c;
import p023b8.AbstractC0213k;
import p023b8.C0206d;
import p023b8.C0207e;
import p023b8.C0208f;
import p023b8.C0209g;
import p023b8.C0210h;
import p023b8.InterfaceC0204b;
import p025bc.AbstractC0255e;
import p033c6.C0403a;
import p033c6.C0404b;
import p046d6.C0709f;
import p068eh.AbstractC0921a;
import p069f.C0945l0;
import p071f1.AbstractC1004g0;
import p071f1.AbstractC1018n0;
import p071f1.InterfaceC1031u;
import p075f6.AbstractC1078e;
import p085fg.InterfaceC1220a;
import p091g3.C1315j;
import p091g3.RunnableC1309g;
import p099h.AbstractC1460g1;
import p099h.C1491v0;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p103h3.C1578g;
import p103h3.C1579h;
import p109hb.C1671c;
import p116i.AbstractC1777o1;
import p116i.AbstractC1781q;
import p116i.C1734a0;
import p116i.C1784r;
import p116i.InterfaceC1783q1;
import p116i.InterfaceC1805z;
import p117i0.AbstractC1861n1;
import p117i0.AbstractC1863o;
import p117i0.AbstractC1874r;
import p117i0.C1830f2;
import p117i0.C1890w0;
import p117i0.C1899z0;
import p125i8.C2005i;
import p136j8.C2104o;
import p136j8.EnumC2099j;
import p136j8.InterfaceC2101l;
import p136j8.InterfaceC2106q;
import p158l.AbstractC2412c;
import p218og.AbstractC3149m;
import p257r7.C3731u;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p283t5.InterfaceC4121d;
import p293u2.C4240j;
import p293u2.C4241k;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p295u4.C4252b;
import p295u4.InterfaceC4251a;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p332wb.AbstractC4855en;
import p358y2.InterfaceC5965b0;
import p363y7.AbstractC5999a;
import p376z4.C6093g;
import p379z7.C6107c;
import p379z7.C6116l;
import p379z7.InterfaceC6123s;
import sg.InterfaceC3975g;
import sg.InterfaceC3984p;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0119x implements InterfaceC6123s, InterfaceC1783q1, InterfaceC4251a, InterfaceC2101l, InterfaceC5965b0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f309g;

    /* JADX INFO: renamed from: h */
    public Object f310h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r10
  0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0119x(int[] iArr, float[] fArr, float[][] fArr2) {
        int i9;
        this.f309g = 18;
        int i10 = 1;
        int length = fArr.length - 1;
        C1784r[][] c1784rArr = new C1784r[length][];
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            int i14 = iArr[i13];
            int i15 = 3;
            if (i14 == 0) {
                i9 = i15;
            } else if (i14 == i10) {
                i11 = i10;
                i9 = i11;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        i15 = 4;
                        if (i14 != 4) {
                            i15 = 5;
                            if (i14 != 5) {
                                i9 = i12;
                            }
                        }
                    } else {
                        if (i11 == i10) {
                        }
                        i9 = i11;
                    }
                }
                i11 = 2;
                i9 = i11;
            }
            float[] fArr3 = fArr2[i13];
            int i16 = i13 + 1;
            float[] fArr4 = fArr2[i16];
            float f3 = fArr[i13];
            float f10 = fArr[i16];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C1784r[] c1784rArr2 = new C1784r[length2];
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17 * 2;
                int i19 = i17;
                int i20 = i18 + 1;
                c1784rArr2[i19] = new C1784r(i9, f3, f10, fArr3[i18], fArr3[i20], fArr4[i18], fArr4[i20]);
                i17 = i19 + 1;
            }
            c1784rArr[i13] = c1784rArr2;
            i13 = i16;
            i12 = i9;
            i10 = 1;
        }
        this.f310h = c1784rArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m563A(Activity activity, Intent intent) {
        Object c3959f;
        try {
            Intent intentCreateChooser = Intent.createChooser(intent, "分享消息");
            intentCreateChooser.addFlags(1);
            activity.startActivity(intentCreateChooser);
            c3959f = null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = "没有可用的分享应用";
        }
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m564C(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.contains("attachment") || lowerCase.contains("appattach") || lowerCase.contains("app_attach");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static String m565R(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strTrim = str.trim();
        return strTrim.endsWith("@app") ? AbstractC4855en.m9262f(4, 0, strTrim) : strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static void m566X(Object obj, String str, Object obj2) {
        if (obj == null) {
            return;
        }
        try {
            KavaReflector.writeField(KavaReflector.findField(obj.getClass(), str), obj, obj2);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static String m567a0(Activity activity, String str, String str2) {
        if (AbstractC3149m.m6721t0(str)) {
            return str2;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        return m563A(activity, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m568h(Object obj, Object[][] objArr) {
        if (obj == null || objArr == null) {
            return;
        }
        for (Object[] objArr2 : objArr) {
            if (objArr2 != null && objArr2.length >= 2) {
                Object obj2 = objArr2[0];
                String str = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = objArr2[1];
                EnumC2099j enumC2099j = EnumC2099j.f7026g;
                if (obj3 == null || (((obj3 instanceof String) && TextUtils.isEmpty((String) obj3)) || ((obj3 instanceof byte[]) && ((byte[]) obj3).length == 0))) {
                    obj3 = enumC2099j;
                }
                if (str != null && obj3 != enumC2099j) {
                    m566X(obj, str, obj3);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C0119x[] m569k(String str, C3731u c3731u) {
        int iMo869e;
        int length = str.length();
        int i9 = length + 1;
        C0119x[] c0119xArr = new C0119x[i9];
        for (int i10 = 0; i10 < length; i10++) {
            C0119x c0119x = new C0119x(4);
            ((C6107c) c0119x.f310h).add(new C0209g(2, str.charAt(i10), null));
            c0119xArr[i10] = c0119x;
        }
        c0119xArr[length] = new C0119x(4);
        Iterator it = c3731u.iterator();
        while (it.hasNext()) {
            InterfaceC0204b interfaceC0204b = (InterfaceC0204b) it.next();
            int iMo870f = interfaceC0204b.mo870f();
            if (iMo870f < i9 && (iMo869e = interfaceC0204b.mo869e()) < i9) {
                C0119x c0119x2 = c0119xArr[iMo870f];
                if (iMo870f >= iMo869e) {
                    c0119x2.getClass();
                    ((C6107c) c0119x2.f310h).add(new C0209g(0, (char) 0, interfaceC0204b));
                } else {
                    c0119x2.getClass();
                    ((C6107c) c0119x2.f310h).add(new C0209g(1, (char) 0, interfaceC0204b));
                    C0119x c0119x3 = c0119xArr[iMo869e];
                    c0119x3.getClass();
                    ((C6107c) c0119x3.f310h).add(new C0209g(3, (char) 0, interfaceC0204b));
                }
            }
        }
        return c0119xArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m570p(String str) {
        return TextUtils.isEmpty(str) ? HttpUrl.FRAGMENT_ENCODE_SET : str.endsWith("/") ? str : str.concat("/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static Object[][] m571q(Object... objArr) {
        if (objArr.length == 0) {
            return (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);
        }
        int length = objArr.length / 2;
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, length, 2);
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            objArr2[i9][0] = objArr[i10];
            objArr2[i9][1] = objArr[i10 + 1];
        }
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public void m572B(String str) {
        C2005i.m4939f("[WeChatFileApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public Object m573D(String str, Object[][] objArr, Object[][] objArr2) {
        Method method = ((DexFinder) this.f310h).sendFileMethod;
        if (method == null) {
            m572B("创建媒体消息失败: sendFileMethod未就绪");
            return null;
        }
        try {
            Class<?> clsLoadClass = KavaReflector.loadClass(str, method.getDeclaringClass().getClassLoader());
            if (clsLoadClass == null) {
                m572B("创建媒体消息失败: 未找到 ".concat(str));
                return null;
            }
            Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(clsLoadClass, new Class[0]), new Object[0]);
            if (objNewInstance == null) {
                objNewInstance = KavaReflector.newInstanceByArgs(clsLoadClass, new Object[0]);
            }
            if (objNewInstance == null) {
                objNewInstance = null;
            } else {
                m568h(objNewInstance, objArr);
            }
            if (objNewInstance != null) {
                return m576G(method, objNewInstance, objArr2);
            }
            m572B("创建媒体消息失败: 构造mediaObject失败 ".concat(str));
            return null;
        } catch (Throwable th2) {
            m572B("创建媒体消息异常: " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public Object m574E(Class cls, String str) {
        try {
            return KavaReflector.newInstance(KavaReflector.findConstructor(cls, String.class), str);
        } catch (Throwable unused) {
            try {
                Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0]);
                m566X(objNewInstance, "filePath", str);
                return objNewInstance;
            } catch (Throwable th2) {
                m572B("创建WXFileObject异常: " + th2.getMessage());
                return null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public Object m575F(Method method, File file, String str) {
        Object objNewInstance;
        try {
            ClassLoader classLoader = method.getDeclaringClass().getClassLoader();
            Class<?> cls = method.getParameterTypes()[0];
            Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.opensdk.modelmsg.WXFileObject", classLoader);
            Object objM574E = m574E(clsLoadClass, file.getAbsolutePath());
            if (objM574E == null) {
                return null;
            }
            Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(cls).iterator();
            while (true) {
                if (!it.hasNext()) {
                    objNewInstance = null;
                    break;
                }
                Constructor<?> next = it.next();
                Class<?>[] parameterTypes = next.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(clsLoadClass)) {
                    objNewInstance = KavaReflector.newInstance(next, objM574E);
                    break;
                }
            }
            if (objNewInstance == null) {
                objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0]);
                m566X(objNewInstance, "mediaObject", objM574E);
            }
            if (TextUtils.isEmpty(str)) {
                str = file.getName();
            }
            if (str != null && str.length() > 512) {
                str = str.substring(0, Opcodes.ACC_INTERFACE);
            }
            m566X(objNewInstance, "title", str);
            if (!TextUtils.isEmpty(HttpUrl.FRAGMENT_ENCODE_SET)) {
                m566X(objNewInstance, "description", HttpUrl.FRAGMENT_ENCODE_SET);
            }
            return objNewInstance;
        } catch (Throwable th2) {
            m572B("创建WXMediaMessage异常: " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public Object m576G(Method method, Object obj, Object[][] objArr) {
        Object objNewInstance;
        if (method != null) {
            try {
                Class<?> cls = method.getParameterTypes()[0];
                Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(cls).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objNewInstance = null;
                        break;
                    }
                    Constructor<?> next = it.next();
                    Class<?>[] parameterTypes = next.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(obj.getClass())) {
                        objNewInstance = KavaReflector.newInstance(next, obj);
                        break;
                    }
                }
                if (objNewInstance == null) {
                    objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0]);
                    m566X(objNewInstance, "mediaObject", obj);
                }
                m568h(objNewInstance, objArr);
                return objNewInstance;
            } catch (Throwable th2) {
                m572B("构造WXMediaMessage失败: " + th2.getMessage());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public boolean mo577H(int i9, int i10, Bundle bundle) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public File m578I(Method method, File file) {
        boolean zEquals;
        try {
            String strM608o = m608o(method.getDeclaringClass());
            if (!TextUtils.isEmpty(strM608o)) {
                Class<?> declaringClass = method.getDeclaringClass();
                String name = file.getName();
                String name2 = file.getName();
                String strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
                if (!TextUtils.isEmpty(name2)) {
                    int iMax = Math.max(name2.lastIndexOf(47), name2.lastIndexOf(92));
                    int iLastIndexOf = name2.lastIndexOf(46);
                    if (iLastIndexOf > iMax && iLastIndexOf < name2.length() - 1) {
                        strSubstring = name2.substring(iLastIndexOf + 1);
                    }
                }
                String strM603i = m603i(declaringClass, strM608o, name, strSubstring);
                if (TextUtils.isEmpty(strM603i)) {
                    strM603i = m570p(strM608o) + file.getName();
                }
                File file2 = new File(strM603i);
                try {
                    zEquals = file.getCanonicalPath().equals(file2.getCanonicalPath());
                } catch (Throwable unused) {
                    zEquals = file.getAbsolutePath().equals(file2.getAbsolutePath());
                }
                if (!zEquals) {
                    if (m604j(file, file2)) {
                        return file2;
                    }
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            m572B("准备附件异常: " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public int m579J(int i9) {
        byte[] bArr = (byte[]) this.f310h;
        return (bArr[i9 + 3] << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public long m580K(int i9) {
        byte[] bArr = (byte[]) this.f310h;
        return ((long) ((bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16))) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48) | (((long) bArr[i9 + 7]) << 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public int m581L(int i9) {
        byte[] bArr = (byte[]) this.f310h;
        int i10 = (bArr[i9 + 3] << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        if (i10 >= -1) {
            return i10;
        }
        throw new C0709f(null, "Encountered optional uint that is out of range at offset 0x%x", Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public int m582M(int i9) {
        byte[] bArr = (byte[]) this.f310h;
        return (bArr[i9 + 1] << 8) | (bArr[i9] & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public int m583N(int i9) {
        byte[] bArr = (byte[]) this.f310h;
        int i10 = (bArr[i9 + 3] << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        if (i10 >= 0) {
            return i10;
        }
        throw new C0709f(null, "Encountered small uint that is out of range at offset 0x%x", Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public int m584O(int i9) {
        return ((byte[]) this.f310h)[i9] & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public int m585P(int i9) {
        byte[] bArr = (byte[]) this.f310h;
        return ((bArr[i9 + 1] & 255) << 8) | (bArr[i9] & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m586Q(InterfaceC3975g interfaceC3975g, InterfaceC1220a interfaceC1220a) {
        C1830f2 c1830f2;
        InterfaceC3984p interfaceC3984p;
        int i9;
        if (((AbstractC1018n0) this.f310h) == null) {
            AbstractC1861n1.m4584b("Called runAndWatch on a manager that has been disposed of");
        }
        AbstractC1018n0 abstractC1018n0 = (AbstractC1018n0) this.f310h;
        if ((abstractC1018n0 instanceof C1830f2) && (interfaceC3984p = (c1830f2 = (C1830f2) abstractC1018n0).f6068l) != null && !interfaceC3984p.equals(interfaceC3975g)) {
            C1899z0 c1899z0 = new C1899z0();
            InterfaceC3984p interfaceC3984p2 = c1830f2.f6068l;
            if (interfaceC3984p2 == null) {
                AbstractC1861n1.m4584b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            C0945l0 c0945l0 = c1830f2.f6066j;
            ArrayList arrayList = c1899z0.f6329i;
            if (c0945l0 == null) {
                Object obj = c1830f2.f6064h;
                obj.getClass();
                arrayList.add(new C1890w0(obj, interfaceC3984p2));
            } else {
                Object[] objArr = c0945l0.f2976b;
                long[] jArr = c0945l0.f2975a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j3 & 255) < 128) {
                                    i9 = i11;
                                    arrayList.add(new C1890w0(objArr[(i10 << 3) + i13], interfaceC3984p2));
                                } else {
                                    i9 = i11;
                                }
                                j3 >>= i9;
                                i13++;
                                i11 = i9;
                            }
                            if (i12 != i11) {
                                break;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
            c1899z0.mo2621h();
            c1830f2.mo2622j();
            this.f310h = c1899z0;
        }
        AbstractC1018n0 abstractC1018n02 = (AbstractC1018n0) this.f310h;
        abstractC1018n02.getClass();
        AbstractC4655f abstractC4655fMo9090u = AbstractC4662m.m9129j().mo9090u(abstractC1018n02.mo2625n(interfaceC3975g));
        abstractC1018n02.mo2620g(interfaceC3975g);
        try {
            AbstractC4655f abstractC4655fM9110j = abstractC4655fMo9090u.m9110j();
            try {
                Object objInvoke = interfaceC1220a.invoke();
                abstractC4655fMo9090u.mo9086c();
                abstractC1018n02.mo2621h();
                return objInvoke;
            } finally {
                AbstractC4655f.m9106q(abstractC4655fM9110j);
            }
        } catch (Throwable th2) {
            abstractC4655fMo9090u.mo9086c();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public void m587S(float f3, float f10, long j3) {
        InterfaceC1031u interfaceC1031uM819p = ((C0184c) this.f310h).m819p();
        int i9 = (int) (j3 >> 32);
        int i10 = (int) (j3 & 4294967295L);
        interfaceC1031uM819p.mo2494m(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
        interfaceC1031uM819p.mo2484b(f3, f10);
        interfaceC1031uM819p.mo2494m(-Float.intBitsToFloat(i9), -Float.intBitsToFloat(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public boolean m588T(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m572B("发送文件失败: talker/filePath为空");
            return false;
        }
        File file = new File(str2);
        if (!file.isFile()) {
            m572B("发送文件失败: 文件不存在 " + str2);
            return false;
        }
        Method method = ((DexFinder) this.f310h).sendFileMethod;
        if (method == null) {
            m572B("发送文件失败: API未就绪");
            return false;
        }
        try {
            File fileM578I = m578I(method, file);
            if (fileM578I != null && fileM578I.isFile()) {
                Object objM575F = m575F(method, fileM578I, str3);
                if (objM575F == null) {
                    m572B("发送文件失败: WXMediaMessage创建失败");
                    return false;
                }
                Object objInvoke = KavaReflector.invoke(method, null, objM575F, "wx4310bbd51be7d979", "WeChat", str, 2, "Hchat_file_" + System.currentTimeMillis());
                if (!(objInvoke instanceof Number) || ((Number) objInvoke).intValue() >= 0) {
                    return true;
                }
                m572B("发送文件失败: AppMsgLogic返回 " + objInvoke + " talker=" + str + " size=" + fileM578I.length() + " attach=" + fileM578I.getAbsolutePath());
                return false;
            }
            m572B("发送文件失败: 准备附件失败");
            return false;
        } catch (Throwable th2) {
            m572B("发送文件异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public boolean m589U(Object obj, String str, String str2) {
        if (TextUtils.isEmpty(str) || obj == null) {
            m572B("发送媒体消息失败: talker/mediaMessage为空");
            return false;
        }
        Method method = ((DexFinder) this.f310h).sendFileMethod;
        if (method == null) {
            m572B("发送媒体消息失败: API未就绪");
            return false;
        }
        try {
            if (!method.getParameterTypes()[0].isInstance(obj)) {
                m572B("发送媒体消息失败: mediaMessage类型不匹配 ".concat(obj.getClass().getName()));
                return false;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "wx4310bbd51be7d979";
            }
            Object objInvoke = KavaReflector.invoke(method, null, obj, str2, "WeChat", str, 2, "Hchat_media_" + System.currentTimeMillis());
            if (!(objInvoke instanceof Number) || ((Number) objInvoke).intValue() >= 0) {
                return true;
            }
            m572B("发送媒体消息失败: AppMsgLogic返回 " + objInvoke + " talker=" + str);
            return false;
        } catch (Throwable th2) {
            m572B("发送媒体消息异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public void m590V(C0184c c0184c) throws IOException {
        C0207e c0207e = (C0207e) c0184c.f469a;
        C6107c c6107c = (C6107c) this.f310h;
        c6107c.sort(AbstractC5999a.f24365a);
        int size = c6107c.size();
        for (int i9 = 0; i9 < size; i9++) {
            C0209g c0209g = (C0209g) c6107c.f24642g[i9];
            InterfaceC0204b interfaceC0204b = c0209g.f516i;
            int i10 = c0209g.f514g;
            if (i10 == 2) {
                String strValueOf = String.valueOf(c0209g.f515h);
                C0210h c0210hMo879o = (C0210h) c0184c.f471c;
                if (c0210hMo879o == null) {
                    AbstractC0213k abstractC0213k = (C0208f) c0184c.f470b;
                    if (abstractC0213k == null) {
                        abstractC0213k = c0207e;
                    }
                    c0210hMo879o = abstractC0213k.mo879o();
                    c0184c.f471c = c0210hMo879o;
                }
                if (strValueOf != null) {
                    if (c0210hMo879o.f517h.length() == 0) {
                        c0210hMo879o.f517h = strValueOf;
                    } else {
                        c0210hMo879o.f517h = c0210hMo879o.f517h.concat(strValueOf);
                    }
                }
            } else if (i10 == 0) {
                C0208f c0208fMo872l = interfaceC0204b.mo872l();
                String str = c0208fMo872l.f512l;
                c0184c.f471c = null;
                AbstractC0213k abstractC0213k2 = (C0208f) c0184c.f470b;
                if (abstractC0213k2 == null) {
                    abstractC0213k2 = c0207e;
                }
                C0208f c0208fMo878n = abstractC0213k2.mo878n();
                c0208fMo878n.m886t(str);
                c0184c.f470b = c0208fMo878n;
                C6116l c6116l = new C6116l(new C0119x(c0208fMo872l, 3));
                while (c6116l.hasNext()) {
                    ((C0206d) c6116l.next()).m877o(c0184c);
                }
                c0184c.m813j(str);
            } else if (i10 == 1) {
                C0208f c0208fMo872l2 = interfaceC0204b.mo872l();
                String str2 = c0208fMo872l2.f512l;
                c0184c.f471c = null;
                AbstractC0213k abstractC0213k3 = (C0208f) c0184c.f470b;
                if (abstractC0213k3 == null) {
                    abstractC0213k3 = c0207e;
                }
                C0208f c0208fMo878n2 = abstractC0213k3.mo878n();
                c0208fMo878n2.m886t(str2);
                c0184c.f470b = c0208fMo878n2;
                C6116l c6116l2 = new C6116l(new C0119x(c0208fMo872l2, 3));
                while (c6116l2.hasNext()) {
                    ((C0206d) c6116l2.next()).m877o(c0184c);
                }
            } else {
                if (i10 != 3) {
                    C2104o.m5299y(AbstractC0921a.m2249l(i10, "Unknown span event: "));
                    return;
                }
                c0184c.m813j(interfaceC0204b.getTagName());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public void m591W(C4241k c4241k) {
        ((Region) this.f310h).set(c4241k.f13914a, c4241k.f13915b, c4241k.f13916c, c4241k.f13917d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public String m592Y(Activity activity, List list, String str, String str2) {
        Method methodFindMethod;
        if (list.isEmpty()) {
            return "分享文件不存在";
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Class<?> clsLoadClass = KavaReflector.loadClass("android.support.v4.content.FileProvider", ((C3742g) this.f310h).f12145c);
            Uri uri = null;
            if (clsLoadClass != null && (methodFindMethod = KavaReflector.findMethod(clsLoadClass, "getUriForFile", Context.class, String.class, File.class)) != null) {
                Object objInvoke = KavaReflector.invoke(methodFindMethod, null, activity, AbstractC0255e.m1020i(activity.getPackageName(), ".external.fileprovider"), file);
                if (objInvoke instanceof Uri) {
                    uri = (Uri) objInvoke;
                }
            }
            if (uri == null) {
                return "无法生成分享文件地址";
            }
            arrayList.add(uri);
        }
        boolean z9 = arrayList.size() > 1;
        Intent intent = new Intent(z9 ? "android.intent.action.SEND_MULTIPLE" : "android.intent.action.SEND");
        intent.setType(str);
        if (z9) {
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(arrayList));
        } else {
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) AbstractC4166m.m8422t1(arrayList));
        }
        if (!AbstractC3149m.m6721t0(str2)) {
            intent.putExtra("android.intent.extra.TEXT", str2);
        }
        ClipData clipDataNewUri = ClipData.newUri(activity.getContentResolver(), ((File) AbstractC4166m.m8422t1(list)).getName(), (Uri) AbstractC4166m.m8422t1(arrayList));
        int size = arrayList.size();
        for (int i9 = 1; i9 < size; i9++) {
            clipDataNewUri.addItem(new ClipData.Item((Uri) arrayList.get(i9)));
        }
        intent.setClipData(clipDataNewUri);
        intent.addFlags(1);
        return m563A(activity, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public boolean m593Z(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte[] bArr, String str8) {
        Object objM573D = m573D("com.tencent.mm.opensdk.modelmsg.WXMusicObject", m571q("musicUrl", str4, "musicDataUrl", str5, "songLyric", str6, "songAlbumUrl", str7), m571q("title", str2, "description", str3, "thumbData", bArr));
        return objM573D != null && m589U(objM573D, str, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1783q1, p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: a */
    public boolean mo594a() {
        ((C1671c) this.f310h).getClass();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: b */
    public long mo595b(AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return ((C1671c) this.f310h).mo595b(abstractC1781q, abstractC1781q2, abstractC1781q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public void mo596b0() {
        View viewFindViewById;
        View view = (View) this.f310h;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC1309g(viewFindViewById, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2101l
    /* JADX INFO: renamed from: c */
    public void mo597c(String str) {
        ((InterfaceC2106q) this.f310h).mo808c(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public void m598c0(float f3, float f10) {
        ((C0184c) this.f310h).m819p().mo2494m(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4251a
    /* JADX INFO: renamed from: d */
    public void mo599d(C4252b c4252b) {
        ((C6093g) this.f310h).m10844l(c4252b.f13930a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p358y2.InterfaceC5965b0
    /* JADX INFO: renamed from: e */
    public long mo600e(C4241k c4241k, long j3, EnumC4243m enumC4243m, long j4) {
        long j5 = ((C4240j) ((InterfaceC1220a) this.f310h).invoke()).f13912a;
        return (((long) AbstractC2412c.m5750a(c4241k.f13914a + ((int) (j5 >> 32)), (int) (j4 >> 32), (int) (j3 >> 32), enumC4243m == EnumC4243m.f13919g)) << 32) | (((long) AbstractC2412c.m5750a(c4241k.f13915b + ((int) (j5 & 4294967295L)), (int) (j4 & 4294967295L), (int) (j3 & 4294967295L), true)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: g */
    public AbstractC1781q mo602g(AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return ((C1671c) this.f310h).mo602g(abstractC1781q, abstractC1781q2, abstractC1781q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.InterfaceC6123s
    public Object get(int i9) {
        return (C0206d) ((C0208f) this.f310h).f511k.f24642g[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m603i(Class cls, String str, String str2, String str3) {
        String str4;
        Object objInvoke;
        Method method = ((DexFinder) this.f310h).sendFileAttachPathMethod;
        if (method == null) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            try {
                Object objInvoke2 = KavaReflector.invoke(method, null, m570p(str), str2, str3);
                if (objInvoke2 instanceof String) {
                    str4 = (String) objInvoke2;
                }
            } catch (Throwable unused) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            return str4;
        }
        try {
            for (Method method2 : KavaReflector.declaredMethods(cls)) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (KavaReflector.isStatic(method2) && method2.getReturnType() == String.class && parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == String.class) {
                    try {
                        objInvoke = KavaReflector.invoke(method2, null, m570p(str), str2, str3);
                    } catch (Throwable unused2) {
                    }
                    String str5 = objInvoke instanceof String ? (String) objInvoke : HttpUrl.FRAGMENT_ENCODE_SET;
                    if (!TextUtils.isEmpty(str5)) {
                        return str5;
                    }
                }
            }
        } catch (Throwable unused3) {
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m604j(File file, File file2) {
        FileOutputStream fileOutputStream;
        File parentFile;
        FileInputStream fileInputStream = null;
        try {
            parentFile = file2.getParentFile();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
                return false;
            }
            if (file2.isFile() && file2.length() == file.length()) {
                return true;
            }
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i9 = fileInputStream2.read(bArr);
                        if (i9 <= 0) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i9);
                    }
                    fileOutputStream2.flush();
                    try {
                        fileInputStream2.close();
                    } catch (Throwable unused) {
                    }
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (Throwable unused2) {
                        return true;
                    }
                } catch (Throwable th3) {
                    fileOutputStream = fileOutputStream2;
                    th = th3;
                    fileInputStream = fileInputStream2;
                    m572B("复制附件异常: " + th.getMessage());
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    return false;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
            m572B("复制附件异常: " + th.getMessage());
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused3) {
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return false;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public C1578g mo605l(int i9) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m606m() {
        ((AbstractC1863o) this.f310h).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: n */
    public AbstractC1781q mo607n(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return ((C1671c) this.f310h).mo607n(j3, abstractC1781q, abstractC1781q2, abstractC1781q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m608o(Class cls) {
        String str;
        Object objInvoke;
        Method method = ((DexFinder) this.f310h).sendFileAttachDirMethod;
        if (method == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            try {
                Object objInvoke2 = KavaReflector.invoke(method, null, new Object[0]);
                if (objInvoke2 instanceof String) {
                    str = (String) objInvoke2;
                }
            } catch (Throwable unused) {
            }
        }
        if (m564C(str)) {
            return m570p(str);
        }
        try {
        } catch (Throwable unused2) {
        }
        for (Method method2 : KavaReflector.declaredMethods(cls)) {
            if (KavaReflector.isStatic(method2) && method2.getReturnType() == String.class && method2.getParameterTypes().length == 0) {
                try {
                    objInvoke = KavaReflector.invoke(method2, null, new Object[0]);
                } catch (Throwable unused3) {
                }
                String str2 = objInvoke instanceof String ? (String) objInvoke : HttpUrl.FRAGMENT_ENCODE_SET;
                if (m564C(str2)) {
                    return m570p(str2);
                }
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2101l
    public void onSuccess(File file) {
        ((InterfaceC2106q) this.f310h).onSuccess(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public C1578g mo609r(int i9) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.InterfaceC6122r
    public int size() {
        return ((C0208f) this.f310h).f511k.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public InterfaceC1805z m610t(int i9) {
        switch (this.f309g) {
            case 19:
                return ((C1734a0[]) this.f310h)[i9];
            case 20:
                return (C1734a0) this.f310h;
            default:
                return (InterfaceC1805z) this.f310h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public int m611u(int i9) {
        if (i9 >= 0) {
            int[] iArr = (int[]) this.f310h;
            if (i9 < iArr.length) {
                return iArr[i9];
            }
        }
        throw new C0403a(null, "Instruction index out of bounds: %d", Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: w */
    public AbstractC1781q mo612w(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return ((C1671c) this.f310h).mo612w(j3, abstractC1781q, abstractC1781q2, abstractC1781q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public int m613x(int i9, boolean z9) {
        int iBinarySearch = Arrays.binarySearch((int[]) this.f310h, i9);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        if (z9) {
            throw new C0404b(null, "No instruction at offset %d", Integer.valueOf(i9));
        }
        return (~iBinarySearch) - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public void mo614y() {
        View view = (View) this.f310h;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void m615z(float f3, float f10, float f11, float f12) {
        C0184c c0184c = (C0184c) this.f310h;
        InterfaceC1031u interfaceC1031uM819p = c0184c.m819p();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0184c.m825v() >> 32)) - (f11 + f3);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0184c.m825v() & 4294967295L)) - (f12 + f10))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            AbstractC1004g0.m2560a("Width and height must be greater than or equal to zero");
        }
        c0184c.m803U(jFloatToRawIntBits);
        interfaceC1031uM819p.mo2494m(f3, f10);
    }

    public /* synthetic */ C0119x(Object obj, int i9) {
        this.f309g = i9;
        this.f310h = obj;
    }

    public C0119x(C3742g c3742g) {
        this.f309g = 7;
        c3742g.getClass();
        this.f310h = c3742g;
    }

    public C0119x(InterfaceC4233c interfaceC4233c) {
        this.f309g = 15;
        this.f310h = new C1491v0(AbstractC1460g1.f4851a, interfaceC4233c);
    }

    public C0119x(int i9) {
        this.f309g = i9;
        switch (i9) {
            case 8:
                this.f310h = AbstractC1874r.m4639u(Boolean.FALSE);
                break;
            case 11:
                this.f310h = new Region();
                break;
            case 12:
                this.f310h = new ArrayDeque();
                break;
            case 17:
                this.f310h = new C1579h(this);
                break;
            default:
                this.f310h = new C6107c(0);
                break;
        }
    }

    public C0119x(DexFinder dexFinder, C2104o c2104o) {
        this.f309g = 26;
        this.f310h = dexFinder;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c1.d.e(fg.l):androidx.lifecycle.x, f0.b.invokeSuspend(java.lang.Object):java.lang.Object, f1.p0.a(float, long, f1.h):void] */
    public /* synthetic */ C0119x(int i9, boolean z9) {
        this.f309g = i9;
    }

    public C0119x(AbstractC1078e abstractC1078e) {
        this.f309g = 6;
        this.f310h = new int[abstractC1078e.size()];
        int iMo5877c = 0;
        for (int i9 = 0; i9 < abstractC1078e.size(); i9++) {
            ((int[]) this.f310h)[i9] = iMo5877c;
            iMo5877c += ((InterfaceC4121d) abstractC1078e.get(i9)).mo5877c();
        }
    }

    public C0119x(View view) {
        this.f309g = 14;
        if (Build.VERSION.SDK_INT >= 30) {
            C1315j c1315j = new C1315j(view, 13);
            c1315j.f4384i = view;
            this.f310h = c1315j;
            return;
        }
        this.f310h = new C0119x(view, 13);
    }

    public C0119x(float f3, float f10, AbstractC1781q abstractC1781q) {
        C0119x c0119x;
        this.f309g = 22;
        int[] iArr = AbstractC1777o1.f5921a;
        if (abstractC1781q != null) {
            c0119x = new C0119x(abstractC1781q, f3, f10);
        } else {
            c0119x = new C0119x(f3, f10);
        }
        this.f310h = new C1671c(c0119x);
    }

    public C0119x(AbstractC1781q abstractC1781q, float f3, float f10) {
        this.f309g = 19;
        int iMo4424b = abstractC1781q.mo4424b();
        C1734a0[] c1734a0Arr = new C1734a0[iMo4424b];
        for (int i9 = 0; i9 < iMo4424b; i9++) {
            c1734a0Arr[i9] = new C1734a0(f3, f10, abstractC1781q.mo4423a(i9));
        }
        this.f310h = c1734a0Arr;
    }

    public C0119x(float f3, float f10) {
        this.f309g = 20;
        this.f310h = new C1734a0(f3, f10, 0.01f);
    }

    /* JADX INFO: renamed from: f */
    public void mo601f(int i9, C1578g c1578g, String str, Bundle bundle) {
    }
}
