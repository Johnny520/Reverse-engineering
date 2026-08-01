package p039;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C1245;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6427 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f17616 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17617;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Member member;
        Class<?> type;
        final int i2;
        Field[] declaredFields = AbstractC6337.m11866(AbstractC8405.m13972(106)).getSuperclass().getDeclaredFields();
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
            if (type.getName().startsWith(AbstractC8405.m13972(107))) {
                break;
            } else {
                i4++;
            }
        }
        C6335 c6335M11854 = C6335.m11854(type);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = new Class[]{ViewGroup.class, List.class};
        c1245.f3617 = List.class;
        m11830(c6335M11854.m11855(), new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6427 f17619;

            {
                this.f17619 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i5 = i;
                C6427 c6427 = this.f17619;
                switch (i5) {
                    case 0:
                        ((ImageView) AbstractC6336.m11858(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC6423(c6427));
                        break;
                    case 1:
                        if (c6427.f17617 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"))) {
                                        c6427.f17617 = textView.getId();
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
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC8405.m13972(115), "");
                        c6427.f17616.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(171));
        String strM13972 = AbstractC8405.m13972(62);
        C1245 c12452 = c6335M11853.f17458;
        c12452.f3618 = strM13972;
        c12452.f3619 = new Class[]{Boolean.TYPE};
        m11830(c6335M11853.m11855(), new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6427 f17619;

            {
                this.f17619 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i5 = i3;
                C6427 c6427 = this.f17619;
                switch (i5) {
                    case 0:
                        ((ImageView) AbstractC6336.m11858(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC6423(c6427));
                        break;
                    case 1:
                        if (c6427.f17617 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"))) {
                                        c6427.f17617 = textView.getId();
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
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC8405.m13972(115), "");
                        c6427.f17616.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
        Method[] declaredMethods = AbstractC6337.m11866(AbstractC8405.m13972(108)).getDeclaredMethods();
        int length2 = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i2 = 2;
            if (i5 >= length2) {
                break;
            }
            Method method = declaredMethods[i5];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0].getName().startsWith(AbstractC8405.m13972(109)) && parameterTypes[1].getName().startsWith(AbstractC8405.m13972(107)) && parameterTypes[2] == Integer.TYPE) {
                method.setAccessible(true);
                member = method;
                break;
            }
            i5++;
        }
        m11831(member, new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6427 f17619;

            {
                this.f17619 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i52 = i2;
                C6427 c6427 = this.f17619;
                switch (i52) {
                    case 0:
                        ((ImageView) AbstractC6336.m11858(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC6423(c6427));
                        break;
                    case 1:
                        if (c6427.f17617 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"))) {
                                        c6427.f17617 = textView.getId();
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
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC8405.m13972(115), "");
                        c6427.f17616.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(170);
    }
}
