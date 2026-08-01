package p345;

import com.alibaba.fastjson2.AbstractC3738;
import java.util.List;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9597 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f25050 = AbstractC7176.m12490(new C9592("http_get", "HTTP GET 请求", "发起 HTTP GET 请求，支持可选请求头", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("url", "请求地址"), AbstractC3738.m6843("headers", "请求头，键值都按字符串处理")), AbstractC7176.m12487("url")), new C9599(5)), new C9592("http_post", "HTTP POST 表单请求", "发起 HTTP POST 表单请求，data 必填，headers 可选", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("url", "请求地址"), AbstractC3738.m6843("data", "表单数据，键值都按字符串处理"), AbstractC3738.m6843("headers", "请求头，键值都按字符串处理")), AbstractC7176.m12490("url", "data")), new C9599(3)), new C9592("http_post_json", "HTTP POST JSON 请求", "发起 HTTP POST JSON 请求，json_body 必填，headers 可选", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("url", "请求地址"), AbstractC3738.m6892("json_body", "JSON 字符串"), AbstractC3738.m6843("headers", "请求头，键值都按字符串处理")), AbstractC7176.m12490("url", "json_body")), new C9599(6)), new C9592("http_download", "HTTP 下载文件", "下载远程文件到指定路径", AbstractC3738.m6844(AbstractC7176.m12490(AbstractC3738.m6892("url", "下载地址"), AbstractC3738.m6892("path", "保存路径"), AbstractC3738.m6843("headers", "请求头，键值都按字符串处理")), AbstractC7176.m12490("url", "path")), new C9599(4)));
}
