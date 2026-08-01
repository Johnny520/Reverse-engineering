package p022L;

import android.content.SharedPreferences;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: L.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0174d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m345a(int i2, int i3, int i4) {
        return (Integer.hashCode(i2) + i3) * i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m346b(Object obj, int i2, int i3) {
        return (obj.hashCode() + i2) * i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m347c(String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m348d(ByteBuffer byteBuffer, ByteOrder byteOrder) {
        byteBuffer.order(byteOrder);
        return byteBuffer.getInt(byteBuffer.position());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m349e(List list, int i2, int i3) {
        return (list.hashCode() + i2) * i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static SharedPreferences m350f(String str, int i2, String str2) {
        SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences(str, i2);
        AbstractC0223g.m417d(sharedPreferences, str2);
        return sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m351g(int i2, String str) {
        return str + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m352h(String str, String str2) {
        return str + str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m353i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m354j(String str, Method method) {
        return str + method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m355k(String str, boolean z2) {
        return str + z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m356l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static StringBuilder m357m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m358n(int i2, int i3, TextView textView, String str) {
        textView.setLayoutParams(new LinearLayout.LayoutParams(i2, i3));
        textView.setText(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m359o(int i2, String str) {
        if (i2 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0223g.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            AbstractC0223g.m419f(nullPointerException, AbstractC0223g.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m360p(Object obj, String str, boolean z2) {
        return AbstractC0307q.m538h0(obj.getClass().getName(), z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m361q(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
