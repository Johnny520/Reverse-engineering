package p386;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.activity.compose.C0004;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import kotlin.C5176;
import lin.xposed.hook.javaplugin.view.C5549;
import p052.InterfaceC6558;
import p257.C8208;
import p257.C8212;
import p385.C9069;
import p385.C9070;
import p385.C9071;
import p387.AbstractC9081;
import top.suzhelan.plugin.sdk.online.entity.Message;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9077 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9075 f25447;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25448;

    public /* synthetic */ C9077(C9075 c9075, int i) {
        this.f25448 = i;
        this.f25447 = c9075;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        String str;
        C9070 extraData;
        int i = this.f25448;
        C5176 c5176 = C5176.f14739;
        C9075 c9075 = this.f25447;
        switch (i) {
            case 0:
                C9069 c9069 = (C9069) obj;
                c9069.getClass();
                c9075.m14651(c9069, true);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                c9075.m14652(str2, true);
                break;
            case 2:
                Message message = (Message) obj;
                message.getClass();
                if (!message.getIsRead()) {
                    c9075.f25430.m11219(message.getId(), new C0004(c9075, 21, message));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(message.getContent());
                sb.append("\n\n");
                int i2 = AbstractC9081.f25455;
                String createdAt = message.getCreatedAt();
                createdAt.getClass();
                String str3 = Instant.parse(createdAt).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                str3.getClass();
                sb.append("时间: ".concat(str3));
                int type = message.getType();
                int i3 = 5;
                if (type == 1) {
                    C9070 extraData2 = message.getExtraData();
                    if (extraData2 != null) {
                        String pluginName = extraData2.getPluginName();
                        sb.append("\n\n脚本名称: ".concat(pluginName != null ? pluginName : "未知"));
                    }
                } else if (type == 2 || type == 3) {
                    C9070 extraData3 = message.getExtraData();
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
                        C9070 extraData4 = message.getExtraData();
                        if (extraData4 != null) {
                            String pluginName3 = extraData4.getPluginName();
                            sb.append("\n\n脚本名称: ".concat(pluginName3 != null ? pluginName3 : "未知"));
                            C9071 myComment = extraData4.getMyComment();
                            if (myComment != null) {
                                sb.append("\n\n我的评论:\n" + myComment.getContent());
                            }
                            C9071 replyComment = extraData4.getReplyComment();
                            if (replyComment != null) {
                                String nickname = replyComment.getNickname();
                                str = nickname != null ? nickname : "匿名";
                                sb.append("\n\n" + str + "的回复:\n" + replyComment.getContent());
                            }
                        }
                    } else if (type == 5 && (extraData = message.getExtraData()) != null) {
                        String pluginName4 = extraData.getPluginName();
                        sb.append("\n\n脚本名称: ".concat(pluginName4 != null ? pluginName4 : "未知"));
                        C9071 comment = extraData.getComment();
                        if (comment != null) {
                            String nickname2 = comment.getNickname();
                            str = nickname2 != null ? nickname2 : "匿名";
                            sb.append("\n\n" + str + "评论:\n" + comment.getContent());
                        }
                    }
                }
                C8208.m13729(sb.toString(), message.getTitle()).mo13719("确定", new C5549(i3));
                break;
            case 3:
                Message message2 = (Message) obj;
                message2.getClass();
                String content = message2.getContent();
                Object systemService = c9075.f25432.getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("消息内容", content));
                C8212.m13737("已复制消息内容");
                break;
            case 4:
                C9069 c90692 = (C9069) obj;
                c90692.getClass();
                c9075.m14651(c90692, false);
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                c9075.m14652(str4, false);
                break;
        }
        return c5176;
    }
}
