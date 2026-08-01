package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.window.area.C2558;
import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import io.modelcontextprotocol.kotlin.sdk.McpError;
import io.modelcontextprotocol.kotlin.sdk.server.AbstractC4295;
import io.modelcontextprotocol.kotlin.sdk.server.C4294;
import io.modelcontextprotocol.kotlin.sdk.server.C4296;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C5176;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p056.C6754;
import p056.InterfaceC6836;
import p056.InterfaceC6840;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4308 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12885;

    public /* synthetic */ C4308(Object obj, int i) {
        this.f12885 = i;
        this.f12884 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f12885;
        Object obj = this.f12884;
        switch (i) {
            case 0:
                return Protocol$request$5.invokeSuspend$lambda$0((InterfaceC6836) obj);
            case 1:
                C6754 c6754 = (C6754) obj;
                return "Received progress notification: token=" + c6754.f18187 + ", progress=" + c6754.f18188 + '/' + c6754.f18185;
            case 2:
                return ((Error) obj).getMessage();
            case 3:
                return "Sending request: " + ((InterfaceC6840) obj).getMethod();
            case 4:
                AbstractC4307 abstractC4307 = (AbstractC4307) obj;
                LinkedHashMap linkedHashMap = abstractC4307.f12879;
                linkedHashMap.clear();
                abstractC4307.f12878.clear();
                abstractC4307.f12882 = null;
                AbstractC4295.f12853.mo9046(new C2558(10));
                ((C4296) abstractC4307).f12860.invoke();
                McpError mcpError = new McpError(ErrorCode$Defined.ConnectionClosed.getCode(), "Connection closed", null, 4, null);
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC6554) it.next()).invoke(null, mcpError);
                }
                return C5176.f14739;
            default:
                return AbstractC5399.m10489(((C4294) ((AbstractC4310) obj)).f12852.mo2430().plus(AbstractC5399.m10487()));
        }
    }
}
