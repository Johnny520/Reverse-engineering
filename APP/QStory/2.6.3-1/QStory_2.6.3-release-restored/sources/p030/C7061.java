package p030;

import androidx.compose.animation.core.C1171;
import androidx.compose.runtime.internal.C2080;
import com.bumptech.glide.AbstractC3888;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import kotlin.AbstractC6019;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import net.bytebuddy.pool.TypePool;
import okhttp3.Protocol;
import p017.C6913;
import p020.C6921;
import p023.AbstractC6957;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6973;
import p023.C6977;
import p023.C6978;
import p023.InterfaceC6984;
import p027.C7032;
import p033.AbstractC7067;
import p050.AbstractC7176;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7061 implements InterfaceC6984 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6973 f17514;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6978 f17515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6956 f17516;

    static {
        Regex regex = C6973.f17204;
        f17514 = AbstractC3888.m7271("application/dns-message");
    }

    public C7061(C6956 c6956, C6978 c6978) {
        this.f17516 = c6956;
        this.f17515 = c6978;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static ArrayList m12264(String str, C6960 c6960) {
        Protocol protocol;
        if (c6960.f17108 == null && (protocol = c6960.f17116) != Protocol.HTTP_2 && protocol != Protocol.QUIC) {
            AbstractC7067 abstractC7067 = AbstractC7067.f17543;
            AbstractC7067.f17543.mo12283("Incorrect protocol: " + c6960.f17116, 5, null);
        }
        try {
            if (!c6960.f17109) {
                throw new IOException("response: " + c6960.f17111 + ' ' + c6960.f17117);
            }
            AbstractC6957 abstractC6957 = c6960.f17115;
            if (abstractC6957.mo11725() <= 65536) {
                ArrayList arrayListM12263 = AbstractC7060.m12263(str, abstractC6957.mo11726().mo12019());
                c6960.close();
                return arrayListM12263;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + abstractC6957.mo11725() + " bytes");
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6954 m12265(int i, String str) {
        List<String> listM9358;
        C2080 c2080 = new C2080(6);
        c2080.m2716("Accept", f17514.f17207);
        int i2 = AbstractC7060.f17513;
        str.getClass();
        C6921 c6921 = new C6921();
        c6921.m12016(0);
        c6921.m12016(256);
        c6921.m12016(1);
        c6921.m12016(0);
        c6921.m12016(0);
        c6921.m12016(0);
        C6921 c69212 = new C6921();
        List listM10709 = AbstractC5976.m10709(str, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH});
        if (listM10709.isEmpty()) {
            listM9358 = EmptyList.INSTANCE;
        } else {
            ListIterator listIterator = listM10709.listIterator(listM10709.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM9358 = AbstractC5176.m9358(listIterator.nextIndex() + 1, listM10709);
                    break;
                }
            }
            listM9358 = EmptyList.INSTANCE;
        }
        for (String str2 : listM9358) {
            long jM14239 = AbstractC9019.m14239(str2);
            if (jM14239 != str2.length()) {
                C6755.m11873("non-ascii hostname: ".concat(str));
                return null;
            }
            c69212.m12029((int) jM14239);
            c69212.m12050(str2);
        }
        c69212.m12029(0);
        c69212.m12044(c6921, 0L, c69212.f16992);
        c6921.m12016(i);
        c6921.m12016(1);
        String strM10696 = AbstractC5971.m10696(c6921.mo12040(c6921.f16992).base64Url(), "=", "");
        C6977 c6977M12098 = this.f17515.m12098();
        c6977M12098.m12096("dns", strM10696);
        c2080.f3965 = c6977M12098.m12094();
        return new C6954(c2080);
    }

    @Override // p023.InterfaceC6984
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo12115(String str) throws Exception {
        str.getClass();
        if (C6913.f16980.m11998(str) == null) {
            throw new UnknownHostException("private hosts not resolved");
        }
        ListBuilder listBuilderM12470 = AbstractC7176.m12470();
        C6954 c6954M12265 = m12265(1, str);
        C6956 c6956 = this.f17516;
        listBuilderM12470.add(new C7032(c6956, c6954M12265));
        listBuilderM12470.add(new C7032(c6956, m12265(28, str)));
        List listBuild = listBuilderM12470.build();
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(5);
        CountDownLatch countDownLatch = new CountDownLatch(listBuild.size());
        Iterator it = listBuild.iterator();
        while (it.hasNext()) {
            ((C7032) it.next()).m12194(new C1171(arrayList, countDownLatch, this, str, arrayList2));
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
            AbstractC6019.m10775(unknownHostException, (Throwable) arrayList.get(i));
        }
        throw unknownHostException;
    }
}
