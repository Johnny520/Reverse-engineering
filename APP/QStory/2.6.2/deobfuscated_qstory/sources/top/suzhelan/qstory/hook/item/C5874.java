package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p035.AbstractC6340;
import p038.C6411;
import p316.C8675;
import top.suzhelan.qstory.hook.api.C5817;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5874 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashSet f16047 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f16048 = 682529568;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        "classLoader";
        classLoader.getClass();
        Class<?> clsLoadClass = classLoader.loadClass("com.tencent.qqnt.kernel.nativeinterface.MsgRecord");
        final int i = 1;
        if (AbstractC6340.f17461 >= 5626) {
            final int i2 = 0;
            m11802(classLoader.loadClass("com.tencent.mobileqq.aio.msg.AIOMsgItem").getDeclaredMethod("getMsgRecord", null), new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰苏楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C5874 f16051;

                {
                    this.f16051 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i3 = i2;
                    Class cls = Long.TYPE;
                    C5874 c5874 = this.f16051;
                    switch (i3) {
                        case 0:
                            Object result = methodHookParam.getResult();
                            Integer num = (Integer) AbstractC6317.m11831(Integer.TYPE, "subMsgType", result);
                            if (num != null && num.intValue() == 8194) {
                                AbstractC6317.m11837(result, "subMsgType", 2);
                                c5874.f16047.add((Long) AbstractC6317.m11831(cls, "msgId", result));
                            }
                            break;
                        default:
                            Object result2 = methodHookParam.getResult();
                            "null cannot be cast to non-null type kotlin.Int";
                            result2.getClass();
                            if (((Integer) result2).intValue() == 8194) {
                                methodHookParam.setResult(2);
                                c5874.f16047.add((Long) AbstractC6317.m11831(cls, "msgId", methodHookParam.thisObject));
                            }
                            break;
                    }
                }
            });
        } else {
            m11802(clsLoadClass.getDeclaredMethod("getSubMsgType", null), new InterfaceC6294(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰苏楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C5874 f16051;

                {
                    this.f16051 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i3 = i;
                    Class cls = Long.TYPE;
                    C5874 c5874 = this.f16051;
                    switch (i3) {
                        case 0:
                            Object result = methodHookParam.getResult();
                            Integer num = (Integer) AbstractC6317.m11831(Integer.TYPE, "subMsgType", result);
                            if (num != null && num.intValue() == 8194) {
                                AbstractC6317.m11837(result, "subMsgType", 2);
                                c5874.f16047.add((Long) AbstractC6317.m11831(cls, "msgId", result));
                            }
                            break;
                        default:
                            Object result2 = methodHookParam.getResult();
                            "null cannot be cast to non-null type kotlin.Int";
                            result2.getClass();
                            if (((Integer) result2).intValue() == 8194) {
                                methodHookParam.setResult(2);
                                c5874.f16047.add((Long) AbstractC6317.m11831(cls, "msgId", methodHookParam.thisObject));
                            }
                            break;
                    }
                }
            });
        }
        HashMap map = C5817.f15949;
        C8675.m14351(this, new C6411(this, i));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u9002\u914dQQNT,\u5f00\u542f\u540e\u4f1a\u5bfc\u81f4\u804a\u5929\u754c\u9762\u4e25\u91cd\u6389\u5e27";
    }
}
