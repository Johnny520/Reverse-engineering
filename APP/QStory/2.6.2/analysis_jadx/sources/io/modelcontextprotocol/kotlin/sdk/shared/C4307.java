package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.window.area.C2558;
import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import io.modelcontextprotocol.kotlin.sdk.McpError;
import io.modelcontextprotocol.kotlin.sdk.server.AbstractC4294;
import io.modelcontextprotocol.kotlin.sdk.server.C4293;
import io.modelcontextprotocol.kotlin.sdk.server.C4295;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C5175;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p056.C6753;
import p056.InterfaceC6835;
import p056.InterfaceC6839;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4307 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12880;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12881;

    public /* synthetic */ C4307(Object obj, int i) {
        this.f12881 = i;
        this.f12880 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f12881;
        Object obj = this.f12880;
        switch (i) {
            case 0:
                return Protocol$request$5.invokeSuspend$lambda$0((InterfaceC6835) obj);
            case 1:
                C6753 c6753 = (C6753) obj;
                return "Received progress notification: token=" + c6753.f18192 + ", progress=" + c6753.f18193 + '/' + c6753.f18190;
            case 2:
                return ((Error) obj).getMessage();
            case 3:
                return "Sending request: " + ((InterfaceC6839) obj).getMethod();
            case 4:
                AbstractC4306 abstractC4306 = (AbstractC4306) obj;
                LinkedHashMap linkedHashMap = abstractC4306.f12875;
                linkedHashMap.clear();
                abstractC4306.f12874.clear();
                abstractC4306.f12878 = null;
                AbstractC4294.f12849.mo9056(new C2558(10));
                ((C4295) abstractC4306).f12856.invoke();
                McpError mcpError = new McpError(ErrorCode$Defined.ConnectionClosed.getCode(), "Connection closed", null, 4, null);
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC6553) it.next()).invoke(null, mcpError);
                }
                return C5175.f14739;
            default:
                return AbstractC5398.m10485(((C4293) ((AbstractC4309) obj)).f12848.mo2420().plus(AbstractC5398.m10483()));
        }
    }
}
