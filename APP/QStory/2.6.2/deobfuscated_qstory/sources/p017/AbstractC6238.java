package p017;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.javaplugin.C5553;
import okio.ByteString;
import p005.C6101;
import p005.InterfaceC6110;
import p005.InterfaceC6119;
import p007.AbstractC6136;
import p015.C6200;
import p015.C6204;
import p015.C6222;
import p015.C6224;
import p022.C6268;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏子哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6238 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f17189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final TimeZone f17190;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f17190 = timeZone;
        f17189 = AbstractC5143.m10159(AbstractC5143.m10160(C6200.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Charset m11701(InterfaceC6119 interfaceC6119, Charset charset) {
        interfaceC6119.getClass();
        charset.getClass();
        int iMo11490 = interfaceC6119.mo11490(AbstractC6233.f17180);
        if (iMo11490 == -1) {
            return charset;
        }
        if (iMo11490 == 0) {
            return AbstractC5131.f14688;
        }
        if (iMo11490 == 1) {
            return AbstractC5131.f14687;
        }
        if (iMo11490 == 2) {
            Charset charset2 = AbstractC5131.f14688;
            Charset charset3 = AbstractC5131.f14684;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            AbstractC5131.f14684 = charsetForName;
            return charsetForName;
        }
        if (iMo11490 == 3) {
            return AbstractC5131.f14686;
        }
        if (iMo11490 != 4) {
            C5553.m10813();
            return null;
        }
        Charset charset4 = AbstractC5131.f14688;
        Charset charset5 = AbstractC5131.f14683;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        AbstractC5131.f14683 = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m11702(C6204 c6204) {
        String strM11680 = c6204.f17008.m11680("Content-Length");
        if (strM11680 == null) {
            return -1L;
        }
        byte[] bArr = AbstractC6233.f17181;
        try {
            return Long.parseLong(strM11680);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m11703(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m11704(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC4394.m8917(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m11705(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            C5919.m11251("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            C5919.m11253("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        C5919.m11253("timeout".concat(" too small"));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11706(C6222 c6222, C6222 c62222) {
        c6222.getClass();
        c62222.getClass();
        return AbstractC4394.m8917(c6222.f17120, c62222.f17120) && c6222.f17119 == c62222.f17119 && AbstractC4394.m8917(c6222.f17123, c62222.f17123);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6224 m11707(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6268 c6268 = (C6268) it.next();
            ByteString byteString = c6268.f17271;
            ByteString byteString2 = c6268.f17270;
            String strUtf8 = byteString.utf8();
            String strUtf82 = byteString2.utf8();
            strUtf8.getClass();
            strUtf82.getClass();
            arrayList.add(strUtf8);
            arrayList.add(AbstractC5143.m10150(strUtf82).toString());
        }
        return new C6224((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m11708(InterfaceC6110 interfaceC6110, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jMo11459 = interfaceC6110.mo10875().mo11457() ? interfaceC6110.mo10875().mo11459() - jNanoTime : Long.MAX_VALUE;
        interfaceC6110.mo10875().mo11458(Math.min(jMo11459, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C6101 c6101 = new C6101();
            while (interfaceC6110.mo10876(c6101, 8192L) != -1) {
                c6101.m11481();
            }
            if (jMo11459 == Long.MAX_VALUE) {
                interfaceC6110.mo10875().mo11461();
                return true;
            }
            interfaceC6110.mo10875().mo11458(jNanoTime + jMo11459);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo11459 == Long.MAX_VALUE) {
                interfaceC6110.mo10875().mo11461();
                return false;
            }
            interfaceC6110.mo10875().mo11458(jNanoTime + jMo11459);
            return false;
        } catch (Throwable th) {
            if (jMo11459 == Long.MAX_VALUE) {
                interfaceC6110.mo10875().mo11461();
            } else {
                interfaceC6110.mo10875().mo11458(jNanoTime + jMo11459);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final List m11709(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return EmptyList.INSTANCE;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final String m11710(C6222 c6222, boolean z) {
        c6222.getClass();
        int i = c6222.f17119;
        String strM11558 = c6222.f17120;
        if (AbstractC5143.m10171(strM11558, ":", false)) {
            strM11558 = AbstractC6136.m11558(']', "[", strM11558);
        }
        if (!z) {
            String str = c6222.f17123;
            str.getClass();
            if (i == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strM11558;
            }
        }
        return strM11558 + ':' + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final List m11711(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
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
}
