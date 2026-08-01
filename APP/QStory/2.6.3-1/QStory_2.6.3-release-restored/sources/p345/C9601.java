package p345;

import androidx.compose.foundation.lazy.C1597;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p026.AbstractC7017;
import p049.AbstractC7166;
import p049.C7164;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p105.C8009;
import p336.AbstractC9513;
import p336.C9514;
import p336.C9515;
import p341.C9569;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9601 implements InterfaceC9598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7981 f25057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f25058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f25060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9601 f25061;

    static {
        "会话类型，必填，可选 friend 或 group";
        "目标好友 QQ号(uin) 或群号，必填";
        "返回指定会话的消息数量，默认 20,最大无限制";
        "参数错误: 当前仅支持按 chat_type(friend/group) + target_uin 查询指定会话历史消息";
        f25061 = new C9601();
        f25060 = "get_chat_list";
        f25059 = "获取指定会话聊天记录";
        f25058 = "按 chat_type 与 target_uin 实时读取指定好友/群聊的最近消息，排序为由旧到新";
        f25057 = AbstractC9594.m15026(new C8009(17));
    }

    @Override // p345.InterfaceC9598
    public final String getId() {
        return f25060;
    }

    @Override // p345.InterfaceC9598
    public final String getTitle() {
        return f25059;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo15010(C7981 c7981, AbstractC8005 abstractC8005) {
        String lowerCase;
        C9515 c9515;
        C7986 c7986M15025;
        C7981 c79812;
        C7981 c7981M15013 = AbstractC9594.m15013("arguments", c7981);
        if (c7981M15013 == null) {
            c7981M15013 = AbstractC9594.m15018();
        }
        String strM15021 = AbstractC9594.m15021("chat_type", c7981M15013);
        String strM14532 = null;
        String string = strM15021 != null ? AbstractC5976.m10714(strM15021).toString() : null;
        String strM150212 = AbstractC9594.m15021("target_uin", c7981M15013);
        String string2 = strM150212 != null ? AbstractC5976.m10714(strM150212).toString() : null;
        Integer num = new Integer(AbstractC9594.m15014("message_limit", c7981M15013));
        if (num.intValue() <= 0) {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 20;
        if (string == null || AbstractC5976.m10731(string) || string2 == null || AbstractC5976.m10731(string2)) {
            return AbstractC3738.m6891("参数错误: 当前仅支持按 chat_type(friend/group) + target_uin 查询指定会话历史消息", abstractC8005, true);
        }
        C9569 c9569 = C9569.f24978;
        "chatType";
        "targetUin";
        C9569.f24978.getClass();
        String string3 = AbstractC5976.m10714(string).toString();
        if (string3 != null) {
            lowerCase = string3.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (AbstractC5227.m9466(lowerCase, "friend")) {
            strM14532 = "friend";
        } else if (AbstractC5227.m9466(lowerCase, "group")) {
            strM14532 = "group";
        }
        if (strM14532 == null) {
            c79812 = AbstractC9594.m15018();
        } else {
            String string4 = AbstractC5976.m10714(string2).toString();
            if (AbstractC5976.m10731(string4)) {
                c79812 = AbstractC9594.m15018();
            } else {
                char c = strM14532.equals("group") ? (char) 2 : (char) 1;
                "peerUid";
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C9514 c9514 = new C9514(ref$ObjectRef, countDownLatch, 0);
                "peerUid";
                "callback";
                try {
                    Object objM14964 = AbstractC9513.m14964();
                    if (objM14964 == null) {
                        c9514.m14967(-1, "获取 MsgService 失败", new ArrayList());
                    } else {
                        Object friendContact = c == 1 ? QQSessionUtils.QQNT.getFriendContact(string4) : QQSessionUtils.QQNT.getGroupContact(string4);
                        friendContact.getClass();
                        Object objM14965 = AbstractC9513.m14965(iIntValue, friendContact);
                        Object objM14966 = AbstractC9513.m14966(c9514);
                        C7164 c7164M12413 = C7164.m12413(objM14964.getClass());
                        c7164M12413.f17803.f3963 = "getMsgsExt";
                        c7164M12413.f17803.f3964 = new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.MsgsReq"), AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IMsgsRspOperateCallback")};
                        c7164M12413.m12415(objM14964, objM14965, objM14966);
                    }
                } catch (Exception e) {
                    String str = "getMsgs error: " + e.getMessage();
                    String str2 = AbstractC7017.f17361;
                    AbstractC7017.m12164(str, e.toString(), e, true);
                    c9514.m14967(-1, "获取消息失败: " + e.getMessage(), new ArrayList());
                }
                try {
                    if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                        c9515 = (C9515) ref$ObjectRef.element;
                        if (c9515 == null) {
                            c9515 = new C9515(-1, "获取消息失败: 结果为空", new ArrayList());
                        }
                    } else {
                        String strConcat = "getMsgsSync timeout: ".concat(string4);
                        RuntimeException runtimeException = new RuntimeException("Timeout");
                        String str3 = AbstractC7017.f17361;
                        AbstractC7017.m12164(strConcat, runtimeException.toString(), runtimeException, true);
                        c9515 = new C9515(-2, "获取消息超时", new ArrayList());
                    }
                } catch (InterruptedException e2) {
                    String str4 = "getMsgsSync interrupted: " + e2.getMessage();
                    String str5 = AbstractC7017.f17361;
                    AbstractC7017.m12164(str4, e2.toString(), e2, true);
                    Thread.currentThread().interrupt();
                    c9515 = new C9515(-3, "获取消息被中断", new ArrayList());
                }
                int i = c9515.f24841;
                if (i != 0) {
                    AbstractC7017.m12163("getMsgsSync failed: chatType=" + strM14532 + " targetUin=" + string4 + " result=" + i + " err=" + c9515.f24840, "McpMsgService");
                    "block";
                    C9603 c9603 = new C9603();
                    "$this$jsonArray";
                    c7986M15025 = new C7986(c9603.f25063);
                } else {
                    c7986M15025 = AbstractC9594.m15025(new C1597(c9515, strM14532, string4, 9));
                }
                "block";
                C9595 c9595 = new C9595();
                "$this$jsonObject";
                c9595.m15027(Integer.valueOf(c7986M15025.f19469.size()), "message_count");
                c9595.m15027(c7986M15025, "messages");
                c79812 = new C7981(c9595.f25048);
            }
        }
        return AbstractC3738.m6891(AbstractC9594.m15023(c79812), abstractC8005, false);
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7981 mo15011() {
        return f25057;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo15012() {
        return f25058;
    }
}
