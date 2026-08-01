package io.ktor.server.websocket;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.AbstractC3054;
import io.ktor.http.content.AbstractC3986;
import io.ktor.server.application.AbstractC4053;
import io.ktor.server.application.C4057;
import io.ktor.server.request.InterfaceC4128;
import io.ktor.server.routing.C4162;
import io.ktor.util.AbstractC4207;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import io.ktor.websocket.C4264;
import io.ktor.websocket.C4269;
import java.nio.charset.CharacterCodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p058.AbstractC6854;
import p236.AbstractC8114;
import p236.C8096;
import p236.C8112;
import p236.C8115;
import p236.C8116;
import p236.InterfaceC8111;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4175 extends AbstractC3986 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5401 f12634 = new C5401("raw-ws-handler");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8116 f12635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4181 f12636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6553 f12637;

    public C4175(C4162 c4162, String str, boolean z, InterfaceC6553 interfaceC6553) throws CharacterCodingException {
        Object arrayList;
        this.f12637 = interfaceC6553;
        InterfaceC4128 interfaceC4128Mo8469 = c4162.mo8469();
        String[] strArr = AbstractC8114.f22415;
        String strM6609 = AbstractC3054.m6609(interfaceC4128Mo8469, "Sec-WebSocket-Key");
        C4057 c4057 = c4162.f12608;
        C4182 c4182 = C4181.f12642;
        C4181 c4181 = (C4181) AbstractC4053.m8465(c4057);
        this.f12636 = c4181;
        C8112 c8112 = InterfaceC8111.f22411;
        C8115 c8115 = new C8115(2);
        c8115.mo2413("Upgrade", "websocket");
        c8115.mo2413("Connection", "Upgrade");
        if (strM6609 != null) {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(AbstractC6854.m12056(AbstractC5143.m10150(strM6609).toString() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11", AbstractC5131.f14685));
            bArrDigest.getClass();
            c8115.mo2413("Sec-WebSocket-Accept", AbstractC4207.m8601(bArrDigest));
        }
        if (str != null) {
            c8115.mo2413("Sec-WebSocket-Protocol", str);
        }
        if (z) {
            String strM66092 = AbstractC3054.m6609(c4162.mo8469(), "Sec-WebSocket-Extensions");
            if (strM66092 != null) {
                List listM10148 = AbstractC5143.m10148(strM66092, new String[]{","}, 6);
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(listM10148, 10));
                Iterator it = listM10148.iterator();
                while (it.hasNext()) {
                    List listM101482 = AbstractC5143.m10148((String) it.next(), new String[]{";"}, 6);
                    String string = AbstractC5143.m10150((String) AbstractC4343.m8827(listM101482)).toString();
                    List listM8792 = AbstractC4343.m8792(1, listM101482);
                    ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(listM8792, 10));
                    Iterator it2 = listM8792.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(AbstractC5143.m10150((String) it2.next()).toString());
                    }
                    arrayList2.add(new C4269(string, arrayList3));
                }
            } else {
                EmptyList emptyList = EmptyList.INSTANCE;
            }
            ArrayList arrayList4 = c4181.f12647.f4599;
            ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                if (((InterfaceC6542) it3.next()).invoke() != null) {
                    C2941.m6336();
                    throw null;
                }
                arrayList5.add(null);
            }
            ArrayList arrayList6 = new ArrayList();
            arrayList = new ArrayList();
            Iterator it4 = arrayList5.iterator();
            if (it4.hasNext()) {
                throw AbstractC2442.m4568(it4);
            }
            if (!arrayList6.isEmpty()) {
                c8115.mo2413("Sec-WebSocket-Extensions", AbstractC4343.m8813(arrayList6, ";", null, null, null, 62));
            }
        } else {
            arrayList = EmptyList.INSTANCE;
        }
        c4162.f12609.m8596(C4181.f12644, arrayList);
        this.f12635 = c8115.m13556();
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8096 mo8290() {
        C8096 c8096 = C8096.f22359;
        return C8096.f22354;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8111 mo8292() {
        return this.f12635;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4353 m8551(InterfaceC4251 interfaceC4251, InterfaceC4246 interfaceC4246, InterfaceC4359 interfaceC4359, InterfaceC4356 interfaceC4356) {
        long j = this.f12636.f12646;
        InterfaceC4359 context = interfaceC4356.getContext();
        C5452 c5452 = C5452.f15105;
        InterfaceC4359 interfaceC43592 = (InterfaceC5451) context.get(c5452);
        if (interfaceC43592 == null) {
            interfaceC43592 = EmptyCoroutineContext.INSTANCE;
        }
        InterfaceC4359 interfaceC4359Plus = interfaceC4359.plus(interfaceC43592);
        interfaceC4251.getClass();
        interfaceC4246.getClass();
        interfaceC4359Plus.getClass();
        C4264 c4264 = new C4264(interfaceC4251, interfaceC4246, j, false, interfaceC4359Plus);
        AbstractC5398.m10473(c4264, f12634, null, new WebSocketUpgrade$upgrade$2(this, c4264, null), 2);
        InterfaceC4353 interfaceC4353 = c4264.f12797.get(c5452);
        interfaceC4353.getClass();
        return interfaceC4353;
    }
}
