package io.ktor.server.websocket;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2905;
import com.alibaba.fastjson2.C2942;
import io.ktor.http.content.AbstractC3987;
import io.ktor.server.application.AbstractC4054;
import io.ktor.server.application.C4058;
import io.ktor.server.request.InterfaceC4129;
import io.ktor.server.routing.C4163;
import io.ktor.util.AbstractC4208;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import io.ktor.websocket.C4265;
import io.ktor.websocket.C4270;
import java.nio.charset.CharacterCodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p058.AbstractC6855;
import p236.AbstractC8115;
import p236.C8097;
import p236.C8113;
import p236.C8116;
import p236.C8117;
import p236.InterfaceC8112;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4176 extends AbstractC3987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5402 f12638 = new C5402("raw-ws-handler");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8117 f12639;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4182 f12640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6554 f12641;

    public C4176(C4163 c4163, String str, boolean z, InterfaceC6554 interfaceC6554) throws CharacterCodingException {
        Object arrayList;
        this.f12641 = interfaceC6554;
        InterfaceC4129 interfaceC4129Mo8459 = c4163.mo8459();
        String[] strArr = AbstractC8115.f22413;
        String strM6304 = AbstractC2905.m6304(interfaceC4129Mo8459, "Sec-WebSocket-Key");
        C4058 c4058 = c4163.f12612;
        C4183 c4183 = C4182.f12646;
        C4182 c4182 = (C4182) AbstractC4054.m8455(c4058);
        this.f12640 = c4182;
        C8113 c8113 = InterfaceC8112.f22409;
        C8116 c8116 = new C8116(2);
        c8116.mo2423("Upgrade", "websocket");
        c8116.mo2423("Connection", "Upgrade");
        if (strM6304 != null) {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(AbstractC6855.m12084(AbstractC5144.m10155(strM6304).toString() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11", AbstractC5132.f14685));
            bArrDigest.getClass();
            c8116.mo2423("Sec-WebSocket-Accept", AbstractC4208.m8591(bArrDigest));
        }
        if (str != null) {
            c8116.mo2423("Sec-WebSocket-Protocol", str);
        }
        if (z) {
            String strM63042 = AbstractC2905.m6304(c4163.mo8459(), "Sec-WebSocket-Extensions");
            if (strM63042 != null) {
                List listM10144 = AbstractC5144.m10144(strM63042, new String[]{","}, 6);
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(listM10144, 10));
                Iterator it = listM10144.iterator();
                while (it.hasNext()) {
                    List listM101442 = AbstractC5144.m10144((String) it.next(), new String[]{";"}, 6);
                    String string = AbstractC5144.m10155((String) AbstractC4344.m8820(listM101442)).toString();
                    List listM8805 = AbstractC4344.m8805(1, listM101442);
                    ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(listM8805, 10));
                    Iterator it2 = listM8805.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(AbstractC5144.m10155((String) it2.next()).toString());
                    }
                    arrayList2.add(new C4270(string, arrayList3));
                }
            } else {
                EmptyList emptyList = EmptyList.INSTANCE;
            }
            ArrayList arrayList4 = c4182.f12651.f4600;
            ArrayList arrayList5 = new ArrayList(AbstractC4345.m8822(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                if (((InterfaceC6543) it3.next()).invoke() != null) {
                    C2942.m6394();
                    throw null;
                }
                arrayList5.add(null);
            }
            ArrayList arrayList6 = new ArrayList();
            arrayList = new ArrayList();
            Iterator it4 = arrayList5.iterator();
            if (it4.hasNext()) {
                throw AbstractC2442.m4578(it4);
            }
            if (!arrayList6.isEmpty()) {
                c8116.mo2423("Sec-WebSocket-Extensions", AbstractC4344.m8810(arrayList6, ";", null, null, null, 62));
            }
        } else {
            arrayList = EmptyList.INSTANCE;
        }
        c4163.f12613.m8586(C4182.f12648, arrayList);
        this.f12639 = c8116.m13585();
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8097 mo8280() {
        C8097 c8097 = C8097.f22357;
        return C8097.f22352;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8112 mo8282() {
        return this.f12639;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4354 m8541(InterfaceC4252 interfaceC4252, InterfaceC4247 interfaceC4247, InterfaceC4360 interfaceC4360, InterfaceC4357 interfaceC4357) {
        long j = this.f12640.f12650;
        InterfaceC4360 context = interfaceC4357.getContext();
        C5453 c5453 = C5453.f15105;
        InterfaceC4360 interfaceC43602 = (InterfaceC5452) context.get(c5453);
        if (interfaceC43602 == null) {
            interfaceC43602 = EmptyCoroutineContext.INSTANCE;
        }
        InterfaceC4360 interfaceC4360Plus = interfaceC4360.plus(interfaceC43602);
        interfaceC4252.getClass();
        interfaceC4247.getClass();
        interfaceC4360Plus.getClass();
        C4265 c4265 = new C4265(interfaceC4252, interfaceC4247, j, false, interfaceC4360Plus);
        AbstractC5399.m10477(c4265, f12638, null, new WebSocketUpgrade$upgrade$2(this, c4265, null), 2);
        InterfaceC4354 interfaceC4354 = c4265.f12801.get(c5453);
        interfaceC4354.getClass();
        return interfaceC4354;
    }
}
