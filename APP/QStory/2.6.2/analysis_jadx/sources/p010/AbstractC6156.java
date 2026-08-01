package p010;

import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.client.plugins.AbstractC3932;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f16778 = AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937561854541563303L));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m11564(String str, String str2) throws Throwable {
        File file = new File(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str, true), StandardCharsets.UTF_8));
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.close();
                } catch (IOException unused) {
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m11565() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC3056.m6668(-3937633082279200167L));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(AbstractC3056.m6668(-3937632962020115879L), Locale.CHINA);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(AbstractC3056.m6668(-3937632970610050471L));
        Calendar calendar = Calendar.getInstance();
        String strReplace = simpleDateFormat.format(calendar.getTime());
        String strReplace2 = simpleDateFormat2.format(calendar.getTime());
        String str = simpleDateFormat3.format(calendar.getTime());
        if (strReplace.contains(AbstractC3056.m6668(-3937632906185541031L))) {
            strReplace = strReplace.replace(AbstractC3056.m6668(-3937632906185541031L), AbstractC3056.m6668(-3937632919070442919L));
        }
        if (strReplace.contains(AbstractC3056.m6668(-3937632893300639143L))) {
            strReplace = strReplace.replace(AbstractC3056.m6668(-3937632893300639143L), AbstractC3056.m6668(-3937632940545279399L));
        }
        if (strReplace2.contains(AbstractC3056.m6668(-3937632949135213991L))) {
            strReplace2 = strReplace2.replace(AbstractC3056.m6668(-3937632949135213991L), AbstractC3056.m6668(-3937632923365410215L));
        }
        return strReplace + strReplace2 + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11566(XC_MethodHook.MethodHookParam methodHookParam, StringBuilder sb) {
        sb.append(AbstractC3056.m6668(-3937648754614863271L));
        sb.append(methodHookParam.getResult());
        sb.append(AbstractC3056.m6668(-3937560690605426087L));
        Member member = methodHookParam.method;
        if (member instanceof Constructor) {
            Class<?>[] parameterTypes = ((Constructor) member).getParameterTypes();
            if (parameterTypes.length != 0) {
                sb.append(AbstractC3056.m6668(-3937648647240680871L));
            }
            for (int i = 0; i < parameterTypes.length; i++) {
                sb.append(parameterTypes[i].getName());
                sb.append(AbstractC3056.m6668(-3937648806154470823L));
                sb.append(methodHookParam.args[i]);
                sb.append(AbstractC3056.m6668(-3937560690605426087L));
            }
            sb.append(AbstractC3056.m6668(-3937560690605426087L));
        }
        if (member instanceof Method) {
            Class<?>[] parameterTypes2 = ((Method) member).getParameterTypes();
            if (parameterTypes2.length != 0) {
                sb.append(AbstractC3056.m6668(-3937648647240680871L));
            }
            for (int i2 = 0; i2 < parameterTypes2.length; i2++) {
                sb.append(parameterTypes2[i2].getName());
                sb.append(AbstractC3056.m6668(-3937648806154470823L));
                sb.append(methodHookParam.args[i2]);
                sb.append(AbstractC3056.m6668(-3937560690605426087L));
            }
            sb.append(AbstractC3056.m6668(-3937560690605426087L));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11567(StringBuilder sb, Field field) {
        field.setAccessible(true);
        sb.append(AbstractC3056.m6668(-3937648870578980263L));
        sb.append(Modifier.toString(field.getModifiers()));
        sb.append(AbstractC3056.m6668(-3937648784679634343L));
        sb.append(field.getType().getName().startsWith(AbstractC3056.m6668(-3937648793269568935L)) ? field.getType().getSimpleName() : field.getType().getName());
        sb.append(AbstractC3056.m6668(-3937648784679634343L));
        sb.append(field.getName());
        sb.append(AbstractC3056.m6668(-3937648806154470823L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11568(XC_MethodHook.MethodHookParam methodHookParam, StackTraceElement[] stackTraceElementArr, StringBuilder sb, Class cls) {
        if (stackTraceElementArr.length != 0) {
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement.getMethodName().equals(methodHookParam.method.getName())) {
                    z = true;
                }
                if (z) {
                    AbstractC6136.m11547(-3937560690605426087L, sb, -3937648870578980263L);
                    if (stackTraceElement.getMethodName().equals(methodHookParam.method.getName())) {
                        sb.append(cls.getName());
                        sb.append(AbstractC3056.m6668(-3937562159484241319L));
                        sb.append(methodHookParam.method.getName());
                        sb.append(AbstractC3056.m6668(-3937587577100699047L));
                        sb.append(stackTraceElement.getLineNumber());
                        AbstractC6136.m11547(-3937587482611418535L, sb, -3937648664420550055L);
                    } else if (stackTraceElement.getClassName().equals(cls.getName())) {
                        sb.append(stackTraceElement);
                        sb.append(AbstractC3056.m6668(-3937648569931269543L));
                    } else {
                        sb.append(stackTraceElement);
                    }
                }
            }
        } else {
            sb.append(AbstractC3056.m6668(-3937649248536102311L));
        }
        sb.append(AbstractC3056.m6668(-3937649239946167719L));
        sb.append(AbstractC3056.m6668(-3937648853399111079L));
        m11564(f16778 + AbstractC3056.m6668(-3937648836219241895L) + cls.getName() + AbstractC3056.m6668(-3937562159484241319L) + methodHookParam.method.getName() + AbstractC3056.m6668(-3937649557773747623L), sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11569(Object obj) {
        if (obj == null) {
            C2632.m5294(AbstractC3056.m6668(-3937632824581162407L));
            return;
        }
        StringBuilder sb = new StringBuilder(m11565());
        AbstractC6136.m11547(-3937632773041554855L, sb, -3937650077464790439L);
        Class<?> cls = obj.getClass();
        for (Field field : cls.getDeclaredFields()) {
            m11567(sb, field);
            try {
                if (Modifier.toString(field.getModifiers()).contains(AbstractC3056.m6668(-3937650116119496103L))) {
                    Object obj2 = field.get(null);
                    if (obj2 == null || !obj2.getClass().getSimpleName().matches(AbstractC3056.m6668(-3937650008745313703L))) {
                        sb.append(obj2);
                    } else {
                        sb.append(AbstractC3056.m6668(-3937557258926556583L));
                        sb.append(obj2);
                        sb.append(AbstractC3056.m6668(-3937557258926556583L));
                    }
                } else {
                    Object obj3 = field.get(obj);
                    if (obj3 == null || !obj3.getClass().getSimpleName().matches(AbstractC3056.m6668(-3937650008745313703L))) {
                        if (field.getType().isArray()) {
                            sb.append(AbstractC3056.m6668(-3937649991565444519L));
                            sb.append(Array.getLength(obj3));
                        }
                        sb.append(obj3);
                    } else {
                        sb.append(AbstractC3056.m6668(-3937557258926556583L));
                        sb.append(obj3);
                        sb.append(AbstractC3056.m6668(-3937557258926556583L));
                    }
                }
            } catch (Exception e) {
                sb.append(AbstractC3056.m6668(-3937649888486229415L));
                sb.append(e);
            }
            sb.append(AbstractC3056.m6668(-3937603678933091751L));
            sb.append(AbstractC3056.m6668(-3937560690605426087L));
        }
        sb.append(AbstractC3056.m6668(-3937649905666098599L));
        m11564(f16778 + AbstractC3056.m6668(-3937649523414009255L) + cls.getName() + AbstractC3056.m6668(-3937649557773747623L), sb.toString());
    }
}
