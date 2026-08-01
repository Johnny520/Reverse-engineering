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
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7016 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17360 = AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵"));

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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC9234.m14531(836));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(AbstractC9234.m14532("喵喵呜呜喵呜呜喵"), Locale.CHINA);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(AbstractC9234.m14531(837));
        Calendar calendar = Calendar.getInstance();
        String strReplace = simpleDateFormat.format(calendar.getTime());
        String strReplace2 = simpleDateFormat2.format(calendar.getTime());
        String str = simpleDateFormat3.format(calendar.getTime());
        if (strReplace.contains(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵"))) {
            strReplace = strReplace.replace(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵"), AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵"));
        }
        if (strReplace.contains(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵~喵呜喵呜呜喵喵喵"))) {
            strReplace = strReplace.replace(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵~喵呜喵呜呜喵喵喵"), AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵"));
        }
        if (strReplace2.contains(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜喵喵呜喵喵~呜呜喵呜喵喵呜喵"))) {
            strReplace2 = strReplace2.replace(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜喵喵呜喵喵~呜呜喵呜喵喵呜喵"), AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜呜喵喵呜喵呜~呜喵喵喵呜呜呜喵~呜呜呜呜呜喵喵呜~呜呜呜呜喵喵呜呜"));
        }
        return strReplace + strReplace2 + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m12156(XC_MethodHook.MethodHookParam methodHookParam, StringBuilder sb) {
        sb.append(AbstractC9234.m14531(854));
        sb.append(methodHookParam.getResult());
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        Member member = methodHookParam.method;
        if (member instanceof Constructor) {
            Class<?>[] parameterTypes = ((Constructor) member).getParameterTypes();
            if (parameterTypes.length != 0) {
                sb.append(AbstractC9234.m14531(855));
            }
            for (int i = 0; i < parameterTypes.length; i++) {
                sb.append(parameterTypes[i].getName());
                sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜~喵呜喵喵呜喵喵喵~喵呜喵呜呜喵呜喵"));
                sb.append(methodHookParam.args[i]);
                sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
            }
            sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        }
        if (member instanceof Method) {
            Class<?>[] parameterTypes2 = ((Method) member).getParameterTypes();
            if (parameterTypes2.length != 0) {
                sb.append(AbstractC9234.m14531(855));
            }
            for (int i2 = 0; i2 < parameterTypes2.length; i2++) {
                sb.append(parameterTypes2[i2].getName());
                sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜~喵呜喵喵呜喵喵喵~喵呜喵呜呜喵呜喵"));
                sb.append(methodHookParam.args[i2]);
                sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
            }
            sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12157(StringBuilder sb, Field field) {
        field.setAccessible(true);
        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜~喵呜喵呜喵呜喵呜~喵呜喵呜呜喵呜喵"));
        sb.append(Modifier.toString(field.getModifiers()));
        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜"));
        sb.append(field.getType().getName().startsWith(AbstractC9234.m14531(852)) ? field.getType().getSimpleName() : field.getType().getName());
        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜"));
        sb.append(field.getName());
        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜~喵呜喵喵呜喵喵喵~喵呜喵呜呜喵呜喵"));
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
                    sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
                    sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜~喵呜喵呜喵呜喵呜~喵呜喵呜呜喵呜喵"));
                    if (stackTraceElement.getMethodName().equals(methodHookParam.method.getName())) {
                        sb.append(cls.getName());
                        sb.append(AbstractC9234.m14532("喵呜喵呜呜呜喵呜"));
                        sb.append(methodHookParam.method.getName());
                        sb.append(AbstractC9234.m14532("喵呜喵呜呜喵呜呜"));
                        sb.append(stackTraceElement.getLineNumber());
                        sb.append(AbstractC9234.m14532("喵呜喵呜呜喵呜喵"));
                        sb.append(AbstractC9234.m14531(856));
                    } else if (stackTraceElement.getClassName().equals(cls.getName())) {
                        sb.append(stackTraceElement);
                        sb.append(AbstractC9234.m14531(857));
                    } else {
                        sb.append(stackTraceElement);
                    }
                }
            }
        } else {
            sb.append(AbstractC9234.m14531(849));
        }
        sb.append(AbstractC9234.m14531(850));
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜~喵呜呜呜呜呜呜呜~喵呜呜呜喵喵喵喵"));
        m12154(f17360 + AbstractC9234.m14531(851) + cls.getName() + AbstractC9234.m14532("喵呜喵呜呜呜喵呜") + methodHookParam.method.getName() + AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵喵"), sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12159(Object obj) {
        if (obj == null) {
            C3466.m5899(AbstractC9234.m14531(838));
            return;
        }
        StringBuilder sb = new StringBuilder(m12155());
        sb.append(AbstractC9234.m14531(839));
        sb.append(AbstractC9234.m14531(840));
        Class<?> cls = obj.getClass();
        for (Field field : cls.getDeclaredFields()) {
            m12157(sb, field);
            try {
                if (Modifier.toString(field.getModifiers()).contains(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜"))) {
                    Object obj2 = field.get(null);
                    if (obj2 == null || !obj2.getClass().getSimpleName().matches(AbstractC9234.m14531(841))) {
                        sb.append(obj2);
                    } else {
                        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵喵呜"));
                        sb.append(obj2);
                        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵喵呜"));
                    }
                } else {
                    Object obj3 = field.get(obj);
                    if (obj3 == null || !obj3.getClass().getSimpleName().matches(AbstractC9234.m14531(841))) {
                        if (field.getType().isArray()) {
                            sb.append(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵喵~喵呜喵呜呜喵呜呜"));
                            sb.append(Array.getLength(obj3));
                        }
                        sb.append(obj3);
                    } else {
                        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵喵呜"));
                        sb.append(obj3);
                        sb.append(AbstractC9234.m14532("喵呜喵呜喵喵喵呜"));
                    }
                }
            } catch (Exception e) {
                sb.append(AbstractC9234.m14531(842));
                sb.append(e);
            }
            sb.append(AbstractC9234.m14532("喵呜喵喵呜喵喵喵"));
            sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        }
        sb.append(AbstractC9234.m14531(843));
        m12154(f17360 + AbstractC9234.m14531(844) + cls.getName() + AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵喵"), sb.toString());
    }
}
