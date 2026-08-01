package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.activity.compose.C0011;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.C1067;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6542;
import p056.C6639;
import p056.C6640;
import p056.C6650;
import p056.C6664;
import p056.C6682;
import p056.C6697;
import p056.C6709;
import p056.C6713;
import p056.C6720;
import p056.C6760;
import p056.C6831;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4295 extends AbstractC4306 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final LinkedHashMap f12850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final LinkedHashMap f12851;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0011 f12852;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6720 f12853;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6760 f12854;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final LinkedHashMap f12855;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6542 f12856;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6697 f12857;

    public C4295(C6720 c6720, C4298 c4298) {
        super(c4298);
        this.f12853 = c6720;
        this.f12852 = new C0011(0);
        this.f12856 = new C0011(0);
        C6760 c6760 = c4298.f12858;
        this.f12854 = c6760;
        this.f12855 = new LinkedHashMap();
        this.f12851 = new LinkedHashMap();
        this.f12850 = new LinkedHashMap();
        AbstractC4294.f12849.mo9058(new C1030(this, 18));
        m8747(AbstractC4395.m8922(C6713.class), Method$Defined.Initialize, new Server$2(this, null));
        m8748(Method$Defined.NotificationsInitialized, new C1067(this, 19));
        if (c6760.f18200 != null) {
            m8747(AbstractC4395.m8922(C6640.class), Method$Defined.ToolsList, new Server$4(this, null));
            m8747(AbstractC4395.m8922(C6682.class), Method$Defined.ToolsCall, new Server$5(this, null));
        }
        if (c6760.f18202 != null) {
            m8747(AbstractC4395.m8922(C6664.class), Method$Defined.PromptsList, new Server$6(this, null));
            m8747(AbstractC4395.m8922(C6709.class), Method$Defined.PromptsGet, new Server$7(this, null));
        }
        if (c6760.f18201 != null) {
            m8747(AbstractC4395.m8922(C6639.class), Method$Defined.ResourcesList, new Server$8(this, null));
            m8747(AbstractC4395.m8922(C6831.class), Method$Defined.ResourcesRead, new Server$9(this, null));
            m8747(AbstractC4395.m8922(C6650.class), Method$Defined.ResourcesTemplatesList, new Server$10(this, null));
        }
    }
}
