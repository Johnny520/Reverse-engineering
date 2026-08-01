package p014;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3065;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import kotlin.AbstractC5186;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import kotlin.text.Regex;
import net.bytebuddy.pool.TypePool;
import okhttp3.Protocol;
import p002.C6093;
import p005.C6101;
import p013.C6177;
import p015.AbstractC6201;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6217;
import p015.C6221;
import p015.C6222;
import p015.InterfaceC6228;
import p019.AbstractC6241;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6190 implements InterfaceC6228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6217 f16934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6222 f16935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6200 f16936;

    static {
        Regex regex = C6217.f17098;
        f16934 = AbstractC8189.m13679("application/dns-message");
    }

    public C6190(C6200 c6200, C6222 c6222) {
        this.f16936 = c6200;
        this.f16935 = c6222;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static ArrayList m11640(String str, C6204 c6204) {
        Protocol protocol;
        if (c6204.f17002 == null && (protocol = c6204.f17010) != Protocol.HTTP_2 && protocol != Protocol.QUIC) {
            AbstractC6241 abstractC6241 = AbstractC6241.f17194;
            AbstractC6241.f17194.mo11722("Incorrect protocol: " + c6204.f17010, 5, null);
        }
        try {
            if (!c6204.f17003) {
                throw new IOException("response: " + c6204.f17005 + ' ' + c6204.f17011);
            }
            AbstractC6201 abstractC6201 = c6204.f17009;
            if (abstractC6201.mo11109() <= 65536) {
                ArrayList arrayListM11639 = AbstractC6189.m11639(str, abstractC6201.mo11110().mo11467());
                c6204.close();
                return arrayListM11639;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + abstractC6201.mo11109() + " bytes");
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6198 m11641(int i, String str) {
        List<String> listM8816;
        C1245 c1245 = new C1245(6);
        c1245.m2146("Accept", f16934.f17101);
        int i2 = AbstractC6189.f16933;
        str.getClass();
        C6101 c6101 = new C6101();
        c6101.m11465(0);
        c6101.m11465(256);
        c6101.m11465(1);
        c6101.m11465(0);
        c6101.m11465(0);
        c6101.m11465(0);
        C6101 c61012 = new C6101();
        List listM10147 = AbstractC5143.m10147(str, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        if (listM10147.isEmpty()) {
            listM8816 = EmptyList.INSTANCE;
        } else {
            ListIterator listIterator = listM10147.listIterator(listM10147.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM8816 = AbstractC4343.m8816(listIterator.nextIndex() + 1, listM10147);
                    break;
                }
            }
            listM8816 = EmptyList.INSTANCE;
        }
        for (String str2 : listM8816) {
            long jM6845 = AbstractC3065.m6845(str2);
            if (jM6845 != str2.length()) {
                C5919.m11253("non-ascii hostname: ".concat(str));
                return null;
            }
            c61012.m11474((int) jM6845);
            c61012.m11498(str2);
        }
        c61012.m11474(0);
        c61012.m11491(c6101, 0L, c61012.f16657);
        c6101.m11465(i);
        c6101.m11465(1);
        String strM10128 = AbstractC5138.m10128(c6101.mo11487(c6101.f16657).base64Url(), "=", "");
        C6221 c6221M11668 = this.f16935.m11668();
        c6221M11668.m11666("dns", strM10128);
        c1245.f3619 = c6221M11668.m11664();
        return new C6198(c1245);
    }

    @Override // p015.InterfaceC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo11642(String str) throws Exception {
        str.getClass();
        if (C6093.f16645.m11447(str) == null) {
            throw new UnknownHostException("private hosts not resolved");
        }
        ListBuilder listBuilderM13685 = AbstractC8189.m13685();
        C6198 c6198M11641 = m11641(1, str);
        C6200 c6200 = this.f16936;
        listBuilderM13685.add(new C6177(c6200, c6198M11641));
        listBuilderM13685.add(new C6177(c6200, m11641(28, str)));
        List listBuild = listBuilderM13685.build();
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(5);
        CountDownLatch countDownLatch = new CountDownLatch(listBuild.size());
        Iterator it = listBuild.iterator();
        while (it.hasNext()) {
            ((C6177) it.next()).m11616(new C0325(arrayList, countDownLatch, this, str, arrayList2));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            arrayList.add(e);
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        if (arrayList.isEmpty()) {
            throw new UnknownHostException(str);
        }
        Exception exc = (Exception) arrayList.get(0);
        if (exc instanceof UnknownHostException) {
            throw exc;
        }
        UnknownHostException unknownHostException = new UnknownHostException(str);
        unknownHostException.initCause(exc);
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            AbstractC5186.m10212(unknownHostException, (Throwable) arrayList.get(i));
        }
        throw unknownHostException;
    }
}
