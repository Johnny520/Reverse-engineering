package p000;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: ju */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0387ju implements db0 {

    /* JADX INFO: renamed from: a */
    public static long f2742a;

    /* JADX INFO: renamed from: b */
    public static Method f2743b;

    public AbstractC0387ju() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: d */
    public static int m1619d(Context context, String str) {
        int iM2597c;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM2598d = AbstractC0844w5.m2598d(str);
            if (strM2598d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && AbstractC0908xw.m2709a(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerM2634c = AbstractC0881x5.m2634c(context);
                    iM2597c = AbstractC0881x5.m2632a(appOpsManagerM2634c, strM2598d, Binder.getCallingUid(), packageName);
                    if (iM2597c == 0) {
                        iM2597c = AbstractC0881x5.m2632a(appOpsManagerM2634c, strM2598d, iMyUid, AbstractC0881x5.m2633b(context));
                    }
                } else {
                    iM2597c = AbstractC0844w5.m2597c((AppOpsManager) AbstractC0844w5.m2595a(context, AppOpsManager.class), strM2598d, packageName);
                }
                if (iM2597c != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m1620e(int i, int i2) {
        if (i2 >= 0) {
            if (i < 0) {
                return 0;
            }
            return i > i2 ? i2 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i2 + " is less than minimum 0.");
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC0259gf m1621f(int i) {
        return i != 0 ? i != 1 ? new o10() : new C0016af() : new o10();
    }

    /* JADX INFO: renamed from: j */
    public static String m1622j(String str) {
        b50.m492a("a2K0DlKZJO57\n", "CQPHa2Std5o=\n");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(m1625n(), b50.m492a("yyCd\n", "imXOJyG4O/g=\n"));
            Cipher cipher = Cipher.getInstance(b50.m492a("rhyd2aCQj0u/Eo2l0IOsAIswoJE=\n", "71nO9uXTzWQ=\n"));
            cipher.init(2, secretKeySpec);
            byte[] bArrDoFinal = cipher.doFinal(Base64.decode(str, 2));
            AbstractC0493mp.m1856f(b50.m492a("Caqr4Sd48lND68Oh\n", "bcXtiEkZnns=\n"), bArrDoFinal);
            return new String(bArrDoFinal, AbstractC0514n9.f3251a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m1623k(String str) {
        AbstractC0493mp.m1857g(b50.m492a("vK96gm3nDQ==\n", "38AU9giJeTw=\n"), str);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(m1625n(), b50.m492a("kdby\n", "0JOhY8GHs0Y=\n"));
            Cipher cipher = Cipher.getInstance(b50.m492a("ZpRlHXXxqaV3mnVhBeKK7kO4WFU=\n", "J9E2MjCy64o=\n"));
            cipher.init(1, secretKeySpec);
            byte[] bytes = str.getBytes(AbstractC0514n9.f3251a);
            AbstractC0493mp.m1856f(b50.m492a("RnDuVi/pefcJO7Q6fw==\n", "IRWaFFadHIQ=\n"), bytes);
            String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
            AbstractC0493mp.m1854d(strEncodeToString);
            return strEncodeToString;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m1624m(String str) {
        AbstractC0493mp.m1857g(b50.m492a("395e\n", "tLsnnZO6yYk=\n"), str);
        try {
            C0417kn.f2847a.getClass();
            return C0417kn.m1694e(str);
        } catch (Throwable unused) {
            try {
                C0417kn c0417kn = C0417kn.f2847a;
                String strValueOf = String.valueOf(false);
                c0417kn.getClass();
                String strM1693d = C0417kn.m1693d(str, strValueOf);
                Boolean bool = strM1693d.equals("true") ? Boolean.TRUE : strM1693d.equals("false") ? Boolean.FALSE : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m1625n() {
        C0770u6 c0770u6 = C0770u6.f4638a;
        String strM492a = b50.m492a("W2c=\n", "MBdvD0mXg/A=\n");
        c0770u6.getClass();
        String strM2441c = C0770u6.m2441c(strM492a);
        byte[] bytes = (strM2441c.length() == 8 ? g40.m1146i(b50.m492a("6N0JB5iSDOM=\n", "r+5sTMf/PKc=\n"), strM2441c) : b50.m492a("2Avn6KwTmzXYC+forBObNQ==\n", "6DvX2JwjqwU=\n")).getBytes(AbstractC0514n9.f3251a);
        AbstractC0493mp.m1856f(b50.m492a("feGC5qXttTEyqtiK9Q==\n", "GoT2pNyZ0EI=\n"), bytes);
        return bytes;
    }

    /* JADX INFO: renamed from: o */
    public static int m1626o(String str, int i) {
        AbstractC0493mp.m1857g(b50.m492a("5u6W\n", "jYvvLSYfAis=\n"), str);
        try {
            try {
                C0417kn.f2847a.getClass();
                return C0417kn.m1691b(str, i);
            } catch (Throwable unused) {
                C0417kn c0417kn = C0417kn.f2847a;
                String strValueOf = String.valueOf(i);
                c0417kn.getClass();
                Integer numM1472O = i50.m1472O(C0417kn.m1693d(str, strValueOf));
                return numM1472O != null ? numM1472O.intValue() : i;
            }
        } catch (Throwable unused2) {
            return i;
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m1627p(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1628q() {
        try {
            if (f2743b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2743b == null) {
                f2742a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2743b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2743b.invoke(null, Long.valueOf(f2742a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m1629t(Activity activity, Object obj, String str) {
        String string;
        Field field = C0454ln.f3024g;
        Object objCallStaticMethod = null;
        Object obj2 = field != null ? field.get(obj) : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        String strGroup = "";
        if (str2 == null || (string = i50.m1474Q(str2).toString()) == null) {
            string = "";
        }
        Field field2 = C0454ln.f3025h;
        Object obj3 = field2 != null ? field2.get(obj) : null;
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        C0138d4 c0138d4M2060a = p00.m2060a(AbstractC0736t9.f4431k, str3);
        if (c0138d4M2060a != null) {
            strGroup = (String) ((C0460lt) c0138d4M2060a.m859t()).get(1);
        } else {
            C0138d4 c0138d4M2060a2 = p00.m2060a(AbstractC0736t9.f4432l, string + " " + str3);
            if (c0138d4M2060a2 != null) {
                strGroup = ((Matcher) c0138d4M2060a2.f1297b).group();
                AbstractC0493mp.m1856f("group(...)", strGroup);
            }
        }
        if (strGroup.length() == 0 || strGroup.length() != 32) {
            C0417kn c0417kn = C0417kn.f2847a;
            String strM492a = b50.m492a("RM2Xp6spcvkBiqnsEozbBZmKsNHNIwCkCN3X9Y0=\n", "rGw/QSislkE=\n");
            c0417kn.getClass();
            C0417kn.m1700k(activity, strM492a);
            return;
        }
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(ub0.f4692G, AbstractC0551o9.f3420a);
            Object objCallStaticMethod2 = null;
            for (String str4 : ub0.f4697I0) {
                Class clsFindClassIfExists2 = XposedHelpers.findClassIfExists(str4, AbstractC0551o9.f3420a);
                if (clsFindClassIfExists2 != null) {
                    try {
                        objCallStaticMethod2 = XposedHelpers.callStaticMethod(clsFindClassIfExists2, ub0.f4789t, new Object[]{clsFindClassIfExists});
                        if (objCallStaticMethod2 != null) {
                            break;
                        }
                    } catch (Throwable unused) {
                        AbstractC0493mp.m1857g(b50.m492a("06ke\n", "p8h5VTpLcuY=\n"), "EmojiRepeat_Locate_Failed for class: " + str4);
                        b50.m492a("tw==\n", "0vI8ySRxU5w=\n");
                    }
                }
            }
            if (objCallStaticMethod2 == null) {
                C0417kn c0417kn2 = C0417kn.f2847a;
                String strM492a2 = b50.m492a("2U5PPVys91ScCXF25Qn1e5EJVE43p6QJvnkPenfPkGnUZ2E+ULgzrWGm\n", "Me/n298pE+w=\n");
                c0417kn2.getClass();
                C0417kn.m1700k(activity, strM492a2);
                return;
            }
            Class clsFindClassIfExists3 = XposedHelpers.findClassIfExists(ub0.f4750g, AbstractC0551o9.f3420a);
            String str5 = ub0.f4705M0;
            try {
                if (str5.length() > 0) {
                    objCallStaticMethod = XposedHelpers.callStaticMethod(clsFindClassIfExists3, str5, new Object[0]);
                }
            } catch (Throwable unused2) {
                AbstractC0493mp.m1857g(b50.m492a("06ke\n", "p8h5VTpLcuY=\n"), "EmojiRepeat_Inst_Failed for method: " + str5);
                b50.m492a("tw==\n", "0vI8ySRxU5w=\n");
            }
            if (objCallStaticMethod == null) {
                C0417kn c0417kn3 = C0417kn.f2847a;
                String strM492a3 = b50.m492a("tnCLcTGT243zN7U6iDbZov43kAJamIjQ0UcD0t95VVwNpUzl03FaFbhNrnI4tw==\n", "XtEjl7IWPzU=\n");
                c0417kn3.getClass();
                C0417kn.m1700k(activity, strM492a3);
                return;
            }
            Object objCallMethod = XposedHelpers.callMethod(XposedHelpers.callMethod(objCallStaticMethod, ub0.f4688E, new Object[0]), ub0.f4690F, new Object[]{strGroup});
            if (objCallMethod == null) {
                C0417kn c0417kn4 = C0417kn.f2847a;
                String strM492a4 = b50.m492a("vaJ0rqfy5+/y+VDq8O68lfW4MuuwtYL2\n", "WBzaShhTAXM=\n");
                c0417kn4.getClass();
                C0417kn.m1700k(activity, strM492a4);
                return;
            }
            Object objNewInstance = XposedHelpers.newInstance(XposedHelpers.findClass(ub0.f4796v0, AbstractC0551o9.f3420a), new Object[]{0L, str});
            String str6 = ub0.f4763k0;
            try {
                XposedHelpers.callMethod(objCallStaticMethod2, str6, new Object[]{str, objCallMethod, null, objNewInstance, null, 0});
            } catch (Throwable unused3) {
                C0417kn.f2847a.getClass();
                C0417kn.m1700k(activity, "表情接口调用失败：参数未对齐或方法(" + str6 + ")失效");
                AbstractC0493mp.m1857g(b50.m492a("06ke\n", "p8h5VTpLcuY=\n"), "EmojiRepeat_Invoke_Failed for targetNh: " + str6 + ", md5: " + strGroup);
                b50.m492a("tw==\n", "0vI8ySRxU5w=\n");
            }
        } catch (Throwable th) {
            C0417kn c0417kn5 = C0417kn.f2847a;
            String str7 = "表情分发全局异常: " + th.getMessage();
            c0417kn5.getClass();
            C0417kn.m1700k(activity, str7);
            g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "EmojiRepeat_Global_Fatal for md5: ".concat(strGroup), "tw==\n", "0vI8ySRxU5w=\n");
        }
    }

    /* JADX INFO: renamed from: u */
    public static C0165dw m1630u(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C0165dw c0165dw = new C0165dw();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0165dw.f5550d = byteBufferDuplicate;
                    c0165dw.f5547a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0165dw.f5548b = i6;
                    c0165dw.f5549c = ((ByteBuffer) c0165dw.f5550d).getShort(i6);
                    return c0165dw;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: v */
    public static void m1631v(View view, C0350iu c0350iu) {
        C0967zh c0967zh = c0350iu.f2585a.f2267b;
        if (c0967zh == null || !c0967zh.f5588a) {
            return;
        }
        float fM891i = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = oa0.f3426a;
            fM891i += da0.m891i((View) parent);
        }
        C0311hu c0311hu = c0350iu.f2585a;
        if (c0311hu.f2277l != fM891i) {
            c0311hu.f2277l = fM891i;
            c0350iu.m1540m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static final Object m1632w(d20 d20Var, d20 d20Var2, InterfaceC0935ym interfaceC0935ym) throws Throwable {
        Object c0850wb;
        Object objM440C;
        InterfaceC0974zo interfaceC0974zo;
        try {
            g80.m1187b((t50) interfaceC0935ym);
            c0850wb = interfaceC0935ym.mo36e(d20Var2, d20Var);
        } catch (Throwable th) {
            c0850wb = new C0850wb(th, false);
        }
        EnumC0630qe enumC0630qe = EnumC0630qe.f3899a;
        if (c0850wb == enumC0630qe || (objM440C = d20Var.m440C(c0850wb)) == AbstractC0493mp.f3169g) {
            return enumC0630qe;
        }
        if (objM440C instanceof C0850wb) {
            throw ((C0850wb) objM440C).f5079a;
        }
        C0039ap c0039ap = objM440C instanceof C0039ap ? (C0039ap) objM440C : null;
        return (c0039ap == null || (interfaceC0974zo = c0039ap.f615a) == null) ? objM440C : interfaceC0974zo;
    }

    /* JADX INFO: renamed from: x */
    public static final void m1633x(p00 p00Var, View view) {
        if (p00Var.f3560b != null) {
            return;
        }
        if (view.getClass().getName().equals(ub0.f4757i0)) {
            p00Var.f3560b = view;
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AbstractC0493mp.m1856f(b50.m492a("AUhsn6CW33onWTDy5tGa\n", "Zi0Y3Mj/sx4=\n"), childAt);
                m1633x(p00Var, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Typeface mo1486g(Context context, C0228fl c0228fl, Resources resources, int i);

    /* JADX INFO: renamed from: h */
    public abstract Typeface mo1487h(Context context, C0338il[] c0338ilArr, int i);

    /* JADX INFO: renamed from: i */
    public Typeface mo1488i(Context context, Resources resources, int i, String str, int i2) {
        File fileM1897p = AbstractC0498mu.m1897p(context);
        if (fileM1897p == null) {
            return null;
        }
        try {
            if (AbstractC0498mu.m1892k(fileM1897p, resources, i)) {
                return Typeface.createFromFile(fileM1897p.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM1897p.delete();
        }
    }

    /* JADX INFO: renamed from: l */
    public C0338il mo1634l(int i, C0338il[] c0338ilArr) {
        new C0426kw(11);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C0338il c0338il = null;
        int i3 = Integer.MAX_VALUE;
        for (C0338il c0338il2 : c0338ilArr) {
            int iAbs = (Math.abs(c0338il2.f2550c - i2) * 2) + (c0338il2.f2551d == z ? 0 : 1);
            if (c0338il == null || i3 > iAbs) {
                c0338il = c0338il2;
                i3 = iAbs;
            }
        }
        return c0338il;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo1073r(int i);

    /* JADX INFO: renamed from: s */
    public abstract void mo1074s(Typeface typeface, boolean z);

    @Override // p000.db0
    /* JADX INFO: renamed from: b */
    public void mo1b(View view) {
    }

    @Override // p000.db0
    /* JADX INFO: renamed from: c */
    public void mo2c() {
    }
}
