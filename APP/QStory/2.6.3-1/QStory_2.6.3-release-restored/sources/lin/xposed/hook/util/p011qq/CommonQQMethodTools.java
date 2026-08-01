package lin.xposed.hook.util.p011qq;

import android.os.Bundle;
import androidx.compose.runtime.internal.C2080;
import java.lang.reflect.Method;
import java.util.List;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CommonQQMethodTools {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LegacyQQ {
        public static Class<?> getMessageClass() {
            return AbstractC7166.m12425("com.tencent.imcore.message.Message");
        }

        public static Class<?> getMessageRecordClass() {
            return AbstractC7166.m12425("com.tencent.mobileqq.data.MessageRecord");
        }
    }

    public static Class<?> getAIOContactClass() {
        return AbstractC7166.m12425("com.tencent.aio.data.AIOContact");
    }

    public static Class<?> getAIOMsgItemClass() {
        return AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem");
    }

    public static Class<?> getMsgRecordClass() {
        return AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.MsgRecord");
    }

    public static Method getQQNTAIOMsgItemViewMethod() {
        C7164 c7164M12412 = C7164.m12412("com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB");
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        return c7164M12412.m12414();
    }
}
