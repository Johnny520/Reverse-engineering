package p038;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.C6316;
import p037.C6356;
import p392.AbstractC9121;
import p392.C9125;
import p394.C9131;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6379 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17518;

    public C6379() {
        "inputTextMethod";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11916() {
        C9131 c9131 = new C9131();
        c9131.f25544.addAll(Arrays.asList("com.tencent.mobileqq.aio.input.sendmsg"));
        c9131.m14699("AIOSendMsgVBDelegate", "handleRecallFailed no toast");
        ArrayList arrayListM14700 = c9131.m14700();
        Class cls = arrayListM14700.isEmpty() ? null : (Class) arrayListM14700.get(0);
        if (cls != null) {
            try {
                C9125 c9125M14680 = C9125.m14680(cls);
                c9125M14680.f25506 = Void.TYPE;
                c9125M14680.m14683(AbstractC9121.m14657("androidx.viewbinding.ViewBinding"));
                return (Method) c9125M14680.m14686();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method methodM11916 = m11916();
        if (methodM11916 != null) {
            final int i = 0;
            m11802(methodM11916, new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲楪兰苏

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6379 f17514;

                {
                    this.f17514 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i2 = i;
                    C6379 c6379 = this.f17514;
                    switch (i2) {
                        case 0:
                            Object obj = methodHookParam.args[0];
                            C9125 c9125M14679 = C9125.m14679(obj);
                            c9125M14679.f25506 = EditText.class;
                            EditText editText = (EditText) c9125M14679.m14682(obj, new Object[0]);
                            C9125 c9125M14680 = C9125.m14680(obj.getClass());
                            c9125M14680.f25506 = View.class;
                            ((View) c9125M14680.m14682(obj, new Object[0])).setOnLongClickListener(new ViewOnLongClickListenerC6380(c6379, editText, 0));
                            break;
                        default:
                            Object obj2 = methodHookParam.thisObject;
                            ((View) AbstractC6317.m11833(obj2.getClass(), Button.class).get(obj2)).setOnLongClickListener(new ViewOnLongClickListenerC6380(c6379, (EditText) AbstractC6317.m11830(EditText.class, obj2), 1));
                            break;
                    }
                }
            });
            return;
        }
        final int i2 = 1;
        m11802(this.f17518, new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6379 f17514;

            {
                this.f17514 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C6379 c6379 = this.f17514;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        C9125 c9125M14679 = C9125.m14679(obj);
                        c9125M14679.f25506 = EditText.class;
                        EditText editText = (EditText) c9125M14679.m14682(obj, new Object[0]);
                        C9125 c9125M14680 = C9125.m14680(obj.getClass());
                        c9125M14680.f25506 = View.class;
                        ((View) c9125M14680.m14682(obj, new Object[0])).setOnLongClickListener(new ViewOnLongClickListenerC6380(c6379, editText, 0));
                        break;
                    default:
                        Object obj2 = methodHookParam.thisObject;
                        ((View) AbstractC6317.m11833(obj2.getClass(), Button.class).get(obj2)).setOnLongClickListener(new ViewOnLongClickListenerC6380(c6379, (EditText) AbstractC6317.m11830(EditText.class, obj2), 1));
                        break;
                }
            }
        });
        C6316 c6316M11825 = C6316.m11825("com.tencent.guild.aio.input.realinput.GuildAioDefaultInputViewBinder");
        c6316M11825.f17409.f3617 = "bindViewAndData";
        XposedBridge.hookMethod(c6316M11825.m11827(), new C6356(this, 8));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u957f\u6309\u53d1\u9001\u4ee5\u53d1\u9001\u8f93\u5165\u6846\u5185\u7684\u5361\u7247";
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        if (m11916() != null) {
            return;
        }
        this.f17518 = c3069.m6902("inputTextMethod");
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        if (m11916() != null) {
            return;
        }
        this.f17518 = C3069.m6899("inputRoot.findViewById(R.id.input)")[0];
        c3069.m6900(this.f17518, "inputTextMethod");
    }
}
