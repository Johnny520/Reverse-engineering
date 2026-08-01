package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.activity.compose.C0858;
import androidx.compose.foundation.C1868;
import androidx.compose.foundation.C1905;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC5139;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5228;
import p068.InterfaceC7372;
import p072.C7469;
import p072.C7470;
import p072.C7480;
import p072.C7494;
import p072.C7512;
import p072.C7527;
import p072.C7539;
import p072.C7543;
import p072.C7550;
import p072.C7590;
import p072.C7661;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5128 extends AbstractC5139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final LinkedHashMap f13199;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final LinkedHashMap f13200;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0858 f13201;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7550 f13202;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7590 f13203;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final LinkedHashMap f13204;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC7372 f13205;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C7527 f13206;

    public C5128(C7550 c7550, C5131 c5131) {
        super(c5131);
        this.f13202 = c7550;
        this.f13201 = new C0858(0);
        this.f13205 = new C0858(0);
        C7590 c7590 = c5131.f13207;
        this.f13203 = c7590;
        this.f13204 = new LinkedHashMap();
        this.f13200 = new LinkedHashMap();
        this.f13199 = new LinkedHashMap();
        AbstractC5127.f13198.mo9607(new C1868(this, 18));
        m9296(AbstractC5228.m9471(C7543.class), Method$Defined.Initialize, new Server$2(this, null));
        m9297(Method$Defined.NotificationsInitialized, new C1905(this, 19));
        if (c7590.f18540 != null) {
            m9296(AbstractC5228.m9471(C7470.class), Method$Defined.ToolsList, new Server$4(this, null));
            m9296(AbstractC5228.m9471(C7512.class), Method$Defined.ToolsCall, new Server$5(this, null));
        }
        if (c7590.f18542 != null) {
            m9296(AbstractC5228.m9471(C7494.class), Method$Defined.PromptsList, new Server$6(this, null));
            m9296(AbstractC5228.m9471(C7539.class), Method$Defined.PromptsGet, new Server$7(this, null));
        }
        if (c7590.f18541 != null) {
            m9296(AbstractC5228.m9471(C7469.class), Method$Defined.ResourcesList, new Server$8(this, null));
            m9296(AbstractC5228.m9471(C7661.class), Method$Defined.ResourcesRead, new Server$9(this, null));
            m9296(AbstractC5228.m9471(C7480.class), Method$Defined.ResourcesTemplatesList, new Server$10(this, null));
        }
    }
}
