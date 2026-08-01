package p029;

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
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.C6385;
import okio.ByteString;
import p020.C6921;
import p020.InterfaceC6930;
import p020.InterfaceC6939;
import p023.C6956;
import p023.C6960;
import p023.C6978;
import p023.C6980;
import p025.AbstractC7012;
import p035.C7093;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f17511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final TimeZone f17512;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f17512 = timeZone;
        f17511 = AbstractC5976.m10710(AbstractC5976.m10706(C6956.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Charset m12252(InterfaceC6939 interfaceC6939, Charset charset) {
        interfaceC6939.getClass();
        charset.getClass();
        int iMo12026 = interfaceC6939.mo12026(AbstractC7054.f17502);
        if (iMo12026 == -1) {
            return charset;
        }
        if (iMo12026 == 0) {
            return AbstractC5964.f15033;
        }
        if (iMo12026 == 1) {
            return AbstractC5964.f15032;
        }
        if (iMo12026 == 2) {
            Charset charset2 = AbstractC5964.f15033;
            Charset charset3 = AbstractC5964.f15029;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            AbstractC5964.f15029 = charsetForName;
            return charsetForName;
        }
        if (iMo12026 == 3) {
            return AbstractC5964.f15031;
        }
        if (iMo12026 != 4) {
            C6385.m11429();
            return null;
        }
        Charset charset4 = AbstractC5964.f15033;
        Charset charset5 = AbstractC5964.f15028;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        AbstractC5964.f15028 = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m12253(C6960 c6960) {
        String strM12110 = c6960.f17114.m12110("Content-Length");
        if (strM12110 == null) {
            return -1L;
        }
        byte[] bArr = AbstractC7054.f17503;
        try {
            return Long.parseLong(strM12110);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m12254(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m12255(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC5227.m9466(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m12256(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            C6755.m11871("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            C6755.m11873("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        C6755.m11873("timeout".concat(" too small"));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m12257(C6978 c6978, C6978 c69782) {
        c6978.getClass();
        c69782.getClass();
        return AbstractC5227.m9466(c6978.f17226, c69782.f17226) && c6978.f17225 == c69782.f17225 && AbstractC5227.m9466(c6978.f17229, c69782.f17229);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6980 m12258(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7093 c7093 = (C7093) it.next();
            ByteString byteString = c7093.f17598;
            ByteString byteString2 = c7093.f17597;
            String strUtf8 = byteString.utf8();
            String strUtf82 = byteString2.utf8();
            strUtf8.getClass();
            strUtf82.getClass();
            arrayList.add(strUtf8);
            arrayList.add(AbstractC5976.m10714(strUtf82).toString());
        }
        return new C6980((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m12259(InterfaceC6930 interfaceC6930, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jMo12011 = interfaceC6930.mo11492().mo12009() ? interfaceC6930.mo11492().mo12011() - jNanoTime : Long.MAX_VALUE;
        interfaceC6930.mo11492().mo12010(Math.min(jMo12011, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C6921 c6921 = new C6921();
            while (interfaceC6930.mo11491(c6921, 8192L) != -1) {
                c6921.m12034();
            }
            if (jMo12011 == Long.MAX_VALUE) {
                interfaceC6930.mo11492().mo12013();
                return true;
            }
            interfaceC6930.mo11492().mo12010(jNanoTime + jMo12011);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo12011 == Long.MAX_VALUE) {
                interfaceC6930.mo11492().mo12013();
                return false;
            }
            interfaceC6930.mo11492().mo12010(jNanoTime + jMo12011);
            return false;
        } catch (Throwable th) {
            if (jMo12011 == Long.MAX_VALUE) {
                interfaceC6930.mo11492().mo12013();
            } else {
                interfaceC6930.mo11492().mo12010(jNanoTime + jMo12011);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final List m12260(Object[] objArr) {
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
    public static final String m12261(C6978 c6978, boolean z) {
        c6978.getClass();
        int i = c6978.f17225;
        String strM12149 = c6978.f17226;
        if (AbstractC5976.m10735(strM12149, ":", false)) {
            strM12149 = AbstractC7012.m12149(']', "[", strM12149);
        }
        if (!z) {
            String str = c6978.f17229;
            str.getClass();
            if (i == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strM12149;
            }
        }
        return strM12149 + ':' + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final List m12262(List list) {
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
