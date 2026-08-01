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
        Field[] declaredFields = AbstractC6318.m11838("com.tencent.qqnt.chats.biz.guild.GuildDiscoveryItemBuilder").getSuperclass().getDeclaredFields();
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
            if (type.getName().startsWith("com.tencent.qqnt.chats.core.adapter.")) {
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
                                    if (textView.getText().toString().equals("\u5220\u9664")) {
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
                        String.valueOf(methodHookParam.args[1]).replace("RecentContactChatItem", "");
                        c6403.f17562.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
        C6316 c6316M11825 = C6316.m11825("com.tencent.mobileqq.activity.home.Conversation");
        String strM6668 = "onResume";
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
                                    if (textView.getText().toString().equals("\u5220\u9664")) {
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
                        String.valueOf(methodHookParam.args[1]).replace("RecentContactChatItem", "");
                        c6403.f17562.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
        Method[] declaredMethods = AbstractC6318.m11838("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemHolder").getDeclaredMethods();
        int length2 = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i2 = 2;
            if (i5 >= length2) {
                break;
            }
            Method method = declaredMethods[i5];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0].getName().startsWith("com.tencent.qqnt.chats.core.adapter.builder.") && parameterTypes[1].getName().startsWith("com.tencent.qqnt.chats.core.adapter.") && parameterTypes[2] == Integer.TYPE) {
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
                                    if (textView.getText().toString().equals("\u5220\u9664")) {
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
                        String.valueOf(methodHookParam.args[1]).replace("RecentContactChatItem", "");
                        c6403.f17562.put(methodHookParam.thisObject, num);
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "NT\u4e13\u7528_\u957f\u6309\u4e3b\u9875\u53f3\u4e0a\u89d2\u52a0\u53f7\u5220\u9664,\u8bf7\u52ff\u548cQA\u7684\u6e05\u7406\u6700\u8fd1\u804a\u5929\u4e00\u8d77\u5f00\u542f,\u5426\u5219\u5e76\u4e0d\u4f1a\u53d1\u751f\u4ec0\u4e48";
    }
}
