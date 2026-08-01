package p402;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.activity.compose.C0851;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import kotlin.C6008;
import lin.xposed.hook.javaplugin.view.C6380;
import p068.InterfaceC7387;
import p273.C9037;
import p273.C9041;
import p401.C9898;
import p401.C9899;
import p401.C9900;
import p403.AbstractC9910;
import top.suzhelan.plugin.sdk.online.entity.Message;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9906 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9904 f25792;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25793;

    public /* synthetic */ C9906(C9904 c9904, int i) {
        this.f25793 = i;
        this.f25792 = c9904;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        String str;
        C9899 extraData;
        int i = this.f25793;
        C6008 c6008 = C6008.f15084;
        C9904 c9904 = this.f25792;
        switch (i) {
            case 0:
                C9898 c9898 = (C9898) obj;
                c9898.getClass();
                c9904.m15210(c9898, true);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                c9904.m15211(str2, true);
                break;
            case 2:
                Message message = (Message) obj;
                message.getClass();
                if (!message.getIsRead()) {
                    c9904.f25775.m11778(message.getId(), new C0851(c9904, 21, message));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(message.getContent());
                sb.append("\n\n");
                int i2 = AbstractC9910.f25800;
                String createdAt = message.getCreatedAt();
                createdAt.getClass();
                String str3 = Instant.parse(createdAt).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                str3.getClass();
                sb.append("时间: ".concat(str3));
                int type = message.getType();
                int i3 = 5;
                if (type == 1) {
                    C9899 extraData2 = message.getExtraData();
                    if (extraData2 != null) {
                        String pluginName = extraData2.getPluginName();
                        sb.append("\n\n脚本名称: ".concat(pluginName != null ? pluginName : "未知"));
                    }
                } else if (type == 2 || type == 3) {
                    C9899 extraData3 = message.getExtraData();
                    if (extraData3 != null) {
                        String pluginName2 = extraData3.getPluginName();
                        sb.append("\n\n脚本名称: ".concat(pluginName2 != null ? pluginName2 : "未知"));
                        String processor = extraData3.getProcessor();
                        if (processor != null) {
                            sb.append("\n处理人: ".concat(processor));
                        }
                        String reason = extraData3.getReason();
                        if (reason != null) {
                            sb.append("\n说明: ".concat(reason));
                        }
                    }
                } else {
                    if (type == 4) {
                        C9899 extraData4 = message.getExtraData();
                        if (extraData4 != null) {
                            String pluginName3 = extraData4.getPluginName();
                            sb.append("\n\n脚本名称: ".concat(pluginName3 != null ? pluginName3 : "未知"));
                            C9900 myComment = extraData4.getMyComment();
                            if (myComment != null) {
                                sb.append("\n\n我的评论:\n" + myComment.getContent());
                            }
                            C9900 replyComment = extraData4.getReplyComment();
                            if (replyComment != null) {
                                String nickname = replyComment.getNickname();
                                str = nickname != null ? nickname : "匿名";
                                sb.append("\n\n" + str + "的回复:\n" + replyComment.getContent());
                            }
                        }
                    } else if (type == 5 && (extraData = message.getExtraData()) != null) {
                        String pluginName4 = extraData.getPluginName();
                        sb.append("\n\n脚本名称: ".concat(pluginName4 != null ? pluginName4 : "未知"));
                        C9900 comment = extraData.getComment();
                        if (comment != null) {
                            String nickname2 = comment.getNickname();
                            str = nickname2 != null ? nickname2 : "匿名";
                            sb.append("\n\n" + str + "评论:\n" + comment.getContent());
                        }
                    }
                }
                C9037.m14288(sb.toString(), message.getTitle()).mo14278("确定", new C6380(i3));
                break;
            case 3:
                Message message2 = (Message) obj;
                message2.getClass();
                String content = message2.getContent();
                Object systemService = c9904.f25777.getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("消息内容", content));
                C9041.m14296("已复制消息内容");
                break;
            case 4:
                C9898 c98982 = (C9898) obj;
                c98982.getClass();
                c9904.m15210(c98982, false);
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                c9904.m15211(str4, false);
                break;
        }
        return c6008;
    }
}
