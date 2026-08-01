package p385;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.activity.compose.C0004;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import kotlin.C5175;
import lin.xposed.hook.javaplugin.view.C5548;
import p052.InterfaceC6557;
import p257.C8207;
import p257.C8211;
import p387.AbstractC9098;
import p388.C9102;
import p388.C9103;
import p388.C9104;
import top.suzhelan.plugin.sdk.online.entity.Message;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9090 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9088 f25397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25398;

    public /* synthetic */ C9090(C9088 c9088, int i) {
        this.f25398 = i;
        this.f25397 = c9088;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        String str;
        C9103 extraData;
        int i = this.f25398;
        C5175 c5175 = C5175.f14739;
        C9088 c9088 = this.f25397;
        switch (i) {
            case 0:
                C9102 c9102 = (C9102) obj;
                c9102.getClass();
                c9088.m14594(c9102, true);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                c9088.m14595(str2, true);
                break;
            case 2:
                Message message = (Message) obj;
                message.getClass();
                if (!message.getIsRead()) {
                    c9088.f25380.m11162(message.getId(), new C0004(c9088, 21, message));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(message.getContent());
                sb.append("\n\n");
                int i2 = AbstractC9098.f25417;
                String createdAt = message.getCreatedAt();
                createdAt.getClass();
                String str3 = Instant.parse(createdAt).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                str3.getClass();
                sb.append("时间: ".concat(str3));
                int type = message.getType();
                int i3 = 5;
                if (type == 1) {
                    C9103 extraData2 = message.getExtraData();
                    if (extraData2 != null) {
                        String pluginName = extraData2.getPluginName();
                        sb.append("\n\n脚本名称: ".concat(pluginName != null ? pluginName : "未知"));
                    }
                } else if (type == 2 || type == 3) {
                    C9103 extraData3 = message.getExtraData();
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
                        C9103 extraData4 = message.getExtraData();
                        if (extraData4 != null) {
                            String pluginName3 = extraData4.getPluginName();
                            sb.append("\n\n脚本名称: ".concat(pluginName3 != null ? pluginName3 : "未知"));
                            C9104 myComment = extraData4.getMyComment();
                            if (myComment != null) {
                                sb.append("\n\n我的评论:\n" + myComment.getContent());
                            }
                            C9104 replyComment = extraData4.getReplyComment();
                            if (replyComment != null) {
                                String nickname = replyComment.getNickname();
                                str = nickname != null ? nickname : "匿名";
                                sb.append("\n\n" + str + "的回复:\n" + replyComment.getContent());
                            }
                        }
                    } else if (type == 5 && (extraData = message.getExtraData()) != null) {
                        String pluginName4 = extraData.getPluginName();
                        sb.append("\n\n脚本名称: ".concat(pluginName4 != null ? pluginName4 : "未知"));
                        C9104 comment = extraData.getComment();
                        if (comment != null) {
                            String nickname2 = comment.getNickname();
                            str = nickname2 != null ? nickname2 : "匿名";
                            sb.append("\n\n" + str + "评论:\n" + comment.getContent());
                        }
                    }
                }
                C8207.m13712(sb.toString(), message.getTitle()).mo13702("确定", new C5548(i3));
                break;
            case 3:
                Message message2 = (Message) obj;
                message2.getClass();
                String content = message2.getContent();
                Object systemService = c9088.f25382.getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("消息内容", content));
                C8211.m13720("已复制消息内容");
                break;
            case 4:
                C9102 c91022 = (C9102) obj;
                c91022.getClass();
                c9088.m14594(c91022, false);
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                c9088.m14595(str4, false);
                break;
        }
        return c5175;
    }
}
