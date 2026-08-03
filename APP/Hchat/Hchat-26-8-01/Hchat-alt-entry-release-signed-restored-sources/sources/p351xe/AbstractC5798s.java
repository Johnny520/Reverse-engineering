package p351xe;

import be.AbstractC0283h;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p025bc.C0261k;

/* JADX INFO: renamed from: xe.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5798s {

    /* JADX INFO: renamed from: a */
    public static final String f23545a = C0261k.class.getPackage().getName();

    /* JADX INFO: renamed from: b */
    public static final String f23546b = AbstractC0283h.class.getName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m10507a() {
        if (Thread.currentThread().isInterrupted()) {
            C0086a.m452k("Thread interrupted");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m10508b(String str) {
        if (str.charAt(0) != 'L') {
            return str;
        }
        int length = str.length() - 1;
        return str.charAt(length) == ';' ? str.substring(1, length).replace('/', '.') : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static List m10509c(Collection collection, Function function) {
        if (collection == null || collection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m10510d(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        StackTraceElement stackTraceElement = null;
        int i9 = 0;
        while (i9 < length) {
            StackTraceElement stackTraceElement2 = stackTrace[i9];
            String className = stackTraceElement2.getClassName();
            if (className.equals(f23546b) || className.startsWith(f23545a) || Objects.equals(stackTraceElement, stackTraceElement2)) {
                th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, 0, i9));
                return;
            } else {
                i9++;
                stackTraceElement = stackTraceElement2;
            }
        }
        for (int i10 = length - 1; i10 >= 0; i10--) {
            String className2 = stackTrace[i10].getClassName();
            if (className2.startsWith("jadx.") && !className2.startsWith("jadx.tests.")) {
                th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, 0, i10));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m10511e(Throwable th2) {
        try {
            m10510d(th2);
        } catch (Exception unused) {
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            m10511e(cause);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m10512f(List list) {
        if (list == null || list.size() != 1) {
            return null;
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m10513g(Throwable th2) {
        if (th2 == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
        m10511e(th2);
        th2.printStackTrace(printWriter);
        return stringWriter.getBuffer().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m10514h(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Object m10515i(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m10516j(Iterable iterable, String str) {
        return iterable == null ? HttpUrl.FRAGMENT_ENCODE_SET : m10517k(iterable, str, new C5793n(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m10517k(Iterable iterable, String str, Function function) {
        StringBuilder sb2 = new StringBuilder();
        m10518l(sb2, iterable, str, function);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m10518l(StringBuilder sb2, Iterable iterable, String str, Function function) {
        if (iterable == null) {
            return;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append((String) function.apply(it.next()));
        }
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append((String) function.apply(it.next()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static List m10519m(List list) {
        return list.isEmpty() ? Collections.EMPTY_LIST : list.size() == 1 ? Collections.singletonList(list.get(0)) : new C5789j(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m10520n(Collection collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }
}
