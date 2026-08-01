package p325;

import com.bumptech.glide.AbstractC3056;
import java.util.List;
import p253.AbstractC8189;
import top.suzhelan.qstory.ui.components.C5961;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f24657;

    static {
        byte b = 0;
        f24657 = AbstractC8189.m13659(new C8755("read_file_text", "\u8bfb\u53d6\u6587\u672c\u6587\u4ef6", "\u8bfb\u53d6\u6307\u5b9a\u6587\u672c\u6587\u4ef6\u5185\u5bb9", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("path", "\u6587\u4ef6\u8def\u5f84")), AbstractC8189.m13660("path")), new C5961(b, 16)), new C8755("write_text_to_file", "\u8986\u76d6\u5199\u5165\u6587\u672c\u6587\u4ef6", "\u8986\u76d6\u5199\u5165\u6587\u672c\u6587\u4ef6", AbstractC3056.m6659(AbstractC8189.m13659(AbstractC3056.m6700("path", "\u6587\u4ef6\u8def\u5f84"), AbstractC3056.m6700("text", "\u5199\u5165\u5185\u5bb9")), AbstractC8189.m13659("path", "text")), new C5961(b, 18)), new C8755("write_text_append_to_file", "\u8ffd\u52a0\u5199\u5165\u6587\u672c\u6587\u4ef6", "\u5411\u6587\u672c\u6587\u4ef6\u8ffd\u52a0\u5185\u5bb9", AbstractC3056.m6659(AbstractC8189.m13659(AbstractC3056.m6700("path", "\u6587\u4ef6\u8def\u5f84"), AbstractC3056.m6700("text", "\u5199\u5165\u5185\u5bb9")), AbstractC8189.m13659("path", "text")), new C5961(b, 15)), new C8755("read_file_bytes", "\u8bfb\u53d6\u4e8c\u8fdb\u5236\u6587\u4ef6", "\u8bfb\u53d6\u4e8c\u8fdb\u5236\u6587\u4ef6\u5e76\u8fd4\u56de Base64 \u5b57\u7b26\u4e32", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("path", "\u6587\u4ef6\u8def\u5f84")), AbstractC8189.m13660("path")), new C5961(b, 14)), new C8755("write_bytes_to_file", "\u5199\u5165\u4e8c\u8fdb\u5236\u6587\u4ef6", "\u5c06 Base64 \u5185\u5bb9\u5199\u5165\u4e8c\u8fdb\u5236\u6587\u4ef6", AbstractC3056.m6659(AbstractC8189.m13659(AbstractC3056.m6700("path", "\u6587\u4ef6\u8def\u5f84"), AbstractC3056.m6700("bytes_base64", "Base64 \u7f16\u7801\u540e\u7684\u6587\u4ef6\u5185\u5bb9")), AbstractC8189.m13659("path", "bytes_base64")), new C5961(b, 19)), new C8755("scan_image_text", "\u56fe\u7247 OCR \u6587\u672c\u8bc6\u522b", "\u8bc6\u522b\u56fe\u7247\u4e2d\u7684\u6587\u672c\u5185\u5bb9", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("path", "\u56fe\u7247\u8def\u5f84")), AbstractC8189.m13660("path")), new C5961(b, 21)), new C8755("scan_image_text_detail", "\u56fe\u7247 OCR \u8be6\u7ec6\u8bc6\u522b", "\u8bc6\u522b\u56fe\u7247\u4e2d\u7684\u8be6\u7ec6\u6587\u672c\u7ed3\u6784", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("path", "\u56fe\u7247\u8def\u5f84")), AbstractC8189.m13660("path")), new C5961(b, 20)), new C8755("get_new_friend_info", "\u83b7\u53d6\u5355\u4e2a\u597d\u53cb\u4fe1\u606f(\u65b0\u63a5\u53e3)", "\u8bfb\u53d6\u5355\u4e2a\u597d\u53cb\u7684\u8be6\u7ec6\u4fe1\u606f", AbstractC3056.m6659(AbstractC8189.m13660(AbstractC3056.m6700("uin", "\u597d\u53cb QQ \u53f7")), AbstractC8189.m13660("uin")), new C5961(b, 13)), new C8755("get_message_list", "\u83b7\u53d6\u672c\u5730\u6d88\u606f\u5217\u8868", "\u8bfb\u53d6\u672c\u5730\u6d88\u606f\u5217\u8868\u3002\u7fa4\u804a\u65f6\u4f20 group_uin\uff0c\u79c1\u804a\u65f6\u4f20 user_uin", AbstractC3056.m6655(2, AbstractC8189.m13659(AbstractC3056.m6700("group_uin", "\u7fa4\u53f7\uff0c\u79c1\u804a\u65f6\u53ef\u7559\u7a7a"), AbstractC3056.m6700("user_uin", "\u597d\u53cb QQ \u53f7\uff0c\u7fa4\u804a\u65f6\u53ef\u7559\u7a7a"), AbstractC3056.m6664("count", "\u8fd4\u56de\u6570\u91cf\uff0c\u9ed8\u8ba4 20"))), new C5961(b, 17)));
    }
}
