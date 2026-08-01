package io.ktor.server.websocket;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.C3775;
import io.ktor.http.content.AbstractC4819;
import io.ktor.server.application.AbstractC4886;
import io.ktor.server.application.C4890;
import io.ktor.server.request.InterfaceC4961;
import io.ktor.server.routing.C4995;
import io.ktor.util.AbstractC5040;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import io.ktor.websocket.C5097;
import io.ktor.websocket.C5102;
import java.nio.charset.CharacterCodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p074.AbstractC7684;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8942;
import p252.C8945;
import p252.C8946;
import p252.InterfaceC8941;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5008 extends AbstractC4819 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C6234 f12983 = new C6234("raw-ws-handler");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8946 f12984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5014 f12985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7383 f12986;

    public C5008(C4995 c4995, String str, boolean z, InterfaceC7383 interfaceC7383) throws CharacterCodingException {
        Object arrayList;
        this.f12986 = interfaceC7383;
        InterfaceC4961 interfaceC4961Mo9018 = c4995.mo9018();
        String[] strArr = AbstractC8944.f22758;
        String strM6864 = AbstractC3738.m6864(interfaceC4961Mo9018, "Sec-WebSocket-Key");
        C4890 c4890 = c4995.f12957;
        C5015 c5015 = C5014.f12991;
        C5014 c5014 = (C5014) AbstractC4886.m9014(c4890);
        this.f12985 = c5014;
        C8942 c8942 = InterfaceC8941.f22754;
        C8945 c8945 = new C8945(2);
        c8945.mo2983("Upgrade", "websocket");
        c8945.mo2983("Connection", "Upgrade");
        if (strM6864 != null) {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(AbstractC7684.m12643(AbstractC5976.m10714(strM6864).toString() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11", AbstractC5964.f15030));
            bArrDigest.getClass();
            c8945.mo2983("Sec-WebSocket-Accept", AbstractC5040.m9150(bArrDigest));
        }
        if (str != null) {
            c8945.mo2983("Sec-WebSocket-Protocol", str);
        }
        if (z) {
            String strM68642 = AbstractC3738.m6864(c4995.mo9018(), "Sec-WebSocket-Extensions");
            if (strM68642 != null) {
                List listM10703 = AbstractC5976.m10703(strM68642, new String[]{","}, 6);
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(listM10703, 10));
                Iterator it = listM10703.iterator();
                while (it.hasNext()) {
                    List listM107032 = AbstractC5976.m10703((String) it.next(), new String[]{";"}, 6);
                    String string = AbstractC5976.m10714((String) AbstractC5176.m9379(listM107032)).toString();
                    List listM9364 = AbstractC5176.m9364(1, listM107032);
                    ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(listM9364, 10));
                    Iterator it2 = listM9364.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(AbstractC5976.m10714((String) it2.next()).toString());
                    }
                    arrayList2.add(new C5102(string, arrayList3));
                }
            } else {
                EmptyList emptyList = EmptyList.INSTANCE;
            }
            ArrayList arrayList4 = c5014.f12996.f4945;
            ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                if (((InterfaceC7372) it3.next()).invoke() != null) {
                    C3775.m6954();
                    throw null;
                }
                arrayList5.add(null);
            }
            ArrayList arrayList6 = new ArrayList();
            arrayList = new ArrayList();
            Iterator it4 = arrayList5.iterator();
            if (it4.hasNext()) {
                throw AbstractC3275.m5138(it4);
            }
            if (!arrayList6.isEmpty()) {
                c8945.mo2983("Sec-WebSocket-Extensions", AbstractC5176.m9369(arrayList6, ";", null, null, null, 62));
            }
        } else {
            arrayList = EmptyList.INSTANCE;
        }
        c4995.f12958.m9145(C5014.f12993, arrayList);
        this.f12984 = c8945.m14144();
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8926 mo8839() {
        C8926 c8926 = C8926.f22702;
        return C8926.f22697;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8941 mo8841() {
        return this.f12984;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC5186 m9100(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, InterfaceC5192 interfaceC5192, InterfaceC5189 interfaceC5189) {
        long j = this.f12985.f12995;
        InterfaceC5192 context = interfaceC5189.getContext();
        C6285 c6285 = C6285.f15450;
        InterfaceC5192 interfaceC51922 = (InterfaceC6284) context.get(c6285);
        if (interfaceC51922 == null) {
            interfaceC51922 = EmptyCoroutineContext.INSTANCE;
        }
        InterfaceC5192 interfaceC5192Plus = interfaceC5192.plus(interfaceC51922);
        interfaceC5084.getClass();
        interfaceC5079.getClass();
        interfaceC5192Plus.getClass();
        C5097 c5097 = new C5097(interfaceC5084, interfaceC5079, j, false, interfaceC5192Plus);
        AbstractC6231.m11036(c5097, f12983, null, new WebSocketUpgrade$upgrade$2(this, c5097, null), 2);
        InterfaceC5186 interfaceC5186 = c5097.f13146.get(c6285);
        interfaceC5186.getClass();
        return interfaceC5186;
    }
}
