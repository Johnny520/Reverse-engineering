package p325;

import androidx.compose.foundation.lazy.C0756;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p032.AbstractC6318;
import p032.C6316;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import p089.C7179;
import p326.C8769;
import p350.AbstractC8866;
import p350.C8867;
import p350.C8868;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8764 implements InterfaceC8761 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7151 f24687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8764 f24691;

    static {
        "\u4f1a\u8bdd\u7c7b\u578b\uff0c\u5fc5\u586b\uff0c\u53ef\u9009 friend \u6216 group";
        "\u76ee\u6807\u597d\u53cb QQ\u53f7(uin) \u6216\u7fa4\u53f7\uff0c\u5fc5\u586b";
        "\u8fd4\u56de\u6307\u5b9a\u4f1a\u8bdd\u7684\u6d88\u606f\u6570\u91cf\uff0c\u9ed8\u8ba4 20,\u6700\u5927\u65e0\u9650\u5236";
        "\u53c2\u6570\u9519\u8bef: \u5f53\u524d\u4ec5\u652f\u6301\u6309 chat_type(friend/group) + target_uin \u67e5\u8be2\u6307\u5b9a\u4f1a\u8bdd\u5386\u53f2\u6d88\u606f";
        f24691 = new C8764();
        f24690 = "get_chat_list";
        f24689 = "\u83b7\u53d6\u6307\u5b9a\u4f1a\u8bdd\u804a\u5929\u8bb0\u5f55";
        f24688 = "\u6309 chat_type \u4e0e target_uin \u5b9e\u65f6\u8bfb\u53d6\u6307\u5b9a\u597d\u53cb/\u7fa4\u804a\u7684\u6700\u8fd1\u6d88\u606f\uff0c\u6392\u5e8f\u4e3a\u7531\u65e7\u5230\u65b0";
        f24687 = AbstractC8757.m14433(new C7179(17));
    }

    @Override // p325.InterfaceC8761
    public final String getId() {
        return f24690;
    }

    @Override // p325.InterfaceC8761
    public final String getTitle() {
        return f24689;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14417(C7151 c7151, AbstractC7175 abstractC7175) {
        C8868 c8868;
        C7156 c7156M14432;
        C7151 c71512;
        C7151 c7151M14420 = AbstractC8757.m14420(c7151, "arguments");
        if (c7151M14420 == null) {
            c7151M14420 = AbstractC8757.m14425();
        }
        String strM14428 = AbstractC8757.m14428(c7151M14420, "chat_type");
        String strM6668 = null;
        String string = strM14428 != null ? AbstractC5143.m10150(strM14428).toString() : null;
        String strM144282 = AbstractC8757.m14428(c7151M14420, "target_uin");
        String string2 = strM144282 != null ? AbstractC5143.m10150(strM144282).toString() : null;
        Integer num = new Integer(AbstractC8757.m14421(c7151M14420, "message_limit"));
        if (num.intValue() <= 0) {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 20;
        if (string == null || AbstractC5143.m10164(string) || string2 == null || AbstractC5143.m10164(string2)) {
            return AbstractC3056.m6699("\u53c2\u6570\u9519\u8bef: \u5f53\u524d\u4ec5\u652f\u6301\u6309 chat_type(friend/group) + target_uin \u67e5\u8be2\u6307\u5b9a\u4f1a\u8bdd\u5386\u53f2\u6d88\u606f", abstractC7175, true);
        }
        C8769 c8769 = C8769.f24705;
        "chatType";
        "targetUin";
        C8769.f24705.getClass();
        String string3 = AbstractC5143.m10150(string).toString();
        String strM4563 = string3 != null ? AbstractC2442.m4563(string3, Locale.ROOT, -3937688152349869479L) : null;
        if (AbstractC4394.m8917(strM4563, "friend")) {
            strM6668 = "friend";
        } else if (AbstractC4394.m8917(strM4563, "group")) {
            strM6668 = "group";
        }
        int i = 0;
        if (strM6668 == null) {
            c71512 = AbstractC8757.m14425();
        } else {
            String string4 = AbstractC5143.m10150(string2).toString();
            if (AbstractC5143.m10164(string4)) {
                c71512 = AbstractC8757.m14425();
            } else {
                char c = strM6668.equals("group") ? (char) 2 : (char) 1;
                "peerUid";
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C8867 c8867 = new C8867(ref$ObjectRef, countDownLatch, i);
                "peerUid";
                "callback";
                try {
                    Object objM14512 = AbstractC8866.m14512();
                    if (objM14512 == null) {
                        c8867.m14515(-1, "\u83b7\u53d6 MsgService \u5931\u8d25", new ArrayList());
                    } else {
                        Object friendContact = c == 1 ? QQSessionUtils.QQNT.getFriendContact(string4) : QQSessionUtils.QQNT.getGroupContact(string4);
                        friendContact.getClass();
                        Object objM14513 = AbstractC8866.m14513(iIntValue, friendContact);
                        Object objM14514 = AbstractC8866.m14514(c8867);
                        C6316 c6316M11826 = C6316.m11826(objM14512.getClass());
                        c6316M11826.f17409.f3617 = "getMsgsExt";
                        c6316M11826.f17409.f3618 = new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.MsgsReq"), AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IMsgsRspOperateCallback")};
                        c6316M11826.m11828(objM14512, objM14513, objM14514);
                    }
                } catch (Exception e) {
                    String str = "getMsgs error: " + e.getMessage();
                    String str2 = AbstractC6157.f16779;
                    AbstractC6157.m11574(str, e.toString(), e, true);
                    c8867.m14515(-1, "\u83b7\u53d6\u6d88\u606f\u5931\u8d25: " + e.getMessage(), new ArrayList());
                }
                try {
                    if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                        c8868 = (C8868) ref$ObjectRef.element;
                        if (c8868 == null) {
                            c8868 = new C8868(-1, "\u83b7\u53d6\u6d88\u606f\u5931\u8d25: \u7ed3\u679c\u4e3a\u7a7a", new ArrayList());
                        }
                    } else {
                        String strConcat = "getMsgsSync timeout: ".concat(string4);
                        RuntimeException runtimeException = new RuntimeException("Timeout");
                        String str3 = AbstractC6157.f16779;
                        AbstractC6157.m11574(strConcat, runtimeException.toString(), runtimeException, true);
                        c8868 = new C8868(-2, "\u83b7\u53d6\u6d88\u606f\u8d85\u65f6", new ArrayList());
                    }
                } catch (InterruptedException e2) {
                    String str4 = "getMsgsSync interrupted: " + e2.getMessage();
                    String str5 = AbstractC6157.f16779;
                    AbstractC6157.m11574(str4, e2.toString(), e2, true);
                    Thread.currentThread().interrupt();
                    c8868 = new C8868(-3, "\u83b7\u53d6\u6d88\u606f\u88ab\u4e2d\u65ad", new ArrayList());
                }
                int i2 = c8868.f24982;
                if (i2 != 0) {
                    String strM66682 = "McpMsgService";
                    StringBuilder sb = new StringBuilder();
                    AbstractC6136.m11544(-3937824736604849575L, sb, strM6668);
                    AbstractC6136.m11544(-3937824556216223143L, sb, string4);
                    sb.append(" result=");
                    sb.append(i2);
                    sb.append(" err=");
                    sb.append(c8868.f24981);
                    AbstractC6157.m11573(sb.toString(), strM66682);
                    "block";
                    C8766 c8766 = new C8766();
                    "$this$jsonArray";
                    c7156M14432 = new C7156(c8766.f24693);
                } else {
                    c7156M14432 = AbstractC8757.m14432(new C0756(c8868, strM6668, string4, 9));
                }
                "block";
                C8758 c8758 = new C8758();
                "$this$jsonObject";
                c8758.m14434(Integer.valueOf(c7156M14432.f19129.size()), "message_count");
                c8758.m14434(c7156M14432, "messages");
                c71512 = new C7151(c8758.f24678);
            }
        }
        return AbstractC3056.m6699(AbstractC8757.m14430(c71512), abstractC7175, false);
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7151 mo14418() {
        return f24687;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14419() {
        return f24688;
    }
}
