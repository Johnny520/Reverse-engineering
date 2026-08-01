package p026;

import bsh.C3466;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.client.plugins.AbstractC4765;
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

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7016 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17360 = AbstractC4765.m8874().concat("/");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m12154(String str, String str2) throws Throwable {
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
    public static String m12155() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("E", Locale.CHINA);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String strReplace = simpleDateFormat.format(calendar.getTime());
        String strReplace2 = simpleDateFormat2.format(calendar.getTime());
        String str = simpleDateFormat3.format(calendar.getTime());
        if (strReplace.contains("年0")) {
            strReplace = strReplace.replace("年0", "年");
        }
        if (strReplace.contains("月0")) {
            strReplace = strReplace.replace("月0", "月");
        }
        if (strReplace2.contains("周")) {
            strReplace2 = strReplace2.replace("周", "星期");
        }
        return strReplace + strReplace2 + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m12156(XC_MethodHook.MethodHookParam methodHookParam, StringBuilder sb) {
        sb.append("\n方法返回:");
        sb.append(methodHookParam.getResult());
        sb.append("\n");
        Member member = methodHookParam.method;
        if (member instanceof Constructor) {
            Class<?>[] parameterTypes = ((Constructor) member).getParameterTypes();
            if (parameterTypes.length != 0) {
                sb.append("方法运行时参数 : \n");
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
                sb.append("方法运行时参数 : \n");
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
    public static void m12157(StringBuilder sb, Field field) {
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
    public static void m12158(XC_MethodHook.MethodHookParam methodHookParam, StackTraceElement[] stackTraceElementArr, StringBuilder sb, Class cls) {
        if (stackTraceElementArr.length != 0) {
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement.getMethodName().equals(methodHookParam.method.getName())) {
                    z = true;
                }
                if (z) {
                    sb.append("\n");
                    sb.append("   ");
                    if (stackTraceElement.getMethodName().equals(methodHookParam.method.getName())) {
                        sb.append(cls.getName());
                        sb.append(".");
                        sb.append(methodHookParam.method.getName());
                        sb.append("(");
                        sb.append(stackTraceElement.getLineNumber());
                        sb.append(")");
                        sb.append(" <---当前方法");
                    } else if (stackTraceElement.getClassName().equals(cls.getName())) {
                        sb.append(stackTraceElement);
                        sb.append(" <---同一类下");
                    } else {
                        sb.append(stackTraceElement);
                    }
                }
            }
        } else {
            sb.append("StackTraceElement[]为空");
        }
        sb.append("\n\n-------------------------------------------------------------------");
        sb.append("\n\n\n");
        m12154(f17360 + "动态反射记录/" + cls.getName() + "." + methodHookParam.method.getName() + ".java", sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12159(Object obj) {
        if (obj == null) {
            C3466.m5899("对象为空 无法输出字段");
            return;
        }
        StringBuilder sb = new StringBuilder(m12155());
        sb.append("\n-------------------------------------------------------------------");
        sb.append("\n属性 : \n\n");
        Class<?> cls = obj.getClass();
        for (Field field : cls.getDeclaredFields()) {
            m12157(sb, field);
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
                sb.append("动态反射属性异常 : ");
                sb.append(e);
            }
            sb.append(";");
            sb.append("\n");
        }
        sb.append("\n-------------------------------------------------------------------\n\n");
        m12154(f17360 + "对象反射记录/" + cls.getName() + ".java", sb.toString());
    }
}
