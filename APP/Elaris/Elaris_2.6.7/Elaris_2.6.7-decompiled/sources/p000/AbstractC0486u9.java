package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: u9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486u9 {

    /* JADX INFO: renamed from: a */
    public static volatile long f950a;

    /* JADX INFO: renamed from: b */
    public static volatile long f951b;

    /* JADX INFO: renamed from: c */
    public static volatile long f952c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static int m1039A(Activity activity) {
        int i = activity.getResources().getDisplayMetrics().widthPixels;
        return Math.max(m1054g(activity, 260.0f), Math.min(i - m1054g(activity, 68.0f), m1054g(activity, 460.0f)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static int m1040B(int i, int i2) {
        return Math.max(m1071x(i), m1071x(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static Object m1041C(ClassLoader classLoader, String str) {
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.qroute.QRoute", classLoader);
            Class<?> clsFindClass2 = XposedHelpers.findClass(str, classLoader);
            Method method = clsFindClass.getMethod("api", Class.class);
            method.setAccessible(true);
            return method.invoke(null, clsFindClass2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m1042D(ClassLoader classLoader, String str, C0410pd c0410pd) {
        Object objM1053f;
        if (classLoader != null && str != null && str.length() != 0 && c0410pd != null) {
            int i = c0410pd.f723b;
            String str2 = c0410pd.f722a;
            if (str2.length() != 0) {
                try {
                    Object objM1041C = m1041C(classLoader, "com.tencent.qqnt.msg.api.IMsgUtilApi");
                    Object objM1041C2 = m1041C(classLoader, "com.tencent.qqnt.msg.api.IMsgService");
                    if (objM1041C != null && objM1041C2 != null && (objM1053f = m1053f(objM1041C, str)) != null) {
                        Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.kernel.nativeinterface.Contact", classLoader);
                        if (clsFindClassIfExists == null) {
                            clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.kernelpublic.nativeinterface.Contact", classLoader);
                        }
                        if (clsFindClassIfExists != null) {
                            if ((i == 1 || i == 100) && str2.length() != 0) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= str2.length()) {
                                        String strM1047I = m1047I(classLoader, str2);
                                        if (strM1047I.length() > 0) {
                                            str2 = strM1047I;
                                        }
                                    } else {
                                        if (!Character.isDigit(str2.charAt(i2))) {
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                            Object objM1070w = m1070w(clsFindClassIfExists, str2, i);
                            if (objM1070w != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(objM1053f);
                                return m1061n(objM1041C2, objM1070w, arrayList);
                            }
                        }
                    }
                } catch (Throwable th) {
                    AbstractC0198e7.m343a("cloud-sticker", "send-picture", th);
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static int m1043E(Context context) {
        return m1062o(context) ? -5919817 : -9735552;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final void m1044F(Object obj) {
        if (obj instanceof C0409pc) {
            throw ((C0409pc) obj).f721a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static int m1045G(Context context) {
        return m1062o(context) ? -1051913 : -15656921;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static byte[] m1046H(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((C0426qd) it.next()).f767a;
            i++;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static String m1047I(ClassLoader classLoader, String str) {
        Object objM1041C = m1041C(classLoader, "com.tencent.relation.common.api.IRelationNTUinAndUidApi");
        if (objM1041C == null) {
            return "";
        }
        String[] strArr = {"getUidFromUin", "getFriendUidFromUin"};
        for (int i = 0; i < 2; i++) {
            try {
                Object objInvoke = objM1041C.getClass().getMethod(strArr[i], String.class).invoke(objM1041C, str);
                if ((objInvoke instanceof String) && ((String) objInvoke).length() > 0) {
                    return (String) objInvoke;
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1048a(C0527x2 c0527x2) {
        boolean z;
        boolean z2;
        Drawable drawableNewDrawable;
        CharSequence text;
        int i;
        int i2;
        int i3;
        int visibility;
        int i4;
        if (c0527x2 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) c0527x2.f1027a;
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C0536xb c0536xb = (C0536xb) arrayList.get(i5);
            Drawable.ConstantState constantState = c0536xb.f1066s;
            String str = c0536xb.f1064q;
            int i6 = c0536xb.f1056i;
            int i7 = c0536xb.f1055h;
            int i8 = c0536xb.f1054g;
            View view = c0536xb.f1048a;
            if (view != null) {
                try {
                    visibility = view.getVisibility();
                    i4 = c0536xb.f1049b;
                } catch (Throwable unused) {
                }
                if (visibility != i4) {
                    view.setVisibility(i4);
                    z = true;
                } else {
                    z = false;
                }
                try {
                    if (view.getAlpha() <= 0.01f) {
                        float f = c0536xb.f1050c;
                        if (f > 0.01f) {
                            view.setAlpha(f);
                            z = true;
                        }
                    }
                } catch (Throwable unused2) {
                }
                try {
                    if (view.getMinimumWidth() == 0 && (i3 = c0536xb.f1051d) > 0) {
                        view.setMinimumWidth(i3);
                        z = true;
                    }
                } catch (Throwable unused3) {
                }
                try {
                    if (view.getMinimumHeight() == 0 && (i2 = c0536xb.f1052e) > 0) {
                        view.setMinimumHeight(i2);
                        z = true;
                    }
                } catch (Throwable unused4) {
                }
                try {
                    if (view.getPaddingLeft() == 0 && view.getPaddingTop() == 0 && view.getPaddingRight() == 0 && view.getPaddingBottom() == 0 && ((i = c0536xb.f1053f) != 0 || i8 != 0 || i7 != 0 || i6 != 0)) {
                        view.setPadding(i, i8, i7, i6);
                        z = true;
                    }
                } catch (Throwable unused5) {
                }
                try {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null && (layoutParams.width == 0 || layoutParams.height == 0)) {
                        int i9 = c0536xb.f1057j;
                        if (i9 != Integer.MIN_VALUE) {
                            layoutParams.width = i9;
                        }
                        int i10 = c0536xb.f1058k;
                        if (i10 != Integer.MIN_VALUE) {
                            layoutParams.height = i10;
                        }
                        if (c0536xb.f1063p && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(c0536xb.f1059l, c0536xb.f1060m, c0536xb.f1061n, c0536xb.f1062o);
                        }
                        view.setLayoutParams(layoutParams);
                        z = true;
                    }
                } catch (Throwable unused6) {
                }
                if (c0536xb.f1065r && (view instanceof TextView) && (((text = ((TextView) view).getText()) == null || text.length() == 0) && str != null && str.length() > 0)) {
                    ((TextView) view).setText(str);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (constantState != null) {
                    try {
                        if (view instanceof ImageView) {
                            ImageView imageView = (ImageView) view;
                            if (imageView.getDrawable() == null && (drawableNewDrawable = constantState.newDrawable(view.getResources())) != null) {
                                imageView.setImageDrawable(drawableNewDrawable.mutate());
                                z2 = true;
                            }
                        }
                    } catch (Throwable unused7) {
                    }
                }
                if (z) {
                    try {
                        view.requestLayout();
                    } catch (Throwable unused8) {
                    }
                    try {
                        view.invalidate();
                    } catch (Throwable unused9) {
                    }
                }
                if (z2) {
                    try {
                        view.invalidate();
                    } catch (Throwable unused10) {
                    }
                }
                if (z) {
                    iArr[0] = iArr[0] + 1;
                }
                if (z2) {
                    iArr[1] = iArr[1] + 1;
                }
            }
        }
        if (iArr[0] > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f951b >= 3000) {
                f951b = jCurrentTimeMillis;
                HookEntry.log("repeater aio row visibility restored");
            }
        }
        if (iArr[1] > 0) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jCurrentTimeMillis2 - f952c < 3000) {
                return;
            }
            f952c = jCurrentTimeMillis2;
            HookEntry.log("repeater aio row content restored");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1049b(StringBuilder sb, Object obj, InterfaceC0482u5 interfaceC0482u5) {
        if (interfaceC0482u5 != null) {
            sb.append((CharSequence) interfaceC0482u5.invoke(obj));
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
    /* JADX INFO: renamed from: c */
    public static int m1050c(Context context) {
        return m1062o(context) ? -10705665 : -13335297;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1051d(Dialog dialog) {
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m1052e(View view, int i) {
        CharSequence text;
        if (view != null && i <= 4) {
            if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null) {
                String strTrim = text.toString().trim();
                if (strTrim.length() > 0 && strTrim.length() <= 18 && (i <= 2 || strTrim.charAt(0) == '+')) {
                    String lowerCase = strTrim.toLowerCase(Locale.ROOT);
                    if (lowerCase.contains("vip") || lowerCase.contains("svip") || lowerCase.contains("lv") || lowerCase.contains("level") || lowerCase.contains("铭牌") || lowerCase.contains("等级") || (lowerCase.contains("年") && lowerCase.contains("v"))) {
                        return true;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(viewGroup.getChildCount(), 32);
                for (int i2 = 0; i2 < iMin; i2++) {
                    if (m1052e(viewGroup.getChildAt(i2), i + 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m1053f(Object obj, String str) {
        for (Method method : obj.getClass().getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if ("createPicElement".equals(method.getName()) && parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == Boolean.TYPE && parameterTypes[2] == Integer.TYPE) {
                try {
                    method.setAccessible(true);
                    return method.invoke(obj, str, Boolean.TRUE, 0);
                } catch (Throwable th) {
                    AbstractC0198e7.m343a("cloud-sticker", "create-picture", th);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m1054g(Context context, float f) {
        return Math.max(1, (int) ((f * (context == null ? 1.0f : context.getResources().getDisplayMetrics().density)) + 0.5f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1055h(C0043ca c0043ca) {
        if (c0043ca == null) {
            return "";
        }
        int i = c0043ca.f101c;
        String str = c0043ca.f100b;
        String str2 = c0043ca.f99a;
        if (m1063p(str2) || m1063p(str) || i < 0) {
            return "";
        }
        return str2 + "\t" + str + "\t" + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m1056i(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m1065r(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m1065r(b3) && !m1065r(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m1057j(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m1065r(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m1065r(b3)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m1058k(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (m1065r(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0222  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1059l(View view, int i, int[] iArr) {
        CharSequence contentDescription;
        boolean z;
        if (view == null || i > 14) {
            return;
        }
        int i2 = iArr[0];
        if (i2 > 1200) {
            return;
        }
        iArr[0] = i2 + 1;
        if (i > 0) {
            if (view != null) {
                String lowerCase = view.getClass().getName().toLowerCase(Locale.ROOT);
                if (lowerCase == null || ((!lowerCase.contains("avatar") && !lowerCase.contains("head") && !lowerCase.contains("face") && !lowerCase.contains("pendant")) || (!lowerCase.contains("dynamic") && !lowerCase.contains("anim") && !lowerCase.contains("pag") && !lowerCase.contains("lottie") && !lowerCase.contains("svga") && !lowerCase.contains("vapie") && !lowerCase.contains("video") && !lowerCase.contains("live") && !lowerCase.contains("magic") && !lowerCase.contains("effect") && !lowerCase.contains("flash") && !lowerCase.contains("spark") && !lowerCase.contains("glow") && !lowerCase.contains("shine")))) {
                    if (!lowerCase.contains("avatarview") && !lowerCase.endsWith(".avatar") && !lowerCase.contains("simpleavatar")) {
                        boolean z2 = lowerCase.contains("aio") && (lowerCase.contains("vip") || lowerCase.contains("vas") || lowerCase.contains("nameplate")) && (lowerCase.contains("avatar") || lowerCase.contains("head") || lowerCase.contains("pendant") || lowerCase.contains("badge") || lowerCase.contains("label"));
                        if (!lowerCase.contains("vipicon") && !lowerCase.contains("vip_icon") && !lowerCase.contains("viptag") && !lowerCase.contains("vip_tag") && !z2 && !lowerCase.contains("profilelabel") && !lowerCase.contains("memberlabel") && !lowerCase.contains("identitylabel") && ((!lowerCase.contains("apollo") || !lowerCase.contains("label")) && !lowerCase.contains("avatarpendant") && !lowerCase.contains("headpendant") && !lowerCase.contains("pendantview") && !lowerCase.contains("avatarframe") && !lowerCase.contains("headframe") && !lowerCase.contains("avatarborder") && !lowerCase.contains("headdecor") && !lowerCase.contains("avatardecor") && !lowerCase.contains("avatarhalo") && ((!lowerCase.contains("pendant") || !lowerCase.contains("avatar")) && ((!lowerCase.contains("spark") && !lowerCase.contains("star") && !lowerCase.contains("glow") && !lowerCase.contains("shine") && !lowerCase.contains("particle") && !lowerCase.contains("effect")) || (!lowerCase.contains("avatar") && !lowerCase.contains("head") && !lowerCase.contains("pendant")))))) {
                            try {
                                contentDescription = view.getContentDescription();
                            } catch (Throwable unused) {
                                contentDescription = null;
                            }
                            if (contentDescription != null) {
                                String string = contentDescription.toString();
                                if (string.contains("头像挂件") || string.contains("挂件") || string.contains("头像玩法")) {
                                }
                                if (z) {
                                    AbstractC0497v4.m1098q(view);
                                    return;
                                }
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
                z = true;
                if (z) {
                }
            } else {
                z = false;
                if (z) {
                }
            }
        }
        if (i > 0 && (view instanceof ViewGroup) && m1052e(view, 0)) {
            int height = view.getHeight();
            int width = view.getWidth();
            if ((height <= 0 || height <= AbstractC0497v4.m1090i(view, 40.0f)) && (width <= 0 || width <= AbstractC0497v4.m1090i(view, 180.0f))) {
                AbstractC0497v4.m1098q(view);
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 120);
            for (int i3 = 0; i3 < iMin; i3++) {
                m1059l(viewGroup.getChildAt(i3), i + 1, iArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r2 < (r15 * 0.7f)) goto L37;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1060m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (view == null || i5 > 10 || (i6 = iArr[0]) > 220) {
            return;
        }
        iArr[0] = i6 + 1;
        if (i5 > 0 && view.getVisibility() != 8 && !AbstractC0260i5.m560Q(view, "切换账号", 0)) {
            if (!AbstractC0440rb.m869h(view) && !AbstractC0440rb.m862a(view, 0)) {
                int width = view.getWidth();
                int height = view.getHeight();
                if (width > 0 && height > 0) {
                    try {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        float f = width;
                        float f2 = height;
                        float fMax = ((f2 / 2.0f) + (iArr2[1] - i2)) / Math.max(1, i4);
                        if (((f / 2.0f) + (iArr2[0] - i)) / Math.max(1, i3) > 0.68f) {
                            if (fMax > 0.28f) {
                                if (fMax < 0.9f) {
                                    if (f < i3 * 0.48f) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            AbstractC0497v4.m1098q(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 60);
            for (int i7 = 0; i7 < iMin; i7++) {
                m1060m(viewGroup.getChildAt(i7), i, i2, i3, i4, i5 + 1, iArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m1061n(Object obj, Object obj2, ArrayList arrayList) {
        for (Method method : obj.getClass().getMethods()) {
            if ("sendMsg".equals(method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                try {
                    method.setAccessible(true);
                    if (parameterTypes.length == 2 && parameterTypes[0].isInstance(obj2) && List.class.isAssignableFrom(parameterTypes[1])) {
                        method.invoke(obj, obj2, arrayList);
                    } else if (parameterTypes.length == 3 && parameterTypes[0].isInstance(obj2) && List.class.isAssignableFrom(parameterTypes[1])) {
                        method.invoke(obj, obj2, arrayList, parameterTypes[2].isInterface() ? Proxy.newProxyInstance(parameterTypes[2].getClassLoader(), new Class[]{parameterTypes[2]}, new C0456sb()) : null);
                    }
                    return true;
                } catch (Throwable th) {
                    AbstractC0198e7.m343a("cloud-sticker", "invoke-send", th);
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m1062o(Context context) {
        String strRuntimeString = "system";
        try {
            strRuntimeString = HookEntry.runtimeString(Prefs.KEY_UI_THEME_MODE, "system");
        } catch (Throwable unused) {
        }
        boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
        if ("dark".equals(strRuntimeString)) {
            return true;
        }
        if ("light".equals(strRuntimeString)) {
            return false;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m1063p(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1064q(View view) {
        Object objInvoke;
        if (view == null) {
            return false;
        }
        String lowerCase = view.getClass().getName().toLowerCase(Locale.US);
        if (lowerCase.contains("recyclerview") || lowerCase.contains("recycler") || lowerCase.contains("abslistview") || lowerCase.contains("xlistview") || lowerCase.contains("listview")) {
            return true;
        }
        if (!lowerCase.contains("msglist")) {
            return false;
        }
        Class<?> cls = view.getClass();
        Object objInvoke2 = null;
        try {
            try {
                Method method = cls.getMethod("getAdapter", null);
                method.setAccessible(true);
                objInvoke = method.invoke(view, null);
            } catch (Throwable unused) {
                objInvoke = objInvoke2;
                if (objInvoke != null) {
                }
            }
        } catch (Throwable unused2) {
            Method declaredMethod = cls.getDeclaredMethod("getAdapter", null);
            declaredMethod.setAccessible(true);
            objInvoke2 = declaredMethod.invoke(view, null);
            objInvoke = objInvoke2;
            if (objInvoke != null) {
            }
        }
        if (objInvoke != null) {
            return true;
        }
        try {
            view.getClass().getMethod("getChildAdapterPosition", View.class);
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m1065r(byte b) {
        return b > -65;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m1066s(String str) {
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        if (".mp3".equals(lowerCase) || ".m4a".equals(lowerCase) || ".aac".equals(lowerCase) || ".wav".equals(lowerCase) || ".flac".equals(lowerCase) || ".ogg".equals(lowerCase) || ".opus".equals(lowerCase)) {
            return true;
        }
        String lowerCase2 = str.toLowerCase(locale);
        return ".wma".equals(lowerCase2) || ".aif".equals(lowerCase2) || ".aiff".equals(lowerCase2) || ".ape".equals(lowerCase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m1067t(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return ".slk".equals(lowerCase) || ".silk".equals(lowerCase) || ".ptt".equals(lowerCase) || ".amr".equals(lowerCase) || ".bin".equals(lowerCase);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static int m1068u(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static int m1069v(Context context, int i, float f) {
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        float f2 = 1.0f - fMax;
        int iM1072y = m1072y(context);
        return Color.rgb((int) ((Color.red(iM1072y) * fMax) + (Color.red(i) * f2)), (int) ((Color.green(iM1072y) * fMax) + (Color.green(i) * f2)), (int) ((Color.blue(iM1072y) * fMax) + (Color.blue(i) * f2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static Object m1070w(Class cls, String str, int i) {
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            for (int i2 = 0; i2 < declaredConstructors.length; i2++) {
                Class<?>[] parameterTypes = declaredConstructors[i2].getParameterTypes();
                if (parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class) {
                    declaredConstructors[i2].setAccessible(true);
                    return declaredConstructors[i2].newInstance(Integer.valueOf(i), str, "");
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static int m1071x(int i) {
        if (i == 2) {
            return 2;
        }
        return i == 1 ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static int m1072y(Context context) {
        return m1062o(context) ? -14868699 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static int m1073z(Activity activity) {
        int i = activity.getResources().getDisplayMetrics().heightPixels;
        return Math.max(m1054g(activity, 190.0f), Math.min(i - m1054g(activity, 360.0f), m1054g(activity, 278.0f)));
    }
}
