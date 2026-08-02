package p000;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wg3 {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f12507a;

    /* JADX INFO: renamed from: b */
    public static final String f12508b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f12507a = timeZone;
        f12508b = pv2.m4013z0(pv2.m4012y0(et1.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5888a(yw0 yw0Var, yw0 yw0Var2) {
        yw0Var.getClass();
        yw0Var2.getClass();
        return t11.m5086l(yw0Var.f13644d, yw0Var2.f13644d) && yw0Var.f13645e == yw0Var2.f13645e && t11.m5086l(yw0Var.f13641a, yw0Var2.f13641a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m5889b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            c80.m665h("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            C0676s.m4645c("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        C0676s.m4645c("timeout".concat(" too small"));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static final void m5890c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!t11.m5086l(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m5891d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: e */
    public static final long m5892e(r92 r92Var) {
        String strM2557a = r92Var.f9461m.m2557a("Content-Length");
        if (strM2557a == null) {
            return -1L;
        }
        byte[] bArr = ug3.f11300a;
        try {
            return Long.parseLong(strM2557a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m5893f(ht2 ht2Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jMo3475c = ht2Var.mo889a().mo3476e() ? ht2Var.mo889a().mo3475c() - jNanoTime : Long.MAX_VALUE;
        ht2Var.mo889a().mo3226d(Math.min(jMo3475c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C0209fn c0209fn = new C0209fn();
            while (ht2Var.mo891n(c0209fn, 8192L) != -1) {
                c0209fn.m1679g();
            }
            if (jMo3475c == Long.MAX_VALUE) {
                ht2Var.mo889a().mo3473a();
                return true;
            }
            ht2Var.mo889a().mo3226d(jNanoTime + jMo3475c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo3475c == Long.MAX_VALUE) {
                ht2Var.mo889a().mo3473a();
                return false;
            }
            ht2Var.mo889a().mo3226d(jNanoTime + jMo3475c);
            return false;
        } catch (Throwable th) {
            if (jMo3475c == Long.MAX_VALUE) {
                ht2Var.mo889a().mo3473a();
            } else {
                ht2Var.mo889a().mo3226d(jNanoTime + jMo3475c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final js0 m5894g(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gs0 gs0Var = (gs0) it.next();
            C0505no c0505no = gs0Var.f3692a;
            C0505no c0505no2 = gs0Var.f3693b;
            String strM3331j = c0505no.m3331j();
            String strM3331j2 = c0505no2.m3331j();
            arrayList.add(strM3331j);
            arrayList.add(pv2.m3993I0(strM3331j2).toString());
        }
        return new js0((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: h */
    public static final String m5895h(yw0 yw0Var, boolean z) {
        yw0Var.getClass();
        int i = yw0Var.f13645e;
        String str = yw0Var.f13644d;
        if (pv2.m3995h0(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = yw0Var.f13641a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    /* JADX INFO: renamed from: i */
    public static final List m5896i(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return be0.f819h;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: j */
    public static final List m5897j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return be0.f819h;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List listAsList = Arrays.asList(objArr2);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
