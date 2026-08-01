package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import com.p001mr.elaris.C0149c;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0451s6 {

    /* JADX INFO: renamed from: i */
    public static volatile boolean f854i;

    /* JADX INFO: renamed from: j */
    public static volatile boolean f855j;

    /* JADX INFO: renamed from: a */
    public static final int f846a = Color.rgb(58, 137, 246);

    /* JADX INFO: renamed from: b */
    public static final int f847b = Color.rgb(28, 34, 44);

    /* JADX INFO: renamed from: c */
    public static final int f848c = Color.rgb(93, 99, 112);

    /* JADX INFO: renamed from: d */
    public static final int f849d = Color.rgb(255, 255, 255);

    /* JADX INFO: renamed from: e */
    public static final int f850e = Color.rgb(218, 226, 238);

    /* JADX INFO: renamed from: f */
    public static final int f851f = Color.rgb(234, 239, 246);

    /* JADX INFO: renamed from: g */
    public static final String[] f852g = {"设置头衔", "禁言", "解禁", "踢出", "撤回该成员消息"};

    /* JADX INFO: renamed from: h */
    public static final Map f853h = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: k */
    public static final C0149c f856k = new C0149c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static Method m908A(Class cls, String str, int i) {
        ArrayList arrayListM950e = m950e(cls);
        for (int i2 = 0; i2 < arrayListM950e.size(); i2++) {
            Method method = (Method) arrayListM950e.get(i2);
            if (str.equals(method.getName()) && (i < 0 || method.getParameterTypes().length == i)) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static String m909A0(ClassLoader classLoader, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strTrim = str.trim();
        if (strTrim.length() != 0 && !strTrim.startsWith("u_")) {
            Object objM955g0 = m955g0(classLoader, "com.tencent.relation.common.api.IRelationNTUinAndUidApi");
            if (objM955g0 != null) {
                String[] strArr = {"getUidFromUin", "getFriendUidFromUin"};
                for (int i = 0; i < 2; i++) {
                    try {
                        Method method = objM955g0.getClass().getMethod(strArr[i], String.class);
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(objM955g0, strTrim);
                        String strTrim2 = (objInvoke == null ? "" : String.valueOf(objInvoke)).trim();
                        if (strTrim2.startsWith("u_")) {
                            HookEntry.log("group avatar uin converted uin=" + strTrim + " uid=" + strTrim2);
                            return strTrim2;
                        }
                        continue;
                    } catch (Throwable unused) {
                    }
                }
            }
            Object objM955g02 = m955g0(classLoader, "com.tencent.qqnt.ntrelation.friendsinfo.api.IFriendsInfoService");
            if (objM955g02 != null) {
                try {
                    Method method2 = objM955g02.getClass().getMethod("getUidFromUin", String.class);
                    method2.setAccessible(true);
                    Object objInvoke2 = method2.invoke(objM955g02, strTrim);
                    String strTrim3 = (objInvoke2 == null ? "" : String.valueOf(objInvoke2)).trim();
                    if (strTrim3.startsWith("u_")) {
                        HookEntry.log("group avatar uin converted uin=" + strTrim + " uid=" + strTrim3);
                        return strTrim3;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Object m910B(Object obj) {
        Class<?> returnType;
        if (obj != null) {
            ArrayList arrayListM950e = m950e(obj.getClass());
            for (int i = 0; i < arrayListM950e.size(); i++) {
                Method method = (Method) arrayListM950e.get(i);
                if (method.getParameterTypes().length == 0 && !Modifier.isAbstract(method.getModifiers()) && (returnType = method.getReturnType()) != null && returnType.getName().contains("IKernelGroupService")) {
                    try {
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(obj, null);
                        if (objInvoke != null) {
                            return objInvoke;
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static String m911B0(ClassLoader classLoader, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object objM955g0;
        if (str.length() != 0 && str.startsWith("u_") && (objM955g0 = m955g0(classLoader, "com.tencent.relation.common.api.IRelationNTUinAndUidApi")) != null) {
            String[] strArr = {"getUinFromUid", "getUinByUid", "getUin"};
            for (int i = 0; i < 3; i++) {
                try {
                    Method method = objM955g0.getClass().getMethod(strArr[i], String.class);
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(objM955g0, str);
                    String strTrim = (objInvoke == null ? "" : String.valueOf(objInvoke)).trim();
                    if (strTrim.length() > 0 && !"0".equals(strTrim) && !"null".equalsIgnoreCase(strTrim)) {
                        HookEntry.log("group avatar uid converted uid=" + str + " uin=" + strTrim);
                        return strTrim;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m912C(Object obj, String... strArr) {
        String strTrim;
        Object objInvoke;
        if (obj != null) {
            for (String str : strArr) {
                try {
                    Class<?> superclass = obj.getClass();
                    while (true) {
                        if (superclass == null || superclass == Object.class) {
                            break;
                        }
                        try {
                            Field declaredField = superclass.getDeclaredField(str);
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(obj);
                            if (obj2 != null) {
                                strTrim = String.valueOf(obj2).trim();
                            }
                        } catch (NoSuchFieldException unused) {
                            superclass = superclass.getSuperclass();
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (strTrim.length() <= 0) {
                    return strTrim;
                }
                try {
                    objInvoke = obj.getClass().getMethod(str, null).invoke(obj, null);
                } catch (Throwable unused3) {
                }
                String strTrim2 = objInvoke == null ? "" : String.valueOf(objInvoke).trim();
                if (strTrim2.length() > 0) {
                    return strTrim2;
                }
            }
        }
        return "";
        strTrim = "";
        if (strTrim.length() <= 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static Throwable m913C0(Throwable th) {
        if (!(th instanceof InvocationTargetException)) {
            return th;
        }
        InvocationTargetException invocationTargetException = (InvocationTargetException) th;
        return invocationTargetException.getTargetException() != null ? invocationTargetException.getTargetException() : th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static C0024b7 m914D(Object obj) {
        int i;
        if (obj == null) {
            return null;
        }
        String strValueOf = String.valueOf(obj);
        String strM917E0 = m917E0(strValueOf, "troopUin", "groupUin");
        int i2 = -1;
        try {
            i = Integer.parseInt(m917E0(strValueOf, "type", "chatType").trim());
        } catch (Throwable unused) {
            i = -1;
        }
        if (strM917E0.length() >= 5) {
            String strTrim = strM917E0.trim();
            if (i != 2 && i != 4) {
                i = 2;
            }
            return new C0024b7(strTrim, i);
        }
        String strM917E02 = m917E0(strValueOf, "peerId", "peerUid", "peerUin");
        if (strM917E02.length() >= 5 && (i == 2 || i == 4)) {
            return new C0024b7(strM917E02.trim(), i);
        }
        String strM912C = m912C(obj, "troopUin", "groupUin", "mTroopUin", "mGroupUin", "troopuin", "groupuin");
        m912C(obj, "guildId", "guildID");
        try {
            i2 = Integer.parseInt(m912C(obj, "chatType", "type", "d", "a").trim());
        } catch (Throwable unused2) {
        }
        if (strM912C.length() >= 5) {
            return new C0024b7(strM912C.trim(), (i2 == 2 || i2 == 4) ? i2 : 2);
        }
        if (i2 != 2 && i2 != 4) {
            return null;
        }
        String strM912C2 = m912C(obj, "peerUid", "peerUin", "uid", "uin", "e");
        if (strM912C2.length() >= 5) {
            return new C0024b7(strM912C2.trim(), i2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static void m915D0(boolean z) {
        boolean z2 = (f855j && f854i == z) ? false : true;
        f854i = z;
        f855j = true;
        if (z2) {
            HookEntry.log("group avatar menu switch loaded=" + z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m916E(C0024b7 c0024b7) {
        if (c0024b7 == null) {
            return "";
        }
        String str = (String) c0024b7.f64c;
        if (str.length() == 0) {
            str = (String) c0024b7.f63b;
        }
        return m931P(str) ? "" : str.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public static String m917E0(String str, String... strArr) {
        char cCharAt;
        char cCharAt2;
        String lowerCase = str.toLowerCase(Locale.US);
        for (String str2 : strArr) {
            if (str2 != null && str2.length() != 0) {
                String lowerCase2 = str2.toLowerCase(Locale.US);
                for (int iIndexOf = lowerCase.indexOf(lowerCase2); iIndexOf >= 0; iIndexOf = lowerCase.indexOf(lowerCase2, lowerCase2.length() + iIndexOf)) {
                    int length = lowerCase2.length() + iIndexOf;
                    while (length < str.length() && ((cCharAt2 = str.charAt(length)) == ':' || cCharAt2 == '=' || cCharAt2 == ' ' || cCharAt2 == '\"' || cCharAt2 == '\'' || cCharAt2 == '{' || cCharAt2 == '[')) {
                        length++;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (length < str.length() && (((cCharAt = str.charAt(length)) >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')))) {
                        sb.append(cCharAt);
                        length++;
                    }
                    String strTrim = sb.toString().trim();
                    if (strTrim.length() > 0) {
                        return strTrim;
                    }
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static String m918F(Object obj) {
        int i;
        C0024b7 c0024b7M914D = m914D(obj);
        if (c0024b7M914D != null) {
            return m916E(c0024b7M914D);
        }
        if (obj == null) {
            return "";
        }
        String strValueOf = String.valueOf(obj);
        String strM917E0 = m917E0(strValueOf, "troopUin", "groupUin");
        if (strM917E0.length() >= 5 && !m931P(strM917E0)) {
            return strM917E0.trim();
        }
        String strM917E02 = m917E0(strValueOf, "peerId", "peerUid", "peerUin");
        try {
            i = Integer.parseInt(m917E0(strValueOf, "type", "chatType").trim());
        } catch (Throwable unused) {
            i = -1;
        }
        return strM917E02.length() >= 5 ? ((i == 2 || i == 4) && !m931P(strM917E02)) ? strM917E02.trim() : "" : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static Class m919F0(Class cls) {
        return (cls == null || !cls.isPrimitive()) ? cls == null ? Object.class : cls : cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Byte.TYPE ? Byte.class : cls == Float.TYPE ? Float.class : cls == Double.TYPE ? Double.class : cls == Character.TYPE ? Character.class : Void.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static boolean m920G(Object obj, String str) {
        return (obj == null || m908A(obj.getClass(), str, -1) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static FrameLayout m921G0(Context context, LinearLayout linearLayout) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(0);
        frameLayout.setPadding(m982u(context, 1.0f), m982u(context, 1.0f), m982u(context, 1.0f), m982u(context, 1.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(linearLayout, layoutParams);
        return frameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static ClassLoader m922H(Activity activity) {
        if (activity != null) {
            try {
                ClassLoader classLoader = activity.getClassLoader();
                if (classLoader != null) {
                    return classLoader;
                }
            } catch (Throwable unused) {
            }
            try {
                ClassLoader classLoader2 = activity.getClass().getClassLoader();
                if (classLoader2 != null) {
                    return classLoader2;
                }
            } catch (Throwable unused2) {
            }
        }
        return AbstractC0451s6.class.getClassLoader();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static void m923H0(ByteArrayOutputStream byteArrayOutputStream, long j) {
        while (((-128) & j) != 0) {
            byteArrayOutputStream.write((int) ((127 & j) | 128));
            j >>>= 7;
        }
        byteArrayOutputStream.write((int) j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static void m924I(ClassLoader classLoader) {
        Method methodM1108a;
        C0149c c0149c = f856k;
        String[] strArr = AbstractC0499v6.f956a;
        synchronized (AbstractC0499v6.class) {
            if (AbstractC0499v6.f958c || classLoader == null || c0149c == null) {
                return;
            }
            try {
                HookEntry.log("group avatar listener hook install start");
                methodM1108a = AbstractC0499v6.m1108a(classLoader, XposedHelpers.findClassIfExists("com.tencent.mobileqq.aio.msglist.holder.component.avatar.AIOAvatarContentComponent", classLoader));
            } catch (Throwable th) {
                AbstractC0198e7.m343a("group-avatar", "install-listener", th);
                HookEntry.log("group avatar listener hook failed reason=" + th.getClass().getSimpleName() + ": " + th.getMessage());
            }
            if (methodM1108a == null) {
                HookEntry.log("group avatar listener hook skipped reason=listener missing");
                return;
            }
            methodM1108a.setAccessible(true);
            XposedBridge.hookMethod(methodM1108a, new C0467t6(c0149c));
            AbstractC0499v6.f958c = true;
            HookEntry.log("group avatar listener hook installed method=".concat(methodM1108a.getDeclaringClass().getName() + "#" + methodM1108a.getName() + "(android.view.View)->boolean"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:538:0x0e22 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:542:0x0df3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:543:0x0de6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:547:0x0d2a */
    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(2:4|(1:6)(8:7|(6:9|(1:11)(9:12|13|14|488|15|(3:17|18|(1:64)(4:65|(4:68|(2:72|571)(2:73|(0)(25:78|(1:80)(1:81)|82|496|83|84|490|85|86|480|87|88|528|89|90|520|91|92|512|93|94|504|95|569|575))|113|66)|568|114))(16:19|20|486|21|(1:23)(1:24)|25|(1:27)|28|484|31|32|(3:518|34|(2:36|(2:522|38)))|42|(4:44|(1:46)(1:47)|48|(2:498|50))(1:52)|53|(0)(0))|62|18|(0)(0))|115|(1:117)(2:119|(1:121)(2:122|(1:124)(2:125|(1:127)(5:128|(4:131|(2:135|566)(2:136|(2:140|567)(7:494|141|142|492|143|564|574))|150|129)|563|151|152))))|118|152)(1:154)|153|304|534|305|308|(2:310|311)(14:312|(1:318)(1:317)|319|(1:321)(1:322)|323|(1:325)|326|(1:330)|331|(4:334|(2:336|539)(5:337|(6:340|(1:346)(5:347|(1:349)(1:350)|351|(2:353|(2:355|(2:357|(0)(2:360|(4:362|(3:392|(5:395|(1:397)(4:398|(6:401|(1:(2:404|405)(1:(3:408|409|405)(3:410|411|433)))(4:412|(1:414)(2:415|(1:417)(2:418|(6:422|(1:435)(1:436)|(1:438)(1:(1:440)(1:441))|442|547|443)(4:423|(1:425)(2:426|(1:428)(2:429|(1:431)(2:432|433)))|411|433)))|409|405)|406|548|443|399)|546|444)|(2:450|545)(10:451|516|452|510|453|454|500|455|537|96)|469|393)|543)|470|541)(4:377|(0)|470|541)))))|471)|359|542|471|338)|540|472|538)|473|332)|536|474|(1:476)|477)))(1:155)|156|(1:158)(1:160)|159|161|(1:163)(13:165|(1:167)(1:168)|169|(1:171)(1:173)|172|174|(1:176)|177|(1:181)|182|(1:186)|187|(1:189)(12:190|(6:193|(1:197)(2:200|(4:202|(2:237|209)(2:206|(2:208|209)(5:210|(18:213|(1:215)(1:217)|216|218|506|219|220|482|221|222|530|223|224|526|225|558|573|211)|559|237|209))|199|239)(3:238|199|239))|198|199|239|191)|557|240|241|(1:243)(3:245|(1:247)(2:249|(1:251)(2:252|(1:254)(11:255|(1:257)(1:258)|259|(6:262|(1:266)(3:268|(4:270|(3:272|(3:276|(18:279|532|280|281|524|282|283|514|284|285|508|286|287|502|288|550|572|277)|553)|274)(1:301)|275|552)|302)|267|551|302|260)|549|303|304|534|305|308|(0)(0))))|248)|244|304|534|305|308|(0)(0)))|164|241|(0)(0)|244|304|534|305|308|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0a9d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0c32 A[PHI: r36
  0x0c32: PHI (r36v5 java.lang.String) = 
  (r36v4 java.lang.String)
  (r36v4 java.lang.String)
  (r36v4 java.lang.String)
  (r36v4 java.lang.String)
  (r36v7 java.lang.String)
  (r36v7 java.lang.String)
  (r36v7 java.lang.String)
  (r36v7 java.lang.String)
  (r36v7 java.lang.String)
 binds: [B:385:0x0c18, B:387:0x0c20, B:389:0x0c28, B:391:0x0c30, B:363:0x0bc7, B:365:0x0bcf, B:371:0x0be7, B:373:0x0bef, B:375:0x0bf7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v15 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v51 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r52v1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m925J(Activity activity, String str, String str2, String str3, long j) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Class<String> cls;
        String str12;
        String str13;
        String str14;
        String str15;
        Class<String> cls2;
        String str16;
        String str17;
        String str18;
        boolean z;
        String str19;
        String str20;
        String str21;
        String str22;
        Class<String> cls3;
        ClassLoader classLoader;
        ArrayList arrayList;
        String str23;
        long jMax;
        ?? r17;
        ?? r18;
        String str24;
        String str25;
        String str26;
        long j2;
        StringBuilder sb;
        ?? r30;
        String str27;
        String str28;
        ?? r20;
        String str29;
        String str30;
        String str31;
        long j3;
        StringBuilder sb2;
        ?? r302;
        String str32;
        String str33;
        String lowerCase;
        String str34;
        String str35;
        String str36;
        long j4;
        StringBuilder sb3;
        ?? r303;
        C0435r6 c0435r6;
        StringBuilder sb4;
        ?? r304;
        long j5;
        boolean z2;
        ?? r305;
        boolean z3;
        boolean z4;
        StringBuilder sb5;
        String str37;
        String str38;
        ClassLoader classLoader2;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        long j6;
        ArrayList arrayList2;
        Object obj;
        String str47;
        ClassLoader classLoader3;
        String str48;
        String str49;
        String str50;
        Class<String> cls4;
        String str51;
        String str52;
        String str53;
        Class<String> cls5;
        String str54;
        String str55;
        String str56;
        String str57;
        String str58;
        Object obj2;
        String str59;
        ArrayList arrayList3;
        String str60;
        String str61;
        String str62;
        String str63;
        String str64;
        ClassLoader classLoader4;
        long j7;
        String str65;
        int i;
        String str66;
        long jM940Y;
        String str67;
        String str68;
        int iMin;
        String str69;
        ArrayList arrayList4;
        int i2;
        int i3;
        String str70;
        String str71;
        Class<String> cls6;
        String str72;
        int i4;
        String str73;
        String str74;
        String str75;
        String str76;
        Object obj3;
        String str77;
        Object objNewInstance;
        String str78;
        String str79;
        String str80;
        String str81;
        String str82;
        ArrayList arrayList5;
        String str83;
        String str84;
        String str85;
        String str86;
        String str87;
        Class clsM990y;
        String str88;
        String str89;
        Class<String> cls7;
        Class<?> cls8;
        Class<String> cls9;
        ClassLoader classLoaderM922H = m922H(activity);
        String str90 = " targetUid=";
        int i5 = 3;
        Class<String> cls10 = String.class;
        Class<String> cls11 = Long.class;
        String str91 = "禁言";
        String str92 = ": ";
        String str93 = " target=";
        String str94 = " reason=";
        String str95 = "group action failed type=";
        String str96 = " method=";
        int i6 = 0;
        if ("禁言".equals(str3)) {
            str4 = "解禁";
            str5 = "踢出";
            str6 = "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi";
            str7 = " reason=kernel group service null";
            str8 = " reason=target uid unresolved target=";
            str9 = " reason=bad groupCode ";
            str10 = str96;
            str11 = "group action invoked class=";
            cls = cls10;
            str12 = str93;
            str13 = str2;
            str14 = str91;
        } else {
            if (!"解禁".equals(str3)) {
                if ("踢出".equals(str3)) {
                    Object objM955g0 = m955g0(classLoaderM922H, "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi");
                    if (objM955g0 == null) {
                        HookEntry.log("group action failed type=" + str3 + " reason=ITroopMemberOperationRepoApi null");
                        str75 = "解禁";
                        str76 = "踢出";
                        str18 = "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi";
                        str79 = str94;
                        str80 = str96;
                        str81 = "group action invoked class=";
                        str82 = str93;
                        str78 = str2;
                    } else {
                        str75 = "解禁";
                        str76 = "踢出";
                        try {
                            clsM990y = m990y(classLoaderM922H, "com.tencent.qqnt.bean.b");
                        } catch (Throwable th) {
                            th = th;
                            obj3 = objM955g0;
                            str77 = "group action invoked class=";
                            str18 = "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi";
                        }
                        if (clsM990y == null) {
                            obj3 = objM955g0;
                            str77 = "group action invoked class=";
                            str18 = "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi";
                            objNewInstance = null;
                            if (objNewInstance == null) {
                                HookEntry.log("group action failed type=" + str3 + " reason=DeleteTroopMemberParam null");
                                str78 = str2;
                                str79 = str94;
                                str80 = str96;
                                str81 = str77;
                                str82 = str93;
                            } else {
                                ArrayList arrayListM950e = m950e(obj3.getClass());
                                int i7 = 0;
                                while (i7 < arrayListM950e.size()) {
                                    Method method = (Method) arrayListM950e.get(i7);
                                    if (!"deleteTroopMember".equals(method.getName()) || Modifier.isAbstract(method.getModifiers())) {
                                        arrayList5 = arrayListM950e;
                                        str83 = str94;
                                        str84 = str96;
                                        str85 = str77;
                                        str86 = str93;
                                    } else {
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == 4 && parameterTypes[0].isInstance(objNewInstance)) {
                                            Activity activity2 = parameterTypes[1].isInstance(activity) ? activity : null;
                                            Object objM970o = m970o(classLoaderM922H, parameterTypes[3], str3);
                                            try {
                                                method.setAccessible(true);
                                                Object obj4 = obj3;
                                                try {
                                                    method.invoke(obj4, objNewInstance, activity2, "Elaris", objM970o);
                                                    StringBuilder sb6 = new StringBuilder();
                                                    str85 = str77;
                                                    try {
                                                        sb6.append(str85);
                                                        sb6.append(obj4.getClass().getName());
                                                        str84 = str96;
                                                        try {
                                                            sb6.append(str84);
                                                            arrayList5 = arrayListM950e;
                                                            try {
                                                                sb6.append(m933R(method));
                                                                str87 = str93;
                                                                try {
                                                                    sb6.append(str87);
                                                                    obj3 = obj4;
                                                                    try {
                                                                        sb6.append(str2);
                                                                        HookEntry.log(sb6.toString());
                                                                        return true;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        Throwable thM913C0 = m913C0(th);
                                                                        StringBuilder sbM1b = AbstractC0000a.m1b("group action failed type=", str3, str84);
                                                                        sbM1b.append(m933R(method));
                                                                        str83 = str94;
                                                                        sbM1b.append(str83);
                                                                        str86 = str87;
                                                                        sbM1b.append(thM913C0.getClass().getSimpleName());
                                                                        sbM1b.append(": ");
                                                                        sbM1b.append(thM913C0.getMessage());
                                                                        HookEntry.log(sbM1b.toString());
                                                                        i7++;
                                                                        str94 = str83;
                                                                        str77 = str85;
                                                                        arrayListM950e = arrayList5;
                                                                        str93 = str86;
                                                                        str96 = str84;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    obj3 = obj4;
                                                                    Throwable thM913C02 = m913C0(th);
                                                                    StringBuilder sbM1b2 = AbstractC0000a.m1b("group action failed type=", str3, str84);
                                                                    sbM1b2.append(m933R(method));
                                                                    str83 = str94;
                                                                    sbM1b2.append(str83);
                                                                    str86 = str87;
                                                                    sbM1b2.append(thM913C02.getClass().getSimpleName());
                                                                    sbM1b2.append(": ");
                                                                    sbM1b2.append(thM913C02.getMessage());
                                                                    HookEntry.log(sbM1b2.toString());
                                                                    i7++;
                                                                    str94 = str83;
                                                                    str77 = str85;
                                                                    arrayListM950e = arrayList5;
                                                                    str93 = str86;
                                                                    str96 = str84;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                obj3 = obj4;
                                                                str87 = str93;
                                                                Throwable thM913C022 = m913C0(th);
                                                                StringBuilder sbM1b22 = AbstractC0000a.m1b("group action failed type=", str3, str84);
                                                                sbM1b22.append(m933R(method));
                                                                str83 = str94;
                                                                sbM1b22.append(str83);
                                                                str86 = str87;
                                                                sbM1b22.append(thM913C022.getClass().getSimpleName());
                                                                sbM1b22.append(": ");
                                                                sbM1b22.append(thM913C022.getMessage());
                                                                HookEntry.log(sbM1b22.toString());
                                                                i7++;
                                                                str94 = str83;
                                                                str77 = str85;
                                                                arrayListM950e = arrayList5;
                                                                str93 = str86;
                                                                str96 = str84;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            arrayList5 = arrayListM950e;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        arrayList5 = arrayListM950e;
                                                        obj3 = obj4;
                                                        str87 = str93;
                                                        str84 = str96;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    arrayList5 = arrayListM950e;
                                                    obj3 = obj4;
                                                    str87 = str93;
                                                    str84 = str96;
                                                    str85 = str77;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                arrayList5 = arrayListM950e;
                                                str87 = str93;
                                                str84 = str96;
                                                str85 = str77;
                                            }
                                        }
                                    }
                                    i7++;
                                    str94 = str83;
                                    str77 = str85;
                                    arrayListM950e = arrayList5;
                                    str93 = str86;
                                    str96 = str84;
                                }
                                str78 = str2;
                                str79 = str94;
                                str80 = str96;
                                str81 = str77;
                                str82 = str93;
                                StringBuilder sbM1b3 = AbstractC0000a.m1b("group action failed type=", str3, " reason=deleteTroopMember method unresolved service=");
                                sbM1b3.append(obj3.getClass().getName());
                                HookEntry.log(sbM1b3.toString());
                            }
                        } else {
                            objNewInstance = clsM990y.newInstance();
                            m973p0(objNewInstance, "a", str);
                            str18 = "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi";
                            try {
                                m973p0(objNewInstance, "b", Boolean.FALSE);
                                String strM972p = m972p(str2);
                                String strM909A0 = strM972p.startsWith("u_") ? strM972p : m909A0(classLoaderM922H, strM972p);
                                if (strM972p.startsWith("u_")) {
                                    strM972p = m911B0(classLoaderM922H, strM972p);
                                }
                                str77 = "group action invoked class=";
                                try {
                                    obj3 = objM955g0;
                                    if (strM972p.length() >= 5) {
                                        try {
                                            if (!strM972p.startsWith("u_")) {
                                                Class<?>[] clsArr = {cls10};
                                                Object[] objArr = {strM972p};
                                                if (objNewInstance != null) {
                                                    try {
                                                        Method method2 = objNewInstance.getClass().getMethod("b", clsArr);
                                                        method2.setAccessible(true);
                                                        method2.invoke(objNewInstance, objArr);
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            AbstractC0000a.m3d(m913C0(th), new StringBuilder("group action failed type=踢出 reason=DeleteTroopMemberParam "), ": ");
                                            objNewInstance = null;
                                        }
                                    }
                                    if (strM909A0.length() > 0) {
                                        Class<?>[] clsArr2 = {cls10, cls10};
                                        if (strM972p.length() > 0) {
                                            str89 = strM972p;
                                            str88 = strM909A0;
                                        } else {
                                            str89 = strM909A0;
                                            str88 = str89;
                                        }
                                        Object[] objArr2 = {str88, str89};
                                        if (objNewInstance != null) {
                                            try {
                                                Method method3 = objNewInstance.getClass().getMethod("a", clsArr2);
                                                method3.setAccessible(true);
                                                method3.invoke(objNewInstance, objArr2);
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                    } else {
                                        str88 = strM909A0;
                                    }
                                    HookEntry.log("group action delete param groupUin=" + str + " targetUid=" + str88 + " targetUin=" + strM972p);
                                } catch (Throwable th10) {
                                    th = th10;
                                    obj3 = objM955g0;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                obj3 = objM955g0;
                                str77 = "group action invoked class=";
                            }
                            if (objNewInstance == null) {
                            }
                        }
                        AbstractC0000a.m3d(m913C0(th), new StringBuilder("group action failed type=踢出 reason=DeleteTroopMemberParam "), ": ");
                        objNewInstance = null;
                        if (objNewInstance == null) {
                        }
                    }
                    long jM940Y2 = m940Y(str);
                    if (jM940Y2 <= 0) {
                        HookEntry.log("group action failed type=" + str3 + " reason=bad groupCode " + str);
                    } else {
                        ArrayList arrayListM993z0 = m993z0(classLoaderM922H, str78);
                        if (arrayListM993z0.isEmpty()) {
                            HookEntry.log("group action failed type=" + str3 + " reason=target uid unresolved target=" + str78);
                        } else {
                            Object objM928M = m928M(classLoaderM922H, str3);
                            if (objM928M == null) {
                                HookEntry.log("group action failed type=" + str3 + " reason=kernel group service null");
                            } else {
                                Class<?> clsM990y2 = m990y(classLoaderM922H, "com.tencent.qqnt.kernel.nativeinterface.KickMemberReq", "com.tencent.qqnt.kernelpublic.nativeinterface.KickMemberReq");
                                if (clsM990y2 == null) {
                                    HookEntry.log("group action failed type=" + str3 + " reason=KickMemberReq class null");
                                } else {
                                    ArrayList arrayListM950e2 = m950e(objM928M.getClass());
                                    int i8 = 0;
                                    while (i8 < arrayListM950e2.size()) {
                                        int i9 = i8;
                                        Method method4 = (Method) arrayListM950e2.get(i8);
                                        ArrayList arrayList6 = arrayListM950e2;
                                        if (!"kickMemberV2".equals(method4.getName()) || Modifier.isAbstract(method4.getModifiers())) {
                                            cls8 = clsM990y2;
                                            cls9 = cls10;
                                        } else {
                                            Class<?>[] parameterTypes2 = method4.getParameterTypes();
                                            cls9 = cls10;
                                            if (parameterTypes2.length == 2 && parameterTypes2[i6].isAssignableFrom(clsM990y2)) {
                                                try {
                                                    Object objNewInstance2 = clsM990y2.newInstance();
                                                    ArrayList arrayList7 = new ArrayList();
                                                    cls8 = clsM990y2;
                                                    try {
                                                        arrayList7.add((String) arrayListM993z0.get(i6));
                                                        m973p0(objNewInstance2, "groupCode", Long.valueOf(jM940Y2));
                                                        m973p0(objNewInstance2, "kickListUids", arrayList7);
                                                        m973p0(objNewInstance2, "kickFlag", 0);
                                                        Object objM970o2 = m970o(classLoaderM922H, parameterTypes2[1], str3);
                                                        method4.setAccessible(true);
                                                        method4.invoke(objM928M, objNewInstance2, objM970o2);
                                                        HookEntry.log(str81 + objM928M.getClass().getName() + str80 + m933R(method4) + " targetUid=" + ((String) arrayListM993z0.get(0)));
                                                        return true;
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        Throwable thM913C03 = m913C0(th);
                                                        StringBuilder sbM1b4 = AbstractC0000a.m1b("group action failed type=", str3, str80);
                                                        sbM1b4.append(m933R(method4));
                                                        sbM1b4.append(str79);
                                                        sbM1b4.append(thM913C03.getClass().getSimpleName());
                                                        sbM1b4.append(": ");
                                                        sbM1b4.append(thM913C03.getMessage());
                                                        HookEntry.log(sbM1b4.toString());
                                                        i8 = i9 + 1;
                                                        arrayListM950e2 = arrayList6;
                                                        cls10 = cls9;
                                                        clsM990y2 = cls8;
                                                        i6 = 0;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    cls8 = clsM990y2;
                                                }
                                            } else {
                                                cls8 = clsM990y2;
                                            }
                                        }
                                        i8 = i9 + 1;
                                        arrayListM950e2 = arrayList6;
                                        cls10 = cls9;
                                        clsM990y2 = cls8;
                                        i6 = 0;
                                    }
                                    cls7 = cls10;
                                    StringBuilder sbM1b5 = AbstractC0000a.m1b("group action failed type=", str3, " reason=kickMemberV2 method unresolved service=");
                                    sbM1b5.append(objM928M.getClass().getName());
                                    HookEntry.log(sbM1b5.toString());
                                    str19 = "group action failed type=";
                                    str21 = str79;
                                    str22 = str81;
                                    classLoader = classLoaderM922H;
                                    str20 = str80;
                                    cls3 = cls11;
                                    cls2 = cls7;
                                    str17 = str82;
                                    str15 = str75;
                                    str16 = str76;
                                }
                            }
                        }
                    }
                    cls7 = cls10;
                    str19 = "group action failed type=";
                    str21 = str79;
                    str22 = str81;
                    classLoader = classLoaderM922H;
                    str20 = str80;
                    cls3 = cls11;
                    cls2 = cls7;
                    str17 = str82;
                    str15 = str75;
                    str16 = str76;
                } else {
                    str18 = "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi";
                    str15 = "解禁";
                    str19 = "group action failed type=";
                    str16 = "踢出";
                    str22 = "group action invoked class=";
                    cls2 = cls10;
                    classLoader = classLoaderM922H;
                    cls3 = cls11;
                    str17 = str93;
                    str21 = str94;
                    str20 = str96;
                }
                z = false;
                arrayList = new ArrayList();
                m948d(arrayList, m955g0(classLoader, str18));
                m948d(arrayList, m955g0(classLoader, "com.tencent.qqnt.troop.ITroopOperationRepoApi"));
                m948d(arrayList, m955g0(classLoader, "com.tencent.qqnt.troop.api.ITroopOperationRepoApi"));
                Field declaredField = XposedHelpers.findClass("com.tencent.qqnt.troop.TroopOperationRepo", classLoader).getDeclaredField("INSTANCE");
                declaredField.setAccessible(true);
                Object obj5 = declaredField.get(null);
                m948d(arrayList, obj5);
                if (!arrayList.isEmpty()) {
                    HookEntry.log(str19 + str3 + " reason=troop operation service null");
                    return z;
                }
                String str97 = str91;
                String str98 = str15;
                boolean z5 = (str97.equals(str3) || str98.equals(str3)) ? true : z;
                if (str97.equals(str3)) {
                    str23 = str19;
                    jMax = Math.max(1L, j);
                } else {
                    str23 = str19;
                    jMax = 0;
                }
                StringBuilder sb7 = new StringBuilder();
                ArrayList arrayList8 = new ArrayList();
                String strM972p2 = m972p(str2);
                if (strM972p2.length() > 0) {
                    arrayList8.add(strM972p2);
                }
                String strM911B0 = m911B0(classLoader, strM972p2);
                if (strM911B0.length() > 0 && !arrayList8.contains(strM911B0)) {
                    arrayList8.add(strM911B0);
                }
                ?? r1 = z;
                ?? r2 = arrayList;
                ?? r15 = arrayList8;
                while (r1 < r2.size()) {
                    boolean z6 = z5;
                    Object obj6 = r2.get(r1);
                    if (obj6 == null) {
                        r17 = r1;
                        r18 = r2;
                        str24 = str98;
                        str25 = str23;
                        str26 = str97;
                        j2 = jMax;
                        sb = sb7;
                        r30 = r15;
                        str27 = str17;
                        str28 = str16;
                    } else {
                        r17 = r1;
                        r18 = r2;
                        ?? r22 = z;
                        ?? M950e = m950e(obj6.getClass());
                        ?? r152 = r15;
                        while (r22 < M950e.size()) {
                            ?? r52 = M950e;
                            Method method5 = (Method) M950e.get(r22);
                            if (method5 == null || Modifier.isStatic(method5.getModifiers()) || Modifier.isAbstract(method5.getModifiers())) {
                                r20 = r22;
                            } else {
                                if (method5.getName() == null) {
                                    r20 = r22;
                                    lowerCase = "";
                                } else {
                                    r20 = r22;
                                    lowerCase = method5.getName().toLowerCase(Locale.US);
                                }
                                r20 = r20;
                                if (!lowerCase.contains("msg")) {
                                    r20 = r20;
                                    if (!lowerCase.contains("mask")) {
                                        r20 = r20;
                                        if (!lowerCase.contains("notify")) {
                                            r20 = r20;
                                            if (!lowerCase.contains("clock")) {
                                                String str99 = str16;
                                                if (str99.equals(str3)) {
                                                    str33 = str99;
                                                    if (lowerCase.contains("kick") || lowerCase.contains("kickout") || ((lowerCase.contains("delete") || lowerCase.contains("remove")) && (lowerCase.contains("member") || lowerCase.contains("troop") || lowerCase.contains("group")))) {
                                                        ?? r23 = z;
                                                        r152 = r152;
                                                        while (r23 < r152.size()) {
                                                            ?? r21 = r23;
                                                            String str100 = (String) r152.get(r23);
                                                            Class<?>[] parameterTypes3 = method5.getParameterTypes();
                                                            if (parameterTypes3 == null) {
                                                                str34 = str98;
                                                                str35 = str23;
                                                                str36 = str97;
                                                                j4 = jMax;
                                                                sb3 = sb7;
                                                                r303 = r152;
                                                                c0435r6 = null;
                                                            } else {
                                                                str34 = str98;
                                                                Object[] objArr3 = new Object[parameterTypes3.length];
                                                                str35 = str23;
                                                                str36 = str97;
                                                                j4 = jMax;
                                                                boolean z7 = z;
                                                                boolean z8 = z7;
                                                                boolean z9 = z8 ? 1 : 0;
                                                                boolean z10 = z9 ? 1 : 0;
                                                                ?? r10 = z7;
                                                                boolean z11 = z8;
                                                                ?? r153 = r152;
                                                                while (r10 < parameterTypes3.length) {
                                                                    Class<?> cls12 = parameterTypes3[r10];
                                                                    Class<?>[] clsArr3 = parameterTypes3;
                                                                    Class<String> clsM919F0 = m919F0(cls12);
                                                                    ?? r27 = r10;
                                                                    Class<String> cls13 = cls2;
                                                                    if (clsM919F0 != cls13) {
                                                                        cls2 = cls13;
                                                                        if (List.class.isAssignableFrom(clsM919F0)) {
                                                                            objArr3[r27 == true ? 1 : 0] = Collections.singletonList(str100);
                                                                        } else if (Set.class.isAssignableFrom(clsM919F0)) {
                                                                            HashSet hashSet = new HashSet();
                                                                            hashSet.add(str100);
                                                                            objArr3[r27 == true ? 1 : 0] = hashSet;
                                                                        } else if (clsM919F0 == cls3 || clsM919F0 == Integer.class || clsM919F0 == Short.class) {
                                                                            if (z10) {
                                                                                sb4 = sb7;
                                                                                r304 = r153;
                                                                                j5 = 0;
                                                                            } else {
                                                                                sb4 = sb7;
                                                                                r304 = r153;
                                                                                j5 = j4;
                                                                            }
                                                                            if (clsM919F0 == Integer.class) {
                                                                                objArr3[r27 == true ? 1 : 0] = Integer.valueOf((int) j5);
                                                                            } else if (clsM919F0 == Short.class) {
                                                                                objArr3[r27 == true ? 1 : 0] = Short.valueOf((short) j5);
                                                                            } else {
                                                                                objArr3[r27 == true ? 1 : 0] = Long.valueOf(j5);
                                                                            }
                                                                            z2 = true;
                                                                            sb7 = sb4;
                                                                            r153 = r304;
                                                                            z10 = z2;
                                                                            parameterTypes3 = clsArr3;
                                                                            r10 = (r27 == true ? 1 : 0) + 1;
                                                                            z11 = z11;
                                                                        } else {
                                                                            if (clsM919F0 == Boolean.class) {
                                                                                objArr3[r27 == true ? 1 : 0] = Boolean.valueOf(z6);
                                                                            } else if (Context.class.isAssignableFrom(clsM919F0)) {
                                                                                objArr3[r27 == true ? 1 : 0] = activity;
                                                                            } else if (cls12.isPrimitive()) {
                                                                                objArr3[r27 == true ? 1 : 0] = m943a0(cls12);
                                                                            } else {
                                                                                objArr3[r27 == true ? 1 : 0] = null;
                                                                                r304 = r153;
                                                                                z2 = z10;
                                                                                z11 = z11;
                                                                            }
                                                                            r304 = r153;
                                                                            z2 = z10;
                                                                            z11 = z11;
                                                                        }
                                                                        r305 = r153;
                                                                        z3 = z10;
                                                                        z9 = true;
                                                                        z4 = z11;
                                                                        z2 = z3;
                                                                        z11 = z4;
                                                                        r304 = r305;
                                                                    } else if (!z11) {
                                                                        objArr3[r27 == true ? 1 : 0] = str;
                                                                        cls2 = cls13;
                                                                        r305 = r153;
                                                                        z3 = z10;
                                                                        z4 = true;
                                                                        z2 = z3;
                                                                        z11 = z4;
                                                                        r304 = r305;
                                                                    } else if (z9) {
                                                                        objArr3[r27 == true ? 1 : 0] = "";
                                                                        cls2 = cls13;
                                                                        r304 = r153;
                                                                        z2 = z10;
                                                                        z11 = z11;
                                                                    } else {
                                                                        objArr3[r27 == true ? 1 : 0] = str100;
                                                                        cls2 = cls13;
                                                                        r305 = r153;
                                                                        z3 = z10;
                                                                        z9 = true;
                                                                        z4 = z11;
                                                                        z2 = z3;
                                                                        z11 = z4;
                                                                        r304 = r305;
                                                                    }
                                                                    sb4 = sb7;
                                                                    sb7 = sb4;
                                                                    r153 = r304;
                                                                    z10 = z2;
                                                                    parameterTypes3 = clsArr3;
                                                                    r10 = (r27 == true ? 1 : 0) + 1;
                                                                    z11 = z11;
                                                                }
                                                                sb3 = sb7;
                                                                r303 = r153;
                                                                c0435r6 = new C0435r6(objArr3, z11, z9);
                                                            }
                                                            if (c0435r6 != null && c0435r6.f792b && c0435r6.f793c) {
                                                                try {
                                                                    method5.setAccessible(true);
                                                                    try {
                                                                        method5.invoke(obj6, c0435r6.f791a);
                                                                        StringBuilder sb8 = new StringBuilder();
                                                                        sb8.append(str22);
                                                                        sb8.append(obj6.getClass().getName());
                                                                        sb8.append(str20);
                                                                        sb8.append(m933R(method5));
                                                                        str37 = str17;
                                                                        try {
                                                                            sb8.append(str37);
                                                                            sb8.append(str100);
                                                                            HookEntry.log(sb8.toString());
                                                                            return true;
                                                                        } catch (Throwable th14) {
                                                                            th = th14;
                                                                            Throwable thM913C04 = m913C0(th);
                                                                            if (sb3.length() > 0) {
                                                                                sb5 = sb3;
                                                                                sb5.append(" | ");
                                                                            } else {
                                                                                sb5 = sb3;
                                                                            }
                                                                            sb5.append(m933R(method5));
                                                                            sb5.append(str37);
                                                                            sb5.append(str100);
                                                                            sb5.append(' ');
                                                                            sb5.append(thM913C04.getClass().getSimpleName());
                                                                            sb5.append(':');
                                                                            sb5.append(thM913C04.getMessage());
                                                                            jMax = j4;
                                                                            sb7 = sb5;
                                                                            str17 = str37;
                                                                            str23 = str35;
                                                                            str97 = str36;
                                                                            r152 = r303;
                                                                            str98 = str34;
                                                                            r23 = (r21 == true ? 1 : 0) + 1;
                                                                        }
                                                                    } catch (Throwable th15) {
                                                                        th = th15;
                                                                        str37 = str17;
                                                                    }
                                                                } catch (Throwable th16) {
                                                                    th = th16;
                                                                    str37 = str17;
                                                                }
                                                            } else {
                                                                sb5 = sb3;
                                                                str37 = str17;
                                                            }
                                                            jMax = j4;
                                                            sb7 = sb5;
                                                            str17 = str37;
                                                            str23 = str35;
                                                            str97 = str36;
                                                            r152 = r303;
                                                            str98 = str34;
                                                            r23 = (r21 == true ? 1 : 0) + 1;
                                                        }
                                                    }
                                                    str29 = str98;
                                                    str30 = str23;
                                                    str31 = str97;
                                                    j3 = jMax;
                                                    sb2 = sb7;
                                                    r302 = r152;
                                                    str32 = str17;
                                                } else {
                                                    str33 = str99;
                                                    if ((str97.equals(str3) || str98.equals(str3)) && !lowerCase.contains("all") && (lowerCase.contains("mute") || lowerCase.contains("shutup") || lowerCase.contains("shut") || lowerCase.contains("forbid"))) {
                                                    }
                                                    str29 = str98;
                                                    str30 = str23;
                                                    str31 = str97;
                                                    j3 = jMax;
                                                    sb2 = sb7;
                                                    r302 = r152;
                                                    str32 = str17;
                                                }
                                            }
                                        }
                                    }
                                }
                                M950e = r52;
                                jMax = j3;
                                sb7 = sb2;
                                str17 = str32;
                                str23 = str30;
                                str97 = str31;
                                r152 = r302;
                                str98 = str29;
                                str16 = str33;
                                r22 = r20 + 1;
                            }
                            str29 = str98;
                            str30 = str23;
                            str31 = str97;
                            j3 = jMax;
                            sb2 = sb7;
                            r302 = r152;
                            str32 = str17;
                            str33 = str16;
                            M950e = r52;
                            jMax = j3;
                            sb7 = sb2;
                            str17 = str32;
                            str23 = str30;
                            str97 = str31;
                            r152 = r302;
                            str98 = str29;
                            str16 = str33;
                            r22 = r20 + 1;
                        }
                        str24 = str98;
                        str25 = str23;
                        str26 = str97;
                        j2 = jMax;
                        sb = sb7;
                        r30 = r152;
                        str27 = str17;
                        str28 = str16;
                        m929N(obj6, str3);
                    }
                    jMax = j2;
                    sb7 = sb;
                    str17 = str27;
                    z5 = z6 ? 1 : 0;
                    r2 = r18;
                    str23 = str25;
                    str97 = str26;
                    r15 = r30;
                    str98 = str24;
                    str16 = str28;
                    r1 = r17 + 1;
                }
                String str101 = str23;
                StringBuilder sb9 = sb7;
                if (sb9.length() > 0) {
                    StringBuilder sbM1b6 = AbstractC0000a.m1b(str101, str3, str21);
                    sbM1b6.append(m967m0(sb9.toString()));
                    HookEntry.log(sbM1b6.toString());
                }
                return z;
            }
            str4 = "解禁";
            str5 = "踢出";
            str6 = "com.tencent.qqnt.troop.ITroopMemberOperationRepoApi";
            str7 = " reason=kernel group service null";
            str8 = " reason=target uid unresolved target=";
            str9 = " reason=bad groupCode ";
            str10 = str96;
            str11 = "group action invoked class=";
            cls = cls10;
            str14 = str91;
            str12 = str93;
            str13 = str2;
        }
        String str102 = str10;
        String str103 = str7;
        String str104 = str11;
        str91 = str14;
        long jMax2 = str14.equals(str3) ? Math.max(1L, j) : 0L;
        String str105 = str6;
        Object objM955g02 = m955g0(classLoaderM922H, str105);
        String str106 = "setMemberShutUp";
        if (objM955g02 == null) {
            HookEntry.log("group action failed type=" + str3 + " reason=ITroopMemberOperationRepoApi null");
            str43 = str;
            str18 = str105;
        } else {
            String strM972p3 = m972p(str13);
            String strM909A02 = strM972p3.startsWith("u_") ? strM972p3 : m909A0(classLoaderM922H, strM972p3);
            String strM911B02 = strM972p3.startsWith("u_") ? m911B0(classLoaderM922H, strM972p3) : strM972p3;
            str18 = str105;
            ArrayList arrayList9 = new ArrayList();
            if (strM909A02.length() > 0) {
                arrayList9.add(strM909A02);
            }
            if (strM911B02.length() > 0 && !strM911B02.equals(strM909A02)) {
                arrayList9.add(strM911B02);
            }
            if (strM972p3.length() > 0 && !arrayList9.contains(strM972p3)) {
                arrayList9.add(strM972p3);
            }
            if (arrayList9.isEmpty()) {
                HookEntry.log("group action failed type=" + str3 + " reason=repo target unresolved target=" + str13);
                str43 = str;
            } else {
                ArrayList arrayListM950e3 = m950e(objM955g02.getClass());
                String str107 = str102;
                int i10 = 0;
                while (i10 < arrayListM950e3.size()) {
                    int i11 = i10;
                    Method method6 = (Method) arrayListM950e3.get(i10);
                    if (!str106.equals(method6.getName()) || Modifier.isAbstract(method6.getModifiers())) {
                        arrayList2 = arrayList9;
                        obj = objM955g02;
                        str47 = str8;
                        classLoader3 = classLoaderM922H;
                        str48 = str90;
                        str49 = str103;
                        str50 = str107;
                        cls4 = cls;
                        str51 = str12;
                        str52 = str4;
                        str53 = str5;
                    } else {
                        str48 = str90;
                        Class<?>[] parameterTypes4 = method6.getParameterTypes();
                        Object obj7 = objM955g02;
                        if (parameterTypes4.length == 6) {
                            Class<String> cls14 = cls;
                            if (m919F0(parameterTypes4[0]) == cls14 && m919F0(parameterTypes4[1]) == cls14) {
                                Class<String> clsM919F02 = m919F0(parameterTypes4[2]);
                                Class<String> cls15 = cls11;
                                if (clsM919F02 != cls15) {
                                    arrayList2 = arrayList9;
                                    cls4 = cls14;
                                    str47 = str8;
                                    classLoader3 = classLoaderM922H;
                                    cls11 = cls15;
                                    str49 = str103;
                                    str50 = str107;
                                    str51 = str12;
                                    str52 = str4;
                                    str53 = str5;
                                    obj = obj7;
                                } else {
                                    cls11 = cls15;
                                    int i12 = 0;
                                    while (i12 < arrayList9.size()) {
                                        String str108 = (String) arrayList9.get(i12);
                                        ArrayList arrayList10 = arrayList9;
                                        Activity activity3 = parameterTypes4[3].isInstance(activity) ? activity : null;
                                        Object objM970o3 = m970o(classLoaderM922H, parameterTypes4[5], str3);
                                        try {
                                            method6.setAccessible(true);
                                            String str109 = str95;
                                            try {
                                                Long lValueOf = Long.valueOf(jMax2);
                                                cls5 = cls14;
                                                str54 = str8;
                                                str56 = str107;
                                                str57 = str4;
                                                str58 = str5;
                                                obj2 = obj7;
                                                str59 = str9;
                                                arrayList3 = arrayListM950e3;
                                                str61 = str92;
                                                str63 = str109;
                                                str62 = str108;
                                                str55 = str103;
                                                str60 = str106;
                                                classLoader4 = classLoaderM922H;
                                                j7 = jMax2;
                                                str65 = str94;
                                                i = i12;
                                                str66 = str12;
                                                try {
                                                    method6.invoke(obj2, str, str62, lValueOf, activity3, "Elaris", objM970o3);
                                                    StringBuilder sb10 = new StringBuilder();
                                                    str64 = str104;
                                                    try {
                                                        sb10.append(str64);
                                                        sb10.append(obj2.getClass().getName());
                                                        sb10.append(str56);
                                                        sb10.append(m933R(method6));
                                                        sb10.append(str66);
                                                        sb10.append(str62);
                                                        sb10.append(" seconds=");
                                                        sb10.append(j7);
                                                        sb10.append(" source=repo");
                                                        HookEntry.log(sb10.toString());
                                                        return true;
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        Throwable thM913C05 = m913C0(th);
                                                        StringBuilder sbM1b7 = AbstractC0000a.m1b(str63, str3, str56);
                                                        sbM1b7.append(m933R(method6));
                                                        sbM1b7.append(str66);
                                                        sbM1b7.append(str62);
                                                        String str110 = str65;
                                                        sbM1b7.append(str110);
                                                        sbM1b7.append(thM913C05.getClass().getSimpleName());
                                                        String str111 = str61;
                                                        sbM1b7.append(str111);
                                                        sbM1b7.append(thM913C05.getMessage());
                                                        HookEntry.log(sbM1b7.toString());
                                                        int i13 = i + 1;
                                                        obj7 = obj2;
                                                        str104 = str64;
                                                        str94 = str110;
                                                        jMax2 = j7;
                                                        str95 = str63;
                                                        str12 = str66;
                                                        classLoaderM922H = classLoader4;
                                                        str106 = str60;
                                                        arrayListM950e3 = arrayList3;
                                                        str103 = str55;
                                                        arrayList9 = arrayList10;
                                                        str8 = str54;
                                                        str5 = str58;
                                                        cls14 = cls5;
                                                        i12 = i13;
                                                        str92 = str111;
                                                        str107 = str56;
                                                        str9 = str59;
                                                        str4 = str57;
                                                    }
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    str64 = str104;
                                                }
                                            } catch (Throwable th19) {
                                                th = th19;
                                                cls5 = cls14;
                                                str54 = str8;
                                                str56 = str107;
                                                str57 = str4;
                                                str58 = str5;
                                                str64 = str104;
                                                obj2 = obj7;
                                                str59 = str9;
                                                arrayList3 = arrayListM950e3;
                                                str61 = str92;
                                                str63 = str109;
                                                str62 = str108;
                                                str55 = str103;
                                                str60 = str106;
                                                classLoader4 = classLoaderM922H;
                                                j7 = jMax2;
                                                str65 = str94;
                                                i = i12;
                                                str66 = str12;
                                                Throwable thM913C052 = m913C0(th);
                                                StringBuilder sbM1b72 = AbstractC0000a.m1b(str63, str3, str56);
                                                sbM1b72.append(m933R(method6));
                                                sbM1b72.append(str66);
                                                sbM1b72.append(str62);
                                                String str1102 = str65;
                                                sbM1b72.append(str1102);
                                                sbM1b72.append(thM913C052.getClass().getSimpleName());
                                                String str1112 = str61;
                                                sbM1b72.append(str1112);
                                                sbM1b72.append(thM913C052.getMessage());
                                                HookEntry.log(sbM1b72.toString());
                                                int i132 = i + 1;
                                                obj7 = obj2;
                                                str104 = str64;
                                                str94 = str1102;
                                                jMax2 = j7;
                                                str95 = str63;
                                                str12 = str66;
                                                classLoaderM922H = classLoader4;
                                                str106 = str60;
                                                arrayListM950e3 = arrayList3;
                                                str103 = str55;
                                                arrayList9 = arrayList10;
                                                str8 = str54;
                                                str5 = str58;
                                                cls14 = cls5;
                                                i12 = i132;
                                                str92 = str1112;
                                                str107 = str56;
                                                str9 = str59;
                                                str4 = str57;
                                            }
                                        } catch (Throwable th20) {
                                            th = th20;
                                            cls5 = cls14;
                                            str54 = str8;
                                            str55 = str103;
                                            str56 = str107;
                                            str57 = str4;
                                            str58 = str5;
                                            obj2 = obj7;
                                            str59 = str9;
                                            arrayList3 = arrayListM950e3;
                                            str60 = str106;
                                            str61 = str92;
                                            str62 = str108;
                                            str63 = str95;
                                            str64 = str104;
                                        }
                                    }
                                    arrayList2 = arrayList9;
                                    cls4 = cls14;
                                    str47 = str8;
                                    classLoader3 = classLoaderM922H;
                                    str49 = str103;
                                    str50 = str107;
                                    str51 = str12;
                                    str52 = str4;
                                    str53 = str5;
                                    obj = obj7;
                                }
                            } else {
                                arrayList2 = arrayList9;
                                cls4 = cls14;
                                str47 = str8;
                                classLoader3 = classLoaderM922H;
                                str49 = str103;
                                str50 = str107;
                                str51 = str12;
                                str52 = str4;
                                str53 = str5;
                                obj = obj7;
                            }
                            i10 = i11 + 1;
                            objM955g02 = obj;
                            str104 = str104;
                            str94 = str94;
                            jMax2 = jMax2;
                            str95 = str95;
                            str12 = str51;
                            classLoaderM922H = classLoader3;
                            str106 = str106;
                            arrayListM950e3 = arrayListM950e3;
                            str103 = str49;
                            str90 = str48;
                            arrayList9 = arrayList2;
                            str8 = str47;
                            str5 = str53;
                            cls = cls4;
                            str92 = str92;
                            str107 = str50;
                            str9 = str9;
                            str4 = str52;
                        } else {
                            arrayList2 = arrayList9;
                            str47 = str8;
                            classLoader3 = classLoaderM922H;
                            str49 = str103;
                            str50 = str107;
                            cls4 = cls;
                            str51 = str12;
                            str52 = str4;
                            str53 = str5;
                            obj = obj7;
                            i10 = i11 + 1;
                            objM955g02 = obj;
                            str104 = str104;
                            str94 = str94;
                            jMax2 = jMax2;
                            str95 = str95;
                            str12 = str51;
                            classLoaderM922H = classLoader3;
                            str106 = str106;
                            arrayListM950e3 = arrayListM950e3;
                            str103 = str49;
                            str90 = str48;
                            arrayList9 = arrayList2;
                            str8 = str47;
                            str5 = str53;
                            cls = cls4;
                            str92 = str92;
                            str107 = str50;
                            str9 = str9;
                            str4 = str52;
                        }
                    }
                    i10 = i11 + 1;
                    objM955g02 = obj;
                    str104 = str104;
                    str94 = str94;
                    jMax2 = jMax2;
                    str95 = str95;
                    str12 = str51;
                    classLoaderM922H = classLoader3;
                    str106 = str106;
                    arrayListM950e3 = arrayListM950e3;
                    str103 = str49;
                    str90 = str48;
                    arrayList9 = arrayList2;
                    str8 = str47;
                    str5 = str53;
                    cls = cls4;
                    str92 = str92;
                    str107 = str50;
                    str9 = str9;
                    str4 = str52;
                }
                Object obj8 = objM955g02;
                str38 = str8;
                classLoader2 = classLoaderM922H;
                str39 = str90;
                str40 = str103;
                str20 = str107;
                cls2 = cls;
                str41 = str94;
                str42 = str12;
                str15 = str4;
                str16 = str5;
                z = false;
                str43 = str;
                str44 = str9;
                str45 = str106;
                str46 = str92;
                j6 = jMax2;
                str19 = str95;
                str22 = str104;
                StringBuilder sbM1b8 = AbstractC0000a.m1b(str19, str3, " reason=repo setMemberShutUp method unresolved service=");
                sbM1b8.append(obj8.getClass().getName());
                HookEntry.log(sbM1b8.toString());
                jM940Y = m940Y(str43);
                if (jM940Y > 0) {
                    HookEntry.log(str19 + str3 + str44 + str43);
                    str21 = str41;
                    str17 = str42;
                    classLoader = classLoader2;
                } else {
                    classLoader = classLoader2;
                    Object objM928M2 = m928M(classLoader, str3);
                    if (objM928M2 == null) {
                        HookEntry.log(str19 + str3 + str40);
                    } else {
                        Class clsM990y3 = m990y(classLoader, "com.tencent.qqnt.kernel.nativeinterface.GroupMemberShutUpInfo", "com.tencent.qqnt.kernelpublic.nativeinterface.GroupMemberShutUpInfo");
                        if (clsM990y3 == null) {
                            HookEntry.log(str19 + str3 + " reason=GroupMemberShutUpInfo class null");
                        } else {
                            ArrayList arrayListM993z02 = m993z0(classLoader, str2);
                            if (arrayListM993z02.isEmpty()) {
                                HookEntry.log(str19 + str3 + str38 + str2);
                            } else {
                                if (j6 <= 0) {
                                    str67 = str46;
                                    str68 = str41;
                                    iMin = z ? 1 : 0;
                                } else {
                                    str67 = str46;
                                    str68 = str41;
                                    iMin = (int) Math.min(2147483647L, (System.currentTimeMillis() / 1000) + j6);
                                }
                                ArrayList arrayListM950e4 = m950e(objM928M2.getClass());
                                int i14 = z ? 1 : 0;
                                while (i14 < arrayListM950e4.size()) {
                                    Method method7 = (Method) arrayListM950e4.get(i14);
                                    ArrayList arrayList11 = arrayListM950e4;
                                    String str112 = str45;
                                    if (!str112.equals(method7.getName()) || Modifier.isAbstract(method7.getModifiers())) {
                                        str45 = str112;
                                    } else {
                                        str45 = str112;
                                        Class<?>[] parameterTypes5 = method7.getParameterTypes();
                                        if (parameterTypes5.length == i5) {
                                            Class<String> clsM919F03 = m919F0(parameterTypes5[z ? 1 : 0]);
                                            cls6 = cls11;
                                            if (clsM919F03 == cls6) {
                                                i3 = i14;
                                                if (ArrayList.class.isAssignableFrom(m919F0(parameterTypes5[1]))) {
                                                    int i15 = z ? 1 : 0;
                                                    while (i15 < arrayListM993z02.size()) {
                                                        ArrayList arrayList12 = arrayListM993z02;
                                                        String str113 = (String) arrayListM993z02.get(i15);
                                                        try {
                                                            Object objNewInstance3 = clsM990y3.newInstance();
                                                            i4 = i15;
                                                            try {
                                                                m973p0(objNewInstance3, "uid", str113);
                                                                str73 = str42;
                                                                try {
                                                                    m973p0(objNewInstance3, "timeStamp", Integer.valueOf(iMin == true ? 1 : 0));
                                                                    ArrayList arrayList13 = new ArrayList();
                                                                    arrayList13.add(objNewInstance3);
                                                                    try {
                                                                        Object objM970o4 = m970o(classLoader, parameterTypes5[2], str3);
                                                                        method7.setAccessible(true);
                                                                        method7.invoke(objM928M2, Long.valueOf(jM940Y), arrayList13, objM970o4);
                                                                        StringBuilder sb11 = new StringBuilder();
                                                                        sb11.append(str22);
                                                                        sb11.append(objM928M2.getClass().getName());
                                                                        sb11.append(str20);
                                                                        sb11.append(m933R(method7));
                                                                        str74 = str39;
                                                                        try {
                                                                            sb11.append(str74);
                                                                            sb11.append(str113);
                                                                            sb11.append(" seconds=");
                                                                            sb11.append(j6);
                                                                            sb11.append(" expire=");
                                                                            sb11.append(iMin == true ? 1 : 0);
                                                                            HookEntry.log(sb11.toString());
                                                                            return true;
                                                                        } catch (Throwable th21) {
                                                                            th = th21;
                                                                            Throwable thM913C06 = m913C0(th);
                                                                            StringBuilder sbM1b9 = AbstractC0000a.m1b(str19, str3, str20);
                                                                            sbM1b9.append(m933R(method7));
                                                                            sbM1b9.append(str74);
                                                                            sbM1b9.append(str113);
                                                                            String str114 = str68;
                                                                            sbM1b9.append(str114);
                                                                            sbM1b9.append(thM913C06.getClass().getSimpleName());
                                                                            boolean z12 = iMin == true ? 1 : 0;
                                                                            sbM1b9.append(str67);
                                                                            sbM1b9.append(thM913C06.getMessage());
                                                                            HookEntry.log(sbM1b9.toString());
                                                                            str39 = str74;
                                                                            iMin = z12 ? 1 : 0;
                                                                            str42 = str73;
                                                                            i15 = i4 + 1;
                                                                            str68 = str114;
                                                                            arrayListM993z02 = arrayList12;
                                                                        }
                                                                    } catch (Throwable th22) {
                                                                        th = th22;
                                                                        str74 = str39;
                                                                    }
                                                                } catch (Throwable th23) {
                                                                    th = th23;
                                                                    str74 = str39;
                                                                    Throwable thM913C062 = m913C0(th);
                                                                    StringBuilder sbM1b92 = AbstractC0000a.m1b(str19, str3, str20);
                                                                    sbM1b92.append(m933R(method7));
                                                                    sbM1b92.append(str74);
                                                                    sbM1b92.append(str113);
                                                                    String str1142 = str68;
                                                                    sbM1b92.append(str1142);
                                                                    sbM1b92.append(thM913C062.getClass().getSimpleName());
                                                                    boolean z122 = iMin == true ? 1 : 0;
                                                                    sbM1b92.append(str67);
                                                                    sbM1b92.append(thM913C062.getMessage());
                                                                    HookEntry.log(sbM1b92.toString());
                                                                    str39 = str74;
                                                                    iMin = z122 ? 1 : 0;
                                                                    str42 = str73;
                                                                    i15 = i4 + 1;
                                                                    str68 = str1142;
                                                                    arrayListM993z02 = arrayList12;
                                                                }
                                                            } catch (Throwable th24) {
                                                                th = th24;
                                                                str73 = str42;
                                                                str74 = str39;
                                                                Throwable thM913C0622 = m913C0(th);
                                                                StringBuilder sbM1b922 = AbstractC0000a.m1b(str19, str3, str20);
                                                                sbM1b922.append(m933R(method7));
                                                                sbM1b922.append(str74);
                                                                sbM1b922.append(str113);
                                                                String str11422 = str68;
                                                                sbM1b922.append(str11422);
                                                                sbM1b922.append(thM913C0622.getClass().getSimpleName());
                                                                boolean z1222 = iMin == true ? 1 : 0;
                                                                sbM1b922.append(str67);
                                                                sbM1b922.append(thM913C0622.getMessage());
                                                                HookEntry.log(sbM1b922.toString());
                                                                str39 = str74;
                                                                iMin = z1222 ? 1 : 0;
                                                                str42 = str73;
                                                                i15 = i4 + 1;
                                                                str68 = str11422;
                                                                arrayListM993z02 = arrayList12;
                                                            }
                                                        } catch (Throwable th25) {
                                                            th = th25;
                                                            i4 = i15;
                                                        }
                                                    }
                                                }
                                                arrayList4 = arrayListM993z02;
                                            } else {
                                                arrayList4 = arrayListM993z02;
                                                i3 = i14;
                                            }
                                            str69 = str42;
                                            str71 = str68;
                                            str70 = str39;
                                            i2 = iMin;
                                            str72 = str67;
                                        }
                                        int i16 = i3 + 1;
                                        str67 = str72;
                                        cls11 = cls6;
                                        str39 = str70;
                                        arrayListM950e4 = arrayList11;
                                        iMin = i2;
                                        str42 = str69;
                                        i5 = 3;
                                        i14 = i16;
                                        str68 = str71;
                                        arrayListM993z02 = arrayList4;
                                    }
                                    arrayList4 = arrayListM993z02;
                                    str69 = str42;
                                    cls6 = cls11;
                                    str71 = str68;
                                    i2 = iMin == true ? 1 : 0;
                                    i3 = i14;
                                    str72 = str67;
                                    str70 = str39;
                                    int i162 = i3 + 1;
                                    str67 = str72;
                                    cls11 = cls6;
                                    str39 = str70;
                                    arrayListM950e4 = arrayList11;
                                    iMin = i2;
                                    str42 = str69;
                                    i5 = 3;
                                    i14 = i162;
                                    str68 = str71;
                                    arrayListM993z02 = arrayList4;
                                }
                                str17 = str42;
                                cls3 = cls11;
                                str21 = str68;
                                StringBuilder sbM1b10 = AbstractC0000a.m1b(str19, str3, " reason=setMemberShutUp method unresolved service=");
                                sbM1b10.append(objM928M2.getClass().getName());
                                HookEntry.log(sbM1b10.toString());
                                arrayList = new ArrayList();
                                m948d(arrayList, m955g0(classLoader, str18));
                                m948d(arrayList, m955g0(classLoader, "com.tencent.qqnt.troop.ITroopOperationRepoApi"));
                                m948d(arrayList, m955g0(classLoader, "com.tencent.qqnt.troop.api.ITroopOperationRepoApi"));
                                Field declaredField2 = XposedHelpers.findClass("com.tencent.qqnt.troop.TroopOperationRepo", classLoader).getDeclaredField("INSTANCE");
                                declaredField2.setAccessible(true);
                                Object obj52 = declaredField2.get(null);
                                m948d(arrayList, obj52);
                                if (!arrayList.isEmpty()) {
                                }
                            }
                        }
                    }
                    str21 = str41;
                    str17 = str42;
                }
                cls3 = cls11;
                arrayList = new ArrayList();
                m948d(arrayList, m955g0(classLoader, str18));
                m948d(arrayList, m955g0(classLoader, "com.tencent.qqnt.troop.ITroopOperationRepoApi"));
                m948d(arrayList, m955g0(classLoader, "com.tencent.qqnt.troop.api.ITroopOperationRepoApi"));
                Field declaredField22 = XposedHelpers.findClass("com.tencent.qqnt.troop.TroopOperationRepo", classLoader).getDeclaredField("INSTANCE");
                declaredField22.setAccessible(true);
                Object obj522 = declaredField22.get(null);
                m948d(arrayList, obj522);
                if (!arrayList.isEmpty()) {
                }
            }
        }
        str38 = str8;
        str20 = str102;
        classLoader2 = classLoaderM922H;
        str39 = " targetUid=";
        str40 = str103;
        cls2 = cls;
        str41 = str94;
        str42 = str12;
        str15 = str4;
        str16 = str5;
        z = false;
        str44 = str9;
        str45 = "setMemberShutUp";
        str46 = ": ";
        j6 = jMax2;
        str19 = "group action failed type=";
        str22 = str104;
        jM940Y = m940Y(str43);
        if (jM940Y > 0) {
        }
        cls3 = cls11;
        arrayList = new ArrayList();
        m948d(arrayList, m955g0(classLoader, str18));
        m948d(arrayList, m955g0(classLoader, "com.tencent.qqnt.troop.ITroopOperationRepoApi"));
        m948d(arrayList, m955g0(classLoader, "com.tencent.qqnt.troop.api.ITroopOperationRepoApi"));
        Field declaredField222 = XposedHelpers.findClass("com.tencent.qqnt.troop.TroopOperationRepo", classLoader).getDeclaredField("INSTANCE");
        declaredField222.setAccessible(true);
        Object obj5222 = declaredField222.get(null);
        m948d(arrayList, obj5222);
        if (!arrayList.isEmpty()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static boolean m926K(C0024b7 c0024b7) {
        if (c0024b7 == null) {
            return false;
        }
        int i = c0024b7.f62a;
        return i == 2 || i == 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m927L(String str, String str2) {
        String strM972p = m972p(str);
        return (strM972p.length() == 0 || strM972p.equals(m972p(str2)) || m931P(strM972p) || strM972p.indexOf(65533) >= 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static Object m928M(ClassLoader classLoader, String str) {
        try {
            Object objM952f = m952f(classLoader);
            if (objM952f == null) {
                HookEntry.log("group action failed type=" + str + " reason=app runtime null");
                return null;
            }
            Class clsM990y = m990y(classLoader, "com.tencent.qqnt.kernel.api.IKernelService");
            if (clsM990y == null) {
                HookEntry.log("group action failed type=" + str + " reason=IKernelService class null");
                return null;
            }
            Method methodM908A = m908A(objM952f.getClass(), "getRuntimeService", 2);
            if (methodM908A == null) {
                HookEntry.log("group action failed type=" + str + " reason=getRuntimeService method null runtime=" + objM952f.getClass().getName());
                return null;
            }
            methodM908A.setAccessible(true);
            Object objM966m = m966m(methodM908A.invoke(objM952f, clsM990y, ""), "getGroupService");
            if (!m920G(objM966m, "setMemberShutUp") && !m920G(objM966m, "kickMemberV2")) {
                Object objM966m2 = m966m(objM966m, "getService");
                if (!m920G(objM966m2, "setMemberShutUp") && !m920G(objM966m2, "kickMemberV2")) {
                    objM966m2 = m910B(objM966m);
                    if (m920G(objM966m2, "setMemberShutUp") || m920G(objM966m2, "kickMemberV2")) {
                    }
                }
                return objM966m2;
            }
            return objM966m;
        } catch (Throwable th) {
            AbstractC0000a.m3d(m913C0(th), AbstractC0000a.m1b("group action failed type=", str, " reason=kernel group service "), ": ");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m929N(Object obj, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayListM950e = m950e(obj.getClass());
            for (int i = 0; i < arrayListM950e.size(); i++) {
                Method method = (Method) arrayListM950e.get(i);
                String lowerCase = method.getName() == null ? "" : method.getName().toLowerCase(Locale.US);
                if (lowerCase.contains("mute") || lowerCase.contains("shut") || lowerCase.contains("forbid") || lowerCase.contains("kick") || lowerCase.contains("remove") || lowerCase.contains("delete") || lowerCase.contains("recall")) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append(m933R(method));
                    if (sb.length() > 700) {
                        break;
                    }
                }
            }
            HookEntry.log("group api candidates action=" + str + " class=" + obj.getClass().getName() + " methods=" + m967m0(sb.toString()));
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static boolean m930O(Object obj, String str, String str2, String str3) {
        if (obj == null) {
            return false;
        }
        String lowerCase = obj.getClass().getName().toLowerCase(Locale.US);
        if (!lowerCase.contains("at") && !lowerCase.contains("mention") && !lowerCase.contains("uin")) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        String strM972p = m972p(str);
        String strTrim = str2.trim();
        String strM972p2 = m972p(str3);
        if (strM972p.length() > 0 && strValueOf.contains(strM972p)) {
            return true;
        }
        if (strTrim.length() <= 0 || !strValueOf.contains(strTrim)) {
            return (strM972p2.length() > 0 && strValueOf.contains(strM972p2)) || lowerCase.contains("atinfo") || lowerCase.contains("mention") || lowerCase.contains("atspan");
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static boolean m931P(String str) {
        String strM972p = m972p(str);
        if (strM972p.length() == 0) {
            return false;
        }
        if (strM972p.startsWith("u_") || strM972p.startsWith("@u_")) {
            return true;
        }
        return strM972p.length() > 24 && strM972p.indexOf(95) >= 0 && strM972p.matches("[A-Za-z0-9_\\-]+");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static String m932Q(Object obj) {
        if (obj == null) {
            return "";
        }
        String strTrim = m912C(obj, "msgId", "msgUid", "msgSeq", "shmsgseq", "uniseq", "msgseq").trim();
        return strTrim.length() > 0 ? strTrim : m917E0(String.valueOf(obj), "msgId", "msgUid", "msgSeq", "shmsgseq", "uniseq", "msgseq").trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static String m933R(Method method) {
        if (method == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        sb.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(parameterTypes[i].getName());
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static Object[] m934S(Class[] clsArr, Activity activity, EditText editText, String str, String str2, String str3, String str4) {
        if (clsArr == null || clsArr.length == 0 || clsArr.length > 6) {
            return null;
        }
        Object[] objArr = new Object[clsArr.length];
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            Class clsM919F0 = m919F0(cls);
            if (clsM919F0 == String.class || CharSequence.class.isAssignableFrom(clsM919F0)) {
                if (!z2) {
                    objArr[i] = (str2 == null || str2.length() <= 0) ? str3 : str2;
                    z = true;
                    z2 = true;
                } else if (z3) {
                    objArr[i] = str == null ? "" : str;
                } else {
                    objArr[i] = (str4 == null || str4.length() == 0) ? str3 : str4;
                    z3 = true;
                }
            } else if (clsM919F0 == Long.class || clsM919F0 == Integer.class || clsM919F0 == Short.class) {
                long jM940Y = m940Y(str3.length() > 0 ? str3 : str2);
                if (jM940Y <= 0) {
                    return null;
                }
                if (clsM919F0 == Integer.class) {
                    objArr[i] = Integer.valueOf((int) jM940Y);
                } else if (clsM919F0 == Short.class) {
                    objArr[i] = Short.valueOf((short) jM940Y);
                } else {
                    objArr[i] = Long.valueOf(jM940Y);
                }
                z = true;
            } else if (EditText.class.isAssignableFrom(clsM919F0)) {
                if (editText == null) {
                    return null;
                }
                objArr[i] = editText;
            } else if (View.class.isAssignableFrom(clsM919F0)) {
                if (editText == null) {
                    return null;
                }
                objArr[i] = editText;
            } else if (Context.class.isAssignableFrom(clsM919F0)) {
                if (activity == null) {
                    return null;
                }
                objArr[i] = activity;
            } else if (clsM919F0 == Boolean.class) {
                objArr[i] = Boolean.TRUE;
            } else {
                if (!cls.isPrimitive()) {
                    return null;
                }
                objArr[i] = m943a0(cls);
            }
        }
        if (z) {
            return objArr;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static String m935T(Object obj, String str, String str2, String str3, int i, Set set) {
        Field[] declaredFields;
        Object obj2 = obj;
        Set set2 = set;
        if (obj2 == null || i > 4 || set2 == null || set2.contains(obj2) || (obj2 instanceof String) || (obj2 instanceof Number) || (obj2 instanceof Boolean) || (obj2 instanceof Context)) {
            return "";
        }
        if ((obj2 instanceof View) && i > 0) {
            return "";
        }
        set2.add(obj2);
        if (m930O(obj, str, str2, str3)) {
            return obj2.getClass().getName();
        }
        int i2 = 0;
        if (obj2 instanceof Spanned) {
            Spanned spanned = (Spanned) obj2;
            if (AbstractC0366oc.m770a(spanned) == null) {
                return "";
            }
            try {
                Object[] spans = spanned.getSpans(0, Math.min(spanned.length(), 160), Object.class);
                int length = spans.length;
                while (i2 < length) {
                    Object obj3 = spans[i2];
                    if (m930O(obj3, str, str2, str3)) {
                        return obj3.getClass().getName();
                    }
                    i2++;
                }
                return "android.text.Spanned";
            } catch (Throwable unused) {
                return "android.text.Spanned";
            }
        }
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (obj2 instanceof Iterable) {
            Iterator it = ((Iterable) obj2).iterator();
            while (it.hasNext()) {
                String strM935T = m935T(it.next(), str4, str5, str6, i + 1, set2);
                if (strM935T.length() > 0) {
                    return strM935T;
                }
                i2++;
                if (i2 >= 32) {
                    return "";
                }
                str4 = str;
                str5 = str2;
                str6 = str3;
                set2 = set;
            }
            return "";
        }
        Class<?> cls = obj2.getClass();
        if (cls.isPrimitive() || cls.isEnum() || cls.isArray()) {
            return "";
        }
        String name = cls.getName();
        if (i > 0 && !name.startsWith("com.tencent.") && !name.startsWith("android.text.")) {
            return "";
        }
        for (Class<?> superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused2) {
                declaredFields = null;
            }
            Field[] fieldArr = declaredFields;
            if (fieldArr != null) {
                int i3 = 0;
                for (Field field : fieldArr) {
                    try {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            field.setAccessible(true);
                            String strM935T2 = m935T(field.get(obj2), str, str2, str3, i + 1, set);
                            if (strM935T2.length() > 0) {
                                return superclass.getName() + "." + field.getName() + "->" + strM935T2;
                            }
                            i3++;
                            if (i3 >= 48) {
                                break;
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static Object m936U(ClassLoader classLoader, String str) {
        int i;
        int i2 = 2;
        if (classLoader == null || str == null || str.length() == 0) {
            return null;
        }
        String[] strArr = {"com.tencent.qqnt.kernelpublic.nativeinterface.Contact", "com.tencent.qqnt.kernel.nativeinterface.Contact"};
        int i3 = 0;
        while (i3 < i2) {
            try {
                Class<?> clsFindClass = XposedHelpers.findClass(strArr[i3], classLoader);
                Constructor<?>[] declaredConstructors = clsFindClass.getDeclaredConstructors();
                int i4 = 0;
                while (i4 < declaredConstructors.length) {
                    Constructor<?> constructor = declaredConstructors[i4];
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    constructor.setAccessible(true);
                    int length = parameterTypes.length;
                    Class<?> cls = Integer.TYPE;
                    i = i2;
                    if (length == 3) {
                        try {
                            if (parameterTypes[0] == cls && parameterTypes[1] == String.class && parameterTypes[i] == String.class) {
                                return constructor.newInstance(2, str, "");
                            }
                        } catch (Throwable unused) {
                            continue;
                            i3++;
                            i2 = i;
                        }
                    }
                    if (parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[i] == cls) {
                        return constructor.newInstance(str, "", 2);
                    }
                    i4++;
                    i2 = i;
                }
                Object objNewInstance = clsFindClass.newInstance();
                m973p0(objNewInstance, "chatType", 2);
                m973p0(objNewInstance, "type", 2);
                m973p0(objNewInstance, "peerUid", str);
                m973p0(objNewInstance, "peerUin", str);
                m973p0(objNewInstance, "uin", str);
                m973p0(objNewInstance, "uid", str);
                m973p0(objNewInstance, "guildId", "");
                return objNewInstance;
            } catch (Throwable unused2) {
                i = i2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static Set m937V() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static Object m938W(ClassLoader classLoader, String str, byte[] bArr) {
        HashMap map;
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.qphone.base.remote.ToServiceMsg", classLoader);
            Constructor<?> constructor = clsFindClass.getConstructor(String.class, String.class, String.class);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance("mobileqq.service", str, "OidbSvc.0x8fc_2");
            Method method = clsFindClass.getMethod("putWupBuffer", byte[].class);
            method.setAccessible(true);
            method.invoke(objNewInstance, bArr);
            Field fieldM986w = m986w(clsFindClass, "attributes");
            if (fieldM986w != null) {
                fieldM986w.setAccessible(true);
                Object obj = fieldM986w.get(objNewInstance);
                if (obj instanceof HashMap) {
                    map = (HashMap) obj;
                } else {
                    map = new HashMap();
                    fieldM986w.set(objNewInstance, map);
                }
                map.put("req_pb_protocol_flag", Boolean.TRUE);
            }
            return objNewInstance;
        } catch (Throwable th) {
            AbstractC0000a.m3d(m913C0(th), new StringBuilder("group action failed type=设置头衔 reason=ToServiceMsg "), ": ");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static String m939X(View view) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object parent = view; parent instanceof View; parent = ((View) parent).getParent()) {
            int i2 = i + 1;
            if (i >= 8) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(" > ");
            }
            sb.append(((View) parent).getClass().getName());
            try {
                i = i2;
            } catch (Throwable unused) {
            }
        }
        return m967m0(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static long m940Y(String str) {
        if (str == null || str.length() == 0) {
            return 0L;
        }
        try {
            return Long.parseLong(str.trim());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static boolean m941Z(String str) {
        String strTrim = str.trim();
        if (strTrim.length() >= 5 && strTrim.length() <= 32) {
            for (int i = 0; i < strTrim.length(); i++) {
                char cCharAt = strTrim.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m942a(Context context, Activity activity, View view, String str, String str2, String str3, String str4, String str5, long j) {
        String str6;
        String str7;
        View view2;
        String str8 = str5;
        try {
            try {
                if ("艾特".equals(str8)) {
                    if (view == null) {
                        try {
                            View decorView = activity.getWindow() != null ? activity.getWindow().getDecorView() : view;
                            view2 = decorView;
                        } catch (Throwable unused) {
                            view2 = view;
                        }
                    }
                    str6 = str;
                    RunnableC0447s2 runnableC0447s2 = new RunnableC0447s2(activity, view, str6, str2, str3);
                    try {
                        if (view2 != null) {
                            view2.postDelayed(runnableC0447s2, 140L);
                        } else {
                            runnableC0447s2.run();
                        }
                        return;
                    } catch (Throwable unused2) {
                        runnableC0447s2.run();
                        return;
                    }
                }
                if ("禁言".equals(str8) && j <= 0) {
                    m979s0(context, activity, view, str, str2, str3);
                    return;
                }
                if ("设置头衔".equals(str8)) {
                    m977r0(activity, str, str2, str3);
                    return;
                }
                if ("撤回该成员消息".equals(str8)) {
                    if (str != null && str.length() != 0 && str4 != null && str4.length() != 0) {
                        if (!m963k0(activity, str, str4)) {
                            HookEntry.log("group action failed type=" + str8 + " reason=recall api unresolved groupUin=" + str + " msgId=" + str4);
                            m991y0("未找到 QQ 撤回接口");
                            return;
                        }
                        HookEntry.log("group action success type=" + str8 + " groupUin=" + str + " msgId=" + str4);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str8);
                        sb.append(", msgId=");
                        sb.append(str4);
                        AbstractC0260i5.m579W0(str, str2, "avatar-action", sb.toString());
                        m991y0("已发起撤回");
                        return;
                    }
                    HookEntry.log("group action failed type=" + str8 + " reason=missing groupUin/msgId groupUin=" + str + " msgId=" + str4);
                    m991y0("未获取到可撤回的消息");
                    return;
                }
                if (str2 == null || str2.length() == 0) {
                    HookEntry.log("group action failed type=" + str8 + " reason=missing targetUin");
                    m991y0("未获取到成员 UID");
                    return;
                }
                try {
                    if (!m925J(activity, str, str2, str8, j)) {
                        HookEntry.log("group action failed type=" + str8 + " reason=qq group management api unresolved groupUin=" + str + " targetUin=" + str2);
                        AbstractC0260i5.m579W0(str, str2, "avatar-action-unresolved", str8);
                        m991y0("未找到 QQ 群管接口");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("group action submitted type=");
                    sb2.append(str8);
                    sb2.append(" groupUin=");
                    sb2.append(str);
                    sb2.append(" targetUin=");
                    sb2.append(str2);
                    String str9 = "";
                    if ("禁言".equals(str8)) {
                        str7 = " seconds=" + j;
                    } else {
                        str7 = "";
                    }
                    sb2.append(str7);
                    HookEntry.log(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str8);
                    if ("禁言".equals(str8)) {
                        str9 = ", seconds=" + j;
                    }
                    sb3.append(str9);
                    AbstractC0260i5.m579W0(str, str2, "avatar-action", sb3.toString());
                    return;
                } catch (Throwable th) {
                    th = th;
                    str8 = str8;
                    str6 = str;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str6 = str;
        }
        AbstractC0000a.m3d(th, AbstractC0000a.m1b("group action failed type=", str8, " reason="), ": ");
        AbstractC0260i5.m588Z0(str6, "avatar-menu-action", th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static Object m943a0(Class cls) {
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        return cls == Character.TYPE ? (char) 0 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m944b(Activity activity, String str, String str2, String str3, String str4, String str5) {
        View decorView = null;
        try {
            if (activity.getWindow() != null) {
                decorView = activity.getWindow().getDecorView();
            }
        } catch (Throwable unused) {
        }
        RunnableC0312l6 runnableC0312l6 = new RunnableC0312l6(activity, str4, str3, str2, str5, str);
        try {
            if (decorView != null) {
                decorView.postDelayed(runnableC0312l6, 620L);
            } else {
                runnableC0312l6.run();
            }
        } catch (Throwable unused2) {
            runnableC0312l6.run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static byte[] m945b0(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bArr == null) {
            bArr = new byte[0];
        }
        m923H0(byteArrayOutputStream, (((long) i) << 3) | 2);
        m923H0(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static LinearLayout m946c(Activity activity, String str, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(m982u(activity, 14.0f), m982u(activity, 2.0f), m982u(activity, 14.0f), m982u(activity, 2.0f));
        linearLayout.setMinimumHeight(m982u(activity, 44.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_pressed};
        int iRgb = Color.rgb(239, 241, 245);
        int iM982u = m982u(activity, 17.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setCornerRadius(iM982u);
        stateListDrawable.addState(iArr, gradientDrawable);
        int[] iArr2 = {R.attr.state_selected};
        int iRgb2 = Color.rgb(242, 244, 247);
        int iM982u2 = m982u(activity, 17.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(iRgb2);
        gradientDrawable2.setCornerRadius(iM982u2);
        stateListDrawable.addState(iArr2, gradientDrawable2);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        linearLayout.setBackground(stateListDrawable);
        TextView textViewM989x0 = m989x0(activity, str, 15.0f, f847b, false);
        textViewM989x0.setSingleLine(true);
        textViewM989x0.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textViewM989x0, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewM989x02 = m989x0(activity, "›", 20.0f, Color.rgb(204, 211, 222), false);
        textViewM989x02.setGravity(17);
        linearLayout.addView(textViewM989x02, new LinearLayout.LayoutParams(m982u(activity, 20.0f), m982u(activity, 26.0f)));
        linearLayout.setOnClickListener(onClickListener);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static byte[] m947c0(byte[]... bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null && bArr2.length > 0) {
                byteArrayOutputStream.write(bArr2, 0, bArr2.length);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m948d(ArrayList arrayList, Object obj) {
        if (obj != null) {
            arrayList.add(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static String m949d0(int i, byte[] bArr) {
        if (bArr == null || i <= 0) {
            return "";
        }
        int[] iArr = {0};
        while (iArr[0] < bArr.length) {
            long jM957h0 = m957h0(bArr, iArr, -1L);
            if (jM957h0 < 0) {
                return "";
            }
            int i2 = (int) (jM957h0 >>> 3);
            int i3 = (int) (jM957h0 & 7);
            if (i2 == i && i3 == 2) {
                long jM957h02 = m957h0(bArr, iArr, -1L);
                if (jM957h02 < 0) {
                    return "";
                }
                int length = bArr.length;
                int i4 = iArr[0];
                if (jM957h02 > length - i4) {
                    return "";
                }
                int i5 = (int) jM957h02;
                String str = new String(bArr, i4, i5, StandardCharsets.UTF_8);
                iArr[0] = iArr[0] + i5;
                return str;
            }
            if (!m981t0(bArr, iArr, i3)) {
                return "";
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static ArrayList m950e(Class cls) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (hashSet.add(m933R(method))) {
                    arrayList.add(method);
                }
            }
            for (Method method2 : cls.getMethods()) {
                if (hashSet.add(m933R(method2))) {
                    arrayList.add(method2);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static byte[] m951e0(int i, long j) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m923H0(byteArrayOutputStream, ((long) i) << 3);
        m923H0(byteArrayOutputStream, j);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m952f(ClassLoader classLoader) {
        try {
            Object objM966m = m966m(m968n(XposedHelpers.findClass("com.tencent.common.app.BaseApplicationImpl", classLoader), "getApplication"), "getRuntime");
            if (objM966m != null) {
                return objM966m;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("mqq.app.MobileQQ", classLoader);
            Object objM968n = m968n(clsFindClass, "getContext", "getMobileQQ");
            Object objM966m2 = m966m(objM968n, "getRuntime");
            if (objM966m2 != null) {
                return objM966m2;
            }
            Field fieldM986w = m986w(clsFindClass, "mAppRuntime");
            if (fieldM986w == null || objM968n == null) {
                return null;
            }
            fieldM986w.setAccessible(true);
            Object obj = fieldM986w.get(objM968n);
            if (obj != null) {
                return obj;
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static long m953f0(int i, byte[] bArr) {
        if (bArr != null && i > 0) {
            int[] iArr = {0};
            while (iArr[0] < bArr.length) {
                long jM957h0 = m957h0(bArr, iArr, -1L);
                if (jM957h0 < 0) {
                    break;
                }
                int i2 = (int) (jM957h0 >>> 3);
                int i3 = (int) (jM957h0 & 7);
                if (i2 == i && i3 == 0) {
                    return m957h0(bArr, iArr, Long.MIN_VALUE);
                }
                if (!m981t0(bArr, iArr, i3)) {
                    break;
                }
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m954g(Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            if (window == null) {
                return;
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.4f);
            window.addFlags(2);
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setPadding(0, 0, 0, 0);
                decorView.setBackgroundColor(0);
            }
            Context context = dialog.getContext();
            window.setLayout(Math.max(m982u(context, 260.0f), Math.min(context.getResources().getDisplayMetrics().widthPixels - m982u(context, 112.0f), m982u(context, 420.0f))), -2);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static Object m955g0(ClassLoader classLoader, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (classLoader != null && str.length() != 0) {
            try {
                Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.qroute.QRoute", classLoader);
                Class<?> clsFindClass2 = XposedHelpers.findClass(str, classLoader);
                Method declaredMethod = clsFindClass.getDeclaredMethod("api", Class.class);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, clsFindClass2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m956h(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(m967m0(objArr[i]));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static long m957h0(byte[] bArr, int[] iArr, long j) {
        if (bArr != null && iArr.length != 0) {
            long j2 = 0;
            int i = 0;
            while (true) {
                int i2 = iArr[0];
                if (i2 >= bArr.length || i >= 64) {
                    break;
                }
                iArr[0] = i2 + 1;
                byte b = bArr[i2];
                j2 |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j2;
                }
                i += 7;
            }
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static LinearLayout m958i(Activity activity, Dialog dialog, Context context, View view, String str, String str2, String str3, String str4) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Activity activity2 = activity;
        LinearLayout linearLayout = new LinearLayout(activity2);
        linearLayout.setOrientation(1);
        linearLayout.setTag("elaris_dialog_surface");
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(0, 0, 0, 0);
        linearLayout.setBackground(m978s(activity2));
        TextView textViewM989x0 = m989x0(activity2, "群管菜单", 17.0f, f847b, true);
        textViewM989x0.setPadding(m982u(activity2, 14.0f), m982u(activity2, 12.0f), m982u(activity2, 14.0f), m982u(activity2, 1.0f));
        linearLayout.addView(textViewM989x0);
        String strM985v0 = m985v0(activity2, str3, str2);
        if (strM985v0.length() > 0) {
            TextView textViewM989x02 = m989x0(activity2, strM985v0, 13.0f, f848c, false);
            textViewM989x02.setSingleLine(true);
            textViewM989x02.setEllipsize(TextUtils.TruncateAt.END);
            textViewM989x02.setPadding(m982u(activity2, 14.0f), 0, m982u(activity2, 14.0f), m982u(activity2, 6.0f));
            linearLayout.addView(textViewM989x02);
        } else {
            linearLayout.addView(new Space(activity2), new LinearLayout.LayoutParams(1, m982u(activity2, 6.0f)));
        }
        linearLayout.addView(m980t(activity2));
        ScrollView scrollView = new ScrollView(activity2);
        scrollView.setOverScrollMode(2);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, 0, 0, m982u(activity2, 6.0f));
        scrollView.setBackgroundColor(0);
        LinearLayout linearLayout2 = new LinearLayout(activity2);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m946c(activity2, "艾特", new ViewOnClickListenerC0360o6(activity2, dialog, context, view, str, str2, str3, str4)));
        linearLayout2.addView(m980t(activity2));
        int i = 0;
        while (true) {
            String[] strArr = f852g;
            if (i >= strArr.length) {
                scrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -2));
                linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, -2));
                return linearLayout;
            }
            String str5 = strArr[i];
            Activity activity3 = activity2;
            activity2 = activity3;
            linearLayout2.addView(m946c(activity2, str5, new ViewOnClickListenerC0403p6(dialog, context, activity3, view, str, str2, str3, str4, str5)));
            if (i < strArr.length - 1) {
                linearLayout2.addView(m980t(activity2));
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static String m959i0(Activity activity, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strM972p = m972p(str);
        if (strM972p.length() == 0) {
            return "";
        }
        if (!strM972p.startsWith("u_")) {
            return strM972p;
        }
        String strM911B0 = m911B0(m922H(activity), strM972p);
        return (strM911B0.length() <= 0 || strM911B0.startsWith("u_")) ? "" : strM911B0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static byte[] m960j(long j, long j2, String str) {
        return m947c0(m951e0(1, 2300L), m951e0(2, 2L), m945b0(4, m947c0(m951e0(1, j), m945b0(3, m947c0(m951e0(1, j2), m945b0(5, str.getBytes(StandardCharsets.UTF_8)), m951e0(6, 4294967295L))))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static Object[] m961j0(Class[] clsArr, Object obj, long j) {
        if (clsArr != null) {
            Object[] objArr = new Object[clsArr.length];
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < clsArr.length; i++) {
                Class clsM919F0 = m919F0(clsArr[i]);
                if (!z && clsM919F0.isInstance(obj)) {
                    objArr[i] = obj;
                    z = true;
                } else if (!z2 && (clsM919F0 == Long.class || clsM919F0 == Integer.class)) {
                    objArr[i] = Long.valueOf(clsM919F0 == Integer.class ? (int) j : j);
                    z2 = true;
                } else if (clsArr[i].isPrimitive()) {
                    objArr[i] = m943a0(clsArr[i]);
                } else {
                    objArr[i] = null;
                }
            }
            if (z && z2) {
                return objArr;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static LinearLayout m962k(Activity activity, Dialog dialog, String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setTag("elaris_dialog_surface");
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(m982u(activity, 14.0f), m982u(activity, 16.0f), m982u(activity, 14.0f), m982u(activity, 14.0f));
        linearLayout.setBackground(m978s(activity));
        int i = f847b;
        TextView textViewM989x0 = m989x0(activity, "设置头衔", 18.0f, i, true);
        textViewM989x0.setPadding(0, 0, 0, m982u(activity, 4.0f));
        linearLayout.addView(textViewM989x0);
        String strM985v0 = m985v0(activity, str3, str2);
        if (strM985v0.length() > 0) {
            TextView textViewM989x02 = m989x0(activity, strM985v0, 13.0f, f848c, false);
            textViewM989x02.setSingleLine(true);
            textViewM989x02.setEllipsize(TextUtils.TruncateAt.END);
            textViewM989x02.setPadding(0, 0, 0, m982u(activity, 10.0f));
            linearLayout.addView(textViewM989x02);
        }
        EditText editText = new EditText(activity);
        editText.setSingleLine(true);
        editText.setTextSize(2, 16.0f);
        editText.setTextColor(i);
        editText.setHintTextColor(Color.rgb(145, 153, 166));
        editText.setHint("输入头衔，留空表示清空");
        editText.setInputType(524289);
        editText.setPadding(m982u(activity, 14.0f), 0, m982u(activity, 14.0f), 0);
        int iM982u = m982u(activity, 10.0f);
        int iRgb = Color.rgb(227, 231, 237);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(f849d);
        gradientDrawable.setCornerRadius(iM982u);
        gradientDrawable.setStroke(m982u(activity, 1.0f), iRgb);
        editText.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, m982u(activity, 36.0f));
        layoutParams.topMargin = m982u(activity, 6.0f);
        linearLayout.addView(editText, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setGravity(21);
        linearLayout2.setPadding(0, m982u(activity, 12.0f), 0, 0);
        TextView textViewM976r = m976r(activity, "取消", false);
        textViewM976r.setOnClickListener(new ViewOnClickListenerC0280j6(dialog, 0));
        linearLayout2.addView(textViewM976r, new LinearLayout.LayoutParams(m982u(activity, 96.0f), m982u(activity, 40.0f)));
        TextView textViewM976r2 = m976r(activity, "确定", true);
        textViewM976r2.setOnClickListener(new ViewOnClickListenerC0296k6(editText, dialog, activity, str, str2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m982u(activity, 112.0f), m982u(activity, 40.0f));
        layoutParams2.leftMargin = m982u(activity, 10.0f);
        linearLayout2.addView(textViewM976r2, layoutParams2);
        linearLayout.addView(linearLayout2);
        editText.post(new RunnableC0211f4(editText, 1));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static boolean m963k0(Activity activity, String str, String str2) {
        ClassLoader classLoaderM922H;
        Object objM955g0;
        Object[] objArrM961j0;
        try {
            classLoaderM922H = m922H(activity);
            objM955g0 = m955g0(classLoaderM922H, "com.tencent.qqnt.msg.api.IMsgService");
        } catch (Throwable th) {
            AbstractC0000a.m3d(m913C0(th), new StringBuilder("group action failed type=撤回该成员消息 reason="), ": ");
        }
        if (objM955g0 == null) {
            HookEntry.log("group action failed type=撤回该成员消息 reason=IMsgService null");
            return false;
        }
        Object objM936U = m936U(classLoaderM922H, str);
        if (objM936U == null) {
            HookEntry.log("group action failed type=撤回该成员消息 reason=Contact null");
            return false;
        }
        long jM940Y = m940Y(str2);
        if (jM940Y <= 0) {
            HookEntry.log("group action failed type=撤回该成员消息 reason=bad msgId " + str2);
            return false;
        }
        ArrayList arrayListM950e = m950e(objM955g0.getClass());
        for (int i = 0; i < arrayListM950e.size(); i++) {
            Method method = (Method) arrayListM950e.get(i);
            if ("recallMsg".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers()) && (objArrM961j0 = m961j0(method.getParameterTypes(), objM936U, jM940Y)) != null) {
                try {
                    method.setAccessible(true);
                    method.invoke(objM955g0, objArrM961j0);
                    HookEntry.log("group action invoked class=" + objM955g0.getClass().getName() + " method=" + m933R(method));
                    return true;
                } catch (Throwable th2) {
                    Throwable thM913C0 = m913C0(th2);
                    HookEntry.log("group action failed type=撤回该成员消息 method=" + m933R(method) + " reason=" + thM913C0.getClass().getSimpleName() + ": " + thM913C0.getMessage());
                }
            }
        }
        m929N(objM955g0, "recall");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static LinearLayout m964l(Context context, Activity activity, Dialog dialog, View view, String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setTag("elaris_dialog_surface");
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(m982u(activity, 14.0f), m982u(activity, 16.0f), m982u(activity, 14.0f), m982u(activity, 14.0f));
        linearLayout.setBackground(m978s(activity));
        int i = f847b;
        TextView textViewM989x0 = m989x0(activity, "禁言时长", 18.0f, i, true);
        textViewM989x0.setPadding(0, 0, 0, m982u(activity, 4.0f));
        linearLayout.addView(textViewM989x0);
        String strM985v0 = m985v0(activity, str3, str2);
        if (strM985v0.length() > 0) {
            TextView textViewM989x02 = m989x0(activity, strM985v0, 13.0f, f848c, false);
            textViewM989x02.setSingleLine(true);
            textViewM989x02.setEllipsize(TextUtils.TruncateAt.END);
            textViewM989x02.setPadding(0, 0, 0, m982u(activity, 10.0f));
            linearLayout.addView(textViewM989x02);
        }
        EditText editText = new EditText(activity);
        editText.setSingleLine(true);
        editText.setTextSize(2, 16.0f);
        editText.setTextColor(i);
        editText.setHintTextColor(Color.rgb(145, 153, 166));
        editText.setHint("支持秒数/分钟/天数");
        editText.setInputType(524289);
        editText.setPadding(m982u(activity, 14.0f), 0, m982u(activity, 14.0f), 0);
        int iM982u = m982u(activity, 10.0f);
        int iRgb = Color.rgb(227, 231, 237);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(f849d);
        gradientDrawable.setCornerRadius(iM982u);
        gradientDrawable.setStroke(m982u(activity, 1.0f), iRgb);
        editText.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, m982u(activity, 36.0f));
        layoutParams.topMargin = m982u(activity, 6.0f);
        linearLayout.addView(editText, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setGravity(21);
        linearLayout2.setPadding(0, m982u(activity, 12.0f), 0, 0);
        TextView textViewM976r = m976r(activity, "取消", false);
        textViewM976r.setOnClickListener(new ViewOnClickListenerC0280j6(dialog, 1));
        linearLayout2.addView(textViewM976r, new LinearLayout.LayoutParams(m982u(activity, 96.0f), m982u(activity, 40.0f)));
        TextView textViewM976r2 = m976r(activity, "确定", true);
        textViewM976r2.setOnClickListener(new ViewOnClickListenerC0360o6(editText, dialog, context, activity, view, str, str2, str3));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m982u(activity, 112.0f), m982u(activity, 40.0f));
        layoutParams2.leftMargin = m982u(activity, 10.0f);
        linearLayout2.addView(textViewM976r2, layoutParams2);
        linearLayout.addView(linearLayout2);
        editText.post(new RunnableC0211f4(editText, 2));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static String m965l0(Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strM912C = m912C(obj, "currentUin", "selfUin", "selfuin", "loginUin", "uin");
        if (strM912C.length() >= 5) {
            return strM912C.trim();
        }
        Object objM966m = m966m(obj, "getCurrentAccountUin", "getCurrentAccountUid", "getAccount", "getAccountUin", "getLongAccountUin");
        return (objM966m == null ? "" : String.valueOf(objM966m)).trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static Object m966m(Object obj, String... strArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (obj != null) {
            for (String str : strArr) {
                try {
                    for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                        try {
                            Method declaredMethod = superclass.getDeclaredMethod(str, null);
                            declaredMethod.setAccessible(true);
                            return declaredMethod.invoke(obj, null);
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static String m967m0(Object obj) {
        String strReplace = (obj == null ? "" : String.valueOf(obj)).replace('\r', ' ').replace('\n', ' ').replace('\t', ' ');
        return strReplace.length() > 240 ? strReplace.substring(0, 240).concat("...") : strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Object m968n(Class cls, String... strArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object objInvoke;
        if (cls != null) {
            for (String str : strArr) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod(str, null);
                    declaredMethod.setAccessible(true);
                    objInvoke = declaredMethod.invoke(null, null);
                } catch (Throwable unused) {
                }
                if (objInvoke != null) {
                    return objInvoke;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static C0024b7 m969n0(Object obj, int i, Set set) {
        Field[] declaredFields;
        if (obj == null || i > 3 || set == null || !set.add(obj)) {
            return null;
        }
        if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
            return m914D(obj);
        }
        C0024b7 c0024b7M914D = m914D(obj);
        if (c0024b7M914D != null) {
            return c0024b7M914D;
        }
        Class<?> superclass = obj.getClass();
        String name = superclass.getName();
        if (i > 0 && !name.startsWith("com.tencent.") && !(obj instanceof Activity) && !(obj instanceof View)) {
            return null;
        }
        while (superclass != null && superclass != Object.class) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    try {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            String lowerCase = field.getName().toLowerCase(Locale.US);
                            if (lowerCase.contains("aio") || lowerCase.contains("contact") || lowerCase.contains("session") || lowerCase.contains("troop") || lowerCase.contains("group") || lowerCase.contains("chat")) {
                                field.setAccessible(true);
                                C0024b7 c0024b7M969n0 = m969n0(field.get(obj), 1 + i, set);
                                if (c0024b7M969n0 != null) {
                                    return c0024b7M969n0;
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Object m970o(ClassLoader classLoader, Class cls, String str) {
        if (cls == null || !cls.isInterface()) {
            return null;
        }
        ClassLoader classLoader2 = cls.getClassLoader();
        if (classLoader2 != null) {
            classLoader = classLoader2;
        }
        return Proxy.newProxyInstance(classLoader, new Class[]{cls}, new C0344n6(0, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static boolean m971o0(Activity activity, ClassLoader classLoader, String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        long jM940Y = m940Y(str);
        long jM940Y2 = m940Y(str2);
        if (jM940Y <= 0 || jM940Y2 <= 0) {
            HookEntry.log("group action failed type=设置头衔 reason=bad group/member groupUin=" + str + " targetUin=" + str2);
            return false;
        }
        Object objM952f = m952f(classLoader);
        if (objM952f == null) {
            HookEntry.log("group action failed type=设置头衔 reason=app runtime null");
            return false;
        }
        String strM974q = m974q(activity);
        if (strM974q.length() == 0) {
            strM974q = m965l0(objM952f);
        }
        String str4 = strM974q;
        if (str4.length() == 0) {
            HookEntry.log("group action failed type=设置头衔 reason=current uin null");
            return false;
        }
        try {
            byte[] bArrM960j = m960j(jM940Y, jM940Y2, str3 == null ? "" : str3);
            if (m983u0(activity, classLoader, objM952f, str, str2, str3, bArrM960j)) {
                return true;
            }
            Object objM938W = m938W(classLoader, str4, bArrM960j);
            if (objM938W == null) {
                return false;
            }
            Method methodM908A = m908A(objM952f.getClass(), "sendToService", 1);
            if (methodM908A == null) {
                HookEntry.log("group action failed type=设置头衔 reason=sendToService method null runtime=".concat(objM952f.getClass().getName()));
                return false;
            }
            methodM908A.setAccessible(true);
            methodM908A.invoke(objM952f, objM938W);
            StringBuilder sb = new StringBuilder("group action invoked class=");
            sb.append(objM952f.getClass().getName());
            sb.append(" method=");
            sb.append(m933R(methodM908A));
            sb.append(" cmd=OidbSvc.0x8fc_2 targetUin=");
            sb.append(str2);
            sb.append(" titleLen=");
            sb.append(str3 == null ? 0 : str3.length());
            sb.append(" payload=minimal-oidb");
            HookEntry.log(sb.toString());
            return true;
        } catch (Throwable th) {
            AbstractC0000a.m3d(m913C0(th), new StringBuilder("group action failed type=设置头衔 reason=oidb "), ": ");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m972p(String str) {
        return str == null ? "" : str.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static void m973p0(Object obj, String str, Serializable serializable) {
        Field fieldM986w;
        if (obj == null || (fieldM986w = m986w(obj.getClass(), str)) == null) {
            return;
        }
        try {
            fieldM986w.setAccessible(true);
            if (fieldM986w.getType() == Integer.TYPE && (serializable instanceof Number)) {
                fieldM986w.setInt(obj, ((Number) serializable).intValue());
                return;
            }
            if (fieldM986w.getType() == Long.TYPE && (serializable instanceof Number)) {
                fieldM986w.setLong(obj, ((Number) serializable).longValue());
            } else if (fieldM986w.getType() == Boolean.TYPE && (serializable instanceof Boolean)) {
                fieldM986w.setBoolean(obj, ((Boolean) serializable).booleanValue());
            } else {
                fieldM986w.set(obj, serializable);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m974q(Activity activity) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        String strM912C = m912C(activity, "currentUin", "selfUin", "selfuin", "loginUin", "uin");
        if (strM912C.length() >= 5) {
            return strM912C.trim();
        }
        try {
            ClassLoader classLoader = activity.getClassLoader();
            String[] strArr = {"com.tencent.common.app.BaseApplicationImpl", "mqq.app.MobileQQ"};
            for (int i = 0; i < 2; i++) {
                Object objM968n = m968n(Class.forName(strArr[i], false, classLoader), "getApplication", "getMobileQQ", "getContext");
                String strM912C2 = m912C(objM968n, "currentUin", "selfUin", "selfuin", "loginUin", "uin");
                if (strM912C2.length() >= 5) {
                    return strM912C2.trim();
                }
                String strM965l0 = m965l0(m966m(objM968n, "getRuntime", "peekAppRuntime", "getAppRuntime"));
                if (strM965l0.length() >= 5) {
                    return strM965l0.trim();
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static String m975q0(String str) {
        String strM972p = m972p(str);
        if (strM972p.length() <= 18) {
            return strM972p;
        }
        return strM972p.substring(0, 8) + "..." + strM972p.substring(strM972p.length() - 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static TextView m976r(Activity activity, String str, boolean z) {
        int iRgb = f846a;
        TextView textViewM989x0 = m989x0(activity, str, 14.0f, z ? -1 : iRgb, false);
        textViewM989x0.setGravity(17);
        textViewM989x0.setSingleLine(true);
        textViewM989x0.setEllipsize(TextUtils.TruncateAt.END);
        int iRgb2 = z ? iRgb : Color.rgb(246, 250, 255);
        if (!z) {
            iRgb = Color.rgb(196, 216, 247);
        }
        int iM982u = m982u(activity, 10.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iRgb2);
        gradientDrawable.setCornerRadius(iM982u);
        gradientDrawable.setStroke(m982u(activity, 1.0f), iRgb);
        textViewM989x0.setBackground(gradientDrawable);
        return textViewM989x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static void m977r0(Activity activity, String str, String str2, String str3) {
        try {
            Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
            dialog.requestWindowFeature(1);
            dialog.setContentView(m921G0(activity, m962k(activity, dialog, str, str2, str3)));
            dialog.setOnShowListener(new DialogInterfaceOnShowListenerC0261i6(dialog, 0));
            dialog.show();
            m954g(dialog);
            HookEntry.log("group avatar title menu show");
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("group avatar menu failed reason=member title "), ": ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static GradientDrawable m978s(Activity activity) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(f849d);
        gradientDrawable.setCornerRadius(m982u(activity, 16.0f));
        gradientDrawable.setStroke(m982u(activity, 1.0f), f850e);
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static void m979s0(Context context, Activity activity, View view, String str, String str2, String str3) {
        try {
            Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
            dialog.requestWindowFeature(1);
            dialog.setContentView(m921G0(activity, m964l(context, activity, dialog, view, str, str2, str3)));
            dialog.setOnShowListener(new DialogInterfaceOnShowListenerC0261i6(dialog, 2));
            dialog.show();
            m954g(dialog);
            HookEntry.log("group avatar mute custom menu show");
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("group avatar menu failed reason=mute duration "), ": ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static View m980t(Activity activity) {
        View view = new View(activity);
        view.setBackgroundColor(f851f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.leftMargin = m982u(activity, 14.0f);
        layoutParams.rightMargin = m982u(activity, 14.0f);
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049 A[RETURN] */
    /* JADX INFO: renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m981t0(byte[] bArr, int[] iArr, int i) {
        if (bArr != null && iArr.length != 0) {
            if (i == 0) {
                if (m957h0(bArr, iArr, -1L) >= 0) {
                    return true;
                }
            } else if (i == 1) {
                int i2 = iArr[0] + 8;
                iArr[0] = i2;
                if (i2 <= bArr.length) {
                }
            } else if (i == 2) {
                long jM957h0 = m957h0(bArr, iArr, -1L);
                if (jM957h0 >= 0) {
                    int length = bArr.length;
                    int i3 = iArr[0];
                    if (jM957h0 <= length - i3) {
                        iArr[0] = i3 + ((int) jM957h0);
                        return true;
                    }
                }
            } else if (i == 5) {
                int i4 = iArr[0] + 4;
                iArr[0] = i4;
                if (i4 <= bArr.length) {
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static int m982u(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static boolean m983u0(Activity activity, ClassLoader classLoader, Object obj, String str, String str2, String str3, byte[] bArr) {
        Method method;
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("mqq.app.NewIntent", classLoader);
            Class<?> clsFindClass2 = XposedHelpers.findClass("com.tencent.biz.ProtoServlet", classLoader);
            Class<?> clsFindClass3 = XposedHelpers.findClass("mqq.observer.BusinessObserver", classLoader);
            Constructor<?> constructor = clsFindClass.getConstructor(Context.class, Class.class);
            constructor.setAccessible(true);
            Context applicationContext = activity.getApplicationContext();
            if (applicationContext == null) {
                HookEntry.log("group action failed type=设置头衔 reason=ProtoServlet context null");
                return false;
            }
            Object objNewInstance = constructor.newInstance(applicationContext, clsFindClass2);
            Method method2 = clsFindClass.getMethod("putExtra", String.class, String.class);
            Method method3 = clsFindClass.getMethod("putExtra", String.class, byte[].class);
            method2.invoke(objNewInstance, "cmd", "OidbSvc.0x8fc_2");
            method3.invoke(objNewInstance, "data", bArr);
            clsFindClass.getMethod("setObserver", clsFindClass3).invoke(objNewInstance, Proxy.newProxyInstance(clsFindClass3.getClassLoader(), new Class[]{clsFindClass3}, new C0328m6(str, str2)));
            ArrayList arrayListM950e = m950e(obj.getClass());
            int i = 0;
            while (true) {
                if (i >= arrayListM950e.size()) {
                    method = null;
                    break;
                }
                method = (Method) arrayListM950e.get(i);
                if ("startServlet".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(clsFindClass)) {
                        break;
                    }
                }
                i++;
            }
            if (method == null) {
                HookEntry.log("group action failed type=设置头衔 reason=startServlet method null runtime=" + obj.getClass().getName());
                return false;
            }
            method.setAccessible(true);
            method.invoke(obj, objNewInstance);
            StringBuilder sb = new StringBuilder();
            sb.append("group action invoked class=");
            sb.append(obj.getClass().getName());
            sb.append(" method=");
            sb.append(m933R(method));
            sb.append(" cmd=OidbSvc.0x8fc_2 targetUin=");
            sb.append(str2);
            sb.append(" titleLen=");
            sb.append(str3 == null ? 0 : str3.length());
            sb.append(" payload=minimal-oidb channel=ProtoServlet");
            HookEntry.log(sb.toString());
            return true;
        } catch (Throwable th) {
            AbstractC0000a.m3d(m913C0(th), new StringBuilder("group action proto servlet unavailable type=设置头衔 reason="), ": ");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static EditText m984v(Activity activity) {
        try {
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                return (EditText) currentFocus;
            }
        } catch (Throwable unused) {
        }
        try {
            Window window = activity.getWindow();
            return m992z(window == null ? null : window.getDecorView(), 0);
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static String m985v0(Activity activity, String str, String str2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String strM975q0;
        StringBuilder sb = new StringBuilder();
        String strM972p = m972p(str);
        String strM972p2 = m972p(str2);
        String strM972p3 = m972p(strM972p);
        String strM972p4 = m972p(strM972p2);
        if (m927L(strM972p3, strM972p4)) {
            strM975q0 = m975q0(strM972p3);
        } else {
            String strM959i0 = m959i0(activity, strM972p4);
            strM975q0 = strM959i0.length() > 0 ? m975q0(strM959i0) : "";
        }
        if (strM975q0.length() > 0) {
            if (sb.length() > 0) {
                sb.append("  ");
            }
            sb.append("成员 ");
            sb.append(strM975q0);
        } else if (strM972p2.length() > 0) {
            sb.append("成员");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static Field m986w(Class cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x0177 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:0x0173 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:96:0x00f1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX INFO: renamed from: w0 */
    public static String m987w0(Object obj, int i, Set set) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ?? declaredFields;
        ?? Trim = obj;
        if (Trim != 0 && i <= 3 && set != null && set.add(Trim)) {
            if (Trim instanceof CharSequence) {
                String strM917E0 = m917E0(String.valueOf((Object) Trim), "senderUin", "senderUid", "fromUin", "fromUid", "sendUin", "sendUid", "memberUin", "memberUid", "targetUin", "targetUid");
                return m941Z(strM917E0) ? strM917E0.trim() : "";
            }
            if (!(Trim instanceof Number) && !(Trim instanceof Boolean)) {
                String strM912C = m912C(Trim, "senderuin", "senderUid", "senderUin", "fromUin", "fromUid", "sendUin", "sendUid", "memberUin", "memberUid", "targetUin", "targetUid");
                if (m941Z(strM912C)) {
                    return strM912C.trim();
                }
                Object objM966m = m966m(Trim, "getSenderUin", "getSenderUid", "getFromUin", "getFromUid", "getSendUin", "getSendUid", "getMemberUin", "getMemberUid", "getTargetUin", "getTargetUid");
                if (m941Z(objM966m == null ? "" : String.valueOf(objM966m))) {
                    return String.valueOf(objM966m).trim();
                }
                Class<?> superclass = Trim.getClass();
                String name = superclass.getName();
                if (i > 0 && !name.startsWith("com.tencent.") && !(Trim instanceof View)) {
                    return "";
                }
                while (superclass != null && superclass != Object.class) {
                    try {
                        declaredFields = superclass.getDeclaredFields();
                    } catch (Throwable unused) {
                        declaredFields = 0;
                    }
                    if (declaredFields != 0) {
                        int length = declaredFields.length;
                        int i2 = 0;
                        Trim = Trim;
                        while (i2 < length) {
                            ?? r9 = declaredFields[i2];
                            if (!Modifier.isStatic(r9.getModifiers())) {
                                String lowerCase = r9.getName().toLowerCase(Locale.US);
                                try {
                                    r9.setAccessible(true);
                                    Object obj2 = r9.get(Trim);
                                    if (lowerCase.contains("sender") || lowerCase.contains("member") || lowerCase.contains("from") || lowerCase.contains("target") || "uin".equals(lowerCase) || "uid".equals(lowerCase)) {
                                        String strValueOf = obj2 == null ? "" : String.valueOf(obj2);
                                        if (m941Z(strValueOf)) {
                                            Trim = strValueOf.trim();
                                            return Trim;
                                        }
                                    }
                                    if (lowerCase.contains("msg") || lowerCase.contains("item") || lowerCase.contains("record") || lowerCase.contains("sender") || lowerCase.contains("member") || lowerCase.contains("user")) {
                                        String strM987w0 = m987w0(obj2, i + 1, set);
                                        if (strM987w0.length() >= 5) {
                                            return strM987w0;
                                        }
                                    }
                                } catch (Throwable unused2) {
                                    continue;
                                }
                            }
                            i2++;
                            Trim = Trim;
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m988x(View view, int i, HashSet hashSet) {
        Object tag;
        if (view == null || i > 7 || !hashSet.add(view)) {
            return "";
        }
        try {
            tag = view.getTag();
        } catch (Throwable unused) {
            tag = null;
        }
        String strM918F = m918F(tag);
        if (strM918F.length() >= 5) {
            return strM918F;
        }
        String strM918F2 = m918F(view);
        if (strM918F2.length() >= 5) {
            return strM918F2;
        }
        if (!(view instanceof ViewGroup)) {
            return "";
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int iMin = Math.min(viewGroup.getChildCount(), 80);
        for (int i2 = 0; i2 < iMin; i2++) {
            String strM988x = m988x(viewGroup.getChildAt(i2), i + 1, hashSet);
            if (strM988x.length() >= 5) {
                return strM988x;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static TextView m989x0(Activity activity, String str, float f, int i, boolean z) {
        TextView textView = new TextView(activity);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        textView.setTextSize(2, f);
        textView.setTextColor(i);
        textView.setIncludeFontPadding(true);
        if (z) {
            textView.setTypeface(Typeface.DEFAULT, 1);
        }
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static Class m990y(ClassLoader classLoader, String... strArr) {
        for (String str : strArr) {
            try {
                return XposedHelpers.findClass(str, classLoader);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static void m991y0(String str) {
        try {
            HookEntry.log("group action toast suppressed text=".concat(m967m0(str)));
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static EditText m992z(View view, int i) {
        EditText editText = null;
        if (view != null && i <= 8) {
            if (view instanceof EditText) {
                EditText editText2 = (EditText) view;
                try {
                    if (editText2.isShown()) {
                        if (editText2.isEnabled()) {
                            return editText2;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int iMin = Math.min(viewGroup.getChildCount(), 80) - 1; iMin >= 0; iMin--) {
                    EditText editTextM992z = m992z(viewGroup.getChildAt(iMin), i + 1);
                    if (editTextM992z != null) {
                        if (editTextM992z.hasFocus()) {
                            return editTextM992z;
                        }
                        if (editText == null) {
                            editText = editTextM992z;
                        }
                    }
                }
            }
        }
        return editText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static ArrayList m993z0(ClassLoader classLoader, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        String strM972p = m972p(str);
        if (strM972p.startsWith("u_")) {
            arrayList.add(strM972p);
            return arrayList;
        }
        String strM909A0 = m909A0(classLoader, strM972p);
        if (strM909A0.length() > 0) {
            arrayList.add(strM909A0);
        }
        if (strM972p.length() > 0 && !arrayList.contains(strM972p)) {
            arrayList.add(strM972p);
        }
        return arrayList;
    }
}
