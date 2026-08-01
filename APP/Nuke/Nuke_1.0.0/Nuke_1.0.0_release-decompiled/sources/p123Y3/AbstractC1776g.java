package p123Y3;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p061L2.AbstractC0972l;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p118X3.C1684F;
import p118X3.C1706p;
import p118X3.C1707q;
import p118X3.C1709s;
import p118X3.C1715y;
import p149d3.AbstractC1973a;
import p149d3.AbstractC1976d;
import p156e4.C2041d;
import p208n4.C2706e;
import p208n4.InterfaceC2708g;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: Y3.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1776g {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f6076a;

    /* JADX INFO: renamed from: b */
    public static final String f6077b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC1665j.m2982b(timeZone);
        f6076a = timeZone;
        String strM3642j0 = AbstractC1976d.m3642j0(C1715y.class.getName(), "okhttp3.");
        if (AbstractC1976d.m3631Y(strM3642j0, "Client")) {
            strM3642j0 = strM3642j0.substring(0, strM3642j0.length() - 6);
            AbstractC1665j.m2984d(strM3642j0, "substring(...)");
        }
        f6077b = strM3642j0;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m3174a(C1709s c1709s, C1709s c1709s2) {
        AbstractC1665j.m2985e(c1709s, "<this>");
        AbstractC1665j.m2985e(c1709s2, "other");
        return AbstractC1665j.m2981a(c1709s.f5871d, c1709s2.f5871d) && c1709s.f5872e == c1709s2.f5872e && AbstractC1665j.m2981a(c1709s.f5868a, c1709s2.f5868a);
    }

    /* JADX INFO: renamed from: b */
    public static final void m3175b(Socket socket) {
        AbstractC1665j.m2985e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e5) {
            throw e5;
        } catch (RuntimeException e6) {
            if (!AbstractC1665j.m2981a(e6.getMessage(), "bio == null")) {
                throw e6;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m3176c(String str, Object... objArr) {
        AbstractC1665j.m2985e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: d */
    public static final long m3177d(C1684F c1684f) {
        String strM3038a = c1684f.f5743i.m3038a("Content-Length");
        if (strM3038a == null) {
            return -1L;
        }
        byte[] bArr = AbstractC1774e.f6072a;
        try {
            return Long.parseLong(strM3038a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Charset m3178e(InterfaceC2708g interfaceC2708g, Charset charset) {
        AbstractC1665j.m2985e(interfaceC2708g, "<this>");
        AbstractC1665j.m2985e(charset, "default");
        int iMo4716i = interfaceC2708g.mo4716i(AbstractC1774e.f6073b);
        if (iMo4716i == -1) {
            return charset;
        }
        if (iMo4716i == 0) {
            return AbstractC1973a.f6662a;
        }
        if (iMo4716i == 1) {
            return AbstractC1973a.f6663b;
        }
        if (iMo4716i == 2) {
            Charset charset2 = AbstractC1973a.f6662a;
            Charset charset3 = AbstractC1973a.f6665d;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            AbstractC1665j.m2984d(charsetForName, "forName(...)");
            AbstractC1973a.f6665d = charsetForName;
            return charsetForName;
        }
        if (iMo4716i == 3) {
            return AbstractC1973a.f6664c;
        }
        if (iMo4716i != 4) {
            throw new AssertionError();
        }
        Charset charset4 = AbstractC1973a.f6662a;
        Charset charset5 = AbstractC1973a.f6666e;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        AbstractC1665j.m2984d(charsetForName2, "forName(...)");
        AbstractC1973a.f6666e = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3179f(InterfaceC2722u interfaceC2722u, int i5) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1665j.m2985e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo4745c = interfaceC2722u.mo3157a().mo4747e() ? interfaceC2722u.mo3157a().mo4745c() - jNanoTime : Long.MAX_VALUE;
        interfaceC2722u.mo3157a().mo4746d(Math.min(jMo4745c, timeUnit.toNanos(i5)) + jNanoTime);
        try {
            C2706e c2706e = new C2706e();
            while (interfaceC2722u.mo554y(c2706e, 8192L) != -1) {
                c2706e.m4715h();
            }
            if (jMo4745c == Long.MAX_VALUE) {
                interfaceC2722u.mo3157a().mo4743a();
                return true;
            }
            interfaceC2722u.mo3157a().mo4746d(jNanoTime + jMo4745c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo4745c == Long.MAX_VALUE) {
                interfaceC2722u.mo3157a().mo4743a();
                return false;
            }
            interfaceC2722u.mo3157a().mo4746d(jNanoTime + jMo4745c);
            return false;
        } catch (Throwable th) {
            if (jMo4745c == Long.MAX_VALUE) {
                interfaceC2722u.mo3157a().mo4743a();
            } else {
                interfaceC2722u.mo3157a().mo4746d(jNanoTime + jMo4745c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C1707q m3180g(List list) {
        C1706p c1706p = new C1706p(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2041d c2041d = (C2041d) it.next();
            c1706p.m3023b(c2041d.f6799a.m4741j(), c2041d.f6800b.m4741j());
        }
        return c1706p.m3024c();
    }

    /* JADX INFO: renamed from: h */
    public static final String m3181h(C1709s c1709s, boolean z5) {
        AbstractC1665j.m2985e(c1709s, "<this>");
        int i5 = c1709s.f5872e;
        String str = c1709s.f5871d;
        if (AbstractC1976d.m3629W(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z5) {
            String str2 = c1709s.f5868a;
            AbstractC1665j.m2985e(str2, "scheme");
            if (i5 == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i5;
    }

    /* JADX INFO: renamed from: i */
    public static final List m3182i(List list) {
        AbstractC1665j.m2985e(list, "<this>");
        if (list.isEmpty()) {
            return C0981u.f3047d;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            AbstractC1665j.m2984d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        AbstractC1665j.m2984d(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC0972l.m1987K(array));
        AbstractC1665j.m2984d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: j */
    public static final List m3183j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return C0981u.f3047d;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            AbstractC1665j.m2984d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC0972l.m1987K((Object[]) objArr.clone()));
        AbstractC1665j.m2984d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
