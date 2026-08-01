package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.window.area.C3391;
import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import io.modelcontextprotocol.kotlin.sdk.McpError;
import io.modelcontextprotocol.kotlin.sdk.server.AbstractC5127;
import io.modelcontextprotocol.kotlin.sdk.server.C5126;
import io.modelcontextprotocol.kotlin.sdk.server.C5128;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C6008;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p072.C7583;
import p072.InterfaceC7665;
import p072.InterfaceC7669;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5140 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f13229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13230;

    public /* synthetic */ C5140(Object obj, int i) {
        this.f13230 = i;
        this.f13229 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13230;
        Object obj = this.f13229;
        switch (i) {
            case 0:
                return Protocol$request$5.invokeSuspend$lambda$0((InterfaceC7665) obj);
            case 1:
                C7583 c7583 = (C7583) obj;
                return "Received progress notification: token=" + c7583.f18532 + ", progress=" + c7583.f18533 + '/' + c7583.f18530;
            case 2:
                return ((Error) obj).getMessage();
            case 3:
                return "Sending request: " + ((InterfaceC7669) obj).getMethod();
            case 4:
                AbstractC5139 abstractC5139 = (AbstractC5139) obj;
                LinkedHashMap linkedHashMap = abstractC5139.f13224;
                linkedHashMap.clear();
                abstractC5139.f13223.clear();
                abstractC5139.f13227 = null;
                AbstractC5127.f13198.mo9605(new C3391(10));
                ((C5128) abstractC5139).f13205.invoke();
                McpError mcpError = new McpError(ErrorCode$Defined.ConnectionClosed.getCode(), "Connection closed", null, 4, null);
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC7383) it.next()).invoke(null, mcpError);
                }
                return C6008.f15084;
            default:
                return AbstractC6231.m11048(((C5126) ((AbstractC5142) obj)).f13197.mo2990().plus(AbstractC6231.m11046()));
        }
    }
}
