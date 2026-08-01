package p345;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.List;
import p050.AbstractC7176;
import top.suzhelan.qstory.p015ui.components.C6797;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9586 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f25027;

    static {
        byte b = 0;
        f25027 = AbstractC7176.m12490(new C9592("read_file_text", "读取文本文件", "读取指定文本文件内容", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("path", "文件路径")), AbstractC7176.m12487("path")), new C6797(b, 16)), new C9592("write_text_to_file", "覆盖写入文本文件", "覆盖写入文本文件", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("path", "文件路径"), AbstractC3738.m6892("text", "写入内容")), AbstractC7176.m12490("path", "text")), new C6797(b, 18)), new C9592("write_text_append_to_file", "追加写入文本文件", "向文本文件追加内容", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("path", "文件路径"), AbstractC3738.m6892("text", "写入内容")), AbstractC7176.m12490("path", "text")), new C6797(b, 15)), new C9592("read_file_bytes", "读取二进制文件", "读取二进制文件并返回 Base64 字符串", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("path", "文件路径")), AbstractC7176.m12487("path")), new C6797(b, 14)), new C9592("write_bytes_to_file", "写入二进制文件", "将 Base64 内容写入二进制文件", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("path", "文件路径"), AbstractC3738.m6892("bytes_base64", "Base64 编码后的文件内容")), AbstractC7176.m12490("path", "bytes_base64")), new C6797(b, 19)), new C9592("scan_image_text", "图片 OCR 文本识别", "识别图片中的文本内容", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("path", "图片路径")), AbstractC7176.m12487("path")), new C6797(b, 21)), new C9592("scan_image_text_detail", "图片 OCR 详细识别", "识别图片中的详细文本结构", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("path", "图片路径")), AbstractC7176.m12487("path")), new C6797(b, 20)), new C9592("get_new_friend_info", "获取单个好友信息(新接口)", "读取单个好友的详细信息", AbstractC3738.m6844(AbstractC7176.m12487(AbstractC3738.m6892("uin", "好友 QQ 号")), AbstractC7176.m12487("uin")), new C6797(b, 13)), new C9592("get_message_list", "获取本地消息列表", "读取本地消息列表。群聊时传 group_uin，私聊时传 user_uin", AbstractC3738.m6897(2, AbstractC7176.m12490(AbstractC3738.m6892("group_uin", "群号，私聊时可留空"), AbstractC3738.m6892("user_uin", "好友 QQ 号，群聊时可留空"), AbstractC3738.m6863("count", "返回数量，默认 20"))), new C6797((byte) 0, 17)));
    }
}
