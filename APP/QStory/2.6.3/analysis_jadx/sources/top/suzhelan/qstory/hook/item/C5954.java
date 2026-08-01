package top.suzhelan.qstory.hook.item;

import android.view.View;
import bsh.C2633;
import com.bumptech.glide.C3070;
import java.lang.reflect.Method;
import java.time.LocalDate;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQNTTroopTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import net.bytebuddy.description.method.MethodDescription;
import p027.InterfaceC6317;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p316.C8667;
import p326.C8742;
import p332.C8785;
import p337.AbstractC8803;
import p389.AbstractC9090;
import p389.C9086;
import p389.C9092;
import p392.C9102;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5817;
import top.suzhelan.qstory.hook.api.C5821;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰世哲;", "L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5954 extends AbstractC8803 implements InterfaceC6317 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m11326(String str, String str2, String str3, String str4) {
        QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin()), m11327(str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m11327(String str, String str2, String str3, String str4) {
        String groupName = QQNTTroopTool.getGroupName(str4);
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1972) + str + '\n');
        sb.append(AbstractC8405.m13972(1973));
        sb.append(str2);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(1136));
        sb.append(str3);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(1974));
        sb.append(groupName);
        sb.append(AbstractC8405.m13973("喵呜喵呜呜喵呜呜"));
        sb.append(str4);
        sb.append(AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
        String string = sb.toString();
        AbstractC8405.m13972(1296);
        return string;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        C8742.f24636.getClass();
        if (AbstractC6358.f17508 > 14200) {
            C2633.m5339(AbstractC8405.m13972(2640));
            return;
        }
        int i = 1;
        if (LocalDate.now().isAfter(LocalDate.of(2026, 7, 1))) {
            C2633.m5339(AbstractC8405.m13972(1066));
            return;
        }
        C5821 c5821 = C5817.f15946;
        C5913 c5913 = new C5913(this, i);
        AbstractC8405.m13972(1562);
        AbstractC8405.m13972(1566);
        C5817.f15943.add(new C5816(this, c5913));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1964);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        C8742.f24636.getClass();
        C9102 c9102 = new C9102();
        c9102.m14695(AbstractC8405.m13972(2642));
        Class clsM14696 = c9102.m14696();
        AbstractC8405.m13972(1549);
        clsM14696.getClass();
        C8742.m14438();
        String strM13972 = AbstractC8405.m13972(1097);
        int i = C9086.f25468;
        C9086 c9086M14662 = C9086.m14662(AbstractC9090.m14669(strM13972));
        c9086M14662.f25470 = AbstractC8405.m13972(435);
        C9092 c9092M14672 = C9092.m14672(c9086M14662.m14665(null).getClass());
        c9092M14672.f25481 = AbstractC8405.m13972(1098);
        c9092M14672.m14675(String.class, String.class, C8667.class, C8667.class, C8667.class, C8667.class);
        Class<?> cls = ((Method) c9092M14672.m14605()).getParameterTypes()[r6.getParameterTypes().length - 1];
        AbstractC8405.m13972(1548);
        cls.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11328(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5954.m11328(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11329(java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5954.m11329(java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC5533(9);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵");
        return c8785.f24740.intValue() >= 1;
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
    }
}
