package p039;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.bumptech.glide.C3070;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p027.InterfaceC6317;
import p033.AbstractC6336;
import p033.C6335;
import p038.C6373;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9092;
import p392.C9102;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6405 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17574;

    public C6405() {
        AbstractC8405.m13972(233);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11965() {
        C9102 c9102 = new C9102();
        c9102.f25521.addAll(Arrays.asList(AbstractC8405.m13972(237)));
        c9102.m14695(AbstractC8405.m13972(238), AbstractC8405.m13972(239));
        ArrayList arrayListM14697 = c9102.m14697();
        Class cls = arrayListM14697.isEmpty() ? null : (Class) arrayListM14697.get(0);
        if (cls != null) {
            try {
                C9092 c9092M14672 = C9092.m14672(cls);
                c9092M14672.f25483 = Void.TYPE;
                c9092M14672.m14675(AbstractC9090.m14669(AbstractC8405.m13972(240)));
                return (Method) c9092M14672.m14605();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method methodM11965 = m11965();
        if (methodM11965 != null) {
            final int i = 0;
            m11830(methodM11965, new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲楪兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6405 f17577;

                {
                    this.f17577 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i2 = i;
                    C6405 c6405 = this.f17577;
                    switch (i2) {
                        case 0:
                            Object obj = methodHookParam.args[0];
                            C9092 c9092M14671 = C9092.m14671(obj);
                            c9092M14671.f25483 = EditText.class;
                            EditText editText = (EditText) c9092M14671.m14674(obj, new Object[0]);
                            C9092 c9092M14672 = C9092.m14672(obj.getClass());
                            c9092M14672.f25483 = View.class;
                            ((View) c9092M14672.m14674(obj, new Object[0])).setOnLongClickListener(new ViewOnLongClickListenerC6406(c6405, editText, 0));
                            break;
                        default:
                            Object obj2 = methodHookParam.thisObject;
                            ((View) AbstractC6336.m11861(obj2.getClass(), Button.class).get(obj2)).setOnLongClickListener(new ViewOnLongClickListenerC6406(c6405, (EditText) AbstractC6336.m11858(EditText.class, obj2), 1));
                            break;
                    }
                }
            });
            return;
        }
        final int i2 = 1;
        m11830(this.f17574, new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲楪兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6405 f17577;

            {
                this.f17577 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C6405 c6405 = this.f17577;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        C9092 c9092M14671 = C9092.m14671(obj);
                        c9092M14671.f25483 = EditText.class;
                        EditText editText = (EditText) c9092M14671.m14674(obj, new Object[0]);
                        C9092 c9092M14672 = C9092.m14672(obj.getClass());
                        c9092M14672.f25483 = View.class;
                        ((View) c9092M14672.m14674(obj, new Object[0])).setOnLongClickListener(new ViewOnLongClickListenerC6406(c6405, editText, 0));
                        break;
                    default:
                        Object obj2 = methodHookParam.thisObject;
                        ((View) AbstractC6336.m11861(obj2.getClass(), Button.class).get(obj2)).setOnLongClickListener(new ViewOnLongClickListenerC6406(c6405, (EditText) AbstractC6336.m11858(EditText.class, obj2), 1));
                        break;
                }
            }
        });
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(235));
        c6335M11853.f17458.f3618 = AbstractC8405.m13972(236);
        XposedBridge.hookMethod(c6335M11853.m11855(), new C6373(this, 8));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(234);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        if (m11965() != null) {
            return;
        }
        this.f17574 = c3070.m6889(AbstractC8405.m13972(233));
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        if (m11965() != null) {
            return;
        }
        this.f17574 = C3070.m6886(AbstractC8405.m13972(241))[0];
        c3070.m6887(this.f17574, AbstractC8405.m13972(233));
    }
}
