package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import io.ktor.server.application.AbstractC4053;
import io.ktor.server.application.C4057;
import io.ktor.server.routing.AbstractC4143;
import io.ktor.server.routing.C4144;
import io.ktor.server.routing.C4145;
import io.ktor.util.C4208;
import kotlin.C5175;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p088.C7151;
import p236.C8098;
import p325.AbstractC8757;
import p325.C8758;
import p325.InterfaceC8761;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5870 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16040;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16041;

    public /* synthetic */ C5870(Object obj, int i) {
        this.f16041 = i;
        this.f16040 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f16041;
        final int i2 = 0;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f16040;
        switch (i) {
            case 0:
                C5866 c5866 = (C5866) obj2;
                C4144 c4144 = (C4144) obj;
                "$this$routing";
                c4144.getClass();
                String strM6668 = "/mcp";
                final McpServerManager$start$1$1$1$1 mcpServerManager$start$1$1$1$1 = new McpServerManager$start$1$1$1$1(c5866, null);
                final int i3 = 1;
                AbstractC4921.m9875(c4144, strM6668, C8098.f22372, new InterfaceC6557() { // from class: io.ktor.server.routing.飘花落叶言子楪哲苏世兰
                    @Override // p052.InterfaceC6557
                    public final Object invoke(Object obj3) {
                        int i4 = i3;
                        C5175 c51752 = C5175.f14739;
                        InterfaceC6553 interfaceC6553 = mcpServerManager$start$1$1$1$1;
                        InterfaceC4167 interfaceC4167 = (InterfaceC4167) obj3;
                        switch (i4) {
                            case 0:
                                interfaceC4167.getClass();
                                C4153 c4153 = (C4153) interfaceC4167;
                                c4153.f12575.add(interfaceC6553);
                                c4153.f12576 = null;
                                break;
                            default:
                                interfaceC4167.getClass();
                                C4153 c41532 = (C4153) interfaceC4167;
                                c41532.f12575.add(interfaceC6553);
                                c41532.f12576 = null;
                                break;
                        }
                        return c51752;
                    }
                });
                String strM66682 = "/mcp";
                final McpServerManager$start$1$1$1$2 mcpServerManager$start$1$1$1$2 = new McpServerManager$start$1$1$1$2(c5866, null);
                AbstractC4921.m9875(c4144, strM66682, C8098.f22371, new InterfaceC6557() { // from class: io.ktor.server.routing.飘花落叶言子楪哲苏世兰
                    @Override // p052.InterfaceC6557
                    public final Object invoke(Object obj3) {
                        int i4 = i2;
                        C5175 c51752 = C5175.f14739;
                        InterfaceC6553 interfaceC6553 = mcpServerManager$start$1$1$1$2;
                        InterfaceC4167 interfaceC4167 = (InterfaceC4167) obj3;
                        switch (i4) {
                            case 0:
                                interfaceC4167.getClass();
                                C4153 c4153 = (C4153) interfaceC4167;
                                c4153.f12575.add(interfaceC6553);
                                c4153.f12576 = null;
                                break;
                            default:
                                interfaceC4167.getClass();
                                C4153 c41532 = (C4153) interfaceC4167;
                                c41532.f12575.add(interfaceC6553);
                                c41532.f12576 = null;
                                break;
                        }
                        return c51752;
                    }
                });
                break;
            case 1:
                C8758 c8758 = (C8758) obj;
                c8758.m14434("2025-03-26", AbstractC2442.m4573(-3937791360413992359L, c8758, -3937806027727308199L));
                String strM66683 = "serverInfo";
                "block";
                C8758 c87582 = new C8758();
                "$this$jsonObject";
                c87582.m14434(((C5866) obj2).f16032, "name");
                c87582.m14434("1.0.0", "version");
                c8758.m14434(new C7151(c87582.f24678), strM66683);
                String strM66684 = "capabilities";
                "block";
                C8758 c87583 = new C8758();
                "$this$jsonObject";
                c87583.m14434(AbstractC8757.m14433(new C5869(3)), "tools");
                c8758.m14434(new C7151(c87583.f24678), strM66684);
                break;
            case 2:
                C4057 c4057 = (C4057) obj;
                "$this$embeddedServer";
                c4057.getClass();
                C5870 c5870 = new C5870((C5866) obj2, i2);
                C4208 c4208 = AbstractC4143.f12558;
                C4145 c4145 = C4144.f12560;
                C4144 c41442 = (C4144) AbstractC4053.m8464(c4057, c4145);
                if (c41442 == null) {
                } else {
                    c5870.invoke(c41442);
                }
                break;
            default:
                InterfaceC8761 interfaceC8761 = (InterfaceC8761) obj2;
                C8758 c87584 = (C8758) obj;
                c87584.m14434(interfaceC8761.getId(), AbstractC2442.m4573(-3937791360413992359L, c87584, -3937597717518484903L));
                c87584.m14434(interfaceC8761.mo14419(), "description");
                c87584.m14434(interfaceC8761.mo14418(), "inputSchema");
                break;
        }
        return c5175;
    }
}
