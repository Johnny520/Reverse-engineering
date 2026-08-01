package p055;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7256 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f17961 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17962;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Member member;
        Class<?> type;
        final int i2;
        Field[] declaredFields = AbstractC7166.m12425(AbstractC9234.m14531(106)).getSuperclass().getDeclaredFields();
        int length = declaredFields.length;
        final int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            member = null;
            if (i4 >= length) {
                type = null;
                break;
            }
            Field field = declaredFields[i4];
            field.setAccessible(true);
            type = field.getType();
            if (type.getName().startsWith(AbstractC9234.m14531(107))) {
                break;
            } else {
                i4++;
            }
        }
        C7164 c7164M12413 = C7164.m12413(type);
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = new Class[]{ViewGroup.class, List.class};
        c2080.f3962 = List.class;
        m12389(c7164M12413.m12414(), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7256 f17964;

            {
                this.f17964 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i5 = i;
                C7256 c7256 = this.f17964;
                switch (i5) {
                    case 0:
                        ((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC7252(c7256));
                        break;
                    case 1:
                        if (c7256.f17962 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"))) {
                                        c7256.f17962 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC9234.m14531(115), "");
                        c7256.f17961.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
        C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(171));
        String strM14531 = AbstractC9234.m14531(62);
        C2080 c20802 = c7164M12412.f17803;
        c20802.f3963 = strM14531;
        c20802.f3964 = new Class[]{Boolean.TYPE};
        m12389(c7164M12412.m12414(), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7256 f17964;

            {
                this.f17964 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i5 = i3;
                C7256 c7256 = this.f17964;
                switch (i5) {
                    case 0:
                        ((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC7252(c7256));
                        break;
                    case 1:
                        if (c7256.f17962 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"))) {
                                        c7256.f17962 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC9234.m14531(115), "");
                        c7256.f17961.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
        Method[] declaredMethods = AbstractC7166.m12425(AbstractC9234.m14531(108)).getDeclaredMethods();
        int length2 = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i2 = 2;
            if (i5 >= length2) {
                break;
            }
            Method method = declaredMethods[i5];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0].getName().startsWith(AbstractC9234.m14531(109)) && parameterTypes[1].getName().startsWith(AbstractC9234.m14531(107)) && parameterTypes[2] == Integer.TYPE) {
                method.setAccessible(true);
                member = method;
                break;
            }
            i5++;
        }
        m12390(member, new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7256 f17964;

            {
                this.f17964 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i52 = i2;
                C7256 c7256 = this.f17964;
                switch (i52) {
                    case 0:
                        ((ImageView) AbstractC7165.m12417(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC7252(c7256));
                        break;
                    case 1:
                        if (c7256.f17962 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"))) {
                                        c7256.f17962 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC9234.m14531(115), "");
                        c7256.f17961.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(170);
    }
}
