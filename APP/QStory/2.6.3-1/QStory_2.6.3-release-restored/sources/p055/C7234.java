package p055;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.bumptech.glide.C3902;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p043.InterfaceC7146;
import p049.AbstractC7165;
import p049.C7164;
import p054.C7202;
import p405.AbstractC9919;
import p405.C9921;
import p408.C9931;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7234 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17919;

    public C7234() {
        "inputTextMethod";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m12524() {
        C9931 c9931 = new C9931();
        c9931.f25866.addAll(Arrays.asList("com.tencent.mobileqq.aio.input.sendmsg"));
        c9931.m15254("AIOSendMsgVBDelegate", "handleRecallFailed no toast");
        ArrayList arrayListM15256 = c9931.m15256();
        Class cls = arrayListM15256.isEmpty() ? null : (Class) arrayListM15256.get(0);
        if (cls != null) {
            try {
                C9921 c9921M15231 = C9921.m15231(cls);
                c9921M15231.f25828 = Void.TYPE;
                c9921M15231.m15234(AbstractC9919.m15228("androidx.viewbinding.ViewBinding"));
                return (Method) c9921M15231.m15164();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method methodM12524 = m12524();
        if (methodM12524 != null) {
            final int i = 0;
            m12389(methodM12524, new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲楪兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C7234 f17922;

                {
                    this.f17922 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i2 = i;
                    C7234 c7234 = this.f17922;
                    switch (i2) {
                        case 0:
                            Object obj = methodHookParam.args[0];
                            C9921 c9921M15230 = C9921.m15230(obj);
                            c9921M15230.f25828 = EditText.class;
                            EditText editText = (EditText) c9921M15230.m15233(obj, new Object[0]);
                            C9921 c9921M15231 = C9921.m15231(obj.getClass());
                            c9921M15231.f25828 = View.class;
                            ((View) c9921M15231.m15233(obj, new Object[0])).setOnLongClickListener(new ViewOnLongClickListenerC7235(c7234, editText, 0));
                            break;
                        default:
                            Object obj2 = methodHookParam.thisObject;
                            ((View) AbstractC7165.m12420(obj2.getClass(), Button.class).get(obj2)).setOnLongClickListener(new ViewOnLongClickListenerC7235(c7234, (EditText) AbstractC7165.m12417(EditText.class, obj2), 1));
                            break;
                    }
                }
            });
            return;
        }
        final int i2 = 1;
        m12389(this.f17919, new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲楪兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7234 f17922;

            {
                this.f17922 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C7234 c7234 = this.f17922;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        C9921 c9921M15230 = C9921.m15230(obj);
                        c9921M15230.f25828 = EditText.class;
                        EditText editText = (EditText) c9921M15230.m15233(obj, new Object[0]);
                        C9921 c9921M15231 = C9921.m15231(obj.getClass());
                        c9921M15231.f25828 = View.class;
                        ((View) c9921M15231.m15233(obj, new Object[0])).setOnLongClickListener(new ViewOnLongClickListenerC7235(c7234, editText, 0));
                        break;
                    default:
                        Object obj2 = methodHookParam.thisObject;
                        ((View) AbstractC7165.m12420(obj2.getClass(), Button.class).get(obj2)).setOnLongClickListener(new ViewOnLongClickListenerC7235(c7234, (EditText) AbstractC7165.m12417(EditText.class, obj2), 1));
                        break;
                }
            }
        });
        C7164 c7164M12412 = C7164.m12412("com.tencent.guild.aio.input.realinput.GuildAioDefaultInputViewBinder");
        c7164M12412.f17803.f3963 = "bindViewAndData";
        XposedBridge.hookMethod(c7164M12412.m12414(), new C7202(this, 8));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "长按发送以发送输入框内的卡片";
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        if (m12524() != null) {
            return;
        }
        this.f17919 = c3902.m7449("inputTextMethod");
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        if (m12524() != null) {
            return;
        }
        this.f17919 = C3902.m7446("inputRoot.findViewById(R.id.input)")[0];
        c3902.m7447(this.f17919, "inputTextMethod");
    }
}
