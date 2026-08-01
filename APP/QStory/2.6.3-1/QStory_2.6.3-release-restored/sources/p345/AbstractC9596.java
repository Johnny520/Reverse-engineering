package p345;

import androidx.compose.foundation.text.C1822;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.List;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9596 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f25049 = AbstractC7176.m12490(AbstractC3738.m6888("send_msg", "发送文本消息", "发送文本消息。群聊时填 group_uin，私聊时填 user_uin", "content", "发送内容", new C1822(23)), AbstractC3738.m6888("send_pic", "发送图片消息", "发送图片消息，path 为图片路径", "path", "图片文件路径", new C1822(22)), AbstractC3738.m6888("send_card", "发送卡片消息", "发送卡片消息，card_text 为卡片文本", "card_text", "卡片文本内容", new C1822(24)), AbstractC3738.m6888("send_file", "发送文件", "发送文件，path 为本地文件路径", "path", "文件路径", new C1822(20)), new C9592("send_pai", "发送拍一拍", "发送拍一拍。群聊时 group_uin 必填，私聊时留空", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("group_uin", "群号，私聊时可留空"), AbstractC3738.m6892("uin", "目标 QQ 号")), AbstractC7176.m12487("uin")), new C9599(2)), new C9592("send_proto", "发送 Proto 包", "发送 Proto 数据包", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("cmd", "协议命令名"), AbstractC3738.m6892("json_body", "FunProtoData 的 JSON 字符串")), AbstractC7176.m12490("cmd", "json_body")), new C9599(1)), AbstractC3738.m6888("send_voice", "发送语音", "发送语音消息，path 为语音文件路径", "path", "语音文件路径", new C1822(21)), AbstractC3738.m6888("send_video", "发送视频", "发送视频消息，path 为视频文件路径", "path", "视频文件路径", new C1822(25)), new C9592("send_like", "发送点赞", "向指定用户发送点赞，count 默认 20", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("user_uin", "目标 QQ 号"), AbstractC3738.m6863("count", "点赞次数，默认 20")), AbstractC7176.m12487("user_uin")), new C9599(0)));
}
