package p102z0;

import android.app.Application;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicBoolean;
import p006D.AbstractC0079h;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0124l;
import p011F0.C0113a;
import p011F0.C0131s;
import p021K0.C0169h;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p041V.C0318k;
import p070i0.AbstractC0731a;
import p086r0.C0925n1;

/* JADX INFO: renamed from: z0.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1138u {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f3841a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f3842b = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m2505a(Throwable th) {
        Iterator it = new C0169h(new C0113a(1, th), new C0925n1(27)).iterator();
        while (it.hasNext()) {
            StackTraceElement[] stackTrace = ((Throwable) it.next()).getStackTrace();
            AbstractC0223g.m417d(stackTrace, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                AbstractC0223g.m417d(className, "getClassName(...)");
                if (AbstractC0307q.m538h0(className, false, "com.lu.wxmask")) {
                    return true;
                }
                String className2 = stackTraceElement.getClassName();
                AbstractC0223g.m417d(className2, "getClassName(...)");
                if (AbstractC0307q.m538h0(className2, false, "com.lu.lposed")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2506b(Context context, Thread thread, Throwable th) throws IOException {
        Iterable iterableM167E;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        File file = new File(externalFilesDir, "inkhide_crash");
        if (file.exists() || file.mkdirs()) {
            File file2 = new File(file, AbstractC0174d.m353i("inkhide-crash-", new SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.US).format(new Date()), ".log"));
            StringBuilder sb = new StringBuilder("module=3.0.2d(1027)\n");
            sb.append("wechat=" + AbstractC1135r.m2493o());
            sb.append('\n');
            sb.append("process=" + Application.getProcessName());
            sb.append('\n');
            sb.append("thread=" + thread.getName() + "(" + thread.getId() + ")");
            sb.append('\n');
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("time=");
            sb2.append(jCurrentTimeMillis);
            sb.append(sb2.toString());
            sb.append("\n\n");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            AbstractC0223g.m417d(string, "toString(...)");
            sb.append(string);
            String string2 = sb.toString();
            AbstractC0223g.m417d(string2, "toString(...)");
            AbstractC0079h.m179X(file2, string2);
            Object[] objArrListFiles = file.listFiles(new C1137t());
            if (objArrListFiles == null) {
                objArrListFiles = new File[0];
            }
            C0318k c0318k = new C0318k(4);
            if (objArrListFiles.length != 0) {
                objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
                AbstractC0223g.m417d(objArrListFiles, "copyOf(...)");
                if (objArrListFiles.length > 1) {
                    Arrays.sort(objArrListFiles, c0318k);
                }
            }
            List listM252Z = AbstractC0120h.m252Z(objArrListFiles);
            int size = listM252Z.size() - 12;
            if (size <= 0) {
                iterableM167E = C0131s.f426a;
            } else if (size != 1) {
                ArrayList arrayList = new ArrayList(size);
                if (listM252Z instanceof RandomAccess) {
                    int size2 = listM252Z.size();
                    for (int i2 = 12; i2 < size2; i2++) {
                        arrayList.add(listM252Z.get(i2));
                    }
                } else {
                    ListIterator listIterator = listM252Z.listIterator(12);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                iterableM167E = arrayList;
            } else {
                if (listM252Z.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                iterableM167E = AbstractC0079h.m167E(listM252Z.get(AbstractC0124l.m285Y(listM252Z)));
            }
            Iterator it = iterableM167E.iterator();
            while (it.hasNext()) {
                try {
                    ((File) it.next()).delete();
                } catch (Throwable unused) {
                }
            }
            AbstractC0731a.m1387d("runtime crash saved", file2.getAbsolutePath());
        }
    }
}
