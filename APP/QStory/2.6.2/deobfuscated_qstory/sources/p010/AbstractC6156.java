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
    public static final String f16778 = AbstractC3932.m8313().concat("/");

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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy\u5e74MM\u6708dd\u65e5");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("E", Locale.CHINA);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String strReplace = simpleDateFormat.format(calendar.getTime());
        String strReplace2 = simpleDateFormat2.format(calendar.getTime());
        String str = simpleDateFormat3.format(calendar.getTime());
        if (strReplace.contains("\u5e740")) {
            strReplace = strReplace.replace("\u5e740", "\u5e74");
        }
        if (strReplace.contains("\u67080")) {
            strReplace = strReplace.replace("\u67080", "\u6708");
        }
        if (strReplace2.contains("\u5468")) {
            strReplace2 = strReplace2.replace("\u5468", "\u661f\u671f");
        }
        return strReplace + strReplace2 + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11566(XC_MethodHook.MethodHookParam methodHookParam, StringBuilder sb) {
        sb.append("\n\u65b9\u6cd5\u8fd4\u56de:");
        sb.append(methodHookParam.getResult());
        sb.append("\n");
        Member member = methodHookParam.method;
        if (member instanceof Constructor) {
            Class<?>[] parameterTypes = ((Constructor) member).getParameterTypes();
            if (parameterTypes.length != 0) {
                sb.append("\u65b9\u6cd5\u8fd0\u884c\u65f6\u53c2\u6570 : \n");
            }
            for (int i = 0; i < parameterTypes.length; i++) {
                sb.append(parameterTypes[i].getName());
                sb.append(" = ");
                sb.append(methodHookParam.args[i]);
                sb.append("\n");
            }
            sb.append("\n");
        }
        if (member instanceof Method) {
            Class<?>[] parameterTypes2 = ((Method) member).getParameterTypes();
            if (parameterTypes2.length != 0) {
                sb.append("\u65b9\u6cd5\u8fd0\u884c\u65f6\u53c2\u6570 : \n");
            }
            for (int i2 = 0; i2 < parameterTypes2.length; i2++) {
                sb.append(parameterTypes2[i2].getName());
                sb.append(" = ");
                sb.append(methodHookParam.args[i2]);
                sb.append("\n");
            }
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11567(StringBuilder sb, Field field) {
        field.setAccessible(true);
        sb.append("   ");
        sb.append(Modifier.toString(field.getModifiers()));
        sb.append(" ");
        sb.append(field.getType().getName().startsWith("java.lang.") ? field.getType().getSimpleName() : field.getType().getName());
        sb.append(" ");
        sb.append(field.getName());
        sb.append(" = ");
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
                        sb.append(".");
                        sb.append(methodHookParam.method.getName());
                        sb.append("(");
                        sb.append(stackTraceElement.getLineNumber());
                        AbstractC6136.m11547(-3937587482611418535L, sb, -3937648664420550055L);
                    } else if (stackTraceElement.getClassName().equals(cls.getName())) {
                        sb.append(stackTraceElement);
                        sb.append(" <---\u540c\u4e00\u7c7b\u4e0b");
                    } else {
                        sb.append(stackTraceElement);
                    }
                }
            }
        } else {
            sb.append("StackTraceElement[]\u4e3a\u7a7a");
        }
        sb.append("\n\n-------------------------------------------------------------------");
        sb.append("\n\n\n");
        m11564(f16778 + "\u52a8\u6001\u53cd\u5c04\u8bb0\u5f55/" + cls.getName() + "." + methodHookParam.method.getName() + ".java", sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11569(Object obj) {
        if (obj == null) {
            C2632.m5294("\u5bf9\u8c61\u4e3a\u7a7a \u65e0\u6cd5\u8f93\u51fa\u5b57\u6bb5");
            return;
        }
        StringBuilder sb = new StringBuilder(m11565());
        AbstractC6136.m11547(-3937632773041554855L, sb, -3937650077464790439L);
        Class<?> cls = obj.getClass();
        for (Field field : cls.getDeclaredFields()) {
            m11567(sb, field);
            try {
                if (Modifier.toString(field.getModifiers()).contains("static")) {
                    Object obj2 = field.get(null);
                    if (obj2 == null || !obj2.getClass().getSimpleName().matches("String|CharSequence")) {
                        sb.append(obj2);
                    } else {
                        sb.append("\"");
                        sb.append(obj2);
                        sb.append("\"");
                    }
                } else {
                    Object obj3 = field.get(obj);
                    if (obj3 == null || !obj3.getClass().getSimpleName().matches("String|CharSequence")) {
                        if (field.getType().isArray()) {
                            sb.append("length:");
                            sb.append(Array.getLength(obj3));
                        }
                        sb.append(obj3);
                    } else {
                        sb.append("\"");
                        sb.append(obj3);
                        sb.append("\"");
                    }
                }
            } catch (Exception e) {
                sb.append("\u52a8\u6001\u53cd\u5c04\u5c5e\u6027\u5f02\u5e38 : ");
                sb.append(e);
            }
            sb.append(";");
            sb.append("\n");
        }
        sb.append("\n-------------------------------------------------------------------\n\n");
        m11564(f16778 + "\u5bf9\u8c61\u53cd\u5c04\u8bb0\u5f55/" + cls.getName() + ".java", sb.toString());
    }
}
