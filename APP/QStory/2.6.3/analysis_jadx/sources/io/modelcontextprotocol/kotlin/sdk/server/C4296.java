package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.activity.compose.C0011;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.C1067;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4307;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4396;
import p052.InterfaceC6543;
import p056.C6640;
import p056.C6641;
import p056.C6651;
import p056.C6665;
import p056.C6683;
import p056.C6698;
import p056.C6710;
import p056.C6714;
import p056.C6721;
import p056.C6761;
import p056.C6832;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4296 extends AbstractC4307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final LinkedHashMap f12854;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final LinkedHashMap f12855;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0011 f12856;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6721 f12857;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6761 f12858;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final LinkedHashMap f12859;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6543 f12860;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6698 f12861;

    public C4296(C6721 c6721, C4299 c4299) {
        super(c4299);
        this.f12857 = c6721;
        this.f12856 = new C0011(0);
        this.f12860 = new C0011(0);
        C6761 c6761 = c4299.f12862;
        this.f12858 = c6761;
        this.f12859 = new LinkedHashMap();
        this.f12855 = new LinkedHashMap();
        this.f12854 = new LinkedHashMap();
        AbstractC4295.f12853.mo9048(new C1030(this, 18));
        m8737(AbstractC4396.m8912(C6714.class), Method$Defined.Initialize, new Server$2(this, null));
        m8738(Method$Defined.NotificationsInitialized, new C1067(this, 19));
        if (c6761.f18195 != null) {
            m8737(AbstractC4396.m8912(C6641.class), Method$Defined.ToolsList, new Server$4(this, null));
            m8737(AbstractC4396.m8912(C6683.class), Method$Defined.ToolsCall, new Server$5(this, null));
        }
        if (c6761.f18197 != null) {
            m8737(AbstractC4396.m8912(C6665.class), Method$Defined.PromptsList, new Server$6(this, null));
            m8737(AbstractC4396.m8912(C6710.class), Method$Defined.PromptsGet, new Server$7(this, null));
        }
        if (c6761.f18196 != null) {
            m8737(AbstractC4396.m8912(C6640.class), Method$Defined.ResourcesList, new Server$8(this, null));
            m8737(AbstractC4396.m8912(C6832.class), Method$Defined.ResourcesRead, new Server$9(this, null));
            m8737(AbstractC4396.m8912(C6651.class), Method$Defined.ResourcesTemplatesList, new Server$10(this, null));
        }
    }
}
