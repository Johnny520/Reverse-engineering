package p013;

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
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.javaplugin.C5554;
import okio.ByteString;
import p004.C6092;
import p004.InterfaceC6101;
import p004.InterfaceC6110;
import p007.C6127;
import p007.C6131;
import p007.C6149;
import p007.C6151;
import p009.AbstractC6183;
import p019.C6264;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f17166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final TimeZone f17167;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f17167 = timeZone;
        f17166 = AbstractC5144.m10151(AbstractC5144.m10147(C6127.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Charset m11693(InterfaceC6110 interfaceC6110, Charset charset) {
        interfaceC6110.getClass();
        charset.getClass();
        int iMo11467 = interfaceC6110.mo11467(AbstractC6225.f17157);
        if (iMo11467 == -1) {
            return charset;
        }
        if (iMo11467 == 0) {
            return AbstractC5132.f14688;
        }
        if (iMo11467 == 1) {
            return AbstractC5132.f14687;
        }
        if (iMo11467 == 2) {
            Charset charset2 = AbstractC5132.f14688;
            Charset charset3 = AbstractC5132.f14684;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            AbstractC5132.f14684 = charsetForName;
            return charsetForName;
        }
        if (iMo11467 == 3) {
            return AbstractC5132.f14686;
        }
        if (iMo11467 != 4) {
            C5554.m10870();
            return null;
        }
        Charset charset4 = AbstractC5132.f14688;
        Charset charset5 = AbstractC5132.f14683;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        AbstractC5132.f14683 = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m11694(C6131 c6131) {
        String strM11551 = c6131.f16769.m11551("Content-Length");
        if (strM11551 == null) {
            return -1L;
        }
        byte[] bArr = AbstractC6225.f17158;
        try {
            return Long.parseLong(strM11551);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m11695(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m11696(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC4395.m8907(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m11697(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            C5925.m11312("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            C5925.m11314("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        C5925.m11314("timeout".concat(" too small"));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11698(C6149 c6149, C6149 c61492) {
        c6149.getClass();
        c61492.getClass();
        return AbstractC4395.m8907(c6149.f16881, c61492.f16881) && c6149.f16880 == c61492.f16880 && AbstractC4395.m8907(c6149.f16884, c61492.f16884);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6151 m11699(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6264 c6264 = (C6264) it.next();
            ByteString byteString = c6264.f17253;
            ByteString byteString2 = c6264.f17252;
            String strUtf8 = byteString.utf8();
            String strUtf82 = byteString2.utf8();
            strUtf8.getClass();
            strUtf82.getClass();
            arrayList.add(strUtf8);
            arrayList.add(AbstractC5144.m10155(strUtf82).toString());
        }
        return new C6151((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m11700(InterfaceC6101 interfaceC6101, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jMo11452 = interfaceC6101.mo10933().mo11450() ? interfaceC6101.mo10933().mo11452() - jNanoTime : Long.MAX_VALUE;
        interfaceC6101.mo10933().mo11451(Math.min(jMo11452, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C6092 c6092 = new C6092();
            while (interfaceC6101.mo10932(c6092, 8192L) != -1) {
                c6092.m11475();
            }
            if (jMo11452 == Long.MAX_VALUE) {
                interfaceC6101.mo10933().mo11454();
                return true;
            }
            interfaceC6101.mo10933().mo11451(jNanoTime + jMo11452);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo11452 == Long.MAX_VALUE) {
                interfaceC6101.mo10933().mo11454();
                return false;
            }
            interfaceC6101.mo10933().mo11451(jNanoTime + jMo11452);
            return false;
        } catch (Throwable th) {
            if (jMo11452 == Long.MAX_VALUE) {
                interfaceC6101.mo10933().mo11454();
            } else {
                interfaceC6101.mo10933().mo11451(jNanoTime + jMo11452);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final List m11701(Object[] objArr) {
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
    public static final String m11702(C6149 c6149, boolean z) {
        c6149.getClass();
        int i = c6149.f16880;
        String strM11590 = c6149.f16881;
        if (AbstractC5144.m10176(strM11590, ":", false)) {
            strM11590 = AbstractC6183.m11590(']', "[", strM11590);
        }
        if (!z) {
            String str = c6149.f16884;
            str.getClass();
            if (i == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strM11590;
            }
        }
        return strM11590 + ':' + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final List m11703(List list) {
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
