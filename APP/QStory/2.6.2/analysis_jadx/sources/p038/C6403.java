package p038;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6403 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f17562 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f17563;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Member member;
        Class<?> type;
        final int i2;
        Field[] declaredFields = AbstractC6318.m11838(AbstractC3056.m6668(-3937568962712438183L)).getSuperclass().getDeclaredFields();
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
            if (type.getName().startsWith(AbstractC3056.m6668(-3937568666359694759L))) {
                break;
            } else {
                i4++;
            }
        }
        C6316 c6316M11826 = C6316.m11826(type);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = new Class[]{ViewGroup.class, List.class};
        c1245.f3616 = List.class;
        m11802(c6316M11826.m11827(), new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6403 f17564;

            {
                this.f17564 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i5 = i;
                C6403 c6403 = this.f17564;
                switch (i5) {
                    case 0:
                        ((ImageView) AbstractC6317.m11830(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC6408(c6403));
                        break;
                    case 1:
                        if (c6403.f17563 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC3056.m6668(-3937567120171468199L))) {
                                        c6403.f17563 = textView.getId();
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
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC3056.m6668(-3937567201775846823L), AbstractC3056.m6668(-3937561979095614887L));
                        c6403.f17562.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
        C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937577024366052775L));
        String strM6668 = AbstractC3056.m6668(-3937555107147941287L);
        C1245 c12452 = c6316M11825.f17409;
        c12452.f3617 = strM6668;
        c12452.f3618 = new Class[]{Boolean.TYPE};
        m11802(c6316M11825.m11827(), new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6403 f17564;

            {
                this.f17564 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i5 = i3;
                C6403 c6403 = this.f17564;
                switch (i5) {
                    case 0:
                        ((ImageView) AbstractC6317.m11830(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC6408(c6403));
                        break;
                    case 1:
                        if (c6403.f17563 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC3056.m6668(-3937567120171468199L))) {
                                        c6403.f17563 = textView.getId();
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
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC3056.m6668(-3937567201775846823L), AbstractC3056.m6668(-3937561979095614887L));
                        c6403.f17562.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
        Method[] declaredMethods = AbstractC6318.m11838(AbstractC3056.m6668(-3937568550395577767L)).getDeclaredMethods();
        int length2 = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i2 = 2;
            if (i5 >= length2) {
                break;
            }
            Method method = declaredMethods[i5];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0].getName().startsWith(AbstractC3056.m6668(-3937568288402572711L)) && parameterTypes[1].getName().startsWith(AbstractC3056.m6668(-3937568666359694759L)) && parameterTypes[2] == Integer.TYPE) {
                method.setAccessible(true);
                member = method;
                break;
            }
            i5++;
        }
        m11803(member, new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲兰世苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6403 f17564;

            {
                this.f17564 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i52 = i2;
                C6403 c6403 = this.f17564;
                switch (i52) {
                    case 0:
                        ((ImageView) AbstractC6317.m11830(ImageView.class, methodHookParam.thisObject)).setOnLongClickListener(new ViewOnLongClickListenerC6408(c6403));
                        break;
                    case 1:
                        if (c6403.f17563 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC3056.m6668(-3937567120171468199L))) {
                                        c6403.f17563 = textView.getId();
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
                        String.valueOf(methodHookParam.args[1]).replace(AbstractC3056.m6668(-3937567201775846823L), AbstractC3056.m6668(-3937561979095614887L));
                        c6403.f17562.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937577282064090535L);
    }
}
