package top.suzhelan.qstory.hook.item.chat;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p405.C9921;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6660 extends AbstractC7140 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m11800(char c) {
        if ('A' <= c && c < '[') {
            return true;
        }
        if ('a' > c || c >= '{') {
            return '0' <= c && c < ':';
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m11801(char c) {
        return c >= 0 && c < 'z' && !m11800(c);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        "classLoader";
        classLoader.getClass();
        C9921 c9921M15232 = C9921.m15232("com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy");
        c9921M15232.f25826 = "sendMsg";
        c9921M15232.m15234(Long.TYPE, classLoader.loadClass("com.tencent.qqnt.kernel.nativeinterface.Contact"), ArrayList.class, HashMap.class, classLoader.loadClass("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback"));
        Member memberM15164 = c9921M15232.m15164();
        "first(...)";
        memberM15164.getClass();
        m12390((Method) memberM15164, new C6699(this, 10));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "发送消息重新格式化排版，在英文单词数字与中文之间用空格隔开，让消息更加美观";
    }
}
