package p014;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import kotlin.AbstractC5187;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import kotlin.text.Regex;
import net.bytebuddy.pool.TypePool;
import okhttp3.Protocol;
import p001.C6084;
import p004.C6092;
import p007.AbstractC6128;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6144;
import p007.C6148;
import p007.C6149;
import p007.InterfaceC6155;
import p011.C6203;
import p017.AbstractC6238;
import p034.AbstractC6347;
import p253.AbstractC8190;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6232 implements InterfaceC6155 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6144 f17169;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6149 f17170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6127 f17171;

    static {
        Regex regex = C6144.f16859;
        f17169 = AbstractC3056.m6711("application/dns-message");
    }

    public C6232(C6127 c6127, C6149 c6149) {
        this.f17171 = c6127;
        this.f17170 = c6149;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static ArrayList m11705(String str, C6131 c6131) {
        Protocol protocol;
        if (c6131.f16763 == null && (protocol = c6131.f16771) != Protocol.HTTP_2 && protocol != Protocol.QUIC) {
            AbstractC6238 abstractC6238 = AbstractC6238.f17198;
            AbstractC6238.f17198.mo11724("Incorrect protocol: " + c6131.f16771, 5, null);
        }
        try {
            if (!c6131.f16764) {
                throw new IOException("response: " + c6131.f16766 + ' ' + c6131.f16772);
            }
            AbstractC6128 abstractC6128 = c6131.f16770;
            if (abstractC6128.mo11166() <= 65536) {
                ArrayList arrayListM11704 = AbstractC6231.m11704(str, abstractC6128.mo11167().mo11460());
                c6131.close();
                return arrayListM11704;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + abstractC6128.mo11166() + " bytes");
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6125 m11706(int i, String str) {
        List<String> listM8799;
        C1245 c1245 = new C1245(6);
        c1245.m2156("Accept", f17169.f16862);
        int i2 = AbstractC6231.f17168;
        str.getClass();
        C6092 c6092 = new C6092();
        c6092.m11457(0);
        c6092.m11457(256);
        c6092.m11457(1);
        c6092.m11457(0);
        c6092.m11457(0);
        c6092.m11457(0);
        C6092 c60922 = new C6092();
        List listM10150 = AbstractC5144.m10150(str, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        if (listM10150.isEmpty()) {
            listM8799 = EmptyList.INSTANCE;
        } else {
            ListIterator listIterator = listM10150.listIterator(listM10150.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM8799 = AbstractC4344.m8799(listIterator.nextIndex() + 1, listM10150);
                    break;
                }
            }
            listM8799 = EmptyList.INSTANCE;
        }
        for (String str2 : listM8799) {
            long jM13680 = AbstractC8190.m13680(str2);
            if (jM13680 != str2.length()) {
                C5925.m11314("non-ascii hostname: ".concat(str));
                return null;
            }
            c60922.m11470((int) jM13680);
            c60922.m11491(str2);
        }
        c60922.m11470(0);
        c60922.m11485(c6092, 0L, c60922.f16647);
        c6092.m11457(i);
        c6092.m11457(1);
        String strM10137 = AbstractC5139.m10137(c6092.mo11481(c6092.f16647).base64Url(), "=", "");
        C6148 c6148M11539 = this.f17170.m11539();
        c6148M11539.m11537("dns", strM10137);
        c1245.f3620 = c6148M11539.m11535();
        return new C6125(c1245);
    }

    @Override // p007.InterfaceC6155
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo11556(String str) throws Exception {
        str.getClass();
        if (C6084.f16635.m11439(str) == null) {
            throw new UnknownHostException("private hosts not resolved");
        }
        ListBuilder listBuilderM11911 = AbstractC6347.m11911();
        C6125 c6125M11706 = m11706(1, str);
        C6127 c6127 = this.f17171;
        listBuilderM11911.add(new C6203(c6127, c6125M11706));
        listBuilderM11911.add(new C6203(c6127, m11706(28, str)));
        List listBuild = listBuilderM11911.build();
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(5);
        CountDownLatch countDownLatch = new CountDownLatch(listBuild.size());
        Iterator it = listBuild.iterator();
        while (it.hasNext()) {
            ((C6203) it.next()).m11635(new C0325(arrayList, countDownLatch, this, str, arrayList2));
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
            AbstractC5187.m10216(unknownHostException, (Throwable) arrayList.get(i));
        }
        throw unknownHostException;
    }
}
